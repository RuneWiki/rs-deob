import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public abstract class class73 {

    @OriginalMember(owner = "client!v", name = "c", descriptor = "[F")
    public static float[] field1124 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!v", name = "a", descriptor = "Lna;")
    public static class26 field1122 = class69.method505(")4a=", (byte) -117);

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Lna;")
    public static class26 field1125 = class69.method505("::clientdrop", (byte) -124);

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Lbe;")
    public static class297 field1123;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "Lal;")
    public static class321 field1127;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 5)
    public static void method520(int arg0) {
        field1127 = null;
        field1122 = null;
        field1124 = null;
        field1125 = null;
        field1123 = null;
        if (arg0 != 1) {
            method523(-83, 44, -77, 121L);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIJ)Z", line = 34)
    public static final boolean method523(int arg0, int arg1, int arg2, long arg3) {
        class55 var5 = class36.field585[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field890 != null && var5.field890.field4408 == arg3) {
            return true;
        } else if (var5.field889 != null && var5.field889.field2549 == arg3) {
            return true;
        } else if (var5.field886 != null && var5.field886.field2105 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field879; var6++) {
                if (var5.field877[var6].field656 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZIILve;ZII)V", line = 72)
    public static final void method526(boolean arg0, int arg1, int arg2, class266 arg3, boolean arg4, int arg5, int arg6) {
        class225.field3570 = arg3;
        field1126++;
        class108.field1701 = arg2;
        class261.field4269 = arg1;
        class224.field3536 = arg4;
        class306.field5280 = 1;
        class300.field5172 = arg6;
        if (!arg0) {
            method523(-8, 46, 45, -6L);
        }
        class264.field4314 = arg5;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)Lii;")
    public abstract class212 method521(int arg0);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V")
    public abstract void method522(int arg0, int arg1);

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)I")
    public abstract int method524(int arg0, int arg1);

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(II)[B")
    public abstract byte[] method525(int arg0, int arg1);
}
