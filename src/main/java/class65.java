import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class65 {

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "Lbga;")
    private class358 field1247;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    public int field1246;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "Lej;")
    public static class124 field1249 = new class124(38, 7);

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "Lre;")
    public static class601 field1251;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILwea;Ljava/awt/Component;II)Lcba;")
    public static final class550 method669(int arg0, class158 arg1, Component arg2, int arg3, int arg4) {
        field1245++;
        if (class103.field1834 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class550 var5 = (class550) Class.forName("bha").getDeclaredConstructor().newInstance();
                var5.field7586 = arg0;
                var5.field7569 = new int[(class86.field1544 ? 2 : 1) * 256];
                var5.method666(arg2);
                var5.field7579 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field7579 > 16384) {
                    var5.field7579 = 16384;
                }
                var5.method668(var5.field7579);
                if (class74.field1339 > 0 && class468.field6565 == null) {
                    class468.field6565 = new class391();
                    class468.field6565.field5764 = arg1;
                    arg1.method1210(class468.field6565, -10240, class74.field1339);
                }
                if (class468.field6565 != null) {
                    if (class468.field6565.field5754[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class468.field6565.field5754[arg3] = var5;
                }
                if (arg4 != 7) {
                    method670(107);
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class64 var6 = new class64(arg1, arg3);
                    var6.field7586 = arg0;
                    var6.field7569 = new int[(class86.field1544 ? 2 : 1) * 256];
                    var6.method666(arg2);
                    var6.field7579 = 16384;
                    var6.method668(var6.field7579);
                    if (class74.field1339 > 0 && class468.field6565 == null) {
                        class468.field6565 = new class391();
                        class468.field6565.field5764 = arg1;
                        arg1.method1210(class468.field6565, -10240, class74.field1339);
                    }
                    if (class468.field6565 != null) {
                        if (class468.field6565.field5754[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class468.field6565.field5754[arg3] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class550();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qr", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field1250++;
        this.field1247.method2286(16386, this.field1246);
        super.finalize();
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lbga;II)V")
    public class65(class358 arg0, int arg1, int arg2) {
        this.field1247 = arg0;
        this.field1246 = arg2;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V")
    public static void method670(int arg0) {
        field1251 = null;
        int var1 = -79 / ((arg0 + 45) / 46);
        field1249 = null;
    }
}
