import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class301 extends class53 {

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "I")
    private int field5147 = 32768;

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "Lwa;")
    private static class75 field5143 = class66.method560("wave2:", false);

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "Lwa;")
    public static class75 field5146 = field5143;

    @OriginalMember(owner = "client!cj", name = "Z", descriptor = "Z")
    public static boolean field5152 = false;

    @OriginalMember(owner = "client!cj", name = "V", descriptor = "Lwa;")
    public static class75 field5148 = class66.method560("Fps:", false);

    @OriginalMember(owner = "client!cj", name = "bb", descriptor = "Lwa;")
    public static class75 field5154 = field5143;

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!cj", name = "S", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!cj", name = "W", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!cj", name = "X", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!cj", name = "Y", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!cj", name = "ab", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!cj", name = "cb", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "Ldg;")
    public static class303 field5141;

    @OriginalMember(owner = "client!cj", name = "R", descriptor = "[Lje;")
    public static class68[] field5144;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)[I", line = 11)
    public final int[] method59(int arg0, int arg1) {
        int[] var3 = this.field878.method1603(arg1, (byte) 116);
        field5145++;
        if (this.field878.field3749) {
            int[] var4 = this.method391(1, arg0 ^ 0xFFFFC4A4, arg1);
            int[] var5 = this.method391(2, 0, arg1);
            for (int var6 = 0; var6 < class269.field4644; var6++) {
                int var7 = (var4[var6] & 0xFF3) >> 4;
                int var8 = var5[var6] * this.field5147 >> 12;
                int var9 = class108.field1798[var7] * var8 >> 12;
                int var10 = class3.field31 & (var9 >> 12) + arg1;
                int var11 = class232.field3916[var7] * var8 >> 12;
                int var12 = class157.field2697 & (var11 >> 12) + var6;
                int[] var13 = this.method391(0, 0, var10);
                var3[var6] = var13[var12];
            }
        }
        if (arg0 != -15196) {
            field5141 = (class303) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V", line = 56)
    public class301() {
        super(3, false);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZLwa;)I", line = 61)
    public static final int method2068(boolean arg0, class75 arg1) {
        if (arg0) {
            return -65;
        }
        field5155++;
        if (arg1.method640(1) == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class283.field4876.field2344; var2++) {
            if (class283.field4876.field2350[var2].method628(class279.field4829, -67, class32.field480).method615(arg1, 0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)V", line = 99)
    public final void method56(byte arg0) {
        field5139++;
        if (arg0 != -79) {
            method2071((byte) 124);
        }
        class203.method1511(256);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "()V", line = 120)
    public static final void method2069() {
        for (int var0 = 0; var0 < class28.field366; var0++) {
            for (int var1 = 0; var1 < class150.field2573; var1++) {
                for (int var2 = 0; var2 < class262.field4440; var2++) {
                    class271.field4681[var0][var1][var2] = null;
                }
            }
        }
        for (int var3 = 0; var3 < class89.field1466; var3++) {
            class273.field4721[var3] = null;
        }
        class89.field1466 = 0;
        for (int var4 = 0; var4 < class85.field1400; var4++) {
            class203.field3435[var4] = null;
        }
        class85.field1400 = 0;
        for (int var5 = 0; var5 < class81.field1363.length; var5++) {
            class81.field1363[var5] = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILja;Z)V", line = 179)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        if (arg0 == 0) {
            this.field5147 = arg1.method485((byte) -2) << 4;
        } else if (arg0 == 1) {
            this.field880 = arg1.method501(0) == 1;
        }
        field5142++;
        if (!arg2) {
            method2068(false, (class75) null);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IZ)V", line = 205)
    public static final void method2070(int arg0, boolean arg1) {
        if (arg1) {
            class121.field2045 = 1000 / arg0;
            field5149++;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)[[I", line = 220)
    public final int[][] method66(int arg0, int arg1) {
        int[][] var3 = this.field882.method874(false, arg0);
        int var4 = 111 % ((arg1 - 76) / 42);
        field5151++;
        if (this.field882.field1935) {
            int[] var5 = this.method391(1, 0, arg0);
            int[] var6 = this.method391(2, 0, arg0);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class269.field4644; var10++) {
                int var11 = var5[var10] * 255 >> 12 & 0xFF;
                int var12 = var6[var10] * this.field5147 >> 12;
                int var13 = class108.field1798[var11] * var12 >> 12;
                int var14 = (var13 >> 12) + arg0 & class3.field31;
                int var15 = class232.field3916[var11] * var12 >> 12;
                int var16 = class157.field2697 & var10 + (var15 >> 12);
                int[][] var17 = this.method388(97, 0, var14);
                var8[var10] = var17[0][var16];
                var7[var10] = var17[1][var16];
                var9[var10] = var17[2][var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(B)I", line = 278)
    public static final int method2071(byte arg0) {
        field5153++;
        if (class299.field5117 != null) {
            return 2;
        } else if (class279.field4838) {
            return 1;
        } else {
            if (arg0 < 19) {
                method2071((byte) -58);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "(I)V", line = 306)
    public static void method2072(int arg0) {
        field5154 = null;
        field5144 = null;
        field5146 = null;
        field5148 = null;
        field5143 = null;
        if (arg0 != -1) {
            field5141 = (class303) null;
        }
        field5141 = null;
    }

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "(I)V", line = 325)
    public static final void method2073(int arg0) {
        class213.field3623.method1200(false);
        class210.field3591.method1200(false);
        if (arg0 <= 126) {
            field5152 = true;
        }
        field5140++;
    }
}
