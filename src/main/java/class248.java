import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public abstract class class248 {

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public int field4368;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public int field4365;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public int field4372;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "Ldf;")
    public static class51 field4364 = class46.method233("Hidden)2", 100);

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Ldf;")
    public static class51 field4363 = class46.method233("(U4", 100);

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "Ldf;")
    public static class51 field4370 = class46.method233("compass", 100);

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Ldf;")
    private static class51 field4369 = class46.method233("Loaded textures", 100);

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "Ldf;")
    public static class51 field4371 = class46.method233("cookieprefix", 100);

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "Ldf;")
    public static class51 field4361 = field4369;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field4366 = -2;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field4373 = 0;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBI)V")
    public abstract void method153(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
    public abstract void method154(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(III)V")
    public abstract void method152(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)V")
    public static final void method1690(int arg0, byte arg1) {
        class42.field674.method1348(0, arg0);
        if (arg1 != -32) {
            field4371 = null;
        }
        class146.field2437.method1348(0, arg0);
        field4367++;
        class70.field1124.method1348(arg1 + 32, arg0);
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(III)V")
    public class248(int arg0, int arg1, int arg2) {
        this.field4368 = arg0;
        this.field4365 = arg2;
        this.field4372 = arg1;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public static void method1691(byte arg0) {
        field4363 = null;
        field4361 = null;
        field4370 = null;
        field4364 = null;
        if (arg0 != -107) {
            field4360 = 67;
        }
        field4371 = null;
        field4369 = null;
    }
}
