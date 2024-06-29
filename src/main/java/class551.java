import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class551 extends class60 {

    @OriginalMember(owner = "client!um", name = "p", descriptor = "I")
    public static int field7657 = 0;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "I")
    public static int field7652;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "I")
    public static int field7654;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "I")
    public static int field7655;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "I")
    public static int field7656;

    @OriginalMember(owner = "client!um", name = "q", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!um", name = "r", descriptor = "I")
    public static int field7659;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(B)V")
    public final void method409(byte arg0) {
        ++field7658;
        if (arg0 >= -27) {
            field7657 = 21;
        }
        if (~super.field799 != -2 && super.field799 != 0) {
            super.field799 = this.method405(false);
        }
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(ILhd;)V")
    public class551(int arg0, class773 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BI)V")
    public final void method407(byte arg0, int arg1) {
        int var3 = 29 % ((arg0 - 28) / 50);
        super.field799 = arg1;
        ++field7655;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(II)I")
    public final int method406(int arg0, int arg1) {
        ++field7652;
        if (arg0 != 0) {
            field7657 = 65;
        }
        return 1;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)I")
    public final int method3227(int arg0) {
        if (arg0 != 0) {
            method3229(45, 112, 12);
        }
        ++field7653;
        return super.field799;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZIBZLjava/lang/String;Ljava/lang/String;I)V")
    public static final void method3228(boolean arg0, int arg1, byte arg2, boolean arg3, String arg4, String arg5, int arg6) {
        ++field7654;
        class481.field6728.field670 = 1;
        String var7 = arg4.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (~arg6 != 0) {
            class613 var11 = class113.field1426.method4366(true, arg6);
            if (var11 == null || !arg3 != !var11.method3472((byte) -126)) {
                return;
            }
            if (var11.method3472((byte) -123)) {
                var10 = var11.field8234;
            } else {
                var9 = var11.field8244;
            }
        }
        int var12 = 0;
        for (int var13 = 0; ~class121.field1555.field6786 < ~var13; ++var13) {
            class340 var16 = class121.field1555.method2882(var13, -22087);
            if ((!arg0 || var16.field4210) && var16.field4232 == -1 && var16.field4199 == -1 && var16.field4269 == -1 && var16.field4206 == 0 && ~var16.field4222.toLowerCase().indexOf(var7) != 0) {
                if (arg6 != -1) {
                    if (arg3) {
                        if (!arg5.equals(var16.method2004(arg6, -10390, var10))) {
                            continue;
                        }
                    } else if (~var16.method2009((byte) 125, var9, arg6) != ~arg1) {
                        continue;
                    }
                }
                if (var12 >= 250) {
                    class734.field10262 = null;
                    class689.field9390 = -1;
                    return;
                }
                if (var8.length <= var12) {
                    short[] var17 = new short[var8.length * 2];
                    for (int var18 = 0; ~var12 < ~var18; ++var18) {
                        var17[var18] = var8[var18];
                    }
                    var8 = var17;
                }
                var8[var12++] = (short) var13;
            }
        }
        if (arg2 <= 15) {
            field7657 = -49;
        }
        class734.field10262 = var8;
        class267.field3159 = 0;
        class689.field9390 = var12;
        String[] var14 = new String[class689.field9390];
        for (int var15 = 0; var15 < class689.field9390; ++var15) {
            var14[var15] = class121.field1555.method2882(var8[var15], -22087).field4222;
        }
        class774.method4299(class734.field10262, (byte) 124, var14);
        class481.field6728.method429(-40);
        class481.field6728.field670 = 2;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(III)Z")
    public static final boolean method3229(int arg0, int arg1, int arg2) {
        if (arg1 <= 9) {
            field7657 = -70;
        }
        ++field7656;
        return (class792.method4368(arg0, arg2, (byte) 94) | class173.method1170(arg0, (byte) 70, arg2) | class61.method527(arg2, arg0, 0)) & class377.method2211(arg2, 2048, arg0);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)I")
    public final int method405(boolean arg0) {
        ++field7659;
        return arg0 ? 25 : 1;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lhd;)V")
    public class551(class773 arg0) {
        super(arg0);
    }
}
