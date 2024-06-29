import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class182 extends class98 {

    @OriginalMember(owner = "client!pk", name = "Q", descriptor = "Lrea;")
    public class192 field3062;

    @OriginalMember(owner = "client!pk", name = "M", descriptor = "Lmh;")
    public class585 field3058;

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "I")
    public static int field3059 = class622.method3610((byte) -128, 1600);

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "Lac;")
    public static class501 field3060 = new class501("LIVE", 0);

    @OriginalMember(owner = "client!pk", name = "S", descriptor = "[Ljava/lang/String;")
    public static String[] field3064 = new String[100];

    @OriginalMember(owner = "client!pk", name = "E", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!pk", name = "G", descriptor = "I")
    public int field3052;

    @OriginalMember(owner = "client!pk", name = "H", descriptor = "I")
    public int field3053;

    @OriginalMember(owner = "client!pk", name = "I", descriptor = "I")
    public int field3054;

    @OriginalMember(owner = "client!pk", name = "J", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!pk", name = "K", descriptor = "I")
    public int field3056;

    @OriginalMember(owner = "client!pk", name = "L", descriptor = "I")
    public int field3057;

    @OriginalMember(owner = "client!pk", name = "P", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!pk", name = "R", descriptor = "Lps;")
    public static class82 field3063;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1482(int arg0, int arg1, byte arg2) {
        field3051++;
        if (arg2 != -4) {
            field3063 = null;
        }
        return (arg0 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
    public static void method1483(int arg0) {
        field3063 = null;
        field3064 = null;
        field3060 = null;
        int var1 = 65 / ((77 - arg0) / 39);
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)V")
    public final void method1484(int arg0) {
        this.field3056 = this.field3062.field3178;
        field3055++;
        this.field3054 = this.field3062.field3169;
        this.field3053 = this.field3062.field3170;
        if (this.field3062.field3175 != null) {
            this.field3062.field3175.method514(this.field3058.field8334, this.field3058.field8340, this.field3058.field8326, class432.field6573);
        }
        if (arg0 >= -50) {
            this.method1484(-96);
        }
        this.field3057 = class432.field6573[2];
        this.field3052 = class432.field6573[0];
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lrea;Liu;)V")
    public class182(class192 arg0, class536 arg1) {
        this.field3062 = arg0;
        this.field3058 = this.field3062.method1530((byte) 117);
        this.method1484(-82);
    }
}
