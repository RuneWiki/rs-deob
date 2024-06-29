import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class87 extends class141 {

    @OriginalMember(owner = "client!md", name = "F", descriptor = "Lkd;")
    public static class73 field2194 = class126.method1070((byte) -66, "Stufe)2");

    @OriginalMember(owner = "client!md", name = "J", descriptor = "I")
    public static int field2198 = 0;

    @OriginalMember(owner = "client!md", name = "G", descriptor = "Lkd;")
    public static class73 field2195 = class126.method1070((byte) -66, "Ausw-=hlen");

    @OriginalMember(owner = "client!md", name = "K", descriptor = "Lkd;")
    public static class73 field2199 = class126.method1070((byte) -66, "backright1");

    @OriginalMember(owner = "client!md", name = "L", descriptor = "Lkd;")
    public static class73 field2200 = class126.method1070((byte) -66, "invback");

    @OriginalMember(owner = "client!md", name = "B", descriptor = "Lkd;")
    private static class73 field2190 = class126.method1070((byte) -66, "Use");

    @OriginalMember(owner = "client!md", name = "A", descriptor = "Lkd;")
    public static class73 field2189 = field2190;

    @OriginalMember(owner = "client!md", name = "M", descriptor = "Lkd;")
    public static class73 field2201 = class126.method1070((byte) -66, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!md", name = "D", descriptor = "Lkd;")
    public static class73 field2192 = class126.method1070((byte) -66, "backleft1");

    @OriginalMember(owner = "client!md", name = "H", descriptor = "I")
    public static int field2196 = 0;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "Lkd;")
    public static class73 field2206 = class126.method1070((byte) -66, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!md", name = "V", descriptor = "Lkd;")
    private static class73 field2209 = class126.method1070((byte) -66, "Please contact customer support)3");

    @OriginalMember(owner = "client!md", name = "O", descriptor = "Lkd;")
    private static class73 field2203 = class126.method1070((byte) -66, "Try again in 60 secs)3)3)3");

    @OriginalMember(owner = "client!md", name = "X", descriptor = "Lkd;")
    public static class73 field2210 = field2209;

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "Lkd;")
    public static class73 field2204 = field2203;

    @OriginalMember(owner = "client!md", name = "I", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!md", name = "T", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!md", name = "U", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "Lua;")
    public static class137 field2193;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "Lkd;")
    public class73 field2191;

    @OriginalMember(owner = "client!md", name = "Y", descriptor = "[Lde;")
    public static class27[] field2211;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(B)V")
    public static void method722(byte arg0) {
        field2206 = null;
        field2195 = null;
        field2210 = null;
        field2200 = null;
        field2209 = null;
        field2190 = null;
        field2203 = null;
        if (arg0 < 123) {
            method722((byte) -91);
        }
        field2199 = null;
        field2201 = null;
        field2194 = null;
        field2204 = null;
        field2189 = null;
        field2211 = null;
        field2193 = null;
        field2192 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIZ)Lkd;")
    public static final class73 method723(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        field2202++;
        int var4 = 1;
        if (arg2 != 10) {
            method723(77, -94, -122, false);
        }
        int var5 = arg1 / arg0;
        while (var5 != 0) {
            var5 /= arg0;
            var4++;
        }
        int var6 = var4;
        if (arg1 < 0 || arg3) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg1 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg1 % arg0;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            arg1 /= arg0;
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class73 var9 = new class73();
        var9.field1880 = var6;
        var9.field1858 = var7;
        return var9;
    }
}
