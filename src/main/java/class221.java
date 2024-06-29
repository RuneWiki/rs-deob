import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class221 extends class46 {

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    private final int field3793;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    private final int field3791;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    private final int field3794;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
    private final int field3802;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "Z")
    public static boolean field3790 = false;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
    public static int field3799 = 0;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public static int field3795 = 0;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
    public static int field3798 = 0;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
    public static int field3803 = 0;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
    public static int field3805 = 0;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "Lje;")
    public static class111 field3800;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "[Lwg;")
    public static class24[] field3806;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZI)V", line = 5)
    public final void method298(int arg0, boolean arg1, int arg2) {
        field3796++;
        int var4 = this.field3802 * arg0 >> 12;
        int var5 = this.field3794 * arg0 >> 12;
        if (arg1) {
            field3806 = (class24[]) null;
        }
        int var6 = this.field3793 * arg2 >> 12;
        int var7 = this.field3791 * arg2 >> 12;
        class114.method888(this.field690, var7, 687, var6, var4, var5);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILcc;)V", line = 25)
    public static final void method1571(int arg0, class205 arg1) {
        field3792++;
        class201.method1406(-56);
        if (arg0 > -30) {
            field3800 = (class111) null;
        }
        if (class53.field779 != null) {
            return;
        }
        if (!class208.field3527) {
            class194.method1360((byte) -105);
        } else if (class235.field4049 == 1) {
            int var2 = class72.field1103 / 5;
            int var3 = class36.field497 + var2 + 140;
            if (class171.field2786 >= var3 && class171.field2786 <= (var3 + 14) && class207.field3520 >= (class209.field3542 + 4) && class209.field3542 + 18 >= class207.field3520) {
                class181.method1266(0, 0, 20450);
                return;
            }
            if (class171.field2786 >= var3 + 15 && var3 + 80 >= class171.field2786 && (class209.field3542 + 4) <= class207.field3520 && class207.field3520 <= (class209.field3542 + 18)) {
                class181.method1266(1, 0, 20450);
                return;
            }
            int var4 = class36.field497 + var2 + 250;
            if (var4 <= class171.field2786 && class171.field2786 <= (var4 + 14) && class209.field3542 + 4 <= class207.field3520 && class207.field3520 <= (class209.field3542 + 18)) {
                class181.method1266(0, 1, 20450);
                return;
            }
            if (class171.field2786 >= var4 + 15 && class171.field2786 <= var4 + 80 && class209.field3542 + 4 <= class207.field3520 && class207.field3520 <= (class209.field3542 + 18)) {
                class181.method1266(1, 1, 20450);
                return;
            }
            int var5 = class36.field497 + var2 + 360;
            if (var5 <= class171.field2786 && var5 + 14 >= class171.field2786 && class207.field3520 >= (class209.field3542 + 4) && (class209.field3542 + 18) >= class207.field3520) {
                class181.method1266(0, 2, 20450);
                return;
            }
            if (var5 + 15 <= class171.field2786 && class171.field2786 <= (var5 + 80) && (class209.field3542 + 4) <= class207.field3520 && class207.field3520 <= class209.field3542 + 18) {
                class181.method1266(1, 2, 20450);
                return;
            }
            int var6 = class36.field497 + var2 + 470;
            if (var6 <= class171.field2786 && class171.field2786 <= (var6 + 14) && class207.field3520 >= class209.field3542 + 4 && class207.field3520 <= class209.field3542 + 18) {
                class181.method1266(0, 3, 20450);
                return;
            }
            if (class171.field2786 >= var6 + 15 && (var6 + 80) >= class171.field2786 && (class209.field3542 + 4) <= class207.field3520 && class207.field3520 <= (class209.field3542 + 18)) {
                class181.method1266(1, 3, 20450);
                return;
            }
            if (class133.field2166 != -1) {
                class193 var7 = class20.field215[class133.field2166];
                if (class294.field5021 == var7.field3242) {
                    byte[] var8 = class254.method1772(new class62[] { var7.field3240, class194.field3255 }, 0).method404(-231);
                    class36.field474 = new String(var8, 0, var8.length);
                    class123.field2046 = var7.field3252;
                    if (class101.field1669 != 0) {
                        class243.field4136 = class123.field2046 + 50000;
                        class20.field202 = class123.field2046 + 40000;
                        class78.field1315 = class20.field202;
                    }
                    if (class141.field2270 != null) {
                        class141.field2270.field3116 = true;
                        class250.method1744(class141.field2270, (byte) -109);
                    }
                    return;
                }
                class62 var9 = class119.field1993;
                if (class101.field1669 != 0) {
                    var9 = class254.method1772(new class62[] { class190.field3030, class42.method284(var7.field3252 + 7000, -119) }, 0);
                }
                class62 var10 = class254.method1772(new class62[] { class199.field3358, var7.field3240, class194.field3255, var9, class216.field3680, class42.method284(class185.field2964, -118), class69.field1065, class42.method284(class291.field4950, -122), class41.field634, class42.method284(1, -123), class276.field4727, class42.method284(class278.field4772, -121), class123.field2038, class42.method284(class19.field186, -127) }, 0);
                try {
                    arg1.getAppletContext().showDocument(var10.method433(119), "_self");
                } catch (Exception var12) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljm;III)V", line = 179)
    public static final void method1572(class123 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class114.field1900) {
            class166 var4 = class256.field4320[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field2711 != null && var4.field2711.field443.method578()) {
                arg0.method572(var4.field2711.field443, 128, 0, 0, true);
            }
        }
        if (arg3 < class114.field1900) {
            class166 var5 = class256.field4320[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field2711 != null && var5.field2711.field443.method578()) {
                arg0.method572(var5.field2711.field443, 0, 0, 128, true);
            }
        }
        if (arg2 < class114.field1900 && arg3 < class252.field4273) {
            class166 var6 = class256.field4320[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field2711 != null && var6.field2711.field443.method578()) {
                arg0.method572(var6.field2711.field443, 128, 0, 128, true);
            }
        }
        if (arg2 < class114.field1900 && arg3 > 0) {
            class166 var7 = class256.field4320[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field2711 != null && var7.field2711.field443.method578()) {
                arg0.method572(var7.field2711.field443, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIIIII)V", line = 226)
    public static final void method1573(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3797++;
        class148 var10 = (class148) class68.field1053.method334(arg5 ^ 0xFFFFCA3F);
        class148 var11 = null;
        while (var10 != null) {
            if (var10.field2330 == arg4 && var10.field2341 == arg9 && var10.field2342 == arg0 && var10.field2344 == arg1) {
                var11 = var10;
                break;
            }
            var10 = (class148) class68.field1053.method335((byte) 87);
        }
        if (var11 == null) {
            var11 = new class148();
            var11.field2342 = arg0;
            var11.field2330 = arg4;
            var11.field2344 = arg1;
            var11.field2341 = arg9;
            class228.method1611(var11, -1);
            class68.field1053.method330(var11, 119);
        }
        var11.field2339 = arg8;
        var11.field2338 = arg7;
        var11.field2337 = arg2;
        if (arg5 == 32048) {
            var11.field2336 = arg3;
            var11.field2331 = arg6;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V", line = 268)
    public final void method297(int arg0, int arg1, int arg2) {
        field3789++;
        int var4 = this.field3794 * arg0 >> 12;
        int var5 = this.field3793 * arg1 >> 12;
        if (arg2 == 31462) {
            int var6 = this.field3791 * arg1 >> 12;
            int var7 = this.field3802 * arg0 >> 12;
            class118.method922(this.field686, this.field687, this.field690, var7, true, var5, var4, var6);
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IIIIIII)V", line = 286)
    public class221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3793 = arg1;
        this.field3791 = arg3;
        this.field3794 = arg0;
        this.field3802 = arg2;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V", line = 298)
    public static void method1574(byte arg0) {
        field3806 = null;
        field3800 = null;
        if (arg0 > -11) {
            method1574((byte) 88);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBI)V", line = 327)
    public final void method301(int arg0, byte arg1, int arg2) {
        if (arg1 != -13) {
            this.method297(56, 21, 9);
        }
        field3801++;
    }
}
