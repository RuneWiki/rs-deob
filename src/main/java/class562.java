import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class562 {

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "I")
    public static int field7587 = 0;

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "Lkr;")
    public static class693 field7588 = new class693();

    @OriginalMember(owner = "client!ou", name = "j", descriptor = "[F")
    public static float[] field7595 = new float[16384];

    @OriginalMember(owner = "client!ou", name = "i", descriptor = "[I")
    public static int[] field7594 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "[[B")
    public static byte[][] field7593 = new byte[50][];

    @OriginalMember(owner = "client!ou", name = "k", descriptor = "[F")
    public static float[] field7596 = new float[16384];

    @OriginalMember(owner = "client!ou", name = "m", descriptor = "Z")
    public static boolean field7598 = false;

    @OriginalMember(owner = "client!ou", name = "g", descriptor = "F")
    public static float field7592;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "I")
    public static int field7586;

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "I")
    public static int field7590;

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!ou", name = "l", descriptor = "I")
    public static int field7597;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field7595[var2] = (float) Math.sin((double) var2 * var0);
            field7596[var2] = (float) Math.cos((double) var2 * var0);
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)V", line = 4)
    public static void method3142(byte arg0) {
        if (arg0 != 99) {
            field7588 = null;
        }
        field7594 = null;
        field7596 = null;
        field7593 = null;
        field7595 = null;
        field7588 = null;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(II)V", line = 18)
    public static final void method3143(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        field7591++;
        class139.field1970 = arg0;
        if (arg1 != 10023) {
            method3142((byte) 53);
        }
        class291.field4003 = new class646[class339.field4549[class139.field1970] + 1];
        class222.field3098 = 0;
        class251.field3425 = 0;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V", line = 39)
    public static final void method3144(int arg0) {
        field7590++;
        if (class263.field3571 == 0) {
            return;
        }
        try {
            if (++class672.field9428 > 2000) {
                if (class589.field8272 != null) {
                    class589.field8272.method1935(0);
                    class589.field8272 = null;
                }
                if (class129.field1850 >= 2) {
                    class610.field8467 = -5;
                    class263.field3571 = 0;
                    return;
                }
                class297.field4066.method1209(37);
                class129.field1850++;
                class263.field3571 = 1;
                class672.field9428 = 0;
            }
            if (class263.field3571 == 1) {
                class357.field4739 = class297.field4066.method1206(class543.field7374, 37);
                class263.field3571 = 2;
            }
            if (class263.field3571 == 2) {
                if (class357.field4739.field948 == 2) {
                    throw new IOException();
                }
                if (class357.field4739.field948 != 1) {
                    return;
                }
                class589.field8272 = class76.method589((Socket) class357.field4739.field946, false, 7500);
                class357.field4739 = null;
                class224.method1413((byte) 6);
                class263.field3571 = 4;
            }
            if (arg0 == 5) {
                if (class263.field3571 == 4) {
                    if (!class589.field8272.method1940(arg0 - 5549, 1)) {
                        return;
                    }
                    class589.field8272.method1939(1, 0, class660.field9184.field6855, (byte) -93);
                    int var1 = class660.field9184.field6855[0] & 0xFF;
                    if (var1 != 21) {
                        class610.field8467 = var1;
                        class263.field3571 = 0;
                        class589.field8272.method1935(0);
                        class589.field8272 = null;
                        return;
                    }
                    class263.field3571 = 5;
                }
                if (class263.field3571 == 5) {
                    if (!class589.field8272.method1940(-5544, 1)) {
                        return;
                    }
                    class589.field8272.method1939(1, 0, class660.field9184.field6855, (byte) -93);
                    class263.field3571 = 6;
                    class61.field691 = new String[class660.field9184.field6855[0] & 0xFF];
                }
                if (class263.field3571 == 6 && class589.field8272.method1940(-5544, class61.field691.length * 8)) {
                    class660.field9184.field6892 = 0;
                    class589.field8272.method1939(class61.field691.length * 8, 0, class660.field9184.field6855, (byte) -93);
                    for (int var2 = 0; var2 < class61.field691.length; var2++) {
                        class61.field691[var2] = class155.method1107(class660.field9184.method2849(-2), class324.method1944(arg0, 5));
                    }
                    class263.field3571 = 0;
                    class610.field8467 = 21;
                    class589.field8272.method1935(arg0 - 5);
                    class589.field8272 = null;
                }
            }
        } catch (IOException var3) {
            if (class589.field8272 != null) {
                class589.field8272.method1935(0);
                class589.field8272 = null;
            }
            if (class129.field1850 < 2) {
                class297.field4066.method1209(37);
                class672.field9428 = 0;
                class263.field3571 = 1;
                class129.field1850++;
            } else {
                class263.field3571 = 0;
                class610.field8467 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "toString", descriptor = "()Ljava/lang/String;", line = 184)
    public final String toString() {
        field7586++;
        throw new IllegalStateException();
    }
}
