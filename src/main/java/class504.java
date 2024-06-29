import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class504 extends class642 {

    @OriginalMember(owner = "client!aw", name = "E", descriptor = "I")
    private int field7140 = 1;

    @OriginalMember(owner = "client!aw", name = "D", descriptor = "I")
    private int field7139 = 204;

    @OriginalMember(owner = "client!aw", name = "H", descriptor = "I")
    private int field7143 = 1;

    @OriginalMember(owner = "client!aw", name = "F", descriptor = "Lvg;")
    public static class622 field7141 = new class622(20, 4);

    @OriginalMember(owner = "client!aw", name = "B", descriptor = "I")
    public static int field7137;

    @OriginalMember(owner = "client!aw", name = "C", descriptor = "I")
    public static int field7138;

    @OriginalMember(owner = "client!aw", name = "G", descriptor = "I")
    public static int field7142;

    @OriginalMember(owner = "client!aw", name = "I", descriptor = "I")
    public static int field7144;

    @OriginalMember(owner = "client!aw", name = "J", descriptor = "I")
    public static int field7145;

    @OriginalMember(owner = "client!aw", name = "K", descriptor = "I")
    public static int field7146;

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "(I)V", line = 3)
    public static void method2869(int arg0) {
        field7141 = null;
        if (arg0 != 4) {
            method2871(-74, 66, -61, 101, 77, -90, (byte) 85, 42, -91);
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(BIII)I", line = 13)
    public static final int method2870(byte arg0, int arg1, int arg2, int arg3) {
        ++field7145;
        if (class178.field2480 == null) {
            return 0;
        } else if (arg0 > -115) {
            return -18;
        } else {
            int var4 = arg2 >> 9;
            int var5 = arg1 >> 9;
            if (~var4 <= -1 && var5 >= 0 && var4 <= class72.field1144 - 1 && class668.field9444 + -1 >= var5) {
                int var6 = arg3;
                if (arg3 < 3 && ~(class317.field4622[1][var4][var5] & 2) != -1) {
                    var6 = arg3 + 1;
                }
                return class178.field2480[var6].method3824(arg2, 119, arg1);
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "()V", line = 42)
    public class504() {
        super(0, true);
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIIIIBII)V", line = 46)
    public static final void method2871(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        ++field7137;
        if (class233.method1442(false, arg4)) {
            if (arg6 <= -13) {
                if (class379.field5710[arg4] != null) {
                    class148.method1061(arg7, arg0, arg1, arg8, arg5, arg2, -1, -57, class379.field5710[arg4], arg3);
                } else {
                    class148.method1061(arg7, arg0, arg1, arg8, arg5, arg2, -1, -79, class220.field2917[arg4], arg3);
                }
            }
        } else if (~arg1 != 0) {
            class394.field5969[arg1] = true;
        } else {
            for (int var9 = 0; ~var9 > -101; ++var9) {
                class394.field5969[var9] = true;
            }
        }
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(II)[I", line = 80)
    public final int[] method3(int arg0, int arg1) {
        ++field7146;
        int[] var3 = super.field9216.method1185(arg0, -110);
        if (arg1 != -9) {
            this.field7143 = -36;
        }
        if (super.field9216.field2418) {
            for (int var4 = 0; ~var4 > ~class338.field4909; ++var4) {
                int var5 = class542.field8026[var4];
                int var6 = class400.field6026[arg0];
                int var7 = this.field7143 * var5 >> 12;
                int var8 = this.field7140 * var6 >> 12;
                int var9 = var5 % (4096 / this.field7143) * this.field7143;
                int var10 = var6 % (4096 / this.field7140) * this.field7140;
                if (this.field7139 > var10) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field7139 < ~var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field7139 > var9) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "(II)V", line = 168)
    public static final void method2872(int arg0, int arg1) {
        class280.field3710 = arg0;
        class606.field8764 = 3;
        ++field7144;
        class164.field2305 = -1;
        class405.field6057 = 100;
        if (arg1 >= -2) {
            field7141 = null;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(ILgk;B)V", line = 188)
    public final void method1(int arg0, class540 arg1, byte arg2) {
        if (arg2 <= 29) {
            this.field7139 = 94;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field7139 = arg1.method3169(26488);
                }
            } else {
                this.field7140 = arg1.method3115(29871);
            }
        } else {
            this.field7143 = arg1.method3115(29871);
        }
        ++field7138;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;B)V", line = 240)
    public static final void method2873(boolean arg0, String arg1, String arg2, byte arg3) {
        ++field7142;
        class94.field1452 = arg0;
        int var4 = -73 / ((arg3 - -57) / 54);
        class239.field3137 = arg1;
        class11.field278 = arg2;
        if (class94.field1452 || class673.field9460 == 3 || !class11.field278.equals("") && !class239.field3137.equals("")) {
            class87.field1347 = false;
            if (~class673.field9460 != -2) {
                class432.field6269 = -1;
                class557.field8180 = 0;
            }
            class668.method3746(-3, true);
            class154.field2179 = 0;
            class418.field6179 = 0;
            class641.field9191 = 1;
        } else {
            class668.method3746(3, true);
        }
    }
}
