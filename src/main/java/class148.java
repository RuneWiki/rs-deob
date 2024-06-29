import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class148 implements class79 {

    @OriginalMember(owner = "client!re", name = "d", descriptor = "Lba;")
    private class53 field2245 = new class53(256);

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Ll;")
    private class133 field2251;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "Ll;")
    private class133 field2254;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "[Ldd;")
    private class304[] field2253;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2243 = "skill: ";

    @OriginalMember(owner = "client!re", name = "i", descriptor = "Z")
    public static boolean field2250 = false;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "[I")
    public static int[] field2252 = new int[200];

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V", line = 5)
    public static final void method1028(byte arg0) {
        class181.field2731.method2174(-10385);
        class326.field5081.method2174(-10385);
        field2247++;
        if (arg0 != -32) {
            method1030(-126);
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(IZ)V", line = 21)
    public static final void method1029(int arg0, boolean arg1) {
        int var2 = class303.field4723.length;
        field2246++;
        byte[][] var3;
        if (class94.field1516 && arg1) {
            var3 = class128.field2027;
        } else {
            var3 = class170.field2566;
        }
        if (arg0 != -2) {
            field2243 = (String) null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            byte[] var5 = var3[var4];
            if (var5 != null) {
                int var6 = (class331.field5158[var4] >> 8) * 64 - class213.field3249;
                int var7 = (class331.field5158[var4] & 0xFF) * 64 - class342.field5328;
                class170.method1225((byte) -97);
                class268.method1849(class224.field3570, arg1, var5, var7, arg0 ^ 0xFFFFFFC1, var6);
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZI)Z", line = 59)
    public final boolean method575(boolean arg0, int arg1) {
        if (arg0) {
            this.method1031(-23, 120);
        }
        field2242++;
        class76 var3 = this.method1031(arg1, -12818);
        return var3 != null && var3.method561(this.field2254, 87, this);
    }

    @OriginalMember(owner = "client!re", name = "h", descriptor = "(II)Ldd;", line = 71)
    public final class304 method574(int arg0, int arg1) {
        field2244++;
        if (arg0 != 0) {
            method1029(102, true);
        }
        return this.field2253[arg1];
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 88)
    public static void method1030(int arg0) {
        if (arg0 >= -98) {
            field2243 = (String) null;
        }
        field2252 = null;
        field2243 = null;
    }

    @OriginalMember(owner = "client!re", name = "i", descriptor = "(II)Lhj;", line = 100)
    public class76 method1031(int arg0, int arg1) {
        field2248++;
        class199 var3 = this.field2245.method443(-2, (long) arg0);
        if (var3 != null) {
            return (class76) var3;
        }
        if (arg1 != -12818) {
            field2252 = (int[]) null;
        }
        byte[] var4 = this.field2251.method969(true, arg0);
        if (var4 == null) {
            return null;
        } else {
            class76 var5 = new class76(new class166(var4));
            this.field2245.method439(var5, (long) arg0, (byte) 18);
            return var5;
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Ll;Ll;Ll;)V", line = 160)
    public class148(class133 arg0, class133 arg1, class133 arg2) {
        this.field2251 = arg1;
        this.field2254 = arg2;
        class166 var4 = new class166(arg0.method980(0, 0, 5));
        int var5 = var4.method1151(-125);
        this.field2253 = new class304[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1178(0) == 1) {
                this.field2253[var6] = new class304();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field2253[var7] != null) {
                this.field2253[var7].field4747 = var4.method1178(0) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field2253[var8] != null) {
                this.field2253[var8].field4745 = var4.method1178(0) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2253[var9] != null) {
                this.field2253[var9].field4748 = var4.method1178(0) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field2253[var10] != null) {
                this.field2253[var10].field4740 = var4.method1178(0) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field2253[var11] != null) {
                this.field2253[var11].field4746 = var4.method1143(117);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field2253[var12] != null) {
                this.field2253[var12].field4750 = var4.method1143(-52);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field2253[var13] != null) {
                this.field2253[var13].field4742 = var4.method1143(-128);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field2253[var14] != null) {
                this.field2253[var14].field4749 = var4.method1143(81);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field2253[var15] != null) {
                this.field2253[var15].field4744 = (short) var4.method1151(-51);
            }
        }
        if (var4.field2532 < var4.field2500.length) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field2253[var16] != null) {
                    var4.method1143(97);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field2253[var17] != null) {
                    var4.method1143(78);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field2253[var18] != null) {
                    var4.method1178(0);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field2253[var19] != null) {
                    this.field2253[var19].field4737 = var4.method1178(0) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field2253[var20] != null) {
                    var4.method1143(111);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field2253[var21] != null) {
                    var4.method1178(0);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field2253[var22] != null) {
                    var4.method1178(0);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field2253[var23] != null) {
                    var4.method1178(0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIFZIZ)[I", line = 150)
    public final int[] method573(int arg0, int arg1, float arg2, boolean arg3, int arg4, boolean arg5) {
        field2249++;
        if (!arg5) {
            this.field2254 = (class133) null;
        }
        return this.method1031(arg1, -12818).method555(arg0, this.field2253[arg1].field4737, 99, this.field2254, this, arg3, arg4, (double) arg2);
    }
}
