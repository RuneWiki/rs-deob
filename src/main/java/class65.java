import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class65 extends class623 {

    @OriginalMember(owner = "client!rga", name = "D", descriptor = "[F")
    public static float[] field877 = new float[4];

    @OriginalMember(owner = "client!rga", name = "u", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!rga", name = "v", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!rga", name = "x", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!rga", name = "y", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!rga", name = "z", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!rga", name = "C", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!rga", name = "B", descriptor = "Lee;")
    public static class485 field875;

    @OriginalMember(owner = "client!rga", name = "t", descriptor = "Lsga;")
    private class583 field868;

    @OriginalMember(owner = "client!rga", name = "s", descriptor = "Lkha;")
    public static class687 field867;

    @OriginalMember(owner = "client!rga", name = "w", descriptor = "[I")
    public static int[] field871;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(IBLjava/lang/String;)Ljava/lang/String;")
    public final String method491(int arg0, byte arg1, String arg2) {
        field870++;
        if (this.field868 == null) {
            return arg2;
        } else if (arg1 == 121) {
            class739 var4 = (class739) this.field868.method3248((long) arg0, 0);
            return var4 == null ? arg2 : var4.field10338;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(III)Z")
    public static final boolean method492(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            field876++;
            return (arg1 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "(B)V")
    public static final void method493(byte arg0) {
        class721.field10157.method781((byte) 47);
        field869++;
        if (arg0 != 120) {
            method496(-110);
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(ILtn;)V")
    public final void method494(int arg0, class179 arg1) {
        field873++;
        while (true) {
            int var3 = arg1.method1094(255);
            if (var3 == 0) {
                if (arg0 == 0) {
                    return;
                } else {
                    method493((byte) 18);
                    return;
                }
            }
            this.method497(arg1, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "(III)I")
    public final int method495(int arg0, int arg1, int arg2) {
        field872++;
        if (arg0 != 13522) {
            this.method494(45, null);
        }
        if (this.field868 == null) {
            return arg2;
        } else {
            class394 var4 = (class394) this.field868.method3248((long) arg1, 0);
            return var4 == null ? arg2 : var4.field5494;
        }
    }

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "(I)V")
    public static void method496(int arg0) {
        field877 = null;
        field875 = null;
        field867 = null;
        if (arg0 != 2048) {
            field867 = null;
        }
        field871 = null;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(Ltn;II)V")
    private final void method497(class179 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method494(-7, null);
        }
        if (arg2 == 249) {
            int var4 = arg0.method1094(255);
            if (this.field868 == null) {
                int var5 = class353.method2103(105, var4);
                this.field868 = new class583(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method1094(255) == 1;
                int var8 = arg0.method1114(104);
                class627 var9;
                if (var7) {
                    var9 = new class739(arg0.method1106(-1));
                } else {
                    var9 = new class394(arg0.method1095((byte) 120));
                }
                this.field868.method3249((long) var8, var9, (byte) -114);
            }
        }
        field874++;
    }
}
