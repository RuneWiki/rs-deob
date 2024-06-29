import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public class class31 {

    @OriginalMember(owner = "client!kha", name = "f", descriptor = "Lst;")
    public static class335 field370 = new class335(79, 0);

    @OriginalMember(owner = "client!kha", name = "h", descriptor = "I")
    public static int field372 = 0;

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "I")
    public int field365;

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!kha", name = "c", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client!kha", name = "d", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!kha", name = "e", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!kha", name = "g", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!kha", name = "j", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!kha", name = "k", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!kha", name = "l", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!kha", name = "i", descriptor = "Z")
    public static boolean field373;

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(II)V")
    public final void method166(int arg0, int arg1) {
        this.field367 = 0;
        if (arg0 < -58) {
            this.field365 = arg1;
            field366++;
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(B)V")
    public final void method167(byte arg0) {
        field374++;
        this.field365 &= 0x3FFF;
        if (arg0 != 126) {
            field373 = false;
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(Z)I")
    public final int method168(boolean arg0) {
        if (arg0) {
            return -94;
        } else {
            field369++;
            return this.field365 & 0x3FFF;
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(IB)V")
    public static final void method169(int arg0, byte arg1) {
        if (arg1 != -43) {
            method173((byte) 103, (byte) 39);
        }
        field368++;
        class346 var2 = class299.method1976(0, 1, arg0);
        var2.method2208(arg1 ^ 0x69C);
    }

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "(B)V")
    public static void method170(byte arg0) {
        if (arg0 != -61) {
            method172(null, null, 76);
        }
        field370 = null;
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(IIII)Z")
    public final boolean method171(int arg0, int arg1, int arg2, int arg3) {
        field375++;
        int var5 = this.field367;
        if (this.field365 == arg1 && this.field367 == 0) {
            return false;
        }
        boolean var6;
        if (this.field367 == 0) {
            if (arg1 > this.field365 && (this.field365 + arg3) >= arg1 || this.field365 > arg1 && (this.field365 - arg3) <= arg1) {
                this.field365 = arg1;
                return false;
            }
            var6 = true;
        } else if (this.field367 > 0 && arg1 > this.field365) {
            int var7 = this.field367 * this.field367 / (arg3 * 2);
            int var8 = this.field365 + var7;
            if (var8 < arg1 && this.field365 <= var8) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field367 < 0 && arg1 < this.field365) {
            int var9 = this.field367 * this.field367 / (arg3 * 2);
            int var10 = this.field365 - var9;
            if (arg1 < var10 && this.field365 >= var10) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (arg1 <= this.field365) {
                this.field367 -= arg3;
                if (arg2 != 0 && -arg2 > this.field367) {
                    this.field367 = -arg2;
                }
            } else {
                this.field367 += arg3;
                if (arg2 != 0 && this.field367 > arg2) {
                    this.field367 = arg2;
                }
            }
            if (this.field367 != var5) {
                int var11 = this.field367 * this.field367 / (arg3 * 2);
                if (arg1 <= this.field365) {
                    if (this.field365 > arg1 && (this.field365 - var11) < arg1) {
                        this.field367 = var5;
                    }
                } else if (arg1 < (this.field365 + var11)) {
                    this.field367 = var5;
                }
            }
        } else if (this.field367 > 0) {
            this.field367 -= arg3;
            if (this.field367 < 0) {
                this.field367 = 0;
            }
        } else {
            this.field367 += arg3;
            if (this.field367 > 0) {
                this.field367 = 0;
            }
        }
        this.field365 += this.field367 + var5 >> 1;
        int var12 = 126 % ((-arg0 - 58) / 57);
        return var6;
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
    public static final void method172(Throwable arg0, String arg1, int arg2) {
        field371++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class401.method2496(arg0, 0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class99.method669(true, var3);
            String var4 = class723.method4041(":", "%3a", var3, 0);
            String var5 = class723.method4041("@", "%40", var4, arg2);
            String var6 = class723.method4041("&", "%26", var5, arg2);
            String var7 = class723.method4041("#", "%23", var6, 0);
            if (class445.field6182 != null) {
                class246 var8 = class585.field7974.method859(new URL(class445.field6182.getCodeBase(), "clienterror.ws?c=" + class379.field5422 + "&u=" + (class39.field488 == null ? String.valueOf(class164.field2268) : class39.field488) + "&v1=" + class135.field1915 + "&v2=" + class135.field1938 + "&e=" + var7), (byte) -128);
                while (var8.field3633 == 0) {
                    class688.method3874(1L, -7375);
                }
                if (var8.field3633 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field3638;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(BB)Z")
    public static final boolean method173(byte arg0, byte arg1) {
        field376++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            return false;
        } else {
            if (arg1 > -3) {
                field373 = false;
            }
            return var2 < 128 || var2 >= 160 || class587.field7990[var2 - 128] != '\u0000';
        }
    }
}
