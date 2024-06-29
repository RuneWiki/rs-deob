import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class222 extends class435 {

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "I")
    public int field2980;

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
    public int field2979;

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "Lho;")
    public static class103 field2984 = new class103(69, 0);

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)Z", line = 7)
    public final boolean method1396(int arg0) {
        field2982++;
        if (arg0 == -1) {
            return (this.field2979 >> 21 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(II)V", line = 19)
    public class222(int arg0, int arg1) {
        this.field2980 = arg1;
        this.field2979 = arg0;
    }

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)I", line = 28)
    public final int method1397(int arg0) {
        field2986++;
        return arg0 == -715238382 ? (this.field2979 & 0x1D06BA) >> 18 : -60;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)Z", line = 40)
    public final boolean method1398(int arg0, int arg1) {
        field2983++;
        if (arg1 != 0) {
            method1402(-70);
        }
        return (this.field2979 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "(I)Z", line = 51)
    public final boolean method1399(int arg0) {
        field2978++;
        int var2 = 11 % ((-arg0 - 21) / 54);
        return (this.field2979 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "(I)Z", line = 64)
    public final boolean method1400(int arg0) {
        if (arg0 >= -40) {
            return true;
        } else {
            field2981++;
            return ((this.field2979 & 0x76C974) >> 22) != 0;
        }
    }

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "(I)I", line = 78)
    public final int method1401(int arg0) {
        if (arg0 > -71) {
            this.method1397(-3);
        }
        field2985++;
        return class402.method2483(this.field2979, (byte) -43);
    }

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "(I)V", line = 92)
    public static void method1402(int arg0) {
        field2984 = null;
        if (arg0 != -1) {
            method1402(112);
        }
    }
}
