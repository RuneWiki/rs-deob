import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class241 {

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "Lco;")
    private class210 field3310 = new class210(16);

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "Lg;")
    private class470 field3307;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "Lec;")
    public static class40 field3312 = new class40("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3315 = null;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "[[Z")
    public static boolean[][] field3311;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)V", line = 3)
    public final void method1320(int arg0, byte arg1) {
        field3309++;
        class210 var3 = this.field3310;
        synchronized (this.field3310) {
            if (arg1 != 107) {
                field3311 = null;
            }
            this.field3310.method1166(arg0, (byte) -52);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)Lcc;", line = 19)
    private final class364 method1321(byte arg0, int arg1) {
        field3314++;
        class210 var3 = this.field3310;
        class364 var4;
        synchronized (this.field3310) {
            var4 = (class364) this.field3310.method1163((byte) -125, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        } else if (arg0 == -11) {
            byte[] var5 = this.field3307.method2768(arg0 ^ 0x4FFD, arg1, 29);
            class364 var6 = new class364();
            if (var5 != null) {
                var6.method2209(1, new class179(var5));
            }
            class210 var7 = this.field3310;
            synchronized (this.field3310) {
                this.field3310.method1172((long) arg1, 1, var6);
                return var6;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 48)
    public static void method1322(int arg0) {
        field3312 = null;
        field3315 = null;
        field3311 = null;
        if (arg0 != 16) {
            field3315 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V", line = 61)
    public final void method1323(int arg0) {
        class210 var2 = this.field3310;
        synchronized (this.field3310) {
            this.field3310.method1169(1076);
        }
        field3313++;
        if (arg0 != 29) {
            this.field3307 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V", line = 76)
    public final void method1324(int arg0) {
        class210 var2 = this.field3310;
        synchronized (this.field3310) {
            this.field3310.method1165((byte) 118);
        }
        field3306++;
        if (arg0 != 29) {
            this.field3307 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lci;ILg;)V", line = 135)
    public class241(class421 arg0, int arg1, class470 arg2) {
        this.field3307 = arg2;
        this.field3307.method2755(-124, 29);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILnk;IIB)Ldp;", line = 105)
    public final class191 method1325(int arg0, int arg1, class224 arg2, int arg3, int arg4, byte arg5) {
        field3308++;
        class81[] var7 = null;
        int var8 = 76 / ((-arg5 - 87) / 37);
        class364 var9 = this.method1321((byte) -11, arg0);
        if (var9.field5229 != null) {
            var7 = new class81[var9.field5229.length];
            for (int var10 = 0; var10 < var7.length; var10++) {
                class478 var11 = arg2.method1233(-88, var9.field5229[var10]);
                var7[var10] = new class81(var11.field6758, var11.field6756, var11.field6761, var11.field6768, var11.field6763, var11.field6762, var11.field6766, var11.field6760);
            }
        }
        return new class191(var9.field5235, var7, var9.field5226, arg1, arg3, arg4);
    }
}
