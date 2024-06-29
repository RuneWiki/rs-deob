import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class622 {

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "Lep;")
    private class371 field8848;

    @OriginalMember(owner = "client!waa", name = "f", descriptor = "J")
    public long field8850;

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "I")
    public static int field8846 = 0;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "I")
    public static int field8845;

    @OriginalMember(owner = "client!waa", name = "e", descriptor = "I")
    public static int field8849;

    @OriginalMember(owner = "client!waa", name = "g", descriptor = "I")
    public static int field8851;

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "Ljava/applet/Applet;")
    public static Applet field8847;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V", line = 3)
    public static void method3640(int arg0) {
        field8847 = null;
        if (arg0 != 18997) {
            method3640(-11);
        }
    }

    @OriginalMember(owner = "client!waa", name = "finalize", descriptor = "()V", line = 15)
    protected final void finalize() throws Throwable {
        this.field8848.method2120(6408, this.field8850);
        field8845++;
        super.finalize();
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Z)V", line = 26)
    public static final void method3641(boolean arg0) {
        if (class14.field199 != null) {
            class381[] var1 = class14.field199;
            for (int var2 = 0; var2 < var1.length; var2++) {
                class381 var3 = var1[var2];
                var3.method256((byte) -105);
            }
        }
        field8849++;
        if (!arg0) {
            method3641(false);
        }
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lep;J[Lee;)V", line = 56)
    public class622(class371 arg0, long arg1, class510[] arg2) {
        this.field8848 = arg0;
        this.field8850 = arg1;
    }
}
