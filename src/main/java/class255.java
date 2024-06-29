import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class255 extends class241 {

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "I")
    public int field4449 = 0;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
    public static int field4436 = 0;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public static int field4428 = 0;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "[I")
    public static int[] field4438 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "Lpc;")
    public static class21 field4445 = null;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "Loh;")
    public static class263 field4430 = class253.method1681(-123, "headicons_prayer");

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "Loh;")
    public static class263 field4455 = class253.method1681(-122, "mapdots");

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
    public int field4435;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    public int field4437;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
    public int field4439;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "I")
    public int field4440;

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
    public int field4441;

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "I")
    public int field4447;

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "I")
    public int field4450;

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
    public int field4452;

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "I")
    public int field4453;

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "I")
    public int field4456;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "Lfg;")
    public class12 field4433;

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "Ldg;")
    public class137 field4451;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "Lkd;")
    public class199 field4432;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "Lkd;")
    public class199 field4434;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "Lmg;")
    public static class254 field4454;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "Lbi;")
    public class90 field4443;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "Z")
    public boolean field4429;

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "[I")
    public int[] field4446;

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "[I")
    public static int[] field4448;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public static void method1692(byte arg0) {
        field4454 = null;
        field4445 = null;
        field4430 = null;
        field4438 = null;
        field4448 = null;
        field4455 = null;
        if (arg0 != 41) {
            method1692((byte) 27);
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
    public final void method1693(int arg0) {
        int var2 = this.field4453;
        field4431++;
        int var3 = -111 % ((-arg0 - 5) / 56);
        if (this.field4433 != null) {
            class12 var4 = this.field4433.method97(102);
            if (var4 == null) {
                this.field4435 = 0;
                this.field4440 = 0;
                this.field4456 = 0;
                this.field4453 = -1;
                this.field4446 = null;
            } else {
                this.field4453 = var4.field289;
                this.field4446 = var4.field296;
                this.field4440 = var4.field301 * 128;
                this.field4435 = var4.field280;
                this.field4456 = var4.field269;
            }
        } else if (this.field4443 != null) {
            int var5 = class48.method307(86, this.field4443);
            if (var2 != var5) {
                this.field4453 = var5;
                class204 var6 = this.field4443.field1787;
                if (var6.field3691 != null) {
                    var6 = var6.method1407((byte) -31);
                }
                if (var6 == null) {
                    this.field4440 = 0;
                } else {
                    this.field4440 = var6.field3689 * 128;
                }
            }
        } else if (this.field4451 != null) {
            this.field4453 = class145.method959(this.field4451, 111);
            this.field4440 = this.field4451.field2530 * 128;
        }
        if (this.field4453 != var2 && this.field4434 != null) {
            class43.field933.method1136(this.field4434);
            this.field4434 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1694(byte[] arg0, int arg1) {
        if (arg1 != 323) {
            method1694((byte[]) null, 19);
        }
        field4442++;
        class194 var2 = new class194(arg0);
        int var3 = var2.method1301(-8317);
        int var4 = var2.method1266(4);
        if (var4 < 0 || !(class159.field2879 == 0 || class159.field2879 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method1315(var4, 0, true, var5);
            return var5;
        } else {
            int var6 = var2.method1266(4);
            if (var6 < 0 || !(class159.field2879 == 0 || class159.field2879 >= var6)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class274.method1861(var7, var6, arg0, var4, 9);
            } else {
                class49.field1050.method1198(false, var7, var2);
            }
            return var7;
        }
    }
}
