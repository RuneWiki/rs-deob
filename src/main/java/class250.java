import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class250 extends class166 {

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "I")
    public int field4033;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "I")
    public int field4034;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "[I")
    public static int[] field4027 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
    public static volatile int field4032 = -1;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "[Lbb;")
    public static class92[] field4031 = new class92[50];

    @OriginalMember(owner = "client!ci", name = "C", descriptor = "I")
    public static int field4038 = -1;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!ci", name = "B", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "Lhc;")
    public static class235 field4030;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "Z")
    public static boolean field4036;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)V")
    public static void method1714(int arg0) {
        field4030 = null;
        field4027 = null;
        if (arg0 >= 70) {
            field4031 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)[Led;")
    public static final class186[] method1715(boolean arg0) {
        if (!arg0) {
            return null;
        }
        class186[] var1 = new class186[class293.field4626];
        field4028++;
        for (int var2 = 0; var2 < class293.field4626; var2++) {
            int var3 = class28.field390[var2] * class171.field2679[var2];
            byte[] var4 = class198.field3123[var2];
            if (class33.field501[var2]) {
                byte[] var5 = class95.field1609[var2];
                int[] var6 = new int[var3];
                for (int var7 = 0; var7 < var3; var7++) {
                    var6[var7] = class45.method330(class55.method420(var5[var7] << 24, -16777216), class94.field1601[class55.method420(var4[var7], 255)]);
                }
                var1[var2] = new class123(class213.field3317, class130.field2056, class193.field3066[var2], class108.field1779[var2], class28.field390[var2], class171.field2679[var2], var6);
            } else {
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class94.field1601[class55.method420(255, var4[var9])];
                }
                var1[var2] = new class276(class213.field3317, class130.field2056, class193.field3066[var2], class108.field1779[var2], class28.field390[var2], class171.field2679[var2], var8);
            }
        }
        class19.method179(8);
        return var1;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(II)V")
    public class250(int arg0, int arg1) {
        this.field4033 = arg0;
        this.field4034 = arg1;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IB)Lij;")
    public static final class200 method1716(int arg0, byte arg1) {
        class200 var2 = (class200) class93.field1594.method728((long) arg0, (byte) -70);
        field4029++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class34.field514.method1590(arg0, (byte) -25, 11);
        int var4 = -35 / ((-arg1 - 8) / 36);
        class200 var5 = new class200();
        if (var3 != null) {
            var5.method1355(0, new class88(var3));
        }
        class93.field1594.method737((long) arg0, 0, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)V")
    public static final void method1717(int arg0) {
        class140.method945((byte) -99, false);
        field4037++;
        if (arg0 == -21647) {
            System.gc();
            client.method1042(false, 25);
        }
    }
}
