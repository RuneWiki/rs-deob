import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class374 {

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lvg;")
    private class49 field5848 = new class49(64);

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Lri;")
    public class97 field5850;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "Lri;")
    private class97 field5851;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "Z")
    public static boolean field5844 = false;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field5845;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Ljava/lang/Object;")
    public static Object field5846;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 3)
    public final void method2459(int arg0) {
        if (arg0 <= 63) {
            this.field5850 = null;
        }
        class49 var2 = this.field5848;
        synchronized (this.field5848) {
            this.field5848.method569(0);
        }
        field5847++;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V", line = 18)
    public final void method2460(int arg0) {
        class49 var2 = this.field5848;
        synchronized (this.field5848) {
            this.field5848.method563(arg0 ^ arg0);
        }
        field5845++;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V", line = 32)
    public static final void method2461(byte arg0) {
        int var1 = 42 % ((-arg0 - 48) / 59);
        class43.field599 = -1;
        class416.field6365 = -1;
        class473.field7005 = -1;
        field5849++;
        class106.field1720 = 0;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V", line = 45)
    public final void method2462(int arg0, int arg1) {
        field5854++;
        class49 var3 = this.field5848;
        synchronized (this.field5848) {
            if (arg0 != -6914) {
                this.field5850 = null;
            }
            this.field5848.method573((byte) 121, arg1);
        }
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V", line = 61)
    public static void method2463(int arg0) {
        if (arg0 != 19850) {
            field5844 = true;
        }
        field5846 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B[I[I)V", line = 76)
    public static final void method2464(byte arg0, int[] arg1, int[] arg2) {
        field5852++;
        if (arg1 == null || arg2 == null) {
            class136.field2300 = null;
            class389.field6020 = null;
            class299.field4679 = null;
            return;
        }
        class299.field4679 = arg1;
        if (arg0 != -124) {
            return;
        }
        class389.field6020 = new int[arg1.length];
        class136.field2300 = new byte[arg1.length][][];
        for (int var3 = 0; var3 < class299.field4679.length; var3++) {
            class136.field2300[var3] = new byte[arg2[var3]][];
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)Lsh;", line = 107)
    public final class62 method2465(byte arg0, int arg1) {
        field5853++;
        class49 var3 = this.field5848;
        class62 var4;
        synchronized (this.field5848) {
            var4 = (class62) this.field5848.method560(false, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class97 var5 = this.field5851;
        byte[] var6;
        synchronized (this.field5851) {
            var6 = this.field5851.method926(3, -127, arg1);
        }
        class62 var7 = new class62();
        var7.field800 = this;
        if (var6 != null) {
            var7.method680(-1, new class6(var6));
        }
        class49 var8 = this.field5848;
        synchronized (this.field5848) {
            this.field5848.method559(var7, (long) arg1, 0);
            if (arg0 >= -60) {
                this.method2459(22);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lei;ILri;Lri;)V", line = 146)
    public class374(class162 arg0, int arg1, class97 arg2, class97 arg3) {
        this.field5850 = arg3;
        this.field5851 = arg2;
        this.field5851.method949(3, 0);
    }
}
