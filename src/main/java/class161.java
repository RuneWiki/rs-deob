import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public abstract class class161 {

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "Lte;")
    public static class244 field2566 = new class244(200);

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "Lab;")
    public static class269 field2570 = new class269();

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public int field2562;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public int field2565;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Lwb;")
    public static class123 field2568;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "Ljava/awt/Image;")
    public Image field2561;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "[I")
    public int[] field2564;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "[[[B")
    public static byte[][][] field2569;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public final void method1118(int arg0) {
        if (arg0 != 63) {
            this.field2561 = null;
        }
        class217.method1536(this.field2564, this.field2562, this.field2565);
        field2559++;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public static void method1119(byte arg0) {
        field2569 = null;
        field2570 = null;
        if (arg0 <= 40) {
            method1120(-77, -78, -107, 21);
        }
        field2566 = null;
        field2568 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIII)I")
    public static final int method1120(int arg0, int arg1, int arg2, int arg3) {
        field2563++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg0;
        }
        if (arg3 != 7) {
            field2568 = null;
        }
        if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method48(int arg0, int arg1, int arg2, Component arg3);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)V")
    public static final void method1121(boolean arg0, int arg1) {
        field2567++;
        for (class210 var2 = (class210) class224.field3608.method1802(43); var2 != null; var2 = (class210) class224.field3608.method1815(0)) {
            if (var2.field3353 != null) {
                class191.field3082.method1951(var2.field3353);
                var2.field3353 = null;
            }
            if (var2.field3377 != null) {
                class191.field3082.method1951(var2.field3377);
                var2.field3377 = null;
            }
            var2.method1673(14510);
        }
        if (arg1 != -1) {
            method1119((byte) -8);
        }
        if (!arg0) {
            return;
        }
        for (class210 var3 = (class210) class21.field280.method1802(43); var3 != null; var3 = (class210) class21.field280.method1815(0)) {
            if (var3.field3353 != null) {
                class191.field3082.method1951(var3.field3353);
                var3.field3353 = null;
            }
            var3.method1673(14510);
        }
        for (class210 var4 = (class210) class200.field3160.method710((byte) -30); var4 != null; var4 = (class210) class200.field3160.method709(false)) {
            if (var4.field3353 != null) {
                class191.field3082.method1951(var4.field3353);
                var4.field3353 = null;
            }
            var4.method1673(14510);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIILjava/awt/Graphics;B)V")
    public abstract void method50(int arg0, int arg1, int arg2, int arg3, Graphics arg4, byte arg5);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIB)V")
    public static final void method1122(int arg0, int arg1, int arg2, byte arg3) {
        field2571++;
        String var4 = "::tele " + arg0 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
        if (arg3 != 35) {
            method1120(26, 84, 81, 63);
        }
        System.out.println(var4);
        class283.method1902(var4, 12);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method49(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BB)C")
    public static final char method1123(byte arg0, byte arg1) {
        if (arg0 != -27) {
            field2569 = null;
        }
        field2560++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class170.field2695[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
    protected class161() {
    }
}
