import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class119 {

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "Z")
    public boolean field3102 = true;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public int field3103;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public int field3117;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public int field3105;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public int field3113;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public int field3106;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public int field3108;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "Lfc;")
    public static class39 field3100 = class90.method774("bevor Sie den Vorgang wiederholen)3", -84);

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field3110 = 0;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "Lfc;")
    private static class39 field3109 = class90.method774(" is already on your ignore list", -91);

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "Lfc;")
    public static class39 field3111 = field3109;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "Lfc;")
    public static class39 field3112 = class90.method774("<br>", -115);

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field3107 = 0;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "Lfc;")
    public static class39 field3104 = class90.method774("backtop1", -123);

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "Lfc;")
    public static class39 field3114 = class90.method774("backvmid3", -96);

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "Lfc;")
    public static class39 field3115 = class90.method774("Null", -127);

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "Lfc;")
    public static class39 field3116 = class90.method774("mod_icons", -116);

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "Lfc;")
    private static class39 field3118 = class90.method774("Players", -101);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Lfc;")
    public static class39 field3099 = field3118;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "[Lue;")
    public static class141[] field3101;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 4)
    public static void method1024(byte arg0) {
        field3100 = null;
        field3115 = null;
        field3112 = null;
        field3111 = null;
        field3114 = null;
        field3104 = null;
        field3109 = null;
        field3099 = null;
        field3101 = null;
        if (arg0 != -92) {
            method1024((byte) 107);
        }
        field3118 = null;
        field3116 = null;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(IIIIIIZ)V", line = 92)
    public class119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field3103 = arg1;
        this.field3117 = arg5;
        this.field3102 = arg6;
        this.field3105 = arg0;
        this.field3113 = arg4;
        this.field3106 = arg3;
        this.field3108 = arg2;
    }
}
