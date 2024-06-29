import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class98 {

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
    private int field1637;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    private int field1627;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
    private int field1639;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "Z")
    private boolean field1641;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    private int field1630;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    private int field1629;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    private int field1638;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    private int field1625;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "[I")
    private static int[] field1626 = new int[4];

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    private int field1628;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    private int field1631;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    private int field1634;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public int field1636;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
    private int field1640;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "Lo;")
    private static class138 field1624;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "Lo;")
    private class138 field1632;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "Lo;")
    private static class138 field1633;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "Le;")
    private static class530 field1635;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "()V")
    public static void method678() {
        field1635 = null;
        field1633 = null;
        field1624 = null;
        field1626 = null;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "()V")
    public final void method679() {
        this.field1632 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lza;Lwl;)V")
    private final void method680(class491 arg0, class98 arg1) {
        method682(arg0);
        method687(arg0);
        arg0.method908(field1626);
        arg0.method829(0, 0, this.field1628, this.field1628);
        arg0.method828();
        arg0.method914(0, 0, this.field1628, this.field1628, this.field1629 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field1641) {
                var3 = -arg1.field1637;
                var4 = -arg1.field1627;
                var5 = -arg1.field1639;
            } else {
                var3 = arg1.field1637 - this.field1637;
                var4 = arg1.field1627 - this.field1627;
                var5 = arg1.field1639 - this.field1639;
            }
        }
        if (this.field1640 != 0) {
            int var6 = class46.field757[this.field1640];
            int var7 = class46.field755[this.field1640];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field1634 != 0) {
            int var9 = class46.field757[this.field1634];
            int var10 = class46.field755[this.field1634];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class530 var12 = field1635.method739((byte) 0, 51200, true);
        if (arg0.method912()) {
            var12.method765((short) 0, (short) this.field1630);
        } else {
            var12.method728((short) 127, class215.field3752.method195(this.field1630, (byte) -105).field5033);
            var12.method765((short) 0, (short) -1);
        }
        arg0.method910(1.0F);
        arg0.method859(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field1628 * 1024 / (var12.method766() - var12.method760());
        if (this.field1629 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method857(this.field1628 / 2, this.field1628 / 2, var13, var13);
        arg0.method911(arg0.method835());
        class202 var14 = arg0.method835();
        var14.method1246(0, 0, arg0.method845() - var12.method751());
        var12.method738(var14, null, 1024, 1);
        int var15 = this.field1628 * 13 / 16;
        int var16 = (this.field1628 - var15) / 2;
        field1633.method202(var16, var16, var15, var15, 0, this.field1629 | 0xFF000000, 1);
        this.field1632 = arg0.method843(0, 0, this.field1628, this.field1628, true);
        arg0.method828();
        arg0.method914(0, 0, this.field1628, this.field1628, 0, 0);
        field1624.method202(0, 0, this.field1628, this.field1628, 1, 0, 0);
        this.field1632.method628(0, 0, 0);
        arg0.method829(field1626[0], field1626[1], field1626[2], field1626[3]);
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "()V")
    public static final void method681() {
        field1635 = null;
        field1624 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lza;)V")
    private static final void method682(class491 arg0) {
        if (field1635 != null) {
            return;
        }
        class227 var1 = new class227(580, 1104, 1);
        var1.method1582((short) 1024, (byte) 0, (short) 1024, (short) 32767, (short) 0, (short) 1024, (byte) 0, -1, (byte) 0, (short) 0);
        var1.method1573(0, 24, 0, 128);
        var1.method1573(0, 62, 0, -128);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class46.field757[var3];
            int var5 = class46.field755[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class46.field755[var12] >> 8;
                int var14 = class46.field757[var12] * var4 >> 23;
                int var15 = class46.field757[var12] * var5 >> 23;
                var1.method1573(var15, 61, -var14, var13);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method1577((byte) 91, (byte) 0, (short) 0, 0, (short) 127, (byte) 0, var8, var7, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method1577((byte) 103, (byte) 0, (short) 0, var8, (short) 127, (byte) 0, var10, var7, (byte) 0);
                    var1.method1577((byte) 98, (byte) 0, (short) 0, var10, (short) 127, (byte) 0, var11, var7, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method1577((byte) 112, (byte) 0, (short) 0, var7, (short) 127, (byte) 0, var8, 1, (byte) 0);
            }
        }
        var1.field3956 = var1.field3952;
        var1.field3960 = null;
        var1.field3955 = null;
        var1.field3943 = null;
        field1635 = arg0.method875(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIII)Z")
    public final boolean method683(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field1641) {
            this.field1636 = 1073741823;
            var8 = this.field1637;
            var9 = this.field1627;
            var10 = this.field1639;
        } else {
            int var5 = this.field1637 - arg0;
            int var6 = this.field1627 - arg1;
            int var7 = this.field1639 - arg2;
            this.field1636 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field1636 == 0) {
                this.field1636 = 1;
            }
            var8 = (var5 << 8) / this.field1636;
            var9 = (var6 << 8) / this.field1636;
            var10 = (var7 << 8) / this.field1636;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field1631 = this.field1638 * arg3 / (this.field1641 ? 1024 : this.field1636);
        } else {
            this.field1631 = 0;
        }
        if (this.field1631 < 8) {
            this.field1632 = null;
            return false;
        }
        int var12 = class206.method1351(this.field1631, 87);
        if (var12 > arg3) {
            var12 = class237.method1629(arg3, 77);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field1628 != var12) {
            this.field1628 = var12;
        }
        this.field1640 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field1634 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field1632 = null;
        return true;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lza;IIIIII)V")
    public final void method684(class491 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field1632 == null) {
            return;
        }
        int var8 = this.field1640 - arg5 & 0x3FFF;
        int var9 = this.field1634 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field1631) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field1631) / 2;
        if (var10 < arg4 && this.field1631 + var10 > 0 && var11 < arg3 && this.field1631 + var11 > 0) {
            this.field1632.method1033(arg1 + var11, arg2 + var10, this.field1631, this.field1631);
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(Lza;Lwl;)Z")
    public final boolean method685(class491 arg0, class98 arg1) {
        return this.field1632 != null || this.method688(arg0, arg1);
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(Lza;Lwl;)V")
    private final void method686(class491 arg0, class98 arg1) {
        class227 var3 = class280.method1839(2, 0, class452.field6752, this.field1630);
        if (var3 == null) {
            return;
        }
        arg0.method908(field1626);
        arg0.method829(0, 0, this.field1628, this.field1628);
        arg0.method914(0, 0, this.field1628, this.field1628, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field1641) {
                var4 = -arg1.field1637;
                var5 = -arg1.field1627;
                var6 = -arg1.field1639;
            } else {
                var4 = this.field1637 - arg1.field1637;
                var5 = this.field1627 - arg1.field1627;
                var6 = this.field1639 - arg1.field1639;
            }
        }
        if (this.field1640 != 0) {
            int var7 = -this.field1640 & 0x3FFF;
            int var8 = class46.field757[var7];
            int var9 = class46.field755[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field1634 != 0) {
            int var11 = -this.field1634 & 0x3FFF;
            int var12 = class46.field757[var11];
            int var13 = class46.field755[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method910(1.0F);
        arg0.method859(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class530 var15 = arg0.method875(var3, 2048, 0, 64, 768);
        int var16 = var15.method766() - var15.method760();
        int var17 = var15.method769() - var15.method726();
        int var18 = var15.method760() + var16 / 2;
        int var19 = var15.method726() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method857(var18, var19, var20, var20);
        arg0.method911(arg0.method835());
        class202 var21 = arg0.method820();
        var21.method1246(0, 0, arg0.method845() - var15.method751());
        var15.method738(var21, null, arg0.method845(), 1);
        this.field1632 = arg0.method843(0, 0, this.field1628, this.field1628, true);
        this.field1632.method628(0, 0, 3);
        arg0.method829(field1626[0], field1626[1], field1626[2], field1626[3]);
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(Lza;)V")
    private static final void method687(class491 arg0) {
        if (field1624 != null) {
            return;
        }
        int[] var1 = new int[16384];
        int[] var2 = new int[16384];
        for (int var3 = 0; var3 < 64; var3++) {
            int var4 = 64 - var3;
            int var5 = var4 * var4;
            int var6 = 128 - var3 - 1;
            int var7 = var3 * 128;
            int var8 = var6 * 128;
            for (int var9 = 0; var9 < 64; var9++) {
                int var10 = 64 - var9;
                int var11 = var10 * var10;
                int var12 = 128 - var9 - 1;
                int var13 = 256 - (var5 + var11 << 8) / 4096;
                int var14 = var13 * 16 * 192 / 1536;
                if (var14 < 0) {
                    var14 = 0;
                } else if (var14 > 255) {
                    var14 = 255;
                }
                int var15 = var14 / 2;
                var2[var7 + var9] = var2[var7 + var12] = var2[var8 + var9] = var2[var8 + var12] = var14 | 0xFF00 << 16;
                var1[var7 + var9] = var1[var7 + var12] = var1[var8 + var9] = var1[var8 + var12] = 127 - var15 << 24 | 0xFFFFFF;
            }
        }
        field1624 = arg0.method834(var2, 0, 128, 128, 128);
        field1633 = arg0.method834(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(Lza;Lwl;)Z")
    private final boolean method688(class491 arg0, class98 arg1) {
        if (this.field1632 == null) {
            if (this.field1625 == 0) {
                if (class215.field3752.method194((byte) 89, this.field1630)) {
                    int[] var3 = class215.field3752.method187(false, false, this.field1628, this.field1630, this.field1628, 0.7F);
                    this.field1632 = arg0.method834(var3, 0, this.field1628, this.field1628, this.field1628);
                }
            } else if (this.field1625 == 2) {
                this.method686(arg0, arg1);
            } else if (this.field1625 == 1) {
                this.method680(arg0, arg1);
            }
        }
        return this.field1632 != null;
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field1637 = arg2;
        this.field1627 = arg3;
        this.field1639 = arg4;
        this.field1641 = arg7;
        this.field1630 = arg1;
        this.field1629 = arg6;
        this.field1638 = arg5;
        this.field1625 = arg0;
    }
}
