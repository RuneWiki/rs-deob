import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class311 extends OutputStream {

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "Ltl;")
    public static class59 field5281 = class85.method639("hitmarks", 9588);

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "Ltl;")
    private static class59 field5284 = class85.method639(" more options", 9588);

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "[I")
    public static int[] field5276 = new int[2];

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "Ltl;")
    public static class59 field5285 = field5284;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "[I")
    public static int[] field5274;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lim;Z)[Lfk;", line = 6)
    public static final class143[] method2146(class175 arg0, boolean arg1) {
        field5275++;
        if (!arg1) {
            field5281 = (class59) null;
        }
        if (!arg0.method1286(5513)) {
            return new class143[0];
        }
        class257 var2 = arg0.method1298((byte) 32);
        while (var2.field4256 == 0) {
            class183.method1360(false, 10L);
        }
        if (var2.field4256 == 2) {
            return new class143[0];
        }
        int[] var3 = (int[]) ((int[]) var2.field4255);
        class143[] var4 = new class143[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class143 var6 = new class143();
            var4[var5] = var6;
            var6.field2367 = var3[var5 << 2];
            var6.field2364 = var3[(var5 << 2) + 1];
            var6.field2366 = var3[(var5 << 2) + 2];
            var6.field2359 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 48)
    public static final void method2147(int arg0) {
        if (class21.field284 != null) {
            class21.field284.method1257(1185568552);
            class21.field284 = null;
        }
        class161.method1145((byte) 30);
        field5283++;
        class43.method294();
        for (int var1 = 0; var1 < 4; var1++) {
            class41.field612[var1].method198(31407);
        }
        class245.method1733(0);
        System.gc();
        class162.method1156(-1, 2);
        class211.field3454 = -1;
        class254.field4219 = false;
        class138.method1009(true, true);
        class197.field3249 = 0;
        class187.field3135 = 0;
        class97.field1562 = false;
        for (int var2 = 0; var2 < class200.field3318.length; var2++) {
            class200.field3318[var2] = null;
        }
        class185.field3107 = 0;
        class29.field385 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class211.field3438[var3] = null;
            class299.field5119[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class23.field311[var4] = null;
        }
        if (arg0 > -102) {
            field5284 = (class59) null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class159.field2604[var5][var6][var7] = null;
                }
            }
        }
        class167.method1178(-1);
        class101.field1653 = 0;
        class20.method136(true, (byte) 110);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V", line = 141)
    public static void method2148(boolean arg0) {
        field5281 = null;
        field5284 = null;
        field5285 = null;
        if (arg0) {
            field5276 = (int[]) null;
        }
        field5276 = null;
        field5274 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)I", line = 169)
    public static final int method2149(int arg0, int arg1, int arg2, int arg3) {
        field5279++;
        if ((class308.field5219[arg2][arg0][arg3] & 0x8) != 0) {
            return 0;
        } else if (arg2 <= 0 || (class308.field5219[1][arg0][arg3] & 0x2) == 0) {
            int var4 = 126 / ((-arg1 - 12) / 63);
            return arg2;
        } else {
            return arg2 - 1;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V", line = 185)
    public static final void method2150(byte arg0) {
        field5271++;
        if (arg0 < 34) {
            field5276 = (int[]) null;
        }
        for (class255 var1 = (class255) class108.field1802.method536(2); var1 != null; var1 = (class255) class108.field1802.method533(24)) {
            class116 var2 = var1.field4245;
            if (class247.field4119 != var2.field1919 || var2.field1911) {
                var1.method2000(-59);
            } else if (class30.field420 >= var2.field1905) {
                var2.method871(class64.field985, 114);
                if (var2.field1911) {
                    var1.method2000(-25);
                } else {
                    class262.method1807(var2.field1919, var2.field1903, var2.field1896, var2.field1910, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "write", descriptor = "(I)V", line = 222)
    public final void write(int arg0) throws IOException {
        field5282++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)Ltl;", line = 231)
    public static final class59 method2151(int arg0) {
        field5272++;
        if (arg0 < 92) {
            method2147(-127);
        }
        class59 var1 = class275.field4742;
        class59 var2 = class73.field1174;
        if (class268.field4661 != 0) {
            var2 = class132.field2179;
        }
        if (class308.field5233 != null) {
            var1 = class233.method1630(new class59[] { class119.field1990, class308.field5233 }, -2883);
        }
        return class233.method1630(new class59[] { class99.field1591, var2, class184.field3101, class81.method619((byte) -117, class178.field2922), class198.field3292, class81.method619((byte) -126, class124.field2055), var1, class17.field215 }, -2883);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILch;)V", line = 255)
    public static final void method2152(int arg0, class102 arg1) {
        class308 var2 = (class308) class206.field3365.method685(arg1.field1663.method488((byte) -60), 128);
        if (var2 == null) {
            class85.method640(arg1, -112, 0, arg1.field1729[0], (class23) null, class247.field4119, (class180) null, arg1.field1773[0]);
        } else {
            var2.method2136(-15031);
        }
        field5278++;
        if (arg0 >= -75) {
            method2148(true);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IJ)V", line = 274)
    public static final void method2153(int arg0, long arg1) {
        field5280++;
        if (arg1 == 0L) {
            return;
        }
        class234.field3888.method1768(true, 161);
        if (arg0 != -1) {
            field5273 = 88;
        }
        class234.field3888.method1206(arg1, false);
        class150.field2462++;
    }
}
