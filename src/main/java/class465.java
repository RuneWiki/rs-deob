import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class465 {

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "Ljf;")
    public class695 field6707 = null;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "[Lfj;")
    private class75[] field6708 = null;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "Ljf;")
    public class695 field6711 = null;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "[Lfj;")
    public class75[] field6705 = null;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "Lum;")
    private class528 field6710;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "Z")
    public boolean field6706;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field6712;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field6714;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)Z")
    public final boolean method2693(boolean arg0) {
        field6714++;
        if (!arg0) {
            return false;
        } else if (this.field6706) {
            return this.field6707 != null;
        } else {
            return this.field6705 != null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lum;)V")
    public class465(class528 arg0) {
        this.field6710 = arg0;
        this.field6706 = this.field6710.field7774;
        if (this.field6706 && !this.field6710.method794(class106.field1573, -115, class579.field8409)) {
            this.field6706 = false;
        }
        if (this.field6706 || this.field6710.method780(class579.field8409, class106.field1573, 116)) {
            class127.method912(0);
            if (this.field6706) {
                byte[] var6 = class360.method2217(false, -362969972, class492.field7004);
                this.field6707 = this.field6710.method802(119, 128, class579.field8409, 128, var6, 16);
                byte[] var7 = class360.method2217(false, -362969972, class684.field9644);
                this.field6710.method802(95, 128, class579.field8409, 128, var7, 16);
            } else {
                this.field6705 = new class75[16];
                for (int var2 = 0; var2 < 16; var2++) {
                    byte[] var5 = class135.method962(false, 32768, var2 * 128 * 256, class492.field7004);
                    this.field6705[var2] = this.field6710.method3009(var5, (byte) 62, 128, true, class579.field8409, 128);
                }
                this.field6708 = new class75[16];
                for (int var3 = 0; var3 < 16; var3++) {
                    byte[] var4 = class135.method962(false, 32768, var3 * 128 * 256, class684.field9644);
                    this.field6708[var3] = this.field6710.method3009(var4, (byte) 62, 128, true, class579.field8409, 128);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)Z")
    public final boolean method2694(byte arg0) {
        if (arg0 > -40) {
            this.method2693(true);
        }
        if (this.field6711 == null) {
            if (class654.field9357 == null) {
                byte[] var2 = class164.method1155(0.5F, 4.0F, 4.0F, 16, 16.0F, new class284(419684), (byte) -123, 0.6F, 128, 8, 128);
                class654.field9357 = class600.method3414(var2, false, true);
            }
            byte[] var3 = class360.method2217(false, -362969972, class654.field9357);
            byte[] var4 = new byte[var3.length * 4];
            int var5 = 0;
            for (int var6 = 0; var6 < 16; var6++) {
                int var7 = var6 * 128 * 128;
                int var8 = var7;
                for (int var9 = 0; var9 < 128; var9++) {
                    int var10 = var9 * 128 + var8;
                    int var11 = (var9 - 1 & 0x7F) * 128 + var8;
                    int var12 = (var9 + 1 & 0x7F) * 128 + var8;
                    for (int var13 = 0; var13 < 128; var13++) {
                        float var14 = (float) ((var3[var11 + var13] & 0xFF) - (var3[var12 + var13] & 0xFF));
                        float var15 = (float) ((var3[(var13 - 1 & 0x7F) + var10] & 0xFF) - (var3[var10 + (var13 + 1 & 0x7F)] & 0xFF));
                        float var16 = (float) (128.0D / Math.sqrt((double) (var14 * var14 + var15 * var15 + 16384.0F)));
                        var4[var5++] = (byte) ((int) (var15 * var16 + 127.0F));
                        var4[var5++] = (byte) ((int) (var16 * 128.0F + 127.0F));
                        var4[var5++] = (byte) ((int) (var14 * var16 + 127.0F));
                        var4[var5++] = var3[var7++];
                    }
                }
            }
            this.field6711 = this.field6710.method802(99, 128, class564.field8245, 128, var4, 16);
        }
        field6712++;
        return this.field6711 != null;
    }
}
