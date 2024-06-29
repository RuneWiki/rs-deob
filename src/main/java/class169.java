import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class169 {

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "Z")
    public boolean field2685 = false;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public int field2675 = -1;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "[I")
    private int[] field2688 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Z")
    public static boolean field2671 = true;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "[Ltg;")
    public static class181[] field2686 = new class181[14];

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
    public static int field2687 = 0;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    public static int field2682 = 0;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "[I")
    private int[] field2678;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "[S")
    private short[] field2679;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "[S")
    private short[] field2680;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "[S")
    private short[] field2683;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "[S")
    private short[] field2689;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)Z")
    public final boolean method1159(int arg0) {
        field2673++;
        boolean var2 = true;
        if (arg0 != -13922) {
            this.method1164(3, (class221) null, -41);
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2688[var3] != -1 && !class32.field496.method1371((byte) -112, this.field2688[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZIZIB)V")
    public static final void method1160(boolean arg0, int arg1, boolean arg2, int arg3, byte arg4) {
        field2672++;
        class273.method1842(class286.field4527.length - 1, arg0, -1, arg3, arg1, 0, arg2);
        int var5 = -88 % ((-arg4 - 63) / 35);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)Lv;")
    public final class150 method1161(byte arg0) {
        field2677++;
        if (this.field2678 == null) {
            return null;
        }
        class150[] var2 = new class150[this.field2678.length];
        int var3 = 0;
        int var4 = -70 / ((arg0 - 27) / 40);
        while (var3 < this.field2678.length) {
            var2[var3] = class150.method1058(class32.field496, this.field2678[var3], 0);
            var3++;
        }
        class150 var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new class150(var2, var2.length);
        }
        if (this.field2689 != null) {
            for (int var6 = 0; var6 < this.field2689.length; var6++) {
                var5.method1036(this.field2689[var6], this.field2683[var6]);
            }
        }
        if (this.field2679 != null) {
            for (int var7 = 0; var7 < this.field2679.length; var7++) {
                var5.method1035(this.field2679[var7], this.field2680[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILog;)V")
    public final void method1162(int arg0, class221 arg1) {
        field2670++;
        if (arg0 != 0) {
            this.method1159(10);
        }
        while (true) {
            int var3 = arg1.method1517((byte) -96);
            if (var3 == 0) {
                return;
            }
            this.method1164(var3, arg1, 1);
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
    public static final void method1163(int arg0) {
        int var1 = class52.method399(-57);
        if (arg0 > -126) {
            return;
        }
        if (var1 == 0) {
            class227.field3766 = null;
            class113.method835(0, -5260);
        } else if (var1 == 1) {
            class128.method912((byte) 125, (byte) 0);
            class113.method835(512, -5260);
            class92.method696((byte) -112);
        } else {
            class128.method912((byte) -110, (byte) (class209.field3423 - 4 & 0xFF));
            class113.method835(2, -5260);
        }
        field2684++;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILog;I)V")
    private final void method1164(int arg0, class221 arg1, int arg2) {
        field2674++;
        if (arg0 == arg2) {
            this.field2675 = arg1.method1517((byte) -96);
        } else if (arg0 == 2) {
            int var4 = arg1.method1517((byte) -96);
            this.field2678 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2678[var5] = arg1.method1521((byte) 113);
            }
        } else if (arg0 == 3) {
            this.field2685 = true;
        } else if (arg0 == 40) {
            int var8 = arg1.method1517((byte) -96);
            this.field2689 = new short[var8];
            this.field2683 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2689[var9] = (short) arg1.method1521((byte) 113);
                this.field2683[var9] = (short) arg1.method1521((byte) 113);
            }
        } else if (arg0 == 41) {
            int var6 = arg1.method1517((byte) -96);
            this.field2680 = new short[var6];
            this.field2679 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2679[var7] = (short) arg1.method1521((byte) 113);
                this.field2680[var7] = (short) arg1.method1521((byte) 113);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field2688[arg0 - 60] = arg1.method1521((byte) 113);
            return;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)Z")
    public final boolean method1165(byte arg0) {
        if (arg0 <= 14) {
            return true;
        }
        field2690++;
        if (this.field2678 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field2678.length; var3++) {
            if (!class32.field496.method1371((byte) -112, this.field2678[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)V")
    public static void method1166(int arg0) {
        field2686 = null;
        if (arg0 != 0) {
            method1166(31);
        }
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)Lv;")
    public final class150 method1167(byte arg0) {
        field2676++;
        class150[] var2 = new class150[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2688[var4] != -1) {
                var2[var3++] = class150.method1058(class32.field496, this.field2688[var4], 0);
            }
        }
        class150 var5 = new class150(var2, var3);
        if (this.field2689 != null) {
            for (int var6 = 0; var6 < this.field2689.length; var6++) {
                var5.method1036(this.field2689[var6], this.field2683[var6]);
            }
        }
        if (this.field2679 != null) {
            for (int var7 = 0; var7 < this.field2679.length; var7++) {
                var5.method1035(this.field2679[var7], this.field2680[var7]);
            }
        }
        if (arg0 > -98) {
            this.field2689 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)V")
    public static final void method1168(int arg0, int arg1, int arg2) {
        field2681++;
        class115 var3 = class67.field1104[class250.field3980][arg1][arg2];
        if (var3 == null) {
            class74.method523(class250.field3980, arg1, arg2);
            return;
        }
        int var4 = -99999999;
        class21 var5 = null;
        for (class21 var6 = (class21) var3.method843(-32); var6 != null; var6 = (class21) var3.method852((byte) 123)) {
            class12 var14 = class83.method595(var6.field354.field1085, -121);
            int var15 = var14.field213;
            if (var14.field223 == 1) {
                var15 = (var6.field354.field1088 + 1) * var15;
            }
            if (var4 < var15) {
                var5 = var6;
                var4 = var15;
            }
        }
        if (var5 == null) {
            class74.method523(class250.field3980, arg1, arg2);
            return;
        }
        var3.method846((byte) 79, var5);
        class21 var7 = (class21) var3.method843(-126);
        class66 var8 = null;
        int var9 = -16 % ((arg0 - 12) / 45);
        class66 var10 = null;
        while (var7 != null) {
            class66 var13 = var7.field354;
            if (var5.field354.field1085 != var13.field1085) {
                if (var8 == null) {
                    var8 = var13;
                }
                if (var8.field1085 != var13.field1085 && var10 == null) {
                    var10 = var13;
                }
            }
            var7 = (class21) var3.method852((byte) 123);
        }
        long var11 = (long) ((arg2 << 7) + arg1 + 1610612736);
        class102.method751(class250.field3980, arg1, arg2, class225.method1583(arg2 * 128 + 64, arg1 * 128 + 64, class250.field3980, 0), var5.field354, var11, var8, var10);
    }
}
