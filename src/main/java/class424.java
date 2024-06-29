import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public abstract class class424 {

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "Ljava/util/Random;")
    public static Random field6159 = new Random();

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "Lu;")
    public static class66 field6161 = new class66();

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "I")
    public static int field6157;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "I")
    public static int field6158;

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "I")
    public static int field6163;

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "Lpu;")
    public static class522 field6162;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)Z")
    public final boolean method2539(int arg0) {
        if (arg0 != -23658) {
            field6162 = null;
        }
        field6158++;
        return this.method2092(-128) || this.method2082(false) || this.method2084((byte) -85);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IB)I")
    public static final int method2540(int arg0, byte arg1) {
        field6160++;
        if (arg1 != -65) {
            field6162 = null;
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)Z")
    public abstract boolean method2092(int arg0);

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)Z")
    public abstract boolean method2084(byte arg0);

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)V")
    public abstract void method2080(int arg0);

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "(I)Llp;")
    public abstract class356 method2095(int arg0);

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "(I)I")
    public abstract int method2090(int arg0);

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)Z")
    public abstract boolean method2082(boolean arg0);

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "(I)V")
    public static void method2541(int arg0) {
        if (arg0 >= -94) {
            method2542((byte) -104);
        }
        field6159 = null;
        field6161 = null;
        field6162 = null;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)V")
    public static final void method2542(byte arg0) {
        if (class47.method485(200, class420.field6113) || class204.method1356(class420.field6113, (byte) -110)) {
            class354.method2166(class413.field6011 >> 12, 5000, -41, class131.field1928 >> 12);
        } else {
            int var1 = class648.field9106.field6271[0] >> 3;
            int var2 = class648.field9106.field6262[0] >> 3;
            if (var1 >= 0 && var1 < class199.field2812 >> 3 && var2 >= 0 && (class232.field3611 >> 3) > var2) {
                class354.method2166(var2, 5000, -61, var1);
            } else {
                class354.method2166(class232.field3611 >> 4, 0, -65, class199.field2812 >> 4);
            }
        }
        field6157++;
        class540.method3071(126);
        int var3 = -72 / ((-arg0 - 69) / 48);
        class268.method1750((byte) 77);
        class119.method914(-31356);
        class56.method610(-124);
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(Z)V")
    public abstract void method2085(boolean arg0);

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "(I)I")
    public abstract int method2093(int arg0);

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIII)V")
    public static final void method2543(int arg0, int arg1, int arg2, int arg3) {
        field6163++;
        class191 var4 = class6.method38(9, arg2 ^ 0x2A41, arg0);
        var4.method1285((byte) -1);
        if (arg2 != -10812) {
            method2543(-104, -121, -58, 23);
        }
        var4.field2754 = arg1;
        var4.field2760 = arg3;
    }
}
