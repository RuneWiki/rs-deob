import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public class class622 extends class489 {

    @OriginalMember(owner = "client!kia", name = "f", descriptor = "Lbaa;")
    public class525 field8565;

    @OriginalMember(owner = "client!kia", name = "d", descriptor = "I")
    public static int field8563 = -1;

    @OriginalMember(owner = "client!kia", name = "h", descriptor = "[[[I")
    public static int[][][] field8567 = new int[2][][];

    @OriginalMember(owner = "client!kia", name = "e", descriptor = "I")
    public static int field8564;

    @OriginalMember(owner = "client!kia", name = "g", descriptor = "I")
    public static int field8566;

    @OriginalMember(owner = "client!kia", name = "i", descriptor = "I")
    public static int field8568;

    @OriginalMember(owner = "client!kia", name = "b", descriptor = "(B)V")
    public static void method3497(byte arg0) {
        if (arg0 >= -106) {
            field8563 = -61;
        }
        field8567 = null;
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(ID)V")
    public static final void method3498(int arg0, double arg1) {
        field8564++;
        class584.field8164.method604(class277.field3474);
        int var3 = -91 / ((arg0 - 6) / 59);
        class584.field8164.method600(0, 0, (int) arg1);
        class565.field7943.method505(class584.field8164);
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIZZIII)V")
    public static final void method3499(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (!arg3) {
            field8567 = null;
        }
        field8566++;
        if ((arg2 ? class748.field10451.field10428.method4186((byte) -82) : class748.field10451.field10434.method4186((byte) -75)) != 0 && arg4 != 0 && class3.field26 < 50 && arg0 != -1) {
            class742.field10360[class3.field26++] = new class268((byte) (arg2 ? 3 : 2), arg0, arg4, arg5, arg6, 0, arg1, null);
        }
    }

    @OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Lbi;II[B)V")
    public class622(class483 arg0, int arg1, int arg2, byte[] arg3) {
        this.field8565 = class367.method2120(382, arg3, arg2, arg0, 6406, 6406, arg1, false);
        this.field8565.method1756(false, false, 84);
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(Z)V")
    public static final void method3500(boolean arg0) {
        field8568++;
        class194.field2656++;
        class701.field9759 = 0;
        class28.field502 = 0;
        class629.method3533(21562);
        class656.method3699(121);
        class89.method727((byte) -72);
        boolean var1 = false;
        if (arg0) {
            field8563 = -100;
        }
        for (int var2 = 0; var2 < class701.field9759; var2++) {
            int var5 = class346.field4368[var2];
            class592 var6 = (class592) class207.field2745.method1160((long) var5, 119);
            class733 var7 = var6.field8280;
            if (class14.field276 && class278.method1641(var5, -42)) {
                class29.method194((byte) -89);
            }
            if (class194.field2656 != var7.field231) {
                if (var7.field10192.method972(27961)) {
                    class408.method2274(var7, (byte) -23);
                }
                var7.method4090(null, 0);
                var1 = true;
                var6.method1175(-2);
            }
        }
        if (var1) {
            class54.field752 = class207.field2745.method1159((byte) -106);
            class207.field2745.method1152(class638.field8801, 32260);
        }
        if (class440.field5868 != class609.field8448.field6193) {
            throw new RuntimeException("gnp1 pos:" + class609.field8448.field6193 + " psize:" + class440.field5868);
        }
        for (int var3 = 0; var3 < class646.field8947; var3++) {
            if (class207.field2745.method1160((long) class751.field10483[var3], 121) == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class646.field8947);
            }
        }
        if ((class54.field752 - class646.field8947) != 0) {
            throw new RuntimeException("gnp3 mis:" + (class54.field752 - class646.field8947));
        }
        for (int var4 = 0; var4 < class54.field752; var4++) {
            if (class194.field2656 != class638.field8801[var4].field8280.field231) {
                throw new RuntimeException("gnp4 uk:" + class638.field8801[var4].field8280.field189);
            }
        }
    }
}
