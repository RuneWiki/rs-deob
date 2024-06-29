import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class168 implements Runnable {

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Z")
    public boolean field2416 = true;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Ljava/lang/Object;")
    public Object field2419 = new Object();

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "[I")
    public int[] field2426 = new int[500];

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public int field2425 = 0;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "[I")
    public int[] field2427 = new int[500];

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2418 = "Loading - please wait.";

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field2423 = 0;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field2424 = 0;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "Lbc;")
    public static class282 field2420;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLbc;)V")
    public static final void method1101(byte arg0, class282 arg1) {
        class61.field734 = class38.method238(arg1, class159.field2304, false);
        class252.field3639 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var4 = (float) ((class214.field2989[var2] & 0xFF0000) >> 16);
            int var5 = class214.field2989[var2 + 1] >> 16 & 0xFF;
            float var6 = ((float) var5 - var4) / 64.0F;
            float var7 = (float) (class214.field2989[var2] >> 8 & 0xFF);
            int var8 = (class214.field2989[var2 + 1] & 0xFF00) >> 8;
            float var9 = ((float) var8 - var7) / 64.0F;
            float var10 = (float) (class214.field2989[var2] & 0xFF);
            int var11 = class214.field2989[var2 + 1] & 0xFF;
            float var12 = ((float) var11 - var10) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class252.field3639[var2 * 64 + var13] = class220.method1432(class220.method1432((int) var7 << 8, (int) var4 << 16), (int) var10);
                var4 += var6;
                var10 += var12;
                var7 += var9;
            }
        }
        if (arg0 != 97) {
            field2423 = 101;
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class252.field3639[var3] = class214.field2989[3];
        }
        class7.field96 = new int[32768];
        field2417++;
        class88.field1190 = new int[32768];
        class44.method280((class43) null, true);
        class58.field685 = new int[32768];
        class97.field1301 = new int[32768];
        class119.field1680 = new class187(128, 254);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
    public static final void method1102(boolean arg0) {
        if (class177.field2507 != null && (class177.field2507.field4563 + 64 - (class177.field2507.method1556(3888) * 64) >> 7) == class292.field4626 && class177.field2507.field4553 - (class177.field2507.method1556(3888) * 64 - 64) >> 7 == class27.field325) {
            class292.field4626 = 0;
        }
        field2414++;
        for (int var1 = 0; var1 < 104; var1++) {
            for (int var6 = 0; var6 < 104; var6++) {
                class134.field1946[var1][var6] = 0;
            }
        }
        if (arg0) {
            method1102(true);
        }
        for (int var2 = 0; var2 < class238.field3432; var2++) {
            class240 var5 = class253.field3656[class46.field540[var2]];
            if (var5 != null) {
                var5.field4572 = false;
            }
        }
        for (int var3 = 0; var3 < class294.field4642; var3++) {
            class54 var4 = class20.field244[class14.field176[var3]];
            if (var4 != null) {
                var4.field4572 = false;
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)J")
    public static final long method1103(int arg0, int arg1, int arg2) {
        class133 var3 = class6.field94[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field1934; var4++) {
            class243 var5 = var3.field1930[var4];
            if ((var5.field3539 >> 29 & 0x3L) == 2L && var5.field3540 == arg1 && var5.field3527 == arg2) {
                return var5.field3539;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIII)V")
    public static final void method1104(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class94.field1259.field3021 = 0;
        field2422++;
        class94.field1259.method1373(20, -13985);
        class94.field1259.method1373(arg1, -13985);
        class94.field1259.method1373(arg2, arg0 ^ 0xFFFFC95F);
        class94.field1259.method1387(arg3, arg0 + 4);
        class94.field1259.method1387(arg4, 4);
        class84.field1169 = arg0;
        class224.field3164 = 0;
        class143.field2050 = -3;
        class252.field3653 = 1;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static final void method1105(int arg0) {
        for (int var1 = 0; var1 < class48.field554; var1++) {
            class199 var2 = class169.method1108((byte) 115, var1);
            if (var2 != null && var2.field2825 == 0) {
                class19.field224[var1] = 0;
                class164.field2358[var1] = 0;
            }
        }
        class26.field313 = new class284(16);
        if (arg0 != 2171) {
            field2420 = null;
        }
        field2421++;
    }

    @OriginalMember(owner = "client!pb", name = "run", descriptor = "()V")
    public final void run() {
        field2415++;
        while (this.field2416) {
            Object var1 = this.field2419;
            synchronized (this.field2419) {
                if (this.field2425 < 500) {
                    this.field2426[this.field2425] = class104.field1417;
                    this.field2427[this.field2425] = class37.field431;
                    this.field2425++;
                }
            }
            class247.method1595(50L, (byte) -83);
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
    public static void method1106(int arg0) {
        field2420 = null;
        if (arg0 == 16711680) {
            field2418 = null;
        }
    }
}
