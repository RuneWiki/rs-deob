import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class462 {

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    private int field6450;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
    public int field6460;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public int field6449;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "B")
    public byte field6461;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
    public int field6462;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "Lck;")
    public class462 field6457;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "Lkn;")
    public static class530 field6452 = new class530(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "Z")
    public static boolean field6464 = false;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "[S")
    public static short[] field6468 = new short[256];

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "Leh;")
    public static class246 field6465 = new class246(83, 28);

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field6451;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public int field6453;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public int field6454;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public int field6455;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public int field6456;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public int field6459;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
    public int field6463;

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "I")
    public int field6466;

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "I")
    public int field6467;

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "I")
    public int field6469;

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "I")
    public static int field6470;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "Lum;")
    public static class370 field6458;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)Lui;")
    public final class155 method2688(int arg0) {
        if (arg0 != 83) {
            this.field6456 = -126;
        }
        field6470++;
        return class324.method1956(true, this.field6450);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V")
    public static void method2689(int arg0) {
        field6452 = null;
        field6465 = null;
        field6468 = null;
        if (arg0 <= -83) {
            field6458 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIII)Lck;")
    public final class462 method2690(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 124) {
            this.method2688(-111);
        }
        field6451++;
        return new class462(this.field6450, arg3, arg2, arg1, this.field6461);
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(IIIIB)V")
    public class462(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field6450 = arg0;
        this.field6460 = arg2;
        this.field6449 = arg3;
        this.field6461 = arg4;
        this.field6462 = arg1;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lck;I)V")
    public class462(class462 arg0, int arg1) {
        this.field6457 = arg0;
        this.field6449 = this.field6457.field6449 + arg1;
        this.field6450 = this.field6457.field6450;
        this.field6461 = this.field6457.field6461;
        this.field6460 = this.field6457.field6460 + arg1;
        this.field6462 = this.field6457.field6462 + arg1;
    }
}
