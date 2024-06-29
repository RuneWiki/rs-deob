import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class99 {

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "Lkf;")
    private class75 field2142 = new class75();

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "Lod;")
    private static class101 field2136 = class46.method335(-57, "RuneScape has been updated(Q");

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "Lod;")
    public static class101 field2137 = field2136;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "Lod;")
    public static class101 field2143 = class46.method335(118, "hitmarks");

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "Lcb;")
    public static class17 field2139 = new class17(64);

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "Lod;")
    public static class101 field2145 = class46.method335(-110, "::");

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "Lcb;")
    public static class17 field2144 = new class17(30);

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "Lsa;")
    public static class126 field2146 = null;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    public static int field2149 = -1;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "Lod;")
    public static class101 field2148 = class46.method335(77, "<col=ffb000>");

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "[Laa;")
    public static class2[] field2151 = new class2[50];

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "[I")
    public static int[] field2152 = new int[128];

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "Lod;")
    public static class101 field2150 = class46.method335(82, ":assist:");

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lkf;B)V")
    public final void method684(class75 arg0, byte arg1) {
        if (arg0.field1606 != null) {
            arg0.method517(99);
        }
        arg0.field1596 = this.field2142.field1596;
        arg0.field1606 = this.field2142;
        if (arg1 != 63) {
            method687(118, -43);
        }
        arg0.field1606.field1596 = arg0;
        arg0.field1596.field1606 = arg0;
        field2141++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Lkf;")
    public final class75 method685(int arg0) {
        field2140++;
        int var2 = 111 / ((arg0 + 70) / 46);
        class75 var3 = this.field2142.field1596;
        return this.field2142 == var3 ? null : var3;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)Lkf;")
    public final class75 method686(byte arg0) {
        field2133++;
        class75 var2 = this.field2142.field1596;
        if (arg0 <= 19) {
            this.field2142 = null;
        }
        if (this.field2142 == var2) {
            return null;
        } else {
            var2.method517(91);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V")
    public static final void method687(int arg0, int arg1) {
        field2134++;
        int var2 = -107 / ((arg1 + 8) / 50);
        if (arg0 == -1 || !class143.method1139(103, arg0)) {
            return;
        }
        class126[] var3 = class100.field2161[arg0];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class126 var5 = var3[var4];
            if (var5.field2862 != null) {
                class141 var6 = new class141();
                var6.field3238 = var5;
                var6.field3247 = var5.field2862;
                class31.method237((byte) -71, var6);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBZ)Lod;")
    public static final class101 method688(int arg0, byte arg1, boolean arg2) {
        if (arg1 != -20) {
            method687(26, 121);
        }
        field2138++;
        return class126.method966(10, -2, arg0, arg2);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
    public static void method689(int arg0) {
        field2143 = null;
        field2150 = null;
        field2139 = null;
        field2145 = null;
        if (arg0 >= -43) {
            return;
        }
        field2152 = null;
        field2137 = null;
        field2136 = null;
        field2146 = null;
        field2151 = null;
        field2144 = null;
        field2148 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lkf;I)V")
    public final void method690(class75 arg0, int arg1) {
        field2135++;
        if (arg0.field1606 != null) {
            arg0.method517(arg1 + 99);
        }
        arg0.field1596 = this.field2142;
        if (arg1 != 0) {
            this.method686((byte) 94);
        }
        arg0.field1606 = this.field2142.field1606;
        arg0.field1606.field1596 = arg0;
        arg0.field1596.field1606 = arg0;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
    public class99() {
        this.field2142.field1596 = this.field2142;
        this.field2142.field1606 = this.field2142;
    }
}
