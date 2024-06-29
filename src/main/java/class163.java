import java.awt.Component;
import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class163 extends OutputStream {

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "[J")
    public static long[] field2922 = new long[100];

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field2924 = -2;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Z")
    public static boolean field2925 = false;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Lce;")
    public static class126 field2926 = class206.method1445(-7923, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field2927 = -1;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 11)
    public static final void method1193(byte arg0, Component arg1) {
        field2923++;
        arg1.removeKeyListener(class50.field761);
        int var2 = -80 / ((65 - arg0) / 38);
        arg1.removeFocusListener(class50.field761);
        class270.field4566 = -1;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIII)Z", line = 25)
    public static final boolean method1194(int arg0, int arg1, int arg2, int arg3) {
        if (class29.method138(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class8.method43(var4 + 1, class264.field4396[arg0][arg1][arg2] + arg3, var5 + 1) && class8.method43(var4 + 128 - 1, class264.field4396[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class8.method43(var4 + 128 - 1, class264.field4396[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class8.method43(var4 + 1, class264.field4396[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 41)
    public static void method1195(int arg0) {
        field2926 = null;
        field2922 = null;
        if (arg0 != 11835) {
            field2927 = -26;
        }
    }

    @OriginalMember(owner = "client!hf", name = "write", descriptor = "(I)V", line = 62)
    public final void write(int arg0) throws IOException {
        field2921++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V", line = 70)
    public static final void method1196(int arg0) {
        if (arg0 != -1) {
            field2922 = (long[]) null;
        }
        class223.field3763.method1178(arg0 - 94);
        field2928++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V", line = 85)
    public static final void method1197(byte arg0) {
        class209.field3571.method1178(-95);
        class223.field3756.method1178(arg0 ^ 0x8);
        if (arg0 != -84) {
            field2924 = 34;
        }
        field2929++;
    }
}
