import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class230 {

    @OriginalMember(owner = "client!si", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3376 = "wave:";

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "Llc;")
    public static class270 field3382;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "Lff;")
    public class4 field3378;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field3375;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIII)V")
    public static final void method1597(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= class264.field4230 && class273.field4418 >= arg0) {
            int var5 = class289.method1972(class73.field1156, (byte) 122, arg1, class59.field859);
            int var6 = class289.method1972(class73.field1156, (byte) 122, arg2, class59.field859);
            client.method913(var6, (byte) 1, arg3, arg0, var5);
        }
        field3384++;
        if (arg4 != -3) {
            method1597(95, 69, 30, 120, 110);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public static final void method1598(byte arg0) {
        if (class122.field2014.toLowerCase().indexOf("microsoft") == -1) {
            class100.field1706[46] = 72;
            class100.field1706[59] = 57;
            class100.field1706[91] = 42;
            class100.field1706[44] = 71;
            class100.field1706[45] = 26;
            class100.field1706[93] = 43;
            if (class122.field2032 == null) {
                class100.field1706[192] = 58;
                class100.field1706[222] = 59;
            } else {
                class100.field1706[222] = 58;
                class100.field1706[192] = 28;
                class100.field1706[520] = 59;
            }
            class100.field1706[92] = 74;
            class100.field1706[47] = 73;
            class100.field1706[61] = 27;
        } else {
            class100.field1706[223] = 28;
            class100.field1706[187] = 27;
            class100.field1706[219] = 42;
            class100.field1706[190] = 72;
            class100.field1706[188] = 71;
            class100.field1706[221] = 43;
            class100.field1706[220] = 74;
            class100.field1706[186] = 57;
            class100.field1706[189] = 26;
            class100.field1706[192] = 58;
            class100.field1706[222] = 59;
            class100.field1706[191] = 73;
        }
        if (arg0 <= -28) {
            field3377++;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIII)V")
    public static final void method1599(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 < 24) {
            field3375 = null;
        }
        field3383++;
        int var9 = arg5 + 1;
        class89.method669(class104.field1795[arg5], arg0, arg1, arg3, (byte) -124);
        int var8 = arg4 - 1;
        class89.method669(class104.field1795[arg4], arg0, arg1, arg3, (byte) -125);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class104.field1795[var6];
            var7[arg3] = var7[arg1] = arg0;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)I")
    public static final int method1600(int arg0, String arg1, int arg2, String arg3) {
        field3379++;
        int var4 = 0;
        int var5 = 0;
        int var6 = arg1.length();
        char var7 = (char) arg2;
        int var8 = arg3.length();
        char var9 = 0;
        while ((var4 - var9) < var6 || (var5 - var7) < var8) {
            if (var6 <= var4 - var9) {
                return -1;
            }
            if (var5 - var7 >= var8) {
                return 1;
            }
            char var22;
            if (var9 == '\u0000') {
                var22 = arg1.charAt(var4++);
            } else {
                var22 = var9;
                boolean var23 = false;
            }
            char var24;
            if (var7 == '\u0000') {
                var24 = arg3.charAt(var5++);
            } else {
                var24 = var7;
                boolean var25 = false;
            }
            var9 = class68.method517(var22, (byte) 80);
            var7 = class68.method517(var24, (byte) 80);
            char var26 = class186.method1331(-79, var22, arg0);
            char var27 = class186.method1331(-70, var24, arg0);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class195.method1381(arg0, (byte) 41, var28) - class195.method1381(arg0, (byte) -74, var29);
                }
            }
        }
        int var10 = Math.min(var6, var8);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg0 == 2) {
                var16 = var8 - var11 - 1;
                var17 = var6 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg1.charAt(var17);
            char var19 = arg3.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class195.method1381(arg0, (byte) 60, var20) - class195.method1381(arg0, (byte) -90, var21);
                }
            }
        }
        int var12 = var6 - var8;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg1.charAt(var13);
            char var15 = arg3.charAt(var13);
            if (var14 != var15) {
                return class195.method1381(arg0, (byte) 92, var14) - class195.method1381(arg0, (byte) -60, var15);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static final void method1601(int arg0) {
        if (arg0 != 15185) {
            method1600(-41, (String) null, 27, (String) null);
        }
        field3380++;
        if (class273.method1903(100) || class37.field474 == class280.field4510) {
            class197.method1396(arg0 + 15715);
            if (class47.field647 != class37.field474) {
                class297.method2019((byte) 122);
            }
        } else {
            class21.method149(arg0 ^ 0xFFFF9BE7, class37.field474, false, class304.field4925, class213.field3139.field3686[0], class213.field3139.field3761[0], false, class180.field2713);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V")
    public static void method1602(boolean arg0) {
        field3382 = null;
        if (arg0) {
            field3375 = null;
        }
        field3375 = null;
        field3376 = null;
    }
}
