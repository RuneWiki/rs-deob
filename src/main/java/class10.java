import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class10 extends class312 {

    @OriginalMember(owner = "client!mn", name = "C", descriptor = "I")
    public static int field99 = 0;

    @OriginalMember(owner = "client!mn", name = "y", descriptor = "I")
    public static int field95 = 0;

    @OriginalMember(owner = "client!mn", name = "F", descriptor = "[[Z")
    public static boolean[][] field102 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!mn", name = "K", descriptor = "I")
    public static int field107 = 0;

    @OriginalMember(owner = "client!mn", name = "E", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!mn", name = "G", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!mn", name = "H", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!mn", name = "I", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!mn", name = "J", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!mn", name = "L", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!mn", name = "w", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!mn", name = "z", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!mn", name = "A", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!mn", name = "B", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!mn", name = "D", descriptor = "Ljf;")
    private class227 field100;

    @OriginalMember(owner = "client!mn", name = "x", descriptor = "[[[Lsa;")
    public static class174[][][] field94;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", line = 4)
    public final String method58(int arg0, String arg1, int arg2) {
        field103++;
        if (this.field100 == null) {
            return arg1;
        }
        if (arg0 > -96) {
            field107 = 98;
        }
        class139 var4 = (class139) this.field100.method1558((long) arg2, false);
        return var4 == null ? arg1 : var4.field2151;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BLte;)V", line = 26)
    public static final void method59(byte arg0, class38 arg1) {
        field93++;
        int var2 = arg1.field553 - class343.field5341;
        int var3 = arg1.field480 * 128 + (arg1.method271((byte) 117) * 64);
        int var4 = arg1.field464 * 128 + arg1.method271((byte) 66) * 64;
        arg1.field537 += (var3 - arg1.field537) / var2;
        arg1.field543 = 0;
        if (arg1.field469 == 0) {
            arg1.field520 = 1024;
        }
        if (arg0 <= 110) {
            return;
        }
        if (arg1.field469 == 1) {
            arg1.field520 = 1536;
        }
        arg1.field519 += (var4 - arg1.field519) / var2;
        if (arg1.field469 == 2) {
            arg1.field520 = 0;
        }
        if (arg1.field469 == 3) {
            arg1.field520 = 512;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BJ)V", line = 71)
    public static final void method60(byte arg0, long arg1) {
        try {
            if (arg0 <= 79) {
                method64(-31, 42, (byte) 4);
            }
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
        field105++;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BILgn;)V", line = 87)
    private final void method61(byte arg0, int arg1, class303 arg2) {
        field97++;
        if (arg1 == 249) {
            int var4 = arg2.method2043((byte) -123);
            if (this.field100 == null) {
                int var5 = class47.method330((byte) 43, var4);
                this.field100 = new class227(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method2043((byte) -108) == 1;
                int var8 = arg2.method2059(255);
                class187 var9;
                if (var7) {
                    var9 = new class139(arg2.method2027(0));
                } else {
                    var9 = new class27(arg2.method1996(88));
                }
                this.field100.method1550(var9, (long) var8, (byte) 35);
            }
        }
        if (arg0 != -4) {
            field101 = 64;
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(III)I", line = 133)
    public final int method62(int arg0, int arg1, int arg2) {
        field104++;
        if (this.field100 == null) {
            return arg2;
        }
        class27 var4 = (class27) this.field100.method1558((long) arg0, false);
        if (arg1 != 0) {
            field107 = 26;
        }
        return var4 == null ? arg2 : var4.field344;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lgn;II)V", line = 156)
    public static final void method63(class303 arg0, int arg1, int arg2) {
        field108++;
        if (arg2 != 0) {
            method63((class303) null, -69, -28);
        }
        if (class122.field1901 == null) {
            return;
        }
        try {
            class122.field1901.method498((byte) -69, 0L);
            class122.field1901.method504((byte) -11, 24, arg0.field4716, arg1);
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIB)V", line = 178)
    public static final void method64(int arg0, int arg1, byte arg2) {
        field106++;
        class345 var3 = class205.method1378(arg0, -29934);
        int var4 = var3.field5356;
        int var5 = var3.field5348;
        int var6 = var3.field5355;
        int var7 = class219.field3483[var6 - var5];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        if (arg2 <= 7) {
            field107 = -36;
        }
        int var8 = var7 << var5;
        class86.method591(var8 & arg1 << var5 | ~var8 & class61.field852[var4], -120, var4);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z[B)V", line = 214)
    public static final void method65(boolean arg0, byte[] arg1) {
        field96++;
        class303 var2 = new class303(arg1);
        var2.field4679 = arg1.length - 2;
        class246.field3862 = var2.method1994(false);
        class276.field4257 = new int[class246.field3862];
        class68.field1011 = new int[class246.field3862];
        class107.field1652 = new int[class246.field3862];
        class219.field3488 = new boolean[class246.field3862];
        class146.field2307 = new byte[class246.field3862][];
        class46.field644 = new byte[class246.field3862][];
        class123.field1919 = new int[class246.field3862];
        var2.field4679 = arg1.length - (class246.field3862 * 8) - 7;
        class116.field1798 = var2.method1994(false);
        class168.field2567 = var2.method1994(false);
        int var3 = (var2.method2043((byte) -128) & 0xFF) + 1;
        for (int var4 = 0; var4 < class246.field3862; var4++) {
            class276.field4257[var4] = var2.method1994(false);
        }
        for (int var5 = 0; var5 < class246.field3862; var5++) {
            class123.field1919[var5] = var2.method1994(false);
        }
        for (int var6 = 0; var6 < class246.field3862; var6++) {
            class68.field1011[var6] = var2.method1994(false);
        }
        for (int var7 = 0; var7 < class246.field3862; var7++) {
            class107.field1652[var7] = var2.method1994(false);
        }
        var2.field4679 = arg1.length - ((var3 - 1) * 3) - (class246.field3862 * 8) - 7;
        class154.field2417 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class154.field2417[var8] = var2.method2059(255);
            if (class154.field2417[var8] == 0) {
                class154.field2417[var8] = 1;
            }
        }
        var2.field4679 = 0;
        if (!arg0) {
            field102 = (boolean[][]) ((boolean[][]) null);
        }
        for (int var9 = 0; var9 < class246.field3862; var9++) {
            int var10 = class68.field1011[var9];
            int var11 = class107.field1652[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            class46.field644[var9] = var13;
            boolean var15 = false;
            class146.field2307[var9] = var14;
            int var16 = var2.method2043((byte) -106);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var12; var22++) {
                    var13[var22] = var2.method2001(-3);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var12; var23++) {
                        byte var24 = var14[var23] = var2.method2001(-3);
                        var15 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label93: while (true) {
                    if (var10 <= var17) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var19 = 0;
                        while (true) {
                            if (var19 >= var10) {
                                break label93;
                            }
                            for (int var20 = 0; var20 < var11; var20++) {
                                byte var21 = var14[var10 * var20 + var19] = var2.method2001(-3);
                                var15 |= var21 != -1;
                            }
                            var19++;
                        }
                    }
                    for (int var18 = 0; var18 < var11; var18++) {
                        var13[var17 + (var10 * var18)] = var2.method2001(-3);
                    }
                    var17++;
                }
            }
            class219.field3488[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V", line = 383)
    public static void method66(int arg0) {
        field102 = (boolean[][]) null;
        if (arg0 <= 24) {
            method65(false, (byte[]) null);
        }
        field94 = (class174[][][]) null;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lgn;I)V", line = 396)
    public final void method67(class303 arg0, int arg1) {
        if (arg1 != 1536) {
            method66(-86);
        }
        while (true) {
            int var3 = arg0.method2043((byte) -119);
            if (var3 == 0) {
                field98++;
                return;
            }
            this.method61((byte) -4, var3, arg0);
        }
    }
}
