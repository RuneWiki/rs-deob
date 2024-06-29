import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class168 extends class253 {

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "J")
    public long field2889;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "Ljd;")
    public static class85 field2887 = class221.method1499("::noclip", (byte) -128);

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "Lkh;")
    public static class43 field2886 = new class43();

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "Ljd;")
    public static class85 field2891 = class221.method1499("Fps:", (byte) -41);

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "Ljd;")
    public static class85 field2893 = class221.method1499("Konfig geladen)3", (byte) 107);

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "Z")
    public static volatile boolean field2894 = false;

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
    public static int field2897 = 0;

    @OriginalMember(owner = "client!uf", name = "H", descriptor = "Ljd;")
    public static class85 field2898 = class221.method1499("blaugr-Un:", (byte) -110);

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "Ljd;")
    private static class85 field2899 = class221.method1499("Loaded sprites", (byte) 113);

    @OriginalMember(owner = "client!uf", name = "L", descriptor = "I")
    public static int field2902 = 0;

    @OriginalMember(owner = "client!uf", name = "M", descriptor = "Ljd;")
    public static class85 field2903 = field2899;

    @OriginalMember(owner = "client!uf", name = "O", descriptor = "Ljd;")
    public static class85 field2905 = class221.method1499("Schlie-8en", (byte) 110);

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "Ljd;")
    private static class85 field2896 = class221.method1499("Connection lost)3", (byte) -121);

    @OriginalMember(owner = "client!uf", name = "J", descriptor = "I")
    public static int field2900 = 0;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "Ljd;")
    public static class85 field2892 = field2896;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!uf", name = "K", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!uf", name = "N", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!uf", name = "P", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "[S")
    public static short[] field2895;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "[[[Lck;")
    public static class208[][][] field2885;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[BII)Z")
    public static final boolean method1126(int arg0, byte[] arg1, int arg2, int arg3) {
        field2888++;
        boolean var4 = true;
        class247 var5 = new class247(arg1);
        int var6 = arg3;
        label56: while (true) {
            int var7 = var5.method1718(32767);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method1710(2006);
                    if (var11 == 0) {
                        continue label56;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 >> 6 & 0x3F;
                    int var13 = var8 & 0x3F;
                    int var14 = var5.method1711((byte) -67) >> 2;
                    int var15 = var12 + arg2;
                    int var16 = arg0 + var13;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class199 var17 = class110.method753(var6, (byte) 127);
                        if (var14 != 22 || class31.field475 || var17.field3443 != 0 || var17.field3416 == 1 || var17.field3451) {
                            if (!var17.method1360((byte) -111)) {
                                class261.field4611++;
                                var4 = false;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method1710(2006);
                if (var10 == 0) {
                    break;
                }
                var5.method1711((byte) -67);
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)V")
    public static final void method1127(int arg0, int arg1) {
        field2884++;
        class171 var2 = class85.method579(4, arg1 ^ arg1, arg0);
        var2.method1141(-6456);
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class168() {
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(J)V")
    public class168(long arg0) {
        this.field2889 = arg0;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lrh;I)I")
    public static final int method1128(class44 arg0, int arg1) {
        if (arg1 != -3102) {
            return 101;
        }
        int var2 = arg0.field765;
        if (arg0.field1057 == arg0.field1014) {
            var2 = arg0.field779;
        } else if (arg0.field1057 == arg0.field1054) {
            var2 = arg0.field781;
        }
        field2906++;
        return var2;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lge;Lge;IZI)Lbh;")
    public static final class7 method1129(class68 arg0, class68 arg1, int arg2, boolean arg3, int arg4) {
        field2904++;
        if (arg2 < 73) {
            method1129((class68) null, (class68) null, -63, false, -41);
        }
        boolean var5 = true;
        int[] var6 = arg0.method452(arg4, 0);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg0.method460(-15019, var6[var7], arg4);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | var8[0] & 0xFF << 8;
                byte[] var10;
                if (arg3) {
                    var10 = arg1.method460(-15019, var9, 0);
                } else {
                    var10 = arg1.method460(-15019, 0, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class7(arg0, arg1, arg4, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLjd;)I")
    public static final int method1130(byte arg0, class85 arg1) {
        field2890++;
        if (arg1.method586(true) == 0) {
            return -1;
        }
        int var2 = 0;
        if (arg0 < 0) {
            return -90;
        }
        while (class177.field3025.field3862 > var2) {
            if (class177.field3025.field3851[var2].method585(class47.field831, (byte) 10, class31.field464).method597(arg1, (byte) 30)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)V")
    public static void method1131(int arg0) {
        field2905 = null;
        field2892 = null;
        field2891 = null;
        field2903 = null;
        field2896 = null;
        field2887 = null;
        field2899 = null;
        field2885 = null;
        if (arg0 < 7) {
            method1131(-47);
        }
        field2895 = null;
        field2893 = null;
        field2886 = null;
        field2898 = null;
    }
}
