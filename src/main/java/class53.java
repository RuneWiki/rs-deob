import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class53 extends class337 {

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public int field677 = 0;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "Z")
    public static boolean field676 = false;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public int field669;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "I")
    public int field673;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "I")
    public int field675;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "I")
    public int field679;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    public int field680;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public int field683;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "I")
    public int field688;

    @OriginalMember(owner = "client!te", name = "I", descriptor = "I")
    public int field690;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public int field691;

    @OriginalMember(owner = "client!te", name = "M", descriptor = "I")
    public int field694;

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "I")
    public int field698;

    @OriginalMember(owner = "client!te", name = "R", descriptor = "I")
    public int field699;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "J")
    public static long field693;

    @OriginalMember(owner = "client!te", name = "N", descriptor = "Ljha;")
    public class33 field695;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "Liha;")
    public class635 field686;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "Liha;")
    public class635 field689;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "Lnga;")
    public class701 field672;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "Lnga;")
    public class701 field674;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "Lft;")
    public class727 field682;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "Llea;")
    public class74 field684;

    @OriginalMember(owner = "client!te", name = "P", descriptor = "Llea;")
    public class74 field697;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "Lih;")
    public class773 field668;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "Z")
    public boolean field678;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "Z")
    public boolean field692;

    @OriginalMember(owner = "client!te", name = "O", descriptor = "Z")
    public boolean field696;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "[I")
    public int[] field685;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjava/lang/String;)V", line = 27)
    public static final void method330(int arg0, String arg1) {
        field681++;
        if (class638.field8105 == null) {
            return;
        }
        if (arg0 != -1) {
            field693 = -95L;
        }
        class493.field6317++;
        class13 var2 = class659.method3587(class68.field909, arg0 ^ 0xFFFFFF9D, class138.field1821);
        var2.field130.method1491(-129, class32.method168(arg1, 108));
        var2.field130.method1547(arg1, arg0 - 6456);
        class116.method679(var2, 0);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILvba;)V", line = 52)
    public static final void method331(int arg0, class765 arg1) {
        field667++;
        if (class525.field6678) {
            return;
        }
        arg1.method1946(-10364);
        if (arg0 >= -63) {
            field676 = false;
        }
        class628.field7982--;
        if (!arg1.field10407) {
            long var5 = arg1.field10409;
            class403 var7;
            for (var7 = (class403) class517.field6586.method2616(var5, (byte) 61); var7 != null && !var7.field5366.equals(arg1.field10408); var7 = (class403) class517.field6586.method2615(8)) {
            }
            if (var7 != null && var7.method2357(20488, arg1)) {
                class512.method2828(8113, var7);
            }
            return;
        }
        for (class403 var2 = (class403) class253.field3440.method3855(0); var2 != null; var2 = (class403) class253.field3440.method3861(true)) {
            if (var2.field5366.equals(arg1.field10408)) {
                boolean var3 = false;
                for (class765 var4 = (class765) var2.field5365.method3855(0); var4 != null; var4 = (class765) var2.field5365.method3861(true)) {
                    if (arg1 == var4) {
                        var3 = true;
                        if (var2.method2357(20488, arg1)) {
                            class512.method2828(8113, var2);
                        }
                        break;
                    }
                }
                if (var3) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V", line = 128)
    public final void method332(byte arg0) {
        field670++;
        int var2 = this.field698;
        boolean var3 = this.field678;
        if (this.field668 != null) {
            class773 var6 = this.field668.method4213(class381.field4705, -125);
            if (var6 == null) {
                this.field671 = 0;
                this.field675 = 0;
                this.field698 = -1;
                this.field669 = 0;
                this.field690 = 0;
                this.field694 = 256;
                this.field688 = 256;
                this.field685 = null;
                this.field687 = 0;
                this.field692 = false;
                this.field678 = false;
            } else {
                this.field685 = var6.field10471;
                this.field698 = var6.field10477;
                this.field690 = var6.field10491 << 9;
                this.field678 = var6.field10514;
                this.field694 = var6.field10509;
                this.field692 = var6.field10530;
                this.field669 = var6.field10486;
                this.field688 = var6.field10472;
                this.field675 = var6.field10483;
                this.field671 = var6.field10492;
            }
        } else if (this.field682 != null) {
            int var4 = class364.method2094(this.field682, (byte) 49);
            if (var2 != var4) {
                this.field698 = var4;
                class240 var5 = this.field682.field9545;
                if (var5.field3289 != null) {
                    var5 = var5.method1585((byte) -100, class381.field4705);
                }
                if (var5 == null) {
                    this.field688 = 256;
                    this.field694 = 256;
                    this.field675 = this.field690 = this.field687 = 0;
                    this.field678 = this.field682.field9545.field3252;
                } else {
                    this.field687 = var5.field3276 << 9;
                    this.field678 = var5.field3252;
                    this.field694 = var5.field3286;
                    this.field688 = var5.field3297;
                    this.field690 = var5.field3248 << 9;
                    this.field675 = var5.field3251;
                }
            }
        } else if (this.field695 != null) {
            this.field698 = class364.method2090(this.field695, -16422);
            this.field688 = 256;
            this.field678 = this.field695.field370;
            this.field694 = 256;
            this.field687 = 0;
            this.field690 = this.field695.field338 << 9;
            this.field675 = this.field695.field346;
        }
        if (arg0 < 94) {
            this.field673 = -44;
        }
        if (this.field698 == var2 && var3 == this.field678) {
            return;
        }
        if (this.field686 == null) {
            return;
        }
        class1.field10.method30(this.field686);
        this.field674 = null;
        this.field684 = null;
        this.field686 = null;
    }
}
