import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class143 extends class665 {

    @OriginalMember(owner = "client!kt", name = "v", descriptor = "Lvp;")
    public class171 field2126;

    @OriginalMember(owner = "client!kt", name = "C", descriptor = "Lrp;")
    public class400 field2132;

    @OriginalMember(owner = "client!kt", name = "y", descriptor = "Luc;")
    public static class27 field2129 = new class27(42, 8);

    @OriginalMember(owner = "client!kt", name = "D", descriptor = "Lfc;")
    public static class235 field2133 = new class235(26, -2);

    @OriginalMember(owner = "client!kt", name = "G", descriptor = "Lmaa;")
    public static class433 field2136 = new class433("", 14);

    @OriginalMember(owner = "client!kt", name = "t", descriptor = "I")
    public int field2124;

    @OriginalMember(owner = "client!kt", name = "u", descriptor = "I")
    public int field2125;

    @OriginalMember(owner = "client!kt", name = "w", descriptor = "I")
    public int field2127;

    @OriginalMember(owner = "client!kt", name = "x", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!kt", name = "z", descriptor = "I")
    public int field2130;

    @OriginalMember(owner = "client!kt", name = "A", descriptor = "I")
    public int field2131;

    @OriginalMember(owner = "client!kt", name = "F", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!kt", name = "E", descriptor = "[Lxa;")
    public static class461[] field2134;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V", line = 15)
    public final void method1007(int arg0) {
        this.field2130 = this.field2126.field2564;
        this.field2131 = this.field2126.field2562;
        field2128++;
        this.field2124 = this.field2126.field2565;
        if (arg0 <= 116) {
            field2136 = null;
        }
        if (this.field2126.field2559 != null) {
            this.field2126.field2559.method1287(this.field2132.field5562, this.field2132.field5558, this.field2132.field5551, class63.field846);
        }
        this.field2127 = class63.field846[0];
        this.field2125 = class63.field846[2];
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lvp;Lio;)V", line = 34)
    public class143(class171 arg0, class401 arg1) {
        this.field2126 = arg0;
        this.field2132 = this.field2126.method1173(63);
        this.method1007(117);
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(B)V", line = 52)
    public static void method1008(byte arg0) {
        field2134 = null;
        field2136 = null;
        field2129 = null;
        field2133 = null;
        if (arg0 != 48) {
            method1008((byte) -29);
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;", line = 65)
    public static final String[] method1009(String[] arg0, byte arg1) {
        field2135++;
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        if (arg1 == -90) {
            return var2;
        } else {
            return null;
        }
    }
}
