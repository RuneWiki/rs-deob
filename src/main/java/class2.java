import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 {

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Lwd;")
    public static class157 field18 = new class157();

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field20 = 0;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field21 = 0;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public static int field23 = 0;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "Lja;")
    public static class63 field24 = new class63(64);

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public static int field26 = 0;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "Lec;")
    public static class32 field28 = class73.method594("::gc", true);

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field15;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "[I")
    public static int[] field27;

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
    public class2() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static void method5(int arg0) {
        field18 = null;
        field24 = null;
        if (arg0 != 0) {
            method5(47);
        }
        field27 = null;
        field28 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([BBLjd;)V")
    public final void method6(byte[] arg0, byte arg1, class66 arg2) {
        field17++;
        if (arg2.field1587[arg2.field1569] != 31 || arg2.field1587[arg2.field1569 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field15 == null) {
            this.field15 = new Inflater(true);
        }
        int var4 = -4 % ((51 - arg1) / 55);
        try {
            this.field15.setInput(arg2.field1587, arg2.field1569 + 10, arg2.field1587.length + -8 + -arg2.field1569 + -10);
            this.field15.inflate(arg0);
        } catch (Exception var5) {
            this.field15.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field15.reset();
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)V")
    public static final void method7(byte arg0, int arg1) {
        field22++;
        int[] var2 = class142.field3254.field1145;
        int var3 = var2.length;
        int var4 = 0;
        if (arg0 >= -118) {
            return;
        }
        while (var3 > var4) {
            var2[var4] = 0;
            var4++;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (52736 - var5 * 512) * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class3.field50[arg1][var21][var5] & 0x18) == 0) {
                    class159.field3659.method1151(var2, var20, 512, arg1, var21, var5);
                }
                if (arg1 < 3 && (class3.field50[arg1 + 1][var21][var5] & 0x8) != 0) {
                    class159.field3659.method1151(var2, var20, 512, arg1 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        class142.field3254.method389();
        int var6 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + (238 - -((int) (Math.random() * 20.0D)) + -10 << 8) + 228;
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class3.field50[arg1][var19][var8] & 0x18) == 0) {
                    class30.method211(var6, arg1, var19, 123, var8, var7);
                }
                if (arg1 < 3 && (class3.field50[arg1 + 1][var19][var8] & 0x8) != 0) {
                    class30.method211(var6, arg1 + 1, var19, 52, var8, var7);
                }
            }
        }
        class82.field1909 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class159.field3659.method1136(class43.field990, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class5.method22(100, var12).field1210;
                    if (var13 >= 0) {
                        int var14 = var9;
                        int var15 = var10;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class105.field2484[class43.field990].field2813;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var14 > 0 && var14 > var9 - 3 && (var16[var14 - 1][var15] & 0x12C0108) == 0) {
                                    var14--;
                                }
                                if (var18 == 1 && var14 < 103 && var9 + 3 > var14 && (var16[var14 + 1][var15] & 0x12C0180) == 0) {
                                    var14++;
                                }
                                if (var18 == 2 && var15 > 0 && var15 > var10 - 3 && (var16[var14][var15 - 1] & 0x12C0102) == 0) {
                                    var15--;
                                }
                                if (var18 == 3 && var15 < 103 && var10 + 3 > var15 && (var16[var14][var15 + 1] & 0x12C0120) == 0) {
                                    var15++;
                                }
                            }
                        }
                        class158.field3626[class82.field1909] = class111.field2603[var13];
                        class119.field2852[class82.field1909] = var14;
                        class83.field1958[class82.field1909] = var15;
                        class82.field1909++;
                    }
                }
            }
        }
        class50.field1158.method362((byte) 66);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lea;Lec;Lec;I)Lh;")
    public static final class49 method8(class30 arg0, class32 arg1, class32 arg2, int arg3) {
        field25++;
        if (arg3 != 32554) {
            field21 = 107;
        }
        int var4 = arg0.method201(3, arg2);
        int var5 = arg0.method215(arg1, var4, true);
        return class36.method313(var5, arg0, var4, -1);
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(III)V")
    private class2(int arg0, int arg1, int arg2) {
    }
}
