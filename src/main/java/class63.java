import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class63 {

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "F")
    public float field910 = 1.0F;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "F")
    public float field911 = 1.0F;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "F")
    public float field907 = 0.25F;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public int field913;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public int field901;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public int field919;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "F")
    public float field922;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "F")
    public float field905;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public int field906;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public int field908;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public int field920;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "F")
    public float field915;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "Lpa;")
    public class587 field916;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "Lqj;")
    public static class511 field903 = new class511(12, 4);

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "Lii;")
    public static class596 field914;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "[I")
    public static int[] field918;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V")
    public static final void method519(int arg0, int arg1) {
        class427 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class682 var4 = class621.field8841[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class687.field9758; var5++) {
                    for (int var6 = 0; var6 < class33.field474; var6++) {
                        var2 = var4.method1369(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class49.field637;
                            int var8 = var5 << class49.field637;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class682 var10 = class621.field8841[var9];
                                if (var10 != null) {
                                    int var11 = var4.method3858(var5, var6, (byte) 58) - var10.method3858(var5, var6, (byte) 49);
                                    int var12 = var4.method3858(var5, var6 + 1, (byte) 41) - var10.method3858(var5, var6 + 1, (byte) 102);
                                    int var13 = var4.method3858(var5 + 1, var6 + 1, (byte) 16) - var10.method3858(var5 + 1, var6 + 1, (byte) 16);
                                    int var14 = var4.method3858(var5 + 1, var6, (byte) 23) - var10.method3858(var5 + 1, var6, (byte) 126);
                                    var10.method1363(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static void method520(int arg0) {
        field918 = null;
        field914 = null;
        field903 = null;
        int var1 = -14 / ((arg0 - 6) / 49);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V")
    public static final void method521(boolean arg0) {
        field912++;
        int var1 = class376.field5209.method2736(false);
        int var2 = class376.field5209.method2705(-89);
        class121.field1983 = class376.field5209.method2688(128);
        int var3 = class376.field5209.method2696(-1605640280);
        boolean var4 = class376.field5209.method2710((byte) 107) == 1;
        if (!arg0) {
            return;
        }
        class23.method220((byte) -10);
        class696.method3918(var2, (byte) 38);
        class376.field5209.method2229((byte) 124);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < class430.field6136 >> 3; var20++) {
                for (int var21 = 0; var21 < (class580.field8504 >> 3); var21++) {
                    int var22 = class376.field5209.method2231(1, 99);
                    if (var22 == 1) {
                        class184.field2920[var5][var20][var21] = class376.field5209.method2231(26, -67);
                    } else {
                        class184.field2920[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class376.field5209.method2228(-120);
        int var6 = (class99.field1481 - class376.field5209.field6710) / 16;
        class500.field7433 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class500.field7433[var7][var19] = class376.field5209.method2691((byte) -67);
            }
        }
        class623.field8876 = new int[var6];
        class221.field3306 = new int[var6];
        class556.field8139 = null;
        class694.field9865 = new int[var6];
        class297.field4200 = new int[var6];
        class113.field1805 = new byte[var6][];
        class204.field3165 = new int[var6];
        class436.field6271 = new byte[var6][];
        class395.field5713 = new byte[var6][];
        class223.field3352 = null;
        class648.field9181 = new byte[var6][];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < class430.field6136 >> 3; var10++) {
                for (int var11 = 0; var11 < (class580.field8504 >> 3); var11++) {
                    int var12 = class184.field2920[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = (var12 & 0xFFF91C) >> 14;
                        int var14 = (var12 & 0x3FF9) >> 3;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class221.field3306[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class221.field3306[var8] = var15;
                            int var17 = (var15 & 0xFFDF) >> 8;
                            int var18 = var15 & 0xFF;
                            class297.field4200[var8] = class466.field6733.method2083(2, "m" + var17 + "_" + var18);
                            class623.field8876[var8] = class466.field6733.method2083(2, "l" + var17 + "_" + var18);
                            class204.field3165[var8] = class466.field6733.method2083(2, "um" + var17 + "_" + var18);
                            class694.field9865[var8] = class466.field6733.method2083(2, "ul" + var17 + "_" + var18);
                            var8++;
                        }
                    }
                }
            }
        }
        class613.method3465(false, 11, var4, var1, var3);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILga;)Z")
    public final boolean method522(int arg0, class63 arg1) {
        field904++;
        if (arg0 != -50) {
            method523(20, 110, -10);
        }
        return this.field906 == arg1.field906 && this.field922 == arg1.field922 && this.field915 == arg1.field915 && this.field905 == arg1.field905 && this.field907 == arg1.field907 && this.field910 == arg1.field910 && this.field911 == arg1.field911 && this.field908 == arg1.field908 && this.field920 == arg1.field920 && this.field916 == arg1.field916;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)Z")
    public static final boolean method523(int arg0, int arg1, int arg2) {
        field909++;
        if (arg1 != -1) {
            method520(104);
        }
        return class518.method3064(arg2, (byte) 69, arg0) | (arg2 & 0x800) != 0 || class293.method1791(arg2, -1, arg0);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZLek;)V")
    public final void method524(boolean arg0, class465 arg1) {
        field921++;
        this.field910 = (float) (arg1.method2705(-106) * 8) / 255.0F;
        if (!arg0) {
            this.field907 = (float) (arg1.method2705(-67) * 8) / 255.0F;
            this.field911 = (float) (arg1.method2705(-65) * 8) / 255.0F;
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
    public class63() {
        this.field913 = -50;
        this.field901 = -50;
        this.field919 = -60;
        this.field922 = 1.1523438F;
        this.field905 = 1.2F;
        this.field906 = class466.field6729;
        this.field908 = class512.field7623;
        this.field920 = 0;
        this.field915 = 0.69921875F;
        this.field916 = class319.field4403;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lek;)V")
    public class63(class465 arg0) {
        int var2 = arg0.method2705(-98);
        if (class525.field7713.method2485((byte) 73, class76.field1182) && class506.field7522.method802() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field906 = class466.field6729;
            } else {
                this.field906 = arg0.method2691((byte) -67);
            }
            if ((var2 & 0x2) == 0) {
                this.field922 = 1.1523438F;
            } else {
                this.field922 = (float) arg0.method2755((byte) -83) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field915 = 0.69921875F;
            } else {
                this.field915 = (float) arg0.method2755((byte) -126) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field905 = 1.2F;
            } else {
                this.field905 = (float) arg0.method2755((byte) -110) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method2691((byte) -67);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method2755((byte) -111);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method2755((byte) -57);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method2755((byte) -100);
            }
            this.field922 = 1.1523438F;
            this.field906 = class466.field6729;
            this.field905 = 1.2F;
            this.field915 = 0.69921875F;
        }
        if ((var2 & 0x10) == 0) {
            this.field913 = -50;
            this.field919 = -60;
            this.field901 = -50;
        } else {
            this.field913 = arg0.method2744(-1);
            this.field919 = arg0.method2744(-1);
            this.field901 = arg0.method2744(-1);
        }
        if ((var2 & 0x20) == 0) {
            this.field908 = class512.field7623;
        } else {
            this.field908 = arg0.method2691((byte) -67);
        }
        if ((var2 & 0x40) == 0) {
            this.field920 = 0;
        } else {
            this.field920 = arg0.method2755((byte) -127);
        }
        if ((var2 & 0x80) == 0) {
            this.field916 = class319.field4403;
        } else {
            int var3 = arg0.method2755((byte) -102);
            int var4 = arg0.method2755((byte) -92);
            int var5 = arg0.method2755((byte) -64);
            int var6 = arg0.method2755((byte) -94);
            int var7 = arg0.method2755((byte) -126);
            int var8 = arg0.method2755((byte) -102);
            this.field916 = class494.method2889(var8, var6, var7, var4, 123, var5, var3);
        }
    }
}
