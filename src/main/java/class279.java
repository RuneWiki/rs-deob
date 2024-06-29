import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class279 implements class263 {

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "Z")
    private boolean field4941 = true;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
    public static int field4943 = -2;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "[I")
    public static int[] field4926 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "Lud;")
    public static class279 field4963 = class130.method1024("::breakcon", 255);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!ud", name = "S", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!ud", name = "T", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!ud", name = "U", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!ud", name = "V", descriptor = "I")
    public int field4967;

    @OriginalMember(owner = "client!ud", name = "W", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!ud", name = "X", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!ud", name = "Y", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!ud", name = "Z", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!ud", name = "ab", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!ud", name = "bb", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!ud", name = "cb", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!ud", name = "db", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!ud", name = "eb", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!ud", name = "fb", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!ud", name = "gb", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!ud", name = "hb", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!ud", name = "ib", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!ud", name = "jb", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!ud", name = "kb", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!ud", name = "lb", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!ud", name = "mb", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!ud", name = "nb", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!ud", name = "ob", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "[B")
    public byte[] field4935;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "[Lbn;")
    public static class66[] field4929;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[BIIB)I", line = 10)
    public final int method1966(int arg0, byte[] arg1, int arg2, int arg3, byte arg4) {
        field4936++;
        if (arg4 == 8) {
            class25.method219(this.field4935, arg2, arg1, arg0, arg3 - arg2);
            return arg3 - arg2;
        } else {
            return 26;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)J", line = 23)
    public final long method1967(byte arg0) {
        if (arg0 != 98) {
            this.field4967 = -83;
        }
        field4944++;
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field4967; var4++) {
            var2 = (var2 << 5) + ((long) (this.field4935[var4] & 0xFF)) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILud;)I", line = 45)
    public final int method1968(int arg0, class279 arg1) {
        int var3 = 0;
        field4959++;
        int var4 = this.field4967;
        int var5 = 0;
        int var6 = 120 % ((-arg0 - 21) / 35);
        int var7 = arg1.field4967;
        int var8 = this.field4967;
        int var9 = arg1.field4967;
        int var10 = 0;
        int var11 = 0;
        while (var4 != 0 && var7 != 0) {
            if (var3 == 156 || var3 == 230) {
                var3 = 101;
            } else if (var3 == 140 || var3 == 198) {
                var3 = 69;
            } else if (var3 == 223) {
                var3 = 115;
            } else {
                var3 = this.field4935[var10] & 0xFF;
                var10++;
            }
            if (class221.method1619(var3, (byte) -122)) {
                var8++;
            } else {
                var4--;
            }
            if (var5 == 156 || var5 == 230) {
                var5 = 101;
            } else if (var5 == 140 || var5 == 198) {
                var5 = 69;
            } else if (var5 == 223) {
                var5 = 115;
            } else {
                var5 = arg1.field4935[var11] & 0xFF;
                var11++;
            }
            if (class221.method1619(var5, (byte) -122)) {
                var9++;
            } else {
                var7--;
            }
            if (class155.field2796[var3] < class155.field2796[var5]) {
                return -1;
            }
            if (class155.field2796[var3] > class155.field2796[var5]) {
                return 1;
            }
        }
        if (var9 <= var8) {
            return var9 >= var8 ? 0 : 1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)I", line = 135)
    public final int method1969(byte arg0) {
        int var2 = 0;
        field4977++;
        if (arg0 != 53) {
            this.field4941 = true;
        }
        for (int var3 = 0; var3 < this.field4967; var3++) {
            var2 = (this.field4935[var3] & 0xFF) + ((var2 << 5) - var2);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ud", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 158)
    public final boolean equals(Object arg0) {
        field4925++;
        if (!(arg0 instanceof class279)) {
            throw new IllegalArgumentException();
        }
        return this.method1990((byte) 111, (class279) arg0);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)Ljava/net/URL;", line = 181)
    public final URL method1970(boolean arg0) throws MalformedURLException {
        field4982++;
        if (!arg0) {
            method1987(-43);
        }
        return new URL(new String(this.field4935, 0, this.field4967));
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lud;Z)Lud;", line = 198)
    public final class279 method1971(class279 arg0, boolean arg1) {
        field4934++;
        if (!this.field4941) {
            throw new IllegalArgumentException();
        }
        if (this.field4935.length < this.field4967 + arg0.field4967) {
            int var3;
            for (var3 = 1; var3 < (this.field4967 + arg0.field4967); var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class25.method219(this.field4935, 0, var4, 0, this.field4967);
            this.field4935 = var4;
        }
        if (!arg1) {
            this.method1993(12, -10);
        }
        class25.method219(arg0.field4935, 0, this.field4935, this.field4967, arg0.field4967);
        this.field4967 += arg0.field4967;
        return this;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLjava/applet/Applet;)Lud;", line = 235)
    public final class279 method1972(byte arg0, Applet arg1) {
        String var3 = new String(this.field4935, 0, this.field4967);
        field4921++;
        String var4 = arg1.getParameter(var3);
        if (arg0 > -99) {
            this.field4935 = (byte[]) null;
        }
        return var4 == null ? null : class23.method210(var4, 80);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZI)I", line = 257)
    public final int method1973(boolean arg0, int arg1) {
        field4960++;
        return arg0 ? this.field4935[arg1] & 0xFF : 111;
    }

    @OriginalMember(owner = "client!ud", name = "toString", descriptor = "()Ljava/lang/String;", line = 272)
    public final String toString() {
        field4955++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lud;I)Z", line = 284)
    public final boolean method1974(class279 arg0, int arg1) {
        field4950++;
        if (arg0.field4967 > this.field4967) {
            return false;
        }
        int var3 = 0;
        if (arg1 != -28089) {
            this.toString();
        }
        while (arg0.field4967 > var3) {
            byte var4 = this.field4935[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            byte var5 = arg0.field4935[var3];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 != var5) {
                return false;
            }
            var3++;
        }
        return true;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILjava/applet/Applet;)V", line = 326)
    public final void method1975(int arg0, Applet arg1) throws Throwable {
        field4972++;
        if (arg0 != 11386) {
            field4929 = (class66[]) null;
        }
        String var3 = new String(this.field4935, 0, this.field4967);
        class197.method1469(arg1, var3, (byte) 43);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BZ)V", line = 338)
    public static final void method1976(byte arg0, boolean arg1) {
        field4949++;
        byte[][] var2;
        byte var3;
        if (class97.field1824 && arg1) {
            var2 = class237.field4133;
            var3 = 1;
        } else {
            var2 = class122.field2204;
            var3 = 4;
        }
        if (arg0 != 92) {
            field4947 = 125;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class35.method309((byte) 30);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class41.field872[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = (var8 & 0x3A5D478) >> 24;
                        if (!arg1 || var9 == 0) {
                            int var10 = (var8 & 0xFFDDA9) >> 14;
                            int var11 = var8 >> 1 & 0x3;
                            int var12 = (var8 & 0x3FFA) >> 3;
                            int var13 = (var10 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class77.field1493.length; var14++) {
                                if (class77.field1493[var14] == var13 && var2[var14] != null) {
                                    var7 = true;
                                    class38.method345(arg1, (var12 & 0x7) * 8, var6 * 8, var4, var5 * 8, var2[var14], (var10 & 0x7) * 8, class90.field1702, var9, var11, 83);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class73.method635(arg0 ^ 0xFFFFFFCB, var4, var5 * 8, 8, 8, var6 * 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lud;B)V", line = 434)
    public static final void method1977(class279 arg0, byte arg1) {
        field4946++;
        if (arg1 < 47) {
            field4963 = (class279) null;
        }
        int var2 = class166.method1296(119, arg0);
        if (var2 != -1) {
            class13.method89(class62.field1274.field2423[var2], class62.field1274.field2436[var2], false);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)[Lud;", line = 454)
    public final class279[] method1978(int arg0, int arg1) {
        int var3 = 0;
        field4954++;
        for (int var4 = 0; var4 < this.field4967; var4++) {
            if (this.field4935[var4] == arg0) {
                var3++;
            }
        }
        class279[] var5 = new class279[var3 + 1];
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        }
        int var6 = 0;
        int var7 = arg1;
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = 0; this.field4935[var6 + var9] != arg0; var9++) {
            }
            var5[var7++] = this.method2009((byte) -84, var6, var6 + var9);
            var6 += var9 + 1;
        }
        var5[var3] = this.method2009((byte) -84, var6, this.field4967);
        return var5;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lud;II)I", line = 505)
    public final int method1979(class279 arg0, int arg1, int arg2) {
        if (arg1 != 31726) {
            return -65;
        }
        int var4 = arg0.field4967;
        field4927++;
        if (this.field4967 <= arg2) {
            return var4 == 0 ? this.field4967 : -1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (var4 == 0) {
            return arg2;
        }
        byte[] var5 = arg0.field4935;
        int var6 = this.field4967 - var4;
        byte var7 = var5[0];
        for (int var8 = arg2; var8 <= var6; var8++) {
            if (this.field4935[var8] != var7) {
                do {
                    int var10000 = ~var6;
                    var8++;
                    if (var10000 > ~var8) {
                        return -1;
                    }
                } while (this.field4935[var8] != var7);
            }
            boolean var9 = true;
            int var10 = var8 + 1;
            int var11 = 1;
            while (var11 < var4) {
                if (this.field4935[var10] != var5[var11]) {
                    var9 = false;
                    break;
                }
                var11++;
                var10++;
            }
            if (var9) {
                return var8;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)Lud;", line = 584)
    public final class279 method1980(byte arg0) {
        field4948++;
        class279 var2 = class72.method631(this.method2013(106), 5702);
        int var3 = 61 % ((arg0 + 70) / 51);
        return var2 == null ? class29.field690 : var2;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)Z", line = 599)
    private final boolean method1981(int arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        field4962++;
        boolean var3 = false;
        if (arg0 != 32392) {
            return true;
        }
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field4967; var6++) {
            int var7 = this.field4935[var6] & 0xFF;
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
            if ((var8 / arg1) != var5) {
                return false;
            }
            var5 = var8;
            var3 = true;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V", line = 674)
    public static void method1982(int arg0) {
        field4963 = null;
        field4929 = null;
        if (arg0 != 1) {
            method1976((byte) -118, false);
        }
        field4926 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/applet/Applet;I)Ljava/lang/Object;", line = 687)
    public final Object method1983(Applet arg0, int arg1) throws Throwable {
        field4974++;
        String var3 = new String(this.field4935, 0, this.field4967);
        if (arg1 != 7308) {
            return (Object) null;
        }
        Object var4 = class197.method1468(false, var3, arg0);
        if (var4 instanceof String) {
            byte[] var5 = ((String) var4).getBytes();
            var4 = class194.method1457(0, var5.length, var5, false);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)I", line = 716)
    public final int method1984(int arg0) {
        field4975++;
        if (arg0 != 8) {
            this.method1994(119);
        }
        return this.field4967;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)Lud;", line = 728)
    public final class279 method1985(byte arg0, int arg1) {
        field4971++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (this.field4941) {
            if (this.field4935.length == this.field4967) {
                int var3;
                for (var3 = 1; var3 <= this.field4967; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class25.method219(this.field4935, 0, var4, 0, this.field4967);
                this.field4935 = var4;
            }
            this.field4935[this.field4967++] = (byte) arg1;
            int var5 = 119 % ((arg0 - 77) / 43);
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(II)Lud;", line = 763)
    public final class279 method1986(int arg0, int arg1) {
        field4986++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class279 var3 = new class279();
        if (arg0 >= 0) {
            return (class279) null;
        }
        var3.field4935 = new byte[this.field4967 + 1];
        var3.field4967 = this.field4967 + 1;
        class25.method219(this.field4935, 0, var3.field4935, 0, this.field4967);
        var3.field4935[this.field4967] = (byte) arg1;
        return var3;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)[Llj;", line = 788)
    public static final class50[] method1987(int arg0) {
        if (arg0 > -90) {
            field4931 = -118;
        }
        field4978++;
        class50[] var1 = new class50[class244.field4329];
        for (int var2 = 0; var2 < class244.field4329; var2++) {
            if (class97.field1824) {
                var1[var2] = new class56(class86.field1646, class111.field2045, class44.field915[var2], class216.field3811[var2], class1.field92[var2], class115.field2097[var2], class113.field2080[var2], class217.field3839);
            } else {
                var1[var2] = new class158(class86.field1646, class111.field2045, class44.field915[var2], class216.field3811[var2], class1.field92[var2], class115.field2097[var2], class113.field2080[var2], class217.field3839);
            }
        }
        class162.method1278(false);
        return var1;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(BI)Lud;", line = 817)
    public final class279 method1988(byte arg0, int arg1) {
        field4976++;
        if (arg0 > -38) {
            field4929 = (class66[]) null;
        }
        return this.method2009((byte) -84, arg1, this.field4967);
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(Lud;B)I", line = 828)
    public final int method1989(class279 arg0, byte arg1) {
        field4939++;
        if (arg1 != -72) {
            this.field4967 = 37;
        }
        return this.method1979(arg0, 31726, 0);
    }

    @OriginalMember(owner = "client!ud", name = "hashCode", descriptor = "()I", line = 841)
    public final int hashCode() {
        field4932++;
        return this.method1969((byte) 53);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLud;)Z", line = 851)
    public final boolean method1990(byte arg0, class279 arg1) {
        field4951++;
        if (arg1 == null) {
            return false;
        } else if (arg1 == this) {
            return true;
        } else if (this.field4967 == arg1.field4967) {
            byte[] var3 = this.field4935;
            byte[] var4 = arg1.field4935;
            int var5 = 0;
            if (arg0 <= 16) {
                field4947 = 100;
            }
            while (this.field4967 > var5) {
                if (var3[var5] != var4[var5]) {
                    return false;
                }
                var5++;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(Lud;B)Z", line = 889)
    public final boolean method1991(class279 arg0, byte arg1) {
        field4928++;
        if (this.field4967 < arg0.field4967) {
            return false;
        }
        if (arg1 <= 96) {
            this.method2005(-31);
        }
        int var3 = this.field4967 - arg0.field4967;
        for (int var4 = 0; var4 < arg0.field4967; var4++) {
            if (this.field4935[var3 + var4] != arg0.field4935[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)Lud;", line = 920)
    public final class279 method1992(int arg0) {
        field4966++;
        if (arg0 > -100) {
            return (class279) null;
        } else if (this.field4941) {
            if (this.field4935.length != this.field4967) {
                byte[] var2 = new byte[this.field4967];
                class25.method219(this.field4935, 0, var2, 0, this.field4967);
                this.field4935 = var2;
            }
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(II)I", line = 963)
    public final int method1993(int arg0, int arg1) {
        field4937++;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        if (arg1 != -11486) {
            this.method2008((byte) 118);
        }
        int var3 = 0;
        boolean var4 = false;
        boolean var5 = false;
        for (int var6 = 0; var6 < this.field4967; var6++) {
            int var7 = this.field4935[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var5 = true;
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
            if (var5) {
                var7 = -var7;
            }
            int var8 = arg0 * var3 + var7;
            if (var8 / arg0 != var3) {
                throw new NumberFormatException();
            }
            var4 = true;
            var3 = var8;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var3;
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)Lud;", line = 1039)
    public final class279 method1994(int arg0) {
        field4968++;
        long var2 = this.method1967((byte) 98);
        synchronized (ud.class) {
            if (class255.field4547 == null) {
                class255.field4547 = new class69(4096);
            } else {
                for (class272 var5 = (class272) class255.field4547.method610(var2, -1); var5 != null; var5 = (class272) class255.field4547.method613(5185)) {
                    if (this.method1990((byte) 88, var5.field4843)) {
                        return var5.field4843;
                    }
                }
            }
            class272 var6 = new class272();
            int var7 = -97 % ((arg0 + 59) / 62);
            this.field4941 = false;
            var6.field4843 = this;
            class255.field4547.method612(false, var6, var2);
            return this;
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(BLud;)I", line = 1085)
    public final int method1995(byte arg0, class279 arg1) {
        field4969++;
        int var3;
        if (arg1.field4967 >= this.field4967) {
            var3 = this.field4967;
        } else {
            var3 = arg1.field4967;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((this.field4935[var4] & 0xFF) < (arg1.field4935[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field4935[var4] & 0xFF) > (arg1.field4935[var4] & 0xFF)) {
                return 1;
            }
        }
        if (this.field4967 < arg1.field4967) {
            return -1;
        }
        if (arg0 != -123) {
            this.field4967 = -92;
        }
        if (arg1.field4967 < this.field4967) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)Lud;", line = 1125)
    public final class279 method1996(int arg0) {
        field4979++;
        if (arg0 != 15) {
            this.method2019(63, (byte) -101);
        }
        class279 var2 = new class279();
        var2.field4967 = this.field4967;
        var2.field4935 = new byte[var2.field4967];
        for (int var3 = 0; var3 < this.field4967; var3++) {
            var2.field4935[this.field4967 - var3 - 1] = this.field4935[var3];
        }
        return var2;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIZ)Lud;", line = 1154)
    public final class279 method1997(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return (class279) null;
        }
        field4956++;
        byte var4 = (byte) arg1;
        byte var5 = (byte) arg0;
        class279 var6 = new class279();
        var6.field4967 = this.field4967;
        var6.field4935 = new byte[this.field4967];
        for (int var7 = 0; var7 < this.field4967; var7++) {
            byte var8 = this.field4935[var7];
            if (var4 == var8) {
                var6.field4935[var7] = var5;
            } else {
                var6.field4935[var7] = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZIILud;)Lud;", line = 1191)
    public final class279 method1998(boolean arg0, int arg1, int arg2, class279 arg3) {
        field4980++;
        if (!this.field4941) {
            throw new IllegalArgumentException();
        } else if (arg1 >= 0 && arg2 >= arg1 && arg3.field4967 >= arg2) {
            if (this.field4935.length < this.field4967 + arg2 - arg1) {
                int var5;
                for (var5 = 1; var5 < (this.field4967 + arg3.field4967); var5 += var5) {
                }
                byte[] var6 = new byte[var5];
                class25.method219(this.field4935, 0, var6, 0, this.field4967);
                this.field4935 = var6;
            }
            class25.method219(arg3.field4935, arg1, this.field4935, this.field4967, arg2 - arg1);
            this.field4967 += arg2 - arg1;
            if (!arg0) {
                field4929 = (class66[]) null;
            }
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(Lud;I)Z", line = 1233)
    public final boolean method1999(class279 arg0, int arg1) {
        field4981++;
        if (arg0.field4967 > this.field4967) {
            return false;
        }
        for (int var3 = 0; var3 < arg0.field4967; var3++) {
            if (this.field4935[var3] != arg0.field4935[var3]) {
                return false;
            }
        }
        if (arg1 < 19) {
            field4943 = -51;
        }
        return true;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(Z)V", line = 1268)
    public static final void method2000(boolean arg0) {
        field4938++;
        int var1 = class238.field4170.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class238.field4170[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class126.field2337; var4++) {
                    if (class77.field1493[var2] == class152.field2763[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class152.field2763[class126.field2337] = class77.field1493[var2];
                    var3 = class126.field2337++;
                }
                class53 var5 = new class53(class238.field4170[var2]);
                int var6 = 0;
                while (class238.field4170[var2].length > var5.field1142 && var6 < 511) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method468(28214);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class77.field1493[var2] >> 8) * 64 + var10 - class112.field2058;
                    int var13 = (class77.field1493[var2] & 0xFF) * 64 + var11 - class12.field396;
                    class125 var14 = class150.method1198(var5.method468(28214), 120);
                    if (class122.field2196[var7] == null && (var14.field2274 & 0x1) > 0 && class179.field3245 == var9 && var12 >= 0 && var14.field2266 + var12 < 104 && var13 >= 0 && (var14.field2266 + var13) < 104) {
                        class122.field2196[var7] = new class102();
                        class102 var15 = class122.field2196[var7];
                        class200.field3579[class26.field626++] = var7;
                        var15.field84 = class8.field279;
                        var15.method862((byte) 72, var14);
                        var15.method1(0, var15.field1921.field2266);
                        var15.field28 = var15.field44 = class75.field1472[var15.field1921.field2298];
                        var15.field23 = var15.field1921.field2294;
                        var15.field93 = var15.field1921.field2295;
                        if (var15.field93 == 0) {
                            var15.field44 = 0;
                        }
                        var15.method10(true, var15.method3((byte) -111), var13, 0, var12);
                    }
                }
            }
        }
        if (arg0) {
            field4926 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(II)I", line = 1361)
    public static final int method2001(int arg0, int arg1) {
        field4973++;
        int var2 = arg0 & 0x3F;
        if (arg1 != 1) {
            field4943 = 23;
        }
        int var3 = (arg0 & 0xEF) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(B)Lud;", line = 1414)
    public final class279 method2002(byte arg0) {
        if (arg0 != -94) {
            field4947 = -62;
        }
        class279 var2 = new class279();
        var2.field4967 = this.field4967;
        var2.field4935 = new byte[this.field4967];
        field4945++;
        for (int var3 = 0; var3 < this.field4967; var3++) {
            byte var4 = this.field4935[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field4935[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I", line = 1447)
    public final int method2003(FontMetrics arg0, int arg1) {
        if (arg1 != -2191) {
            method1977((class279) null, (byte) 43);
        }
        field4970++;
        String var3;
        try {
            var3 = new String(this.field4935, 0, this.field4967, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field4935, 0, this.field4967);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/net/URL;I)Ljava/net/URL;", line = 1471)
    public final URL method2004(URL arg0, int arg1) throws MalformedURLException {
        if (arg1 != 2102) {
            this.method1979((class279) null, -20, 59);
        }
        field4952++;
        return new URL(arg0, new String(this.field4935, 0, this.field4967));
    }

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)Lud;", line = 1484)
    public final class279 method2005(int arg0) {
        class279 var2 = new class279();
        var2.field4967 = this.field4967;
        field4922++;
        byte var3 = 2;
        if (arg0 != 192) {
            field4926 = (int[]) null;
        }
        var2.field4935 = new byte[this.field4967];
        for (int var4 = 0; var4 < this.field4967; var4++) {
            byte var5 = this.field4935[var4];
            if (!(var5 < 97 || var5 > 122) || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var3 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var3 = 0;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (var3 == 0) {
                    var5 = (byte) (var5 + 32);
                }
                var3 = 0;
            } else if (var5 == 46 || var5 == 33 || var5 == 63) {
                var3 = 2;
            } else if (var5 != 32) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var2.field4935[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(B)Lud;", line = 1546)
    public final class279 method2006(byte arg0) {
        int var2 = this.field4967;
        int var3;
        for (var3 = 0; this.field4967 > var3 && (this.field4935[var3] >= 0 && this.field4935[var3] <= 32 || (this.field4935[var3] & 0xFF) == 160); var3++) {
        }
        field4984++;
        while (var2 > var3 && (this.field4935[var2 - 1] >= 0 && this.field4935[var2 - 1] <= 32 || (this.field4935[var2 - 1] & 0xFF) == 160)) {
            var2--;
        }
        if (var3 == 0 && this.field4967 == var2) {
            return this;
        }
        class279 var4 = new class279();
        var4.field4967 = var2 - var3;
        var4.field4935 = new byte[var4.field4967];
        for (int var5 = 0; var5 < var4.field4967; var5++) {
            var4.field4935[var5] = this.field4935[var3 + var5];
        }
        if (arg0 != 112) {
            method1987(-70);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLud;Lud;)Lud;", line = 1581)
    public final class279 method2007(byte arg0, class279 arg1, class279 arg2) {
        int var4 = this.field4967;
        field4923++;
        int var5 = 0;
        int var6 = arg1.field4967 - arg2.field4967;
        while (true) {
            int var7 = this.method1979(arg2, 31726, var5);
            if (var7 < 0) {
                int var8 = 0;
                if (arg0 > -115) {
                    return (class279) null;
                }
                class279 var9 = class247.method1774(var4, 4);
                while (true) {
                    int var10 = this.method1979(arg2, 31726, var8);
                    if (var10 < 0) {
                        while (var8 < this.field4967) {
                            var9.method1985((byte) -37, this.field4935[var8++] & 0xFF);
                        }
                        return var9;
                    }
                    while (var8 < var10) {
                        var9.method1985((byte) 127, this.field4935[var8++] & 0xFF);
                    }
                    var9.method1971(arg1, true);
                    var8 += arg2.field4967;
                }
            }
            var5 = arg2.field4967 + var7;
            var4 += var6;
        }
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(B)[B", line = 1638)
    public final byte[] method2008(byte arg0) {
        byte[] var2 = new byte[this.field4967];
        if (arg0 < 67) {
            return (byte[]) null;
        } else {
            field4983++;
            class25.method219(this.field4935, 0, var2, 0, this.field4967);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BII)Lud;", line = 1657)
    public final class279 method2009(byte arg0, int arg1, int arg2) {
        field4933++;
        class279 var4 = new class279();
        var4.field4967 = arg2 - arg1;
        if (arg0 != -84) {
            method2001(-124, 66);
        }
        var4.field4935 = new byte[arg2 - arg1];
        class25.method219(this.field4935, arg1, var4.field4935, 0, var4.field4967);
        return var4;
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(Lud;B)Z", line = 1672)
    public final boolean method2010(class279 arg0, byte arg1) {
        field4942++;
        if (arg0 == null) {
            return false;
        } else if (this.field4967 == arg0.field4967) {
            int var3 = 0;
            if (arg1 <= 80) {
                this.method2006((byte) 21);
            }
            while (this.field4967 > var3) {
                byte var4 = this.field4935[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg0.field4935[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
                var3++;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "(I)I", line = 1714)
    public final int method2011(int arg0) {
        field4961++;
        if (arg0 != 10) {
            field4963 = (class279) null;
        }
        return this.method1993(10, -11486);
    }

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "(B)V", line = 1726)
    public final void method2012(byte arg0) {
        if (arg0 > -93) {
            this.method1974((class279) null, 125);
        }
        String var2;
        try {
            var2 = new String(this.field4935, 0, this.field4967, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field4935, 0, this.field4967);
        }
        field4985++;
        System.out.println(var2);
    }

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "(I)J", line = 1749)
    public final long method2013(int arg0) {
        field4965++;
        long var2 = 0L;
        int var4 = 0;
        if (arg0 <= 88) {
            field4947 = -1;
        }
        while (this.field4967 > var4 && var4 < 12) {
            var2 *= 37L;
            byte var5 = this.field4935[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += (long) (var5 + 1 - 65);
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += (long) (var5 + 1 - 97);
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += (long) (var5 + 27 - 48);
            }
            var4++;
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIB)I", line = 1799)
    public final int method2014(int arg0, int arg1, byte arg2) {
        byte var4 = (byte) arg0;
        field4957++;
        for (int var5 = arg1; var5 < this.field4967; var5++) {
            if (this.field4935[var5] == var4) {
                return var5;
            }
        }
        if (arg2 >= -119) {
            return 121;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "(I)Z", line = 1829)
    public final boolean method2015(int arg0) {
        if (arg0 == 28444) {
            field4958++;
            return this.method1981(arg0 + 3948, 10);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "(I)Lud;", line = 1849)
    public final class279 method2016(int arg0) {
        field4930++;
        class279 var2 = new class279();
        var2.field4967 = this.field4967;
        boolean var3 = true;
        var2.field4935 = new byte[this.field4967];
        if (arg0 != -32) {
            return (class279) null;
        }
        for (int var4 = 0; var4 < this.field4967; var4++) {
            byte var5 = this.field4935[var4];
            if (var5 == 95) {
                var3 = true;
                var2.field4935[var4] = 32;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var2.field4935[var4] = (byte) (var5 - 32);
                var3 = false;
            } else {
                var2.field4935[var4] = var5;
                var3 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILlh;)V", line = 1906)
    public static final void method2017(int arg0, class23 arg1) {
        field4924++;
        class42.method362(200000, arg0 + 38, arg1);
        if (arg0 != 0) {
            method1987(-101);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZILjava/awt/Graphics;I)V", line = 1919)
    public final void method2018(boolean arg0, int arg1, Graphics arg2, int arg3) {
        field4953++;
        String var5;
        try {
            var5 = new String(this.field4935, 0, this.field4967, "ISO-8859-1");
            if (arg0) {
                this.method1978(-33, -34);
            }
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field4935, 0, this.field4967);
        }
        arg2.drawString(var5, arg3, arg1);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)V", line = 1950)
    public final void method2019(int arg0, byte arg1) {
        field4940++;
        if (!this.field4941) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg0 > this.field4935.length) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class25.method219(this.field4935, 0, var4, 0, this.field4967);
                this.field4935 = var4;
            }
            if (arg1 < -104) {
                for (int var5 = this.field4967; var5 < arg0; var5++) {
                    this.field4935[var5] = 32;
                }
                this.field4967 = arg0;
            }
        }
    }
}
