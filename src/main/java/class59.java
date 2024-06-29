import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class59 extends class240 {

    @OriginalMember(owner = "client!kg", name = "H", descriptor = "Lb;")
    public class48 field1283 = new class48();

    @OriginalMember(owner = "client!kg", name = "K", descriptor = "Llh;")
    public class19 field1286 = new class19();

    @OriginalMember(owner = "client!kg", name = "B", descriptor = "Lie;")
    private class69 field1277;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "I")
    public static int field1275 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "Lsg;")
    private static class30 field1273 = class167.method1221((byte) 33, "Ok");

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "Lsg;")
    public static class30 field1274 = field1273;

    @OriginalMember(owner = "client!kg", name = "C", descriptor = "[I")
    public static int[] field1278 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!kg", name = "N", descriptor = "Lhh;")
    public static class173 field1289 = new class173(5000);

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!kg", name = "D", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!kg", name = "E", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!kg", name = "F", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!kg", name = "G", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!kg", name = "I", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!kg", name = "J", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!kg", name = "L", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!kg", name = "M", descriptor = "[I")
    public static int[] field1288;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "()I")
    public final int method185() {
        field1279++;
        return 0;
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "()Loa;")
    public final class240 method179() {
        class154 var1 = (class154) this.field1283.method478(0);
        field1287++;
        if (var1 == null) {
            return null;
        } else if (var1.field2939 == null) {
            return this.method182();
        } else {
            return var1.field2939;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IILdb;)V")
    private final void method545(int arg0, int arg1, class154 arg2) {
        field1281++;
        if (arg1 != 1419884001) {
            field1275 = -1;
        }
        if ((this.field1277.field1571[arg2.field2924] & 0x4) != 0 && arg2.field2937 < 0) {
            int var4 = this.field1277.field1551[arg2.field2924] / class121.field2389;
            int var5 = (var4 + 1048575 - arg2.field2933) / var4;
            arg2.field2933 = arg0 * var4 + arg2.field2933 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field1277.field1560[arg2.field2924] == 0) {
                    arg2.field2939 = class38.method394(arg2.field2925, arg2.field2939.method372(), arg2.field2939.method368(), arg2.field2939.method379());
                } else {
                    arg2.field2939 = class38.method394(arg2.field2925, arg2.field2939.method372(), 0, arg2.field2939.method379());
                    this.field1277.method625(arg2, arg2.field2929.field3933[arg2.field2932] < 0, (byte) -108);
                }
                if (arg2.field2929.field3933[arg2.field2932] < 0) {
                    arg2.field2939.method392(-1);
                }
                arg0 = arg2.field2933 / var4;
            }
        }
        arg2.field2939.method187(arg0);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZI)V")
    public static final void method546(boolean arg0, int arg1) {
        field1284++;
        byte var2 = 4;
        byte[][] var3 = class159.field2992;
        for (int var4 = 0; var4 < var2; var4++) {
            class67.method603((byte) -59);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class230.field4096[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = (var8 & 0x3E8EC70) >> 24;
                        if (!arg0 || var9 == 0) {
                            int var10 = var8 >> 1 & 0x3;
                            int var11 = (var8 & 0x3FFC) >> 3;
                            int var12 = (var8 & 0xFFF02A) >> 14;
                            int var13 = (var12 / 8 << 8) + var11 / 8;
                            for (int var14 = 0; var14 < class208.field3746.length; var14++) {
                                if (class208.field3746[var14] == var13 && var3[var14] != null) {
                                    var7 = true;
                                    class41.method425((var12 & 0x7) * 8, var3[var14], (var11 & 0x7) * 8, var5 * 8, arg0, var10, var6 * 8, class100.field2032, -83, var9, var4);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class249.method1747(27522, 8, var5 * 8, var6 * 8, var4, 8);
                    }
                }
            }
        }
        if (arg1 >= -121) {
            field1274 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([IBILdb;II)V")
    private final void method547(int[] arg0, byte arg1, int arg2, class154 arg3, int arg4, int arg5) {
        field1276++;
        if (arg1 > -118) {
            this.method183((int[]) null, -107, 64);
        }
        if ((this.field1277.field1571[arg3.field2924] & 0x4) != 0 && arg3.field2937 < 0) {
            int var7 = this.field1277.field1551[arg3.field2924] / class121.field2389;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field2933) / var7;
                if (arg2 < var8) {
                    arg3.field2933 += arg2 * var7;
                    break;
                }
                arg2 -= var8;
                arg3.field2939.method183(arg0, arg4, var8);
                arg3.field2933 += var7 * var8 - 1048576;
                arg4 += var8;
                int var9 = class121.field2389 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class38 var11 = arg3.field2939;
                if (this.field1277.field1560[arg3.field2924] == 0) {
                    arg3.field2939 = class38.method394(arg3.field2925, var11.method372(), var11.method368(), var11.method379());
                } else {
                    arg3.field2939 = class38.method394(arg3.field2925, var11.method372(), 0, var11.method379());
                    this.field1277.method625(arg3, arg3.field2929.field3933[arg3.field2932] < 0, (byte) -99);
                    arg3.field2939.method374(var9, var11.method368());
                }
                if (arg3.field2929.field3933[arg3.field2932] < 0) {
                    arg3.field2939.method392(-1);
                }
                var11.method384(var9);
                var11.method183(arg0, arg4, arg5 - arg4);
                if (var11.method398()) {
                    this.field1286.method177(var11);
                }
            }
        }
        arg3.field2939.method183(arg0, arg4, arg2);
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(I)V")
    public final void method187(int arg0) {
        field1282++;
        this.field1286.method187(arg0);
        for (class154 var2 = (class154) this.field1283.method478(0); var2 != null; var2 = (class154) this.field1283.method476((byte) 13)) {
            if (!this.field1277.method621(96, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2914) {
                        this.method545(var3, 1419884001, var2);
                        var2.field2914 -= var3;
                        break;
                    }
                    this.method545(var2.field2914, 1419884001, var2);
                    var3 -= var2.field2914;
                } while (!this.field1277.method626(var2, var3, 0, (byte) 70, (int[]) null));
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    public static void method548(byte arg0) {
        if (arg0 != -27) {
            field1273 = null;
        }
        field1289 = null;
        field1273 = null;
        field1288 = null;
        field1274 = null;
        field1278 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([III)V")
    public final void method183(int[] arg0, int arg1, int arg2) {
        this.field1286.method183(arg0, arg1, arg2);
        for (class154 var4 = (class154) this.field1283.method478(0); var4 != null; var4 = (class154) this.field1283.method476((byte) 13)) {
            if (!this.field1277.method621(96, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field2914 >= var6) {
                        this.method547(arg0, (byte) -128, var6, var4, var5, var5 + var6);
                        var4.field2914 -= var6;
                        break;
                    }
                    this.method547(arg0, (byte) -126, var4.field2914, var4, var5, var5 + var6);
                    var6 -= var4.field2914;
                    var5 += var4.field2914;
                } while (!this.field1277.method626(var4, var6, var5, (byte) 125, arg0));
            }
        }
        field1280++;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lie;)V")
    public class59(class69 arg0) {
        this.field1277 = arg0;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZI)I")
    public static final int method549(int arg0, boolean arg1, int arg2) {
        field1285++;
        int var3 = 0;
        while (arg0 > 0) {
            var3 = arg2 & 0x1 | var3 << 1;
            arg2 >>>= 0x1;
            arg0--;
        }
        return arg1 ? 96 : var3;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "()Loa;")
    public final class240 method182() {
        field1272++;
        class154 var1;
        do {
            var1 = (class154) this.field1283.method476((byte) 13);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2939 == null);
        return var1.field2939;
    }
}
