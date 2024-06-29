import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class118 {

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "Lhb;")
    public static class44 field2920 = new class44();

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Loa;")
    public static class85 field2923 = new class85(5000);

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "[I")
    public static int[] field2929 = new int[32768];

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static volatile int field2926 = -1;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static int field2928 = 0;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Lmc;")
    public static class75 field2927 = class30.method234(true, "blinken1:");

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "Lmc;")
    public static class75 field2925 = class30.method234(true, "Die Verbindung konnte");

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "[[B")
    public static byte[][] field2924;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZII)Lmc;", line = 15)
    public static final class75 method941(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg2 >= -102) {
            return null;
        }
        int var4 = 1;
        field2919++;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        for (int var5 = arg3 / arg0; var5 != 0; var5 /= arg0) {
            var4++;
        }
        int var6 = var4;
        if (arg3 < 0 || arg1) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg3 < 0) {
            var7[0] = 45;
        } else if (arg1) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg3 % arg0;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
            arg3 /= arg0;
        }
        class75 var9 = new class75();
        var9.field1869 = var6;
        var9.field1912 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lja;ILja;Z)V", line = 87)
    public static final void method942(class55 arg0, int arg1, class55 arg2, boolean arg3) {
        class1.field3 = arg0;
        class128.field3123 = arg2;
        class44.field1037 = arg3;
        class31.field692 = class1.field3.method430(24094, arg1);
        field2922++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)[B", line = 99)
    public static final synchronized byte[] method943(byte arg0, int arg1) {
        field2917++;
        if (arg1 == 100 && class114.field2872 > 0) {
            byte[] var2 = class24.field482[--class114.field2872];
            class24.field482[class114.field2872] = null;
            return var2;
        }
        if (arg0 >= -22) {
            field2927 = null;
        }
        if (arg1 == 5000 && class108.field2726 > 0) {
            byte[] var3 = class42.field1003[--class108.field2726];
            class42.field1003[class108.field2726] = null;
            return var3;
        } else if (arg1 == 30000 && class108.field2737 > 0) {
            byte[] var4 = class74.field1859[--class108.field2737];
            class74.field1859[class108.field2737] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)I", line = 144)
    public static int method944(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILnc;)V", line = 154)
    public static final void method945(int arg0, class81 arg1) {
        field2921++;
        short var2 = 256;
        for (int var3 = arg0; var3 < class109.field2778.length; var3++) {
            class109.field2778[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var2);
            class109.field2778[var16] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class79.field2010[var15] = (class109.field2778[var15 + 1] + class109.field2778[var15 - 1] + class109.field2778[var15 + 128] + class109.field2778[var15 + -128]) / 4;
                }
            }
            int[] var13 = class109.field2778;
            class109.field2778 = class79.field2010;
            class79.field2010 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field2028; var7++) {
            for (int var8 = 0; var8 < arg1.field2027; var8++) {
                if (arg1.field2029[var6++] != 0) {
                    int var9 = arg1.field2024 + var8 + 16;
                    int var10 = var7 + arg1.field2023 + 16;
                    int var11 = (var10 << 7) + var9;
                    class109.field2778[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V", line = 247)
    public static void method946(byte arg0) {
        field2924 = null;
        field2920 = null;
        field2927 = null;
        field2923 = null;
        if (arg0 != -8) {
            method945(38, null);
        }
        field2929 = null;
        field2925 = null;
    }
}
