import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class171 extends class119 {

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
    public int field3306 = 0;

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "I")
    public int field3310 = -1;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "[Ljc;")
    public static class85[] field3301 = new class85[16];

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "Lai;")
    public static class10 field3299 = class44.method278("Lade Titelbild )2 ", 96);

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "[I")
    public static int[] field3300 = new int[] { 14, 26, 34, 49, 57, 23, 40, 33 };

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "I")
    public static int field3311 = 0;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "Lvb;")
    public static class192 field3298 = new class192();

    @OriginalMember(owner = "client!sh", name = "I", descriptor = "I")
    public static int field3316 = 0;

    @OriginalMember(owner = "client!sh", name = "J", descriptor = "Z")
    public static volatile boolean field3317 = true;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public int field3297;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "I")
    public int field3302;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "I")
    public int field3303;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
    public int field3304;

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "I")
    public int field3307;

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
    public int field3308;

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "I")
    public int field3309;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!sh", name = "F", descriptor = "I")
    public int field3313;

    @OriginalMember(owner = "client!sh", name = "G", descriptor = "I")
    public int field3314;

    @OriginalMember(owner = "client!sh", name = "H", descriptor = "I")
    public int field3315;

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "[[S")
    public static short[][] field3318;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
    public static final void method1126(int arg0) {
        if (class84.field1460 != null) {
            class97 var1 = class84.field1460;
            synchronized (class84.field1460) {
                class84.field1460 = null;
            }
        }
        if (arg0 < -8) {
            field3312++;
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)V")
    public static void method1127(int arg0) {
        field3298 = null;
        field3299 = null;
        int var1 = -98 % ((41 - arg0) / 49);
        field3318 = null;
        field3300 = null;
        field3301 = null;
    }
}
