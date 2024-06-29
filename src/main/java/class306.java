import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class306 {

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "J")
    private static long field4844;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "J")
    private static long field4845;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)J", line = 8)
    public static final synchronized long method2102(int arg0) {
        long var1 = System.currentTimeMillis();
        if (field4845 > var1) {
            field4844 += field4845 - var1;
        }
        if (arg0 != -289) {
            method2102(17);
        }
        field4845 = var1;
        return var1 + field4844;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V", line = 25)
    private class306() {
    }
}
