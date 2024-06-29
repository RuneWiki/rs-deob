import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class415 extends class354 {

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)I", line = 4)
    public final int method391(int arg0, int arg1) {
        ++field5295;
        if (arg0 != 3) {
            return -50;
        } else {
            int var3 = super.field4544.method4148((byte) 104).method22((byte) 123);
            if (var3 < 96) {
                return 3;
            } else if (~arg1 < -2 && ~var3 > -129) {
                return 3;
            } else {
                return ~arg1 < -4 && ~var3 > -193 ? 3 : 1;
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lwo;)V", line = 29)
    public class415(class746 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(ILwo;)V", line = 32)
    public class415(int arg0, class746 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILha;I)Liea;", line = 36)
    public static final class481 method2327(int arg0, class60 arg1, int arg2) {
        ++field5297;
        class375 var3 = (class375) class297.field3910.method1160((long) arg0, 119);
        if (arg2 != 0) {
            method2327(88, (class60) null, 49);
        }
        if (var3 != null) {
            class9 var4 = var3.field4807.method2914(-85);
            var3.field4806 = true;
            if (var4 != null) {
                return var4.method57(arg2 + 3751, arg1);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(II)V", line = 62)
    public final void method389(int arg0, int arg1) {
        ++field5292;
        if (arg0 == -1) {
            super.field4545 = arg1;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)I", line = 73)
    public final int method393(byte arg0) {
        ++field5298;
        int var2 = 69 / ((37 - arg0) / 63);
        return 0;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)Z", line = 84)
    public final boolean method2328(int arg0) {
        int var2 = 110 / ((arg0 - -34) / 41);
        ++field5294;
        int var3 = super.field4544.method4148((byte) 104).method22((byte) 123);
        return ~var3 <= -97;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BZ)V", line = 101)
    public static final void method2329(byte arg0, boolean arg1) {
        ++class207.field2736;
        ++field5296;
        class589 var2 = class514.method2994(-29488, class760.field10605, class368.field4749);
        class737.method4107(var2, 7);
        for (class491 var3 = (class491) class290.field3804.method1156(0); var3 != null; var3 = (class491) class290.field3804.method1158(arg0 + 22698)) {
            if (!var3.method1176((byte) 68)) {
                var3 = (class491) class290.field3804.method1156(0);
                if (var3 == null) {
                    break;
                }
            }
            if (var3.field6976 == 0) {
                class178.method1218(256, arg1, var3, true);
            }
        }
        if (class345.field4361 != null) {
            class207.method1332((byte) -95, class345.field4361);
            class345.field4361 = null;
        }
        if (arg0 == 8) {
            ;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 145)
    public final void method388(int arg0) {
        ++field5289;
        int var2 = super.field4544.method4148((byte) 104).method22((byte) 124);
        if (var2 < 96) {
            super.field4545 = 0;
        }
        if (super.field4545 > 1 && var2 < 128) {
            super.field4545 = 1;
        }
        if (arg0 != 6384) {
            method2329((byte) -109, true);
        }
        if (~super.field4545 < -3 && var2 < 192) {
            super.field4545 = 2;
        }
        if (~super.field4545 > -1 || ~super.field4545 < -4) {
            super.field4545 = this.method393((byte) -70);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII)V", line = 176)
    public static final void method2330(int arg0, int arg1, int arg2, int arg3) {
        ++field5290;
        if (arg3 == 108078022) {
            String var4 = "tele " + arg2 + "," + (arg1 >> 6) + "," + (arg0 >> 6) + "," + (arg1 & 63) + "," + (63 & arg0);
            System.out.println(var4);
            class747.method4158(var4, -21091, true, false);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZII)V", line = 190)
    public static final void method2331(boolean arg0, int arg1, int arg2) {
        if (arg2 == -4) {
            ++field5291;
            class555.method3208((byte) -46, arg0, arg1, class454.field6015.method2547(arg2 + -102, class243.field3143));
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)I", line = 201)
    public final int method2332(byte arg0) {
        ++field5293;
        int var2 = -96 / ((arg0 - 7) / 45);
        return super.field4545;
    }
}
