import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class164 {

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    private int field2933 = 65000;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "Ldj;")
    private class289 field2951 = null;

    @OriginalMember(owner = "client!ka", name = "y", descriptor = "Ldj;")
    private class289 field2956 = null;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    private int field2936;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field2935 = 1;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "Llc;")
    public static class143 field2941 = class66.method374("0(U", -1);

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "Llc;")
    private static class143 field2943 = class66.method374("Loaded title screen", -1);

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "Llc;")
    public static class143 field2942 = class66.method374("Connect-B au serveur de mise -9 jour", -1);

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "Llc;")
    public static class143 field2938 = field2943;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field2939 = 0;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "Llc;")
    public static class143 field2948 = class66.method374(": ", -1);

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "Llc;")
    public static class143 field2954 = class66.method374("Hidden)2use", -1);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2940;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "[Lu;")
    public static class223[] field2944;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)[B")
    public final byte[] method1076(int arg0, int arg1) {
        field2946++;
        class289 var3 = this.field2956;
        synchronized (this.field2956) {
            try {
                if (this.field2951.method1935(-12158) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                int var5 = 115 % ((22 - arg0) / 56);
                this.field2951.method1924(true, (long) (arg1 * 6));
                this.field2951.method1925(6, class53.field1026, 0, (byte) -69);
                int var6 = (class53.field1026[0] & 0xFF << 16) + ((class53.field1026[1] & 0xFF) << 8) + (class53.field1026[2] & 0xFF);
                int var7 = (class53.field1026[3] & 0xFF << 16) + (class53.field1026[4] & 0xFF << 8) + (class53.field1026[5] & 0xFF);
                if (var6 < 0 || this.field2933 < var6) {
                    return null;
                } else if (var7 > 0 && (this.field2956.method1935(-12158) / 520L) >= ((long) var7)) {
                    int var10 = 0;
                    byte[] var11 = new byte[var6];
                    int var12 = 0;
                    while (var10 < var6) {
                        if (var7 == 0) {
                            return null;
                        }
                        this.field2956.method1924(true, (long) (var7 * 520));
                        int var14 = var6 - var10;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field2956.method1925(var14 + 8, class53.field1026, 0, (byte) -75);
                        int var15 = ((class53.field1026[5] & 0xFF) << 8) + (class53.field1026[4] & 0xFF << 16) + (class53.field1026[6] & 0xFF);
                        int var16 = ((class53.field1026[0] & 0xFF) << 8) + (class53.field1026[1] & 0xFF);
                        int var17 = (class53.field1026[2] & 0xFF << 8) + (class53.field1026[3] & 0xFF);
                        int var18 = class53.field1026[7] & 0xFF;
                        if (arg1 == var16 && var12 == var17 && this.field2936 == var18) {
                            if (var15 >= 0 && ((long) var15) <= (this.field2956.method1935(-12158) / 520L)) {
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var11[var10++] = class53.field1026[var21 + 8];
                                }
                                var12++;
                                var7 = var15;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var11;
                } else {
                    return null;
                }
            } catch (IOException var40) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)V")
    public static final void method1077(int arg0, int arg1, int arg2) {
        if (arg2 != 30918) {
            method1082(26);
        }
        field2945++;
        class166 var3 = class262.method1746(-111, arg1, 7);
        var3.method1097((byte) -74);
        var3.field2978 = arg0;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)Luh;")
    public static final class242 method1078(int arg0) {
        if (arg0 != 7) {
            return null;
        }
        field2957++;
        try {
            return (class242) Class.forName("nj").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZII[B)Z")
    private final boolean method1079(int arg0, boolean arg1, int arg2, int arg3, byte[] arg4) {
        if (arg2 != 7) {
            method1085(-76, true, (class43) null, -40);
        }
        field2952++;
        class289 var6 = this.field2956;
        synchronized (this.field2956) {
            try {
                int var8;
                if (arg1) {
                    if ((long) (arg0 * 6 + 6) > this.field2951.method1935(-12158)) {
                        return false;
                    }
                    this.field2951.method1924(true, (long) (arg0 * 6));
                    this.field2951.method1925(6, class53.field1026, 0, (byte) -87);
                    var8 = (class53.field1026[4] & 0xFF << 8) + (class53.field1026[3] & 0xFF << 16) + (class53.field1026[5] & 0xFF);
                    if (var8 <= 0 || this.field2956.method1935(-12158) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field2956.method1935(arg2 ^ 0xFFFFD085) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class53.field1026[0] = (byte) (arg3 >> 16);
                class53.field1026[2] = (byte) arg3;
                class53.field1026[1] = (byte) (arg3 >> 8);
                class53.field1026[4] = (byte) (var8 >> 8);
                class53.field1026[3] = (byte) (var8 >> 16);
                int var10 = 0;
                class53.field1026[5] = (byte) var8;
                int var11 = 0;
                this.field2951.method1924(true, (long) (arg0 * 6));
                this.field2951.method1934(arg2 ^ 0xFFFFFFF8, 6, 0, class53.field1026);
                while (arg3 > var10) {
                    int var12 = 0;
                    if (arg1) {
                        label109: {
                            this.field2956.method1924(true, (long) (var8 * 520));
                            try {
                                this.field2956.method1925(8, class53.field1026, 0, (byte) -126);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = ((class53.field1026[4] & 0xFF) << 16) + (class53.field1026[5] & 0xFF << 8) + (class53.field1026[6] & 0xFF);
                            int var13 = ((class53.field1026[2] & 0xFF) << 8) + (class53.field1026[3] & 0xFF);
                            int var14 = class53.field1026[7] & 0xFF;
                            int var15 = ((class53.field1026[0] & 0xFF) << 8) + (class53.field1026[1] & 0xFF);
                            if (arg0 == var15 && var11 == var13 && this.field2936 == var14) {
                                if (var12 >= 0 && ((long) var12) <= (this.field2956.method1935(-12158) / 520L)) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg1 = false;
                        var12 = (int) ((this.field2956.method1935(-12158) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class53.field1026[3] = (byte) var11;
                    if ((arg3 - var10) <= 512) {
                        var12 = 0;
                    }
                    class53.field1026[1] = (byte) arg0;
                    class53.field1026[6] = (byte) var12;
                    class53.field1026[5] = (byte) (var12 >> 8);
                    int var18 = arg3 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class53.field1026[2] = (byte) (var11 >> 8);
                    class53.field1026[4] = (byte) (var12 >> 16);
                    var11++;
                    class53.field1026[0] = (byte) (arg0 >> 8);
                    class53.field1026[7] = (byte) this.field2936;
                    this.field2956.method1924(true, (long) (var8 * 520));
                    var8 = var12;
                    this.field2956.method1934(-1, 8, 0, class53.field1026);
                    this.field2956.method1934(arg2 ^ 0xFFFFFFF8, var18, var10, arg4);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lh;B)V")
    public static final void method1080(class190 arg0, byte arg1) {
        field2949++;
        byte[] var2 = new byte[24];
        if (class29.field460 != null) {
            try {
                int var3 = 0;
                class29.field460.method1924(true, 0L);
                class29.field460.method1926(var2, (byte) -101);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method1264(var2, 0, 24, 51314336);
        if (arg1 != -78) {
            field2943 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)Lld;")
    public static final class104 method1081(int arg0, int arg1) {
        field2953++;
        if (arg1 != -21331) {
            method1082(-81);
        }
        class104 var2 = (class104) class287.field5030.method826((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class188.field3399.method41(arg1 + 3003, class226.method1549(-21387, arg0), class39.method255(arg0, (byte) -93));
        class104 var4 = new class104();
        if (var3 != null) {
            var4.method625(new class190(var3), true);
        }
        var4.method627((byte) 28);
        class287.field5030.method827(-3, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
    public static void method1082(int arg0) {
        field2942 = null;
        if (arg0 != 6) {
            return;
        }
        field2944 = null;
        field2948 = null;
        field2941 = null;
        field2954 = null;
        field2943 = null;
        field2940 = null;
        field2938 = null;
    }

    @OriginalMember(owner = "client!ka", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2955++;
        return "Cache:" + this.field2936;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZLei;)V")
    public static final void method1083(boolean arg0, class169 arg1) {
        field2932++;
        class246.field4421 = arg1;
        if (!arg0) {
            method1080((class190) null, (byte) 108);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBI[B)Z")
    public final boolean method1084(int arg0, byte arg1, int arg2, byte[] arg3) {
        field2950++;
        class289 var5 = this.field2956;
        synchronized (this.field2956) {
            if (arg2 < 0 || arg2 > this.field2933) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1079(arg0, true, 7, arg2, arg3);
            if (!var6) {
                var6 = this.method1079(arg0, false, 7, arg2, arg3);
            }
            if (arg1 < 41) {
                method1082(-20);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZLvh;I)V")
    public static final void method1085(int arg0, boolean arg1, class43 arg2, int arg3) {
        field2937++;
        if (class50.field996 != null || class139.field2415 || !arg1 || arg2 == null || class34.method225(arg2, 112) == null) {
            return;
        }
        class50.field996 = arg2;
        class129.field2278 = class34.method225(arg2, 124);
        class39.field672 = false;
        class185.field3369 = arg0;
        class10.field212 = arg3;
        class146.field2632 = 0;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZB)V")
    public static final void method1086(boolean arg0, byte arg1) {
        class118.field2099 = null;
        class35.field612 = null;
        class67.field1270 = null;
        class39.field678 = null;
        class234.field4271 = null;
        field2947++;
        class20.field327 = null;
        class10.field201 = null;
        class154.field2779 = 0;
        if (arg0 && class135.field2364 != null) {
            class154.field2781 = class135.field2364.field1453;
        } else {
            class154.field2781 = null;
        }
        class12.field236 = null;
        class227.field4101 = null;
        if (arg1 != 82) {
            field2935 = -86;
        }
        class123.field2155 = null;
        class135.field2364 = null;
        class176.field3166.method1293(false);
        class118.field2096 = null;
        class231.field4230 = null;
        class245.field4395 = null;
        class289.field5067 = null;
        class143.field2563 = null;
        class90.field1628 = null;
        class248.field4450 = null;
        class268.field4803 = null;
        class31.field506 = null;
        class135.field2377 = null;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(ILdj;Ldj;I)V")
    public class164(int arg0, class289 arg1, class289 arg2, int arg3) {
        this.field2933 = arg3;
        this.field2936 = arg0;
        this.field2951 = arg2;
        this.field2956 = arg1;
    }
}
