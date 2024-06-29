import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class791 {

    @OriginalMember(owner = "client!f", name = "f", descriptor = "Liha;")
    private class29 field11545 = new class29(64);

    @OriginalMember(owner = "client!f", name = "h", descriptor = "Lgda;")
    private class58 field11547;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11551 = new String[] { method5694(method5693("O*\u0013t")), method5694(method5693("O*\u0014t")), method5694(method5693("O*\u0017t")), method5694(method5693("O*\u0016t")), method5694(method5693("O*\u0010t")), method5694(method5693("Gq>0")), method5694(method5693("R*|r&")), method5694(method5693("O*n55@plt")), method5694(method5693("O*\u0011t")) };

    @OriginalMember(owner = "client!f", name = "i", descriptor = "Lak;")
    public static class369 field11549 = new class369();

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field11542;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field11543;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field11544;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field11546;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field11548;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field11550;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V", line = 4)
    public final void method5687(int arg0) {
        try {
            field11548++;
            class29 var2 = this.field11545;
            synchronized (this.field11545) {
                if (arg0 >= 58) {
                    this.field11545.method298(5);
                }
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field11551[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V", line = 20)
    public static void method5688(int arg0) {
        try {
            if (arg0 > -76) {
                method5692(31);
            }
            field11549 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11551[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V", line = 30)
    public final void method5689(int arg0, int arg1) {
        try {
            field11543++;
            int var3 = -3 % ((arg0 + 65) / 37);
            class29 var4 = this.field11545;
            synchronized (this.field11545) {
                this.field11545.method294(arg1, -630);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field11551[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)Lcg;", line = 42)
    public final class145 method5690(byte arg0, int arg1) {
        try {
            field11544++;
            class29 var3 = this.field11545;
            class145 var4;
            synchronized (this.field11545) {
                var4 = (class145) this.field11545.method302(-106, (long) arg1);
            }
            if (var4 != null) {
                return var4;
            }
            class58 var5 = this.field11547;
            byte[] var6;
            synchronized (this.field11547) {
                if (arg0 != 43) {
                    this.field11547 = null;
                }
                var6 = this.field11547.method604((byte) 2, arg1, 31);
            }
            class145 var7 = new class145();
            if (var6 != null) {
                var7.method1334((byte) -126, new class176(var6));
            }
            class29 var8 = this.field11545;
            synchronized (this.field11545) {
                this.field11545.method295(false, (long) arg1, var7);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field11551[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V", line = 78)
    public final void method5691(int arg0) {
        try {
            field11542++;
            if (arg0 != 31) {
                field11550 = 69;
            }
            class29 var2 = this.field11545;
            synchronized (this.field11545) {
                this.field11545.method304(1);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field11551[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V", line = 96)
    public static final void method5692(int arg0) {
        try {
            field11546++;
            class309.field5028 = new class683[class735.field10780.method600(arg0 ^ 0x41)][];
            class97.field1434 = new class683[class735.field10780.method600(arg0 - 63)][];
            if (arg0 == 64) {
                class572.field8277 = new boolean[class735.field10780.method600(arg0 - 63)];
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11551[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lpo;ILgda;)V", line = 116)
    public class791(class585 arg0, int arg1, class58 arg2) {
        try {
            this.field11547 = arg2;
            this.field11547.method580(83, 31);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field11551[7] + (arg0 == null ? field11551[5] : field11551[6]) + ',' + arg1 + ',' + (arg2 == null ? field11551[5] : field11551[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!f", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5693(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!f", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5694(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 41;
                    break;
                case 1:
                    var10005 = 4;
                    break;
                case 2:
                    var10005 = 82;
                    break;
                case 3:
                    var10005 = 92;
                    break;
                default:
                    var10005 = 91;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
