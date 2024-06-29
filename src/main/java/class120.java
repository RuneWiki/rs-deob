import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class120 {

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field1665 = 0;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1668 = "flash2:";

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "Lpa;")
    public static class2 field1666;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "[[Lwb;")
    public static class175[][] field1669;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLnk;)V", line = 8)
    public static final void method778(byte arg0, class16 arg1) {
        class13.field127 = class332.method2301(class123.field1687, arg1, 0, (byte) -123);
        field1672++;
        class310.field4872 = class332.method2301(class54.field628, arg1, 0, (byte) -102);
        class74.field920 = class332.method2301(class303.field4730, arg1, 0, (byte) -123);
        class161.field2477 = class332.method2301(class31.field368, arg1, 0, (byte) -80);
        class290.field4572 = class332.method2301(class139.field2081, arg1, 0, (byte) -117);
        if (arg0 >= -58) {
            field1668 = (String) null;
        }
        class189.field2848 = class332.method2301(class171.field2602, arg1, 0, (byte) -85);
        class256.field4057 = class282.method2038(-2906, arg1, class172.field2612, 0);
        class241.field3702 = class282.method2038(-2906, arg1, class226.field3419, 0);
        class213.field3238 = class282.method2038(-2906, arg1, class172.field2618, 0);
        class105.field1448 = class201.method1402(false, arg1, class333.field5325, 0);
        class55.field647 = class201.method1402(false, arg1, class127.field1863, 0);
        class344.field5463.method1700(class55.field647, (int[]) null);
        class41.field446.method1700(class55.field647, (int[]) null);
        class93.field1233.method1700(class55.field647, (int[]) null);
        if (class272.field4317) {
            class358.field5673 = class12.method73(0, arg1, (byte) 18, class2.field25);
            for (int var2 = 0; var2 < class358.field5673.length; var2++) {
                class358.field5673[var2].method1906();
            }
        }
        class158 var3 = class14.method88(0, arg1, 50, class311.field4884);
        var3.method1147();
        if (class272.field4317) {
            class306.field4767 = new class200(var3);
        } else {
            class306.field4767 = var3;
        }
        class158[] var4 = class191.method1305(class103.field1399, 729484588, 0, arg1);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method1147();
        }
        if (class272.field4317) {
            class161.field2478 = new class2[var4.length];
            for (int var6 = 0; var6 < var4.length; var6++) {
                class161.field2478[var6] = new class200(var4[var6]);
            }
        } else {
            class161.field2478 = var4;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 83)
    public static void method779(int arg0) {
        field1666 = null;
        field1669 = (class175[][]) null;
        field1668 = null;
        if (arg0 != 5) {
            field1667 = -45;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([BZI)Ljava/lang/Object;", line = 95)
    public static final Object method780(byte[] arg0, boolean arg1, int arg2) {
        field1671++;
        if (arg2 != -19392) {
            method779(62);
        }
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class254.field4023) {
            try {
                class115 var3 = (class115) Class.forName("ck").getDeclaredConstructor().newInstance();
                var3.method742((byte) 95, arg0);
                return var3;
            } catch (Throwable var5) {
                class254.field4023 = true;
            }
        }
        return arg1 ? class274.method1972(arg0, 0) : arg0;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLhi;)V", line = 134)
    public static final void method781(byte arg0, class323 arg1) {
        field1670++;
        int var2 = 30 % ((-arg0 - 48) / 63);
        int var3 = arg1.field5182;
        if (var3 == 324) {
            if (class302.field4710 == -1) {
                class143.field2286 = arg1.field5092;
                class302.field4710 = arg1.field5191;
            }
            if (class2.field15.field3865) {
                arg1.field5191 = class302.field4710;
            } else {
                arg1.field5191 = class143.field2286;
            }
        } else if (var3 == 325) {
            if (class302.field4710 == -1) {
                class302.field4710 = arg1.field5191;
                class143.field2286 = arg1.field5092;
            }
            if (class2.field15.field3865) {
                arg1.field5191 = class143.field2286;
            } else {
                arg1.field5191 = class302.field4710;
            }
        } else if (var3 == 327) {
            arg1.field5032 = 150;
            arg1.field5072 = (int) (Math.sin((double) class102.field1381 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field5161 = 5;
            arg1.field5020 = -1;
        } else if (var3 == 328) {
            if (class11.field113.field848 == null) {
                arg1.field5020 = 0;
            } else {
                arg1.field5032 = 150;
                arg1.field5072 = (int) (Math.sin((double) class102.field1381 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field5161 = 5;
                arg1.field5020 = ((int) class294.method2093((byte) 100, class11.field113.field848) << 11) + 2047;
                arg1.field5122 = class11.field113.field3710;
                arg1.field5064 = class11.field113.field3715;
                arg1.field5026 = class11.field113.field3778;
                arg1.field5021 = 0;
            }
        }
    }
}
