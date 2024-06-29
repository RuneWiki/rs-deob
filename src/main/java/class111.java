import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class111 {

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
    private int field1806 = 65000;

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "Lfm;")
    private class52 field1811 = null;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "Lfm;")
    private class52 field1794 = null;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    private int field1796;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1803 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "[I")
    public static int[] field1797 = new int[64];

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "[I")
    public static int[] field1795 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    public static int field1805 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    public static int field1804 = 0;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
    public static int field1807 = 0;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "Lpk;")
    public static class120 field1809;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 14)
    public static final void method867(int arg0) {
        field1798++;
        if (class319.field5005 != null) {
            class319.field5005.method371(-2);
            class319.field5005 = null;
        }
        class242.method1714(false);
        class42.method381();
        for (int var1 = 0; var1 < 4; var1++) {
            class166.field2686[var1].method437(false);
        }
        class66.method530((byte) -123, false);
        System.gc();
        class266.method1840(127, 2);
        class188.field2957 = false;
        class118.field1906 = -1;
        class201.method1434(true, (byte) -123);
        class208.field3279 = false;
        class133.field2118 = 0;
        class211.field3316 = 0;
        class117.field1902 = 0;
        client.field4119 = 0;
        for (int var2 = 0; var2 < class62.field912.length; var2++) {
            class62.field912[var2] = null;
        }
        class83.field1290 = 0;
        class45.field703 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class74.field1140[var3] = null;
            class282.field4419[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class197.field3029[var4] = null;
        }
        if (arg0 <= 50) {
            field1797 = (int[]) null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class316.field4985[var5][var6][var7] = null;
                }
            }
        }
        class245.method1727(-68);
        class303.field4834 = 0;
        class285.method1994((byte) -23);
        class198.method1402(true, (byte) 86);
        try {
            class51.method419((byte) -35, class92.field1484.field1037, "loggedout");
        } catch (Throwable var9) {
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIII)V", line = 111)
    public static final void method868(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= arg2) {
            class323.method2273(arg1, arg4, class221.field3443[arg0], arg2, arg3 - 433);
        } else {
            class323.method2273(arg2, arg4, class221.field3443[arg0], arg1, arg3 ^ 0x246);
        }
        if (arg3 == 520) {
            field1800++;
        }
    }

    @OriginalMember(owner = "client!pm", name = "toString", descriptor = "()Ljava/lang/String;", line = 142)
    public final String toString() {
        field1808++;
        return "Cache:" + this.field1796;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([BIII)Z", line = 156)
    public final boolean method869(byte[] arg0, int arg1, int arg2, int arg3) {
        field1802++;
        class52 var5 = this.field1794;
        synchronized (this.field1794) {
            if (arg1 < 0 || arg1 > this.field1806) {
                throw new IllegalArgumentException();
            }
            if (arg2 != -4278) {
                this.method869((byte[]) null, 7, -26, 34);
            }
            boolean var6 = this.method872(true, arg0, arg3, (byte) -57, arg1);
            if (!var6) {
                var6 = this.method872(false, arg0, arg3, (byte) -120, arg1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)Z", line = 182)
    public static final boolean method870(int arg0, int arg1, int arg2) {
        field1799++;
        if (!class260.field3858) {
            return false;
        }
        int var3 = arg0 >> 16;
        int var4 = arg0 & 0xFFFF;
        if (class110.field1789[var3] == null || class110.field1789[var3][var4] == null) {
            return false;
        }
        class266 var5 = class110.field1789[var3][var4];
        if (arg2 == -1 && var5.field4084 == 0) {
            for (int var6 = 0; var6 < class137.field2225; var6++) {
                if (class120.field1960[var6] == 19 || class120.field1960[var6] == 1004 || class120.field1960[var6] == 9 || class120.field1960[var6] == 42 || class120.field1960[var6] == 25) {
                    for (class266 var7 = class171.method1276(class247.field3683[var6], (byte) -126); var7 != null; var7 = class315.method2226(-1, var7)) {
                        if (var5.field4088 == var7.field4088) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < class137.field2225; var8++) {
                if (class304.field4847[var8] == arg2 && class247.field3683[var8] == var5.field4088 && (class120.field1960[var8] == 19 || class120.field1960[var8] == 1004 || class120.field1960[var8] == 9 || class120.field1960[var8] == 42 || class120.field1960[var8] == 25)) {
                    return true;
                }
            }
        }
        return arg1 > -24 ? false : false;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "()V", line = 256)
    public static final void method871() {
        for (int var0 = 0; var0 < class11.field252; var0++) {
            class144 var1 = class124.field2008[var0];
            class102.method832(var1);
            class124.field2008[var0] = null;
        }
        class11.field252 = 0;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z[BIBI)Z", line = 271)
    private final boolean method872(boolean arg0, byte[] arg1, int arg2, byte arg3, int arg4) {
        field1810++;
        class52 var6 = this.field1794;
        synchronized (this.field1794) {
            try {
                int var7;
                boolean var10000;
                if (arg0) {
                    if (((long) (arg2 * 6 + 6)) > this.field1811.method434((byte) -63)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field1811.method430((long) (arg2 * 6), (byte) 105);
                    this.field1811.method433(0, 6, class282.field4416, 0);
                    var7 = ((class282.field4416[4] & 0xFF) << 8) + ((class282.field4416[3] & 0xFF) << 16) + (class282.field4416[5] & 0xFF);
                    if (var7 <= 0 || (this.field1794.method434((byte) -63) / 520L) < ((long) var7)) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field1794.method434((byte) -63) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class282.field4416[3] = (byte) (var7 >> 16);
                class282.field4416[1] = (byte) (arg4 >> 8);
                class282.field4416[0] = (byte) (arg4 >> 16);
                int var8 = 0;
                class282.field4416[5] = (byte) var7;
                int var9 = 0;
                if (arg3 > -37) {
                    field1812 = 56;
                }
                class282.field4416[2] = (byte) arg4;
                class282.field4416[4] = (byte) (var7 >> 8);
                this.field1811.method430((long) (arg2 * 6), (byte) 124);
                this.field1811.method427((byte) 126, 6, class282.field4416, 0);
                while (true) {
                    if (var9 < arg4) {
                        label138: {
                            int var10 = 0;
                            if (arg0) {
                                this.field1794.method430((long) (var7 * 520), (byte) 116);
                                try {
                                    this.field1794.method433(0, 8, class282.field4416, 0);
                                } catch (EOFException var18) {
                                    break label138;
                                }
                                var10 = (class282.field4416[6] & 0xFF) + ((class282.field4416[4] & 0xFF << 16) + ((class282.field4416[5] & 0xFF) << 8));
                                int var12 = (class282.field4416[0] & 0xFF << 8) + (class282.field4416[1] & 0xFF);
                                int var13 = (class282.field4416[2] & 0xFF << 8) + (class282.field4416[3] & 0xFF);
                                int var14 = class282.field4416[7] & 0xFF;
                                if (arg2 != var12 || var8 != var13 || this.field1796 != var14) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || (long) var10 > this.field1794.method434((byte) -63) / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                var10 = (int) ((this.field1794.method434((byte) -63) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                arg0 = false;
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            class282.field4416[1] = (byte) arg2;
                            if ((arg4 - var9) <= 512) {
                                var10 = 0;
                            }
                            class282.field4416[0] = (byte) (arg2 >> 8);
                            class282.field4416[2] = (byte) (var8 >> 8);
                            class282.field4416[4] = (byte) (var10 >> 16);
                            class282.field4416[3] = (byte) var8;
                            class282.field4416[7] = (byte) this.field1796;
                            class282.field4416[6] = (byte) var10;
                            class282.field4416[5] = (byte) (var10 >> 8);
                            this.field1794.method430((long) (var7 * 520), (byte) 119);
                            int var15 = arg4 - var9;
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            var7 = var10;
                            var8++;
                            this.field1794.method427((byte) 126, 8, class282.field4416, 0);
                            this.field1794.method427((byte) 127, var15, arg1, var9);
                            var9 += var15;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var19) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)[B", line = 398)
    public final byte[] method873(int arg0, int arg1) {
        field1801++;
        class52 var3 = this.field1794;
        synchronized (this.field1794) {
            try {
                Object var10000;
                if ((long) (arg0 * 6 + 6) > this.field1811.method434((byte) -63)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field1811.method430((long) (arg0 * 6), (byte) 120);
                this.field1811.method433(0, 6, class282.field4416, 0);
                int var4 = ((class282.field4416[0] & 0xFF) << 16) + (class282.field4416[1] & 0xFF << 8) + (class282.field4416[2] & 0xFF);
                int var5 = ((class282.field4416[3] & 0xFF) << 16) - (-(class282.field4416[4] & 0xFF << 8) - (class282.field4416[5] & 0xFF));
                if (arg1 != -17049) {
                    this.toString();
                }
                if (var4 < 0 || this.field1806 < var4) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var5 <= 0 || this.field1794.method434((byte) -63) / 520L < (long) var5) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    int var6 = 0;
                    byte[] var7 = new byte[var4];
                    int var8 = 0;
                    while (var6 < var4) {
                        if (var5 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field1794.method430((long) (var5 * 520), (byte) 119);
                        int var9 = var4 - var6;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field1794.method433(0, var9 + 8, class282.field4416, 0);
                        int var10 = ((class282.field4416[2] & 0xFF) << 8) + (class282.field4416[3] & 0xFF);
                        int var11 = class282.field4416[7] & 0xFF;
                        int var12 = (class282.field4416[5] & 0xFF << 8) + (class282.field4416[4] & 0xFF << 16) + (class282.field4416[6] & 0xFF);
                        int var13 = ((class282.field4416[0] & 0xFF) << 8) + (class282.field4416[1] & 0xFF);
                        if (arg0 != var13 || var8 != var10 || this.field1796 != var11) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var12 < 0 || (long) var12 > this.field1794.method434((byte) -63) / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var8++;
                        for (int var14 = 0; var14 < var9; var14++) {
                            var7[var6++] = class282.field4416[var14 + 8];
                        }
                        var5 = var12;
                    }
                    byte[] var19 = var7;
                    return var19;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V", line = 478)
    public static void method874(int arg0) {
        if (arg0 != -10139) {
            field1795 = (int[]) null;
        }
        field1797 = null;
        field1803 = null;
        field1809 = null;
        field1795 = null;
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(ILfm;Lfm;I)V", line = 503)
    public class111(int arg0, class52 arg1, class52 arg2, int arg3) {
        this.field1796 = arg0;
        this.field1794 = arg1;
        this.field1811 = arg2;
        this.field1806 = arg3;
    }
}
