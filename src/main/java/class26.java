import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!na")
public class class26 implements class36 {

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "Z")
    private boolean field368 = true;

    @OriginalMember(owner = "mapview!na", name = "c", descriptor = "I")
    public static int field369 = -1;

    @OriginalMember(owner = "mapview!na", name = "g", descriptor = "I")
    public static int field373 = 50;

    @OriginalMember(owner = "mapview!na", name = "h", descriptor = "I")
    public static int field374 = 0;

    @OriginalMember(owner = "mapview!na", name = "k", descriptor = "Lna;")
    public static class26 field377 = class6.method40("Fur Trader", 48);

    @OriginalMember(owner = "mapview!na", name = "l", descriptor = "Lna;")
    public static class26 field378 = class6.method40("Key", 48);

    @OriginalMember(owner = "mapview!na", name = "d", descriptor = "Lna;")
    public static class26 field370 = class6.method40("Platelegs Shop", 48);

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "mapview!na", name = "i", descriptor = "I")
    public int field375;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!na", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field379;

    @OriginalMember(owner = "mapview!na", name = "e", descriptor = "[B")
    public byte[] field371;

    @OriginalMember(owner = "mapview!na", name = "j", descriptor = "[B")
    public static byte[] field376;

    @OriginalMember(owner = "mapview!na", name = "f", descriptor = "[[[I")
    public static int[][][] field372;

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(B)I", line = 22)
    public final int method175(byte arg0) {
        return arg0 == 112 ? this.method185(10, 0) : 16;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I", line = 87)
    public final int method176(int arg0, FontMetrics arg1) {
        String var3;
        try {
            var3 = new String(this.field371, arg0, this.field375, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field371, 0, this.field375);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "(B)Lna;", line = 106)
    public final class26 method177(byte arg0) {
        long var2 = this.method187(-128);
        synchronized (field379 == null ? (field379 = method198("na")) : field379) {
            if (class10.field117 == null) {
                class10.field117 = new class33(4096);
            } else {
                for (class39 var5 = (class39) class10.field117.method235(-110, var2); var5 != null; var5 = (class39) class10.field117.method233(-88)) {
                    if (this.method179((byte) -17, var5.field511)) {
                        return var5.field511;
                    }
                }
            }
            class39 var6 = new class39();
            var6.field511 = this;
            this.field368 = false;
            class10.field117.method234(var2, var6, -19442);
            if (arg0 <= 1) {
                this.field367 = 49;
            }
            return this;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 107)
    public static Class method198(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(II)Lna;", line = 147)
    public final class26 method178(int arg0, int arg1) {
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        } else if (this.field368) {
            this.field367 = 0;
            if (this.field371.length == this.field375) {
                int var3;
                for (var3 = 1; var3 <= this.field375; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class17.method109(this.field371, 0, var4, 0, this.field375);
                this.field371 = var4;
            }
            this.field371[this.field375++] = (byte) arg0;
            return arg1 < 110 ? (class26) null : this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(BLna;)Z", line = 188)
    public final boolean method179(byte arg0, class26 arg1) {
        if (arg1 == null) {
            return false;
        } else if (this.field375 == arg1.field375) {
            if (!this.field368 || !arg1.field368) {
                if (this.field367 == 0) {
                    this.field367 = this.method193(true);
                    if (this.field367 == 0) {
                        this.field367 = 1;
                    }
                }
                if (arg1.field367 == 0) {
                    arg1.field367 = arg1.method193(true);
                    if (arg1.field367 == 0) {
                        arg1.field367 = 1;
                    }
                }
                if (this.field367 != arg1.field367) {
                    return false;
                }
            }
            if (arg0 != -17) {
                this.method186(-124, 3);
            }
            for (int var3 = 0; var3 < this.field375; var3++) {
                if (this.field371[var3] != arg1.field371[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(ZI)V", line = 246)
    public final void method180(boolean arg0, int arg1) {
        this.field367 = 0;
        if (!arg0) {
            this.method191((byte) 104, null);
        }
        if (!this.field368) {
            throw new IllegalArgumentException();
        } else if (arg1 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg1 > this.field371.length) {
                int var3;
                for (var3 = 1; var3 < arg1; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class17.method109(this.field371, 0, var4, 0, this.field375);
                this.field371 = var4;
            }
            for (int var5 = this.field375; var5 < arg1; var5++) {
                this.field371[var5] = 32;
            }
            this.field375 = arg1;
        }
    }

    @OriginalMember(owner = "mapview!na", name = "hashCode", descriptor = "()I", line = 293)
    public final int hashCode() {
        return this.method193(true);
    }

    @OriginalMember(owner = "mapview!na", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 310)
    public final boolean equals(Object arg0) {
        if (!(arg0 instanceof class26)) {
            throw new IllegalArgumentException();
        }
        return this.method179((byte) -17, (class26) arg0);
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(ZIILjava/awt/Graphics;)V", line = 327)
    public final void method181(boolean arg0, int arg1, int arg2, Graphics arg3) {
        String var5;
        try {
            var5 = new String(this.field371, 0, this.field375, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field371, 0, this.field375);
        }
        if (!arg0) {
            this.field368 = false;
        }
        arg3.drawString(var5, arg2, arg1);
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(Ljava/applet/Applet;I)Lna;", line = 351)
    public final class26 method182(Applet arg0, int arg1) {
        String var3 = new String(this.field371, arg1, this.field375);
        String var4 = arg0.getParameter(var3);
        return var4 == null ? null : class13.method82(false, var4);
    }

    @OriginalMember(owner = "mapview!na", name = "c", descriptor = "(B)V", line = 363)
    public static void method183(byte arg0) {
        field378 = null;
        field376 = null;
        field370 = null;
        if (arg0 != 108) {
            field376 = null;
        }
        field377 = null;
        field372 = null;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(BII)Lna;", line = 380)
    public final class26 method184(byte arg0, int arg1, int arg2) {
        int var4 = 81 % ((arg0 + 55) / 43);
        class26 var5 = new class26();
        var5.field371 = new byte[arg2 - arg1];
        var5.field375 = arg2 - arg1;
        class17.method109(this.field371, arg1, var5.field371, 0, var5.field375);
        return var5;
    }

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "(II)I", line = 394)
    private final int method185(int arg0, int arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = arg1; var6 < this.field375; var6++) {
            int var7 = this.field371[var6] & 0xFF;
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
            if (arg0 <= var7) {
                throw new NumberFormatException();
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if (var8 / arg0 != var5) {
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

    @OriginalMember(owner = "mapview!na", name = "c", descriptor = "(II)Lna;", line = 475)
    public final class26 method186(int arg0, int arg1) {
        int var3 = 25 % ((27 - arg1) / 55);
        return this.method184((byte) 98, arg0, this.field375);
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(I)J", line = 495)
    private final long method187(int arg0) {
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field375; var4++) {
            var2 = (var2 << 5) + (long) (this.field371[var4] & 0xFF) - var2;
        }
        int var5 = 67 % ((-arg0 - 73) / 49);
        return var2;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(IB)I", line = 519)
    public final int method188(int arg0, byte arg1) {
        if (arg1 != 98) {
            field372 = null;
        }
        return this.field371[arg0] & 0xFF;
    }

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "(I)V", line = 536)
    public final void method189(int arg0) {
        String var2;
        try {
            var2 = new String(this.field371, 0, this.field375, "ISO-8859-1");
            int var3 = 46 / ((arg0 - 34) / 43);
        } catch (UnsupportedEncodingException var5) {
            var2 = new String(this.field371, 0, this.field375);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "mapview!na", name = "c", descriptor = "(I)Lna;", line = 558)
    public final class26 method190(int arg0) {
        class26 var2 = new class26();
        var2.field375 = this.field375;
        var2.field371 = new byte[this.field375];
        int var3 = 97 % ((arg0 + 19) / 35);
        for (int var4 = 0; var4 < this.field375; var4++) {
            byte var5 = this.field371[var4];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            var2.field371[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "(BLna;)I", line = 588)
    public final int method191(byte arg0, class26 arg1) {
        int var3;
        if (arg1.field375 >= this.field375) {
            var3 = this.field375;
        } else {
            var3 = arg1.field375;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((this.field371[var4] & 0xFF) < (arg1.field371[var4] & 0xFF)) {
                return -1;
            }
            if ((arg1.field371[var4] & 0xFF) < (this.field371[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg0 <= 65) {
            return 109;
        } else if (arg1.field375 > this.field375) {
            return -1;
        } else if (arg1.field375 >= this.field375) {
            return 0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(Z)Lna;", line = 628)
    public final class26 method192(boolean arg0) {
        if (!this.field368) {
            throw new IllegalArgumentException();
        }
        this.field367 = 0;
        if (this.field371.length != this.field375) {
            byte[] var2 = new byte[this.field375];
            class17.method109(this.field371, 0, var2, 0, this.field375);
            this.field371 = var2;
        }
        if (!arg0) {
            field374 = 61;
        }
        return this;
    }

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "(Z)I", line = 662)
    public final int method193(boolean arg0) {
        int var2 = 0;
        int var3 = 0;
        if (!arg0) {
            return 31;
        }
        while (this.field375 > var3) {
            var2 = (this.field371[var3] & 0xFF) + ((var2 << 5) - var2);
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(III)I", line = 690)
    private final int method194(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg0;
        if (arg2 <= 9) {
            field370 = null;
        }
        for (int var5 = arg1; var5 < this.field375; var5++) {
            if (this.field371[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "mapview!na", name = "toString", descriptor = "()Ljava/lang/String;", line = 713)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "(III)Lna;", line = 747)
    public final class26 method195(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg1;
        class26 var5 = new class26();
        byte var6 = (byte) arg2;
        var5.field375 = this.field375;
        var5.field371 = new byte[this.field375];
        for (int var7 = arg0; var7 < this.field375; var7++) {
            byte var8 = this.field371[var7];
            if (var4 == var8) {
                var5.field371[var7] = var6;
            } else {
                var5.field371[var7] = var8;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(BI)I", line = 775)
    public final int method196(byte arg0, int arg1) {
        if (arg0 != 107) {
            this.method175((byte) 59);
        }
        return this.method194(arg1, 0, 127);
    }

    @OriginalMember(owner = "mapview!na", name = "d", descriptor = "(B)I", line = 785)
    public final int method197(byte arg0) {
        if (arg0 != -112) {
            this.method179((byte) -60, null);
        }
        return this.field375;
    }
}
