import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class145 extends class76 {

    @OriginalMember(owner = "client!oj", name = "Y", descriptor = "I")
    private int field2529 = 1;

    @OriginalMember(owner = "client!oj", name = "Z", descriptor = "I")
    private int field2530 = 1;

    @OriginalMember(owner = "client!oj", name = "db", descriptor = "I")
    private int field2534 = 204;

    @OriginalMember(owner = "client!oj", name = "bb", descriptor = "Lia;")
    public static class257 field2532 = class28.method234(127, "b12_full");

    @OriginalMember(owner = "client!oj", name = "hb", descriptor = "[S")
    public static short[] field2538 = new short[256];

    @OriginalMember(owner = "client!oj", name = "gb", descriptor = "B")
    public static byte field2537 = 0;

    @OriginalMember(owner = "client!oj", name = "kb", descriptor = "I")
    public static int field2541 = 0;

    @OriginalMember(owner = "client!oj", name = "jb", descriptor = "I")
    public static int field2540 = 100;

    @OriginalMember(owner = "client!oj", name = "ab", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!oj", name = "cb", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!oj", name = "eb", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!oj", name = "fb", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!oj", name = "ib", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(II)[I")
    public final int[] method169(int arg0, int arg1) {
        ++field2535;
        if (arg0 != -9351) {
            this.method169(-4, -73);
        }
        int[] var3 = super.field1467.method1182((byte) -48, arg1);
        if (super.field1467.field2980) {
            for (int var4 = 0; class96.field1807 > var4; ++var4) {
                int var5 = class10.field197[arg1];
                int var6 = class137.field2457[var4];
                int var7 = this.field2529 * var5 >> 12;
                int var8 = this.field2530 * var6 >> 12;
                int var9 = var6 % (4096 / this.field2530) * this.field2530;
                int var10 = var5 % (4096 / this.field2529) * this.field2529;
                if (~this.field2534 < ~var10) {
                    for (var8 -= var7; ~var8 > -1; var8 += 4) {
                    }
                    while (var8 > 3) {
                        var8 -= 4;
                    }
                    if (~var8 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var9 < this.field2534) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field2534 > var9) {
                    int var11;
                    for (var11 = var8 - var7; ~var11 > -1; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lia;I)V")
    public static final void method979(class257 arg0, int arg1) {
        ++field2533;
        if (~class59.field1244 <= -3) {
            if (arg0.method1681((byte) 31, class185.field3222)) {
                for (int var2 = 0; var2 < 10; ++var2) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() + -var3.freeMemory()) / 1024L);
                class197.method1317(-67, 0, class233.method1528(new class257[] { class85.field1655, class111.method808(arg1 ^ 11, var4), class58.field1230 }, 0), (class257) null);
            }
            if (arg0.method1681((byte) -111, class180.field3135)) {
                class44.method345(79);
            }
            if (arg0.method1681((byte) -119, class131.field2348)) {
                class209.method1404((byte) -38, 25);
            }
            if (arg0.method1681((byte) -107, class154.field2707)) {
                class171.field2937 = true;
            }
            if (arg0.method1681((byte) -113, class45.field1045)) {
                class171.field2937 = false;
            }
            if (arg0.method1681((byte) 94, class238.field4100)) {
                for (int var5 = 0; var5 < 4; ++var5) {
                    for (int var6 = 1; ~var6 > -104; ++var6) {
                        for (int var7 = 1; ~var7 > -104; ++var7) {
                            class173.field2961[var5].field4075[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg0.method1673(class7.field145, (byte) 104) && ~class165.field2879 != -1) {
                class46.method358((byte) 109, arg0.method1674(6, 255).method1708((byte) -92));
            }
            if (arg0.method1681((byte) 92, class62.field1296) && class165.field2879 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method1673(class193.field3283, (byte) 76)) {
                class156.field2738 = arg0.method1674(12, 255).method1716((byte) 92).method1708((byte) -92);
                class197.method1317(-94, 0, class233.method1528(new class257[] { class143.field2511, class111.method808(10, class156.field2738) }, 0), (class257) null);
            }
            if (arg0.method1681((byte) 13, class224.field3773)) {
                class87.field1695 = true;
            }
        }
        ++class43.field860;
        class205.field3524.method908(false, 235);
        class205.field3524.method1023(13195, -1 + arg0.method1679((byte) 109));
        if (arg1 != 1) {
            field2541 = 103;
        }
        class205.field3524.method1068(arg0.method1674(2, 255), 0);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field2534 = arg0.method1063(-17162);
                }
            } else {
                this.field2529 = arg0.method1051((byte) 85);
            }
        } else {
            this.field2530 = arg0.method1051((byte) -36);
        }
        if (arg1 >= -86) {
            method979((class257) null, 67);
        }
        ++field2539;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIILij;Lij;IIIIJ)V")
    public static final void method980(int arg0, int arg1, int arg2, int arg3, class166 arg4, class166 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 != null) {
            class7 var12 = new class7();
            var12.field154 = arg10;
            var12.field157 = arg1 * 128 + 64;
            var12.field159 = arg2 * 128 + 64;
            var12.field144 = arg3;
            var12.field147 = arg4;
            var12.field156 = arg5;
            var12.field158 = arg6;
            var12.field155 = arg7;
            var12.field148 = arg8;
            var12.field150 = arg9;
            for (int var13 = arg0; var13 >= 0; --var13) {
                if (class75.field1463[var13][arg1][arg2] == null) {
                    class75.field1463[var13][arg1][arg2] = new class177(var13, arg1, arg2);
                }
            }
            class75.field1463[arg0][arg1][arg2].field3022 = var12;
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(B)V")
    public static void method981(byte arg0) {
        field2532 = null;
        field2538 = null;
        int var1 = -118 / ((70 - arg0) / 55);
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V")
    public class145() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V")
    public static final void method982(boolean arg0) {
        ++field2536;
        if (arg0) {
            for (int var1 = 0; class140.field2487 > var1; ++var1) {
                int var2 = class199.field3412[var1];
                class197 var3 = class92.field1758[var2];
                if (var3 != null) {
                    class39.method318(128, var3, var3.field3322.field3390);
                }
            }
        }
    }
}
