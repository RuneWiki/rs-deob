import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class41 extends class147 {

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "I")
    public int field486 = 0;

    @OriginalMember(owner = "client!gh", name = "E", descriptor = "I")
    public int field497 = -1;

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "Lpn;")
    public static class72 field491 = new class72(78, 3);

    @OriginalMember(owner = "client!gh", name = "D", descriptor = "Lss;")
    public static class140 field496 = new class140(4, 5);

    @OriginalMember(owner = "client!gh", name = "G", descriptor = "Lsd;")
    public static class74 field499 = new class74(23, -2);

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "Lwb;")
    public static class45 field502 = new class45(16);

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "[I")
    public static int[] field503 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public int field481;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public int field482;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    public int field483;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    public int field485;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
    public int field487;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "I")
    public int field488;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "I")
    public int field489;

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "I")
    public int field490;

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "I")
    public int field492;

    @OriginalMember(owner = "client!gh", name = "A", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!gh", name = "C", descriptor = "I")
    public int field495;

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!gh", name = "B", descriptor = "Lud;")
    public static class2 field494;

    @OriginalMember(owner = "client!gh", name = "F", descriptor = "Lcs;")
    public static class422 field498;

    @OriginalMember(owner = "client!gh", name = "I", descriptor = "Ljava/awt/Frame;")
    public static Frame field500;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILjava/lang/String;)J", line = 7)
    public static final long method207(int arg0, String arg1) {
        field484++;
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = arg0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (1 - (97 - var6));
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V", line = 51)
    public static void method208(int arg0) {
        field500 = null;
        field491 = null;
        if (arg0 != -16099) {
            method208(-119);
        }
        field502 = null;
        field503 = null;
        field494 = null;
        field499 = null;
        field496 = null;
        field498 = null;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V", line = 70)
    public static final void method209(int arg0) {
        field493++;
        int var1 = -21 / ((2 - arg0) / 60);
        for (int var2 = 0; var2 < class221.field3084; var2++) {
            int var10002 = class79.field943[var2]--;
            if (class79.field943[var2] >= -10) {
                class245 var4 = class305.field4511[var2];
                if (var4 == null) {
                    var4 = class245.method1333(class90.field1129, class342.field4898[var2], 0);
                    if (var4 == null) {
                        continue;
                    }
                    class79.field943[var2] += var4.method1336();
                    class305.field4511[var2] = var4;
                }
                if (class79.field943[var2] < 0) {
                    int var6;
                    if (class169.field2004[var2] == 0) {
                        var6 = class73.field881[var2] * class304.field4494 >> 8;
                    } else {
                        int var5 = (class169.field2004[var2] & 0x341E3C8) >> 24;
                        if (class19.field258.field994 == var5) {
                            int var7 = (class169.field2004[var2] & 0xFF) * 128;
                            int var8 = (class169.field2004[var2] & 0xFF0020) >> 16;
                            int var9 = var8 * 128 - (class19.field258.field1008 - 64);
                            if (var9 < 0) {
                                var9 = -var9;
                            }
                            int var10 = class169.field2004[var2] >> 8 & 0xFF;
                            int var11 = var10 * 128 + 64 - class19.field258.field1005;
                            if (var11 < 0) {
                                var11 = -var11;
                            }
                            int var12 = var9 + var11 - 128;
                            if (var7 < var12) {
                                class79.field943[var2] = -100;
                                continue;
                            }
                            if (var12 < 0) {
                                var12 = 0;
                            }
                            var6 = class73.field881[var2] * class376.field5363 * (var7 - var12) / var7 >> 8;
                        } else {
                            var6 = 0;
                        }
                    }
                    if (var6 > 0) {
                        class436 var13 = var4.method1334().method2593(class185.field2435);
                        class250 var14 = class250.method1530(var13, 100, var6);
                        var14.method1524(class58.field729[var2] - 1);
                        class226.field3136.method508(var14);
                    }
                    class79.field943[var2] = -100;
                }
            } else {
                class221.field3084--;
                for (int var3 = var2; var3 < class221.field3084; var3++) {
                    class342.field4898[var3] = class342.field4898[var3 + 1];
                    class305.field4511[var3] = class305.field4511[var3 + 1];
                    class58.field729[var3] = class58.field729[var3 + 1];
                    class79.field943[var3] = class79.field943[var3 + 1];
                    class169.field2004[var3] = class169.field2004[var3 + 1];
                    class73.field881[var3] = class73.field881[var3 + 1];
                }
                var2--;
            }
        }
        if (class60.field756 && !class176.method864(105)) {
            if (class224.field3102 != 0 && class46.field593 != -1) {
                class53.method286(class93.field1162, class224.field3102, class46.field593, (byte) 91, false, 0);
            }
            class60.field756 = false;
        } else if (class224.field3102 != 0 && class46.field593 != -1 && !class176.method864(103)) {
            class90.field1124++;
            class244.method1332((byte) 124, class462.field6517);
            class230.field3185.method897(class46.field593, -111);
            class46.field593 = -1;
        }
    }
}
