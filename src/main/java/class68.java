import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class68 implements class279 {

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "Lbt;")
    private class33 field882 = new class33(256);

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "Lul;")
    private class406 field874;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "Lul;")
    private class406 field872;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "[Loh;")
    private class281[] field879;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field877 = 0;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "J")
    public static long field880 = 0L;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "S")
    public static short field887 = 320;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "Lie;")
    public static class6 field873;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "[Ll;")
    public static class16[] field871;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZ)Z")
    public final boolean method579(int arg0, boolean arg1) {
        if (!arg1) {
            this.field874 = null;
        }
        field876++;
        class237 var3 = this.method585(arg0, (byte) 8);
        return var3 != null && var3.method1640(this.field874, -77, this);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BIII)V")
    public static final void method580(byte arg0, int arg1, int arg2, int arg3) {
        field886++;
        if (client.field3311 == null) {
            return;
        }
        long var4 = (long) (arg2 << 28 | arg1 << 14 | arg3);
        class433 var6 = (class433) class334.field4985.method2585((byte) 114, var4);
        if (var6 == null) {
            class314.method2012(arg2, arg3, arg1);
            return;
        }
        if (arg0 > -26) {
            method580((byte) -97, 85, -3, 4);
        }
        class495 var7 = (class495) var6.field6407.method1004((byte) -68);
        if (var7 == null) {
            class314.method2012(arg2, arg3, arg1);
            return;
        }
        class283 var8 = (class283) class314.method2012(arg2, arg3, arg1);
        if (var8 == null) {
            var8 = new class283();
        } else {
            var8.field4311 = var8.field4299 = -1;
        }
        var8.field4304 = var7.field7134;
        var8.field4309 = var7.field7137;
        label48: while (true) {
            class495 var9 = (class495) var6.field6407.method996(1);
            if (var9 == null) {
                break;
            }
            if (var8.field4304 != var9.field7134) {
                var8.field4303 = var9.field7137;
                var8.field4311 = var9.field7134;
                while (true) {
                    class495 var10 = (class495) var6.field6407.method996(1);
                    if (var10 == null) {
                        break label48;
                    }
                    if (var8.field4304 != var10.field7134 && var8.field4311 != var10.field7134) {
                        var8.field4308 = var10.field7137;
                        var8.field4299 = var10.field7134;
                    }
                }
            }
        }
        int var11 = class172.method1153(arg2, -4, (arg3 << 7) + 64, (arg1 << 7) + 64);
        class198.method1372(arg2, arg3, arg1, var11, var8);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZIIIF)[I")
    public final int[] method581(int arg0, boolean arg1, int arg2, int arg3, int arg4, float arg5) {
        int var7 = -82 % ((arg3 - 47) / 47);
        field884++;
        return this.method585(arg0, (byte) 8).method1642((double) arg5, arg4, this, this.field874, -41, this.field879[arg0].field4275, arg2);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZFIII)[F")
    public final float[] method582(int arg0, boolean arg1, float arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 10080) {
            field880 = -89L;
        }
        field883++;
        return this.method585(arg0, (byte) 8).method1645(arg3, arg4, this.field879[arg0].field4275, (byte) -51, this, this.field874);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIFBZ)[I")
    public final int[] method583(int arg0, int arg1, int arg2, float arg3, byte arg4, boolean arg5) {
        if (arg4 > -120) {
            this.field879 = null;
        }
        field875++;
        return this.method585(arg2, (byte) 8).method1641(this.field879[arg2].field4275, (double) arg3, this, -110, arg1, this.field874, arg0, arg5);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZI)Loh;")
    public final class281 method584(boolean arg0, int arg1) {
        field885++;
        return arg0 ? this.field879[arg1] : null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)Lrb;")
    private final class237 method585(int arg0, byte arg1) {
        field881++;
        class452 var3 = this.field882.method232(false, (long) arg0);
        if (var3 != null) {
            return (class237) var3;
        } else if (arg1 == 8) {
            byte[] var4 = this.field872.method2558(arg0, arg1 + 67);
            if (var4 == null) {
                return null;
            } else {
                class237 var5 = new class237(new class217(var4));
                this.field882.method231(var5, (long) arg0, -79);
                return var5;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLlq;I)Lbg;")
    public static final class327 method586(byte arg0, class389 arg1, int arg2) {
        field878++;
        if (arg0 < 84) {
            return null;
        }
        class327 var3;
        if (class169.field2492 == null) {
            var3 = new class327();
        } else {
            var3 = class169.field2492;
            class169.field2492 = class169.field2492.field4922;
            class367.field5397--;
            var3.field4922 = null;
        }
        var3.field4921 = arg1;
        var3.field4920 = arg2;
        return var3;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public static void method587(int arg0) {
        field871 = null;
        field873 = null;
        if (arg0 != 1) {
            field873 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lul;Lul;Lul;)V")
    public class68(class406 arg0, class406 arg1, class406 arg2) {
        this.field874 = arg2;
        this.field872 = arg1;
        class217 var4 = new class217(arg0.method2536(0, 0, 0));
        int var5 = var4.method1511(83);
        this.field879 = new class281[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1515((byte) 127) == 1) {
                this.field879[var6] = new class281();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field879[var7] != null) {
                this.field879[var7].field4259 = var4.method1515((byte) 122) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field879[var8] != null) {
                this.field879[var8].field4274 = var4.method1515((byte) 126) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field879[var9] != null) {
                this.field879[var9].field4257 = var4.method1515((byte) 127) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field879[var10] != null) {
                this.field879[var10].field4256 = var4.method1515((byte) 124) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field879[var11] != null) {
                this.field879[var11].field4271 = var4.method1565(true);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field879[var12] != null) {
                this.field879[var12].field4273 = var4.method1565(true);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field879[var13] != null) {
                this.field879[var13].field4261 = var4.method1565(true);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field879[var14] != null) {
                this.field879[var14].field4258 = var4.method1565(true);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field879[var15] != null) {
                this.field879[var15].field4263 = (short) var4.method1511(80);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field879[var16] != null) {
                this.field879[var16].field4269 = var4.method1565(true);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field879[var17] != null) {
                this.field879[var17].field4276 = var4.method1565(true);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field879[var18] != null) {
                this.field879[var18].field4272 = var4.method1515((byte) 126) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field879[var19] != null) {
                this.field879[var19].field4275 = var4.method1515((byte) 123) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field879[var20] != null) {
                this.field879[var20].field4265 = var4.method1565(true);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field879[var21] != null) {
                this.field879[var21].field4267 = var4.method1515((byte) 126) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field879[var22] != null) {
                this.field879[var22].field4260 = var4.method1515((byte) 127) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field879[var23] != null) {
                this.field879[var23].field4262 = var4.method1515((byte) 124) == 1;
            }
        }
        for (int var24 = 0; var24 < var5; var24++) {
            if (this.field879[var24] != null) {
                this.field879[var24].field4266 = var4.method1515((byte) 123);
            }
        }
        for (int var25 = 0; var25 < var5; var25++) {
            if (this.field879[var25] != null) {
                this.field879[var25].field4264 = var4.method1556(113);
            }
        }
    }
}
