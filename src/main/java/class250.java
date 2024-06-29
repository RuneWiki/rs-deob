import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class250 extends class477 {

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public int field3361 = 0;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "I")
    public int field3362 = -1;

    @OriginalMember(owner = "client!he", name = "E", descriptor = "I")
    public int field3370 = 12800;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "I")
    public int field3374 = 0;

    @OriginalMember(owner = "client!he", name = "G", descriptor = "I")
    public int field3372 = -1;

    @OriginalMember(owner = "client!he", name = "H", descriptor = "I")
    public int field3373 = 12800;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "Z")
    public boolean field3371 = true;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "Ljava/lang/String;")
    public String field3368;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "Ljava/lang/String;")
    public String field3375;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "I")
    public int field3377;

    @OriginalMember(owner = "client!he", name = "B", descriptor = "I")
    public int field3367;

    @OriginalMember(owner = "client!he", name = "M", descriptor = "Lrh;")
    public class59 field3378;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!he", name = "N", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!he", name = "O", descriptor = "Laq;")
    public static class108 field3380;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "Ljava/awt/Frame;")
    public static Frame field3376;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(B)V")
    public static final void method1555(byte arg0) {
        field3379++;
        for (class184 var1 = (class184) class69.field909.method2219((byte) -97); var1 != null; var1 = (class184) class69.field909.method2219((byte) -121)) {
            class397.method2351((byte) -75, var1);
        }
        int var2;
        int var3;
        if (class72.field935.method1861(class161.field2038, -109)) {
            var2 = 3;
            var3 = 0;
        } else {
            var2 = class160.field2028;
            var3 = class160.field2028;
        }
        client.method1412();
        int var4 = var3;
        if (arg0 < 11) {
            method1555((byte) -79);
        }
        while (var4 <= var2) {
            client.method1413();
            client.method1422(var4);
            client.method1419(var4);
            var4++;
        }
        client.method1406();
        client.method1410();
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I[III)Z")
    public final boolean method1556(int arg0, int[] arg1, int arg2, int arg3) {
        field3369++;
        for (class553 var5 = (class553) this.field3378.method374((byte) 97); var5 != null; var5 = (class553) this.field3378.method372(-20740)) {
            if (var5.method3103(arg3, arg0, (byte) -60)) {
                var5.method3097(arg3, arg0, arg1, (byte) 86);
                return true;
            }
        }
        if (arg2 != 0) {
            this.field3378 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)Z")
    public final boolean method1557(int arg0, int arg1, int arg2) {
        field3364++;
        if (arg0 != -1) {
            method1555((byte) -79);
        }
        for (class553 var4 = (class553) this.field3378.method374((byte) 61); var4 != null; var4 = (class553) this.field3378.method372(arg0 ^ 0x5103)) {
            if (var4.method3098(arg2, true, arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZI[I)Z")
    public final boolean method1558(int arg0, boolean arg1, int arg2, int[] arg3) {
        field3366++;
        for (class553 var5 = (class553) this.field3378.method374((byte) 108); var5 != null; var5 = (class553) this.field3378.method372(-20740)) {
            if (var5.method3098(arg0, true, arg2)) {
                var5.method3099(arg0, arg2, arg3, false);
                return true;
            }
        }
        return arg1 ? false : false;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIII[I)Z")
    public final boolean method1559(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field3365++;
        for (class553 var6 = (class553) this.field3378.method374((byte) 60); var6 != null; var6 = (class553) this.field3378.method372(-20740)) {
            if (var6.method3101(arg0, arg1 - 1368, arg3, arg2)) {
                var6.method3099(arg0, arg3, arg4, false);
                return true;
            }
        }
        if (arg1 != 0) {
            this.field3362 = 39;
        }
        return false;
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(B)V")
    public final void method1560(byte arg0) {
        this.field3374 = 0;
        this.field3361 = 0;
        if (arg0 <= 33) {
            field3380 = null;
        }
        field3363++;
        this.field3373 = 12800;
        this.field3370 = 12800;
        for (class553 var2 = (class553) this.field3378.method374((byte) 79); var2 != null; var2 = (class553) this.field3378.method372(-20740)) {
            if (this.field3361 < var2.field7567) {
                this.field3361 = var2.field7567;
            }
            if (var2.field7574 > this.field3374) {
                this.field3374 = var2.field7574;
            }
            if (var2.field7566 < this.field3370) {
                this.field3370 = var2.field7566;
            }
            if (this.field3373 > var2.field7571) {
                this.field3373 = var2.field7571;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method1561(int arg0) {
        field3376 = null;
        field3380 = null;
        if (arg0 != 0) {
            method1561(-85);
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class250(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field3362 = arg4;
        this.field3372 = arg6;
        this.field3371 = arg5;
        this.field3368 = arg2;
        this.field3375 = arg1;
        this.field3377 = arg0;
        this.field3367 = arg3;
        if (this.field3372 == 255) {
            this.field3372 = 0;
        }
        this.field3378 = new class59();
    }
}
