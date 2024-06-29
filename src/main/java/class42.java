import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class42 extends class61 {

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public int field701;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public int field702;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field703 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "[I")
    public static int[] field707 = new int[2];

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
    public static int field708 = 0;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "Llc;")
    public static class143 field706 = class66.method374("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", -1);

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    public static int field709 = 0;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "[I")
    public static int[] field704;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "[[[Lch;")
    public static class120[][][] field710;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V")
    public static final void method260(int arg0) {
        int var1 = class267.field4793 + class229.field4195.field4178;
        if (arg0 != -500) {
            return;
        }
        field700++;
        int var2 = class266.field4783 + class229.field4195.field4108;
        if ((class127.field2245 - var1) < -500 || class127.field2245 - var1 > 500 || class62.field1167 - var2 < -500 || class62.field1167 - var2 > 500) {
            class62.field1167 = var2;
            class127.field2245 = var1;
        }
        if (class127.field2245 != var1) {
            class127.field2245 += (var1 - class127.field2245) / 16;
        }
        if (class62.field1167 != var2) {
            class62.field1167 += (var2 - class62.field1167) / 16;
        }
        if (class51.field1019) {
            for (int var3 = 0; var3 < class88.field1596; var3++) {
                int var4 = class190.field3484[var3];
                if (var4 == 98) {
                    class75.field1402 = class75.field1402 + 47 & 0xFFFFFFF0;
                } else if (var4 == 99) {
                    class75.field1402 = class75.field1402 - 17 & 0xFFFFFFF0;
                } else if (var4 == 96) {
                    class184.field3339 = class184.field3339 - 65 & 0xFFFFFF80;
                } else if (var4 == 97) {
                    class184.field3339 = class184.field3339 + 191 & 0xFFFFFF80;
                }
            }
        } else {
            if (class128.field2264[98]) {
                class245.field4409 += (12 - class245.field4409) / 2;
            } else if (class128.field2264[99]) {
                class245.field4409 += (-class245.field4409 - 12) / 2;
            } else {
                class245.field4409 /= 2;
            }
            class75.field1402 += class245.field4409 / 2;
            if (class128.field2264[96]) {
                class152.field2761 += (-class152.field2761 - 24) / 2;
            } else if (class128.field2264[97]) {
                class152.field2761 += (24 - class152.field2761) / 2;
            } else {
                class152.field2761 /= 2;
            }
            class184.field3339 += class152.field2761 / 2;
        }
        class254.method1677(6620);
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(II)V")
    public class42(int arg0, int arg1) {
        this.field701 = arg0;
        this.field702 = arg1;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public static void method261(byte arg0) {
        field704 = null;
        field710 = null;
        field703 = null;
        if (arg0 >= -55) {
            field708 = -11;
        }
        field706 = null;
        field707 = null;
    }
}
