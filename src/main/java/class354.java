import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class354 extends class45 {

    @OriginalMember(owner = "client!kr", name = "w", descriptor = "I")
    public int field4729;

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "Ljava/lang/String;")
    public String field4716;

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "I")
    public int field4718;

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
    public int field4722;

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "J")
    public long field4723;

    @OriginalMember(owner = "client!kr", name = "t", descriptor = "Z")
    public boolean field4726;

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "Z")
    public boolean field4721;

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "I")
    public int field4719;

    @OriginalMember(owner = "client!kr", name = "r", descriptor = "Ljava/lang/String;")
    public String field4724;

    @OriginalMember(owner = "client!kr", name = "s", descriptor = "I")
    public int field4725;

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "Ltt;")
    public static class338 field4717 = new class338(10, 15);

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "Ltt;")
    public static class338 field4720 = new class338(41, -1);

    @OriginalMember(owner = "client!kr", name = "u", descriptor = "F")
    public static float field4727;

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!kr", name = "v", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V")
    public static void method2089(byte arg0) {
        field4720 = null;
        if (arg0 > 54) {
            field4717 = null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class354(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field4729 = arg3;
        this.field4716 = arg0;
        this.field4718 = arg2;
        this.field4722 = arg6;
        this.field4723 = arg5;
        this.field4726 = arg9;
        this.field4721 = arg8;
        this.field4719 = arg4;
        this.field4724 = arg1;
        this.field4725 = arg7;
    }
}
