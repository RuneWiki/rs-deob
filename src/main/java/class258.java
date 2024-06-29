import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class258 extends class89 {

    @OriginalMember(owner = "client!ca", name = "R", descriptor = "Lda;")
    public static class275 field4518 = class255.method1672(106, "Fallen lassen");

    @OriginalMember(owner = "client!ca", name = "Y", descriptor = "Lda;")
    public static class275 field4525 = class255.method1672(92, ":clan:");

    @OriginalMember(owner = "client!ca", name = "Z", descriptor = "Lda;")
    public static class275 field4526 = class255.method1672(127, "null");

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!ca", name = "S", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!ca", name = "T", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!ca", name = "U", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!ca", name = "W", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!ca", name = "X", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!ca", name = "V", descriptor = "Lri;")
    public static class222 field4522;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        if (arg1) {
            field4518 = null;
        }
        int[] var3 = super.field1503.method229(arg0, (byte) -94);
        ++field4517;
        if (super.field1503.field664) {
            int[][] var4 = this.method648(true, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class65.field1070 > var8; ++var8) {
                var3[var8] = (var5[var8] - -var7[var8] + var6[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI[BI)I")
    public static final int method1682(byte arg0, int arg1, byte[] arg2, int arg3) {
        int var4 = -1;
        if (arg0 <= 43) {
            method1683(false, 27);
        }
        for (int var5 = arg3; ~arg1 < ~var5; ++var5) {
            var4 = var4 >>> 8 ^ class129.field2267[255 & (var4 ^ arg2[var5])];
        }
        ++field4523;
        return ~var4;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
    public class258() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(ZI)I")
    public static final int method1683(boolean arg0, int arg1) {
        ++field4520;
        return arg0 ? 66 : arg1 & 255;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(II)Z")
    public static final boolean method1684(int arg0, int arg1) {
        if (arg0 != 26320) {
            field4526 = null;
        }
        ++field4524;
        return ~((arg1 & 3874660) >> 21) != -1;
    }

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "(I)V")
    public static void method1685(int arg0) {
        field4518 = null;
        field4525 = null;
        int var1 = -80 / ((8 - arg0) / 47);
        field4522 = null;
        field4526 = null;
    }
}
