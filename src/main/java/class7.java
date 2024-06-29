import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 {

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Ls;")
    public static class194 field228 = new class194(64);

    @OriginalMember(owner = "client!af", name = "f", descriptor = "Z")
    public static boolean field233 = false;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "Lqe;")
    public static class179 field237 = class206.method1380("Lade)3)3)3", (byte) -127);

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Lqe;")
    private static class179 field236 = class206.method1380("wave:", (byte) 87);

    @OriginalMember(owner = "client!af", name = "g", descriptor = "Lqe;")
    public static class179 field234 = field236;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "Lqe;")
    public static class179 field235 = field236;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([SII[Lqe;I)V")
    public static final void method46(short[] arg0, int arg1, int arg2, class179[] arg3, int arg4) {
        field231++;
        int var5 = 0 % ((arg1 + 75) / 37);
        if (arg4 >= arg2) {
            return;
        }
        int var6 = (arg2 + arg4) / 2;
        class179 var7 = arg3[var6];
        int var8 = arg4;
        arg3[var6] = arg3[arg2];
        arg3[arg2] = var7;
        short var9 = arg0[var6];
        arg0[var6] = arg0[arg2];
        arg0[arg2] = var9;
        for (int var10 = arg4; var10 < arg2; var10++) {
            if (var7 == null || arg3[var10] != null && arg3[var10].method1132(var7, 1) < (var10 & 0x1)) {
                class179 var11 = arg3[var10];
                arg3[var10] = arg3[var8];
                arg3[var8] = var11;
                short var12 = arg0[var10];
                arg0[var10] = arg0[var8];
                arg0[var8++] = var12;
            }
        }
        arg3[arg2] = arg3[var8];
        arg3[var8] = var7;
        arg0[arg2] = arg0[var8];
        arg0[var8] = var9;
        method46(arg0, 127, var8 - 1, arg3, arg4);
        method46(arg0, 66, arg2, arg3, var8 + 1);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
    public static void method47(byte arg0) {
        field234 = null;
        field236 = null;
        field228 = null;
        field237 = null;
        if (arg0 > -50) {
            field228 = null;
        }
        field235 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)I")
    public static final int method48(byte arg0, int arg1) {
        if (arg0 > -102) {
            method46(null, 68, 0, null, 64);
        }
        field229++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lqe;I)Z")
    public static final boolean method49(class179 arg0, int arg1) {
        field230++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class98.field1840; var2++) {
            if (arg0.method1138(false, class66.field1344[var2])) {
                return true;
            }
        }
        return false;
    }
}
