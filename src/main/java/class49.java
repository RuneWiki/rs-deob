import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class49 {

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "Ldh;")
    private class36 field1170 = new class36(256);

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "Ldh;")
    private class36 field1188 = new class36(256);

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Lkh;")
    private class97 field1173;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "Lkh;")
    private class97 field1175;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field1171 = 0;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "Lcd;")
    public static class23 field1169 = class54.method414("(U3", -1);

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "Lcd;")
    private static class23 field1187 = class54.method414("Error loading your profile)3", -1);

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "Lcd;")
    private static class23 field1177 = class54.method414("Loaded title screen", -1);

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "J")
    public static long field1176 = 0L;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "Lcd;")
    public static class23 field1174 = field1187;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Lcd;")
    public static class23 field1180 = class54.method414("nicht hergestellt werden)3", -1);

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "Lcd;")
    public static class23 field1186 = field1177;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field1190 = 0;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static void method382(int arg0) {
        field1180 = null;
        field1174 = null;
        field1187 = null;
        field1169 = null;
        field1186 = null;
        field1177 = null;
        if (arg0 != 0) {
            field1181 = 88;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([IBI)Ljc;")
    public final class83 method383(int[] arg0, byte arg1, int arg2) {
        field1189++;
        int var4 = -107 % ((28 - arg1) / 43);
        if (this.field1175.method648((byte) -125) == 1) {
            return this.method386(0, -22756, arg2, arg0);
        } else if (this.field1175.method660(5, arg2) == 1) {
            return this.method386(arg2, -22756, 0, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[IZ)Ljc;")
    public final class83 method384(int arg0, int[] arg1, boolean arg2) {
        field1182++;
        if (this.field1173.method648((byte) -125) == 1) {
            return this.method388(arg0, arg1, 0, 5393);
        } else if (this.field1173.method660(3, arg0) == 1) {
            return this.method388(0, arg1, arg0, 5393);
        } else {
            if (!arg2) {
                method385(null, (byte) 60);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Loe;B)V")
    public static final void method385(class130 arg0, byte arg1) {
        field1179++;
        for (int var2 = 0; var2 < class103.field2190.length; var2++) {
            class103.field2190[var2] = 0;
        }
        short var3 = 256;
        int var4 = 0;
        int var5 = 78 / ((arg1 + 75) / 49);
        while (var4 < 5000) {
            int var17 = (int) ((double) var3 * Math.random() * 128.0D);
            class103.field2190[var17] = (int) (Math.random() * 256.0D);
            var4++;
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var13 = 1; var13 < var3 - 1; var13++) {
                for (int var15 = 1; var15 < 127; var15++) {
                    int var16 = (var13 << 7) + var15;
                    class113.field2378[var16] = (class103.field2190[var16 - 1] + class103.field2190[var16 + 1] + class103.field2190[var16 - -128] + class103.field2190[var16 + -128]) / 4;
                }
            }
            int[] var14 = class103.field2190;
            class103.field2190 = class113.field2378;
            class113.field2378 = var14;
        }
        if (arg0 == null) {
            return;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.field2701; var8++) {
            for (int var9 = 0; var9 < arg0.field2706; var9++) {
                if (arg0.field2702[var7++] != 0) {
                    int var10 = var9 + arg0.field2700 + 16;
                    int var11 = var8 + arg0.field2699 + 16;
                    int var12 = (var11 << 7) + var10;
                    class103.field2190[var12] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III[I)Ljc;")
    private final class83 method386(int arg0, int arg1, int arg2, int[] arg3) {
        field1184++;
        int var5 = arg2 ^ (arg0 << 4 & 0xFFFD | arg0 >>> 12);
        int var6 = var5 | arg0 << 16;
        if (arg1 != -22756) {
            this.method383(null, (byte) -94, 23);
        }
        long var7 = (long) var6 ^ 0x100000000L;
        class83 var9 = (class83) this.field1188.method260(var7, (byte) 28);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class126 var10 = (class126) this.field1170.method260(var7, (byte) 28);
            if (var10 == null) {
                var10 = class126.method777(this.field1175, arg0, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field1170.method262(var7, -96, var10);
            }
            class83 var11 = var10.method774(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method1018(15789);
                this.field1188.method262(var7, -93, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    public static final void method387(byte arg0) {
        class134.field2786 = false;
        class86.field1844 = 0;
        field1171 = 0;
        class81.field1773 = -1;
        field1185++;
        class124.field2547 = 0;
        class107.field2286 = -1;
        class199.field3900 = 0;
        class121.field2517 = 0;
        class200.field3964 = 0;
        class180.field3559 = -1;
        class58.field1359 = -1;
        class159.field3190.field3752 = 0;
        class81.field1769.field3752 = 0;
        int var1 = -82 % ((37 - arg0) / 51);
        for (int var2 = 0; var2 < class95.field2007.length; var2++) {
            if (class95.field2007[var2] != null) {
                class95.field2007[var2].field218 = -1;
            }
        }
        for (int var3 = 0; var3 < class91.field1944.length; var3++) {
            if (class91.field1944[var3] != null) {
                class91.field1944[var3].field218 = -1;
            }
        }
        class73.method519(false);
        class48.method379(30, (byte) 18);
        for (int var4 = 0; var4 < 100; var4++) {
            class172.field3412[var4] = true;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[III)Ljc;")
    private final class83 method388(int arg0, int[] arg1, int arg2, int arg3) {
        field1178++;
        if (arg3 != 5393) {
            return null;
        }
        int var5 = arg0 ^ (arg2 >>> 12 | arg2 << 4 & 0xFFFC);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class83 var9 = (class83) this.field1188.method260(var7, (byte) 28);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class123 var10 = class123.method764(this.field1173, arg2, arg0);
            if (var10 == null) {
                return null;
            }
            class83 var11 = var10.method761();
            this.field1188.method262(var7, -96, var11);
            if (arg1 != null) {
                arg1[0] -= var11.field1783.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lkh;Lkh;)V")
    public class49(class97 arg0, class97 arg1) {
        this.field1173 = arg0;
        this.field1175 = arg1;
    }
}
