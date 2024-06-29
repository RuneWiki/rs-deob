import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class40 {

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "Ld;")
    public class329 field541 = new class329();

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "Lwp;")
    public static class453 field528 = new class453(19, -2);

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "[F")
    public static float[] field537 = new float[16];

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "Lcn;")
    public static class21 field540;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "Ld;")
    private class329 field543;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ld;B)V", line = 7)
    public final void method236(class329 arg0, byte arg1) {
        field533++;
        if (arg0.field4196 != null) {
            arg0.method1871(-21);
        }
        if (arg1 > 4) {
            arg0.field4196 = this.field541;
            arg0.field4201 = this.field541.field4201;
            arg0.field4196.field4201 = arg0;
            arg0.field4201.field4196 = arg0;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)Ld;", line = 28)
    public final class329 method237(int arg0) {
        field536++;
        class329 var2 = this.field541.field4201;
        if (arg0 < 81) {
            return null;
        } else if (this.field541 == var2) {
            this.field543 = null;
            return null;
        } else {
            this.field543 = var2.field4201;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V", line = 48)
    public static void method238(byte arg0) {
        field528 = null;
        field540 = null;
        if (arg0 >= 44) {
            field537 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Ld;B)V", line = 62)
    public final void method239(class329 arg0, byte arg1) {
        if (arg1 != 93) {
            field528 = null;
        }
        if (arg0.field4196 != null) {
            arg0.method1871(-83);
        }
        field542++;
        arg0.field4201 = this.field541;
        arg0.field4196 = this.field541.field4196;
        arg0.field4196.field4201 = arg0;
        arg0.field4201.field4196 = arg0;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIII)I", line = 80)
    public static final int method240(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 2) {
            method240(63, 94, -26, -49, -121, -62);
        }
        field529++;
        if (class491.field6485 == null) {
            return 0;
        }
        if (arg2 < 3) {
            int var6 = arg0 >> 9;
            int var7 = arg4 >> 9;
            if (arg5 < 0 || arg3 < 0 || class431.field5395 - 1 < arg5 || arg3 > class452.field5802 - 1) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || class431.field5395 - 1 < var6 || class452.field5802 - 1 < var7) {
                return 0;
            }
            boolean var8 = (class10.field190[1][arg0 >> 9][arg4 >> 9] & 0x2) != 0;
            if ((arg0 & 0x1FF) == 0) {
                boolean var9 = (class10.field190[1][var6 - 1][arg4 >> 9] & 0x2) != 0;
                boolean var10 = (class10.field190[1][var6][arg4 >> 9] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class10.field190[1][arg5][arg3] & 0x2) != 0;
                }
            }
            if ((arg4 & 0x1FF) == 0) {
                boolean var11 = (class10.field190[1][arg0 >> 9][var7 - 1] & 0x2) != 0;
                boolean var12 = (class10.field190[1][arg0 >> 9][var7] & 0x2) != 0;
                if (var12 != var11) {
                    var8 = (class10.field190[1][arg5][arg3] & 0x2) != 0;
                }
            }
            if (var8) {
                arg2++;
            }
        }
        return class491.field6485[arg2].method1565(arg4, arg0, true);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)I", line = 139)
    public final int method241(int arg0) {
        field544++;
        int var2 = 0;
        class329 var3 = this.field541.field4201;
        if (arg0 >= -57) {
            field528 = null;
        }
        while (this.field541 != var3) {
            var3 = var3.field4201;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ld;BLae;)V", line = 163)
    private final void method242(class329 arg0, byte arg1, class40 arg2) {
        field545++;
        class329 var4 = this.field541.field4196;
        this.field541.field4196 = arg0.field4196;
        arg0.field4196.field4201 = this.field541;
        if (arg1 <= 79) {
            this.field541 = null;
        }
        if (this.field541 != arg0) {
            arg0.field4196 = arg2.field541.field4196;
            arg0.field4196.field4201 = arg0;
            var4.field4201 = arg2.field541;
            arg2.field541.field4196 = var4;
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)Ld;", line = 195)
    public final class329 method243(int arg0) {
        field535++;
        class329 var2 = this.field543;
        if (arg0 != 16) {
            field537 = null;
        }
        if (this.field541 == var2) {
            this.field543 = null;
            return null;
        } else {
            this.field543 = var2.field4196;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)Ld;", line = 215)
    public final class329 method244(boolean arg0) {
        field527++;
        class329 var2 = this.field541.field4201;
        if (this.field541 == var2) {
            return null;
        }
        if (!arg0) {
            field540 = null;
        }
        var2.method1871(-82);
        return var2;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)Ld;", line = 234)
    public final class329 method245(byte arg0) {
        if (arg0 < 20) {
            this.method245((byte) 126);
        }
        field534++;
        class329 var2 = this.field543;
        if (this.field541 == var2) {
            this.field543 = null;
            return null;
        } else {
            this.field543 = var2.field4201;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)Z", line = 255)
    public final boolean method246(boolean arg0) {
        field538++;
        if (!arg0) {
            this.field543 = null;
        }
        return this.field541.field4201 == this.field541;
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)V", line = 269)
    public final void method247(int arg0) {
        if (arg0 != 2) {
            return;
        }
        while (true) {
            class329 var2 = this.field541.field4201;
            if (this.field541 == var2) {
                field531++;
                this.field543 = null;
                return;
            }
            var2.method1871(-13);
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(Z)Ld;", line = 291)
    public final class329 method248(boolean arg0) {
        field530++;
        if (arg0) {
            return null;
        }
        class329 var2 = this.field541.field4196;
        if (this.field541 == var2) {
            this.field543 = null;
            return null;
        } else {
            this.field543 = var2.field4196;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V", line = 334)
    public class40() {
        this.field541.field4196 = this.field541;
        this.field541.field4201 = this.field541;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLae;)V", line = 323)
    public final void method249(byte arg0, class40 arg1) {
        this.method242(this.field541.field4201, (byte) 125, arg1);
        if (arg0 == -84) {
            field539++;
        }
    }
}
