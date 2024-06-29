import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!s")
public class class34 implements class41 {

    @OriginalMember(owner = "mapview!s", name = "k", descriptor = "Z")
    private boolean field474 = true;

    @OriginalMember(owner = "mapview!s", name = "d", descriptor = "I")
    public static int field467 = 0;

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "Ls;")
    public static class34 field465 = class9.method35("Guide", 220);

    @OriginalMember(owner = "mapview!s", name = "f", descriptor = "Ls;")
    public static class34 field469 = class9.method35("Amulet Shop", 220);

    @OriginalMember(owner = "mapview!s", name = "c", descriptor = "Ls;")
    public static class34 field466 = class9.method35("50(U", 220);

    @OriginalMember(owner = "mapview!s", name = "m", descriptor = "Ls;")
    public static class34 field476 = class9.method35("Next page", 220);

    @OriginalMember(owner = "mapview!s", name = "p", descriptor = "Ls;")
    public static class34 field479 = class9.method35("Windmill", 220);

    @OriginalMember(owner = "mapview!s", name = "h", descriptor = "Ls;")
    public static class34 field471 = class9.method35("Silver Shop", 220);

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "mapview!s", name = "g", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "mapview!s", name = "i", descriptor = "I")
    private int field472;

    @OriginalMember(owner = "mapview!s", name = "n", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "mapview!s", name = "o", descriptor = "I")
    public int field478;

    @OriginalMember(owner = "mapview!s", name = "j", descriptor = "J")
    public static long field473;

    @OriginalMember(owner = "mapview!s", name = "q", descriptor = "Ljava/awt/Font;")
    public static Font field480;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!s", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field481;

    @OriginalMember(owner = "mapview!s", name = "l", descriptor = "[B")
    public byte[] field475;

    @OriginalMember(owner = "mapview!s", name = "e", descriptor = "[I")
    public static int[] field468;

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(Ls;I)Z", line = 15)
    public final boolean method219(class34 arg0, int arg1) {
        if (arg0 == null) {
            return false;
        } else if (this.field478 == arg0.field478) {
            if (!this.field474 || !arg0.field474) {
                if (this.field472 == 0) {
                    this.field472 = this.method242((byte) 58);
                    if (this.field472 == 0) {
                        this.field472 = 1;
                    }
                }
                if (arg0.field472 == 0) {
                    arg0.field472 = arg0.method242((byte) 58);
                    if (arg0.field472 == 0) {
                        arg0.field472 = 1;
                    }
                }
                if (this.field472 != arg0.field472) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field478; var3++) {
                if (this.field475[var3] != arg0.field475[var3]) {
                    return false;
                }
            }
            if (arg1 != 1) {
                this.method224((byte) 117);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(IB)V", line = 79)
    public final void method220(int arg0, byte arg1) {
        this.field472 = 0;
        if (!this.field474) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (this.field475.length < arg0) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class5.method16(this.field475, 0, var4, 0, this.field478);
                this.field475 = var4;
            }
            if (arg1 != -81) {
                this.method224((byte) 88);
            }
            for (int var5 = this.field478; var5 < arg0; var5++) {
                this.field475[var5] = 32;
            }
            this.field478 = arg0;
        }
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(B)Ls;", line = 126)
    public final class34 method221(byte arg0) {
        if (arg0 != -109) {
            this.method229(48, -65, 19);
        }
        class34 var2 = new class34();
        var2.field478 = this.field478;
        var2.field475 = new byte[this.field478];
        for (int var3 = 0; var3 < this.field478; var3++) {
            byte var4 = this.field475[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field475[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(II)I", line = 156)
    public final int method222(int arg0, int arg1) {
        if (arg1 != 16186) {
            field476 = null;
        }
        return this.field475[arg0] & 0xFF;
    }

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "(B)V", line = 169)
    public static final void method223(byte arg0) {
        if (arg0 != -97) {
            field465 = null;
        }
        if (++class14.field130 >= 64) {
            class12.field113++;
            class14.field130 = 0;
            if (class12.field113 < class19.field170 >> 6) {
                class26.method169(arg0 ^ 0xFFFFFF9B);
            }
        }
        class31.field433 = (class14.field130 << 6) + class26.field363;
    }

    @OriginalMember(owner = "mapview!s", name = "toString", descriptor = "()Ljava/lang/String;", line = 200)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!s", name = "c", descriptor = "(B)I", line = 215)
    public final int method224(byte arg0) {
        if (arg0 <= 109) {
            this.method232(-128, 69, null, 116);
        }
        return this.field478;
    }

    @OriginalMember(owner = "mapview!s", name = "d", descriptor = "(B)Ls;", line = 237)
    public final class34 method225(byte arg0) {
        long var2 = this.method241(arg0 ^ 0xFFFFFFE0);
        synchronized (field481 == null ? (field481 = method244("s")) : field481) {
            if (class1.field15 == null) {
                class1.field15 = new class10(4096);
            } else {
                for (class19 var5 = (class19) class1.field15.method38(-113, var2); var5 != null; var5 = (class19) class1.field15.method40(110)) {
                    if (this.method219(var5.field175, arg0 + 39)) {
                        return var5.field175;
                    }
                }
            }
            if (arg0 != -38) {
                return (class34) null;
            }
            class19 var6 = new class19();
            var6.field175 = this;
            this.field474 = false;
            class1.field15.method41(-1, var6, var2);
            return this;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 238)
    public static Class method244(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "mapview!s", name = "e", descriptor = "(B)V", line = 283)
    public static void method226(byte arg0) {
        if (arg0 != 51) {
            field466 = null;
        }
        field476 = null;
        field465 = null;
        field466 = null;
        field471 = null;
        field469 = null;
        field480 = null;
        field479 = null;
        field468 = null;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(ILs;)I", line = 303)
    public final int method227(int arg0, class34 arg1) {
        int var3;
        if (this.field478 <= arg1.field478) {
            var3 = this.field478;
        } else {
            var3 = arg1.field478;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg1.field475[var4] & 0xFF) > (this.field475[var4] & 0xFF)) {
                return -1;
            }
            if ((arg1.field475[var4] & 0xFF) < (this.field475[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg0 != 8753) {
            return 43;
        } else if (this.field478 < arg1.field478) {
            return -1;
        } else if (arg1.field478 < this.field478) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "mapview!s", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 344)
    public final boolean equals(Object arg0) {
        if (!(arg0 instanceof class34)) {
            throw new IllegalArgumentException();
        }
        return this.method219((class34) arg0, 1);
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(BII)I", line = 369)
    private final int method228(byte arg0, int arg1, int arg2) {
        byte var4 = (byte) arg2;
        if (arg0 >= -5) {
            this.method243(75, 62, 13);
        }
        for (int var5 = arg1; var5 < this.field478; var5++) {
            if (this.field475[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(III)Ls;", line = 400)
    public final class34 method229(int arg0, int arg1, int arg2) {
        class34 var4 = new class34();
        var4.field478 = arg2 - arg0;
        if (arg1 == -97) {
            var4.field475 = new byte[arg2 - arg0];
            class5.method16(this.field475, arg0, var4.field475, 0, var4.field478);
            return var4;
        } else {
            return (class34) null;
        }
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I", line = 419)
    public final int method230(FontMetrics arg0, int arg1) {
        String var3;
        try {
            var3 = new String(this.field475, arg1, this.field478, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field475, 0, this.field478);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "(IB)I", line = 439)
    public final int method231(int arg0, byte arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        int var4 = -107 / ((-arg1 - 45) / 44);
        int var5 = 0;
        boolean var6 = false;
        for (int var7 = 0; var7 < this.field478; var7++) {
            int var8 = this.field475[var7] & 0xFF;
            if (var7 == 0) {
                if (var8 == 45) {
                    var6 = true;
                    continue;
                }
                if (var8 == 43) {
                    continue;
                }
            }
            if (var8 >= 48 && var8 <= 57) {
                var8 -= 48;
            } else if (var8 >= 65 && var8 <= 90) {
                var8 -= 55;
            } else if (var8 >= 97 && var8 <= 122) {
                var8 -= 87;
            } else {
                throw new NumberFormatException();
            }
            if (var8 >= arg0) {
                throw new NumberFormatException();
            }
            if (var6) {
                var8 = -var8;
            }
            int var9 = arg0 * var5 + var8;
            if (var9 / arg0 != var5) {
                throw new NumberFormatException();
            }
            var5 = var9;
            var3 = true;
        }
        if (!var3) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 530)
    public final void method232(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg3 <= 37) {
            return;
        }
        String var5;
        try {
            var5 = new String(this.field475, 0, this.field478, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field475, 0, this.field478);
        }
        arg2.drawString(var5, arg0, arg1);
    }

    @OriginalMember(owner = "mapview!s", name = "f", descriptor = "(B)Ls;", line = 548)
    public final class34 method233(byte arg0) {
        int var2 = -78 / ((arg0 - 3) / 61);
        if (!this.field474) {
            throw new IllegalArgumentException();
        }
        this.field472 = 0;
        if (this.field475.length != this.field478) {
            byte[] var3 = new byte[this.field478];
            class5.method16(this.field475, 0, var3, 0, this.field478);
            this.field475 = var3;
        }
        return this;
    }

    @OriginalMember(owner = "mapview!s", name = "hashCode", descriptor = "()I", line = 605)
    public final int hashCode() {
        return this.method242((byte) 58);
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(BLs;)Z", line = 638)
    public final boolean method234(byte arg0, class34 arg1) {
        if (arg1.field478 > this.field478) {
            return false;
        }
        int var3 = 0;
        if (arg0 != -115) {
            field465 = null;
        }
        while (arg1.field478 > var3) {
            if (this.field475[var3] != arg1.field475[var3]) {
                return false;
            }
            var3++;
        }
        return true;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(Lda;ILs;Ls;)[Lf;", line = 663)
    public static final class11[] method235(class8 arg0, int arg1, class34 arg2, class34 arg3) {
        int var4 = -66 / ((-arg1 - 24) / 43);
        int var5 = arg0.method32(arg2, -1);
        int var6 = arg0.method21((byte) -125, arg3, var5);
        return mapview.method146(arg0, var6, -33, var5);
    }

    @OriginalMember(owner = "mapview!s", name = "g", descriptor = "(B)I", line = 676)
    public final int method236(byte arg0) {
        return arg0 >= -47 ? 40 : this.method231(10, (byte) 68);
    }

    @OriginalMember(owner = "mapview!s", name = "h", descriptor = "(B)V", line = 696)
    public final void method237(byte arg0) {
        String var2;
        try {
            if (arg0 >= -74) {
                field480 = null;
            }
            var2 = new String(this.field475, 0, this.field478, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field475, 0, this.field478);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "mapview!s", name = "c", descriptor = "(IB)I", line = 717)
    public final int method238(int arg0, byte arg1) {
        int var3 = 127 / ((-arg1 - 66) / 53);
        return this.method228((byte) -73, 0, arg0);
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(ZI)Ls;", line = 729)
    public final class34 method239(boolean arg0, int arg1) {
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        }
        if (arg0) {
            this.method232(8, -35, null, 14);
        }
        if (!this.field474) {
            throw new IllegalArgumentException();
        }
        this.field472 = 0;
        if (this.field475.length == this.field478) {
            int var3;
            for (var3 = 1; var3 <= this.field478; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class5.method16(this.field475, 0, var4, 0, this.field478);
            this.field475 = var4;
        }
        this.field475[this.field478++] = (byte) arg1;
        return this;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(BI)Ls;", line = 766)
    public final class34 method240(byte arg0, int arg1) {
        if (arg0 > -108) {
            this.method234((byte) -122, null);
        }
        return this.method229(arg1, -97, this.field478);
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(I)J", line = 778)
    private final long method241(int arg0) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = -43 % ((-arg0 - 13) / 38);
        while (var4 < this.field478) {
            var2 = (var2 << 5) + (long) (this.field475[var4] & 0xFF) - var2;
            var4++;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!s", name = "i", descriptor = "(B)I", line = 797)
    public final int method242(byte arg0) {
        int var2 = 0;
        if (arg0 != 58) {
            field464 = 39;
        }
        for (int var3 = 0; var3 < this.field478; var3++) {
            var2 = (var2 << 5) + (this.field475[var3] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "(III)Ls;", line = 828)
    public final class34 method243(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg0;
        byte var5 = (byte) arg2;
        class34 var6 = new class34();
        var6.field478 = this.field478;
        var6.field475 = new byte[this.field478];
        int var7 = 0;
        if (arg1 != 61) {
            return (class34) null;
        }
        while (this.field478 > var7) {
            byte var8 = this.field475[var7];
            if (var4 == var8) {
                var6.field475[var7] = var5;
            } else {
                var6.field475[var7] = var8;
            }
            var7++;
        }
        return var6;
    }
}
