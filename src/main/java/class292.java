import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class292 extends class299 {

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "Ljc;")
    public static class305 field3856 = new class305("K", "T", "K", "K");

    @OriginalMember(owner = "client!ij", name = "G", descriptor = "Lwc;")
    public static class49 field3862 = new class49();

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "[B")
    public static byte[] field3863 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "I")
    public static int field3864 = 1339;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "I")
    public int field3858;

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "I")
    public int field3859;

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "I")
    public int field3860;

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "J")
    public long field3854;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)I")
    public final int method1755(int arg0) {
        if (arg0 != 3) {
            this.method1757(-20);
        }
        field3851++;
        return this.field3859;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)Ltv;")
    public static final class395 method1756(byte arg0) {
        field3855++;
        if (arg0 != -34) {
            field3861 = 10;
        }
        return class416.field5983;
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)J")
    public final long method1757(int arg0) {
        field3852++;
        if (arg0 != 0) {
            this.method1760(31);
        }
        return this.field3854;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)I")
    public final int method1758(byte arg0) {
        field3857++;
        if (arg0 < 76) {
            field3863 = null;
        }
        return this.field3858;
    }

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "(I)V")
    public static void method1759(int arg0) {
        field3856 = null;
        field3862 = null;
        int var1 = -47 / ((arg0 + 69) / 57);
        field3863 = null;
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)I")
    public final int method1760(int arg0) {
        if (arg0 != 1) {
            field3863 = null;
        }
        field3853++;
        return this.field3860;
    }
}
