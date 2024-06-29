import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class26 extends class181 {

    @OriginalMember(owner = "client!mm", name = "u", descriptor = "B")
    public byte field391 = 5;

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
    public static int field387 = 0;

    @OriginalMember(owner = "client!mm", name = "B", descriptor = "[I")
    public static int[] field397 = new int[500];

    @OriginalMember(owner = "client!mm", name = "x", descriptor = "Llt;")
    public static class273 field394 = new class273();

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
    public int field385;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "I")
    public int field386;

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "I")
    public int field388;

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!mm", name = "t", descriptor = "I")
    public int field390;

    @OriginalMember(owner = "client!mm", name = "v", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!mm", name = "w", descriptor = "I")
    public int field393;

    @OriginalMember(owner = "client!mm", name = "y", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!mm", name = "z", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!mm", name = "C", descriptor = "I")
    public int field398;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "Z")
    public boolean field384;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILjava/lang/String;)V", line = 3)
    public static final void method178(int arg0, String arg1) {
        class1.method3("", arg1, 0, -1, "", 0, "");
        if (arg0 > -85) {
            field397 = null;
        }
        field392++;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "([IZ[I)V", line = 17)
    public static final void method179(int[] arg0, boolean arg1, int[] arg2) {
        field395++;
        if (!arg1) {
            return;
        }
        if (arg2 == null || arg0 == null) {
            class22.field353 = null;
            class425.field5339 = null;
            class205.field2613 = null;
            return;
        }
        class205.field2613 = arg2;
        class425.field5339 = new int[arg2.length];
        class22.field353 = new byte[arg2.length][][];
        for (int var3 = 0; var3 < class205.field2613.length; var3++) {
            class22.field353[var3] = new byte[arg0[var3]][];
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V", line = 48)
    public static void method180(byte arg0) {
        field397 = null;
        field394 = null;
        int var1 = -22 % ((65 - arg0) / 38);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIBII)V", line = 60)
    public static final void method181(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field396++;
        int var5 = -83 % ((33 - arg2) / 53);
        if (arg4 <= arg1) {
            for (int var6 = arg4; var6 < arg1; var6++) {
                class550.field7650[var6][arg3] = arg0;
            }
        } else {
            for (int var7 = arg1; var7 < arg4; var7++) {
                class550.field7650[var7][arg3] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(III)V", line = 113)
    public static final void method182(int arg0, int arg1, int arg2) {
        class75 var3 = class270.field3423[arg0][arg1][arg2];
        if (var3 != null) {
            class66.method393(var3.field1031);
            if (var3.field1031 != null) {
                var3.field1031 = null;
            }
        }
    }
}
