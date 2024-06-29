import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class614 {

    @OriginalMember(owner = "client!rda", name = "j", descriptor = "I")
    private int field8724 = -1;

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "Z")
    private boolean field8716 = false;

    @OriginalMember(owner = "client!rda", name = "q", descriptor = "[Ljava/lang/String;")
    private String[] field8731 = new String[0];

    @OriginalMember(owner = "client!rda", name = "f", descriptor = "I")
    private int field8720;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "I")
    public static int field8715;

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "I")
    public static int field8717;

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "I")
    public static int field8718;

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "I")
    public static int field8719;

    @OriginalMember(owner = "client!rda", name = "g", descriptor = "I")
    public static int field8721;

    @OriginalMember(owner = "client!rda", name = "h", descriptor = "I")
    public static int field8722;

    @OriginalMember(owner = "client!rda", name = "k", descriptor = "I")
    public static int field8725;

    @OriginalMember(owner = "client!rda", name = "l", descriptor = "I")
    public static int field8726;

    @OriginalMember(owner = "client!rda", name = "m", descriptor = "I")
    public static int field8727;

    @OriginalMember(owner = "client!rda", name = "n", descriptor = "I")
    public static int field8728;

    @OriginalMember(owner = "client!rda", name = "o", descriptor = "I")
    public static int field8729;

    @OriginalMember(owner = "client!rda", name = "p", descriptor = "I")
    public static int field8730;

    @OriginalMember(owner = "client!rda", name = "r", descriptor = "I")
    public static int field8732;

    @OriginalMember(owner = "client!rda", name = "s", descriptor = "I")
    public static int field8733;

    @OriginalMember(owner = "client!rda", name = "i", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field8723;

    @OriginalMember(owner = "client!rda", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8732++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field8724; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field8731[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(III)I")
    public static final int method3573(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            return -116;
        }
        field8725++;
        int var3 = class489.method2994(arg0 - 1, 4, arg1 + 45365, arg2 + 91923) - (128 - (class489.method2994(arg0 - 1, 2, arg1 + 10294, arg2 + 37821) - 128 >> 1) - (class489.method2994(~arg0, 1, arg1, arg2) + -128 >> 2));
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lr;B)V")
    public static final void method3574(class167 arg0, byte arg1) {
        field8728++;
        int var2 = class492.field7207;
        int var3 = class579.field8257;
        int var4 = class254.field4051;
        int var5 = class508.field7436 - 3;
        byte var6 = 20;
        if (class267.field4350 == null || class7.field116 == null) {
            if (class158.field2699.method942(0, class167.field2806) && class158.field2699.method942(0, class68.field874)) {
                class267.field4350 = arg0.method265(class284.method2027(class158.field2699, class167.field2806, 0), true);
                class284 var7 = class284.method2027(class158.field2699, class68.field874, 0);
                class7.field116 = arg0.method265(var7, true);
                var7.method2021();
                class207.field3461 = arg0.method265(var7, true);
            } else {
                arg0.method335(var2, var3, var4, var6, class1.field9 | 255 - class236.field3750 << 24, 1);
            }
        }
        if (class267.field4350 != null && class7.field116 != null) {
            int var8 = (var4 - (class7.field116.method1083() * 2)) / class267.field4350.method1083();
            for (int var9 = 0; var9 < var8; var9++) {
                class267.field4350.method3960(class7.field116.method1083() + var2 + (var9 * class267.field4350.method1083()), var3);
            }
            class7.field116.method3960(var2, var3);
            class207.field3461.method3960((var2 + var4) - class207.field3461.method1083(), var3);
        }
        class246.field3928.method2657(class122.field1996.method1091(class135.field2206, 1), -1, var2 + 3, class479.field7081 | 0xFF000000, var3 + 14, (byte) -124);
        arg0.method335(var2, var3 + var6, var4, var5 - var6, -class236.field3750 + 255 << 24 | class1.field9, 1);
        int var10 = class464.field6929.method451(1196);
        int var11 = class464.field6929.method454(65);
        int var12 = 0;
        if (arg1 >= -112) {
            return;
        }
        for (class295 var13 = (class295) class307.field4831.method3465((byte) -69); var13 != null; var13 = (class295) class307.field4831.method3469(0)) {
            int var31 = var3 + ((class52.field693 - var12 + -1) * 16) - (-var6 - 13);
            var12++;
            if (var2 < var10 && var2 + var4 > var10 && var11 > var31 - 13 && var11 < (var31 + 4) && var13.field4630) {
                arg0.method335(var2, var31 - 12, var4, 16, 255 - class202.field3272 << 24 | class428.field6512, 1);
            }
        }
        if ((class281.field4497 == null || class259.field4146 == null || class518.field7508 == null) && class158.field2699.method942(0, class12.field193) && class158.field2699.method942(0, class105.field1710) && class158.field2699.method942(0, class1.field6)) {
            class284 var14 = class284.method2027(class158.field2699, class105.field1710, 0);
            class259.field4146 = arg0.method265(var14, true);
            var14.method2021();
            class452.field6794 = arg0.method265(var14, true);
            class281.field4497 = arg0.method265(class284.method2027(class158.field2699, class12.field193, 0), true);
            class284 var15 = class284.method2027(class158.field2699, class1.field6, 0);
            class518.field7508 = arg0.method265(var15, true);
            var15.method2021();
            class87.field1068 = arg0.method265(var15, true);
        }
        if (class281.field4497 != null && class259.field4146 != null && class518.field7508 != null) {
            int var16 = (var4 - (class518.field7508.method1083() * 2)) / class281.field4497.method1083();
            for (int var17 = 0; var17 < var16; var17++) {
                class281.field4497.method3960(var2 + class518.field7508.method1083() + var17 * class281.field4497.method1083(), var3 - -var5 - class281.field4497.method1075());
            }
            int var18 = (var5 - var6 - class518.field7508.method1075()) / class259.field4146.method1075();
            for (int var19 = 0; var19 < var18; var19++) {
                class259.field4146.method3960(var2, var3 + var6 + class259.field4146.method1075() * var19);
                class452.field6794.method3960(var4 + var2 - class452.field6794.method1083(), class259.field4146.method1075() * var19 + var3 - -var6);
            }
            class518.field7508.method3960(var2, var3 + var5 - class518.field7508.method1075());
            class87.field1068.method3960(var4 + var2 - class518.field7508.method1083(), var5 + var3 + -class518.field7508.method1075());
        }
        int var20 = 0;
        for (class295 var21 = (class295) class307.field4831.method3465((byte) -54); var21 != null; var21 = (class295) class307.field4831.method3469(0)) {
            int var22 = var3 + ((class52.field693 - var20 - 1) * 16) + var6 + 13;
            int var23 = class479.field7081 | 0xFF000000;
            if (var2 < var10 && var10 < (var2 + var4) && (var22 - 13) < var11 && var11 < var22 + 4 && var21.field4630) {
                var23 = class365.field5741 | 0xFF000000;
            }
            int[] var24 = null;
            if (class147.method1238(12081, var21.field4631)) {
                var24 = class91.field1083.method2859((int) var21.field4627, (byte) 122).field1838;
            } else if (var21.field4632 != -1) {
                var24 = class91.field1083.method2859(var21.field4632, (byte) 121).field1838;
            } else if (class511.method3098(false, var21.field4631)) {
                class348 var25 = (class348) class592.field8395.method1558((long) ((int) var21.field4627), (byte) -93);
                if (var25 != null) {
                    class589 var26 = var25.field5577;
                    class705 var27 = var26.field8354;
                    if (var27.field9912 != null) {
                        var27 = var27.method3973(true, class539.field7869);
                    }
                    if (var27 != null) {
                        var24 = var27.field9941;
                    }
                }
            } else if (class705.method3978(32, var21.field4631)) {
                Object var28 = null;
                class698 var29;
                if (var21.field4631 == 1002) {
                    var29 = class213.field3537.method94((int) var21.field4627, (byte) -42);
                } else {
                    var29 = class213.field3537.method94((int) (var21.field4627 >>> 32 & 0x7FFFFFFFL), (byte) -42);
                }
                if (var29.field9826 != null) {
                    var29 = var29.method3934(class539.field7869, 127);
                }
                if (var29 != null) {
                    var24 = var29.field9782;
                }
            }
            String var30 = class183.method1486(var21, false);
            if (var24 != null) {
                var30 = var30 + class693.method3919(var24, (byte) -46);
            }
            class246.field3928.method2653(var30, var23, var22, class114.field1790, 0, var2 + 3, class379.field5914, -18622);
            if (var21.field4624) {
                class56.field733.method3960(class35.field508.method3672(var30, false) + (var2 + 5), var22 - 12);
            }
            var20++;
        }
        class154.method1277(class579.field8257, class254.field4051, class508.field7436, 126, class492.field7207);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)V")
    public static void method3575(int arg0) {
        int var1 = 110 % (arg0 / 47);
        field8723 = null;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method3576(String arg0, int arg1) {
        field8715++;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1 == 13149) {
            for (int var4 = 0; var4 < var2; var4++) {
                var3 = arg0.charAt(var4) + (var3 << 5) - var3;
            }
            return var3;
        } else {
            return 55;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(BC)Z")
    public static final boolean method3577(byte arg0, char arg1) {
        if (arg0 <= 77) {
            method3581(-53, -25);
        }
        field8733++;
        return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(II)V")
    private final void method3578(int arg0, int arg1) {
        field8721++;
        String[] var3 = new String[this.method3579((byte) 125, arg1)];
        class398.method2564(this.field8731, arg0, var3, 0, this.field8731.length);
        this.field8731 = var3;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(BI)I")
    private final int method3579(byte arg0, int arg1) {
        field8729++;
        int var3 = this.field8731.length;
        if (arg0 < 121) {
            field8723 = null;
        }
        while (arg1 >= var3) {
            if (!this.field8716) {
                var3 += this.field8720;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field8720 * var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method3580(int arg0, String arg1) {
        field8718++;
        this.method3583(this.field8724 - arg0, arg1, true);
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(II)Z")
    public static final boolean method3581(int arg0, int arg1) {
        if (arg0 >= -40) {
            return true;
        } else {
            field8722++;
            return arg1 == 12 || arg1 == 5 || arg1 == 1006 || arg1 == 58 || arg1 == 57;
        }
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(I)[Ljava/lang/String;")
    public final String[] method3582(int arg0) {
        field8719++;
        String[] var2 = new String[this.field8724 + 1];
        class398.method2564(this.field8731, 0, var2, 0, this.field8724 + 1);
        int var3 = 30 / ((65 - arg0) / 57);
        return var2;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    private final void method3583(int arg0, String arg1, boolean arg2) {
        field8726++;
        if (this.field8724 < arg0) {
            this.field8724 = arg0;
        }
        if (arg0 >= this.field8731.length) {
            this.method3578(0, arg0);
        }
        if (arg2) {
            this.field8731[arg0] = arg1;
        }
    }

    @OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(IZ)V")
    public class614(int arg0, boolean arg1) {
        this.field8720 = arg0;
        this.field8716 = arg1;
    }
}
