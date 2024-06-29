import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class439 {

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static volatile int field6381 = 0;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field6383 = 0;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "[Lkf;")
    public static class293[] field6384 = new class293[14];

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field6387 = 0;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "[I")
    public static int[] field6385 = new int[13];

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "J")
    public static long field6382 = 0L;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "Lfg;")
    public static class18 field6386 = new class18(32);

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "Ldp;")
    public static class174 field6388;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IC)Z", line = 3)
    public static final boolean method2742(int arg0, char arg1) {
        field6390++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        }
        if (arg0 != 1) {
            field6382 = 102L;
        }
        if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BI)I", line = 32)
    public static final int method2743(byte arg0, int arg1) {
        field6389++;
        return arg0 > -7 ? 12 : arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)I", line = 47)
    public static int method2744(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V", line = 61)
    public static void method2745(int arg0) {
        field6384 = null;
        field6388 = null;
        int var1 = 56 % ((arg0 + 44) / 48);
        field6385 = null;
        field6386 = null;
    }
}
