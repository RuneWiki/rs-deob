import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class402 extends class425 {

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "F")
    public float field5640;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public int field5639;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public int field5641;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public int field5643;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public int field5644;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public static int field5645;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public int field5647;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "Lug;")
    public static class335 field5648;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field5642;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(B)V", line = 5)
    public static void method2517(byte arg0) {
        field5642 = null;
        int var1 = -56 % ((-arg0 - 6) / 35);
        field5648 = null;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(IB)V", line = 27)
    public static final void method2518(int arg0, byte arg1) {
        field5646++;
        int var2 = class34.field434 - class431.field6170;
        if (var2 >= 100) {
            class336.field4878 = 1;
        } else if (arg1 > 87) {
            int var3 = (int) class241.field3553;
            if ((class433.field6195 >> 8) > var3) {
                var3 = class433.field6195 >> 8;
            }
            if (class248.field3704[4] && var3 < (class355.field5147[4] + 128)) {
                var3 = class355.field5147[4] + 128;
            }
            int var4 = (int) class358.field5176 + class129.field1834 & 0x3FFF;
            class198.method1406(class431.field6168, 16384, arg0, var4, var3, class323.field4712, class452.method2820(class158.field2302, class181.field2555.field4466, false, class181.field2555.field4463) - 50, (var3 >> 3) * 3 + 600);
            float var5 = 1.0F - ((float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F);
            class319.field4676 = (int) ((float) (class319.field4676 - class447.field6392) * var5 + (float) class447.field6392);
            class386.field5469 = (int) ((float) (class386.field5469 - class435.field6214) * var5 + (float) class435.field6214);
            class417.field5999 = (int) ((float) (class417.field5999 - class282.field4103) * var5 + (float) class282.field4103);
            class249.field3707 = (int) ((float) (class249.field3707 - class93.field1190) * var5 + (float) class93.field1190);
            int var6 = class278.field3990 - class405.field5683;
            if (var6 > 8192) {
                var6 -= 16384;
            } else if (var6 < -8192) {
                var6 += 16384;
            }
            class278.field3990 = (int) ((float) var6 * var5 + (float) class405.field5683);
            class278.field3990 &= 0x3FFF;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)I", line = 83)
    public static final int method2519(int arg0, int arg1) {
        field5649++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 != 8) {
            method2518(84, (byte) -127);
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return var2 + arg1;
    }
}
