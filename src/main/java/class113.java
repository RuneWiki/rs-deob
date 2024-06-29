import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class113 extends class156 {

    @OriginalMember(owner = "client!m", name = "A", descriptor = "Lad;")
    public class5 field2379 = new class5();

    @OriginalMember(owner = "client!m", name = "S", descriptor = "Lef;")
    public class47 field2397 = new class47();

    @OriginalMember(owner = "client!m", name = "P", descriptor = "Lle;")
    private class109 field2394;

    @OriginalMember(owner = "client!m", name = "E", descriptor = "[I")
    public static int[] field2383 = new int[5];

    @OriginalMember(owner = "client!m", name = "L", descriptor = "Lrf;")
    public static class163 field2390 = class53.method392(72, "Anmelde)2Limit -Uberschritten)3");

    @OriginalMember(owner = "client!m", name = "O", descriptor = "I")
    public static int field2393 = 0;

    @OriginalMember(owner = "client!m", name = "I", descriptor = "Lrf;")
    public static class163 field2387 = null;

    @OriginalMember(owner = "client!m", name = "C", descriptor = "Lrf;")
    public static class163 field2381 = class53.method392(103, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "[I")
    public static int[] field2395 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    public static int field2392 = 0;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!m", name = "D", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!m", name = "F", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!m", name = "G", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!m", name = "H", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!m", name = "J", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!m", name = "M", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!m", name = "z", descriptor = "Lef;")
    public static class47 field2378;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II)Lob;")
    public static final class132 method776(int arg0, int arg1) {
        field2389++;
        class132 var2 = (class132) class196.field3890.method401((long) arg1, (byte) 92);
        if (var2 != null) {
            return var2;
        }
        int var3 = -16 / ((arg0 - 41) / 41);
        byte[] var4 = class127.field2618.method1235(arg1, (byte) -64, 5);
        class132 var5 = new class132();
        if (var4 != null) {
            var5.method880(false, new class52(var4));
        }
        class196.field3890.method398(var5, (long) arg1, (byte) 98);
        return var5;
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "()Lqh;")
    public final class156 method276() {
        field2380++;
        class19 var1 = (class19) this.field2379.method46(108);
        if (var1 == null) {
            return null;
        } else if (var1.field308 == null) {
            return this.method278();
        } else {
            return var1.field308;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILbh;I)V")
    private final void method777(int arg0, class19 arg1, int arg2) {
        if (arg0 != 16711680) {
            this.method283(63);
        }
        field2386++;
        if ((this.field2394.field2312[arg1.field315] & 0x4) != 0 && arg1.field335 < 0) {
            int var4 = this.field2394.field2305[arg1.field315] / class188.field3736;
            int var5 = (var4 + 1048575 - arg1.field329) / var4;
            arg1.field329 = arg1.field329 + arg2 * var4 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field2394.field2264[arg1.field315] == 0) {
                    arg1.field308 = class164.method1094(arg1.field306, arg1.field308.method1092(), arg1.field308.method1084(), arg1.field308.method1066());
                } else {
                    arg1.field308 = class164.method1094(arg1.field306, arg1.field308.method1092(), 0, arg1.field308.method1066());
                    this.field2394.method765(arg1.field319.field1923[arg1.field320] < 0, false, arg1);
                }
                if (arg1.field319.field1923[arg1.field320] < 0) {
                    arg1.field308.method1086(-1);
                }
                arg2 = arg1.field329 / var4;
            }
        }
        arg1.field308.method283(arg2);
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V")
    public final void method283(int arg0) {
        this.field2397.method283(arg0);
        field2385++;
        for (class19 var2 = (class19) this.field2379.method46(71); var2 != null; var2 = (class19) this.field2379.method53(7759444)) {
            if (!this.field2394.method753((byte) 61, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field325) {
                        this.method777(16711680, var2, var3);
                        var2.field325 -= var3;
                        break;
                    }
                    this.method777(16711680, var2, var2.field325);
                    var3 -= var2.field325;
                } while (!this.field2394.method736(null, var3, 0, var2, (byte) -116));
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "([III)V")
    public final void method277(int[] arg0, int arg1, int arg2) {
        field2382++;
        this.field2397.method277(arg0, arg1, arg2);
        for (class19 var4 = (class19) this.field2379.method46(113); var4 != null; var4 = (class19) this.field2379.method53(7759444)) {
            if (!this.field2394.method753((byte) 119, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field325 >= var6) {
                        this.method778(var6, var5 + var6, -1048576, arg0, var4, var5);
                        var4.field325 -= var6;
                        break;
                    }
                    this.method778(var4.field325, var5 + var6, -1048576, arg0, var4, var5);
                    var6 -= var4.field325;
                    var5 += var4.field325;
                } while (!this.field2394.method736(arg0, var6, var5, var4, (byte) -91));
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "()I")
    public final int method284() {
        field2384++;
        return 0;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "()Lqh;")
    public final class156 method278() {
        field2398++;
        class19 var1;
        do {
            var1 = (class19) this.field2379.method53(7759444);
            if (var1 == null) {
                return null;
            }
        } while (var1.field308 == null);
        return var1.field308;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III[ILbh;I)V")
    private final void method778(int arg0, int arg1, int arg2, int[] arg3, class19 arg4, int arg5) {
        field2391++;
        if ((this.field2394.field2312[arg4.field315] & 0x4) != 0 && arg4.field335 < 0) {
            int var7 = this.field2394.field2305[arg4.field315] / class188.field3736;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field329) / var7;
                if (arg0 < var8) {
                    arg4.field329 += arg0 * var7;
                    break;
                }
                arg4.field308.method277(arg3, arg5, var8);
                arg5 += var8;
                int var9 = class188.field3736 / 100;
                int var10 = 262144 / var7;
                arg4.field329 += var7 * var8 - 1048576;
                if (var10 < var9) {
                    var9 = var10;
                }
                arg0 -= var8;
                class164 var11 = arg4.field308;
                if (this.field2394.field2264[arg4.field315] == 0) {
                    arg4.field308 = class164.method1094(arg4.field306, var11.method1092(), var11.method1084(), var11.method1066());
                } else {
                    arg4.field308 = class164.method1094(arg4.field306, var11.method1092(), 0, var11.method1066());
                    this.field2394.method765(arg4.field319.field1923[arg4.field320] < 0, false, arg4);
                    arg4.field308.method1085(var9, var11.method1084());
                }
                if (arg4.field319.field1923[arg4.field320] < 0) {
                    arg4.field308.method1086(-1);
                }
                var11.method1097(var9);
                var11.method277(arg3, arg5, arg1 - arg5);
                if (var11.method1090()) {
                    this.field2397.method285(var11);
                }
            }
        }
        if (arg2 == -1048576) {
            arg4.field308.method277(arg3, arg5, arg0);
        }
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V")
    public static void method779(int arg0) {
        field2381 = null;
        field2383 = null;
        field2395 = null;
        field2378 = null;
        field2387 = null;
        field2390 = null;
        if (arg0 > -88) {
            method779(7);
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lle;)V")
    public class113(class109 arg0) {
        this.field2394 = arg0;
    }
}
