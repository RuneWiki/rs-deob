import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class244 {

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "B")
    private byte field3736;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public int field3735;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public int field3744;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public int field3737;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public int field3739;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public int field3738;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3747 = new String[] { method2081(method2080("F\u00148n:]\u0018bl{")), method2081(method2080("]\u0004z>")), method2081(method2080("H_8|.")), method2081(method2080("F\u00148\u0017{")), method2081(method2080("F\u00148\u0010{")), method2081(method2080("F\u00148\u0011{")), method2081(method2080("F\u00148\u0013{")), method2081(method2080("F\u00148\u0016{")) };

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Lqha;")
    public static class112 field3740 = new class112(16);

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "Lvha;")
    public static class713 field3746 = new class713(8, 3);

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(ILjava/lang/String;)V")
    public static final void method2075(int arg0, String arg1) {
        try {
            if (arg0 != -2) {
                field3746 = null;
            }
            class150.method1265("", arg1, -1, "", 0, 0, "");
            field3743++;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3747[7] + arg0 + ',' + (arg1 == null ? field3747[1] : field3747[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)I")
    public final int method2076(int arg0) {
        try {
            if (arg0 != -9) {
                field3746 = null;
            }
            field3741++;
            return (this.field3736 & 0x8) == 8 ? 1 : 0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3747[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)I")
    public final int method2077(int arg0) {
        try {
            field3742++;
            if (arg0 != -24410) {
                this.field3736 = 19;
            }
            return this.field3736 & 0x7;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3747[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
    public class244() {
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lib;)V")
    public class244(class163 arg0) {
        try {
            this.field3736 = arg0.method1414(1);
            this.field3735 = arg0.method1445((byte) 115);
            this.field3744 = arg0.method1453((byte) 96);
            this.field3737 = arg0.method1453((byte) 94);
            this.field3739 = arg0.method1453((byte) 124);
            this.field3738 = arg0.method1453((byte) 87);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3747[0] + (arg0 == null ? field3747[1] : field3747[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2078(int arg0, String arg1) {
        try {
            field3745++;
            if (arg0 != -7431) {
                method2079(-39);
            }
            return class297.method2508((byte) -52, arg1, true, 10);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3747[4] + arg0 + ',' + (arg1 == null ? field3747[1] : field3747[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V")
    public static void method2079(int arg0) {
        try {
            if (arg0 == 1) {
                field3740 = null;
                field3746 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3747[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2080(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x53);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2081(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 51;
                    break;
                case 1:
                    var10005 = 113;
                    break;
                case 2:
                    var10005 = 22;
                    break;
                case 3:
                    var10005 = 82;
                    break;
                default:
                    var10005 = 83;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
