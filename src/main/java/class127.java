import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class127 {

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    private int field2244 = 0;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Llj;")
    private class25 field2250;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Lcf;")
    public static class93 field2245 = class147.method1066("<col=c0ff00>", -48);

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Llb;")
    public static class130 field2243;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Lre;")
    private class222 field2242;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIILgl;JLgl;Lgl;)V")
    public static final void method926(int arg0, int arg1, int arg2, int arg3, class211 arg4, long arg5, class211 arg6, class211 arg7) {
        class112 var9 = new class112();
        var9.field1912 = arg4;
        var9.field1918 = arg1 * 128 + 64;
        var9.field1902 = arg2 * 128 + 64;
        var9.field1911 = arg3;
        var9.field1910 = arg5;
        var9.field1915 = arg6;
        var9.field1905 = arg7;
        int var10 = 0;
        class41 var11 = class232.field4138[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field645; var12++) {
                class229 var13 = var11.field637[var12];
                if ((var13.field4094 & 0x400000L) == 4194304L) {
                    int var14 = var13.field4104.method93();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field1908 = -var10;
        if (class232.field4138[arg0][arg1][arg2] == null) {
            class232.field4138[arg0][arg1][arg2] = new class41(arg0, arg1, arg2);
        }
        class232.field4138[arg0][arg1][arg2].field646 = var9;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    public static void method927(byte arg0) {
        field2243 = null;
        if (arg0 == 99) {
            field2245 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)Lqc;")
    public static final class63 method928(int arg0, byte arg1) {
        field2247++;
        class63 var2 = (class63) class168.field2954.method1852((long) arg0, (byte) -105);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = class105.field1821.method1271(1, -2154, arg0 & 0x7FFF);
        } else {
            var3 = class257.field4630.method1271(1, -2154, arg0);
        }
        class63 var4 = new class63();
        if (arg1 != 18) {
            return null;
        }
        if (var3 != null) {
            var4.method407(new class280(var3), (byte) -113);
        }
        if (arg0 >= 32768) {
            var4.method403(arg1 + 109);
        }
        class168.field2954.method1847(var4, 110, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)Lre;")
    public final class222 method929(int arg0) {
        if (arg0 < 108) {
            return null;
        } else {
            field2246++;
            this.field2244 = 0;
            return this.method930(127);
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)Lre;")
    public final class222 method930(int arg0) {
        field2251++;
        int var2 = -73 % ((arg0 - 76) / 47);
        if (this.field2244 > 0 && this.field2250.field321[this.field2244 - 1] != this.field2242) {
            class222 var3 = this.field2242;
            this.field2242 = var3.field4007;
            return var3;
        }
        while (this.field2250.field324 > this.field2244) {
            class222 var4 = this.field2250.field321[this.field2244++].field4007;
            if (this.field2250.field321[this.field2244 - 1] != var4) {
                this.field2242 = var4.field4007;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method931(byte arg0, String arg1, Throwable arg2) {
        if (arg0 != -124) {
            method927((byte) -21);
        }
        field2249++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class216.method1522(16, arg2);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class198.method1423((byte) 121, var3);
            String var4 = class125.method916(0, var3, "%3a", ":");
            String var5 = class125.method916(0, var4, "%40", "@");
            String var6 = class125.method916(0, var5, "%26", "&");
            String var7 = class125.method916(0, var6, "%23", "#");
            if (class110.field1873.field5113 != null) {
                class22 var8 = class110.field1873.method1951(arg0 + 2952, new URL(class110.field1873.field5113.getCodeBase(), "clienterror.ws?c=" + class50.field828 + "&u=" + class167.field2946 + "&v1=" + class286.field5126 + "&v2=" + class286.field5114 + "&e=" + var7));
                while (var8.field290 == 0) {
                    class53.method290(1L, true);
                }
                if (var8.field290 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field292;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Llj;)V")
    public class127(class25 arg0) {
        this.field2250 = arg0;
    }
}
