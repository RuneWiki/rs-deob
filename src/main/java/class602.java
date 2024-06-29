import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public abstract class class602 {

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public int field8084;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public int field8083;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public int field8082;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field8080;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field8081;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IBI)V")
    public abstract void method803(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)V")
    public abstract void method807(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)V")
    public static final void method3309(boolean arg0, int arg1) {
        field8081++;
        if (arg1 == 3) {
            client.method1695(class309.field3890, class305.field3866, -28691, class491.field6129, arg0);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZII)V")
    public abstract void method805(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(III)I")
    public static final int method3310(int arg0, int arg1, int arg2) {
        field8080++;
        if (arg1 == 4 || arg1 == 5) {
            return class315.field3951[arg0 & 0x3];
        } else {
            if (arg2 >= -61) {
                method3309(false, -24);
            }
            return 256;
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(III)V")
    public class602(int arg0, int arg1, int arg2) {
        this.field8084 = arg1;
        this.field8083 = arg0;
        this.field8082 = arg2;
    }
}
