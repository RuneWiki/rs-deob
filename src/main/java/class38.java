import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class38 implements class1 {

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "Z")
    private boolean field791 = true;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "Lea;")
    private static class38 field798 = class9.method46((byte) 106, "Connecting to update server");

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "[I")
    public static int[] field811 = new int[128];

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "I")
    public static int field816 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ea", name = "V", descriptor = "Lea;")
    public static class38 field834 = field798;

    @OriginalMember(owner = "client!ea", name = "S", descriptor = "Lea;")
    private static class38 field831 = class9.method46((byte) 111, "Loaded config");

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "Lea;")
    public static class38 field790 = field831;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public int field802;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    private int field812;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!ea", name = "L", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!ea", name = "M", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!ea", name = "O", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!ea", name = "P", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!ea", name = "Q", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!ea", name = "R", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!ea", name = "T", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!ea", name = "U", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!ea", name = "W", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!ea", name = "X", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!ea", name = "Y", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "Ldd;")
    public static class32 field797;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ea", name = "Z", descriptor = "Ljava/lang/Class;")
    public static Class field838;

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "[B")
    public byte[] field821;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lea;I)I")
    public final int method247(class38 arg0, int arg1) {
        field807++;
        int var3;
        if (this.field802 <= arg0.field802) {
            var3 = this.field802;
        } else {
            var3 = arg0.field802;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg0.field821[var4] & 0xFF) > (this.field821[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field821[var4] & 0xFF) > (arg0.field821[var4] & 0xFF)) {
                return 1;
            }
        }
        if (this.field802 < arg0.field802) {
            return -1;
        } else if (this.field802 > arg0.field802) {
            return 1;
        } else if (arg1 == 10303) {
            return 0;
        } else {
            return -74;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)Lea;")
    public final class38 method248(int arg0, boolean arg1) {
        field822++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class38 var3 = new class38();
        if (arg1) {
            this.field802 = -31;
        }
        var3.field821 = new byte[this.field802 + 1];
        var3.field802 = this.field802 + 1;
        class131.method964(this.field821, 0, var3.field821, 0, this.field802);
        var3.field821[this.field802] = (byte) arg0;
        return var3;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)Z")
    public final boolean method249(int arg0) {
        if (arg0 > -32) {
            this.field802 = -1;
        }
        field795++;
        return this.method253(-46, 10);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public static void method250(byte arg0) {
        if (arg0 < 23) {
            return;
        }
        field797 = null;
        field834 = null;
        field831 = null;
        field811 = null;
        field798 = null;
        field790 = null;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)Lea;")
    public final class38 method251(int arg0) {
        if (arg0 != 12131) {
            this.method271(-103);
        }
        class38 var2 = new class38();
        field828++;
        var2.field802 = this.field802;
        var2.field821 = new byte[this.field802];
        for (int var3 = 0; var3 < this.field802; var3++) {
            byte var4 = this.field821[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field821[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILea;)Z")
    public final boolean method252(int arg0, class38 arg1) {
        field836++;
        if (arg1 == null) {
            return false;
        } else if (this.field802 == arg1.field802) {
            if (!this.field791 || !arg1.field791) {
                if (this.field812 == 0) {
                    this.field812 = this.method266((byte) -111);
                    if (this.field812 == 0) {
                        this.field812 = 1;
                    }
                }
                if (arg1.field812 == 0) {
                    arg1.field812 = arg1.method266((byte) -125);
                    if (arg1.field812 == 0) {
                        arg1.field812 = 1;
                    }
                }
                if (this.field812 != arg1.field812) {
                    return false;
                }
            }
            if (arg0 > -75) {
                return false;
            }
            for (int var3 = 0; var3 < this.field802; var3++) {
                if (this.field821[var3] != arg1.field821[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)Z")
    private final boolean method253(int arg0, int arg1) {
        field799++;
        boolean var3 = false;
        boolean var4 = false;
        if (arg0 != -46) {
            this.method259(89, -91);
        }
        int var5 = 0;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        for (int var6 = 0; var6 < this.field802; var6++) {
            int var7 = this.field821[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var4 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                return false;
            }
            if (var7 >= arg1) {
                return false;
            }
            if (var4) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                return false;
            }
            var3 = true;
            var5 = var8;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ea", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field788++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)Lea;")
    public final class38 method254(int arg0) {
        byte var2 = 2;
        class38 var3 = new class38();
        if (arg0 != 1) {
            this.method259(6, -34);
        }
        var3.field802 = this.field802;
        var3.field821 = new byte[this.field802];
        for (int var4 = 0; var4 < this.field802; var4++) {
            byte var5 = this.field821[var4];
            if (var5 >= 97 && var5 <= 122 || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var2 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var2 = 0;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (var2 == 0) {
                    var5 = (byte) (var5 + 32);
                }
                var2 = 0;
            } else if (var5 == 46 || var5 == 33 || var5 == 63) {
                var2 = 2;
            } else if (var5 != 32) {
                var2 = 1;
            } else if (var2 != 2) {
                var2 = 1;
            }
            var3.field821[var4] = var5;
        }
        field801++;
        return var3;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)Lea;")
    public final class38 method255(byte arg0) {
        field835++;
        if (arg0 > -49) {
            this.method266((byte) -66);
        }
        int var2 = this.field802;
        int var3;
        for (var3 = 0; var3 < this.field802 && (this.field821[var3] >= 0 && this.field821[var3] <= 32 || (this.field821[var3] & 0xFF) == 160); var3++) {
        }
        while (var3 < var2 && (this.field821[var2 - 1] >= 0 && this.field821[var2 - 1] <= 32 || (this.field821[var2 - 1] & 0xFF) == 160)) {
            var2--;
        }
        if (var3 == 0 && this.field802 == var2) {
            return this;
        }
        class38 var4 = new class38();
        var4.field802 = var2 - var3;
        var4.field821 = new byte[var4.field802];
        for (int var5 = 0; var5 < var4.field802; var5++) {
            var4.field821[var5] = this.field821[var3 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)J")
    public final long method256(int arg0) {
        field810++;
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field802 && var4 < 12; var4++) {
            byte var5 = this.field821[var4];
            var2 *= 37L;
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 + 1 - 65;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 + 1 - 97;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 + 27 - 48;
            }
        }
        if (arg0 > -35) {
            this.method275(-5);
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)I")
    public static final int method257(int arg0, int arg1, int arg2, int arg3) {
        field827++;
        int var4 = arg3 >> 7;
        int var5 = arg2 >> 7;
        if (arg1 != -169496123) {
            method250((byte) -81);
        }
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg0;
        if (arg0 < 3 && (class3.field104[1][var4][var5] & 0x2) == 2) {
            var6 = arg0 + 1;
        }
        int var7 = arg3 & 0x7F;
        int var8 = (128 - var7) * class154.field3209[var6][var4][var5] + class154.field3209[var6][var4 + 1][var5] * var7 >> 7;
        int var9 = arg2 & 0x7F;
        int var10 = (128 - var7) * class154.field3209[var6][var4][var5 + 1] + class154.field3209[var6][var4 + 1][var5 + 1] * var7 >> 7;
        return (128 - var9) * var8 + var9 * var10 >> 7;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)Lea;")
    public final class38 method258(int arg0, int arg1) {
        field825++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (this.field791) {
            this.field812 = arg0;
            if (this.field821.length == this.field802) {
                int var3;
                for (var3 = 1; var3 <= this.field802; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class131.method964(this.field821, 0, var4, 0, this.field802);
                this.field821 = var4;
            }
            this.field821[this.field802++] = (byte) arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ea", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field809++;
        return this.method266((byte) -107);
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(II)I")
    public final int method259(int arg0, int arg1) {
        if (arg0 != 1037) {
            field834 = null;
        }
        boolean var3 = false;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var4 = false;
        field792++;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field802; var6++) {
            int var7 = this.field821[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var3 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                throw new NumberFormatException();
            }
            if (arg1 <= var7) {
                throw new NumberFormatException();
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                throw new NumberFormatException();
            }
            var5 = var8;
            var4 = true;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(ILea;)I")
    public final int method260(int arg0, class38 arg1) {
        field830++;
        int var3 = 103 / ((arg0 + 47) / 55);
        return this.method272((byte) 58, arg1, 0);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(Lea;I)Lea;")
    public final class38 method261(class38 arg0, int arg1) {
        field833++;
        if (!this.field791) {
            throw new IllegalArgumentException();
        }
        this.field812 = 0;
        if (this.field821.length < this.field802 + arg0.field802) {
            int var3;
            for (var3 = 1; var3 < this.field802 + arg0.field802; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class131.method964(this.field821, 0, var4, 0, this.field802);
            this.field821 = var4;
        }
        class131.method964(arg0.field821, 0, this.field821, this.field802, arg0.field802);
        this.field802 += arg0.field802;
        return arg1 == -20035 ? this : null;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(II)Lea;")
    public final class38 method262(int arg0, int arg1) {
        if (arg1 != -1) {
            field834 = null;
        }
        field808++;
        return this.method273(~arg1, arg0, this.field802);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lea;B)Z")
    public final boolean method263(class38 arg0, byte arg1) {
        field823++;
        if (arg0 == null) {
            return false;
        }
        if (arg1 < 52) {
            this.field821 = null;
        }
        if (this.field802 != arg0.field802) {
            return false;
        }
        for (int var3 = 0; var3 < this.field802; var3++) {
            byte var4 = arg0.field821[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            byte var5 = this.field821[var3];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 != var5) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)I")
    public final int method264(int arg0, int arg1, int arg2) {
        field803++;
        byte var4 = (byte) arg1;
        if (arg2 != 25356) {
            method257(-62, -49, 63, -82);
        }
        for (int var5 = arg0; var5 < this.field802; var5++) {
            if (this.field821[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(II)I")
    public final int method265(int arg0, int arg1) {
        field787++;
        int var3 = -116 / ((-arg1 - 14) / 35);
        return this.field821[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)I")
    public final int method266(byte arg0) {
        field806++;
        int var2 = 0;
        if (arg0 > -104) {
            return 45;
        } else {
            for (int var3 = 0; var3 < this.field802; var3++) {
                var2 = (var2 << 5) + (this.field821[var3] & 0xFF) - var2;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)Lea;")
    public final class38 method267(int arg0) {
        class38 var2 = new class38();
        var2.field802 = this.field802;
        var2.field821 = new byte[this.field802];
        int var3 = 0;
        int var4 = -58 / ((60 - arg0) / 54);
        while (this.field802 > var3) {
            var2.field821[var3] = 42;
            var3++;
        }
        field820++;
        return var2;
    }

    @OriginalMember(owner = "client!ea", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field817++;
        if (!(arg0 instanceof class38)) {
            throw new IllegalArgumentException();
        }
        return this.method252(-97, (class38) arg0);
    }

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)Lea;")
    public final class38 method268(int arg0) {
        field824++;
        class38 var2 = new class38();
        var2.field802 = this.field802;
        if (arg0 != 70) {
            field798 = null;
        }
        boolean var3 = true;
        var2.field821 = new byte[this.field802];
        for (int var4 = 0; var4 < this.field802; var4++) {
            byte var5 = this.field821[var4];
            if (var5 == 95) {
                var3 = true;
                var2.field821[var4] = 32;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var3 = false;
                var2.field821[var4] = (byte) (var5 - 32);
            } else {
                var3 = false;
                var2.field821[var4] = var5;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(Lea;I)Z")
    public final boolean method269(class38 arg0, int arg1) {
        field818++;
        if (arg0.field802 > this.field802) {
            return false;
        }
        for (int var3 = 0; var3 < arg0.field802; var3++) {
            if (this.field821[var3] != arg0.field821[var3]) {
                return false;
            }
        }
        if (arg1 != 52) {
            method250((byte) 20);
        }
        return true;
    }

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "(I)Lea;")
    public final class38 method270(int arg0) {
        long var2 = this.method275(-169496123);
        field815++;
        synchronized (field838 == null ? (field838 = method285("ea")) : field838) {
            if (class150.field3106 == null) {
                class150.field3106 = new class29(4096);
            } else {
                for (class5 var5 = (class5) class150.field3106.method183((byte) 116, var2); var5 != null; var5 = (class5) class150.field3106.method181(-9410)) {
                    if (this.method252(-127, var5.field139)) {
                        return var5.field139;
                    }
                }
            }
            class5 var7 = new class5();
            this.field791 = false;
            var7.field139 = this;
            class150.field3106.method184(var7, false, var2);
        }
        if (arg0 > -88) {
            this.method272((byte) -80, null, 52);
        }
        return this;
    }

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "(I)Lea;")
    public final class38 method271(int arg0) {
        int var2 = 0;
        if (arg0 != -1) {
            this.method274(false, null);
        }
        class38 var3 = new class38();
        var3.field821 = new byte[12];
        field837++;
        var3.field802 = 0;
        for (int var4 = 0; var4 < this.field802; var4++) {
            if (this.field821[var4] >= 65 && this.field821[var4] <= 90) {
                var3.field821[var2++] = (byte) (this.field821[var4] + 32);
                var3.field802 = var2;
            } else if (this.field821[var4] >= 97 && this.field821[var4] <= 122 || this.field821[var4] >= 48 && this.field821[var4] <= 57) {
                var3.field821[var2++] = this.field821[var4];
                var3.field802 = var2;
            } else if (var2 > 0) {
                var3.field821[var2++] = 95;
            }
            if (var2 == 12) {
                break;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLea;I)I")
    public final int method272(byte arg0, class38 arg1, int arg2) {
        int[] var4 = new int[arg1.field802];
        field832++;
        int[] var5 = new int[256];
        int[] var6 = new int[arg1.field802];
        int var7 = 0;
        if (arg0 != 58) {
            this.method267(-123);
        }
        while (var7 < var5.length) {
            var5[var7] = arg1.field802;
            var7++;
        }
        for (int var8 = 1; var8 <= arg1.field802; var8++) {
            var4[var8 - 1] = (arg1.field802 << 1) - var8;
            var5[class52.method380(255, arg1.field821[var8 - 1])] = arg1.field802 - var8;
        }
        int var9 = arg1.field802 + 1;
        int var10 = arg1.field802;
        while (var10 > 0) {
            var6[var10 - 1] = var9;
            while (arg1.field802 >= var9 && arg1.field821[var9 - 1] != arg1.field821[var10 - 1]) {
                if (var4[var9 - 1] >= arg1.field802 - var10) {
                    var4[var9 - 1] = arg1.field802 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var10--;
            var9--;
        }
        int var11 = var9;
        int var12 = 0;
        int var13 = 1;
        int var14 = arg1.field802 + 1 - var9;
        for (int var15 = 1; var15 <= var14; var15++) {
            var6[var15 - 1] = var12;
            while (var12 >= 1 && arg1.field821[var12 - 1] != arg1.field821[var15 - 1]) {
                var12 = var6[var12 - 1];
            }
            var12++;
        }
        while (var11 < arg1.field802) {
            for (int var18 = var13; var18 <= var11; var18++) {
                if (arg1.field802 + var11 - var18 <= var4[var18 + -1]) {
                    var4[var18 - 1] = arg1.field802 + var11 - var18;
                }
            }
            var13 = var11 + 1;
            var11 += var14 - var6[var14 - 1];
            var14 = var6[var14 - 1];
        }
        int var17;
        for (int var16 = arg2 + arg1.field802 - 1; var16 < this.field802; var16 += Math.max(var5[this.field821[var16] & 0xFF], var4[var17])) {
            for (var17 = arg1.field802 - 1; var17 >= 0 && this.field821[var16] == arg1.field821[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(III)Lea;")
    public final class38 method273(int arg0, int arg1, int arg2) {
        field819++;
        class38 var4 = new class38();
        var4.field821 = new byte[arg2 - arg1];
        var4.field802 = arg2 - arg1;
        class131.method964(this.field821, arg1, var4.field821, arg0, var4.field802);
        return var4;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZLea;)I")
    public final int method274(boolean arg0, class38 arg1) {
        int var3;
        if (this.field802 > arg1.field802) {
            var3 = arg1.field802;
        } else {
            var3 = this.field802;
        }
        field804++;
        if (!arg0) {
            this.method284(null, -38, 126, 47);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (class139.field2891[this.field821[var4] & 0xFF] < class139.field2891[arg1.field821[var4] & 0xFF]) {
                return -1;
            }
            if (class139.field2891[arg1.field821[var4] & 0xFF] < class139.field2891[this.field821[var4] & 0xFF]) {
                return 1;
            }
        }
        if (this.field802 < arg1.field802) {
            return -1;
        } else if (arg1.field802 < this.field802) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "(I)J")
    private final long method275(int arg0) {
        field814++;
        if (arg0 != -169496123) {
            this.method265(-94, -38);
        }
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field802; var4++) {
            var2 = (var2 << 5) + (long) (this.field821[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(B)I")
    public final int method276(byte arg0) {
        if (arg0 == 38) {
            field805++;
            return this.field802;
        } else {
            return -84;
        }
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(B)Lea;")
    public final class38 method277(byte arg0) {
        field789++;
        if (!this.field791) {
            throw new IllegalArgumentException();
        }
        this.field812 = 0;
        if (this.field821.length != this.field802) {
            byte[] var2 = new byte[this.field802];
            class131.method964(this.field821, 0, var2, 0, this.field802);
            this.field821 = var2;
        }
        if (arg0 <= 58) {
            this.hashCode();
        }
        return this;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
    public final int method278(FontMetrics arg0, int arg1) {
        String var3;
        try {
            var3 = new String(this.field821, 0, this.field802, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field821, 0, this.field802);
        }
        if (arg1 <= 83) {
            field834 = null;
        }
        field829++;
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "(I)I")
    public final int method279(int arg0) {
        if (arg0 != 8109) {
            this.method275(-11);
        }
        field794++;
        return this.method259(1037, 10);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(Lea;B)Z")
    public final boolean method280(class38 arg0, byte arg1) {
        field796++;
        if (arg0.field802 > this.field802) {
            return false;
        }
        int var3 = this.field802 - arg0.field802;
        if (arg1 != -124) {
            field797 = null;
        }
        for (int var4 = 0; var4 < arg0.field802; var4++) {
            if (this.field821[var3 + var4] != arg0.field821[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[BII)I")
    public final int method281(int arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        field813++;
        if (arg3 == -91) {
            class131.method964(this.field821, arg4, arg2, arg1, arg0 - arg4);
            return arg0 - arg4;
        } else {
            return -76;
        }
    }

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "(B)Ljava/net/URL;")
    public final URL method282(byte arg0) throws MalformedURLException {
        if (arg0 > -40) {
            return null;
        } else {
            field800++;
            return new URL(new String(this.field821, 0, this.field802));
        }
    }

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "(B)[B")
    public final byte[] method283(byte arg0) {
        if (arg0 == -103) {
            field826++;
            byte[] var2 = new byte[this.field802];
            class131.method964(this.field821, 0, var2, 0, this.field802);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method284(Graphics arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 48) {
            this.method265(-13, -128);
        }
        field793++;
        String var5;
        try {
            var5 = new String(this.field821, 0, this.field802, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field821, 0, this.field802);
        }
        arg0.drawString(var5, arg2, arg3);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method285(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
