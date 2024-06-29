import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class672 extends class135 {

    @OriginalMember(owner = "client!nga", name = "n", descriptor = "Lrs;")
    private class166 field9507;

    @OriginalMember(owner = "client!nga", name = "q", descriptor = "Lio;")
    private class708 field9510;

    @OriginalMember(owner = "client!nga", name = "p", descriptor = "I")
    public static int field9509 = 328;

    @OriginalMember(owner = "client!nga", name = "o", descriptor = "Lln;")
    public static class472 field9508 = new class472(9, 0, 4, 1);

    @OriginalMember(owner = "client!nga", name = "s", descriptor = "I")
    public static int field9512 = 0;

    @OriginalMember(owner = "client!nga", name = "r", descriptor = "Ltm;")
    public static class334 field9511 = new class334(112, -1);

    @OriginalMember(owner = "client!nga", name = "u", descriptor = "I")
    public static int field9514 = 0;

    @OriginalMember(owner = "client!nga", name = "v", descriptor = "I")
    public static int field9515 = 0;

    @OriginalMember(owner = "client!nga", name = "l", descriptor = "I")
    public static int field9505;

    @OriginalMember(owner = "client!nga", name = "m", descriptor = "I")
    public static int field9506;

    @OriginalMember(owner = "client!nga", name = "t", descriptor = "I")
    public static int field9513;

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "(B)I")
    public final int method3754(byte arg0) {
        field9506++;
        return arg0 == 79 ? this.field9510.field9978 : 92;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(B)Lio;")
    public final class708 method1084(byte arg0) {
        if (arg0 == 28) {
            field9513++;
            return this.field9510;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "(I)V")
    public static void method3755(int arg0) {
        if (arg0 != 65534) {
            field9514 = -118;
        }
        field9511 = null;
        field9508 = null;
    }

    @OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(Lrs;I)V")
    public class672(class166 arg0, int arg1) {
        this.field9507 = arg0;
        this.field9510 = new class708(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(BFLio;Lio;)Z")
    public final boolean method3756(byte arg0, float arg1, class708 arg2, class708 arg3) {
        field9505++;
        if (arg0 != 126) {
            field9509 = 108;
        }
        boolean var5 = true;
        class98 var6 = this.field9507.field2799;
        this.field9507.method331(class413.field6078);
        this.field9507.method374();
        this.field9507.method1311(-100);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field9510.field9978, this.field9510.field9978);
        this.field9507.method1238(127, false);
        this.field9507.method1284(false, 5890);
        this.field9507.method1318((byte) -128, false);
        this.field9507.method1263((byte) 104, false);
        this.field9507.method1327(-53, -2);
        this.field9507.method1298(1, (byte) -124);
        this.field9507.method1330(0.0F, 0.0F, 0.0F, arg1, -29089);
        this.field9507.method1256(34165, -4, 34165);
        this.field9507.method1306(arg3, arg0 ^ 0x2);
        this.field9507.method1298(0, (byte) -124);
        this.field9507.method1334(0, 1);
        this.field9507.method1306(arg2, 58);
        this.field9507.method1322(var6, (byte) -86);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method798(0, var8, arg0 ^ 0x7E, this.field9510);
            var6.method809(0, -128);
            if (!var6.method812((byte) -111)) {
                var5 = false;
                break;
            }
            OpenGL.glBegin(7);
            if (var8 == 34069) {
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
            } else if (var8 == 34070) {
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
            } else if (var8 == 34071) {
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
            } else if (var8 == 34072) {
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
            } else if (var8 == 34073) {
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
            } else if (var8 == 34074) {
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
        var6.method813((byte) -107, 0);
        this.field9507.method1293(0, var6);
        this.field9507.method1298(1, (byte) -124);
        this.field9507.method1306(null, 45);
        this.field9507.method1256(8448, arg0 ^ 0xFFFFFF82, 8448);
        this.field9507.method1298(0, (byte) -124);
        this.field9507.method1306(null, 41);
        OpenGL.glPopAttrib();
        this.field9507.method240(class413.field6078[0], class413.field6078[1], class413.field6078[2], class413.field6078[3]);
        if (var5 && !this.field9507.field2899) {
            this.field9510.method2957((byte) -56);
        }
        return var5;
    }
}
