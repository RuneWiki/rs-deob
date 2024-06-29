import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class335 extends class507 {

    @OriginalMember(owner = "client!ap", name = "y", descriptor = "[I")
    private int[] field4439;

    @OriginalMember(owner = "client!ap", name = "z", descriptor = "[I")
    private int[] field4440;

    @OriginalMember(owner = "client!ap", name = "w", descriptor = "Lgd;")
    private class227 field4437;

    @OriginalMember(owner = "client!ap", name = "E", descriptor = "Lgd;")
    private class227 field4445;

    @OriginalMember(owner = "client!ap", name = "A", descriptor = "Lgd;")
    private class227 field4441;

    @OriginalMember(owner = "client!ap", name = "F", descriptor = "[Lgd;")
    private class227[] field4446;

    @OriginalMember(owner = "client!ap", name = "x", descriptor = "I")
    public static int field4438 = -1;

    @OriginalMember(owner = "client!ap", name = "t", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!ap", name = "u", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!ap", name = "v", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!ap", name = "B", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!ap", name = "C", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!ap", name = "D", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!ap", name = "G", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZLfo;ZIIBLl;D)[I")
    public final int[] method1951(boolean arg0, class361 arg1, boolean arg2, int arg3, int arg4, byte arg5, class16 arg6, double arg7) {
        field4443++;
        class363.field4965 = arg6;
        class47.field488 = arg1;
        for (int var10 = 0; var10 < this.field4446.length; var10++) {
            this.field4446[var10].method1462(arg3, arg4, (byte) 66);
        }
        class406.method2493((byte) 121, arg7);
        class406.method2492(66, arg4, arg3);
        int[] var11 = new int[arg3 * arg4];
        byte var12;
        int var13;
        int var14;
        if (arg2) {
            var12 = -1;
            var13 = -1;
            var14 = arg4 - 1;
        } else {
            var13 = arg4;
            var14 = 0;
            var12 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg3; var16++) {
            if (arg0) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field4445.field3066) {
                int[] var18 = this.field4445.method62(15811, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field4445.method112(var16, true);
                var20 = var22[0];
                var19 = var22[2];
                var21 = var22[1];
            }
            for (int var23 = var14; var23 != var13; var23 += var12) {
                int var24 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var21[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var19[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = class387.field5624[var25];
                int var28 = class387.field5624[var24];
                int var29 = class387.field5624[var26];
                int var30 = (var27 << 8) + (var28 << 16) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg0) {
                    var15 += arg4 - 1;
                }
            }
        }
        if (arg5 < 32) {
            this.field4440 = null;
        }
        for (int var17 = 0; var17 < this.field4446.length; var17++) {
            this.field4446[var17].method1454(-69);
        }
        return var11;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lfo;Ll;B)Z")
    public final boolean method1952(class361 arg0, class16 arg1, byte arg2) {
        field4435++;
        if (class38.field396 < 0) {
            for (int var4 = 0; var4 < this.field4439.length; var4++) {
                if (!arg0.method2133(0, this.field4439[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field4439.length; var5++) {
                if (!arg0.method2142(class38.field396, this.field4439[var5], (byte) 28)) {
                    return false;
                }
            }
        }
        if (arg2 >= -96) {
            method1956(-72);
        }
        for (int var6 = 0; var6 < this.field4440.length; var6++) {
            if (!arg1.method91(this.field4440[var6], -1221)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILl;ZILfo;I)[F")
    public final float[] method1953(int arg0, class16 arg1, boolean arg2, int arg3, class361 arg4, int arg5) {
        class47.field488 = arg4;
        class363.field4965 = arg1;
        field4444++;
        for (int var7 = 0; var7 < this.field4446.length; var7++) {
            this.field4446[var7].method1462(arg5, arg0, (byte) 49);
        }
        class406.method2492(87, arg0, arg5);
        float[] var8 = new float[arg0 * arg5 * 4];
        if (arg3 != -11564) {
            method1957(null, 49, -103, -73);
        }
        int var9 = 0;
        for (int var10 = 0; var10 < arg5; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field4445.field3066) {
                int[] var12 = this.field4445.method62(arg3 ^ 0xFFFFEF17, var10);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field4445.method112(var10, true);
                var15 = var16[2];
                var14 = var16[0];
                var13 = var16[1];
            }
            int[] var17;
            if (this.field4441.field3066) {
                var17 = this.field4441.method62(15811, var10);
            } else {
                var17 = this.field4441.method112(var10, true)[0];
            }
            int[] var18;
            if (this.field4437.field3066) {
                var18 = this.field4437.method62(15811, var10);
            } else {
                var18 = this.field4437.method112(var10, true)[0];
            }
            if (arg2) {
                var9 = var10 << 2;
            }
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = var20;
                if (arg2) {
                    var9 += (arg0 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field4446.length; var11++) {
            this.field4446[var11].method1454(-124);
        }
        return var8;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(III)Z")
    public static final boolean method1954(int arg0, int arg1, int arg2) {
        if (arg2 <= 72) {
            return true;
        } else {
            field4442++;
            return (arg0 & 0x34) != 0;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ll;Lfo;DBIIZ)[I")
    public final int[] method1955(class16 arg0, class361 arg1, double arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        if (arg3 < 47) {
            return null;
        }
        field4447++;
        class363.field4965 = arg0;
        class47.field488 = arg1;
        for (int var9 = 0; var9 < this.field4446.length; var9++) {
            this.field4446[var9].method1462(arg4, arg5, (byte) 105);
        }
        class406.method2493((byte) 124, arg2);
        class406.method2492(116, arg5, arg4);
        int[] var10 = new int[arg4 * arg5 * 4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg4; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field4445.field3066) {
                int[] var18 = this.field4445.method62(15811, var12);
                var16 = var18;
                var15 = var18;
                var17 = var18;
            } else {
                int[][] var14 = this.field4445.method112(var12, true);
                var15 = var14[1];
                var16 = var14[2];
                var17 = var14[0];
            }
            if (arg6) {
                var11 = var12;
            }
            int[] var19;
            if (this.field4441.field3066) {
                var19 = this.field4441.method62(15811, var12);
            } else {
                var19 = this.field4441.method112(var12, true)[0];
            }
            for (int var20 = arg5 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var15[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var16[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class387.field5624[var22];
                int var25 = class387.field5624[var21];
                int var26 = class387.field5624[var23];
                int var27;
                if (var25 == 0 && var24 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var25 << 16) + (var27 << 24) - (-(var24 << 8) + -var26);
                if (arg6) {
                    var11 += arg5 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field4446.length; var13++) {
            this.field4446[var13].method1454(-38);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "(I)Lja;")
    public static final class184 method1956(int arg0) {
        field4436++;
        class184 var1 = (class184) class81.field990.method1937(false);
        if (var1 != null) {
            var1.method2674(true);
            var1.method3022((byte) 54);
            return var1;
        }
        if (arg0 != 0) {
            field4438 = 36;
        }
        class184 var2;
        do {
            var2 = (class184) class90.field1079.method1937(false);
            if (var2 == null) {
                return null;
            }
            if (var2.method1074((byte) -23) > class45.method252((byte) -8)) {
                return null;
            }
            var2.method2674(true);
            var2.method3022((byte) 54);
        } while ((var2.field7348 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Loq;III)Lnc;")
    public static final class21 method1957(class242 arg0, int arg1, int arg2, int arg3) {
        field4434++;
        int var4 = arg0.field3203 | arg3 << 8;
        class21 var5 = (class21) class449.field6540.method324((long) var4 << 16, 126);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class230.field3101.method2128(arg2 + 1065575866, class230.field3101.method2147(-1, var4));
        if (var6 == null) {
            int var8 = arg1 + 65536 << 8 | arg0.field3203;
            class21 var9 = (class21) class449.field6540.method324((long) var8 << 16, -74);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class230.field3101.method2128(-2, class230.field3101.method2147(-1, var8));
            if (var10 == null) {
                int var12 = arg0.field3203 | 0xFFFF00;
                class21 var13 = (class21) class449.field6540.method324((long) var12 << 16, -21);
                if (arg2 != -1065575868) {
                    return null;
                } else if (var13 == null) {
                    byte[] var14 = class230.field3101.method2128(-2, class230.field3101.method2147(-1, var12));
                    if (var14 == null) {
                        return null;
                    } else if (var14.length <= 1) {
                        return null;
                    } else {
                        class21 var15 = class277.method1681((byte) 59, var14);
                        var15.field201 = arg0;
                        class449.field6540.method322((long) var12 << 16, var15, (byte) -117);
                        return var15;
                    }
                } else {
                    return var13;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class21 var11 = class277.method1681((byte) 27, var10);
                var11.field201 = arg0;
                class449.field6540.method322((long) var8 << 16, var11, (byte) -73);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class21 var7 = class277.method1681((byte) 15, var6);
            var7.field201 = arg0;
            class449.field6540.method322((long) var4 << 16, var7, (byte) -63);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)I")
    public static int method1958(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "()V")
    public class335() {
        this.field4439 = new int[0];
        this.field4440 = new int[0];
        this.field4437 = new class394(0);
        this.field4437.field3055 = 1;
        this.field4445 = new class394();
        this.field4445.field3055 = 1;
        this.field4441 = new class394();
        this.field4441.field3055 = 1;
        this.field4446 = new class227[] { this.field4445, this.field4441, this.field4437 };
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lug;)V")
    public class335(class396 arg0) {
        int var2 = arg0.method2388((byte) -115);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field4446 = new class227[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class227 var16 = class457.method2816(arg0, -1);
            if (var16.method1458(-1) >= 0) {
                var3++;
            }
            if (var16.method1453(2045302183) >= 0) {
                var4++;
            }
            int var17 = var16.field3069.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method2388((byte) -120);
            }
            this.field4446[var6] = var16;
        }
        this.field4439 = new int[var3];
        int var7 = 0;
        this.field4440 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class227 var11 = this.field4446[var9];
            int var12 = var11.field3069.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field3069[var13] = this.field4446[var5[var9][var13]];
            }
            int var14 = var11.method1458(-1);
            int var15 = var11.method1453(2045302183);
            if (var14 > 0) {
                this.field4439[var7++] = var14;
            }
            if (var15 > 0) {
                this.field4440[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field4445 = this.field4446[arg0.method2388((byte) -121)];
        this.field4441 = this.field4446[arg0.method2388((byte) -113)];
        this.field4437 = this.field4446[arg0.method2388((byte) -112)];
        Object var10 = null;
    }

    static {
        new class305("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
    }
}
