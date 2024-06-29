import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class190 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "[Lls;")
    private class459[] field2368 = null;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Lfl;")
    public class187 field2369 = null;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "[Lls;")
    public class459[] field2370 = null;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "Lfl;")
    public class187 field2375 = null;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "Len;")
    private class478 field2376;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Z")
    public boolean field2372;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "Ltb;")
    public static class450 field2377 = new class450(260);

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "[I")
    public static int[] field2378 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)Z", line = 3)
    public final boolean method1155(boolean arg0) {
        if (this.field2375 == null) {
            if (class252.field3088 == null) {
                byte[] var2 = class383.method2067(0, 8, 16.0F, 16, 0.5F, 0.6F, 4.0F, 128, 128, new class475(419684), 4.0F);
                class252.field3088 = class57.method357(-137, var2, false);
            }
            byte[] var3 = class542.method2924(-7374, false, class252.field3088);
            byte[] var4 = new byte[var3.length * 4];
            int var5 = 0;
            for (int var6 = 0; var6 < 16; var6++) {
                int var7 = var6 * 128 * 128;
                int var8 = var7;
                for (int var9 = 0; var9 < 128; var9++) {
                    int var10 = var8 + (var9 * 128);
                    int var11 = (var9 - 1 & 0x7F) * 128 + var8;
                    int var12 = (var9 + 1 & 0x7F) * 128 + var8;
                    for (int var13 = 0; var13 < 128; var13++) {
                        float var14 = (float) ((var3[var11 + var13] & 0xFF) - (var3[var12 + var13] & 0xFF));
                        float var15 = (float) ((var3[var10 + (var13 - 1 & 0x7F)] & 0xFF) - (var3[(var13 + 1 & 0x7F) + var10] & 0xFF));
                        float var16 = (float) (128.0D / Math.sqrt((double) (var14 * var14 + var15 * var15 + 16384.0F)));
                        var4[var5++] = (byte) ((int) (var15 * var16 + 127.0F));
                        var4[var5++] = (byte) ((int) (var16 * 128.0F + 127.0F));
                        var4[var5++] = (byte) ((int) (var14 * var16 + 127.0F));
                        var4[var5++] = var3[var7++];
                    }
                }
            }
            this.field2375 = this.field2376.method1732(-13331, var4, 128, 16, class590.field8288, 128);
        }
        if (!arg0) {
            this.field2370 = null;
        }
        field2371++;
        return this.field2375 != null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)Z", line = 78)
    public final boolean method1156(byte arg0) {
        if (arg0 > -21) {
            field2377 = null;
        }
        field2374++;
        if (this.field2372) {
            return this.field2369 != null;
        } else {
            return this.field2370 != null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Len;)V", line = 138)
    public class190(class478 arg0) {
        this.field2376 = arg0;
        this.field2372 = this.field2376.field6327;
        if (this.field2372 && !this.field2376.method1712(class307.field3905, class117.field1509, 12)) {
            this.field2372 = false;
        }
        if (this.field2372 || this.field2376.method1687(100, class117.field1509, class307.field3905)) {
            class391.method2100(-6899);
            if (this.field2372) {
                byte[] var6 = class542.method2924(-7374, false, class86.field1212);
                this.field2369 = this.field2376.method1732(-13331, var6, 128, 16, class307.field3905, 128);
                byte[] var7 = class542.method2924(-7374, false, class304.field3738);
                this.field2376.method1732(-13331, var7, 128, 16, class307.field3905, 128);
            } else {
                this.field2370 = new class459[16];
                for (int var2 = 0; var2 < 16; var2++) {
                    byte[] var5 = class242.method1447(32768, (byte) 121, var2 * 128 * 256, class86.field1212);
                    this.field2370[var2] = this.field2376.method2592(var5, 128, 128, class307.field3905, true, (byte) 73);
                }
                this.field2368 = new class459[16];
                for (int var3 = 0; var3 < 16; var3++) {
                    byte[] var4 = class242.method1447(32768, (byte) 121, var3 * 128 * 256, class304.field3738);
                    this.field2368[var3] = this.field2376.method2592(var4, 128, 128, class307.field3905, true, (byte) 73);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 95)
    public static void method1157(int arg0) {
        field2378 = null;
        if (arg0 < 103) {
            method1157(-53);
        }
        field2377 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/net/Socket;I)Lfm;", line = 128)
    public static final class204 method1158(int arg0, Socket arg1, int arg2) throws IOException {
        field2373++;
        if (arg0 > -71) {
            field2378 = null;
        }
        return new class657(arg1, arg2);
    }
}
