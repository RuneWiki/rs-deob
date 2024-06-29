import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class383 {

    @OriginalMember(owner = "client!oo", name = "y", descriptor = "I")
    public int field5495;

    @OriginalMember(owner = "client!oo", name = "p", descriptor = "I")
    public int field5486;

    @OriginalMember(owner = "client!oo", name = "v", descriptor = "B")
    public byte field5492;

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
    public int field5482;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
    public int field5476;

    @OriginalMember(owner = "client!oo", name = "r", descriptor = "Loo;")
    public class383 field5488;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "[Z")
    public static boolean[] field5475 = new boolean[8];

    @OriginalMember(owner = "client!oo", name = "u", descriptor = "I")
    public static int field5491 = -1;

    @OriginalMember(owner = "client!oo", name = "A", descriptor = "I")
    public static int field5497 = 100;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    public int field5472;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
    public int field5474;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
    public int field5477;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
    public int field5478;

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
    public int field5479;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!oo", name = "o", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!oo", name = "q", descriptor = "I")
    public int field5487;

    @OriginalMember(owner = "client!oo", name = "s", descriptor = "I")
    public int field5489;

    @OriginalMember(owner = "client!oo", name = "t", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!oo", name = "w", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!oo", name = "x", descriptor = "I")
    public int field5494;

    @OriginalMember(owner = "client!oo", name = "z", descriptor = "I")
    public int field5496;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "[I")
    public static int[] field5471;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "[S")
    public static short[] field5473;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "[[[B")
    public static byte[][][] field5481;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2427(int arg0) {
        if (arg0 < 49) {
            method2431();
        }
        field5480++;
        for (class32 var1 = (class32) class346.field4881.method157((byte) -125); var1 != null; var1 = (class32) class346.field4881.method145(-103)) {
            if (var1.field454 == -1) {
                var1.field451 = 0;
                class91.method769(var1, 2);
            } else {
                var1.method251(69);
            }
        }
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)V", line = 32)
    public static void method2428(int arg0) {
        field5481 = null;
        field5473 = null;
        if (arg0 != -2) {
            field5497 = 37;
        }
        field5475 = null;
        field5471 = null;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)Z", line = 52)
    public static final boolean method2429(int arg0, int arg1) {
        field5484++;
        if (arg0 == 28 || arg0 == 42 || arg0 == 23 || arg0 == 24 || arg0 == 34 || arg0 == 11 || arg0 == 9 || arg0 == 40) {
            return true;
        } else if (arg0 == 37 || arg0 == 5 || arg0 == 1005 || arg0 == 1010) {
            return true;
        } else if (arg0 == 7 || arg0 == 8 || arg0 == 10 || arg0 == 48 || arg0 == 16) {
            return true;
        } else if (arg0 == 33 || arg0 == 29 || arg0 == 50 || arg0 == 6 || arg0 == 22 || arg0 == 14) {
            return true;
        } else if (arg1 == 1512) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILdp;Lja;)V", line = 79)
    public static final void method2430(int arg0, class174 arg1, class90 arg2) {
        field5485++;
        if (class393.field5747) {
            return;
        }
        arg2.method706(0);
        class339.field4837 = arg2.method734(class344.method2215(arg1, class285.field4278), true);
        class339.field4837.method2645((class113.field1819 - class339.field4837.method1461()) / 2, (class277.field4170 - class339.field4837.method1463()) / 2);
        class236.field3405 = arg2.method734(class344.method2215(arg1, class176.field2616), true);
        class236.field3405.method2645((class113.field1819 - class236.field3405.method1461()) / 2, 18);
        if (arg0 >= -17) {
            method2432((byte) 100, -24);
        }
        class393.field5747 = true;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "()V", line = 104)
    public static final void method2431() {
        class417.method2611(1, class13.field218);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(BI)V", line = 118)
    public static final void method2432(byte arg0, int arg1) {
        class243.field3538 = arg1;
        field5483++;
        if (arg0 > 65) {
            class393.field5744.method106((byte) -126);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)V", line = 137)
    public static final void method2433(boolean arg0) {
        if (!arg0) {
            method2432((byte) 80, -12);
        }
        field5493++;
        if (class315.field4585 != null) {
            return;
        }
        Container var1;
        if (class239.field3443 == null) {
            var1 = class188.field2783.field2639;
        } else {
            var1 = class239.field3443;
        }
        class349.field4962 = var1.getSize().width;
        class311.field4526 = var1.getSize().height;
        if (class239.field3443 == var1) {
            Insets var2 = class239.field3443.getInsets();
            class311.field4526 -= var2.top + var2.bottom;
            class349.field4962 -= var2.right + var2.left;
        }
        if (class285.method2015(6071) == 1) {
            class358.field5107 = (class349.field4962 - 765) / 2;
            class277.field4170 = 503;
            class113.field1819 = 765;
            class284.field4259 = 0;
        } else if (class75.field1288 < 96 && class288.field4303 == 0) {
            int var3 = class349.field4962 <= 1024 ? class349.field4962 : 1024;
            int var4 = class311.field4526 > 768 ? 768 : class311.field4526;
            class113.field1819 = var3;
            class358.field5107 = (class349.field4962 - var3) / 2;
            class284.field4259 = 0;
            class277.field4170 = var4;
        } else {
            class284.field4259 = 0;
            class358.field5107 = 0;
            class277.field4170 = class311.field4526;
            class113.field1819 = class349.field4962;
        }
        if (class360.field5124 != 0) {
            boolean var10000;
            if (class113.field1819 < 1024 && class277.field4170 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class33.field475.setSize(class113.field1819, class277.field4170);
        if (class73.field1235 != null) {
            class73.field1235.method684();
        }
        if (class239.field3443 == var1) {
            Insets var5 = class239.field3443.getInsets();
            class33.field475.setLocation(class358.field5107 + var5.left, class284.field4259 + var5.top);
        } else {
            class33.field475.setLocation(class358.field5107, class284.field4259);
        }
        if (class321.field4642 != -1) {
            class93.method787((byte) 48, true);
        }
        class58.method450(0);
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(IIIIB)V", line = 233)
    public class383(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field5495 = arg3;
        this.field5486 = arg1;
        this.field5492 = arg4;
        this.field5482 = arg2;
        this.field5476 = arg0;
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Loo;I)V", line = 244)
    public class383(class383 arg0, int arg1) {
        this.field5488 = arg0;
        this.field5492 = this.field5488.field5492;
        this.field5482 = this.field5488.field5482 + arg1;
        this.field5486 = this.field5488.field5486 + arg1;
        this.field5476 = this.field5488.field5476;
        this.field5495 = this.field5488.field5495 + arg1;
    }
}
