import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public abstract class class19 {

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field292 = 0;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "Ljf;")
    private static class229 field301 = class212.method1457((byte) 69, "Loaded world list data");

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "Ljf;")
    public static class229 field300 = field301;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public int field295;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public int field303;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field298;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "[I")
    public int[] field297;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "[Lkb;")
    public static class35[] field293;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "[[[S")
    public static short[][][] field294;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 4)
    public static void method181(int arg0) {
        field300 = null;
        field294 = (short[][][]) null;
        field293 = null;
        field301 = null;
        int var1 = -122 % ((arg0 + 75) / 48);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V", line = 25)
    public static final void method182(byte arg0) {
        field304++;
        class308.field5196.method226((byte) -118);
        int var1 = -98 % ((39 - arg0) / 35);
        class235.field4056.method226((byte) -112);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V", line = 41)
    public static final void method183(byte arg0) {
        class259.method1845();
        if (arg0 > -41) {
            field294 = (short[][][]) ((short[][][]) null);
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class80.field1460[var1].method1767((byte) -115);
        }
        field302++;
        System.gc();
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V", line = 61)
    public final void method184(int arg0) {
        if (arg0 == -11271) {
            field299++;
            class114.method823(this.field297, this.field295, this.field303);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 78)
    public static final void method186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class102 var20 = new class102(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class312.field5246[var21][arg1][arg2] == null) {
                    class312.field5246[var21][arg1][arg2] = new class125(var21, arg1, arg2);
                }
            }
            class312.field5246[arg0][arg1][arg2].field2187 = var20;
        } else if (arg3 == 1) {
            class102 var22 = new class102(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class312.field5246[var23][arg1][arg2] == null) {
                    class312.field5246[var23][arg1][arg2] = new class125(var23, arg1, arg2);
                }
            }
            class312.field5246[arg0][arg1][arg2].field2187 = var22;
        } else {
            class285 var24 = new class285(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class312.field5246[var25][arg1][arg2] == null) {
                    class312.field5246[var25][arg1][arg2] = new class125(var25, arg1, arg2);
                }
            }
            class312.field5246[arg0][arg1][arg2].field2188 = var24;
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V", line = 130)
    protected class19() {
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lek;ILek;)V", line = 134)
    public static final void method189(class185 arg0, int arg1, class185 arg2) {
        field296++;
        class211.field3636 = class259.method1847(arg2, arg0, 0, (byte) -101, class195.field3392);
        if (class108.field1900) {
            class226.field3861 = class20.method192(arg2, -109, class195.field3392, arg0, 0);
        } else {
            class226.field3861 = (class77) class211.field3636;
        }
        class249.field4385 = class259.method1847(arg2, arg0, arg1, (byte) -98, class56.field998);
        class44.field796 = class259.method1847(arg2, arg0, 0, (byte) 84, class1.field4);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLjava/awt/Component;II)V")
    public abstract void method185(byte arg0, Component arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIBLjava/awt/Graphics;)V")
    public abstract void method187(int arg0, int arg1, int arg2, int arg3, byte arg4, Graphics arg5);

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
    public abstract void method188(int arg0, byte arg1, int arg2, Graphics arg3);
}
