import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class323 extends class172 {

    @OriginalMember(owner = "client!bm", name = "X", descriptor = "Ljl;")
    public static class332 field5150 = new class332(100);

    @OriginalMember(owner = "client!bm", name = "Z", descriptor = "I")
    public static int field5152 = 10;

    @OriginalMember(owner = "client!bm", name = "ab", descriptor = "I")
    public static int field5153 = -1;

    @OriginalMember(owner = "client!bm", name = "J", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!bm", name = "K", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!bm", name = "N", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!bm", name = "O", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!bm", name = "S", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!bm", name = "T", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!bm", name = "U", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!bm", name = "V", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!bm", name = "W", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!bm", name = "Y", descriptor = "J")
    public static long field5151;

    @OriginalMember(owner = "client!bm", name = "P", descriptor = "Ljava/lang/String;")
    public String field5142;

    @OriginalMember(owner = "client!bm", name = "I", descriptor = "[C")
    public char[] field5136;

    @OriginalMember(owner = "client!bm", name = "R", descriptor = "[C")
    public char[] field5144;

    @OriginalMember(owner = "client!bm", name = "M", descriptor = "[I")
    public int[] field5139;

    @OriginalMember(owner = "client!bm", name = "Q", descriptor = "[I")
    public int[] field5143;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IC)I", line = 10)
    public final int method2277(int arg0, char arg1) {
        field5137++;
        if (this.field5143 == null) {
            return -1;
        }
        if (arg0 >= -116) {
            this.method2277(-5, (char) 65468);
        }
        for (int var3 = 0; var3 < this.field5143.length; var3++) {
            if (this.field5136[var3] == arg1) {
                return this.field5143[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BI)V", line = 35)
    public static final void method2278(byte arg0, int arg1) {
        if (arg0 < 72) {
            method2283(77, -105, 41, false, -9L);
        }
        class321 var2 = class46.method370(6, (byte) -106, arg1);
        field5140++;
        var2.method2261(-129);
    }

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "(I)V", line = 49)
    public static final void method2279(int arg0) {
        field5146++;
        int var1 = class178.field2858;
        int var2 = class92.field1556;
        int var3 = class24.field289 - 3;
        int var4 = class259.field4361;
        byte var5 = 20;
        if (class216.field3465 == null || class190.field3043 == null) {
            if (class76.field1305.method452(class222.field3652, (byte) -119) && class76.field1305.method452(class281.field4611, (byte) 82)) {
                class216.field3465 = class344.method2427(0, (byte) -66, class76.field1305, class222.field3652);
                class190.field3043 = class344.method2427(0, (byte) -93, class76.field1305, class281.field4611);
                if (class42.field607) {
                    if (class216.field3465 instanceof class120) {
                        class216.field3465 = new class256((class351) class216.field3465);
                    } else {
                        class216.field3465 = new class58((class351) class216.field3465);
                    }
                    if (class190.field3043 instanceof class120) {
                        class190.field3043 = new class256((class351) class190.field3043);
                    } else {
                        class190.field3043 = new class58((class351) class190.field3043);
                    }
                }
            } else if (class42.field607) {
                class244.method1872(var4, var1, var2, var5, class29.field370, 256 - class227.field3795);
            } else {
                class246.method1905(var4, var1, var2, var5, class29.field370, 256 - class227.field3795);
            }
        }
        if (class216.field3465 != null && class190.field3043 != null) {
            int var6 = (var2 - class190.field3043.field197 * 2) / class216.field3465.field197;
            for (int var7 = 0; var7 < var6; var7++) {
                class216.field3465.method89(class216.field3465.field197 * var7 + (var4 + class190.field3043.field197), var1);
            }
            class190.field3043.method89(var4, var1);
            class190.field3043.method93(var4 + var2 - class190.field3043.field197, var1);
        }
        class109.field1792.method1332(class209.field3284, var4 + 3, var1 - -14, class63.field1127, -1);
        if (class42.field607) {
            class244.method1872(var4, var1 + var5, var2, var3 - var5, class29.field370, 256 - class227.field3795);
        } else {
            class246.method1905(var4, var1 + var5, var2, var3 - var5, class29.field370, 256 - class227.field3795);
        }
        if (arg0 != -30329) {
            field5150 = (class332) null;
        }
        int var8 = class77.field1343;
        int var9 = class333.field5275;
        for (int var10 = 0; var10 < class104.field1683; var10++) {
            int var11 = (class104.field1683 - var10 - 1) * 15 + var1 + var5 + 13;
            if (var4 < var9 && var2 + var4 > var9 && var8 > (var11 - 13) && var8 < (var11 + 3)) {
                if (class42.field607) {
                    class244.method1872(var4, var11 - 12, var2, 15, class342.field5450, 256 - class288.field4686);
                } else {
                    class246.method1905(var4, var11 - 12, var2, 15, class342.field5450, 256 - class288.field4686);
                }
            }
        }
        if ((class118.field2002 == null || class231.field3839 == null || class61.field1027 == null) && class76.field1305.method452(class130.field2199, (byte) 63) && class76.field1305.method452(class190.field3047, (byte) -123) && class76.field1305.method452(class216.field3461, (byte) -121)) {
            class118.field2002 = class344.method2427(0, (byte) 102, class76.field1305, class130.field2199);
            class231.field3839 = class344.method2427(0, (byte) 95, class76.field1305, class190.field3047);
            class61.field1027 = class344.method2427(0, (byte) -98, class76.field1305, class216.field3461);
            if (class42.field607) {
                if ((class118.field2002 instanceof class120)) {
                    class118.field2002 = new class256((class351) class118.field2002);
                } else {
                    class118.field2002 = new class58((class351) class118.field2002);
                }
                if (class231.field3839 instanceof class120) {
                    class231.field3839 = new class256((class351) class231.field3839);
                } else {
                    class231.field3839 = new class58((class351) class231.field3839);
                }
                if (class61.field1027 instanceof class120) {
                    class61.field1027 = new class256((class351) class61.field1027);
                } else {
                    class61.field1027 = new class58((class351) class61.field1027);
                }
            }
        }
        if (class118.field2002 != null && class231.field3839 != null && class61.field1027 != null) {
            int var12 = (var2 - (class61.field1027.field197 * 2)) / class118.field2002.field197;
            for (int var13 = 0; var13 < var12; var13++) {
                class118.field2002.method89(class118.field2002.field197 * var13 + var4 + class61.field1027.field197, var1 + var3 - class118.field2002.field199);
            }
            int var14 = (var3 - var5 - class61.field1027.field199) / class231.field3839.field199;
            for (int var15 = 0; var15 < var14; var15++) {
                class231.field3839.method89(var4, class231.field3839.field199 * var15 + var1 + var5);
                class231.field3839.method93(var4 + var2 - class231.field3839.field197, class231.field3839.field199 * var15 + var1 + var5);
            }
            class61.field1027.method89(var4, var1 + var3 - class61.field1027.field199);
            class61.field1027.method93(var4 + var2 - class61.field1027.field197, -class61.field1027.field199 + var1 + var3);
        }
        for (int var16 = 0; var16 < class104.field1683; var16++) {
            int var17 = (class104.field1683 - (var16 + 1)) * 15 + var1 - (-var5 - 13);
            int var18 = class63.field1127;
            if (var9 > var4 && var2 + var4 > var9 && (var17 - 13) < var8 && (var17 + 3) > var8) {
                var18 = class84.field1430;
            }
            class109.field1792.method1332(class6.method23(48, var16), var4 + 3, var17, var18, 0);
        }
        class117.method923(class259.field4361, class92.field1556, 0, class24.field289, class178.field2858);
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(B)V", line = 224)
    public final void method2280(byte arg0) {
        field5138++;
        if (arg0 < 114) {
            this.field5144 = (char[]) null;
        }
        if (this.field5139 != null) {
            for (int var2 = 0; var2 < this.field5139.length; var2++) {
                this.field5139[var2] = class75.method624(this.field5139[var2], 32768);
            }
        }
        if (this.field5143 != null) {
            for (int var3 = 0; var3 < this.field5143.length; var3++) {
                this.field5143[var3] = class75.method624(this.field5143[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "(I)V", line = 259)
    public static void method2281(int arg0) {
        field5150 = null;
        if (arg0 >= -83) {
            method2281(97);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILqm;I)V", line = 271)
    private final void method2282(int arg0, class227 arg1, int arg2) {
        field5141++;
        if (arg0 != 0) {
            return;
        }
        if (arg2 == 1) {
            this.field5142 = arg1.method1758((byte) -110);
        } else if (arg2 == 2) {
            int var7 = arg1.method1720((byte) -119);
            this.field5143 = new int[var7];
            this.field5136 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field5143[var8] = arg1.method1765(true);
                byte var9 = arg1.method1733(0);
                this.field5136[var8] = var9 == 0 ? 0 : class240.method1832(var9, 15218);
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method1720((byte) -38);
            this.field5144 = new char[var4];
            this.field5139 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5139[var5] = arg1.method1765(true);
                byte var6 = arg1.method1733(arg0);
                this.field5144[var5] = var6 == 0 ? 0 : class240.method1832(var6, 15218);
            }
        } else if (arg2 == 4) {
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIZJ)Ljava/lang/String;", line = 336)
    public static final String method2283(int arg0, int arg1, int arg2, boolean arg3, long arg4) {
        field5147++;
        char var6 = ',';
        char var7 = '.';
        if (arg2 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg2 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        StringBuffer var9 = new StringBuffer(26);
        int var10 = 94 % ((-arg0 - 51) / 40);
        if (arg4 < 0L) {
            var8 = true;
            arg4 = -arg4;
        }
        if (arg1 > 0) {
            for (int var11 = 0; var11 < arg1; var11++) {
                int var12 = (int) arg4;
                arg4 /= 10L;
                var9.append((char) (var12 + 48 - ((int) arg4 * 10)));
            }
            var9.append(var6);
        }
        int var13 = 0;
        while (true) {
            int var14 = (int) arg4;
            arg4 /= 10L;
            var9.append((char) (var14 + 48 - ((int) arg4 * 10)));
            if (arg4 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg3) {
                var13++;
                if (var13 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(IC)I", line = 422)
    public final int method2284(int arg0, char arg1) {
        field5149++;
        if (this.field5139 == null) {
            return -1;
        } else if (arg0 == -9650) {
            for (int var3 = 0; var3 < this.field5139.length; var3++) {
                if (this.field5144[var3] == arg1) {
                    return this.field5139[var3];
                }
            }
            return -1;
        } else {
            return -91;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILqm;)V", line = 458)
    public final void method2285(int arg0, class227 arg1) {
        while (true) {
            int var3 = arg1.method1720((byte) -20);
            if (var3 == 0) {
                if (arg0 != 0) {
                    this.field5143 = (int[]) null;
                }
                field5145++;
                return;
            }
            this.method2282(arg0 ^ 0x0, arg1, var3);
        }
    }
}
