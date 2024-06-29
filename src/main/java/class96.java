import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class96 extends class125 {

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
    public static int field1928 = 0;

    @OriginalMember(owner = "client!jh", name = "E", descriptor = "Ljd;")
    public static class92 field1930 = class202.method1325((byte) 90, "Bitte versuchen Sie)1");

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!jh", name = "F", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!jh", name = "I", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!jh", name = "J", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "Ltg;")
    public class186 field1926;

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "La;")
    public static class1 field1929;

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "[I")
    public static int[] field1933;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZ)I")
    public static final int method667(int arg0, boolean arg1) {
        field1927++;
        if (arg1) {
            method668(false);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(Z)V")
    public static void method668(boolean arg0) {
        field1929 = null;
        field1933 = null;
        if (!arg0) {
            field1930 = null;
        }
        field1930 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I[Lda;[III[I)V")
    public static final void method669(int arg0, class32[] arg1, int[] arg2, int arg3, int arg4, int[] arg5) {
        field1935++;
        if (arg0 < arg4) {
            int var6 = (arg0 + arg4) / 2;
            int var7 = arg0 - 1;
            int var8 = arg4 + 1;
            class32 var9 = arg1[var6];
            arg1[var6] = arg1[arg0];
            arg1[arg0] = var9;
            while (var7 < var8) {
                boolean var10 = true;
                do {
                    var8--;
                    for (int var11 = 0; var11 < 4; var11++) {
                        int var12;
                        int var13;
                        if (arg2[var11] == 2) {
                            var12 = arg1[var8].field722;
                            var13 = var9.field722;
                        } else if (arg2[var11] == 1) {
                            var13 = var9.field726;
                            var12 = arg1[var8].field726;
                            if (var13 == -1 && arg5[var11] == 1) {
                                var13 = 2001;
                            }
                            if (var12 == -1 && arg5[var11] == 1) {
                                var12 = 2001;
                            }
                        } else if (arg2[var11] == 3) {
                            var13 = var9.field720 ? 1 : 0;
                            var12 = arg1[var8].field720 ? 1 : 0;
                        } else {
                            var13 = var9.field730;
                            var12 = arg1[var8].field730;
                        }
                        if (var12 != var13) {
                            if ((arg5[var11] != 1 || var13 >= var12) && (arg5[var11] != 0 || var12 >= var13)) {
                                var10 = false;
                            }
                            break;
                        }
                        if (var11 == 3) {
                            var10 = false;
                        }
                    }
                } while (var10);
                boolean var14 = true;
                do {
                    var7++;
                    for (int var15 = 0; var15 < 4; var15++) {
                        int var16;
                        int var17;
                        if (arg2[var15] == 2) {
                            var16 = arg1[var7].field722;
                            var17 = var9.field722;
                        } else if (arg2[var15] == 1) {
                            var17 = var9.field726;
                            if (var17 == -1 && arg5[var15] == 1) {
                                var17 = 2001;
                            }
                            var16 = arg1[var7].field726;
                            if (var16 == -1 && arg5[var15] == 1) {
                                var16 = 2001;
                            }
                        } else if (arg2[var15] == 3) {
                            var16 = arg1[var7].field720 ? 1 : 0;
                            var17 = var9.field720 ? 1 : 0;
                        } else {
                            var16 = arg1[var7].field730;
                            var17 = var9.field730;
                        }
                        if (var16 != var17) {
                            if ((arg5[var15] != 1 || var17 <= var16) && (arg5[var15] != 0 || var17 >= var16)) {
                                var14 = false;
                            }
                            break;
                        }
                        if (var15 == 3) {
                            var14 = false;
                        }
                    }
                } while (var14);
                if (var8 > var7) {
                    class32 var18 = arg1[var7];
                    arg1[var7] = arg1[var8];
                    arg1[var8] = var18;
                }
            }
            method669(arg0, arg1, arg2, arg3, var8, arg5);
            method669(var8 + 1, arg1, arg2, -2, arg4, arg5);
        }
        if (arg3 != -2) {
            method669(65, null, null, -125, 69, null);
        }
    }
}
