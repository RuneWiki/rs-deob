import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class537 {

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "Lir;")
    public class26 field7422 = null;

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "Lir;")
    public class26 field7425 = null;

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "[Lwfa;")
    private class200[] field7424 = null;

    @OriginalMember(owner = "client!ur", name = "j", descriptor = "[Lwfa;")
    public class200[] field7429 = null;

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "Lwga;")
    private class745 field7427;

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "Z")
    public boolean field7428;

    @OriginalMember(owner = "client!ur", name = "m", descriptor = "F")
    public static float field7432;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "I")
    public static int field7420;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
    public static int field7421;

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "I")
    public static int field7426;

    @OriginalMember(owner = "client!ur", name = "k", descriptor = "I")
    public static int field7430;

    @OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
    public static int field7431;

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "Lrv;")
    public static class111 field7423;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)Z")
    public final boolean method3090(int arg0) {
        field7431++;
        if (arg0 < 81) {
            this.field7422 = null;
        }
        if (this.field7428) {
            return this.field7422 != null;
        } else {
            return this.field7429 != null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZ)V")
    public static final void method3091(int arg0, boolean arg1) {
        class681.field9222 = arg0;
        if (!arg1) {
            field7432 = -0.54794437F;
        }
        field7420++;
        class112 var2 = class755.field10551;
        synchronized (class755.field10551) {
            class755.field10551.method999(0);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)Z")
    public final boolean method3092(byte arg0) {
        if (arg0 < 42) {
            field7432 = 2.1357973F;
        }
        if (this.field7425 == null) {
            if (class168.field2639 == null) {
                byte[] var2 = class608.method3455(128, -1922, 8, 0.6F, 128, 4.0F, 4.0F, 0.5F, 16.0F, new class453(419684), 16);
                class168.field2639 = class727.method4021(var2, false, (byte) 87);
            }
            byte[] var3 = class216.method1547(false, class168.field2639, 53146732);
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
            this.field7425 = this.field7427.method2253(16, 128, class746.field10332, true, 128, var4);
        }
        field7426++;
        return this.field7425 != null;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(B)V")
    public static void method3093(byte arg0) {
        if (arg0 == -67) {
            field7423 = null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lwga;)V")
    public class537(class745 arg0) {
        this.field7427 = arg0;
        this.field7428 = this.field7427.field10273;
        if (this.field7428 && !this.field7427.method2279(true, class16.field267, class523.field7249)) {
            this.field7428 = false;
        }
        if (this.field7428 || this.field7427.method2249(class523.field7249, class16.field267, (byte) 123)) {
            class349.method2193((byte) -126);
            if (this.field7428) {
                byte[] var6 = class216.method1547(false, class382.field5545, 53146732);
                this.field7422 = this.field7427.method2253(16, 128, class16.field267, true, 128, var6);
                byte[] var7 = class216.method1547(false, class70.field1291, 53146732);
                this.field7427.method2253(16, 128, class16.field267, true, 128, var7);
            } else {
                this.field7429 = new class200[16];
                for (int var2 = 0; var2 < 16; var2++) {
                    byte[] var5 = class742.method4071((byte) 100, class382.field5545, var2 * 128 * 2 * 128, 32768);
                    this.field7429[var2] = this.field7427.method4155(var5, 128, class16.field267, 2, true, 128);
                }
                this.field7424 = new class200[16];
                for (int var3 = 0; var3 < 16; var3++) {
                    byte[] var4 = class742.method4071((byte) 120, class70.field1291, var3 * 128 * 128 * 2, 32768);
                    this.field7424[var3] = this.field7427.method4155(var4, 128, class16.field267, 2, true, 128);
                }
            }
        }
    }
}
