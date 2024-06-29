import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class494 {

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "I")
    public int field7452;

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "Los;")
    private class468 field7455;

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "J")
    public static long field7450 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "Lwu;")
    public static class500 field7454 = new class500("WTI", 5);

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "I")
    public static int field7448;

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "I")
    public static int field7449;

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
    public static int field7451;

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "I")
    public static int field7453;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IZII)I")
    public static final int method2986(int arg0, boolean arg1, int arg2, int arg3) {
        field7449++;
        class580 var4 = class585.method3419(arg2 ^ 0xFFFFC777, arg1, arg3);
        if (var4 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = arg2; var6 < var4.field8543.length; var6++) {
                if (var4.field8538[var6] == arg0) {
                    var5 += var4.field8543[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ku", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field7451++;
        this.field7455.method2784(-27622, this.field7452);
        super.finalize();
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V")
    public static void method2987(byte arg0) {
        field7454 = null;
        if (arg0 != 38) {
            method2989(null, (byte) -49, null);
        }
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Los;II)V")
    public class494(class468 arg0, int arg1, int arg2) {
        this.field7452 = arg2;
        this.field7455 = arg0;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IILwca;I)V")
    public static final void method2988(int arg0, int arg1, class311 arg2, int arg3) {
        field7448++;
        if (arg2 == null) {
            return;
        }
        if (arg2.field4644 != null) {
            class355 var4 = new class355();
            var4.field5150 = arg2;
            var4.field5160 = arg2.field4644;
            class330.method2072(var4);
        }
        class564.field8360 = arg2.field4667;
        class427.field6085 = arg2.field4558;
        class425.field6074 = arg2.field4534;
        if (arg0 != 5) {
            return;
        }
        class437.field6433 = arg1;
        class369.field5337 = true;
        class546.field8160 = arg2.field4661;
        class362.field5233 = arg2.field4627;
        class270.field4003 = arg3;
        class619.method3586(arg0 + 27, arg2);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "([Ljava/lang/String;B[S)V")
    public static final void method2989(String[] arg0, byte arg1, short[] arg2) {
        if (arg1 == -55) {
            class158.method911((byte) 93, arg0.length - 1, 0, arg0, arg2);
            field7453++;
        }
    }
}
