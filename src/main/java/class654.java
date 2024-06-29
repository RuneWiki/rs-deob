import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class654 extends class430 {

    @OriginalMember(owner = "client!fj", name = "A", descriptor = "I")
    public int field9374 = 0;

    @OriginalMember(owner = "client!fj", name = "C", descriptor = "I")
    public static int field9376 = 0;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public int field9354;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public static int field9358;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public int field9359;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
    public int field9360;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
    public int field9361;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "I")
    public int field9362;

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "I")
    public static int field9364;

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "I")
    public int field9368;

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "I")
    public static int field9369;

    @OriginalMember(owner = "client!fj", name = "x", descriptor = "I")
    public int field9371;

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "I")
    public int field9373;

    @OriginalMember(owner = "client!fj", name = "D", descriptor = "I")
    public int field9377;

    @OriginalMember(owner = "client!fj", name = "E", descriptor = "I")
    public int field9378;

    @OriginalMember(owner = "client!fj", name = "F", descriptor = "I")
    public int field9379;

    @OriginalMember(owner = "client!fj", name = "G", descriptor = "I")
    public int field9380;

    @OriginalMember(owner = "client!fj", name = "I", descriptor = "I")
    public int field9382;

    @OriginalMember(owner = "client!fj", name = "K", descriptor = "I")
    public static int field9384;

    @OriginalMember(owner = "client!fj", name = "B", descriptor = "Liq;")
    public class149 field9375;

    @OriginalMember(owner = "client!fj", name = "L", descriptor = "Liq;")
    public class149 field9385;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "Lrq;")
    public class482 field9356;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "Lpd;")
    public class531 field9357;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "Lpd;")
    public class531 field9363;

    @OriginalMember(owner = "client!fj", name = "J", descriptor = "Lgt;")
    public class571 field9383;

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "Ll;")
    public class639 field9366;

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "Ljda;")
    public class673 field9370;

    @OriginalMember(owner = "client!fj", name = "H", descriptor = "Ljda;")
    public class673 field9381;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "Z")
    public boolean field9355;

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "Z")
    public boolean field9367;

    @OriginalMember(owner = "client!fj", name = "y", descriptor = "Z")
    public boolean field9372;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "[I")
    public int[] field9365;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V", line = 6)
    public final void method3752(int arg0) {
        field9384++;
        int var2 = this.field9354;
        if (arg0 != 1024) {
            this.method3752(-24);
        }
        boolean var3 = this.field9355;
        if (this.field9356 != null) {
            class482 var6 = this.field9356.method2952(-1, class226.field3372);
            if (var6 == null) {
                this.field9354 = -1;
                this.field9361 = 0;
                this.field9378 = 0;
                this.field9372 = false;
                this.field9373 = 0;
                this.field9365 = null;
                this.field9382 = 256;
                this.field9377 = 256;
                this.field9355 = false;
                this.field9380 = 0;
            } else {
                this.field9365 = var6.field6944;
                this.field9378 = var6.field6888;
                this.field9372 = var6.field6908;
                this.field9373 = var6.field6909;
                this.field9354 = var6.field6962;
                this.field9377 = var6.field6928;
                this.field9382 = var6.field6881;
                this.field9355 = var6.field6955;
                this.field9380 = var6.field6898 << 9;
                this.field9361 = var6.field6941;
            }
        } else if (this.field9383 != null) {
            int var4 = class491.method2990(false, this.field9383);
            if (var2 != var4) {
                this.field9354 = var4;
                class521 var5 = this.field9383.field8235;
                if (var5.field7535 != null) {
                    var5 = var5.method3166(class226.field3372, true);
                }
                if (var5 == null) {
                    this.field9382 = 256;
                    this.field9355 = this.field9383.field8235.field7528;
                    this.field9373 = this.field9380 = 0;
                    this.field9377 = 256;
                } else {
                    this.field9355 = var5.field7528;
                    this.field9373 = var5.field7537;
                    this.field9380 = var5.field7566 << 9;
                    this.field9377 = var5.field7531;
                    this.field9382 = var5.field7570;
                }
            }
        } else if (this.field9366 != null) {
            this.field9354 = class240.method1658(arg0 ^ 0x71F8, this.field9366);
            this.field9373 = this.field9366.field9092;
            this.field9380 = this.field9366.field9077 << 9;
            this.field9377 = 256;
            this.field9355 = this.field9366.field9091;
            this.field9382 = 256;
        }
        if (this.field9354 == var2 && this.field9355 == var3) {
            return;
        }
        if (this.field9375 == null) {
            return;
        }
        class593.field8429.method3652(this.field9375);
        this.field9363 = null;
        this.field9381 = null;
        this.field9375 = null;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V", line = 122)
    public static final void method3753(int arg0) {
        field9369++;
        client var1 = class660.field9437;
        synchronized (class660.field9437) {
            if (class214.field3211 == null) {
                Container var2;
                if (class696.field9834 != null) {
                    var2 = class696.field9834;
                } else if (class486.field6999 == null) {
                    var2 = class181.field2502;
                } else {
                    var2 = class486.field6999;
                }
                class291.field4016 = var2.getSize().width;
                if (arg0 < 42) {
                    method3753(-39);
                }
                class443.field6318 = var2.getSize().height;
                if (class696.field9834 == var2) {
                    Insets var3 = class696.field9834.getInsets();
                    class291.field4016 -= var3.right + var3.left;
                    class443.field6318 -= var3.top + var3.bottom;
                }
                if (class184.method1305(1) == 1) {
                    class658.field9423 = (class291.field4016 - class758.field10546) / 2;
                    class26.field232 = 0;
                    class565.field8187 = class544.field7915;
                    class68.field1042 = class758.field10546;
                } else {
                    class132.method931(-97);
                }
                if (class536.field7793 != class25.field223) {
                    boolean var10000;
                    if (class68.field1042 < 1024 && class565.field8187 < 768) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                }
                class95.field1383.setSize(class68.field1042, class565.field8187);
                if (class211.field3164 != null) {
                    if (class416.field5919) {
                        class90.method703(class95.field1383, -6993);
                    } else {
                        class211.field3164.method314(class95.field1383, class68.field1042, class565.field8187);
                    }
                }
                if (class696.field9834 == var2) {
                    Insets var4 = class696.field9834.getInsets();
                    class95.field1383.setLocation(class658.field9423 + var4.left, class26.field232 + var4.top);
                } else {
                    class95.field1383.setLocation(class658.field9423, class26.field232);
                }
                if (class346.field4771 != -1) {
                    class196.method1380(-108, true);
                }
                class457.method2783((byte) 76);
            }
        }
    }
}
