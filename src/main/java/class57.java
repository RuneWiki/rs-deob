import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public class class57 {

    @OriginalMember(owner = "client!pia", name = "h", descriptor = "I")
    public int field799 = -1;

    @OriginalMember(owner = "client!pia", name = "k", descriptor = "I")
    public int field802 = -1;

    @OriginalMember(owner = "client!pia", name = "f", descriptor = "I")
    public int field797 = -1;

    @OriginalMember(owner = "client!pia", name = "i", descriptor = "Z")
    public boolean field800 = false;

    @OriginalMember(owner = "client!pia", name = "r", descriptor = "I")
    public int field809 = 99;

    @OriginalMember(owner = "client!pia", name = "B", descriptor = "Z")
    public boolean field819 = false;

    @OriginalMember(owner = "client!pia", name = "o", descriptor = "I")
    public int field806 = -1;

    @OriginalMember(owner = "client!pia", name = "x", descriptor = "I")
    public int field815 = 5;

    @OriginalMember(owner = "client!pia", name = "q", descriptor = "Z")
    public boolean field808 = false;

    @OriginalMember(owner = "client!pia", name = "A", descriptor = "I")
    public int field818 = 2;

    @OriginalMember(owner = "client!pia", name = "G", descriptor = "Z")
    public boolean field823 = false;

    @OriginalMember(owner = "client!pia", name = "H", descriptor = "I")
    public int field824 = -1;

    @OriginalMember(owner = "client!pia", name = "g", descriptor = "I")
    public static int field798 = -1;

    @OriginalMember(owner = "client!pia", name = "m", descriptor = "[I")
    public static int[] field804 = new int[8];

    @OriginalMember(owner = "client!pia", name = "n", descriptor = "Lcj;")
    public static class445 field805 = new class445();

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!pia", name = "p", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!pia", name = "s", descriptor = "I")
    public int field810;

    @OriginalMember(owner = "client!pia", name = "t", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!pia", name = "u", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!pia", name = "w", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!pia", name = "y", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!pia", name = "z", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!pia", name = "J", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!pia", name = "j", descriptor = "Lpga;")
    public class495 field801;

    @OriginalMember(owner = "client!pia", name = "d", descriptor = "[I")
    public int[] field795;

    @OriginalMember(owner = "client!pia", name = "e", descriptor = "[I")
    private int[] field796;

    @OriginalMember(owner = "client!pia", name = "v", descriptor = "[I")
    public int[] field813;

    @OriginalMember(owner = "client!pia", name = "D", descriptor = "[I")
    public int[] field820;

    @OriginalMember(owner = "client!pia", name = "E", descriptor = "[I")
    public int[] field821;

    @OriginalMember(owner = "client!pia", name = "F", descriptor = "[I")
    public int[] field822;

    @OriginalMember(owner = "client!pia", name = "I", descriptor = "[Luv;")
    public static class755[] field825;

    @OriginalMember(owner = "client!pia", name = "c", descriptor = "[Z")
    public boolean[] field794;

    @OriginalMember(owner = "client!pia", name = "l", descriptor = "[[I")
    public int[][] field803;

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIIIIBLka;I)Lka;", line = 6)
    public final class284 method407(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class284 arg6, int arg7) {
        field793++;
        int var9 = this.field813[arg3];
        int var10 = this.field821[arg3];
        class526 var11 = this.field801.method2996(var10 >> 16, (byte) -120);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg6.method1659(arg5, arg2, true);
        }
        class526 var13 = null;
        if ((this.field808 || class175.field2409) && arg4 != -1 && this.field821.length > arg4) {
            int var14 = this.field821[arg4];
            var13 = this.field801.method2996(var14 >> 16, (byte) -126);
            arg4 = var14 & 0xFFFF;
        }
        if (this.field823) {
            arg2 |= 0x200;
        }
        if (var11.method3130(var12, arg7 ^ 0xFFFFFF7F)) {
            arg2 |= 0x80;
        }
        if (var11.method3126(var12, true)) {
            arg2 |= 0x100;
        }
        if (var11.method3127(var12, -94)) {
            arg2 |= 0x400;
        }
        if (arg7 != 128) {
            this.method408(59, -18, -125, null, -66, -5);
        }
        if (var13 != null) {
            if (var13.method3130(arg4, -1)) {
                arg2 |= 0x80;
            }
            if (var13.method3126(arg4, true)) {
                arg2 |= 0x100;
            }
            if (var13.method3127(arg4, -85)) {
                arg2 |= 0x400;
            }
        }
        int var15 = arg2 | 0x20;
        class284 var16 = arg6.method1659(arg5, var15, true);
        var16.method1885(var11, arg1, var13, -120, var12, var9, this.field823, arg4, arg0 - 1);
        return var16;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIILka;II)Lka;", line = 73)
    public final class284 method408(int arg0, int arg1, int arg2, class284 arg3, int arg4, int arg5) {
        field792++;
        int var7 = this.field813[arg0];
        int var8 = this.field821[arg0];
        class526 var9 = this.field801.method2996(var8 >> 16, (byte) -120);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg3.method1659((byte) 1, arg1, true);
        }
        class526 var11 = null;
        if ((this.field808 || class175.field2409) && arg4 != -1 && this.field821.length > arg4) {
            int var12 = this.field821[arg4];
            var11 = this.field801.method2996(var12 >> 16, (byte) -119);
            arg4 = var12 & 0xFFFF;
        }
        class526 var13 = null;
        class526 var14 = null;
        int var15 = 0;
        if (arg5 < 80) {
            this.field823 = true;
        }
        int var16 = 0;
        if (this.field796 != null) {
            if (arg0 < this.field796.length) {
                var15 = this.field796[arg0];
                if (var15 != 65535) {
                    var13 = this.field801.method2996(var15 >> 16, (byte) -122);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field808 || class175.field2409) && arg4 != -1 && arg4 < this.field796.length) {
                var16 = this.field796[arg4];
                if (var16 != 65535) {
                    var14 = this.field801.method2996(var16 >> 16, (byte) -123);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field823) {
            arg1 |= 0x200;
        }
        if (var9.method3130(var10, -1)) {
            arg1 |= 0x80;
        }
        if (var9.method3126(var10, true)) {
            arg1 |= 0x100;
        }
        if (var9.method3127(var10, -102)) {
            arg1 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method3130(var15, -1)) {
                arg1 |= 0x80;
            }
            if (var13.method3126(var15, true)) {
                arg1 |= 0x100;
            }
            if (var13.method3127(var15, -60)) {
                arg1 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method3130(arg4, -1)) {
                arg1 |= 0x80;
            }
            if (var11.method3126(arg4, true)) {
                arg1 |= 0x100;
            }
            if (var11.method3127(arg4, -78)) {
                arg1 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method3130(var16, -1)) {
                arg1 |= 0x80;
            }
            if (var14.method3126(var16, true)) {
                arg1 |= 0x100;
            }
            if (var14.method3127(var16, -94)) {
                arg1 |= 0x400;
            }
        }
        int var17 = arg1 | 0x20;
        class284 var18 = arg3.method1659((byte) 1, var17, true);
        var18.method1885(var9, 0, var11, -119, var10, var7, this.field823, arg4, arg2 - 1);
        if (var13 != null) {
            var18.method1885(var13, 0, var14, -105, var15, var7, this.field823, var16, arg2 - 1);
        }
        return var18;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(IZII)I", line = 205)
    public final int method409(int arg0, boolean arg1, int arg2, int arg3) {
        field811++;
        int var5 = 0;
        int var6 = arg3;
        int var7 = this.field821[arg0];
        class526 var8 = null;
        class526 var9 = this.field801.method2996(var7 >> 16, (byte) -121);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field808 || class175.field2409) && arg2 != -1 && arg2 < this.field821.length) {
            int var11 = this.field821[arg2];
            var8 = this.field801.method2996(var11 >> 16, (byte) -115);
            var6 = var11 & 0xFFFF;
        }
        if (this.field823) {
            var5 |= 0x200;
        }
        if (var9.method3130(var10, ~arg3)) {
            var5 |= 0x80;
        }
        if (var9.method3126(var10, true)) {
            var5 |= 0x100;
        }
        if (var9.method3127(var10, -118)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method3130(var6, -1)) {
                var5 |= 0x80;
            }
            if (var8.method3126(var6, true)) {
                var5 |= 0x100;
            }
            if (var8.method3127(var6, -84)) {
                var5 |= 0x400;
            }
        }
        if (this.field796 != null && arg1) {
            if (arg0 < this.field796.length) {
                int var12 = this.field796[arg0];
                if (var12 != 65535) {
                    class526 var13 = this.field801.method2996(var12 >> 16, (byte) -117);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method3130(var14, ~arg3)) {
                            var5 |= 0x80;
                        }
                        if (var13.method3126(var14, true)) {
                            var5 |= 0x100;
                        }
                        if (var13.method3127(var14, -77)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field808 || class175.field2409) && arg2 != -1 && arg2 < this.field796.length) {
                int var15 = this.field796[arg2];
                if (var15 != 65535) {
                    class526 var16 = this.field801.method2996(var15 >> 16, (byte) -115);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method3130(var17, -1)) {
                            var5 |= 0x80;
                        }
                        if (var16.method3126(var17, true)) {
                            var5 |= 0x100;
                        }
                        if (var16.method3127(var17, arg3 ^ 0xFFFFFF89)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)V", line = 343)
    public final void method410(int arg0) {
        field812++;
        if (arg0 != 0) {
            method415(-11, -55, -111, 110, 41);
        }
        if (this.field797 == -1) {
            if (this.field794 == null) {
                this.field797 = 0;
            } else {
                this.field797 = 2;
            }
        }
        if (this.field799 != -1) {
            return;
        }
        if (this.field794 == null) {
            this.field799 = 0;
        } else {
            this.field799 = 2;
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIIZII)V", line = 373)
    public static final void method411(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (!arg3) {
            for (int var6 = arg4; var6 <= arg2; var6++) {
                class102.method675(arg5, 111, arg1, arg0, class538.field7454[var6]);
            }
            field807++;
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(Ldc;B)V", line = 396)
    public final void method412(class63 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method505((byte) -119);
            if (var3 == 0) {
                field816++;
                if (arg1 >= -73) {
                    this.method407(-31, -96, -1, 79, 25, (byte) -114, null, -33);
                    return;
                }
                return;
            }
            this.method414(arg0, -19042, var3);
        }
    }

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "(I)V", line = 416)
    public static void method413(int arg0) {
        field805 = null;
        field804 = null;
        if (arg0 != 18268) {
            field805 = null;
        }
        field825 = null;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(Ldc;II)V", line = 442)
    private final void method414(class63 arg0, int arg1, int arg2) {
        if (arg1 != -19042) {
            this.method407(-68, -74, -11, 90, 79, (byte) 116, null, 17);
        }
        if (arg2 == 1) {
            int var16 = arg0.method482(-772591672);
            this.field813 = new int[var16];
            for (int var17 = 0; var17 < var16; var17++) {
                this.field813[var17] = arg0.method482(-772591672);
            }
            this.field821 = new int[var16];
            for (int var18 = 0; var18 < var16; var18++) {
                this.field821[var18] = arg0.method482(-772591672);
            }
            for (int var19 = 0; var19 < var16; var19++) {
                this.field821[var19] += arg0.method482(-772591672) << 16;
            }
        } else if (arg2 == 2) {
            this.field806 = arg0.method482(-772591672);
        } else if (arg2 == 3) {
            this.field794 = new boolean[256];
            int var14 = arg0.method505((byte) -119);
            for (int var15 = 0; var15 < var14; var15++) {
                this.field794[arg0.method505((byte) -119)] = true;
            }
        } else if (arg2 == 5) {
            this.field815 = arg0.method505((byte) -119);
        } else if (arg2 == 6) {
            this.field824 = arg0.method482(-772591672);
        } else if (arg2 == 7) {
            this.field802 = arg0.method482(arg1 - 772572630);
        } else if (arg2 == 8) {
            this.field809 = arg0.method505((byte) -119);
        } else if (arg2 == 9) {
            this.field799 = arg0.method505((byte) -119);
        } else if (arg2 == 10) {
            this.field797 = arg0.method505((byte) -119);
        } else if (arg2 == 11) {
            this.field818 = arg0.method505((byte) -119);
        } else if (arg2 == 12) {
            int var4 = arg0.method505((byte) -119);
            this.field796 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field796[var5] = arg0.method482(-772591672);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                this.field796[var6] += arg0.method482(-772591672) << 16;
            }
        } else if (arg2 == 13) {
            int var10 = arg0.method482(-772591672);
            this.field803 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg0.method505((byte) -119);
                if (var12 > 0) {
                    this.field803[var11] = new int[var12];
                    this.field803[var11][0] = arg0.method476((byte) -78);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field803[var11][var13] = arg0.method482(arg1 - 772572630);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field823 = true;
        } else if (arg2 == 15) {
            this.field808 = true;
        } else if (arg2 == 16) {
            this.field800 = true;
        } else if (arg2 == 18) {
            this.field819 = true;
        } else if (arg2 == 19) {
            if (this.field795 == null) {
                this.field795 = new int[this.field803.length];
                for (int var9 = 0; var9 < this.field803.length; var9++) {
                    this.field795[var9] = 255;
                }
            }
            this.field795[arg0.method505((byte) -119)] = arg0.method505((byte) -119);
        } else if (arg2 == 20) {
            if (this.field820 == null || this.field822 == null) {
                this.field820 = new int[this.field803.length];
                this.field822 = new int[this.field803.length];
                for (int var7 = 0; var7 < this.field803.length; var7++) {
                    this.field820[var7] = 256;
                    this.field822[var7] = 256;
                }
            }
            int var8 = arg0.method505((byte) -119);
            this.field820[var8] = arg0.method482(-772591672);
            this.field822[var8] = arg0.method482(-772591672);
        }
        field814++;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIIII)V", line = 646)
    public static final void method415(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg3; var5 < class381.field5461; var5++) {
            Rectangle var6 = class210.field2741[var5];
            if (var6.x + var6.width > arg2 && arg2 + arg1 > var6.x && arg4 < (var6.y + var6.height) && (arg0 + arg4) > var6.y) {
                class514.field7098[var5] = true;
            }
        }
        field817++;
        class483.method2944(arg1 + arg2, arg0 + arg4, arg2, arg4, -1);
    }
}
