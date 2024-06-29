import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class129 extends class127 {

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "Lc;")
    private class15 field3018;

    @OriginalMember(owner = "client!ue", name = "F", descriptor = "Lkc;")
    public static class67 field3010 = class19.method144("backhmid1", 84);

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "Lkc;")
    public static class67 field3009 = class19.method144("chatback", 127);

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "[I")
    public static int[] field3021 = new int[25];

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "I")
    public static int field3014 = 0;

    @OriginalMember(owner = "client!ue", name = "ab", descriptor = "I")
    public static int field3031 = 0;

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "[I")
    public static int[] field3012 = new int[2000];

    @OriginalMember(owner = "client!ue", name = "W", descriptor = "Lkc;")
    public static class67 field3027 = class19.method144("Freund hinzuf-Ugen", 90);

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "I")
    private int field3017;

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!ue", name = "T", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!ue", name = "U", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!ue", name = "V", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!ue", name = "Y", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!ue", name = "Z", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!ue", name = "bb", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!ue", name = "db", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "Ljd;")
    private class62 field3023;

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3020;

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "Z")
    private boolean field3019;

    @OriginalMember(owner = "client!ue", name = "X", descriptor = "Z")
    private boolean field3028;

    @OriginalMember(owner = "client!ue", name = "cb", descriptor = "[B")
    private byte[] field3033;

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "[I")
    public static int[] field3013;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V", line = 3)
    public final void method449(byte arg0) {
        field3016++;
        if (arg0 < 14) {
            field3013 = null;
        }
        if (this.field3023 == null || this.field3023.field1464 == 0) {
            return;
        }
        if (this.field3023.field1464 == 1) {
            class23 var2 = (class23) this.field3023.field1467;
            try {
                var2.method183(false, this.field3033, 0, this.field3033.length);
                var2.method179(4220);
                try {
                    class56.method445(this.field3018.field314, "midibox.loop=" + (this.field3028 ? "\"infinite\"" : "0") + "; midibox.src=\"" + var2.method180((byte) 121).getPath().replace('\\', '/') + "\"; midibox.volume=" + this.field3017 + ";", -3358);
                    this.field3019 = true;
                } catch (Throwable var4) {
                }
            } catch (Exception var5) {
                try {
                    var2.method179(4220);
                } catch (Exception var3) {
                }
            }
        }
        this.field3023 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V", line = 41)
    public final void method450(int arg0) {
        if (this.field3019) {
            try {
                class56.method445(this.field3018.field314, "midibox.src=\"c:/silence.mid\";", -3358);
            } catch (Throwable var2) {
            }
            this.field3019 = false;
        }
        this.field3023 = null;
        field3026++;
        if (arg0 != -5736) {
            field3012 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)Z", line = 65)
    public static final boolean method993(int arg0, byte arg1) {
        int var2 = -4 / ((arg1 + 66) / 46);
        field3030++;
        return (arg0 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)V", line = 76)
    public static final void method994(byte arg0) {
        field3022++;
        try {
            Graphics var1 = field3020.getGraphics();
            class94.field2149.method162(-1, 0, var1, 4);
            class4.field74.method162(-1, 0, var1, 357);
            client.field461.method162(-1, 722, var1, 4);
            class55.field1339.method162(-1, 743, var1, 205);
            class78.field1847.method162(-1, 0, var1, 0);
            class4.field69.method162(-1, 516, var1, 4);
            int var2 = -105 % ((arg0 + 49) / 40);
            class44.field1071.method162(-1, 516, var1, 205);
            class66.field1561.method162(-1, 496, var1, 357);
            class11.field244.method162(-1, 0, var1, 338);
        } catch (Exception var3) {
            field3020.repaint();
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lkc;ILac;Lkc;)[Lnd;", line = 101)
    public static final class86[] method995(class67 arg0, int arg1, class4 arg2, class67 arg3) {
        field3034++;
        int var4 = arg2.method31(arg0, 0);
        int var5 = -5 % ((26 - arg1) / 59);
        int var6 = arg2.method35(var4, arg3, 126);
        return class67.method519(var6, (byte) -106, var4, arg2);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZII)I", line = 124)
    public static final int method996(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            return -62;
        }
        field3008++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 / 128;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(B)V", line = 152)
    public static final void method997(byte arg0) {
        if (arg0 != -53) {
            field3021 = null;
        }
        class33.field756.method378((byte) -127);
        field3015++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z[BII)V", line = 165)
    public final void method448(boolean arg0, byte[] arg1, int arg2, int arg3) {
        field3029++;
        this.field3023 = this.field3018.method126((byte) -51);
        if (this.field3023 == null) {
            return;
        }
        if (arg2 == 0) {
            arg2 = 1;
        }
        this.field3017 = class83.method650(-126, arg2);
        this.field3033 = arg1;
        this.field3028 = arg0;
        int var5 = -65 / ((-arg3 - 17) / 47);
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V", line = 184)
    public final void method452(int arg0) {
        field3032++;
        if (arg0 != 0) {
            this.field3028 = false;
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V", line = 198)
    public static final void method998(int arg0) {
        field3025++;
        for (class55 var1 = (class55) class25.field527.method83(64); var1 != null; var1 = (class55) class25.field527.method81(-58)) {
            if (var1.field1352 != null) {
                class121.field2836.method1055(var1.field1352);
                var1.field1352 = null;
            }
            if (var1.field1324 != null) {
                class121.field2836.method1055(var1.field1324);
                var1.field1324 = null;
            }
        }
        class25.field527.method87((byte) -54);
        if (arg0 != 2) {
            field3021 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)V", line = 246)
    public static void method999(int arg0) {
        if (arg0 != 0) {
            field3020 = null;
        }
        field3010 = null;
        field3020 = null;
        field3021 = null;
        field3012 = null;
        field3013 = null;
        field3027 = null;
        field3009 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZ)V", line = 273)
    public final void method447(int arg0, boolean arg1) {
        field3024++;
        if (arg1) {
            method999(53);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V", line = 286)
    public final void method451(int arg0, int arg1, int arg2) {
        field3011++;
        if (arg2 == 0) {
            arg2 = 1;
        }
        if (arg1 != 91) {
            this.method448(true, null, -128, -63);
        }
        int var4 = class83.method650(-125, arg2) - arg0;
        if (this.field3023 != null) {
            this.field3017 = var4;
        } else if (this.field3019) {
            try {
                class56.method445(this.field3018.field314, "midibox.volume=" + var4 + ";", -3358);
            } catch (Throwable var5) {
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lc;)V", line = 319)
    public class129(class15 arg0) {
        this.field3018 = arg0;
    }
}
