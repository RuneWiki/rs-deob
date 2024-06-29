import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class148 extends class259 {

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "[B")
    public byte[] field2355;

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "I")
    public static int field2354 = 0;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "Lhi;")
    public static class323 field2353 = null;

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "I")
    public static int field2358 = 0;

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "Lvh;")
    public static class62 field2356 = new class62(4);

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "Z")
    public static boolean field2359 = false;

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V", line = 21)
    public static void method1086(int arg0) {
        field2353 = null;
        field2356 = null;
        if (arg0 != 0) {
            method1086(2);
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "([B)V", line = 30)
    public class148(byte[] arg0) {
        this.field2355 = arg0;
    }
}
