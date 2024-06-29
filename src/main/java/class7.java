import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class7 extends class270 {

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "Lmh;")
    public static class62 field69 = class201.method1405(true, "logo");

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "[[[Lud;")
    public static class52[][][] field72 = new class52[4][104][104];

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "Lmh;")
    public static class62 field75 = class201.method1405(true, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "I")
    public static int field68 = 0;

    @OriginalMember(owner = "client!dc", name = "ib", descriptor = "[Lmh;")
    public static class62[] field84 = new class62[100];

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "Lmh;")
    public static class62 field70 = class201.method1405(true, "mapdots");

    @OriginalMember(owner = "client!dc", name = "ab", descriptor = "[Lsc;")
    public static class164[] field76 = new class164[100];

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "I")
    private int field71;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!dc", name = "bb", descriptor = "I")
    private int field77;

    @OriginalMember(owner = "client!dc", name = "cb", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!dc", name = "db", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!dc", name = "eb", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!dc", name = "fb", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!dc", name = "gb", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!dc", name = "hb", descriptor = "I")
    private int field83;

    @OriginalMember(owner = "client!dc", name = "jb", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B[B)[B", line = 7)
    public static final byte[] method29(byte arg0, byte[] arg1) {
        field73++;
        if (arg0 != 27) {
            return (byte[]) null;
        } else if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class231.method1635(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIII)Z", line = 23)
    public static final boolean method30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class183.field2926[arg0][var8][var9] == -class187.field2992) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class37.field569[arg0][arg1][arg3] + arg5;
            if (!class201.method1411(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class201.method1411(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class201.method1411(var10, var12, var14)) {
                return false;
            } else if (class201.method1411(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class62.method416(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class201.method1411(var6 + 1, class37.field569[arg0][arg1][arg3] + arg5, var7 + 1) && class201.method1411(var6 + 128 - 1, class37.field569[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class201.method1411(var6 + 128 - 1, class37.field569[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class201.method1411(var6 + 1, class37.field569[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(I)V", line = 88)
    private class7(int arg0) {
        super(0, false);
        this.method32(arg0, true);
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V", line = 96)
    public class7() {
        this(0);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lmi;II)V", line = 109)
    public final void method8(class92 arg0, int arg1, int arg2) {
        field74++;
        if (arg1 == 0) {
            this.method32(arg0.method737(-1), true);
        }
        int var5 = -101 % ((arg2 + 8) / 53);
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V", line = 138)
    public static final void method31(int arg0) {
        while (true) {
            if (class75.field1223.method1692(false, class60.field874) >= 11) {
                int var1 = class75.field1223.method1687(11, (byte) 26);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class5.field50[var1] == null) {
                        class5.field50[var1] = new class153();
                        if (class181.field2868[var1] != null) {
                            class5.field50[var1].method1104(class181.field2868[var1], 65535);
                        }
                        var2 = true;
                    }
                    class98.field1617[class118.field1975++] = var1;
                    class153 var3 = class5.field50[var1];
                    var3.field3854 = class199.field3367;
                    int var4 = class75.field1223.method1687(1, (byte) 26);
                    if (var4 == 1) {
                        class21.field224[class294.field5010++] = var1;
                    }
                    int var5 = class71.field1088[class75.field1223.method1687(3, (byte) 26)];
                    if (var2) {
                        var3.field3862 = var3.field3856 = var5;
                    }
                    int var6 = class75.field1223.method1687(1, (byte) 26);
                    int var7 = class75.field1223.method1687(5, (byte) 26);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = class75.field1223.method1687(5, (byte) 26);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.method1096(class268.field4551.field3846[0] + var7, class268.field4551.field3828[0] + var8, var6 == 1, (byte) -127);
                    continue;
                }
            }
            if (arg0 != -10004) {
                field84 = (class62[]) null;
            }
            field80++;
            class75.field1223.method1686((byte) -17);
            return;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ)V", line = 202)
    private final void method32(int arg0, boolean arg1) {
        if (!arg1) {
            method30(19, -89, 55, 64, 75, 48);
        }
        field81++;
        this.field83 = (arg0 & 0xFF) << 4;
        this.field77 = arg0 >> 4 & 0xFF0;
        this.field71 = (arg0 & 0xFF0000) >> 12;
    }

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "(B)V", line = 222)
    public static final void method33(byte arg0) {
        class301.field5183 = class197.field3339;
        class252.method1753(false, true);
        field82++;
        if (arg0 < 53) {
            field75 = (class62) null;
        }
        class235.method1654(true);
        class309.method2105(class301.field5183, true);
        class268.field4551 = new class153();
        class268.field4551.field3821 = 3000;
        class268.field4551.field3814 = 3000;
        if (class21.field220 == 2) {
            class290.field4936 = class106.field1727 - 48;
            class120.field2006 = class21.field221 - 48;
            class215.field3647 = class106.field1727 * 128 + (64 - class290.field4936 * 128);
            class106.field1727 = class215.field3647 >> 7;
            class258.field4351 = class21.field221 * 128 + 64 - (class120.field2006 * 128);
            class21.field221 = class258.field4351 >> 7;
        } else {
            class298.method2013(true);
        }
        class246.method1717(-107);
        class286.method1958(0);
        class276.method1889(-128, 28);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)[[I", line = 271)
    public final int[][] method11(boolean arg0, int arg1) {
        if (arg0) {
            this.method8((class92) null, 25, 104);
        }
        field79++;
        int[][] var3 = this.field4589.method605(arg1, 19195);
        if (this.field4589.field1320) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            for (int var7 = 0; var7 < class109.field1770; var7++) {
                var4[var7] = this.field71;
                var6[var7] = this.field77;
                var5[var7] = this.field83;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(JI)V", line = 315)
    public static final void method34(long arg0, int arg1) {
        class170.field2772.field1476 = 0;
        class170.field2772.method717(1, 66);
        field78++;
        class170.field2772.method694(arg0, (byte) -34);
        class265.field4466 = 1;
        if (arg1 != 15222) {
            method30(-66, 59, 46, 86, -66, -96);
        }
        class243.field4131 = -3;
        class176.field2817 = 0;
        class80.field1340 = 0;
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V", line = 332)
    public static void method35(int arg0) {
        field72 = (class52[][][]) null;
        if (arg0 != 1) {
            method34(65L, 44);
        }
        field69 = null;
        field76 = null;
        field75 = null;
        field84 = null;
        field70 = null;
    }
}
