import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class271 {

    @OriginalMember(owner = "client!sda", name = "j", descriptor = "Lwq;")
    private class178 field4112 = new class178(64);

    @OriginalMember(owner = "client!sda", name = "f", descriptor = "Lwq;")
    private class178 field4120 = new class178(100);

    @OriginalMember(owner = "client!sda", name = "h", descriptor = "Lla;")
    private class476 field4114;

    @OriginalMember(owner = "client!sda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4121 = new String[] { method2250(method2249("v~vEa-")), method2250(method2249("v~vEd-")), method2250(method2249("~49E^")), method2250(method2249("v~vE\u001flt~\u001f\u001d-")), method2250(method2249("ko{\u0007")), method2250(method2249("v~vEe-")), method2250(method2249("v~vEb-")), method2250(method2249("v~vEf-")), method2250(method2249("v~vE`-")) };

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "[I")
    public static int[] field4111 = new int[1000];

    @OriginalMember(owner = "client!sda", name = "d", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!sda", name = "g", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!sda", name = "e", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!sda", name = "i", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(II)Lhs;", line = 7)
    public final class344 method2242(int arg0, int arg1) {
        try {
            field4113++;
            class178 var3 = this.field4112;
            class344 var4;
            synchronized (this.field4112) {
                var4 = (class344) this.field4112.method1558((byte) 96, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class476 var5 = this.field4114;
            byte[] var6;
            synchronized (this.field4114) {
                var6 = this.field4114.method3632(class256.method2172(arg0, 0), class112.method980((byte) 56, arg0), arg1 - 221);
            }
            class344 var7 = new class344();
            if (arg1 != 100) {
                method2245(105);
            }
            var7.field5359 = arg0;
            var7.field5343 = this;
            if (var6 != null) {
                var7.method2852(arg1 ^ 0x7, new class163(var6));
            }
            var7.method2850(122);
            class178 var8 = this.field4112;
            synchronized (this.field4112) {
                this.field4112.method1556((long) arg0, var7, 1);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field4121[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(II)Lkl;", line = 39)
    public final class87 method2243(int arg0, int arg1) {
        try {
            field4119++;
            class178 var3 = this.field4120;
            synchronized (this.field4120) {
                class87 var4 = (class87) this.field4120.method1558((byte) 96, (long) arg0);
                if (arg1 != 64) {
                    this.method2244(82);
                }
                if (var4 == null) {
                    var4 = new class87(arg0);
                    this.field4120.method1556((long) arg0, var4, 1);
                }
                return var4.method736(false) ? var4 : null;
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field4121[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)V", line = 66)
    public final void method2244(int arg0) {
        try {
            if (arg0 != 64) {
                field4116 = 121;
            }
            class178 var2 = this.field4112;
            synchronized (this.field4112) {
                this.field4112.method1569(10574);
            }
            field4115++;
            class178 var3 = this.field4120;
            synchronized (this.field4120) {
                this.field4120.method1569(10574);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field4121[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)V", line = 82)
    public static void method2245(int arg0) {
        try {
            if (arg0 != 1000) {
                field4116 = -15;
            }
            field4111 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4121[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(B)V", line = 95)
    public final void method2246(byte arg0) {
        try {
            class178 var2 = this.field4112;
            synchronized (this.field4112) {
                this.field4112.method1559(0);
            }
            field4117++;
            class178 var3 = this.field4120;
            synchronized (this.field4120) {
                this.field4120.method1559(0);
            }
            if (arg0 != -99) {
                this.field4114 = null;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field4121[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(IZ)V", line = 117)
    public final void method2247(int arg0, boolean arg1) {
        try {
            class178 var3 = this.field4112;
            synchronized (this.field4112) {
                if (arg1) {
                    field4111 = null;
                }
                this.field4112.method1557(arg0, (byte) -122);
            }
            field4118++;
            class178 var4 = this.field4120;
            synchronized (this.field4120) {
                this.field4120.method1557(arg0, (byte) -114);
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field4121[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(III)Lqj;", line = 137)
    public static final class535 method2248(int arg0, int arg1, int arg2) {
        class96 var3 = class734.field10683[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1080;
    }

    @OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Lto;ILla;Lla;Lla;)V", line = 153)
    public class271(class8 arg0, int arg1, class476 arg2, class476 arg3, class476 arg4) {
        try {
            this.field4114 = arg2;
            if (this.field4114 != null) {
                int var6 = this.field4114.method3629((byte) 18) - 1;
                this.field4114.method3646(var6, (byte) -77);
            }
            class704.method5138(arg3, 2, arg4, 65);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field4121[3] + (arg0 == null ? field4121[4] : field4121[2]) + ',' + arg1 + ',' + (arg2 == null ? field4121[4] : field4121[2]) + ',' + (arg3 == null ? field4121[4] : field4121[2]) + ',' + (arg4 == null ? field4121[4] : field4121[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!sda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2249(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x23);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2250(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 5;
                    break;
                case 1:
                    var10005 = 26;
                    break;
                case 2:
                    var10005 = 23;
                    break;
                case 3:
                    var10005 = 107;
                    break;
                default:
                    var10005 = 35;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
