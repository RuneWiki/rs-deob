import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class588 {

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "I")
    private int field8517;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "Z")
    public static boolean field8514 = false;

    @OriginalMember(owner = "client!qt", name = "n", descriptor = "I")
    public static int field8527 = 0;

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "Ler;")
    public static class90 field8518 = null;

    @OriginalMember(owner = "client!qt", name = "i", descriptor = "F")
    public static float field8522;

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
    public static int field8515;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
    public static int field8516;

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "I")
    public static int field8519;

    @OriginalMember(owner = "client!qt", name = "g", descriptor = "I")
    public static int field8520;

    @OriginalMember(owner = "client!qt", name = "h", descriptor = "I")
    public static int field8521;

    @OriginalMember(owner = "client!qt", name = "j", descriptor = "I")
    public static int field8523;

    @OriginalMember(owner = "client!qt", name = "k", descriptor = "I")
    public static int field8524;

    @OriginalMember(owner = "client!qt", name = "m", descriptor = "I")
    public static int field8526;

    @OriginalMember(owner = "client!qt", name = "l", descriptor = "J")
    public static long field8525;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IB)V", line = 3)
    public final void method3405(int arg0, byte arg1) {
        if (arg1 <= 88) {
            field8522 = 1.4996787F;
        }
        field8519++;
        OpenGL.glNewList(this.field8517 + arg0, 4864);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)V", line = 18)
    public static final void method3406(int arg0, int arg1) {
        field8524++;
        class440.field6293.method2777(arg0, 60);
        class310.field4100.method2777(arg0, 49);
        class151.field1869.method2777(arg0, 72);
        if (arg1 < 110) {
            method3412(91, (byte) 52, 55);
        }
        class129.field1644.method2777(arg0, 65);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V", line = 33)
    public static void method3407(int arg0) {
        field8518 = null;
        if (arg0 != 0) {
            method3407(50);
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(IB)V", line = 44)
    public static final void method3408(int arg0, byte arg1) {
        field8521++;
        if (arg1 < -34) {
            class233 var2 = class7.method44(arg0, 1, -1);
            var2.method1423(0);
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(BC)V", line = 58)
    public final void method3409(byte arg0, char arg1) {
        field8516++;
        if (arg0 > 112) {
            OpenGL.glCallList(this.field8517 + arg1);
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)V", line = 69)
    public final void method3410(int arg0) {
        OpenGL.glEndList();
        if (arg0 == 1) {
            field8523++;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lub;III)V", line = 81)
    public static final void method3411(class20 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class455.field6393) {
            class433 var4 = class281.field3808[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field6221 != null && var4.field6221.method167((byte) 118)) {
                arg0.method169(0, 0, true, class298.field4017, 126, var4.field6221, class454.field6392);
            }
        }
        if (arg3 < class455.field6393) {
            class433 var5 = class281.field3808[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field6221 != null && var5.field6221.method167((byte) 118)) {
                arg0.method169(class454.field6392, 0, true, class298.field4017, 115, var5.field6221, 0);
            }
        }
        if (arg2 < class455.field6393 && arg3 < class302.field4057) {
            class433 var6 = class281.field3808[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field6221 != null && var6.field6221.method167((byte) 118)) {
                arg0.method169(class454.field6392, 0, true, class298.field4017, 127, var6.field6221, class454.field6392);
            }
        }
        if (arg2 < class455.field6393 && arg3 > 0) {
            class433 var7 = class281.field3808[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field6221 != null && var7.field6221.method167((byte) 118)) {
                arg0.method169(-class454.field6392, 0, true, class298.field4017, 126, var7.field6221, class454.field6392);
            }
        }
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lkga;I)V", line = 132)
    public class588(class506 arg0, int arg1) {
        this.field8517 = OpenGL.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IBI)Z", line = 148)
    public static final boolean method3412(int arg0, byte arg1, int arg2) {
        if (arg1 != -57) {
            field8514 = false;
        }
        field8515++;
        return (arg2 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(BI)Lad;", line = 165)
    public static final class391 method3413(byte arg0, int arg1) {
        int var2 = -31 % ((-arg0 - 17) / 41);
        field8526++;
        return new class391(arg1, false);
    }
}
