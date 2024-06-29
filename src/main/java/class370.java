import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public class class370 extends InputStream {

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "Lgr;")
    public static class530 field5397 = new class530(41, 5);

    @OriginalMember(owner = "client!tha", name = "d", descriptor = "Z")
    public static boolean field5399 = true;

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!tha", name = "c", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(BII)Z", line = 7)
    public static final boolean method2319(byte arg0, int arg1, int arg2) {
        field5396++;
        if (arg0 != -124) {
            field5399 = false;
        }
        return (arg1 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!tha", name = "read", descriptor = "()I", line = 18)
    public final int read() {
        field5398++;
        class363.method2283(30000L, -24244);
        return -1;
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(II)V", line = 30)
    public static final void method2320(int arg0, int arg1) {
        class375 var2 = class565.field8185[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class375 var4 = class565.field8185[var3][arg0][arg1] = class565.field8185[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class208 var5 = var4.field5425; var5 != null; var5 = var5.field3146) {
                    class638 var6 = var5.field3144;
                    if (var6.field9038 == arg0 && var6.field9035 == arg1) {
                        var6.field3920--;
                    }
                }
                if (var4.field5422 != null) {
                    var4.field5422.field3920--;
                }
                if (var4.field5431 != null) {
                    var4.field5431.field3920--;
                }
                if (var4.field5427 != null) {
                    var4.field5427.field3920--;
                }
                if (var4.field5428 != null) {
                    var4.field5428.field3920--;
                }
                if (var4.field5424 != null) {
                    var4.field5424.field3920--;
                }
            }
        }
        if (class565.field8185[0][arg0][arg1] == null) {
            class565.field8185[0][arg0][arg1] = new class375(0);
            class565.field8185[0][arg0][arg1].field5430 = 1;
        }
        class565.field8185[0][arg0][arg1].field5433 = var2;
        class565.field8185[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(I)V", line = 83)
    public static void method2321(int arg0) {
        field5397 = null;
        if (arg0 != 30000) {
            method2319((byte) 36, 103, -80);
        }
    }
}
