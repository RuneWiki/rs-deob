import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pg")
public abstract class class146 {

    @OriginalMember(owner = "pg", name = "d", descriptor = "Llf;")
    public static class109 field2817 = class35.method275("l", 2);

    @OriginalMember(owner = "pg", name = "e", descriptor = "Llf;")
    public static class109 field2818 = class35.method275(")3runescape)3com", 2);

    @OriginalMember(owner = "pg", name = "j", descriptor = "[I")
    public static int[] field2823 = new int[500];

    @OriginalMember(owner = "pg", name = "i", descriptor = "I")
    public static int field2822 = 0;

    @OriginalMember(owner = "pg", name = "b", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "pg", name = "c", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "pg", name = "f", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "pg", name = "g", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "pg", name = "h", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "pg", name = "k", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "pg", name = "a", descriptor = "[Lkf;")
    public static class100[] field2814;

    @OriginalMember(owner = "pg", name = "a", descriptor = "(Z)V")
    public static final void method1020(boolean arg0) {
        field2816++;
        class181.field3420 = arg0;
        class194.field3714 = true;
    }

    @OriginalMember(owner = "pg", name = "a", descriptor = "(I)I")
    public static final int method1021(int arg0) {
        field2820++;
        if (arg0 != -1) {
            field2818 = null;
        }
        return class67.field1303++;
    }

    @OriginalMember(owner = "pg", name = "a", descriptor = "(B[B)V")
    public abstract void method1022(byte arg0, byte[] arg1);

    @OriginalMember(owner = "pg", name = "a", descriptor = "(B)V")
    public static void method1023(byte arg0) {
        field2814 = null;
        field2823 = null;
        field2817 = null;
        field2818 = null;
        if (arg0 != -117) {
            field2814 = null;
        }
    }

    @OriginalMember(owner = "pg", name = "a", descriptor = "(ZI)V")
    public static final void method1024(boolean arg0, int arg1) {
        field2819++;
        class106 var2 = (class106) class76.field1466.method337((long) arg1, (byte) -109);
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        if (!arg0) {
            method1023((byte) -61);
        }
        while (var3 < var2.field2103.length) {
            var2.field2103[var3] = -1;
            var2.field2096[var3] = 0;
            var3++;
        }
    }

    @OriginalMember(owner = "pg", name = "a", descriptor = "(IZIBILbi;)V")
    public static final void method1025(int arg0, boolean arg1, int arg2, byte arg3, int arg4, class20 arg5) {
        field2824++;
        if (class92.field1890 >= 50 || (arg5.field464 == null || arg5.field464.length <= arg4)) {
            return;
        }
        int var6 = arg5.field464[arg4];
        if (var6 == 0) {
            return;
        }
        int var7 = var6 >> 4 & 0x7;
        int var8 = var6 >> 8;
        int var9 = var6 & 0xF;
        if (var9 == 0) {
            if (arg1) {
                class8.method36(var7, var8, 0, 0);
            }
        } else if (class170.field3196 != 0) {
            int var10 = (arg2 - 64) / 128;
            int var11 = (arg0 - 64) / 128;
            class72.field1396[class92.field1890] = var8;
            class164.field3094[class92.field1890] = var7;
            class149.field2873[class92.field1890] = 0;
            class132.field2545[class92.field1890] = null;
            class31.field740[class92.field1890] = (var11 << 8) + (var10 << 16) + var9;
            class92.field1890++;
            if (arg3 >= -23) {
                field2823 = null;
            }
        }
    }

    @OriginalMember(owner = "pg", name = "b", descriptor = "(B)[B")
    public abstract byte[] method1026(byte arg0);
}
