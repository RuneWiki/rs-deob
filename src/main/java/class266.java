import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public abstract class class266 {

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "Lus;")
    public static class1 field3889 = new class1(83, -1);

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "[[I")
    public static int[][] field3891 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "J")
    public static long field3893 = -1L;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "Lhg;")
    public static class450 field3894;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ)I")
    public abstract int method954(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public static void method1636(int arg0) {
        field3894 = null;
        field3891 = null;
        int var1 = 73 % ((arg0 + 26) / 55);
        field3889 = null;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
    public static final void method1637(int arg0) {
        for (class260 var1 = (class260) class345.field5017.method1443((byte) -63); var1 != null; var1 = (class260) class345.field5017.method1443((byte) -103)) {
            class94.method532(var1, false);
        }
        if (arg0 < 110) {
            method1638(true, 24, -85);
        }
        field3890++;
        int var2;
        int var3;
        if (class314.field4438.method1174((byte) 126, class437.field6083)) {
            var2 = 3;
            var3 = 0;
        } else {
            var2 = class42.field619;
            var3 = class42.field619;
        }
        client.method1118();
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method1117();
            client.method1133(var4);
            client.method1114(var4);
        }
        client.method1127();
        client.method1110();
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)J")
    public abstract long method957(byte arg0);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZII)I")
    public static final int method1638(boolean arg0, int arg1, int arg2) {
        field3888++;
        if (arg1 == 4 || arg1 == 5) {
            return class250.field3691[arg2 & 0x3];
        } else if (arg0) {
            return 49;
        } else {
            return 256;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
    public static final void method1639(boolean arg0) {
        if (!arg0) {
            field3893 = 121L;
        }
        field3887++;
        class307.field4375.method1478((byte) -91);
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(Z)V")
    public abstract void method955(boolean arg0);
}
