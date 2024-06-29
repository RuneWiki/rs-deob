import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class143 implements class197 {

    @OriginalMember(owner = "client!lc", name = "gb", descriptor = "Z")
    private boolean field2560 = true;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "[I")
    public static int[] field2511 = new int[5];

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "[J")
    public static long[] field2524 = new long[1000];

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "Llc;")
    public static class143 field2545 = class66.method374("showingVideoAd", -1);

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "Ltg;")
    public static class277 field2518 = new class277(32);

    @OriginalMember(owner = "client!lc", name = "ib", descriptor = "Lng;")
    public static class139 field2562 = new class139(64);

    @OriginalMember(owner = "client!lc", name = "lb", descriptor = "Llc;")
    public static class143 field2565 = class66.method374("weiss:", -1);

    @OriginalMember(owner = "client!lc", name = "kb", descriptor = "F")
    public static float field2564;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!lc", name = "T", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!lc", name = "U", descriptor = "I")
    public int field2548;

    @OriginalMember(owner = "client!lc", name = "V", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!lc", name = "W", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!lc", name = "X", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!lc", name = "Y", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!lc", name = "Z", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!lc", name = "ab", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!lc", name = "bb", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!lc", name = "cb", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!lc", name = "db", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!lc", name = "eb", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!lc", name = "fb", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!lc", name = "hb", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!lc", name = "jb", descriptor = "Lda;")
    public static class102 field2563;

    @OriginalMember(owner = "client!lc", name = "mb", descriptor = "Lgf;")
    public static class7 field2566;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lc", name = "nb", descriptor = "Ljava/lang/Class;")
    public static Class field2567;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "[B")
    public byte[] field2503;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Llc;")
    public final class143 method863(int arg0, int arg1) {
        if (arg1 != -161) {
            field2562 = null;
        }
        field2540++;
        return this.method896(this.field2548, arg0, false);
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)I")
    public final int method864(int arg0, int arg1) {
        if (arg0 != -8952) {
            return -85;
        }
        int var3 = 0;
        byte var4 = (byte) arg1;
        field2507++;
        for (int var5 = 0; var5 < this.field2548; var5++) {
            if (this.field2503[var5] == var4) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/applet/Applet;B)Llc;")
    public final class143 method865(Applet arg0, byte arg1) {
        if (arg1 <= 69) {
            field2564 = -1.3845727F;
        }
        String var3 = new String(this.field2503, 0, this.field2548);
        field2526++;
        String var4 = arg0.getParameter(var3);
        return var4 == null ? null : class270.method1785(var4, -17);
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(II)Llc;")
    public final class143 method866(int arg0, int arg1) {
        field2530++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        } else if (arg1 == 8505) {
            class143 var3 = new class143();
            var3.field2503 = new byte[this.field2548 + 1];
            var3.field2548 = this.field2548 + 1;
            class275.method1813(this.field2503, 0, var3.field2503, 0, this.field2548);
            var3.field2503[this.field2548] = (byte) arg0;
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field2514++;
        if (!arg0 instanceof class143) {
            throw new IllegalArgumentException();
        }
        return this.method876((byte) -122, (class143) arg0);
    }

    @OriginalMember(owner = "client!lc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2528++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)V")
    public final void method867(int arg0, boolean arg1) {
        field2553++;
        if (!this.field2560) {
            throw new IllegalArgumentException();
        }
        if (arg1) {
            this.field2548 = 43;
        }
        if (arg0 < 0) {
            throw new IllegalArgumentException();
        }
        if (this.field2503.length < arg0) {
            int var3;
            for (var3 = 1; var3 < arg0; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class275.method1813(this.field2503, 0, var4, 0, this.field2548);
            this.field2503 = var4;
        }
        for (int var5 = this.field2548; var5 < arg0; var5++) {
            this.field2503[var5] = 32;
        }
        this.field2548 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Llc;")
    public final class143 method868(int arg0) {
        field2546++;
        class143 var2 = new class143();
        var2.field2548 = this.field2548;
        var2.field2503 = new byte[this.field2548];
        int var3 = 25 % ((-arg0 - 11) / 43);
        for (int var4 = 0; var4 < this.field2548; var4++) {
            byte var5 = this.field2503[var4];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            var2.field2503[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)Llc;")
    public final class143 method869(int arg0) {
        field2551++;
        class143 var2 = class64.method364((byte) 97, this.method874(7));
        if (arg0 != 48) {
            this.field2548 = 76;
        }
        return var2 == null ? class214.field3958 : var2;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILlc;)I")
    public final int method870(int arg0, class143 arg1) {
        field2517++;
        int var3;
        if (arg1.field2548 >= this.field2548) {
            var3 = this.field2548;
        } else {
            var3 = arg1.field2548;
        }
        if (arg0 < 66) {
            this.method877(-71, (class143) null, (class143) null);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg1.field2503[var4] & 0xFF) > (this.field2503[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field2503[var4] & 0xFF) > (arg1.field2503[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg1.field2548 > this.field2548) {
            return -1;
        } else if (this.field2548 > arg1.field2548) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/applet/Applet;I)V")
    public final void method871(Applet arg0, int arg1) throws Throwable {
        field2558++;
        String var3 = new String(this.field2503, arg1, this.field2548);
        class233.method1579(var3, arg0, -96);
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(II)I")
    public final int method872(int arg0, int arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        field2520++;
        boolean var3 = false;
        boolean var4 = false;
        if (arg1 != 8122) {
            return -24;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < this.field2548; var6++) {
            int var7 = this.field2503[var6] & 0xFF;
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

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILlc;B)I")
    public final int method873(int arg0, class143 arg1, byte arg2) {
        field2555++;
        int var4 = arg1.field2548;
        if (arg0 >= this.field2548) {
            return var4 == 0 ? this.field2548 : -1;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (var4 == 0) {
            return arg0;
        }
        byte[] var5 = arg1.field2503;
        byte var6 = var5[0];
        int var7 = this.field2548 - var4;
        for (int var8 = arg0; var8 <= var7; var8++) {
            if (this.field2503[var8] != var6) {
                do {
                    var8++;
                    if (var7 < var8) {
                        return -1;
                    }
                } while (this.field2503[var8] != var6);
            }
            boolean var9 = true;
            int var10 = var8 + 1;
            int var11 = 1;
            while (var4 > var11) {
                if (this.field2503[var10] != var5[var11]) {
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
        if (arg2 <= 107) {
            field2566 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)J")
    public final long method874(int arg0) {
        field2541++;
        if (arg0 != 7) {
            this.method910(41);
        }
        long var2 = 0L;
        for (int var4 = 0; this.field2548 > var4 && var4 < 12; var4++) {
            byte var5 = this.field2503[var4];
            var2 *= 37L;
            if (var5 >= 65 && var5 <= 90) {
                var2 += (long) (var5 + 1 - 65);
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += (long) (var5 - 96);
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += (long) (var5 + 27 - 48);
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZILgf;)[Lek;")
    public static final class160[] method875(int arg0, boolean arg1, int arg2, class7 arg3) {
        if (arg1) {
            field2511 = null;
        }
        field2529++;
        return class189.method1223(arg3, arg0, 91, arg2) ? class168.method1106((byte) -92) : null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLlc;)Z")
    public final boolean method876(byte arg0, class143 arg1) {
        field2535++;
        if (arg1 == null) {
            return false;
        } else if (arg1 == this) {
            return true;
        } else if (this.field2548 == arg1.field2548) {
            byte[] var3 = arg1.field2503;
            byte[] var4 = this.field2503;
            int var5 = 0;
            if (arg0 != -122) {
                return false;
            }
            while (var5 < this.field2548) {
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

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILlc;Llc;)Llc;")
    public final class143 method877(int arg0, class143 arg1, class143 arg2) {
        field2554++;
        int var4 = this.field2548;
        int var5 = arg2.field2548 - arg1.field2548;
        int var6 = 0;
        if (arg0 >= -40) {
            field2511 = null;
        }
        while (true) {
            int var7 = this.method873(var6, arg1, (byte) 109);
            if (var7 < 0) {
                int var8 = 0;
                class143 var9 = class170.method1114(var4, false);
                while (true) {
                    int var10 = this.method873(var8, arg1, (byte) 110);
                    if (var10 < 0) {
                        while (var8 < this.field2548) {
                            var9.method898(this.field2503[var8++] & 0xFF, -15675);
                        }
                        return var9;
                    }
                    while (var8 < var10) {
                        var9.method898(this.field2503[var8++] & 0xFF, -15675);
                    }
                    var9.method906(0, arg2);
                    var8 += arg1.field2548;
                }
            }
            var4 += var5;
            var6 = var7 + arg1.field2548;
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)Llc;")
    public final class143 method878(int arg0) {
        field2525++;
        class143 var2 = new class143();
        var2.field2548 = this.field2548;
        var2.field2503 = new byte[this.field2548];
        boolean var3 = true;
        if (arg0 != -28102) {
            field2565 = null;
        }
        for (int var4 = 0; var4 < this.field2548; var4++) {
            byte var5 = this.field2503[var4];
            if (var5 == 95) {
                var3 = true;
                var2.field2503[var4] = 32;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var3 = false;
                var2.field2503[var4] = (byte) (var5 - 32);
            } else {
                var3 = false;
                var2.field2503[var4] = var5;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)Z")
    private final boolean method879(int arg0, byte arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        field2516++;
        if (arg1 != -114) {
            this.hashCode();
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field2548; var6++) {
            int var7 = this.field2503[var6] & 0xFF;
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
            if (arg0 <= var7) {
                return false;
            }
            if (var4) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if ((var8 / arg0) != var5) {
                return false;
            }
            var3 = true;
            var5 = var8;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method880(int arg0, Graphics arg1, int arg2, int arg3) {
        field2523++;
        String var5;
        try {
            var5 = new String(this.field2503, 0, this.field2548, "ISO-8859-1");
            if (arg3 != 2316) {
                this.method898(-25, -118);
            }
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field2503, 0, this.field2548);
        }
        arg1.drawString(var5, arg0, arg2);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([BIIII)I")
    public final int method881(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class275.method1813(this.field2503, arg1, arg0, arg4, arg2 - arg1);
        if (arg3 != 97) {
            field2511 = null;
        }
        field2539++;
        return arg2 - arg1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/net/URL;I)Ljava/net/URL;")
    public final URL method882(URL arg0, int arg1) throws MalformedURLException {
        if (arg1 == 0) {
            field2559++;
            return new URL(arg0, new String(this.field2503, 0, this.field2548));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)I")
    public final int method883(int arg0, int arg1, int arg2) {
        field2522++;
        byte var4 = (byte) arg2;
        for (int var5 = arg0; var5 < this.field2548; var5++) {
            if (this.field2503[var5] == var4) {
                return var5;
            }
        }
        if (arg1 != 0) {
            this.method892(-116);
        }
        return -1;
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)J")
    public final long method884(int arg0) {
        if (arg0 < 113) {
            return -88L;
        }
        long var2 = 0L;
        field2561++;
        for (int var4 = 0; var4 < this.field2548; var4++) {
            var2 = (var2 << 5) - (var2 - (long) (this.field2503[var4] & 0xFF));
        }
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(II)[Llc;")
    public final class143[] method885(int arg0, int arg1) {
        field2550++;
        int var3 = 0;
        for (int var4 = arg1; var4 < this.field2548; var4++) {
            if (this.field2503[var4] == arg0) {
                var3++;
            }
        }
        class143[] var5 = new class143[var3 + 1];
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        }
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = 0; this.field2503[var7 + var9] != arg0; var9++) {
            }
            var5[var6++] = this.method896(var7 + var9, var7, false);
            var7 += var9 + 1;
        }
        var5[var3] = this.method896(this.field2548, var7, false);
        return var5;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/awt/FontMetrics;Z)I")
    public final int method886(FontMetrics arg0, boolean arg1) {
        field2532++;
        String var3;
        try {
            var3 = new String(this.field2503, 0, this.field2548, "ISO-8859-1");
            if (arg1) {
                this.method891(90, (class143) null);
            }
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field2503, 0, this.field2548);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)I")
    public final int method887(byte arg0) {
        field2538++;
        if (arg0 < 89) {
            field2563 = null;
        }
        return this.method872(10, 8122);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILlc;BI)Llc;")
    public final class143 method888(int arg0, class143 arg1, byte arg2, int arg3) {
        field2549++;
        if (!this.field2560) {
            throw new IllegalArgumentException();
        } else if (arg3 >= 0 && arg3 <= arg0 && arg1.field2548 >= arg0) {
            if (this.field2503.length < (this.field2548 + arg0 - arg3)) {
                int var5;
                for (var5 = 1; var5 < (this.field2548 + arg1.field2548); var5 += var5) {
                }
                byte[] var6 = new byte[var5];
                class275.method1813(this.field2503, 0, var6, 0, this.field2548);
                this.field2503 = var6;
            }
            class275.method1813(arg1.field2503, arg3, this.field2503, this.field2548, arg0 - arg3);
            this.field2548 += arg0 - arg3;
            if (arg2 != -70) {
                field2565 = null;
            }
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)[B")
    public final byte[] method889(byte arg0) {
        if (arg0 != 6) {
            this.field2560 = false;
        }
        byte[] var2 = new byte[this.field2548];
        field2547++;
        class275.method1813(this.field2503, 0, var2, 0, this.field2548);
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)Llc;")
    public final class143 method890(int arg0) {
        field2527++;
        int var2;
        for (var2 = 0; var2 < this.field2548 && (this.field2503[var2] >= 0 && this.field2503[var2] <= 32 || (this.field2503[var2] & 0xFF) == 160); var2++) {
        }
        int var3;
        for (var3 = this.field2548; var3 > var2 && (this.field2503[var3 - 1] >= 0 && this.field2503[var3 - 1] <= 32 || (this.field2503[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (var2 == 0 && this.field2548 == var3) {
            return this;
        }
        class143 var4 = new class143();
        var4.field2548 = var3 - var2;
        var4.field2503 = new byte[var4.field2548];
        for (int var5 = 0; var5 < var4.field2548; var5++) {
            var4.field2503[var5] = this.field2503[var2 + var5];
        }
        if (arg0 != 16277) {
            field2524 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(ILlc;)I")
    public final int method891(int arg0, class143 arg1) {
        field2542++;
        if (arg0 != -31978) {
            field2545 = null;
        }
        return this.method873(0, arg1, (byte) 127);
    }

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)I")
    public final int method892(int arg0) {
        int var2 = 0;
        int var3 = 82 / ((arg0 + 60) / 49);
        for (int var4 = 0; var4 < this.field2548; var4++) {
            var2 = (var2 << 5) + (this.field2503[var4] & 0xFF) - var2;
        }
        field2505++;
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "(I)Ljava/net/URL;")
    public final URL method893(int arg0) throws MalformedURLException {
        if (arg0 == 13272) {
            field2531++;
            return new URL(new String(this.field2503, 0, this.field2548));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)V")
    public static void method894(byte arg0) {
        field2545 = null;
        field2563 = null;
        field2562 = null;
        if (arg0 <= 29) {
            return;
        }
        field2566 = null;
        field2518 = null;
        field2524 = null;
        field2511 = null;
        field2565 = null;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(BLlc;)Z")
    public final boolean method895(byte arg0, class143 arg1) {
        field2506++;
        if (arg1 == null) {
            return false;
        } else if (this.field2548 == arg1.field2548) {
            for (int var3 = 0; var3 < this.field2548; var3++) {
                byte var4 = this.field2503[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg1.field2503[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
            }
            if (arg0 >= -79) {
                field2524 = null;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIZ)Llc;")
    public final class143 method896(int arg0, int arg1, boolean arg2) {
        field2509++;
        class143 var4 = new class143();
        var4.field2548 = arg0 - arg1;
        var4.field2503 = new byte[arg0 - arg1];
        class275.method1813(this.field2503, arg1, var4.field2503, 0, var4.field2548);
        return arg2 ? null : var4;
    }

    @OriginalMember(owner = "client!lc", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field2508++;
        return this.method892(81);
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(II)I")
    public final int method897(int arg0, int arg1) {
        if (arg0 != 255) {
            this.field2548 = 74;
        }
        field2519++;
        return this.field2503[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "(II)Llc;")
    public final class143 method898(int arg0, int arg1) {
        field2512++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field2560) {
            if (this.field2503.length == this.field2548) {
                int var3;
                for (var3 = 1; var3 <= this.field2548; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class275.method1813(this.field2503, 0, var4, 0, this.field2548);
                this.field2503 = var4;
            }
            this.field2503[this.field2548++] = (byte) arg0;
            if (arg1 != -15675) {
                this.field2548 = -22;
            }
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(B)Llc;")
    public final class143 method899(byte arg0) {
        field2521++;
        byte var2 = 2;
        class143 var3 = new class143();
        var3.field2548 = this.field2548;
        var3.field2503 = new byte[this.field2548];
        if (arg0 != 46) {
            return null;
        }
        for (int var4 = 0; var4 < this.field2548; var4++) {
            byte var5 = this.field2503[var4];
            if (!(var5 < 97 || var5 > 122) || !(var5 < -32 || var5 > -2 || var5 == -9)) {
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
            var3.field2503[var4] = var5;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(B)Llc;")
    public final class143 method900(byte arg0) {
        field2544++;
        if (arg0 != 54) {
            this.method869(69);
        }
        long var2 = this.method884(125);
        synchronized (field2567 == null ? (field2567 = method914("lc")) : field2567) {
            if (class55.field1078 == null) {
                class55.field1078 = new class277(4096);
            } else {
                for (class265 var5 = (class265) class55.field1078.method1824(var2, 0); var5 != null; var5 = (class265) class55.field1078.method1819(-124)) {
                    if (this.method876((byte) -122, var5.field4767)) {
                        return var5.field4767;
                    }
                }
            }
            class265 var7 = new class265();
            var7.field4767 = this;
            this.field2560 = false;
            class55.field1078.method1825(var7, (byte) 64, var2);
            return this;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Llc;B)I")
    public final int method901(class143 arg0, byte arg1) {
        int var3 = 0;
        int var4 = 0;
        field2504++;
        int var5 = this.field2548;
        int var6 = arg0.field2548;
        int var7 = this.field2548;
        int var8 = arg0.field2548;
        int var9 = 0;
        int var10 = 0;
        while (var5 != 0 && var6 != 0) {
            if (var4 == 156 || var4 == 230) {
                var4 = 101;
            } else if (var4 == 140 || var4 == 198) {
                var4 = 69;
            } else if (var4 == 223) {
                var4 = 115;
            } else {
                var4 = this.field2503[var9] & 0xFF;
                var9++;
            }
            if (class167.method1099(14316, var4)) {
                var7++;
            } else {
                var5--;
            }
            if (var3 == 156 || var3 == 230) {
                var3 = 101;
            } else if (var3 == 140 || var3 == 198) {
                var3 = 69;
            } else if (var3 == 223) {
                var3 = 115;
            } else {
                var3 = arg0.field2503[var10] & 0xFF;
                var10++;
            }
            if (class167.method1099(14316, var3)) {
                var8++;
            } else {
                var6--;
            }
            if (class34.field602[var3] > class34.field602[var4]) {
                return -1;
            }
            if (class34.field602[var4] > class34.field602[var3]) {
                return 1;
            }
        }
        if (var8 > var7) {
            return -1;
        } else {
            if (arg1 != -102) {
                this.method912(16, (class143) null);
            }
            return var8 < var7 ? 1 : 0;
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(ILlc;)Z")
    public final boolean method902(int arg0, class143 arg1) {
        field2543++;
        if (arg1.field2548 > this.field2548) {
            return false;
        }
        int var3 = this.field2548 - arg1.field2548;
        for (int var4 = 0; var4 < arg1.field2548; var4++) {
            if (this.field2503[var3 + var4] != arg1.field2503[var4]) {
                return false;
            }
        }
        if (arg0 != 3) {
            this.hashCode();
        }
        return true;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Llc;I)Z")
    public final boolean method903(class143 arg0, int arg1) {
        field2513++;
        if (arg0.field2548 > this.field2548) {
            return false;
        }
        for (int var3 = 0; var3 < arg0.field2548; var3++) {
            if (this.field2503[var3] != arg0.field2503[var3]) {
                return false;
            }
        }
        if (arg1 != 13544) {
            field2564 = -0.18272676F;
        }
        return true;
    }

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "(I)Z")
    public final boolean method904(int arg0) {
        field2536++;
        if (arg0 != -1) {
            field2564 = -0.6527882F;
        }
        return this.method879(10, (byte) -114);
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(Ljava/applet/Applet;I)Ljava/lang/Object;")
    public final Object method905(Applet arg0, int arg1) throws Throwable {
        field2537++;
        String var3 = new String(this.field2503, arg1, this.field2548);
        Object var4 = class233.method1580((Object[]) null, var3, arg0, (byte) -103);
        if (var4 instanceof String) {
            byte[] var5 = ((String) var4).getBytes();
            var4 = class224.method1539(0, var5.length, 102, var5);
        }
        return var4;
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(ILlc;)Llc;")
    public final class143 method906(int arg0, class143 arg1) {
        field2552++;
        if (!this.field2560) {
            throw new IllegalArgumentException();
        }
        if ((this.field2548 + arg1.field2548) > this.field2503.length) {
            int var3;
            for (var3 = 1; var3 < (this.field2548 + arg1.field2548); var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class275.method1813(this.field2503, 0, var4, 0, this.field2548);
            this.field2503 = var4;
        }
        class275.method1813(arg1.field2503, arg0, this.field2503, this.field2548, arg1.field2548);
        this.field2548 += arg1.field2548;
        return this;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lgf;I)V")
    public static final void method907(class7 arg0, int arg1) {
        class74.field1386 = arg0;
        field2533++;
        if (arg1 != 0) {
            method911(-69, 75, 80, -126, 13, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 120, (byte) -45, 113, -47);
        }
    }

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "(I)Llc;")
    public final class143 method908(int arg0) {
        field2510++;
        if (arg0 != 0) {
            this.method878(33);
        }
        if (!this.field2560) {
            throw new IllegalArgumentException();
        }
        if (this.field2503.length != this.field2548) {
            byte[] var2 = new byte[this.field2548];
            class275.method1813(this.field2503, 0, var2, 0, this.field2548);
            this.field2503 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(B)Llc;")
    public final class143 method909(byte arg0) {
        field2557++;
        class143 var2 = new class143();
        var2.field2548 = this.field2548;
        int var3 = 116 % ((35 - arg0) / 39);
        var2.field2503 = new byte[var2.field2548];
        for (int var4 = 0; var4 < this.field2548; var4++) {
            var2.field2503[this.field2548 - var4 - 1] = this.field2503[var4];
        }
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "(I)V")
    public final void method910(int arg0) {
        field2534++;
        int var2 = 94 / ((49 - arg0) / 39);
        String var3;
        try {
            var3 = new String(this.field2503, 0, this.field2548, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field2503, 0, this.field2548);
        }
        System.out.println(var3);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method911(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class36.field621 * 128) {
            arg0 = class36.field621 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class56.field1091 * 128) {
            arg2 = class56.field1091 * 128 - 1;
        }
        class91.field1635 = class196.field3635[arg3];
        class217.field3978 = class196.field3630[arg3];
        class149.field2740 = class196.field3635[arg4];
        class184.field3349 = class196.field3630[arg4];
        class40.field682 = arg0;
        class266.field4782 = arg1;
        class264.field4751 = arg2;
        class139.field2430 = arg0 / 128;
        class126.field2227 = arg2 / 128;
        class123.field2158 = class139.field2430 - class208.field3824;
        if (class123.field2158 < 0) {
            class123.field2158 = 0;
        }
        class56.field1094 = class126.field2227 - class208.field3824;
        if (class56.field1094 < 0) {
            class56.field1094 = 0;
        }
        class227.field4102 = class208.field3824 + class139.field2430;
        if (class227.field4102 > class36.field621) {
            class227.field4102 = class36.field621;
        }
        class59.field1138 = class208.field3824 + class126.field2227;
        if (class59.field1138 > class56.field1091) {
            class59.field1138 = class56.field1091;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class208.field3824 + class208.field3824 + 2; var16++) {
            for (int var19 = 0; var19 < class208.field3824 + class208.field3824 + 2; var19++) {
                int var20 = (var16 - class208.field3824 << 7) - (class40.field682 & 0x7F);
                int var21 = (var19 - class208.field3824 << 7) - (class264.field4751 & 0x7F);
                int var22 = class139.field2430 + var16 - class208.field3824;
                int var23 = class126.field2227 + var19 - class208.field3824;
                if (var22 >= 0 && var23 >= 0 && var22 < class36.field621 && var23 < class56.field1091) {
                    int var24;
                    if (class83.field1503 == null) {
                        var24 = class273.field4861[0][var22][var23] + 128 - class266.field4782;
                    } else {
                        var24 = class83.field1503[0][var22][var23] + 128 - class266.field4782;
                    }
                    int var25 = class273.field4861[3][var22][var23] - class266.field4782 - 1000;
                    class79.field1443[var16][var19] = class20.method144(var20, var25, var24, var21, var15);
                } else {
                    class79.field1443[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class208.field3824 + class208.field3824 + 1; var17++) {
            for (int var18 = 0; var18 < class208.field3824 + class208.field3824 + 1; var18++) {
                class168.field3007[var17][var18] = class79.field1443[var17][var18] || class79.field1443[var17 + 1][var18] || class79.field1443[var17][var18 + 1] || class79.field1443[var17 + 1][var18 + 1];
            }
        }
        class37.field636 = arg6;
        class148.field2704 = arg7;
        class235.field4287 = arg8;
        class223.field4046 = arg9;
        class173.field3107 = arg10;
        class154.method1016();
        if (class42.field710 != null) {
            class169.method1111(true);
            class173.method1142(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class169.method1111(false);
        }
        class173.method1142(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(ILlc;)Z")
    public final boolean method912(int arg0, class143 arg1) {
        field2556++;
        if (arg1.field2548 > this.field2548) {
            return false;
        }
        for (int var3 = 0; var3 < arg1.field2548; var3++) {
            byte var4 = this.field2503[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            byte var5 = arg1.field2503[var3];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 != var5) {
                return false;
            }
        }
        if (arg0 != 32741) {
            field2518 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "(B)I")
    public final int method913(byte arg0) {
        field2515++;
        if (arg0 != 45) {
            method894((byte) 44);
        }
        return this.field2548;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method914(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
