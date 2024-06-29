import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public class class87 extends class322 {

    @OriginalMember(owner = "client!iia", name = "l", descriptor = "Z")
    public static boolean field1064 = false;

    @OriginalMember(owner = "client!iia", name = "m", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!iia", name = "n", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!iia", name = "o", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!iia", name = "p", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!iia", name = "q", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!iia", name = "r", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!iia", name = "s", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(Lch;)V")
    public class87(class463 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "(B)Z")
    public final boolean method650(byte arg0) {
        ++field1068;
        int var2 = super.field4450.method2753(true).method1130((byte) -83);
        if (var2 < 96) {
            return false;
        } else {
            return arg0 == -53;
        }
    }

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "(Z)I")
    public final int method651(boolean arg0) {
        if (arg0) {
            return -2;
        } else {
            ++field1066;
            return super.field4451;
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(Lvaa;I[IB)V")
    public static final void method652(class468 arg0, int arg1, int[] arg2, byte arg3) {
        ++field1071;
        if (arg3 <= 77) {
            field1064 = true;
        }
        if (arg0.field7911 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg0.field7911.length; ++var5) {
                if (~arg0.field7911[var5] != ~arg2[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && ~arg0.field7991 != 0) {
                class709 var6 = class343.field4785.method3525(arg0.field7991, (byte) -88);
                int var7 = var6.field9848;
                if (var7 == 1) {
                    arg0.field7922 = 1;
                    arg0.field7925 = arg1;
                    arg0.field7965 = 0;
                    arg0.field7921 = 0;
                    arg0.field7944 = 0;
                    if (!arg0.field7970) {
                        class346.method2239(-701644944, arg0.field7965, arg0, var6);
                    }
                }
                if (~var7 == -3) {
                    arg0.field7944 = 0;
                }
            }
        }
        boolean var8 = true;
        for (int var9 = 0; arg2.length > var9; ++var9) {
            if (arg2[var9] != -1) {
                var8 = false;
            }
            if (arg0.field7911 == null || arg0.field7911[var9] == -1 || class343.field4785.method3525(arg2[var9], (byte) 127).field9824 >= class343.field4785.method3525(arg0.field7911[var9], (byte) 120).field9824) {
                arg0.field8007 = arg0.field8014;
                arg0.field7925 = arg1;
                arg0.field7911 = arg2;
            }
        }
        if (var8) {
            arg0.field7911 = arg2;
            arg0.field8007 = arg0.field8014;
            arg0.field7925 = arg1;
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(II)I")
    public final int method19(int arg0, int arg1) {
        ++field1069;
        int var3 = super.field4450.method2753(true).method1130((byte) -83);
        if (arg1 < 10) {
            this.method651(false);
        }
        if (var3 < 96) {
            return 3;
        } else if (~arg0 < -2 && ~var3 > -129) {
            return 3;
        } else {
            return ~arg0 < -4 && ~var3 > -193 ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(Z)V")
    public final void method23(boolean arg0) {
        ++field1067;
        int var2 = super.field4450.method2753(true).method1130((byte) -83);
        if (var2 < 96) {
            super.field4451 = 0;
        }
        if (~super.field4451 < -2 && var2 < 128) {
            super.field4451 = 1;
        }
        if (arg0) {
            this.method651(false);
        }
        if (super.field4451 > 2 && ~var2 > -193) {
            super.field4451 = 2;
        }
        if (~super.field4451 > -1 || super.field4451 > 3) {
            super.field4451 = this.method17((byte) -10);
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(B)I")
    public final int method17(byte arg0) {
        int var2 = 15 / ((arg0 - 70) / 51);
        ++field1070;
        return 0;
    }

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "(II)V")
    public final void method22(int arg0, int arg1) {
        if (arg0 == 0) {
            super.field4451 = arg1;
            ++field1065;
        }
    }

    @OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(ILch;)V")
    public class87(int arg0, class463 arg1) {
        super(arg0, arg1);
    }
}
