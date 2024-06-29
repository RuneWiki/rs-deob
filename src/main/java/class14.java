import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public abstract class class14 extends class5 {

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
    public static int field194 = 0;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "Ltk;")
    public static class151 field187 = new class151(5000);

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
    public static int field196 = 0;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "Z")
    public boolean field192;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V", line = 5)
    public static void method104(int arg0) {
        if (arg0 <= 109) {
            method104(108);
        }
        field187 = null;
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)Z", line = 17)
    public final boolean method106(int arg0) {
        if (arg0 != 0) {
            field194 = -86;
        }
        field193++;
        return false;
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)Z", line = 29)
    public final boolean method107(int arg0) {
        field189++;
        if (arg0 < 38) {
            this.field192 = false;
        }
        return this.field192;
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "()I", line = 47)
    public int method109() {
        field195++;
        return 0;
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)Z", line = 60)
    public final boolean method112(byte arg0) {
        if (arg0 != 77) {
            this.method112((byte) 87);
        }
        field188++;
        return false;
    }

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "(I)I", line = 91)
    public final int method115(int arg0) {
        if (arg0 == 10975) {
            field190++;
            return 1;
        } else {
            return -43;
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "()V")
    public abstract void method105();

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "()Z")
    public abstract boolean method108();

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "()Z")
    public abstract boolean method110();

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "(I)V")
    public abstract void method111(int arg0);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)V")
    public abstract void method113(int arg0, int arg1);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIII)V")
    public abstract void method114(int arg0, int arg1, int arg2, int arg3, int arg4);
}
