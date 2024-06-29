import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!a")
public class class1 implements class12 {

    @OriginalMember(owner = "mapview!a", name = "d", descriptor = "Z")
    private boolean field4 = true;

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "La;")
    public static class1 field1 = class3.method36("75(U", -106);

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "La;")
    public static class1 field2 = class3.method36("labels)3dat", -100);

    @OriginalMember(owner = "mapview!a", name = "h", descriptor = "La;")
    public static class1 field8 = class3.method36("Jewellery", -115);

    @OriginalMember(owner = "mapview!a", name = "i", descriptor = "La;")
    public static class1 field9 = class3.method36("Platebody Shop", -109);

    @OriginalMember(owner = "mapview!a", name = "j", descriptor = "La;")
    public static class1 field10 = class3.method36("Axe Shop", -96);

    @OriginalMember(owner = "mapview!a", name = "k", descriptor = "I")
    private int field11;

    @OriginalMember(owner = "mapview!a", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "mapview!a", name = "f", descriptor = "I")
    public int field6;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!a", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field12;

    @OriginalMember(owner = "mapview!a", name = "g", descriptor = "Ljava/lang/String;")
    public static String field7;

    @OriginalMember(owner = "mapview!a", name = "e", descriptor = "[B")
    public byte[] field5;

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(II)I", line = 27)
    public final int method1(int arg0, int arg1) {
        if (arg0 != -3) {
            field9 = null;
        }
        return this.field5[arg1] & 0xFF;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 38)
    public static final void method2(Component arg0, byte arg1) {
        arg0.removeMouseListener(class13.field116);
        arg0.removeMouseMotionListener(class13.field116);
        if (arg1 != 92) {
            field8 = null;
        }
        arg0.removeFocusListener(class13.field116);
        class41.field521 = 0;
    }

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "(II)La;", line = 66)
    public final class1 method3(int arg0, int arg1) {
        if (arg1 != -41) {
            field10 = null;
        }
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field4) {
            this.field11 = 0;
            if (this.field5.length == this.field6) {
                int var3;
                for (var3 = 1; var3 <= this.field6; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class18.method90(this.field5, 0, var4, 0, this.field6);
                this.field5 = var4;
            }
            this.field5[this.field6++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Ljava/awt/FontMetrics;B)I", line = 119)
    public final int method4(FontMetrics arg0, byte arg1) {
        String var4;
        try {
            int var3 = -89 / ((arg1 - 25) / 46);
            var4 = new String(this.field5, 0, this.field6, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var4 = new String(this.field5, 0, this.field6);
        }
        return arg0.stringWidth(var4);
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(I)La;", line = 146)
    public final class1 method5(int arg0) {
        long var2 = this.method10((byte) -105);
        synchronized (field12 == null ? (field12 = method29("a")) : field12) {
            if (class4.field41 == null) {
                class4.field41 = new class21(4096);
            } else {
                for (class35 var5 = (class35) class4.field41.method110((byte) 71, var2); var5 != null; var5 = (class35) class4.field41.method113(-15859)) {
                    if (this.method15(var5.field478, (byte) -36)) {
                        return var5.field478;
                    }
                }
            }
            class35 var6 = new class35();
            var6.field478 = this;
            if (arg0 < 34) {
                return (class1) null;
            } else {
                this.field4 = false;
                class4.field41.method114(var2, (byte) 118, var6);
                return this;
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 147)
    public static Class method29(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Z)I", line = 195)
    public final int method6(boolean arg0) {
        int var2 = 0;
        if (arg0) {
            field7 = null;
        }
        for (int var3 = 0; var3 < this.field6; var3++) {
            var2 = (this.field5[var3] & 0xFF) + (var2 << 5) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(La;B)Z", line = 215)
    public final boolean method7(class1 arg0, byte arg1) {
        if (this.field6 < arg0.field6) {
            return false;
        }
        if (arg1 != 38) {
            this.field5 = null;
        }
        for (int var3 = 0; var3 < arg0.field6; var3++) {
            if (this.field5[var3] != arg0.field5[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(B)I", line = 243)
    public final int method8(byte arg0) {
        if (arg0 != -101) {
            this.method5(-108);
        }
        return this.method17(10, false);
    }

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "(I)I", line = 264)
    public final int method9(int arg0) {
        if (arg0 != 255) {
            this.method28(-83, -63);
        }
        return this.field6;
    }

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "(B)J", line = 279)
    private final long method10(byte arg0) {
        long var2 = 0L;
        if (arg0 >= -87) {
            this.method4(null, (byte) -64);
        }
        for (int var4 = 0; var4 < this.field6; var4++) {
            var2 = (var2 << 5) + (long) (this.field5[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(JB)V", line = 304)
    public static final void method11(long arg0, byte arg1) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class23.method138((byte) 105, arg0 - 1L);
            class23.method138((byte) 122, 1L);
        } else {
            class23.method138((byte) 93, arg0);
        }
        if (arg1 != -61) {
            field10 = null;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(BI)La;", line = 347)
    public final class1 method12(byte arg0, int arg1) {
        if (arg0 != 93) {
            field2 = null;
        }
        return this.method23(true, arg1, this.field6);
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(B[B)[B", line = 375)
    public static final byte[] method13(byte arg0, byte[] arg1) {
        if (arg0 != -24) {
            return (byte[]) null;
        }
        class39 var2 = new class39(arg1);
        int var3 = var2.method245(-107);
        int var4 = var2.method250(26078);
        if (var4 < 0 || class24.field231 != 0 && var4 > class24.field231) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method248(var4, var5, 0, (byte) 102);
            return var5;
        } else {
            int var6 = var2.method250(arg0 ^ 0xFFFF9A36);
            if (var6 < 0 || class24.field231 != 0 && class24.field231 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class16.method80(var7, var6, arg1, var4, 9);
            } else {
                class21.field197.method222((byte) -107, var7, var2);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "c", descriptor = "(B)La;", line = 435)
    public final class1 method14(byte arg0) {
        class1 var2 = new class1();
        var2.field6 = this.field6;
        var2.field5 = new byte[this.field6];
        for (int var3 = 0; var3 < this.field6; var3++) {
            byte var4 = this.field5[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field5[var3] = var4;
        }
        if (arg0 == -60) {
            return var2;
        } else {
            return (class1) null;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "(La;B)Z", line = 463)
    public final boolean method15(class1 arg0, byte arg1) {
        if (arg0 == null) {
            return false;
        } else if (this.field6 == arg0.field6) {
            if (arg1 != -36) {
                this.method9(-64);
            }
            if (!this.field4 || !arg0.field4) {
                if (this.field11 == 0) {
                    this.field11 = this.method6(false);
                    if (this.field11 == 0) {
                        this.field11 = 1;
                    }
                }
                if (arg0.field11 == 0) {
                    arg0.field11 = arg0.method6(false);
                    if (arg0.field11 == 0) {
                        arg0.field11 = 1;
                    }
                }
                if (this.field11 != arg0.field11) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field6; var3++) {
                if (this.field5[var3] != arg0.field5[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(IZI)I", line = 516)
    private final int method16(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field2 = null;
        }
        byte var4 = (byte) arg0;
        for (int var5 = arg2; var5 < this.field6; var5++) {
            if (this.field5[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(IZ)I", line = 541)
    public final int method17(int arg0, boolean arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        boolean var4 = arg1;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field6; var6++) {
            int var7 = this.field5[var6] & 0xFF;
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
            var4 = true;
            var5 = var8;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!a", name = "c", descriptor = "(I)V", line = 637)
    public static void method18(int arg0) {
        field10 = null;
        field2 = null;
        field1 = null;
        field7 = null;
        field8 = null;
        if (arg0 != 18329) {
            method20((byte) 4);
        }
        field9 = null;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(ZI)I", line = 656)
    public final int method19(boolean arg0, int arg1) {
        if (arg0) {
            this.field4 = false;
        }
        return this.method16(arg1, false, 0);
    }

    @OriginalMember(owner = "mapview!a", name = "hashCode", descriptor = "()I", line = 667)
    public final int hashCode() {
        return this.method6(false);
    }

    @OriginalMember(owner = "mapview!a", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 674)
    public final boolean equals(Object arg0) {
        if (!(arg0 instanceof class1)) {
            throw new IllegalArgumentException();
        }
        return this.method15((class1) arg0, (byte) -36);
    }

    @OriginalMember(owner = "mapview!a", name = "d", descriptor = "(B)B", line = 691)
    public static final byte method20(byte arg0) {
        if (arg0 != 116) {
            method11(-105L, (byte) -93);
        }
        return class39.field494 == null ? 0 : class39.field494[class5.field47];
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(BII)La;", line = 722)
    public final class1 method21(byte arg0, int arg1, int arg2) {
        byte var4 = (byte) arg1;
        int var5 = 77 / ((arg0 + 59) / 39);
        class1 var6 = new class1();
        byte var7 = (byte) arg2;
        var6.field6 = this.field6;
        var6.field5 = new byte[this.field6];
        for (int var8 = 0; var8 < this.field6; var8++) {
            byte var9 = this.field5[var8];
            if (var4 == var9) {
                var6.field5[var8] = var7;
            } else {
                var6.field5[var8] = var9;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "mapview!a", name = "d", descriptor = "(I)La;", line = 761)
    public final class1 method22(int arg0) {
        int var2 = -22 / ((10 - arg0) / 45);
        if (!this.field4) {
            throw new IllegalArgumentException();
        }
        this.field11 = 0;
        if (this.field5.length != this.field6) {
            byte[] var3 = new byte[this.field6];
            class18.method90(this.field5, 0, var3, 0, this.field6);
            this.field5 = var3;
        }
        return this;
    }

    @OriginalMember(owner = "mapview!a", name = "toString", descriptor = "()Ljava/lang/String;", line = 787)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(ZII)La;", line = 802)
    public final class1 method23(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            return (class1) null;
        }
        class1 var4 = new class1();
        var4.field5 = new byte[arg2 - arg1];
        var4.field6 = arg2 - arg1;
        class18.method90(this.field5, arg1, var4.field5, 0, var4.field6);
        return var4;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(III[La;)La;", line = 818)
    public static final class1 method24(int arg0, int arg1, int arg2, class1[] arg3) {
        int var4 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg3[arg0 + var5] == null) {
                arg3[arg0 + var5] = class14.field130;
            }
            var4 += arg3[arg0 + var5].field6;
        }
        byte[] var6 = new byte[var4];
        if (arg2 > -46) {
            field2 = null;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg1; var8++) {
            class1 var9 = arg3[arg0 + var8];
            class18.method90(var9.field5, 0, var6, var7, var9.field6);
            var7 += var9.field6;
        }
        class1 var10 = new class1();
        var10.field5 = var6;
        var10.field6 = var4;
        return var10;
    }

    @OriginalMember(owner = "mapview!a", name = "e", descriptor = "(I)V", line = 862)
    public final void method25(int arg0) {
        if (arg0 >= -31) {
            method20((byte) -47);
        }
        String var2;
        try {
            var2 = new String(this.field5, 0, this.field6, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field5, 0, this.field6);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V", line = 882)
    public final void method26(Graphics arg0, byte arg1, int arg2, int arg3) {
        String var5;
        try {
            var5 = new String(this.field5, 0, this.field6, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field5, 0, this.field6);
        }
        if (arg1 != 36) {
            this.method6(true);
        }
        arg0.drawString(var5, arg3, arg2);
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(ZLa;)I", line = 903)
    public final int method27(boolean arg0, class1 arg1) {
        int var3;
        if (this.field6 > arg1.field6) {
            var3 = arg1.field6;
        } else {
            var3 = this.field6;
        }
        int var4 = 0;
        if (!arg0) {
            return 51;
        }
        while (var3 > var4) {
            if ((arg1.field5[var4] & 0xFF) > (this.field5[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field5[var4] & 0xFF) > (arg1.field5[var4] & 0xFF)) {
                return 1;
            }
            var4++;
        }
        if (arg1.field6 > this.field6) {
            return -1;
        } else if (arg1.field6 >= this.field6) {
            return 0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "c", descriptor = "(II)V", line = 941)
    public final void method28(int arg0, int arg1) {
        this.field11 = 0;
        if (!this.field4) {
            throw new IllegalArgumentException();
        } else if (arg1 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg1 > this.field5.length) {
                int var3;
                for (var3 = 1; var3 < arg1; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class18.method90(this.field5, 0, var4, 0, this.field6);
                this.field5 = var4;
            }
            for (int var5 = this.field6; var5 < arg1; var5++) {
                this.field5[var5] = 32;
            }
            if (arg0 == 38) {
                this.field6 = arg1;
            }
        }
    }
}
