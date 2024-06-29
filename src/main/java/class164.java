import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class164 extends class406 {

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "J")
    public long field2315;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public static int field2318 = 0;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "[I")
    public static int[] field2322 = new int[13];

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "[I")
    public static int[] field2317 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "[I")
    public static int[] field2321;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(CI)C")
    public static final char method1122(char arg0, int arg1) {
        field2316++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            if (arg1 > -12) {
                field2322 = null;
            }
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
    public class164() {
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)[B")
    public static final byte[] method1123(int arg0, int arg1) {
        int var2 = -16 / ((arg1 - 44) / 59);
        field2323++;
        class131 var3 = (class131) class77.field911.method856((long) arg0, (byte) 123);
        if (var3 == null) {
            byte[] var4 = new byte[512];
            Random var5 = new Random((long) arg0);
            for (int var6 = 0; var6 < 255; var6++) {
                var4[var6] = (byte) var6;
            }
            for (int var7 = 0; var7 < 255; var7++) {
                int var8 = 255 - var7;
                int var9 = class211.method1428(var5, var8, -125);
                byte var10 = var4[var9];
                var4[var9] = var4[var8];
                var4[var8] = var4[511 - var7] = var10;
            }
            var3 = new class131(var4);
            class77.field911.method849((byte) 63, var3, (long) arg0);
        }
        return var3.field1590;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public static final void method1124(int arg0) {
        field2319++;
        if (arg0 != 4777) {
            field2317 = null;
        }
        if (class1.field2 < 0) {
            return;
        }
        long var1 = class175.method1195(84);
        class1.field2 = (int) ((long) class1.field2 - (var1 - class42.field517));
        if (class1.field2 > 0) {
            int var3 = (class1.field2 << 8) / field2318;
            int var4 = 255 - var3;
            float var5 = (float) var3 / 255.0F;
            class181.field2481 = ((class186.field2694 & 0xFF00) * var3 + ((class261.field3738.field2472 & 0xFF00) * var4) & 0xFF0000) + ((class186.field2694 & 0xFF00FF) * var3 + (class261.field3738.field2472 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
            float var6 = 1.0F - var5;
            class42.field519 = (class261.field3738.field2469 - class88.field1076) * var6 + class88.field1076;
            class306.field4327 = ((class246.field3488 & 0xFF00FF) * var3 + (class261.field3738.field2461 & 0xFF00FF) * var4 & 0xFF00FF00) + ((class246.field3488 & 0xFF00) * var3 + (class261.field3738.field2461 & 0xFF00) * var4 & 0xFF0000) >>> 8;
            class419.field5992 = (class261.field3738.field2474 - class71.field837) * var6 + class71.field837;
            class291.field4077 = (class261.field3738.field2473 - class237.field3368) * var6 + class237.field3368;
            class160.field2119 = (class261.field3738.field2456 - class288.field4043) * var6 + class288.field4043;
            class222.field3110 = (class261.field3738.field2470 - class153.field1897) * var6 + class153.field1897;
            class244.field3456 = (class261.field3738.field2466 - class225.field3164) * var6 + class225.field3164;
            class397.field5678 = class66.field757 * var3 + (class261.field3738.field2458 * var4) >> 8;
            if (class296.field4124 != class261.field3738.field2468) {
                class382.field5353 = class305.field4288.method603(class296.field4124, class261.field3738.field2468, var6, class382.field5353);
            }
        } else {
            class160.field2119 = class261.field3738.field2456;
            class306.field4327 = class261.field3738.field2461;
            class1.field2 = -1;
            class42.field519 = class261.field3738.field2469;
            class397.field5678 = class261.field3738.field2458;
            class291.field4077 = class261.field3738.field2473;
            class419.field5992 = class261.field3738.field2474;
            class382.field5353 = class261.field3738.field2468;
            class181.field2481 = class261.field3738.field2472;
            class222.field3110 = class261.field3738.field2470;
            class244.field3456 = class261.field3738.field2466;
        }
        class42.field517 = var1;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(J)V")
    public class164(long arg0) {
        this.field2315 = arg0;
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
    public static void method1125(int arg0) {
        field2321 = null;
        if (arg0 != 255) {
            method1125(-83);
        }
        field2317 = null;
        field2322 = null;
    }
}
