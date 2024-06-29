import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class194 extends OutputStream {

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "F")
    public static float field2813;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "Lln;")
    public static class263 field2811;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
    public static final void method1318(int arg0) {
        field2814++;
        for (class341 var1 = (class341) class258.field3829.method863(arg0 - 9); var1 != null; var1 = (class341) class258.field3829.method865(-1)) {
            if (class526.method3117(var1.field5039, (byte) -87)) {
                class196.method1328(arg0 + 119, var1);
            }
        }
        if (arg0 != 8) {
            field2811 = null;
        }
        if (class430.field6184 == 1) {
            class287.method1838(true);
            return;
        }
        class251.method1626(class252.field3743, class415.field5887, 0, class517.field7487, class291.field4322);
        int var2 = class425.field6028.method875(class136.field2113.method426(class503.field7255, arg0 ^ 0x51), (byte) 5);
        for (class341 var3 = (class341) class258.field3829.method863(arg0 - 9); var3 != null; var3 = (class341) class258.field3829.method865(-1)) {
            int var4 = class344.method2177(arg0 ^ 0xA, var3);
            if (var4 > var2) {
                var2 = var4;
            }
        }
        class415.field5887 = var2 + 8;
        class517.field7487 = class430.field6184 * 16 + (class535.field7888 ? 26 : 22);
    }

    @OriginalMember(owner = "client!ao", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field2812++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
    public static void method1319(int arg0) {
        if (arg0 > -2) {
            field2811 = null;
        }
        field2811 = null;
    }
}
