import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class152 {

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "J")
    public long field2479 = 0L;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "Lph;")
    public static class229 field2459 = class266.method1858("Clientscript error )2 check log for details", 0);

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "[Lph;")
    public static class229[] field2466 = new class229[100];

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    public static int field2474 = 0;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "Lph;")
    public static class229 field2477 = class266.method1858("details", 0);

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public int field2462;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public int field2463;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public int field2464;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public int field2468;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public int field2469;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    public int field2470;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
    public int field2471;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public int field2473;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public int field2475;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
    public int field2476;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
    public int field2478;

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "Lrk;")
    public class216 field2461;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "Lii;")
    public static class247 field2460;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIZ)V", line = 4)
    public static final void method1103(int arg0, int arg1, int arg2, boolean arg3) {
        field2472++;
        class281 var4 = class135.method957(0, arg1, 4);
        var4.method1932(0);
        var4.field4657 = arg0;
        var4.field4660 = arg2;
        if (arg3) {
            field2460 = (class247) null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)Z", line = 49)
    public static final boolean method1104(int arg0, int arg1) {
        if (arg1 != 4) {
            field2465 = -95;
        }
        class280.field4635 = true;
        class332.field5660 = arg0 + 1 & 0xFFFF;
        field2467++;
        return true;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V", line = 92)
    public static void method1105(byte arg0) {
        field2460 = null;
        field2477 = null;
        if (arg0 < 7) {
            field2477 = (class229) null;
        }
        field2466 = null;
        field2459 = null;
    }
}
