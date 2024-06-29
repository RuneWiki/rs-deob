import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class293 extends class478 {

    @OriginalMember(owner = "client!en", name = "w", descriptor = "Lus;")
    private class1 field4402;

    @OriginalMember(owner = "client!en", name = "x", descriptor = "Lmda;")
    private class243 field4403;

    @OriginalMember(owner = "client!en", name = "p", descriptor = "Lsb;")
    public static class266 field4395 = new class266(27, 2);

    @OriginalMember(owner = "client!en", name = "y", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field4404 = new Rectangle[100];

    @OriginalMember(owner = "client!en", name = "z", descriptor = "[[I")
    public static int[][] field4405 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!en", name = "t", descriptor = "F")
    public static float field4399;

    @OriginalMember(owner = "client!en", name = "o", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!en", name = "q", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!en", name = "r", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!en", name = "s", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!en", name = "u", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!en", name = "v", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!en", name = "A", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(FLmda;Lmda;B)Z")
    public final boolean method1951(float arg0, class243 arg1, class243 arg2, byte arg3) {
        field4396++;
        boolean var5 = true;
        class323 var6 = this.field4402.field340;
        this.field4402.method131(class703.field9872);
        this.field4402.method107();
        this.field4402.method128((byte) -89);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field4403.field3671, this.field4403.field3671);
        this.field4402.method61(false, 101);
        this.field4402.method172(false, 4);
        this.field4402.method57(96, false);
        this.field4402.method45(false, -111);
        this.field4402.method161(65, -2);
        this.field4402.method125(1, -77);
        this.field4402.method137(0.0F, arg0, 0, 0.0F, 0.0F);
        this.field4402.method148(34165, 34165, (byte) -122);
        this.field4402.method5(3845, arg2);
        int var7 = 36 / ((arg3 - 52) / 61);
        this.field4402.method125(0, -26);
        this.field4402.method133(1, (byte) -119);
        this.field4402.method5(3845, arg1);
        this.field4402.method60(var6, (byte) 100);
        for (int var8 = 0; var8 < 6; var8++) {
            int var9 = var8 + 34069;
            var6.method2087(this.field4403, (byte) -71, var9, 0);
            var6.method2075(false, 0);
            if (!var6.method2081((byte) -118)) {
                var5 = false;
                break;
            }
            OpenGL.glBegin(7);
            if (var9 == 34069) {
                OpenGL.glTexCoord3i(65535, 65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65535, 65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65535, -65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(65535, -65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var9 == 34070) {
                OpenGL.glTexCoord3i(-65535, 65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(-65535, 65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(-65535, -65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65535, -65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var9 == 34071) {
                OpenGL.glTexCoord3i(-65534, 65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, 65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var9 == 34072) {
                OpenGL.glTexCoord3i(-65534, -65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, -65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var9 == 34073) {
                OpenGL.glTexCoord3i(-65534, 65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, -65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var9 == 34074) {
                OpenGL.glTexCoord3i(65534, 65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(-65534, 65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(-65534, -65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(65534, -65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
                OpenGL.glVertex2f(0.0F, 1.0F);
            }
            OpenGL.glEnd();
        }
        var6.method2074(0, -89);
        this.field4402.method141(2131, var6);
        this.field4402.method125(1, -53);
        this.field4402.method5(3845, null);
        this.field4402.method148(8448, 8448, (byte) -105);
        this.field4402.method125(0, -125);
        this.field4402.method5(3845, null);
        OpenGL.glPopAttrib();
        this.field4402.method142(class703.field9872[0], class703.field9872[1], class703.field9872[2], class703.field9872[3]);
        if (var5 && !this.field4402.field342) {
            this.field4403.method2940((byte) 108);
        }
        return var5;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
    public static final void method1952(byte arg0) {
        field4394++;
        if (class605.field8811 == 0) {
            return;
        }
        try {
            if (++class119.field2120 > 2000) {
                if (class165.field2755 != null) {
                    class165.field2755.method481(true);
                    class165.field2755 = null;
                }
                if (class223.field3351 >= 2) {
                    class605.field8811 = 0;
                    class160.field2715 = -5;
                    return;
                }
                class246.field3710.method1963((byte) -110);
                class605.field8811 = 1;
                class119.field2120 = 0;
                class223.field3351++;
            }
            if (arg0 != -20) {
                field4395 = null;
            }
            if (class605.field8811 == 1) {
                class414.field6001 = class246.field3710.method1961(class604.field8775, 43594);
                class605.field8811 = 2;
            }
            if (class605.field8811 == 2) {
                if (class414.field6001.field6502 == 2) {
                    throw new IOException();
                }
                if (class414.field6001.field6502 != 1) {
                    return;
                }
                class165.field2755 = class389.method2397(7500, 256, (Socket) class414.field6001.field6499);
                class414.field6001 = null;
                class469.method2804(true);
                class605.field8811 = 4;
            }
            if (class605.field8811 == 4) {
                if (!class165.field2755.method479(arg0 + 146, 1)) {
                    return;
                }
                class165.field2755.method480(class126.field2299.field1397, (byte) 107, 1, 0);
                int var1 = class126.field2299.field1397[0] & 0xFF;
                if (var1 != 21) {
                    class160.field2715 = var1;
                    class605.field8811 = 0;
                    class165.field2755.method481(true);
                    class165.field2755 = null;
                    return;
                }
                class605.field8811 = 5;
            }
            if (class605.field8811 == 5) {
                if (!class165.field2755.method479(116, 1)) {
                    return;
                }
                class165.field2755.method480(class126.field2299.field1397, (byte) 59, 1, 0);
                class605.field8811 = 6;
                class400.field5811 = new String[class126.field2299.field1397[0] & 0xFF];
            }
            if (class605.field8811 == 6 && class165.field2755.method479(116, class400.field5811.length * 8)) {
                class126.field2299.field1393 = 0;
                class165.field2755.method480(class126.field2299.field1397, (byte) 102, class400.field5811.length * 8, 0);
                for (int var2 = 0; var2 < class400.field5811.length; var2++) {
                    class400.field5811[var2] = class424.method2586(class126.field2299.method742(class691.method3871(arg0, -23370)), (byte) -42);
                }
                class605.field8811 = 0;
                class160.field2715 = 21;
                class165.field2755.method481(true);
                class165.field2755 = null;
            }
        } catch (IOException var3) {
            if (class165.field2755 != null) {
                class165.field2755.method481(true);
                class165.field2755 = null;
            }
            if (class223.field3351 < 2) {
                class246.field3710.method1963((byte) 10);
                class119.field2120 = 0;
                class605.field8811 = 1;
                class223.field3351++;
            } else {
                class605.field8811 = 0;
                class160.field2715 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)Lmda;")
    public final class243 method1953(int arg0) {
        field4400++;
        if (arg0 != -513) {
            this.field4402 = null;
        }
        return this.field4403;
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(I)V")
    public static final void method1954(int arg0) {
        field4401++;
        for (int var1 = arg0; var1 < 100; var1++) {
            class248.field3731[var1] = true;
        }
    }

    @OriginalMember(owner = "client!en", name = "e", descriptor = "(I)V")
    public static void method1955(int arg0) {
        if (arg0 >= 2) {
            field4395 = null;
            field4405 = null;
            field4404 = null;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILr;)V")
    public static final void method1956(int arg0, class167 arg1) {
        field4398++;
        if (arg0 == class427.field6163.method1225(arg0 ^ 0xFFFFFFFE)) {
            return;
        }
        if (class90.field1654 == 0) {
            for (class7 var2 = (class7) class427.field6163.method1224(arg0 - 2); var2 != null; var2 = (class7) class427.field6163.method1232(-2)) {
                class268.field3985.method256(var2.field517, var2.field511, (byte) 127, var2.field522 ? class532.field7456.field8621 : null, var2.field520, arg1, class542.field7569, var2.field519, false, false, var2.field516, arg1);
                var2.method2588(300);
            }
            method1954(0);
            return;
        }
        if (class459.field6559 == null) {
            Canvas var3 = new Canvas();
            var3.setSize(36, 32);
            class459.field6559 = class167.method1260(0, arg0, class513.field7240, 0, class252.field3751, var3);
            class77.field1562 = class459.field6559.method160(class620.method3545(0, class34.field972, class95.field1708, (byte) -120), class279.method1844(class632.field9092, class34.field972, 0), true);
        }
        for (class7 var4 = (class7) class427.field6163.method1224(-2); var4 != null; var4 = (class7) class427.field6163.method1232(-2)) {
            class268.field3985.method256(var4.field517, var4.field511, (byte) 98, var4.field522 ? class532.field7456.field8621 : null, var4.field520, class459.field6559, class77.field1562, var4.field519, false, false, var4.field516, arg1);
            var4.method2588(300);
        }
    }

    @OriginalMember(owner = "client!en", name = "f", descriptor = "(I)I")
    public final int method1957(int arg0) {
        field4397++;
        int var2 = 70 / ((-arg0 - 24) / 56);
        return this.field4403.field3671;
    }

    @OriginalMember(owner = "client!en", name = "g", descriptor = "(I)V")
    public static final void method1958(int arg0) {
        if (class202.field3114 == null) {
            class157 var1 = new class157();
            byte[] var2 = var1.method1217(128, 16, 128, 4096);
            class202.field3114 = class515.method3039(false, var2, arg0 ^ 0xFFFFFF7F);
        }
        field4406++;
        if (arg0 == 128 && class434.field6280 == null) {
            class308 var3 = new class308();
            byte[] var4 = var3.method2012(128, 128, 16, -8198);
            class434.field6280 = class515.method3039(false, var4, -1);
        }
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lus;I)V")
    public class293(class1 arg0, int arg1) {
        this.field4402 = arg0;
        this.field4403 = new class243(arg0, 6408, arg1);
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field4404[var0] = new Rectangle();
        }
    }
}
