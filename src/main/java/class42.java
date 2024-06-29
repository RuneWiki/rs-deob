import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class42 {

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "[Lia;")
    public static class48[] field1059 = new class48[4];

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "Lpd;")
    public static class94 field1062 = class28.method249(-124, "backleft2");

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "[I")
    public static int[] field1065 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "[Lpd;")
    public static class94[] field1067 = new class94[100];

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "Lte;")
    public static class119 field1061 = new class119();

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "Lpd;")
    public static class94 field1068 = class28.method249(58, "headicons_pk");

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "Lpd;")
    public static class94 field1069 = class28.method249(23, ")1");

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "Ljb;")
    public static class55 field1057;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BILtc;I)V", line = 14)
    public static final void method313(byte arg0, int arg1, class116 arg2, int arg3) {
        if (arg0 > -20) {
            method313((byte) -16, 43, null, 117);
        }
        int var4 = arg1 * arg1 + arg3 * arg3;
        field1056++;
        if (var4 <= 4225 || var4 >= 90000) {
            class69.method508(115, arg1, arg2, arg3);
            return;
        }
        int var5 = class119.field2976 + class107.field2668 & 0x7FF;
        int var6 = class48.field1213[var5];
        int var7 = var6 * 256 / (class50.field1244 + 256);
        int var8 = class48.field1194[var5];
        int var9 = var8 * 256 / (class50.field1244 + 256);
        int var10 = arg3 * var7 + arg1 * var9 >> 16;
        int var11 = arg3 * var9 - arg1 * var7 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = (int) (Math.sin(var12) * 63.0D);
        int var15 = (int) (Math.cos(var12) * 57.0D);
        class102.field2579.method865(var14 + 4 + 84, -var15 + 83 + -20, 20, 20, 15, 15, var12, 256);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III[Lod;[BII)V", line = 63)
    public static final void method314(int arg0, int arg1, int arg2, class88[] arg3, byte[] arg4, int arg5, int arg6) {
        if (arg0 <= 21) {
            return;
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg1 + var12 > 0 && arg1 + var12 < 103 && arg2 + var13 > 0 && arg2 + var13 < 103) {
                        arg3[var7].field2269[arg1 + var12][arg2 + var13] = class81.method605(arg3[var7].field2269[arg1 + var12][arg2 + var13], -16777217);
                    }
                }
            }
        }
        class122 var8 = new class122(arg4);
        field1064++;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class23.method169((byte) -128, var8, arg5, 0, var9, arg1 + var10, arg2 + var11, arg6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ls;Ls;BLs;)V", line = 130)
    public static final void method315(class111 arg0, class111 arg1, byte arg2, class111 arg3) {
        class23.field597 = arg0;
        class76.field1845 = arg1;
        field1058++;
        if (arg2 != -69) {
            method313((byte) -3, 40, null, 13);
        }
        class55.field1390 = arg3;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 187)
    public static final void method316(int arg0) {
        class13 var1 = class100.field2526;
        synchronized (class100.field2526) {
            class43.field1081 = class73.field1802;
            if (arg0 >= ~class6.field126) {
                while (class80.field2048 != class6.field126) {
                    int var3 = class86.field2192[class80.field2048];
                    class80.field2048 = class80.field2048 + 1 & 0x7F;
                    if (var3 < 0) {
                        class92.field2353[~var3] = false;
                    } else {
                        class92.field2353[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class92.field2353[var2] = false;
                }
                class6.field126 = class80.field2048;
            }
            class73.field1802 = class1.field14;
        }
        field1066++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V", line = 232)
    public static void method317(byte arg0) {
        if (arg0 != 50) {
            method318(122, false, null, 43);
        }
        field1057 = null;
        field1065 = null;
        field1069 = null;
        field1059 = null;
        field1062 = null;
        field1067 = null;
        field1068 = null;
        field1061 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZLbd;I)Z", line = 264)
    public static final boolean method318(int arg0, boolean arg1, class11 arg2, int arg3) {
        field1060++;
        if (!class72.method534(-71, arg2, arg1)) {
            return false;
        }
        if (arg0 > 0) {
            class90.field2350 = new class128(arg0);
        }
        int var4 = -24 % ((-arg3 - 55) / 53);
        return true;
    }
}
