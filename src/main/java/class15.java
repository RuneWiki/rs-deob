import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ia")
public class class15 implements class38 {

    @OriginalMember(owner = "mapview!ia", name = "d", descriptor = "Z")
    private boolean field143 = true;

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "I")
    public static volatile int field140 = -1;

    @OriginalMember(owner = "mapview!ia", name = "f", descriptor = "Lia;")
    public static class15 field145 = class28.method196("???", false);

    @OriginalMember(owner = "mapview!ia", name = "h", descriptor = "Lia;")
    public static class15 field147 = class28.method196("Quest Start", false);

    @OriginalMember(owner = "mapview!ia", name = "e", descriptor = "Lia;")
    public static class15 field144 = class28.method196(" map", false);

    @OriginalMember(owner = "mapview!ia", name = "l", descriptor = "Lia;")
    public static class15 field151 = class28.method196("Saw Mill", false);

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "Lia;")
    public static class15 field141 = class28.method196("Axe Shop", false);

    @OriginalMember(owner = "mapview!ia", name = "g", descriptor = "Lia;")
    public static class15 field146 = class28.method196("Staff Shop", false);

    @OriginalMember(owner = "mapview!ia", name = "j", descriptor = "Lia;")
    public static class15 field149 = class28.method196("Enter place name to find", false);

    @OriginalMember(owner = "mapview!ia", name = "p", descriptor = "Lia;")
    public static class15 field155 = class28.method196("100(U", false);

    @OriginalMember(owner = "mapview!ia", name = "c", descriptor = "I")
    public int field142;

    @OriginalMember(owner = "mapview!ia", name = "k", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "mapview!ia", name = "n", descriptor = "I")
    private int field153;

    @OriginalMember(owner = "mapview!ia", name = "o", descriptor = "Li;")
    public static class14 field154;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!ia", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field156;

    @OriginalMember(owner = "mapview!ia", name = "i", descriptor = "[B")
    public byte[] field148;

    @OriginalMember(owner = "mapview!ia", name = "m", descriptor = "[B")
    public static byte[] field152;

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(B)V", line = 6)
    public static void method99(byte arg0) {
        field154 = null;
        field149 = null;
        field152 = null;
        field147 = null;
        int var1 = 54 % ((arg0 + 26) / 51);
        field151 = null;
        field144 = null;
        field145 = null;
        field141 = null;
        field155 = null;
        field146 = null;
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(I)Lia;", line = 27)
    public final class15 method100(int arg0) {
        class15 var2 = new class15();
        var2.field142 = this.field142;
        var2.field148 = new byte[this.field142];
        for (int var3 = 0; var3 < this.field142; var3++) {
            byte var4 = this.field148[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field148[var3] = var4;
        }
        int var5 = -55 / ((arg0 + 23) / 40);
        return var2;
    }

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "(I)I", line = 73)
    public final int method101(int arg0) {
        return arg0 >= -8 ? -39 : this.method113(10, false);
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(Z)I", line = 94)
    public final int method102(boolean arg0) {
        if (arg0) {
            this.method112(39, 72);
        }
        return this.field142;
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(Lia;B)I", line = 118)
    public final int method103(class15 arg0, byte arg1) {
        int var3;
        if (arg0.field142 < this.field142) {
            var3 = arg0.field142;
        } else {
            var3 = this.field142;
        }
        if (arg1 != -75) {
            return -41;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg0.field148[var4] & 0xFF) > (this.field148[var4] & 0xFF)) {
                return -1;
            }
            if ((arg0.field148[var4] & 0xFF) < (this.field148[var4] & 0xFF)) {
                return 1;
            }
        }
        if (this.field142 < arg0.field142) {
            return -1;
        } else if (arg0.field142 >= this.field142) {
            return 0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(BLia;)Z", line = 156)
    public final boolean method104(byte arg0, class15 arg1) {
        if (this.field142 < arg1.field142) {
            return false;
        }
        if (arg0 != 14) {
            field155 = null;
        }
        for (int var3 = 0; var3 < arg1.field142; var3++) {
            if (this.field148[var3] != arg1.field148[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "(BLia;)Z", line = 183)
    public final boolean method105(byte arg0, class15 arg1) {
        if (arg1 == null) {
            return false;
        }
        if (arg0 != 55) {
            this.method109(-64, (byte) 103);
        }
        if (this.field142 != arg1.field142) {
            return false;
        }
        if (!this.field143 || !arg1.field143) {
            if (this.field153 == 0) {
                this.field153 = this.method121((byte) -84);
                if (this.field153 == 0) {
                    this.field153 = 1;
                }
            }
            if (arg1.field153 == 0) {
                arg1.field153 = arg1.method121((byte) 60);
                if (arg1.field153 == 0) {
                    arg1.field153 = 1;
                }
            }
            if (this.field153 != arg1.field153) {
                return false;
            }
        }
        for (int var3 = 0; var3 < this.field142; var3++) {
            if (this.field148[var3] != arg1.field148[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(II)V", line = 242)
    public final void method106(int arg0, int arg1) {
        this.field153 = arg1;
        if (!this.field143) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg0 > this.field148.length) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class23.method154(this.field148, 0, var4, 0, this.field142);
                this.field148 = var4;
            }
            for (int var5 = this.field142; var5 < arg0; var5++) {
                this.field148[var5] = 32;
            }
            this.field142 = arg0;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "c", descriptor = "(I)Lia;", line = 284)
    public final class15 method107(int arg0) {
        if (arg0 <= 63) {
            field147 = null;
        }
        long var2 = this.method118(false);
        synchronized (field156 == null ? (field156 = method123("ia")) : field156) {
            if (class29.field416 == null) {
                class29.field416 = new class34(4096);
            } else {
                for (class3 var5 = (class3) class29.field416.method236(var2, -117); var5 != null; var5 = (class3) class29.field416.method235(1)) {
                    if (this.method105((byte) 55, var5.field26)) {
                        return var5.field26;
                    }
                }
            }
            class3 var6 = new class3();
            this.field143 = false;
            var6.field26 = this;
            class29.field416.method234(var2, var6, 1);
            return this;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 289)
    public static Class method123(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "(II)I", line = 334)
    public final int method108(int arg0, int arg1) {
        return arg1 == 24704 ? this.method116(65, 0, arg0) : 96;
    }

    @OriginalMember(owner = "mapview!ia", name = "toString", descriptor = "()Ljava/lang/String;", line = 345)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(IB)I", line = 362)
    public final int method109(int arg0, byte arg1) {
        return arg1 <= 61 ? 6 : this.field148[arg0] & 0xFF;
    }

    @OriginalMember(owner = "mapview!ia", name = "d", descriptor = "(I)Lia;", line = 384)
    public final class15 method110(int arg0) {
        if (!this.field143) {
            throw new IllegalArgumentException();
        }
        this.field153 = 0;
        if (arg0 != 6332) {
            return (class15) null;
        }
        if (this.field148.length != this.field142) {
            byte[] var2 = new byte[this.field142];
            class23.method154(this.field148, 0, var2, 0, this.field142);
            this.field148 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "mapview!ia", name = "c", descriptor = "(II)Lia;", line = 414)
    public static final class15 method111(int arg0, int arg1) {
        class15 var2 = new class15();
        if (arg0 != -12893) {
            method111(42, 100);
        }
        var2.field142 = 0;
        var2.field148 = new byte[arg1];
        return var2;
    }

    @OriginalMember(owner = "mapview!ia", name = "d", descriptor = "(II)Lia;", line = 438)
    public final class15 method112(int arg0, int arg1) {
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (!this.field143) {
            throw new IllegalArgumentException();
        } else if (arg0 == 1) {
            this.field153 = 0;
            if (this.field148.length == this.field142) {
                int var3;
                for (var3 = 1; var3 <= this.field142; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class23.method154(this.field148, 0, var4, 0, this.field142);
                this.field148 = var4;
            }
            this.field148[this.field142++] = (byte) arg1;
            return this;
        } else {
            return (class15) null;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(IZ)I", line = 481)
    public final int method113(int arg0, boolean arg1) {
        boolean var3 = false;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var4 = arg1;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field142; var6++) {
            int var7 = this.field148[var6] & 0xFF;
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
            if (var7 >= arg0) {
                throw new NumberFormatException();
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if (var8 / arg0 != var5) {
                throw new NumberFormatException();
            }
            var4 = true;
            var5 = var8;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!ia", name = "e", descriptor = "(I)V", line = 570)
    public final void method114(int arg0) {
        int var2 = 2 / ((22 - arg0) / 60);
        String var3;
        try {
            var3 = new String(this.field148, 0, this.field142, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field148, 0, this.field142);
        }
        System.out.println(var3);
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(IBILjava/awt/Graphics;)V", line = 587)
    public final void method115(int arg0, byte arg1, int arg2, Graphics arg3) {
        if (arg1 >= -100) {
            this.method119((byte) 124, null);
        }
        String var5;
        try {
            var5 = new String(this.field148, 0, this.field142, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field148, 0, this.field142);
        }
        arg3.drawString(var5, arg2, arg0);
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(III)I", line = 617)
    private final int method116(int arg0, int arg1, int arg2) {
        if (arg0 <= 12) {
            this.method109(100, (byte) -13);
        }
        byte var4 = (byte) arg2;
        for (int var5 = arg1; var5 < this.field142; var5++) {
            if (this.field148[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "mapview!ia", name = "hashCode", descriptor = "()I", line = 641)
    public final int hashCode() {
        return this.method121((byte) 69);
    }

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "(IB)Lia;", line = 650)
    public final class15 method117(int arg0, byte arg1) {
        return arg1 == 37 ? this.method122(this.field142, -21024, arg0) : (class15) null;
    }

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "(Z)J", line = 685)
    private final long method118(boolean arg0) {
        if (arg0) {
            return 62L;
        }
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field142; var4++) {
            var2 = (var2 << 5) + (long) (this.field148[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(BLjava/awt/FontMetrics;)I", line = 706)
    public final int method119(byte arg0, FontMetrics arg1) {
        String var3;
        try {
            var3 = new String(this.field148, 0, this.field142, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field148, 0, this.field142);
        }
        if (arg0 <= 0) {
            this.field142 = -42;
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "(III)Lia;", line = 727)
    public final class15 method120(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg0;
        byte var5 = (byte) arg1;
        class15 var6 = new class15();
        var6.field142 = this.field142;
        var6.field148 = new byte[this.field142];
        for (int var7 = 0; var7 < this.field142; var7++) {
            byte var8 = this.field148[var7];
            if (var4 == var8) {
                var6.field148[var7] = var5;
            } else {
                var6.field148[var7] = var8;
            }
        }
        if (arg2 <= 21) {
            return (class15) null;
        } else {
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "(B)I", line = 773)
    public final int method121(byte arg0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = -99 / ((arg0 + 27) / 45);
        while (this.field142 > var3) {
            var2 = (var2 << 5) + (this.field148[var3] & 0xFF) - var2;
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ia", name = "c", descriptor = "(III)Lia;", line = 797)
    public final class15 method122(int arg0, int arg1, int arg2) {
        class15 var4 = new class15();
        var4.field142 = arg0 - arg2;
        var4.field148 = new byte[arg0 - arg2];
        class23.method154(this.field148, arg2, var4.field148, 0, var4.field142);
        return arg1 == -21024 ? var4 : (class15) null;
    }

    @OriginalMember(owner = "mapview!ia", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 816)
    public final boolean equals(Object arg0) {
        if (!(arg0 instanceof class15)) {
            throw new IllegalArgumentException();
        }
        return this.method105((byte) 55, (class15) arg0);
    }
}
