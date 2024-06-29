import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class248 extends class206 {

    @OriginalMember(owner = "client!kw", name = "E", descriptor = "[I")
    public static int[] field3305 = new int[4];

    @OriginalMember(owner = "client!kw", name = "w", descriptor = "Luda;")
    public static class451 field3297 = class700.method3947(104);

    @OriginalMember(owner = "client!kw", name = "u", descriptor = "F")
    private float field3295;

    @OriginalMember(owner = "client!kw", name = "z", descriptor = "F")
    private float field3300;

    @OriginalMember(owner = "client!kw", name = "q", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!kw", name = "r", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!kw", name = "s", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!kw", name = "t", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!kw", name = "v", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!kw", name = "x", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!kw", name = "y", descriptor = "I")
    private int field3299;

    @OriginalMember(owner = "client!kw", name = "B", descriptor = "I")
    private int field3302;

    @OriginalMember(owner = "client!kw", name = "C", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!kw", name = "F", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!kw", name = "G", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!kw", name = "p", descriptor = "Ljava/lang/String;")
    private String field3290;

    @OriginalMember(owner = "client!kw", name = "A", descriptor = "Ljava/lang/String;")
    private String field3301;

    @OriginalMember(owner = "client!kw", name = "D", descriptor = "Ljava/lang/String;")
    private String field3304;

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "(I)F", line = 5)
    public final float method1579(int arg0) {
        if (arg0 > -87) {
            this.field3295 = -0.6465238F;
        }
        ++field3307;
        return this.field3300;
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(Z)V", line = 16)
    public static void method1580(boolean arg0) {
        field3297 = null;
        if (!arg0) {
            method1581(115, 74, -101, -95, -10, (byte) -5, -37, -97, 89, -4);
        }
        field3305 = null;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIIBIIII)V", line = 29)
    public static final void method1581(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field3306;
        class639 var10 = null;
        if (arg5 <= 121) {
            method1581(-66, 49, 12, 126, 121, (byte) -61, 89, -52, -125, -102);
        }
        for (class639 var11 = (class639) class633.field8740.method2765(-12261); var11 != null; var11 = (class639) class633.field8740.method2759(-15361)) {
            if (~var11.field8787 == ~arg6 && var11.field8774 == arg2 && ~var11.field8773 == ~arg3 && ~var11.field8781 == ~arg7) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class639();
            var10.field8773 = arg3;
            var10.field8774 = arg2;
            var10.field8787 = arg6;
            var10.field8781 = arg7;
            if (arg2 >= 0 && arg3 >= 0 && ~arg2 > ~class336.field4683 && class700.field9768 > arg3) {
                class30.method173(var10, true);
            }
            class633.field8740.method2770((byte) -13, var10);
        }
        var10.field8778 = arg8;
        var10.field8786 = arg9;
        var10.field8776 = arg4;
        var10.field8784 = arg0;
        var10.field8780 = arg1;
    }

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "(I)Ljava/lang/String;", line = 77)
    public final String method1582(int arg0) {
        ++field3292;
        return arg0 != 0 ? null : this.field3304;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V", line = 89)
    public static final void method1583(byte arg0, String arg1, Throwable arg2) {
        ++field3291;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class739.method4130(-121, arg2);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class650.method3584((byte) -103, var3);
            String var4 = class187.method1172(":", "%3a", 0, var3);
            String var5 = class187.method1172("@", "%40", 0, var4);
            if (arg0 < -39) {
                String var6 = class187.method1172("&", "%26", 0, var5);
                String var7 = class187.method1172("#", "%23", 0, var6);
                if (class478.field6779 != null) {
                    class249 var8 = class597.field8389.method2040(new URL(class478.field6779.getCodeBase(), "clienterror.ws?c=" + class545.field7591 + "&u=" + (class546.field7606 != null ? class546.field7606 : String.valueOf(class433.field6180)) + "&v1=" + class316.field4374 + "&v2=" + class316.field4382 + "&e=" + var7), 14);
                    while (var8.field3310 == 0) {
                        class756.method4205(1L, 0);
                    }
                    if (var8.field3310 == 1) {
                        DataInputStream var9 = (DataInputStream) var8.field3311;
                        var9.read();
                        var9.close();
                    }
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(B)F", line = 141)
    public final float method1584(byte arg0) {
        if (arg0 != 64) {
            field3297 = null;
        }
        ++field3296;
        return this.field3295;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILjagtheora/ogg/OggPacket;)V", line = 156)
    public final void method579(int arg0, OggPacket arg1) {
        ++field3303;
        if (arg0 != -19767) {
            this.method579(49, (OggPacket) null);
        }
        if (~super.field2715 >= -1 || "SUB".equals(this.field3301)) {
            class675 var3 = new class675(arg1.getData());
            int var4 = var3.method3750((byte) 35);
            if (super.field2715 > 8) {
                if (~var4 == -1) {
                    long var5 = var3.method3727(-15100);
                    long var7 = var3.method3727(-15100);
                    long var9 = var3.method3727(-15100);
                    if (var5 < 0L || var7 < 0L || var9 < 0L || var5 < var9) {
                        throw new IllegalStateException();
                    }
                    this.field3300 = (float) ((long) this.field3302 * var5) / (float) this.field3299;
                    this.field3295 = (float) ((var5 + var7) * (long) this.field3302) / (float) this.field3299;
                    int var11 = var3.method3738((byte) 105);
                    if (~var11 > -1 || ~(var3.field9154.length + -var3.field9146) > ~var11) {
                        throw new IllegalStateException();
                    }
                    this.field3304 = class544.method3154(var11, var3.field9146, 240, var3.field9154);
                }
                if (~(var4 | 128) != -1) {
                    return;
                }
            } else {
                if ((128 | var4) == 0) {
                    throw new IllegalStateException();
                }
                if (~super.field2715 != -1) {
                    return;
                }
                var3.field9146 += 23;
                this.field3299 = var3.method3738((byte) 105);
                this.field3302 = var3.method3738((byte) 105);
                if (this.field3299 == 0 || this.field3302 == 0) {
                    throw new IllegalStateException();
                }
                class675 var12 = new class675(16);
                var3.method3723(var12.field9154, 4, 16, 0);
                this.field3290 = var12.method3697(arg0 + 19766);
                var12.field9146 = 0;
                var3.method3723(var12.field9154, 4, 16, 0);
                this.field3301 = var12.method3697(-1);
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)V", line = 240)
    public final void method584(int arg0) {
        ++field3293;
        if (arg0 > -8) {
            this.field3295 = -1.2969289F;
        }
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 251)
    public class248(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "(Z)Ljava/lang/String;", line = 262)
    public final String method1585(boolean arg0) {
        ++field3298;
        if (arg0) {
            this.method1584((byte) -124);
        }
        return this.field3290;
    }
}
