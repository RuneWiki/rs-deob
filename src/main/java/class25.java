import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class25 {

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public int field420 = 0;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "Lub;")
    public static class227 field416 = class257.method1749("Lade Titelbild )2 ", 17263);

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "[[B")
    public static byte[][] field421 = new byte[1000][];

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "Lrb;")
    public static class254 field414 = new class254(4);

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
    public static int field426 = 50;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "[[[B")
    public static byte[][][] field417;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "[[[B")
    public static byte[][][] field424;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)Lhe;")
    public static final class230 method123(int arg0, int arg1, int arg2) {
        class108 var3 = class261.field4539[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2012; var4++) {
            class230 var5 = var3.field2021[var4];
            if ((var5.field4029 >> 29 & 0x3L) == 2L && var5.field4032 == arg1 && var5.field4025 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lna;I)V")
    public static final void method124(class209 arg0, int arg1) {
        field423++;
        for (int var2 = 0; var2 < class226.field3899.length; var2++) {
            class226.field3899[var2] = 0;
        }
        short var3 = 256;
        if (arg1 != -1) {
            return;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var3);
            class226.field3899[var16] = (int) (Math.random() * 284.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class204.field3476[var15] = (class226.field3899[var15 + 1] + class226.field3899[var15 - 128] + class226.field3899[var15 + -1] + class226.field3899[var15 + 128]) / 4;
                }
            }
            int[] var13 = class226.field3899;
            class226.field3899 = class204.field3476;
            class204.field3476 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field820; var7++) {
            for (int var8 = 0; var8 < arg0.field822; var8++) {
                if (arg0.field3556[var6++] != 0) {
                    int var9 = var8 + arg0.field813 + 16;
                    int var10 = var7 + arg0.field824 + 16;
                    int var11 = (var10 << 7) + var9;
                    class226.field3899[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public static void method125(byte arg0) {
        if (arg0 <= 39) {
            return;
        }
        field424 = null;
        field414 = null;
        field421 = null;
        field416 = null;
        field417 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ln;B)V")
    public static final void method126(class138 arg0, byte arg1) {
        field413++;
        class168.field2807 = class151.method953(arg1 ^ 0x76D4, class83.field1453, 0, arg0);
        if (arg1 != -108) {
            field421 = null;
        }
        class118.field2159 = class222.method1402(arg0, 0, true, class103.field1798);
        class10.field204 = class60.method371(0, class31.field500, 4, arg0);
        class60.method371(0, class180.field3088, 4, arg0);
        class168.field2821 = class60.method371(0, class43.field713, arg1 + 112, arg0);
        class67.field1214 = class60.method371(0, class232.field4052, 4, arg0);
        class228.field3978 = class72.method434(arg1 + 130, class40.field664, 0, arg0);
        class199.field3419 = class72.method434(arg1 + 177, class64.field1178, 0, arg0);
        class258.field4508 = class173.method1105(class4.field42, arg0, 1373, 0);
        class245.field4277 = class72.method434(arg1 + 189, class40.field655, 0, arg0);
        class118.field2158 = class72.method434(116, class243.field4227, 0, arg0);
        class69.field1224 = class212.method1348(class216.field3642, arg0, 0, 7);
        class100.field1751 = class212.method1348(class60.field1105, arg0, 0, arg1 + 115);
        class56.field1024.method1250(class100.field1751, (int[]) null);
        class177.field2977.method1250(class100.field1751, (int[]) null);
        class260.field4532.method1250(class100.field1751, (int[]) null);
        class163 var2 = class252.method1683(0, class236.field4097, arg0, -2);
        var2.method1011();
        class34.field584 = var2;
        class163[] var3 = class222.method1402(arg0, 0, true, class2.field34);
        for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4].method1011();
        }
        class102.field1797 = var3;
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 41.0D) - 20;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        for (int var9 = 0; var9 < class118.field2159.length; var9++) {
            class118.field2159[var9].method1013(var5 + var6, var7 - -var6, var6 + var8);
        }
        class168.field2807[0].method1336(var5 + var6, var6 + var7, var8 + var6);
        class49.field872 = class118.field2159;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZI)Lqe;")
    public static final class51 method127(boolean arg0, int arg1) {
        field418++;
        class51 var2 = (class51) class165.field2771.method1735((long) arg1, (byte) -69);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class249.field4326.method884(class145.method911(0, arg1), 105, class49.method291(81, arg1));
        class51 var4 = new class51();
        if (var3 != null) {
            var4.method294(0, new class226(var3));
        }
        var4.method300(0);
        class165.field2771.method1730(var4, (long) arg1, (byte) -126);
        if (!arg0) {
            field425 = 13;
        }
        return var4;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILnj;)V")
    public final void method128(int arg0, class226 arg1) {
        if (arg0 != -1) {
            return;
        }
        while (true) {
            int var3 = arg1.method1471(255);
            if (var3 == 0) {
                field412++;
                return;
            }
            this.method129(var3, arg1, -39);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILnj;I)V")
    private final void method129(int arg0, class226 arg1, int arg2) {
        field419++;
        if (arg0 == 5) {
            this.field420 = arg1.method1447(0);
        }
        int var4 = 101 % ((54 - arg2) / 41);
    }
}
