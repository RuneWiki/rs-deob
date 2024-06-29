import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class356 {

    @OriginalMember(owner = "client!on", name = "e", descriptor = "Z")
    public static boolean field4859 = false;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "Lvl;")
    public static class15 field4855 = new class15(24, 7);

    @OriginalMember(owner = "client!on", name = "b", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V", line = 6)
    public static final void method2196(int arg0) {
        field4856++;
        if (class95.field1472.method592()) {
            class95.field1472.method516(class558.field7896);
            class33.method198(true);
            if (class618.field8597) {
                class758.method4197(-19937, class558.field7896);
            } else {
                Dimension var1 = class558.field7896.getSize();
                class95.field1472.method574(class558.field7896, var1.width, var1.height);
            }
            class95.field1472.method559(class558.field7896);
        } else {
            class624.method3517(false, 0, class111.field1911.field6725.method3784((byte) 120));
        }
        class622.method3506(113);
        int var2 = -3 % ((arg0 + 62) / 36);
        class180.field2828 = true;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIZLha;II)V", line = 35)
    public static final void method2197(int arg0, int arg1, boolean arg2, class66 arg3, int arg4, int arg5) {
        field4861++;
        class369.field5000 = arg3;
        class282.field3918 = class369.field5000.method565();
        class434.field5905 = class369.field5000.method565();
        class240.field3416 = class369.field5000.method565();
        class537.field7300 = arg5;
        if (!arg2) {
            return;
        }
        class278.field3847 = 0;
        class466.field6317 = arg1;
        class449.field6157 = null;
        class687.field9555 = null;
        class544.method3067(1, arg0, arg4);
        class666.field9267 = -1;
        class335.field4519 = -1;
        class678.field9440 = -1;
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V", line = 63)
    public static void method2198(int arg0) {
        field4855 = null;
        if (arg0 != -1722598584) {
            method2196(92);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BLod;)Ljava/lang/String;", line = 79)
    public static final String method2199(byte arg0, class534 arg1) {
        field4857++;
        if (arg0 != 41) {
            method2198(-29);
        }
        if (arg1.field7227 == null || arg1.field7227.length() == 0) {
            return arg1.field7233 == null || arg1.field7233.length() <= 0 ? arg1.field7226 : arg1.field7226 + class641.field8850.method3566((byte) -63, class464.field6309) + arg1.field7233;
        } else if (arg1.field7233 == null || arg1.field7233.length() <= 0) {
            return arg1.field7226 + class641.field8850.method3566((byte) -97, class464.field6309) + arg1.field7227;
        } else {
            return arg1.field7226 + class641.field8850.method3566((byte) 107, class464.field6309) + arg1.field7233 + class641.field8850.method3566((byte) 99, class464.field6309) + arg1.field7227;
        }
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(I)V", line = 109)
    public static final void method2200(int arg0) {
        field4858++;
        class31.field549 = 0;
        int var1 = (class235.field3379.field7396 >> 9) + class217.field3198;
        if (arg0 >= -92) {
            field4860 = 32;
        }
        int var2 = (class235.field3379.field7398 >> 9) + class400.field5510;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class31.field549 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class31.field549 = 1;
        }
        if (class31.field549 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class31.field549 = 0;
        }
    }
}
