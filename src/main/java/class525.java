import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class525 {

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "Ljn;")
    private class117 field7709 = new class117(128);

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "Lvo;")
    private class345 field7711;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "[I")
    public static int[] field7707 = new int[4];

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "[Lam;")
    public static class289[] field7710 = new class289[8];

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public static int field7712 = 0;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "F")
    public static float field7708;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field7703;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field7705;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field7706;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "Lut;")
    public static class616 field7713;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "Z")
    public static boolean field7704;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public static final void method3094(int arg0) {
        class573.field8424.method985(true);
        field7706++;
        class410.method2452((byte) 109);
        class426.field6089 = 0;
        class127.field2083 = null;
        class305.field4260 = null;
        class256.field3697 = null;
        class376.field5209.field6710 = 0;
        class26.field363 = 0;
        class665.method3748(100);
        if (arg0 > -49) {
            return;
        }
        class320.field4407 = 0;
        class57.field857 = null;
        class230.field3409 = null;
        class520.field7677 = 0;
        class219.field3281 = 0;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIBII)V")
    public static final void method3095(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field7703++;
        if (arg4 > arg1) {
            class223.method1484(class657.field9275[arg3], arg4, -106, arg0, arg1);
        } else {
            class223.method1484(class657.field9275[arg3], arg1, -124, arg0, arg4);
        }
        if (arg2 <= 109) {
            field7712 = 59;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)Ljp;")
    public final class363 method3096(int arg0, byte arg1) {
        field7705++;
        class117 var3 = this.field7709;
        class363 var4;
        synchronized (this.field7709) {
            var4 = (class363) this.field7709.method941((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 < 98) {
            this.method3096(-38, (byte) 65);
        }
        byte[] var5 = this.field7711.method2081(123, class167.method1261(93, arg0), class250.method1598(1518908584, arg0));
        class363 var6 = new class363();
        if (var5 != null) {
            var6.method2186(new class465(var5), -2);
        }
        class117 var7 = this.field7709;
        synchronized (this.field7709) {
            this.field7709.method949((long) arg0, true, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
    public static void method3097(int arg0) {
        field7707 = null;
        field7710 = null;
        if (arg0 != 0) {
            field7713 = null;
        }
        field7713 = null;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lgn;ILvo;)V")
    public class525(class529 arg0, int arg1, class345 arg2) {
        this.field7711 = arg2;
        if (this.field7711 != null) {
            int var4 = this.field7711.method2102(true) - 1;
            this.field7711.method2098(0, var4);
        }
    }
}
