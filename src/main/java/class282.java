import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class282 extends class221 {

    @OriginalMember(owner = "client!en", name = "l", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!en", name = "m", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!en", name = "n", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!en", name = "j", descriptor = "Len;")
    public class282 field4453;

    @OriginalMember(owner = "client!en", name = "k", descriptor = "Len;")
    public class282 field4454;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(I)V")
    public final void method1898(int arg0) {
        field4456++;
        if (this.field4454 == null) {
            return;
        }
        this.field4454.field4453 = this.field4453;
        if (arg0 != 0) {
            method1900(null, -120);
        }
        this.field4453.field4454 = this.field4454;
        this.field4453 = null;
        this.field4454 = null;
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(I)J")
    public static final long method1899(int arg0) {
        if (arg0 == 0) {
            field4455++;
            return class301.field4732.method169(false);
        } else {
            return -60L;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([SI)[S")
    public static final short[] method1900(short[] arg0, int arg1) {
        field4457++;
        int var2 = 24 % ((5 - arg1) / 37);
        if (arg0 == null) {
            return null;
        } else {
            short[] var3 = new short[arg0.length];
            class324.method2170(arg0, 0, var3, 0, arg0.length);
            return var3;
        }
    }
}
