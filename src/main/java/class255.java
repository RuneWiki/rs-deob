import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class255 {

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public int field4178 = 0;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public int field4177 = 0;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
    public int field4185 = 2048;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    public int field4186 = 2048;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4174 = "flash1:";

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
    public static int field4184 = 0;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "Lsf;")
    public static class124 field4175 = new class124(64);

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "[I")
    public static int[] field4187 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Loe;II)V", line = 6)
    public final void method1785(class146 arg0, int arg1, int arg2) {
        field4181++;
        while (true) {
            int var4 = arg0.method1005((byte) 122);
            if (var4 == 0) {
                if (arg2 != 0) {
                    method1786(30);
                }
                return;
            }
            this.method1787(arg1, var4, 29, arg0);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V", line = 27)
    public static final void method1786(int arg0) {
        field4182++;
        class277.method1965(5, (byte) -59);
        class316.method2277(-1536, 5);
        class78.method586(-56, 5);
        class53.method462(48000, 5);
        class234.method1628(false, 5);
        class209.method1442(5, 0);
        class149.method1073(5, (byte) 52);
        class127.method905(21150, 5);
        class46.method375(5, true);
        class264.method1853(5, (byte) 69);
        class71.method540(5, false);
        class101.method767(5, (byte) 123);
        class325.method2329(false, 5);
        class23.method200(5, 120);
        class167.method1191(6534, 5);
        class282.method2003(5, (byte) 121);
        class306.method2234(5, 0);
        class9.method100(5, 0);
        class120.method876((byte) -64, 50);
        class240.method1677(5, -1);
        class49.method433(5, -16212);
        if (arg0 > -23) {
            field4175 = (class124) null;
        }
        class7.field228.method896(5, (byte) -83);
        class23.field573.method896(5, (byte) -109);
        class296.field4832.method896(5, (byte) -51);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIILoe;)V", line = 61)
    private final void method1787(int arg0, int arg1, int arg2, class146 arg3) {
        field4173++;
        if (arg1 == 1) {
            this.field4177 = arg3.method1005((byte) 122);
        } else if (arg1 == 2) {
            this.field4185 = arg3.method989(107);
        } else if (arg1 == 3) {
            this.field4186 = arg3.method989(98);
        } else if (arg1 == 4) {
            this.field4178 = arg3.method1050(3);
        }
        int var5 = 123 / ((-arg2 - 58) / 50);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)V", line = 101)
    public static void method1788(boolean arg0) {
        field4174 = null;
        field4187 = null;
        if (arg0) {
            field4175 = null;
        }
    }
}
