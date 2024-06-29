import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class199 extends class189 {

    @OriginalMember(owner = "client!wa", name = "kb", descriptor = "I")
    public static int field3973 = 0;

    @OriginalMember(owner = "client!wa", name = "tb", descriptor = "Lgg;")
    public static class63 field3982 = class116.method911(43, "Versteckt");

    @OriginalMember(owner = "client!wa", name = "ob", descriptor = "I")
    public static int field3977 = 0;

    @OriginalMember(owner = "client!wa", name = "rb", descriptor = "I")
    public static int field3980 = 0;

    @OriginalMember(owner = "client!wa", name = "xb", descriptor = "Lgg;")
    public static class63 field3986 = class116.method911(43, "k");

    @OriginalMember(owner = "client!wa", name = "yb", descriptor = "Lgg;")
    public static class63 field3987 = class116.method911(43, "huffman");

    @OriginalMember(owner = "client!wa", name = "gb", descriptor = "I")
    private int field3969;

    @OriginalMember(owner = "client!wa", name = "hb", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!wa", name = "ib", descriptor = "I")
    private int field3971;

    @OriginalMember(owner = "client!wa", name = "jb", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!wa", name = "nb", descriptor = "I")
    private int field3976;

    @OriginalMember(owner = "client!wa", name = "pb", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!wa", name = "qb", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!wa", name = "sb", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!wa", name = "ub", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!wa", name = "vb", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!wa", name = "wb", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!wa", name = "lb", descriptor = "Lpf;")
    public static class141 field3974;

    @OriginalMember(owner = "client!wa", name = "mb", descriptor = "[I")
    public static int[] field3975;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(BII)I")
    public static final int method1298(byte arg0, int arg1, int arg2) {
        ++field3978;
        int var3 = class17.method185(4, 8, arg2 - -45365, arg1 - -91923) - (128 + (-(-128 + class17.method185(2, 8, arg2 + 10294, arg1 - -37821) >> 1) - (-128 + class17.method185(1, 8, arg2, arg1) >> 2)));
        int var4 = -89 % ((arg0 - 59) / 60);
        int var5 = (int) ((double) var3 * 0.3D) + 35;
        if (var5 >= 10) {
            if (~var5 < -61) {
                var5 = 60;
            }
        } else {
            var5 = 10;
        }
        return var5;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        if (arg0 == 0) {
            this.method1301((byte) -70, arg2.method20((byte) 66));
        }
        if (arg1 <= 32) {
            field3982 = null;
        }
        ++field3972;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)[[I")
    public final int[][] method83(int arg0, int arg1) {
        ++field3985;
        if (arg1 < 34) {
            method1302((String) null, (Throwable) null, true);
        }
        int[][] var3 = super.field3808.method237(-1, arg0);
        if (super.field3808.field561) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class54.field1430; ++var7) {
                var4[var7] = this.field3971;
                var5[var7] = this.field3969;
                var6[var7] = this.field3976;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lgg;Ljc;BLjc;Lgg;)Lth;")
    public static final class179 method1299(class63 arg0, class85 arg1, byte arg2, class85 arg3, class63 arg4) {
        ++field3981;
        if (arg2 != -83) {
            method1302((String) null, (Throwable) null, true);
        }
        int var5 = arg3.method751(-29355, arg4);
        int var6 = arg3.method748(arg2 + 83, arg0, var5);
        return class11.method144(arg3, var6, var5, arg1, (byte) 36);
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
    public static void method1300(int arg0) {
        field3974 = null;
        field3986 = null;
        if (arg0 == -2449) {
            field3987 = null;
            field3975 = null;
            field3982 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(I)V")
    private class199(int arg0) {
        super(0, false);
        this.method1301((byte) -58, arg0);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(BI)V")
    private final void method1301(byte arg0, int arg1) {
        this.field3971 = 4080 & arg1 >> 12;
        this.field3976 = (255 & arg1) << 4;
        this.field3969 = 4080 & arg1 >> 4;
        if (arg0 > -42) {
            this.field3969 = 125;
        }
        ++field3983;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
    public class199() {
        this(0);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;Z)V")
    public static final void method1302(String arg0, Throwable arg1, boolean arg2) {
        ++field3970;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class206.method1355(arg1, 39);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class108.field2447.field3145 != null) {
                if (!arg2) {
                    field3975 = null;
                }
                class87 var8 = class108.field2447.method1041(93, new URL(class108.field2447.field3145.getCodeBase(), "clienterror.ws?c=" + class164.field3379 + "&u=" + class112.field2518 + "&v1=" + class149.field3134 + "&v2=" + class149.field3141 + "&e=" + var7));
                while (var8.field2058 == 0) {
                    class196.method1281((byte) -8, 1L);
                }
                if (~var8.field2058 == -2) {
                    DataInputStream var9 = (DataInputStream) var8.field2060;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }
}
