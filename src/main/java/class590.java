import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class590 {

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Lhga;")
    private class197 field8468 = null;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    private int field8473 = 65000;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Lhga;")
    private class197 field8471 = null;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    private int field8469;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field8466;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field8467;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field8470;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field8472;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field8474;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field8475;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "[[B")
    public static byte[][] field8476;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static void method3457(int arg0) {
        if (arg0 != 7) {
            method3461(null, -69);
        }
        field8476 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)[B")
    public final byte[] method3458(int arg0, int arg1) {
        field8466++;
        class197 var3 = this.field8468;
        synchronized (this.field8468) {
            try {
                if (arg0 != 14894) {
                    this.field8468 = null;
                }
                if ((long) (arg1 * 6 + 6) > this.field8471.method1404((byte) 97)) {
                    return null;
                }
                this.field8471.method1400((long) (arg1 * 6), (byte) 2);
                this.field8471.method1397(6, false, class579.field8342, 0);
                int var5 = (class579.field8342[1] & 0xFF << 8) + (((class579.field8342[0] & 0xFF) << 16) + (class579.field8342[2] & 0xFF));
                int var6 = ((class579.field8342[4] & 0xFF) << 8) + ((class579.field8342[3] & 0xFF << 16) + (class579.field8342[5] & 0xFF));
                if (var5 < 0 || this.field8473 < var5) {
                    return null;
                } else if (var6 > 0 && ((long) var6) <= (this.field8468.method1404((byte) 97) / 520L)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field8468.method1400((long) (var6 * 520), (byte) 2);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field8468.method1397(var13 + 8, false, class579.field8342, 0);
                        int var14 = ((class579.field8342[0] & 0xFF) << 8) + (class579.field8342[1] & 0xFF);
                        int var15 = (class579.field8342[2] & 0xFF << 8) + (class579.field8342[3] & 0xFF);
                        int var16 = (class579.field8342[5] & 0xFF << 8) + ((class579.field8342[4] & 0xFF << 16) + (class579.field8342[6] & 0xFF));
                        int var17 = class579.field8342[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field8469 == var17) {
                            if (var16 >= 0 && (this.field8468.method1404((byte) 97) / 520L) >= ((long) var16)) {
                                var11++;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class579.field8342[var20 + 8];
                                }
                                var6 = var16;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z[BIII)Z")
    private final boolean method3459(boolean arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -1136743032) {
            return true;
        }
        field8470++;
        class197 var6 = this.field8468;
        synchronized (this.field8468) {
            try {
                int var7;
                if (arg0) {
                    if (this.field8471.method1404((byte) 97) < (long) (arg3 * 6 + 6)) {
                        return false;
                    }
                    this.field8471.method1400((long) (arg3 * 6), (byte) 2);
                    this.field8471.method1397(6, false, class579.field8342, 0);
                    var7 = (class579.field8342[5] & 0xFF) + ((class579.field8342[3] & 0xFF << 16) + (class579.field8342[4] & 0xFF << 8));
                    if (var7 <= 0 || ((long) var7) > (this.field8468.method1404((byte) 97) / 520L)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field8468.method1404((byte) 97) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class579.field8342[5] = (byte) var7;
                class579.field8342[4] = (byte) (var7 >> 8);
                class579.field8342[0] = (byte) (arg4 >> 16);
                class579.field8342[2] = (byte) arg4;
                class579.field8342[3] = (byte) (var7 >> 16);
                class579.field8342[1] = (byte) (arg4 >> 8);
                this.field8471.method1400((long) (arg3 * 6), (byte) 2);
                this.field8471.method1401(6, 0, -1, class579.field8342);
                int var10 = 0;
                int var11 = 0;
                while (var10 < arg4) {
                    int var12 = 0;
                    if (arg0) {
                        label110: {
                            this.field8468.method1400((long) (var7 * 520), (byte) 2);
                            try {
                                this.field8468.method1397(8, false, class579.field8342, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class579.field8342[0] & 0xFF << 8) + (class579.field8342[1] & 0xFF);
                            int var14 = (class579.field8342[2] & 0xFF << 8) + (class579.field8342[3] & 0xFF);
                            var12 = (class579.field8342[4] & 0xFF << 16) - (-((class579.field8342[5] & 0xFF) << 8) - (class579.field8342[6] & 0xFF));
                            int var15 = class579.field8342[7] & 0xFF;
                            if (arg3 == var13 && var11 == var14 && this.field8469 == var15) {
                                if (var12 >= 0 && (this.field8468.method1404((byte) 97) / 520L) >= ((long) var12)) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg0 = false;
                        var12 = (int) ((this.field8468.method1404((byte) 97) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class579.field8342[3] = (byte) var11;
                    if ((arg4 - var10) <= 512) {
                        var12 = 0;
                    }
                    class579.field8342[0] = (byte) (arg3 >> 8);
                    class579.field8342[1] = (byte) arg3;
                    class579.field8342[2] = (byte) (var11 >> 8);
                    class579.field8342[4] = (byte) (var12 >> 16);
                    class579.field8342[6] = (byte) var12;
                    class579.field8342[7] = (byte) this.field8469;
                    class579.field8342[5] = (byte) (var12 >> 8);
                    this.field8468.method1400((long) (var7 * 520), (byte) 2);
                    this.field8468.method1401(8, 0, arg2 + 1136743031, class579.field8342);
                    int var18 = arg4 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field8468.method1401(var18, var10, -1, arg1);
                    var10 += var18;
                    var7 = var12;
                    var11++;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B[BII)Z")
    public final boolean method3460(byte arg0, byte[] arg1, int arg2, int arg3) {
        field8467++;
        class197 var5 = this.field8468;
        synchronized (this.field8468) {
            if (arg3 < 0 || arg3 > this.field8473) {
                throw new IllegalArgumentException();
            }
            if (arg0 >= -79) {
                method3457(-45);
            }
            boolean var6 = this.method3459(true, arg1, -1136743032, arg2, arg3);
            if (!var6) {
                var6 = this.method3459(false, arg1, -1136743032, arg2, arg3);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "([BI)Lmq;")
    public static final class85 method3461(byte[] arg0, int arg1) {
        field8472++;
        if (arg0 == null) {
            throw new RuntimeException("");
        }
        if (arg1 != -6394) {
            method3457(73);
        }
        while (true) {
            try {
                Image var2 = Toolkit.getDefaultToolkit().createImage(arg0);
                MediaTracker var3 = new MediaTracker(class199.field2988);
                var3.addImage(var2, 0);
                var3.waitForAll();
                int var4 = var2.getWidth(class199.field2988);
                int var5 = var2.getHeight(class199.field2988);
                if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                    int[] var6 = new int[var4 * var5];
                    PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                    var7.grabPixels();
                    return class686.field9702.method2773(1, var4, var6, 0, var5, var4);
                }
                throw new RuntimeException("");
            } catch (InterruptedException var8) {
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(ILhga;Lhga;I)V")
    public class590(int arg0, class197 arg1, class197 arg2, int arg3) {
        this.field8473 = arg3;
        this.field8469 = arg0;
        this.field8468 = arg1;
        this.field8471 = arg2;
    }

    @OriginalMember(owner = "client!ce", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8475++;
        return "Cache:" + this.field8469;
    }
}
