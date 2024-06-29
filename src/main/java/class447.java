import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class447 extends class65 {

    @OriginalMember(owner = "client!eu", name = "L", descriptor = "I")
    public int field6527 = 0;

    @OriginalMember(owner = "client!eu", name = "E", descriptor = "I")
    public static int field6520 = 0;

    @OriginalMember(owner = "client!eu", name = "l", descriptor = "I")
    public int field6501;

    @OriginalMember(owner = "client!eu", name = "m", descriptor = "I")
    public int field6502;

    @OriginalMember(owner = "client!eu", name = "n", descriptor = "I")
    public int field6503;

    @OriginalMember(owner = "client!eu", name = "o", descriptor = "I")
    public int field6504;

    @OriginalMember(owner = "client!eu", name = "u", descriptor = "I")
    public int field6510;

    @OriginalMember(owner = "client!eu", name = "v", descriptor = "I")
    public int field6511;

    @OriginalMember(owner = "client!eu", name = "w", descriptor = "I")
    public int field6512;

    @OriginalMember(owner = "client!eu", name = "x", descriptor = "I")
    public static int field6513;

    @OriginalMember(owner = "client!eu", name = "z", descriptor = "I")
    public int field6515;

    @OriginalMember(owner = "client!eu", name = "B", descriptor = "I")
    public int field6517;

    @OriginalMember(owner = "client!eu", name = "D", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!eu", name = "G", descriptor = "I")
    public int field6522;

    @OriginalMember(owner = "client!eu", name = "H", descriptor = "I")
    public int field6523;

    @OriginalMember(owner = "client!eu", name = "K", descriptor = "I")
    public int field6526;

    @OriginalMember(owner = "client!eu", name = "M", descriptor = "I")
    public int field6528;

    @OriginalMember(owner = "client!eu", name = "A", descriptor = "Lcca;")
    public class461 field6516;

    @OriginalMember(owner = "client!eu", name = "s", descriptor = "Lso;")
    public class538 field6508;

    @OriginalMember(owner = "client!eu", name = "y", descriptor = "Lso;")
    public class538 field6514;

    @OriginalMember(owner = "client!eu", name = "r", descriptor = "Lbfa;")
    public class573 field6507;

    @OriginalMember(owner = "client!eu", name = "t", descriptor = "Lsv;")
    public class57 field6509;

    @OriginalMember(owner = "client!eu", name = "C", descriptor = "Lsv;")
    public class57 field6518;

    @OriginalMember(owner = "client!eu", name = "I", descriptor = "Ljl;")
    public class595 field6524;

    @OriginalMember(owner = "client!eu", name = "q", descriptor = "Lkda;")
    public class61 field6506;

    @OriginalMember(owner = "client!eu", name = "F", descriptor = "Lkda;")
    public class61 field6521;

    @OriginalMember(owner = "client!eu", name = "O", descriptor = "Lgu;")
    public static class726 field6530;

    @OriginalMember(owner = "client!eu", name = "k", descriptor = "Z")
    public boolean field6500;

    @OriginalMember(owner = "client!eu", name = "J", descriptor = "Z")
    public boolean field6525;

    @OriginalMember(owner = "client!eu", name = "N", descriptor = "Z")
    public boolean field6529;

    @OriginalMember(owner = "client!eu", name = "p", descriptor = "[I")
    public int[] field6505;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIB)V")
    public static final void method2753(int arg0, int arg1, byte arg2) {
        if (arg2 < 17) {
            return;
        }
        field6519++;
        if (class13.field119 == null) {
            return;
        }
        int var3 = class390.field5830;
        int var4 = class245.field3937;
        class383.method2407(true, arg0, arg1);
        if (class554.field7897 == 0) {
            class548.field7817 = null;
            class548.field7817 = class13.field119.method1344(class13.field119.method1288(class208.field3477, class379.field5699), class13.field119.method1276(class208.field3477, class379.field5699));
        } else if (class554.field7897 == 1 && (class70.field1087 == null || class390.field5830 != var3 || class245.field3937 != var4)) {
            class70.field1087 = new class456[class390.field5830 * class245.field3937];
            for (int var5 = 0; var5 < class70.field1087.length; var5++) {
                class70.field1087[var5] = class13.field119.method1344(class13.field119.method1288(class412.field6070, class362.field5468), class13.field119.method1276(class412.field6070, class362.field5468));
            }
            class693.field9827 = new int[class390.field5830 * class245.field3937];
            class418.field6149 = 1;
        }
        class245.field3947 = true;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V")
    public final void method2754(int arg0) {
        field6513++;
        if (arg0 > -60) {
            return;
        }
        int var2 = this.field6515;
        boolean var3 = this.field6525;
        if (this.field6524 != null) {
            class595 var4 = this.field6524.method3413(-1, class422.field6216);
            if (var4 == null) {
                this.field6515 = -1;
                this.field6510 = 0;
                this.field6501 = 256;
                this.field6505 = null;
                this.field6528 = 0;
                this.field6526 = 0;
                this.field6525 = false;
                this.field6517 = 256;
                this.field6529 = false;
                this.field6522 = 0;
            } else {
                this.field6510 = var4.field8354 << 9;
                this.field6522 = var4.field8387;
                this.field6526 = var4.field8394;
                this.field6501 = var4.field8370;
                this.field6529 = var4.field8362;
                this.field6528 = var4.field8403;
                this.field6525 = var4.field8356;
                this.field6505 = var4.field8438;
                this.field6515 = var4.field8378;
                this.field6517 = var4.field8407;
            }
        } else if (this.field6516 != null) {
            int var5 = class91.method769(-62, this.field6516);
            if (var2 != var5) {
                this.field6515 = var5;
                class504 var6 = this.field6516.field6688;
                if (var6.field7308 != null) {
                    var6 = var6.method3046(119, class422.field6216);
                }
                if (var6 == null) {
                    this.field6522 = this.field6510 = 0;
                    this.field6517 = 256;
                    this.field6525 = this.field6516.field6688.field7356;
                    this.field6501 = 256;
                } else {
                    this.field6510 = var6.field7313 << 9;
                    this.field6501 = var6.field7354;
                    this.field6517 = var6.field7340;
                    this.field6525 = var6.field7356;
                    this.field6522 = var6.field7342;
                }
            }
        } else if (this.field6507 != null) {
            this.field6515 = class684.method3817(this.field6507, (byte) -118);
            this.field6522 = this.field6507.field8141;
            this.field6525 = this.field6507.field8105;
            this.field6510 = this.field6507.field8153 << 9;
            this.field6501 = 256;
            this.field6517 = 256;
        }
        if (this.field6515 == var2 && var3 == this.field6525) {
            return;
        }
        if (this.field6518 == null) {
            return;
        }
        class324.field4793.method2223(this.field6518);
        this.field6521 = null;
        this.field6518 = null;
        this.field6508 = null;
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)V")
    public static void method2755(int arg0) {
        if (arg0 != 256) {
            method2753(-100, 77, (byte) -18);
        }
        field6530 = null;
    }
}
