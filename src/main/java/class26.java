import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!na")
public class class26 implements class10 {

    @OriginalMember(owner = "mapview!na", name = "h", descriptor = "Z")
    private boolean field365 = true;

    @OriginalMember(owner = "mapview!na", name = "f", descriptor = "Lna;")
    public static class26 field363 = class30.method205((byte) 23, "map");

    @OriginalMember(owner = "mapview!na", name = "g", descriptor = "Lna;")
    public static class26 field364 = class30.method205((byte) 39, "37(U");

    @OriginalMember(owner = "mapview!na", name = "i", descriptor = "Lna;")
    public static class26 field366 = class30.method205((byte) 62, "Loading");

    @OriginalMember(owner = "mapview!na", name = "d", descriptor = "[I")
    public static int[] field361 = new int[128];

    @OriginalMember(owner = "mapview!na", name = "l", descriptor = "I")
    public static int field369 = 20;

    @OriginalMember(owner = "mapview!na", name = "k", descriptor = "Lna;")
    public static class26 field368 = class30.method205((byte) 33, "Quest Start");

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "mapview!na", name = "c", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "mapview!na", name = "j", descriptor = "I")
    public int field367;

    @OriginalMember(owner = "mapview!na", name = "e", descriptor = "Lta;")
    public static class37 field362;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!na", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field370;

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "[B")
    public byte[] field358;

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V", line = 10)
    public final void method167(Graphics arg0, int arg1, int arg2, byte arg3) {
        if (arg3 <= 90) {
            this.field367 = -43;
        }
        String var5;
        try {
            var5 = new String(this.field358, 0, this.field367, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field358, 0, this.field367);
        }
        arg0.drawString(var5, arg2, arg1);
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(Z)I", line = 65)
    public final int method168(boolean arg0) {
        if (arg0) {
            this.hashCode();
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field367; var3++) {
            var2 = (var2 << 5) + (this.field358[var3] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!na", name = "toString", descriptor = "()Ljava/lang/String;", line = 85)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(II)I", line = 93)
    public final int method169(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method173(null, -3);
        }
        return this.method179(arg0, -33, 0);
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(Lna;B)Z", line = 105)
    public final boolean method170(class26 arg0, byte arg1) {
        if (this.field367 < arg0.field367) {
            return false;
        }
        int var3 = -68 % ((arg1 - 11) / 54);
        for (int var4 = 0; var4 < arg0.field367; var4++) {
            if (this.field358[var4] != arg0.field358[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(I)V", line = 130)
    public final void method171(int arg0) {
        String var2;
        try {
            var2 = new String(this.field358, 0, this.field367, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field358, 0, this.field367);
        }
        if (arg0 == 0) {
            System.out.println(var2);
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(B)V", line = 146)
    public static void method172(byte arg0) {
        field366 = null;
        int var1 = -62 % ((49 - arg0) / 62);
        field362 = null;
        field368 = null;
        field361 = null;
        field363 = null;
        field364 = null;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(Lna;I)Z", line = 160)
    public final boolean method173(class26 arg0, int arg1) {
        if (arg0 == null) {
            return false;
        } else if (this.field367 == arg0.field367) {
            if (!this.field365 || !arg0.field365) {
                if (this.field359 == 0) {
                    this.field359 = this.method168(false);
                    if (this.field359 == 0) {
                        this.field359 = 1;
                    }
                }
                if (arg0.field359 == 0) {
                    arg0.field359 = arg0.method168(false);
                    if (arg0.field359 == 0) {
                        arg0.field359 = 1;
                    }
                }
                if (this.field359 != arg0.field359) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field367; var3++) {
                if (this.field358[var3] != arg0.field358[var3]) {
                    return false;
                }
            }
            if (arg1 == -2093) {
                return true;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!na", name = "hashCode", descriptor = "()I", line = 220)
    public final int hashCode() {
        return this.method168(false);
    }

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "(B)I", line = 227)
    public final int method174(byte arg0) {
        return arg0 < 27 ? 65 : this.method175(10, (byte) -127);
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(IB)I", line = 245)
    public final int method175(int arg0, byte arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        int var4 = 0;
        boolean var5 = false;
        int var6 = 56 / ((arg1 + 70) / 50);
        for (int var7 = 0; var7 < this.field367; var7++) {
            int var8 = this.field358[var7] & 0xFF;
            if (var7 == 0) {
                if (var8 == 45) {
                    var3 = true;
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
            if (arg0 <= var8) {
                throw new NumberFormatException();
            }
            if (var3) {
                var8 = -var8;
            }
            int var9 = arg0 * var4 + var8;
            if (var9 / arg0 != var4) {
                throw new NumberFormatException();
            }
            var5 = true;
            var4 = var9;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "(Z)Lna;", line = 324)
    public final class26 method176(boolean arg0) {
        class26 var2 = new class26();
        var2.field367 = this.field367;
        var2.field358 = new byte[this.field367];
        if (arg0) {
            return (class26) null;
        }
        for (int var3 = 0; var3 < this.field367; var3++) {
            byte var4 = this.field358[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field358[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "(I)Lna;", line = 354)
    public final class26 method177(int arg0) {
        if (arg0 != 4096) {
            this.method170(null, (byte) 36);
        }
        long var2 = this.method190(true);
        synchronized (field370 == null ? (field370 = method191("na")) : field370) {
            if (class7.field169 == null) {
                class7.field169 = new class33(4096);
            } else {
                for (class1 var5 = (class1) class7.field169.method216(var2, 8); var5 != null; var5 = (class1) class7.field169.method217(false)) {
                    if (this.method173(var5.field103, -2093)) {
                        return var5.field103;
                    }
                }
            }
            class1 var6 = new class1();
            var6.field103 = this;
            this.field365 = false;
            class7.field169.method221(var2, -1559, var6);
            return this;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 358)
    public static Class method191(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(IZ)Lna;", line = 392)
    public final class26 method178(int arg0, boolean arg1) {
        return arg1 ? this.method180(this.field367, arg1, arg0) : (class26) null;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(III)I", line = 403)
    private final int method179(int arg0, int arg1, int arg2) {
        if (arg1 != -33) {
            return 53;
        }
        byte var4 = (byte) arg0;
        for (int var5 = arg2; var5 < this.field367; var5++) {
            if (this.field358[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "mapview!na", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 433)
    public final boolean equals(Object arg0) {
        if (!(arg0 instanceof class26)) {
            throw new IllegalArgumentException();
        }
        return this.method173((class26) arg0, -2093);
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(IZI)Lna;", line = 448)
    public final class26 method180(int arg0, boolean arg1, int arg2) {
        class26 var4 = new class26();
        var4.field367 = arg0 - arg2;
        var4.field358 = new byte[arg0 - arg2];
        if (!arg1) {
            this.method169(-62, -81);
        }
        class11.method79(this.field358, arg2, var4.field358, 0, var4.field367);
        return var4;
    }

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "(IB)I", line = 466)
    public final int method181(int arg0, byte arg1) {
        if (arg1 != -3) {
            field361 = null;
        }
        return this.field358[arg0] & 0xFF;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(Lna;Z)I", line = 487)
    public final int method182(class26 arg0, boolean arg1) {
        int var3;
        if (arg0.field367 < this.field367) {
            var3 = arg0.field367;
        } else {
            var3 = this.field367;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((this.field358[var4] & 0xFF) < (arg0.field358[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field358[var4] & 0xFF) > (arg0.field358[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg1) {
            this.method177(29);
        }
        if (arg0.field367 > this.field367) {
            return -1;
        } else if (arg0.field367 < this.field367) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "(III)Lna;", line = 531)
    public final class26 method183(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg2;
        class26 var5 = new class26();
        byte var6 = (byte) arg1;
        var5.field367 = this.field367;
        var5.field358 = new byte[this.field367];
        if (arg0 != 782) {
            field361 = null;
        }
        for (int var7 = 0; var7 < this.field367; var7++) {
            byte var8 = this.field358[var7];
            if (var4 == var8) {
                var5.field358[var7] = var6;
            } else {
                var5.field358[var7] = var8;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!na", name = "c", descriptor = "(I)Lna;", line = 574)
    public final class26 method184(int arg0) {
        if (arg0 != -1) {
            return (class26) null;
        } else if (this.field365) {
            this.field359 = 0;
            if (this.field358.length != this.field367) {
                byte[] var2 = new byte[this.field367];
                class11.method79(this.field358, 0, var2, 0, this.field367);
                this.field358 = var2;
            }
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!na", name = "d", descriptor = "(I)I", line = 611)
    public final int method185(int arg0) {
        return arg0 <= 45 ? 112 : this.field367;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 626)
    public static final void method186(Component arg0, int arg1) {
        arg0.addMouseListener(class25.field342);
        arg0.addMouseMotionListener(class25.field342);
        arg0.addFocusListener(class25.field342);
        if (arg1 <= 112) {
            field369 = -53;
        }
    }

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "(IZ)V", line = 644)
    public final void method187(int arg0, boolean arg1) {
        this.field359 = 0;
        if (!this.field365) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg0 > this.field358.length) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class11.method79(this.field358, 0, var4, 0, this.field367);
                this.field358 = var4;
            }
            if (arg1) {
                for (int var5 = this.field367; var5 < arg0; var5++) {
                    this.field358[var5] = 32;
                }
                this.field367 = arg0;
            }
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(ZLjava/awt/FontMetrics;)I", line = 717)
    public final int method188(boolean arg0, FontMetrics arg1) {
        if (arg0) {
            field363 = null;
        }
        String var3;
        try {
            var3 = new String(this.field358, 0, this.field367, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field358, 0, this.field367);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(BI)Lna;", line = 765)
    public final class26 method189(byte arg0, int arg1) {
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (this.field365) {
            this.field359 = 0;
            if (arg0 != -26) {
                this.method175(33, (byte) 106);
            }
            if (this.field358.length == this.field367) {
                int var3;
                for (var3 = 1; var3 <= this.field367; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class11.method79(this.field358, 0, var4, 0, this.field367);
                this.field358 = var4;
            }
            this.field358[this.field367++] = (byte) arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!na", name = "c", descriptor = "(Z)J", line = 816)
    private final long method190(boolean arg0) {
        if (!arg0) {
            return -3L;
        }
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field367; var4++) {
            var2 = (var2 << 5) + (long) (this.field358[var4] & 0xFF) - var2;
        }
        return var2;
    }
}
