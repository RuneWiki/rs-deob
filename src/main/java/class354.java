import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class354 extends class313 {

    @OriginalMember(owner = "client!og", name = "v", descriptor = "Lnj;")
    public class317 field5498 = new class317();

    @OriginalMember(owner = "client!og", name = "A", descriptor = "Ld;")
    public class66 field5503 = new class66();

    @OriginalMember(owner = "client!og", name = "r", descriptor = "Llp;")
    private class53 field5494;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "Lnj;")
    public static class317 field5492 = new class317();

    @OriginalMember(owner = "client!og", name = "y", descriptor = "Lqu;")
    public static class219 field5501 = new class219(23, 15);

    @OriginalMember(owner = "client!og", name = "B", descriptor = "I")
    public static int field5504 = 1;

    @OriginalMember(owner = "client!og", name = "q", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!og", name = "s", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!og", name = "t", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!og", name = "u", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!og", name = "w", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!og", name = "x", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!og", name = "z", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!og", name = "C", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IB[ILnd;II)V")
    private final void method2336(int arg0, byte arg1, int[] arg2, class91 arg3, int arg4, int arg5) {
        if (arg1 > -36) {
            return;
        }
        field5497++;
        if ((this.field5494.field736[arg3.field1317] & 0x4) != 0 && arg3.field1335 < 0) {
            int var7 = this.field5494.field772[arg3.field1317] / class221.field3742;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field1315) / var7;
                if (var8 > arg5) {
                    arg3.field1315 += arg5 * var7;
                    break;
                }
                arg3.field1334.method408(arg2, arg4, var8);
                arg5 -= var8;
                arg3.field1315 += var7 * var8 - 1048576;
                arg4 += var8;
                int var9 = class221.field3742 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class394 var11 = arg3.field1334;
                if (this.field5494.field726[arg3.field1317] == 0) {
                    arg3.field1334 = class394.method2512(arg3.field1316, var11.method2519(), var11.method2532(), var11.method2540());
                } else {
                    arg3.field1334 = class394.method2512(arg3.field1316, var11.method2519(), 0, var11.method2540());
                    this.field5494.method405(arg3, arg3.field1336.field1644[arg3.field1320] < 0, 116);
                    arg3.field1334.method2542(var9, var11.method2532());
                }
                if (arg3.field1336.field1644[arg3.field1320] < 0) {
                    arg3.field1334.method2521(-1);
                }
                var11.method2548(var9);
                var11.method408(arg2, arg4, arg0 - arg4);
                if (var11.method2538()) {
                    this.field5503.method480(var11);
                }
            }
        }
        arg3.field1334.method408(arg2, arg4, arg5);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
    public static void method2337(byte arg0) {
        field5501 = null;
        field5492 = null;
        if (arg0 < 121) {
            field5501 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "()I")
    public final int method385() {
        field5499++;
        return 0;
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "()Lnu;")
    public final class313 method400() {
        field5502++;
        class91 var1;
        do {
            var1 = (class91) this.field5498.method2126((byte) 61);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1334 == null);
        return var1.field1334;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)V")
    public static final void method2338(int arg0, int arg1, int arg2) {
        field5500++;
        class456 var3 = class233.method1654(arg1, arg0, 126);
        var3.method2858(arg0 + 10238);
        var3.field7042 = arg2;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "([III)V")
    public final void method408(int[] arg0, int arg1, int arg2) {
        field5493++;
        this.field5503.method408(arg0, arg1, arg2);
        for (class91 var4 = (class91) this.field5498.method2123(-76); var4 != null; var4 = (class91) this.field5498.method2126((byte) 61)) {
            if (!this.field5494.method390(var4, true)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field1318 >= var5) {
                        this.method2336(var6 + var5, (byte) -100, arg0, var4, var6, var5);
                        var4.field1318 -= var5;
                        break;
                    }
                    this.method2336(var5 + var6, (byte) -120, arg0, var4, var6, var4.field1318);
                    var5 -= var4.field1318;
                    var6 += var4.field1318;
                } while (!this.field5494.method381(var6, -1, arg0, var4, var5));
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "()Lnu;")
    public final class313 method374() {
        field5505++;
        class91 var1 = (class91) this.field5498.method2123(-59);
        if (var1 == null) {
            return null;
        } else if (var1.field1334 == null) {
            return this.method400();
        } else {
            return var1.field1334;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lnd;II)V")
    private final void method2339(class91 arg0, int arg1, int arg2) {
        field5496++;
        if ((this.field5494.field736[arg0.field1317] & 0x4) != arg2 && arg0.field1335 < 0) {
            int var4 = this.field5494.field772[arg0.field1317] / class221.field3742;
            int var5 = (var4 + 1048575 - arg0.field1315) / var4;
            arg0.field1315 = arg1 * var4 + arg0.field1315 & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field5494.field726[arg0.field1317] == 0) {
                    arg0.field1334 = class394.method2512(arg0.field1316, arg0.field1334.method2519(), arg0.field1334.method2532(), arg0.field1334.method2540());
                } else {
                    arg0.field1334 = class394.method2512(arg0.field1316, arg0.field1334.method2519(), 0, arg0.field1334.method2540());
                    this.field5494.method405(arg0, arg0.field1336.field1644[arg0.field1320] < 0, arg2 ^ 0x70);
                }
                if (arg0.field1336.field1644[arg0.field1320] < 0) {
                    arg0.field1334.method2521(-1);
                }
                arg1 = arg0.field1315 / var4;
            }
        }
        arg0.field1334.method383(arg1);
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Llp;)V")
    public class354(class53 arg0) {
        this.field5494 = arg0;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public final void method383(int arg0) {
        this.field5503.method383(arg0);
        field5495++;
        for (class91 var2 = (class91) this.field5498.method2123(-122); var2 != null; var2 = (class91) this.field5498.method2126((byte) 61)) {
            if (!this.field5494.method390(var2, true)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1318) {
                        this.method2339(var2, var3, 0);
                        var2.field1318 -= var3;
                        break;
                    }
                    this.method2339(var2, var2.field1318, 0);
                    var3 -= var2.field1318;
                } while (!this.field5494.method381(0, -1, null, var2, var3));
            }
        }
    }
}
