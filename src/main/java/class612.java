import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class612 {

    @OriginalMember(owner = "client!gr", name = "m", descriptor = "I")
    public int field8271 = 127;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "Z")
    public boolean field8264 = true;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public int field8259 = 1190717;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
    public int field8262 = -1;

    @OriginalMember(owner = "client!gr", name = "l", descriptor = "I")
    public int field8270 = -1;

    @OriginalMember(owner = "client!gr", name = "o", descriptor = "I")
    public int field8273 = 512;

    @OriginalMember(owner = "client!gr", name = "p", descriptor = "I")
    public int field8274 = 8;

    @OriginalMember(owner = "client!gr", name = "r", descriptor = "Z")
    public boolean field8276 = false;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
    public int field8261 = 64;

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "I")
    public int field8268 = -1;

    @OriginalMember(owner = "client!gr", name = "k", descriptor = "Z")
    public boolean field8269 = true;

    @OriginalMember(owner = "client!gr", name = "q", descriptor = "I")
    public int field8275 = 0;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "Lki;")
    public static class364 field8260 = new class364();

    @OriginalMember(owner = "client!gr", name = "x", descriptor = "I")
    public static int field8282 = 0;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
    public int field8263;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
    public static int field8265;

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "I")
    public static int field8266;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "I")
    public static int field8267;

    @OriginalMember(owner = "client!gr", name = "t", descriptor = "I")
    public static int field8278;

    @OriginalMember(owner = "client!gr", name = "u", descriptor = "I")
    public static int field8279;

    @OriginalMember(owner = "client!gr", name = "v", descriptor = "I")
    public static int field8280;

    @OriginalMember(owner = "client!gr", name = "n", descriptor = "Lmd;")
    public class245 field8272;

    @OriginalMember(owner = "client!gr", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field8281;

    @OriginalMember(owner = "client!gr", name = "s", descriptor = "[[S")
    public static short[][] field8277;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Z)Z")
    public static final boolean method3318(boolean arg0) {
        field8280++;
        try {
            return arg0 ? class567.method3032(-2228) : true;
        } catch (IOException var4) {
            class119.method898((byte) 108);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class159.field1991 == null ? -1 : class159.field1991.method2071(-103)) + "," + (class455.field5941 == null ? -1 : class455.field5941.method2071(-123)) + "," + (class703.field9808 == null ? -1 : class703.field9808.method2071(-35)) + " - " + class88.field1169 + "," + (class100.field1326 + class233.field3130.field3030[0]) + "," + (class233.field3130.field3039[0] + class186.field2376) + " - ";
            for (int var3 = 0; var3 < class88.field1169 && var3 < 50; var3++) {
                var2 = var2 + class230.field3069.field5393[var3] + ",";
            }
            class698.method3809(var2, (byte) 125, var5);
            class250.method1577(3, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V")
    public final void method3319(byte arg0) {
        this.field8274 = this.field8274 << 8 | this.field8263;
        if (arg0 == -11) {
            field8267++;
            if (this.field8268 == -1) {
                this.field8268 = this.field8270;
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILfd;I)V")
    private final void method3320(int arg0, class418 arg1, int arg2) {
        if (arg0 < 96) {
            return;
        }
        if (arg2 == 1) {
            this.field8275 = class192.method1258(false, arg1.method2364(-98));
        } else if (arg2 == 2) {
            this.field8270 = arg1.method2396(-122);
        } else if (arg2 == 3) {
            this.field8270 = arg1.method2393(-30727);
            if (this.field8270 == 65535) {
                this.field8270 = -1;
            }
        } else if (arg2 == 5) {
            this.field8269 = false;
        } else if (arg2 == 7) {
            this.field8262 = class192.method1258(false, arg1.method2364(-63));
        } else if (arg2 == 8) {
            this.field8272.field3284 = this.field8263;
        } else if (arg2 == 9) {
            this.field8273 = arg1.method2393(-30727) << 2;
        } else if (arg2 == 10) {
            this.field8264 = false;
        } else if (arg2 == 11) {
            this.field8274 = arg1.method2396(83);
        } else if (arg2 == 12) {
            this.field8276 = true;
        } else if (arg2 == 13) {
            this.field8259 = arg1.method2364(-102);
        } else if (arg2 == 14) {
            this.field8261 = arg1.method2396(73) << 2;
        } else if (arg2 == 15) {
            this.field8268 = arg1.method2393(-30727);
            if (this.field8268 == 65535) {
                this.field8268 = -1;
            }
        } else if (arg2 == 16) {
            this.field8271 = arg1.method2396(-118);
        }
        field8279++;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)Z")
    public static final boolean method3321(int arg0, int arg1) {
        field8265++;
        if (arg1 != -1) {
            field8277 = null;
        }
        return arg0 == 3 || arg0 == 7 || arg0 == 10;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
    public static void method3322(int arg0) {
        if (arg0 <= 52) {
            method3322(35);
        }
        field8277 = null;
        field8260 = null;
        field8281 = null;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(BILjava/lang/String;)V")
    public static final void method3323(byte arg0, int arg1, String arg2) {
        class652.field9073++;
        field8266++;
        class11 var3 = class130.method931(class649.field9035, (byte) 54, class666.field9236);
        var3.field114.method2352(true, class367.method2111(2, arg2) + 1);
        var3.field114.method2374(arg2, -107);
        var3.field114.method2352(true, arg1);
        class100.method760(var3, 61);
        if (arg0 != -1) {
            method3322(88);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lfd;I)V")
    public final void method3324(class418 arg0, int arg1) {
        if (arg1 != 0) {
            this.field8261 = 55;
        }
        while (true) {
            int var3 = arg0.method2396(97);
            if (var3 == 0) {
                field8278++;
                return;
            }
            this.method3320(111, arg0, var3);
        }
    }
}
