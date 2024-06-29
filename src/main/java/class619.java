import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class619 {

    @OriginalMember(owner = "client!df", name = "g", descriptor = "Lgr;")
    public static class530 field8815 = new class530(3, -1);

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field8816 = 0;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "B")
    public byte field8810;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public int field8811;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field8814;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Ljava/lang/String;")
    public String field8809;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Ljava/lang/String;")
    public String field8812;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "Ljava/lang/String;")
    public String field8813;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "Ljava/lang/String;")
    public String field8817;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIII)V", line = 7)
    public static final void method3592(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 > -14) {
            method3592(43, 14, 17, 88);
        }
        field8814++;
        String var4 = "tele " + arg1 + "," + (arg2 >> 6) + "," + (arg0 >> 6) + "," + (arg2 & 0x3F) + "," + (arg0 & 0x3F);
        System.out.println(var4);
        class368.method2316(false, var4, true, 10);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 22)
    public static void method3593(int arg0) {
        field8815 = null;
        int var1 = 127 / ((arg0 + 9) / 60);
    }
}
