import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class535 {

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "Lda;")
    public class61 field7254 = null;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "Lmv;")
    public class377 field7253 = null;

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "Lafa;")
    public static class348 field7257 = new class348("WIP", 2);

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "I")
    public static int field7255;

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "I")
    public static int field7256;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(BII)V")
    public static final void method2949(byte arg0, int arg1, int arg2) {
        field7256++;
        class252 var3 = class150.method916(0, -71, 15);
        var3.method1502((byte) -103);
        var3.field3247 = arg2;
        if (arg0 > -101) {
            method2949((byte) 12, 45, -7);
        }
        var3.field3251 = arg1;
    }

    @OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Lda;)V")
    public class535(class61 arg0) {
        this.field7254 = arg0;
    }

    @OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Lda;Lmv;)V")
    public class535(class61 arg0, class377 arg1) {
        this.field7253 = arg1;
        this.field7254 = arg0;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)V")
    public static void method2950(int arg0) {
        if (arg0 <= 125) {
            field7257 = null;
        }
        field7257 = null;
    }
}
