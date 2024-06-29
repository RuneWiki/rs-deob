import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class255 implements class89 {

    @OriginalMember(owner = "client!ve", name = "R", descriptor = "Z")
    private boolean field4334 = true;

    @OriginalMember(owner = "client!ve", name = "jb", descriptor = "Lve;")
    public static class255 field4352 = class87.method607(57, "rot:");

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "Lkf;")
    public static class212 field4318 = new class212(5000);

    @OriginalMember(owner = "client!ve", name = "ob", descriptor = "[I")
    public static int[] field4357 = new int[50];

    @OriginalMember(owner = "client!ve", name = "nb", descriptor = "I")
    public static int field4356 = 0;

    @OriginalMember(owner = "client!ve", name = "qb", descriptor = "Lve;")
    public static class255 field4359 = class87.method607(49, "::fps ");

    @OriginalMember(owner = "client!ve", name = "rb", descriptor = "Lve;")
    public static class255 field4360 = class87.method607(29, "_");

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!ve", name = "K", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!ve", name = "L", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!ve", name = "M", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!ve", name = "N", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!ve", name = "O", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!ve", name = "P", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!ve", name = "Q", descriptor = "I")
    private int field4333;

    @OriginalMember(owner = "client!ve", name = "S", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!ve", name = "T", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!ve", name = "U", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!ve", name = "V", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!ve", name = "W", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!ve", name = "X", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!ve", name = "Y", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!ve", name = "Z", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!ve", name = "ab", descriptor = "I")
    public int field4343;

    @OriginalMember(owner = "client!ve", name = "bb", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!ve", name = "cb", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!ve", name = "db", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!ve", name = "eb", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!ve", name = "fb", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!ve", name = "gb", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!ve", name = "hb", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!ve", name = "ib", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!ve", name = "kb", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!ve", name = "lb", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!ve", name = "mb", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!ve", name = "pb", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "Lrg;")
    public static class88 field4299;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "[B")
    public byte[] field4297;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILve;)Z", line = 12)
    public final boolean method1737(int arg0, class255 arg1) {
        field4332++;
        if (arg1.field4343 > this.field4343) {
            return false;
        }
        for (int var3 = 0; var3 < arg1.field4343; var3++) {
            byte var4 = this.field4297[var3];
            byte var5 = arg1.field4297[var3];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            if (var4 != var5) {
                return false;
            }
        }
        if (arg0 != 19655) {
            this.equals((Object) null);
        }
        return true;
    }

    @OriginalMember(owner = "client!ve", name = "toString", descriptor = "()Ljava/lang/String;", line = 54)
    public final String toString() {
        field4345++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILve;I)I", line = 65)
    public final int method1738(int arg0, class255 arg1, int arg2) {
        if (arg2 <= 91) {
            field4352 = (class255) null;
        }
        int[] var4 = new int[arg1.field4343];
        field4338++;
        int[] var5 = new int[256];
        int[] var6 = new int[arg1.field4343];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg1.field4343;
        }
        for (int var8 = 1; var8 <= arg1.field4343; var8++) {
            var4[var8 - 1] = (arg1.field4343 << 1) - var8;
            var5[class154.method1134(arg1.field4297[var8 - 1], 255)] = arg1.field4343 - var8;
        }
        int var9 = arg1.field4343 + 1;
        int var10 = arg1.field4343;
        while (var10 > 0) {
            var6[var10 - 1] = var9;
            while (var9 <= arg1.field4343 && arg1.field4297[var9 - 1] != arg1.field4297[var10 - 1]) {
                if ((arg1.field4343 - var10) <= var4[var9 - 1]) {
                    var4[var9 - 1] = arg1.field4343 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var10--;
            var9--;
        }
        int var11 = var9;
        int var12 = arg1.field4343 + 1 - var9;
        int var13 = 1;
        int var14 = 0;
        int var15 = 1;
        while (var15 <= var12) {
            var6[var15 - 1] = var14;
            while (var14 >= 1 && arg1.field4297[var14 - 1] != arg1.field4297[var15 - 1]) {
                var14 = var6[var14 - 1];
            }
            var15++;
            var14++;
        }
        while (arg1.field4343 > var11) {
            for (int var16 = var13; var16 <= var11; var16++) {
                if (var4[var16 - 1] >= (arg1.field4343 + var11 - var16)) {
                    var4[var16 - 1] = var11 + arg1.field4343 - var16;
                }
            }
            var13 = var11 + 1;
            var11 = var11 + var12 - var6[var12 - 1];
            var12 = var6[var12 - 1];
        }
        int var18;
        for (int var17 = arg1.field4343 + arg0 - 1; var17 < this.field4343; var17 += Math.max(var5[this.field4297[var17] & 0xFF], var4[var18])) {
            for (var18 = arg1.field4343 - 1; var18 >= 0 && this.field4297[var17] == arg1.field4297[var18]; var18--) {
                var17--;
            }
            if (var18 == -1) {
                return var17 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V", line = 176)
    public final void method1739(int arg0, int arg1) {
        field4348++;
        this.field4333 = 0;
        if (!this.field4334) {
            throw new IllegalArgumentException();
        }
        int var3 = -127 % ((arg0 - 45) / 47);
        if (arg1 < 0) {
            throw new IllegalArgumentException();
        }
        if (this.field4297.length < arg1) {
            int var4;
            for (var4 = 1; var4 < arg1; var4 += var4) {
            }
            byte[] var5 = new byte[var4];
            class36.method216(this.field4297, 0, var5, 0, this.field4343);
            this.field4297 = var5;
        }
        for (int var6 = this.field4343; var6 < arg1; var6++) {
            this.field4297[var6] = 32;
        }
        this.field4343 = arg1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)I", line = 234)
    public final int method1740(boolean arg0) {
        int var2 = 0;
        if (!arg0) {
            return -84;
        }
        for (int var3 = 0; var3 < this.field4343; var3++) {
            var2 = (this.field4297[var3] & 0xFF) + (var2 << 5) - var2;
        }
        field4331++;
        return var2;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIB)I", line = 256)
    public final int method1741(int arg0, int arg1, byte arg2) {
        field4309++;
        byte var4 = (byte) arg1;
        int var5 = -21 % ((arg2 - 6) / 43);
        for (int var6 = arg0; var6 < this.field4343; var6++) {
            if (this.field4297[var6] == var4) {
                return var6;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)[B", line = 284)
    public final byte[] method1742(byte arg0) {
        field4295++;
        byte[] var2 = new byte[this.field4343];
        if (arg0 != -28) {
            this.field4334 = true;
        }
        class36.method216(this.field4297, 0, var2, 0, this.field4343);
        return var2;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)Lve;", line = 302)
    public final class255 method1743(byte arg0) {
        field4322++;
        if (arg0 <= 20) {
            return (class255) null;
        } else {
            class255 var2 = class147.method1091(this.method1764((byte) -100), -128);
            return var2 == null ? class265.field4496 : var2;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)V", line = 319)
    public static final void method1744(int arg0, int arg1) {
        if (arg1 > 98) {
            field4320++;
            class53 var2 = class303.method2112(-1155040160, arg0, 4);
            var2.method326(19);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)J", line = 332)
    public final long method1745(int arg0) {
        field4308++;
        if (arg0 != 65) {
            this.method1753(-102);
        }
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field4343; var4++) {
            var2 = (var2 << 5) + ((long) (this.field4297[var4] & 0xFF)) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)I", line = 353)
    public final int method1746(byte arg0) {
        field4354++;
        if (arg0 < 7) {
            method1747(54);
        }
        return this.method1754(10, (byte) -127);
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V", line = 371)
    public static void method1747(int arg0) {
        field4352 = null;
        field4360 = null;
        if (arg0 != 23949) {
            method1766((class212) null, (byte) -6, 35);
        }
        field4359 = null;
        field4357 = null;
        field4299 = null;
        field4318 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)Lve;", line = 389)
    public final class255 method1748(int arg0, byte arg1) {
        field4342++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        if (arg1 != 118) {
            field4352 = (class255) null;
        }
        class255 var3 = new class255();
        var3.field4297 = new byte[this.field4343 + 1];
        var3.field4343 = this.field4343 + 1;
        class36.method216(this.field4297, 0, var3.field4297, 0, this.field4343);
        var3.field4297[this.field4343] = (byte) arg0;
        return var3;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V", line = 413)
    public final void method1749(int arg0) {
        field4316++;
        String var2;
        try {
            var2 = new String(this.field4297, arg0, this.field4343, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field4297, 0, this.field4343);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(II)Lve;", line = 428)
    public final class255 method1750(int arg0, int arg1) {
        field4305++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field4334) {
            this.field4333 = arg1;
            if (this.field4297.length == this.field4343) {
                int var3;
                for (var3 = 1; var3 <= this.field4343; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class36.method216(this.field4297, 0, var4, 0, this.field4343);
                this.field4297 = var4;
            }
            this.field4297[this.field4343++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/applet/Applet;I)Lve;", line = 469)
    public final class255 method1751(Applet arg0, int arg1) {
        field4298++;
        String var3 = new String(this.field4297, arg1, this.field4343);
        String var4 = arg0.getParameter(var3);
        return var4 == null ? null : class93.method694(var4, (byte) 121);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLve;)Z", line = 486)
    public final boolean method1752(boolean arg0, class255 arg1) {
        field4294++;
        if (arg1 == null) {
            return false;
        } else if (this.field4343 == arg1.field4343) {
            if (!this.field4334 || !arg1.field4334) {
                if (this.field4333 == 0) {
                    this.field4333 = this.method1740(true);
                    if (this.field4333 == 0) {
                        this.field4333 = 1;
                    }
                }
                if (arg1.field4333 == 0) {
                    arg1.field4333 = arg1.method1740(true);
                    if (arg1.field4333 == 0) {
                        arg1.field4333 = 1;
                    }
                }
                if (this.field4333 != arg1.field4333) {
                    return false;
                }
            }
            if (!arg0) {
                this.toString();
            }
            for (int var3 = 0; var3 < this.field4343; var3++) {
                if (this.field4297[var3] != arg1.field4297[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)Lve;", line = 542)
    public final class255 method1753(int arg0) {
        byte var2 = 2;
        if (arg0 != 1) {
            field4318 = (class212) null;
        }
        field4329++;
        class255 var3 = new class255();
        var3.field4343 = this.field4343;
        var3.field4297 = new byte[this.field4343];
        for (int var4 = 0; var4 < this.field4343; var4++) {
            byte var5 = this.field4297[var4];
            if (var5 >= 97 && var5 <= 122 || var5 >= -32 && var5 <= -2 && var5 != -9) {
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
            var3.field4297[var4] = var5;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(IB)I", line = 614)
    public final int method1754(int arg0, byte arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        field4335++;
        for (int var6 = 0; var6 < this.field4343; var6++) {
            int var7 = this.field4297[var6] & 0xFF;
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
        int var9 = 32 % ((arg1 + 67) / 52);
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(IB)I", line = 699)
    public final int method1755(int arg0, byte arg1) {
        byte var3 = (byte) arg0;
        int var4 = -32 % ((arg1 + 68) / 46);
        int var5 = 0;
        field4303++;
        for (int var6 = 0; var6 < this.field4343; var6++) {
            if (this.field4297[var6] == var3) {
                var5++;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III[BB)I", line = 724)
    public final int method1756(int arg0, int arg1, int arg2, byte[] arg3, byte arg4) {
        field4341++;
        class36.method216(this.field4297, arg1, arg3, arg0, arg2 - arg1);
        if (arg4 <= 26) {
            this.field4297 = (byte[]) null;
        }
        return arg2 - arg1;
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(II)I", line = 739)
    public final int method1757(int arg0, int arg1) {
        if (arg0 < 36) {
            field4360 = (class255) null;
        }
        field4346++;
        return this.field4297[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIIIII)V", line = 752)
    public static final void method1758(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4304++;
        if (arg3 != -29351) {
            field4356 = -5;
        }
        class294 var10 = (class294) class274.field4716.method1471((byte) 28);
        class294 var11 = null;
        while (var10 != null) {
            if (var10.field5046 == arg8 && var10.field5054 == arg9 && var10.field5056 == arg0 && var10.field5052 == arg1) {
                var11 = var10;
                break;
            }
            var10 = (class294) class274.field4716.method1475((byte) 83);
        }
        if (var11 == null) {
            var11 = new class294();
            var11.field5046 = arg8;
            var11.field5052 = arg1;
            var11.field5056 = arg0;
            var11.field5054 = arg9;
            class296.method2083(var11, (byte) -119);
            class274.field4716.method1472(true, var11);
        }
        var11.field5060 = arg5;
        var11.field5059 = arg7;
        var11.field5045 = arg6;
        var11.field5043 = arg4;
        var11.field5050 = arg2;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)Lve;", line = 797)
    public final class255 method1759(int arg0, int arg1, int arg2) {
        field4312++;
        if (arg2 <= 77) {
            return (class255) null;
        }
        byte var4 = (byte) arg0;
        byte var5 = (byte) arg1;
        class255 var6 = new class255();
        var6.field4343 = this.field4343;
        var6.field4297 = new byte[this.field4343];
        for (int var7 = 0; var7 < this.field4343; var7++) {
            byte var8 = this.field4297[var7];
            if (var4 == var8) {
                var6.field4297[var7] = var5;
            } else {
                var6.field4297[var7] = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)[Lve;", line = 831)
    public final class255[] method1760(byte arg0, int arg1) {
        field4306++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4343; var4++) {
            if (this.field4297[var4] == arg1) {
                var3++;
            }
        }
        class255[] var5 = new class255[var3 + 1];
        if (arg0 <= 110) {
            return (class255[]) null;
        } else if (var3 == 0) {
            var5[0] = this;
            return var5;
        } else {
            int var6 = 0;
            int var7 = 0;
            for (int var8 = 0; var8 < var3; var8++) {
                int var9;
                for (var9 = 0; this.field4297[var7 + var9] != arg1; var9++) {
                }
                var5[var6++] = this.method1780(var7 + var9, -10449, var7);
                var7 += var9 + 1;
            }
            var5[var3] = this.method1780(this.field4343, -10449, var7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ve", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 893)
    public final boolean equals(Object arg0) {
        field4307++;
        if (!arg0 instanceof class255) {
            throw new IllegalArgumentException();
        }
        return this.method1752(true, (class255) arg0);
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(B)Lve;", line = 909)
    public final class255 method1761(byte arg0) {
        int var2 = -10 % ((arg0 - 59) / 34);
        field4300++;
        long var3 = this.method1745(65);
        synchronized (ve.class) {
            if (class254.field4286 == null) {
                class254.field4286 = new class47(4096);
            } else {
                for (class50 var6 = (class50) class254.field4286.method280(var3, 29153); var6 != null; var6 = (class50) class254.field4286.method277(54)) {
                    if (this.method1752(true, var6.field751)) {
                        return var6.field751;
                    }
                }
            }
            class50 var7 = new class50();
            var7.field751 = this;
            this.field4334 = false;
            class254.field4286.method284(true, var3, var7);
            return this;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)Ljava/net/URL;", line = 946)
    public final URL method1762(boolean arg0) throws MalformedURLException {
        if (arg0) {
            field4350++;
            return new URL(new String(this.field4297, 0, this.field4343));
        } else {
            return (URL) null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/net/URL;I)Ljava/net/URL;", line = 958)
    public final URL method1763(URL arg0, int arg1) throws MalformedURLException {
        field4315++;
        return arg1 == 10 ? new URL(arg0, new String(this.field4297, 0, this.field4343)) : (URL) null;
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(B)J", line = 973)
    public final long method1764(byte arg0) {
        field4296++;
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field4343 && var4 < 12; var4++) {
            byte var5 = this.field4297[var4];
            var2 *= 37L;
            if (var5 >= 65 && var5 <= 90) {
                var2 += (long) (var5 + 1 - 65);
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += (long) (var5 + 1 - 97);
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += (long) (var5 + 27 - 48);
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        int var6 = 52 % ((arg0 + 29) / 59);
        return var2;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lve;I)Lve;", line = 1014)
    public final class255 method1765(class255 arg0, int arg1) {
        field4355++;
        if (!this.field4334) {
            throw new IllegalArgumentException();
        }
        this.field4333 = 0;
        if ((this.field4343 + arg0.field4343) > this.field4297.length) {
            int var3;
            for (var3 = 1; var3 < (this.field4343 + arg0.field4343); var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class36.method216(this.field4297, 0, var4, 0, this.field4343);
            this.field4297 = var4;
        }
        if (arg1 == 55) {
            class36.method216(arg0.field4297, 0, this.field4297, this.field4343, arg0.field4343);
            this.field4343 += arg0.field4343;
            return this;
        } else {
            return (class255) null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lkf;BI)V", line = 1049)
    public static final void method1766(class212 arg0, byte arg1, int arg2) {
        if (arg1 >= -57) {
            field4352 = (class255) null;
        }
        field4347++;
        while (true) {
            class280 var3 = (class280) class80.field1302.method1471((byte) -74);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field4805; var5++) {
                if (var3.field4808[var5] != null) {
                    if (var3.field4808[var5].field2833 == 2) {
                        var3.field4793[var5] = -5;
                    }
                    if (var3.field4808[var5].field2833 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field4788[var5] != null) {
                    if (var3.field4788[var5].field2833 == 2) {
                        var3.field4793[var5] = -6;
                    }
                    if (var3.field4788[var5].field2833 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method1523(22260, arg2);
            arg0.method463(false, 0);
            int var6 = arg0.field1068;
            arg0.method436(var3.field4802, -18820);
            for (int var7 = 0; var7 < var3.field4805; var7++) {
                if (var3.field4793[var7] == 0) {
                    try {
                        int var8 = var3.field4797[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field4808[var7].field2832;
                            int var10 = var9.getInt((Object) null);
                            arg0.method463(false, 0);
                            arg0.method436(var10, -18820);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field4808[var7].field2832;
                            var13.setInt((Object) null, var3.field4804[var7]);
                            arg0.method463(false, 0);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field4808[var7].field2832;
                            int var12 = var11.getModifiers();
                            arg0.method463(false, 0);
                            arg0.method436(var12, -18820);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field4788[var7].field2832;
                            byte[][] var15 = var3.field4796[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg0.method463(false, 0);
                            } else if ((var19 instanceof Number)) {
                                arg0.method463(false, 1);
                                arg0.method449(16711680, ((Number) var19).longValue());
                            } else if ((var19 instanceof class255)) {
                                arg0.method463(false, 2);
                                arg0.method483(-99755000, (class255) var19);
                            } else {
                                arg0.method463(false, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field4788[var7].field2832;
                            int var21 = var20.getModifiers();
                            arg0.method463(false, 0);
                            arg0.method436(var21, -18820);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg0.method463(false, -10);
                    } catch (InvalidClassException var35) {
                        arg0.method463(false, -11);
                    } catch (StreamCorruptedException var36) {
                        arg0.method463(false, -12);
                    } catch (OptionalDataException var37) {
                        arg0.method463(false, -13);
                    } catch (IllegalAccessException var38) {
                        arg0.method463(false, -14);
                    } catch (IllegalArgumentException var39) {
                        arg0.method463(false, -15);
                    } catch (InvocationTargetException var40) {
                        arg0.method463(false, -16);
                    } catch (SecurityException var41) {
                        arg0.method463(false, -17);
                    } catch (IOException var42) {
                        arg0.method463(false, -18);
                    } catch (NullPointerException var43) {
                        arg0.method463(false, -19);
                    } catch (Exception var44) {
                        arg0.method463(false, -20);
                    } catch (Throwable var45) {
                        arg0.method463(false, -21);
                    }
                } else {
                    arg0.method463(false, var3.field4793[var7]);
                }
            }
            arg0.method480(var6, true);
            arg0.method432(-4931, arg0.field1068 - var6);
            var3.method1502((byte) -82);
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(ZLve;)I", line = 1241)
    public final int method1767(boolean arg0, class255 arg1) {
        field4291++;
        int var3 = 0;
        int var4 = 0;
        int var5 = arg1.field4343;
        int var6 = this.field4343;
        if (!arg0) {
            return 108;
        }
        int var7 = arg1.field4343;
        int var8 = this.field4343;
        int var9 = 0;
        int var10 = 0;
        while (var6 != 0 && var5 != 0) {
            if (var4 == 156 || var4 == 230) {
                var4 = 101;
            } else if (var4 == 140 || var4 == 198) {
                var4 = 69;
            } else if (var4 == 223) {
                var4 = 115;
            } else {
                var4 = this.field4297[var9] & 0xFF;
                var9++;
            }
            if (class63.method384(var4, false)) {
                var8++;
            } else {
                var6--;
            }
            if (var3 == 156 || var3 == 230) {
                var3 = 101;
            } else if (var3 == 140 || var3 == 198) {
                var3 = 69;
            } else if (var3 == 223) {
                var3 = 115;
            } else {
                var3 = arg1.field4297[var10] & 0xFF;
                var10++;
            }
            if (class63.method384(var3, false)) {
                var7++;
            } else {
                var5--;
            }
            if (class132.field2215[var3] > class132.field2215[var4]) {
                return -1;
            }
            if (class132.field2215[var4] > class132.field2215[var3]) {
                return 1;
            }
        }
        if (var8 >= var7) {
            return var8 <= var7 ? 0 : 1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(ZLve;)Z", line = 1330)
    public final boolean method1768(boolean arg0, class255 arg1) {
        field4326++;
        if (arg1.field4343 > this.field4343) {
            return false;
        }
        for (int var3 = 0; var3 < arg1.field4343; var3++) {
            if (this.field4297[var3] != arg1.field4297[var3]) {
                return false;
            }
        }
        if (!arg0) {
            field4356 = -5;
        }
        return true;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V", line = 1354)
    public final void method1769(int arg0, int arg1, byte arg2, Graphics arg3) {
        if (arg2 > -92) {
            this.method1749(-79);
        }
        field4339++;
        String var5;
        try {
            var5 = new String(this.field4297, 0, this.field4343, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field4297, 0, this.field4343);
        }
        arg3.drawString(var5, arg0, arg1);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIZ)V", line = 1374)
    public static final void method1770(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field4353++;
        if (class11.field156 >= arg4 && arg0 >= class261.field4427) {
            boolean var6;
            if (arg3 < class125.field2082) {
                arg3 = class125.field2082;
                var6 = false;
            } else if (arg3 > class30.field473) {
                var6 = false;
                arg3 = class30.field473;
            } else {
                var6 = true;
            }
            boolean var7;
            if (class125.field2082 > arg1) {
                arg1 = class125.field2082;
                var7 = false;
            } else if (arg1 > class30.field473) {
                arg1 = class30.field473;
                var7 = false;
            } else {
                var7 = true;
            }
            if (class261.field4427 <= arg4) {
                class30.method170(arg1, class250.field4213[arg4++], arg3, arg2, -30310);
            } else {
                arg4 = class261.field4427;
            }
            if (class11.field156 < arg0) {
                arg0 = class11.field156;
            } else {
                class30.method170(arg1, class250.field4213[arg0--], arg3, arg2, -30310);
            }
            if (var6 && var7) {
                for (int var8 = arg4; var8 <= arg0; var8++) {
                    int[] var9 = class250.field4213[var8];
                    var9[arg3] = var9[arg1] = arg2;
                }
            } else if (var6) {
                for (int var11 = arg4; var11 <= arg0; var11++) {
                    class250.field4213[var11][arg3] = arg2;
                }
            } else if (var7) {
                for (int var10 = arg4; var10 <= arg0; var10++) {
                    class250.field4213[var10][arg1] = arg2;
                }
            }
        }
        if (arg5) {
            field4358 = -54;
        }
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)Lve;", line = 1479)
    public final class255 method1771(int arg0) {
        field4302++;
        int var2;
        for (var2 = 0; this.field4343 > var2 && (this.field4297[var2] >= 0 && this.field4297[var2] <= 32 || (this.field4297[var2] & 0xFF) == 160); var2++) {
        }
        int var3;
        for (var3 = this.field4343; var2 < var3 && (this.field4297[var3 - 1] >= 0 && this.field4297[var3 - 1] <= 32 || (this.field4297[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (var2 == 0 && this.field4343 == var3) {
            return this;
        }
        class255 var4 = new class255();
        if (arg0 != 255) {
            field4360 = (class255) null;
        }
        var4.field4343 = var3 - var2;
        var4.field4297 = new byte[var4.field4343];
        for (int var5 = 0; var5 < var4.field4343; var5++) {
            var4.field4297[var5] = this.field4297[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lve;III)Lve;", line = 1522)
    public final class255 method1772(class255 arg0, int arg1, int arg2, int arg3) {
        field4344++;
        if (!this.field4334) {
            throw new IllegalArgumentException();
        } else if (arg3 >= 0 && arg2 >= arg3 && arg2 <= arg0.field4343) {
            this.field4333 = 0;
            if ((this.field4343 + arg2 - arg3) > this.field4297.length) {
                int var5;
                for (var5 = 1; var5 < this.field4343 + arg0.field4343; var5 += var5) {
                }
                byte[] var6 = new byte[var5];
                class36.method216(this.field4297, 0, var6, 0, this.field4343);
                this.field4297 = var6;
            }
            class36.method216(arg0.field4297, arg3, this.field4297, this.field4343, arg2 - arg3);
            if (arg1 != 30535) {
                field4352 = (class255) null;
            }
            this.field4343 += arg2 - arg3;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(Ljava/applet/Applet;I)Ljava/lang/Object;", line = 1565)
    public final Object method1773(Applet arg0, int arg1) throws Throwable {
        field4301++;
        String var3 = new String(this.field4297, arg1, this.field4343);
        Object var4 = class179.method1267(arg0, 32448, (Object[]) null, var3);
        if (var4 instanceof String) {
            byte[] var5 = ((String) var4).getBytes();
            var4 = class33.method185(var5, var5.length, 0, false);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "(I)I", line = 1596)
    public final int method1774(int arg0) {
        if (arg0 == -41) {
            field4349++;
            return this.field4343;
        } else {
            return 66;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lve;Lve;I)Lve;", line = 1608)
    public final class255 method1775(class255 arg0, class255 arg1, int arg2) {
        if (arg2 != -1) {
            return (class255) null;
        }
        int var4 = this.field4343;
        int var5 = 0;
        field4321++;
        int var6 = arg0.field4343 - arg1.field4343;
        while (true) {
            int var7 = this.method1738(var5, arg1, 100);
            if (var7 < 0) {
                int var8 = 0;
                class255 var9 = class285.method2025(var4, (byte) 125);
                while (true) {
                    int var10 = this.method1738(var8, arg1, 125);
                    if (var10 < 0) {
                        while (this.field4343 > var8) {
                            var9.method1750(this.field4297[var8++] & 0xFF, ~arg2);
                        }
                        return var9;
                    }
                    while (var10 > var8) {
                        var9.method1750(this.field4297[var8++] & 0xFF, 0);
                    }
                    var9.method1765(arg0, 55);
                    var8 += arg1.field4343;
                }
            }
            var5 = arg1.field4343 + var7;
            var4 += var6;
        }
    }

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "(B)Z", line = 1663)
    public final boolean method1776(byte arg0) {
        field4327++;
        if (arg0 < 104) {
            field4358 = 64;
        }
        return this.method1782((byte) 78, 10);
    }

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "(I)Lve;", line = 1677)
    public final class255 method1777(int arg0) {
        field4317++;
        class255 var2 = new class255();
        var2.field4343 = this.field4343;
        var2.field4297 = new byte[this.field4343];
        for (int var3 = 0; var3 < this.field4343; var3++) {
            byte var4 = this.field4297[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field4297[var3] = var4;
        }
        if (arg0 != -157) {
            field4357 = (int[]) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(Z)Lve;", line = 1708)
    public final class255 method1778(boolean arg0) {
        field4324++;
        if (!this.field4334) {
            throw new IllegalArgumentException();
        }
        this.field4333 = 0;
        if (!arg0) {
            this.method1740(false);
        }
        if (this.field4297.length != this.field4343) {
            byte[] var2 = new byte[this.field4343];
            class36.method216(this.field4297, 0, var2, 0, this.field4343);
            this.field4297 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(ILve;)Z", line = 1738)
    public final boolean method1779(int arg0, class255 arg1) {
        field4310++;
        if (arg1 == null) {
            return false;
        } else if (this.field4343 == arg1.field4343) {
            int var3 = 0;
            int var4 = 103 / ((49 - arg0) / 33);
            while (this.field4343 > var3) {
                byte var5 = arg1.field4297[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                byte var6 = this.field4297[var3];
                if (var6 >= 65 && var6 <= 90 || var6 >= -64 && var6 <= -34 && var6 != -41) {
                    var6 = (byte) (var6 + 32);
                }
                if (var5 != var6) {
                    return false;
                }
                var3++;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(III)Lve;", line = 1780)
    public final class255 method1780(int arg0, int arg1, int arg2) {
        class255 var4 = new class255();
        var4.field4297 = new byte[arg0 - arg2];
        var4.field4343 = arg0 - arg2;
        if (arg1 == -10449) {
            class36.method216(this.field4297, arg2, var4.field4297, 0, var4.field4343);
            field4319++;
            return var4;
        } else {
            return (class255) null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(Lve;I)Z", line = 1820)
    public final boolean method1781(class255 arg0, int arg1) {
        field4336++;
        if (this.field4343 < arg0.field4343) {
            return false;
        }
        int var3 = this.field4343 - arg0.field4343;
        if (arg1 <= 112) {
            return false;
        }
        for (int var4 = 0; var4 < arg0.field4343; var4++) {
            if (this.field4297[var4 + var3] != arg0.field4297[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(BI)Z", line = 1852)
    private final boolean method1782(byte arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        field4323++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        int var5 = -57 / ((-arg0 - 64) / 37);
        int var6 = 0;
        for (int var7 = 0; var7 < this.field4343; var7++) {
            int var8 = this.field4297[var7] & 0xFF;
            if (var7 == 0) {
                if (var8 == 45) {
                    var4 = true;
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
                return false;
            }
            if (arg1 <= var8) {
                return false;
            }
            if (var4) {
                var8 = -var8;
            }
            int var9 = arg1 * var6 + var8;
            if (var9 / arg1 != var6) {
                return false;
            }
            var6 = var9;
            var3 = true;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLjava/awt/FontMetrics;)I", line = 1933)
    public final int method1783(byte arg0, FontMetrics arg1) {
        field4293++;
        String var3;
        try {
            var3 = new String(this.field4297, 0, this.field4343, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field4297, 0, this.field4343);
        }
        if (arg0 != -4) {
            field4357 = (int[]) null;
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "(B)Lve;", line = 1956)
    public final class255 method1784(byte arg0) {
        field4340++;
        class255 var2 = new class255();
        var2.field4343 = this.field4343;
        var2.field4297 = new byte[var2.field4343];
        int var3 = 0;
        if (arg0 <= 24) {
            this.method1783((byte) -61, (FontMetrics) null);
        }
        while (var3 < this.field4343) {
            var2.field4297[this.field4343 - var3 - 1] = this.field4297[var3];
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(Ljava/applet/Applet;I)V", line = 1978)
    public final void method1785(Applet arg0, int arg1) throws Throwable {
        field4314++;
        if (arg1 == 29913) {
            String var3 = new String(this.field4297, 0, this.field4343);
            class179.method1266(var3, arg0, 26362);
        }
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(II)Lve;", line = 2002)
    public final class255 method1786(int arg0, int arg1) {
        field4328++;
        if (arg1 != 9751) {
            field4358 = -95;
        }
        return this.method1780(this.field4343, -10449, arg0);
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(Z)Lve;", line = 2017)
    public final class255 method1787(boolean arg0) {
        boolean var2 = arg0;
        class255 var3 = new class255();
        var3.field4343 = this.field4343;
        var3.field4297 = new byte[this.field4343];
        for (int var4 = 0; var4 < this.field4343; var4++) {
            byte var5 = this.field4297[var4];
            if (var5 == 95) {
                var3.field4297[var4] = 32;
                var2 = true;
            } else if (var5 >= 97 && var5 <= 122 && var2) {
                var2 = false;
                var3.field4297[var4] = (byte) (var5 - 32);
            } else {
                var2 = false;
                var3.field4297[var4] = var5;
            }
        }
        field4311++;
        return var3;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B[B)[B", line = 2057)
    public static final byte[] method1788(byte arg0, byte[] arg1) {
        field4351++;
        if (arg0 != -128) {
            return (byte[]) null;
        } else if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class36.method216(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lve;B)I", line = 2075)
    public final int method1789(class255 arg0, byte arg1) {
        field4313++;
        int var3 = -34 % ((arg1 + 36) / 42);
        int var4;
        if (arg0.field4343 < this.field4343) {
            var4 = arg0.field4343;
        } else {
            var4 = this.field4343;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            if ((arg0.field4297[var5] & 0xFF) > (this.field4297[var5] & 0xFF)) {
                return -1;
            }
            if ((arg0.field4297[var5] & 0xFF) < (this.field4297[var5] & 0xFF)) {
                return 1;
            }
        }
        if (this.field4343 < arg0.field4343) {
            return -1;
        } else if (this.field4343 <= arg0.field4343) {
            return 0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ve", name = "hashCode", descriptor = "()I", line = 2119)
    public final int hashCode() {
        field4337++;
        return this.method1740(true);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLve;)I", line = 2132)
    public final int method1790(byte arg0, class255 arg1) {
        int var3 = -49 % ((arg0 - 52) / 49);
        field4292++;
        return this.method1738(0, arg1, 104);
    }
}
