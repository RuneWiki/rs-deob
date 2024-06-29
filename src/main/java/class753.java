import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public abstract class class753 {

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public static int field10440 = 0;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public static int field10437;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
    public static int field10438;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public int field10439;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
    public static int field10441;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
    public static int field10443;

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "I")
    public static int field10444;

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "Ljava/lang/String;")
    public String field10442;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZ)V")
    public static final void method4206(int arg0, boolean arg1) {
        field10444++;
        if (!arg1) {
            class714 var2 = class350.method2072((long) arg0, 2, (byte) 120);
            var2.method4044((byte) -128);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)J")
    public static final long method4207(int arg0, int arg1) {
        if (arg1 != 9144) {
            field10443 = -53;
        }
        field10441++;
        return (long) (arg0 + 11745) * 86400000L;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Les;I)Laea;")
    public static final class56 method4208(class403 arg0, int arg1) {
        arg0.method2396((byte) 95);
        field10437++;
        int var2 = arg0.method2396((byte) -90);
        class56 var3 = class335.method1988(var2, (byte) -121);
        var3.field747 = arg0.method2396((byte) 40);
        int var4 = arg0.method2396((byte) -81);
        if (arg1 > -34) {
            return null;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method2396((byte) -107);
            var3.method144((byte) -101, var6, arg0);
        }
        var3.method493((byte) 105);
        return var3;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public abstract Socket method1566(int arg0) throws IOException;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)Ljava/net/Socket;")
    public final Socket method4209(boolean arg0) throws IOException {
        field10438++;
        if (arg0) {
            this.field10439 = 90;
        }
        return new Socket(this.field10442, this.field10439);
    }
}
