import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class235 {

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "J")
    public long field3403;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "Llea;")
    private class573 field3401;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "[I")
    public static int[] field3402 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "[Lje;")
    public static class98[] field3404 = new class98[14];

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "Lin;")
    public static class380 field3406 = new class380(78, -2);

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!ck", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() throws Throwable {
        field3405++;
        this.field3401.method3328(this.field3403, (byte) 17);
        super.finalize();
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V", line = 17)
    public static void method1593(int arg0) {
        field3402 = null;
        field3406 = null;
        if (arg0 != -24209) {
            method1593(105);
        }
        field3404 = null;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Llea;JI)V", line = 29)
    public class235(class573 arg0, long arg1, int arg2) {
        this.field3403 = arg1;
        this.field3401 = arg0;
    }
}
