import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class98 extends class51 {

    @OriginalMember(owner = "client!l", name = "kb", descriptor = "I")
    private int field2189;

    @OriginalMember(owner = "client!l", name = "eb", descriptor = "Lea;")
    public static class38 field2183 = class9.method46((byte) 116, "Benutzen Sie die (WPasswort -=ndern(W Option");

    @OriginalMember(owner = "client!l", name = "fb", descriptor = "Lea;")
    public static class38 field2184 = class9.method46((byte) 105, "sch-Utteln:");

    @OriginalMember(owner = "client!l", name = "ab", descriptor = "Lea;")
    public static class38 field2179 = class9.method46((byte) 127, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!l", name = "hb", descriptor = "[Lea;")
    public static class38[] field2186 = new class38[500];

    @OriginalMember(owner = "client!l", name = "gb", descriptor = "Lea;")
    private static class38 field2185 = class9.method46((byte) 119, "To create a new account you need to");

    @OriginalMember(owner = "client!l", name = "Z", descriptor = "Lea;")
    public static class38 field2178 = field2185;

    @OriginalMember(owner = "client!l", name = "mb", descriptor = "Lea;")
    public static class38 field2191 = class9.method46((byte) 127, "l");

    @OriginalMember(owner = "client!l", name = "cb", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!l", name = "db", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!l", name = "ib", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!l", name = "jb", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!l", name = "lb", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!l", name = "bb", descriptor = "Ldd;")
    public static class32 field2180;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(Z)V")
    public static final void method811(boolean arg0) {
        ++field2182;
        class22 var1 = class155.field3213;
        synchronized (class155.field3213) {
            class146.field3038 = class166.field3426;
            class176.field3568 = class109.field2446;
            class10.field222 = class148.field3082;
            class165.field3424 = class168.field3459;
            if (!arg0) {
                class87.field2029 = class125.field2685;
                class105.field2345 = class3.field108;
                class204.field4023 = class200.field3940;
                class168.field3459 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "i", descriptor = "(I)V")
    public static void method812(int arg0) {
        field2179 = null;
        field2184 = null;
        field2186 = null;
        field2178 = null;
        field2191 = null;
        if (arg0 == 4096) {
            field2185 = null;
            field2180 = null;
            field2183 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
    public class98() {
        this(4096);
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(I)V")
    private class98(int arg0) {
        super(0, true);
        this.field2189 = 4096;
        this.field2189 = arg0;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(II)Lef;")
    public static final class43 method813(int arg0, int arg1) {
        int var2 = arg0 >> 16;
        int var3 = 65535 & arg0;
        ++field2187;
        if (arg1 != 4096) {
            method814(-118);
        }
        if (class168.field3461[var2] == null || class168.field3461[var2][var3] == null) {
            boolean var4 = class53.method385(var2, 27323);
            if (!var4) {
                return null;
            }
        }
        return class168.field3461[var2][var3];
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        if (arg0 > -125) {
            method812(-73);
        }
        int[] var3 = super.field1312.method827(arg1, true);
        if (super.field1312.field2271) {
            class131.method963(var3, 0, class86.field2008, this.field2189);
        }
        ++field2181;
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        ++field2190;
        if (!arg2) {
            method811(false);
        }
        if (arg1 == 0) {
            this.field2189 = (arg0.method509(123) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!l", name = "j", descriptor = "(I)I")
    public static final int method814(int arg0) {
        if (arg0 != 255) {
            method813(-70, -123);
        }
        ++field2188;
        return class125.field2701++;
    }
}
