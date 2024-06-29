import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class98 extends class16 {

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "I")
    public static int field2187 = 0;

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "Lje;")
    public static class67 field2194 = class85.method592(255, "(U2");

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "Lje;")
    private static class67 field2188 = class85.method592(255, "Drop");

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "Lje;")
    public static class67 field2184 = field2188;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "I")
    public int field2192;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "Lua;")
    public static class140 field2183;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "Lua;")
    public class140 field2185;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "Lha;")
    public class50 field2182;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2193;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "[B")
    public byte[] field2191;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "[Lje;")
    public static class67[] field2189;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(III)I")
    public static final int method761(int arg0, int arg1, int arg2) {
        field2190++;
        int var3 = class59.method414(4, true, arg2 + 91923, arg1 + 45365) + (class59.method414(2, true, arg2 + 37821, arg1 + 10294) + -128 >> 1) + (class59.method414(1, true, arg2, arg1) - 128 >> 2) - 128;
        if (arg0 >= -2) {
            method762((byte) -4);
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)V")
    public static void method762(byte arg0) {
        if (arg0 < 44) {
            method761(-97, 50, -89);
        }
        field2194 = null;
        field2183 = null;
        field2193 = null;
        field2184 = null;
        field2189 = null;
        field2188 = null;
    }
}
