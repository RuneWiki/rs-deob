import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class384 {

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "I")
    private int field5575 = 0;

    @OriginalMember(owner = "client!pda", name = "j", descriptor = "Lnj;")
    private class436 field5583;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "I")
    public static int field5574 = -1;

    @OriginalMember(owner = "client!pda", name = "i", descriptor = "I")
    public static int field5582 = 503;

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!pda", name = "e", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!pda", name = "f", descriptor = "I")
    public static int field5579;

    @OriginalMember(owner = "client!pda", name = "g", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!pda", name = "h", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "Lsf;")
    private class28 field5576;

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "()V", line = 237)
    public class384() {
    }

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Lnj;)V", line = 239)
    public class384(class436 arg0) {
        this.field5583 = arg0;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)Lsf;", line = 9)
    public final class28 method2317(int arg0) {
        field5580++;
        this.field5575 = 0;
        int var2 = -86 % (-arg0 / 42);
        return this.method2318(-415116576);
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(I)Lsf;", line = 22)
    public final class28 method2318(int arg0) {
        field5578++;
        if (this.field5575 > 0 && this.field5583.field6018[this.field5575 - 1] != this.field5576) {
            class28 var2 = this.field5576;
            this.field5576 = var2.field276;
            return var2;
        }
        if (arg0 != -415116576) {
            field5574 = -77;
        }
        while (this.field5575 < this.field5583.field6022) {
            class28 var3 = this.field5583.field6018[this.field5575++].field276;
            if (this.field5583.field6018[this.field5575 - 1] != var3) {
                this.field5576 = var3.field276;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lrq;I)V", line = 55)
    public static final void method2319(class39 arg0, int arg1) {
        if (arg1 != -30470) {
            return;
        }
        field5577++;
        if (arg0 instanceof class676) {
            class676 var2 = (class676) arg0;
            if (var2.field9594 != null) {
                class456.method2580(10, var2, class596.field8164.field3925 != var2.field3925);
                return;
            }
        } else if ((arg0 instanceof class519)) {
            class519 var3 = (class519) arg0;
            class520.method2974(class596.field8164.field3925 != var3.field3925, var3, 2000);
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILoa;)V", line = 91)
    public static final void method2320(int arg0, class689 arg1) {
        field5581++;
        int var2 = -62 % ((31 - arg0) / 59);
        if (!(class179.field2242 >= 2 || class613.field8378) || class377.field5414 != null) {
            return;
        }
        String var3;
        if (class613.field8378 && class179.field2242 < 2) {
            var3 = class306.field4114 + class243.field3243.method1491(class350.field5121, (byte) 125) + class665.field9444 + " ->";
        } else if (class483.field6541 && class348.field5096.method32(81, -123) && class179.field2242 > 2) {
            var3 = class192.method1229(104, (class69) class37.field371.field825.field275.field275);
        } else {
            class69 var4 = (class69) class37.field371.field825.field275;
            var3 = class192.method1229(119, var4);
            int[] var5 = null;
            if (class431.method2482(var4.field902, 21284)) {
                var5 = class237.field3088.method1349(-1, (int) var4.field900).field9316;
            } else if (var4.field905 != -1) {
                var5 = class237.field3088.method1349(-1, var4.field905).field9316;
            } else if (class668.method3705(var4.field902, false)) {
                class637 var8 = (class637) class77.field955.method2506(71, (long) ((int) var4.field900));
                if (var8 != null) {
                    class676 var9 = var8.field8702;
                    class195 var10 = var9.field9594;
                    if (var10.field2557 != null) {
                        var10 = var10.method1242(class327.field4771, (byte) -32);
                    }
                    if (var10 != null) {
                        var5 = var10.field2574;
                    }
                }
            } else if (class488.method2718(var4.field902, -17)) {
                Object var6 = null;
                class252 var7;
                if (var4.field902 == 1006) {
                    var7 = class578.field7980.method1746((int) var4.field900, (byte) 125);
                } else {
                    var7 = class578.field7980.method1746((int) (var4.field900 >>> 32 & 0x7FFFFFFFL), (byte) 86);
                }
                if (var7.field3391 != null) {
                    var7 = var7.method1568(-1, class327.field4771);
                }
                if (var7 != null) {
                    var5 = var7.field3468;
                }
            }
            if (var5 != null) {
                var3 = var3 + class436.method2511(0, var5);
            }
        }
        if (class179.field2242 > 2) {
            var3 = var3 + "<col=ffffff> / " + (class179.field2242 - 2) + class243.field3236.method1491(class350.field5121, (byte) 125);
        }
        if (class541.field7416 != null) {
            class301 var12 = class541.field7416.method1208(arg1, -4616);
            if (var12 == null) {
                var12 = class622.field8452;
            }
            var12.method1819(class541.field7416.field2349, class541.field7416.field2464, class60.field842, class541.field7416.field2371, class466.field6348, class24.field230, class541.field7416.field2355, (byte) -20, var3, class635.field8652, class315.field4561, class541.field7416.field2362, class623.field8475, class541.field7416.field2438, class367.field5293);
            class87.method490(class466.field6348[3], class466.field6348[1], class466.field6348[0], class466.field6348[2], -29041);
        } else if (class462.field6293 != null && class369.field5313 == class33.field322) {
            int var11 = class622.field8452.method1811(class77.field970 + 4, class24.field230, var3, class367.field5293, 0, class315.field4561, 16777215, class623.field8475, class330.field4834 + 16, (byte) -89);
            class87.method490(16, class330.field4834, class77.field970 + 4, class446.field6129.method3312(-23728, var3) - -var11, -29041);
            return;
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(IBIIZ)Ll;", line = 195)
    public static final class524 method2321(int arg0, byte arg1, int arg2, int arg3, boolean arg4) {
        field5579++;
        class524 var5 = new class524();
        var5.field7256 = arg3;
        var5.field7255 = arg0;
        class54.field742.method2504((long) arg2, 126, var5);
        class690.method3822(true, arg3);
        if (arg1 < 106) {
            field5574 = 78;
        }
        class188 var6 = class557.method3117(arg2, (byte) 71);
        if (var6 != null) {
            class553.method3100(var6, 0);
        }
        if (class12.field114 != null) {
            class553.method3100(class12.field114, 0);
            class12.field114 = null;
        }
        class544.method3065(47);
        if (var6 != null) {
            class59.method370(104, !arg4, var6);
        }
        if (!arg4) {
            class317.method2041(arg3);
        }
        if (!arg4 && class316.field4599 != -1) {
            class175.method1162(1, 2, class316.field4599);
        }
        return var5;
    }
}
