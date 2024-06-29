import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class273 extends class88 {

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "Z")
    public boolean field4356 = true;

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "Lvg;")
    public static class22 field4364 = new class22();

    @OriginalMember(owner = "client!gi", name = "X", descriptor = "I")
    public static int field4371 = 1;

    @OriginalMember(owner = "client!gi", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field4373 = " from your friend list first.";

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!gi", name = "R", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!gi", name = "S", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!gi", name = "V", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!gi", name = "Y", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "[I")
    public int[] field4361;

    @OriginalMember(owner = "client!gi", name = "W", descriptor = "[I")
    private int[] field4370;

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "[Ljava/lang/String;")
    private String[] field4362;

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "[[I")
    private int[][] field4357;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(II)I")
    public final int method1826(int arg0, int arg1) {
        if (arg0 <= 39) {
            this.field4362 = null;
        }
        field4366++;
        return this.field4370 == null || arg1 < 0 || arg1 > this.field4370.length ? -1 : this.field4370[arg1];
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)I")
    public final int method1827(boolean arg0) {
        field4365++;
        if (this.field4370 == null) {
            return 0;
        } else {
            if (!arg0) {
                this.method1827(false);
            }
            return this.field4370.length;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIZ)I")
    public final int method1828(int arg0, int arg1, boolean arg2) {
        field4358++;
        if (this.field4370 == null || arg0 < 0 || this.field4370.length < arg0) {
            return -1;
        } else if (this.field4357[arg0] == null || arg1 < 0 || this.field4357[arg0].length < arg1) {
            return -1;
        } else if (arg2) {
            return -79;
        } else {
            return this.field4357[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLpd;I)V")
    private final void method1829(byte arg0, class96 arg1, int arg2) {
        if (arg2 == 1) {
            this.field4362 = class177.method1233((byte) 81, '<', arg1.method588(false));
        } else if (arg2 == 2) {
            int var4 = arg1.method584(255);
            this.field4361 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4361[var5] = arg1.method549(255);
            }
        } else if (arg2 == 3) {
            int var6 = arg1.method584(255);
            this.field4370 = new int[var6];
            this.field4357 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method549(255);
                this.field4370[var7] = var8;
                this.field4357[var7] = new int[class117.field1661[var8]];
                for (int var9 = 0; var9 < class117.field1661[var8]; var9++) {
                    this.field4357[var7][var9] = arg1.method549(255);
                }
            }
        } else if (arg2 == 4) {
            this.field4356 = false;
        }
        field4363++;
        if (arg0 > -84) {
            field4371 = -38;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lpd;B)Ljava/lang/String;")
    public final String method1830(class96 arg0, byte arg1) {
        if (arg1 <= 30) {
            this.field4361 = null;
        }
        StringBuffer var3 = new StringBuffer(80);
        field4367++;
        if (this.field4370 != null) {
            for (int var4 = 0; var4 < this.field4370.length; var4++) {
                var3.append(this.field4362[var4]);
                var3.append(class293.method1966(arg0.method550(false, class136.field2154[this.field4370[var4]]), (byte) 54, this.field4357[var4], this.field4370[var4]));
            }
        }
        var3.append(this.field4362[this.field4362.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lpd;I[I)V")
    public final void method1831(class96 arg0, int arg1, int[] arg2) {
        field4372++;
        if (this.field4370 == null) {
            return;
        }
        for (int var4 = arg1; var4 < this.field4370.length; var4++) {
            if (var4 >= arg2.length) {
                return;
            }
            int var5 = class275.field4392[this.method1826(125, var4)];
            if (var5 > 0) {
                arg0.method540((long) arg2[var4], arg1 ^ 0x59, var5);
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(Z)V")
    public static void method1832(boolean arg0) {
        field4373 = null;
        field4364 = null;
        if (arg0) {
            method1832(true);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lpd;Z)V")
    public final void method1833(class96 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        while (true) {
            int var3 = arg0.method584(255);
            if (var3 == 0) {
                field4359++;
                return;
            }
            this.method1829((byte) -91, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)I")
    public static final int method1834(int arg0) {
        field4355++;
        if (arg0 != 158) {
            field4369 = -64;
        }
        return ((class63.field818 == 0 ? 0 : 1) << 22) + ((class218.field3493 == 0 ? 0 : 1) << 21) + ((class272.field4350 == 0 ? 0 : 1) << 20) + ((class212.field3405 ? 1 : 0) << 19) + (class95.field1201 << 17) + ((class213.field3429 ? 1 : 0) << 13) + (class160.field2549 & 0x3 << 11) + ((class113.field1624 ? 1 : 0) << 10) + ((class196.field3131 ? 1 : 0) << 9) + ((class96.field1281 ? 1 : 0) << 5) + ((class52.field674 ? 1 : 0) << 3) + ((class32.field430 & 0x7) + ((class137.field2207 ? 1 : 0) << 4) + ((class98.field1321 ? 1 : 0) << 6) + (((class259.field4204 ? 1 : 0) << 7) - -((class285.field4525 ? 1 : 0) << 8)) + ((class82.field1021 ? 1 : 0) << 15) - -((class39.field486 ? 1 : 0) << 16) - -(class268.method1799() << 23));
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(Z)Ljava/lang/String;")
    public final String method1835(boolean arg0) {
        field4360++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field4362 == null) {
            return "";
        }
        var2.append(this.field4362[0]);
        for (int var3 = 1; var3 < this.field4362.length; var3++) {
            var2.append("...");
            var2.append(this.field4362[var3]);
        }
        if (!arg0) {
            this.method1827(true);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)V")
    public final void method1836(int arg0) {
        if (this.field4361 != null) {
            for (int var2 = 0; var2 < this.field4361.length; var2++) {
                this.field4361[var2] = class154.method1048(this.field4361[var2], 32768);
            }
        }
        field4368++;
        int var3 = 32 % ((27 - arg0) / 62);
    }
}
