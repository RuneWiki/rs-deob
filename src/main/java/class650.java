import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public class class650 {

    @OriginalMember(owner = "client!aja", name = "h", descriptor = "I")
    public int field9233 = 128;

    @OriginalMember(owner = "client!aja", name = "j", descriptor = "I")
    public int field9235 = 128;

    @OriginalMember(owner = "client!aja", name = "n", descriptor = "I")
    public int field9239;

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "I")
    public int field9227;

    @OriginalMember(owner = "client!aja", name = "e", descriptor = "I")
    public int field9230;

    @OriginalMember(owner = "client!aja", name = "q", descriptor = "I")
    public int field9242;

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "I")
    public int field9226;

    @OriginalMember(owner = "client!aja", name = "c", descriptor = "I")
    public int field9228;

    @OriginalMember(owner = "client!aja", name = "d", descriptor = "I")
    public int field9229;

    @OriginalMember(owner = "client!aja", name = "f", descriptor = "I")
    public static int field9231;

    @OriginalMember(owner = "client!aja", name = "g", descriptor = "I")
    public static int field9232;

    @OriginalMember(owner = "client!aja", name = "i", descriptor = "I")
    public static int field9234;

    @OriginalMember(owner = "client!aja", name = "k", descriptor = "I")
    public int field9236;

    @OriginalMember(owner = "client!aja", name = "l", descriptor = "I")
    public static int field9237;

    @OriginalMember(owner = "client!aja", name = "m", descriptor = "I")
    public int field9238;

    @OriginalMember(owner = "client!aja", name = "o", descriptor = "I")
    public static int field9240;

    @OriginalMember(owner = "client!aja", name = "p", descriptor = "I")
    public static int field9241;

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(B)V")
    public static final void method3658(byte arg0) {
        class142.method1105((byte) -83);
        field9237++;
        int var1 = class654.field9289.field5405.method3052(3);
        if (var1 == 2) {
            class674.method3760(class412.field6066, 100, (byte) -125, class660.field9408, 100, class364.field5573);
        } else if (var1 == 3) {
            class86.method753(class364.field5573, true, class251.field3994, 2, class412.field6066, 2, class371.field5624, class660.field9408);
        }
        if (class654.field9289.field5405.method3054(0)) {
            class148.method1126(class400.field5941, false);
        }
        if (class364.field5573 != null) {
            class498.method3018(-124);
        }
        class141.field2211 = class654.field9289.field5405.method3052(3) != 0;
        class250.field3989 = class654.field9289.field5405.method3054(0);
        if (arg0 != 74) {
            field9234 = 8;
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(I)V")
    public static final void method3659(int arg0) {
        int var1 = -89 % ((45 - arg0) / 56);
        field9231++;
        if (class654.field9289.field5453.method3878(3) == 0 && class582.field8234 != class405.field6003) {
            class635.method3599(false, 11, class319.field4745, class567.field8048, -1);
        } else {
            class206.method1512(class364.field5573, (byte) -112);
            if (class582.field8234 != class546.field7807) {
                class227.method1586((byte) 123);
            }
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(ILaja;)V")
    public final void method3660(int arg0, class650 arg1) {
        this.field9227 = arg1.field9227;
        this.field9233 = arg1.field9233;
        this.field9239 = arg1.field9239;
        this.field9242 = arg1.field9242;
        field9241++;
        this.field9235 = arg1.field9235;
        if (arg0 <= -3) {
            this.field9230 = arg1.field9230;
        }
    }

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "(I)Laja;")
    public final class650 method3661(int arg0) {
        field9240++;
        if (arg0 != 27170) {
            this.field9230 = -127;
        }
        return new class650(this.field9239, this.field9235, this.field9233, this.field9230, this.field9227, this.field9242);
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(III)Z")
    public static final boolean method3662(int arg0, int arg1, int arg2) {
        field9232++;
        return arg0 == 2 ? false : false;
    }

    @OriginalMember(owner = "client!aja", name = "<init>", descriptor = "(I)V")
    public class650(int arg0) {
        this.field9239 = arg0;
    }

    @OriginalMember(owner = "client!aja", name = "<init>", descriptor = "(IIIIII)V")
    private class650(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field9233 = arg2;
        this.field9227 = arg4;
        this.field9235 = arg1;
        this.field9239 = arg0;
        this.field9230 = arg3;
        this.field9242 = arg5;
    }
}
