import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class1 extends class325 {

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "Z")
    public static boolean field1 = false;

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field13 = "flash1:";

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "I")
    public static int field9 = 0;

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "Le;")
    public static class237 field20;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "Ljd;")
    public static class95 field19;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "Ljd;")
    public static class95 field7;

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "Ljava/lang/String;")
    public String field10;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "[C")
    public char[] field16;

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "[C")
    public char[] field3;

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "[I")
    public int[] field15;

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "[I")
    public int[] field5;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(CB)I", line = 9)
    public final int method1(char arg0, byte arg1) {
        field18++;
        if (this.field5 == null) {
            return -1;
        }
        if (arg1 != 84) {
            method2(63);
        }
        for (int var3 = 0; var3 < this.field5.length; var3++) {
            if (this.field3[var3] == arg0) {
                return this.field5[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V", line = 34)
    public static void method2(int arg0) {
        if (arg0 > 43) {
            field19 = null;
            field13 = null;
            field20 = null;
            field7 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BC)I", line = 49)
    public final int method3(byte arg0, char arg1) {
        field4++;
        if (this.field15 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field15.length; var3++) {
            if (this.field16[var3] == arg1) {
                return this.field15[var3];
            }
        }
        int var4 = -70 % ((arg0 + 79) / 38);
        return -1;
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)V", line = 80)
    public static final void method4(int arg0) {
        if (arg0 <= 38) {
            method8(40, true);
        }
        field6++;
        class261.field4017.method752(false);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lwm;B)V", line = 96)
    public final void method5(class254 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1774((byte) 65);
            if (var3 == 0) {
                field12++;
                if (arg1 <= 46) {
                    method8(-25, false);
                }
                return;
            }
            this.method6(var3, arg0, 4);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILwm;I)V", line = 117)
    private final void method6(int arg0, class254 arg1, int arg2) {
        if (arg2 != 4) {
            method4(68);
        }
        if (arg0 == 1) {
            this.field10 = arg1.method1778(arg2 ^ 0x4EE);
        } else if (arg0 == 2) {
            int var4 = arg1.method1774((byte) -98);
            this.field5 = new int[var4];
            this.field3 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5[var5] = arg1.method1755(false);
                byte var6 = arg1.method1733(2023893896);
                this.field3[var5] = var6 == 0 ? 0 : class338.method2359(var6, 3213);
            }
        } else if (arg0 == 3) {
            int var7 = arg1.method1774((byte) -122);
            this.field16 = new char[var7];
            this.field15 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field15[var8] = arg1.method1755(false);
                byte var9 = arg1.method1733(2023893896);
                this.field16[var8] = var9 == 0 ? 0 : class338.method2359(var9, class181.method1355(arg2, 3209));
            }
        } else if (arg0 != 4) {
        }
        field2++;
    }

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)V", line = 184)
    public static final void method7(int arg0) {
        int var1 = class61.field821;
        int var2 = class183.field2901;
        int var3 = class205.field3145;
        int var4 = class139.field2095 - 3;
        field17++;
        byte var5 = 20;
        if (class34.field499 == null || class280.field4353 == null) {
            if (class264.field4087.method707(class54.field713, (byte) 113) && class264.field4087.method707(class114.field1800, (byte) 34)) {
                class34.field499 = class204.method1474((byte) -9, class54.field713, 0, class264.field4087);
                class280.field4353 = class204.method1474((byte) -9, class114.field1800, 0, class264.field4087);
                if (class73.field1058) {
                    if (class34.field499 instanceof class17) {
                        class34.field499 = new class334((class195) class34.field499);
                    } else {
                        class34.field499 = new class44((class195) class34.field499);
                    }
                    if ((class280.field4353 instanceof class17)) {
                        class280.field4353 = new class334((class195) class280.field4353);
                    } else {
                        class280.field4353 = new class44((class195) class280.field4353);
                    }
                }
            } else if (class73.field1058) {
                class175.method1311(var1, var3, var2, var5, class87.field1238, 256 - class180.field2858);
            } else {
                class287.method1978(var1, var3, var2, var5, class87.field1238, 256 - class180.field2858);
            }
        }
        if (class34.field499 != null && class280.field4353 != null) {
            int var6 = (var2 - (class280.field4353.field4175 * 2)) / class34.field499.field4175;
            for (int var7 = 0; var7 < var6; var7++) {
                class34.field499.method124(class280.field4353.field4175 + var1 + (class34.field499.field4175 * var7), var3);
            }
            class280.field4353.method124(var1, var3);
            class280.field4353.method130(var1 + var2 - class280.field4353.field4175, var3);
        }
        class167.field2703.method2274(class130.field2002, var1 + 3, var3 - -14, class255.field3913, -1);
        if (class73.field1058) {
            class175.method1311(var1, var3 + var5, var2, var4 - var5, class87.field1238, 256 - class180.field2858);
        } else {
            class287.method1978(var1, var3 + var5, var2, var4 - var5, class87.field1238, 256 - class180.field2858);
        }
        int var8 = class290.field4468;
        int var9 = class108.field1622;
        for (int var10 = 0; var10 < class32.field393; var10++) {
            int var11 = (class32.field393 - var10 - 1) * 15 + var3 - (-var5 - 13);
            if (var1 < var8 && var8 < (var1 + var2) && var9 > var11 - 13 && var9 < (var11 + 3)) {
                if (class73.field1058) {
                    class175.method1311(var1, var11 - 12, var2, 15, class277.field4315, 256 - class34.field492);
                } else {
                    class287.method1978(var1, var11 - 12, var2, 15, class277.field4315, 256 - class34.field492);
                }
            }
        }
        if ((class284.field4425 == null || class224.field3429 == null || class277.field4299 == null) && class264.field4087.method707(class238.field3629, (byte) 29) && class264.field4087.method707(class182.field2886, (byte) 123) && class264.field4087.method707(class333.field5195, (byte) 106)) {
            class284.field4425 = class204.method1474((byte) -9, class238.field3629, 0, class264.field4087);
            class224.field3429 = class204.method1474((byte) -9, class182.field2886, 0, class264.field4087);
            class277.field4299 = class204.method1474((byte) -9, class333.field5195, 0, class264.field4087);
            if (class73.field1058) {
                if (class284.field4425 instanceof class17) {
                    class284.field4425 = new class334((class195) class284.field4425);
                } else {
                    class284.field4425 = new class44((class195) class284.field4425);
                }
                if ((class224.field3429 instanceof class17)) {
                    class224.field3429 = new class334((class195) class224.field3429);
                } else {
                    class224.field3429 = new class44((class195) class224.field3429);
                }
                if (class277.field4299 instanceof class17) {
                    class277.field4299 = new class334((class195) class277.field4299);
                } else {
                    class277.field4299 = new class44((class195) class277.field4299);
                }
            }
        }
        if (class284.field4425 != null && class224.field3429 != null && class277.field4299 != null) {
            int var12 = (var2 - class277.field4299.field4175 * 2) / class284.field4425.field4175;
            for (int var13 = 0; var13 < var12; var13++) {
                class284.field4425.method124(var1 - (-class277.field4299.field4175 - class284.field4425.field4175 * var13), var3 + var4 + -class284.field4425.field4184);
            }
            int var14 = (var4 - class277.field4299.field4184 - var5) / class224.field3429.field4184;
            for (int var15 = 0; var15 < var14; var15++) {
                class224.field3429.method124(var1, var3 + var5 + (class224.field3429.field4184 * var15));
                class224.field3429.method130(var1 + var2 - class224.field3429.field4175, class224.field3429.field4184 * var15 + var3 + var5);
            }
            class277.field4299.method124(var1, var3 - (class277.field4299.field4184 - var4));
            class277.field4299.method130(var1 + var2 - class277.field4299.field4175, -class277.field4299.field4184 + var3 - -var4);
        }
        for (int var16 = arg0; var16 < class32.field393; var16++) {
            int var17 = var3 + var5 + ((class32.field393 - (1 - -var16)) * 15) + 13;
            int var18 = class255.field3913;
            if (var1 < var8 && var8 < (var1 + var2) && (var17 - 13) < var9 && var17 + 3 > var9) {
                var18 = class153.field2325;
            }
            class167.field2703.method2274(class90.method656(3, var16), var1 + 3, var17, var18, 0);
        }
        class299.method2060((byte) -110, class61.field821, class205.field3145, class183.field2901, class139.field2095);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ)Z", line = 354)
    public static final boolean method8(int arg0, boolean arg1) {
        if (arg0 != 256) {
            method4(48);
        }
        field14++;
        boolean var2 = class20.method162();
        if (var2 == arg1) {
            return true;
        }
        if (!arg1) {
            class20.method163();
        } else if (!class20.method155() || !class20.method156() || !class20.method152()) {
            arg1 = false;
        }
        class235.field3578 = arg1;
        class110.method840(-110, class330.field5074);
        if (var2 == arg1) {
            return false;
        } else {
            ((class265) class164.field2662).method1862(27891);
            return true;
        }
    }

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "(I)V", line = 402)
    public final void method9(int arg0) {
        if (arg0 != 31866) {
            return;
        }
        if (this.field15 != null) {
            for (int var2 = 0; var2 < this.field15.length; var2++) {
                this.field15[var2] = class261.method1835(this.field15[var2], 32768);
            }
        }
        field8++;
        if (this.field5 != null) {
            for (int var3 = 0; var3 < this.field5.length; var3++) {
                this.field5[var3] = class261.method1835(this.field5[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/awt/Frame;BLvl;)V", line = 438)
    public static final void method10(Frame arg0, byte arg1, class6 arg2) {
        while (true) {
            class208 var3 = arg2.method63(arg0, 10000);
            while (var3.field3185 == 0) {
                class324.method2252(-24861, 10L);
            }
            if (var3.field3185 == 1) {
                arg0.setVisible(false);
                field11++;
                arg0.dispose();
                if (arg1 != 5) {
                    field1 = false;
                }
                return;
            }
            class324.method2252(-24861, 100L);
        }
    }
}
