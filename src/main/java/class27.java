import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class27 extends class118 {

    @OriginalMember(owner = "client!de", name = "O", descriptor = "Lfc;")
    private static class39 field763 = class90.method774("Your account is already logged in)3", -80);

    @OriginalMember(owner = "client!de", name = "N", descriptor = "I")
    public static int field762 = 0;

    @OriginalMember(owner = "client!de", name = "R", descriptor = "Lfc;")
    public static class39 field766 = field763;

    @OriginalMember(owner = "client!de", name = "bb", descriptor = "[I")
    public static int[] field776 = new int[2000];

    @OriginalMember(owner = "client!de", name = "T", descriptor = "Lfc;")
    private static class39 field768 = class90.method774(" million", -93);

    @OriginalMember(owner = "client!de", name = "U", descriptor = "Lfc;")
    public static class39 field769 = field768;

    @OriginalMember(owner = "client!de", name = "S", descriptor = "Lp;")
    public static class104 field767 = new class104(50);

    @OriginalMember(owner = "client!de", name = "gb", descriptor = "Lfc;")
    public static class39 field781 = class90.method774("sl_button", -92);

    @OriginalMember(owner = "client!de", name = "hb", descriptor = "I")
    public static int field782 = 0;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!de", name = "V", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!de", name = "X", descriptor = "I")
    public int field772;

    @OriginalMember(owner = "client!de", name = "Y", descriptor = "I")
    public int field773;

    @OriginalMember(owner = "client!de", name = "Z", descriptor = "I")
    public int field774;

    @OriginalMember(owner = "client!de", name = "ab", descriptor = "I")
    public int field775;

    @OriginalMember(owner = "client!de", name = "eb", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!de", name = "fb", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!de", name = "P", descriptor = "Lue;")
    public static class141 field764;

    @OriginalMember(owner = "client!de", name = "W", descriptor = "[I")
    public int[] field771;

    @OriginalMember(owner = "client!de", name = "db", descriptor = "[I")
    public int[] field778;

    @OriginalMember(owner = "client!de", name = "cb", descriptor = "[Lfc;")
    public class39[] field777;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)Z", line = 10)
    public static final boolean method341(int arg0, int arg1) {
        field770++;
        if (!class66.method631(arg0, arg1)) {
            return false;
        }
        boolean var2 = false;
        class99[] var3 = class65.field1571[arg1];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class99 var5 = var3[var4];
            if (var5 != null && var5.field2452 == 6) {
                if (var5.field2423 != -1 || var5.field2386 != -1) {
                    boolean var6 = class53.method563(var5, (byte) -33);
                    int var7;
                    if (var6) {
                        var7 = var5.field2386;
                    } else {
                        var7 = var5.field2423;
                    }
                    if (var7 != -1) {
                        class116 var8 = class38.method430(arg0 + 2238, var7);
                        var5.field2394 += client.field547;
                        label53: while (true) {
                            do {
                                do {
                                    if (var5.field2394 <= var8.field3035[var5.field2410]) {
                                        break label53;
                                    }
                                    var2 = true;
                                    var5.field2394 -= var8.field3035[var5.field2410];
                                    var5.field2410++;
                                } while (var5.field2410 < var8.field3057.length);
                                var5.field2410 -= var8.field3041;
                            } while (var5.field2410 >= 0 && var8.field3057.length > var5.field2410);
                            var5.field2410 = 0;
                        }
                    }
                }
                if (var5.field2426 != 0 && !var5.field2389) {
                    var2 = true;
                    int var9 = var5.field2426 >> 16;
                    int var10 = var5.field2426 << 16 >> 16;
                    int var11 = client.field547 * var9;
                    int var12 = client.field547 * var10;
                    var5.field2384 = var5.field2384 + var12 & 0x7FF;
                    var5.field2342 = var5.field2342 + var11 & 0x7FF;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(Z)V", line = 106)
    public static final void method342(boolean arg0) {
        class142.field3566 = new int[104];
        class42.field1152 = new int[105][105];
        class83.field1846 = new int[104];
        class98.field2331 = new byte[4][104][104];
        class31.field870 = new byte[4][105][105];
        class112.field2934 = new int[4][105][105];
        class29.field836 = new byte[4][104][104];
        class44.field1199 = new byte[4][104][104];
        field765++;
        class143.field3595 = 99;
        class16.field461 = new int[104];
        class25.field724 = new int[104];
        if (arg0) {
            method344((byte) 111, null, 106, -2);
        }
        class43.field1171 = new byte[4][104][104];
        class112.field2947 = new int[104];
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V", line = 149)
    public static void method343(int arg0) {
        field767 = null;
        field768 = null;
        field776 = null;
        field764 = null;
        field763 = null;
        field769 = null;
        field766 = null;
        if (arg0 != 0) {
            field762 = 71;
        }
        field781 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BLv;II)V", line = 167)
    public static final void method344(byte arg0, class142 arg1, int arg2, int arg3) {
        int var4 = 61 % ((arg0 + 51) / 60);
        if (arg1.field2888 == arg2 && arg2 != -1) {
            int var5 = class38.method430(2238, arg2).field3028;
            if (var5 == 1) {
                arg1.field2911 = arg3;
                arg1.field2885 = 0;
                arg1.field2864 = 0;
                arg1.field2886 = 0;
            }
            if (var5 == 2) {
                arg1.field2864 = 0;
            }
        } else if (arg2 == -1 || arg1.field2888 == -1 || class38.method430(2238, arg2).field3056 >= class38.method430(2238, arg1.field2888).field3056) {
            arg1.field2864 = 0;
            arg1.field2911 = arg3;
            arg1.field2886 = 0;
            arg1.field2885 = 0;
            arg1.field2884 = arg1.field2927;
            arg1.field2888 = arg2;
        }
        field780++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BJ)Lfc;", line = 210)
    public static final class39 method345(byte arg0, long arg1) {
        field779++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            if (arg0 != -54) {
                return null;
            }
            byte[] var6 = new byte[var3];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var3--;
                var6[var3] = class25.field728[(int) (var8 - arg1 * 37L)];
            }
            class39 var7 = new class39();
            var7.field1067 = var6;
            var7.field1046 = var6.length;
            return var7;
        }
    }
}
