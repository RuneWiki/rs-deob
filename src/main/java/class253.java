import java.awt.Container;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class253 implements Runnable {

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "Ldca;")
    private class178 field3649 = new class49();

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "Ldca;")
    private class178 field3661 = null;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "Lej;")
    public static class124 field3640 = new class124(11, 8);

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    public static int field3660 = 1;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    private int field3657;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    private int field3662;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "J")
    private long field3656;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "J")
    private long field3659;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "Ljj;")
    private class120 field3658;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "Lat;")
    public static class378 field3655;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "Ljava/lang/String;")
    private String field3663;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "Z")
    private boolean field3650;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "Z")
    private volatile boolean field3652;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)I", line = 3)
    public final int method1708(byte arg0) {
        field3651++;
        if (this.field3658 == null) {
            return 0;
        }
        if (arg0 < 103) {
            this.field3659 = -58L;
        }
        int var2 = this.field3658.method1042(-118);
        if (this.field3658.field2028 && this.field3658.field2033 > this.field3657) {
            return this.field3657 + 1;
        } else if (var2 >= 0 && class222.field3181.length - 1 > var2) {
            return this.field3658.field2037 == this.field3657 ? this.field3658.field2033 : this.field3658.field2037;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljj;Ljava/lang/String;IJZ)V", line = 32)
    public final synchronized void method1709(class120 arg0, String arg1, int arg2, long arg3, boolean arg4) {
        if (arg4) {
            this.method1711(9);
        }
        this.field3663 = arg1;
        this.field3657 = arg2;
        field3639++;
        this.field3659 = arg3;
        this.field3658 = arg0;
    }

    @OriginalMember(owner = "client!ae", name = "run", descriptor = "()V", line = 47)
    public final void run() {
        field3644++;
        while (!this.field3652) {
            long var1 = class554.method3190(-61);
            synchronized (this) {
                try {
                    this.field3662++;
                    if (this.field3649 instanceof class49) {
                        this.field3649.method566(this.field3650, -104);
                    } else {
                        long var4 = class554.method3190(-104);
                        if (class272.field3822 == null || this.field3661 == null || this.field3661.method557((byte) -58) == 0 || this.field3656 < var4 - (long) this.field3661.method557((byte) -58)) {
                            if (this.field3661 != null) {
                                this.field3650 = true;
                                this.field3661.method563(-9719);
                                this.field3661 = null;
                            }
                            if (this.field3650) {
                                class205.method1423((byte) -64);
                                if (class272.field3822 != null) {
                                    class272.field3822.method220(0);
                                }
                            }
                            this.field3649.method566(this.field3650 || class272.field3822 != null && class272.field3822.method199(), -90);
                        } else {
                            int var6 = (int) ((var4 - this.field3656) * 255L / (long) this.field3661.method557((byte) -58));
                            int var7 = 255 - var6;
                            int var8 = var7 << 24 | 0xFFFFFF;
                            int var9 = var6 << 24 | 0xFFFFFF;
                            class205.method1423((byte) -121);
                            class272.field3822.method220(0);
                            class496 var10 = class272.field3822.method311(class467.field6559, class582.field7968, true);
                            class272.field3822.method626(var10, 0);
                            this.field3661.method566(true, -126);
                            class272.field3822.method213();
                            var10.method1200(0, 0, 0, var8, 1);
                            class272.field3822.method626(var10, 0);
                            class272.field3822.method220(0);
                            this.field3649.method566(true, -114);
                            class272.field3822.method213();
                            var10.method1200(0, 0, 0, var9, 1);
                        }
                        try {
                            if (class272.field3822 != null && !(this.field3649 instanceof class49)) {
                                class272.field3822.method627((byte) 57);
                            }
                        } catch (class721 var18) {
                            class444.method2672(var18.getMessage() + " (Recovered) " + class334.field4684.method1991((byte) 80), var18, 15004);
                            class171.method1284(true, (byte) 114, 0);
                        }
                    }
                    Container var12;
                    if (class684.field9263 != null) {
                        var12 = class684.field9263;
                    } else if (class675.field9193 == null) {
                        var12 = class566.field7798;
                    } else {
                        var12 = class675.field9193;
                    }
                    var12.getSize();
                    var12.getSize();
                    if (class684.field9263 == var12) {
                        class684.field9263.getInsets();
                    }
                    this.field3650 = false;
                    if (class272.field3822 != null && !(this.field3649 instanceof class49) && this.field3658.method1042(-112) < class120.field2053.method1042(-127)) {
                        class641.method3638(false);
                    }
                } catch (Exception var19) {
                    continue;
                }
            }
            long var13 = class554.method3190(-73);
            int var15 = (int) (var1 + 20L - var13);
            if (var15 > 0) {
                class700.method3916((byte) -3, (long) var15);
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V", line = 174)
    public static void method1710(byte arg0) {
        if (arg0 > 50) {
            field3640 = null;
            field3655 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)Ljava/lang/String;", line = 186)
    public final String method1711(int arg0) {
        if (arg0 != -9324) {
            this.method1713((byte) -47);
        }
        field3645++;
        return this.field3663;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)V", line = 201)
    public final void method1712(byte arg0) {
        this.field3652 = true;
        if (arg0 >= -37) {
            this.field3656 = -36L;
        }
        field3648++;
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(B)I", line = 214)
    public final int method1713(byte arg0) {
        field3643++;
        int var2 = -127 / ((29 - arg0) / 45);
        return this.field3657;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILdca;)V", line = 225)
    public final synchronized void method1714(int arg0, class178 arg1) {
        field3653++;
        if (arg0 != 10559) {
            field3655 = null;
        }
        this.field3661 = this.field3649;
        this.field3649 = arg1;
        this.field3656 = class554.method3190(-67);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)Z", line = 239)
    public final synchronized boolean method1715(int arg0) {
        field3642++;
        return arg0 == 0 ? this.field3649.method558((byte) 125, this.field3656) : false;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)J", line = 255)
    public final long method1716(int arg0) {
        field3654++;
        if (arg0 != 0) {
            this.method1711(14);
        }
        return this.field3659;
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)Ljj;", line = 266)
    public final class120 method1717(int arg0) {
        field3646++;
        return arg0 <= 45 ? null : this.field3658;
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(B)I", line = 280)
    public final int method1718(byte arg0) {
        int var2 = 32 / ((arg0 + 41) / 47);
        field3641++;
        return this.field3662;
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)V", line = 300)
    public final synchronized void method1719(int arg0) {
        if (arg0 <= 39) {
            this.method1708((byte) 28);
        }
        field3647++;
        this.field3650 = true;
    }
}
