import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class350 {

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "S")
    public static short field5156 = 256;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field5165 = -1;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public int field5151;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public int field5153;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public int field5155;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public int field5159;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public int field5161;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public int field5162;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public int field5163;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "[B")
    public byte[] field5152;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "[B")
    public byte[] field5157;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2130(int arg0, int arg1, byte arg2) {
        if (arg2 != 81) {
            method2131((byte) -83);
        }
        field5160++;
        return class284.method1732(arg1, arg2 ^ 0x51, arg0) || class248.method1498(arg1, arg0, (byte) -44);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
    public static final void method2131(byte arg0) {
        field5158++;
        class333 var1 = null;
        if (arg0 >= -124) {
            return;
        }
        try {
            class180 var2 = class7.field86.method1568((byte) 72, "2");
            while (var2.field2802 == 0) {
                class414.method2437(1L, (byte) -122);
            }
            if (var2.field2802 == 1) {
                var1 = (class333) var2.field2803;
                class40 var3 = new class40(class444.field6857 * 6 + 3);
                var3.method221(-1, 1);
                var3.method246((byte) -123, class444.field6857);
                for (int var4 = 0; var4 < class482.field7367.length; var4++) {
                    if (class418.field6024[var4]) {
                        var3.method246((byte) -53, var4);
                        var3.method253(-113, class482.field7367[var4]);
                    }
                }
                var1.method2067(var3.field585, 25525, var3.field536, 0);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method2066(0);
            }
        } catch (Exception var5) {
        }
        class238.field3592 = class344.method2111((byte) -17);
        class96.field1742 = false;
    }
}
