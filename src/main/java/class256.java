import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class256 extends class297 {

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "Lma;")
    private static class5 field4368 = class12.method119("Close", (byte) 113);

    @OriginalMember(owner = "client!jk", name = "y", descriptor = "Lma;")
    public static class5 field4371 = class12.method119("<img=0>", (byte) 126);

    @OriginalMember(owner = "client!jk", name = "F", descriptor = "[S")
    public static short[] field4378 = new short[256];

    @OriginalMember(owner = "client!jk", name = "M", descriptor = "Lma;")
    public static class5 field4385 = class12.method119(":", (byte) 124);

    @OriginalMember(owner = "client!jk", name = "H", descriptor = "Lma;")
    private static class5 field4380 = class12.method119("Starting 3d library", (byte) 82);

    @OriginalMember(owner = "client!jk", name = "B", descriptor = "Z")
    public static boolean field4374 = false;

    @OriginalMember(owner = "client!jk", name = "G", descriptor = "Lma;")
    public static class5 field4379 = field4380;

    @OriginalMember(owner = "client!jk", name = "N", descriptor = "Lma;")
    public static class5 field4386 = field4368;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "I")
    public int field4367;

    @OriginalMember(owner = "client!jk", name = "w", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!jk", name = "x", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!jk", name = "C", descriptor = "I")
    public int field4375;

    @OriginalMember(owner = "client!jk", name = "I", descriptor = "I")
    public int field4381;

    @OriginalMember(owner = "client!jk", name = "K", descriptor = "I")
    public int field4383;

    @OriginalMember(owner = "client!jk", name = "L", descriptor = "I")
    public int field4384;

    @OriginalMember(owner = "client!jk", name = "E", descriptor = "Leb;")
    public class253 field4377;

    @OriginalMember(owner = "client!jk", name = "J", descriptor = "Leb;")
    public class253 field4382;

    @OriginalMember(owner = "client!jk", name = "A", descriptor = "Lma;")
    public class5 field4373;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "Z")
    public boolean field4365;

    @OriginalMember(owner = "client!jk", name = "z", descriptor = "[Ljava/lang/Object;")
    public Object[] field4372;

    @OriginalMember(owner = "client!jk", name = "D", descriptor = "[[Leb;")
    public static class253[][] field4376;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)V", line = 12)
    public static final void method1786(int arg0) {
        field4366++;
        if (arg0 == 256) {
            class209.field3312.method522(arg0 ^ 0x137);
        }
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(I)V", line = 54)
    public static void method1787(int arg0) {
        field4371 = null;
        field4379 = null;
        field4376 = (class253[][]) null;
        field4386 = null;
        field4385 = null;
        field4380 = null;
        field4378 = null;
        field4368 = null;
        if (arg0 != 12951) {
            method1786(-84);
        }
    }
}
