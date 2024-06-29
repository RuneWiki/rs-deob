import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class21 extends class84 {

    @OriginalMember(owner = "client!bk", name = "S", descriptor = "I")
    private int field231 = -1;

    @OriginalMember(owner = "client!bk", name = "N", descriptor = "I")
    public static int field227 = 0;

    @OriginalMember(owner = "client!bk", name = "X", descriptor = "[I")
    public static int[] field236 = new int[2000];

    @OriginalMember(owner = "client!bk", name = "W", descriptor = "I")
    public static int field235 = 0;

    @OriginalMember(owner = "client!bk", name = "eb", descriptor = "Ljava/lang/String;")
    public static String field243 = "Loaded defaults";

    @OriginalMember(owner = "client!bk", name = "cb", descriptor = "I")
    public static int field241 = 5063219;

    @OriginalMember(owner = "client!bk", name = "T", descriptor = "Lcc;")
    public static class216 field232 = new class216(64);

    @OriginalMember(owner = "client!bk", name = "O", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!bk", name = "Q", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!bk", name = "R", descriptor = "I")
    private int field230;

    @OriginalMember(owner = "client!bk", name = "U", descriptor = "I")
    private int field233;

    @OriginalMember(owner = "client!bk", name = "V", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!bk", name = "Z", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!bk", name = "ab", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!bk", name = "bb", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!bk", name = "db", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!bk", name = "fb", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!bk", name = "Y", descriptor = "Lek;")
    public static class167 field237;

    @OriginalMember(owner = "client!bk", name = "gb", descriptor = "Llc;")
    public static class86 field245;

    @OriginalMember(owner = "client!bk", name = "M", descriptor = "[I")
    private int[] field226;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        if (~arg2 == -1) {
            this.field231 = arg0.method1126(false);
        }
        if (arg1 <= 87) {
            method134((byte) -62);
        }
        ++field229;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(B)V")
    public static void method134(byte arg0) {
        field245 = null;
        field232 = null;
        field236 = null;
        field243 = null;
        int var1 = 112 / ((-5 - arg0) / 63);
        field237 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        ++field240;
        if (arg1 != -18) {
            return null;
        } else {
            int[][] var3 = super.field1211.method193((byte) -127, arg0);
            if (super.field1211.field321 && this.method138((byte) -100)) {
                int var4 = this.field230 * (~class49.field718 != ~this.field233 ? this.field233 * arg0 / class49.field718 : arg0);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                if (~class20.field221 == ~this.field230) {
                    for (int var8 = 0; class20.field221 > var8; ++var8) {
                        int var9 = this.field226[var4++];
                        var7[var8] = class179.method1337(255, var9) << 4;
                        var6[var8] = class179.method1337(var9 >> 4, 4080);
                        var5[var8] = class179.method1337(16711680, var9) >> 12;
                    }
                } else {
                    for (int var10 = 0; var10 < class20.field221; ++var10) {
                        int var11 = this.field230 * var10 / class20.field221;
                        int var12 = this.field226[var4 + var11];
                        var7[var10] = class179.method1337(4080, var12 << 4);
                        var6[var10] = class179.method1337(4080, var12 >> 4);
                        var5[var10] = class179.method1337(16711680, var12) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(B)V")
    public static final void method135(byte arg0) {
        ++field234;
        if (~class206.field3312 != -1) {
            try {
                if (~(++class240.field3826) < -1501) {
                    if (class180.field2901 != null) {
                        class180.field2901.method728((byte) -66);
                        class180.field2901 = null;
                    }
                    if (class179.field2889 >= 1) {
                        class136.field2224 = -5;
                        class206.field3312 = 0;
                        return;
                    }
                    if (class256.field4223 != class205.field3287) {
                        class205.field3287 = class256.field4223;
                    } else {
                        class205.field3287 = class159.field2610;
                    }
                    class206.field3312 = 1;
                    ++class179.field2889;
                    class240.field3826 = 0;
                }
                if (class206.field3312 == 1) {
                    class160.field2622 = class138.field2241.method47(class205.field3287, 83, class143.field2298);
                    class206.field3312 = 2;
                }
                if (class206.field3312 == 2) {
                    if (~class160.field2622.field4450 == -3) {
                        throw new IOException();
                    }
                    if (~class160.field2622.field4450 != -2) {
                        return;
                    }
                    class180.field2901 = new class92((Socket) class160.field2622.field4449, class138.field2241);
                    class160.field2622 = null;
                    class180.field2901.method726(0, class220.field3532.field2511, 29023, class220.field3532.field2523);
                    if (class240.field3830 != null) {
                        class240.field3830.method1600((byte) 105);
                    }
                    if (class223.field3572 != null) {
                        class223.field3572.method1600((byte) 121);
                    }
                    int var1 = class180.field2901.method719(true);
                    if (class240.field3830 != null) {
                        class240.field3830.method1600((byte) 115);
                    }
                    if (class223.field3572 != null) {
                        class223.field3572.method1600((byte) 120);
                    }
                    if (~var1 != -102) {
                        class206.field3312 = 0;
                        class136.field2224 = var1;
                        class180.field2901.method728((byte) 126);
                        class180.field2901 = null;
                        return;
                    }
                    class206.field3312 = 3;
                }
                if (~class206.field3312 == -4) {
                    if (class180.field2901.method727(1) >= 2) {
                        int var2 = class180.field2901.method719(true) << 8 | class180.field2901.method719(true);
                        class101.method771(40000, var2);
                        if (~class155.field2554 == 0) {
                            class136.field2224 = 6;
                            class206.field3312 = 0;
                            class180.field2901.method728((byte) -107);
                            class180.field2901 = null;
                        } else {
                            class206.field3312 = 0;
                            class180.field2901.method728((byte) 127);
                            class180.field2901 = null;
                            class62.method451(-102);
                        }
                    }
                } else {
                    int var3 = 33 % ((arg0 - -24) / 50);
                }
            } catch (IOException var4) {
                if (class180.field2901 != null) {
                    class180.field2901.method728((byte) -71);
                    class180.field2901 = null;
                }
                if (~class179.field2889 <= -2) {
                    class136.field2224 = -4;
                    class206.field3312 = 0;
                } else {
                    ++class179.field2889;
                    class240.field3826 = 0;
                    class206.field3312 = 1;
                    if (class256.field4223 != class205.field3287) {
                        class205.field3287 = class256.field4223;
                    } else {
                        class205.field3287 = class159.field2610;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "(I)I")
    public final int method136(int arg0) {
        if (arg0 != -1) {
            this.method138((byte) -28);
        }
        ++field238;
        return this.field231;
    }

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "(I)V")
    public final void method32(int arg0) {
        ++field242;
        super.method32(arg0 ^ arg0);
        this.field226 = null;
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(B)V")
    public static final void method137(byte arg0) {
        ++field239;
        class213.field3406.method1556((byte) 94);
        if (arg0 < 43) {
            method137((byte) -29);
        }
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "(B)Z")
    private final boolean method138(byte arg0) {
        ++field228;
        if (this.field226 != null) {
            return true;
        } else {
            if (arg0 > -84) {
                this.method31((class152) null, (byte) -78, 124);
            }
            if (this.field231 >= 0) {
                int var2 = class20.field221;
                int var3 = class49.field718;
                int var4 = class168.field2714.method1514(this.field231, 0).field545 ? 64 : 128;
                this.field226 = class168.field2714.method1516(1.0F, var4, this.field231, var4, (byte) 115, false);
                this.field230 = var4;
                this.field233 = var4;
                class134.method969(var3, (byte) -118, var2);
                return this.field226 != null;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
    public class21() {
        super(0, false);
    }
}
