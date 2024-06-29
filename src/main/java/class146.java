import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class146 extends class308 {

    @OriginalMember(owner = "client!db", name = "L", descriptor = "[Led;")
    public class338[] field2365;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "Ljava/lang/String;")
    public static String field2355 = " from your friend list first.";

    @OriginalMember(owner = "client!db", name = "B", descriptor = "[[I")
    public static int[][] field2357 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!db", name = "D", descriptor = "I")
    public static int field2358 = 1;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "Z")
    public static boolean field2361 = false;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "Z")
    public static boolean field2359 = false;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V", line = 23)
    public static final void method1039(boolean arg0) {
        if (arg0) {
            method1042(true);
        }
        class52.field799 = true;
        field2362++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)Z", line = 35)
    public final boolean method1040(int arg0, int arg1) {
        if (arg0 != 14678) {
            method1042(true);
        }
        field2356++;
        return this.field2365[arg1].field5444;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(II)Z", line = 48)
    public final boolean method1041(int arg0, int arg1) {
        if (arg1 == 0) {
            field2364++;
            return this.field2365[arg0].field5454;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)V", line = 62)
    public static final void method1042(boolean arg0) {
        if (arg0) {
            class264.field4230 = class275.field4546;
            class101.field1457 = class203.field3110;
            class352.field5605 = class121.field1808;
        } else {
            class264.field4230 = class353.field5620;
            class101.field1457 = class223.field3444;
            class352.field5605 = class308.field5020;
        }
        class217.field3348 = class264.field4230.length;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILod;)V", line = 85)
    public static final void method1043(int arg0, class233 arg1) {
        field2363++;
        if (arg0 != 128) {
            field2358 = -81;
        }
        for (class250 var2 = (class250) class49.field701.method1081(102); var2 != null; var2 = (class250) class49.field701.method1083((byte) 113)) {
            if (var2.field3968 == arg1) {
                if (var2.field3983 != null) {
                    class28.field434.method1412(var2.field3983);
                    var2.field3983 = null;
                }
                var2.method1131(8);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V", line = 120)
    public static void method1044(int arg0) {
        if (arg0 > -112) {
            method1039(true);
        }
        field2357 = (int[][]) null;
        field2355 = null;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lnm;Lnm;IZ)V", line = 130)
    public class146(class221 arg0, class221 arg1, int arg2, boolean arg3) {
        class150 var5 = new class150();
        int var6 = arg0.method1486(arg2, -27734);
        this.field2365 = new class338[var6];
        int[] var7 = arg0.method1515((byte) -100, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1504(var7[var8], true, arg2);
            class83 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class83 var12 = (class83) var5.method1081(-50); var12 != null; var12 = (class83) var5.method1083((byte) 113)) {
                if (var12.field1191 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1511(0, var11, -126);
                } else {
                    var13 = arg1.method1511(var11, 0, -102);
                }
                var10 = new class83(var11, var13);
                var5.method1077(16711935, var10);
            }
            this.field2365[var7[var8]] = new class338(var9, var10);
        }
    }
}
