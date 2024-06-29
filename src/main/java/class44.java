import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class44 {

    @OriginalMember(owner = "client!al", name = "c", descriptor = "[I")
    public static int[] field644 = new int[14];

    @OriginalMember(owner = "client!al", name = "d", descriptor = "[J")
    public static long[] field645 = new long[32];

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "Lnm;")
    public static class221 field642;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V", line = 4)
    public static final void method336(byte arg0) {
        class228.method1553(36);
        field647++;
        class40.method323(89);
        class79.method535(102);
        class25.method213((byte) 48);
        class341.method2409(-15193);
        class177.method1247(128);
        class161.method1142((byte) 47);
        class201.method1373((byte) 116);
        class94.method623((byte) -51);
        if (arg0 >= -6) {
            return;
        }
        class17.method113((byte) 21);
        class65.method455((byte) -126);
        class131.method848(-4);
        class198.method1348(true);
        class21.method133(-84);
        class269.method1899(-124);
        class286.method2019(119);
        class157.method1126((byte) -101);
        class314.method2258((byte) 99);
        class12.method88((byte) 84);
        class319.method2302(-8846);
        class278.method1977(1533177089);
        class79.field1170.method651(0);
        class287.field4702.method651(0);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 53)
    public static void method337(int arg0) {
        if (arg0 != 0) {
            method336((byte) 115);
        }
        field644 = null;
        field645 = null;
        field642 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)I", line = 67)
    public static final int method338(int arg0, byte arg1) {
        if (arg1 >= -72) {
            method336((byte) -56);
        }
        field646++;
        class311 var2 = class217.method1468(116, arg0);
        int var3 = var2.field5064;
        int var4 = var2.field5065;
        int var5 = class116.field1690[var4 - var3];
        int var6 = var2.field5059;
        return class170.field2650[var6] >> var3 & var5;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V", line = 88)
    public static final void method339(int arg0, int arg1) {
        field643++;
        class37.field557.method645(arg0, (byte) -64);
        class216.field3325.method645(arg0, (byte) -32);
        if (arg1 != 14) {
            method338(10, (byte) -79);
        }
        class16.field206.method645(arg0, (byte) -121);
    }
}
