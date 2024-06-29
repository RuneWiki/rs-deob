import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class54 extends class64 {

    @OriginalMember(owner = "client!fg", name = "hb", descriptor = "[I")
    public static int[] field991 = new int[128];

    @OriginalMember(owner = "client!fg", name = "bb", descriptor = "Lsa;")
    public static class163 field985 = new class163(4096);

    @OriginalMember(owner = "client!fg", name = "ib", descriptor = "[Lvh;")
    public static class197[] field992 = new class197[32768];

    @OriginalMember(owner = "client!fg", name = "mb", descriptor = "Z")
    public static boolean field996 = false;

    @OriginalMember(owner = "client!fg", name = "nb", descriptor = "[I")
    public static int[] field997 = new int[128];

    @OriginalMember(owner = "client!fg", name = "ob", descriptor = "Lsg;")
    private static class169 field998 = class165.method1060("flash3:", 1536);

    @OriginalMember(owner = "client!fg", name = "lb", descriptor = "Lsg;")
    public static class169 field995 = field998;

    @OriginalMember(owner = "client!fg", name = "jb", descriptor = "Lsg;")
    public static class169 field993 = class165.method1060("Lade Eingabe)2Steuerungsprogramm)3)3)3", 1536);

    @OriginalMember(owner = "client!fg", name = "kb", descriptor = "Lsg;")
    public static class169 field994 = field998;

    @OriginalMember(owner = "client!fg", name = "cb", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!fg", name = "db", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!fg", name = "eb", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!fg", name = "fb", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!fg", name = "gb", descriptor = "Lbg;")
    public static class18 field990;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIII)V")
    public static final void method343(int arg0, int arg1, int arg2, int arg3) {
        ++field988;
        if (~arg3 <= -129 && arg0 >= 128 && ~arg3 >= -13057 && arg0 <= 13056) {
            int var4 = -arg1 + class183.method1215(arg3, class61.field1132, arg0, 0);
            int var5 = var4 - class182.field3559;
            int var6 = class12.field279[class148.field2743];
            int var7 = arg0 - class138.field2569;
            int var8 = arg3 - class7.field159;
            int var9 = class12.field283[class148.field2743];
            int var10 = class12.field279[class177.field3468];
            int var11 = class12.field283[class177.field3468];
            int var12 = var7 * var10 + var8 * var11 >> 16;
            int var13 = var7 * var11 + -(var8 * var10) >> 16;
            int var15 = var5 * var9 + -(var6 * var13) >> 16;
            int var16 = var5 * var6 - -(var9 * var13) >> 16;
            if (arg2 == -645725264) {
                if (var16 < 50) {
                    class181.field3528 = -1;
                    class64.field1180 = -1;
                } else {
                    class64.field1180 = (var15 << 9) / var16 + 167;
                    class181.field3528 = (var12 << 9) / var16 + 256;
                }
            }
        } else {
            class181.field3528 = -1;
            class64.field1180 = -1;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)[I")
    public final int[] method16(int arg0, byte arg1) {
        if (arg1 != 19) {
            return null;
        } else {
            int[] var3 = super.field1192.method19((byte) 122, arg0);
            if (super.field1192.field75) {
                class97.method581(var3, 0, class147.field2715, class189.field3699[arg0]);
            }
            ++field986;
            return var3;
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    public class54() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "(I)V")
    public static void method344(int arg0) {
        field992 = null;
        field991 = null;
        field994 = null;
        field990 = null;
        field993 = null;
        field997 = null;
        field985 = null;
        field995 = null;
        if (arg0 == 50) {
            field998 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    public static final void method345(byte arg0) {
        ++field989;
        class204.field4001.method1205(true);
        if (arg0 != -70) {
            method343(-10, -59, 109, 56);
        }
        class91.field1678.method1205(true);
    }
}
