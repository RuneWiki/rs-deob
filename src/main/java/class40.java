import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class40 extends class139 {

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "I")
    private int field521 = 204;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "I")
    private int field524 = 1;

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
    private int field520 = 1;

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "J")
    public static long field522 = 0L;

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "I")
    public static int field523 = -1;

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field526 = new Rectangle[100];

    @OriginalMember(owner = "client!ha", name = "V", descriptor = "[I")
    public static int[] field532;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!ha", name = "R", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!ha", name = "S", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!ha", name = "W", descriptor = "Lbg;")
    public static class298 field533;

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "Lii;")
    public static class358 field519;

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "[S")
    public static short[] field531;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        if (arg1 != -45) {
            this.method22(36, 15);
        }
        ++field518;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field521 = arg0.method1729(65280);
                }
            } else {
                this.field520 = arg0.method1701(-23121);
            }
        } else {
            this.field524 = arg0.method1701(arg1 + -23076);
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
    public class40() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method258(boolean arg0, String arg1) {
        ++field529;
        if (!arg1.equals("")) {
            ++class222.field3361;
            class15.method110(class312.field4408, -128);
            class225.field3415.method1753(true, class89.method501(arg1, true));
            if (arg0) {
                method260(-108);
            }
            class225.field3415.method1730(-11508, arg1);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BILhg;)V")
    public static final void method259(byte arg0, int arg1, class450 arg2) {
        if (class398.field5648) {
            arg1 = 0;
            class398.field5648 = false;
        }
        ++field525;
        if (class328.field4747 == null || !class328.field4747.method2625(-3694, arg2)) {
            class328.field4747 = arg2;
            class324.field4678 = class433.method2562(-2039);
            class276.field4034 = arg1;
            class348.field5044 = arg1;
            if (class348.field5044 != 0) {
                class480.field6736 = class149.field2234;
                class190.field2829 = class368.field5322;
                class323.field4665 = class112.field1420;
                class66.field847 = class442.field6127;
                class313.field4419 = class93.field1182;
                class185.field2747 = class453.field6392;
                class199.field2909 = class51.field703;
                class95.field1222 = class490.field6914;
                class80.field985 = class260.field3804;
                class453.field6391 = class207.field3170;
            } else {
                class364.method2250(1513438280);
            }
        }
        if (arg0 != 46) {
            method260(-95);
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        if (arg1 != 27782) {
            this.field521 = -31;
        }
        ++field530;
        int[] var3 = super.field1844.method2176(arg0, 0);
        if (super.field1844.field5045) {
            for (int var4 = 0; class356.field5147 > var4; ++var4) {
                int var5 = class216.field3245[var4];
                int var6 = class237.field3559[arg0];
                int var7 = this.field524 * var5 >> 12;
                int var8 = this.field520 * var6 >> 12;
                int var9 = var5 % (4096 / this.field524) * this.field524;
                int var10 = var6 % (4096 / this.field520) * this.field520;
                if (~this.field521 < ~var10) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var9 < this.field521) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~var9 > ~this.field521) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public static void method260(int arg0) {
        field532 = null;
        field519 = null;
        field531 = null;
        field533 = null;
        if (arg0 != 3) {
            method262(-65, 12, -30);
        }
        field526 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZI)I")
    public static final int method261(boolean arg0, int arg1) {
        ++field528;
        if (!arg0) {
            field519 = null;
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(III)I")
    public static final int method262(int arg0, int arg1, int arg2) {
        int var3 = (127 & arg0) * arg1 >> 7;
        int var4 = -75 % ((-47 - arg2) / 61);
        ++field527;
        if (~var3 <= -3) {
            if (~var3 < -127) {
                var3 = 126;
            }
        } else {
            var3 = 2;
        }
        return (65408 & arg0) + var3;
    }

    static {
        for (int var0 = 0; ~var0 > -101; ++var0) {
            field526[var0] = new Rectangle();
        }
        new class326("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
        field532 = new int[50];
    }
}
