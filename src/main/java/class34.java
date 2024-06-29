import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class34 {

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "[Lwda;")
    private class636[] field444 = null;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "Lii;")
    public class550 field440 = null;

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "[Lwda;")
    public class636[] field443 = null;

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "Lii;")
    public class550 field448 = null;

    @OriginalMember(owner = "client!wv", name = "l", descriptor = "Lgt;")
    private class453 field451;

    @OriginalMember(owner = "client!wv", name = "m", descriptor = "Z")
    public boolean field452;

    @OriginalMember(owner = "client!wv", name = "k", descriptor = "Z")
    public static boolean field450 = false;

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "[Ljava/awt/Color;")
    public static Color[] field446 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

    @OriginalMember(owner = "client!wv", name = "o", descriptor = "Z")
    public static boolean field454 = false;

    @OriginalMember(owner = "client!wv", name = "n", descriptor = "Lqaa;")
    public static class27 field453 = new class27(18, 3);

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!wv", name = "p", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!wv", name = "q", descriptor = "Lav;")
    public static class637 field456;

    @OriginalMember(owner = "client!wv", name = "r", descriptor = "[I")
    public static int[] field457;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILti;)I")
    public static final int method218(int arg0, class438 arg1) {
        if (arg0 != 255) {
            return 127;
        }
        field441++;
        if (class438.field6111 == arg1) {
            return 5120;
        } else if (class438.field6115 == arg1) {
            return 5122;
        } else if (class438.field6116 == arg1) {
            return 5124;
        } else if (class438.field6117 == arg1) {
            return 5121;
        } else if (class438.field6118 == arg1) {
            return 5123;
        } else if (class438.field6119 == arg1) {
            return 5125;
        } else if (class438.field6120 == arg1) {
            return 5131;
        } else if (class438.field6121 == arg1) {
            return 5126;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)Z")
    public final boolean method219(int arg0) {
        if (arg0 != -14072) {
            return true;
        }
        field445++;
        if (this.field452) {
            return this.field440 != null;
        } else {
            return this.field443 != null;
        }
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)Lae;")
    public static final class250 method220(int arg0) {
        if (arg0 < 61) {
            method220(50);
        }
        field447++;
        return class284.field4029;
    }

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "(I)V")
    public static void method221(int arg0) {
        if (arg0 != -22805) {
            field455 = -71;
        }
        field456 = null;
        field446 = null;
        field457 = null;
        field453 = null;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)Z")
    public final boolean method222(byte arg0) {
        field449++;
        if (arg0 != -21) {
            field453 = null;
        }
        if (this.field448 == null) {
            if (class126.field1917 == null) {
                byte[] var2 = class677.method3831(4.0F, new class579(419684), 16, 8, 0.6F, 16.0F, 0.5F, 4.0F, 128, 128, 2046);
                class126.field1917 = class187.method1323(100, false, var2);
            }
            byte[] var3 = class47.method425(class126.field1917, (byte) 25, false);
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
                        float var15 = (float) ((var3[(var13 - 1 & 0x7F) + var10] & 0xFF) - (var3[var10 + (var13 + 1 & 0x7F)] & 0xFF));
                        float var16 = (float) (128.0D / Math.sqrt((double) (var14 * var14 + var15 * var15 + 16384.0F)));
                        var4[var5++] = (byte) ((int) (var15 * var16 + 127.0F));
                        var4[var5++] = (byte) ((int) (var16 * 128.0F + 127.0F));
                        var4[var5++] = (byte) ((int) (var14 * var16 + 127.0F));
                        var4[var5++] = var3[var7++];
                    }
                }
            }
            this.field448 = this.field451.method1060(class282.field4019, 128, (byte) -100, 16, var4, 128);
        }
        return this.field448 != null;
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lgt;)V")
    public class34(class453 arg0) {
        this.field451 = arg0;
        this.field452 = this.field451.field6465;
        if (this.field452 && !this.field451.method1013((byte) -19, class438.field6117, class98.field1673)) {
            this.field452 = false;
        }
        if (this.field452 || this.field451.method1035(-101, class438.field6117, class98.field1673)) {
            class392.method2441(128);
            if (this.field452) {
                byte[] var6 = class47.method425(class317.field4499, (byte) 82, false);
                this.field440 = this.field451.method1060(class98.field1673, 128, (byte) 125, 16, var6, 128);
                byte[] var7 = class47.method425(class452.field6236, (byte) -122, false);
                this.field451.method1060(class98.field1673, 128, (byte) 125, 16, var7, 128);
            } else {
                this.field443 = new class636[16];
                for (int var2 = 0; var2 < 16; var2++) {
                    byte[] var5 = class138.method1098(var2 * 128 * 128 * 2, class317.field4499, (byte) 45, 32768);
                    this.field443[var2] = this.field451.method2750(var5, true, 128, class98.field1673, 128, -89);
                }
                this.field444 = new class636[16];
                for (int var3 = 0; var3 < 16; var3++) {
                    byte[] var4 = class138.method1098(var3 * 128 * 2 * 128, class452.field6236, (byte) 94, 32768);
                    this.field444[var3] = this.field451.method2750(var4, true, 128, class98.field1673, 128, -89);
                }
            }
        }
    }
}
