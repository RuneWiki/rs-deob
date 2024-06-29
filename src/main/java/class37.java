import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class37 extends class445 {

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "I")
    public int field555;

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "[I")
    public static int[] field550 = new int[4096];

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "[[[I")
    public static int[][][] field553 = new int[2][][];

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "[[Z")
    public static boolean[][] field552;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BIIII)V", line = 9)
    public static final void method274(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 5) {
            method274((byte) 5, 64, -36, 50, 36);
        }
        field557++;
        if (class425.field5751 <= arg2 - arg4 && (arg2 + arg4) <= class136.field1985 && arg3 - arg4 >= class221.field2942 && class205.field2784 >= (arg3 + arg4)) {
            class323.method1791((byte) 73, arg4, arg3, arg1, arg2);
        } else {
            class191.method1090(-12066, arg4, arg2, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V", line = 31)
    public static void method275(byte arg0) {
        field552 = null;
        field553 = null;
        if (arg0 < 0) {
            field550 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V", line = 42)
    public class37() {
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZII[Lnk;ZI)V", line = 49)
    public static final void method276(boolean arg0, int arg1, int arg2, class464[] arg3, boolean arg4, int arg5) {
        for (int var6 = 0; var6 < arg3.length; var6++) {
            class464 var7 = arg3[var6];
            if (var7 != null && var7.field6362 == arg2) {
                class31.method177(arg1, arg5, 12908, arg0, var7);
                class477.method2794(var7, arg5, arg1, (byte) -100);
                if ((var7.field6368 - var7.field6308) < var7.field6330) {
                    var7.field6330 = var7.field6368 - var7.field6308;
                }
                if (var7.field6330 < 0) {
                    var7.field6330 = 0;
                }
                if (var7.field6333 > (var7.field6346 - var7.field6340)) {
                    var7.field6333 = var7.field6346 - var7.field6340;
                }
                if (var7.field6333 < 0) {
                    var7.field6333 = 0;
                }
                if (var7.field6358 == 0) {
                    class265.method1499(arg0, var7, (byte) 18);
                }
            }
        }
        if (arg4) {
            field550 = null;
        }
        field556++;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(I)V", line = 99)
    public class37(int arg0) {
        this.field555 = arg0;
    }
}
