import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class18 extends class20 {

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
    public static int field312 = 0;

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "I")
    public static int field316 = -1;

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "Lsc;")
    public static class128 field323 = class129.method1017(false, "");

    @OriginalMember(owner = "client!cc", name = "I", descriptor = "Lsc;")
    public static class128 field319 = field323;

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "Z")
    public static boolean field328 = false;

    @OriginalMember(owner = "client!cc", name = "V", descriptor = "I")
    public static int field330 = 0;

    @OriginalMember(owner = "client!cc", name = "H", descriptor = "Lrb;")
    public static class120 field318 = new class120(20);

    @OriginalMember(owner = "client!cc", name = "X", descriptor = "I")
    public static int field332 = 0;

    @OriginalMember(owner = "client!cc", name = "bb", descriptor = "[I")
    public static int[] field336 = new int[100];

    @OriginalMember(owner = "client!cc", name = "Y", descriptor = "Lsc;")
    public static class128 field333 = class129.method1017(false, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!cc", name = "cb", descriptor = "I")
    public static int field337 = 0;

    @OriginalMember(owner = "client!cc", name = "Z", descriptor = "Lsc;")
    public static class128 field334 = class129.method1017(false, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "I")
    public int field313;

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "I")
    public int field315;

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
    public int field326;

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "I")
    public int field327;

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!cc", name = "db", descriptor = "I")
    public int field338;

    @OriginalMember(owner = "client!cc", name = "W", descriptor = "Lsc;")
    public class128 field331;

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "Lhe;")
    public class54 field314;

    @OriginalMember(owner = "client!cc", name = "N", descriptor = "Lhe;")
    public class54 field324;

    @OriginalMember(owner = "client!cc", name = "ab", descriptor = "[I")
    public static int[] field335;

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "[Ljava/lang/Object;")
    public Object[] field321;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([Lda;IIB[BII)V")
    public static final void method160(class23[] arg0, int arg1, int arg2, byte arg3, byte[] arg4, int arg5, int arg6) {
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg6 + var12 > 0 && arg6 + var12 < 103 && arg1 + var13 > 0 && arg1 + var13 < 103) {
                        arg0[var7].field457[arg6 + var12][arg1 + var13] = class25.method224(arg0[var7].field457[arg6 + var12][arg1 + var13], -16777217);
                    }
                }
            }
        }
        class86 var8 = new class86(arg4);
        if (arg3 != 102) {
            method161(-61, -7, 119, 24, 9);
        }
        field317++;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class108.method834(arg2, arg6 + var10, arg1 + var11, 0, arg5, var9, var8, arg3 ^ 0xFFFF9C6F);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIII)V")
    public static final void method161(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 19179) {
            field333 = null;
        }
        if (class127.field2871 == 1) {
            class159.field3644[class70.field1580 / 100].method64(class156.field3587 - 8, class19.field356 + -8);
        }
        if (class127.field2871 == 2) {
            class159.field3644[class70.field1580 / 100 + 4].method64(class156.field3587 - 8, class19.field356 - 8);
        }
        class23.method210((byte) 77);
        if (class151.field3488) {
            int var5 = arg3 + 20;
            int var6 = 16776960;
            int var7 = arg0 + 512 - 5;
            class137.field3235.method1065(class51.method395(new class128[] { class73.field1628, class111.method857(class68.field1527, (byte) 120) }, false), var7, var5, 16776960, -1);
            Runtime var8 = Runtime.getRuntime();
            int var10 = var5 + 15;
            int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
            if (var9 > 32768 && class110.field2487) {
                var6 = 16711680;
            }
            if (var9 > 65536 && !class110.field2487) {
                var6 = 16711680;
            }
            class137.field3235.method1065(class51.method395(new class128[] { class40.field745, class111.method857(var9, (byte) 111), class105.field2401 }, false), var7, var10, var6, -1);
            var5 = var10 + 15;
        }
        field320++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field329++;
        if (arg1 != 97) {
            return;
        }
        int var7 = 2048 - arg3 & 0x7FF;
        int var8 = 0;
        int var9 = 2048 - arg4 & 0x7FF;
        int var10 = arg2;
        int var11 = 0;
        if (var9 != 0) {
            int var12 = class114.field2564[var9];
            int var13 = class114.field2557[var9];
            int var14 = var11 * var13 - arg2 * var12 >> 16;
            var10 = arg2 * var13 + var11 * var12 >> 16;
            var11 = var14;
        }
        if (var7 != 0) {
            int var15 = class114.field2557[var7];
            int var16 = class114.field2564[var7];
            int var17 = var10 * var16 + var8 * var15 >> 16;
            var10 = var10 * var15 - var8 * var16 >> 16;
            var8 = var17;
        }
        class65.field1430 = arg0 - var11;
        class1.field10 = arg3;
        class156.field3589 = arg4;
        class147.field3410 = arg5 - var8;
        class1.field2 = arg6 - var10;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Z")
    public static final boolean method163(int arg0, int arg1) {
        field325++;
        int var2 = 6 % ((-arg0 - 28) / 36);
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZJ)V")
    public static final void method164(boolean arg0, long arg1) {
        if (arg0) {
            return;
        }
        field322++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class110.method851(23315, arg1 - 1L);
            class110.method851(23315, 1L);
        } else {
            class110.method851(23315, arg1);
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
    public static void method165(int arg0) {
        field335 = null;
        field318 = null;
        if (arg0 != -65) {
            return;
        }
        field333 = null;
        field319 = null;
        field334 = null;
        field336 = null;
        field323 = null;
    }
}
