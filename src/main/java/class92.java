import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class92 extends class423 {

    @OriginalMember(owner = "client!iga", name = "s", descriptor = "Ljd;")
    public static class624 field1319 = new class624("WIP", 2);

    @OriginalMember(owner = "client!iga", name = "y", descriptor = "Lsv;")
    public static class570 field1325 = new class570(79, 8);

    @OriginalMember(owner = "client!iga", name = "r", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!iga", name = "t", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!iga", name = "u", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!iga", name = "v", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!iga", name = "x", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!iga", name = "w", descriptor = "Lmq;")
    private class85 field1323;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(ZIII)V")
    public final void method784(boolean arg0, int arg1, int arg2, int arg3) {
        ++field1322;
        int var5 = this.method2490(false) * super.field5885.field9960 / 10000;
        if (arg2 >= 12) {
            int[] var6 = new int[4];
            class686.field9702.method422(var6);
            class686.field9702.method488(arg3, arg1 + 2, arg3 + var5, super.field5885.field9968 + arg1);
            this.field1323.method757(arg3, arg1 - -2, super.field5885.field9960, super.field5885.field9968);
            class686.field9702.method488(var6[0], var6[1], var6[2], var6[3]);
        }
    }

    @OriginalMember(owner = "client!iga", name = "e", descriptor = "(I)V")
    public static void method785(int arg0) {
        field1319 = null;
        int var1 = 127 % ((50 - arg0) / 58);
        field1325 = null;
    }

    @OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(Lgga;Lgga;Llca;)V")
    public class92(class513 arg0, class513 arg1, class110 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(I)Z")
    public final boolean method17(int arg0) {
        if (arg0 > -93) {
            return true;
        } else {
            ++field1318;
            return !super.method17(-124) ? false : super.field5887.method3005(((class110) super.field5885).field1560, (byte) -69);
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(ZIIB)V")
    public final void method786(boolean arg0, int arg1, int arg2, byte arg3) {
        ++field1321;
        class686.field9702.method447(arg2 - 2, arg1, super.field5885.field9960 + 4, super.field5885.field9968 - -2, ((class110) super.field5885).field1555, 0);
        class686.field9702.method447(arg2 + -1, arg1 + 1, super.field5885.field9960 - -2, super.field5885.field9968, 0, 0);
        if (arg3 != 33) {
            this.method784(true, -18, 16, 58);
        }
    }

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "(I)V")
    public final void method20(int arg0) {
        super.method20(-104);
        if (arg0 >= -50) {
            field1324 = 34;
        }
        ++field1320;
        this.field1323 = class663.method3712(123, super.field5887, ((class110) super.field5885).field1560);
    }
}
