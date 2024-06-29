import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class79 {

    @OriginalMember(owner = "client!q", name = "d", descriptor = "Lck;")
    private static class119 field1211 = class298.method1987((byte) 42, "slide:");

    @OriginalMember(owner = "client!q", name = "l", descriptor = "Lck;")
    public static class119 field1219 = class298.method1987((byte) 121, "mapscene");

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field1216 = 50;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "[I")
    public static int[] field1222 = new int[field1216];

    @OriginalMember(owner = "client!q", name = "f", descriptor = "[I")
    public static int[] field1213 = new int[field1216];

    @OriginalMember(owner = "client!q", name = "a", descriptor = "[I")
    public static int[] field1208 = new int[field1216];

    @OriginalMember(owner = "client!q", name = "c", descriptor = "[I")
    public static int[] field1210 = new int[field1216];

    @OriginalMember(owner = "client!q", name = "r", descriptor = "[I")
    public static int[] field1225 = new int[field1216];

    @OriginalMember(owner = "client!q", name = "u", descriptor = "Lck;")
    public static class119 field1228 = field1211;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "Lck;")
    public static class119 field1220 = field1211;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public static int field1226 = 0;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "Lck;")
    public static class119 field1227 = class298.method1987((byte) 8, ":clan:");

    @OriginalMember(owner = "client!q", name = "g", descriptor = "[I")
    public static int[] field1214 = new int[field1216];

    @OriginalMember(owner = "client!q", name = "j", descriptor = "[I")
    public static int[] field1217 = new int[field1216];

    @OriginalMember(owner = "client!q", name = "q", descriptor = "[Lck;")
    public static class119[] field1224 = new class119[field1216];

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "J")
    public long field1218;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "Lck;")
    public static class119 field1212;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Lq;")
    public class79 field1209;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "Lq;")
    public class79 field1215;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)Z", line = 12)
    public final boolean method550(int arg0) {
        if (arg0 < 108) {
            field1211 = (class119) null;
        }
        field1223++;
        return this.field1215 != null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V", line = 48)
    public static void method551(boolean arg0) {
        field1208 = null;
        field1219 = null;
        field1222 = null;
        field1224 = null;
        if (!arg0) {
            return;
        }
        field1212 = null;
        field1220 = null;
        field1210 = null;
        field1228 = null;
        field1214 = null;
        field1225 = null;
        field1217 = null;
        field1213 = null;
        field1211 = null;
        field1227 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V", line = 111)
    public final void method552(byte arg0) {
        field1221++;
        if (this.field1215 == null) {
            return;
        }
        int var2 = 16 / ((arg0 + 61) / 47);
        this.field1215.field1209 = this.field1209;
        this.field1209.field1215 = this.field1215;
        this.field1209 = null;
        this.field1215 = null;
    }
}
