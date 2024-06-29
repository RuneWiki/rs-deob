import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class577 {

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field8150;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field8151;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field8152;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field8153;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BII)Z", line = 9)
    public static final boolean method3293(byte arg0, int arg1, int arg2) {
        field8151++;
        int var3 = 1 / ((arg0 - 52) / 54);
        return (arg1 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V", line = 20)
    public static final void method3294(int arg0) {
        if (arg0 != 24815) {
            return;
        }
        class121.field1664 = 0;
        class299.field4078 = 0;
        class37.field442 = 0;
        class531.field7180 = 0;
        field8152++;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)J", line = 32)
    public static final synchronized long method3295(byte arg0) {
        field8150++;
        if (arg0 != 15) {
            return -41L;
        }
        long var1 = System.currentTimeMillis();
        if (class287.field3950 > var1) {
            class529.field7168 += class287.field3950 - var1;
        }
        class287.field3950 = var1;
        return class529.field7168 + var1;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)Lmca;", line = 53)
    public static final class29 method3296(byte arg0) {
        field8153++;
        try {
            if (arg0 != 94) {
                method3296((byte) -31);
            }
            return new class229();
        } catch (Throwable var2) {
            try {
                return (class29) Class.forName("vm").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class440();
            }
        }
    }
}
