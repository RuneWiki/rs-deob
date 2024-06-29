import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class254 extends class12 {

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    public static int field4369 = 0;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public static volatile int field4366 = 0;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "Lvf;")
    private static class265 field4364 = class87.method582(-46, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "Lvf;")
    public static class265 field4365 = class87.method582(-46, "hint_mapedge");

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "Lvf;")
    public static class265 field4370 = field4364;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public int field4363;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    public int field4376;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "[I")
    public int[] field4367;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "[I")
    public int[] field4371;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "[I")
    public int[] field4375;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "[Lmh;")
    public class114[] field4360;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "[Lmh;")
    public class114[] field4374;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "[[B")
    public static byte[][] field4372;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "[[[B")
    public byte[][][] field4362;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "[[[S")
    public static short[][][] field4373;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IB)Lvf;")
    public static final class265 method1675(int arg0, byte arg1) {
        field4368++;
        class265 var2 = new class265();
        var2.field4643 = new byte[arg0];
        if (arg1 != 18) {
            field4372 = null;
        }
        var2.field4640 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)V")
    public static void method1676(int arg0) {
        field4370 = null;
        field4373 = null;
        field4364 = null;
        field4365 = null;
        field4372 = null;
        int var1 = 64 / ((-arg0 - 4) / 40);
    }
}
