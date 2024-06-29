import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class312 extends class108 {

    @OriginalMember(owner = "client!tt", name = "n", descriptor = "I")
    public volatile int field3991 = -1;

    @OriginalMember(owner = "client!tt", name = "j", descriptor = "Ljava/lang/String;")
    public volatile String field3987;

    @OriginalMember(owner = "client!tt", name = "m", descriptor = "I")
    public static int field3990 = 0;

    @OriginalMember(owner = "client!tt", name = "o", descriptor = "Z")
    public static boolean field3992 = false;

    @OriginalMember(owner = "client!tt", name = "l", descriptor = "F")
    public static float field3989;

    @OriginalMember(owner = "client!tt", name = "k", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)V")
    public static final void method1882(byte arg0) {
        field3988++;
        class596 var1 = (class596) class556.field7781.method3188((byte) -100);
        if (arg0 > -126) {
            method1882((byte) 105);
        }
        while (var1 != null) {
            if (var1.field8594 == -1) {
                var1.field8591 = 0;
                if (var1.field8595 >= 0 && var1.field8590 >= 0 && var1.field8595 < class139.field1760 && class369.field5135 > var1.field8590) {
                    class474.method2694(var1, -14227);
                }
            } else {
                var1.method589(-8880);
            }
            var1 = (class596) class556.field7781.method3182((byte) -82);
        }
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class312(String arg0) {
        this.field3987 = arg0;
    }
}
