import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class102 {

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "[Lsk;")
    public class369[] field1416 = new class369[8];

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "[Ljr;")
    public class57[] field1419 = new class57[100];

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "[I")
    public int[] field1415 = new int[100];

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "[I")
    public int[] field1427 = new int[3];

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "[S")
    public static short[] field1418 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "Lal;")
    public static class52 field1417 = new class52(64);

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "[S")
    public static short[] field1429 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "[I")
    public static int[] field1428 = new int[2];

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public int field1422;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "Ljava/lang/Object;")
    public Object field1424;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "[I")
    public static int[] field1425;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)V")
    public static final void method764(int arg0, String arg1, int arg2, String arg3, int arg4, String arg5, int arg6, String arg7) {
        for (int var8 = 99; var8 > 0; var8--) {
            class326.field5122[var8] = class326.field5122[var8 - 1];
            class136.field2135[var8] = class136.field2135[var8 - 1];
            class318.field4989[var8] = class318.field4989[var8 - 1];
            class373.field5632[var8] = class373.field5632[var8 - 1];
            class21.field262[var8] = class21.field262[var8 - 1];
            class417.field6181[var8] = class417.field6181[var8 - 1];
            class394.field5904[var8] = class394.field5904[var8 - 1];
        }
        if (arg2 != -4461) {
            return;
        }
        field1423++;
        class326.field5122[0] = arg0;
        class318.field4989[0] = arg3;
        class136.field2135[0] = arg4;
        class373.field5632[0] = arg5;
        class21.field262[0] = arg7;
        class394.field5904[0] = arg6;
        class321.field4999 = class223.field3724;
        class417.field6181[0] = arg1;
        class277.field4411++;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
    public static void method765(int arg0) {
        field1429 = null;
        field1428 = null;
        field1425 = null;
        if (arg0 != 8) {
            method766(28);
        }
        field1418 = null;
        field1417 = null;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V")
    public static final void method766(int arg0) {
        if (arg0 != 0) {
            method766(-49);
        }
        field1421++;
        class435.field6410.method335((byte) 65);
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V")
    public static final void method767(int arg0) {
        class160.field2528.method335((byte) 113);
        if (arg0 != 4550) {
            field1418 = null;
        }
        field1420++;
    }
}
