import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class509 {

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public int field7532 = 0;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public int field7546 = 0;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "Z")
    private boolean field7551 = false;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "[I")
    public static int[] field7535 = new int[100];

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "Leh;")
    public static class246 field7544 = new class246(80, 12);

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "Lkn;")
    public static class530 field7554 = new class530("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field7533;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public int field7534;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public int field7536;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field7537;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    private int field7538;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public int field7539;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field7540;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public int field7541;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    public int field7543;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    public int field7547;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public int field7548;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
    public static int field7549;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
    public int field7550;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
    public int field7552;

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
    public static int field7553;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "J")
    public long field7545;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public static void method3037(int arg0) {
        field7554 = null;
        field7544 = null;
        field7535 = null;
        if (arg0 != 858993459) {
            method3042(66L, null, 79, null, -80, 123, false, 47, 114, false, 89);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLwm;)V")
    public final void method3038(byte arg0, class403 arg1) {
        if (arg0 != 19) {
            this.field7543 = 89;
        }
        while (true) {
            int var3 = arg1.method2357((byte) 110);
            if (var3 == 0) {
                field7537++;
                return;
            }
            this.method3041(121, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)I")
    public static int method3039(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZBLhm;)V")
    public static final void method3040(boolean arg0, byte arg1, class150 arg2) {
        field7533++;
        if (arg1 != 73) {
            field7554 = null;
        }
        int var3 = arg2.field2049 == 0 ? arg2.field2113 : arg2.field2049;
        int var4 = arg2.field2019 == 0 ? arg2.field2033 : arg2.field2019;
        class320.method1929(class494.field6988[arg2.field2134 >> 16], -21, arg2.field2134, var4, var3, arg0);
        if (arg2.field2110 != null) {
            class320.method1929(arg2.field2110, arg1 - 90, arg2.field2134, var4, var3, arg0);
        }
        class489 var5 = (class489) class255.field3763.method2405((long) arg2.field2134, -54);
        if (var5 != null) {
            class183.method1151(var4, -1, var3, arg0, var5.field6840);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILwm;)V")
    private final void method3041(int arg0, int arg1, class403 arg2) {
        field7542++;
        if (arg0 <= 7) {
            return;
        }
        if (arg1 == 1) {
            this.field7538 = arg2.method2338(0);
        } else if (arg1 == 2) {
            arg2.method2357((byte) 118);
        } else if (arg1 == 3) {
            this.field7534 = arg2.method2319((byte) 113);
            this.field7539 = arg2.method2319((byte) 110);
            this.field7541 = arg2.method2319((byte) 114);
        } else if (arg1 == 4) {
            this.field7552 = arg2.method2357((byte) 120);
            this.field7547 = arg2.method2319((byte) 96);
        } else if (arg1 == 6) {
            this.field7550 = arg2.method2357((byte) 125);
        } else if (arg1 == 8) {
            this.field7532 = 1;
            return;
        } else if (arg1 == 9) {
            this.field7546 = 1;
            return;
        } else if (arg1 == 10) {
            this.field7551 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(JLjava/lang/String;ILjava/lang/String;IIZIIZI)V")
    public static final void method3042(long arg0, String arg1, int arg2, String arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9, int arg10) {
        field7540++;
        if (class424.field5977 || class37.field408 >= 500) {
            return;
        }
        int var12 = arg5 == -1 ? class432.field6097 : arg5;
        class214 var13 = new class214(arg1, arg3, var12, arg8, arg10, arg0, arg4, arg7, arg9, arg6);
        class363.field5190.method2657(8492, var13);
        class37.field408++;
        if (arg2 != 6) {
            field7535 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
    public final void method3043(boolean arg0) {
        field7553++;
        this.field7543 = class95.field1241[this.field7538 << 3];
        if (!arg0) {
            return;
        }
        this.field7536 = (int) Math.sqrt((double) (this.field7534 * this.field7534 + this.field7541 * this.field7541 + this.field7539 * this.field7539));
        if (this.field7547 == 0) {
            this.field7547 = 1;
        }
        if (this.field7552 == 0) {
            this.field7545 = 2147483647L;
        } else if (this.field7552 == 1) {
            this.field7545 = (this.field7536 * 8 / this.field7547);
            this.field7545 *= this.field7545;
        } else if (this.field7552 == 2) {
            this.field7545 = (this.field7536 * 8 / this.field7547);
        }
        if (this.field7551) {
            this.field7536 *= -1;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)I")
    public static final int method3044(int arg0, int arg1) {
        int var2 = (arg1 & 0x55555555) + (arg1 >>> 1 & 0xD5555555);
        field7549++;
        if (arg0 != 2034196003) {
            field7544 = null;
        }
        int var3 = (var2 & 0x33333333) + ((var2 & 0xCCCCCCCE) >>> 2);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }
}
