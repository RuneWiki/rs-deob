import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class302 {

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "Lwq;")
    private class178 field4731 = new class178(64);

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "Lla;")
    private class476 field4729;

    @OriginalMember(owner = "client!ao", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4736 = new String[] { method2540(method2539("kf?Vl")), method2540(method2539("~=}\u0014")), method2540(method2539("q'?Dx~!eF9")), method2540(method2539("q'?;9")), method2540(method2539("q'?=9")), method2540(method2539("q'?99")), method2540(method2539("q'?<9")), method2540(method2539("q'?:9")) };

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "Luaa;")
    public static class128 field4732 = new class128();

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "[I")
    public static int[] field4735;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZ)V")
    public final void method2534(int arg0, boolean arg1) {
        try {
            class178 var3 = this.field4731;
            synchronized (this.field4731) {
                this.field4731.method1557(arg0, (byte) -107);
            }
            if (arg1) {
                field4734++;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field4736[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)V")
    public final void method2535(boolean arg0) {
        try {
            field4728++;
            class178 var2 = this.field4731;
            synchronized (this.field4731) {
                this.field4731.method1569(10574);
            }
            if (!arg0) {
                this.field4731 = null;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4736[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
    public static void method2536(int arg0) {
        try {
            if (arg0 == 35) {
                field4735 = null;
                field4732 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4736[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)Ldba;")
    public final class102 method2537(int arg0, int arg1) {
        try {
            field4733++;
            class178 var3 = this.field4731;
            class102 var4;
            synchronized (this.field4731) {
                var4 = (class102) this.field4731.method1558((byte) 96, (long) arg1);
            }
            if (var4 != null) {
                return var4;
            }
            class476 var5 = this.field4729;
            byte[] var6;
            synchronized (this.field4729) {
                var6 = this.field4729.method3632(35, arg1, -127);
            }
            if (arg0 >= -13) {
                return null;
            }
            class102 var7 = new class102();
            if (var6 != null) {
                var7.method837(0, new class163(var6));
            }
            var7.method835(117);
            class178 var8 = this.field4731;
            synchronized (this.field4731) {
                this.field4731.method1556((long) arg1, var7, 1);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field4736[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V")
    public final void method2538(byte arg0) {
        try {
            class178 var2 = this.field4731;
            synchronized (this.field4731) {
                this.field4731.method1559(0);
            }
            if (arg0 != -104) {
                field4732 = null;
            }
            field4730++;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4736[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lto;ILla;)V")
    public class302(class8 arg0, int arg1, class476 arg2) {
        try {
            this.field4729 = arg2;
            if (this.field4729 != null) {
                this.field4729.method3646(35, (byte) -55);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4736[2] + (arg0 == null ? field4736[1] : field4736[0]) + ',' + arg1 + ',' + (arg2 == null ? field4736[1] : field4736[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!ao", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2539(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x11);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ao", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2540(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 16;
                    break;
                case 1:
                    var10005 = 72;
                    break;
                case 2:
                    var10005 = 17;
                    break;
                case 3:
                    var10005 = 120;
                    break;
                default:
                    var10005 = 17;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
