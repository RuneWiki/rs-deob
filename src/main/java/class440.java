import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class440 {

    @OriginalMember(owner = "client!uw", name = "h", descriptor = "Lvga;")
    public class94 field5973 = null;

    @OriginalMember(owner = "client!uw", name = "e", descriptor = "[Lgl;")
    public class627[] field5970 = null;

    @OriginalMember(owner = "client!uw", name = "f", descriptor = "[Lgl;")
    private class627[] field5971 = null;

    @OriginalMember(owner = "client!uw", name = "j", descriptor = "Lvga;")
    public class94 field5975 = null;

    @OriginalMember(owner = "client!uw", name = "g", descriptor = "Lsf;")
    private class551 field5972;

    @OriginalMember(owner = "client!uw", name = "i", descriptor = "Z")
    public boolean field5974;

    @OriginalMember(owner = "client!uw", name = "l", descriptor = "I")
    public static int field5977 = 0;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "I")
    public static int field5966;

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!uw", name = "d", descriptor = "I")
    public static int field5969;

    @OriginalMember(owner = "client!uw", name = "k", descriptor = "I")
    public static int field5976;

    @OriginalMember(owner = "client!uw", name = "m", descriptor = "I")
    public static int field5978;

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "Lkc;")
    public static class145 field5967;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)Z")
    public final boolean method2561(int arg0) {
        if (this.field5975 == null) {
            if (class665.field9236 == null) {
                byte[] var2 = class343.method2130(128, 0.6F, 0.5F, new class141(419684), 0, 16, 4.0F, 8, 4.0F, 16.0F, 128);
                class665.field9236 = class513.method2938(var2, false, -53);
            }
            byte[] var3 = class734.method4075((byte) 106, class665.field9236, false);
            byte[] var4 = new byte[var3.length * 4];
            int var5 = 0;
            for (int var6 = 0; var6 < 16; var6++) {
                int var7 = var6 * 128 * 128;
                int var8 = var7;
                for (int var9 = 0; var9 < 128; var9++) {
                    int var10 = var9 * 128 + var8;
                    int var11 = (var9 - 1 & 0x7F) * 128 + var8;
                    int var12 = var8 + ((var9 + 1 & 0x7F) * 128);
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
            this.field5975 = this.field5972.method857(128, var4, 16, class530.field7176, 0, 128);
        }
        field5966++;
        if (arg0 != 14864) {
            this.method2564(8);
        }
        return this.field5975 != null;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "([ILgj;BLgj;)V")
    public static final void method2562(int[] arg0, class662 arg1, byte arg2, class662 arg3) {
        class3.field40 = arg1;
        if (arg2 != 3) {
            return;
        }
        field5968++;
        class488.field6592 = arg3;
        if (arg0 != null) {
            class668.field9303 = arg0;
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Z)V")
    public static void method2563(boolean arg0) {
        if (arg0) {
            method2566(-70, (byte) -107);
        }
        field5967 = null;
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(I)Z")
    public final boolean method2564(int arg0) {
        if (arg0 != 128) {
            method2566(-69, (byte) -126);
        }
        field5969++;
        if (this.field5974) {
            return this.field5973 != null;
        } else {
            return this.field5970 != null;
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(II)V")
    public static final void method2565(int arg0, int arg1) {
        class210.field3141 = -1;
        class499.field6826 = -1;
        class215.field3194 = arg0;
        field5978++;
        if (arg1 == -13157) {
            class538.method3044(-116);
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IB)V")
    public static final void method2566(int arg0, byte arg1) {
        class499.field6826 = -1;
        if (arg1 > -95) {
            method2562(null, null, (byte) 47, null);
        }
        if (arg0 == 37) {
            class64.field890 = 3.0F;
        } else if (arg0 == 50) {
            class64.field890 = 4.0F;
        } else if (arg0 == 75) {
            class64.field890 = 6.0F;
        } else if (arg0 == 100) {
            class64.field890 = 8.0F;
        } else if (arg0 == 200) {
            class64.field890 = 16.0F;
        }
        field5976++;
        class499.field6826 = -1;
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(Lsf;)V")
    public class440(class551 arg0) {
        this.field5972 = arg0;
        this.field5974 = this.field5972.field7724;
        if (this.field5974 && !this.field5972.method817(class159.field2562, (byte) -87, class497.field6799)) {
            this.field5974 = false;
        }
        if (this.field5974 || this.field5972.method810(class497.field6799, true, class159.field2562)) {
            class577.method3328(-85);
            if (this.field5974) {
                byte[] var6 = class734.method4075((byte) 125, class706.field9696, false);
                this.field5973 = this.field5972.method857(128, var6, 16, class159.field2562, 0, 128);
                byte[] var7 = class734.method4075((byte) 110, class684.field9517, false);
                this.field5972.method857(128, var7, 16, class159.field2562, 0, 128);
            } else {
                this.field5970 = new class627[16];
                for (int var2 = 0; var2 < 16; var2++) {
                    byte[] var5 = class757.method4189(class706.field9696, var2 * 128 * 256, 32768, (byte) -10);
                    this.field5970[var2] = this.field5972.method3154(class159.field2562, 128, (byte) 125, 128, var5, true);
                }
                this.field5971 = new class627[16];
                for (int var3 = 0; var3 < 16; var3++) {
                    byte[] var4 = class757.method4189(class684.field9517, var3 * 128 * 2 * 128, 32768, (byte) -10);
                    this.field5971[var3] = this.field5972.method3154(class159.field2562, 128, (byte) 90, 128, var4, true);
                }
            }
        }
    }
}
