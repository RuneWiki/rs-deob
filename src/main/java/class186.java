import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class186 {

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "B")
    private byte field3015;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public int field3010;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public int field3016;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public int field3020;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public int field3021;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public int field3018;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "Lo;")
    public static class227 field3023 = new class227();

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "Lph;")
    public static class229 field3025 = class266.method1858("blinken2:", 0);

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "Z")
    public static boolean field3027 = false;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "S")
    public static short field3030 = 205;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "[I")
    public static int[] field3026 = new int[5];

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "Lfj;")
    public static class311 field3028 = new class311(0, 0);

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "Ljava/util/Random;")
    public static Random field3031 = new Random();

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "Lph;")
    public static class229 field3033 = class266.method1858(")3", 0);

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "Lph;")
    private static class229 field3034 = class266.method1858(" has logged out)3", 0);

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "Lph;")
    public static class229 field3032 = field3034;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "[[[B")
    public static byte[][][] field3029;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lph;Z)I", line = 5)
    public static final int method1303(class229 arg0, boolean arg1) {
        field3017++;
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class103.field1752; var2++) {
            if (arg0.method1630(10, class133.field2170[var2])) {
                return var2;
            }
        }
        if (!arg1) {
            method1303((class229) null, false);
        }
        return -1;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lsi;B)V", line = 33)
    public static final void method1304(class66 arg0, byte arg1) {
        field3013++;
        if (arg1 == -12) {
            class89.field1508 = arg0;
            class100.field1714 = class89.field1508.method517((byte) -126, 4);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 52)
    public static void method1305(int arg0) {
        field3032 = null;
        field3033 = null;
        field3026 = null;
        int var1 = 44 % ((-arg0) / 42);
        field3025 = null;
        field3028 = null;
        field3031 = null;
        field3023 = null;
        field3029 = (byte[][][]) null;
        field3034 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)Z", line = 69)
    public static final boolean method1306(byte arg0) {
        field3019++;
        if (arg0 != -89) {
            return false;
        }
        if (class255.field4265) {
            try {
                class157.field2560.method1627((byte) 66, class249.field4143.field1561);
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)I", line = 117)
    public final int method1307(int arg0) {
        field3024++;
        if (arg0 < 105) {
            this.field3010 = 18;
        }
        return this.field3015 & 0x7;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)I", line = 128)
    public final int method1308(int arg0) {
        field3014++;
        if (arg0 != -1) {
            field3026 = (int[]) null;
        }
        return (this.field3015 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIII)V", line = 146)
    public static final void method1309(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class281 var5 = class135.method957(0, arg4, 8);
        field3011++;
        int var6 = -58 % ((arg3 + 32) / 58);
        var5.method1932(0);
        var5.field4652 = arg1;
        var5.field4657 = arg2;
        var5.field4660 = arg0;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V", line = 158)
    public class186() {
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)V", line = 162)
    public static final void method1310(byte arg0) {
        class37.field604 = new class301[class75.field1264.method499((byte) -60)][];
        class133.field2164 = new boolean[class75.field1264.method499((byte) -50)];
        field3022++;
        if (arg0 > -48) {
            method1309(0, 124, -98, -126, -88);
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lhb;)V", line = 172)
    public class186(class164 arg0) {
        this.field3015 = arg0.method1163(864348104);
        this.field3010 = arg0.method1161(true);
        this.field3016 = arg0.method1191(31776);
        this.field3020 = arg0.method1191(31776);
        this.field3021 = arg0.method1191(31776);
        this.field3018 = arg0.method1191(31776);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZIIIIIII)V", line = 188)
    public static final void method1311(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        for (int var9 = 0; var9 < class1.field5.field882; var9++) {
            int var10 = class1.field5.field879[var9] - class54.field786;
            int var11 = class266.field4487 + class214.field3537 - class1.field5.field868[var9] - 1;
            int var12 = (arg0 - arg4) * (var10 - arg8) / (arg5 - arg8) + arg4;
            int var13 = (var11 - arg3) * (arg6 - arg7) / (arg2 - arg3) + arg7;
            int var14 = class1.field5.method411((byte) 72, var9);
            class283 var15 = null;
            if (var14 == 0) {
                if ((double) class95.field1604 == 3.0D) {
                    var15 = class316.field5373;
                }
                if ((double) class95.field1604 == 4.0D) {
                    var15 = class145.field2357;
                }
                if ((double) class95.field1604 == 6.0D) {
                    var15 = class102.field1736;
                }
                if ((double) class95.field1604 == 8.0D) {
                    var15 = class118.field1988;
                }
            }
            if (var14 == 1) {
                if ((double) class95.field1604 == 3.0D) {
                    var15 = class102.field1736;
                }
                if ((double) class95.field1604 == 4.0D) {
                    var15 = class118.field1988;
                }
                if ((double) class95.field1604 == 6.0D) {
                    var15 = class118.field1986;
                }
                if ((double) class95.field1604 == 8.0D) {
                    var15 = class187.field3053;
                }
            }
            int var16 = 16777215;
            if (var14 == 2) {
                if ((double) class95.field1604 == 3.0D) {
                    var15 = class118.field1986;
                }
                var16 = 16755200;
                if ((double) class95.field1604 == 4.0D) {
                    var15 = class187.field3053;
                }
                if ((double) class95.field1604 == 6.0D) {
                    var15 = class240.field3966;
                }
                if ((double) class95.field1604 == 8.0D) {
                    var15 = class141.field2276;
                }
            }
            if (class1.field5.field869[var9] != -1) {
                var16 = class1.field5.field869[var9];
            }
            if (var15 != null) {
                class229[] var17 = new class229[class1.field5.field872[var9].method1606(60, (byte) -114) + 1];
                class325.field5552.method241(class1.field5.field872[var9], (int[]) null, var17);
                int var18 = var17.length;
                int var19 = var13 - (var18 - 1) * var15.method1950() / 2;
                int var20 = var19 + var15.method1949() / 2;
                for (int var21 = 0; var21 < var18; var21++) {
                    class229 var22 = (var18 - 1) == var21 ? var17[var21] : var17[var21].method1623(0, -30201, var17[var21].method1642(69) - 4);
                    var15.method1952(var22, var12, var20, var16, true);
                    var20 += var15.method1950();
                }
            }
        }
        if (!arg1) {
            method1311(-100, true, -119, -36, -74, 14, -115, -120, -34);
        }
        field3012++;
    }
}
