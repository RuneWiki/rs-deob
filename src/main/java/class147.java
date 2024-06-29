import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class147 extends class125 {

    @OriginalMember(owner = "client!nt", name = "w", descriptor = "I")
    private int field2164;

    @OriginalMember(owner = "client!nt", name = "x", descriptor = "Lqg;")
    private class321 field2165;

    @OriginalMember(owner = "client!nt", name = "q", descriptor = "I")
    private int field2158;

    @OriginalMember(owner = "client!nt", name = "s", descriptor = "I")
    private int field2160;

    @OriginalMember(owner = "client!nt", name = "o", descriptor = "I")
    private int field2156;

    @OriginalMember(owner = "client!nt", name = "v", descriptor = "I")
    private int field2163;

    @OriginalMember(owner = "client!nt", name = "p", descriptor = "I")
    private int field2157;

    @OriginalMember(owner = "client!nt", name = "u", descriptor = "Lao;")
    public static class188 field2162 = new class188(21, 6);

    @OriginalMember(owner = "client!nt", name = "z", descriptor = "I")
    public static int field2167 = 0;

    @OriginalMember(owner = "client!nt", name = "A", descriptor = "I")
    public static int field2168 = 0;

    @OriginalMember(owner = "client!nt", name = "t", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!nt", name = "B", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!nt", name = "r", descriptor = "Lnm;")
    private class329 field2159;

    @OriginalMember(owner = "client!nt", name = "y", descriptor = "[I")
    public static int[] field2166;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V", line = 6)
    public static void method1051(byte arg0) {
        if (arg0 >= -39) {
            method1051((byte) 116);
        }
        field2162 = null;
        field2166 = null;
    }

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "(Z)Lnm;", line = 23)
    public final class329 method933(boolean arg0) {
        if (arg0) {
            return null;
        }
        field2161++;
        if (this.field2159 == null) {
            class126 var2 = this.field2165.field2449;
            class193.field2829[2] = this.field2156;
            class193.field2829[4] = this.field2158;
            class193.field2829[5] = this.field2163;
            class193.field2829[1] = this.field2160;
            class193.field2829[3] = this.field2157;
            class193.field2829[0] = this.field2164;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method937((byte) 43, class193.field2829[var5])) {
                    return null;
                }
                class216 var7 = var2.method935(class193.field2829[var5], -8037);
                int var8 = var7.field3112 ? 64 : 128;
                if (var7.field3108 > 0) {
                    var3 = 1;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class484.field7091[var6] = var2.method938(class193.field2829[var6], false, 1.0F, (byte) -47, var4, var4);
            }
            this.field2159 = new class329(this.field2165, 6407, var4, var3 != 0, class484.field7091);
        }
        return this.field2159;
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lqg;IIIIII)V", line = 90)
    public class147(class321 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2164 = arg1;
        this.field2165 = arg0;
        this.field2158 = arg5;
        this.field2160 = arg2;
        this.field2156 = arg3;
        this.field2163 = arg6;
        this.field2157 = arg4;
    }
}
