import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class273 extends class183 {

    @OriginalMember(owner = "client!r", name = "Y", descriptor = "Z")
    private boolean field4669 = true;

    @OriginalMember(owner = "client!r", name = "fb", descriptor = "Z")
    private boolean field4676 = true;

    @OriginalMember(owner = "client!r", name = "T", descriptor = "Ljf;")
    private static class229 field4664 = class212.method1457((byte) 73, "Loading title screen )2 ");

    @OriginalMember(owner = "client!r", name = "Z", descriptor = "Ljf;")
    public static class229 field4670 = class212.method1457((byte) 73, "loc");

    @OriginalMember(owner = "client!r", name = "eb", descriptor = "Ljf;")
    public static class229 field4675 = field4664;

    @OriginalMember(owner = "client!r", name = "U", descriptor = "Lni;")
    public static class24 field4665 = new class24(20);

    @OriginalMember(owner = "client!r", name = "gb", descriptor = "Z")
    public static boolean field4677 = false;

    @OriginalMember(owner = "client!r", name = "hb", descriptor = "I")
    public static int field4678 = -1;

    @OriginalMember(owner = "client!r", name = "V", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!r", name = "W", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!r", name = "X", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!r", name = "ab", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!r", name = "bb", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!r", name = "db", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!r", name = "ib", descriptor = "Lek;")
    public static class185 field4679;

    @OriginalMember(owner = "client!r", name = "cb", descriptor = "Lnf;")
    public static class67 field4673;

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V", line = 15)
    public class273() {
        super(1, false);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)I", line = 24)
    public static final int method1914(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4666++;
        if (arg0 >= -105) {
            method1914(85, 4, -39, 63, 22);
        }
        int var5 = 65536 - class227.field3911[arg2 * 1024 / arg1] >> 1;
        return ((65536 - var5) * arg4 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)[[I", line = 45)
    public final int[][] method12(int arg0, int arg1) {
        int var3 = 59 % ((arg0 - 18) / 61);
        field4674++;
        int[][] var4 = this.field3160.method1057(-20449, arg1);
        if (this.field3160.field2689) {
            int[][] var5 = this.method1250(this.field4669 ? class252.field4405 - arg1 : arg1, 0, (byte) 53);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            if (this.field4676) {
                for (int var12 = 0; var12 < class22.field393; var12++) {
                    var9[var12] = var6[class52.field913 - var12];
                    var10[var12] = var7[class52.field913 - var12];
                    var11[var12] = var8[class52.field913 - var12];
                }
            } else {
                for (int var13 = 0; var13 < class22.field393; var13++) {
                    var9[var13] = var6[var13];
                    var10[var13] = var7[var13];
                    var11[var13] = var8[var13];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(II)[I", line = 107)
    public final int[] method10(int arg0, int arg1) {
        field4668++;
        if (arg1 != -1) {
            field4679 = (class185) null;
        }
        int[] var3 = this.field3161.method664(arg0, 0);
        if (this.field3161.field1736) {
            int[] var4 = this.method1253(0, this.field4669 ? class252.field4405 - arg0 : arg0, 99);
            if (this.field4676) {
                for (int var5 = 0; var5 < class22.field393; var5++) {
                    var3[var5] = var4[class52.field913 - var5];
                }
            } else {
                class36.method320(var4, 0, var3, 0, class22.field393);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(Z)V", line = 151)
    public static void method1915(boolean arg0) {
        if (!arg0) {
            field4675 = (class229) null;
        }
        field4664 = null;
        field4679 = null;
        field4670 = null;
        field4673 = null;
        field4675 = null;
        field4665 = null;
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V", line = 166)
    public static final void method1916(int arg0) {
        if (arg0 == -16294) {
            field4667++;
            class15.field228 = null;
            class99.method674();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILkh;I)V", line = 178)
    public final void method14(int arg0, class14 arg1, int arg2) {
        field4671++;
        if (arg0 > -43) {
            this.method12(122, -95);
        }
        if (arg2 == 0) {
            this.field4676 = arg1.method93(false) == 1;
        } else if (arg2 == 1) {
            this.field4669 = arg1.method93(false) == 1;
        } else if (arg2 == 2) {
            this.field3166 = arg1.method93(false) == 1;
        }
    }
}
