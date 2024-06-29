import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class22 extends class79 {

    @OriginalMember(owner = "client!ir", name = "M", descriptor = "Ljava/lang/Object;")
    private Object field232;

    @OriginalMember(owner = "client!ir", name = "K", descriptor = "Llt;")
    public static class475 field230 = new class475("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!ir", name = "N", descriptor = "Lri;")
    public static class73 field233 = new class73(10, 3);

    @OriginalMember(owner = "client!ir", name = "O", descriptor = "I")
    public static int field234 = 0;

    @OriginalMember(owner = "client!ir", name = "H", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!ir", name = "L", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(B)Z")
    public final boolean method141(byte arg0) {
        field229++;
        return arg0 == 55 ? false : false;
    }

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public final Object method142(byte arg0) {
        field231++;
        int var2 = -112 % ((-arg0 - 65) / 59);
        return this.field232;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lsq;)V")
    public static final void method143(class117 arg0) {
        for (int var1 = arg0.field1762; var1 <= arg0.field1770; var1++) {
            for (int var2 = arg0.field1771; var2 <= arg0.field1765; var2++) {
                class518 var3 = class108.field1553[arg0.field1768][var1][var2];
                if (var3 != null) {
                    class284 var4 = var3.field7569;
                    class284 var5 = null;
                    while (var4 != null) {
                        if (var4.field4083 == arg0) {
                            if (var5 == null) {
                                var3.field7569 = var4.field4087;
                            } else {
                                var5.field4087 = var4.field4087;
                            }
                            var4.method1837(-106);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field4087;
                    }
                    var3.field7567 = 0;
                    for (class284 var6 = var3.field7569; var6 != null; var6 = var6.field4087) {
                        var3.field7567 = (byte) (var3.field7567 | var6.field4080);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)V")
    public static void method144(boolean arg0) {
        if (!arg0) {
            field230 = null;
            field233 = null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class22(Object arg0, int arg1) {
        super(arg1);
        this.field232 = arg0;
    }
}
