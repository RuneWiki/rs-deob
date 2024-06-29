import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class47 extends class273 {

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
    private int field656 = 0;

    @OriginalMember(owner = "client!wc", name = "U", descriptor = "I")
    private int field665 = 4096;

    @OriginalMember(owner = "client!wc", name = "R", descriptor = "Leg;")
    public static class188 field662 = new class188(64);

    @OriginalMember(owner = "client!wc", name = "Y", descriptor = "I")
    public static int field669 = 0;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!wc", name = "S", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!wc", name = "T", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!wc", name = "V", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!wc", name = "W", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!wc", name = "X", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!wc", name = "Z", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!wc", name = "ab", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!wc", name = "bb", descriptor = "Lce;")
    public static class8 field672;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII)Ldb;", line = 6)
    public static final class45 method322(int arg0, int arg1, int arg2, int arg3) {
        field661++;
        class45 var4 = new class45();
        var4.field638 = arg3;
        var4.field640 = arg2;
        class166.field2557.method1550(var4, (long) arg1, (byte) 70);
        class330.method2233(24687, arg2);
        if (arg0 <= 7) {
            field672 = (class8) null;
        }
        class207 var5 = class78.method547(arg1, 118);
        if (var5 != null) {
            class277.method1822(4096, var5);
        }
        if (class108.field1674 != null) {
            class277.method1822(4096, class108.field1674);
            class108.field1674 = null;
        }
        int var6 = class168.field2565;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class177.method1198(class194.field2925[var7], 23904)) {
                class294.method1916((byte) 67, var7);
            }
        }
        if (class168.field2565 == 1) {
            class260.field4036 = false;
            class136.method928(713, class246.field3858, class179.field2748, class116.field1797, class307.field4832);
        } else {
            class136.method928(713, class246.field3858, class179.field2748, class116.field1797, class307.field4832);
            int var8 = class286.field4380.method1247(class82.field1224);
            for (int var9 = 0; var9 < class168.field2565; var9++) {
                int var10 = class286.field4380.method1247(class234.method1597(0, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class179.field2748 = var8 + 8;
            class116.field1797 = class168.field2565 * 15 + (class151.field2373 ? 26 : 22);
        }
        if (var5 != null) {
            class342.method2386(false, var5, 124);
        }
        class313.method2148(-1, arg2);
        if (class253.field3936 != -1) {
            class288.method1874(8, 1, class253.field3936);
        }
        return var4;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(II)V", line = 85)
    public static final void method323(int arg0, int arg1) {
        field670++;
        for (class187 var2 = class262.field4050.method1549((byte) -38); var2 != null; var2 = class262.field4050.method1546(-1)) {
            if ((var2.field2852 >> 48 & 0xFFFFL) == ((long) arg1)) {
                var2.method1284(arg0 - 65535);
            }
        }
        if (arg0 != 65535) {
            method330((byte) 16, -70);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIZII)V", line = 109)
    public static final void method324(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class68[] var7 = class81.field1204;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class68 var9 = var7[var8];
            if (var9 != null && var9.field1013 == 2) {
                class112.method752(arg6 >> 1, arg3, arg2, (byte) -13, arg0 >> 1, (var9.field1008 - class294.field4535 << 7) + var9.field1010, (-class30.field374 + var9.field1007 << 7) - -var9.field1018, var9.field1015 * 2);
                if (class307.field4844 > -1 && (class343.field5341 % 20) < 10) {
                    class221.field3509[var9.field1021].method921(class307.field4844 + arg1 - 12, class315.field4971 + arg5 + -28);
                }
            }
        }
        field663++;
        if (arg4) {
            field664 = -118;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I[B)Lwd;", line = 137)
    public static final class232 method325(int arg0, byte[] arg1) {
        field668++;
        if (arg1 == null) {
            return null;
        }
        class232 var2 = new class232(arg1, class276.field4257, class123.field1919, class68.field1011, class107.field1652, class46.field644);
        if (arg0 != -2) {
            method324(30, -53, 20, -123, true, 61, 34);
        }
        class345.method2394((byte) -92);
        return var2;
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(II)V", line = 155)
    public static final void method326(int arg0, int arg1) {
        field658++;
        class299.field4634.method1287(arg0, arg1 + 113);
        if (arg1 != 12) {
            method327(-103, (long[]) null, 14, -86, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V", line = 320)
    public class47() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BILgn;)V", line = 174)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        field657++;
        if (arg1 == 0) {
            this.field656 = arg2.method1994(false);
        } else if (arg1 == 1) {
            this.field665 = arg2.method1994(false);
        }
        if (arg0 < 27) {
            field662 = (class188) null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I[JII[I)V", line = 216)
    public static final void method327(int arg0, long[] arg1, int arg2, int arg3, int[] arg4) {
        if (arg3 != 1) {
            field671 = 69;
        }
        if (arg0 > arg2) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg2;
            long var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            int var9 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var9;
            for (int var10 = arg2; var10 < arg0; var10++) {
                if ((var7 + ((long) (var10 & 0x1))) > arg1[var10]) {
                    long var11 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6] = var11;
                    int var13 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6++] = var13;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg4[arg0] = arg4[var6];
            arg4[var6] = var9;
            method327(var6 - 1, arg1, arg2, 1, arg4);
            method327(arg0, arg1, var6 + 1, 1, arg4);
        }
        field667++;
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(II)Z", line = 271)
    public static final boolean method328(int arg0, int arg1) {
        if (arg0 != -8451) {
            method323(74, 7);
        }
        field660++;
        class130 var2 = class17.method136((byte) -116, arg1);
        if (var2 == null) {
            return false;
        } else if (class224.field3576 == 1 || class224.field3576 == 2 || class208.field3307 == 2) {
            class19.field259 = var2.field2029;
            class82.field1229 = var2.field2033;
            if (class208.field3307 != 0) {
                class43.field610 = class19.field259 + 40000;
                class221.field3506 = class19.field259 + 50000;
                class23.field292 = class43.field610;
            }
            return true;
        } else {
            String var3 = "";
            if (class266.field4101 != null) {
                var3 = "/p=" + class266.field4101;
            }
            String var4 = "";
            if (class208.field3307 != 0) {
                var4 = ":" + (var2.field2029 + 7000);
            }
            String var5 = "http://" + var2.field2033 + var4 + "/l=" + class157.field2462 + "/a=" + class123.field1928 + var3 + "/j" + (class242.field3831 ? "1" : "0") + ",o" + (class148.field2341 ? "1" : "0") + ",a2,m" + (class237.field3796 ? "1" : "0");
            try {
                class236.field3790.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(B)V", line = 326)
    public static void method329(byte arg0) {
        int var1 = 72 / ((arg0 - 50) / 52);
        field662 = null;
        field672 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)I", line = 337)
    public static final int method330(byte arg0, int arg1) {
        field666++;
        int var8 = arg1 - 1;
        int var2 = var8 | var8 >>> 1;
        int var3 = 12 / ((arg0 + 46) / 61);
        int var4 = var2 | var2 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return var7 + 1;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)[I", line = 358)
    public final int[] method331(int arg0, int arg1) {
        field659++;
        if (arg1 != -14650) {
            this.field656 = -94;
        }
        int[] var3 = this.field4204.method365(arg0, 0);
        if (this.field4204.field792) {
            int[] var4 = this.method1790(0, arg0, 0);
            for (int var5 = 0; var5 < class27.field346; var5++) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field656 && this.field665 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }
}
