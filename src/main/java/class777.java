import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class777 extends class215 {

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "B")
    public byte field11280 = 5;

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "[Ljava/lang/String;")
    private static final String[] field11292 = new String[] { method5625(method5624("a[B\tz")), method5625(method5624("a[B\nz")), method5625(method5624("aF\u0000,")), method5625(method5624("t\u001dBn/")), method5625(method5624("a[B\u000bz")) };

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "Lel;")
    public static class573 field11281 = new class573(31, -1);

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "I")
    public int field11282;

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "I")
    public static int field11284;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
    public int field11285;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    public int field11286;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "I")
    public static int field11287;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "I")
    public static int field11288;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
    public int field11289;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
    public int field11290;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
    public int field11291;

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "Z")
    public boolean field11283;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V")
    public static void method5621(int arg0) {
        try {
            if (arg0 > 98) {
                field11281 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field11292[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
    public static final void method5622(byte arg0) {
        try {
            field11284++;
            if (arg0 > -49) {
                field11288 = 3;
            }
            if (!class540.field7914) {
                class540.field7914 = true;
                class597.field8773 = true;
                class402.field5996 += (12.0F - class402.field5996) / 2.0F;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field11292[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method5623(int arg0, String arg1) {
        try {
            field11287++;
            if (arg1 == null) {
                return false;
            }
            if (arg0 != -16476) {
                field11281 = null;
            }
            for (int var2 = 0; var2 < class157.field1960; var2++) {
                if (arg1.equalsIgnoreCase(class83.field927[var2])) {
                    return true;
                }
                if (arg1.equalsIgnoreCase(class298.field4705[var2])) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11292[1] + arg0 + ',' + (arg1 == null ? field11292[2] : field11292[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5624(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x52);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5625(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 15;
                    break;
                case 1:
                    var10005 = 51;
                    break;
                case 2:
                    var10005 = 108;
                    break;
                case 3:
                    var10005 = 64;
                    break;
                default:
                    var10005 = 82;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
