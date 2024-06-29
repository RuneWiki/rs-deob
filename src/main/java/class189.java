import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class189 extends class37 {

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    private int field3011;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    private int field3016;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    private int field3017;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    private int field3013;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "Lrp;")
    public static class288 field3019 = new class288(20);

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "[I")
    public static int[] field3020 = new int[5];

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "J")
    public static long field3021 = 0L;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "[Lig;")
    public static class154[] field3022;

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IIIIII)V", line = 10)
    public class189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3011 = arg1;
        this.field3016 = arg3;
        this.field3017 = arg0;
        this.field3013 = arg2;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V", line = 24)
    public static void method1194(int arg0) {
        field3019 = null;
        field3020 = null;
        int var1 = -53 % ((arg0 - -60) / 47);
        field3022 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZ)I", line = 35)
    public static final int method1195(int arg0, boolean arg1) {
        if (arg1) {
            method1197((class260) null, true, true, (String) null, 116);
        }
        ++field3010;
        return 255 & arg0;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V", line = 48)
    public final void method36(int arg0, int arg1, int arg2) {
        if (arg0 == 1) {
            ++field3015;
            int var4 = this.field3017 * arg1 >> 12;
            int var5 = this.field3013 * arg1 >> 12;
            int var6 = this.field3011 * arg2 >> 12;
            int var7 = this.field3016 * arg2 >> 12;
            class187.method1159(293599692, var4, var7, var5, super.field500, var6);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)V", line = 67)
    public static final void method1196(int arg0, int arg1) {
        ++field3014;
        if (client.field2992 != arg0) {
            if (client.field2992 == 0) {
                class378.method2274((byte) -127);
            }
            if (arg0 == 40) {
                class99.method747(arg1 + 12128);
            }
            if (~arg0 != -41 && class332.field4975 != null) {
                class332.field4975.method1795((byte) 122);
                class332.field4975 = null;
            }
            if (client.field2992 == 25 || ~client.field2992 == -29) {
                class207.field3242.field7042 = 2;
                class237.field3590.field7042 = 2;
                class504.field7613.field7042 = 2;
                class409.field5934.field7042 = 2;
                class478.field7307.field7042 = 2;
                class315.field4751.field7042 = 2;
                class245.field3680.field7042 = 2;
            }
            if (arg0 == 25 || arg0 == 28) {
                class457.field7006 = 0;
                class500.field7583 = 1;
                class494.field7524 = 0;
                class178.field2788 = 0;
                class17.field231 = 1;
                class434.method2536(-20860, true);
                class207.field3242.field7042 = 1;
                class237.field3590.field7042 = 1;
                class504.field7613.field7042 = 1;
                class409.field5934.field7042 = 1;
                class478.field7307.field7042 = 1;
                class315.field4751.field7042 = 1;
                class245.field3680.field7042 = 1;
            }
            if (arg0 == 25 || ~arg0 == -11) {
                class218.method1339((byte) -94);
            }
            if (arg0 == 5) {
                class114.method818(class472.field7225, 127, class345.field5116);
            } else {
                class39.method215(-18462);
            }
            if (arg1 != -12254) {
                method1196(-72, -44);
            }
            boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
            boolean var3 = client.field2992 == 5 || client.field2992 == 10 || client.field2992 == 28;
            if (var3 == !var2) {
                if (!var2) {
                    class15.method82((byte) 71, 2);
                    class284.field4297.method2871(21751, true);
                } else {
                    class338.field5058 = class131.field2092;
                    if (~class463.field7116.field2960 == -1) {
                        class15.method82((byte) 103, 2);
                    } else {
                        class395.method2341(class131.field2092, 2, false, 0, (byte) -106, class463.field7116.field2960, class471.field7207);
                    }
                    class284.field4297.method2871(21751, false);
                }
            }
            if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
                class345.field5116.method1909();
            }
            client.field2992 = arg0;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lhf;ZZLjava/lang/String;I)V", line = 167)
    public static final void method1197(class260 arg0, boolean arg1, boolean arg2, String arg3, int arg4) {
        ++field3018;
        if (arg1) {
            if (class260.field3940.startsWith("win") && ~class260.field3942 != -4) {
                String var5 = null;
                if (arg0.field3929 != null) {
                    var5 = arg0.field3929.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class180 var6 = class137.method911(-88, arg3, arg0, 0);
                    class280.field4256 = arg3;
                    class25.field325 = var6;
                    class397.field5788 = arg0;
                    return;
                }
            }
            if (class260.field3940.startsWith("mac")) {
                String var7 = null;
                if (arg0.field3929 != null) {
                    var7 = arg0.field3929.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg2) {
                    class137.method911(arg4 ^ 91, arg3, arg0, 1);
                    return;
                }
            }
            class137.method911(-86, arg3, arg0, 2);
        } else {
            class137.method911(84, arg3, arg0, 3);
        }
        if (arg4 != 2) {
            field3020 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIB)V", line = 232)
    public final void method30(int arg0, int arg1, byte arg2) {
        ++field3012;
        int var4 = -77 % ((arg2 - 36) / 36);
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(III)V", line = 242)
    public final void method32(int arg0, int arg1, int arg2) {
        ++field3009;
        if (arg1 != 10) {
            this.field3017 = -96;
        }
    }
}
