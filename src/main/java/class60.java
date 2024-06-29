import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class60 extends class129 {

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "Lrd;")
    public static class173 field1170 = class133.method843("Bitte versuchen Sie)1", -108);

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "Z")
    public static boolean field1173 = false;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "Lrd;")
    private static class173 field1172 = class133.method843("Please reload this page)3", 77);

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "Lrd;")
    private static class173 field1194 = class133.method843("Attack", -67);

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "Lrd;")
    public static class173 field1195 = field1172;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "Lrd;")
    public static class173 field1174 = field1194;

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "Lrd;")
    private static class173 field1192 = class133.method843("This world is running a closed Beta)3", -76);

    @OriginalMember(owner = "client!fi", name = "Y", descriptor = "Lrd;")
    public static class173 field1201 = field1192;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
    public int field1169;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "I")
    public int field1171;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    public int field1175;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
    public int field1176;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
    public int field1181;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
    public int field1184;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
    public int field1185;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "I")
    public int field1186;

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
    public int field1187;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "I")
    public int field1188;

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "I")
    public int field1189;

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "I")
    public int field1190;

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "I")
    public int field1191;

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "I")
    public int field1193;

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "I")
    public int field1197;

    @OriginalMember(owner = "client!fi", name = "X", descriptor = "I")
    public int field1200;

    @OriginalMember(owner = "client!fi", name = "Z", descriptor = "I")
    public int field1202;

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "Lne;")
    public class134 field1196;

    @OriginalMember(owner = "client!fi", name = "V", descriptor = "Loc;")
    public class142 field1198;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "Log;")
    public class146 field1180;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "Lte;")
    public class194 field1183;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "Laa;")
    public static class2 field1168;

    @OriginalMember(owner = "client!fi", name = "W", descriptor = "Lhi;")
    public static class79 field1199;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field1182;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
    public final void method379(int arg0) {
        field1179++;
        this.field1198 = null;
        if (arg0 == 16) {
            this.field1183 = null;
            this.field1180 = null;
            this.field1196 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIII)V")
    public static final void method380(int arg0, int arg1, int arg2, int arg3) {
        class105 var4 = class208.field4055[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class216 var5 = var4.field1957;
        if (var5 != null) {
            var5.field4188 = var5.field4188 * arg3 / 16;
            var5.field4174 = var5.field4174 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIILbc;)[Ldh;")
    public static final class39[] method381(int arg0, int arg1, int arg2, class14 arg3) {
        if (arg0 > -38) {
            return null;
        } else {
            field1178++;
            return class18.method155(arg1, arg2, arg3, (byte) -113) ? class176.method1169((byte) -67) : null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)Lvd;")
    public static final class211 method382(byte arg0, int arg1) {
        if (arg0 <= 76) {
            method381(-48, -81, -121, null);
        }
        class211 var2 = (class211) class190.field3711.method46((long) arg1, 26580);
        field1177++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = client.field646.method142(1, arg1, (byte) 2);
        class211 var4 = new class211();
        if (var3 != null) {
            var4.method1387(new class121(var3), (byte) 12, arg1);
        }
        class190.field3711.method52(-3583, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)V")
    public static void method383(int arg0) {
        if (arg0 > -76) {
            method381(79, 36, -93, null);
        }
        field1168 = null;
        field1182 = null;
        field1195 = null;
        field1192 = null;
        field1201 = null;
        field1172 = null;
        field1174 = null;
        field1199 = null;
        field1170 = null;
        field1194 = null;
    }
}
