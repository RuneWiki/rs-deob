import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class258 implements class111 {

    @OriginalMember(owner = "client!oh", name = "P", descriptor = "Z")
    private boolean field4468 = true;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "[I")
    public static int[] field4435 = new int[25];

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "I")
    public static int field4453 = 0;

    @OriginalMember(owner = "client!oh", name = "kb", descriptor = "I")
    public static int field4489 = 0;

    @OriginalMember(owner = "client!oh", name = "E", descriptor = "F")
    public static float field4457;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!oh", name = "B", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!oh", name = "C", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!oh", name = "D", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!oh", name = "F", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!oh", name = "G", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!oh", name = "H", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!oh", name = "I", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!oh", name = "J", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!oh", name = "M", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!oh", name = "N", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!oh", name = "O", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!oh", name = "R", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!oh", name = "S", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!oh", name = "T", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!oh", name = "U", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!oh", name = "V", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!oh", name = "W", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!oh", name = "X", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!oh", name = "Y", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!oh", name = "Z", descriptor = "I")
    public int field4478;

    @OriginalMember(owner = "client!oh", name = "ab", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!oh", name = "bb", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!oh", name = "cb", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!oh", name = "db", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!oh", name = "eb", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!oh", name = "fb", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!oh", name = "gb", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!oh", name = "hb", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!oh", name = "ib", descriptor = "I")
    private int field4487;

    @OriginalMember(owner = "client!oh", name = "jb", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!oh", name = "mb", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!oh", name = "nb", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!oh", name = "ob", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!oh", name = "pb", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!oh", name = "qb", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!oh", name = "lb", descriptor = "[B")
    public byte[] field4490;

    @OriginalMember(owner = "client!oh", name = "Q", descriptor = "[Lnh;")
    public static class223[] field4469;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILoh;)Loh;", line = 13)
    public final class258 method1766(int arg0, class258 arg1) {
        field4475++;
        if (!this.field4468) {
            throw new IllegalArgumentException();
        }
        this.field4487 = 0;
        if (this.field4478 + arg1.field4478 > this.field4490.length) {
            int var3;
            for (var3 = 1; var3 < (this.field4478 + arg1.field4478); var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class275.method1932(this.field4490, 0, var4, 0, this.field4478);
            this.field4490 = var4;
        }
        class275.method1932(arg1.field4490, 0, this.field4490, this.field4478, arg1.field4478);
        int var5 = 65 / ((arg0 + 28) / 56);
        this.field4478 += arg1.field4478;
        return this;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Loc;Loc;I)V", line = 49)
    public static final void method1767(class192 arg0, class192 arg1, int arg2) {
        if (arg1.field3390 != null) {
            arg1.method1298(true);
        }
        arg1.field3400 = arg0.field3400;
        arg1.field3390 = arg0;
        field4495++;
        if (arg2 >= 42) {
            arg1.field3390.field3400 = arg1;
            arg1.field3400.field3390 = arg1;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)Loh;", line = 70)
    public final class258 method1768(int arg0, int arg1) {
        field4459++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class258 var3 = new class258();
        var3.field4490 = new byte[this.field4478 + 1];
        int var4 = -89 % ((arg0 - 51) / 63);
        var3.field4478 = this.field4478 + 1;
        class275.method1932(this.field4490, 0, var3.field4490, 0, this.field4478);
        var3.field4490[this.field4478] = (byte) arg1;
        return var3;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)J", line = 96)
    public final long method1769(int arg0) {
        field4433++;
        long var2 = 0L;
        int var4 = 0;
        if (arg0 != 16) {
            return 54L;
        }
        while (this.field4478 > var4 && var4 < 12) {
            byte var5 = this.field4490[var4];
            var2 *= 37L;
            if (var5 >= 65 && var5 <= 90) {
                var2 += (long) (1 - (65 - var5));
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += (long) (var5 + 1 - 97);
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += (long) (var5 + 27 - 48);
            }
            var4++;
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)Ljava/net/URL;", line = 134)
    public final URL method1770(boolean arg0) throws MalformedURLException {
        field4484++;
        return arg0 ? new URL(new String(this.field4490, 0, this.field4478)) : (URL) null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLoh;)I", line = 152)
    public final int method1771(byte arg0, class258 arg1) {
        if (arg0 != -109) {
            return 66;
        }
        field4479++;
        int var3;
        if (this.field4478 > arg1.field4478) {
            var3 = arg1.field4478;
        } else {
            var3 = this.field4478;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((this.field4490[var4] & 0xFF) < (arg1.field4490[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field4490[var4] & 0xFF) > (arg1.field4490[var4] & 0xFF)) {
                return 1;
            }
        }
        if (this.field4478 < arg1.field4478) {
            return -1;
        } else if (arg1.field4478 >= this.field4478) {
            return 0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZLjava/applet/Applet;)V", line = 197)
    public final void method1772(boolean arg0, Applet arg1) throws Throwable {
        field4464++;
        if (arg0) {
            this.method1800((class258) null, -45);
        }
        String var3 = new String(this.field4490, 0, this.field4478);
        class200.method1330(arg1, 26973, var3);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILoh;Loh;)Loh;", line = 212)
    public final class258 method1773(int arg0, class258 arg1, class258 arg2) {
        int var4 = arg1.field4478 - arg2.field4478;
        field4442++;
        int var5 = this.field4478;
        int var6 = 0;
        while (true) {
            int var7 = this.method1782(arg0 - 145, arg2, var6);
            if (var7 < 0) {
                int var8 = 0;
                class258 var9 = class92.method687(var5, false);
                if (arg0 != 144) {
                    this.equals((Object) null);
                }
                while (true) {
                    int var10 = this.method1782(-1, arg2, var8);
                    if (var10 < 0) {
                        while (this.field4478 > var8) {
                            var9.method1790(this.field4490[var8++] & 0xFF, arg0 ^ 0xEA);
                        }
                        return var9;
                    }
                    while (var8 < var10) {
                        var9.method1790(this.field4490[var8++] & 0xFF, 122);
                    }
                    var9.method1766(arg0 ^ 0xFFFFFF36, arg1);
                    var8 += arg2.field4478;
                }
            }
            var5 += var4;
            var6 = arg2.field4478 + var7;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)Loh;", line = 267)
    public final class258 method1774(byte arg0) {
        class258 var2 = new class258();
        var2.field4478 = this.field4478;
        var2.field4490 = new byte[this.field4478];
        for (int var3 = 0; var3 < this.field4478; var3++) {
            byte var4 = this.field4490[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field4490[var3] = var4;
        }
        if (arg0 < 91) {
            field4489 = 104;
        }
        field4483++;
        return var2;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI)Z", line = 303)
    private final boolean method1775(boolean arg0, int arg1) {
        field4431++;
        boolean var3 = arg0;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field4478; var6++) {
            int var7 = this.field4490[var6] & 0xFF;
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
            if (arg1 <= var7) {
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

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/awt/FontMetrics;B)I", line = 381)
    public final int method1776(FontMetrics arg0, byte arg1) {
        String var3;
        try {
            var3 = new String(this.field4490, 0, this.field4478, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var3 = new String(this.field4490, 0, this.field4478);
        }
        int var5 = -61 / ((arg1 - 68) / 43);
        field4486++;
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BI)Loh;", line = 398)
    public final class258 method1777(byte arg0, int arg1) {
        if (arg0 <= 121) {
            this.method1806(true, 86);
        }
        field4443++;
        return this.method1813(this.field4478, arg1, true);
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(ILoh;)Z", line = 423)
    public final boolean method1778(int arg0, class258 arg1) {
        field4454++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 != -11925) {
            this.method1813(61, -25, true);
        }
        if (this.field4478 != arg1.field4478) {
            return false;
        }
        for (int var3 = 0; var3 < this.field4478; var3++) {
            byte var4 = this.field4490[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            byte var5 = arg1.field4490[var3];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 != var5) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLjava/applet/Applet;)Ljava/lang/Object;", line = 470)
    public final Object method1779(byte arg0, Applet arg1) throws Throwable {
        field4456++;
        if (arg0 != 4) {
            method1780(73, -26, -21, false, 108, -96, 88, -24);
        }
        String var3 = new String(this.field4490, 0, this.field4478);
        Object var4 = class200.method1329(var3, (Object[]) null, (byte) 13, arg1);
        if (var4 instanceof String) {
            byte[] var5 = ((String) var4).getBytes();
            var4 = class285.method2004(var5.length, var5, 0, 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIZIIII)V", line = 493)
    public static final void method1780(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!arg3) {
            field4463 = 82;
        }
        field4439++;
        if (arg2 < 1 || arg6 < 1 || arg2 > 102 || arg6 > 102) {
            return;
        }
        if (!class110.method807(720049666) && (class94.field1653[0][arg2][arg6] & 0x2) == 0) {
            int var8 = arg0;
            if ((class94.field1653[arg0][arg2][arg6] & 0x8) != 0) {
                var8 = 0;
            }
            if (class265.field4626 != var8) {
                return;
            }
        }
        int var9 = arg0;
        if (arg0 < 3 && (class94.field1653[1][arg2][arg6] & 0x2) == 2) {
            var9 = arg0 + 1;
        }
        class153.method1045(arg6, var9, class243.field4216[arg0], arg0, -5707, arg4, arg2);
        if (arg7 >= 0) {
            boolean var10 = class119.field2110;
            class119.field2110 = true;
            class284.method1995(class243.field4216[arg0], arg5, arg2, arg1, arg7, var9, false, arg6, arg0, false, (byte) -126);
            class119.field2110 = var10;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I[BBII)I", line = 543)
    public final int method1781(int arg0, byte[] arg1, byte arg2, int arg3, int arg4) {
        class275.method1932(this.field4490, arg3, arg1, arg4, arg0 - arg3);
        if (arg2 < 101) {
            return -30;
        } else {
            field4480++;
            return arg0 - arg3;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILoh;I)I", line = 558)
    public final int method1782(int arg0, class258 arg1, int arg2) {
        field4449++;
        int[] var4 = new int[arg1.field4478];
        int[] var5 = new int[256];
        int[] var6 = new int[arg1.field4478];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg1.field4478;
        }
        for (int var8 = 1; var8 <= arg1.field4478; var8++) {
            var4[var8 - 1] = (arg1.field4478 << 1) - var8;
            var5[class2.method15(arg1.field4490[var8 - 1], 255)] = arg1.field4478 - var8;
        }
        if (arg0 != -1) {
            field4453 = -51;
        }
        int var9 = arg1.field4478 + 1;
        int var10 = arg1.field4478;
        while (var10 > 0) {
            var6[var10 - 1] = var9;
            while (arg1.field4478 >= var9 && arg1.field4490[var9 - 1] != arg1.field4490[var10 - 1]) {
                if (var4[var9 - 1] >= (arg1.field4478 - var10)) {
                    var4[var9 - 1] = arg1.field4478 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var10--;
            var9--;
        }
        int var11 = var9;
        int var12 = arg1.field4478 + 1 - var9;
        int var13 = 1;
        int var14 = 0;
        for (int var15 = 1; var15 <= var12; var15++) {
            var6[var15 - 1] = var14;
            while (var14 >= 1 && arg1.field4490[var14 - 1] != arg1.field4490[var15 - 1]) {
                var14 = var6[var14 - 1];
            }
            var14++;
        }
        while (arg1.field4478 > var11) {
            for (int var16 = var13; var16 <= var11; var16++) {
                if (arg1.field4478 + var11 - var16 <= var4[var16 + -1]) {
                    var4[var16 - 1] = arg1.field4478 + var11 - var16;
                }
            }
            var13 = var11 + 1;
            var11 = var11 + var12 - var6[var12 - 1];
            var12 = var6[var12 - 1];
        }
        int var18;
        for (int var17 = arg2 + arg1.field4478 - 1; var17 < this.field4478; var17 += Math.max(var5[this.field4490[var17] & 0xFF], var4[var18])) {
            for (var18 = arg1.field4478 - 1; var18 >= 0 && this.field4490[var17] == arg1.field4490[var18]; var18--) {
                var17--;
            }
            if (var18 == -1) {
                return var17 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILoh;Z)V", line = 673)
    public static final void method1783(int arg0, class258 arg1, boolean arg2) {
        class258 var3 = arg1.method1774((byte) 111);
        int var4 = 0;
        short[] var5 = new short[16];
        field4446++;
        for (int var6 = 0; var6 < class137.field2336; var6++) {
            class61 var7 = class186.method1256((byte) 121, var6);
            if ((!arg2 || var7.field1014) && var7.field1027 == -1 && var7.field1048 == -1 && var7.field1033 == 0 && var7.field1053.method1774((byte) 125).method1808(var3, arg0 ^ 0x21B4) != -1) {
                if (var4 >= 250) {
                    class96.field1687 = -1;
                    class248.field4289 = null;
                    return;
                }
                if (var4 >= var5.length) {
                    short[] var8 = new short[var5.length * 2];
                    for (int var9 = 0; var9 < var4; var9++) {
                        var8[var9] = var5[var9];
                    }
                    var5 = var8;
                }
                var5[var4++] = (short) var6;
            }
        }
        class299.field5120 = 0;
        class96.field1687 = var4;
        class248.field4289 = var5;
        class258[] var10 = new class258[class96.field1687];
        for (int var11 = 0; var11 < class96.field1687; var11++) {
            var10[var11] = class186.method1256((byte) 125, var5[var11]).field1053;
        }
        class271.method1913(var10, class248.field4289, 12640);
        if (arg0 != 8628) {
            field4463 = 76;
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(Z)Loh;", line = 746)
    public final class258 method1784(boolean arg0) {
        if (!arg0) {
            this.method1820(-109);
        }
        class258 var2 = new class258();
        var2.field4478 = this.field4478;
        field4477++;
        var2.field4490 = new byte[var2.field4478];
        for (int var3 = 0; var3 < this.field4478; var3++) {
            var2.field4490[this.field4478 - var3 - 1] = this.field4490[var3];
        }
        return var2;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)V", line = 770)
    public static final void method1785(int arg0, int arg1) {
        class173.field3095.method1156(arg1, 0);
        field4429++;
        class38.field504.method1156(arg1, 0);
        class159.field2712.method1156(arg1, 0);
        if (arg0 != 20676) {
            method1819(52, 77, -40, 92, 22, 34, (byte) -56);
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)Loh;", line = 787)
    public final class258 method1786(byte arg0) {
        field4467++;
        class258 var2 = new class258();
        var2.field4478 = this.field4478;
        var2.field4490 = new byte[this.field4478];
        if (arg0 != 107) {
            this.field4490 = (byte[]) null;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field4478; var4++) {
            byte var5 = this.field4490[var4];
            if (var5 == 95) {
                var3 = true;
                var2.field4490[var4] = 32;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var3 = false;
                var2.field4490[var4] = (byte) (var5 - 32);
            } else {
                var2.field4490[var4] = var5;
                var3 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)Loh;", line = 839)
    public final class258 method1787(int arg0) {
        field4427++;
        if (!this.field4468) {
            throw new IllegalArgumentException();
        }
        this.field4487 = 0;
        if (this.field4490.length != this.field4478) {
            byte[] var2 = new byte[this.field4478];
            class275.method1932(this.field4490, 0, var2, 0, this.field4478);
            this.field4490 = var2;
        }
        return arg0 == -123 ? this : (class258) null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Loh;B)Z", line = 870)
    public final boolean method1788(class258 arg0, byte arg1) {
        field4485++;
        if (this.field4478 < arg0.field4478) {
            return false;
        }
        int var3 = this.field4478 - arg0.field4478;
        int var4 = 0;
        int var5 = -14 / ((57 - arg1) / 41);
        while (arg0.field4478 > var4) {
            if (this.field4490[var3 + var4] != arg0.field4490[var4]) {
                return false;
            }
            var4++;
        }
        return true;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(BI)I", line = 897)
    public final int method1789(byte arg0, int arg1) {
        byte var3 = (byte) arg1;
        field4476++;
        int var4 = 0;
        int var5 = 0;
        if (arg0 >= -93) {
            this.toString();
        }
        while (var5 < this.field4478) {
            if (this.field4490[var5] == var3) {
                var4++;
            }
            var5++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(II)Loh;", line = 923)
    public final class258 method1790(int arg0, int arg1) {
        field4470++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field4468) {
            this.field4487 = 0;
            if (arg1 != 122) {
                return (class258) null;
            }
            if (this.field4490.length == this.field4478) {
                int var3;
                for (var3 = 1; var3 <= this.field4478; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class275.method1932(this.field4490, 0, var4, 0, this.field4478);
                this.field4490 = var4;
            }
            this.field4490[this.field4478++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(BLoh;)I", line = 965)
    public final int method1791(byte arg0, class258 arg1) {
        field4434++;
        int var3 = 0;
        int var4 = 0;
        int var5 = this.field4478;
        int var6 = arg1.field4478;
        int var7 = arg1.field4478;
        int var8 = this.field4478;
        int var9 = -91 % ((-arg0 - 89) / 33);
        int var10 = 0;
        int var11 = 0;
        while (var5 != 0 && var6 != 0) {
            if (var3 == 156 || var3 == 230) {
                var3 = 101;
            } else if (var3 == 140 || var3 == 198) {
                var3 = 69;
            } else if (var3 == 223) {
                var3 = 115;
            } else {
                var3 = this.field4490[var10] & 0xFF;
                var10++;
            }
            if (class225.method1511(var3, false)) {
                var8++;
            } else {
                var5--;
            }
            if (var4 == 156 || var4 == 230) {
                var4 = 101;
            } else if (var4 == 140 || var4 == 198) {
                var4 = 69;
            } else if (var4 == 223) {
                var4 = 115;
            } else {
                var4 = arg1.field4490[var11] & 0xFF;
                var11++;
            }
            if (class225.method1511(var4, false)) {
                var7++;
            } else {
                var6--;
            }
            if (class226.field3896[var4] > class226.field3896[var3]) {
                return -1;
            }
            if (class226.field3896[var4] < class226.field3896[var3]) {
                return 1;
            }
        }
        if (var8 >= var7) {
            return var8 <= var7 ? 0 : 1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V", line = 1077)
    public static final void method1792(int arg0) {
        if (arg0 >= -65) {
            field4489 = 122;
        }
        class191.field3382 = 0;
        field4491++;
        class271.field4689 = 0;
        class188.field3339 = 0;
        class225.field3866 = null;
        class203.field3526 = 0;
        class5.field64 = 0;
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)[B", line = 1094)
    public final byte[] method1793(int arg0) {
        if (arg0 != 37) {
            this.method1798(-3, -84);
        }
        byte[] var2 = new byte[this.field4478];
        class275.method1932(this.field4490, 0, var2, 0, this.field4478);
        field4447++;
        return var2;
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)Z", line = 1108)
    public final boolean method1794(int arg0) {
        if (arg0 != -17054) {
            this.method1794(-11);
        }
        field4438++;
        return this.method1775(false, 10);
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)V", line = 1119)
    public static void method1795(byte arg0) {
        field4435 = null;
        field4469 = null;
        if (arg0 >= -15) {
            method1785(121, 54);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BILjava/awt/Graphics;I)V", line = 1146)
    public final void method1796(byte arg0, int arg1, Graphics arg2, int arg3) {
        String var5;
        try {
            var5 = new String(this.field4490, 0, this.field4478, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field4490, 0, this.field4478);
        }
        field4460++;
        if (arg0 != 38) {
            field4457 = 0.23905522F;
        }
        arg2.drawString(var5, arg1, arg3);
    }

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "(I)Loh;", line = 1167)
    public final class258 method1797(int arg0) {
        field4452++;
        if (arg0 <= 6) {
            field4453 = 31;
        }
        class258 var2 = class162.method1085(-83, this.method1769(16));
        return var2 == null ? class120.field2117 : var2;
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(II)I", line = 1186)
    public final int method1798(int arg0, int arg1) {
        if (arg1 == 101) {
            field4458++;
            return this.field4490[arg0] & 0xFF;
        } else {
            return -95;
        }
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(B)I", line = 1198)
    public final int method1799(byte arg0) {
        field4450++;
        int var2 = 0;
        if (arg0 != 52) {
            this.method1786((byte) 33);
        }
        for (int var3 = 0; var3 < this.field4478; var3++) {
            var2 = (var2 << 5) - (var2 - (this.field4490[var3] & 0xFF));
        }
        return var2;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Loh;I)Z", line = 1231)
    public final boolean method1800(class258 arg0, int arg1) {
        field4437++;
        if (arg1 != 26068) {
            return true;
        } else if (arg0.field4478 > this.field4478) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field4478; var3++) {
                byte var4 = this.field4490[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg0.field4490[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(B)Loh;", line = 1266)
    public final class258 method1801(byte arg0) {
        field4471++;
        class258 var2 = new class258();
        var2.field4478 = this.field4478;
        if (arg0 < 58) {
            return (class258) null;
        }
        var2.field4490 = new byte[this.field4478];
        byte var3 = 2;
        for (int var4 = 0; var4 < this.field4478; var4++) {
            byte var5 = this.field4490[var4];
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
            var2.field4490[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLjava/net/URL;)Ljava/net/URL;", line = 1334)
    public final URL method1802(byte arg0, URL arg1) throws MalformedURLException {
        field4440++;
        if (arg0 <= 22) {
            this.field4478 = 46;
        }
        return new URL(arg1, new String(this.field4490, 0, this.field4478));
    }

    @OriginalMember(owner = "client!oh", name = "toString", descriptor = "()Ljava/lang/String;", line = 1359)
    public final String toString() {
        field4473++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "(I)J", line = 1370)
    public final long method1803(int arg0) {
        field4455++;
        long var2 = 0L;
        if (arg0 != -9598) {
            field4457 = 1.1040637F;
        }
        for (int var4 = 0; var4 < this.field4478; var4++) {
            var2 = (var2 << 5) + (long) (this.field4490[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIIIII)V", line = 1396)
    public static final void method1804(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4488++;
        int var9 = arg2 - arg4;
        int var10 = arg3 - arg6;
        int var11 = (arg5 - arg7 << 16) / var9;
        int var12 = (arg1 - arg0 << 16) / var10;
        int var13 = -60 % ((arg8 + 49) / 62);
        class98.method743(arg2, var12, arg7, arg3, 0, arg0, arg4, 26284, 0, var11, arg6);
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(II)V", line = 1414)
    public final void method1805(int arg0, int arg1) {
        this.field4487 = 0;
        field4474++;
        if (!this.field4468) {
            throw new IllegalArgumentException();
        } else if (arg1 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg1 > this.field4490.length) {
                int var3;
                for (var3 = 1; var3 < arg1; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class275.method1932(this.field4490, 0, var4, 0, this.field4478);
                this.field4490 = var4;
            }
            for (int var5 = this.field4478; var5 < arg1; var5++) {
                this.field4490[var5] = 32;
            }
            if (arg0 <= 104) {
                this.method1773(59, (class258) null, (class258) null);
            }
            this.field4478 = arg1;
        }
    }

    @OriginalMember(owner = "client!oh", name = "hashCode", descriptor = "()I", line = 1465)
    public final int hashCode() {
        field4448++;
        return this.method1799((byte) 52);
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(ZI)[Loh;", line = 1475)
    public final class258[] method1806(boolean arg0, int arg1) {
        if (arg0) {
            this.field4468 = false;
        }
        field4481++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4478; var4++) {
            if (this.field4490[var4] == arg1) {
                var3++;
            }
        }
        class258[] var5 = new class258[var3 + 1];
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        }
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = 0; this.field4490[var7 + var9] != arg1; var9++) {
            }
            var5[var6++] = this.method1813(var7 + var9, var7, true);
            var7 += var9 + 1;
        }
        var5[var3] = this.method1813(this.field4478, var7, true);
        return var5;
    }

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "(B)I", line = 1536)
    public final int method1807(byte arg0) {
        if (arg0 < 76) {
            field4469 = (class223[]) null;
        }
        field4428++;
        return this.method1809(-46, 10);
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(Loh;I)I", line = 1548)
    public final int method1808(class258 arg0, int arg1) {
        if (arg1 != 0) {
            field4463 = 87;
        }
        field4451++;
        return this.method1782(-1, arg0, 0);
    }

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "(II)I", line = 1560)
    public final int method1809(int arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        field4465++;
        int var3 = 0;
        boolean var4 = false;
        boolean var5 = false;
        if (arg0 != -46) {
            return -34;
        }
        for (int var6 = 0; var6 < this.field4478; var6++) {
            int var7 = this.field4490[var6] & 0xFF;
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
            if (var7 >= arg1) {
                throw new NumberFormatException();
            }
            if (var5) {
                var7 = -var7;
            }
            int var8 = arg1 * var3 + var7;
            if (var8 / arg1 != var3) {
                throw new NumberFormatException();
            }
            var3 = var8;
            var4 = true;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var3;
    }

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "(B)V", line = 1638)
    public final void method1810(byte arg0) {
        if (arg0 != 88) {
            return;
        }
        String var2;
        try {
            var2 = new String(this.field4490, 0, this.field4478, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field4490, 0, this.field4478);
        }
        field4493++;
        System.out.println(var2);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIB)I", line = 1659)
    public final int method1811(int arg0, int arg1, byte arg2) {
        field4436++;
        byte var4 = (byte) arg0;
        if (arg2 >= -62) {
            return 53;
        }
        for (int var5 = arg1; var5 < this.field4478; var5++) {
            if (this.field4490[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)Loh;", line = 1683)
    public final class258 method1812(int arg0, int arg1, int arg2) {
        if (arg2 != -1809) {
            return (class258) null;
        }
        field4462++;
        byte var4 = (byte) arg0;
        byte var5 = (byte) arg1;
        class258 var6 = new class258();
        var6.field4478 = this.field4478;
        var6.field4490 = new byte[this.field4478];
        for (int var7 = 0; var7 < this.field4478; var7++) {
            byte var8 = this.field4490[var7];
            if (var4 == var8) {
                var6.field4490[var7] = var5;
            } else {
                var6.field4490[var7] = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIZ)Loh;", line = 1725)
    public final class258 method1813(int arg0, int arg1, boolean arg2) {
        field4461++;
        class258 var4 = new class258();
        var4.field4490 = new byte[arg0 - arg1];
        var4.field4478 = arg0 - arg1;
        class275.method1932(this.field4490, arg1, var4.field4490, 0, var4.field4478);
        if (!arg2) {
            method1819(-68, 23, -76, -104, 61, -82, (byte) 65);
        }
        return var4;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/applet/Applet;B)Loh;", line = 1741)
    public final class258 method1814(Applet arg0, byte arg1) {
        field4432++;
        String var3 = new String(this.field4490, 0, this.field4478);
        String var4 = arg0.getParameter(var3);
        if (arg1 < 60) {
            return (class258) null;
        } else if (var4 == null) {
            return null;
        } else {
            return class96.method702((byte) 35, var4);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILoh;I)Loh;", line = 1759)
    public final class258 method1815(int arg0, int arg1, class258 arg2, int arg3) {
        field4466++;
        if (!this.field4468) {
            throw new IllegalArgumentException();
        } else if (arg0 >= 0 && arg0 <= arg1 && arg2.field4478 >= arg1) {
            this.field4487 = 0;
            if (arg3 <= 52) {
                this.method1798(-27, -6);
            }
            if (this.field4490.length < (this.field4478 + arg1 - arg0)) {
                int var5;
                for (var5 = 1; var5 < this.field4478 + arg2.field4478; var5 += var5) {
                }
                byte[] var6 = new byte[var5];
                class275.method1932(this.field4490, 0, var6, 0, this.field4478);
                this.field4490 = var6;
            }
            class275.method1932(arg2.field4490, arg0, this.field4490, this.field4478, arg1 - arg0);
            this.field4478 += arg1 - arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(Z)I", line = 1805)
    public final int method1816(boolean arg0) {
        field4444++;
        if (arg0) {
            field4453 = 49;
        }
        return this.field4478;
    }

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "(B)Loh;", line = 1820)
    public final class258 method1817(byte arg0) {
        field4494++;
        int var2;
        for (var2 = 0; this.field4478 > var2 && (this.field4490[var2] >= 0 && this.field4490[var2] <= 32 || (this.field4490[var2] & 0xFF) == 160); var2++) {
        }
        if (arg0 != -48) {
            return (class258) null;
        }
        int var3;
        for (var3 = this.field4478; var3 > var2 && (this.field4490[var3 - 1] >= 0 && this.field4490[var3 - 1] <= 32 || (this.field4490[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (var2 == 0 && this.field4478 == var3) {
            return this;
        }
        class258 var4 = new class258();
        var4.field4478 = var3 - var2;
        var4.field4490 = new byte[var4.field4478];
        for (int var5 = 0; var5 < var4.field4478; var5++) {
            var4.field4490[var5] = this.field4490[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!oh", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 1858)
    public final boolean equals(Object arg0) {
        field4430++;
        if (!(arg0 instanceof class258)) {
            throw new IllegalArgumentException();
        }
        return this.method1821(-1, (class258) arg0);
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(BLoh;)Z", line = 1879)
    public final boolean method1818(byte arg0, class258 arg1) {
        field4492++;
        if (arg1.field4478 > this.field4478) {
            return false;
        }
        for (int var3 = 0; var3 < arg1.field4478; var3++) {
            if (this.field4490[var3] != arg1.field4490[var3]) {
                return false;
            }
        }
        int var4 = -117 / ((-arg0 - 58) / 45);
        return true;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIIB)V", line = 1904)
    public static final void method1819(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg6 != -104) {
            method1792(102);
        }
        int var7 = arg3 + arg5;
        field4482++;
        int var8 = arg4 - arg3;
        int var9 = arg2 + arg3;
        for (int var10 = arg5; var10 < var7; var10++) {
            class19.method126(7, arg0, class154.field2638[var10], arg2, arg1);
        }
        int var11 = arg1 - arg3;
        for (int var12 = arg4; var12 > var8; var12--) {
            class19.method126(7, arg0, class154.field2638[var12], arg2, arg1);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class154.field2638[var13];
            class19.method126(7, arg0, var14, arg2, var9);
            class19.method126(7, arg0, var14, var11, arg1);
        }
    }

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "(I)Loh;", line = 1946)
    public final class258 method1820(int arg0) {
        field4441++;
        long var2 = this.method1803(-9598);
        synchronized (oh.class) {
            if (class63.field1112 == null) {
                class63.field1112 = new class144(4096);
            } else {
                for (class48 var5 = (class48) class63.field1112.method986(var2, 0); var5 != null; var5 = (class48) class63.field1112.method982((byte) 100)) {
                    if (this.method1821(-1, var5.field717)) {
                        return var5.field717;
                    }
                }
            }
            class48 var6 = new class48();
            int var7 = -54 % ((arg0 - 12) / 32);
            var6.field717 = this;
            this.field4468 = false;
            class63.field1112.method984((byte) -111, var6, var2);
            return this;
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(ILoh;)Z", line = 1985)
    public final boolean method1821(int arg0, class258 arg1) {
        field4445++;
        if (arg1 == null) {
            return false;
        } else if (this.field4478 == arg1.field4478) {
            if (!this.field4468 || !arg1.field4468) {
                if (this.field4487 == 0) {
                    this.field4487 = this.method1799((byte) 52);
                    if (this.field4487 == 0) {
                        this.field4487 = 1;
                    }
                }
                if (arg1.field4487 == 0) {
                    arg1.field4487 = arg1.method1799((byte) 52);
                    if (arg1.field4487 == 0) {
                        arg1.field4487 = 1;
                    }
                }
                if (this.field4487 != arg1.field4487) {
                    return false;
                }
            }
            if (arg0 != -1) {
                field4435 = (int[]) null;
            }
            for (int var3 = 0; var3 < this.field4478; var3++) {
                if (this.field4490[var3] != arg1.field4490[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
