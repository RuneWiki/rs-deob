import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class207 extends class417 {

    @OriginalMember(owner = "client!cca", name = "j", descriptor = "S")
    public short field3076;

    @OriginalMember(owner = "client!cca", name = "i", descriptor = "I")
    public static int field3075 = 1338;

    @OriginalMember(owner = "client!cca", name = "k", descriptor = "[Lsa;")
    public static class176[] field3077;

    @OriginalMember(owner = "client!cca", name = "<init>", descriptor = "()V", line = 6)
    public class207() {
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(B)V", line = 16)
    public static void method1370(byte arg0) {
        if (arg0 != -106) {
            field3077 = null;
        }
        field3077 = null;
    }

    @OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(S)V", line = 25)
    public class207(short arg0) {
        this.field3076 = arg0;
    }
}
