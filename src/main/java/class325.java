import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class325 {

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "[I")
    public static int[] field4510 = new int[13];

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "I")
    private int field4508;

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
    public int field4509;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hs", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field4511;

    // $FF: synthetic method
    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2123(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V", line = 4)
    public final void method2112(int arg0) {
        this.field4509 &= arg0;
        field4504++;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIII)Z", line = 12)
    public static final boolean method2113(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4505++;
        if (~(class651.field8948[0][arg3][arg0] & 0x2) != arg1) {
            return true;
        } else if ((class651.field8948[arg2][arg3][arg0] & 0x10) == 0) {
            return class376.method2359(arg0, (byte) 107, arg3, arg2) == arg4;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V", line = 34)
    public static void method2114(int arg0) {
        field4510 = null;
        if (arg0 != -20169) {
            field4510 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)V", line = 45)
    public static final void method2115(int arg0) {
        field4500++;
        if (arg0 != -1) {
            field4510 = null;
        }
        class719.field9977++;
        class519 var1 = class357.method2293(class427.field5994, class200.field2630, (byte) 93);
        var1.field7384.method3745(-123, class270.field3865);
        class151.method1027(var1, -52);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)I", line = 62)
    public static int method2116(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)Z", line = 72)
    public static final boolean method2117(int arg0, int arg1, int arg2) {
        if (arg1 <= 43) {
            method2113(-65, 81, 120, -127, 45);
        }
        field4506++;
        return (arg0 & 0x100100) != 0;
    }

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "(I)V", line = 83)
    public static final void method2118(int arg0) {
        if (class202.field2644.field4367) {
            class698.field9627 = 96;
        } else {
            try {
                Method var1 = (field4511 == null ? (field4511 = method2123("java.lang.Runtime")) : field4511).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class698.field9627 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        if (arg0 < 99) {
            method2115(79);
        }
        field4507++;
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(II)V", line = 118)
    public final void method2119(int arg0, int arg1) {
        this.field4508 = 0;
        field4503++;
        this.field4509 = arg1;
        if (arg0 != -24223) {
            method2114(-2);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIII)Z", line = 130)
    public final boolean method2120(int arg0, int arg1, int arg2, int arg3) {
        field4502++;
        int var5 = this.field4508;
        if (this.field4509 == arg1 && this.field4508 == 0) {
            return false;
        }
        boolean var8;
        if (this.field4508 == 0) {
            if (arg1 > this.field4509 && arg1 <= this.field4509 + arg2 || this.field4509 > arg1 && this.field4509 - arg2 <= arg1) {
                this.field4509 = arg1;
                return false;
            }
            var8 = true;
        } else if (this.field4508 > 0 && this.field4509 < arg1) {
            int var6 = this.field4508 * this.field4508 / (arg2 * 2);
            int var7 = this.field4509 + var6;
            if (arg1 > var7 && var7 >= this.field4509) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field4508 < 0 && this.field4509 > arg1) {
            int var9 = this.field4508 * this.field4508 / (arg2 * 2);
            int var10 = this.field4509 - var9;
            if (var10 > arg1 && this.field4509 >= var10) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (this.field4509 < arg1) {
                this.field4508 += arg2;
                if (arg3 != 0 && this.field4508 > arg3) {
                    this.field4508 = arg3;
                }
            } else {
                this.field4508 -= arg2;
                if (arg3 != 0 && this.field4508 < (-arg3)) {
                    this.field4508 = -arg3;
                }
            }
            if (this.field4508 != var5) {
                int var11 = this.field4508 * this.field4508 / (arg2 * 2);
                if (this.field4509 < arg1) {
                    if (arg1 < (this.field4509 + var11)) {
                        this.field4508 = var5;
                    }
                } else if (this.field4509 > arg1 && (this.field4509 - var11) < arg1) {
                    this.field4508 = var5;
                }
            }
        } else if (this.field4508 <= 0) {
            this.field4508 += arg2;
            if (this.field4508 > 0) {
                this.field4508 = 0;
            }
        } else {
            this.field4508 -= arg2;
            if (this.field4508 < 0) {
                this.field4508 = 0;
            }
        }
        if (arg0 != 16383) {
            this.method2122(50);
        }
        this.field4509 += this.field4508 + var5 >> 1;
        return var8;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 273)
    public static final int method2121(String arg0, int arg1) {
        if (arg1 != -23213) {
            field4510 = null;
        }
        field4501++;
        return class123.method835((byte) -21, 10, arg0, true);
    }

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "(I)I", line = 285)
    public final int method2122(int arg0) {
        if (arg0 != -1) {
            this.method2120(-89, 11, -92, 14);
        }
        field4499++;
        return this.field4509 & 0x3FFF;
    }
}
