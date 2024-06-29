import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class180 extends class111 {

    @OriginalMember(owner = "client!tg", name = "U", descriptor = "Ljava/lang/Object;")
    private Object field3232;

    @OriginalMember(owner = "client!tg", name = "R", descriptor = "[I")
    public static int[] field3229 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!tg", name = "W", descriptor = "I")
    public static int field3234 = 0;

    @OriginalMember(owner = "client!tg", name = "Z", descriptor = "I")
    public static int field3237 = 0;

    @OriginalMember(owner = "client!tg", name = "Y", descriptor = "[I")
    public static int[] field3236 = new int[1000];

    @OriginalMember(owner = "client!tg", name = "V", descriptor = "[I")
    public static int[] field3233 = new int[2048];

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!tg", name = "S", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!tg", name = "T", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!tg", name = "X", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public final Object method792(byte arg0) {
        field3230++;
        if (arg0 < 102) {
            field3236 = null;
        }
        return this.field3232;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)I")
    public static final int method1282(int arg0, int arg1) {
        field3228++;
        if (arg0 != 255) {
            field3233 = null;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "(I)V")
    public static void method1283(int arg0) {
        field3236 = null;
        field3229 = null;
        field3233 = null;
        if (arg0 >= -93) {
            field3235 = -62;
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class180(Object arg0) {
        this.field3232 = arg0;
    }

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)Z")
    public final boolean method795(int arg0) {
        if (arg0 != 4) {
            this.method792((byte) 24);
        }
        field3227++;
        return false;
    }
}
