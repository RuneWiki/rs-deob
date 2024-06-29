import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class96 extends class135 {

    @OriginalMember(owner = "client!va", name = "W", descriptor = "Lqj;")
    public static class196 field1408 = class80.method502(")3runescape)3com", -48);

    @OriginalMember(owner = "client!va", name = "ab", descriptor = "I")
    public static int field1412 = 0;

    @OriginalMember(owner = "client!va", name = "db", descriptor = "[I")
    public static int[] field1415 = new int[32];

    @OriginalMember(owner = "client!va", name = "X", descriptor = "I")
    public static int field1409 = 0;

    @OriginalMember(owner = "client!va", name = "cb", descriptor = "I")
    public static int field1414 = 0;

    @OriginalMember(owner = "client!va", name = "fb", descriptor = "Lqj;")
    private static class196 field1417 = class80.method502("Members only world", -48);

    @OriginalMember(owner = "client!va", name = "eb", descriptor = "Lqj;")
    public static class196 field1416 = class80.method502("hitmarks", -48);

    @OriginalMember(owner = "client!va", name = "bb", descriptor = "I")
    public static int field1413 = 0;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "Lqj;")
    public static class196 field1407 = field1417;

    @OriginalMember(owner = "client!va", name = "Y", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "Lrb;")
    public static class6 field1411;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V")
    public static void method599(int arg0) {
        field1415 = null;
        int var1 = -66 / ((arg0 - -4) / 54);
        field1407 = null;
        field1411 = null;
        field1417 = null;
        field1408 = null;
        field1416 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            ++field1410;
            int[] var3 = super.field1954.method110(arg0, -118);
            if (super.field1954.field244) {
                int[][] var4 = this.method818(2, arg0, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                for (int var8 = 0; class131.field1862 > var8; ++var8) {
                    var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
    public class96() {
        super(1, true);
    }
}
