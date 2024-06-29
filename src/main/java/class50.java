import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class50 {

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "[I")
    public static int[] field1195 = new int[128];

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field1194 = 1;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field1192 = -1;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "Laf;")
    public static class7 field1202 = class48.method406(40, "Bitte wenden Sie sich an den Kundendienst)3");

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "Laf;")
    private static class7 field1207 = class48.method406(40, "Loaded interfaces");

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Laf;")
    public static class7 field1200 = field1207;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "[[I")
    public static int[][] field1205 = new int[104][104];

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "Z")
    public static boolean field1206 = false;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public static final void method412(byte arg0) {
        class152.field3559.method391((byte) -73);
        field1191++;
        if (arg0 != -14) {
            field1192 = -19;
        }
        class52.field1248.method391((byte) -73);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static final void method413(int arg0) {
        class93.field2162.method391((byte) -73);
        if (arg0 == -27713) {
            field1196++;
            class94.field2198.method391((byte) -73);
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V")
    public static void method414(byte arg0) {
        field1195 = null;
        field1202 = null;
        if (arg0 != 54) {
            method417(true);
        }
        field1205 = null;
        field1207 = null;
        field1200 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZILkb;Lkb;)Lh;")
    public static final class49 method415(int arg0, boolean arg1, int arg2, class71 arg3, class71 arg4) {
        field1197++;
        boolean var5 = true;
        int[] var6 = arg3.method574(80, arg0);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg3.method563((byte) 50, arg0, var6[var7]);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg1) {
                    var10 = arg4.method563((byte) 78, 0, var9);
                } else {
                    var10 = arg4.method563((byte) 123, var9, 0);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        int var11 = -71 / ((-arg2 - 58) / 44);
        if (!var5) {
            return null;
        }
        try {
            return new class49(arg3, arg4, arg0, arg1);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)V")
    public static final void method416(int arg0, int arg1, int arg2) {
        field1199++;
        if (class135.field3230 != 0 && class135.field3230 != 3) {
            return;
        }
        if (class13.field337 == 1) {
            int var3 = class10.field267 - arg0 - 25;
            int var4 = class111.field2668 - arg1 - 5;
            if (var3 >= 0 && var4 >= 0 && var3 < 146 && var4 < 151) {
                int var5 = client.field577 + class4.field48 & 0x7FF;
                var4 -= 75;
                var3 -= 73;
                int var6 = class134.field3164[var5];
                int var7 = (class113.field2705 + 256) * var6 >> 8;
                int var8 = class134.field3160[var5];
                int var9 = (class113.field2705 + 256) * var8 >> 8;
                int var10 = var3 * var9 + var4 * var7 >> 11;
                int var11 = class21.field531.field505 + var10 >> 7;
                int var12 = var4 * var9 - var3 * var7 >> 11;
                int var13 = class21.field531.field491 - var12 >> 7;
                boolean var14 = class57.method469(var11, var13, 10, 0, class21.field531.field493[0], 0, 0, 0, true, 1, 0, class21.field531.field509[0]);
                if (var14) {
                    class47.field1150.method959(var3, (byte) -120);
                    class47.field1150.method959(var4, (byte) -120);
                    class47.field1150.method933((byte) 12, class4.field48);
                    class47.field1150.method959(57, (byte) -120);
                    class47.field1150.method959(client.field577, (byte) -120);
                    class47.field1150.method959(class113.field2705, (byte) -120);
                    class47.field1150.method959(89, (byte) -120);
                    class47.field1150.method933((byte) 42, class21.field531.field505);
                    class47.field1150.method933((byte) 44, class21.field531.field491);
                    class47.field1150.method959(class139.field3286, (byte) -120);
                    class47.field1150.method959(63, (byte) -120);
                }
            }
        }
        if (arg2 != 5) {
            method419(74, -35);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public static final void method417(boolean arg0) {
        class127.field3057 = null;
        class91.field2113 = null;
        class53.field1278 = null;
        class54.field1325 = null;
        class89.field2061 = null;
        class91.field2104 = null;
        class111.field2697 = null;
        class13.field336 = null;
        class131.field3098 = null;
        if (arg0) {
            field1195 = null;
        }
        class145.field3422 = null;
        field1193++;
        class82.field1875 = null;
        class108.field2643 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZII)V")
    public static final void method418(int arg0, boolean arg1, int arg2, int arg3) {
        field1201++;
        if (arg0 < 128 || arg2 < 128 || arg0 > 13056 || arg2 > 13056) {
            class13.field340 = -1;
            class77.field1767 = -1;
            return;
        }
        int var4 = class119.method921(arg2, -21697, class8.field186, arg0) - arg3;
        int var5 = arg0 - class75.field1753;
        int var6 = var4 - class103.field2506;
        int var7 = class134.field3164[class127.field3056];
        int var8 = arg2 - class143.field3392;
        int var9 = class134.field3160[class127.field3056];
        int var10 = class134.field3164[class86.field2014];
        int var11 = class134.field3160[class86.field2014];
        if (arg1) {
            field1194 = 112;
        }
        int var12 = var5 * var11 + var8 * var10 >> 16;
        int var13 = var8 * var11 - var5 * var10 >> 16;
        int var15 = var6 * var9 - var7 * var13 >> 16;
        int var16 = var6 * var7 + var9 * var13 >> 16;
        if (var16 < 50) {
            class77.field1767 = -1;
            class13.field340 = -1;
        } else {
            class77.field1767 = (var12 << 9) / var16 + 256;
            class13.field340 = (var15 << 9) / var16 + 167;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Z")
    public static final boolean method419(int arg0, int arg1) {
        if (arg0 == -1) {
            field1198++;
            return (arg1 >> 30 & 0x1) != 0;
        } else {
            return false;
        }
    }
}
