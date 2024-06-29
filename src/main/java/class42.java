import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class42 {

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public int field543 = 128;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public int field539 = 128;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public int field545;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public int field544;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public int field540;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public int field549;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "[Ljw;")
    public static class637[] field541 = new class637[1024];

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field548 = 2;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "[Z")
    public static boolean[] field550 = new boolean[100];

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Z")
    public static final boolean method251(int arg0, int arg1) {
        field551++;
        if (class451.field6154[arg0]) {
            return true;
        } else if (class422.field5876.method1069(31271, arg0)) {
            int var2 = class422.field5876.method1076(arg0, arg1);
            if (var2 == 0) {
                class451.field6154[arg0] = true;
                return true;
            }
            if (class328.field4799[arg0] == null) {
                class328.field4799[arg0] = new class188[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class328.field4799[arg0][var3] == null) {
                    byte[] var4 = class422.field5876.method1087(arg0, var3, 1);
                    if (var4 != null) {
                        class188 var5 = class328.field4799[arg0][var3] = new class188();
                        var5.field2387 = (arg0 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method1204(new class138(var4), (byte) -117);
                    }
                }
            }
            class451.field6154[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)I")
    public static final int method252(int arg0) {
        field547++;
        if (arg0 > -127) {
            field541 = null;
        }
        if (class463.field6333 == null) {
            return class507.field6859 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLod;)V")
    public final void method253(boolean arg0, class42 arg1) {
        field542++;
        this.field543 = arg1.field543;
        this.field540 = arg1.field540;
        this.field545 = arg1.field545;
        this.field539 = arg1.field539;
        if (arg0) {
            method252(-23);
        }
        this.field544 = arg1.field544;
        this.field549 = arg1.field549;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
    public static void method254(int arg0) {
        field550 = null;
        field541 = null;
        if (arg0 != 28584) {
            method254(-22);
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(I)V")
    public class42(int arg0) {
        this.field545 = arg0;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)Lod;")
    public final class42 method255(int arg0) {
        field538++;
        if (arg0 != 0) {
            field550 = null;
        }
        return new class42(this.field545, this.field543, this.field539, this.field540, this.field549, this.field544);
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(IIIIII)V")
    private class42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field544 = arg5;
        this.field540 = arg3;
        this.field539 = arg2;
        this.field545 = arg0;
        this.field549 = arg4;
        this.field543 = arg1;
    }
}
