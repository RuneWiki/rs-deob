import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class383 {

    @OriginalMember(owner = "client!or", name = "b", descriptor = "I")
    public int field5394 = 1190717;

    @OriginalMember(owner = "client!or", name = "d", descriptor = "Z")
    public boolean field5396 = true;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "I")
    public int field5397 = 16;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "I")
    public int field5398 = -1;

    @OriginalMember(owner = "client!or", name = "g", descriptor = "Z")
    public boolean field5399 = false;

    @OriginalMember(owner = "client!or", name = "h", descriptor = "I")
    public int field5400 = 0;

    @OriginalMember(owner = "client!or", name = "i", descriptor = "I")
    public int field5401 = 128;

    @OriginalMember(owner = "client!or", name = "l", descriptor = "I")
    public int field5404 = -1;

    @OriginalMember(owner = "client!or", name = "r", descriptor = "I")
    public int field5410 = 8;

    @OriginalMember(owner = "client!or", name = "t", descriptor = "I")
    public int field5412 = -1;

    @OriginalMember(owner = "client!or", name = "q", descriptor = "Z")
    public boolean field5409 = true;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "I")
    public static int field5395 = 104;

    @OriginalMember(owner = "client!or", name = "o", descriptor = "I")
    public static int field5407 = 0;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!or", name = "k", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!or", name = "m", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!or", name = "n", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!or", name = "p", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!or", name = "s", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!or", name = "u", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!or", name = "j", descriptor = "Lgj;")
    public static class381 field5402;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V", line = 21)
    public static final void method2458(int arg0) {
        field5408++;
        class237 var1 = class88.field1060;
        synchronized (class88.field1060) {
            class88.field1060.method1618(0);
        }
        if (arg0 > -118) {
            method2462(-40);
        }
        class237 var2 = class285.field4005;
        synchronized (class285.field4005) {
            class285.field4005.method1618(0);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIILdg;)V", line = 42)
    private final void method2459(int arg0, int arg1, int arg2, class236 arg3) {
        if (arg2 == 1) {
            this.field5400 = class452.method2801(123, arg3.method1616(false));
        } else if (arg2 == 2) {
            this.field5412 = arg3.method1574(-80);
        } else if (arg2 == 3) {
            this.field5412 = arg3.method1617((byte) 48);
            if (this.field5412 == 65535) {
                this.field5412 = -1;
            }
        } else if (arg2 == 5) {
            this.field5396 = false;
        } else if (arg2 == 7) {
            this.field5404 = class452.method2801(117, arg3.method1616(false));
        } else if (arg2 == 8) {
            class89.field1086 = arg1;
        } else if (arg2 == 9) {
            this.field5401 = arg3.method1617((byte) 48);
        } else if (arg2 == 10) {
            this.field5409 = false;
        } else if (arg2 == 11) {
            this.field5410 = arg3.method1574(-76);
        } else if (arg2 == 12) {
            this.field5399 = true;
        } else if (arg2 == 13) {
            this.field5394 = arg3.method1616(false);
        } else if (arg2 == 14) {
            this.field5397 = arg3.method1574(-17);
        } else if (arg2 == 15) {
            this.field5398 = arg3.method1617((byte) 48);
            if (this.field5398 == 65535) {
                this.field5398 = -1;
            }
        }
        field5393++;
        if (arg0 != 14889) {
            this.method2459(93, 92, -104, (class236) null);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILdg;I)V", line = 128)
    public final void method2460(int arg0, class236 arg1, int arg2) {
        if (arg0 >= -112) {
            field5413 = 107;
        }
        while (true) {
            int var4 = arg1.method1574(-73);
            if (var4 == 0) {
                field5411++;
                return;
            }
            this.method2459(14889, arg2, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ZI)V", line = 148)
    public final void method2461(boolean arg0, int arg1) {
        this.field5410 = this.field5410 << 8 | arg1;
        if (arg0) {
            field5407 = -63;
        }
        if (this.field5398 == -1) {
            this.field5398 = this.field5412;
        }
        field5403++;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V", line = 188)
    public static final void method2462(int arg0) {
        field5405++;
        class4.field45 = null;
        if (arg0 > -110) {
            field5413 = 60;
        }
        class62.field722 = null;
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V", line = 209)
    public static void method2463(int arg0) {
        field5402 = null;
        if (arg0 > -58) {
            field5395 = 16;
        }
    }
}
