import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class297 extends class175 {

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "[I")
    public static int[] field4698 = new int[14];

    @OriginalMember(owner = "client!bf", name = "V", descriptor = "I")
    public static int field4708 = 0;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public int field4688;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
    public int field4700;

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "I")
    public int field4701;

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
    public int field4707;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "Lge;")
    public static class137 field4706;

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "Ljava/lang/String;")
    public String field4692;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "[I")
    public int[] field4689;

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "[I")
    public int[] field4703;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "[Lwe;")
    public static class43[] field4691;

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "[Lgg;")
    public class61[] field4705;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "[Ljava/lang/String;")
    public String[] field4696;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lvl;I)V")
    public static final void method1980(class68 arg0, int arg1) {
        field4687++;
        short var2 = 256;
        for (int var3 = 0; var3 < class144.field2334.length; var3++) {
            class144.field2334[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var2);
            class144.field2334[var16] = (int) (Math.random() * 284.0D);
        }
        if (arg1 != 1396434695) {
            field4693 = 1;
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < (var2 - 1); var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class243.field3895[var15] = (class144.field2334[var15 - 1] - (-class144.field2334[var15 + 1] - class144.field2334[var15 - 128] - class144.field2334[var15 + 128])) / 4;
                }
            }
            int[] var13 = class144.field2334;
            class144.field2334 = class243.field3895;
            class243.field3895 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field3437; var7++) {
            for (int var8 = 0; var8 < arg0.field3434; var8++) {
                if (arg0.field953[var6++] != 0) {
                    int var9 = var8 + arg0.field3432 + 16;
                    int var10 = arg0.field3430 + var7 + 16;
                    int var11 = (var10 << 7) + var9;
                    class144.field2334[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
    public static final void method1981(int arg0, int arg1) {
        class204 var2 = (class204) class78.field1067.method457((long) arg0, (byte) -115);
        field4704++;
        if (arg1 > -23) {
            method1980((class68) null, 112);
        }
        if (var2 != null) {
            var2.method544(-95);
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1982(String arg0, int arg1) {
        int var2 = class140.method961(arg0, -1644);
        field4690++;
        if (arg1 == -30273) {
            return var2 == -1 ? "" : class247.method1630(" ", (byte) 98, "<br>", class225.field3572.field1083[var2]);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "(I)V")
    public static void method1983(int arg0) {
        field4706 = null;
        int var1 = 10 % ((arg0 - 70) / 34);
        field4698 = null;
        field4691 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BII)V")
    public static final void method1984(byte arg0, int arg1, int arg2) {
        field4694++;
        class294 var3 = class73.method560(arg1, 2);
        int var4 = var3.field4653;
        int var5 = var3.field4660;
        int var6 = var3.field4659;
        int var7 = class197.field3180[var6 - var4];
        if (arg2 < 0 || arg2 > var7) {
            arg2 = 0;
        }
        if (arg0 > 27) {
            int var8 = var7 << var4;
            class236.method1553(class214.field3454[var5] & ~var8 | arg2 << var4 & var8, (byte) 11, var5);
        }
    }

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "(I)V")
    public static final void method1985(int arg0) {
        if (class149.field2395 != null) {
            class149.field2395.method1276(-1);
            class149.field2395 = null;
        }
        class260.method1710((byte) 13);
        class133.method913();
        field4695++;
        for (int var1 = 0; var1 < 4; var1++) {
            class61.field839[var1].method1876(false);
        }
        class267.method1807(false, -4);
        System.gc();
        class18.method126((byte) 13, 2);
        class88.field1212 = arg0;
        class82.field1141 = false;
        class219.method1455(true, 64);
        class93.field1321 = 0;
        class103.field1675 = 0;
        class263.field4159 = 0;
        class160.field2609 = false;
        class296.field4685 = 0;
        for (int var2 = 0; var2 < class293.field4649.length; var2++) {
            class293.field4649[var2] = null;
        }
        class251.field4027 = 0;
        class70.field969 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class260.field4141[var3] = null;
            class113.field1952[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class198.field3193[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class244.field3913[var5][var6][var7] = null;
                }
            }
        }
        class240.method1583((byte) 117);
        class204.field3275 = 0;
        class232.method1534((byte) -56);
        class38.method304((byte) -46, true);
        try {
            class27.method184((byte) 76, "loggedout", class250.field4006.field4090);
        } catch (Throwable var8) {
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILjava/lang/String;ZLjava/lang/String;)V")
    public static final void method1986(int arg0, String arg1, boolean arg2, String arg3) {
        field4699++;
        if (!arg2) {
            method1983(-65);
        }
        class244.method1604((String) null, arg3, (byte) -51, arg1, -1, arg0);
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)Ldc;")
    public static final class96 method1987(int arg0, int arg1) {
        field4702++;
        int var2 = -27 % ((20 - arg0) / 60);
        class96 var3 = (class96) class279.field4463.method1839((byte) 100, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class133.field2203.method940((byte) 45, arg1, 3);
        class96 var5 = new class96();
        if (var4 != null) {
            var5.method694(new class264(var4), (byte) -102);
        }
        class279.field4463.method1830((long) arg1, -96, var5);
        return var5;
    }
}
