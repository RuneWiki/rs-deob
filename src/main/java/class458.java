import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public abstract class class458 extends class105 {

    @OriginalMember(owner = "client!sl", name = "A", descriptor = "S")
    public short field6453;

    @OriginalMember(owner = "client!sl", name = "F", descriptor = "S")
    public short field6458;

    @OriginalMember(owner = "client!sl", name = "B", descriptor = "Las;")
    public static class151 field6454 = new class151(12, 0, 1, 0);

    @OriginalMember(owner = "client!sl", name = "C", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!sl", name = "D", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!sl", name = "E", descriptor = "I")
    public static int field6457;

    @OriginalMember(owner = "client!sl", name = "G", descriptor = "I")
    public static int field6459;

    @OriginalMember(owner = "client!sl", name = "H", descriptor = "I")
    public static int field6460;

    @OriginalMember(owner = "client!sl", name = "I", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!sl", name = "J", descriptor = "I")
    public static int field6462;

    @OriginalMember(owner = "client!sl", name = "K", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!sl", name = "L", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!sl", name = "z", descriptor = "[Loia;")
    public static class88[] field6452;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "([Lwi;I)I", line = 4)
    public final int method618(class465[] arg0, int arg1) {
        ++field6455;
        if (arg1 != -1) {
            this.method621(97);
        }
        return this.method742(super.field1264 >> class660.field9038, arg0, (byte) -53, super.field1250 >> class660.field9038);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lvl;I)Z", line = 16)
    public static final boolean method2721(class13 arg0, int arg1) {
        ++field6463;
        if (arg1 != 70) {
            method2723((byte) -89);
        }
        return class271.field3885 == arg0 || class713.field9915 == arg0 || class440.field6257 == arg0 || class323.field4490 == arg0;
    }

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "(I)Z", line = 28)
    public final boolean method611(int arg0) {
        ++field6457;
        if (arg0 >= -85) {
            this.field6458 = 104;
        }
        return class19.method119(this.method749(32767), 57, super.field1250 >> class660.field9038, super.field1264 >> class660.field9038, super.field1258);
    }

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "(I)V", line = 40)
    public final void method614(int arg0) {
        ++field6464;
        if (arg0 == 26062) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZII)Z", line = 51)
    public static final boolean method2722(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method2724((String) null, true);
        }
        ++field6460;
        return ~(16 & arg2) != -1;
    }

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "(B)V", line = 62)
    public static void method2723(byte arg0) {
        field6454 = null;
        field6452 = null;
        if (arg0 < 64) {
            method2721((class13) null, 92);
        }
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(I)Z", line = 74)
    public final boolean method621(int arg0) {
        if (arg0 >= -103) {
            method2721((class13) null, 2);
        }
        ++field6462;
        return false;
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(IIIIIII)V", line = 87)
    public class458(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super.field1264 = arg0;
        this.field6453 = (short) arg5;
        super.field1255 = arg1;
        this.field6458 = (short) arg6;
        super.field1250 = arg2;
        super.field1266 = (byte) arg3;
        super.field1258 = (byte) arg4;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZLha;IILkba;II)V", line = 106)
    public final void method615(boolean arg0, class58 arg1, int arg2, int arg3, class105 arg4, int arg5, int arg6) {
        ++field6459;
        if (arg5 != 22501) {
            this.field6458 = 69;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;", line = 118)
    public static final String method2724(String arg0, boolean arg1) {
        ++field6461;
        StringBuffer var2 = new StringBuffer();
        if (arg1) {
            method2722(true, -54, -17);
        }
        int var3 = arg0.length();
        for (int var4 = 0; ~var3 < ~var4; ++var4) {
            char var5 = arg0.charAt(var4);
            if (~var5 == -38 && var4 + 2 < var3) {
                char var6 = arg0.charAt(var4 + 1);
                boolean var7 = false;
                int var8;
                if (var6 >= '0' && var6 <= '9') {
                    var8 = var6 - '0';
                } else if (var6 >= 'a' && var6 <= 'f') {
                    var8 = 10 - (-var6 - -97);
                } else {
                    if (~var6 > -66 || var6 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var8 = var6 + '\n' + -65;
                }
                int var9 = var8 * 16;
                char var10 = arg0.charAt(var4 - -2);
                int var11;
                if (~var10 <= -49 && var10 <= '9') {
                    var11 = var10 - '0' + var9;
                } else if (var10 >= 'a' && var10 <= 'f') {
                    var11 = var10 + '\n' + -97 + var9;
                } else {
                    if (~var10 > -66 || var10 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var11 = var10 + '\n' - 65 + var9;
                }
                var4 += 2;
                if (~var11 != -1 && class677.method3774(-1, (byte) var11)) {
                    var2.append(class174.method1114((byte) var11, 0));
                }
            } else if (var5 == '+') {
                var2.append(' ');
            } else {
                var2.append(var5);
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "(I)Z", line = 197)
    public final boolean method617(int arg0) {
        ++field6456;
        return arg0 != -21499 ? true : class589.field8299[(super.field1264 >> class660.field9038) - (-class453.field6405 + class136.field1982)][(super.field1250 >> class660.field9038) - class481.field6801 - -class453.field6405];
    }
}
