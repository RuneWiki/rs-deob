import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class196 extends class205 {

    @OriginalMember(owner = "client!sh", name = "Z", descriptor = "Lvd;")
    private static class222 field3567 = class212.method1357("Loading title screen )2 ", 10731);

    @OriginalMember(owner = "client!sh", name = "X", descriptor = "Lvd;")
    public static class222 field3565 = field3567;

    @OriginalMember(owner = "client!sh", name = "db", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3571 = new CRC32();

    @OriginalMember(owner = "client!sh", name = "gb", descriptor = "[I")
    public static int[] field3574 = new int[100];

    @OriginalMember(owner = "client!sh", name = "fb", descriptor = "Lvd;")
    private static class222 field3573 = class212.method1357("To play on this world move to a free area first)3", 10731);

    @OriginalMember(owner = "client!sh", name = "hb", descriptor = "[I")
    public static int[] field3575 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!sh", name = "ib", descriptor = "Lvd;")
    public static class222 field3576 = field3573;

    @OriginalMember(owner = "client!sh", name = "kb", descriptor = "Lvd;")
    public static class222 field3578 = class212.method1357("Lade Titelbild )2 ", 10731);

    @OriginalMember(owner = "client!sh", name = "lb", descriptor = "Lvd;")
    private static class222 field3579 = class212.method1357("Please wait )2 attempting to reestablish)3", 10731);

    @OriginalMember(owner = "client!sh", name = "jb", descriptor = "Lvd;")
    public static class222 field3577 = field3579;

    @OriginalMember(owner = "client!sh", name = "V", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!sh", name = "W", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!sh", name = "Y", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!sh", name = "ab", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!sh", name = "bb", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!sh", name = "cb", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!sh", name = "eb", descriptor = "Lva;")
    public static class219 field3572;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 >= class112.field2107 && class127.field2448 >= arg0 && ~class129.field2514 >= ~arg6 && ~arg3 >= ~class230.field4322) {
            if (arg1 != 1) {
                class125.method793(arg6, arg2, arg0, arg3, arg5, 0, arg1);
            } else {
                class57.method417(arg0, arg5, -8193, arg2, arg6, arg3);
            }
        } else if (arg1 == 1) {
            class63.method436(arg3, arg4 + 23496, arg2, arg0, arg6, arg5);
        } else {
            class101.method623(arg0, (byte) -120, arg3, arg6, arg5, arg1, arg2);
        }
        ++field3569;
        if (arg4 != 6854) {
            method1209(73, 25, -60, -68);
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
    public class196() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lca;)V")
    public static final void method1205(class23 arg0) {
        for (int var1 = arg0.field534; var1 <= arg0.field549; ++var1) {
            for (int var2 = arg0.field539; var2 <= arg0.field535; ++var2) {
                class121 var3 = class204.field3800[arg0.field548][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field2299; ++var4) {
                        if (var3.field2297[var4] == arg0) {
                            --var3.field2299;
                            for (int var5 = var4; var5 < var3.field2299; ++var5) {
                                var3.field2297[var5] = var3.field2297[var5 + 1];
                                var3.field2311[var5] = var3.field2311[var5 + 1];
                            }
                            var3.field2297[var3.field2299] = null;
                            break;
                        }
                    }
                    var3.field2312 = 0;
                    for (int var6 = 0; var6 < var3.field2299; ++var6) {
                        var3.field2312 |= var3.field2311[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "(I)V")
    public static void method1206(int arg0) {
        if (arg0 <= 75) {
            method1209(-32, -39, 29, -16);
        }
        field3573 = null;
        field3572 = null;
        field3578 = null;
        field3574 = null;
        field3571 = null;
        field3575 = null;
        field3579 = null;
        field3576 = null;
        field3565 = null;
        field3577 = null;
        field3567 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        int[] var3 = super.field3810.method557(6978, arg1);
        ++field3564;
        if (super.field3810.field1635) {
            class163.method1027(var3, 0, class118.field2245, class218.field4051[arg1]);
        }
        return arg0 != 0 ? null : var3;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)V")
    public static final void method1207(int arg0, int arg1) {
        ++field3566;
        if (arg1 == 111256966) {
            if (arg0 != -1) {
                if (class211.field3921[arg0]) {
                    class202.field3700.method29(0, arg0);
                    if (class220.field4066[arg0] != null) {
                        boolean var2 = true;
                        for (int var3 = 0; ~var3 > ~class220.field4066[arg0].length; ++var3) {
                            if (class220.field4066[arg0][var3] != null) {
                                if (~class220.field4066[arg0][var3].field365 != -3) {
                                    class220.field4066[arg0][var3] = null;
                                } else {
                                    var2 = false;
                                }
                            }
                        }
                        if (var2) {
                            class220.field4066[arg0] = null;
                        }
                        class211.field3921[arg0] = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z[B)V")
    public static final void method1208(boolean arg0, byte[] arg1) {
        ++field3563;
        if (arg0) {
            method1207(-56, 12);
        }
        int var2 = 0;
        while (true) {
            while (arg1.length > var2) {
                int var3 = 64 * (255 & arg1[var2++]) - class167.field3184;
                int var4 = 64 * (255 & arg1[var2++]) + -class59.field1107;
                if (var3 > 0 && ~var4 < -1 && class99.field1862 > var3 + 64 && ~(var4 + 64) > ~class38.field852) {
                    int var5 = var3 >> 6;
                    int var6 = class38.field852 - var4 + -1 >> 6;
                    for (int var7 = 0; var7 < 64; ++var7) {
                        for (int var8 = -64; var8 < 0; ++var8) {
                            byte var9 = arg1[var2++];
                            if (var9 != 0) {
                                if (class71.field1379[var5][var6] == null) {
                                    class71.field1379[var5][var6] = new byte[4096];
                                }
                                class71.field1379[var5][var6][(-(var8 + 1) << 6) + var7] = var9;
                                byte var10 = arg1[var2++];
                                if (class185.field3428[var5][var6] == null) {
                                    class185.field3428[var5][var6] = new byte[4096];
                                }
                                class185.field3428[var5][var6][(-(var8 + 1) << 6) + var7] = var10;
                            }
                        }
                    }
                } else {
                    for (int var11 = -4096; ~var11 > -1; ++var11) {
                        byte var12 = arg1[var2++];
                        if (~var12 != -1) {
                            ++var2;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIII)I")
    public static final int method1209(int arg0, int arg1, int arg2, int arg3) {
        ++field3568;
        int var4 = arg1 & 3;
        if (~var4 == -1) {
            return arg3;
        } else {
            if (arg2 < 77) {
                method1204(-109, -36, 97, 84, 92, 102, -74);
            }
            if (var4 == 1) {
                return arg0;
            } else {
                return ~var4 == -3 ? -arg3 + 7 : -arg0 + 7;
            }
        }
    }
}
