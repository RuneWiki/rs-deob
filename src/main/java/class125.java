import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class125 {

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public static int field2164 = 0;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "[[[I")
    public static int[][][] field2160 = new int[4][13][13];

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field2158 = 0;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field2156 = 0;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "Lqd;")
    private static class40 field2161 = class147.method1106("Loading config )2 ", (byte) -70);

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
    public static int field2166 = 500;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "Lqd;")
    public static class40 field2163 = field2161;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "Lqd;")
    private static class40 field2157 = class147.method1106("Loaded textures", (byte) -111);

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    public static int field2168 = 0;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "Lqd;")
    public static class40 field2167 = field2157;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)V", line = 4)
    public static void method938(boolean arg0) {
        field2163 = null;
        field2161 = null;
        field2167 = null;
        field2160 = (int[][][]) null;
        field2157 = null;
        if (!arg0) {
            field2164 = -44;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V", line = 18)
    public static final void method939(byte arg0) {
        field2165++;
        if (class148.field2499 != -1) {
            class51.method443(class148.field2499, true);
        }
        for (int var1 = 0; var1 < class83.field1438; var1++) {
            if (class229.field3778[var1]) {
                class309.field5192[var1] = true;
            }
            class289.field4840[var1] = class229.field3778[var1];
            class229.field3778[var1] = false;
        }
        class72.field1283 = -1;
        class23.field410 = -1;
        class261.field4382 = null;
        class263.field4393 = class256.field4266;
        if (class21.field350) {
            class156.field2619 = true;
        }
        if (arg0 != 91) {
            method938(true);
        }
        if (class148.field2499 != -1) {
            class83.field1438 = 0;
            class255.method1798(class148.field2499, 0, 0, class112.field1945, -1, class73.field1287, 0, 0, false);
        }
        if (class21.field350) {
            class111.method834();
        } else {
            class115.method865();
        }
        class189.field3059 = 0;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 65)
    public static final void method940(int arg0) {
        if (arg0 == -1) {
            class83.field1437.method1349(true);
            field2159++;
        }
    }
}
