import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class432 {

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "J")
    public long field6347;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "Lef;")
    private class338 field6346;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "[Lcq;")
    public static class327[] field6344 = new class327[14];

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field6343;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "Lmg;")
    public static class101 field6342;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "Ldr;")
    public static class504 field6340;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)[Lri;", line = 6)
    public static final class74[] method2556(int arg0) {
        field6343++;
        if (arg0 != 14) {
            method2557((byte) 94);
        }
        return new class74[] { class67.field919, class531.field7816, class435.field6368, class409.field5972, class128.field1896, class315.field4320, class349.field5093, class120.field1774, class439.field6491, class402.field5894, class53.field646, class403.field5922, class30.field398, class404.field5931, class292.field4044 };
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V", line = 17)
    public static void method2557(byte arg0) {
        field6342 = null;
        field6344 = null;
        if (arg0 == 124) {
            field6340 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "finalize", descriptor = "()V", line = 36)
    protected final void finalize() throws Throwable {
        field6345++;
        this.field6346.method2008((byte) -74, this.field6347);
        super.finalize();
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lef;JI)V", line = 51)
    public class432(class338 arg0, long arg1, int arg2) {
        this.field6347 = arg1;
        this.field6346 = arg0;
    }
}
