import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class187 {

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "Lmh;")
    private class537 field2255;

    @OriginalMember(owner = "client!nt", name = "h", descriptor = "J")
    public long field2257;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
    public static int field2252 = 0;

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "Lvj;")
    public static class373 field2254 = new class373(81, 3);

    @OriginalMember(owner = "client!nt", name = "g", descriptor = "Lft;")
    public static class4 field2256 = new class4();

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!nt", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field2255.method3088(this.field2257, 0);
        field2251++;
        super.finalize();
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V")
    public static void method1023(byte arg0) {
        field2256 = null;
        if (arg0 == 19) {
            field2254 = null;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)Z")
    public static final boolean method1024(int arg0, int arg1, int arg2) {
        if (arg0 != 3) {
            field2254 = null;
        }
        field2250++;
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
    public static final void method1025(int arg0) {
        field2253++;
        class641 var1 = class341.field4398;
        synchronized (class341.field4398) {
            class341.field4398.method3694(arg0 ^ arg0);
        }
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lmh;JI)V")
    public class187(class537 arg0, long arg1, int arg2) {
        this.field2255 = arg0;
        this.field2257 = arg1;
    }
}
