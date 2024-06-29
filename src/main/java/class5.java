import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class5 {

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "J")
    public long field35;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "Lie;")
    public class5 field36;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "Lie;")
    public class5 field39;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "[Ldv;")
    public static class476[] field41;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V", line = 5)
    public static final void method21(int arg0) {
        class406.field6163 = null;
        class357.field5500 = null;
        class434.field6586 = null;
        class145.field1933 = null;
        class478.field7075 = null;
        class493.field7268 = null;
        class391.field5962 = null;
        field34++;
        class507.field7463 = null;
        class536.field7867 = null;
        class372.field5670 = null;
        class389.field5944 = null;
        class94.field1380 = null;
        class116.field1599 = null;
        class55.field776 = null;
        class407.field6181 = null;
        class383.field5827 = null;
        class296.field4380 = null;
        class199.field2653 = null;
        if (arg0 != 7537) {
            method21(92);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI)V", line = 33)
    public static final void method22(byte arg0, int arg1) {
        field40++;
        class128.field1731 = arg1;
        class330 var2 = class160.field2086;
        synchronized (class160.field2086) {
            if (arg0 == 64) {
                class160.field2086.method2127((byte) 127);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V", line = 50)
    public static void method23(int arg0) {
        field41 = null;
        if (arg0 != 5867) {
            method22((byte) 90, -33);
        }
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)Z", line = 61)
    public final boolean method24(int arg0) {
        if (arg0 == -25618) {
            field42++;
            return this.field36 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)V", line = 75)
    public final void method25(int arg0) {
        field37++;
        if (this.field36 == null) {
            return;
        }
        this.field36.field39 = this.field39;
        this.field39.field36 = this.field36;
        this.field36 = null;
        this.field39 = null;
        if (arg0 != -13489) {
            this.field35 = -47L;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/net/Socket;II)Lte;", line = 99)
    public static final class443 method26(Socket arg0, int arg1, int arg2) throws IOException {
        field38++;
        if (arg2 != 32194) {
            method23(-95);
        }
        return new class308(arg0, arg1);
    }
}
