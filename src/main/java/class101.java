import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class101 extends class298 {

    @OriginalMember(owner = "client!tt", name = "E", descriptor = "[Ljava/lang/String;")
    private static final String[] field1119 = new String[] { method833(method832("i6Z\u0013;")), method833(method832("i6Z\u0014;")), method833(method832("s7\u0018=")), method833(method832("flZ\u007fn")), method833(method832("i6Z\u0010;")), method833(method832("i6Z\u0015;")) };

    @OriginalMember(owner = "client!tt", name = "z", descriptor = "Lwia;")
    public static class790 field1113 = new class790(39, 3);

    @OriginalMember(owner = "client!tt", name = "C", descriptor = "Llg;")
    public static class433 field1116 = new class433();

    @OriginalMember(owner = "client!tt", name = "y", descriptor = "Lwia;")
    public static class790 field1117 = new class790(50, 7);

    @OriginalMember(owner = "client!tt", name = "D", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!tt", name = "A", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!tt", name = "B", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!tt", name = "w", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!tt", name = "x", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "(B)V")
    public static void method830(byte arg0) {
        try {
            if (arg0 == -103) {
                field1113 = null;
                field1117 = null;
                field1116 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1119[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(B)V")
    public final void method138(byte arg0) {
        try {
            if (arg0 != -119) {
                field1118 = 123;
            }
            field1111++;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1119[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method831(String arg0, byte arg1) {
        try {
            field1112++;
            if (arg1 <= 6) {
                field1116 = null;
            }
            return class275.field4152.containsKey(arg0);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1119[4] + (arg0 == null ? field1119[2] : field1119[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;B)V")
    public final void method139(OggPacket arg0, byte arg1) {
        try {
            int var3 = 1 % ((arg1 + 14) / 36);
            field1115++;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1119[1] + (arg0 == null ? field1119[2] : field1119[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class101(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method832(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x13);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method833(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 29;
                    break;
                case 1:
                    var10005 = 66;
                    break;
                case 2:
                    var10005 = 116;
                    break;
                case 3:
                    var10005 = 81;
                    break;
                default:
                    var10005 = 19;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
