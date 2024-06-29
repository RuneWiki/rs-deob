import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class211 {

    @OriginalMember(owner = "client!li", name = "c", descriptor = "Lqd;")
    public static class40 field3359 = class147.method1106("Nehmen", (byte) -127);

    @OriginalMember(owner = "client!li", name = "d", descriptor = "Lqd;")
    public static class40 field3360 = class147.method1106("(U3", (byte) -55);

    @OriginalMember(owner = "client!li", name = "j", descriptor = "Lqd;")
    public static class40 field3366 = class147.method1106("gelb:", (byte) -75);

    @OriginalMember(owner = "client!li", name = "i", descriptor = "Lqd;")
    public static class40 field3365 = class147.method1106("rot:", (byte) -111);

    @OriginalMember(owner = "client!li", name = "g", descriptor = "F")
    public static float field3363;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "Lde;")
    public static class58 field3357;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V", line = 29)
    public static void method1482(int arg0) {
        field3360 = null;
        field3366 = null;
        field3357 = null;
        if (arg0 != 255) {
            field3366 = (class40) null;
        }
        field3365 = null;
        field3359 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)Lrb;", line = 53)
    public static final class213 method1483(int arg0, int arg1, int arg2) {
        if (arg2 != -17970) {
            field3360 = (class40) null;
        }
        field3361++;
        class213 var3 = class314.method2172((byte) -121, arg1);
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field3415 == null || var3.field3415.length <= arg0) {
            return null;
        } else {
            return var3.field3415[arg0];
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;Z)I", line = 74)
    public static final int method1484(KeyEvent arg0, boolean arg1) {
        if (arg1) {
            return 48;
        }
        field3362++;
        int var2 = arg0.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IILce;IIIZ)V", line = 95)
    public static final void method1485(int arg0, int arg1, class239 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field3364++;
        if (arg3 <= 104) {
            method1486(true, (byte) -5);
        }
        class62.field1182 = arg4;
        class95.field1708 = arg5;
        class95.field1718 = arg1;
        class109.field1913 = arg2;
        class52.field1017 = 1;
        class309.field5182 = arg0;
        class207.field3309 = arg6;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZB)V", line = 125)
    public static final void method1486(boolean arg0, byte arg1) {
        field3358++;
        byte[][] var2;
        if (class21.field350 && arg0) {
            var2 = class88.field1595;
        } else {
            var2 = class265.field4436;
        }
        int var3 = class139.field2355.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class5.field70[var4] >> 8) * 64 - class196.field3152;
                int var7 = (class5.field70[var4] & 0xFF) * 64 - class263.field4407;
                class194.method1385(4);
                class288.method1992(class255.field4247, arg0, var6, (byte) -99, var5, var7);
            }
        }
        if (arg1 < 101) {
            method1486(true, (byte) 109);
        }
    }
}
