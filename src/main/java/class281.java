import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class281 extends class152 {

    @OriginalMember(owner = "client!pl", name = "cb", descriptor = "I")
    private int field4675 = 1024;

    @OriginalMember(owner = "client!pl", name = "eb", descriptor = "I")
    private int field4677 = 3072;

    @OriginalMember(owner = "client!pl", name = "gb", descriptor = "I")
    private int field4679 = 2048;

    @OriginalMember(owner = "client!pl", name = "U", descriptor = "Z")
    public static boolean field4667 = false;

    @OriginalMember(owner = "client!pl", name = "hb", descriptor = "I")
    public static int field4680 = 0;

    @OriginalMember(owner = "client!pl", name = "R", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!pl", name = "S", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!pl", name = "T", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!pl", name = "V", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!pl", name = "X", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!pl", name = "Y", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!pl", name = "Z", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!pl", name = "db", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!pl", name = "fb", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!pl", name = "ib", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!pl", name = "jb", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!pl", name = "ab", descriptor = "Lcc;")
    public static class313 field4673;

    @OriginalMember(owner = "client!pl", name = "bb", descriptor = "[Lej;")
    public static class45[] field4674;

    @OriginalMember(owner = "client!pl", name = "W", descriptor = "[Lem;")
    public static class88[] field4669;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "(I)Lmd;", line = 11)
    public static final class229 method1878(int arg0) {
        if (arg0 != -23429) {
            method1883((byte) -13);
        }
        field4676++;
        return class134.field2320;
    }

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "(I)V", line = 22)
    public static void method1879(int arg0) {
        field4669 = null;
        if (arg0 != 1024) {
            field4669 = (class88[]) null;
        }
        field4673 = null;
        field4674 = null;
    }

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "(II)V", line = 35)
    public static final void method1880(int arg0, int arg1) {
        field4682++;
        if (arg1 != 0) {
            method1882((byte) -91, (class126) null);
        }
        if (class224.field3787 == arg0 && arg0 != 0) {
            class215 var2 = class24.field351[arg0];
            var2.method21(class206.field3527);
        }
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(B)V", line = 56)
    public final void method2(byte arg0) {
        field4666++;
        int var2 = -54 % ((2 - arg0) / 37);
        this.field4679 = this.field4677 - this.field4675;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IILbb;)V", line = 92)
    public final void method5(int arg0, int arg1, class134 arg2) {
        if (arg1 == 0) {
            this.field4675 = arg2.method942(true);
        } else if (arg1 == 1) {
            this.field4677 = arg2.method942(true);
        } else if (arg1 == 2) {
            this.field2781 = arg2.method948(arg0 ^ 0xFFFFFF8C) == 1;
        }
        if (arg0 != 8) {
            field4674 = (class45[]) null;
        }
        field4664++;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BIIII)V", line = 126)
    public static final void method1881(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class103.field1645.field2299 = 0;
        field4671++;
        class103.field1645.method933(-3, 69);
        if (arg0 >= -2) {
            return;
        }
        class103.field1645.method933(-3, arg2);
        class103.field1645.method933(-3, arg4);
        class103.field1645.method959(-97, arg3);
        class103.field1645.method959(53, arg1);
        class287.field4773 = -3;
        class209.field3596 = 0;
        class224.field3788 = 0;
        class267.field4522 = 1;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BLce;)I", line = 150)
    public static final int method1882(byte arg0, class126 arg1) {
        if (arg0 == -100) {
            field4668++;
            return arg1.method878((byte) -102) + 1;
        } else {
            return 121;
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V", line = 160)
    public class281() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(II)[[I", line = 164)
    public final int[][] method26(int arg0, int arg1) {
        field4670++;
        if (arg0 != 0) {
            method1883((byte) 0);
        }
        int[][] var3 = this.field2775.method319(110, arg1);
        if (this.field2775.field775) {
            int[][] var4 = this.method1133(arg1, 0, true);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var3[1];
            int[] var8 = var4[0];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class244.field4133; var11++) {
                var9[var11] = this.field4675 + (var8[var11] * this.field4679 >> 12);
                var7[var11] = (var5[var11] * this.field4679 >> 12) + this.field4675;
                var10[var11] = this.field4675 + (var6[var11] * this.field4679 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "(B)V", line = 212)
    public static final void method1883(byte arg0) {
        int var1 = 0;
        int[] var2 = new int[class68.field1118];
        field4681++;
        for (int var3 = 0; var3 < class68.field1118; var3++) {
            class137 var4 = class68.method498(16, var3);
            if (var4.field2438 >= 0 || var4.field2393 >= 0) {
                var2[var1++] = var3;
            }
        }
        if (arg0 >= -60) {
            method1881((byte) 126, -47, -77, 65, -37);
        }
        class241.field4078 = new int[var1];
        for (int var5 = 0; var5 < var1; var5++) {
            class241.field4078[var5] = var2[var5];
        }
    }

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "(II)I", line = 252)
    public static final int method1884(int arg0, int arg1) {
        if (arg0 != -2017723576) {
            field4667 = true;
        }
        int var2 = ((arg1 & 0xAAAAAAAA) >>> 1) + (arg1 & 0x55555555);
        field4672++;
        int var3 = (var2 & 0x33333333) + ((var2 & 0xCCCCCCCE) >>> 2);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZI)[I", line = 278)
    public final int[] method6(boolean arg0, int arg1) {
        int[] var3 = this.field2776.method1799((byte) 107, arg1);
        if (!arg0) {
            return (int[]) null;
        }
        if (this.field2776.field4516) {
            int[] var4 = this.method1132(arg1, 57, 0);
            for (int var5 = 0; var5 < class244.field4133; var5++) {
                var3[var5] = (var4[var5] * this.field4679 >> 12) + this.field4675;
            }
        }
        field4678++;
        return var3;
    }
}
