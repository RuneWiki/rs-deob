import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public abstract class class131 {

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "[Lw;")
    public static class236[] field1966 = new class236[16];

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field1969 = 0;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public int field1967;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public int field1972;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public int field1973;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static final void method979(int arg0) {
        field1971++;
        if (class354.field4763 || arg0 != -128) {
            return;
        }
        class68.field964 = true;
        class354.field4763 = true;
        if (class229.field3214) {
            class332.field4483 = (float) ((int) class332.field4483 - 65 & 0xFFFFFF80);
        } else {
            class359.field4972 += (-class359.field4972 - 24.0F) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)Z")
    public final boolean method980(byte arg0) {
        int var2 = 109 / ((arg0 - 8) / 48);
        field1964++;
        return (this.field1972 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIII)I")
    public static final int method981(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1974++;
        if (arg4 != -13631) {
            method981(-12, -109, -119, 21, -26);
        }
        int var5 = arg2 & 0xF;
        int var6 = var5 < 8 ? arg3 : arg1;
        int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg3 : arg0) : arg1;
        return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
    public static void method982(byte arg0) {
        field1966 = null;
        int var1 = 110 % ((11 - arg0) / 36);
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)Z")
    public final boolean method983(int arg0) {
        field1968++;
        if (arg0 == 1) {
            return (this.field1972 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)Z")
    public final boolean method984(byte arg0) {
        if (arg0 != -26) {
            this.field1973 = 82;
        }
        field1970++;
        return (this.field1972 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)Z")
    public final boolean method985(boolean arg0) {
        field1965++;
        if (arg0) {
            this.method980((byte) -84);
        }
        return (this.field1972 & 0x8) != 0;
    }
}
