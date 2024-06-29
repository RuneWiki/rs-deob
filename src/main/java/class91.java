import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class91 extends class45 {

    @OriginalMember(owner = "client!k", name = "x", descriptor = "Lea;")
    public static class243 field1328 = new class243();

    @OriginalMember(owner = "client!k", name = "B", descriptor = "I")
    public static int field1332 = 500;

    @OriginalMember(owner = "client!k", name = "F", descriptor = "S")
    public static short field1336 = 32767;

    @OriginalMember(owner = "client!k", name = "H", descriptor = "[[I")
    public static int[][] field1338 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!k", name = "G", descriptor = "[I")
    public static int[] field1337 = new int[128];

    @OriginalMember(owner = "client!k", name = "C", descriptor = "[J")
    public static long[] field1333 = new long[200];

    @OriginalMember(owner = "client!k", name = "v", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!k", name = "A", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!k", name = "z", descriptor = "Lbk;")
    public static class136 field1330;

    @OriginalMember(owner = "client!k", name = "D", descriptor = "Lbk;")
    public static class136 field1334;

    @OriginalMember(owner = "client!k", name = "E", descriptor = "[[Lec;")
    public static class178[][] field1335;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(Z)V")
    public static void method559(boolean arg0) {
        if (!arg0) {
            return;
        }
        field1335 = null;
        field1338 = null;
        field1333 = null;
        field1337 = null;
        field1328 = null;
        field1330 = null;
        field1334 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILbk;II)[Lub;")
    public static final class43[] method560(int arg0, class136 arg1, int arg2, int arg3) {
        field1331++;
        if (class84.method528(arg1, arg2, arg0, 0)) {
            if (arg3 != 3) {
                method562((byte) 23, null);
            }
            return class87.method547(27762);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)V")
    public static final void method561(int arg0, int arg1) {
        field1326++;
        class249 var2 = (class249) class110.field1562.method1551(32768, (long) arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < var2.field4406.length; var3++) {
            var2.field4406[var3] = -1;
            var2.field4411[var3] = 0;
        }
        if (arg0 <= 124) {
            method563(-52, 54, 127, (byte) -12, 2, -56, 118);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BLbk;)V")
    public static final void method562(byte arg0, class136 arg1) {
        if (arg0 > -20) {
            method560(-8, null, 103, 59);
        }
        field1327++;
        class168.field2818 = arg1.method833((byte) -63, class238.field4242);
        class151.field2427 = arg1.method833((byte) -91, class27.field330);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIBIII)V")
    public static final void method563(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field1329++;
        int var7 = arg1 + arg5;
        int var8 = arg1 + arg2;
        for (int var9 = arg2; var9 < var8; var9++) {
            class25.method147(arg4, 7, arg5, class95.field1380[var9], arg0);
        }
        int var10 = arg0 - arg1;
        int var11 = arg6 - arg1;
        if (arg3 >= -95) {
            method561(-60, -1);
        }
        for (int var12 = arg6; var12 > var11; var12--) {
            class25.method147(arg4, 7, arg5, class95.field1380[var12], arg0);
        }
        for (int var13 = var8; var13 <= var11; var13++) {
            int[] var14 = class95.field1380[var13];
            class25.method147(arg4, 7, arg5, var14, var7);
            class25.method147(arg4, 7, var10, var14, arg0);
        }
    }
}
