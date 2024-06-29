import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class704 extends class258 {

    @OriginalMember(owner = "client!jda", name = "r", descriptor = "I")
    private int field9313 = -1;

    @OriginalMember(owner = "client!jda", name = "n", descriptor = "[I")
    public static int[] field9309 = new int[25];

    @OriginalMember(owner = "client!jda", name = "p", descriptor = "[Laaa;")
    public static class27[] field9311 = new class27[6];

    @OriginalMember(owner = "client!jda", name = "s", descriptor = "B")
    private byte field9314;

    @OriginalMember(owner = "client!jda", name = "m", descriptor = "I")
    public static int field9308;

    @OriginalMember(owner = "client!jda", name = "o", descriptor = "I")
    public static int field9310;

    @OriginalMember(owner = "client!jda", name = "q", descriptor = "I")
    public static int field9312;

    @OriginalMember(owner = "client!jda", name = "t", descriptor = "I")
    public static int field9315;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IZZ)V", line = 3)
    public static final void method3812(int arg0, boolean arg1, boolean arg2) {
        field9310++;
        if (arg2) {
            class148 var3 = class398.method2306(arg0, arg1, (byte) 41);
            if (var3 != null) {
                var3.method1946(-10364);
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lim;B)V", line = 28)
    public final void method547(class652 arg0, byte arg1) {
        if (arg1 < 123) {
            this.method547(null, (byte) -40);
        }
        arg0.method3531(this.field9313, this.field9314, 9111);
        field9308++;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(BLmc;)V", line = 49)
    public final void method546(byte arg0, class234 arg1) {
        this.field9313 = arg1.method1553((byte) 43);
        field9315++;
        int var3 = 126 / ((7 - arg0) / 41);
        this.field9314 = arg1.method1554(27806);
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(B)V", line = 60)
    public static void method3813(byte arg0) {
        field9311 = null;
        if (arg0 != 120) {
            method3812(92, false, false);
        }
        field9309 = null;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIIII)V", line = 71)
    public static final void method3814(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class656.field8465 != null) {
            class656.field8465[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class490.field6303 != null) {
            class490.field6303[arg0][arg1] = (short) arg3;
        }
        if (class329.field4032 != null) {
            class329.field4032[arg0][arg1] = (byte) arg4;
        }
    }
}
