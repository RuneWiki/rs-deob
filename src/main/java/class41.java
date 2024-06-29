import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class41 {

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field495 = -1;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "J")
    public static long field501 = 0L;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field500 = -1;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field494;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIZBZZI)Lea;", line = 6)
    public static final class235 method274(int arg0, int arg1, int arg2, boolean arg3, byte arg4, boolean arg5, boolean arg6, int arg7) {
        class253 var8 = class325.method2219(arg1, -9379);
        if (arg2 > 1 && var8.field3802 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (var8.field3808[var10] <= arg2 && var8.field3808[var10] != 0) {
                    var9 = var8.field3802[var10];
                }
            }
            if (var9 != -1) {
                var8 = class325.method2219(var9, -9379);
            }
        }
        field503++;
        class77 var11 = var8.method1707(-113);
        if (var11 == null) {
            return null;
        }
        class127 var12 = null;
        if (var8.field3800 != -1) {
            var12 = (class127) method274(0, var8.field3849, 10, true, (byte) 70, false, true, 1);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field3834 != -1) {
            var12 = (class127) method274(arg0, var8.field3812, arg2, false, (byte) 86, false, true, arg7);
            if (var12 == null) {
                return null;
            }
        }
        int var13 = class46.field580;
        int[] var14 = class46.field577;
        int var15 = class46.field579;
        int[] var16 = new int[4];
        class46.method314(var16);
        int var17 = -124 / ((arg4 - 19) / 48);
        class127 var18 = new class127(36, 32);
        class46.method321(var18.field1983, 36, 32);
        class148.method1070();
        class148.method1071(16, 16);
        int var19 = var8.field3810;
        class148.field2228 = false;
        if (arg3) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg7 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class148.field2239[var8.field3809] * var19 >> 16;
        int var21 = class148.field2229[var8.field3809] * var19 >> 16;
        var11.method511(0, var8.field3838, var8.field3828, var8.field3809, var8.field3825, var20 + var8.field3827 - (var11.method115() / 2), var8.field3827 + var21, -1L);
        if (arg7 >= 1) {
            var18.method926(1);
            if (arg7 >= 2) {
                var18.method926(16777215);
            }
            class46.method321(var18.field1983, 36, 32);
        }
        if (arg0 != 0) {
            var18.method930(arg0);
        }
        if (var8.field3800 != -1) {
            var12.method935(0, 0);
        } else if (var8.field3834 != -1) {
            class46.method321(var12.field1983, 36, 32);
            var18.method935(0, 0);
            var18 = var12;
        }
        if (arg5 && (var8.field3847 == 1 || arg2 != 1) && arg2 != -1) {
            class228.field3472.method620(class316.method2166(arg2, (byte) -87), 0, 9, 16776960, 1);
        }
        class46.method321(var14, var13, var15);
        class46.method317(var16);
        class148.method1070();
        class148.field2228 = true;
        return class117.field1817 && !arg6 ? new class303(var18) : var18;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V", line = 145)
    public class41() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BIIIIII)V", line = 155)
    public static final void method275(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 < 23) {
            return;
        }
        field504++;
        if (class157.field2357 <= arg2 && class184.field2761 >= arg4 && arg6 >= class185.field2769 && arg1 <= class166.field2494) {
            if (arg5 == 1) {
                class138.method1001(arg6, arg4, arg2, (byte) 93, arg1, arg3);
            } else {
                class88.method609(arg2, arg5, arg6, 68, arg4, arg1, arg3);
            }
        } else if (arg5 == 1) {
            class272.method1917(arg2, arg4, arg1, arg3, -123, arg6);
        } else {
            class124.method896(arg6, arg3, arg4, arg1, arg5, -8947, arg2);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lre;[BI)V", line = 186)
    public final void method276(class263 arg0, byte[] arg1, int arg2) {
        field496++;
        if (arg0.field3986[arg0.field4025] != 31 || arg0.field3986[arg0.field4025 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field494 == null) {
            this.field494 = new Inflater(true);
        }
        try {
            this.field494.setInput(arg0.field3986, arg0.field4025 + 10, arg0.field3986.length - 10 - (arg0.field4025 - -8));
            if (arg2 < 26) {
                return;
            }
            this.field494.inflate(arg1);
        } catch (Exception var5) {
            this.field494.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field494.reset();
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(III)V", line = 209)
    private class41(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V", line = 226)
    public static final void method277(byte arg0) {
        class287.field4332 = 0;
        field502++;
        class230.field3476 = 0;
        class184.method1271(1);
        class141.method1017((byte) 75);
        class122.method883(-1);
        for (int var1 = 0; var1 < class287.field4332; var1++) {
            int var2 = class88.field1311[var1];
            if (class304.field4641 != class187.field2788[var2].field1498) {
                if (class187.field2788[var2].field914.method389(false)) {
                    class38.method265(class187.field2788[var2], 88);
                }
                class187.field2788[var2].method458(16, (class58) null);
                class187.field2788[var2] = null;
            }
        }
        int var3 = -21 / ((arg0) / 58);
        if (class3.field13 != class207.field3137.field4025) {
            throw new RuntimeException("gnp1 pos:" + class207.field3137.field4025 + " psize:" + class3.field13);
        }
        for (int var4 = 0; var4 < class172.field2577; var4++) {
            if (class187.field2788[class56.field711[var4]] == null) {
                throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class172.field2577);
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)V", line = 282)
    public static final void method278(int arg0, int arg1) {
        field499++;
        if (arg0 == -1 || !class44.field560[arg0]) {
            return;
        }
        class138.field2094.method1433((byte) 0, arg0);
        if (class278.field4231[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class278.field4231[arg0].length; var3++) {
            if (class278.field4231[arg0][var3] != null) {
                if (class278.field4231[arg0][var3].field5066 == 2) {
                    var2 = false;
                } else {
                    class278.field4231[arg0][var3] = null;
                }
            }
        }
        if (arg1 >= -71) {
            field500 = 23;
        }
        if (var2) {
            class278.field4231[arg0] = null;
        }
        class44.field560[arg0] = false;
    }
}
