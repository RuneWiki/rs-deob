import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class104 {

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Lam;")
    public static class180 field1734 = new class180();

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "[Lhl;")
    public static class40[] field1736 = new class40[50];

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1735 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "Lre;")
    public static class228 field1739 = null;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1738 = "Loaded fonts";

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I[BII)I")
    public static final int method751(int arg0, byte[] arg1, int arg2, int arg3) {
        field1733++;
        int var4 = -1;
        if (arg3 != -1904512632) {
            method751(-38, (byte[]) null, 29, -114);
        }
        for (int var5 = arg0; var5 < arg2; var5++) {
            var4 = class280.field4425[(var4 ^ arg1[var5]) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)[Ljb;")
    public static final class276[] method752(byte arg0) {
        field1740++;
        class276[] var1 = new class276[class293.field4626];
        int var2 = -66 % ((1 - arg0) / 47);
        for (int var3 = 0; var3 < class293.field4626; var3++) {
            int var4 = class28.field390[var3] * class171.field2679[var3];
            byte[] var5 = class198.field3123[var3];
            int[] var6 = new int[var4];
            for (int var7 = 0; var7 < var4; var7++) {
                var6[var7] = class94.field1601[class55.method420(var5[var7], 255)];
            }
            var1[var3] = new class276(class213.field3317, class130.field2056, class193.field3066[var3], class108.field1779[var3], class28.field390[var3], class171.field2679[var3], var6);
        }
        class19.method179(8);
        return var1;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static void method753(int arg0) {
        field1738 = null;
        field1735 = null;
        field1739 = null;
        field1734 = null;
        field1736 = null;
        if (arg0 != 50) {
            method751(-1, (byte[]) null, -15, 92);
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
    public class104() {
        new class277();
    }
}
