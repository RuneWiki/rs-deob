import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class4 extends class202 {

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field44 = 64;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field46 = -1;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "Ljava/lang/String;")
    public static String field51 = "";

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "Ljava/lang/String;")
    public static String field45 = "wave2:";

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field50 = 0;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "J")
    public static volatile long field54 = 0L;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "J")
    public long field48;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "Lvd;")
    public class4 field52;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "Lvd;")
    public class4 field55;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field49;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZIIII)V")
    public static final void method39(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field56++;
        for (int var6 = arg3; var6 <= (arg3 + arg4); var6++) {
            for (int var11 = arg0; var11 <= arg0 + arg2; var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class131.field2096[arg5][var11][var6] = 127;
                }
            }
        }
        for (int var7 = arg3; var7 < arg3 + arg4; var7++) {
            for (int var10 = arg0; var10 < (arg0 + arg2); var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class124.field2012[arg5][var10][var7] = arg5 <= 0 ? 0 : class124.field2012[arg5 - 1][var10][var7];
                }
            }
        }
        if (arg1) {
            field47 = 106;
        }
        if (arg0 > 0 && arg0 < 104) {
            for (int var8 = arg3 + 1; var8 < arg3 + arg4; var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class124.field2012[arg5][arg0][var8] = class124.field2012[arg5][arg0 - 1][var8];
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var9 = arg0 + 1; var9 < arg0 + arg2; var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class124.field2012[arg5][var9][arg3] = class124.field2012[arg5][var9][arg3 - 1];
                }
            }
        }
        if (arg0 < 0 || arg3 < 0 || arg0 >= 104 || arg3 >= 104) {
            return;
        }
        if (arg5 == 0) {
            if (arg0 <= 0 || class124.field2012[arg5][arg0 - 1][arg3] == 0) {
                if (arg3 > 0 && class124.field2012[arg5][arg0][arg3 - 1] != 0) {
                    class124.field2012[arg5][arg0][arg3] = class124.field2012[arg5][arg0][arg3 - 1];
                    return;
                }
                if (arg0 > 0 && arg3 > 0 && class124.field2012[arg5][arg0 - 1][arg3 - 1] != 0) {
                    class124.field2012[arg5][arg0][arg3] = class124.field2012[arg5][arg0 - 1][arg3 - 1];
                    return;
                }
                return;
            }
            class124.field2012[arg5][arg0][arg3] = class124.field2012[arg5][arg0 - 1][arg3];
        } else if (arg0 <= 0 || class124.field2012[arg5][arg0 - 1][arg3] == class124.field2012[arg5 - 1][arg0 - 1][arg3]) {
            if (arg3 > 0 && class124.field2012[arg5 - 1][arg0][arg3 - 1] != class124.field2012[arg5][arg0][arg3 - 1]) {
                class124.field2012[arg5][arg0][arg3] = class124.field2012[arg5][arg0][arg3 - 1];
                return;
            }
            if (arg0 > 0 && arg3 > 0 && class124.field2012[arg5][arg0 - 1][arg3 - 1] != class124.field2012[arg5 - 1][arg0 - 1][arg3 - 1]) {
                class124.field2012[arg5][arg0][arg3] = class124.field2012[arg5][arg0 - 1][arg3 - 1];
                return;
            }
        } else {
            class124.field2012[arg5][arg0][arg3] = class124.field2012[arg5][arg0 - 1][arg3];
            return;
        }
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V")
    public final void method40(int arg0) {
        field53++;
        if (this.field55 == null) {
            return;
        }
        this.field55.field52 = this.field52;
        this.field52.field55 = this.field55;
        this.field55 = null;
        if (arg0 != 0) {
            method39(38, true, -86, -82, -52, 93);
        }
        this.field52 = null;
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V")
    public static void method41(int arg0) {
        int var1 = 64 % ((arg0 + 14) / 47);
        field51 = null;
        field45 = null;
        field49 = null;
    }
}
