import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!NZKYYWQJ")
public class class38 extends class15 {

    @OriginalMember(owner = "client!NZKYYWQJ", name = "m", descriptor = "I")
    private int field1221 = 1612;

    @OriginalMember(owner = "client!NZKYYWQJ", name = "G", descriptor = "Z")
    private boolean field1241 = true;

    @OriginalMember(owner = "client!NZKYYWQJ", name = "L", descriptor = "Z")
    public boolean field1246 = false;

    @OriginalMember(owner = "client!NZKYYWQJ", name = "n", descriptor = "LXBHNZKGU;")
    private class63 field1222;

    @OriginalMember(owner = "client!NZKYYWQJ", name = "F", descriptor = "I")
    public int field1240;

    @OriginalMember(owner = "client!NZKYYWQJ", name = "H", descriptor = "I")
    public int field1242;

    @OriginalMember(owner = "client!NZKYYWQJ", name = "I", descriptor = "I")
    public int field1243;

    @OriginalMember(owner = "client!NZKYYWQJ", name = "J", descriptor = "I")
    public int field1244;

    @OriginalMember(owner = "client!NZKYYWQJ", name = "x", descriptor = "I")
    public int field1232;

    @OriginalMember(owner = "client!NZKYYWQJ", name = "y", descriptor = "I")
    public int field1233;

    @OriginalMember(owner = "client!NZKYYWQJ", name = "u", descriptor = "I")
    public int field1229;

    @OriginalMember(owner = "client!NZKYYWQJ", name = "v", descriptor = "I")
    public int field1230;

    @OriginalMember(owner = "client!NZKYYWQJ", name = "w", descriptor = "I")
    public int field1231;

    @OriginalMember(owner = "client!NZKYYWQJ", name = "K", descriptor = "I")
    public int field1245;

    @OriginalMember(owner = "client!NZKYYWQJ", name = "q", descriptor = "D")
    public double field1225;

    @OriginalMember(owner = "client!NZKYYWQJ", name = "r", descriptor = "D")
    public double field1226;

    @OriginalMember(owner = "client!NZKYYWQJ", name = "s", descriptor = "D")
    public double field1227;

    @OriginalMember(owner = "client!NZKYYWQJ", name = "t", descriptor = "D")
    private double field1228;

    @OriginalMember(owner = "client!NZKYYWQJ", name = "z", descriptor = "D")
    private double field1234;

    @OriginalMember(owner = "client!NZKYYWQJ", name = "A", descriptor = "D")
    private double field1235;

    @OriginalMember(owner = "client!NZKYYWQJ", name = "B", descriptor = "D")
    private double field1236;

    @OriginalMember(owner = "client!NZKYYWQJ", name = "C", descriptor = "D")
    private double field1237;

    @OriginalMember(owner = "client!NZKYYWQJ", name = "o", descriptor = "I")
    public int field1223;

    @OriginalMember(owner = "client!NZKYYWQJ", name = "p", descriptor = "I")
    public int field1224;

    @OriginalMember(owner = "client!NZKYYWQJ", name = "D", descriptor = "I")
    private int field1238;

    @OriginalMember(owner = "client!NZKYYWQJ", name = "E", descriptor = "I")
    private int field1239;

    @OriginalMember(owner = "client!NZKYYWQJ", name = "a", descriptor = "(I)LFCIDIKVY;")
    public final class19 method187(int arg0) {
        class19 var2 = this.field1222.method563();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field1222.field1656 != null) {
            var3 = this.field1222.field1656.field1695[this.field1238];
        }
        class19 var4 = new class19(false, class21.method235(var3, 12073), true, var2, true);
        if (var3 != -1) {
            var4.method206(8);
            var4.method207(var3, (byte) -14);
            var4.field799 = null;
            var4.field798 = null;
        }
        if (this.field1222.field1659 != 128 || this.field1222.field1660 != 128) {
            var4.method215(this.field1222.field1659, this.field1222.field1659, this.field1241, this.field1222.field1660);
        }
        var4.method211(this.field1224, true);
        var4.method216(this.field1222.field1662 + 64, this.field1222.field1663 + 850, -30, -50, -30, true);
        if (arg0 != 0) {
            this.field1241 = !this.field1241;
        }
        return var4;
    }

    @OriginalMember(owner = "client!NZKYYWQJ", name = "a", descriptor = "(IIIZI)V")
    public final void method345(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (!this.field1246) {
            double var6 = (double) (arg4 - this.field1242);
            double var8 = (double) (arg2 - this.field1243);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1225 = (double) this.field1230 * var6 / var10 + (double) this.field1242;
            this.field1226 = (double) this.field1230 * var8 / var10 + (double) this.field1243;
            this.field1227 = this.field1244;
        }
        double var12 = (double) (this.field1233 + 1 - arg0);
        this.field1234 = ((double) arg4 - this.field1225) / var12;
        this.field1235 = ((double) arg2 - this.field1226) / var12;
        this.field1236 = Math.sqrt(this.field1235 * this.field1235 + this.field1234 * this.field1234);
        if (!this.field1246) {
            this.field1237 = -this.field1236 * Math.tan((double) this.field1229 * 0.02454369D);
        }
        this.field1228 = ((double) arg1 - this.field1227 - this.field1237 * var12) * 2.0D / (var12 * var12);
        if (!arg3) {
            this.field1221 = -14;
        }
    }

    @OriginalMember(owner = "client!NZKYYWQJ", name = "a", descriptor = "(IZ)V")
    public final void method346(int arg0, boolean arg1) {
        this.field1246 = true;
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1225 += (double) arg0 * this.field1234;
        this.field1226 += (double) arg0 * this.field1235;
        this.field1227 += this.field1228 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1237;
        this.field1237 += (double) arg0 * this.field1228;
        this.field1223 = (int) (Math.atan2(this.field1234, this.field1235) * 325.949D) + 1024 & 0x7FF;
        this.field1224 = (int) (Math.atan2(this.field1237, this.field1236) * 325.949D) & 0x7FF;
        if (this.field1222.field1656 == null) {
            return;
        }
        this.field1239 += arg0;
        while (this.field1239 > this.field1222.field1656.method567(0, this.field1238)) {
            this.field1239 -= this.field1222.field1656.method567(0, this.field1238) + 1;
            this.field1238++;
            if (this.field1238 >= this.field1222.field1656.field1694) {
                this.field1238 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!NZKYYWQJ", name = "<init>", descriptor = "(IIIIIIIIIIIB)V")
    public class38(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, byte arg11) {
        this.field1222 = class63.field1652[arg3];
        this.field1240 = arg2;
        this.field1242 = arg8;
        this.field1243 = arg5;
        this.field1244 = arg7;
        this.field1232 = arg9;
        if (arg11 != 22) {
            this.field1221 = -20;
        }
        this.field1233 = arg1;
        this.field1229 = arg0;
        this.field1230 = arg10;
        this.field1231 = arg4;
        this.field1245 = arg6;
        this.field1246 = false;
    }
}
