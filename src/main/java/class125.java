import java.awt.Container;
import java.awt.Insets;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class125 extends class253 {

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "Ljd;")
    public static class85 field2205 = class221.method1499("Clientscript error in: ", (byte) 110);

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2207 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2208 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!qi", name = "A", descriptor = "S")
    public static short field2210 = 1;

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "Lwe;")
    public static class15 field2209 = new class15();

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
    public int field2202;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "I")
    public int field2203;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "I")
    public int field2206;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(I)V")
    public static void method853(int arg0) {
        field2209 = null;
        field2207 = null;
        field2208 = null;
        field2205 = null;
        if (arg0 != 19446) {
            method854(-72, 116);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)V")
    public static final void method854(int arg0, int arg1) {
        field2204++;
        Container var2;
        if (class207.field3620 != null) {
            var2 = class207.field3620;
        } else if (class167.field2882 == null) {
            var2 = class107.field1882.field1478;
        } else {
            var2 = class167.field2882;
        }
        class20.field292 = var2.getSize().width;
        class95.field1744 = var2.getSize().height;
        if (class167.field2882 == var2) {
            Insets var3 = class167.field2882.getInsets();
            class95.field1744 -= var3.top + var3.bottom;
            class20.field292 -= var3.right + var3.left;
        }
        class90.field1668 = (class20.field292 + arg1) / 2;
        class106.field1879 = class251.field4316;
        class154.field2662 = 503;
        class154.field2664 = 765;
        class254.field4389.setSize(class154.field2664, class154.field2662);
        if (class167.field2882 == var2) {
            Insets var4 = class167.field2882.getInsets();
            class254.field4389.setLocation(class90.field1668 + var4.left, class106.field1879 + var4.top);
        } else {
            class254.field4389.setLocation(class90.field1668, class106.field1879);
        }
        if (class129.field2267 != -1) {
            class231.method1548(true, (byte) 127);
        }
        class97.method688((byte) 126);
        if (class81.field1472.startsWith("mac")) {
            class152.field2599 = (long) arg0 + class28.method200(-14);
        }
        class137.field2382 = (long) arg0 + class28.method200(arg1 + 743);
        if (arg0 == 0 && class198.field3390 != null && class1.field4 == 30 || class1.field4 == 25) {
            class122.method835(arg1 + 765);
        }
    }
}
