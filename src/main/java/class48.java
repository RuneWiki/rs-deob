import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class48 {

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    private int field608;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    private int field613;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    private int field624;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "Z")
    private boolean field612;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    private int field616;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    private int field607;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    private int field623;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    private int field610;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "[I")
    private static int[] field609 = new int[4];

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    private int field611;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    private int field615;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public int field617;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    private int field620;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    private int field621;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "Ll;")
    private static class127 field618;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "Ll;")
    private class127 field619;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "Ll;")
    private static class127 field622;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "Lt;")
    private static class398 field614;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "()V")
    public static void method356() {
        field614 = null;
        field618 = null;
        field622 = null;
        field609 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lya;Lil;)V")
    private final void method357(class11 arg0, class48 arg1) {
        class118 var3 = class132.method975(class426.field6349, this.field616, 0, -63);
        if (var3 == null) {
            return;
        }
        arg0.method109(field609);
        arg0.method84(0, 0, this.field615, this.field615);
        arg0.method162(0, 0, this.field615, this.field615, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field612) {
                var4 = -arg1.field608;
                var5 = -arg1.field613;
                var6 = -arg1.field624;
            } else {
                var4 = this.field608 - arg1.field608;
                var5 = this.field613 - arg1.field613;
                var6 = this.field624 - arg1.field624;
            }
        }
        if (this.field621 != 0) {
            int var7 = -this.field621 & 0x3FFF;
            int var8 = class445.field6545[var7];
            int var9 = class445.field6544[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field611 != 0) {
            int var11 = -this.field611 & 0x3FFF;
            int var12 = class445.field6545[var11];
            int var13 = class445.field6544[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method90(1.0F);
        arg0.method122(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class398 var15 = arg0.method150(var3, 2048, 0, 64, 768);
        int var16 = var15.method625() - var15.method651();
        int var17 = var15.method639() - var15.method635();
        int var18 = var15.method651() + var16 / 2;
        int var19 = var15.method635() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method59(var18, var19, var20, var20);
        arg0.method55(arg0.method75());
        class511 var21 = arg0.method66();
        var21.method1307(0, 0, arg0.method100() - var15.method621());
        var15.method598(var21, null, arg0.method100(), 1);
        this.field619 = arg0.method153(0, 0, this.field615, this.field615, true);
        this.field619.method295(0, 0, 3);
        arg0.method84(field609[0], field609[1], field609[2], field609[3]);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lya;)V")
    private static final void method358(class11 arg0) {
        if (field614 != null) {
            return;
        }
        class118 var1 = new class118(580, 1104, 1);
        var1.method889((short) 32767, (byte) 0, (byte) 0, (short) 0, (short) 1024, (byte) 0, (short) 1024, (short) 0, (short) 1024, true);
        var1.method882(-102, 128, 0, 0);
        var1.method882(-66, -128, 0, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class445.field6545[var3];
            int var5 = class445.field6544[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class445.field6544[var12] >> 8;
                int var14 = class445.field6545[var12] * var4 >> 23;
                int var15 = class445.field6545[var12] * var5 >> 23;
                var1.method882(-116, var13, -var14, var15);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method884(var7, (short) 0, (byte) 0, (short) 127, 0, (byte) 0, (byte) 0, var8, 99);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method884(var7, (short) 0, (byte) 0, (short) 127, var8, (byte) 0, (byte) 0, var10, 55);
                    var1.method884(var7, (short) 0, (byte) 0, (short) 127, var10, (byte) 0, (byte) 0, var11, 10);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method884(1, (short) 0, (byte) 0, (short) 127, var7, (byte) 0, (byte) 0, var8, -123);
            }
        }
        var1.field1796 = var1.field1807;
        var1.field1771 = null;
        var1.field1801 = null;
        var1.field1816 = null;
        field614 = arg0.method150(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(Lya;Lil;)Z")
    private final boolean method359(class11 arg0, class48 arg1) {
        if (this.field619 == null) {
            if (this.field610 == 0) {
                if (class483.field7131.method1482((byte) 127, this.field616)) {
                    int[] var3 = class483.field7131.method1481(false, 0.7F, 28907, this.field616, this.field615, this.field615);
                    this.field619 = arg0.method103(var3, 0, this.field615, this.field615, this.field615);
                }
            } else if (this.field610 == 2) {
                this.method357(arg0, arg1);
            } else if (this.field610 == 1) {
                this.method364(arg0, arg1);
            }
        }
        return this.field619 != null;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "()V")
    public final void method360() {
        this.field619 = null;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(Lya;)V")
    private static final void method361(class11 arg0) {
        if (field622 != null) {
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
        field622 = arg0.method103(var2, 0, 128, 128, 128);
        field618 = arg0.method103(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIII)Z")
    public final boolean method362(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field612) {
            this.field617 = 1073741823;
            var8 = this.field608;
            var9 = this.field613;
            var10 = this.field624;
        } else {
            int var5 = this.field608 - arg0;
            int var6 = this.field613 - arg1;
            int var7 = this.field624 - arg2;
            this.field617 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field617 == 0) {
                this.field617 = 1;
            }
            var8 = (var5 << 8) / this.field617;
            var9 = (var6 << 8) / this.field617;
            var10 = (var7 << 8) / this.field617;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field620 = this.field623 * arg3 / (this.field612 ? 1024 : this.field617);
        } else {
            this.field620 = 0;
        }
        if (this.field620 < 8) {
            this.field619 = null;
            return false;
        }
        int var12 = class143.method1039(8, this.field620);
        if (var12 > arg3) {
            var12 = class45.method352((byte) -97, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field615 != var12) {
            this.field615 = var12;
        }
        this.field621 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field611 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field619 = null;
        return true;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lya;IIIIII)V")
    public final void method363(class11 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field619 == null) {
            return;
        }
        int var8 = this.field621 - arg5 & 0x3FFF;
        int var9 = this.field611 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field620) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field620) / 2;
        if (var10 < arg4 && this.field620 + var10 > 0 && var11 < arg3 && this.field620 + var11 > 0) {
            this.field619.method939(arg1 + var11, arg2 + var10, this.field620, this.field620);
        }
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(Lya;Lil;)V")
    private final void method364(class11 arg0, class48 arg1) {
        method358(arg0);
        method361(arg0);
        arg0.method109(field609);
        arg0.method84(0, 0, this.field615, this.field615);
        arg0.method56();
        arg0.method162(0, 0, this.field615, this.field615, this.field607 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field612) {
                var3 = -arg1.field608;
                var4 = -arg1.field613;
                var5 = -arg1.field624;
            } else {
                var3 = arg1.field608 - this.field608;
                var4 = arg1.field613 - this.field613;
                var5 = arg1.field624 - this.field624;
            }
        }
        if (this.field621 != 0) {
            int var6 = class445.field6545[this.field621];
            int var7 = class445.field6544[this.field621];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field611 != 0) {
            int var9 = class445.field6545[this.field611];
            int var10 = class445.field6544[this.field611];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class398 var12 = field614.method610((byte) 0, 51200, true);
        if (arg0.method138()) {
            var12.method649((short) 0, (short) this.field616);
        } else {
            var12.method654((short) 127, class483.field7131.method1480(this.field616, 14270).field2409);
            var12.method649((short) 0, (short) -1);
        }
        arg0.method90(1.0F);
        arg0.method122(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field615 * 1024 / (var12.method625() - var12.method651());
        if (this.field607 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method59(this.field615 / 2, this.field615 / 2, var13, var13);
        arg0.method55(arg0.method75());
        class511 var14 = arg0.method75();
        var14.method1307(0, 0, arg0.method100() - var12.method621());
        var12.method598(var14, null, 1024, 1);
        int var15 = this.field615 * 13 / 16;
        int var16 = (this.field615 - var15) / 2;
        field618.method293(var16, var16, var15, var15, 0, this.field607 | 0xFF000000, 1);
        this.field619 = arg0.method153(0, 0, this.field615, this.field615, true);
        arg0.method56();
        arg0.method162(0, 0, this.field615, this.field615, 0, 0);
        field622.method293(0, 0, this.field615, this.field615, 1, 0, 0);
        this.field619.method295(0, 0, 0);
        arg0.method84(field609[0], field609[1], field609[2], field609[3]);
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(Lya;Lil;)Z")
    public final boolean method365(class11 arg0, class48 arg1) {
        return this.field619 != null || this.method359(arg0, arg1);
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "()V")
    public static final void method366() {
        field614 = null;
        field622 = null;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field608 = arg2;
        this.field613 = arg3;
        this.field624 = arg4;
        this.field612 = arg7;
        this.field616 = arg1;
        this.field607 = arg6;
        this.field623 = arg5;
        this.field610 = arg0;
    }
}
