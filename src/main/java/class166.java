import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class166 extends class233 {

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    private int field2492 = -32768;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public static int field2498 = 0;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public static int field2494 = 100;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "Ljava/lang/String;")
    public static String field2503 = "Loading wordpack - ";

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "[[B")
    public static byte[][] field2504 = new byte[50][];

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    public int field2501;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
    public int field2502;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BIIILf;)V", line = 7)
    public static final void method1163(byte arg0, int arg1, int arg2, int arg3, class329 arg4) {
        field2500++;
        if (class117.field1817) {
            class308.method2123(arg3, arg1, arg3 + arg4.field5018, arg4.field4994 + arg1);
        }
        if (field2498 >= 3) {
            if (class117.field1817) {
                class235 var5 = arg4.method2237(false, -56);
                if (var5 != null) {
                    var5.method935(arg3, arg1);
                }
            } else {
                class46.method306(arg3, arg1, 0, arg4.field4940, arg4.field5012);
            }
        } else if (class117.field1817) {
            ((class303) class142.field2156).method2097(arg3, arg1, arg4.field5018, arg4.field4994, class142.field2156.field3533 / 2, class142.field2156.field3537 / 2, class284.field4297, 256, (class303) arg4.method2237(false, -53));
        } else {
            ((class127) class142.field2156).method939(arg3, arg1, arg4.field5018, arg4.field4994, class142.field2156.field3533 / 2, class142.field2156.field3537 / 2, class284.field4297, 256, arg4.field4940, arg4.field5012);
        }
        class131.field2021[arg2] = true;
        if (arg0 < 42) {
            field2498 = -14;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BB)C", line = 49)
    public static final char method1164(byte arg0, byte arg1) {
        int var2 = arg0 & 0xFF;
        if (arg1 < 33) {
            field2503 = (String) null;
        }
        field2496++;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class301.field4603[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "()I", line = 83)
    public final int method115() {
        field2499++;
        return this.field2492;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIII)V", line = 93)
    public final void method108(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2497++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 104)
    public static void method1165(int arg0) {
        if (arg0 >= -104) {
            method1165(-90);
        }
        field2504 = (byte[][]) null;
        field2503 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIIIIJILbh;)V", line = 123)
    public final void method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class18 arg10) {
        field2491++;
        class100 var13 = class325.method2219(this.field2501, -9379).method1718(0, -1, 0, (class272) null, -93, this.field2502);
        if (var13 != null) {
            var13.method111(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field2492 = var13.method115();
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)I", line = 142)
    public static final int method1166(byte arg0) {
        field2495++;
        if (arg0 != -81) {
            field2498 = -54;
        }
        return class58.field743;
    }
}
