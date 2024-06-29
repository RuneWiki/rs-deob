import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class50 extends class60 {

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "Z")
    public boolean field915 = false;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "I")
    private int field913 = -32768;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
    private int field910 = 0;

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
    private int field921 = -1;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    private int field907 = 0;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "I")
    public int field917;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "I")
    public int field914;

    @OriginalMember(owner = "client!fk", name = "G", descriptor = "I")
    public int field923;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public int field904;

    @OriginalMember(owner = "client!fk", name = "C", descriptor = "I")
    public int field920;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "I")
    private int field916;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "Lel;")
    private class77 field905;

    @OriginalMember(owner = "client!fk", name = "F", descriptor = "Lic;")
    public static class160 field922 = new class160(4);

    @OriginalMember(owner = "client!fk", name = "J", descriptor = "Ljava/lang/String;")
    public static String field926 = "M";

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!fk", name = "H", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!fk", name = "I", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!fk", name = "K", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "Lpj;")
    private class98 field908;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(IIIII)V")
    public final void method100(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field909++;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "()I")
    public final int method99() {
        field919++;
        return this.field913;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)V")
    public static final void method422(int arg0, int arg1) {
        field911++;
        if (arg1 > -94) {
            method422(1, -4);
        }
        class23 var2 = class91.method694(arg0, 3, 122);
        var2.method183(-107);
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
    public static void method423(int arg0) {
        if (arg0 != 179) {
            field922 = null;
        }
        field926 = null;
        field922 = null;
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V")
    public static final void method424(int arg0) {
        field918++;
        if (arg0 != -65536) {
            field926 = null;
        }
        class61.field1037.method1156(-92);
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)Lpb;")
    private final class168 method425(int arg0) {
        field927++;
        class281 var2 = class35.method298(this.field916, false);
        class168 var3;
        if (this.field915) {
            var3 = var2.method1888((byte) 36, 0, -1, -1);
        } else {
            var3 = var2.method1888((byte) 36, this.field907, this.field910, this.field921);
        }
        if (var3 == null) {
            return null;
        } else {
            if (arg0 > -48) {
                method424(-33);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)V")
    public final void method426(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method426(126, 110);
        }
        field924++;
        if (this.field915) {
            return;
        }
        this.field907 += arg1;
        while (this.field907 > this.field905.field1282[this.field910]) {
            this.field907 -= this.field905.field1282[this.field910];
            this.field910++;
            if (this.field905.field1256.length <= this.field910) {
                this.field915 = true;
                break;
            }
        }
        if (!this.field915) {
            class124.method916(this.field914, this.field920, 477628496, false, this.field905, this.field910);
        }
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(I)V")
    public static final void method427(int arg0) {
        for (int var1 = 0; var1 < class254.field4039; var1++) {
            int var2 = class200.field3251[var1];
            class139 var3 = class3.field45[var2];
            int var4 = class143.field2360.method1012(4);
            if ((var4 & 0x80) != 0) {
                var4 += class143.field2360.method1012(4) << 8;
            }
            if ((var4 & 0x10) != 0) {
                int var5 = class143.field2360.method976((byte) -76);
                int var6 = class143.field2360.method1015((byte) -119);
                var3.method1225((byte) -116, var5, class207.field3336, var6);
                var3.field2842 = class207.field3336 + 300;
                var3.field2904 = class143.field2360.method1012(4);
            }
            if ((var4 & 0x4) != 0) {
                if (var3.field2321.method1197(0)) {
                    class6.method32(var3, false);
                }
                var3.method1038(-15565, class128.method932(105, class143.field2360.method1025((byte) 111)));
                var3.method1229((byte) 8, var3.field2321.field2682);
                var3.field2835 = var3.field2321.field2702;
                var3.field2891 = var3.field2321.field2724;
                if (var3.field2321.method1197(0)) {
                    class255.method1707((class248) null, var3, (class213) null, (byte) 79, class92.field1448, var3.field2844[0], var3.field2813[0], 0);
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field2840 = class143.field2360.method1010(-124);
                var3.field2864 = 100;
            }
            if ((var4 & 0x200) != 0) {
                int var7 = class143.field2360.method1003(-128);
                int[] var8 = new int[var7];
                int[] var9 = new int[var7];
                int[] var10 = new int[var7];
                for (int var11 = 0; var11 < var7; var11++) {
                    int var12 = class143.field2360.method1011((byte) 73);
                    if (var12 == 65535) {
                        var12 = -1;
                    }
                    var8[var11] = var12;
                    var10[var11] = class143.field2360.method1003(-128);
                    var9[var11] = class143.field2360.method1025((byte) 76);
                }
                class181.method1274(var8, var3, var9, var10, (byte) -119);
            }
            if ((var4 & 0x20) != 0) {
                int var13 = class143.field2360.method1025((byte) 126);
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = class143.field2360.method976((byte) -81);
                class210.method1398(-122, var14, var13, var3);
            }
            if ((var4 & 0x1) != 0) {
                int var15 = class143.field2360.method1015((byte) -69);
                int var16 = class143.field2360.method1012(4);
                var3.method1225((byte) -116, var15, class207.field3336, var16);
            }
            if ((var4 & 0x100) != 0) {
                var3.field2829 = class143.field2360.method988(744911448);
                var3.field2815 = class143.field2360.method996(65280);
            }
            if ((var4 & 0x2) != 0) {
                int var17 = class143.field2360.method996(65280);
                int var18 = class143.field2360.method980(0);
                if (var17 == 65535) {
                    var17 = -1;
                }
                boolean var19 = true;
                if (var17 != -1 && var3.field2817 != -1 && class28.method246(65, class35.method298(var17, false).field4455).field1257 < class28.method246(-111, class35.method298(var3.field2817, false).field4455).field1257) {
                    var19 = false;
                }
                if (var19) {
                    var3.field2856 = (var18 & 0xFFFF) + class207.field3336;
                    var3.field2817 = var17;
                    var3.field2812 = 0;
                    var3.field2823 = 1;
                    if (class207.field3336 < var3.field2856) {
                        var3.field2812 = -1;
                    }
                    var3.field2897 = 0;
                    var3.field2807 = var18 >> 16;
                    if (var3.field2817 != -1 && class207.field3336 == var3.field2856) {
                        int var20 = class35.method298(var3.field2817, false).field4455;
                        if (var20 != -1) {
                            class77 var21 = class28.method246(-89, var20);
                            if (var21 != null && var21.field1256 != null) {
                                class124.method916(var3.field2887, var3.field2849, 477628496, false, var21, 0);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field2832 = class143.field2360.method988(744911448);
                if (var3.field2832 == 65535) {
                    var3.field2832 = -1;
                }
            }
        }
        if (arg0 >= 7) {
            field906++;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIIIIJILpj;)V")
    public final void method98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class98 arg10) {
        field925++;
        class168 var13 = this.method425(-55);
        if (var13 != null) {
            var13.method98(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field908);
            this.field913 = var13.method99();
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(IIIIIII)V")
    public class50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field917 = arg1;
        this.field914 = arg3;
        this.field923 = arg4;
        this.field904 = arg5 + arg6;
        this.field920 = arg2;
        this.field916 = arg0;
        int var8 = class35.method298(this.field916, false).field4455;
        if (var8 == -1) {
            this.field915 = true;
        } else {
            this.field915 = false;
            this.field905 = class28.method246(79, var8);
        }
        if (this.field904 == arg6) {
            class124.method916(this.field914, this.field920, 477628496, false, this.field905, this.field910);
        }
    }
}
