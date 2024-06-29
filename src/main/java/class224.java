import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class224 {

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "Ljp;")
    private class236 field3024 = new class236(64);

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "Lpc;")
    private class473 field3015;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "Z")
    public static boolean field3021 = false;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "[I")
    public static int[] field3020 = new int[8];

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "Lnc;")
    public static class21 field3018 = null;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field3023 = 0;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "[[B")
    public static byte[][] field3026 = new byte[250][];

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "F")
    public static float field3019;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Lwl;")
    public static class280 field3022;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)V")
    public static final void method1403(String arg0, byte arg1, String arg2, int arg3) {
        class494.field6860 = arg0;
        field3017++;
        class266.field3513 = arg2;
        class365.field4945 = arg3;
        if (class266.field3513.equals("") || class494.field6860.equals("")) {
            class458.field6312 = 3;
        } else if (class145.field2063 == -1) {
            class112.field1610 = 0;
            class234.field3149 = 0;
            class127.field1854 = 1;
            class458.field6312 = -3;
            class379 var4 = new class379(128);
            var4.method2200(7, 10);
            var4.method2214(72, (int) (Math.random() * 9.9999999E7D));
            var4.method2193(class33.method259(class266.field3513, arg1 ^ 0xFFFFFFFC), -126);
            if (arg1 != -4) {
                method1403(null, (byte) 57, null, -29);
            }
            var4.method2214(arg1 + 123, (int) (Math.random() * 9.9999999E7D));
            var4.method2216(class494.field6860, arg1 - 116);
            var4.method2214(arg1 + 15, (int) (Math.random() * 9.9999999E7D));
            var4.method2250(class477.field6575, class234.field3150, (byte) 124);
            class193.field2708.field5173 = 0;
            class193.field2708.method2200(7, class514.field7583.field1514);
            class193.field2708.method2200(7, var4.field5173 + 2);
            class193.field2708.method2246(585, (byte) -113);
            class193.field2708.method2211(0, var4.field5173, var4.field5152, (byte) -111);
        } else {
            class99.method706((byte) -84);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
    public static final void method1404(byte arg0) {
        field3011++;
        class380.method2252(62, class154.field2244.field7768);
        int var1 = (class430.field5888 >> 10) + (class401.field5382 >> 3);
        int var2 = (class421.field5762 >> 3) + (class168.field2438 >> 10);
        class411.field5656 = class385.field5232.field573 = 0;
        class385.field5232.method3036((byte) 115, 8, 8);
        byte var3 = 18;
        class467.field6437 = new int[var3];
        class103.field1521 = new int[var3];
        class305.field4025 = new byte[var3][];
        class380.field5194 = new int[var3][4];
        class257.field3388 = new byte[var3][];
        class76.field1132 = new int[var3];
        class149.field2131 = new int[var3];
        class506.field6966 = new byte[var3][];
        class162.field2364 = new int[var3];
        class386.field5257 = new int[var3];
        class420.field5754 = new byte[var3][];
        class252.field3333 = new byte[var3][];
        int var4 = 0;
        for (int var5 = (var1 - (class12.field251 >> 4)) / 8; var5 <= ((class12.field251 >> 4) + var1) / 8; var5++) {
            for (int var8 = (var2 - (class289.field3782 >> 4)) / 8; var8 <= (var2 + (class289.field3782 >> 4)) / 8; var8++) {
                int var9 = (var5 << 8) + var8;
                class149.field2131[var4] = var9;
                class76.field1132[var4] = class88.field1340.method2704("m" + var5 + "_" + var8, true);
                class467.field6437[var4] = class88.field1340.method2704("l" + var5 + "_" + var8, true);
                class103.field1521[var4] = class88.field1340.method2704("n" + var5 + "_" + var8, true);
                class386.field5257[var4] = class88.field1340.method2704("um" + var5 + "_" + var8, true);
                class162.field2364[var4] = class88.field1340.method2704("ul" + var5 + "_" + var8, true);
                if (class103.field1521[var4] == -1) {
                    class76.field1132[var4] = -1;
                    class467.field6437[var4] = -1;
                    class386.field5257[var4] = -1;
                    class162.field2364[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class103.field1521.length; var6++) {
            class103.field1521[var6] = -1;
            class76.field1132[var6] = -1;
            class467.field6437[var6] = -1;
            class386.field5257[var6] = -1;
            class162.field2364[var6] = -1;
        }
        int var7 = -26 % ((-arg0 - 76) / 47);
        class167.method1124(var1, var2, true, (byte) 104, false);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
    public final void method1405(boolean arg0) {
        class236 var2 = this.field3024;
        synchronized (this.field3024) {
            if (arg0) {
                return;
            }
            this.field3024.method1458((byte) 106);
        }
        field3025++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILof;)V")
    public static final void method1406(int arg0, class437 arg1) {
        field3016++;
        arg1.field5988 = null;
        if (arg0 > class51.field792) {
            class97.field1466.method1766((byte) 54, arg1);
            class51.field792++;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method1407(int arg0) {
        field3026 = null;
        field3020 = null;
        if (arg0 > -68) {
            field3026 = null;
        }
        field3018 = null;
        field3022 = null;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
    public final void method1408(byte arg0) {
        field3012++;
        class236 var2 = this.field3024;
        synchronized (this.field3024) {
            this.field3024.method1459(arg0 ^ 0xFFFFB56A);
            if (arg0 != -6) {
                method1404((byte) -70);
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI)V")
    public final void method1409(boolean arg0, int arg1) {
        field3013++;
        class236 var3 = this.field3024;
        synchronized (this.field3024) {
            this.field3024.method1461(-5, arg1);
            if (!arg0) {
                method1406(15, null);
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Luf;")
    public final class310 method1410(int arg0, int arg1) {
        field3014++;
        class236 var3 = this.field3024;
        class310 var4;
        synchronized (this.field3024) {
            var4 = (class310) this.field3024.method1456((long) arg0, 124);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3015.method2708(35, arg0, (byte) 54);
        class310 var6 = new class310();
        if (arg1 != -26254) {
            return null;
        }
        if (var5 != null) {
            var6.method1798((byte) 37, new class379(var5));
        }
        var6.method1804((byte) 105);
        class236 var7 = this.field3024;
        synchronized (this.field3024) {
            this.field3024.method1462(var6, (long) arg0, -33);
            return var6;
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lrb;ILpc;)V")
    public class224(class234 arg0, int arg1, class473 arg2) {
        this.field3015 = arg2;
        if (this.field3015 != null) {
            this.field3015.method2710(35, (byte) -100);
        }
    }
}
