import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class168 implements class64 {

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "Ltd;")
    private class225 field2408 = new class225(256);

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "Lnh;")
    private class305 field2406;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "Lnh;")
    private class305 field2404;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "[Lwa;")
    private class294[] field2399;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static volatile int field2400 = 0;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field2405 = -2;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(II)Lmk;")
    public class227 method566(int arg0, int arg1) {
        int var3 = 79 % ((-arg1 - 29) / 63);
        class128 var4 = this.field2408.method1486((long) arg0, -19212);
        field2398++;
        if (var4 != null) {
            return (class227) var4;
        }
        byte[] var5 = this.field2406.method2059(0, arg0);
        if (var5 == null) {
            return null;
        } else {
            class227 var6 = new class227(new class215(var5));
            this.field2408.method1489((long) arg0, 119, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IFBZII)[I")
    public final int[] method397(int arg0, float arg1, byte arg2, boolean arg3, int arg4, int arg5) {
        field2397++;
        if (arg2 >= -117) {
            this.method566(-43, 31);
        }
        return this.method566(arg0, -125).method1504((double) arg1, this.field2399[arg0].field4682, arg4, 100, this, arg5, arg3, this.field2404);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1076(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg6 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg4;
            arg4 = var7;
        }
        if (arg2 != -25908) {
            method1076(113, -72, 5, 38, -81, -67, -82);
        }
        int var8 = arg3 & 0x3;
        field2402++;
        if (var8 == 0) {
            return arg0;
        } else if (var8 == 1) {
            return -arg5 - (arg1 - 8);
        } else if (var8 == 2) {
            return 1 - (arg4 - 7) - arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)Z")
    public final boolean method396(int arg0, int arg1) {
        field2403++;
        class227 var3 = this.method566(arg1, -97);
        if (arg0 >= -47) {
            this.field2406 = null;
        }
        return var3 != null && var3.method1501(-1, this.field2404, this);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)Lwa;")
    public final class294 method395(int arg0, int arg1) {
        if (arg1 == -18098) {
            field2407++;
            return this.field2399[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lnh;Lnh;Lnh;)V")
    public class168(class305 arg0, class305 arg1, class305 arg2) {
        this.field2406 = arg1;
        this.field2404 = arg2;
        class215 var4 = new class215(arg0.method2050(76, 0, 0));
        int var5 = var4.method1379(-93);
        this.field2399 = new class294[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1374((byte) -60) == 1) {
                this.field2399[var6] = new class294();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field2399[var7] != null) {
                this.field2399[var7].field4696 = var4.method1374((byte) -60) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field2399[var8] != null) {
                this.field2399[var8].field4692 = var4.method1374((byte) -60) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2399[var9] != null) {
                this.field2399[var9].field4695 = var4.method1374((byte) -60) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field2399[var10] != null) {
                var4.method1374((byte) -60);
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field2399[var11] != null) {
                var4.method1350((byte) -117);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field2399[var12] != null) {
                var4.method1350((byte) -79);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field2399[var13] != null) {
                var4.method1350((byte) -100);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field2399[var14] != null) {
                var4.method1350((byte) -91);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field2399[var15] != null) {
                this.field2399[var15].field4688 = (short) var4.method1379(-75);
            }
        }
        if (var4.field3280 < var4.field3287.length) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field2399[var16] != null) {
                    var4.method1350((byte) -81);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field2399[var17] != null) {
                    var4.method1350((byte) 113);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field2399[var18] != null) {
                    var4.method1374((byte) -60);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field2399[var19] != null) {
                    this.field2399[var19].field4682 = var4.method1374((byte) -60) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field2399[var20] != null) {
                    var4.method1350((byte) -21);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field2399[var21] != null) {
                    var4.method1374((byte) -60);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field2399[var22] != null) {
                    var4.method1374((byte) -60);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field2399[var23] != null) {
                    var4.method1374((byte) -60);
                }
            }
        }
    }
}
