import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class67 {

    @OriginalMember(owner = "client!no", name = "d", descriptor = "[Lrm;")
    public class90[] field1052 = null;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "[Lrm;")
    private class90[] field1053 = null;

    @OriginalMember(owner = "client!no", name = "g", descriptor = "Luc;")
    public class123 field1055 = null;

    @OriginalMember(owner = "client!no", name = "j", descriptor = "Luc;")
    public class123 field1058 = null;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "Lpj;")
    private class38 field1051;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "Z")
    public boolean field1050;

    @OriginalMember(owner = "client!no", name = "f", descriptor = "I")
    public static int field1054 = 0;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!no", name = "h", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!no", name = "i", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)Z")
    public final boolean method645(boolean arg0) {
        if (this.field1055 == null) {
            if (class671.field9494 == null) {
                byte[] var2 = class332.method2133(0, 128, 16.0F, 8, 4.0F, new class594(419684), 0.5F, 16, 128, 4.0F, 0.6F);
                class671.field9494 = class48.method481(var2, 112, false);
            }
            byte[] var3 = class512.method3076(class671.field9494, 10583, false);
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
                        float var15 = (float) ((var3[(var13 - 1 & 0x7F) + var10] & 0xFF) - (var3[(var13 + 1 & 0x7F) + var10] & 0xFF));
                        float var16 = (float) (128.0D / Math.sqrt((double) (var14 * var14 + var15 * var15 + 16384.0F)));
                        var4[var5++] = (byte) ((int) (var15 * var16 + 127.0F));
                        var4[var5++] = (byte) ((int) (var16 * 128.0F + 127.0F));
                        var4[var5++] = (byte) ((int) (var14 * var16 + 127.0F));
                        var4[var5++] = var3[var7++];
                    }
                }
            }
            this.field1055 = this.field1051.method408(var4, (byte) -91, class238.field3830, 128, 128, 16);
        }
        field1049++;
        if (!arg0) {
            this.method646((byte) -47);
        }
        return this.field1055 != null;
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lpj;)V")
    public class67(class38 arg0) {
        this.field1051 = arg0;
        this.field1050 = this.field1051.field574;
        if (this.field1050 && !this.field1051.method430(73, class13.field129, class121.field1859)) {
            this.field1050 = false;
        }
        if (this.field1050 || this.field1051.method399(18154, class121.field1859, class13.field129)) {
            class272.method1790(-122);
            if (this.field1050) {
                byte[] var6 = class512.method3076(class685.field9684, 10583, false);
                this.field1058 = this.field1051.method408(var6, (byte) -91, class13.field129, 128, 128, 16);
                byte[] var7 = class512.method3076(class289.field4447, 10583, false);
                this.field1051.method408(var7, (byte) -91, class13.field129, 128, 128, 16);
            } else {
                this.field1052 = new class90[16];
                for (int var2 = 0; var2 < 16; var2++) {
                    byte[] var5 = class150.method1146(32768, var2 * 128 * 256, class685.field9684, (byte) 113);
                    this.field1052[var2] = this.field1051.method391(var5, 128, true, class13.field129, 128, -24);
                }
                this.field1053 = new class90[16];
                for (int var3 = 0; var3 < 16; var3++) {
                    byte[] var4 = class150.method1146(32768, var3 * 128 * 128 * 2, class289.field4447, (byte) 113);
                    this.field1053[var3] = this.field1051.method391(var4, 128, true, class13.field129, 128, 118);
                }
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)Z")
    public final boolean method646(byte arg0) {
        field1057++;
        if (arg0 != 75) {
            this.field1052 = null;
        }
        if (this.field1050) {
            return this.field1058 != null;
        } else {
            return this.field1052 != null;
        }
    }
}
