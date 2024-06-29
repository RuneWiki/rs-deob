import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class72 extends class113 {

    @OriginalMember(owner = "client!i", name = "K", descriptor = "Z")
    public boolean field1642 = false;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "Lwh;")
    private class205 field1649;

    @OriginalMember(owner = "client!i", name = "G", descriptor = "Z")
    public boolean field1638;

    @OriginalMember(owner = "client!i", name = "V", descriptor = "Z")
    public boolean field1653;

    @OriginalMember(owner = "client!i", name = "L", descriptor = "I")
    public int field1643;

    @OriginalMember(owner = "client!i", name = "C", descriptor = "I")
    public int field1634;

    @OriginalMember(owner = "client!i", name = "D", descriptor = "I")
    private int field1635;

    @OriginalMember(owner = "client!i", name = "ab", descriptor = "I")
    private int field1658;

    @OriginalMember(owner = "client!i", name = "Y", descriptor = "I")
    private int field1656;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "I")
    private int field1648;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "I")
    public static int field1646 = -1;

    @OriginalMember(owner = "client!i", name = "M", descriptor = "Lfa;")
    public static class47 field1644 = null;

    @OriginalMember(owner = "client!i", name = "X", descriptor = "Lcd;")
    public static class23 field1655 = class54.method414("Ihr Charakter)2Profil wird in:", -1);

    @OriginalMember(owner = "client!i", name = "S", descriptor = "[Lfe;")
    public static class51[] field1650 = new class51[16];

    @OriginalMember(owner = "client!i", name = "P", descriptor = "Lcd;")
    public static class23 field1647 = class54.method414("Benutzen Sie bitte eine andere Welt)3", -1);

    @OriginalMember(owner = "client!i", name = "Z", descriptor = "I")
    public static int field1657 = 0;

    @OriginalMember(owner = "client!i", name = "T", descriptor = "F")
    private float field1651;

    @OriginalMember(owner = "client!i", name = "E", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!i", name = "F", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!i", name = "H", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!i", name = "J", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!i", name = "N", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!i", name = "W", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!i", name = "I", descriptor = "[I")
    private int[] field1640;

    @OriginalMember(owner = "client!i", name = "U", descriptor = "[I")
    public static int[] field1652;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lfa;B)Lfa;")
    public static final class47 method511(class47 arg0, byte arg1) {
        field1636++;
        if (arg1 > -69) {
            field1657 = -75;
        }
        int var2 = class17.method104(1355016679, class141.method909(arg0, 13));
        if (var2 == 0) {
            return null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg0 = class113.method725((byte) 113, arg0.field1051);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lhh;ILkh;IF)[I")
    public final int[] method512(class71 arg0, int arg1, class97 arg2, int arg3, float arg4) {
        if (arg1 != 0) {
            return null;
        }
        field1654++;
        if (this.field1640 == null || this.field1651 != arg4) {
            if (!this.field1649.method1341(arg2, (byte) 20, arg0)) {
                return null;
            }
            int var6 = this.field1643 > arg3 ? arg3 : this.field1643;
            this.field1640 = this.field1649.method1338(arg0, var6, arg1 - 1, true, var6, arg4, arg2);
            this.field1651 = arg4;
        }
        return this.field1640;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lkh;Lhh;II)[I")
    public final int[] method513(class97 arg0, class71 arg1, int arg2, int arg3) {
        field1641++;
        if (!this.field1649.method1341(arg0, (byte) 98, arg1)) {
            return null;
        }
        if (arg3 != 32231) {
            this.field1656 = -33;
        }
        int var5 = arg2 < this.field1643 ? arg2 : this.field1643;
        return this.field1649.method1338(arg1, var5, -1, false, var5, 1.0F, arg0);
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(I)V")
    public static final void method514(int arg0) {
        field1645++;
        class162.field3248.method997(false);
        class67.field1570.method997(false);
        if (arg0 != 1) {
            method511(null, (byte) 36);
        }
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(I)V")
    public static void method515(int arg0) {
        field1655 = null;
        field1644 = null;
        field1647 = null;
        if (arg0 < 7) {
            method515(107);
        }
        field1652 = null;
        field1650 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
    public final void method516(int arg0, int arg1) {
        if (arg1 != 18157) {
            method511(null, (byte) 28);
        }
        field1639++;
        if (this.field1640 == null) {
            return;
        }
        if (this.field1656 != 0) {
            if (class16.field348 == null || this.field1640.length > class16.field348.length) {
                class16.field348 = new int[this.field1640.length];
            }
            short var3;
            if (this.field1640.length == 4096) {
                var3 = 64;
            } else {
                var3 = 128;
            }
            int var4 = this.field1640.length;
            int var5 = arg0 * var3 * this.field1658;
            if (this.field1656 == 2) {
                var5 = -var5;
            }
            int var6 = var4 - 1;
            for (int var7 = 0; var7 < var4; var7++) {
                int var9 = var6 & var5 + var7;
                class16.field348[var7] = this.field1640[var9];
            }
            int[] var8 = this.field1640;
            this.field1640 = class16.field348;
            class16.field348 = var8;
        }
        if (this.field1648 == 0) {
            return;
        }
        if (class16.field348 == null || this.field1640.length > class16.field348.length) {
            class16.field348 = new int[this.field1640.length];
        }
        int var10 = this.field1640.length;
        short var11;
        if (this.field1640.length == 4096) {
            var11 = 64;
        } else {
            var11 = 128;
        }
        int var12 = this.field1658 * arg0;
        if (this.field1648 == 1) {
            var12 = -var12;
        }
        int var13 = var11 - 1;
        for (int var14 = 0; var14 < var10; var14 += var11) {
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = var14 + var16;
                int var18 = (var12 + var16 & var13) + var14;
                class16.field348[var17] = this.field1640[var18];
            }
        }
        int[] var15 = this.field1640;
        this.field1640 = class16.field348;
        class16.field348 = var15;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lva;)V")
    public class72(class189 arg0) {
        this.field1649 = new class205(arg0);
        int var2 = arg0.method1202(-44);
        this.field1638 = (var2 & 0x2) != 0;
        this.field1653 = (var2 & 0x1) != 0;
        this.field1643 = arg0.method1202(106);
        this.field1634 = arg0.method1197(-1);
        this.field1635 = arg0.method1202(-123);
        if (this.field1635 == 255) {
            this.field1635 = 256;
        }
        int var3 = arg0.method1202(-91);
        int var4 = arg0.method1202(123);
        this.field1658 = (var4 & 0x3F) - 6;
        this.field1656 = var4 >> 6 & 0x3;
        this.field1648 = var3 >> 6 & 0x3;
        arg0.method1202(-114);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
    public class72() {
        this.field1649 = new class205();
        this.field1643 = 1;
        this.field1653 = true;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lhh;BLkh;)Z")
    public final boolean method517(class71 arg0, byte arg1, class97 arg2) {
        field1637++;
        return arg1 <= 43 ? true : this.field1649.method1341(arg2, (byte) 109, arg0);
    }
}
