import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class271 {

    @OriginalMember(owner = "client!em", name = "r", descriptor = "J")
    public long field4191 = 0L;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "[I")
    public static int[] field4189 = new int[2];

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public static int field4186 = 0;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public int field4174;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public int field4175;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public int field4176;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public int field4178;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public int field4179;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public int field4180;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public int field4181;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public int field4183;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public int field4185;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "I")
    public int field4187;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "I")
    public int field4188;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "Lsc;")
    public class19 field4182;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "[I")
    public static int[] field4177;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BII)V", line = 5)
    public static final void method1822(byte arg0, int arg1, int arg2) {
        class2 var3 = class212.method1433(arg1, 12, -13802);
        var3.method13((byte) -1);
        field4184++;
        var3.field39 = arg2;
        if (arg0 < 79) {
            field4177 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V", line = 40)
    public static void method1823(byte arg0) {
        field4189 = null;
        if (arg0 != 21) {
            field4177 = (int[]) null;
        }
        field4177 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ILte;)V", line = 64)
    public static final void method1824(int arg0, class124 arg1) {
        class110 var2 = null;
        field4190++;
        try {
            class107 var3 = arg1.method815("runescape", 60);
            if (arg0 <= 90) {
                method1823((byte) 81);
            }
            while (var3.field1852 == 0) {
                class127.method843(-126, 1L);
            }
            if (var3.field1852 == 1) {
                var2 = (class110) var3.field1853;
                class202 var4 = class196.method1256(111);
                var2.method714(var4.field3273, var4.field3249, 0, false);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method711(0);
            }
        } catch (Exception var7) {
        }
    }
}
