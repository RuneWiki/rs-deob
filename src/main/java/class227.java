import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class227 extends class114 {

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    private int field3821 = -32768;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "[I")
    public static int[] field3816 = new int[128];

    @OriginalMember(owner = "client!j", name = "u", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3829 = new CRC32();

    @OriginalMember(owner = "client!j", name = "v", descriptor = "Z")
    public static boolean field3830 = false;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "Lce;")
    public static class126 field3831 = class206.method1445(-7923, ":assist:");

    @OriginalMember(owner = "client!j", name = "x", descriptor = "Lvc;")
    public static class129 field3832 = new class129();

    @OriginalMember(owner = "client!j", name = "y", descriptor = "Lce;")
    public static class126 field3833 = class206.method1445(-7923, ")3");

    @OriginalMember(owner = "client!j", name = "A", descriptor = "Lce;")
    public static class126 field3835 = null;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "Loh;")
    public static class169 field3834 = new class169(5000);

    @OriginalMember(owner = "client!j", name = "C", descriptor = "Lce;")
    public static class126 field3837 = class206.method1445(-7923, "Vous ne pouvez pas ajouter votre nom -9 votre liste d(Wamis)3");

    @OriginalMember(owner = "client!j", name = "D", descriptor = "Lce;")
    public static class126 field3838 = class206.method1445(-7923, ")2");

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "I")
    public int field3824;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    public int field3826;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()I", line = 6)
    public final int method225() {
        field3818++;
        return this.field3821;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZI)V", line = 14)
    public static final void method1544(boolean arg0, int arg1) {
        field3817++;
        if ((class286.field4744.field2461 >> 7) == class27.field378 && class286.field4744.field2487 >> 7 == class165.field2953) {
            class27.field378 = 0;
        }
        int var2 = class239.field4036;
        if (arg0) {
            var2 = 1;
        }
        if (arg1 <= 5) {
            return;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            long var4;
            class301 var6;
            if (arg0) {
                var4 = 8791798054912L;
                var6 = class286.field4744;
            } else {
                var6 = class85.field1352[class166.field2958[var3]];
                var4 = (long) class166.field2958[var3] << 32;
            }
            if (var6 != null && var6.method626(32)) {
                var6.field5010 = false;
                int var7 = var6.field2487 >> 7;
                int var8 = var6.field2461 >> 7;
                if ((class94.field1474 && class239.field4036 > 200 || class239.field4036 > 50) && !arg0 && var6.field2501 == var6.field2441) {
                    var6.field5010 = true;
                }
                if (var8 >= 0 && var8 < 104 && var7 >= 0 && var7 < 104) {
                    if (var6.field4980 == null || var6.field4998 > class249.field4174 || class249.field4174 >= var6.field4994) {
                        if (var6.method1013(false) == 1 && (var6.field2461 & 0x7F) == 64 && (var6.field2487 & 0x7F) == 64) {
                            if (class168.field2979[var8][var7] == class167.field2970) {
                                continue;
                            }
                            class168.field2979[var8][var7] = class167.field2970;
                        }
                        var6.field2440 = class174.method1265(var6.field2487, 8100, class131.field2250, var6.field2461);
                        class199.method1411(class131.field2250, var6.field2461, var6.field2487, var6.field2440, var6.method1013(false) * 64 + 60 - 64, var6, var6.field2483, var4, var6.field2505);
                    } else {
                        var6.field5010 = false;
                        var6.field2440 = class174.method1265(var6.field2487, 8100, class131.field2250, var6.field2461);
                        class309.method2110(class131.field2250, var6.field2461, var6.field2487, var6.field2440, var6, var6.field2483, var4, var6.field5012, var6.field5014, var6.field4996, var6.field5011);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V", line = 104)
    public static final void method1545(byte arg0) {
        field3823++;
        if (arg0 == 93) {
            class110.field1724.method1178(-78);
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V", line = 115)
    public static final void method1546(int arg0) {
        if (arg0 > -122) {
            field3832 = (class129) null;
        }
        if (class280.field4662 == 10 && class56.field846) {
            class280.method1872(-73, 28);
        }
        if (class280.field4662 == 30) {
            class280.method1872(-61, 25);
        }
        field3827++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([Lce;II[SZ)V", line = 142)
    public static final void method1547(class126[] arg0, int arg1, int arg2, short[] arg3, boolean arg4) {
        if (arg2 < arg1) {
            int var5 = arg2;
            int var6 = (arg1 + arg2) / 2;
            class126 var7 = arg0[var6];
            arg0[var6] = arg0[arg1];
            arg0[arg1] = var7;
            short var8 = arg3[var6];
            arg3[var6] = arg3[arg1];
            arg3[arg1] = var8;
            for (int var9 = arg2; var9 < arg1; var9++) {
                if (var7 == null || arg0[var9] != null && (var9 & 0x1) > arg0[var9].method882((byte) 74, var7)) {
                    class126 var10 = arg0[var9];
                    arg0[var9] = arg0[var5];
                    arg0[var5] = var10;
                    short var11 = arg3[var9];
                    arg3[var9] = arg3[var5];
                    arg3[var5++] = var11;
                }
            }
            arg0[arg1] = arg0[var5];
            arg0[var5] = var7;
            arg3[arg1] = arg3[var5];
            arg3[var5] = var8;
            method1547(arg0, var5 - 1, arg2, arg3, arg4);
            method1547(arg0, arg1, var5 + 1, arg3, true);
        }
        field3820++;
        if (!arg4) {
            field3836 = 114;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIIIJILqj;)V", line = 200)
    public final void method241(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class211 arg10) {
        field3822++;
        class196 var13 = class68.method498(123, this.field3826).method992((class294) null, this.field3824, 0, 0);
        if (var13 != null) {
            var13.method241(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field3821 = var13.method225();
        }
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(I)V", line = 219)
    public static final void method1548(int arg0) {
        if (arg0 != -15194) {
            method1547((class126[]) null, -118, -85, (short[]) null, false);
        }
        class209.field3571.method1185(1);
        class223.field3756.method1185(1);
        field3825++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V", line = 232)
    public final void method407(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3828++;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(III)V", line = 244)
    public static final void method1549(int arg0, int arg1, int arg2) {
        field3819++;
        class176 var3 = class78.method557(arg2, (byte) -101);
        int var4 = var3.field3105;
        int var5 = var3.field3108;
        int var6 = var3.field3102;
        int var7 = class266.field4498[var6 - var5];
        if (arg0 < 0 || var7 < arg0) {
            arg0 = 0;
        }
        if (arg1 != -1) {
            field3816 = (int[]) null;
        }
        int var8 = var7 << var5;
        class103.method702(arg0 << var5 & var8 | class254.field4275[var4] & ~var8, var4, -16598);
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(I)V", line = 271)
    public static void method1550(int arg0) {
        field3832 = null;
        field3816 = null;
        field3831 = null;
        field3834 = null;
        int var1 = 49 % ((arg0 + 2) / 59);
        field3833 = null;
        field3838 = null;
        field3837 = null;
        field3829 = null;
        field3835 = null;
    }
}
