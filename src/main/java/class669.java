import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class669 {

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "Laf;")
    private class39 field9368 = new class39(256);

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "Ld;")
    private class101 field9372;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "Llba;")
    private class223 field9371;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "J")
    public static long field9370 = -1L;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
    public static int field9374 = -50;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "Luaa;")
    public static class452 field9364 = new class452();

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "[Lpe;")
    public static class685[] field9376 = new class685[1024];

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "Z")
    public static boolean field9377 = false;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field9365;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field9366;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field9367;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public static int field9369;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public static int field9373;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    public static int field9375;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V", line = 4)
    public static void method3818(int arg0) {
        if (arg0 != 64) {
            field9376 = null;
        }
        field9364 = null;
        field9376 = null;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V", line = 15)
    public final void method3819(int arg0) {
        field9366++;
        this.field9368.method314(-2);
        if (arg0 != -1) {
            field9376 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V", line = 28)
    public final void method3820(boolean arg0) {
        if (arg0) {
            this.field9368.method308(-1, 5);
            field9373++;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)V", line = 40)
    public static final void method3821(int arg0, int arg1) {
        field9367++;
        class83.field1004 = -1;
        class759.field10432 = -1;
        if (arg1 == 30019) {
            class612.field8623 = arg0;
            class418.method2528(0);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lha;B)V", line = 58)
    public static final void method3822(class473 arg0, byte arg1) {
        field9365++;
        if (arg1 <= 112) {
            return;
        }
        class78.field878 = class476.method2839(class128.field1671, true, arg0, false);
        class525.field7226 = class171.method1098(class128.field1671, 119, arg0);
        class559.field7865 = class476.method2839(class510.field6918, true, arg0, false);
        class582.field8243 = class171.method1098(class510.field6918, -93, arg0);
        class386.field5515 = class476.method2839(class656.field9261, true, arg0, false);
        class705.field9812 = class171.method1098(class656.field9261, -74, arg0);
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(II)Lbw;", line = 76)
    public final class28 method3823(int arg0, int arg1) {
        if (arg1 != -50) {
            return null;
        }
        field9369++;
        Object var3 = this.field9368.method312(0, (long) arg0);
        if (var3 != null) {
            return (class28) var3;
        } else if (this.field9372.method583(12101, arg0)) {
            class744 var4 = this.field9372.method581(-21732, arg0);
            int var5 = var4.field10265 ? 64 : this.field9371.field3365;
            class28 var7;
            if (var4.field10252 && this.field9371.method147()) {
                float[] var6 = this.field9372.method574(0.7F, false, var5, var5, 1136, arg0);
                var7 = this.field9371.method1402(var6, var5, var5, var4.field10270 != 0, class75.field837, false);
            } else {
                int[] var8;
                if (var4.field10258 != 2 && class452.method2727(var4.field10273, 1)) {
                    var8 = this.field9372.method578(var5, true, arg0, 0.7F, true, var5);
                } else {
                    var8 = this.field9372.method579(arg0, 0.7F, false, 5084, var5, var5);
                }
                var7 = this.field9371.method1447((byte) -60, var5, var5, var4.field10270 != 0, var8);
            }
            var7.method129(var4.field10253, true, var4.field10255);
            this.field9368.method305(var7, (long) arg0, 18320);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Llba;Ld;)V", line = 132)
    public class669(class223 arg0, class101 arg1) {
        this.field9372 = arg1;
        this.field9371 = arg0;
    }
}
