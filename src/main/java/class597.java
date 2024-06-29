import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class597 extends class665 {

    @OriginalMember(owner = "client!rs", name = "A", descriptor = "I")
    private int field8289;

    @OriginalMember(owner = "client!rs", name = "x", descriptor = "[I")
    public static int[] field8286 = new int[1000];

    @OriginalMember(owner = "client!rs", name = "t", descriptor = "I")
    public static int field8282;

    @OriginalMember(owner = "client!rs", name = "v", descriptor = "I")
    public static int field8284;

    @OriginalMember(owner = "client!rs", name = "w", descriptor = "I")
    public static int field8285;

    @OriginalMember(owner = "client!rs", name = "y", descriptor = "I")
    public static int field8287;

    @OriginalMember(owner = "client!rs", name = "z", descriptor = "I")
    public static int field8288;

    @OriginalMember(owner = "client!rs", name = "B", descriptor = "[Lqb;")
    public class204[] field8290;

    @OriginalMember(owner = "client!rs", name = "u", descriptor = "[[B")
    private byte[][] field8283;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V", line = 4)
    public static final void method3300(int arg0) {
        field8282++;
        if (arg0 != 24983 || class633.field8858) {
            return;
        }
        class680.method3755((byte) -109, class368.field5264);
        if (class690.field9701 != null) {
            class680.method3755((byte) -37, class690.field9701);
        }
        class633.field8858 = true;
    }

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "(I)Z", line = 28)
    public final boolean method3301(int arg0) {
        field8285++;
        if (this.field8290 != null) {
            return true;
        }
        if (this.field8283 == null) {
            if (!class417.field5876.method945(this.field8289, -9969)) {
                return false;
            }
            int[] var2 = class417.field5876.method939((byte) 23, this.field8289);
            this.field8283 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field8283[var3] = class417.field5876.method940(this.field8289, var2[var3], 0);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field8283.length; var5++) {
            byte[] var16 = this.field8283[var5];
            class96 var17 = new class96(var16);
            var17.field1301 = 1;
            int var18 = var17.method743((byte) -28);
            var4 &= class77.field1054.method947(-59, var18);
        }
        int var6 = 35 % ((arg0 + 15) / 59);
        if (!var4) {
            return false;
        }
        class192 var7 = new class192();
        int var8 = class417.field5876.method936(this.field8289, -127);
        this.field8290 = new class204[var8];
        int[] var9 = class417.field5876.method939((byte) 23, this.field8289);
        for (int var10 = 0; var10 < var9.length; var10++) {
            byte[] var11 = this.field8283[var10];
            class96 var12 = new class96(var11);
            var12.field1301 = 1;
            int var13 = var12.method743((byte) -42);
            class466 var14 = null;
            for (class466 var15 = (class466) var7.method1270((byte) -25); var15 != null; var15 = (class466) var7.method1282(0)) {
                if (var15.field6550 == var13) {
                    var14 = var15;
                    break;
                }
            }
            if (var14 == null) {
                var14 = new class466(var13, class77.field1054.method938(var13, (byte) -53));
                var7.method1273(var14, (byte) 122);
            }
            this.field8290[var9[var10]] = new class204(var11, var14);
        }
        this.field8283 = null;
        return true;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IZ)Z", line = 130)
    public final boolean method3302(int arg0, boolean arg1) {
        if (arg1) {
            this.field8290 = null;
        }
        field8287++;
        return this.field8290[arg0].field2992;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZI)Z", line = 142)
    public final boolean method3303(boolean arg0, int arg1) {
        field8288++;
        if (!arg0) {
            this.field8283 = null;
        }
        return this.field8290[arg1].field3006;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)Z", line = 158)
    public final boolean method3304(int arg0, int arg1) {
        int var3 = -17 % ((-arg0 - 35) / 47);
        field8284++;
        return this.field8290[arg1].field2999;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)V", line = 169)
    public static void method3305(byte arg0) {
        if (arg0 < 38) {
            method3305((byte) 87);
        }
        field8286 = null;
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(I)V", line = 184)
    public class597(int arg0) {
        this.field8289 = arg0;
    }
}
