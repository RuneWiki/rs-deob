import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class10 implements class69 {

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "Z")
    private boolean field130 = true;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "Z")
    public static volatile boolean field125 = false;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "Lai;")
    public static class10 field136 = class44.method278("", 107);

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "Lai;")
    public static class10 field149 = class44.method278("mapback", 112);

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "Lai;")
    public static class10 field123 = field136;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "Lai;")
    public static class10 field152 = field136;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "Lai;")
    public static class10 field119 = class44.method278("", 110);

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "Lai;")
    public static class10 field131 = field119;

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "Lai;")
    public static class10 field162 = field136;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "Lai;")
    public static class10 field129 = field136;

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "Lai;")
    public static class10 field139 = field136;

    @OriginalMember(owner = "client!ai", name = "eb", descriptor = "Lai;")
    public static class10 field170 = field136;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public int field118;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!ai", name = "C", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!ai", name = "G", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "I")
    private int field156;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!ai", name = "ab", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!ai", name = "bb", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!ai", name = "cb", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!ai", name = "db", descriptor = "I")
    public static int field169;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ai", name = "fb", descriptor = "Ljava/lang/Class;")
    public static Class field171;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "[B")
    public byte[] field160;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLjava/awt/FontMetrics;)I")
    public final int method34(byte arg0, FontMetrics arg1) {
        field133++;
        int var3 = 73 / ((-arg0 - 56) / 62);
        String var4;
        try {
            var4 = new String(this.field160, 0, this.field118, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var4 = new String(this.field160, 0, this.field118);
        }
        return arg1.stringWidth(var4);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)I")
    public final int method35(int arg0) {
        int var2 = 0;
        int var3 = -104 / ((arg0 + 14) / 52);
        field135++;
        for (int var4 = 0; var4 < this.field118; var4++) {
            var2 = (var2 << 5) + (this.field160[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLai;)Z")
    public final boolean method36(byte arg0, class10 arg1) {
        field153++;
        if (this.field118 < arg1.field118) {
            return false;
        }
        int var3 = 0;
        if (arg0 != 69) {
            this.method51(-104, -48, 69);
        }
        while (var3 < arg1.field118) {
            if (this.field160[var3] != arg1.field160[var3]) {
                return false;
            }
            var3++;
        }
        return true;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)Z")
    private final boolean method37(int arg0, int arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        field163++;
        if (arg1 != 65) {
            field162 = null;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field118; var6++) {
            int var7 = this.field160[var6] & 0xFF;
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
                return false;
            }
            if (arg0 <= var7) {
                return false;
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if (var8 / arg0 != var5) {
                return false;
            }
            var4 = true;
            var5 = var8;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI)Lai;")
    public final class10 method38(byte arg0, int arg1) {
        field137++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        } else if (arg0 <= 32) {
            return null;
        } else {
            class10 var3 = new class10();
            var3.field160 = new byte[this.field118 + 1];
            var3.field118 = this.field118 + 1;
            class12.method81(this.field160, 0, var3.field160, 0, this.field118);
            var3.field160[this.field118] = (byte) arg1;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)Lai;")
    public final class10 method39(int arg0) {
        field150++;
        boolean var2 = true;
        class10 var3 = new class10();
        var3.field118 = this.field118;
        var3.field160 = new byte[this.field118];
        int var4 = 0;
        if (arg0 > -89) {
            return null;
        }
        while (var4 < this.field118) {
            byte var5 = this.field160[var4];
            if (var5 == 95) {
                var2 = true;
                var3.field160[var4] = 32;
            } else if (var5 >= 97 && var5 <= 122 && var2) {
                var3.field160[var4] = (byte) (var5 - 32);
                var2 = false;
            } else {
                var3.field160[var4] = var5;
                var2 = false;
            }
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)I")
    public final int method40(byte arg0) {
        int var2 = 4 % ((42 - arg0) / 37);
        field155++;
        return this.field118;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(BLai;)I")
    public final int method41(byte arg0, class10 arg1) {
        field144++;
        int var3;
        if (arg1.field118 >= this.field118) {
            var3 = this.field118;
        } else {
            var3 = arg1.field118;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (class158.field3049[arg1.field160[var4] & 0xFF] > class158.field3049[this.field160[var4] & 0xFF]) {
                return -1;
            }
            if (class158.field3049[this.field160[var4] & 0xFF] > class158.field3049[arg1.field160[var4] & 0xFF]) {
                return 1;
            }
        }
        if (arg0 <= 31) {
            this.method65((byte) -123);
        }
        if (arg1.field118 > this.field118) {
            return -1;
        } else if (this.field118 > arg1.field118) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ai", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field146++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!ai", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field148++;
        if (!(arg0 instanceof class10)) {
            throw new IllegalArgumentException();
        }
        return this.method64(109, (class10) arg0);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III[BI)I")
    public final int method42(int arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        field166++;
        class12.method81(this.field160, arg4, arg3, arg1, arg0 - arg4);
        return arg2 == 18738 ? arg0 - arg4 : 30;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)Lai;")
    public final class10 method43(boolean arg0) {
        field121++;
        byte var2 = 2;
        class10 var3 = new class10();
        var3.field118 = this.field118;
        var3.field160 = new byte[this.field118];
        for (int var4 = 0; var4 < this.field118; var4++) {
            byte var5 = this.field160[var4];
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
            var3.field160[var4] = var5;
        }
        if (arg0) {
            this.method44(-102, -52, (byte) -62);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIB)Lai;")
    public final class10 method44(int arg0, int arg1, byte arg2) {
        field168++;
        class10 var4 = new class10();
        var4.field160 = new byte[arg0 - arg1];
        int var5 = -27 % ((26 - arg2) / 34);
        var4.field118 = arg0 - arg1;
        class12.method81(this.field160, arg1, var4.field160, 0, var4.field118);
        return var4;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)[B")
    public final byte[] method45(byte arg0) {
        byte[] var2 = new byte[this.field118];
        class12.method81(this.field160, 0, var2, 0, this.field118);
        if (arg0 < 68) {
            field119 = null;
        }
        field138++;
        return var2;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V")
    public static final void method46(int arg0) {
        if (!class180.field3415) {
            class75.field1308[0] = 1005;
            class53.field946 = 1;
            class116.field2235[0] = class76.field1325;
            class148.field2845[0] = field119;
        }
        field127++;
        if (class27.field402 != -1) {
            class94.method616(class27.field402, 10);
        }
        for (int var1 = 0; var1 < class11.field175; var1++) {
            if (class98.field1810[var1]) {
                class152.field2919[var1] = true;
            }
            class42.field702[var1] = class98.field1810[var1];
            class98.field1810[var1] = false;
        }
        class207.field4039 = null;
        class119.field2289 = class120.field2304;
        class75.field1292 = -1;
        class151.field2895 = -1;
        int var2 = -48 % ((arg0 + 50) / 53);
        if (class27.field402 != -1) {
            class11.field175 = 0;
            class154.method1045(class27.field402, 0, 503, 0, 0, (byte) 51, -1, 0, 765);
        }
        class62.method411();
        class78.method485(true);
        if (class180.field3415) {
            class129.method901(false);
        } else if (class151.field2895 != -1) {
            class9.method32(class75.field1292, class151.field2895, (byte) -51);
        }
        if (class93.field1682 == 3) {
            for (int var3 = 0; var3 < class11.field175; var3++) {
                if (class42.field702[var3]) {
                    class62.method406(class67.field1176[var3], class33.field499[var3], class70.field1201[var3], class4.field32[var3], 16711935, 128);
                } else if (class152.field2919[var3]) {
                    class62.method406(class67.field1176[var3], class33.field499[var3], class70.field1201[var3], class4.field32[var3], 16711680, 128);
                }
            }
        }
        class186.method1199(class145.field2767.field1097, class145.field2767.field1100, class42.field687, class145.field2769, (byte) 60);
        class145.field2769 = 0;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lai;Z)I")
    public final int method47(class10 arg0, boolean arg1) {
        field132++;
        int var3;
        if (arg0.field118 >= this.field118) {
            var3 = this.field118;
        } else {
            var3 = arg0.field118;
        }
        if (arg1) {
            return -82;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((this.field160[var4] & 0xFF) < (arg0.field160[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field160[var4] & 0xFF) > (arg0.field160[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg0.field118 > this.field118) {
            return -1;
        } else if (this.field118 > arg0.field118) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ai", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field145++;
        return this.method35(-70);
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)Lai;")
    public final class10 method48(int arg0) {
        field165++;
        class10 var2 = new class10();
        var2.field118 = this.field118;
        var2.field160 = new byte[this.field118];
        if (arg0 != -34) {
            return null;
        }
        for (int var3 = 0; var3 < this.field118; var3++) {
            byte var4 = this.field160[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field160[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(Z)Z")
    public final boolean method49(boolean arg0) {
        if (arg0) {
            this.field156 = -9;
        }
        field124++;
        return this.method37(10, 65);
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(BLai;)Lai;")
    public final class10 method50(byte arg0, class10 arg1) {
        field141++;
        if (!this.field130) {
            throw new IllegalArgumentException();
        }
        this.field156 = 0;
        if (arg0 != 115) {
            this.method67(-126, (byte) 5, null);
        }
        if (this.field160.length < this.field118 + arg1.field118) {
            int var3;
            for (var3 = 1; var3 < this.field118 + arg1.field118; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class12.method81(this.field160, 0, var4, 0, this.field118);
            this.field160 = var4;
        }
        class12.method81(arg1.field160, 0, this.field160, this.field118, arg1.field118);
        this.field118 += arg1.field118;
        return this;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)I")
    public final int method51(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            return 0;
        }
        byte var4 = (byte) arg1;
        field143++;
        for (int var5 = arg2; var5 < this.field118; var5++) {
            if (this.field160[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(BI)Lai;")
    public final class10 method52(byte arg0, int arg1) {
        if (arg0 != -118) {
            this.method60((byte) 126);
        }
        field169++;
        return this.method44(this.field118, arg1, (byte) -68);
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(BLai;)I")
    public final int method53(byte arg0, class10 arg1) {
        field128++;
        int var3 = -3 / ((arg0 + 60) / 61);
        return this.method67(0, (byte) 116, arg1);
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(Z)Lai;")
    public final class10 method54(boolean arg0) {
        if (!arg0) {
            field152 = null;
        }
        class10 var2 = new class10();
        var2.field118 = 0;
        var2.field160 = new byte[12];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field118; var4++) {
            if (this.field160[var4] >= 65 && this.field160[var4] <= 90) {
                var2.field160[var3++] = (byte) (this.field160[var4] + 32);
                var2.field118 = var3;
            } else if (this.field160[var4] >= 97 && this.field160[var4] <= 122 || this.field160[var4] >= 48 && this.field160[var4] <= 57) {
                var2.field160[var3++] = this.field160[var4];
                var2.field118 = var3;
            } else if (var3 > 0) {
                var2.field160[var3++] = 95;
            }
            if (var3 == 12) {
                break;
            }
        }
        field151++;
        return var2;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(B)I")
    public final int method55(byte arg0) {
        if (arg0 >= -65) {
            this.method59((byte) 79);
        }
        field147++;
        return this.method66(55, 10);
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)Lai;")
    public final class10 method56(int arg0, int arg1) {
        field120++;
        if (arg1 <= ~arg0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field130) {
            this.field156 = 0;
            if (this.field160.length == this.field118) {
                int var3;
                for (var3 = 1; var3 <= this.field118; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class12.method81(this.field160, 0, var4, 0, this.field118);
                this.field160 = var4;
            }
            this.field160[this.field118++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(BLai;)Z")
    public final boolean method57(byte arg0, class10 arg1) {
        field167++;
        if (arg1.field118 > this.field118) {
            return false;
        }
        int var3 = this.field118 - arg1.field118;
        if (arg0 < 83) {
            return false;
        }
        for (int var4 = 0; var4 < arg1.field118; var4++) {
            if (this.field160[var3 + var4] != arg1.field160[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method58(int arg0, int arg1, Graphics arg2, int arg3) {
        field117++;
        int var5 = 7 / ((57 - arg3) / 33);
        String var6;
        try {
            var6 = new String(this.field160, 0, this.field118, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var6 = new String(this.field160, 0, this.field118);
        }
        arg2.drawString(var6, arg1, arg0);
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(B)Lai;")
    public final class10 method59(byte arg0) {
        field122++;
        class10 var2 = new class10();
        var2.field118 = this.field118;
        var2.field160 = new byte[this.field118];
        if (arg0 >= -51) {
            field129 = null;
        }
        for (int var3 = 0; var3 < this.field118; var3++) {
            var2.field160[var3] = 42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(B)Lai;")
    public final class10 method60(byte arg0) {
        field159++;
        if (!this.field130) {
            throw new IllegalArgumentException();
        }
        this.field156 = 0;
        if (this.field160.length != this.field118) {
            byte[] var2 = new byte[this.field118];
            class12.method81(this.field160, 0, var2, 0, this.field118);
            this.field160 = var2;
        }
        if (arg0 != -59) {
            field119 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(II)I")
    public final int method61(int arg0, int arg1) {
        if (arg1 != -1) {
            this.field118 = -82;
        }
        field164++;
        return this.field160[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "(B)J")
    public final long method62(byte arg0) {
        field134++;
        long var2 = 0L;
        if (arg0 >= -64) {
            this.method61(-15, -60);
        }
        for (int var4 = 0; var4 < this.field118 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field160[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 + 1 - 65;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 + 1 - 97;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 - 21;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "(B)Ljava/net/URL;")
    public final URL method63(byte arg0) throws MalformedURLException {
        field158++;
        return arg0 == 97 ? new URL(new String(this.field160, 0, this.field118)) : null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILai;)Z")
    public final boolean method64(int arg0, class10 arg1) {
        field140++;
        if (arg1 == null) {
            return false;
        } else if (this.field118 == arg1.field118) {
            if (!this.field130 || !arg1.field130) {
                if (this.field156 == 0) {
                    this.field156 = this.method35(-98);
                    if (this.field156 == 0) {
                        this.field156 = 1;
                    }
                }
                if (arg1.field156 == 0) {
                    arg1.field156 = arg1.method35(58);
                    if (arg1.field156 == 0) {
                        arg1.field156 = 1;
                    }
                }
                if (this.field156 != arg1.field156) {
                    return false;
                }
            }
            int var3 = 0;
            int var4 = -128 / (arg0 / 49);
            while (var3 < this.field118) {
                if (this.field160[var3] != arg1.field160[var3]) {
                    return false;
                }
                var3++;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "(B)J")
    private final long method65(byte arg0) {
        field126++;
        int var2 = 73 % ((-arg0 - 29) / 37);
        long var3 = 0L;
        for (int var5 = 0; var5 < this.field118; var5++) {
            var3 = (var3 << 5) + (long) (this.field160[var5] & 0xFF) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(II)I")
    public final int method66(int arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        field161++;
        boolean var3 = false;
        if (arg0 != 55) {
            this.method64(90, null);
        }
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field118; var6++) {
            int var7 = this.field160[var6] & 0xFF;
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

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IBLai;)I")
    public final int method67(int arg0, byte arg1, class10 arg2) {
        field142++;
        int[] var4 = new int[arg2.field118];
        int[] var5 = new int[arg2.field118];
        int[] var6 = new int[256];
        if (arg1 != 116) {
            field149 = null;
        }
        for (int var7 = 0; var7 < var6.length; var7++) {
            var6[var7] = arg2.field118;
        }
        for (int var8 = 1; var8 <= arg2.field118; var8++) {
            var4[var8 - 1] = (arg2.field118 << 1) - var8;
            var6[class123.method861(arg2.field160[var8 - 1], 255)] = arg2.field118 - var8;
        }
        int var9 = arg2.field118 + 1;
        int var10 = arg2.field118;
        while (var10 > 0) {
            var5[var10 - 1] = var9;
            while (arg2.field118 >= var9 && arg2.field160[var10 - 1] != arg2.field160[var9 - 1]) {
                if (var4[var9 - 1] >= arg2.field118 - var10) {
                    var4[var9 - 1] = arg2.field118 - var10;
                }
                var9 = var5[var9 - 1];
            }
            var10--;
            var9--;
        }
        int var11 = var9;
        int var12 = arg2.field118 + 1 - var9;
        int var13 = 1;
        int var14 = 0;
        for (int var15 = 1; var15 <= var12; var15++) {
            var5[var15 - 1] = var14;
            while (var14 >= 1 && arg2.field160[var14 - 1] != arg2.field160[var15 - 1]) {
                var14 = var5[var14 - 1];
            }
            var14++;
        }
        while (var11 < arg2.field118) {
            for (int var18 = var13; var18 <= var11; var18++) {
                if (var4[var18 - 1] >= arg2.field118 + var11 - var18) {
                    var4[var18 - 1] = arg2.field118 + var11 - var18;
                }
            }
            var13 = var11 + 1;
            var11 = var11 + var12 - var5[var12 + -1];
            var12 = var5[var12 - 1];
        }
        int var17;
        for (int var16 = arg0 + arg2.field118 - 1; var16 < this.field118; var16 += Math.max(var6[this.field160[var16] & 0xFF], var4[var17])) {
            for (var17 = arg2.field118 - 1; var17 >= 0 && this.field160[var16] == arg2.field160[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(I)Lai;")
    public final class10 method68(int arg0) {
        field154++;
        if (arg0 != -49) {
            this.field130 = true;
        }
        int var2;
        for (var2 = 0; var2 < this.field118 && (this.field160[var2] >= 0 && this.field160[var2] <= 32 || (this.field160[var2] & 0xFF) == 160); var2++) {
        }
        int var3;
        for (var3 = this.field118; var3 > var2 && (this.field160[var3 - 1] >= 0 && this.field160[var3 - 1] <= 32 || (this.field160[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (var2 == 0 && this.field118 == var3) {
            return this;
        }
        class10 var4 = new class10();
        var4.field118 = var3 - var2;
        var4.field160 = new byte[var4.field118];
        for (int var5 = 0; var5 < var4.field118; var5++) {
            var4.field160[var5] = this.field160[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "(I)Lai;")
    public final class10 method69(int arg0) {
        long var2 = this.method65((byte) -90);
        field115++;
        synchronized (field171 == null ? (field171 = method72("ai")) : field171) {
            if (class116.field2227 == null) {
                class116.field2227 = new class32(4096);
            } else {
                for (class191 var5 = (class191) class116.field2227.method213(-116, var2); var5 != null; var5 = (class191) class116.field2227.method208(arg0)) {
                    if (this.method64(arg0 ^ 0xFFFFFFCC, var5.field3629)) {
                        return var5.field3629;
                    }
                }
            }
            if (arg0 != 0) {
                return null;
            }
            class191 var8 = new class191();
            this.field130 = false;
            var8.field3629 = this;
            class116.field2227.method214(var8, (byte) 115, var2);
            return this;
        }
    }

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "(BLai;)Z")
    public final boolean method70(byte arg0, class10 arg1) {
        field116++;
        if (arg1 == null) {
            return false;
        } else if (this.field118 == arg1.field118) {
            if (arg0 <= 86) {
                field123 = null;
            }
            for (int var3 = 0; var3 < this.field118; var3++) {
                byte var4 = this.field160[var3];
                byte var5 = arg1.field160[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "(B)V")
    public static void method71(byte arg0) {
        field131 = null;
        field170 = null;
        field152 = null;
        field149 = null;
        field119 = null;
        if (arg0 != -81) {
            method71((byte) -119);
        }
        field123 = null;
        field139 = null;
        field136 = null;
        field162 = null;
        field129 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method72(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
