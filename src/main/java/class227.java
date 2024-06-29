import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class227 extends class136 {

    @OriginalMember(owner = "client!ui", name = "L", descriptor = "Lkb;")
    public class111 field4260;

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "Li;")
    public static class88 field4253 = class208.method1425(105, "cross");

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "Li;")
    private static class88 field4257 = class208.method1425(105, "Too many incorrect logins from your address)3");

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "Li;")
    public static class88 field4255 = class208.method1425(105, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!ui", name = "P", descriptor = "Li;")
    public static class88 field4264 = class208.method1425(105, " ");

    @OriginalMember(owner = "client!ui", name = "M", descriptor = "Li;")
    public static class88 field4261 = field4257;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "Lwi;")
    public static class248 field4254 = new class248();

    @OriginalMember(owner = "client!ui", name = "S", descriptor = "Li;")
    public static class88 field4267 = class208.method1425(105, "cookieprefix");

    @OriginalMember(owner = "client!ui", name = "T", descriptor = "Li;")
    public static class88 field4268 = class208.method1425(105, "Der Server wird gerade aktualisiert)3");

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!ui", name = "N", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!ui", name = "Q", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!ui", name = "R", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "Lgi;")
    public static class75 field4252;

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "[Lrc;")
    public static class188[] field4259;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(B)V")
    public static void method1521(byte arg0) {
        field4259 = null;
        field4252 = null;
        field4254 = null;
        field4261 = null;
        field4257 = null;
        field4267 = null;
        field4268 = null;
        field4253 = null;
        field4255 = null;
        field4264 = null;
        if (arg0 != 60) {
            method1521((byte) -4);
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lkb;)V")
    public class227(class111 arg0) {
        this.field4260 = arg0;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIILnc;Lnc;IIIIJ)V")
    public static final void method1522(int arg0, int arg1, int arg2, int arg3, class145 arg4, class145 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class64 var12 = new class64();
        var12.field1158 = arg10;
        var12.field1157 = arg1 * 128 + 64;
        var12.field1161 = arg2 * 128 + 64;
        var12.field1168 = arg3;
        var12.field1159 = arg4;
        var12.field1160 = arg5;
        var12.field1164 = arg6;
        var12.field1172 = arg7;
        var12.field1169 = arg8;
        var12.field1167 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class29.field489[var13][arg1][arg2] == null) {
                class29.field489[var13][arg1][arg2] = new class52(var13, arg1, arg2);
            }
        }
        class29.field489[arg0][arg1][arg2].field956 = var12;
    }
}
