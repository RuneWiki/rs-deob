import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class348 extends class270 {

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
    public int field5462 = 0;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "Lvv;")
    public static class313 field5460 = new class313(76, 10);

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "Z")
    public static boolean field5467 = false;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lia;B)V")
    public static final void method2244(class23 arg0, byte arg1) {
        if (arg1 != -69) {
            return;
        }
        field5463++;
        byte[] var2 = new byte[24];
        if (class188.field2937 != null) {
            try {
                class188.field2937.method1170(0L, (byte) -122);
                class188.field2937.method1161(arg1 ^ 0xFFFFFFBB, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method136(var2, 866900624, 0, 24);
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(B)Z")
    public static final boolean method2245(byte arg0) {
        int var1 = 58 % ((-arg0 - 35) / 43);
        field5466++;
        try {
            if (class432.field6464 == 2) {
                if (class147.field2399 == null) {
                    class147.field2399 = class409.method2532(class505.field7357, class264.field4416, class104.field1743);
                    if (class147.field2399 == null) {
                        return false;
                    }
                }
                if (class291.field4732 == null) {
                    class291.field4732 = new class146(class323.field5064, class299.field4805);
                }
                if (class509.field7398.method2376(class291.field4732, class199.field3169, class147.field2399, 22050, -1)) {
                    class509.field7398.method2353(20559);
                    class509.field7398.method2360(32001, class375.field5837);
                    class509.field7398.method2357(class321.field5055, 126, class147.field2399);
                    class147.field2399 = null;
                    class432.field6464 = 0;
                    class505.field7357 = null;
                    class291.field4732 = null;
                    return true;
                }
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            class509.field7398.method2350((byte) -128);
            class432.field6464 = 0;
            class505.field7357 = null;
            class147.field2399 = null;
            class291.field4732 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)[Lui;")
    public static final class378[] method2246(int arg0) {
        field5464++;
        if (arg0 != 0) {
            field5467 = false;
        }
        return new class378[] { class180.field2857, class519.field7666, class364.field5672, class363.field5657, class327.field5150, class516.field7636 };
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Lia;B)V")
    public final void method2247(class23 arg0, byte arg1) {
        if (arg1 != -17) {
            method2246(-123);
        }
        while (true) {
            int var3 = arg0.method126((byte) -102);
            if (var3 == 0) {
                field5465++;
                return;
            }
            this.method2249(-86, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V")
    public static void method2248(int arg0) {
        if (arg0 != -25) {
            method2245((byte) -111);
        }
        field5460 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILia;I)V")
    private final void method2249(int arg0, class23 arg1, int arg2) {
        if (arg0 >= -22) {
            method2245((byte) -62);
        }
        if (arg2 == 2) {
            this.field5462 = arg1.method132(70);
        }
        field5461++;
    }
}
