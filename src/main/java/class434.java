import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class434 extends class204 {

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "Z")
    public boolean field6020 = false;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "Z")
    private boolean field6031 = true;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "Lsha;")
    public static class115 field6028 = null;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
    public static int field6029;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "Ljn;")
    public static class134 field6026;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(Z)V", line = 4)
    public static void method2600(boolean arg0) {
        if (arg0) {
            method2601(-59, false, (class283) null, 64, false, -28, -108, 110L);
        }
        field6026 = null;
        field6028 = null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZLae;IZIIJ)V", line = 15)
    public static final void method2601(int arg0, boolean arg1, class283 arg2, int arg3, boolean arg4, int arg5, int arg6, long arg7) {
        class153.field2004 = arg0;
        class164.field2097 = arg2;
        class793.field10868 = arg3;
        class156.field2030 = arg7;
        class354.field5120 = arg5;
        if (!arg1) {
            field6028 = null;
        }
        class574.field8079 = null;
        class565.field7982 = 10000;
        class194.field2599 = arg4;
        class20.field171 = 1;
        class748.field10330 = arg6;
        ++field6025;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)Z", line = 38)
    public final boolean method2602(byte arg0) {
        int var2 = -13 / ((1 - arg0) / 53);
        ++field6023;
        return this.field6031;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZZ)V", line = 50)
    public static final void method2603(boolean arg0, boolean arg1) {
        ++field6030;
        if (arg1) {
            if (~class610.field8597 != 0) {
                class131.method891(-72, class610.field8597);
            }
            for (class610 var2 = (class610) class278.field3993.method3668(37); var2 != null; var2 = (class610) class278.field3993.method3667((byte) -83)) {
                if (!var2.method529((byte) 46)) {
                    var2 = (class610) class278.field3993.method3668(-109);
                    if (var2 == null) {
                        break;
                    }
                }
                class47.method387(true, (byte) 125, false, var2);
            }
            class610.field8597 = -1;
            class278.field3993 = new class638(8);
            class112.method812(-22476);
            class610.field8597 = class296.field4323;
            class513.method3056(false, (byte) -93);
            class23.method99(100);
            class700.method3952(class610.field8597);
        }
        class14.field80 = arg0;
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(B)I", line = 93)
    public final int method2604(byte arg0) {
        ++field6019;
        return arg0 != -98 ? -48 : super.field2852;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZB)V", line = 104)
    public final void method2605(boolean arg0, byte arg1) {
        ++field6032;
        if (arg1 <= 88) {
            field6026 = null;
        }
        this.field6031 = arg0;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V", line = 116)
    public final void method486(int arg0) {
        if (arg0 != -4591) {
            this.method2606(9);
        }
        ++field6027;
        if (!super.field2853.method3513((byte) -57).method4271(arg0 ^ -4602)) {
            super.field2852 = 0;
        }
        if (super.field2852 < 0 || ~super.field2852 < -6) {
            super.field2852 = this.method490((byte) 127);
        }
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(ILfs;)V", line = 133)
    public class434(int arg0, class607 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lfs;)V", line = 141)
    public class434(class607 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)I", line = 144)
    public final int method490(byte arg0) {
        this.field6020 = true;
        ++field6022;
        if (!super.field2853.method3513((byte) 60).method4271(23)) {
            return 0;
        } else {
            if (arg0 < 83) {
                field6026 = null;
            }
            return 2;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)I", line = 162)
    public final int method487(int arg0, int arg1) {
        ++field6029;
        if (!super.field2853.method3513((byte) 125).method4271(23)) {
            return 3;
        } else {
            int var3 = 1 / ((arg1 - -57) / 60);
            return arg0 == 3 && !class426.method2572(-18276, "jagdx") ? 3 : 2;
        }
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(II)V", line = 179)
    public final void method488(int arg0, int arg1) {
        ++field6024;
        this.field6020 = false;
        if (arg1 >= -105) {
            this.method488(8, -11);
        }
        super.field2852 = arg0;
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)Z", line = 193)
    public final boolean method2606(int arg0) {
        int var2 = -106 % ((-13 - arg0) / 44);
        ++field6033;
        return super.field2853.method3513((byte) 88).method4271(23);
    }
}
