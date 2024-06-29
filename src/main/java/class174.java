import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class174 extends class335 {

    @OriginalMember(owner = "client!ob", name = "Q", descriptor = "I")
    private int field2634 = 4096;

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "Z")
    private boolean field2637 = true;

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "Ljava/lang/String;")
    public static String field2630 = "Choose Option";

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "Ldm;")
    public static class333 field2632 = new class333();

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "Z")
    public static boolean field2639 = false;

    @OriginalMember(owner = "client!ob", name = "W", descriptor = "Ljava/lang/String;")
    public static String field2640 = "Ok";

    @OriginalMember(owner = "client!ob", name = "X", descriptor = "Z")
    public static boolean field2641 = false;

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!ob", name = "R", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(II)V", line = 4)
    public static final void method1250(int arg0, int arg1) {
        field2638++;
        if (arg0 == 7) {
            class200.field3001.method2175(arg1, arg0 ^ 0xAC7A9360);
            class130.field2035.method2175(arg1, -1401253017);
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(IB)V", line = 16)
    public static final void method1251(int arg0, byte arg1) {
        class240.field3839.method2175(arg0, -1401253017);
        if (arg1 <= 31) {
            field2632 = (class333) null;
        }
        field2631++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IB)[[I", line = 40)
    public final int[][] method249(int arg0, byte arg1) {
        int[][] var3 = this.field5232.method1101(arg0, true);
        field2633++;
        if (arg1 != 51) {
            field2640 = (String) null;
        }
        if (this.field5232.field2446) {
            int[] var4 = this.method2330(arg0 - 1 & class227.field3597, true, 0);
            int[] var5 = this.method2330(arg0, true, 0);
            int[] var6 = this.method2330(arg0 + 1 & class227.field3597, true, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class105.field1630; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field2634;
                int var12 = (var5[var10 + 1 & class244.field3906] - var5[var10 - 1 & class244.field3906]) * this.field2634;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = var12 / var17;
                    var19 = 16777216 / var17;
                    var20 = var11 / var17;
                }
                if (this.field2637) {
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var18;
                var8[var10] = var20;
                var9[var10] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILkh;I)V", line = 135)
    public final void method230(int arg0, class166 arg1, int arg2) {
        if (arg0 == 0) {
            this.field2634 = arg1.method1151(-112);
        } else if (arg0 == 1) {
            this.field2637 = arg1.method1178(0) == 1;
        }
        field2629++;
        if (arg2 <= 51) {
            method1251(76, (byte) -56);
        }
    }

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)V", line = 164)
    public static void method1252(int arg0) {
        field2640 = null;
        field2632 = null;
        if (arg0 != -1) {
            method1254((byte) -121, false);
        }
        field2630 = null;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V", line = 175)
    public class174() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "(I)V", line = 179)
    public static final void method1253(int arg0) {
        field2636++;
        class334.method2323();
        class11.field177 = new class246[9];
        class11.field177[1] = new class261();
        class11.field177[2] = new class56();
        class11.field177[3] = new class100();
        class11.field177[4] = new class140();
        class11.field177[5] = new class182();
        class11.field177[6] = new class286();
        if (arg0 != -18502) {
            method1251(14, (byte) -100);
        }
        class11.field177[7] = new class58();
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BZ)Z", line = 212)
    public static final boolean method1254(byte arg0, boolean arg1) {
        if (arg0 > -29) {
            field2630 = (String) null;
        }
        field2635++;
        boolean var2 = class277.method1895();
        if (var2 == arg1) {
            return true;
        }
        if (!arg1) {
            class277.method1901();
        } else if (!class277.method1905() || !class277.method1907() || !class277.method1906()) {
            arg1 = false;
        }
        class34.field512 = arg1;
        class331.method2300((byte) -106, class32.field471);
        if (var2 == arg1) {
            return false;
        } else {
            ((class315) class15.field207).method2142((byte) -104);
            return true;
        }
    }
}
