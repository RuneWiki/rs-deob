import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public abstract class class226 extends class256 {

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "Z")
    public volatile boolean field4099 = true;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "J")
    public static long field4096 = 0L;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
    public static int field4097 = 0;

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "I")
    public static int field4104 = 0;

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "Lrk;")
    public static class257 field4103 = new class257();

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "Z")
    public boolean field4101;

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "Z")
    public boolean field4102;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public static void method1587(byte arg0) {
        field4103 = null;
        if (arg0 <= 105) {
            method1587((byte) 14);
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)[B")
    public abstract byte[] method199(byte arg0);

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)I")
    public abstract int method202(byte arg0);
}
