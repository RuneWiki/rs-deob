import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class58 {

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "I")
    public int field692 = -1;

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "J")
    public static long field693 = 0L;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "J")
    public static long field691 = 0L;

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
    public static int field699 = -1;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "I")
    public int field694;

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
    public int field696;

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "I")
    public int field697;

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "I")
    public int field698;

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!jr", name = "l", descriptor = "I")
    public int field702;

    @OriginalMember(owner = "client!jr", name = "m", descriptor = "I")
    public int field703;

    @OriginalMember(owner = "client!jr", name = "n", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!jr", name = "o", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!jr", name = "p", descriptor = "I")
    public int field706;

    @OriginalMember(owner = "client!jr", name = "q", descriptor = "I")
    public int field707;

    @OriginalMember(owner = "client!jr", name = "r", descriptor = "I")
    public int field708;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "[I")
    public static int[] field695;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V", line = 4)
    public static void method363(int arg0) {
        field695 = null;
        if (arg0 != 75) {
            method363(-88);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Z)I", line = 29)
    public static final int method364(boolean arg0) {
        if (arg0) {
            return -47;
        }
        field704++;
        if ((double) class106.field1212 == 3.0D) {
            return 37;
        } else if ((double) class106.field1212 == 4.0D) {
            return 50;
        } else if ((double) class106.field1212 == 6.0D) {
            return 75;
        } else if ((double) class106.field1212 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V", line = 54)
    public static final void method365(int arg0) {
        if (class444.field6488 != null) {
            class444.field6488.method1859(arg0 ^ 0x7177);
        }
        field705++;
        if (class225.field3064 != null) {
            class225.field3064.method1859(arg0 ^ 0x7177);
        }
        if (arg0 != -26586) {
            method363(-125);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILjava/lang/String;)I", line = 93)
    public static final int method366(int arg0, String arg1) {
        field701++;
        int var2 = 73 % ((arg0 + 57) / 45);
        int var3 = arg1.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = class38.method229((byte) -98, arg1.charAt(var5)) + ((var4 << 5) - var4);
        }
        return var4;
    }
}
