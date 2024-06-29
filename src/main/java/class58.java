import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class58 extends class27 {

    @OriginalMember(owner = "client!we", name = "Q", descriptor = "I")
    private int field852 = 1365;

    @OriginalMember(owner = "client!we", name = "N", descriptor = "I")
    private int field849 = 0;

    @OriginalMember(owner = "client!we", name = "L", descriptor = "I")
    private int field848 = 0;

    @OriginalMember(owner = "client!we", name = "bb", descriptor = "I")
    private int field863 = 20;

    @OriginalMember(owner = "client!we", name = "cb", descriptor = "Ljava/lang/String;")
    public static String field864 = "Continue";

    @OriginalMember(owner = "client!we", name = "Z", descriptor = "[Ltc;")
    public static class248[] field861 = new class248[14];

    @OriginalMember(owner = "client!we", name = "ab", descriptor = "[I")
    public static int[] field862 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!we", name = "P", descriptor = "Ljava/lang/String;")
    public static String field851 = "wave2:";

    @OriginalMember(owner = "client!we", name = "O", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!we", name = "T", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!we", name = "V", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!we", name = "X", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!we", name = "Y", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!we", name = "S", descriptor = "Lph;")
    public static class361 field854;

    @OriginalMember(owner = "client!we", name = "W", descriptor = "Lph;")
    public static class361 field858;

    @OriginalMember(owner = "client!we", name = "R", descriptor = "Lqc;")
    public static class97 field853;

    @OriginalMember(owner = "client!we", name = "U", descriptor = "[I")
    public static int[] field856;

    @OriginalMember(owner = "client!we", name = "K", descriptor = "[Lin;")
    public static class177[] field847;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(IIIIIIIIII)V", line = 5)
    public static final void method466(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (class355.field5452 <= arg3 && class348.field5378 >= arg3 && class355.field5452 <= arg1 && class348.field5378 >= arg1 && class355.field5452 <= arg2 && arg2 <= class348.field5378 && arg7 >= class355.field5452 && arg7 <= class348.field5378 && class326.field4901 <= arg8 && arg8 <= class261.field3911 && arg5 >= class326.field4901 && arg5 <= class261.field3911 && class326.field4901 <= arg9 && arg9 <= class261.field3911 && arg4 >= class326.field4901 && arg4 <= class261.field3911) {
            class27.method167(arg8, arg5, arg4, arg0 ^ 0xFFFFE05D, arg3, arg6, arg7, arg9, arg1, arg2);
        } else {
            class18.method115(arg7, arg3, arg5, arg1, arg2, arg4, arg8, (byte) 64, arg6, arg9);
        }
        if (arg0 == -8181) {
            field857++;
        }
    }

    @OriginalMember(owner = "client!we", name = "g", descriptor = "(I)V", line = 22)
    public static final void method467(int arg0) {
        if (class194.field2819 == 10 && class141.field2031) {
            class250.method1837(28, 40);
        }
        if (class194.field2819 == 30) {
            class250.method1837(25, 40);
        }
        field855++;
        if (arg0 != -16385) {
            method467(-94);
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V", line = 41)
    public class58() {
        super(0, true);
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(B)V", line = 46)
    public static final void method468(byte arg0) {
        class83.field1194.method1913(64);
        field860++;
        int var1 = class83.field1194.method1911(8, 16811);
        if (var1 < class166.field2384) {
            for (int var2 = var1; var2 < class166.field2384; var2++) {
                class177.field2548[class22.field337++] = class215.field3158[var2];
            }
        }
        if (class166.field2384 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class166.field2384 = 0;
        if (arg0 >= -113) {
            return;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class215.field3158[var3];
            class181 var5 = class300.field4495[var4];
            int var6 = class83.field1194.method1911(1, 16811);
            if (var6 == 0) {
                class215.field3158[class166.field2384++] = var4;
                var5.field5153 = class304.field4560;
            } else {
                int var7 = class83.field1194.method1911(2, 16811);
                if (var7 == 0) {
                    class215.field3158[class166.field2384++] = var4;
                    var5.field5153 = class304.field4560;
                    class5.field125[class95.field1336++] = var4;
                } else if (var7 == 1) {
                    class215.field3158[class166.field2384++] = var4;
                    var5.field5153 = class304.field4560;
                    int var12 = class83.field1194.method1911(3, 16811);
                    var5.method2342(1, var12, false);
                    int var13 = class83.field1194.method1911(1, 16811);
                    if (var13 == 1) {
                        class5.field125[class95.field1336++] = var4;
                    }
                } else if (var7 == 2) {
                    class215.field3158[class166.field2384++] = var4;
                    var5.field5153 = class304.field4560;
                    if (class83.field1194.method1911(1, 16811) == 1) {
                        int var8 = class83.field1194.method1911(3, 16811);
                        var5.method2342(2, var8, false);
                        int var9 = class83.field1194.method1911(3, 16811);
                        var5.method2342(2, var9, false);
                    } else {
                        int var10 = class83.field1194.method1911(3, 16811);
                        var5.method2342(0, var10, false);
                    }
                    int var11 = class83.field1194.method1911(1, 16811);
                    if (var11 == 1) {
                        class5.field125[class95.field1336++] = var4;
                    }
                } else if (var7 == 3) {
                    class177.field2548[class22.field337++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILsb;I)V", line = 163)
    public final void method23(int arg0, class190 arg1, int arg2) {
        if (arg0 != -5836) {
            field851 = (String) null;
        }
        if (arg2 == 0) {
            this.field852 = arg1.method1317((byte) 95);
        } else if (arg2 == 1) {
            this.field863 = arg1.method1317((byte) 76);
        } else if (arg2 == 2) {
            this.field849 = arg1.method1317((byte) 15);
        } else if (arg2 == 3) {
            this.field848 = arg1.method1317((byte) 43);
        }
        field850++;
    }

    @OriginalMember(owner = "client!we", name = "h", descriptor = "(I)V", line = 222)
    public static void method469(int arg0) {
        field856 = null;
        if (arg0 != 27913) {
            field861 = (class248[]) null;
        }
        field853 = null;
        field861 = null;
        field862 = null;
        field854 = null;
        field847 = null;
        field858 = null;
        field851 = null;
        field864 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)[I", line = 271)
    public final int[] method18(int arg0, byte arg1) {
        field859++;
        if (arg1 != -62) {
            method469(-116);
        }
        int[] var3 = this.field375.method2087(-45, arg0);
        if (this.field375.field4382) {
            for (int var4 = 0; var4 < class209.field3053; var4++) {
                int var5 = (class251.field3721[var4] << 12) / this.field852 + this.field849;
                int var6 = (class215.field3175[arg0] << 12) / this.field852 + this.field848;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while ((var11 + var12) < 16384 && var13 < this.field863) {
                    var13++;
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var7 + var11 - var12;
                    var12 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = this.field863 - 1 <= var13 ? 0 : (var13 << 12) / this.field863;
            }
        }
        return var3;
    }
}
