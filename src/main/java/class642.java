import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class642 {

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "Lqc;")
    private class325 field9323 = new class325(16);

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "Ldda;")
    private class597 field9321;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field9328 = new String[100];

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "F")
    public static float field9319;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field9317;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field9318;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field9320;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field9322;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field9325;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field9326;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public static int field9329;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "[S")
    public static short[] field9327;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "[[B")
    public static byte[][] field9324;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IB)V", line = 4)
    public final void method3714(int arg0, byte arg1) {
        field9325++;
        class325 var3 = this.field9323;
        synchronized (this.field9323) {
            if (arg1 != 41) {
                this.method3714(106, (byte) 14);
            }
            this.field9323.method2028(arg0, true);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 18)
    public static void method3715(int arg0) {
        field9324 = null;
        field9327 = null;
        if (arg0 != 16) {
            field9324 = null;
        }
        field9328 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I", line = 31)
    public static final int method3716(int arg0, String arg1, String arg2, int arg3) {
        field9326++;
        int var4 = arg1.length();
        int var5 = arg2.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > var6 - var8 || (var7 - var9) < var5) {
            if (var4 <= (var6 - var8)) {
                return -1;
            }
            if ((var7 - var9) >= var5) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg1.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg2.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class627.method3659(var22, (byte) 31);
            var9 = class627.method3659(var24, (byte) 31);
            char var26 = class327.method2043(var22, arg3, true);
            char var27 = class327.method2043(var24, arg3, true);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class369.method2249(var28, arg3, 122) - class369.method2249(var29, arg3, 103);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        if (arg0 < 84) {
            method3715(96);
        }
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg3 == 2) {
                var17 = var4 - var11 - 1;
                var16 = var5 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg1.charAt(var17);
            char var19 = arg2.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class369.method2249(var20, arg3, 109) - class369.method2249(var21, arg3, 122);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg1.charAt(var13);
            char var15 = arg2.charAt(var13);
            if (var14 != var15) {
                return class369.method2249(var14, arg3, 98) - class369.method2249(var15, arg3, 104);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V", line = 159)
    public final void method3717(int arg0) {
        class325 var2 = this.field9323;
        synchronized (this.field9323) {
            this.field9323.method2037(true);
        }
        field9329++;
        if (arg0 != 0) {
            method3716(29, null, null, 92);
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V", line = 175)
    public final void method3718(int arg0) {
        field9318++;
        if (arg0 != 30907) {
            field9319 = -0.19256356F;
        }
        class325 var2 = this.field9323;
        synchronized (this.field9323) {
            this.field9323.method2024((byte) -116);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIII)V", line = 188)
    public static final void method3719(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9317++;
        int var5 = 0;
        int var6 = arg3;
        int var7 = -arg3;
        int var8 = -1;
        int var9 = -114 % ((58 - arg4) / 60);
        int var10 = class406.method2430(class130.field1712, arg1 + arg3, class401.field5755, 64);
        int var11 = class406.method2430(class130.field1712, arg1 - arg3, class401.field5755, 64);
        class69.method418(arg2, class47.field558[arg0], var10, (byte) 117, var11);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var12 = arg0 - var6;
                int var13 = arg0 + var6;
                if (var13 >= class483.field7334 && class202.field3021 >= var12) {
                    int var14 = class406.method2430(class130.field1712, arg1 + var5, class401.field5755, 64);
                    int var15 = class406.method2430(class130.field1712, arg1 - var5, class401.field5755, 64);
                    if (class202.field3021 >= var13) {
                        class69.method418(arg2, class47.field558[var13], var14, (byte) 117, var15);
                    }
                    if (var12 >= class483.field7334) {
                        class69.method418(arg2, class47.field558[var12], var14, (byte) 117, var15);
                    }
                }
            }
            var5++;
            int var16 = arg0 - var5;
            int var17 = arg0 + var5;
            if (class483.field7334 <= var17 && var16 <= class202.field3021) {
                int var18 = class406.method2430(class130.field1712, arg1 + var6, class401.field5755, 64);
                int var19 = class406.method2430(class130.field1712, arg1 - var6, class401.field5755, 64);
                if (var17 <= class202.field3021) {
                    class69.method418(arg2, class47.field558[var17], var18, (byte) 117, var19);
                }
                if (class483.field7334 <= var16) {
                    class69.method418(arg2, class47.field558[var16], var18, (byte) 117, var19);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Loda;ILdda;)V", line = 273)
    public class642(class559 arg0, int arg1, class597 arg2) {
        this.field9321 = arg2;
        this.field9321.method3462(30, 30);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZI)Ltj;", line = 288)
    public final class31 method3720(boolean arg0, int arg1) {
        field9322++;
        class325 var3 = this.field9323;
        class31 var4;
        synchronized (this.field9323) {
            var4 = (class31) this.field9323.method2025((long) arg1, 2);
        }
        if (var4 != null) {
            return var4;
        }
        class597 var5 = this.field9321;
        byte[] var6;
        synchronized (this.field9321) {
            var6 = this.field9321.method3486((byte) -109, arg1, 30);
        }
        if (arg0) {
            field9328 = null;
        }
        class31 var7 = new class31();
        if (var6 != null) {
            var7.method138((byte) -14, new class428(var6));
        }
        class325 var8 = this.field9323;
        synchronized (this.field9323) {
            this.field9323.method2029(arg0, var7, (long) arg1);
            return var7;
        }
    }
}
