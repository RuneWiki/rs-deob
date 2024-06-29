import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class552 {

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public int field8128;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "[[Z")
    public static boolean[][] field8126 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "[I")
    public static int[] field8129 = new int[4096];

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field8120;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field8121;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field8123;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field8124;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field8125;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field8127;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "Let;")
    public static class509 field8122;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[BZI)Ljava/lang/String;")
    public static final String method3228(int arg0, byte[] arg1, boolean arg2, int arg3) {
        field8121++;
        char[] var4 = new char[arg3];
        if (arg2) {
            method3228(-5, null, true, -49);
        }
        int var5 = 0;
        int var6 = arg0 + arg3;
        for (int var7 = arg0; var7 < var6; var7++) {
            int var8 = arg1[var7] & 0xFF;
            if (var8 >= 128) {
                if (var8 < 194) {
                    throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var8);
                }
                if (var8 >= 224) {
                    if (var8 < 240) {
                        if (var6 <= var7 + 2) {
                            throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                        }
                        var7++;
                        int var9 = arg1[var7] & 0xFF;
                        if (var9 >= 128 && var9 <= 191) {
                            var7++;
                            int var10 = arg1[var7] & 0xFF;
                            if (var10 >= 128 && var10 <= 191) {
                                var4[var5++] = (char) class42.method223(class42.method223(class288.method1624(var8 << 12, -921600), class288.method1624(var9, -129) << 6), class288.method1624(var10, -129));
                                continue;
                            }
                            throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                        }
                        throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                    }
                    if (var8 >= 244) {
                        throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var8);
                    }
                    throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                } else if (var7 + 1 < var6) {
                    var7++;
                    int var11 = arg1[var7] & 0xFF;
                    if (var11 < 128 || var11 > 191) {
                        throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                    }
                    var4[var5++] = (char) class42.method223(class288.method1624(-12352, var8 << 6), class288.method1624(var11, -129));
                } else {
                    throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                }
            } else {
                var4[var5++] = (char) var8;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLmh;)V")
    public static final void method3229(byte arg0, class537 arg1) {
        field8127++;
        if (class476.field6693 == null) {
            class560 var2 = new class560();
            byte[] var3 = var2.method3271(128, 4096, 128, 16);
            class476.field6693 = class256.method1444((byte) 94, false, var3);
        }
        if (class646.field9398 == null) {
            class199 var4 = new class199();
            byte[] var5 = var4.method1076(0, 128, 128, 16);
            class646.field9398 = class256.method1444((byte) 95, false, var5);
        }
        if (arg0 >= -62) {
            return;
        }
        class583 var6 = arg1.field7735;
        if (var6.method3392(25059) && class458.field6306 == null) {
            byte[] var7 = class367.method2057(0.5F, 16, 128, 128, new class86(419684), 8, 16.0F, (byte) 81, 4.0F, 0.6F, 4.0F);
            class458.field6306 = class256.method1444((byte) 96, false, var7);
        }
    }

    @OriginalMember(owner = "client!lc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8125++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)I")
    public final int method3230(int arg0) {
        if (arg0 != 13) {
            method3232(null, false, 85, 72, null, null, null);
        }
        field8124++;
        return this.field8128;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public static void method3231(int arg0) {
        field8122 = null;
        int var1 = -12 % ((arg0 - 71) / 45);
        field8126 = null;
        field8129 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/awt/Color;ZIILjava/awt/Color;Ljava/awt/Color;Ljava/lang/String;)V")
    public static final void method3232(Color arg0, boolean arg1, int arg2, int arg3, Color arg4, Color arg5, String arg6) {
        try {
            Graphics var7 = class41.field331.getGraphics();
            if (class367.field4831 == null) {
                class367.field4831 = new Font("Helvetica", 1, 13);
            }
            if (arg1) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class185.field2239, class426.field5495);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(255, 255, 255);
            }
            try {
                if (class60.field588 == null) {
                    class60.field588 = class41.field331.createImage(304, 34);
                }
                Graphics var8 = class60.field588.getGraphics();
                var8.setColor(arg5);
                var8.drawRect(0, arg2, 303, 33);
                var8.setColor(arg4);
                var8.fillRect(2, 2, arg3 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg3 * 3 + 2, 2, 300 - (arg3 * 3), 30);
                var8.setFont(class367.field4831);
                var8.setColor(arg0);
                var8.drawString(arg6, (304 - (arg6.length() * 6)) / 2, 22);
                var7.drawImage(class60.field588, class185.field2239 / 2 - 152, class426.field5495 / 2 + -18, null);
            } catch (Exception var11) {
                int var9 = class185.field2239 / 2 - 152;
                int var10 = class426.field5495 / 2 - 18;
                var7.setColor(arg5);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg4);
                var7.fillRect(var9 + 2, var10 + 2, arg3 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 + 1, 301, 31);
                var7.fillRect(arg3 * 3 + var9 + 2, var10 + 2, 300 - (arg3 * 3), 30);
                var7.setFont(class367.field4831);
                var7.setColor(arg0);
                var7.drawString(arg6, (304 - (arg6.length() * 6)) / 2 + var9, var10 - -22);
            }
            if (class79.field941 != null) {
                var7.setFont(class367.field4831);
                var7.setColor(arg0);
                var7.drawString(class79.field941, class185.field2239 / 2 - class79.field941.length() * 6 / 2, class426.field5495 / 2 + -26);
            }
        } catch (Exception var12) {
            class41.field331.repaint();
        }
        field8123++;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class552(String arg0, int arg1) {
        this.field8128 = arg1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)I")
    public static final int method3233(int arg0, int arg1, int arg2) {
        field8120++;
        if (class281.field3691 == -1) {
            return 1;
        }
        if (class529.field7429 != arg0) {
            class24.method144(-2, arg0);
            if (class529.field7429 != arg0) {
                return -1;
            }
        }
        try {
            Dimension var3 = class41.field331.getSize();
            class164.method893(class585.field8492.method987(class31.field247, 22), true, class137.field1673, 19206);
            class152 var4 = class447.method2618(class281.field3691, class377.field5020, 3317, 0);
            long var5 = class190.method1030(false);
            class210.field2560.method1182();
            class138.field1681.method661(0, class410.field5342, 0);
            class210.field2560.method1160(class138.field1681);
            class210.field2560.method1179(var3.width / 2, var3.height / 2, 512, 512);
            class210.field2560.method1165(1.0F);
            class210.field2560.method1188(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            class157 var7 = class210.field2560.method277(var4, 2048, 64, 64, 768);
            if (arg2 <= 7) {
                return 8;
            }
            int var8 = 0;
            label45: for (int var9 = 0; var9 < 500; var9++) {
                class210.field2560.method1156(0);
                class210.field2560.method1166();
                for (int var10 = 15; var10 >= 0; var10--) {
                    for (int var11 = 0; var11 <= var10; var11++) {
                        class272.field3527.method661((int) (((float) var11 - (float) var10 / 2.0F) * (float) class79.field929), 0, (var10 + 1) * class79.field929);
                        var7.method69(class272.field3527, null, 0);
                        var8++;
                        if (class190.method1030(false) - var5 >= (long) arg1) {
                            break label45;
                        }
                    }
                }
            }
            class210.field2560.method1192();
            long var12 = (long) (var8 * 1000) / (class190.method1030(false) - var5);
            class210.field2560.method1156(0);
            class210.field2560.method1166();
            return (int) var12;
        } catch (Throwable var15) {
            var15.printStackTrace();
            return -1;
        }
    }
}
