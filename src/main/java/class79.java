import java.io.DataInputStream;
import java.math.BigInteger;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class79 {

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "Lbm;")
    private class209 field1193 = new class209();

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1198 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "[I")
    public static int[] field1206 = new int[2];

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public static int field1208 = 10;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1209 = "Connecting to update server";

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public static int field1210 = 0;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "Lbm;")
    private class209 field1203;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)Lbm;")
    public final class209 method617(byte arg0) {
        class209 var2 = this.field1193.field3228;
        field1197++;
        if (this.field1193 == var2) {
            return null;
        }
        if (arg0 != 114) {
            this.method620((byte) -58);
        }
        var2.method1463((byte) -123);
        return var2;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public static void method618(int arg0) {
        if (arg0 != -1942) {
            field1206 = null;
        }
        field1209 = null;
        field1206 = null;
        field1198 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)V")
    public static final void method619(int arg0, byte arg1) {
        if (arg1 <= 35) {
            field1210 = 0;
        }
        class238.field3751.method1166((byte) 23, arg0);
        field1195++;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)Lbm;")
    public final class209 method620(byte arg0) {
        field1201++;
        class209 var2 = this.field1193.field3228;
        if (this.field1193 == var2) {
            this.field1203 = null;
            return null;
        }
        this.field1203 = var2.field3228;
        if (arg0 <= 72) {
            field1198 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lbm;B)V")
    public final void method621(class209 arg0, byte arg1) {
        if (arg0.field3229 != null) {
            arg0.method1463((byte) -121);
        }
        arg0.field3228 = this.field1193;
        field1199++;
        if (arg1 < -35) {
            arg0.field3229 = this.field1193.field3229;
            arg0.field3229.field3228 = arg0;
            arg0.field3228.field3229 = arg0;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IC)Z")
    public static final boolean method622(int arg0, char arg1) {
        if (arg0 == 1) {
            field1194++;
            return arg1 >= '0' && arg1 <= '9';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method623(byte arg0, String arg1) {
        field1207++;
        if (arg0 != -23) {
            method618(-5);
        }
        return class241.method1646(126, 10, arg1, true);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
    public static final void method624(String arg0, Throwable arg1, int arg2) {
        field1202++;
        try {
            if (arg2 == 0) {
                String var3 = "";
                if (arg1 != null) {
                    var3 = client.method1158(25169, arg1);
                }
                if (arg0 != null) {
                    if (arg1 != null) {
                        var3 = var3 + " | ";
                    }
                    var3 = var3 + arg0;
                }
                class154.method1111(10, var3);
                String var4 = class153.method1103(":", var3, "%3a", -46);
                String var5 = class153.method1103("@", var4, "%40", arg2 ^ 0xFFFFFFE4);
                String var6 = class153.method1103("&", var5, "%26", -33);
                String var7 = class153.method1103("#", var6, "%23", arg2 ^ 0xFFFFFF89);
                if (class39.field665.field63 != null) {
                    class139 var8 = class39.field665.method31(new URL(class39.field665.field63.getCodeBase(), "clienterror.ws?c=" + class49.field809 + "&u=" + class262.field4150 + "&v1=" + class4.field67 + "&v2=" + class4.field70 + "&e=" + var7), (byte) -112);
                    while (var8.field2082 == 0) {
                        class122.method922(1L, (byte) -120);
                    }
                    if (var8.field2082 == 1) {
                        DataInputStream var9 = (DataInputStream) var8.field2080;
                        var9.read();
                        var9.close();
                    }
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
    public class79() {
        this.field1193.field3229 = this.field1193;
        this.field1193.field3228 = this.field1193;
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(B)I")
    public final int method625(byte arg0) {
        field1196++;
        if (arg0 >= -34) {
            this.method620((byte) 12);
        }
        int var2 = 0;
        class209 var3 = this.field1193.field3228;
        while (this.field1193 != var3) {
            var3 = var3.field3228;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(B)Lbm;")
    public final class209 method626(byte arg0) {
        if (arg0 != 116) {
            this.method626((byte) -114);
        }
        field1205++;
        class209 var2 = this.field1203;
        if (this.field1193 == var2) {
            this.field1203 = null;
            return null;
        } else {
            this.field1203 = var2.field3228;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(B)V")
    public final void method627(byte arg0) {
        while (true) {
            class209 var2 = this.field1193.field3228;
            if (this.field1193 == var2) {
                if (arg0 != 114) {
                    this.field1203 = null;
                }
                this.field1203 = null;
                field1200++;
                return;
            }
            var2.method1463((byte) -119);
        }
    }
}
