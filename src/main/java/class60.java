import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class60 {

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "B")
    private byte field959;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public int field960;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public int field954;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public int field951;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public int field956;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public int field957;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field953 = 0;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "[S")
    public static short[] field962 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "[I")
    public static int[] field952 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "Lmd;")
    public static class113 field955;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
    public static final Object method311(byte[] arg0, boolean arg1, int arg2) {
        field961++;
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class167.field3352) {
            try {
                class23 var3 = (class23) Class.forName("qa").getDeclaredConstructor().newInstance();
                var3.method134(128, arg0);
                return var3;
            } catch (Throwable var5) {
                class167.field3352 = true;
            }
        }
        int var4 = 28 % ((arg2 - 16) / 43);
        return arg1 ? class207.method1349(arg0, (byte) 81) : arg0;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)I")
    public final int method312(byte arg0) {
        field958++;
        if (arg0 != 51) {
            this.field954 = -54;
        }
        return (this.field959 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)I")
    public final int method313(int arg0) {
        field963++;
        if (arg0 != 16890) {
            this.field959 = -86;
        }
        return this.field959 & 0x7;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
    public static void method314(int arg0) {
        field962 = null;
        field952 = null;
        field955 = null;
        if (arg0 <= 22) {
            method311(null, true, 104);
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
    public class60() {
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lrd;)V")
    public class60(class158 arg0) {
        this.field959 = arg0.method1066(true);
        this.field960 = arg0.method1071(28101);
        this.field954 = arg0.method1076(24277);
        this.field951 = arg0.method1076(24277);
        this.field956 = arg0.method1076(24277);
        this.field957 = arg0.method1076(24277);
    }
}
