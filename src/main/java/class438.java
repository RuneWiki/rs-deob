import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class438 extends class113 {

    @OriginalMember(owner = "client!fe", name = "Z", descriptor = "Lsd;")
    public static class74 field6279 = new class74(91, 6);

    @OriginalMember(owner = "client!fe", name = "fb", descriptor = "S")
    public static short field6285 = 1;

    @OriginalMember(owner = "client!fe", name = "gb", descriptor = "I")
    public static int field6286 = 0;

    @OriginalMember(owner = "client!fe", name = "ab", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!fe", name = "bb", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!fe", name = "cb", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!fe", name = "eb", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!fe", name = "db", descriptor = "Lg;")
    public static class470 field6283;

    @OriginalMember(owner = "client!fe", name = "hb", descriptor = "[Z")
    public static boolean[] field6287;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z[J[Ljava/lang/Object;)V", line = 6)
    public static final void method2600(boolean arg0, long[] arg1, Object[] arg2) {
        ++field6282;
        class196.method1075(arg2, 1, arg1.length + -1, 0, arg1);
        if (!arg0) {
            method2603((class179) null, (byte) 107);
        }
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)Lpi;", line = 22)
    public static final class239 method2601(int arg0) {
        ++field6280;
        if (class118.field1463 < class28.field368.length) {
            return class28.field368[class118.field1463++];
        } else {
            if (arg0 != 1) {
                field6279 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "(I)V", line = 38)
    public static void method2602(int arg0) {
        if (arg0 != 1) {
            method2600(false, (long[]) null, (Object[]) null);
        }
        field6279 = null;
        field6283 = null;
        field6287 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)[[I", line = 50)
    public final int[][] method157(int arg0, int arg1) {
        ++field6281;
        if (arg0 != -24032) {
            method2602(-15);
        }
        int[][] var3 = super.field4454.method1638((byte) 18, arg1);
        if (super.field4454.field3886 && this.method547(-118)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field1392 * super.field1392;
            for (int var8 = 0; var8 < class158.field1877; ++var8) {
                int var9 = super.field1385[var7 - -(var8 % super.field1388)];
                var6[var8] = class444.method2618(var9 << 4, 4080);
                var5[var8] = class444.method2618(var9 >> 4, 4080);
                var4[var8] = class444.method2618(var9 >> 12, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lvt;B)Lfs;", line = 102)
    public static final class376 method2603(class179 arg0, byte arg1) {
        if (arg1 != -73) {
            method2601(-35);
        }
        ++field6284;
        return new class376(arg0.method906(-21), arg0.method906(arg1 + -47), arg0.method906(-84), arg0.method906(-11), arg0.method899((byte) 127), arg0.method899((byte) 121), arg0.method895((byte) -107));
    }
}
