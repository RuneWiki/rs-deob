import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class79 {

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public int field1142;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Lmba;")
    public static class646 field1138 = new class646();

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "[I")
    public static int[] field1141;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lsba;I)V")
    public static final void method578(class558 arg0, int arg1) {
        field1139++;
        if (class25.field320) {
            return;
        }
        arg0.method549(6410);
        class284.field4103--;
        int var2 = -91 % ((-arg1 - 22) / 58);
        if (!arg0.field7751) {
            long var3 = arg0.field7758;
            class272 var5;
            for (var5 = (class272) class560.field7789.method812(113, var3); var5 != null && !var5.field3946.equals(arg0.field7759); var5 = (class272) class560.field7789.method815((byte) 39)) {
            }
            if (var5 != null && var5.method1832(arg0, (byte) -120)) {
                class752.method4178(var5, false);
                return;
            }
            return;
        }
        for (class272 var6 = (class272) class176.field2411.method3828(101); var6 != null; var6 = (class272) class176.field2411.method3829(-29202)) {
            if (var6.field3946.equals(arg0.field7759)) {
                boolean var7 = false;
                for (class558 var8 = (class558) var6.field3951.method3828(115); var8 != null; var8 = (class558) var6.field3951.method3829(-29202)) {
                    if (arg0 == var8) {
                        var7 = true;
                        if (var6.method1832(arg0, (byte) -124)) {
                            class752.method4178(var6, false);
                        }
                        break;
                    }
                }
                if (var7) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1140++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method579(int arg0) {
        field1141 = null;
        field1138 = null;
        if (arg0 != 18562) {
            field1138 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I)V")
    public class79(int arg0) {
        this.field1142 = arg0;
    }
}
