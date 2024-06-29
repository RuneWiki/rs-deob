import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class76 {

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "Z")
    private boolean field928 = true;

    @OriginalMember(owner = "client!vp", name = "s", descriptor = "I")
    private int field936 = -1;

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "[Lcs;")
    private class193[] field927;

    @OriginalMember(owner = "client!vp", name = "w", descriptor = "I")
    private int field940;

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "I")
    private int field932;

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
    private int field924;

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
    private int field929;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "Lcs;")
    private class193 field921;

    @OriginalMember(owner = "client!vp", name = "m", descriptor = "[Lcs;")
    private class193[] field930;

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "Lcq;")
    public static class72 field926 = new class72("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!vp", name = "v", descriptor = "Ltm;")
    public static class349 field939 = new class349(64);

    @OriginalMember(owner = "client!vp", name = "y", descriptor = "[Lbo;")
    public static class156[] field942 = new class156[14];

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "I")
    private int field935;

    @OriginalMember(owner = "client!vp", name = "t", descriptor = "I")
    private int field937;

    @OriginalMember(owner = "client!vp", name = "u", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!vp", name = "x", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!vp", name = "z", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "Lc;")
    private class436 field923;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field931++;
        int var8 = arg0 - arg4;
        int var9 = arg2 + arg4;
        for (int var10 = arg2; var10 < var9; var10++) {
            class384.method2394(arg1, arg6 + 117, class228.field2877[var10], arg7, arg3);
        }
        int var11 = arg3 + arg4;
        for (int var12 = arg0; var12 > var8; var12--) {
            class384.method2394(arg1, arg6 ^ 0x76, class228.field2877[var12], arg7, arg3);
        }
        int var13 = arg7 - arg4;
        if (arg6 != 1) {
            method448(-28, 43, -113, 94, 92, 34, -67, -35);
        }
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class228.field2877[var14];
            class384.method2394(arg1, 110, var15, var11, arg3);
            class384.method2394(arg5, 105, var15, var13, var11);
            class384.method2394(arg1, arg6 + 117, var15, arg7, var13);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIIIILuo;III)V")
    public final void method449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class118 arg6, int arg7, int arg8, int arg9) {
        int var11 = arg7 + arg9 & 0x3FFF;
        field925++;
        if (this.field940 == -1) {
            arg6.method789(arg0, arg8, arg3, arg5, arg2, 0);
        } else {
            class358 var12 = class157.field1834.method960(this.field940, (byte) -40);
            if (this.field923 == null && class157.field1834.method963(this.field940, true)) {
                int[] var13 = var12.field4854 ? class157.field1834.method965(arg4 + 10693, this.field935, this.field940, 0.7F, this.field935, false) : class157.field1834.method964(this.field940, this.field935, -22968, 0.7F, this.field935, false);
                this.field923 = arg6.method703(var13, 0, this.field935, this.field935, this.field935);
            }
            if (!var12.field4854) {
                arg6.method789(arg0, arg8, arg3, arg5, arg2, 0);
            }
            if (this.field923 != null) {
                int var14 = var12.field4854 ? 0 : 1;
                int var15 = arg1 * arg5 / -4096;
                int var16;
                for (var16 = arg5 * var11 / 4096 + (arg3 - arg5) / 2; var16 > arg5; var16 -= arg5) {
                }
                while (var16 < 0) {
                    var16 += arg5;
                }
                while (arg5 < var15) {
                    var15 -= arg5;
                }
                while (var15 < 0) {
                    var15 += arg5;
                }
                for (int var17 = var16 - arg5; var17 < arg3; var17 += arg5) {
                    for (int var18 = var15 - arg5; var18 < arg5; var18 += arg5) {
                        this.field923.method163(var17 + arg0, arg8 + var18, arg5, arg5, 0, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field937 - 1; var19 >= 0; var19--) {
            this.field930[var19].method1187(arg6, arg0, arg8, arg3, arg5, arg1, var11);
        }
        if (arg4 != -10571) {
            field942 = null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZILuo;)Z")
    public final boolean method450(boolean arg0, int arg1, class118 arg2) {
        if (this.field936 != arg1) {
            this.field936 = arg1;
            int var4 = class39.method249(arg1, true);
            if (arg1 < var4) {
                var4 = class246.method1611((byte) 74, arg1);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field935 != var4) {
                this.field935 = var4;
                this.field923 = null;
            }
            if (this.field927 != null) {
                this.field937 = 0;
                int[] var5 = new int[this.field927.length];
                for (int var6 = 0; var6 < this.field927.length; var6++) {
                    class193 var7 = this.field927[var6];
                    if (var7.method1196(this.field929, this.field924, this.field932, this.field936)) {
                        var5[this.field937] = var7.field2263;
                        this.field930[this.field937++] = var7;
                    }
                }
                class163.method1036(this.field930, 0, this.field937 - 1, var5, true);
            }
            this.field928 = true;
        }
        field938++;
        boolean var8 = arg0;
        if (this.field928) {
            this.field928 = false;
            for (int var9 = this.field937 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field930[var9].method1189(arg2, this.field921);
                this.field928 |= !var10;
                var8 |= var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)V")
    public static final void method451(boolean arg0) {
        field922++;
        for (class69 var1 = (class69) class220.field2722.method1838(-6325); var1 != null; var1 = (class69) class220.field2722.method1834((byte) 74)) {
            var1.method399();
        }
        if (!arg0) {
            method456((byte) 106);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILla;)V")
    public static final void method452(int arg0, class266 arg1) {
        field920++;
        if (arg1 == null || class97.field1138.field3483 == arg1) {
            return;
        }
        int var2 = arg1.field3423;
        int var3 = arg1.field3426;
        int var4 = arg1.field3424;
        int var5 = (int) arg1.field3427;
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        long var6 = arg1.field3427;
        int var8;
        int var9;
        if (class208.field2516 == null) {
            var8 = class301.field4014;
            var9 = class242.field3232;
        } else {
            var8 = class208.field2516.method5(arg0 + 27878);
            var9 = class208.field2516.method2(false);
        }
        if (var4 == 1011) {
            class215.field2654 = var9;
            class338.field4611 = var8;
            class432.field5904 = 2;
            client.field6058 = 0;
            class192.field2255++;
            class427.field5837.method2162(false, 12);
            class427.field5837.method1592(var5, (byte) 101);
        }
        if (var4 == 11) {
            class215.field2654 = var9;
            class432.field5904 = 2;
            client.field6058 = 0;
            class303.field4068++;
            class338.field4611 = var8;
            class427.field5837.method2162(false, 230);
            class427.field5837.method1592(var5, (byte) -98);
            class427.field5837.method1588(class278.field3608 + var2, arg0 + -119);
            class427.field5837.method1579((byte) -44, class261.field3359.method623(9, 82) ? 1 : 0);
            class427.field5837.method1592(class129.field1432 + var3, (byte) 97);
            class340.method2179(var3, var2, 0);
        }
        if (var4 == 47) {
            class449.field6275++;
            class432.field5904 = 2;
            class215.field2654 = var9;
            class338.field4611 = var8;
            client.field6058 = 0;
            class427.field5837.method2162(false, 86);
            class427.field5837.method1546(var3 + class129.field1432, arg0 + -1990920344);
            class427.field5837.method1584(class261.field3359.method623(9, 82) ? 1 : 0, 255);
            class427.field5837.method1546(var5, -1990920344);
            class427.field5837.method1592(class278.field3608 + var2, (byte) -111);
            class340.method2179(var3, var2, 0);
        }
        if (var4 == 8) {
            class131 var10 = class212.field2584[var5];
            if (var10 != null) {
                class362.field4902++;
                class338.field4611 = var8;
                client.field6058 = 0;
                class432.field5904 = 2;
                class215.field2654 = var9;
                class427.field5837.method2162(false, 215);
                class427.field5837.method1555(true, class261.field3359.method623(9, 82) ? 1 : 0);
                class427.field5837.method1592(var5, (byte) -36);
                class94.method586(var10.field2480[0], 1, var10.field2482[0], -2, class143.field1684.field2480[0], var10.method841(true), var10.method841(true), 0, true, class143.field1684.field2482[0], 0);
            }
        }
        if (var4 == 23) {
            class298 var11 = class220.field2726[var5];
            if (var11 != null) {
                class338.field4611 = var8;
                class215.field2654 = var9;
                class432.field5904 = 2;
                class208.field2530++;
                client.field6058 = 0;
                class427.field5837.method2162(false, 200);
                class427.field5837.method1588(var5, -40);
                class427.field5837.method1593(class261.field3359.method623(arg0 + 9, 82) ? 1 : 0, -96);
                class94.method586(var11.field2480[0], 1, var11.field2482[0], -2, class143.field1684.field2480[0], var11.method841(true), var11.method841(true), 0, true, class143.field1684.field2482[0], 0);
            }
        }
        if (var4 == 57) {
            class453 var12 = class378.method2346(-23490, var2, var3);
            if (var12 != null) {
                class314.method1979(-31891, var12);
            }
        }
        if (var4 == 4) {
            class298 var13 = class220.field2726[var5];
            if (var13 != null) {
                class432.field5904 = 2;
                class338.field4611 = var8;
                class406.field5613++;
                class215.field2654 = var9;
                client.field6058 = 0;
                class427.field5837.method2162(false, 130);
                class427.field5837.method1546(var5, -1990920344);
                class427.field5837.method1546(class62.field759, arg0 ^ 0x8954F768);
                class427.field5837.method1560(-26356, class357.field4844);
                class427.field5837.method1579((byte) -124, class261.field3359.method623(9, 82) ? 1 : 0);
                class94.method586(var13.field2480[0], arg0 + 1, var13.field2482[0], -2, class143.field1684.field2480[0], var13.method841(true), var13.method841(true), 0, true, class143.field1684.field2482[0], 0);
            }
        }
        if (var4 == 9) {
            class432.field5904 = 2;
            class338.field4611 = var8;
            class215.field2654 = var9;
            class94.field1112++;
            client.field6058 = 0;
            class427.field5837.method2162(false, 223);
            class427.field5837.method1592(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) 89);
            class427.field5837.method1546(class129.field1432 + var3, -1990920344);
            class427.field5837.method1555(true, class261.field3359.method623(9, 82) ? 1 : 0);
            class427.field5837.method1573(-6266, var2 + class278.field3608);
            class261.method1650(var6, var2, (byte) 122, var3);
        }
        if (var4 == 18) {
            class131 var14 = class212.field2584[var5];
            if (var14 != null) {
                client.field6058 = 0;
                class215.field2654 = var9;
                class338.field4611 = var8;
                class432.field5904 = 2;
                class138.field1574++;
                class427.field5837.method2162(false, 237);
                class427.field5837.method1573(-6266, var5);
                class427.field5837.method1593(class261.field3359.method623(9, 82) ? 1 : 0, -120);
                class94.method586(var14.field2480[0], 1, var14.field2482[0], -2, class143.field1684.field2480[0], var14.method841(true), var14.method841(true), 0, true, class143.field1684.field2482[0], 0);
            }
        }
        if (var4 == 19) {
            class298 var15 = class220.field2726[var5];
            if (var15 != null) {
                class299.field3990++;
                class338.field4611 = var8;
                client.field6058 = 0;
                class432.field5904 = 2;
                class215.field2654 = var9;
                class427.field5837.method2162(false, 113);
                class427.field5837.method1546(var5, -1990920344);
                class427.field5837.method1555(true, class261.field3359.method623(arg0 ^ 0x9, 82) ? 1 : 0);
                class94.method586(var15.field2480[0], arg0 ^ 0x1, var15.field2482[0], -2, class143.field1684.field2480[0], var15.method841(true), var15.method841(true), 0, true, class143.field1684.field2482[0], 0);
            }
        }
        if (var4 == 1003 || var4 == 1007 || var4 == 1006 || var4 == 1008 || var4 == 1004) {
            class31.method193(86, var2, var4, var5);
        }
        if (var4 == 3) {
            class432.field5904 = 2;
            class338.field4611 = var8;
            class215.field2654 = var9;
            class293.field3856++;
            client.field6058 = 0;
            class427.field5837.method2162(false, 128);
            class427.field5837.method1592(class129.field1432 + var3, (byte) 113);
            class427.field5837.method1592(class278.field3608 + var2, (byte) 125);
            class427.field5837.method1573(-6266, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class427.field5837.method1584(class261.field3359.method623(9, 82) ? 1 : 0, 255);
            class261.method1650(var6, var2, (byte) -4, var3);
        }
        if (var4 == 49) {
            class298 var16 = class220.field2726[var5];
            if (var16 != null) {
                class432.field5904 = 2;
                class338.field4611 = var8;
                class71.field882++;
                class215.field2654 = var9;
                client.field6058 = 0;
                class427.field5837.method2162(false, 190);
                class427.field5837.method1588(var5, arg0 ^ 0xFFFFFFE1);
                class427.field5837.method1593(class261.field3359.method623(9, 82) ? 1 : 0, arg0 ^ 0xFFFFFF85);
                class94.method586(var16.field2480[0], 1, var16.field2482[0], -2, class143.field1684.field2480[0], var16.method841(true), var16.method841(true), 0, true, class143.field1684.field2482[0], 0);
            }
        }
        if (var4 == 12) {
            class432.field5904 = 2;
            class1.field5++;
            class338.field4611 = var8;
            class215.field2654 = var9;
            client.field6058 = 0;
            class427.field5837.method2162(false, 164);
            class427.field5837.method1546(var5, -1990920344);
            class427.field5837.method1573(-6266, class278.field3608 + var2);
            class427.field5837.method1584(class261.field3359.method623(9, 82) ? 1 : 0, 255);
            class427.field5837.method1546(class129.field1432 + var3, arg0 + -1990920344);
            class340.method2179(var3, var2, 0);
        }
        if (var4 == 45) {
            client.field6058 = 0;
            class338.field4611 = var8;
            class40.field472++;
            class432.field5904 = 2;
            class215.field2654 = var9;
            class427.field5837.method2162(false, 107);
            class427.field5837.method1546(class129.field1432 + var3, -1990920344);
            class427.field5837.method1588(var2 + class278.field3608, arg0 + -98);
            class427.field5837.method1592(var5, (byte) 107);
            class427.field5837.method1593(class261.field3359.method623(arg0 ^ 0x9, 82) ? 1 : 0, -93);
            class340.method2179(var3, var2, 0);
        }
        if (var4 == 2 && class40.field485 == null) {
            class285.method1807(var3, 115, var2);
            class40.field485 = class378.method2346(-23490, var2, var3);
            class303.method1923(class40.field485, 10240);
        }
        if (var4 == 58 || var4 == 1010) {
            class54.method308(arg1.field3421, -119, var2, var5, var3);
        }
        if (var4 == 44) {
            client.field6058 = 0;
            class281.field3644++;
            class432.field5904 = 2;
            class338.field4611 = var8;
            class215.field2654 = var9;
            class427.field5837.method2162(false, 93);
            class427.field5837.method1546((int) (var6 >>> 32) & Integer.MAX_VALUE, -1990920344);
            class427.field5837.method1592(class278.field3608 + var2, (byte) 88);
            class427.field5837.method1546(class129.field1432 + var3, -1990920344);
            class427.field5837.method1593(class261.field3359.method623(9, 82) ? 1 : 0, arg0 ^ 0xFFFFFFA0);
            class427.field5837.method1573(arg0 - 6266, class62.field759);
            class427.field5837.method1554(-1844808528, class357.field4844);
            class261.method1650(var6, var2, (byte) 107, var3);
        }
        if (var4 == 51) {
            client.field6058 = 0;
            class215.field2654 = var9;
            class432.field5904 = 2;
            class338.field4611 = var8;
            class116.field1338++;
            class427.field5837.method2162(false, 150);
            class427.field5837.method1588(class129.field1432 + var3, arg0 + -90);
            class427.field5837.method1546((int) (var6 >>> 32) & Integer.MAX_VALUE, arg0 ^ 0x8954F768);
            class427.field5837.method1584(class261.field3359.method623(9, 82) ? 1 : 0, 255);
            class427.field5837.method1592(class278.field3608 + var2, (byte) 103);
            class261.method1650(var6, var2, (byte) -103, var3);
        }
        if (var4 == 21) {
            if (class427.field5842 > 0 && class261.field3359.method623(9, 82) && class261.field3359.method623(9, 81)) {
                class424.method2597(class129.field1432 + var3, class43.field513, class278.field3608 + var2, arg0 ^ 0x3FC9686);
            } else {
                class347.method2210(var5, (byte) -3, var3, var2);
                if (var5 == 1) {
                    class427.field5837.method1593(-1, -119);
                    class427.field5837.method1593(-1, -127);
                    class427.field5837.method1573(-6266, (int) class434.field5929);
                    class427.field5837.method1593(57, arg0 ^ 0xFFFFFF9F);
                    class427.field5837.method1593(class231.field3043, arg0 ^ 0xFFFFFF8B);
                    class427.field5837.method1593(class280.field3627, arg0 ^ 0xFFFFFF95);
                    class427.field5837.method1593(89, -126);
                    class427.field5837.method1573(arg0 - 6266, class143.field1684.field1516);
                    class427.field5837.method1573(-6266, class143.field1684.field1514);
                    class427.field5837.method1593(63, -92);
                } else {
                    class432.field5904 = 1;
                    class338.field4611 = var8;
                    client.field6058 = 0;
                    class215.field2654 = var9;
                }
                class94.method586(var2, 1, var3, -4, class143.field1684.field2480[0], 1, 1, 0, true, class143.field1684.field2482[0], 0);
            }
        }
        if (var4 == 59) {
            if (class427.field5842 > 0 && class261.field3359.method623(9, 82) && class261.field3359.method623(9, 81)) {
                class424.method2597(class129.field1432 + var3, class43.field513, class278.field3608 + var2, 66885254);
            } else {
                class338.field4611 = var8;
                class432.field5904 = 1;
                class215.field2654 = var9;
                class380.field5179++;
                client.field6058 = 0;
                class427.field5837.method2162(false, 193);
                class427.field5837.method1546(class129.field1432 + var3, -1990920344);
                class427.field5837.method1588(class278.field3608 + var2, -80);
            }
        }
        if (arg0 != 0) {
            field942 = null;
        }
        if (var4 == 13) {
            class131 var17 = class212.field2584[var5];
            if (var17 != null) {
                class432.field5904 = 2;
                class180.field2096++;
                class338.field4611 = var8;
                client.field6058 = 0;
                class215.field2654 = var9;
                class427.field5837.method2162(false, 4);
                class427.field5837.method1593(class261.field3359.method623(9, 82) ? 1 : 0, -116);
                class427.field5837.method1573(-6266, var5);
                class94.method586(var17.field2480[0], 1, var17.field2482[0], -2, class143.field1684.field2480[0], var17.method841(true), var17.method841(true), 0, true, class143.field1684.field2482[0], 0);
            }
        }
        if (var4 == 6) {
            class158.field1844++;
            class215.field2654 = var9;
            client.field6058 = 0;
            class432.field5904 = 2;
            class338.field4611 = var8;
            class427.field5837.method2162(false, 201);
            class427.field5837.method1555(true, class261.field3359.method623(9, 82) ? 1 : 0);
            class427.field5837.method1573(-6266, class62.field759);
            class427.field5837.method1558((byte) 32, class357.field4844);
            class427.field5837.method1592(class278.field3608 + var2, (byte) 6);
            class427.field5837.method1592(class129.field1432 + var3, (byte) 111);
            class427.field5837.method1573(-6266, var5);
            class340.method2179(var3, var2, 0);
        }
        if (var4 == 60) {
            class215.field2654 = var9;
            class394.field5365++;
            class338.field4611 = var8;
            client.field6058 = 0;
            class432.field5904 = 1;
            class427.field5837.method2162(false, 155);
            class427.field5837.method1560(-26356, class357.field4844);
            class427.field5837.method1573(-6266, class129.field1432 + var3);
            class427.field5837.method1573(-6266, class62.field759);
            class427.field5837.method1588(class278.field3608 + var2, -59);
            class94.method586(var2, 1, var3, -4, class143.field1684.field2480[0], 1, 1, 0, true, class143.field1684.field2482[0], 0);
        }
        if (var4 == 48) {
            class131 var18 = class212.field2584[var5];
            if (var18 != null) {
                class338.field4611 = var8;
                client.field6058 = 0;
                class432.field5904 = 2;
                class369.field5023++;
                class215.field2654 = var9;
                class427.field5837.method2162(false, 3);
                class427.field5837.method1593(class261.field3359.method623(9, 82) ? 1 : 0, -120);
                class427.field5837.method1546(var5, -1990920344);
                class94.method586(var18.field2480[0], arg0 ^ 0x1, var18.field2482[0], -2, class143.field1684.field2480[0], var18.method841(true), var18.method841(true), 0, true, class143.field1684.field2482[0], 0);
            }
        }
        if (var4 == 17) {
            client.field6058 = 0;
            class432.field5904 = 2;
            class215.field2654 = var9;
            class201.field2363++;
            class338.field4611 = var8;
            class427.field5837.method2162(false, 176);
            class427.field5837.method1593(class261.field3359.method623(9, 82) ? 1 : 0, -116);
            class427.field5837.method1592(class129.field1432 + var3, (byte) -30);
            class427.field5837.method1592(class278.field3608 + var2, (byte) -80);
            class427.field5837.method1592((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) 107);
            class261.method1650(var6, var2, (byte) -89, var3);
        }
        if (var4 == 15) {
            class131 var19 = class212.field2584[var5];
            if (var19 != null) {
                class432.field5904 = 2;
                class215.field2654 = var9;
                class338.field4611 = var8;
                client.field6058 = 0;
                class416.field5692++;
                class427.field5837.method2162(false, 88);
                class427.field5837.method1584(class261.field3359.method623(9, 82) ? 1 : 0, 255);
                class427.field5837.method1592(var5, (byte) 91);
                class94.method586(var19.field2480[0], arg0 + 1, var19.field2482[0], -2, class143.field1684.field2480[0], var19.method841(true), var19.method841(true), 0, true, class143.field1684.field2482[0], 0);
            }
        }
        if (var4 == 5) {
            class298 var20 = class220.field2726[var5];
            if (var20 != null) {
                class432.field5904 = 2;
                class338.field4611 = var8;
                class191.field2243++;
                client.field6058 = 0;
                class215.field2654 = var9;
                class427.field5837.method2162(false, 146);
                class427.field5837.method1592(var5, (byte) 120);
                class427.field5837.method1593(class261.field3359.method623(9, 82) ? 1 : 0, -113);
                class94.method586(var20.field2480[0], arg0 + 1, var20.field2482[0], -2, class143.field1684.field2480[0], var20.method841(true), var20.method841(true), 0, true, class143.field1684.field2482[0], 0);
            }
        }
        if (var4 == 25) {
            class131 var21 = class212.field2584[var5];
            if (var21 != null) {
                class338.field4611 = var8;
                class432.field5904 = 2;
                class215.field2654 = var9;
                class414.field5685++;
                client.field6058 = 0;
                class427.field5837.method2162(false, 58);
                class427.field5837.method1593(class261.field3359.method623(arg0 ^ 0x9, 82) ? 1 : 0, -103);
                class427.field5837.method1592(var5, (byte) 103);
                class94.method586(var21.field2480[0], 1, var21.field2482[0], -2, class143.field1684.field2480[0], var21.method841(true), var21.method841(true), 0, true, class143.field1684.field2482[0], 0);
            }
        }
        if (var4 == 1002) {
            class215.field2654 = var9;
            client.field6058 = 0;
            class432.field5904 = 2;
            class321.field4309++;
            class338.field4611 = var8;
            class427.field5837.method2162(false, 75);
            class427.field5837.method1592(class129.field1432 + var3, (byte) -40);
            class427.field5837.method1579((byte) -40, class261.field3359.method623(9, 82) ? 1 : 0);
            class427.field5837.method1592(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) -128);
            class427.field5837.method1573(-6266, class278.field3608 + var2);
            class261.method1650(var6, var2, (byte) -26, var3);
        }
        if (var4 == 20) {
            class131 var22 = class212.field2584[var5];
            if (var22 != null) {
                class432.field5904 = 2;
                class338.field4611 = var8;
                client.field6058 = 0;
                class277.field3588++;
                class215.field2654 = var9;
                class427.field5837.method2162(false, 29);
                class427.field5837.method1588(var5, -9);
                class427.field5837.method1555(true, class261.field3359.method623(9, 82) ? 1 : 0);
                class94.method586(var22.field2480[0], 1, var22.field2482[0], -2, class143.field1684.field2480[0], var22.method841(true), var22.method841(true), 0, true, class143.field1684.field2482[0], 0);
            }
        }
        if (var4 == 50) {
            class131 var23 = class212.field2584[var5];
            if (var23 != null) {
                client.field6058 = 0;
                class215.field2654 = var9;
                class338.field4611 = var8;
                class432.field5904 = 2;
                class382.field5237++;
                class427.field5837.method2162(false, 50);
                class427.field5837.method1555(true, class261.field3359.method623(arg0 ^ 0x9, 82) ? 1 : 0);
                class427.field5837.method1592(var5, (byte) 103);
                class94.method586(var23.field2480[0], 1, var23.field2482[0], -2, class143.field1684.field2480[0], var23.method841(true), var23.method841(true), 0, true, class143.field1684.field2482[0], 0);
            }
        }
        if (var4 == 46) {
            client.field6058 = 0;
            class432.field5904 = 2;
            class215.field2654 = var9;
            class338.field4611 = var8;
            class288.field3790++;
            class427.field5837.method2162(false, 240);
            class427.field5837.method1593(class261.field3359.method623(9, 82) ? 1 : 0, -91);
            class427.field5837.method1546(var5, arg0 - 1990920344);
            class427.field5837.method1573(arg0 - 6266, var3 - -class129.field1432);
            class427.field5837.method1546(class278.field3608 + var2, arg0 + -1990920344);
            class340.method2179(var3, var2, 0);
        }
        if (var4 == 10) {
            class453 var24 = class378.method2346(-23490, var2, var3);
            if (var24 != null) {
                class416.method2561((byte) -89);
                class357 var25 = client.method2696(var24);
                class419.method2569(var25.method2257((byte) 110), var25.field4836, var24.field6471, var24.field6326, var3, var2, 0);
                class335.field4569 = class87.method540(64, var24);
                if (class335.field4569 == null) {
                    class335.field4569 = "Null";
                }
                class381.field5204 = var24.field6366 + "<col=ffffff>";
            }
            return;
        }
        if (var4 == 1001) {
            class215.field2654 = var9;
            class432.field5904 = 2;
            client.field6058 = 0;
            class338.field4611 = var8;
            class298 var26 = class220.field2726[var5];
            if (var26 != null) {
                class307 var27 = var26.field3971;
                if (var27.field4113 != null) {
                    var27 = var27.method1946((byte) -128);
                }
                if (var27 != null) {
                    class427.field5837.method2162(false, 80);
                    class67.field800++;
                    class427.field5837.method1546(var27.field4110, -1990920344);
                }
            }
        }
        if (var4 == 30) {
            class131 var28 = class212.field2584[var5];
            if (var28 != null) {
                class368.field5020++;
                class215.field2654 = var9;
                class338.field4611 = var8;
                class432.field5904 = 2;
                client.field6058 = 0;
                class427.field5837.method2162(false, 35);
                class427.field5837.method1555(true, class261.field3359.method623(9, 82) ? 1 : 0);
                class427.field5837.method1558((byte) 32, class357.field4844);
                class427.field5837.method1573(-6266, class62.field759);
                class427.field5837.method1546(var5, arg0 - 1990920344);
                class94.method586(var28.field2480[0], 1, var28.field2482[0], -2, class143.field1684.field2480[0], var28.method841(true), var28.method841(true), 0, true, class143.field1684.field2482[0], 0);
            }
        }
        if (var4 == 22) {
            class298 var29 = class220.field2726[var5];
            if (var29 != null) {
                client.field6058 = 0;
                class215.field2654 = var9;
                class432.field5904 = 2;
                class130.field1449++;
                class338.field4611 = var8;
                class427.field5837.method2162(false, 90);
                class427.field5837.method1592(var5, (byte) 91);
                class427.field5837.method1584(class261.field3359.method623(arg0 ^ 0x9, 82) ? 1 : 0, arg0 ^ 0xFF);
                class94.method586(var29.field2480[0], 1, var29.field2482[0], -2, class143.field1684.field2480[0], var29.method841(true), var29.method841(true), 0, true, class143.field1684.field2482[0], 0);
            }
        }
        if (var4 == 1009) {
            class432.field5904 = 2;
            class338.field4611 = var8;
            class215.field2654 = var9;
            client.field6058 = 0;
            class399.field5423++;
            class427.field5837.method2162(false, 179);
            class427.field5837.method1592(var5, (byte) 94);
        }
        if (class104.field1224) {
            class416.method2561((byte) -74);
        }
        if (class27.field306 != null && class308.field4181 == 0) {
            class303.method1923(class27.field306, arg0 + 10240);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V")
    public final void method453(int arg0) {
        field933++;
        int var2 = -20 % ((-arg0 - 20) / 44);
        if (this.field927 != null) {
            for (int var3 = 0; var3 < this.field927.length; var3++) {
                this.field927[var3].method1192();
            }
        }
        this.field923 = null;
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)V")
    public static void method454(int arg0) {
        field939 = null;
        field926 = null;
        if (arg0 == 0) {
            field942 = null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILjava/lang/String;B)V")
    public static final void method455(int arg0, String arg1, byte arg2) {
        field919++;
        if (arg2 != -89) {
            return;
        }
        class148.field1730++;
        class427.field5837.method2162(false, 110);
        class427.field5837.method1593(class350.method2229(2, arg1) + 1, -94);
        class427.field5837.method1584(arg0, arg2 + 344);
        class427.field5837.method1562(arg2 + 205, arg1);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
    public static final void method456(byte arg0) {
        if (arg0 > -22) {
            field926 = null;
        }
        field918++;
        if (class272.field3505 < 0) {
            return;
        }
        long var1 = class164.method1038(8635);
        class272.field3505 = (int) ((long) class272.field3505 - (var1 - class52.field614));
        if (class272.field3505 <= 0) {
            class272.field3505 = -1;
            class138.field1577 = class307.field4109.field4664;
            class444.field6133 = class307.field4109.field4663;
            class156.field1826 = class307.field4109.field4662;
            class439.field6035 = class307.field4109.field4652;
            class115.field1329 = class307.field4109.field4654;
            class204.field2434 = class307.field4109.field4661;
            class49.field575 = class307.field4109.field4660;
            class277.field3590 = class307.field4109.field4667;
            class437.field5977 = class307.field4109.field4659;
            class139.field1594 = class307.field4109.field4658;
        } else {
            int var3 = (class272.field3505 << 8) / class218.field2692;
            int var4 = 255 - var3;
            float var5 = (float) var3 / 255.0F;
            class437.field5977 = ((class214.field2641 & 0xFF00) * var3 + (class307.field4109.field4659 & 0xFF00) * var4 & 0xFF0000) + ((class214.field2641 & 0xFF00FF) * var3 + (class307.field4109.field4659 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
            float var6 = 1.0F - var5;
            class156.field1826 = (class307.field4109.field4662 - class447.field6262) * var6 + class447.field6262;
            class277.field3590 = (class307.field4109.field4667 - class269.field3474) * var6 + class269.field3474;
            class204.field2434 = ((class209.field2543 & 0xFF00FF) * var3 + ((class307.field4109.field4661 & 0xFF00FF) * var4) & 0xFF00FF00) + ((class209.field2543 & 0xFF00) * var3 + (class307.field4109.field4661 & 0xFF00) * var4 & 0xFF0000) >>> 8;
            class115.field1329 = (class307.field4109.field4654 - class279.field3616) * var6 + class279.field3616;
            class444.field6133 = (class307.field4109.field4663 - class347.field4705) * var6 + class347.field4705;
            class49.field575 = (class307.field4109.field4660 - class137.field1563) * var6 + class137.field1563;
            class439.field6035 = class143.field1685 * var3 + class307.field4109.field4652 * var4 >> 8;
            class139.field1594 = (class307.field4109.field4658 - class139.field1609) * var6 + class139.field1609;
            if (class263.field3380 != class307.field4109.field4664) {
                class138.field1577 = class276.field3581.method687(class263.field3380, class307.field4109.field4664, var6, class138.field1577);
            }
        }
        class52.field614 = var1;
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(I[Lcs;IIII)V")
    public class76(int arg0, class193[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field927 = arg1;
        this.field940 = arg0;
        this.field932 = arg5;
        this.field924 = arg4;
        this.field929 = arg3;
        if (arg1 == null) {
            this.field921 = null;
            this.field930 = null;
        } else {
            this.field930 = new class193[arg1.length];
            this.field921 = arg2 < 0 ? null : arg1[arg2];
        }
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(B)V")
    public static final void method457(byte arg0) {
        field934++;
        class183.field2122.method2298(arg0 ^ 0xFFFFFFFB);
        if (arg0 != -5) {
            method451(false);
        }
    }

    static {
        new class72("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
    }
}
