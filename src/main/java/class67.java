import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class67 extends class54 {

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public int field1203;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
    private int field1210;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "[Z")
    private boolean[] field1197;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "[I")
    public int[] field1201;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "[[I")
    public int[][] field1211;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "Ldc;")
    public static class37 field1196 = class185.method1233((byte) 86, "::autoshadow off");

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "Ldc;")
    private static class37 field1206 = class185.method1233((byte) 86, "Please wait 1 minute and try again)3");

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "Ldc;")
    public static class37 field1205 = field1206;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "Ldc;")
    public static class37 field1198 = field1206;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "[I")
    public static int[] field1208;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "[Ljc;")
    public static class100[] field1202;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
    public static final void method488(int arg0) {
        field1204++;
        if (!class73.field1290) {
            return;
        }
        class209.field3910 = null;
        class142.field2736 = null;
        class103.field1789 = null;
        class99.field1723 = null;
        class15.field233 = null;
        class144.field2758 = null;
        class94.field1656 = null;
        class32.field648 = null;
        field1202 = null;
        class233.field4258 = null;
        class109.field1889 = null;
        class149.field2830 = null;
        class32.field651 = null;
        class82.field1461 = null;
        class163.field3093 = null;
        class143.field2755 = null;
        class140.field2718 = null;
        class106.field1844 = null;
        class102.field1755 = null;
        class49.field984 = null;
        class65.field1173 = null;
        class63.field1157 = null;
        class91.method602(-257, 2);
        class19.method129(arg0 ^ arg0, true);
        class73.field1290 = false;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V")
    public static void method489(byte arg0) {
        field1206 = null;
        field1202 = null;
        if (arg0 != 49) {
            method488(49);
        }
        field1208 = null;
        field1205 = null;
        field1196 = null;
        field1198 = null;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(I[B)V")
    public class67(int arg0, byte[] arg1) {
        this.field1203 = arg0;
        class28 var3 = new class28(arg1);
        this.field1210 = var3.method215(-1797813752);
        this.field1197 = new boolean[this.field1210];
        this.field1201 = new int[this.field1210];
        this.field1211 = new int[this.field1210][];
        for (int var4 = 0; var4 < this.field1210; var4++) {
            this.field1201[var4] = var3.method215(-1797813752);
        }
        for (int var5 = 0; var5 < this.field1210; var5++) {
            this.field1197[var5] = var3.method215(-1797813752) == 1;
        }
        for (int var6 = 0; var6 < this.field1210; var6++) {
            this.field1211[var6] = new int[var3.method215(-1797813752)];
        }
        for (int var7 = 0; var7 < this.field1210; var7++) {
            for (int var8 = 0; var8 < this.field1211[var7].length; var8++) {
                this.field1211[var7][var8] = var3.method215(-1797813752);
            }
        }
    }
}
