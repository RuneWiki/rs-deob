import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class42 extends class12 {

    @OriginalMember(owner = "client!h", name = "J", descriptor = "[[[I")
    public static int[][][] field1062 = new int[4][105][105];

    @OriginalMember(owner = "client!h", name = "L", descriptor = "I")
    public static int field1064 = 0;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "Lad;")
    public static class5 field1063 = class88.method674("(Y", -117);

    @OriginalMember(owner = "client!h", name = "T", descriptor = "Lad;")
    public static class5 field1072 = class88.method674("(Z", 94);

    @OriginalMember(owner = "client!h", name = "H", descriptor = "Lad;")
    public static class5 field1060 = class88.method674("@or2@", 41);

    @OriginalMember(owner = "client!h", name = "V", descriptor = "Lad;")
    private static class5 field1074 = class88.method674("wave2:", -103);

    @OriginalMember(owner = "client!h", name = "U", descriptor = "[J")
    public static long[] field1073 = new long[32];

    @OriginalMember(owner = "client!h", name = "W", descriptor = "Lad;")
    public static class5 field1075 = class88.method674("Ein kostenloses Spielkonto erstellen)3", -112);

    @OriginalMember(owner = "client!h", name = "I", descriptor = "Lad;")
    public static class5 field1061 = field1074;

    @OriginalMember(owner = "client!h", name = "Y", descriptor = "Lad;")
    public static class5 field1077 = class88.method674("Freunde", -109);

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!h", name = "X", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!h", name = "Z", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!h", name = "ab", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!h", name = "bb", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "Lsb;")
    public static class110 field1067;

    @OriginalMember(owner = "client!h", name = "P", descriptor = "Luc;")
    public static class123 field1068;

    @OriginalMember(owner = "client!h", name = "R", descriptor = "Lh;")
    public class42 field1070;

    @OriginalMember(owner = "client!h", name = "S", descriptor = "Lh;")
    public class42 field1071;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "Lqa;")
    public static class97 field1065;

    @OriginalMember(owner = "client!h", name = "N", descriptor = "Z")
    public static boolean field1066;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V", line = 20)
    public static void method353(int arg0) {
        field1068 = null;
        field1067 = null;
        field1074 = null;
        field1065 = null;
        field1077 = null;
        if (arg0 <= 85) {
            method356((byte) -11);
        }
        field1062 = null;
        field1061 = null;
        field1060 = null;
        field1073 = null;
        field1063 = null;
        field1072 = null;
        field1075 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BIII)I", line = 41)
    public static final int method354(byte arg0, int arg1, int arg2, int arg3) {
        field1079++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg2;
        }
        if (arg0 != 110) {
            field1077 = null;
        }
        if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V", line = 76)
    public final void method355(int arg0) {
        field1076++;
        if (this.field1071 == null) {
            return;
        }
        this.field1071.field1070 = this.field1070;
        this.field1070.field1071 = this.field1071;
        this.field1070 = null;
        this.field1071 = null;
        if (arg0 != -530883280) {
            field1060 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V", line = 94)
    public static final void method356(byte arg0) {
        field1078++;
        if (class8.field275 == null) {
            return;
        }
        class9.method103(arg0 ^ 0x60);
        if (class9.field299 > 0) {
            class8.field275.method291(256, arg0 ^ 0xFFFFFFE3);
            class9.field299 = 0;
        }
        class8.field275.method282((byte) -86);
        if (arg0 == -31) {
            class8.field275 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)Lld;", line = 143)
    public static final class70 method357(int arg0, byte arg1) {
        field1080++;
        if (arg1 != -42) {
            field1060 = null;
        }
        class70 var2 = (class70) class5.field206.method98(-8, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class60.field1492.method857(30580, 6, arg0);
        class70 var4 = new class70();
        var4.field1647 = arg0;
        if (var3 != null) {
            var4.method558(65535, new class39(var3));
        }
        var4.method547(true);
        if (var4.field1648) {
            var4.field1668 = false;
            var4.field1685 = false;
        }
        class5.field206.method102((long) arg0, var4, 114);
        return var4;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IBLrd;II)[B", line = 203)
    public static final byte[] method358(int arg0, byte arg1, class106 arg2, int arg3, int arg4) {
        field1069++;
        if (arg1 != -36) {
            method358(-98, (byte) -39, null, 77, -69);
        }
        long var5 = ((long) arg0 << 32) + (long) (arg3 * 37 + arg4 & 0xFFFF) + (long) (arg3 << 16);
        if (class20.field535 != null) {
            class90 var7 = (class90) class20.field535.method98(-8, var5);
            if (var7 != null) {
                return var7.field2115;
            }
        }
        byte[] var8 = arg2.method857(30580, arg3, arg4);
        if (var8 == null) {
            return null;
        } else {
            if (class20.field535 != null) {
                class20.field535.method102(var5, new class90(var8), 110);
            }
            return var8;
        }
    }
}
