import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class411 extends class238 {

    @OriginalMember(owner = "client!jea", name = "j", descriptor = "I")
    public static int field5452 = 0;

    @OriginalMember(owner = "client!jea", name = "f", descriptor = "I")
    public int field5448;

    @OriginalMember(owner = "client!jea", name = "g", descriptor = "I")
    public int field5449;

    @OriginalMember(owner = "client!jea", name = "h", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!jea", name = "i", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!jea", name = "k", descriptor = "I")
    public int field5453;

    @OriginalMember(owner = "client!jea", name = "m", descriptor = "I")
    public int field5455;

    @OriginalMember(owner = "client!jea", name = "n", descriptor = "I")
    public int field5456;

    @OriginalMember(owner = "client!jea", name = "o", descriptor = "I")
    public int field5457;

    @OriginalMember(owner = "client!jea", name = "l", descriptor = "Ljava/lang/String;")
    public String field5454;

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(B)V", line = 15)
    public static final void method2227(byte arg0) {
        field5450++;
        if (arg0 != -59) {
            field5451 = -112;
        }
        for (int var1 = 0; var1 < class479.field7037; var1++) {
            class561 var2 = class259.field3301[var1];
            if (var2.field7979 == 3) {
                if (var2.field7969 == null) {
                    var2.field7977 = Integer.MIN_VALUE;
                } else {
                    class424.field5641.method2852(var2.field7969);
                }
            }
        }
    }
}
