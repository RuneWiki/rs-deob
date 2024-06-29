import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class718 {

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "[Lpd;")
    public static class269[] field9944 = new class269[6];

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Lbu;")
    public static class21 field9946 = new class21(98, 6);

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "F")
    public static float field9952;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "F")
    public static float field9953;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field9947;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field9949;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public int field9950;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public int field9951;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Lda;")
    public static class66 field9945;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "[Lcn;")
    public class540[] field9948;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lso;B)V", line = 3)
    public final void method4024(class494 arg0, byte arg1) {
        field9949++;
        this.field9951 = arg0.method2960((byte) 94);
        this.field9950 = arg0.method2998(true);
        this.field9948 = new class540[arg0.method2964((byte) 45)];
        class345[] var3 = class673.method3825((byte) 121);
        if (arg1 > -102) {
            this.field9948 = null;
        }
        for (int var4 = 0; var4 < this.field9948.length; var4++) {
            this.field9948[var4] = this.method4025(125, var3[arg0.method2964((byte) 80)], arg0);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILsaa;Lso;)Lcn;", line = 35)
    private final class540 method4025(int arg0, class345 arg1, class494 arg2) {
        field9947++;
        if (class422.field5777 == arg1) {
            return class300.method1944(125, arg2);
        } else if (class65.field793 == arg1) {
            return class278.method1814(arg2, 12);
        } else if (class686.field9546 == arg1) {
            return class517.method3118(arg2, 1);
        } else {
            int var4 = 73 % ((87 - arg0) / 33);
            if (class463.field6534 == arg1) {
                return class751.method4184((byte) -83, arg2);
            } else if (class523.field7392 == arg1) {
                return class472.method2808(arg2, (byte) -128);
            } else if (class759.field10480 == arg1) {
                return class746.method4159((byte) 93, arg2);
            } else if (class450.field6161 == arg1) {
                return class68.method576(arg2, 98);
            } else if (class384.field5287 == arg1) {
                return class788.method4314(0, arg2);
            } else if (class668.field9298 == arg1) {
                return class443.method2641((byte) 72, arg2);
            } else if (class95.field1076 == arg1) {
                return class704.method3986(0, arg2);
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 87)
    public static void method4026(int arg0) {
        if (arg0 != 6) {
            method4026(-29);
        }
        field9945 = null;
        field9944 = null;
        field9946 = null;
    }
}
