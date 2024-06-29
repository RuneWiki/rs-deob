import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class467 {

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "[I")
    public static int[] field6558 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
    public static int field6560 = 0;

    @OriginalMember(owner = "client!lv", name = "v", descriptor = "Z")
    public static boolean field6578 = false;

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "B")
    public byte field6562;

    @OriginalMember(owner = "client!lv", name = "i", descriptor = "B")
    public byte field6565;

    @OriginalMember(owner = "client!lv", name = "k", descriptor = "B")
    public byte field6567;

    @OriginalMember(owner = "client!lv", name = "m", descriptor = "B")
    public byte field6569;

    @OriginalMember(owner = "client!lv", name = "u", descriptor = "B")
    public byte field6577;

    @OriginalMember(owner = "client!lv", name = "w", descriptor = "B")
    public byte field6579;

    @OriginalMember(owner = "client!lv", name = "z", descriptor = "B")
    public byte field6582;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "I")
    public int field6557;

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "I")
    public int field6561;

    @OriginalMember(owner = "client!lv", name = "h", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!lv", name = "q", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!lv", name = "t", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!lv", name = "y", descriptor = "I")
    public int field6581;

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "Lbu;")
    public static class21 field6559;

    @OriginalMember(owner = "client!lv", name = "o", descriptor = "S")
    public short field6571;

    @OriginalMember(owner = "client!lv", name = "g", descriptor = "Z")
    public boolean field6563;

    @OriginalMember(owner = "client!lv", name = "j", descriptor = "Z")
    public boolean field6566;

    @OriginalMember(owner = "client!lv", name = "l", descriptor = "Z")
    public boolean field6568;

    @OriginalMember(owner = "client!lv", name = "n", descriptor = "Z")
    public boolean field6570;

    @OriginalMember(owner = "client!lv", name = "p", descriptor = "Z")
    public boolean field6572;

    @OriginalMember(owner = "client!lv", name = "r", descriptor = "Z")
    public boolean field6574;

    @OriginalMember(owner = "client!lv", name = "s", descriptor = "Z")
    public boolean field6575;

    @OriginalMember(owner = "client!lv", name = "x", descriptor = "Z")
    public boolean field6580;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V", line = 11)
    public static final void method2789(int arg0) {
        if (class37.field491.method441()) {
            class37.field491.method493(class629.field8819);
            class190.method1327(-22101);
            if (class195.field2997) {
                class274.method1761(1, class629.field8819);
            } else {
                Dimension var1 = class629.field8819.getSize();
                class37.field491.method507(class629.field8819, var1.width, var1.height);
            }
            class37.field491.method537(class629.field8819);
        } else {
            class9.method61(class21.field353.field10098.method1588(-115), false, (byte) -40);
        }
        field6573++;
        class351.method2224((byte) 119);
        if (arg0 < 116) {
            field6559 = null;
        }
        class98.field1115 = true;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)Lru;", line = 45)
    public static final class204 method2790(byte arg0) {
        field6576++;
        if (class525.field7521 < class386.field5355.length) {
            return class386.field5355[class525.field7521++];
        } else {
            if (arg0 < 112) {
                method2790((byte) -100);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(ZZB)V", line = 64)
    public static final void method2791(boolean arg0, boolean arg1, byte arg2) {
        if (arg0) {
            class369.field5125--;
            if (class369.field5125 == 0) {
                class779.field10694 = null;
            }
        }
        if (arg2 > -65) {
            return;
        }
        if (arg1) {
            class452.field6354--;
            if (class452.field6354 == 0) {
                class2.field14 = null;
            }
        }
        field6564++;
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(I)V", line = 96)
    public static void method2792(int arg0) {
        field6559 = null;
        int var1 = -107 % ((arg0 - 31) / 39);
        field6558 = null;
    }
}
