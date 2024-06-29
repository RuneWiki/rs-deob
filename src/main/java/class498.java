import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class498 extends class305 {

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field7074;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field7076;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field7077;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field7078;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public static int field7079;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static int field7080;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)Z", line = 4)
    public final boolean method2964(int arg0) {
        if (arg0 != 2) {
            this.method2964(97);
        }
        ++field7075;
        int var2 = super.field4323.method4104(66).method3296((byte) -127);
        return ~var2 <= -97;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(II)I", line = 22)
    public final int method306(int arg0, int arg1) {
        ++field7079;
        int var3 = super.field4323.method4104(79).method3296((byte) -127);
        if (arg0 != 31401) {
            this.method308((byte) -19);
        }
        if (~var3 > -97) {
            return 3;
        } else if (arg1 > 1 && var3 < 128) {
            return 3;
        } else {
            return arg1 > 3 && var3 < 192 ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)V", line = 46)
    public final void method303(int arg0, int arg1) {
        if (arg0 == -27751) {
            ++field7076;
            super.field4320 = arg1;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)I", line = 59)
    public final int method305(byte arg0) {
        ++field7078;
        return arg0 != 68 ? -69 : 0;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZZII)I", line = 72)
    public static final int method2965(int arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        ++field7074;
        class384 var5 = class529.method3090(arg2, (byte) 98, arg4);
        if (var5 == null) {
            return 0;
        } else {
            int var6 = 0;
            for (int var7 = arg3; var7 < var5.field5804.length; ++var7) {
                if (~var5.field5804[var7] <= -1 && class336.field4876.field4676 > var5.field5804[var7]) {
                    class578 var8 = class336.field4876.method2079(var5.field5804[var7], (byte) -54);
                    int var9 = var8.method3353(class153.field2479.method1653(arg0, (byte) -119).field4610, arg0, 0);
                    if (arg1) {
                        var6 += var5.field5809[var7] * var9;
                    } else {
                        var6 += var9;
                    }
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(B)V", line = 109)
    public final void method308(byte arg0) {
        ++field7080;
        int var2 = super.field4323.method4104(66).method3296((byte) -120);
        if (var2 < 96) {
            super.field4320 = 0;
        }
        if (super.field4320 > 1 && var2 < 128) {
            super.field4320 = 1;
        }
        if (super.field4320 > 2 && var2 < 192) {
            super.field4320 = 2;
        }
        if (arg0 < -40) {
            if (super.field4320 < 0 || super.field4320 > 3) {
                super.field4320 = this.method305((byte) 68);
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)I", line = 137)
    public final int method2966(int arg0) {
        if (arg0 != 17503) {
            return -73;
        } else {
            ++field7077;
            return super.field4320;
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(ILhb;)V", line = 148)
    public class498(int arg0, class728 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lhb;)V", line = 151)
    public class498(class728 arg0) {
        super(arg0);
    }
}
