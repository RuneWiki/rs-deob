import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class173 {

    @OriginalMember(owner = "client!el", name = "f", descriptor = "Lwg;")
    private class58 field2241 = new class58(16);

    @OriginalMember(owner = "client!el", name = "j", descriptor = "Lkr;")
    private class329 field2245;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "Z")
    public static boolean field2242 = false;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "Lha;")
    public static class116 field2243;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "Lvv;")
    public static class640 field2238;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I[[BLjda;)V")
    public static final void method1060(int arg0, byte[][] arg1, class277 arg2) {
        field2244++;
        int var3 = class443.field6126.length;
        if (arg0 != 880863144) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                int var6 = (class258.field3206[var4] >> 8) * 64 - class525.field7310;
                int var7 = (class258.field3206[var4] & 0xFF) * 64 - class58.field786;
                class147.method802((byte) 49);
                arg2.method1713(var7, var6, (byte) -68, var5, class301.field3918, class15.field154);
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)Lhaa;")
    public final class77 method1061(int arg0, int arg1) {
        field2237++;
        class58 var3 = this.field2241;
        class77 var4;
        synchronized (this.field2241) {
            var4 = (class77) this.field2241.method323((long) arg1, -19814);
        }
        if (var4 != null) {
            return var4;
        }
        class329 var5 = this.field2245;
        byte[] var6;
        synchronized (this.field2245) {
            var6 = this.field2245.method2054(true, arg0, arg1);
        }
        class77 var7 = new class77();
        if (var6 != null) {
            var7.method441(new class551(var6), (byte) 126);
        }
        class58 var8 = this.field2241;
        synchronized (this.field2241) {
            this.field2241.method316((long) arg1, (byte) -118, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIII[B)Z")
    public static final boolean method1062(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field2247++;
        boolean var6 = true;
        if (arg1 != 0) {
            field2242 = true;
        }
        class551 var7 = new class551(arg5);
        int var8 = -1;
        label72: while (true) {
            int var9 = var7.method3036(-122);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                int var15;
                class137 var18;
                do {
                    int var16;
                    int var17;
                    do {
                        do {
                            do {
                                do {
                                    while (var11) {
                                        int var19 = var7.method3059(125);
                                        if (var19 == 0) {
                                            continue label72;
                                        }
                                        var7.method3045(-128);
                                    }
                                    int var12 = var7.method3059(arg1 ^ 0x1C);
                                    if (var12 == 0) {
                                        continue label72;
                                    }
                                    var10 += var12 - 1;
                                    int var13 = var10 & 0x3F;
                                    int var14 = (var10 & 0xFCE) >> 6;
                                    var15 = var7.method3045(-126) >> 2;
                                    var16 = arg2 + var14;
                                    var17 = arg3 + var13;
                                } while (var16 <= 0);
                            } while (var17 <= 0);
                        } while ((arg0 - 1) <= var16);
                    } while ((arg4 - 1) <= var17);
                    var18 = class626.field9084.method1093(0, var8);
                } while (var15 == 22 && !class501.field6954.field7843 && var18.field1749 == 0 && var18.field1709 != 1 && !var18.field1750);
                var11 = true;
                if (!var18.method730(arg1 + 98)) {
                    var6 = false;
                    class235.field3005++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V")
    public static final void method1063(boolean arg0) {
        class58 var1 = class255.field3171;
        synchronized (class255.field3171) {
            class255.field3171.method315(1);
            if (arg0) {
                field2242 = true;
            }
        }
        field2236++;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V")
    public static void method1064(byte arg0) {
        field2238 = null;
        int var1 = 65 / ((arg0 - 69) / 48);
        field2243 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BI)V")
    public final void method1065(byte arg0, int arg1) {
        if (arg0 >= -10) {
            method1063(false);
        }
        field2240++;
        class58 var3 = this.field2241;
        synchronized (this.field2241) {
            this.field2241.method320(arg1, -306674912);
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(B)V")
    public final void method1066(byte arg0) {
        if (arg0 != -52) {
            field2238 = null;
        }
        class58 var2 = this.field2241;
        synchronized (this.field2241) {
            this.field2241.method315(1);
        }
        field2239++;
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(B)V")
    public final void method1067(byte arg0) {
        class58 var2 = this.field2241;
        synchronized (this.field2241) {
            if (arg0 >= -36) {
                field2242 = true;
            }
            this.field2241.method317((byte) 21);
        }
        field2246++;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lg;ILkr;)V")
    public class173(class513 arg0, int arg1, class329 arg2) {
        this.field2245 = arg2;
        this.field2245.method2064(0, 30);
    }
}
