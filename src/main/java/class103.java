import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class103 implements Runnable {

    @OriginalMember(owner = "client!of", name = "e", descriptor = "Z")
    public boolean field2565 = true;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "Ljava/lang/Object;")
    public Object field2580 = new Object();

    @OriginalMember(owner = "client!of", name = "v", descriptor = "[I")
    public int[] field2582 = new int[500];

    @OriginalMember(owner = "client!of", name = "x", descriptor = "[I")
    public int[] field2584 = new int[500];

    @OriginalMember(owner = "client!of", name = "w", descriptor = "I")
    public int field2583 = 0;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "Lhe;")
    public static class54 field2568 = class6.method58("Benutzername: ", false);

    @OriginalMember(owner = "client!of", name = "c", descriptor = "Lhe;")
    private static class54 field2563 = class6.method58(" seconds)3", false);

    @OriginalMember(owner = "client!of", name = "j", descriptor = "Lhe;")
    public static class54 field2570 = field2563;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "Lhe;")
    private static class54 field2569 = class6.method58("Too many incorrect logins from your address)3", false);

    @OriginalMember(owner = "client!of", name = "o", descriptor = "Lhe;")
    private static class54 field2575 = class6.method58("Please remove ", false);

    @OriginalMember(owner = "client!of", name = "b", descriptor = "Lhe;")
    public static class54 field2562 = field2569;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "Lhe;")
    public static class54 field2572 = field2575;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "Lhe;")
    private static class54 field2577 = class6.method58("Location", false);

    @OriginalMember(owner = "client!of", name = "r", descriptor = "Lhe;")
    public static class54 field2578 = field2575;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "Lhe;")
    public static class54 field2571 = field2577;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILnc;)Z")
    public static final boolean method804(int arg0, class93 arg1) {
        field2566++;
        if (class31.field804) {
            if (class105.method810(arg1, -22389) != 0) {
                return false;
            }
            if (arg1.field2359 == 0) {
                return false;
            }
        }
        return arg0 < 106 ? true : arg1.field2326;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public static final void method805(byte arg0) {
        for (int var1 = 0; var1 < class8.field227; var1++) {
            int var10002 = class50.field1217[var1]--;
            if (class50.field1217[var1] >= -10) {
                class69 var3 = class89.field2188[var1];
                if (var3 == null) {
                    var3 = class69.method548(class131.field2977, class39.field999[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class50.field1217[var1] += var3.method549();
                    class89.field2188[var1] = var3;
                }
                if (class50.field1217[var1] < 0) {
                    int var10;
                    if (class1.field19[var1] == 0) {
                        var10 = class34.field856;
                    } else {
                        int var4 = class1.field19[var1] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - class108.field2639.field974;
                        int var6 = (class1.field19[var1] & 0xFF) * 128;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var7 = class1.field19[var1] >> 8 & 0xFF;
                        int var8 = var7 * 128 + 64 - class108.field2639.field971;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var5 + var8 - 128;
                        if (var9 > var6) {
                            class50.field1217[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var6 - var9) * class139.field3190 / var6;
                    }
                    if (var10 > 0) {
                        class92 var11 = var3.method551().method734(class13.field357);
                        class119 var12 = class119.method916(var11, 100, var10);
                        var12.method905(class19.field544[var1] - 1);
                        class5.field143.method484(var12);
                    }
                    class50.field1217[var1] = -100;
                }
            } else {
                class8.field227--;
                for (int var2 = var1; var2 < class8.field227; var2++) {
                    class39.field999[var2] = class39.field999[var2 + 1];
                    class89.field2188[var2] = class89.field2188[var2 + 1];
                    class19.field544[var2] = class19.field544[var2 + 1];
                    class50.field1217[var2] = class50.field1217[var2 + 1];
                    class1.field19[var2] = class1.field19[var2 + 1];
                }
                var1--;
            }
        }
        if (class52.field1236 && !class7.method65(91)) {
            if (class67.field1682 != 0 && class4.field140 != -1) {
                class137.method1068(class67.field1682, -2, class105.field2602, 0, class4.field140, false);
            }
            class52.field1236 = false;
        }
        if (arg0 <= 119) {
            method805((byte) -79);
        }
        field2561++;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static final void method806(int arg0) {
        class70.field1723 = 0;
        field2581++;
        if (arg0 != -21432) {
            method806(50);
        }
        class21.field579 = 0;
        class1.method6(arg0 ^ 0x53B4);
        class6.method57((byte) -49);
        class115.method876(-1);
        for (int var1 = 0; var1 < class70.field1723; var1++) {
            int var3 = class115.field2730[var1];
            if (class4.field138 != class111.field2679[var3].field960) {
                class111.field2679[var3].field2788 = null;
                class111.field2679[var3] = null;
            }
        }
        if (class128.field2890 != class40.field1044.field2076) {
            throw new RuntimeException("gnp1 pos:" + class40.field1044.field2076 + " psize:" + class128.field2890);
        }
        for (int var2 = 0; var2 < class158.field3598; var2++) {
            if (class111.field2679[class58.field1480[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class158.field3598);
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field2565) {
            Object var1 = this.field2580;
            synchronized (this.field2580) {
                if (this.field2583 < 500) {
                    this.field2584[this.field2583] = class71.field1772;
                    this.field2582[this.field2583] = class7.field211;
                    this.field2583++;
                }
            }
            class50.method360(50L, 10);
        }
        field2567++;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
    public static void method807(int arg0) {
        field2563 = null;
        field2577 = null;
        field2575 = null;
        field2572 = null;
        field2578 = null;
        field2562 = null;
        field2570 = null;
        if (arg0 != 0) {
            method808((byte) -118, null, 76, -19);
        }
        field2569 = null;
        field2568 = null;
        field2571 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B[BII)I")
    public static final int method808(byte arg0, byte[] arg1, int arg2, int arg3) {
        field2576++;
        if (arg0 >= -109) {
            return -96;
        }
        int var4 = -1;
        for (int var5 = arg2; var5 < arg3; var5++) {
            var4 = class87.field2148[(arg1[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
    public static final void method809(int arg0) {
        field2564++;
        try {
            if (class83.field2051 == 1) {
                int var1 = class1.field5.method122(true);
                if (var1 > 0 && class1.field5.method137((byte) -25)) {
                    int var2 = var1 - class40.field1049;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class1.field5.method128(var2, 98);
                    return;
                }
                class1.field5.method126((byte) -27);
                class1.field5.method110(arg0 ^ 0x521E);
                class3.field46 = null;
                if (class134.field3046 == null) {
                    class83.field2051 = 0;
                } else {
                    class83.field2051 = 2;
                }
                class40.field1041 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class1.field5.method126((byte) -8);
            class134.field3046 = null;
            class40.field1041 = null;
            class3.field46 = null;
            class83.field2051 = 0;
        }
        if (arg0 != 0) {
            method809(48);
        }
    }
}
