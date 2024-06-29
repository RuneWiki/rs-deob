import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class85 {

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Lpd;")
    private static class94 field2127 = class28.method249(-89, "Press (Wchange your password(W on front page)3");

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "Lpd;")
    public static class94 field2132 = class28.method249(-64, "@or2@");

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "Lpd;")
    public static class94 field2129 = class28.method249(20, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "Lpd;")
    public static class94 field2143 = class28.method249(109, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "Lpd;")
    public static class94 field2145 = class28.method249(-60, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field2133 = 0;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "Lpd;")
    public static class94 field2146 = class28.method249(107, ":chalreq:");

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "Lpd;")
    private static class94 field2140 = class28.method249(-75, "Unable to find ");

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "Lpd;")
    public static class94 field2144 = field2127;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "Lpd;")
    private static class94 field2150 = class28.method249(-100, "Your account has been disabled)3");

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Lpd;")
    public static class94 field2128 = field2150;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "Lpd;")
    public static class94 field2153 = class28.method249(69, "@yel@*V");

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
    public static int field2152 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "[Loe;")
    public static class89[] field2138 = new class89[2048];

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "Lpd;")
    public static class94 field2135 = field2140;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "[I")
    public static int[] field2130;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "[I")
    public static int[] field2134;

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I)V", line = 2)
    public class85(int arg0) {
        class43.field1083 = arg0;
        class12.field310 = class115.method856(true);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lp;I)V", line = 13)
    public static final synchronized void method616(class93 arg0, int arg1) {
        class89.field2315 = arg0;
        field2141++;
        if (arg1 <= 12) {
            method624(-77, 70, 2);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([II)V", line = 29)
    public static final synchronized void method617(int[] arg0, int arg1) {
        int var2 = 0;
        int var3 = arg1 - 7;
        while (var2 < var3) {
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
        }
        var3 += 7;
        while (var2 < var3) {
            arg0[var2++] = 0;
        }
        if (class89.field2315 != null) {
            class89.field2315.method424(arg0, 0, var3);
        }
        class55.method434((byte) 34, var3);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "()V", line = 53)
    public void method490() {
        field2147++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILs;)V", line = 66)
    public static final void method618(int arg0, class111 arg1) {
        field2151++;
        class46.field1135 = arg1;
        int var2 = -99 % ((-arg0 - 20) / 46);
        class28.field801 = class46.field1135.method825(true, 16);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([BZ)[B", line = 77)
    public static final byte[] method619(byte[] arg0, boolean arg1) {
        field2149++;
        class122 var2 = new class122(arg0);
        int var3 = var2.method943(-1025);
        int var4 = var2.method952(arg1);
        if (var4 < 0 || class84.field2119 != 0 && class84.field2119 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var8 = new byte[var4];
            var2.method945(255, var4, var8, 0);
            return var8;
        } else {
            int var5 = var2.method952(arg1);
            if (var5 < 0 || class84.field2119 != 0 && class84.field2119 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class131.method1039(var6, var5, arg0, var4, 9);
            } else {
                try {
                    DataInputStream var7 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, var4)));
                    var7.readFully(var6);
                    var7.close();
                } catch (IOException var9) {
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 137)
    public static void method620(int arg0) {
        field2128 = null;
        field2153 = null;
        field2129 = null;
        field2135 = null;
        field2127 = null;
        if (arg0 >= 0) {
            field2146 = null;
        }
        field2140 = null;
        field2132 = null;
        field2143 = null;
        field2130 = null;
        field2138 = null;
        field2150 = null;
        field2144 = null;
        field2134 = null;
        field2146 = null;
        field2145 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V", line = 164)
    public static final void method621(int arg0, int arg1, int arg2) {
        class107.field2670.method326(175, -116);
        class2.field51++;
        class107.field2670.method964(arg2, 1526613544);
        field2137++;
        class107.field2670.method919(arg1, arg0 ^ 0xFF0007);
        if (arg0 != 7) {
            method621(-41, -61, 55);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V", line = 181)
    public static final synchronized void method622(int arg0, int arg1) {
        field2139++;
        if (arg0 < -58) {
            if (class89.field2315 != null) {
                class89.field2315.method423(arg1);
            }
            class55.method434((byte) 26, arg1);
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)Lg;", line = 223)
    public static final class39 method623(int arg0, int arg1) {
        field2142++;
        class39 var2 = (class39) class107.field2652.method1007((long) arg0, (byte) -91);
        if (var2 != null) {
            return var2;
        }
        class39 var3 = class38.method292(class55.field1390, false, arg0, 1, class23.field597);
        if (arg1 >= -40) {
            return null;
        } else {
            if (var3 != null) {
                class107.field2652.method1012(50, var3, (long) arg0);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(III)I", line = 248)
    public static final int method624(int arg0, int arg1, int arg2) {
        field2136++;
        class75 var3 = (class75) class86.field2185.method19(25239, (long) arg2);
        if (var3 == null) {
            return 0;
        } else {
            if (arg0 >= -126) {
                method617(null, -78);
            }
            return arg1 >= 0 && arg1 < var3.field1826.length ? var3.field1826[arg1] : 0;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(J)V", line = 309)
    public void method486(long arg0) {
        field2148++;
    }
}
