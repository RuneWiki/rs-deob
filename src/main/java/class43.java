import java.awt.Image;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class43 extends class210 {

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "[Ltf;")
    public class185[] field966 = new class185[5];

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "[I")
    public int[] field976 = new int[5];

    @OriginalMember(owner = "client!eb", name = "bb", descriptor = "I")
    public int field981 = 0;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
    public int field965;

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "I")
    public int field958;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "I")
    public int field954;

    @OriginalMember(owner = "client!eb", name = "C", descriptor = "I")
    public int field957;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "Ljava/util/Random;")
    public static Random field952 = new Random();

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "[S")
    public static short[] field967 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!eb", name = "Y", descriptor = "I")
    public static int field978 = 0;

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
    public static int field975 = 0;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "Ljd;")
    private static class92 field970 = class202.method1325((byte) 90, "You are standing in a members)2only area)3");

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "Ljd;")
    public static class92 field974 = field970;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "I")
    public int field956;

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "I")
    public int field959;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "I")
    public int field971;

    @OriginalMember(owner = "client!eb", name = "X", descriptor = "I")
    public int field977;

    @OriginalMember(owner = "client!eb", name = "Z", descriptor = "I")
    public int field979;

    @OriginalMember(owner = "client!eb", name = "ab", descriptor = "I")
    public int field980;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "Lod;")
    public class138 field953;

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "Lpd;")
    public class147 field972;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "Lcg;")
    public class28 field969;

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "Leb;")
    public class43 field962;

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "Leg;")
    public class48 field963;

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "Lfh;")
    public class59 field960;

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "Lib;")
    public class82 field961;

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "Ljava/awt/Image;")
    public static Image field968;

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "Z")
    public boolean field955;

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "Z")
    public boolean field964;

    @OriginalMember(owner = "client!eb", name = "cb", descriptor = "Z")
    public boolean field982;

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "[Lsc;")
    public static class173[] field973;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)I")
    public static final int method267(int arg0, byte arg1) {
        if (arg1 <= 40) {
            return 87;
        } else {
            field950++;
            return arg0 >>> 8;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([BIII[Lmb;)V")
    public static final void method268(byte[] arg0, int arg1, int arg2, int arg3, class118[] arg4) {
        class70 var5 = new class70(arg0);
        if (arg2 <= 18) {
            field968 = null;
        }
        int var6 = -1;
        field947++;
        while (true) {
            int var7 = var5.method468(109);
            if (var7 == 0) {
                return;
            }
            int var8 = 0;
            var6 += var7;
            while (true) {
                int var9 = var5.method430(true);
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = arg3 + var11;
                int var14 = var5.method443(255);
                int var15 = var14 >> 2;
                int var16 = var14 & 0x3;
                int var17 = arg1 + var10;
                if (var13 > 0 && var17 > 0 && var13 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((class59.field1239[1][var13][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class118 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    class94.method662(var17, var19, var6, false, var12, var16, var13, var15);
                }
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V")
    public static final void method269(int arg0) {
        if (arg0 > -36) {
            return;
        }
        for (int var1 = 0; var1 < class64.field1308; var1++) {
            int var10002 = class212.field4100[var1]--;
            if (class212.field4100[var1] >= -10) {
                class23 var3 = class6.field292[var1];
                if (var3 == null) {
                    var3 = class23.method144(class214.field4183, class55.field1137[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class212.field4100[var1] += var3.method147();
                    class6.field292[var1] = var3;
                }
                if (class212.field4100[var1] < 0) {
                    int var4;
                    if (class100.field2067[var1] == 0) {
                        var4 = class30.field648;
                    } else {
                        int var5 = (class100.field2067[var1] & 0xFF) * 128;
                        int var6 = class100.field2067[var1] >> 16 & 0xFF;
                        int var7 = class100.field2067[var1] >> 8 & 0xFF;
                        int var8 = var7 * 128 + 64 - class15.field423.field208;
                        int var9 = var6 * 128 + 64 - class15.field423.field246;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var8 + var9 - 128;
                        if (var5 < var10) {
                            class212.field4100[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var5 - var10) * class136.field2730 / var5;
                    }
                    if (var4 > 0) {
                        class203 var11 = var3.method146().method1329(class67.field1361);
                        class71 var12 = class71.method471(var11, 100, var4);
                        var12.method500(class75.field1568[var1] - 1);
                        class55.field1136.method375(var12);
                    }
                    class212.field4100[var1] = -100;
                }
            } else {
                class64.field1308--;
                for (int var2 = var1; var2 < class64.field1308; var2++) {
                    class55.field1137[var2] = class55.field1137[var2 + 1];
                    class6.field292[var2] = class6.field292[var2 + 1];
                    class75.field1568[var2] = class75.field1568[var2 + 1];
                    class212.field4100[var2] = class212.field4100[var2 + 1];
                    class100.field2067[var2] = class100.field2067[var2 + 1];
                }
                var1--;
            }
        }
        field946++;
        if (class118.field2399 && !class95.method664(-19281)) {
            if (class151.field2996 != 0 && class116.field2349 != -1) {
                class131.method866(1, false, class151.field2996, class116.field2349, class81.field1653, 0);
            }
            class118.field2399 = false;
        } else if (class151.field2996 != 0 && class116.field2349 != -1 && !class95.method664(-19281)) {
            class99.field2000.method405(75, 7);
            class99.field2000.method446(class116.field2349, -26751);
            class116.field2349 = -1;
            class10.field354++;
        }
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V")
    public static final void method270(int arg0) {
        field945++;
        if (!class95.field1918) {
            return;
        }
        class1 var1 = class148.method961(class118.field2402, class138.field2766, (byte) -112);
        if (var1 != null && var1.field136 != null) {
            class156 var2 = new class156();
            var2.field3108 = var1.field136;
            var2.field3103 = var1;
            class2.method18(var2, 6645);
        }
        class95.field1918 = false;
        class3.method21(26702, var1);
        if (arg0 < 93) {
            field975 = 54;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljd;Ljd;ILnh;)[Lrf;")
    public static final class167[] method271(class92 arg0, class92 arg1, int arg2, class133 arg3) {
        field944++;
        int var4 = arg3.method880(arg1, false);
        int var5 = 29 / ((arg2 - 40) / 46);
        int var6 = arg3.method881(var4, 1, arg0);
        return class79.method541(var6, var4, (byte) 123, arg3);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIB[B)I")
    public static final int method272(int arg0, int arg1, byte arg2, byte[] arg3) {
        int var4 = -1;
        if (arg2 <= 124) {
            return 6;
        }
        field948++;
        for (int var5 = arg1; var5 < arg0; var5++) {
            var4 = var4 >>> 8 ^ class103.field2117[(var4 ^ arg3[var5]) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)V")
    public static void method273(int arg0) {
        field967 = null;
        field952 = null;
        int var1 = 70 / ((-arg0 - 43) / 52);
        field974 = null;
        field968 = null;
        field973 = null;
        field970 = null;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(III)V")
    public class43(int arg0, int arg1, int arg2) {
        this.field965 = arg2;
        this.field954 = this.field958 = arg0;
        this.field957 = arg1;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)Lcg;")
    public static final class28 method274(int arg0, int arg1, int arg2) {
        class43 var3 = class31.field698[arg0][arg1][arg2];
        return var3 == null || var3.field969 == null ? null : var3.field969;
    }
}
