import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class104 {

    @OriginalMember(owner = "client!oda", name = "e", descriptor = "I")
    public int field1125 = 64;

    @OriginalMember(owner = "client!oda", name = "f", descriptor = "Z")
    public boolean field1126 = false;

    @OriginalMember(owner = "client!oda", name = "h", descriptor = "I")
    public int field1128 = 2;

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "Z")
    public boolean field1124 = false;

    @OriginalMember(owner = "client!oda", name = "g", descriptor = "I")
    public int field1127 = 1;

    @OriginalMember(owner = "client!oda", name = "i", descriptor = "I")
    public int field1129 = -1;

    @OriginalMember(owner = "client!oda", name = "l", descriptor = "I")
    public int field1132 = 64;

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "[[Z")
    public static boolean[][] field1123 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!oda", name = "k", descriptor = "Lpr;")
    public static class407 field1131 = new class407(36, -1);

    @OriginalMember(owner = "client!oda", name = "m", descriptor = "Lpr;")
    public static class407 field1133 = new class407(4, -2);

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!oda", name = "j", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(BLiaa;I)V", line = 8)
    public final void method625(byte arg0, class452 arg1, int arg2) {
        if (arg0 != -128) {
            this.method625((byte) 102, null, 71);
        }
        field1130++;
        while (true) {
            int var4 = arg1.method2541(125);
            if (var4 == 0) {
                return;
            }
            this.method627(var4, arg2, (byte) 116, arg1);
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(B)V", line = 32)
    public static void method626(byte arg0) {
        if (arg0 == 94) {
            field1133 = null;
            field1123 = null;
            field1131 = null;
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIBLiaa;)V", line = 44)
    private final void method627(int arg0, int arg1, byte arg2, class452 arg3) {
        if (arg2 <= 93) {
            return;
        }
        if (arg0 == 1) {
            this.field1129 = arg3.method2574(-1758460248);
            if (this.field1129 == 65535) {
                this.field1129 = -1;
            }
        } else if (arg0 == 2) {
            this.field1125 = arg3.method2574(-1758460248) + 1;
            this.field1132 = arg3.method2574(-1758460248) + 1;
        } else if (arg0 == 3) {
            arg3.method2547(true);
        } else if (arg0 == 4) {
            this.field1128 = arg3.method2541(64);
        } else if (arg0 == 5) {
            this.field1127 = arg3.method2541(102);
        } else if (arg0 == 6) {
            this.field1124 = true;
        } else if (arg0 == 7) {
            this.field1126 = true;
        }
        field1121++;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)Z", line = 107)
    public static final boolean method628(int arg0) {
        field1122++;
        try {
            if (arg0 > -103) {
                field1133 = null;
            }
            return class321.method1812(17509);
        } catch (IOException var4) {
            class548.method3097(-85);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class416.field5523 == null ? -1 : class416.field5523.method2213(-107)) + "," + (class419.field5570 == null ? -1 : class419.field5570.method2213(60)) + "," + (class273.field3455 == null ? -1 : class273.field3455.method2213(-84)) + " - " + class478.field7009 + "," + (class377.field4914.field3839[0] + class682.field9685) + "," + (class377.field4914.field3841[0] + class146.field1642) + " - ";
            for (int var3 = 0; var3 < class478.field7009 && var3 < 50; var3++) {
                var2 = var2 + class680.field9630.field6209[var3] + ",";
            }
            class150.method824(15, var5, var2);
            class184.method1069(false, false);
            return true;
        }
    }
}
