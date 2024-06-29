import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class140 implements Runnable {

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Z")
    public boolean field2134 = true;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Ljava/lang/Object;")
    public Object field2135 = new Object();

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public int field2140 = 0;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "[I")
    public int[] field2141 = new int[500];

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "[I")
    public int[] field2143 = new int[500];

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Ln;")
    public static class282 field2132 = new class282(100);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "Lbe;")
    public static class297 field2138;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "[[[B")
    public static byte[][][] field2133;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 9)
    public static void method932(int arg0) {
        if (arg0 == 25951) {
            field2138 = null;
            field2133 = (byte[][][]) null;
            field2132 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "run", descriptor = "()V", line = 33)
    public final void run() {
        field2136++;
        while (this.field2134) {
            Object var1 = this.field2135;
            synchronized (this.field2135) {
                if (this.field2140 < 500) {
                    this.field2143[this.field2140] = class136.field2090;
                    this.field2141[this.field2140] = class259.field4235;
                    this.field2140++;
                }
            }
            class126.method862(50L, 64);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)I", line = 55)
    public static final int method933(byte arg0) {
        field2131++;
        class157.field2457 = 0;
        if (arg0 != -53) {
            method933((byte) -35);
        }
        return class74.method532(-1);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)V", line = 71)
    public static final void method934(int arg0, byte arg1) {
        if (arg1 > 12) {
            field2142++;
            class120 var2 = class293.method2059(4, 12, arg0);
            var2.method823(true);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II[Lbe;)V", line = 86)
    public static final void method935(int arg0, int arg1, class297[] arg2) {
        field2139++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class297 var4 = arg2[var3];
            if (var4 != null && var4.field4993 == arg1 && (!var4.field5038 || !client.method1737(var4))) {
                if (var4.field4988 == 0) {
                    if (!var4.field5038 && client.method1737(var4) && class204.field3193 != var4) {
                        continue;
                    }
                    method935(arg0 ^ 0x0, var4.field5088, arg2);
                    if (var4.field5068 != null) {
                        method935(23206, var4.field5088, var4.field5068);
                    }
                    class174 var5 = (class174) class74.field1132.method1827((long) var4.field5088, 0);
                    if (var5 != null) {
                        class209.method1398(-111, var5.field2721);
                    }
                }
                if (var4.field4988 == 6) {
                    if (var4.field5117 != -1 || var4.field5001 != -1) {
                        boolean var6 = class250.method1716(var4, arg0 - 23173);
                        int var7;
                        if (var6) {
                            var7 = var4.field5001;
                        } else {
                            var7 = var4.field5117;
                        }
                        if (var7 != -1) {
                            class249 var8 = client.method1731(var7, (byte) -20);
                            if (var8 != null) {
                                var4.field5073 += class25.field366;
                                while (var4.field5073 > var8.field4076[var4.field5093]) {
                                    var4.field5073 -= var8.field4076[var4.field5093];
                                    var4.field5093++;
                                    if (var8.field4051.length <= var4.field5093) {
                                        var4.field5093 -= var8.field4070;
                                        if (var4.field5093 < 0 || var8.field4051.length <= var4.field5093) {
                                            var4.field5093 = 0;
                                        }
                                    }
                                    var4.field5066 = var4.field5093 + 1;
                                    if (var8.field4051.length <= var4.field5066) {
                                        var4.field5066 -= var8.field4070;
                                        if (var4.field5066 < 0 || var8.field4051.length <= var4.field5066) {
                                            var4.field5066 = -1;
                                        }
                                    }
                                    class318.method2209(115, var4);
                                }
                            }
                        }
                    }
                    if (var4.field5042 != 0 && !var4.field5038) {
                        int var9 = var4.field5042 >> 16;
                        int var10 = class25.field366 * var9;
                        int var11 = var4.field5042 << 16 >> 16;
                        var4.field4983 = var4.field4983 + var10 & 0x7FF;
                        int var12 = class25.field366 * var11;
                        var4.field5120 = var4.field5120 + var12 & 0x7FF;
                        class318.method2209(117, var4);
                    }
                }
            }
        }
        if (arg0 != 23206) {
            method932(107);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II[Lna;I)Lna;", line = 210)
    public static final class26 method936(int arg0, int arg1, class26[] arg2, int arg3) {
        field2130++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg2[arg0 + var5] == null) {
                arg2[arg0 + var5] = class309.field5311;
            }
            var4 += arg2[arg0 + var5].field436;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg1; var8++) {
            class26 var9 = arg2[arg0 + var8];
            class75.method536(var9.field418, 0, var6, var7, var9.field436);
            var7 += var9.field436;
        }
        class26 var10 = new class26();
        var10.field436 = var4;
        if (arg3 != 2774) {
            method937(83, 28);
        }
        var10.field418 = var6;
        return var10;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)I", line = 277)
    public static final int method937(int arg0, int arg1) {
        field2137++;
        if (arg0 < 20) {
            method937(15, 87);
        }
        return arg1 & 0x7F;
    }
}
