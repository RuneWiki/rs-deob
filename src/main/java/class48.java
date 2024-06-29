import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class48 extends class638 {

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public static int field798 = 0;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "Lcb;")
    public static class631 field796 = new class631(61, 12);

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "Lov;")
    public class668 field792;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "Z")
    public boolean field794;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "[Lqw;")
    public class385[] field795;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([BIZ)Ljava/lang/Object;", line = 5)
    public static final Object method481(byte[] arg0, int arg1, boolean arg2) {
        if (arg1 < 109) {
            return null;
        }
        field797++;
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class285.field4395) {
            try {
                class691 var3 = (class691) Class.forName("bha").getDeclaredConstructor().newInstance();
                var3.method1919(arg0, 1);
                return var3;
            } catch (Throwable var4) {
                class285.field4395 = true;
            }
        }
        return arg2 ? class604.method3462(-21039, arg0) : arg0;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V", line = 41)
    public static void method482(byte arg0) {
        if (arg0 != 124) {
            field798 = 63;
        }
        field796 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZLbfa;I)V", line = 53)
    public static final void method483(boolean arg0, class573 arg1, int arg2) {
        field793++;
        if (class608.field8588 >= 400) {
            return;
        }
        if (class145.field2251 != arg1) {
            if (arg2 < 69) {
                field798 = 54;
            }
            String var7;
            if (arg1.field8119 == 0) {
                boolean var3 = true;
                if (class145.field2251.field8151 != -1 && arg1.field8151 != -1) {
                    int var4 = class145.field2251.field8151 < arg1.field8151 ? class145.field2251.field8151 : arg1.field8151;
                    int var5 = class145.field2251.field8121 - arg1.field8121;
                    if (var5 < 0) {
                        var5 = -var5;
                    }
                    if (var5 > var4) {
                        var3 = false;
                    }
                }
                String var6 = class519.field7498 == class322.field4757 ? class641.field9023.method3621(106, class467.field6804) : class641.field9021.method3621(89, class467.field6804);
                if (arg1.field8121 < arg1.field8116) {
                    var7 = arg1.method3326(true, true) + (var3 ? class446.method2723(class145.field2251.field8121, arg1.field8121, -113) : "<col=ffffff>") + " (" + var6 + arg1.field8121 + "+" + (arg1.field8116 - arg1.field8121) + ")";
                } else {
                    var7 = arg1.method3326(true, true) + (var3 ? class446.method2723(class145.field2251.field8121, arg1.field8121, -88) : "<col=ffffff>") + " (" + var6 + arg1.field8121 + ")";
                }
            } else if (arg1.field8119 == -1) {
                var7 = arg1.method3326(true, true);
            } else {
                var7 = arg1.method3326(true, true) + " (" + class641.field9022.method3621(103, class467.field6804) + arg1.field8119 + ")";
            }
            if (class552.field7867 && !arg0 && (class553.field7869 & 0x8) != 0) {
                class467.field6807++;
                class274.method1800(0, class355.field5375 + " -> <col=ffffff>" + var7, true, (byte) 96, false, class400.field5936, 0, -1, (long) arg1.field1628, false, class131.field2134, 51, (long) arg1.field1628);
            }
            if (arg0) {
                class274.method1800(0, "", false, (byte) -84, false, -1, 0, 0, (long) arg1.field1628, true, "<col=cccccc>" + var7, -1, 0L);
            } else {
                for (int var8 = 7; var8 >= 0; var8--) {
                    if (class379.field5700[var8] != null) {
                        short var9 = 0;
                        if (class565.field8012 == class519.field7498 && class379.field5700[var8].equalsIgnoreCase(class641.field9016.method3621(114, class467.field6804))) {
                            if (class145.field2251.field8121 < arg1.field8121) {
                                var9 = 2000;
                            }
                            if (class145.field2251.field8104 != 0 && arg1.field8104 != 0) {
                                if (class145.field2251.field8104 == arg1.field8104) {
                                    var9 = 2000;
                                } else {
                                    var9 = 0;
                                }
                            }
                        } else if (class742.field10413[var8]) {
                            var9 = 2000;
                        }
                        short var10 = (short) (class584.field8252[var8] + var9);
                        int var11 = class166.field2563[var8] == -1 ? class380.field5712 : class166.field2563[var8];
                        class239.field3844++;
                        class274.method1800(0, "<col=ffffff>" + var7, true, (byte) 108, false, var11, 0, -1, (long) arg1.field1628, false, class379.field5700[var8], var10, (long) arg1.field1628);
                    }
                }
            }
            if (!arg0) {
                for (class208 var12 = (class208) class344.field5093.method3463((byte) -50); var12 != null; var12 = (class208) class344.field5093.method3469((byte) 107)) {
                    if (var12.field3488 == 16) {
                        var12.field3482 = "<col=ffffff>" + var7;
                        return;
                    }
                }
            }
        } else if (class552.field7867 && (class553.field7869 & 0x10) != 0) {
            class274.method1800(0, class355.field5375 + " -> <col=ffffff>" + class641.field9030.method3621(110, class467.field6804), true, (byte) -106, false, class400.field5936, 0, -1, (long) arg1.field1628, false, class131.field2134, 20, 0L);
            class614.field8648++;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILha;B)Z", line = 206)
    public final boolean method484(int arg0, int arg1, class544 arg2, byte arg3) {
        field791++;
        int var5 = this.field792.method2830(-82);
        if (arg3 != 35) {
            this.field795 = null;
        }
        if (this.field795 != null) {
            for (int var6 = 0; var6 < this.field795.length; var6++) {
                this.field795[var6].field5769 <<= var5;
                if (this.field795[var6].method2414(arg1, arg0) && this.field792.method94(arg1, arg0, arg2, 88)) {
                    this.field795[var6].field5769 >>= var5;
                    return true;
                }
                this.field795[var6].field5769 >>= var5;
            }
        }
        return false;
    }
}
