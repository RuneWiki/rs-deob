import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class89 extends class397 {

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "Z")
    public static boolean field1214 = false;

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "F")
    public static float field1213;

    @OriginalMember(owner = "client!hc", name = "L", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
    private int field1216;

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!hc", name = "R", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
    private int field1219;

    @OriginalMember(owner = "client!hc", name = "U", descriptor = "I")
    private int field1221;

    @OriginalMember(owner = "client!hc", name = "V", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!hc", name = "T", descriptor = "Lbm;")
    public static class70 field1220;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(II)Z", line = 3)
    public static final boolean method554(int arg0, int arg1) {
        if (arg1 != -13) {
            field1214 = true;
        }
        ++field1222;
        return ~arg0 <= -13 && ~arg0 >= -18;
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)V", line = 18)
    public static void method555(int arg0) {
        if (arg0 > 4) {
            field1220 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(I)V", line = 30)
    private class89(int arg0) {
        super(0, false);
        this.method557(arg0, (byte) -101);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IBLae;)V", line = 38)
    public final void method27(int arg0, byte arg1, class156 arg2) {
        if (arg1 == 80) {
            if (~arg0 == -1) {
                this.method557(arg2.method943(1295851312), (byte) -101);
            }
            ++field1212;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)[[I", line = 66)
    public final int[][] method486(byte arg0, int arg1) {
        ++field1215;
        int[][] var3 = super.field5848.method1692(arg1, 95);
        if (arg0 <= 81) {
            return null;
        } else {
            if (super.field5848.field3939) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; ~class164.field2152 < ~var7; ++var7) {
                    var4[var7] = this.field1219;
                    var5[var7] = this.field1216;
                    var6[var7] = this.field1221;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZII)I", line = 111)
    public static final int method556(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return 44;
        } else {
            ++field1217;
            int var3 = arg2 >> 31 & arg1 + -1;
            return ((arg2 >>> 31) + arg2) % arg1 + var3;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)V", line = 125)
    private final void method557(int arg0, byte arg1) {
        this.field1216 = 4080 & arg0 >> 4;
        ++field1218;
        this.field1221 = (255 & arg0) << 4;
        if (arg1 == -101) {
            this.field1219 = arg0 >> 12 & 4080;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V", line = 138)
    public class89() {
        this(0);
    }
}
