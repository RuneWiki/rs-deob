import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class353 {

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "[F")
    public static float[] field5617 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "[I")
    public static int[] field5624 = new int[1000];

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "Z")
    public static boolean field5629 = true;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field5616 = new String[200];

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "Ljava/lang/String;")
    public static String field5635 = " is already on your ignore list.";

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public int field5621;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public int field5623;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public int field5626;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public int field5632;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "J")
    public long field5634;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "Lnk;")
    public static class16 field5630;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "Lio;")
    public class294 field5618;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "Lio;")
    public class294 field5619;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "Lio;")
    public class294 field5622;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V", line = 4)
    public static final void method2441(int arg0, int arg1) {
        field5631++;
        class279 var2 = class147.method1085(arg1, arg0 ^ 0xFFFFB408, arg0);
        var2.method1996(true);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 20)
    public static final void method2442(String arg0, int arg1) {
        field5633++;
        System.out.println("Error: " + class68.method426("%0a", -3809, "\n", arg0));
        if (arg1 != 1) {
            method2445(14);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIB)I", line = 38)
    public static final int method2443(int arg0, int arg1, byte arg2) {
        int var3 = 0;
        int var4 = 82 / ((-arg2 - 42) / 52);
        field5620++;
        while (arg0 > 0) {
            arg0--;
            var3 = var3 << 1 | arg1 & 0x1;
            arg1 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)Lfe;", line = 75)
    public static final class270 method2444(int arg0) {
        class270 var1 = new class270(class122.field1683, class253.field4004, class110.field1518[0], class33.field392[0], class245.field3855[0], class259.field4093[0], class14.field145[0], class251.field3978);
        class99.method627(arg0 + 3736);
        field5625++;
        return arg0 == -1 ? var1 : (class270) null;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V", line = 95)
    public static void method2445(int arg0) {
        field5635 = null;
        field5616 = null;
        int var1 = 24 % ((arg0 + 74) / 35);
        field5624 = null;
        field5617 = null;
        field5630 = null;
    }
}
