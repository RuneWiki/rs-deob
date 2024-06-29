import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class280 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "B")
    public byte field4599;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "B")
    public byte field4601;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "B")
    public byte field4603;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "B")
    public byte field4606;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "S")
    public short field4608;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Z")
    public boolean field4602;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Z")
    public boolean field4604;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "Z")
    public boolean field4605;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "Z")
    public boolean field4607;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "Z")
    public boolean field4610;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "[I")
    public static int[] field4600;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 4)
    public static void method2067(int arg0) {
        field4600 = null;
        int var1 = -2 / ((arg0 - 56) / 40);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V", line = 24)
    public static final void method2068(int arg0, int arg1) {
        field4609++;
        class198.field3162 = -1;
        class350.field5551 = arg1;
        class2.field7 = arg0;
        class41.method268((byte) 127);
    }
}
