import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class609 {

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "I")
    public int field8436;

    @OriginalMember(owner = "client!nba", name = "h", descriptor = "I")
    public int field8442;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "I")
    public int field8435;

    @OriginalMember(owner = "client!nba", name = "f", descriptor = "I")
    public int field8440;

    @OriginalMember(owner = "client!nba", name = "c", descriptor = "I")
    public static int field8437 = -1;

    @OriginalMember(owner = "client!nba", name = "d", descriptor = "I")
    public static int field8438;

    @OriginalMember(owner = "client!nba", name = "e", descriptor = "I")
    public static int field8439;

    @OriginalMember(owner = "client!nba", name = "g", descriptor = "I")
    public static int field8441;

    @OriginalMember(owner = "client!nba", name = "i", descriptor = "I")
    public static int field8443;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IB)Lnba;", line = 6)
    public final class609 method3334(int arg0, byte arg1) {
        field8439++;
        return arg1 > -85 ? null : new class609(this.field8440, arg0, this.field8435, this.field8442);
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(Lha;IIIIIIZZ)V", line = 19)
    public static final void method3335(class454 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class618.field8660 = arg0;
        class303.field3891 = arg1;
        class6.field68 = class303.field3891 > 1 && class618.field8660.method107();
        class455.field6383 = arg2;
        class431.field6109 = 0x1 << class455.field6383;
        class5.field54 = class431.field6109 >> 1;
        Math.sqrt((double) (class5.field54 * class5.field54 + class5.field54 * class5.field54));
        class126.field1511 = arg3;
        class90.field1142 = arg4;
        class665.field9107 = arg5;
        class267.field3381 = arg6;
        class424.field6044 = class641.method3486(-113);
        class206.method1272(0);
        class93.field1177 = new class73[arg3][class90.field1142][class665.field9107];
        class716.field10106 = new class402[arg3];
        if (arg7) {
            class224.field2949 = new int[class90.field1142][class665.field9107];
            class84.field1088 = new byte[class90.field1142][class665.field9107];
            class340.field4391 = new short[class90.field1142][class665.field9107];
            class618.field8658 = new class73[1][class90.field1142][class665.field9107];
            class109.field1341 = new class402[1];
        } else {
            class224.field2949 = null;
            class84.field1088 = null;
            class340.field4391 = null;
            class618.field8658 = null;
            class109.field1341 = null;
        }
        if (arg8) {
            class374.field5261 = new long[arg3][arg4][arg5];
            class708.field9968 = new class615[65535];
            class399.field5524 = new boolean[65535];
            class150.field1824 = 0;
        } else {
            class374.field5261 = null;
            class708.field9968 = null;
            class399.field5524 = null;
            class150.field1824 = 0;
        }
        class611.method3342(false);
        class684.field9445 = new class410[2];
        class466.field6722 = new class410[2];
        class293.field3797 = new class410[2];
        class357.field4782 = new class410[10000];
        class141.field1675 = 0;
        class303.field3902 = new class410[5000];
        class400.field5553 = 0;
        class102.field1257 = new class451[5000];
        class618.field8661 = 0;
        class376.field5266 = new boolean[class267.field3381 + class267.field3381 + 1][class267.field3381 + class267.field3381 + 1];
        class160.field2047 = new boolean[class267.field3381 + class267.field3381 + 2][class267.field3381 + class267.field3381 + 2];
        class582.field8081 = new int[class267.field3381 + class267.field3381 + 2];
        class469.field6740 = class469.field6743;
        if (class6.field68) {
            class228.field2986 = new boolean[arg3][class267.field3381 + class267.field3381 + 1][class267.field3381 + class267.field3381 + 1];
            class49.field722 = new boolean[arg3][][];
            if (class573.field7997 != null) {
                class395.method2357();
            }
            class573.field7997 = new class413[class303.field3891];
            class618.field8660.method124(class573.field7997.length + 1);
            class618.field8660.method112(0);
            for (int var9 = 0; var9 < class573.field7997.length; var9++) {
                class573.field7997[var9] = new class413(var9 + 1, class618.field8660);
                (new Thread(class573.field7997[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class303.field3891 == 2) {
                var10 = 4;
                class86.field1097 = 2;
            } else if (class303.field3891 == 3) {
                var10 = 6;
                class86.field1097 = 3;
            } else {
                var10 = 8;
                class86.field1097 = 4;
            }
            class317.field4078 = new class323[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                class317.field4078[var11] = new class323(class229.field2991[class303.field3891 - 2][var11]);
            }
        } else {
            class86.field1097 = 1;
        }
        class529.field7463 = new int[class86.field1097 - 1];
        class237.field3063 = new int[class86.field1097 - 1];
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIIII)V", line = 137)
    public static final void method3336(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < 91) {
            method3335(null, 68, -82, 89, 55, 30, -2, false, true);
        }
        field8438++;
        class548 var5 = class696.method3872(arg1, 4, -1633381944);
        var5.method3130(69);
        var5.field7726 = arg2;
        var5.field7725 = arg4;
        var5.field7728 = arg0;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IC)Z", line = 155)
    public static final boolean method3337(int arg0, char arg1) {
        if (arg0 >= -84) {
            field8437 = -117;
        }
        field8443++;
        return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)V", line = 171)
    public static final void method3338(int arg0) {
        field8441++;
        if (class323.field4120 == class20.field257) {
            return;
        }
        try {
            class193.method1213(-13481, "tbrefresh", class612.field8463);
            if (arg0 <= 99) {
                method3336(24, 113, 38, 78, 45);
            }
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(IIII)V", line = 193)
    public class609(int arg0, int arg1, int arg2, int arg3) {
        this.field8436 = arg1;
        this.field8442 = arg3;
        this.field8435 = arg2;
        this.field8440 = arg0;
    }
}
