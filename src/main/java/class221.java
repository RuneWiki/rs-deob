import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class221 {

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "Z")
    public boolean field3109 = false;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public int field3112 = 0;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    public int field3119 = 0;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    public static int field3117 = 0;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "Lie;")
    public static class94 field3120 = new class94(5000);

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field3124 = new String[500];

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "Lhl;")
    public class71 field3114;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field3108;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 21)
    public static final void method1517(int arg0) {
        class128.field1749 = 0;
        field3113++;
        class21.field278 = arg0;
        class147.method991(-4);
        class63.method394(30675);
        class225.method1552(arg0 ^ 0x0);
        for (int var1 = 0; var1 < class128.field1749; var1++) {
            int var2 = class330.field5038[var1];
            if (class38.field463 != class223.field3159[var2].field2422) {
                if (class223.field3159[var2].field2657.method2022(-1)) {
                    class59.method345((byte) 121, class223.field3159[var2]);
                }
                class223.field3159[var2].method1281((class282) null, -24886);
                class223.field3159[var2] = null;
            }
        }
        if (class132.field1817 != class307.field4742.field1400) {
            throw new RuntimeException("gnp1 pos:" + class307.field4742.field1400 + " psize:" + class132.field1817);
        }
        for (int var3 = 0; var3 < class127.field1735; var3++) {
            if (class223.field3159[class269.field4238[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class127.field1735);
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V", line = 69)
    public static void method1518(int arg0) {
        field3120 = null;
        field3124 = null;
        if (arg0 >= -10) {
            field3123 = 55;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BI)Lkf;", line = 80)
    public static final class237 method1519(byte arg0, int arg1) {
        field3118++;
        class237 var2 = (class237) class89.field1108.method1239((byte) -28, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 <= 54) {
            return (class237) null;
        } else {
            byte[] var3 = class340.field5277.method1199(28815, arg1, 16);
            class237 var4 = new class237();
            if (var3 != null) {
                var4.method1688(0, new class107(var3));
            }
            class89.field1108.method1243(var4, (long) arg1, -29282);
            return var4;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILlc;)Lnk;", line = 104)
    public static final class14 method1520(int arg0, int arg1, class175 arg2) {
        if (arg0 == 0) {
            field3111++;
            byte[] var3 = arg2.method1195(1, arg1);
            return var3 == null ? null : new class14(var3);
        } else {
            return (class14) null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)V", line = 123)
    public static final void method1521(int arg0, int arg1, int arg2) {
        if (arg0 >= -75) {
            return;
        }
        class337 var3 = class269.field4239[class138.field1940][arg1][arg2];
        field3116++;
        if (var3 == null) {
            class304.method2131(class138.field1940, arg1, arg2);
            return;
        }
        int var4 = -99999999;
        class100 var5 = null;
        for (class100 var6 = (class100) var3.method2331((byte) 63); var6 != null; var6 = (class100) var3.method2332(-86)) {
            class93 var7 = class60.method353(var6.field1313.field2695, (byte) -43);
            int var8 = var7.field1219;
            if (var7.field1188 == 1) {
                var8 = (var6.field1313.field2701 + 1) * var8;
            }
            if (var8 > var4) {
                var4 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            class304.method2131(class138.field1940, arg1, arg2);
            return;
        }
        var3.method2330(var5, (byte) 109);
        class100 var9 = (class100) var3.method2331((byte) 122);
        class187 var10 = null;
        class187 var11 = null;
        while (var9 != null) {
            class187 var12 = var9.field1313;
            if (var5.field1313.field2695 != var12.field2695) {
                if (var11 == null) {
                    var11 = var12;
                }
                if (var11.field2695 != var12.field2695 && var10 == null) {
                    var10 = var12;
                }
            }
            var9 = (class100) var3.method2332(-61);
        }
        long var13 = (long) ((arg2 << 7) + arg1 + 1610612736);
        class258.method1870(class138.field1940, arg1, arg2, class184.method1278(class138.field1940, -13660, arg2 * 128 + 64, arg1 * 128 + 64), var5.field1313, var13, var11, var10);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZI)V", line = 207)
    public static final void method1522(boolean arg0, int arg1) {
        class16.field223 = null;
        class232.field3393 = 0;
        class222.field3143 = (byte[][][]) null;
        class181.field2622 = (byte[][][]) null;
        class50.field625 = (byte[][][]) null;
        class247.field3754 = (int[][][]) null;
        class57.field687 = (int[][][]) null;
        class157.field2167 = (int[][][]) null;
        class196.field2816 = null;
        if (arg0 && class69.field899 != null) {
            class136.field1880 = class69.field899.field994;
        } else {
            class136.field1880 = -1;
        }
        class149.field2078 = (byte[][][]) null;
        field3115++;
        class224.field3179 = (byte[][][]) null;
        class69.field899 = null;
        class132.field1809.method2333(3393);
        class284.field4454 = null;
        class74.field956 = null;
        class89.field1120 = null;
        class249.field3777 = null;
        class308.field4765 = -1;
        class62.field790 = null;
        class73.field928 = null;
        class292.field4587 = null;
        class198.field2840 = null;
        class334.field5162 = null;
        class30.field383 = arg1;
        class235.field3428 = null;
        class262.field3959 = null;
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)V", line = 251)
    public static final void method1523(int arg0) {
        field3110++;
        class292.field4579.method1237((byte) 42);
        if (arg0 != 0) {
            field3123 = -6;
        }
        class19.field248.method1237((byte) 16);
    }
}
