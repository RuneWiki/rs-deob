import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class204 implements Runnable {

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "[Lhi;")
    public volatile class79[] field4004 = new class79[2];

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "Z")
    public volatile boolean field4002 = false;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "Z")
    public volatile boolean field3990 = false;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "Lrd;")
    private static class173 field3994 = class133.method843("Your ignore list is full)3 Max of 100 users)3", 33);

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "Lrd;")
    public static class173 field3993 = field3994;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3991 = new CRC32();

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "B")
    public static byte field3992;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "Lna;")
    public class130 field3996;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILpg;)V")
    public static final void method1355(int arg0, class156 arg1) {
        field4000++;
        if (arg1.field2937 != null) {
            arg1.field2937.field3611 = 0;
        }
        arg1.field2935 = false;
        for (class156 var2 = arg1.method101(); var2 != null; var2 = arg1.method116()) {
            method1355(0, var2);
        }
        if (arg0 != 0) {
            field3994 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public static void method1356(int arg0) {
        field3993 = null;
        field3994 = null;
        field3991 = null;
        if (arg0 < 25) {
            method1358(null, (byte) -107);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILqf;BILsa;II)V")
    public static final void method1357(int arg0, class165 arg1, byte arg2, int arg3, class180 arg4, int arg5, int arg6) {
        field3997++;
        if (arg4 == null) {
            return;
        }
        int var7 = class140.field2620 + class140.field2614 & 0x7FF;
        int var8 = arg0 * arg0 + arg6 * arg6;
        int var9 = Math.max(arg1.field3156 / 2, arg1.field3105 / 2) + 10;
        if (arg2 > -35) {
            method1360(-127, null, null, -22, 78);
        }
        if (var9 * var9 < var8) {
            return;
        }
        int var10 = class72.field1396[var7];
        int var11 = var10 * 256 / (class167.field3225 + 256);
        int var12 = class72.field1404[var7];
        int var13 = var12 * 256 / (class167.field3225 + 256);
        int var14 = arg0 * var13 + arg6 * var11 >> 16;
        int var15 = arg6 * var13 - arg0 * var11 >> 16;
        arg4.method1227(arg1.field3156 / 2 + var14 + arg5 - arg4.field3548 / 2, arg1.field3105 / 2 + -(arg4.field3542 / 2) + arg3 + -var15, arg1.field3053, arg1.field3089);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lqf;B)Z")
    public static final boolean method1358(class165 arg0, byte arg1) {
        int var2 = arg0.field3170;
        field3998++;
        if (arg1 != 120) {
            return false;
        } else if (var2 == 205) {
            class63.field1243 = 250;
            return true;
        } else {
            if (var2 >= 300 && var2 <= 313) {
                int var3 = var2 & 0x1;
                int var4 = (var2 - 300) / 2;
                class193.field3760.method704(var3 == 1, var4, (byte) 20);
            }
            if (var2 >= 314 && var2 <= 323) {
                int var5 = (var2 - 314) / 2;
                int var6 = var2 & 0x1;
                class193.field3760.method700(true, var5, var6 == 1);
            }
            if (var2 == 324) {
                class193.field3760.method694(false, -6);
            }
            if (var2 == 325) {
                class193.field3760.method694(true, -6);
            }
            if (var2 == 326) {
                class111.field2060++;
                class165.field3175.method1023(109, -21822);
                class193.field3760.method696(112, class165.field3175);
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lbc;ILbc;)I")
    public static final int method1359(class14 arg0, int arg1, class14 arg2) {
        field3999++;
        int var3 = arg1;
        if (arg2.method126(class22.field486, arg1 ^ 0xFFFFAA96)) {
            var3 = arg1 + 1;
        }
        if (arg0.method126(class203.field3962, arg1 - 21866)) {
            var3++;
        }
        if (arg0.method126(class216.field4194, -21866)) {
            var3++;
        }
        if (arg0.method126(class177.field3463, -21866)) {
            var3++;
        }
        if (arg0.method126(class172.field3362, -21866)) {
            var3++;
        }
        if (arg0.method126(class63.field1237, -21866)) {
            var3++;
        }
        arg0.method126(class67.field1304, arg1 - 21866);
        arg0.method126(class176.field3452, -21866);
        arg0.method126(class87.field1707, arg1 - 21866);
        arg0.method126(class207.field4033, arg1 - 21866);
        arg0.method126(class171.field3309, arg1 - 21866);
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[Lrd;[SII)V")
    public static final void method1360(int arg0, class173[] arg1, short[] arg2, int arg3, int arg4) {
        if (arg4 != 1) {
            method1358(null, (byte) 14);
        }
        field3989++;
        if (arg3 <= arg0) {
            return;
        }
        int var5 = arg0;
        int var6 = (arg0 + arg3) / 2;
        class173 var7 = arg1[var6];
        arg1[var6] = arg1[arg3];
        arg1[arg3] = var7;
        short var8 = arg2[var6];
        arg2[var6] = arg2[arg3];
        arg2[arg3] = var8;
        for (int var9 = arg0; var9 < arg3; var9++) {
            if (var7 == null || arg1[var9] != null && arg1[var9].method1133(arg4 ^ 0xFFFFFF9A, var7) < (var9 & 0x1)) {
                class173 var10 = arg1[var9];
                arg1[var9] = arg1[var5];
                arg1[var5] = var10;
                short var11 = arg2[var9];
                arg2[var9] = arg2[var5];
                arg2[var5++] = var11;
            }
        }
        arg1[arg3] = arg1[var5];
        arg1[var5] = var7;
        arg2[arg3] = arg2[var5];
        arg2[var5] = var8;
        method1360(arg0, arg1, arg2, var5 - 1, 1);
        method1360(var5 + 1, arg1, arg2, arg3, 1);
    }

    @OriginalMember(owner = "client!uf", name = "run", descriptor = "()V")
    public final void run() {
        this.field3990 = true;
        try {
            while (!this.field4002) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class79 var2 = this.field4004[var1];
                    if (var2 != null) {
                        var2.method485(true);
                    }
                }
                class151.method996(12121, 10L);
                class140.method869(null, false, this.field3996);
            }
        } catch (Exception var9) {
            class74.method461((byte) -123, var9, null);
        } finally {
            Object var6 = null;
            this.field3990 = false;
        }
        field3995++;
    }
}
