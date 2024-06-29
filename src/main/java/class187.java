import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class187 extends class51 {

    @OriginalMember(owner = "client!uf", name = "gb", descriptor = "I")
    public static int field3673 = 0;

    @OriginalMember(owner = "client!uf", name = "kb", descriptor = "Led;")
    public static class43 field3677 = class191.method1219("W-=hlen Sie eine Option", false);

    @OriginalMember(owner = "client!uf", name = "bb", descriptor = "Led;")
    public static class43 field3668 = class191.method1219("Benutzername: ", false);

    @OriginalMember(owner = "client!uf", name = "ab", descriptor = "Led;")
    private static class43 field3667 = class191.method1219("Loading config )2 ", false);

    @OriginalMember(owner = "client!uf", name = "Z", descriptor = "I")
    public static int field3666 = -1;

    @OriginalMember(owner = "client!uf", name = "fb", descriptor = "Led;")
    public static class43 field3672 = field3667;

    @OriginalMember(owner = "client!uf", name = "cb", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!uf", name = "db", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!uf", name = "eb", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!uf", name = "hb", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!uf", name = "ib", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!uf", name = "mb", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!uf", name = "nb", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!uf", name = "ob", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!uf", name = "lb", descriptor = "J")
    public static long field3678;

    @OriginalMember(owner = "client!uf", name = "jb", descriptor = "Lgd;")
    public static class60 field3676;

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class187() {
        super(3, false);
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(III)I")
    public static final int method1195(int arg0, int arg1, int arg2) {
        int var3 = 121 / ((arg2 - -15) / 57);
        ++field3679;
        if (arg1 == -1) {
            return 12345678;
        } else {
            int var4 = (127 & arg1) * arg0 >> 7;
            if (~var4 > -3) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (65408 & arg1) + var4;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)[[I")
    public final int[][] method99(int arg0, byte arg1) {
        if (arg1 != -94) {
            field3666 = -28;
        }
        int[][] var3 = super.field1027.method1087(arg0, -2);
        ++field3681;
        if (super.field1027.field3428) {
            int[] var4 = this.method314(2, (byte) -98, arg0);
            int[][] var5 = this.method306(arg1 + 94, arg0, 0);
            int[][] var6 = this.method306(0, arg0, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var5[0];
            int[] var10 = var5[1];
            int[] var11 = var3[2];
            int[] var12 = var5[2];
            int[] var13 = var6[1];
            int[] var14 = var6[0];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class122.field2442; ++var16) {
                int var17 = var4[var16];
                if (var17 != 4096) {
                    if (var17 == 0) {
                        var7[var16] = var14[var16];
                        var8[var16] = var13[var16];
                        var11[var16] = var15[var16];
                    } else {
                        int var18 = -var17 + 4096;
                        var7[var16] = var9[var16] * var17 - -(var14[var16] * var18) >> 12;
                        var8[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var11[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    }
                } else {
                    var7[var16] = var9[var16];
                    var8[var16] = var10[var16];
                    var11[var16] = var12[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)V")
    public static void method1196(int arg0) {
        field3676 = null;
        if (arg0 != 4096) {
            method1197(17);
        }
        field3672 = null;
        field3667 = null;
        field3677 = null;
        field3668 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        if (arg0 != 16) {
            field3672 = null;
        }
        ++field3674;
        int[] var3 = super.field1025.method39(arg1, (byte) 39);
        if (super.field1025.field154) {
            int[] var4 = this.method314(0, (byte) -43, arg1);
            int[] var5 = this.method314(1, (byte) -69, arg1);
            int[] var6 = this.method314(2, (byte) -41, arg1);
            for (int var7 = 0; class122.field2442 > var7; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (~var8 == -1) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        ++field3670;
        if (~arg2 == -1) {
            super.field1029 = ~arg0.method538((byte) -100) == -2;
        }
        if (arg1 != 0) {
            field3677 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)V")
    public static final void method1197(int arg0) {
        if (arg0 != 1) {
            field3677 = null;
        }
        ++field3680;
        class186.field3655.method1108((byte) -90);
    }
}
