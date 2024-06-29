import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class337 {

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "Laj;")
    private class287 field5034 = new class287(64);

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "Lom;")
    private class344 field5037;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Lom;")
    private class344 field5035;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field5039 = 0;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Z")
    public static boolean field5036 = true;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "Z")
    public static boolean field5040 = false;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)Lbi;")
    public final class448 method2171(int arg0, boolean arg1) {
        field5038++;
        class448 var3 = (class448) this.field5034.method1900((long) arg0, 111);
        if (var3 != null) {
            return var3;
        }
        if (arg1) {
            this.method2171(-33, false);
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = this.field5037.method2216(0, arg0, true);
        } else {
            var4 = this.field5035.method2216(0, arg0 & 0x7FFF, true);
        }
        class448 var5 = new class448();
        if (var4 != null) {
            var5.method2691((byte) 119, new class61(var4));
        }
        if (arg0 >= 32768) {
            var5.method2695((byte) -98);
        }
        this.field5034.method1904(var5, (long) arg0, -1);
        return var5;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lpl;IIII)V")
    public static final void method2172(class604 arg0, int arg1, int arg2, int arg3, int arg4) {
        field5041++;
        class658 var5 = arg0.method3465(0);
        int var6 = arg0.field8710 - arg0.field8737.field5766 & 0x3FFF;
        if (arg3 <= 102) {
            method2172(null, 25, -13, -46, -105);
        }
        if (arg4 == -1) {
            if (var6 != 0 || arg0.field8774 > 25) {
                arg0.field8748 = false;
                if (arg2 < 0 && var5.field9487 != -1) {
                    arg0.field8766 = var5.field9487;
                } else if (arg2 <= 0 || var5.field9495 == -1) {
                    arg0.field8766 = var5.field9470;
                } else {
                    arg0.field8766 = var5.field9495;
                }
            } else if (!arg0.field8748 || !var5.method3748(false, arg0.field8766)) {
                arg0.field8766 = var5.method3743(true);
                arg0.field8748 = arg0.field8766 != -1;
            }
        } else if (arg0.field8770 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class87.field1630[arg1] - arg0.field8737.field5766 & 0x3FFF;
            if (arg4 == 2 && var5.field9467 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field9474 != -1) {
                    arg0.field8766 = var5.field9474;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field9484 != -1) {
                    arg0.field8766 = var5.field9484;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field9472 == -1) {
                    arg0.field8766 = var5.field9467;
                } else {
                    arg0.field8766 = var5.field9472;
                }
            } else if (arg4 == 0 && var5.field9454 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field9462 != -1) {
                    arg0.field8766 = var5.field9462;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field9451 != -1) {
                    arg0.field8766 = var5.field9451;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field9480 == -1) {
                    arg0.field8766 = var5.field9454;
                } else {
                    arg0.field8766 = var5.field9480;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field9488 != -1) {
                arg0.field8766 = var5.field9488;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field9465 != -1) {
                arg0.field8766 = var5.field9465;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field9496 == -1) {
                arg0.field8766 = var5.field9470;
            } else {
                arg0.field8766 = var5.field9496;
            }
            arg0.field8748 = false;
        } else if (var6 == 0 && arg0.field8774 <= 25) {
            arg0.field8748 = false;
            if (arg4 == 2 && var5.field9467 != -1) {
                arg0.field8766 = var5.field9467;
            } else if (arg4 == 0 && var5.field9454 != -1) {
                arg0.field8766 = var5.field9454;
            } else {
                arg0.field8766 = var5.field9470;
            }
        } else {
            arg0.field8748 = false;
            if (arg4 == 2 && var5.field9467 != -1) {
                if (arg2 < 0 && var5.field9483 != -1) {
                    arg0.field8766 = var5.field9483;
                } else if (arg2 <= 0 || var5.field9486 == -1) {
                    arg0.field8766 = var5.field9467;
                } else {
                    arg0.field8766 = var5.field9486;
                }
            } else if (arg4 == 0 && var5.field9454 != -1) {
                if (arg2 < 0 && var5.field9493 != -1) {
                    arg0.field8766 = var5.field9493;
                } else if (arg2 <= 0 || var5.field9456 == -1) {
                    arg0.field8766 = var5.field9454;
                } else {
                    arg0.field8766 = var5.field9456;
                }
            } else if (arg2 < 0 && var5.field9479 != -1) {
                arg0.field8766 = var5.field9479;
            } else if (arg2 <= 0 || var5.field9452 == -1) {
                arg0.field8766 = var5.field9470;
            } else {
                arg0.field8766 = var5.field9452;
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(ILom;Lom;)V")
    public class337(int arg0, class344 arg1, class344 arg2) {
        this.field5037 = arg1;
        this.field5035 = arg2;
        if (this.field5037 != null) {
            this.field5037.method2236(0, 0);
        }
        if (this.field5035 != null) {
            this.field5035.method2236(0, 0);
        }
    }
}
