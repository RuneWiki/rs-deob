import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public class class243 {

    @OriginalMember(owner = "client!eia", name = "n", descriptor = "Lgda;")
    private class55 field3556 = new class55();

    @OriginalMember(owner = "client!eia", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field3546 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!eia", name = "i", descriptor = "[Lae;")
    public static class253[] field3551 = new class253[14];

    @OriginalMember(owner = "client!eia", name = "p", descriptor = "Z")
    public static boolean field3558 = false;

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!eia", name = "b", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!eia", name = "c", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!eia", name = "e", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!eia", name = "f", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!eia", name = "g", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!eia", name = "h", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!eia", name = "j", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!eia", name = "k", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!eia", name = "l", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!eia", name = "m", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!eia", name = "o", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!eia", name = "q", descriptor = "Lgda;")
    private class55 field3559;

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(B)Lgda;")
    public final class55 method1615(byte arg0) {
        field3555++;
        if (arg0 < 49) {
            method1626((byte) -15, null, 87, null, 3, true, false);
        }
        class55 var2 = this.field3556.field762;
        if (this.field3556 == var2) {
            this.field3559 = null;
            return null;
        } else {
            this.field3559 = var2.field762;
            return var2;
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(ILgda;)V")
    public final void method1616(int arg0, class55 arg1) {
        if (arg1.field766 != null) {
            arg1.method385((byte) -103);
        }
        field3545++;
        arg1.field766 = this.field3556.field766;
        if (arg0 == 22437) {
            arg1.field762 = this.field3556;
            arg1.field766.field762 = arg1;
            arg1.field762.field766 = arg1;
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(Z)Lgda;")
    public final class55 method1617(boolean arg0) {
        if (arg0) {
            this.method1624(70);
        }
        field3557++;
        class55 var2 = this.field3556.field766;
        if (this.field3556 == var2) {
            this.field3559 = null;
            return null;
        } else {
            this.field3559 = var2.field766;
            return var2;
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(I)V")
    public static void method1618(int arg0) {
        field3546 = null;
        if (arg0 <= 115) {
            field3546 = null;
        }
        field3551 = null;
    }

    @OriginalMember(owner = "client!eia", name = "b", descriptor = "(B)V")
    public final void method1619(byte arg0) {
        while (true) {
            class55 var2 = this.field3556.field762;
            if (this.field3556 == var2) {
                field3550++;
                if (arg0 >= -65) {
                    return;
                }
                this.field3559 = null;
                return;
            }
            var2.method385((byte) -41);
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(ZII)Z")
    public static final boolean method1620(boolean arg0, int arg1, int arg2) {
        field3549++;
        if (arg0) {
            return (arg1 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(FIIIIZII)[I")
    public static final int[] method1621(float arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field3544++;
        int[] var8 = new int[arg3];
        class242 var9 = new class242();
        var9.field3513 = arg5;
        var9.field3538 = arg6;
        var9.field3515 = arg7;
        var9.field3530 = arg1;
        var9.field3536 = arg2;
        var9.field3512 = (int) (arg0 * 4096.0F);
        var9.method191((byte) 125);
        class409.method2602(1, arg3, (byte) 81);
        var9.method1612(var8, (byte) 122, arg4);
        return var8;
    }

    @OriginalMember(owner = "client!eia", name = "b", descriptor = "(I)I")
    public final int method1622(int arg0) {
        field3552++;
        int var2 = arg0;
        for (class55 var3 = this.field3556.field762; var3 != this.field3556; var3 = var3.field762) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method1623(byte arg0, byte[] arg1) {
        field3547++;
        class645 var2 = new class645(arg1);
        int var3 = var2.method3745(-6314);
        int var4 = var2.method3720(-19541);
        if (arg0 != 18) {
            method1621(0.34944877F, 8, -126, 123, 111, true, 60, -73);
        }
        if (var4 < 0 || class461.field6798 != 0 && var4 > class461.field6798) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var8 = new byte[var4];
            var2.method3736(arg0 - 134, var8, var4, 0);
            return var8;
        } else {
            int var5 = var2.method3720(-19541);
            if (var5 < 0 || class461.field6798 != 0 && class461.field6798 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class743.method4156(var6, var5, arg1, var4, 9);
            } else {
                class57 var7 = class390.field5884;
                synchronized (class390.field5884) {
                    class390.field5884.method402(true, var2, var6);
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!eia", name = "c", descriptor = "(I)Lgda;")
    public final class55 method1624(int arg0) {
        field3543++;
        class55 var2 = this.field3556.field762;
        if (arg0 <= 29) {
            field3558 = true;
        }
        if (this.field3556 == var2) {
            return null;
        } else {
            var2.method385((byte) -69);
            return var2;
        }
    }

    @OriginalMember(owner = "client!eia", name = "d", descriptor = "(I)Lgda;")
    public final class55 method1625(int arg0) {
        field3553++;
        if (arg0 >= -22) {
            return null;
        }
        class55 var2 = this.field3559;
        if (this.field3556 == var2) {
            this.field3559 = null;
            return null;
        } else {
            this.field3559 = var2.field762;
            return var2;
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(BLcha;ILcha;IZZ)I")
    public static final int method1626(byte arg0, class218 arg1, int arg2, class218 arg3, int arg4, boolean arg5, boolean arg6) {
        field3554++;
        int var7 = class569.method3304(arg4, 120, arg3, arg6, arg1);
        if (var7 != 0) {
            return arg6 ? -var7 : var7;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var8 = class569.method3304(arg2, arg0 ^ 0x3F, arg3, arg5, arg1);
            if (arg0 != 69) {
                method1621(0.5862371F, -33, 108, 11, -83, false, -40, -77);
            }
            return arg5 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!eia", name = "e", descriptor = "(I)Z")
    public final boolean method1627(int arg0) {
        field3548++;
        if (arg0 == 1) {
            return this.field3556.field762 == this.field3556;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!eia", name = "<init>", descriptor = "()V")
    public class243() {
        this.field3556.field766 = this.field3556;
        this.field3556.field762 = this.field3556;
    }
}
