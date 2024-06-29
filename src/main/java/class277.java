import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class277 {

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "Ltf;")
    private class248 field3866;

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "I")
    private int field3865;

    @OriginalMember(owner = "client!hp", name = "w", descriptor = "I")
    private int field3880;

    @OriginalMember(owner = "client!hp", name = "p", descriptor = "Lsd;")
    private class80 field3873;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "Lkca;")
    public static class73 field3861 = new class73(45, 16);

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!hp", name = "j", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!hp", name = "k", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!hp", name = "l", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!hp", name = "m", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!hp", name = "n", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!hp", name = "o", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!hp", name = "q", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!hp", name = "r", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!hp", name = "s", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!hp", name = "t", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!hp", name = "u", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!hp", name = "v", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "Ljava/lang/Object;")
    public static Object field3860;

    static {
        new class474(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)I", line = 3)
    public final int method1796(byte arg0) {
        field3863++;
        if (arg0 <= 102) {
            this.method1803((byte) -95);
        }
        return this.field3865;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(JILjava/lang/Object;B)V", line = 15)
    public final void method1797(long arg0, int arg1, Object arg2, byte arg3) {
        int var6 = -28 % ((-arg3 - 8) / 38);
        field3879++;
        if (arg1 > this.field3865) {
            throw new IllegalStateException("s>cs");
        }
        this.method1798(arg0, (byte) -79);
        this.field3880 -= arg1;
        while (this.field3880 < 0) {
            class172 var8 = (class172) this.field3866.method1645(-95);
            this.method1809(var8, (byte) 53);
        }
        class337 var7 = new class337(arg2, arg1);
        this.field3873.method520((byte) -114, var7, arg0);
        this.field3866.method1646(40, var7);
        var7.field401 = 0L;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(JB)V", line = 44)
    private final void method1798(long arg0, byte arg1) {
        if (arg1 == -79) {
            field3862++;
            class172 var4 = (class172) this.field3873.method524((byte) 91, arg0);
            this.method1809(var4, (byte) 53);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)I", line = 58)
    public final int method1799(boolean arg0) {
        if (!arg0) {
            this.method1801(80, 47L);
        }
        field3878++;
        return this.field3880;
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(Z)[Lng;", line = 74)
    public static final class290[] method1800(boolean arg0) {
        if (class156.field1935 == null) {
            class290[] var1 = class197.method1254(class20.field197, 122);
            class290[] var2 = new class290[var1.length];
            int var3 = 0;
            int var4 = class595.field8694.method2427(112, class81.field908);
            label73: for (int var5 = 0; var5 < var1.length; var5++) {
                class290 var9 = var1[var5];
                if ((var9.field4015 <= 0 || var9.field4015 >= 24) && var9.field4011 >= 800 && var9.field4013 >= 600 && (var4 != 2 || var9.field4011 <= 800 && var9.field4013 <= 600) && (var4 != 1 || var9.field4011 <= 1024 && var9.field4013 <= 768)) {
                    for (int var10 = 0; var10 < var3; var10++) {
                        class290 var11 = var2[var10];
                        if (var9.field4011 == var11.field4011 && var9.field4013 == var11.field4013) {
                            if (var9.field4015 > var11.field4015) {
                                var2[var10] = var9;
                            }
                            continue label73;
                        }
                    }
                    var2[var3] = var9;
                    var3++;
                }
            }
            class156.field1935 = new class290[var3];
            class210.method1327(var2, 0, class156.field1935, 0, var3);
            int[] var6 = new int[class156.field1935.length];
            for (int var7 = 0; var7 < class156.field1935.length; var7++) {
                class290 var8 = class156.field1935[var7];
                var6[var7] = var8.field4013 * var8.field4011;
            }
            class228.method1478((byte) -128, var6, class156.field1935);
        }
        field3868++;
        if (!arg0) {
            method1812(-100, (byte) -115, -85, -112, 76, 16, -7, 96, -119, -65);
        }
        return class156.field1935;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IJ)Ljava/lang/Object;", line = 162)
    public final Object method1801(int arg0, long arg1) {
        field3869++;
        class172 var4 = (class172) this.field3873.method524((byte) 103, arg1);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method988(true);
        if (var5 == null) {
            var4.method2108(true);
            var4.method199(-47);
            this.field3880 += var4.field2116;
            return null;
        }
        if (arg0 != 0) {
            this.method1801(27, 32L);
        }
        if (var4.method991((byte) -73)) {
            class337 var6 = new class337(var5, var4.field2116);
            this.field3873.method520((byte) -109, var6, var4.field4676);
            this.field3866.method1646(-124, var6);
            var6.field401 = 0L;
            var4.method2108(true);
            var4.method199(arg0 ^ 0xFFFFFF95);
        } else {
            this.field3866.method1646(61, var4);
            var4.field401 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V", line = 204)
    public static void method1802(int arg0) {
        field3860 = null;
        if (arg0 != 17745) {
            method1812(-68, (byte) -46, -45, 82, -117, -41, 78, -115, 29, -77);
        }
        field3861 = null;
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(B)Ljava/lang/Object;", line = 215)
    public final Object method1803(byte arg0) {
        if (arg0 < 18) {
            return null;
        }
        field3877++;
        class172 var2 = (class172) this.field3873.method530(12714);
        while (var2 != null) {
            Object var3 = var2.method988(true);
            if (var3 != null) {
                return var3;
            }
            class172 var4 = var2;
            var2 = (class172) this.field3873.method530(12714);
            var4.method2108(true);
            var4.method199(-85);
            this.field3880 += var4.field2116;
        }
        return null;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Loa;I)V", line = 252)
    public static final void method1804(class605 arg0, int arg1) {
        arg0.method368(0, 0, class581.field8366, 350);
        field3859++;
        if (arg1 != 5385) {
            field3861 = null;
        }
        arg0.method394(0, 0, class581.field8366, 350, class169.field2059 << 24 | 0x332277, 1);
        int var2 = 350 / class122.field1532;
        if (class429.field6362 > 0) {
            int var3 = 342 - class122.field1532;
            int var4 = var2 * var3 / (class429.field6362 + var2 - 1);
            int var5 = 4;
            if (class429.field6362 > 1) {
                var5 += (class429.field6362 - class392.field6007 - 1) * (var3 - var4) / (class429.field6362 - 1);
            }
            arg0.method394(class581.field8366 - 16, var5, 12, var4, class169.field2059 << 24 | 0x332277, 2);
            for (int var6 = class392.field6007; class392.field6007 + var2 > var6 && class429.field6362 > var6; var6++) {
                String[] var7 = class293.method1890('\b', (byte) -1, class236.field3378[var6]);
                int var8 = (class581.field8366 - 24) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var8 * var9 + 8;
                    arg0.method368(var10, 0, var8 + var10 - 8, 350);
                    class445.field6665.method1046(-8500, 350 - class608.field8878 - (2 - -((-class392.field6007 + var6) * class122.field1532)) - class261.field3710.field6077, var7[var9], -1, -16777216, var10);
                }
            }
        }
        arg0.method368(0, 0, class581.field8366, 350);
        arg0.method3521(0, class581.field8366, -1, 2, 350 - class608.field8878);
        class472.field6992.method1046(-8500, 349 - class281.field3921.field6077, "--> " + class309.field4552, -1, -16777216, 10);
        if (!class44.field466) {
            return;
        }
        int var11 = -1;
        if ((class287.field3982 % 30) > 15) {
            var11 = 16777215;
        }
        arg0.method3525(var11, class281.field3921.method2554("--> " + class309.field4552.substring(0, class343.field4889), (byte) 0) + 10, -class281.field3921.field6077 + 339, arg1 - 5384, 12);
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V", line = 327)
    public final void method1805(int arg0) {
        field3871++;
        int var2 = 119 / ((-arg0 - 50) / 36);
        for (class172 var3 = (class172) this.field3866.method1644((byte) -125); var3 != null; var3 = (class172) this.field3866.method1642(0)) {
            if (var3.method991((byte) -125)) {
                var3.method2108(true);
                var3.method199(-79);
                this.field3880 += var3.field2116;
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "(B)I", line = 352)
    public final int method1806(byte arg0) {
        field3864++;
        int var2 = 0;
        for (class172 var3 = (class172) this.field3866.method1644((byte) -122); var3 != null; var3 = (class172) this.field3866.method1642(0)) {
            if (!var3.method991((byte) -81)) {
                var2++;
            }
        }
        if (arg0 < 110) {
            this.method1808(-4L, null, (byte) -34);
        }
        return var2;
    }

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "(B)Ljava/lang/Object;", line = 379)
    public final Object method1807(byte arg0) {
        field3867++;
        class172 var2 = (class172) this.field3873.method523(88);
        while (var2 != null) {
            Object var3 = var2.method988(true);
            if (var3 != null) {
                return var3;
            }
            class172 var4 = var2;
            var2 = (class172) this.field3873.method530(12714);
            var4.method2108(true);
            var4.method199(-97);
            this.field3880 += var4.field2116;
        }
        if (arg0 != 125) {
            field3870 = -116;
        }
        return null;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(JLjava/lang/Object;B)V", line = 410)
    public final void method1808(long arg0, Object arg1, byte arg2) {
        this.method1797(arg0, 1, arg1, (byte) 101);
        if (arg2 <= -4) {
            field3858++;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Loe;B)V", line = 421)
    private final void method1809(class172 arg0, byte arg1) {
        if (arg1 != 53) {
            field3860 = null;
        }
        field3874++;
        if (arg0 != null) {
            arg0.method2108(true);
            arg0.method199(-57);
            this.field3880 += arg0.field2116;
        }
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(I)V", line = 448)
    public class277(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "(Z)V", line = 452)
    public final void method1810(boolean arg0) {
        if (!arg0) {
            this.field3866.method1641(-5681);
            field3875++;
            this.field3873.method528(-519011192);
            this.field3880 = this.field3865;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BI)V", line = 465)
    public final void method1811(byte arg0, int arg1) {
        field3876++;
        int var3 = 100 % ((arg0 - 45) / 60);
        if (class494.field7197 == null) {
            return;
        }
        for (class172 var4 = (class172) this.field3866.method1644((byte) -124); var4 != null; var4 = (class172) this.field3866.method1642(0)) {
            if (var4.method991((byte) -73)) {
                if (var4.method988(true) == null) {
                    var4.method2108(true);
                    var4.method199(-30);
                    this.field3880++;
                }
            } else if ((++var4.field401) > ((long) arg1)) {
                class172 var5 = class494.field7197.method886(var4, false);
                this.field3873.method520((byte) -73, var5, var4.field4676);
                class195.method1242(var4, var5, 119);
                var4.method2108(true);
                var4.method199(-40);
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IBIIIIIIII)V", line = 512)
    public static final void method1812(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3872++;
        int var10 = -31 / ((arg1 - 52) / 60);
        if (arg8 >= class113.field1385 && arg8 <= class4.field43 && class113.field1385 <= arg6 && arg6 <= class4.field43 && class113.field1385 <= arg9 && arg9 <= class4.field43 && arg5 >= class113.field1385 && arg5 <= class4.field43 && arg0 >= class418.field6298 && class461.field6877 >= arg0 && class418.field6298 <= arg4 && class461.field6877 >= arg4 && arg7 >= class418.field6298 && arg7 <= class461.field6877 && arg2 >= class418.field6298 && class461.field6877 >= arg2) {
            class561.method3245(arg7, arg5, arg3, arg0, arg8, arg9, arg2, (byte) 109, arg6, arg4);
        } else {
            class337.method2180(arg2, arg5, arg8, arg9, arg6, arg3, arg7, arg0, (byte) -33, arg4);
        }
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(II)V", line = 531)
    private class277(int arg0, int arg1) {
        this.field3866 = new class248();
        this.field3865 = arg0;
        this.field3880 = arg0;
        int var3;
        for (var3 = 1; arg0 > var3 + var3 && arg1 > var3; var3 += var3) {
        }
        this.field3873 = new class80(var3);
    }
}
