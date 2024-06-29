import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class249 extends class86 {

    @OriginalMember(owner = "client!nl", name = "R", descriptor = "[[B")
    public static byte[][] field3859 = new byte[250][];

    @OriginalMember(owner = "client!nl", name = "K", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!nl", name = "L", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!nl", name = "M", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!nl", name = "N", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!nl", name = "O", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!nl", name = "Q", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!nl", name = "S", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!nl", name = "T", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!nl", name = "U", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!nl", name = "P", descriptor = "[Lrg;")
    public static class342[] field3857;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(IB)[[I", line = 14)
    public final int[][] method156(int arg0, byte arg1) {
        field3862++;
        int[][] var3 = this.field1227.method2025(false, arg0);
        if (this.field1227.field4277) {
            int[][] var4 = this.method782(arg0, 0, 1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class93.field1424; var11++) {
                var7[var11] = 4096 - var5[var11];
                var9[var11] = 4096 - var6[var11];
                var10[var11] = 4096 - var8[var11];
            }
        }
        if (arg1 >= -126) {
            field3859 = (byte[][]) ((byte[][]) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 63)
    public static final String method1859(int arg0, String arg1) {
        field3858++;
        if (arg1 == null) {
            return null;
        }
        int var2 = arg1.length();
        int var3;
        for (var3 = arg0; var2 > var3 && class283.method2060(1, arg1.charAt(var3)); var3++) {
        }
        while (var2 > var3 && class283.method2060(1, arg1.charAt(var2 - 1))) {
            var2--;
        }
        int var4 = var2 - var3;
        if (var4 < 1 || var4 > 20) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var3; var6 < var2; var6++) {
            char var7 = arg1.charAt(var6);
            if (class18.method201(var7, (byte) 33)) {
                char var8 = class53.method519(-195, var7);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)V", line = 117)
    public static void method1860(byte arg0) {
        field3859 = (byte[][]) null;
        if (arg0 > -14) {
            method1860((byte) 27);
        }
        field3857 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZLug;)V", line = 129)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        field3855++;
        if (arg1) {
            this.method156(-8, (byte) -114);
        }
        if (arg0 == 0) {
            this.field1228 = arg2.method281(-126) == 1;
        }
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(II)V", line = 144)
    public static final void method1861(int arg0, int arg1) {
        field3854++;
        class223 var2 = class236.field3674;
        synchronized (class236.field3674) {
            class214.field3346 = arg0;
            if (arg1 != 21916) {
                field3857 = (class342[]) null;
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(II)[I", line = 162)
    public final int[] method158(int arg0, int arg1) {
        int[] var3 = this.field1225.method1914(arg0, -72);
        if (this.field1225.field3995) {
            int[] var4 = this.method774(0, arg0, 0);
            for (int var5 = 0; var5 < class93.field1424; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        if (arg1 <= 7) {
            return (int[]) null;
        } else {
            field3856++;
            return var3;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BLrn;)V", line = 190)
    public static final void method1862(byte arg0, class18 arg1) {
        if (arg0 != 60) {
            method1863(-46L, -125);
        }
        field3852++;
        class350.field5563 = class67.method661(0, class337.field5181, arg1, (byte) 95);
        class85.field1216 = class67.method661(0, class44.field704, arg1, (byte) 95);
        class310.field4806 = class67.method661(0, class36.field546, arg1, (byte) 95);
        class19.field312 = class67.method661(0, class227.field3536, arg1, (byte) 95);
        class221.field3434 = class67.method661(0, class148.field2411, arg1, (byte) 95);
        class148.field2429 = class67.method661(0, class264.field4100, arg1, (byte) 95);
        class342.field5410 = class222.method1666(arg1, (byte) -112, 0, class288.field4473);
        class324.field4983 = class222.method1666(arg1, (byte) -112, 0, class59.field915);
        class160.field2557 = class222.method1666(arg1, (byte) -112, 0, class162.field2574);
        class281.field4345 = class184.method1422(class53.field806, 0, (byte) -53, arg1);
        class334.field5114 = class184.method1422(class362.field5739, 0, (byte) -53, arg1);
        class314.field4853.method1191(class334.field5114, (int[]) null);
        class346.field5506.method1191(class334.field5114, (int[]) null);
        class64.field988.method1191(class334.field5114, (int[]) null);
        if (class240.field3737) {
            class127.field2118 = class66.method651(arg0 - 60, class215.field3368, 0, arg1);
            for (int var2 = 0; var2 < class127.field2118.length; var2++) {
                class127.field2118[var2].method715();
            }
        }
        class361 var3 = class344.method2421(class209.field3213, true, arg1, 0);
        var3.method2541();
        if (class240.field3737) {
            class306.field4750 = new class2(var3);
        } else {
            class306.field4750 = var3;
        }
        class361[] var4 = class310.method2207(0, class29.field466, arg1, -219516244);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method2541();
        }
        if (class240.field3737) {
            class167.field2665 = new class215[var4.length];
            for (int var6 = 0; var6 < var4.length; var6++) {
                class167.field2665[var6] = new class2(var4[var6]);
            }
        } else {
            class167.field2665 = var4;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(JI)V", line = 259)
    public static final void method1863(long arg0, int arg1) {
        if (class314.field4858 == 1 || class314.field4858 == 5) {
            class94.method840(4, arg0);
        } else if (class314.field4858 == 2) {
            class350.method2466((byte) 74);
        } else if (class314.field4858 == 4) {
            class210.method1556(arg0, false);
        } else {
            class303.method2185(67);
        }
        field3861++;
        if (!class6.field89) {
            if (class307.field4755 != 0) {
                class344.field5479 = class215.field3364;
                class191.field3003 = class317.field4880;
            } else if (class86.field1230 == 0) {
                class344.field5479 = class268.field4137;
                class191.field3003 = class78.field1129;
            } else {
                class344.field5479 = class305.field4745;
                class191.field3003 = class254.field3916;
            }
            class356.field5670[0] = 1011;
            class78.field1134[0] = class174.field2761;
            class66.field1006 = 1;
            class212.field3328[0] = class123.field1979;
            class318.field4904[0] = "";
        }
        class273.method2002((long) class360.field5718);
        if (class164.field2604 != -1) {
            class222.method1672(8, class164.field2604);
        }
        for (int var3 = 0; var3 < class362.field5732; var3++) {
            if (class227.field3540[var3]) {
                class349.field5544[var3] = true;
            }
            class231.field3605[var3] = class227.field3540[var3];
            class227.field3540[var3] = false;
        }
        class327.field5031 = class360.field5718;
        class99.field1496 = null;
        if (class240.field3737) {
            class9.field130 = true;
        }
        class150.field2458 = -1;
        class82.field1193 = arg1;
        class91.field1346 = null;
        if (class164.field2604 != -1) {
            class362.field5732 = 0;
            class167.method1328(arg1 ^ 0xFFFFECC4);
        }
        if (class240.field3737) {
            class213.method1596();
        } else {
            class60.method607();
        }
        class228.method1712((byte) 116);
        if (class6.field89) {
            if (class149.field2444) {
                class244.method1845((byte) -122);
            } else {
                class59.method582(arg1 - 1);
            }
        } else if (class91.field1346 != null) {
            class326.method2309(class280.field4330, class91.field1346, class170.field2687, (byte) 52);
        } else if (class150.field2458 != -1) {
            class326.method2309(class150.field2458, (class342) null, class82.field1193, (byte) 52);
        }
        int var4 = class6.field89 ? -1 : class191.method1460(-3086);
        if (var4 == -1) {
            var4 = class155.field2502;
        }
        class293.method2122(var4, arg1);
        if (class37.field574 == 1) {
            class37.field574 = 2;
        }
        if (class288.field4469 == 1) {
            class288.field4469 = 2;
        }
        if (class284.field4398 == 3) {
            for (int var5 = 0; var5 < class362.field5732; var5++) {
                if (class231.field3605[var5]) {
                    if (class240.field3737) {
                        class213.method1594(class188.field2958[var5], class212.field3299[var5], class236.field3677[var5], class91.field1390[var5], 16711935, 128);
                    } else {
                        class60.method601(class188.field2958[var5], class212.field3299[var5], class236.field3677[var5], class91.field1390[var5], 16711935, 128);
                    }
                } else if (class349.field5544[var5]) {
                    if (class240.field3737) {
                        class213.method1594(class188.field2958[var5], class212.field3299[var5], class236.field3677[var5], class91.field1390[var5], 16711680, 128);
                    } else {
                        class60.method601(class188.field2958[var5], class212.field3299[var5], class236.field3677[var5], class91.field1390[var5], 16711680, 128);
                    }
                }
            }
        }
        class233.method1741(class173.field2746.field1359, class173.field2746.field1286, (byte) -20, class247.field3840, class119.field1826);
        class247.field3840 = 0;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V", line = 411)
    public class249() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "(III)Ljg;", line = 418)
    public static final class297 method1864(int arg0, int arg1, int arg2) {
        if (arg1 < 0 || arg1 >= class154.field2492 || arg2 < 0 || arg2 >= class166.field2642) {
            return null;
        }
        class329 var3 = class170.field2689[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        class297 var4 = null;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < var3.field5063; var7++) {
            class297 var8 = var3.field5070[var7];
            if ((var8.field4611 >> 29 & 0x3L) <= 1L && var8.field4616 == arg1 && var8.field4614 == arg2 && (var8.field4606 > var5 || var8.field4612 > var6)) {
                var4 = var8;
                var5 = var8.field4606;
                var6 = var8.field4612;
            }
        }
        return var4;
    }
}
