import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class139 extends class182 {

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "I")
    private int field2355 = 204;

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
    private int field2359 = 1;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
    private int field2356 = 1;

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "Llj;")
    public static class59 field2361 = new class59(64);

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "Z")
    public static boolean field2362 = false;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)[I", line = 5)
    public final int[] method125(int arg0, int arg1) {
        field2357++;
        int[] var3 = this.field3166.method775(arg1, 127);
        if (this.field3166.field1903) {
            for (int var4 = 0; var4 < class26.field672; var4++) {
                int var5 = class248.field4066[arg1];
                int var6 = this.field2359 * var5 >> 12;
                int var7 = var5 % (4096 / this.field2359) * this.field2359;
                int var8 = class21.field539[var4];
                int var9 = var8 % (4096 / this.field2356) * this.field2356;
                int var10 = this.field2356 * var8 >> 12;
                if (var7 < this.field2355) {
                    for (var10 -= var6; var10 < 0; var10 += 4) {
                    }
                    while (var10 > 3) {
                        var10 -= 4;
                    }
                    if (var10 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field2355 > var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field2355) {
                    int var11;
                    for (var11 = var10 - var6; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return arg0 == 2 ? var3 : (int[]) null;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V", line = 175)
    public class139() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZLjava/lang/String;B)V", line = 96)
    public static final void method963(boolean arg0, String arg1, byte arg2) {
        field2358++;
        String var3 = arg1.toLowerCase();
        int var4 = 0;
        int var5 = arg0 ? 32768 : 0;
        short[] var6 = new short[16];
        int var7 = (arg0 ? class141.field2381 : class220.field3660) + var5;
        int var8 = -96 / ((arg2 - 18) / 53);
        for (int var9 = var5; var9 < var7; var9++) {
            class35 var10 = class335.method2362(104, var9);
            if (var10.field779 && var10.method254(-106).toLowerCase().indexOf(var3) != -1) {
                if (var4 >= 50) {
                    class320.field5203 = null;
                    class296.field4836 = -1;
                    return;
                }
                if (var6.length <= var4) {
                    short[] var11 = new short[var6.length * 2];
                    for (int var12 = 0; var12 < var4; var12++) {
                        var11[var12] = var6[var12];
                    }
                    var6 = var11;
                }
                var6[var4++] = (short) var9;
            }
        }
        class122.field2161 = 0;
        class320.field5203 = var6;
        class296.field4836 = var4;
        String[] var13 = new String[class296.field4836];
        for (int var14 = 0; var14 < class296.field4836; var14++) {
            var13[var14] = class335.method2362(104, var6[var14]).method254(52);
        }
        class75.method570(class320.field5203, true, var13);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V", line = 186)
    public static void method964(byte arg0) {
        field2361 = null;
        if (arg0 != -97) {
            method964((byte) -18);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Loe;IB)V", line = 197)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        if (arg2 != 60) {
            this.field2355 = -76;
        }
        if (arg1 == 0) {
            this.field2356 = arg0.method1005((byte) 122);
        } else if (arg1 == 1) {
            this.field2359 = arg0.method1005((byte) 122);
        } else if (arg1 == 2) {
            this.field2355 = arg0.method989(arg2 ^ 0x0);
        }
        field2360++;
    }
}
