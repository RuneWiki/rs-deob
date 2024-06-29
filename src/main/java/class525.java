import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class525 extends Canvas {

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field7630;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "F")
    public static float field7631 = 0.0F;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "Lbj;")
    public static class162 field7628 = new class162(13, 16);

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "[Llj;")
    public static class435[] field7636 = new class435[1024];

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field7626;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field7627;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field7629;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field7632;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field7633;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field7634;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field7635;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Ljn;", line = 3)
    public static final class508 method3103(Throwable arg0, String arg1) {
        field7629++;
        class508 var2;
        if ((arg0 instanceof class508)) {
            var2 = (class508) arg0;
            var2.field7399 = var2.field7399 + ' ' + arg1;
        } else {
            var2 = new class508(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/lang/String;B)J", line = 24)
    public static final long method3104(String arg0, byte arg1) {
        field7626++;
        int var2 = arg0.length();
        long var3 = 0L;
        if (arg1 != 42) {
            field7636 = null;
        }
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (var3 << 5) + (long) arg0.charAt(var5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BZ)V", line = 46)
    public static final void method3105(byte arg0, boolean arg1) {
        class42.method255(80);
        field7632++;
        if (!class263.method1682(true, class466.field6932)) {
            return;
        }
        class322.field4919++;
        if (class322.field4919 < 50 && !arg1) {
            return;
        }
        int var2 = 70 % ((arg0 + 4) / 48);
        class322.field4919 = 0;
        if (!class270.field4095 && class216.field3417 != null) {
            class327.field4965++;
            class459.method2765(class317.field4802, (byte) 87);
            try {
                class216.field3417.method2329(0, class335.field5062.field4399, 3, class335.field5062.field4408);
                class335.field5062.field4399 = 0;
            } catch (IOException var3) {
                class270.field4095 = true;
            }
        }
        class42.method255(82);
    }

    @OriginalMember(owner = "client!hd", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 79)
    public final void paint(Graphics arg0) {
        this.field7630.paint(arg0);
        field7633++;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)V", line = 89)
    public static final void method3106(int arg0, byte arg1) {
        field7634++;
        int var2 = 117 % ((arg1 - 46) / 50);
        for (class261 var3 = class248.field3828.method1615(0); var3 != null; var3 = class248.field3828.method1621((byte) 115)) {
            if ((long) arg0 == (var3.field3977 >> 48 & 0xFFFFL)) {
                var3.method1676(true);
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V", line = 111)
    public static void method3107(byte arg0) {
        field7636 = null;
        field7628 = null;
        int var1 = 34 % ((arg0 - 38) / 48);
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 123)
    public class525(Component arg0) {
        this.field7630 = arg0;
    }

    @OriginalMember(owner = "client!hd", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 136)
    public final void update(Graphics arg0) {
        field7627++;
        this.field7630.update(arg0);
    }
}
