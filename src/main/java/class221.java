import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class221 {

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "Z")
    public static boolean field3132 = false;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "[I")
    public static int[] field3125;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public static void method1435(int arg0) {
        field3125 = null;
        if (arg0 != -7520) {
            field3125 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
    public static final void method1436(byte arg0) {
        if (arg0 >= -88) {
            method1438(18, -11);
        }
        class272.field3986 = 0;
        field3128++;
        class121.field1724 = 0;
        class272.method1740((byte) 49);
        class166.method1090((byte) 108);
        class270.method1728(67);
        for (int var1 = 0; var1 < class121.field1724; var1++) {
            int var3 = class144.field2060[var1];
            if (class198.field2819 != class20.field244[var3].field4546) {
                if (class20.field244[var3].field636.method1711((byte) -92)) {
                    class61.method378(class20.field244[var3], 14);
                }
                class20.field244[var3].method322((class267) null, 103);
                class20.field244[var3] = null;
            }
        }
        if (class230.field3314 != class163.field2332.field3021) {
            throw new RuntimeException("gnp1 pos:" + class163.field2332.field3021 + " psize:" + class230.field3314);
        }
        for (int var2 = 0; var2 < class294.field4642; var2++) {
            if (class20.field244[class14.field176[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class294.field4642);
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(CB)C")
    public static final char method1437(char arg0, byte arg1) {
        field3129++;
        if (arg0 == 'Æ') {
            return 'E';
        }
        if (arg1 != 106) {
            method1439(32);
        }
        if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V")
    public static final void method1438(int arg0, int arg1) {
        class286.field4428.method62(-37, arg0);
        field3131++;
        if (arg1 != 69) {
            field3134 = -20;
        }
        class198.field2817.method62(-58, arg0);
        class124.field1785.method62(arg1 ^ 0xFFFFFF82, arg0);
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)I")
    public static final int method1439(int arg0) {
        field3127++;
        if (arg0 != 21322) {
            field3132 = false;
        }
        if (class139.field2022) {
            return 0;
        } else if (class176.method1141(arg0 ^ 0x534B)) {
            return class165.field2370 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIIIIIBIII)V")
    public static final void method1440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, int arg10, int arg11, int arg12) {
        field3133++;
        class219 var13 = new class219();
        var13.field3100 = arg5;
        var13.field3095 = arg3;
        var13.field3106 = arg1;
        var13.field3105 = arg0;
        var13.field3113 = arg8;
        var13.field3111 = arg11;
        if (arg9 >= -70) {
            method1440(-15, -38, 60, -61, -114, 15, -127, 95, 118, (byte) 116, -26, 109, -37);
        }
        var13.field3102 = arg6;
        var13.field3092 = arg2;
        var13.field3094 = arg4;
        var13.field3103 = arg10;
        var13.field3097 = arg7;
        var13.field3109 = arg12;
        class133.field1933.method1522(var13, -119);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method1441(int arg0, int arg1, String arg2) {
        class66 var3 = class6.method34(3, true, arg1);
        field3130++;
        var3.method408(0);
        if (arg0 != 115) {
            field3132 = false;
        }
        var3.field785 = arg2;
    }
}
