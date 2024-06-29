import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!t")
public class class35 implements class1 {

    @OriginalMember(owner = "mapview!t", name = "f", descriptor = "Z")
    private boolean field436 = true;

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "Lt;")
    public static class35 field432 = class3.method28(false, " )2 ");

    @OriginalMember(owner = "mapview!t", name = "j", descriptor = "I")
    public static int field440 = 0;

    @OriginalMember(owner = "mapview!t", name = "h", descriptor = "Lt;")
    public static class35 field438 = class3.method28(false, "_");

    @OriginalMember(owner = "mapview!t", name = "i", descriptor = "Z")
    public static boolean field439 = false;

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "mapview!t", name = "d", descriptor = "I")
    public int field434;

    @OriginalMember(owner = "mapview!t", name = "e", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "mapview!t", name = "g", descriptor = "I")
    private int field437;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!t", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field441;

    @OriginalMember(owner = "mapview!t", name = "c", descriptor = "[B")
    public byte[] field433;

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(B)Lt;", line = 25)
    public final class35 method204(byte arg0) {
        if (arg0 != 11) {
            this.method208((byte) -33, -55);
        }
        class35 var2 = new class35();
        var2.field434 = this.field434;
        var2.field433 = new byte[this.field434];
        for (int var3 = 0; var3 < this.field434; var3++) {
            byte var4 = this.field433[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field433[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(BII)Lt;", line = 64)
    public final class35 method205(byte arg0, int arg1, int arg2) {
        byte var4 = (byte) arg1;
        if (arg0 != 120) {
            field435 = 77;
        }
        byte var5 = (byte) arg2;
        class35 var6 = new class35();
        var6.field434 = this.field434;
        var6.field433 = new byte[this.field434];
        for (int var7 = 0; var7 < this.field434; var7++) {
            byte var8 = this.field433[var7];
            if (var4 == var8) {
                var6.field433[var7] = var5;
            } else {
                var6.field433[var7] = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(B)V", line = 100)
    public static void method206(byte arg0) {
        field438 = null;
        field432 = null;
        if (arg0 != -33) {
            method221(null, (byte) 45, -71, -5);
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Lt;I)Z", line = 115)
    public final boolean method207(class35 arg0, int arg1) {
        if (arg0 == null) {
            return false;
        } else if (this.field434 == arg0.field434) {
            if (arg1 < 44) {
                this.field433 = null;
            }
            if (!this.field436 || !arg0.field436) {
                if (this.field437 == 0) {
                    this.field437 = this.method225(1);
                    if (this.field437 == 0) {
                        this.field437 = 1;
                    }
                }
                if (arg0.field437 == 0) {
                    arg0.field437 = arg0.method225(1);
                    if (arg0.field437 == 0) {
                        arg0.field437 = 1;
                    }
                }
                if (this.field437 != arg0.field437) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field434; var3++) {
                if (this.field433[var3] != arg0.field433[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(BI)V", line = 168)
    public final void method208(byte arg0, int arg1) {
        this.field437 = 0;
        if (!this.field436) {
            throw new IllegalArgumentException();
        } else if (arg1 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg1 > this.field433.length) {
                int var3;
                for (var3 = 1; var3 < arg1; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class14.method90(this.field433, 0, var4, 0, this.field434);
                this.field433 = var4;
            }
            if (arg0 != 83) {
                field432 = null;
            }
            for (int var5 = this.field434; var5 < arg1; var5++) {
                this.field433[var5] = 32;
            }
            this.field434 = arg1;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(ZI)I", line = 217)
    public final int method209(boolean arg0, int arg1) {
        if (!arg0) {
            method221(null, (byte) 111, 38, 114);
        }
        return this.field433[arg1] & 0xFF;
    }

    @OriginalMember(owner = "mapview!t", name = "c", descriptor = "(B)Lt;", line = 230)
    public final class35 method210(byte arg0) {
        if (!this.field436) {
            throw new IllegalArgumentException();
        } else if (arg0 == 116) {
            this.field437 = 0;
            if (this.field433.length != this.field434) {
                byte[] var2 = new byte[this.field434];
                class14.method90(this.field433, 0, var2, 0, this.field434);
                this.field433 = var2;
            }
            return this;
        } else {
            return (class35) null;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(II)Lt;", line = 261)
    public final class35 method211(int arg0, int arg1) {
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        } else if (this.field436) {
            this.field437 = 0;
            if (this.field433.length == this.field434) {
                int var3;
                for (var3 = 1; var3 <= this.field434; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class14.method90(this.field433, 0, var4, 0, this.field434);
                this.field433 = var4;
            }
            if (arg1 < 82) {
                return (class35) null;
            } else {
                this.field433[this.field434++] = (byte) arg0;
                return this;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Ljava/applet/Applet;B)Lt;", line = 299)
    public final class35 method212(Applet arg0, byte arg1) {
        int var3 = 118 % ((-arg1 - 72) / 45);
        String var4 = new String(this.field433, 0, this.field434);
        String var5 = arg0.getParameter(var4);
        return var5 == null ? null : class11.method80(var5, (byte) -19);
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(BILjava/awt/Graphics;I)V", line = 317)
    public final void method213(byte arg0, int arg1, Graphics arg2, int arg3) {
        String var5;
        try {
            var5 = new String(this.field433, 0, this.field434, "ISO-8859-1");
            if (arg0 <= 77) {
                field440 = -83;
            }
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field433, 0, this.field434);
        }
        arg2.drawString(var5, arg1, arg3);
    }

    @OriginalMember(owner = "mapview!t", name = "d", descriptor = "(B)Lt;", line = 342)
    public final class35 method214(byte arg0) {
        long var2 = this.method215(-21979);
        synchronized (field441 == null ? (field441 = method227("t")) : field441) {
            if (class33.field415 == null) {
                class33.field415 = new class32(4096);
            } else {
                for (class34 var5 = (class34) class33.field415.method183(4406, var2); var5 != null; var5 = (class34) class33.field415.method186(-23026)) {
                    if (this.method207(var5.field424, 120)) {
                        return var5.field424;
                    }
                }
            }
            class34 var6 = new class34();
            if (arg0 < 110) {
                return (class35) null;
            } else {
                this.field436 = false;
                var6.field424 = this;
                class33.field415.method188(var2, (byte) 32, var6);
                return this;
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 343)
    public static Class method227(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(I)J", line = 380)
    private final long method215(int arg0) {
        long var2 = 0L;
        if (arg0 != -21979) {
            field435 = -51;
        }
        for (int var4 = 0; var4 < this.field434; var4++) {
            var2 = (var2 << 5) + (long) (this.field433[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(IZI)Lt;", line = 402)
    public final class35 method216(int arg0, boolean arg1, int arg2) {
        class35 var4 = new class35();
        if (!arg1) {
            method206((byte) -3);
        }
        var4.field434 = arg0 - arg2;
        var4.field433 = new byte[arg0 - arg2];
        class14.method90(this.field433, arg2, var4.field433, 0, var4.field434);
        return var4;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(BLt;)I", line = 420)
    public final int method217(byte arg0, class35 arg1) {
        if (arg0 >= -103) {
            this.method213((byte) -1, -69, null, -110);
        }
        int var3;
        if (arg1.field434 >= this.field434) {
            var3 = this.field434;
        } else {
            var3 = arg1.field434;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1.field433[var4] > this.field433[var4]) {
                return -1;
            }
            if (arg1.field433[var4] < this.field433[var4]) {
                return 1;
            }
        }
        if (arg1.field434 > this.field434) {
            return -1;
        } else if (this.field434 <= arg1.field434) {
            return 0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Ljava/awt/FontMetrics;B)I", line = 459)
    public final int method218(FontMetrics arg0, byte arg1) {
        String var3;
        try {
            var3 = new String(this.field433, 0, this.field434, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field433, 0, this.field434);
        }
        if (arg1 < 75) {
            this.field436 = true;
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "mapview!t", name = "e", descriptor = "(B)I", line = 475)
    public final int method219(byte arg0) {
        if (arg0 != -33) {
            this.method205((byte) -77, 62, 1);
        }
        return this.method226((byte) 29, 10);
    }

    @OriginalMember(owner = "mapview!t", name = "f", descriptor = "(B)I", line = 492)
    public final int method220(byte arg0) {
        return arg0 >= -61 ? 46 : this.field434;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "([BBII)Lt;", line = 535)
    public static final class35 method221(byte[] arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -101) {
            method221(null, (byte) 6, 27, 7);
        }
        class35 var4 = new class35();
        var4.field434 = 0;
        var4.field433 = new byte[arg3];
        for (int var5 = arg2; var5 < arg2 + arg3; var5++) {
            if (arg0[var5] != 0) {
                var4.field433[var4.field434++] = arg0[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(II)Lt;", line = 576)
    public final class35 method222(int arg0, int arg1) {
        if (arg1 != 12) {
            this.field436 = true;
        }
        return this.method216(this.field434, true, arg0);
    }

    @OriginalMember(owner = "mapview!t", name = "toString", descriptor = "()Ljava/lang/String;", line = 595)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(III)I", line = 610)
    private final int method223(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg0;
        for (int var5 = arg2; var5 < this.field434; var5++) {
            if (this.field433[var5] == var4) {
                return var5;
            }
        }
        int var6 = -1 / ((arg1 - 65) / 50);
        return -1;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(IB)I", line = 633)
    public final int method224(int arg0, byte arg1) {
        return arg1 == 59 ? this.method223(arg0, 115, 0) : 46;
    }

    @OriginalMember(owner = "mapview!t", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 646)
    public final boolean equals(Object arg0) {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(I)I", line = 656)
    public final int method225(int arg0) {
        int var2 = 0;
        if (arg0 == 1) {
            for (int var3 = 0; var3 < this.field434; var3++) {
                var2 = (this.field433[var3] & 0xFF) + (var2 << 5) - var2;
            }
            return var2;
        } else {
            return -34;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "hashCode", descriptor = "()I", line = 709)
    public final int hashCode() {
        return this.method225(1);
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(BI)I", line = 740)
    private final int method226(byte arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        int var5 = 0;
        if (arg0 != 29) {
            return -7;
        }
        for (int var6 = 0; var6 < this.field434; var6++) {
            int var7 = this.field433[var6] & 0xFF;
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
            if (var7 >= arg1) {
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
}
