import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class711 {

    @OriginalMember(owner = "client!ufa", name = "m", descriptor = "I")
    public int field10287 = 128;

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "I")
    public int field10288 = 128;

    @OriginalMember(owner = "client!ufa", name = "g", descriptor = "I")
    public int field10296;

    @OriginalMember(owner = "client!ufa", name = "k", descriptor = "I")
    public int field10293;

    @OriginalMember(owner = "client!ufa", name = "e", descriptor = "I")
    public int field10291;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "I")
    public int field10285;

    @OriginalMember(owner = "client!ufa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10298 = new String[] { method5166(method5165("3/\u001aX\u000f/'\u0012\u0002\rn")), method5166(method5165("(<\u0017\u001a")), method5166(method5165("=gUXN")), method5166(method5165("3/\u001aXwn")), method5166(method5165("3/\u001aXrn")), method5166(method5165("3/\u001aXpn")), method5166(method5165("3/\u001aXqn")) };

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "[I")
    public static int[] field10297 = new int[6];

    @OriginalMember(owner = "client!ufa", name = "l", descriptor = "D")
    public static double field10294;

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "I")
    public static int field10286;

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "I")
    public static int field10290;

    @OriginalMember(owner = "client!ufa", name = "j", descriptor = "I")
    public static int field10292;

    @OriginalMember(owner = "client!ufa", name = "h", descriptor = "I")
    public static int field10295;

    @OriginalMember(owner = "client!ufa", name = "i", descriptor = "[S")
    public static short[] field10289;

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(I)V")
    public static void method5161(int arg0) {
        try {
            field10297 = null;
            field10289 = null;
            if (arg0 != 128) {
                method5163(false);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10298[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lufa;I)V")
    public final void method5162(class711 arg0, int arg1) {
        try {
            this.field10291 = arg0.field10291;
            if (arg1 <= 79) {
                method5163(false);
            }
            this.field10296 = arg0.field10296;
            this.field10287 = arg0.field10287;
            field10292++;
            this.field10285 = arg0.field10285;
            this.field10288 = arg0.field10288;
            this.field10293 = arg0.field10293;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10298[3] + (arg0 == null ? field10298[1] : field10298[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Z)V")
    public static final void method5163(boolean arg0) {
        try {
            field10290++;
            if (!arg0) {
                method5163(false);
            }
            class648.method4727(-97);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10298[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)Lufa;")
    public final class711 method5164(int arg0) {
        try {
            if (arg0 > -63) {
                field10286 = 78;
            }
            field10295++;
            return new class711(this.field10296, this.field10288, this.field10287, this.field10293, this.field10285, this.field10291);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10298[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(I)V")
    public class711(int arg0) {
        try {
            this.field10296 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10298[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(IIIIII)V")
    private class711(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            this.field10293 = arg3;
            this.field10288 = arg1;
            this.field10291 = arg5;
            this.field10285 = arg4;
            this.field10296 = arg0;
            this.field10287 = arg2;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field10298[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ufa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5165(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x33);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ufa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5166(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 70;
                    break;
                case 1:
                    var10005 = 73;
                    break;
                case 2:
                    var10005 = 123;
                    break;
                case 3:
                    var10005 = 118;
                    break;
                default:
                    var10005 = 51;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
