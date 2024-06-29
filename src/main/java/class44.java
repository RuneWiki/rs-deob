import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class44 extends class53 {

    @OriginalMember(owner = "client!ga", name = "tb", descriptor = "I")
    private int field1119 = 0;

    @OriginalMember(owner = "client!ga", name = "vb", descriptor = "Z")
    public boolean field1121 = false;

    @OriginalMember(owner = "client!ga", name = "Jb", descriptor = "I")
    private int field1135 = 0;

    @OriginalMember(owner = "client!ga", name = "Gb", descriptor = "I")
    public int field1132;

    @OriginalMember(owner = "client!ga", name = "yb", descriptor = "I")
    public int field1124;

    @OriginalMember(owner = "client!ga", name = "Kb", descriptor = "I")
    private int field1136;

    @OriginalMember(owner = "client!ga", name = "Fb", descriptor = "I")
    public int field1131;

    @OriginalMember(owner = "client!ga", name = "Bb", descriptor = "I")
    public int field1127;

    @OriginalMember(owner = "client!ga", name = "Cb", descriptor = "I")
    public int field1128;

    @OriginalMember(owner = "client!ga", name = "Hb", descriptor = "Luc;")
    private class142 field1133;

    @OriginalMember(owner = "client!ga", name = "ub", descriptor = "Lhe;")
    public static class54 field1120 = class6.method58("title_mute", false);

    @OriginalMember(owner = "client!ga", name = "rb", descriptor = "Lhe;")
    public static class54 field1117 = class6.method58("", false);

    @OriginalMember(owner = "client!ga", name = "pb", descriptor = "Lhe;")
    public static class54 field1115 = class6.method58("auf der Hautpseite)3", false);

    @OriginalMember(owner = "client!ga", name = "Ib", descriptor = "Lhe;")
    private static class54 field1134 = class6.method58(" has logged in)3", false);

    @OriginalMember(owner = "client!ga", name = "Ab", descriptor = "Lhe;")
    public static class54 field1126 = field1134;

    @OriginalMember(owner = "client!ga", name = "zb", descriptor = "[Z")
    public static boolean[] field1125 = new boolean[100];

    @OriginalMember(owner = "client!ga", name = "Lb", descriptor = "I")
    public static int field1137 = 0;

    @OriginalMember(owner = "client!ga", name = "Mb", descriptor = "Lhe;")
    public static class54 field1138 = class6.method58("RuneScape wird geladen )2 bitte warten)3)3)3", false);

    @OriginalMember(owner = "client!ga", name = "qb", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!ga", name = "wb", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!ga", name = "xb", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!ga", name = "Db", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!ga", name = "Eb", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!ga", name = "Nb", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!ga", name = "sb", descriptor = "J")
    public static long field1118;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V")
    public static void method329(byte arg0) {
        field1120 = null;
        field1138 = null;
        field1126 = null;
        field1134 = null;
        if (arg0 >= -40) {
            method329((byte) 39);
        }
        field1125 = null;
        field1117 = null;
        field1115 = null;
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(Z)Loa;")
    public final class98 method184(boolean arg0) {
        if (arg0) {
            return null;
        }
        field1123++;
        class52 var2 = class107.method813(-23222, this.field1136);
        class98 var3;
        if (this.field1121) {
            var3 = var2.method371(-112, -1);
        } else {
            var3 = var2.method371(83, this.field1135);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZLqa;)V")
    public static final void method330(int arg0, boolean arg1, class112 arg2) {
        field1129++;
        int var3 = arg2.field2691;
        int var4 = (int) arg2.field154;
        arg2.method48(-315);
        if (arg1) {
            class102.method802(-119, var3);
        }
        class24.method188((byte) 62, var3);
        class93 var5 = class121.method938(true, var4);
        if (var5 != null) {
            class134.method1005(var5, 0);
        }
        int var6 = 18 / ((arg0 - 32) / 57);
        class67.field1641 = 0;
        class133.field3007 = false;
        class142.method1101(class7.field212, 16052, class125.field2870, class142.field3242, class82.field2017);
        if (class39.field1016 != -1) {
            class115.method877(0, 1, class39.field1016);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)V")
    public final void method331(byte arg0, int arg1) {
        field1116++;
        if (this.field1121 || arg0 < 115) {
            return;
        }
        this.field1119 += arg1;
        while (this.field1119 > this.field1133.field3247[this.field1135]) {
            this.field1119 -= this.field1133.field3247[this.field1135];
            this.field1135++;
            if (this.field1135 >= this.field1133.field3258.length) {
                this.field1121 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(IIIIIII)V")
    public class44(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1132 = arg4;
        this.field1124 = arg5 + arg6;
        this.field1136 = arg0;
        this.field1131 = arg3;
        this.field1127 = arg2;
        this.field1128 = arg1;
        int var8 = class107.method813(-23222, this.field1136).field1250;
        if (var8 == -1) {
            this.field1121 = true;
        } else {
            this.field1121 = false;
            this.field1133 = class135.method1010(var8, (byte) -116);
        }
    }
}
