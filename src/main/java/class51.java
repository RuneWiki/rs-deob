import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class51 extends class137 {

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public int field736 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    public int field741 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
    public int field740 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public int field739 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    public int field744 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
    public int field745 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    public int field742 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "I")
    public int field747 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "Lth;")
    public class119 field735;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field734 = 0;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "[S")
    public static short[] field743 = new short[] { 58, 47, 3, 39, 13, 26, 21, 12 };

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)V")
    public static final void method325(int arg0) {
        field746++;
        if (!class101.field1579) {
            return;
        }
        class248 var1 = class79.method571(class243.field3847, class122.field1940, (byte) -74);
        if (var1 != null && var1.field3962 != null) {
            class78 var2 = new class78();
            var2.field1265 = var1.field3962;
            var2.field1251 = var1;
            class139.method959((byte) 85, var2);
        }
        int var3 = -44 % ((arg0 - 53) / 63);
        class184.field3061 = -1;
        class101.field1579 = false;
        class111.method776(var1, (byte) 25);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)Z")
    public final boolean method326(int arg0, int arg1, int arg2) {
        if (arg1 <= 42) {
            this.field736 = 76;
        }
        field737++;
        if (this.field740 <= arg0 && this.field745 >= arg0 && this.field747 <= arg2 && arg2 <= this.field741) {
            return true;
        } else {
            return this.field739 <= arg0 && this.field736 >= arg0 && arg2 >= this.field742 && arg2 <= this.field744;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V")
    public static void method327(boolean arg0) {
        field743 = null;
        if (arg0) {
            method327(true);
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lth;)V")
    public class51(class119 arg0) {
        this.field735 = arg0;
    }
}
