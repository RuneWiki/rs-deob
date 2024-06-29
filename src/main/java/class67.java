import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public abstract class class67 {

    @OriginalMember(owner = "client!me", name = "b", descriptor = "Leg;")
    public static class37 field1058 = class174.method1167("Wordpack geladen)3", -46);

    @OriginalMember(owner = "client!me", name = "d", descriptor = "Z")
    public static boolean field1060 = false;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Leg;")
    private static class37 field1064 = class174.method1167(" from your ignore list first)3", -54);

    @OriginalMember(owner = "client!me", name = "i", descriptor = "Leg;")
    public static class37 field1065 = field1064;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "Lpe;")
    public static class237 field1059;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIII)V")
    public abstract void method312(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
    public static void method463(byte arg0) {
        if (arg0 <= 86) {
            field1064 = null;
        }
        field1065 = null;
        field1058 = null;
        field1064 = null;
        field1059 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "()Z")
    public boolean method464() {
        field1067++;
        return false;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIILme;IJ)Z")
    public static final boolean method465(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class67 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class281.method1884(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BI)I")
    public static final int method466(byte arg0, int arg1) {
        field1057++;
        int var2 = 61 / ((arg0 - 33) / 36);
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III)Lme;")
    public class67 method467(int arg0, int arg1, int arg2) {
        field1063++;
        return this;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIIIIJILdk;)V")
    public abstract void method313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class193 arg10);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lme;IIIZ)V")
    public void method468(class67 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1061++;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "()I")
    public abstract int method308();

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZZ)V")
    public static final void method469(boolean arg0, boolean arg1) {
        if (arg1) {
            field1065 = null;
        }
        field1066++;
        for (int var2 = 0; var2 < class46.field729; var2++) {
            long var3 = (long) class98.field1525[var2] << 32 | 0x20000000L;
            class163 var5 = class55.field833[class98.field1525[var2]];
            if (var5 != null && var5.method767(false) && var5.field2691.field4882 == arg0 && var5.field2691.method1849(0)) {
                int var6 = var5.field1793 >> 7;
                int var7 = var5.field1799 >> 7;
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    if (var5.method763(-1) == 1 && (var5.field1799 & 0x7F) == 64 && (var5.field1793 & 0x7F) == 64) {
                        if (class218.field3753[var7][var6] == class8.field137) {
                            continue;
                        }
                        class218.field3753[var7][var6] = class8.field137;
                    }
                    if (!var5.field2691.field4851) {
                        var3 |= Long.MIN_VALUE;
                    }
                    var5.field1822 = class262.method1768(class237.field4140, var5.field1799, var5.field1793, (byte) -94);
                    class278.method1866(class237.field4140, var5.field1799, var5.field1793, var5.field1822, (var5.method763(-1) - 1) * 64 + 60, var5, var5.field1798, var3, var5.field1820);
                }
            }
        }
    }
}
