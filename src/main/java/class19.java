import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class19 extends class190 {

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "[I")
    public static int[] field233 = new int[2];

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
    public static int field232 = 0;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "Lqe;")
    public static class168 field236 = null;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "Lqe;")
    public static class168 field240 = class66.method448("Stufe)2", -122);

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
    public int field230;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "Lt;")
    public class206 field229;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "Lrd;")
    public class207 field239;

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "[B")
    public byte[] field237;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "[I")
    public static int[] field234;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V")
    public static void method99(byte arg0) {
        field236 = null;
        field240 = null;
        field233 = null;
        field234 = null;
        if (arg0 != -69) {
            field232 = 126;
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)V")
    public static final void method100(int arg0, int arg1) {
        field238++;
        class251.method1654(false);
        class146.method985(0);
        int var2 = class208.method1349(-114, arg0).field2112;
        if (var2 == 0) {
            return;
        }
        int var3 = class92.field1441[arg0];
        if (var2 == 5) {
            class242.field4135 = var3;
        }
        if (var2 == 6) {
            class42.field554 = var3;
        }
        if (arg1 < 119) {
            field233 = null;
        }
        if (var2 == 9) {
            class56.field770 = var3;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II[Lb;I)V")
    public static final void method101(int arg0, int arg1, class171[] arg2, int arg3) {
        if (arg1 != 1) {
            return;
        }
        if (arg0 < arg3) {
            int var4 = arg0 - 1;
            int var5 = arg3 + 1;
            int var6 = (arg0 + arg3) / 2;
            class171 var7 = arg2[var6];
            arg2[var6] = arg2[arg0];
            arg2[arg0] = var7;
            while (var4 < var5) {
                boolean var8 = true;
                do {
                    var5--;
                    for (int var9 = 0; var9 < 4; var9++) {
                        int var10;
                        int var11;
                        if (class148.field2581[var9] == 2) {
                            var10 = arg2[var5].field2976;
                            var11 = var7.field2976;
                        } else if (class148.field2581[var9] == 1) {
                            var10 = arg2[var5].field2981;
                            var11 = var7.field2981;
                            if (var10 == -1 && class9.field106[var9] == 1) {
                                var10 = 2001;
                            }
                            if (var11 == -1 && class9.field106[var9] == 1) {
                                var11 = 2001;
                            }
                        } else if (class148.field2581[var9] == 3) {
                            var11 = var7.field2972 ? 1 : 0;
                            var10 = arg2[var5].field2972 ? 1 : 0;
                        } else {
                            var10 = arg2[var5].field2979;
                            var11 = var7.field2979;
                        }
                        if (var10 != var11) {
                            if ((class9.field106[var9] != 1 || var10 <= var11) && (class9.field106[var9] != 0 || var11 <= var10)) {
                                var8 = false;
                            }
                            break;
                        }
                        if (var9 == 3) {
                            var8 = false;
                        }
                    }
                } while (var8);
                boolean var12 = true;
                do {
                    var4++;
                    for (int var13 = 0; var13 < 4; var13++) {
                        int var14;
                        int var15;
                        if (class148.field2581[var13] == 2) {
                            var14 = var7.field2976;
                            var15 = arg2[var4].field2976;
                        } else if (class148.field2581[var13] == 1) {
                            var14 = var7.field2981;
                            if (var14 == -1 && class9.field106[var13] == 1) {
                                var14 = 2001;
                            }
                            var15 = arg2[var4].field2981;
                            if (var15 == -1 && class9.field106[var13] == 1) {
                                var15 = 2001;
                            }
                        } else if (class148.field2581[var13] == 3) {
                            var14 = var7.field2972 ? 1 : 0;
                            var15 = arg2[var4].field2972 ? 1 : 0;
                        } else {
                            var15 = arg2[var4].field2979;
                            var14 = var7.field2979;
                        }
                        if (var14 != var15) {
                            if ((class9.field106[var13] != 1 || var15 >= var14) && (class9.field106[var13] != 0 || var15 <= var14)) {
                                var12 = false;
                            }
                            break;
                        }
                        if (var13 == 3) {
                            var12 = false;
                        }
                    }
                } while (var12);
                if (var5 > var4) {
                    class171 var16 = arg2[var4];
                    arg2[var4] = arg2[var5];
                    arg2[var5] = var16;
                }
            }
            method101(arg0, 1, arg2, var5);
            method101(var5 + 1, arg1, arg2, arg3);
        }
        field235++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lqe;B)I")
    public static final int method102(class168 arg0, byte arg1) {
        if (arg1 == 1) {
            field231++;
            return arg0.method1109((byte) 115) + 1;
        } else {
            return -37;
        }
    }
}
