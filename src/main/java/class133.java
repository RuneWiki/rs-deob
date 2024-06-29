import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class133 {

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field2191 = 0;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "Z")
    public static boolean field2195 = false;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field2193 = -1;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field2189 = 10;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "Lsi;")
    public static class204 field2194;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Lh;")
    public static class278 field2188;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "[Lvh;")
    public static class282[] field2190;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
    public static void method962(byte arg0) {
        field2188 = null;
        if (arg0 < 46) {
            field2188 = null;
        }
        field2190 = null;
        field2194 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lbh;I)V")
    public static final void method963(class7 arg0, int arg1) {
        field2187++;
        class13 var2 = null;
        try {
            class278 var3 = arg0.method41("runescape", 0);
            int var4 = -116 / ((arg1 - 3) / 40);
            while (var3.field4450 == 0) {
                class43.method324(1L, -111);
            }
            if (var3.field4450 == 1) {
                var2 = (class13) var3.field4449;
                class152 var5 = class282.method1927(1);
                var2.method101(var5.field2511, 0, (byte) 82, var5.field2523);
            }
        } catch (Exception var7) {
        }
        try {
            if (var2 != null) {
                var2.method100(126);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V")
    public static final void method964(int arg0, int arg1) {
        if (arg1 != -13803) {
            method962((byte) -61);
        }
        field2196++;
        class181.field2915.method1548(arg0, 0);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V")
    public static final void method965(byte arg0) {
        field2197++;
        if (arg0 != -29) {
            return;
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class243.field3890 - 1; var2++) {
                if (class207.field3318[var2] < 1000 && class207.field3318[var2 + 1] > 1000) {
                    var1 = false;
                    String var3 = class243.field3927[var2];
                    class243.field3927[var2] = class243.field3927[var2 + 1];
                    class243.field3927[var2 + 1] = var3;
                    String var4 = class226.field3632[var2];
                    class226.field3632[var2] = class226.field3632[var2 + 1];
                    class226.field3632[var2 + 1] = var4;
                    int var5 = class276.field4425[var2];
                    class276.field4425[var2] = class276.field4425[var2 + 1];
                    class276.field4425[var2 + 1] = var5;
                    int var6 = class77.field1108[var2];
                    class77.field1108[var2] = class77.field1108[var2 + 1];
                    class77.field1108[var2 + 1] = var6;
                    int var7 = class82.field1186[var2];
                    class82.field1186[var2] = class82.field1186[var2 + 1];
                    class82.field1186[var2 + 1] = var7;
                    short var8 = class207.field3318[var2];
                    class207.field3318[var2] = class207.field3318[var2 + 1];
                    class207.field3318[var2 + 1] = var8;
                    long var9 = class49.field710[var2];
                    class49.field710[var2] = class49.field710[var2 + 1];
                    class49.field710[var2 + 1] = var9;
                }
            }
        }
    }
}
