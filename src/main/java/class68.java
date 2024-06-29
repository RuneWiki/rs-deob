import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class68 extends class320 {

    @OriginalMember(owner = "client!b", name = "o", descriptor = "[I")
    public static int[] field1098 = new int[14];

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    public static int field1105 = 0;

    @OriginalMember(owner = "client!b", name = "O", descriptor = "I")
    public static int field1123 = -1;

    @OriginalMember(owner = "client!b", name = "D", descriptor = "[I")
    public static int[] field1112 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!b", name = "p", descriptor = "Lc;")
    public static class331 field1099 = new class331();

    @OriginalMember(owner = "client!b", name = "C", descriptor = "F")
    public static float field1111;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public int field1097;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    public int field1100;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    public int field1101;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "I")
    public int field1102;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    public int field1104;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "I")
    public int field1107;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    public int field1109;

    @OriginalMember(owner = "client!b", name = "A", descriptor = "I")
    public int field1110;

    @OriginalMember(owner = "client!b", name = "E", descriptor = "I")
    public int field1113;

    @OriginalMember(owner = "client!b", name = "F", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!b", name = "G", descriptor = "I")
    public int field1115;

    @OriginalMember(owner = "client!b", name = "H", descriptor = "I")
    public int field1116;

    @OriginalMember(owner = "client!b", name = "I", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!b", name = "K", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!b", name = "L", descriptor = "I")
    public int field1120;

    @OriginalMember(owner = "client!b", name = "M", descriptor = "I")
    public int field1121;

    @OriginalMember(owner = "client!b", name = "N", descriptor = "I")
    public int field1122;

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "I")
    public int field1125;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "I")
    public int field1126;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "Lbh;")
    public class299 field1106;

    @OriginalMember(owner = "client!b", name = "P", descriptor = "Ldm;")
    public class311 field1124;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "Lri;")
    public class76 field1096;

    @OriginalMember(owner = "client!b", name = "J", descriptor = "Lvl;")
    public class90 field1118;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)Z", line = 23)
    public static final boolean method653(int arg0, int arg1) {
        field1117++;
        int var2 = -24 / ((-arg0 - 56) / 36);
        return arg1 == 4 || arg1 == 8;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lwc;I)V", line = 37)
    public static final void method654(class116 arg0, int arg1) {
        field1103++;
        if (class181.field3045 == arg0.field1950 || arg0.field1998 == -1 || arg0.field1934 != 0 || arg0.field2035 + 1 > class346.method2428(arg0.field1998, (byte) -24).field4536[arg0.field1932]) {
            int var2 = arg0.field1950 - arg0.field1972;
            int var3 = class181.field3045 - arg0.field1972;
            int var4 = arg0.field2032 * 128 + (arg0.method987(3047) * 64);
            int var5 = arg0.field1942 * 128 + arg0.method987(3047) * 64;
            int var6 = arg0.field1973 * 128 + (arg0.method987(3047) * 64);
            int var7 = arg0.field1958 * 128 + arg0.method987(3047) * 64;
            arg0.field2036 = ((var2 - var3) * var4 + (var3 * var6)) / var2;
            arg0.field1985 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        if (arg0.field1971 == 0) {
            arg0.field1951 = 1024;
        }
        if (arg0.field1971 == 1) {
            arg0.field1951 = 1536;
        }
        arg0.field2020 = 0;
        if (arg1 <= 89) {
            return;
        }
        if (arg0.field1971 == 2) {
            arg0.field1951 = 0;
        }
        if (arg0.field1971 == 3) {
            arg0.field1951 = 512;
        }
        arg0.field1946 = arg0.field1951;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V", line = 84)
    public final void method655(int arg0) {
        this.field1124 = null;
        this.field1096 = null;
        if (arg0 != -1) {
            method657(-36);
        }
        field1095++;
        this.field1118 = null;
        this.field1106 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILpi;)V", line = 106)
    public static final void method656(int arg0, class336 arg1) {
        field1119++;
        if (arg0 != 4096) {
            method657(-13);
        }
        while (true) {
            while (arg1.field5342.length > arg1.field5353) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method2364(-9069) == 1) {
                    var3 = arg1.method2364(-9069);
                    var2 = true;
                    var4 = arg1.method2364(arg0 ^ 0xFFFFCC93);
                }
                int var5 = arg1.method2364(-9069);
                int var6 = arg1.method2364(-9069);
                int var7 = var5 * 64 - class341.field5444;
                int var8 = class304.field4825 + class259.field4201 - var6 * 64 - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && var7 + 63 < class113.field1893 && class304.field4825 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || (var3 * 8) <= var11 && (var3 * 8 + 8) > var11 && var12 >= var4 * 8 && var12 < (var4 * 8 + 8)) {
                                byte var13 = arg1.method2323(102);
                                if (var13 != 0) {
                                    if (class90.field1425[var9][var10] == null) {
                                        class90.field1425[var9][var10] = new byte[4096];
                                    }
                                    class90.field1425[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method2323(arg0 ^ 0x1064);
                                    if (class66.field1064[var9][var10] == null) {
                                        class66.field1064[var9][var10] = new byte[4096];
                                    }
                                    class66.field1064[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method2323(-11);
                        if (var16 != 0) {
                            arg1.field5353++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(I)V", line = 209)
    public static void method657(int arg0) {
        field1099 = null;
        field1098 = null;
        field1112 = null;
        if (arg0 != -9) {
            field1099 = (class331) null;
        }
    }
}
