import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class395 {

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "Z")
    public boolean field6033 = true;

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
    private int field6045 = -1;

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "Len;")
    private class213 field6041;

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
    private int field6044;

    @OriginalMember(owner = "client!fs", name = "k", descriptor = "I")
    private int field6042;

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "Lnq;")
    private class325 field6047;

    @OriginalMember(owner = "client!fs", name = "s", descriptor = "I")
    private int field6050;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "Lwv;")
    private class25 field6032;

    @OriginalMember(owner = "client!fs", name = "l", descriptor = "Lvf;")
    private class105 field6043;

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "Lli;")
    private class300 field6040;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
    public static int field6037 = -1;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "Lla;")
    public static class319 field6036 = new class319(112, 6);

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!fs", name = "r", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!fs", name = "q", descriptor = "Ljs;")
    public static class221 field6048;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)V", line = 4)
    public static void method2454(boolean arg0) {
        if (arg0) {
            field6036 = null;
        }
        field6048 = null;
        field6036 = null;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(II[BI)V", line = 18)
    public final void method2455(int arg0, int arg1, byte[] arg2, int arg3) {
        this.field6040.method675((byte) 12, this.field6047.method2025((byte) 41, arg3) * arg0, arg2, arg3);
        field6035++;
        if (arg1 == 2) {
            this.method2459(this.field6040, arg0, -18066);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIIII)V", line = 31)
    public static final void method2456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 50) {
            method2454(true);
        }
        field6046++;
        if (class203.field2716.field1173 != 0 && arg1 != 0 && class303.field4434 < 50 && arg0 != -1) {
            class475.field7049[class303.field4434++] = new class153((byte) 1, arg0, arg1, arg5, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lnq;Len;Le;IIIII)V", line = 243)
    public class395(class325 arg0, class213 arg1, class376 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field6041 = arg1;
        this.field6044 = arg6;
        this.field6042 = arg7;
        this.field6047 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field340 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field5734[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field6050 = var10;
        if (var10 <= 0) {
            this.field6032 = null;
        } else {
            class164 var14 = new class164(var10 * 2);
            if (this.field6047.field4974) {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field340 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field5734[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method1114(var18[var19] & 0xFFFF, 92);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field340 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field5734[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method1111(var23[var24] & 0xFFFF, 21251);
                            }
                        }
                    }
                }
            }
            this.field6043 = this.field6047.method2094(false, var14.field2185, 5123, true, var14.field2219);
            this.field6040 = new class300(this.field6047, 5123, null, 1);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V", line = 57)
    public static final void method2457(String arg0, Throwable arg1, int arg2) {
        field6038++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class147.method972((byte) 71, arg1);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class337.method2188(true, var3);
            String var4 = class233.method1561(":", "%3a", var3, (byte) 56);
            String var5 = class233.method1561("@", "%40", var4, (byte) 79);
            String var6 = class233.method1561("&", "%26", var5, (byte) 78);
            String var7 = class233.method1561("#", "%23", var6, (byte) 115);
            if (class173.field2329.field7381 != null) {
                class234 var8 = class173.field2329.method2982((byte) -23, new URL(class173.field2329.field7381.getCodeBase(), "clienterror.ws?c=" + class151.field1973 + "&u=" + class243.field3411 + "&v1=" + class500.field7385 + "&v2=" + class500.field7367 + "&e=" + var7));
                while (var8.field3322 == 0) {
                    class388.method2433(1L, 48);
                }
                if (var8.field3322 == arg2) {
                    DataInputStream var9 = (DataInputStream) var8.field3324;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V", line = 117)
    private final void method2458(int arg0) {
        field6039++;
        if (!this.field6033) {
            return;
        }
        this.field6033 = false;
        byte[] var2 = this.field6041.field3021;
        byte[] var3 = this.field6047.field5037;
        int var4 = 0;
        int var5 = this.field6041.field3011;
        int var6 = this.field6044 + (this.field6041.field3011 * this.field6042);
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field6032 != null && this.field6045 == var4) {
            this.field6033 = false;
            return;
        }
        this.field6045 = var4;
        int var8 = arg0;
        int var9 = this.field6042 * var5 + this.field6044;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var9] == 0) {
                    int var12 = 0;
                    if (var2[var9 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var9 + var5] != 0) {
                        var12++;
                    }
                    var3[var8++] = (byte) (var12 * 17);
                } else {
                    var3[var8++] = 68;
                }
                var9++;
            }
            var9 += this.field6041.field3011 - 128;
        }
        if (this.field6032 == null) {
            this.field6032 = new class25(this.field6047, 3553, 6406, 128, 128, false, this.field6047.field5037, 6406, false);
            this.field6032.method229((byte) 77, false, false);
            this.field6032.method3176(false, true);
        } else {
            this.field6032.method233(128, 0, 22711, this.field6047.field5037, 0, 0, 128, 6406, 0, false);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lvf;II)V", line = 220)
    private final void method2459(class105 arg0, int arg1, int arg2) {
        field6034++;
        if (arg1 == 0) {
            return;
        }
        this.method2458(0);
        if (arg2 == -18066) {
            this.field6047.method2075(this.field6032, 0);
            this.field6047.method2065(4, 0, arg1, arg0, 119);
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)V", line = 369)
    public final void method2460(int arg0) {
        field6049++;
        this.method2459(this.field6043, this.field6050, -18066);
        int var2 = 49 % (arg0 / 38);
    }
}
