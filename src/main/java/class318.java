import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class318 {

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Lju;")
    private class83 field4827 = new class83();

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    private int field4828;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    private int field4835;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "Lmn;")
    private class249 field4838;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "Lbj;")
    public static class162 field4837 = new class162(69, 3);

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public static int field4841 = -1;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILjava/lang/Object;Lws;I)V")
    private final void method2018(int arg0, Object arg1, class241 arg2, int arg3) {
        field4829++;
        if (arg0 > this.field4835) {
            throw new IllegalStateException("s>cs");
        }
        this.method2024(0, arg2);
        this.field4828 -= arg0;
        if (arg3 != 256) {
            field4837 = null;
        }
        while (this.field4828 < 0) {
            class95 var6 = (class95) this.field4827.method777((byte) -18);
            this.method2019(var6, (byte) 36);
        }
        class214 var5 = new class214(arg2, arg1, arg0);
        this.field4838.method1618(var5, arg2.method1577((byte) 60), arg3 - 257);
        this.field4827.method776(0, var5);
        var5.field3034 = 0L;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lls;B)V")
    private final void method2019(class95 arg0, byte arg1) {
        int var3 = -16 % ((-arg1 - 21) / 49);
        if (arg0 != null) {
            arg0.method1676(true);
            arg0.method1289((byte) -78);
            this.field4828 += arg0.field1860;
        }
        field4831++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)V")
    public final void method2020(int arg0, byte arg1) {
        field4830++;
        if (arg1 > -109) {
            field4841 = 115;
        }
        if (class420.field6335 == null) {
            return;
        }
        for (class95 var3 = (class95) this.field4827.method779(1); var3 != null; var3 = (class95) this.field4827.method780((byte) 125)) {
            if (var3.method855(8639)) {
                if (var3.method854(0) == null) {
                    var3.method1676(true);
                    var3.method1289((byte) 105);
                    this.field4828 += var3.field1860;
                }
            } else if (++var3.field3034 > (long) arg0) {
                class95 var4 = class420.field6335.method1097(var3, 8);
                this.field4838.method1618(var4, var3.field3977, -1);
                class338.method2124(126, var4, var3);
                var3.method1676(true);
                var3.method1289((byte) -79);
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILws;)Ljava/lang/Object;")
    public final Object method2021(int arg0, class241 arg1) {
        field4839++;
        long var3 = arg1.method1577((byte) 79);
        if (arg0 != 0) {
            this.method2025(-45);
        }
        for (class95 var5 = (class95) this.field4838.method1622(var3, 61); var5 != null; var5 = (class95) this.field4838.method1620(arg0 ^ 0xFFFFFF99)) {
            if (var5.field1866.method1578(2185, arg1)) {
                Object var6 = var5.method854(0);
                if (var6 != null) {
                    if (var5.method855(8639)) {
                        class214 var7 = new class214(arg1, var6, var5.field1860);
                        this.field4838.method1618(var7, var5.field3977, -1);
                        this.field4827.method776(arg0, var7);
                        var7.field3034 = 0L;
                        var5.method1676(true);
                        var5.method1289((byte) 104);
                    } else {
                        this.field4827.method776(0, var5);
                        var5.field3034 = 0L;
                    }
                    return var6;
                }
                var5.method1676(true);
                var5.method1289((byte) -123);
                this.field4828 += var5.field1860;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILjava/lang/Object;Lws;)V")
    public final void method2022(int arg0, Object arg1, class241 arg2) {
        field4826++;
        this.method2018(arg0, arg1, arg2, arg0 + 255);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Llt;BLjava/awt/Component;II)Lon;")
    public static final class223 method2023(class480 arg0, byte arg1, Component arg2, int arg3, int arg4) {
        field4836++;
        if (class200.field3254 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class223 var5 = (class223) Class.forName("mi").getDeclaredConstructor().newInstance();
                var5.field3481 = new int[(class315.field4754 ? 2 : 1) * 256];
                var5.field3498 = arg3;
                var5.method1488(arg2);
                var5.field3493 = (arg3 & 0xFFFFFC00) + 1024;
                if (var5.field3493 > 16384) {
                    var5.field3493 = 16384;
                }
                var5.method1497(var5.field3493);
                if (class395.field6022 > 0 && class466.field6929 == null) {
                    class466.field6929 = new class499();
                    class466.field6929.field7325 = arg0;
                    arg0.method2860(-94, class395.field6022, class466.field6929);
                }
                if (class466.field6929 != null) {
                    if (class466.field6929.field7322[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class466.field6929.field7322[arg4] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                if (arg1 != -96) {
                    return null;
                }
                try {
                    class437 var6 = new class437(arg0, arg4);
                    var6.field3481 = new int[(class315.field4754 ? 2 : 1) * 256];
                    var6.field3498 = arg3;
                    var6.method1488(arg2);
                    var6.field3493 = 16384;
                    var6.method1497(var6.field3493);
                    if (class395.field6022 > 0 && class466.field6929 == null) {
                        class466.field6929 = new class499();
                        class466.field6929.field7325 = arg0;
                        arg0.method2860(-85, class395.field6022, class466.field6929);
                    }
                    if (class466.field6929 != null) {
                        if (class466.field6929.field7322[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class466.field6929.field7322[arg4] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class223();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(ILws;)V")
    private final void method2024(int arg0, class241 arg1) {
        field4834++;
        long var3 = arg1.method1577((byte) 18);
        if (arg0 != 0) {
            return;
        }
        for (class95 var5 = (class95) this.field4838.method1622(var3, arg0 + 28); var5 != null; var5 = (class95) this.field4838.method1620(arg0 ^ 0xFFFFFF98)) {
            if (var5.field1866.method1578(2185, arg1)) {
                this.method2019(var5, (byte) 124);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)I")
    public final int method2025(int arg0) {
        field4840++;
        return arg0 >= -10 ? -38 : this.field4835;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
    public final void method2026(int arg0) {
        field4825++;
        class95 var2 = (class95) this.field4827.method779(arg0 + 7280);
        if (arg0 != -7279) {
            return;
        }
        while (var2 != null) {
            if (var2.method855(8639)) {
                var2.method1676(true);
                var2.method1289((byte) 95);
                this.field4828 += var2.field1860;
            }
            var2 = (class95) this.field4827.method780((byte) 116);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
    public static void method2027(byte arg0) {
        if (arg0 != 126) {
            method2027((byte) 53);
        }
        field4837 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)I")
    public final int method2028(boolean arg0) {
        field4832++;
        return arg0 ? this.field4828 : 97;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(Z)V")
    public final void method2029(boolean arg0) {
        this.field4827.method783((byte) -104);
        field4833++;
        if (!arg0) {
            this.method2022(6, null, null);
        }
        this.field4838.method1614((byte) -24);
        this.field4828 = this.field4835;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(I)V")
    public class318(int arg0) {
        this.field4828 = arg0;
        this.field4835 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field4838 = new class249(var2);
    }
}
