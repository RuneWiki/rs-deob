import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class166 {

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public static int field2504 = 0;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "Lal;")
    public static class66 field2502 = new class66("runescape", 0);

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "[Ljava/lang/String;")
    public static String[] field2507 = new String[8];

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "B")
    public byte field2486;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "B")
    public byte field2488;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "B")
    public byte field2490;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "B")
    public byte field2492;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "B")
    public byte field2495;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "B")
    public byte field2496;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "B")
    public byte field2499;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "F")
    public static float field2485;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public int field2491;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
    public int field2500;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "Lrs;")
    public static class461 field2505;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "S")
    public short field2484;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Z")
    public boolean field2480;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Z")
    public boolean field2482;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "Z")
    public boolean field2489;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "Z")
    public boolean field2493;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "Z")
    public boolean field2494;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "Z")
    public boolean field2497;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "Z")
    public boolean field2498;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "Z")
    public boolean field2501;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "Z")
    public boolean field2503;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "[I")
    public static int[] field2487;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "[Lem;")
    public static class150[] field2481;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static void method1101(int arg0) {
        field2487 = null;
        field2502 = null;
        field2505 = null;
        field2481 = null;
        if (arg0 != 393216) {
            method1102(56, -100, (byte) 119);
        }
        field2507 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1102(int arg0, int arg1, byte arg2) {
        if (arg2 <= 103) {
            return false;
        } else {
            field2506++;
            return (arg1 & 0x60000) != 0 | class102.method759(89, arg0, arg1) || class266.method1598(-101, arg1, arg0) || class154.method1036(4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)V")
    public static final void method1103(int arg0, int arg1) {
        field2483++;
        if (arg0 != 32401) {
            field2507 = null;
        }
        class97 var2 = class348.method2064(arg1, 11, 101);
        var2.method710(-9237);
    }
}
