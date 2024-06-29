import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class207 extends class43 {

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "Lp;")
    public static class280 field3578 = class18.method140((byte) -120, "ul");

    @OriginalMember(owner = "client!cc", name = "V", descriptor = "[Z")
    public static boolean[] field3583 = new boolean[100];

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "I")
    public int field3576;

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!cc", name = "W", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!cc", name = "X", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!cc", name = "Y", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "Lpa;")
    public class211 field3582;

    @OriginalMember(owner = "client!cc", name = "Z", descriptor = "[B")
    public byte[] field3587;

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "[I")
    public static int[] field3580;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V")
    public static final void method1398(String arg0, int arg1, Throwable arg2) {
        ++field3584;
        try {
            String var3 = "";
            int var4 = -82 % ((25 - arg1) / 33);
            if (arg2 != null) {
                var3 = class41.method320(40, arg2);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class92.method657(var3, (byte) -121);
            String var5 = var3.replace(':', '.');
            String var6 = var5.replace('@', '_');
            String var7 = var6.replace('&', '_');
            String var8 = var7.replace('#', '_');
            if (class252.field4409.field3473 != null) {
                class174 var9 = class252.field4409.method1353(new URL(class252.field4409.field3473.getCodeBase(), "clienterror.ws?c=" + class40.field691 + "&u=" + class130.field2300 + "&v1=" + class198.field3462 + "&v2=" + class198.field3474 + "&e=" + var8), (byte) 49);
                while (var9.field3025 == 0) {
                    class159.method1130(1L, 0);
                }
                if (~var9.field3025 == -2) {
                    DataInputStream var10 = (DataInputStream) var9.field3028;
                    var10.read();
                    var10.close();
                }
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)V")
    public static final void method1399(int arg0, int arg1, int arg2, int arg3) {
        ++field3581;
        class280 var4 = class30.method266(new class280[] { class271.field4734, class249.method1685((byte) -100, arg1), class8.field150, class249.method1685((byte) -71, arg0 >> 6), class8.field150, class249.method1685((byte) 43, arg3 >> 6), class8.field150, class249.method1685((byte) -78, arg0 & 63), class8.field150, class249.method1685((byte) 114, 63 & arg3) }, (byte) -87);
        var4.method1901(arg2 + -29607);
        class43.method325(var4, (byte) -103);
        if (arg2 != 29607) {
            method1400(-55);
        }
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)I")
    public final int method329(int arg0) {
        if (arg0 <= 120) {
            return -82;
        } else {
            ++field3579;
            return super.field721 ? 0 : 100;
        }
    }

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "(I)V")
    public static void method1400(int arg0) {
        field3583 = null;
        field3580 = null;
        if (arg0 != 35) {
            field3583 = null;
        }
        field3578 = null;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(BI)Lph;")
    public static final class78 method1401(byte arg0, int arg1) {
        class78 var2 = (class78) class8.field167.method1480((byte) 50, (long) arg1);
        ++field3585;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class177.field3077.method1258(class130.method896((byte) -115, arg1), class134.method926(11, arg1), (byte) 106);
            class78 var4 = new class78();
            if (var3 != null) {
                var4.method580((byte) 92, new class25(var3));
            }
            var4.method579(0);
            class8.field167.method1483((byte) -120, (long) arg1, var4);
            if (arg0 != -22) {
                field3580 = null;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)[B")
    public final byte[] method324(int arg0) {
        ++field3577;
        if (super.field721) {
            throw new RuntimeException();
        } else {
            return arg0 > -14 ? null : this.field3587;
        }
    }
}
