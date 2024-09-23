import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OXCIEWBY")
public class class45 extends class66 {

    @OriginalMember(owner = "OXCIEWBY", name = "v", descriptor = "I")
    private int field1256;

    @OriginalMember(owner = "OXCIEWBY", name = "w", descriptor = "I")
    private int field1257;

    @OriginalMember(owner = "OXCIEWBY", name = "x", descriptor = "I")
    private int field1258;

    @OriginalMember(owner = "OXCIEWBY", name = "n", descriptor = "I")
    private int field1248;

    @OriginalMember(owner = "OXCIEWBY", name = "u", descriptor = "I")
    private int field1255;

    @OriginalMember(owner = "OXCIEWBY", name = "o", descriptor = "I")
    private int field1249;

    @OriginalMember(owner = "OXCIEWBY", name = "p", descriptor = "I")
    private int field1250;

    @OriginalMember(owner = "OXCIEWBY", name = "q", descriptor = "I")
    private int field1251;

    @OriginalMember(owner = "OXCIEWBY", name = "z", descriptor = "LZGXCNUJM;")
    private class71 field1260;

    @OriginalMember(owner = "OXCIEWBY", name = "s", descriptor = "I")
    private int field1253;

    @OriginalMember(owner = "OXCIEWBY", name = "t", descriptor = "I")
    private int field1254;

    @OriginalMember(owner = "OXCIEWBY", name = "l", descriptor = "I")
    public int field1246;

    @OriginalMember(owner = "OXCIEWBY", name = "m", descriptor = "I")
    public int field1247;

    @OriginalMember(owner = "OXCIEWBY", name = "y", descriptor = "[I")
    public int[] field1259;

    @OriginalMember(owner = "OXCIEWBY", name = "r", descriptor = "Lclient;")
    public static client field1252;

    @OriginalMember(owner = "OXCIEWBY", name = "b", descriptor = "(B)LSRQVPDWQ;")
    public final class56 method384(byte arg0) {
        if (arg0 == 4) {
            boolean var2 = false;
        } else {
            this.field1255 = -237;
        }
        int var3 = -1;
        if (this.field1246 != -1) {
            class31 var4 = class31.field1035[this.field1246];
            int var5 = var4.field1037;
            int var6 = var4.field1038;
            int var7 = var4.field1039;
            int var8 = client.field554[var7 - var6];
            var3 = field1252.field588[var5] >> var6 & var8;
        } else if (this.field1247 != -1) {
            var3 = field1252.field588[this.field1247];
        }
        return var3 < 0 || var3 >= this.field1259.length || this.field1259[var3] == -1 ? null : class56.method445(this.field1259[var3]);
    }

    @OriginalMember(owner = "OXCIEWBY", name = "a", descriptor = "(B)LSNMMQNPZ;")
    public final class55 method175(byte arg0) {
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        int var2 = -1;
        if (this.field1260 != null) {
            int var3 = client.field438 - this.field1254;
            if (var3 > 100 && this.field1260.field1732 > 0) {
                var3 = 100;
            }
            label44: {
                do {
                    do {
                        if (var3 <= this.field1260.method598(this.field1253, -818)) {
                            break label44;
                        }
                        var3 -= this.field1260.method598(this.field1253, -818);
                        this.field1253++;
                    } while (this.field1253 < this.field1260.field1728);
                    this.field1253 -= this.field1260.field1732;
                } while (this.field1253 >= 0 && this.field1253 < this.field1260.field1728);
                this.field1260 = null;
            }
            this.field1254 = client.field438 - var3;
            if (this.field1260 != null) {
                var2 = this.field1260.field1729[this.field1253];
            }
        }
        class56 var4;
        if (this.field1259 == null) {
            var4 = class56.method445(this.field1256);
        } else {
            var4 = this.method384((byte) 4);
        }
        return var4 == null ? null : var4.method446(this.field1257, this.field1258, this.field1248, this.field1249, this.field1250, this.field1251, var2);
    }

    @OriginalMember(owner = "OXCIEWBY", name = "<init>", descriptor = "(IIIIIIIIZI)V")
    public class45(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field1256 = arg6;
        this.field1257 = arg9;
        this.field1258 = arg4;
        this.field1248 = arg1;
        if (arg0 != 0) {
            this.field1255 = 235;
        }
        this.field1249 = arg2;
        this.field1250 = arg5;
        this.field1251 = arg7;
        if (arg3 != -1) {
            this.field1260 = class71.field1727[arg3];
            this.field1253 = 0;
            this.field1254 = client.field438;
            if (arg8 && this.field1260.field1732 != -1) {
                this.field1253 = (int) (Math.random() * (double) this.field1260.field1728);
                this.field1254 -= (int) (Math.random() * (double) this.field1260.method598(this.field1253, -818));
            }
        }
        class56 var11 = class56.method445(this.field1256);
        this.field1246 = var11.field1441;
        this.field1247 = var11.field1454;
        this.field1259 = var11.field1436;
    }
}
