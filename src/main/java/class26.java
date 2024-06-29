import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class26 implements class196 {

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Lrh;")
    private class482 field406 = new class482(256);

    @OriginalMember(owner = "client!af", name = "p", descriptor = "Lqs;")
    private class496 field413;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Lqs;")
    private class496 field401;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "[Lks;")
    private class320[] field404;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "Lnk;")
    public static class326 field400 = new class326(39, 3);

    @OriginalMember(owner = "client!af", name = "q", descriptor = "F")
    public static float field414;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZZIIIF)[I")
    public final int[] method187(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, float arg5) {
        field412++;
        if (arg1) {
            method192((byte) -62);
        }
        return this.method191((byte) 118, arg3).method2515((double) arg5, arg2, this.field401, 19206, arg4, this.field404[arg3].field5041, this);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(FIIIZI)[F")
    public final float[] method188(float arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg2 != -26204) {
            method190(null, null, -104);
        }
        field410++;
        return this.method191((byte) 83, arg5).method2513(this.field401, this, arg3, true, arg1, this.field404[arg5].field5041);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)I")
    public static final int method189(int arg0, int arg1) {
        field411++;
        if (arg1 > -57) {
            method192((byte) -107);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/awt/Frame;Lnv;I)V")
    public static final void method190(Frame arg0, class493 arg1, int arg2) {
        field407++;
        while (true) {
            class169 var3 = arg1.method2892(arg0, 7445);
            while (var3.field2692 == 0) {
                class444.method2667(-28210, 10L);
            }
            if (var3.field2692 == 1) {
                if (arg2 >= -85) {
                    method193(50, -41, 15, 78);
                }
                arg0.setVisible(false);
                arg0.dispose();
                return;
            }
            class444.method2667(-28210, 100L);
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(BI)Lum;")
    private final class406 method191(byte arg0, int arg1) {
        field405++;
        if (arg0 < 42) {
            field400 = null;
        }
        class270 var3 = this.field406.method2832((byte) 82, (long) arg1);
        if (var3 != null) {
            return (class406) var3;
        }
        byte[] var4 = this.field413.method2942(arg1, -10365);
        if (var4 == null) {
            return null;
        } else {
            class406 var5 = new class406(new class23(var4));
            this.field406.method2831((byte) -81, var5, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)[Lme;")
    public static final class502[] method192(byte arg0) {
        if (class257.field4333 == null) {
            class502[] var1 = class465.method2766(class419.field6342, -127);
            class502[] var2 = new class502[var1.length];
            int var3 = 0;
            label67: for (int var4 = 0; var4 < var1.length; var4++) {
                class502 var8 = var1[var4];
                if ((var8.field7331 <= 0 || var8.field7331 >= 24) && var8.field7332 >= 800 && var8.field7330 >= 600 && (class101.field1668 >= 96 || class511.field7485 != 0 || var8.field7332 <= 1024 && var8.field7330 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class502 var10 = var2[var9];
                        if (var8.field7332 == var10.field7332 && var8.field7330 == var10.field7330) {
                            if (var8.field7331 > var10.field7331) {
                                var2[var9] = var8;
                            }
                            continue label67;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class257.field4333 = new class502[var3];
            class85.method611(var2, 0, class257.field4333, 0, var3);
            int[] var5 = new int[class257.field4333.length];
            for (int var6 = 0; var6 < class257.field4333.length; var6++) {
                class502 var7 = class257.field4333[var6];
                var5[var6] = var7.field7332 * var7.field7330;
            }
            class314.method1996((byte) -60, class257.field4333, var5);
        }
        field399++;
        return arg0 >= -4 ? null : class257.field4333;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIII)Z")
    public static final boolean method193(int arg0, int arg1, int arg2, int arg3) {
        if (!class136.method1027(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class276.field4534;
        int var5 = arg2 << class276.field4534;
        int var6 = class360.field5592[arg0].method1516(arg1, arg2) - 1;
        int var7 = var6 - (0x78 << class276.field4534 - 7);
        int var8 = var6 - (0xE6 << class276.field4534 - 7);
        int var9 = var6 - (0xEE << class276.field4534 - 7);
        if (arg3 == 1) {
            if (var4 > class335.field5266) {
                if (!class331.method2087(var4, var6, var5)) {
                    return false;
                }
                if (!class331.method2087(var4, var6, class331.field5211 + var5)) {
                    return false;
                }
                if (!class331.method2087(var4, var6, class70.field1217 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class331.method2087(var4, var7, var5)) {
                    return false;
                }
                if (!class331.method2087(var4, var7, class331.field5211 + var5)) {
                    return false;
                }
                if (!class331.method2087(var4, var7, class70.field1217 + var5)) {
                    return false;
                }
            }
            if (!class331.method2087(var4, var8, var5)) {
                return false;
            } else if (class331.method2087(var4, var8, class331.field5211 + var5)) {
                return class331.method2087(var4, var8, class70.field1217 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class53.field852) {
                if (!class331.method2087(var4, var6, class70.field1217 + var5)) {
                    return false;
                }
                if (!class331.method2087(class331.field5211 + var4, var6, class70.field1217 + var5)) {
                    return false;
                }
                if (!class331.method2087(class70.field1217 + var4, var6, class70.field1217 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class331.method2087(var4, var7, class70.field1217 + var5)) {
                    return false;
                }
                if (!class331.method2087(class331.field5211 + var4, var7, class70.field1217 + var5)) {
                    return false;
                }
                if (!class331.method2087(class70.field1217 + var4, var7, class70.field1217 + var5)) {
                    return false;
                }
            }
            if (!class331.method2087(var4, var8, class70.field1217 + var5)) {
                return false;
            } else if (class331.method2087(class331.field5211 + var4, var8, class70.field1217 + var5)) {
                return class331.method2087(class70.field1217 + var4, var8, class70.field1217 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class335.field5266) {
                if (!class331.method2087(class70.field1217 + var4, var6, var5)) {
                    return false;
                }
                if (!class331.method2087(class70.field1217 + var4, var6, class331.field5211 + var5)) {
                    return false;
                }
                if (!class331.method2087(class70.field1217 + var4, var6, class70.field1217 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class331.method2087(class70.field1217 + var4, var7, var5)) {
                    return false;
                }
                if (!class331.method2087(class70.field1217 + var4, var7, class331.field5211 + var5)) {
                    return false;
                }
                if (!class331.method2087(class70.field1217 + var4, var7, class70.field1217 + var5)) {
                    return false;
                }
            }
            if (!class331.method2087(class70.field1217 + var4, var8, var5)) {
                return false;
            } else if (class331.method2087(class70.field1217 + var4, var8, class331.field5211 + var5)) {
                return class331.method2087(class70.field1217 + var4, var8, class70.field1217 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class53.field852) {
                if (!class331.method2087(var4, var6, var5)) {
                    return false;
                }
                if (!class331.method2087(class331.field5211 + var4, var6, var5)) {
                    return false;
                }
                if (!class331.method2087(class70.field1217 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class331.method2087(var4, var7, var5)) {
                    return false;
                }
                if (!class331.method2087(class331.field5211 + var4, var7, var5)) {
                    return false;
                }
                if (!class331.method2087(class70.field1217 + var4, var7, var5)) {
                    return false;
                }
            }
            if (!class331.method2087(var4, var8, var5)) {
                return false;
            } else if (class331.method2087(class331.field5211 + var4, var8, var5)) {
                return class331.method2087(class70.field1217 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class331.method2087(class331.field5211 + var4, var9, class331.field5211 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class331.method2087(var4, var8, class70.field1217 + var5);
        } else if (arg3 == 32) {
            return class331.method2087(class70.field1217 + var4, var8, class70.field1217 + var5);
        } else if (arg3 == 64) {
            return class331.method2087(class70.field1217 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class331.method2087(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)Z")
    public final boolean method194(byte arg0, int arg1) {
        if (arg0 != 89) {
            this.method195(31, (byte) -19);
        }
        field408++;
        class406 var3 = this.method191((byte) 49, arg1);
        return var3 != null && var3.method2514((byte) 94, this, this.field401);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)Lks;")
    public final class320 method195(int arg0, byte arg1) {
        field402++;
        if (arg1 != -105) {
            field403 = 84;
        }
        return this.field404[arg0];
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static void method196(int arg0) {
        field400 = null;
        if (arg0 != 238) {
            field400 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IFIBIZ)[I")
    public final int[] method197(int arg0, float arg1, int arg2, byte arg3, int arg4, boolean arg5) {
        field398++;
        return arg3 < 94 ? null : this.method191((byte) 66, arg0).method2511(arg2, this.field404[arg0].field5041, arg5, this.field401, (byte) -40, arg4, (double) arg1, this);
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lqs;Lqs;Lqs;)V")
    public class26(class496 arg0, class496 arg1, class496 arg2) {
        this.field413 = arg1;
        this.field401 = arg2;
        class23 var4 = new class23(arg0.method2926(0, -74, 0));
        int var5 = var4.method132(89);
        this.field404 = new class320[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method126((byte) -78) == 1) {
                this.field404[var6] = new class320();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field404[var7] != null) {
                this.field404[var7].field5023 = var4.method126((byte) -79) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field404[var8] != null) {
                this.field404[var8].field5028 = var4.method126((byte) -127) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field404[var9] != null) {
                this.field404[var9].field5020 = var4.method126((byte) -84) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field404[var10] != null) {
                this.field404[var10].field5027 = var4.method126((byte) -88) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field404[var11] != null) {
                this.field404[var11].field5035 = var4.method167(-2);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field404[var12] != null) {
                this.field404[var12].field5029 = var4.method167(-2);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field404[var13] != null) {
                this.field404[var13].field5026 = var4.method167(-2);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field404[var14] != null) {
                this.field404[var14].field5038 = var4.method167(-2);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field404[var15] != null) {
                this.field404[var15].field5033 = (short) var4.method132(67);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field404[var16] != null) {
                this.field404[var16].field5034 = var4.method167(-2);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field404[var17] != null) {
                this.field404[var17].field5021 = var4.method167(-2);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field404[var18] != null) {
                this.field404[var18].field5022 = var4.method126((byte) -127) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field404[var19] != null) {
                this.field404[var19].field5041 = var4.method126((byte) -99) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field404[var20] != null) {
                this.field404[var20].field5015 = var4.method167(-2);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field404[var21] != null) {
                this.field404[var21].field5019 = var4.method126((byte) -108) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field404[var22] != null) {
                this.field404[var22].field5016 = var4.method126((byte) -114) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field404[var23] != null) {
                this.field404[var23].field5040 = var4.method126((byte) -88) == 1;
            }
        }
        for (int var24 = 0; var24 < var5; var24++) {
            if (this.field404[var24] != null) {
                this.field404[var24].field5036 = var4.method126((byte) -84);
            }
        }
        for (int var25 = 0; var25 < var5; var25++) {
            if (this.field404[var25] != null) {
                this.field404[var25].field5037 = var4.method143(-3230);
            }
        }
    }
}
