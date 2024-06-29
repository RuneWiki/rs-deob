import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class558 extends class585 {

    @OriginalMember(owner = "client!tp", name = "E", descriptor = "I")
    private int field7935 = 4096;

    @OriginalMember(owner = "client!tp", name = "L", descriptor = "I")
    private int field7941 = 0;

    @OriginalMember(owner = "client!tp", name = "F", descriptor = "I")
    public static int field7936;

    @OriginalMember(owner = "client!tp", name = "G", descriptor = "I")
    public static int field7937;

    @OriginalMember(owner = "client!tp", name = "H", descriptor = "I")
    public static int field7938;

    @OriginalMember(owner = "client!tp", name = "I", descriptor = "I")
    public static int field7939;

    @OriginalMember(owner = "client!tp", name = "K", descriptor = "I")
    public static int field7940;

    @OriginalMember(owner = "client!tp", name = "M", descriptor = "I")
    public static int field7942;

    @OriginalMember(owner = "client!tp", name = "N", descriptor = "I")
    public static int field7943;

    @OriginalMember(owner = "client!tp", name = "O", descriptor = "I")
    public static int field7944;

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "()V", line = 27)
    public class558() {
        super(1, true);
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(III)Z", line = 11)
    public static final boolean method3299(int arg0, int arg1, int arg2) {
        ++field7942;
        if (arg1 != 393216) {
            field7943 = 90;
        }
        return (arg2 & 393216) != 0 | class537.method3221(arg2, (byte) -119, arg0) || class443.method2639(arg0, arg2, (byte) -126);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lwia;B)V", line = 30)
    public static final void method3300(class791 arg0, byte arg1) {
        if (arg1 != 42) {
            method3302(31, 0);
        }
        class157.field2529 = arg0;
        ++field7936;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(II[Lmea;)V", line = 45)
    public static final void method3301(int arg0, int arg1, class451[] arg2) {
        ++field7939;
        for (int var3 = 0; var3 < arg2.length; ++var3) {
            class451 var4 = arg2[var3];
            if (var4 != null) {
                if (~var4.field6210 == -1) {
                    if (var4.field6270 != null) {
                        method3301(arg0, arg1, var4.field6270);
                    }
                    class744 var5 = (class744) class11.field217.method2242((long) var4.field6222, -1);
                    if (var5 != null) {
                        class614.method3563(var5.field10314, arg1, (byte) 33);
                    }
                }
                if (~arg1 == -1 && var4.field6200 != null) {
                    class166 var6 = new class166();
                    var6.field2627 = var4;
                    var6.field2619 = var4.field6200;
                    class379.method2349(var6);
                }
                if (~arg1 == -2 && var4.field6337 != null) {
                    if (var4.field6246 >= 0) {
                        class451 var7 = class166.method1238((byte) -74, var4.field6222);
                        if (var7 == null || var7.field6270 == null || ~var7.field6270.length >= ~var4.field6246 || var7.field6270[var4.field6246] != var4) {
                            continue;
                        }
                    }
                    class166 var8 = new class166();
                    var8.field2627 = var4;
                    var8.field2619 = var4.field6337;
                    class379.method2349(var8);
                }
            }
        }
        if (arg0 != -8298) {
            method3303(-119, 92, -66, 37, 75);
        }
    }

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "(II)Z", line = 115)
    public static final boolean method3302(int arg0, int arg1) {
        ++field7940;
        if (arg1 != 1) {
            field7943 = -81;
        }
        return ~arg0 == -52 || ~arg0 == -10 || ~arg0 == -46 || ~arg0 == -49 || ~arg0 == -19 || ~arg0 == -50 || ~arg0 == -7;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lso;II)V", line = 127)
    public final void method54(class494 arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            method3299(-60, -46, -10);
        }
        ++field7944;
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field7935 = arg0.method2998(true);
            }
        } else {
            this.field7941 = arg0.method2998(true);
        }
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(II)[I", line = 162)
    public final int[] method55(int arg0, int arg1) {
        ++field7937;
        int[] var3 = super.field8255.method1637(-29827, arg0);
        if (super.field8255.field3677) {
            int[] var4 = this.method3415(-128, 0, arg0);
            for (int var5 = 0; class293.field4278 > var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field7941 && this.field7935 >= var6 ? 4096 : 0;
            }
        }
        if (arg1 < 123) {
            this.method54((class494) null, 103, 14);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIII)V", line = 196)
    public static final void method3303(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (-arg4 + arg3 >= class618.field8645 && class463.field6533 >= arg3 + arg4 && -arg4 + arg2 >= class734.field10153 && class407.field5535 >= arg2 + arg4) {
            class208.method1438(arg0 ^ 4326, arg3, arg2, arg1, arg4);
        } else {
            class34.method282(arg3, arg4, arg2, 56, arg1);
        }
        ++field7938;
        if (arg0 != 27315) {
            method3301(71, 64, (class451[]) null);
        }
    }
}
