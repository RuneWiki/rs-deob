import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class334 {

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "Lfc;")
    private class174 field4845 = new class174(64);

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "Loi;")
    private class53 field4843;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "Ldu;")
    public static class242 field4847;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "Ltn;")
    public static class60 field4848;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "Lht;")
    public static class418 field4839;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "Loi;")
    public static class53 field4837;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public final void method1992(int arg0) {
        field4846++;
        if (arg0 != 7) {
            method1994(-118, 96, 37, -21);
        }
        class174 var2 = this.field4845;
        synchronized (this.field4845) {
            this.field4845.method1096((byte) 108);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILnt;Lwm;)V")
    public static final void method1993(int arg0, int arg1, class151 arg2, class403 arg3) {
        field4841++;
        class227 var4 = new class227();
        var4.field3263 = arg3.method2357((byte) 108);
        var4.field3267 = arg3.method2319((byte) 90);
        var4.field3266 = new int[var4.field3263];
        var4.field3271 = new class370[var4.field3263];
        var4.field3273 = new int[var4.field3263];
        var4.field3264 = new class370[var4.field3263];
        var4.field3268 = new int[var4.field3263];
        var4.field3270 = new byte[var4.field3263][][];
        for (int var5 = 0; var5 < var4.field3263; var5++) {
            try {
                int var6 = arg3.method2357((byte) 123);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg3.method2356(arg0 ^ 0x6259);
                    String var18 = arg3.method2356(-25178);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg3.method2319((byte) 83);
                    }
                    var4.field3266[var5] = var6;
                    var4.field3268[var5] = var19;
                    var4.field3271[var5] = arg2.method952(var18, 19824, class168.method1056(var17, class509.method3039(arg0, -65404)));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg3.method2356(-25178);
                    String var8 = arg3.method2356(-25178);
                    int var9 = arg3.method2357((byte) 121);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg3.method2356(arg0 - 25177);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg3.method2319((byte) 91);
                            var12[var13] = new byte[var14];
                            arg3.method2379(var14, -115, var12[var13], 0);
                        }
                    }
                    var4.field3266[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class168.method1056(var10[var16], 65403);
                    }
                    var4.field3264[var5] = arg2.method974(var15, class168.method1056(var7, class509.method3039(arg0, -65404)), (byte) 59, var8);
                    var4.field3270[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field3273[var5] = -1;
            } catch (SecurityException var21) {
                var4.field3273[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field3273[var5] = -3;
            } catch (Exception var23) {
                var4.field3273[var5] = -4;
            } catch (Throwable var24) {
                var4.field3273[var5] = -5;
            }
        }
        if (arg0 != -1) {
            field4848 = null;
        }
        class100.field1337.method2657(8492, var4);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public static final void method1994(int arg0, int arg1, int arg2, int arg3) {
        class239 var4 = class268.field3910[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class362 var5 = var4.field3474;
        class362 var6 = var4.field3471;
        if (var5 != null) {
            var5.field5175 = var5.field5175 * arg3 / (0x10 << class493.field6970 - 7);
            var5.field5169 = var5.field5169 * arg3 / (0x10 << class493.field6970 - 7);
        }
        if (var6 != null) {
            var6.field5175 = var6.field5175 * arg3 / (0x10 << class493.field6970 - 7);
            var6.field5169 = var6.field5169 * arg3 / (0x10 << class493.field6970 - 7);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)Lcr;")
    public final class412 method1995(int arg0, int arg1) {
        field4842++;
        class174 var3 = this.field4845;
        class412 var4;
        synchronized (this.field4845) {
            var4 = (class412) this.field4845.method1088((long) arg1, (byte) -123);
            if (arg0 != 12) {
                field4837 = null;
            }
        }
        if (var4 != null) {
            return var4;
        }
        class53 var5 = this.field4843;
        byte[] var6;
        synchronized (this.field4843) {
            var6 = this.field4843.method426(11, (byte) 9, arg1);
        }
        class412 var7 = new class412();
        if (var6 != null) {
            var7.method2442(new class403(var6), true);
        }
        class174 var8 = this.field4845;
        synchronized (this.field4845) {
            this.field4845.method1097(19627, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)I")
    public static final int method1996(byte arg0) {
        field4838++;
        int var1 = 30 % (-arg0 / 54);
        if (class258.field3835 == null) {
            return class217.field3152 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)V")
    public final void method1997(byte arg0) {
        class174 var2 = this.field4845;
        synchronized (this.field4845) {
            this.field4845.method1095(0);
        }
        field4844++;
        if (arg0 <= 72) {
            method1994(85, -97, 9, -96);
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
    public static void method1998(int arg0) {
        field4839 = null;
        field4837 = null;
        field4847 = null;
        field4848 = null;
        if (arg0 != -1025) {
            method1993(-103, -18, null, null);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZ)V")
    public final void method1999(int arg0, boolean arg1) {
        if (!arg1) {
            this.field4845 = null;
        }
        field4840++;
        class174 var3 = this.field4845;
        synchronized (this.field4845) {
            this.field4845.method1087(1, arg0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lle;ILoi;)V")
    public class334(class205 arg0, int arg1, class53 arg2) {
        this.field4843 = arg2;
        if (this.field4843 != null) {
            this.field4843.method435(11, 0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIZII)V")
    public static final void method2000(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field4836++;
        if (class258.field3835 != null && (arg1 != 3 || class4.field81.field1455 != arg4 || class4.field81.field1429 != arg2)) {
            class390.method2259(class268.field3914, class258.field3835, (byte) -126);
            class258.field3835 = null;
        }
        if (arg1 == 3 && class258.field3835 == null) {
            class258.field3835 = class289.method1789(arg4, class268.field3914, arg2, 0, 0, -123);
            if (class258.field3835 != null) {
                class4.field81.field1429 = arg2;
                class4.field81.field1455 = arg4;
                class4.field81.method1784((byte) 127, class268.field3914);
            }
        }
        if (arg1 == 3 && class258.field3835 == null) {
            method2000(768, class4.field81.field1415, -1, true, -1, arg5);
            return;
        }
        Container var6;
        if (class258.field3835 != null) {
            var6 = class258.field3835;
            class285.field4177 = arg2;
            class47.field542 = arg4;
        } else if (class81.field1052 == null) {
            var6 = class268.field3914.field2165;
            class47.field542 = var6.getSize().width;
            class285.field4177 = var6.getSize().height;
        } else {
            Insets var7 = class81.field1052.getInsets();
            class47.field542 = class81.field1052.getSize().width - var7.right - var7.left;
            int var10001 = -var7.top;
            class285.field4177 = class81.field1052.getSize().height + var10001 - var7.bottom;
            var6 = class81.field1052;
        }
        if (arg1 == 1) {
            class147.field1956 = class196.field2793;
            class226.field3256 = 0;
            class205.field2971 = (class47.field542 - class196.field2793) / 2;
            class273.field4048 = class423.field5964;
        } else if (class494.field6991 < 96 && class405.field5737 == 0) {
            int var8 = class47.field542 <= 1024 ? class47.field542 : 1024;
            class205.field2971 = (class47.field542 - var8) / 2;
            int var9 = class285.field4177 <= 768 ? class285.field4177 : 768;
            class147.field1956 = var8;
            class273.field4048 = var9;
            class226.field3256 = 0;
        } else {
            class147.field1956 = class47.field542;
            class205.field2971 = 0;
            class273.field4048 = class285.field4177;
            class226.field3256 = 0;
        }
        if (class293.field4292 != class257.field3825) {
            boolean var10000;
            if (class147.field1956 < 1024 && class273.field4048 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg3) {
            class172.method1076((byte) -72);
        } else {
            class487.field6799.setSize(class147.field1956, class273.field4048);
            class385.field5414.method289(class487.field6799);
            if (class81.field1052 == var6) {
                Insets var10 = class81.field1052.getInsets();
                class487.field6799.setLocation(var10.left + class205.field2971, class226.field3256 + var10.top);
            } else {
                class487.field6799.setLocation(class205.field2971, class226.field3256);
            }
        }
        if (arg1 < 2) {
            class217.field3152 = false;
        } else {
            class217.field3152 = true;
        }
        if (class472.field6578 != -1) {
            class106.method719(arg0 ^ 0x302, true);
        }
        if (class50.field608 != null && class271.method1714(class488.field6832, 10)) {
            class510.method3046(true);
        }
        for (int var11 = 0; var11 < 100; var11++) {
            class306.field4450[var11] = true;
        }
        if (arg0 != 768) {
            field4837 = null;
        }
        class376.field5333 = true;
    }

    static {
        new class530(null, "Dieses System darf nicht missbraucht werden!", null, null);
        field4847 = new class242(12, 7);
        field4848 = new class60(51, 7);
    }
}
