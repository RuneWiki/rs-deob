import jaggl.OpenGL;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class88 extends class318 {

    @OriginalMember(owner = "client!hu", name = "r", descriptor = "Z")
    private boolean field1260 = false;

    @OriginalMember(owner = "client!hu", name = "m", descriptor = "Lrn;")
    private class178 field1255;

    @OriginalMember(owner = "client!hu", name = "j", descriptor = "Z")
    public static boolean field1252 = false;

    @OriginalMember(owner = "client!hu", name = "n", descriptor = "Lhn;")
    public static class509 field1256 = new class509(78, 2);

    @OriginalMember(owner = "client!hu", name = "A", descriptor = "Lls;")
    public static class95 field1269 = null;

    @OriginalMember(owner = "client!hu", name = "x", descriptor = "I")
    public static int field1266 = 0;

    @OriginalMember(owner = "client!hu", name = "i", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!hu", name = "k", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!hu", name = "l", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!hu", name = "o", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!hu", name = "p", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!hu", name = "q", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!hu", name = "s", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!hu", name = "t", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!hu", name = "u", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!hu", name = "v", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!hu", name = "w", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!hu", name = "y", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!hu", name = "z", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lya;IILjt;II)V", line = 5)
    public static final void method726(class38 arg0, int arg1, int arg2, class69 arg3, int arg4, int arg5) {
        ++field1268;
        class373 var6 = class59.field711.method1062(112, arg3.field900);
        if (~var6.field5556 != 0) {
            int var8;
            if (arg3.field918) {
                int var7 = arg3.field898 + arg4;
                var8 = var7 & 3;
            } else {
                var8 = 0;
            }
            if (arg1 < 80) {
                method729(-85, (byte) 18);
            }
            class16 var9 = var6.method2333(var8, -1545209261, arg0, arg3.field899);
            if (var9 != null) {
                int var10 = arg3.field941;
                int var11 = arg3.field927;
                if (~(1 & var8) == -2) {
                    var10 = arg3.field927;
                    var11 = arg3.field941;
                }
                int var12 = var9.method129();
                int var13 = var9.method139();
                if (var6.field5551) {
                    var13 = var11 * 4;
                    var12 = var10 * 4;
                }
                if (var6.field5548 != 0) {
                    var9.method135(arg2, -((var11 - 1) * 4) + arg5, var12, var13, 0, var6.field5548 | -16777216, 1);
                } else {
                    var9.method126(arg2, 4 - (var11 * 4 - arg5), var12, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZZ)V", line = 60)
    public final void method718(boolean arg0, boolean arg1) {
        if (!arg1) {
            ++field1253;
            class428 var3 = super.field4800.method1261(16386);
            if (this.field1255 != null && var3 != null && arg0) {
                this.field1255.method1191('\u0000', (byte) -19);
                super.field4800.method1307(1, (byte) 92);
                super.field4800.method1289(-19391, var3);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadMatrixf(super.field4800.field3061.method2067(false), 0);
                OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
                OpenGL.glMatrixMode(5888);
                super.field4800.method1307(0, (byte) 92);
                this.field1260 = true;
            } else {
                super.field4800.method1296(770, 34168, 0, (byte) -35);
            }
        }
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)Z", line = 90)
    public final boolean method721(int arg0) {
        if (arg0 != 0) {
            return true;
        } else {
            ++field1267;
            return true;
        }
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lkd;)V", line = 102)
    public class88(class188 arg0) {
        super(arg0);
        if (arg0.field3069) {
            this.field1255 = new class178(arg0, 2);
            this.field1255.method1192(0, (byte) 88);
            super.field4800.method1307(1, (byte) 92);
            super.field4800.method1242(34162, 7681, 34165);
            super.field4800.method1266(770, 2, 34168, 8960);
            super.field4800.method1296(770, 34167, 0, (byte) -77);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field4800.method1307(0, (byte) 92);
            this.field1255.method1196(120);
            this.field1255.method1192(1, (byte) 105);
            super.field4800.method1307(1, (byte) 92);
            super.field4800.method1242(34162, 8448, 8448);
            super.field4800.method1266(770, 2, 34166, 8960);
            super.field4800.method1296(770, 5890, 0, (byte) 81);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field4800.method1307(0, (byte) 92);
            this.field1255.method1196(117);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(III)V", line = 140)
    public final void method719(int arg0, int arg1, int arg2) {
        ++field1262;
        if (arg2 != 0) {
            method726((class38) null, -15, -52, (class69) null, -83, 127);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;)V", line = 151)
    public static final void method727(Throwable arg0, int arg1, String arg2) {
        ++field1264;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class238.method1648(arg0, 121);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class201.method1411(var3, true);
            String var4 = class529.method3130(var3, ":", "%3a", 21);
            int var5 = -93 % ((arg1 - 17) / 39);
            String var6 = class529.method3130(var4, "@", "%40", 54);
            String var7 = class529.method3130(var6, "&", "%26", -103);
            String var8 = class529.method3130(var7, "#", "%23", -112);
            if (class116.field1766.field5199 != null) {
                class449 var9 = class116.field1766.method2187(2281, new URL(class116.field1766.field5199.getCodeBase(), "clienterror.ws?c=" + class227.field3698 + "&u=" + class188.field2867 + "&v1=" + class352.field5190 + "&v2=" + class352.field5188 + "&e=" + var8));
                while (~var9.field6570 == -1) {
                    class434.method2690(10, 1L);
                }
                if (~var9.field6570 == -2) {
                    DataInputStream var10 = (DataInputStream) var9.field6569;
                    var10.read();
                    var10.close();
                }
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z)V", line = 210)
    public static void method728(boolean arg0) {
        if (!arg0) {
            field1265 = -25;
        }
        field1256 = null;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lav;IB)V", line = 220)
    public final void method715(class454 arg0, int arg1, byte arg2) {
        if (arg2 > -108) {
            this.method718(true, false);
        }
        super.field4800.method1289(-19391, arg0);
        ++field1251;
        super.field4800.method1248(arg1, true);
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(B)V", line = 232)
    public final void method723(byte arg0) {
        if (this.field1260) {
            this.field1255.method1191('\u0001', (byte) -27);
            super.field4800.method1307(1, (byte) 92);
            super.field4800.method1289(-19391, (class454) null);
            super.field4800.method1307(0, (byte) 92);
        } else {
            super.field4800.method1296(770, 5890, 0, (byte) 108);
        }
        ++field1259;
        super.field4800.method1242(34162, 8448, 8448);
        this.field1260 = false;
        if (arg0 < 91) {
            method726((class38) null, 124, -15, (class69) null, 112, 28);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IB)Z", line = 260)
    public static final boolean method729(int arg0, byte arg1) {
        ++field1261;
        if (arg1 >= -103) {
            method729(-74, (byte) -58);
        }
        return ~arg0 == -1 || arg0 == 1;
    }

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "(I)V", line = 277)
    public static final void method730(int arg0) {
        ++field1257;
        class114.field1692 = -1;
        class364.field5384 = 0;
        class523.field7652 = arg0;
        class296.field4520 = -1;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IZ)V", line = 298)
    public final void method722(int arg0, boolean arg1) {
        int var3 = 54 % ((-23 - arg0) / 46);
        super.field4800.method1242(34162, 7681, 8448);
        ++field1254;
    }
}
