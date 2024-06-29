import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class93 {

    @OriginalMember(owner = "client!d", name = "f", descriptor = "Lus;")
    public static class1 field1179 = new class1(4, -1);

    @OriginalMember(owner = "client!d", name = "g", descriptor = "[I")
    public static int[] field1180 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!d", name = "l", descriptor = "Lwf;")
    public static class79 field1185 = new class79(57, 3);

    @OriginalMember(owner = "client!d", name = "m", descriptor = "Lfa;")
    public static class142 field1186 = new class142(14, 1);

    @OriginalMember(owner = "client!d", name = "n", descriptor = "Lfa;")
    public static class142 field1187 = new class142(15, 4);

    @OriginalMember(owner = "client!d", name = "o", descriptor = "Lfa;")
    public static class142 field1188 = new class142(16, -2);

    @OriginalMember(owner = "client!d", name = "p", descriptor = "Lfa;")
    public static class142 field1189 = new class142(17, 0);

    @OriginalMember(owner = "client!d", name = "q", descriptor = "Lfa;")
    public static class142 field1190 = new class142(18, -2);

    @OriginalMember(owner = "client!d", name = "r", descriptor = "Lfa;")
    public static class142 field1191 = new class142(20, 6);

    @OriginalMember(owner = "client!d", name = "s", descriptor = "Lfa;")
    public static class142 field1192 = new class142(21, 8);

    @OriginalMember(owner = "client!d", name = "t", descriptor = "Lfa;")
    public static class142 field1193 = new class142(22, -2);

    @OriginalMember(owner = "client!d", name = "u", descriptor = "Lfa;")
    public static class142 field1194 = new class142(23, 4);

    @OriginalMember(owner = "client!d", name = "v", descriptor = "Lfa;")
    public static class142 field1195 = new class142(24, -1);

    @OriginalMember(owner = "client!d", name = "w", descriptor = "[Lfa;")
    private static class142[] field1196 = new class142[32];

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public int field1174;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "Lnm;")
    public class304 field1177;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "Ld;")
    public class93 field1178;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "[I")
    public static int[] field1183;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "[[B")
    public static byte[][] field1184;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIII)V")
    public static final void method528(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= class168.field2449 && arg3 <= class94.field1209) {
            int var5 = class156.method978(0, arg4, class485.field6827, class345.field5011);
            int var6 = class156.method978(arg2 ^ 0xE, arg1, class485.field6827, class345.field5011);
            class53.method336(arg0, var6, arg3, arg2 ^ 0x6, var5);
        }
        if (arg2 != 14) {
            field1180 = null;
        }
        field1176++;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static void method529(int arg0) {
        field1193 = null;
        field1186 = null;
        field1195 = null;
        field1185 = null;
        field1183 = null;
        field1190 = null;
        field1196 = null;
        field1194 = null;
        if (arg0 != -26178) {
            method528(-85, -2, 38, -107, 58);
        }
        field1189 = null;
        field1192 = null;
        field1180 = null;
        field1179 = null;
        field1188 = null;
        field1191 = null;
        field1187 = null;
        field1184 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
    public final void method530(byte arg0) {
        field1175++;
        if (arg0 != 29) {
            this.method530((byte) 62);
        }
        if (class364.field5230 >= 500) {
            return;
        }
        this.field1177 = null;
        this.field1178 = class456.field6414;
        this.field1174 = 0;
        class456.field6414 = this;
        class364.field5230++;
    }

    static {
        class142[] var0 = class369.method2272(-15130);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field1196[var0[var1].field1886] = var0[var1];
        }
    }
}
