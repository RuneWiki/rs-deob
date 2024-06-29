import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class326 {

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "[Lli;")
    public static class233[] field4988 = new class233[6];

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public static int field4996 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static int field4994 = 0;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "[I")
    public static int[] field4991 = new int[128];

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "Llc;")
    public static class175 field4989;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "Lcc;")
    public static class263 field4995;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V", line = 7)
    public static void method2257(int arg0) {
        if (arg0 != -1) {
            method2257(53);
        }
        field4995 = null;
        field4988 = null;
        field4989 = null;
        field4991 = null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)V", line = 26)
    public static final void method2258(int arg0, int arg1, int arg2) {
        class161 var3 = class37.method221((byte) -123, arg1);
        int var4 = var3.field2223;
        int var5 = var3.field2211;
        if (arg0 != 24569) {
            return;
        }
        field4990++;
        int var6 = var3.field2218;
        int var7 = class42.field492[var6 - var5];
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class206.method1399(var4, arg2 << var5 & var8 | class226.field3235[var4] & ~var8, -100);
    }
}
