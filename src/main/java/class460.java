import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class460 {

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public int field6689 = 128;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public int field6692 = 128;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public int field6687;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public int field6690;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public int field6688;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public int field6695;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "Z")
    public static boolean field6686;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field6691;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field6694;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field6696;

    static {
        new class194(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
        field6686 = false;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILjava/lang/String;)V", line = 12)
    public static final void method2674(int arg0, String arg1) {
        field6694++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class258.method1605(arg1, -70);
        if (var2 == null) {
            return;
        }
        if (arg0 != 29637) {
            method2674(-113, null);
        }
        for (int var3 = 0; var3 < class136.field1754; var3++) {
            String var4 = class137.field1787[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class258.method1605(var4, 111);
            if (var5 != null && var5.equals(var2)) {
                class136.field1754--;
                for (int var6 = var3; var6 < class136.field1754; var6++) {
                    class137.field1787[var6] = class137.field1787[var6 + 1];
                    class235.field3307[var6] = class235.field3307[var6 + 1];
                    class149.field1932[var6] = class149.field1932[var6 + 1];
                    class239.field3346[var6] = class239.field3346[var6 + 1];
                    class246.field3538[var6] = class246.field3538[var6 + 1];
                }
                class145.field1888 = class490.field7491;
                class438.field6404++;
                class386.method2321(true, class5.field71);
                class79.field1108.method947(-61, class100.method604((byte) 127, arg1));
                class79.field1108.method956(true, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILgi;)V", line = 75)
    public final void method2675(int arg0, class460 arg1) {
        this.field6695 = arg1.field6695;
        this.field6690 = arg1.field6690;
        this.field6692 = arg1.field6692;
        int var3 = -46 / ((arg0 + 33) / 63);
        this.field6689 = arg1.field6689;
        this.field6688 = arg1.field6688;
        field6693++;
        this.field6687 = arg1.field6687;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)Lgi;", line = 91)
    public final class460 method2676(boolean arg0) {
        if (arg0) {
            this.method2675(33, null);
        }
        field6696++;
        return new class460(this.field6687, this.field6689, this.field6692, this.field6690, this.field6695, this.field6688);
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(I)V", line = 119)
    public class460(int arg0) {
        this.field6687 = arg0;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(IIIIII)V", line = 126)
    private class460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6692 = arg2;
        this.field6690 = arg3;
        this.field6688 = arg5;
        this.field6689 = arg1;
        this.field6687 = arg0;
        this.field6695 = arg4;
    }
}
