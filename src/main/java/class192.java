import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class192 {

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public int field2761 = -1;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field2772 = new String[100];

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
    public static int field2770 = 0;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public int field2755;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public int field2756;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public int field2757;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public int field2758;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public int field2759;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public int field2763;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
    public int field2765;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public int field2768;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public int field2769;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "Lbi;")
    public static class139 field2764;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "Lbd;")
    public static class304 field2754;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "[[B")
    public static byte[][] field2760;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static void method1380(int arg0) {
        field2754 = null;
        field2764 = null;
        field2760 = null;
        if (arg0 <= 11) {
            method1381(32, 83, 121);
        }
        field2772 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)V")
    public static final void method1381(int arg0, int arg1, int arg2) {
        field2762++;
        class167 var3 = class428.method2666(arg0, -32769);
        int var4 = var3.field2482;
        int var5 = var3.field2483;
        int var6 = var3.field2478;
        int var7 = 119 / ((-arg2 - 45) / 42);
        int var8 = class221.field3054[var6 - var5];
        if (arg1 < 0 || arg1 > var8) {
            arg1 = 0;
        }
        int var9 = var8 << var5;
        class163.method1217(var9 & arg1 << var5 | class125.field1744[var4] & ~var9, 0, var4);
    }
}
