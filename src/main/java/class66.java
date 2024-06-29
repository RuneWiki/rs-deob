import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class66 extends class262 {

    @OriginalMember(owner = "client!om", name = "R", descriptor = "I")
    private int field1111 = 585;

    @OriginalMember(owner = "client!om", name = "P", descriptor = "Lok;")
    public static class146 field1109 = class235.method1724(-12908, "showingVideoAd");

    @OriginalMember(owner = "client!om", name = "S", descriptor = "Lhf;")
    public static class195 field1112 = new class195(128);

    @OriginalMember(owner = "client!om", name = "ab", descriptor = "I")
    public static volatile int field1120 = -1;

    @OriginalMember(owner = "client!om", name = "Z", descriptor = "Lok;")
    public static class146 field1119 = class235.method1724(-12908, "leuchten1:");

    @OriginalMember(owner = "client!om", name = "cb", descriptor = "Lok;")
    private static class146 field1122 = class235.method1724(-12908, "Loading)3)3)3");

    @OriginalMember(owner = "client!om", name = "Y", descriptor = "Lok;")
    public static class146 field1118 = field1122;

    @OriginalMember(owner = "client!om", name = "X", descriptor = "Ltc;")
    public static class37 field1117 = new class37();

    @OriginalMember(owner = "client!om", name = "O", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!om", name = "Q", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!om", name = "T", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!om", name = "U", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!om", name = "V", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!om", name = "W", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!om", name = "bb", descriptor = "[Ltg;")
    public static class307[] field1121;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(B)V", line = 4)
    public static void method497(byte arg0) {
        field1109 = null;
        field1121 = null;
        field1112 = null;
        field1119 = null;
        field1118 = null;
        field1122 = null;
        if (arg0 != 123) {
            field1117 = (class37) null;
        }
        field1117 = null;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V", line = 24)
    public class66() {
        super(0, true);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)[I", line = 29)
    public final int[] method38(int arg0, byte arg1) {
        if (arg1 > -85) {
            method500((byte) 16);
        }
        int[] var3 = this.field4350.method1532(arg0, (byte) 112);
        if (this.field4350.field3333) {
            int var4 = class312.field5326[arg0];
            for (int var5 = 0; var5 < class98.field1598; var5++) {
                int var6 = class210.field3485[var5];
                if (var6 > this.field1111 && var6 < (4096 - this.field1111) && var4 > 2048 - this.field1111 && this.field1111 + 2048 > var4) {
                    int var7 = 2048 - var6;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field1111);
                    var3[var5] = 4096 - var10;
                } else if (var6 > (2048 - this.field1111) && (this.field1111 + 2048) > var6) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field1111;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field1111);
                } else if (this.field1111 > var4 || 4096 - this.field1111 < var4) {
                    int var19 = var6 - 2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field1111;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field1111);
                } else if (var6 >= this.field1111 && var6 <= (4096 - this.field1111)) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 < 0 ? -var15 : var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field1111);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        field1114++;
        return var3;
    }

    @OriginalMember(owner = "client!om", name = "e", descriptor = "(B)[Ltg;", line = 113)
    public static final class307[] method498(byte arg0) {
        class307[] var1 = new class307[class241.field4004];
        field1110++;
        int var2 = -32 % ((-arg0 - 36) / 39);
        for (int var3 = 0; var3 < class241.field4004; var3++) {
            int var4 = class238.field3967[var3] * class150.field2562[var3];
            byte[] var5 = class17.field353[var3];
            int[] var6 = new int[var4];
            for (int var7 = 0; var7 < var4; var7++) {
                var6[var7] = class94.field1514[class82.method582(var5[var7], 255)];
            }
            var1[var3] = new class307(class177.field3006, class242.field4027, class226.field3776[var3], class23.field424[var3], class238.field3967[var3], class150.field2562[var3], var6);
        }
        class301.method2122((byte) 0);
        return var1;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IILdk;IZI)V", line = 147)
    public static final void method499(int arg0, int arg1, class206 arg2, int arg3, boolean arg4, int arg5) {
        field1108++;
        if (arg2.field3434 == -1 && arg2.field3445 == null) {
            return;
        }
        if (!arg4) {
            field1122 = (class146) null;
        }
        int var6 = 0;
        if (arg1 > arg2.field3443) {
            var6 += arg1 - arg2.field3443;
        } else if (arg1 < arg2.field3426) {
            var6 += arg2.field3426 - arg1;
        }
        if (arg2.field3425 < arg5) {
            var6 += arg5 - arg2.field3425;
        } else if (arg2.field3420 > arg5) {
            var6 += arg2.field3420 - arg5;
        }
        if (arg2.field3435 == 0 || arg2.field3435 < (var6 - 64) || class236.field3936 == 0 || arg2.field3428 != arg0) {
            if (arg2.field3437 != null) {
                class82.field1315.method1331(arg2.field3437);
                arg2.field3437 = null;
            }
            if (arg2.field3427 != null) {
                class82.field1315.method1331(arg2.field3427);
                arg2.field3427 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg2.field3435 - var6) * class236.field3936 / arg2.field3435;
        if (arg2.field3437 != null) {
            arg2.field3437.method1148(var7);
        } else if (arg2.field3434 >= 0) {
            class289 var8 = class289.method2083(class313.field5333, arg2.field3434, 0);
            if (var8 != null) {
                class253 var9 = var8.method2082().method1847(class47.field889);
                class149 var10 = class149.method1159(var9, 100, var7);
                var10.method1153(-1);
                class82.field1315.method1329(var10);
                arg2.field3437 = var10;
            }
        }
        if (arg2.field3427 != null) {
            arg2.field3427.method1148(var7);
            if (!arg2.field3427.method1324(-29231)) {
                arg2.field3427 = null;
            }
        } else if (arg2.field3445 != null && (arg2.field3431 -= arg3) <= 0) {
            int var11 = (int) (Math.random() * (double) arg2.field3445.length);
            class289 var12 = class289.method2083(class313.field5333, arg2.field3445[var11], 0);
            if (var12 != null) {
                class253 var13 = var12.method2082().method1847(class47.field889);
                class149 var14 = class149.method1159(var13, 100, var7);
                var14.method1153(0);
                class82.field1315.method1329(var14);
                arg2.field3431 = (int) ((double) (arg2.field3432 - arg2.field3421) * Math.random()) + arg2.field3421;
                arg2.field3427 = var14;
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lwe;II)V", line = 270)
    public final void method40(class47 arg0, int arg1, int arg2) {
        field1113++;
        if (arg1 != 2048) {
            method500((byte) 8);
        }
        if (arg2 == 0) {
            this.field1111 = arg0.method379(-2);
        }
    }

    @OriginalMember(owner = "client!om", name = "f", descriptor = "(B)V", line = 323)
    public static final void method500(byte arg0) {
        field1115++;
        int var1 = 27 / ((arg0 - 40) / 42);
        for (class206 var2 = (class206) class9.field202.method1251(-75); var2 != null; var2 = (class206) class9.field202.method1253(63)) {
            if (var2.field3450) {
                var2.method1566(11279);
            }
        }
        for (class206 var3 = (class206) class232.field3870.method1251(73); var3 != null; var3 = (class206) class232.field3870.method1253(83)) {
            if (var3.field3450) {
                var3.method1566(11279);
            }
        }
    }
}
