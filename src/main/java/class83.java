import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public abstract class class83 {

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "I")
    private int field1165;

    @OriginalMember(owner = "client!qw", name = "h", descriptor = "Ldia;")
    public class246 field1170;

    @OriginalMember(owner = "client!qw", name = "j", descriptor = "I")
    private int field1172;

    @OriginalMember(owner = "client!qw", name = "e", descriptor = "Z")
    private boolean field1167;

    @OriginalMember(owner = "client!qw", name = "i", descriptor = "I")
    public int field1171;

    @OriginalMember(owner = "client!qw", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1166 = null;

    @OriginalMember(owner = "client!qw", name = "f", descriptor = "Lmt;")
    public static class419 field1168 = new class419(0, 2, 2, 1);

    @OriginalMember(owner = "client!qw", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1175 = "";

    @OriginalMember(owner = "client!qw", name = "l", descriptor = "Ltja;")
    public static class288 field1174 = new class288(14, 7);

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!qw", name = "g", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!qw", name = "k", descriptor = "Leba;")
    public static class615 field1173;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "([BII)V", line = 6)
    public final void method691(byte[] arg0, int arg1, int arg2) {
        this.method694(arg1 ^ 0x4316);
        field1164++;
        if (arg1 != 17199) {
            this.field1170 = null;
        }
        if (this.field1165 >= arg2) {
            OpenGL.glBufferSubDataARBub(this.field1172, 0, arg2, arg0, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field1172, arg2, arg0, 0, this.field1167 ? 35040 : 35044);
            this.field1170.field3549 += arg2 - this.field1165;
            this.field1165 = arg2;
        }
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(B)V", line = 34)
    public static void method692(byte arg0) {
        field1173 = null;
        int var1 = 31 % ((-arg0 - 26) / 38);
        field1168 = null;
        field1175 = null;
        field1174 = null;
        field1166 = null;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIIII)V", line = 48)
    public static final void method693(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class39 var5 = (class39) class255.field3809.method2551((byte) -108); var5 != null; var5 = (class39) class255.field3809.method2542(-102)) {
            class774.method4292(arg3, arg0, -112, var5, arg1, arg2);
        }
        field1169++;
        for (class39 var6 = (class39) class573.field7696.method2551((byte) -108); var6 != null; var6 = (class39) class573.field7696.method2542(-121)) {
            byte var13 = 1;
            class208 var14 = var6.field619.method1014((byte) -34);
            if (var6.field619.field1794 == -1 || var6.field619.field1826) {
                var13 = 0;
            } else if (var6.field619.field1794 == var14.field2765 || var6.field619.field1794 == var14.field2744 || var6.field619.field1794 == var14.field2737 || var6.field619.field1794 == var14.field2739) {
                var13 = 2;
            } else if (var6.field619.field1794 == var14.field2716 || var6.field619.field1794 == var14.field2727 || var6.field619.field1794 == var14.field2729 || var6.field619.field1794 == var14.field2754) {
                var13 = 3;
            }
            if (var6.field605 != var13) {
                int var15 = class467.method2759(var6.field619, 125);
                class220 var16 = var6.field619.field2577;
                if (var16.field2995 != null) {
                    var16 = var16.method1449(class382.field5602, -1);
                }
                if (var16 == null || var15 == -1) {
                    var6.field595 = false;
                    var6.field605 = var13;
                    var6.field592 = -1;
                } else if (var6.field592 == var15 && var16.field2985 == var6.field595) {
                    var6.field605 = var13;
                    var6.field594 = var16.field2946;
                } else {
                    boolean var17 = false;
                    if (var6.field611 == null) {
                        var17 = true;
                    } else {
                        var6.field594 -= 512;
                        if (var6.field594 <= 0) {
                            class686.field9647.method590(var6.field611);
                            var6.field611 = null;
                            var17 = true;
                        }
                    }
                    if (var17) {
                        var6.field600 = null;
                        var6.field595 = var16.field2985;
                        var6.field596 = null;
                        var6.field592 = var15;
                        var6.field594 = var16.field2946;
                        var6.field605 = var13;
                    }
                }
            }
            var6.field627 = var6.field619.field2257;
            var6.field604 = var6.field619.field2257 + (var6.field619.method655(-127) << 8);
            var6.field612 = var6.field619.field2259;
            var6.field597 = var6.field619.field2259 + (var6.field619.method655(-126) << 8);
            class774.method4292(arg3, arg0, -83, var6, arg1, arg2);
        }
        class39 var7 = (class39) class680.field9518.method3960(0);
        int var8 = 63 % ((arg4 - 69) / 41);
        while (var7 != null) {
            byte var9 = 1;
            class208 var10 = var7.field610.method1014((byte) -34);
            if (var7.field610.field1794 == -1 || var7.field610.field1826) {
                var9 = 0;
            } else if (var7.field610.field1794 == var10.field2765 || var7.field610.field1794 == var10.field2744 || var7.field610.field1794 == var10.field2737 || var7.field610.field1794 == var10.field2739) {
                var9 = 2;
            } else if (var7.field610.field1794 == var10.field2716 || var7.field610.field1794 == var10.field2727 || var7.field610.field1794 == var10.field2729 || var7.field610.field1794 == var10.field2754) {
                var9 = 3;
            }
            if (var7.field605 != var9) {
                int var11 = class720.method4019((byte) -109, var7.field610);
                if (var7.field592 == var11 && var7.field595 == var7.field610.field1053) {
                    var7.field594 = var7.field610.field1077;
                    var7.field605 = var9;
                } else {
                    boolean var12 = false;
                    if (var7.field611 == null) {
                        var12 = true;
                    } else {
                        var7.field594 -= 512;
                        if (var7.field594 <= 0) {
                            class686.field9647.method590(var7.field611);
                            var12 = true;
                            var7.field611 = null;
                        }
                    }
                    if (var12) {
                        var7.field600 = null;
                        var7.field592 = var11;
                        var7.field594 = var7.field610.field1077;
                        var7.field596 = null;
                        var7.field605 = var9;
                        var7.field595 = var7.field610.field1053;
                    }
                }
            }
            var7.field627 = var7.field610.field2257;
            var7.field604 = var7.field610.field2257 + (var7.field610.method655(-126) << 8);
            var7.field612 = var7.field610.field2259;
            var7.field597 = var7.field610.field2259 + (var7.field610.method655(-127) << 8);
            class774.method4292(arg3, arg0, -71, var7, arg1, arg2);
            var7 = (class39) class680.field9518.method3955((byte) 30);
        }
    }

    @OriginalMember(owner = "client!qw", name = "finalize", descriptor = "()V", line = 225)
    protected final void finalize() throws Throwable {
        this.field1170.method1646(this.field1171, this.field1165, -24937);
        field1163++;
        super.finalize();
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Ldia;I[BIZ)V", line = 238)
    public class83(class246 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field1165 = arg3;
        this.field1170 = arg0;
        this.field1172 = arg1;
        this.field1167 = arg4;
        OpenGL.glGenBuffersARB(1, class775.field10668, 0);
        this.field1171 = class775.field10668[0];
        this.method694(-128);
        OpenGL.glBufferDataARBub(arg1, this.field1165, arg2, 0, this.field1167 ? 35040 : 35044);
        this.field1170.field3549 += this.field1165;
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Ldia;ILjaclib/memory/Buffer;IZ)V", line = 262)
    public class83(class246 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field1165 = arg3;
        this.field1167 = arg4;
        this.field1172 = arg1;
        this.field1170 = arg0;
        OpenGL.glGenBuffersARB(1, class775.field10668, 0);
        this.field1171 = class775.field10668[0];
        this.method694(54);
        OpenGL.glBufferDataARBa(arg1, this.field1165, arg2.getAddress(), this.field1167 ? 35040 : 35044);
        this.field1170.field3549 += this.field1165;
    }

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "(I)V")
    public abstract void method694(int arg0);
}
