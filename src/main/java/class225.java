import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class225 extends class123 {

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "Ljava/lang/String;")
    public static String field3482 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "Lgd;")
    public static class325 field3481 = new class325(16);

    @OriginalMember(owner = "client!lb", name = "M", descriptor = "[I")
    public static int[] field3492 = new int[2];

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "F")
    public static float field3487;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!lb", name = "K", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "Ljava/lang/String;")
    public String field3486;

    @OriginalMember(owner = "client!lb", name = "O", descriptor = "Z")
    public static boolean field3494;

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "[C")
    public char[] field3485;

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "[C")
    public char[] field3491;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "[I")
    public int[] field3477;

    @OriginalMember(owner = "client!lb", name = "N", descriptor = "[I")
    public int[] field3493;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Laj;B)V", line = 8)
    public final void method1644(class1 arg0, byte arg1) {
        int var3 = -18 % ((-arg1 - 48) / 36);
        field3478++;
        while (true) {
            int var4 = arg0.method15((byte) -81);
            if (var4 == 0) {
                return;
            }
            this.method1651(0, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V", line = 31)
    public static void method1645(int arg0) {
        field3481 = null;
        if (arg0 > 7) {
            field3492 = null;
            field3482 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V", line = 43)
    public static final void method1646(byte arg0) {
        class42.method381();
        field3476++;
        int var1 = 0;
        if (arg0 != 103) {
            method1652(-24, (String) null);
        }
        while (var1 < 4) {
            class166.field2686[var1].method437(false);
            var1++;
        }
        System.gc();
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([BIII)Ljava/lang/String;", line = 75)
    public static final String method1647(byte[] arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2;
        char[] var5 = new char[arg3];
        for (int var6 = 0; var6 < arg3; var6++) {
            int var7 = arg0[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class216.field3355[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var5[var4++] = (char) var7;
            }
        }
        field3483++;
        return new String(var5, 0, var4);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(CB)I", line = 112)
    public final int method1648(char arg0, byte arg1) {
        field3480++;
        if (this.field3493 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field3493.length; var3++) {
            if (this.field3485[var3] == arg0) {
                return this.field3493[var3];
            }
        }
        if (arg1 <= 19) {
            method1647((byte[]) null, 65, -94, -76);
        }
        return -1;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BC)I", line = 140)
    public final int method1649(byte arg0, char arg1) {
        field3490++;
        if (this.field3477 == null) {
            return -1;
        }
        int var3 = -42 % ((-arg0 - 15) / 52);
        for (int var4 = 0; var4 < this.field3477.length; var4++) {
            if (this.field3491[var4] == arg1) {
                return this.field3477[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILlk;BIIII)V", line = 167)
    public static final void method1650(int arg0, class294 arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field3489++;
        class105.method845(arg3, arg6, arg0, arg4, arg1.field4671, arg5, arg1.field4672, (byte) 57);
        int var7 = -56 % ((-arg2 - 33) / 35);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILaj;)V", line = 177)
    private final void method1651(int arg0, int arg1, class1 arg2) {
        field3479++;
        if (arg1 == 1) {
            this.field3486 = arg2.method53(32);
        } else if (arg1 == 2) {
            int var7 = arg2.method15((byte) 75);
            this.field3491 = new char[var7];
            this.field3477 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3477[var8] = arg2.method56(class85.method677(arg0, 19612));
                byte var9 = arg2.method55(4);
                this.field3491[var8] = var9 == 0 ? 0 : class15.method188(var9, 11546);
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method15((byte) 90);
            this.field3485 = new char[var4];
            this.field3493 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3493[var5] = arg2.method56(19612);
                byte var6 = arg2.method55(arg0 ^ 0x4);
                this.field3485[var5] = var6 == 0 ? 0 : class15.method188(var6, 11546);
            }
        } else if (arg1 != 4) {
        }
        if (arg0 != 0) {
            this.field3477 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 241)
    public static final String method1652(int arg0, String arg1) {
        field3484++;
        if (arg0 > -90) {
            return (String) null;
        } else {
            int var2 = class137.method1058(-61, arg1);
            return var2 == -1 ? "" : class220.method1603(" ", (byte) 5, "<br>", class62.field903.field1775[var2]);
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)V", line = 272)
    public final void method1653(byte arg0) {
        if (arg0 >= -109) {
            method1647((byte[]) null, 86, -126, 103);
        }
        if (this.field3493 != null) {
            for (int var2 = 0; var2 < this.field3493.length; var2++) {
                this.field3493[var2] = class251.method1740(this.field3493[var2], 32768);
            }
        }
        field3488++;
        if (this.field3477 != null) {
            for (int var3 = 0; var3 < this.field3477.length; var3++) {
                this.field3477[var3] = class251.method1740(this.field3477[var3], 32768);
            }
        }
    }
}
