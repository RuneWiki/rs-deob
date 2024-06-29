import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class370 {

    @OriginalMember(owner = "client!we", name = "h", descriptor = "Z")
    public boolean field4807 = false;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "[I")
    public static int[] field4801 = new int[25];

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field4812 = 2;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "[I")
    public static int[] field4814 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field4804 = 0;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public int field4803;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public int field4805;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Lni;")
    public class476 field4810;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 5)
    public static void method2019(int arg0) {
        field4801 = null;
        if (arg0 == 0) {
            field4814 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZIILoa;)Lxa;", line = 16)
    public final class458 method2020(boolean arg0, int arg1, int arg2, class635 arg3) {
        field4809++;
        long var5 = (long) (arg3.field8985 << 19 | (arg0 ? 262144 : 0) | arg1 << 16 | this.field4803);
        class458 var7 = (class458) this.field4810.field6936.method3690((byte) -99, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field4810.field6931.method1711(this.field4803, arg2 + 1)) {
            class563 var8 = class563.method3185(this.field4810.field6931, this.field4803, arg2);
            if (var8 != null) {
                var8.field7999 = var8.field8004 = var8.field8003 = var8.field8007 = 0;
                if (arg0) {
                    var8.method3178();
                }
                for (int var9 = 0; var9 < arg1; var9++) {
                    var8.method3182();
                }
            }
            class458 var10 = arg3.method351(var8, true);
            if (var10 != null) {
                this.field4810.field6936.method3683(var10, (byte) -95, var5);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V", line = 58)
    public static final void method2021(int arg0) {
        int var1 = 112 / ((-arg0 - 57) / 55);
        field4813++;
        class397.field5319 = true;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Liaa;B)V", line = 71)
    public final void method2022(class452 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2541(118);
            if (var3 == 0) {
                if (arg1 < 119) {
                    return;
                }
                field4808++;
                return;
            }
            this.method2024(var3, arg0, 125);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)Z", line = 97)
    public final boolean method2023(byte arg0) {
        if (arg0 >= -13) {
            this.method2023((byte) -90);
        }
        field4800++;
        return this.field4810.field6931.method1711(this.field4803, 1);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILiaa;I)V", line = 108)
    private final void method2024(int arg0, class452 arg1, int arg2) {
        int var4 = -65 / ((arg2 - 54) / 57);
        field4811++;
        if (arg0 == 1) {
            this.field4803 = arg1.method2574(-1758460248);
        } else if (arg0 == 2) {
            this.field4805 = arg1.method2524(3);
        } else if (arg0 == 3) {
            this.field4807 = true;
        } else if (arg0 == 4) {
            this.field4803 = -1;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IJ)V", line = 142)
    public static final void method2025(int arg0, long arg1) {
        field4806++;
        if (arg0 != -1 || arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class583.method3280(arg1 - 1L, 62);
            class583.method3280(1L, arg0 ^ 0xFFFFFFC4);
        } else {
            class583.method3280(arg1, 104);
        }
    }
}
