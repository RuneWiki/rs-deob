import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class9 extends class138 {

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "Lbj;")
    public class118 field174;

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "Lcf;")
    public static class174 field175;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "Lwi;")
    public static class23 field177;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(B)V", line = 5)
    public static final void method94(byte arg0) {
        field173++;
        int[] var1 = new int[class106.field1637];
        int var2 = 0;
        for (int var3 = 0; var3 < class106.field1637; var3++) {
            class262 var4 = class205.method1296((byte) -121, var3);
            if (var4.field4207 >= 0 || var4.field4209 >= 0) {
                var1[var2++] = var3;
            }
        }
        class5.field128 = new int[var2];
        int var5 = 95 / ((arg0 - 44) / 52);
        for (int var6 = 0; var6 < var2; var6++) {
            class5.field128[var6] = var1[var6];
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILva;I)Lra;", line = 41)
    public static final class43 method95(int arg0, class36 arg1, int arg2) {
        field169++;
        int var3 = 10 / ((-arg0 - 9) / 39);
        return class236.method1513(arg1, (byte) -80, arg2) ? class190.method1205(true) : null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZLva;Lva;)V", line = 60)
    public static final void method96(boolean arg0, class36 arg1, class36 arg2) {
        class281.field4639 = class134.method883(32035, class44.field654, arg1, 0, arg2);
        class240.field3846 = class250.method1617(0, class44.field654, (byte) -51, arg2, arg1);
        field172++;
        if (arg0) {
            class8.field167 = class134.method883(32035, class124.field1912, arg1, 0, arg2);
            class110.field1683 = class134.method883(32035, class183.field2909, arg1, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLck;)V", line = 87)
    public static final void method97(byte arg0, class119 arg1) {
        field170++;
        class241.field3875 = arg1;
        if (class220.field3533.field4664 == null) {
            return;
        }
        try {
            class119 var2 = class101.field1543.method792(class220.field3533.field4664, 0);
            class119 var3 = class221.field3550.method792(class220.field3533.field4664, 0);
            class119 var4 = class170.method1074(new class119[] { var2, class199.field3185, arg1, class252.field4056, var3 }, arg0 + 10);
            class119 var5;
            if (arg1.method776((byte) -69) == 0) {
                var5 = class170.method1074(new class119[] { var4, class72.field1128 }, -108);
            } else {
                var5 = class170.method1074(new class119[] { var4, class185.field2925, class65.method484(class110.method707((byte) 89) + 94608000000L, (byte) 47), class265.field4327, class68.method494(94608000L, 10) }, -100);
            }
            class170.method1074(new class119[] { class63.field1004, var5, class177.field2830 }, -99).method780(-122, class220.field3533.field4664);
        } catch (Throwable var7) {
        }
        if (arg0 != -101) {
            method101(-101);
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lbj;)V", line = 124)
    public class9(class118 arg0) {
        this.field174 = arg0;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(JZ)V", line = 133)
    public static final void method98(long arg0, boolean arg1) {
        field176++;
        if (arg0 == 0L || arg1) {
            return;
        }
        for (int var3 = 0; var3 < class97.field1482; var3++) {
            if (class203.field3217[var3] == arg0) {
                class97.field1482--;
                class62.field977++;
                for (int var4 = var3; var4 < class97.field1482; var4++) {
                    class126.field1941[var4] = class126.field1941[var4 + 1];
                    class283.field4680[var4] = class283.field4680[var4 + 1];
                    class64.field1016[var4] = class64.field1016[var4 + 1];
                    class203.field3217[var4] = class203.field3217[var4 + 1];
                    class168.field2647[var4] = class168.field2647[var4 + 1];
                    class266.field4365[var4] = class266.field4365[var4 + 1];
                }
                class261.field4196 = class94.field1456;
                class6.field149.method966(0, 61);
                class6.field149.method29(2069, arg0);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZIII)Lck;", line = 180)
    public static final class119 method99(boolean arg0, int arg1, int arg2, int arg3) {
        field178++;
        if (arg2 != -27866) {
            return (class119) null;
        } else if (arg1 >= 2 && arg1 <= 36) {
            int var4 = 1;
            for (int var5 = arg3 / arg1; var5 != 0; var5 /= arg1) {
                var4++;
            }
            int var6 = var4;
            if (arg3 < 0 || arg0) {
                var6 = var4 + 1;
            }
            byte[] var7 = new byte[var6];
            if (arg3 < 0) {
                var7[0] = 45;
            } else if (arg0) {
                var7[0] = 43;
            }
            for (int var8 = 0; var8 < var4; var8++) {
                int var9 = arg3 % arg1;
                if (var9 < 0) {
                    var9 = -var9;
                }
                arg3 /= arg1;
                if (var9 > 9) {
                    var9 += 39;
                }
                var7[var6 - var8 - 1] = (byte) (var9 + 48);
            }
            class119 var10 = new class119();
            var10.field1838 = var7;
            var10.field1825 = var6;
            return var10;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V", line = 243)
    public static void method100(int arg0) {
        field175 = null;
        field177 = null;
        if (arg0 != 1) {
            method98(37L, true);
        }
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)V", line = 255)
    public static final void method101(int arg0) {
        field171++;
        class176 var1 = new class176();
        for (int var2 = 0; var2 < 13; var2++) {
            for (int var3 = 0; var3 < 13; var3++) {
                class198.field3165[var2][var3] = var1;
            }
        }
        if (arg0 != -90) {
            method98(1L, false);
        }
    }
}
