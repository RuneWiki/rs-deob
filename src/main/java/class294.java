import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class294 extends class172 {

    @OriginalMember(owner = "client!ep", name = "J", descriptor = "Lkn;")
    public static class530 field4306 = new class530("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!ep", name = "L", descriptor = "Ltn;")
    public static class60 field4308 = new class60(47, 6);

    @OriginalMember(owner = "client!ep", name = "Q", descriptor = "Ltn;")
    public static class60 field4313 = new class60(3, -1);

    @OriginalMember(owner = "client!ep", name = "R", descriptor = "I")
    public static int field4314 = 0;

    @OriginalMember(owner = "client!ep", name = "S", descriptor = "[I")
    public static int[] field4315 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!ep", name = "I", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!ep", name = "M", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!ep", name = "N", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!ep", name = "P", descriptor = "I")
    public int field4312;

    @OriginalMember(owner = "client!ep", name = "O", descriptor = "Lwk;")
    public class97 field4311;

    @OriginalMember(owner = "client!ep", name = "K", descriptor = "[B")
    public byte[] field4307;

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "(I)V")
    public static void method1812(int arg0) {
        field4313 = null;
        field4315 = null;
        field4308 = null;
        field4306 = null;
        if (arg0 >= -40) {
            field4313 = null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)[B")
    public final byte[] method1073(int arg0) {
        if (arg0 > -30) {
            this.method1078(111);
        }
        ++field4309;
        if (super.field2496) {
            throw new RuntimeException();
        } else {
            return this.field4307;
        }
    }

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "(I)I")
    public final int method1078(int arg0) {
        if (arg0 != 100) {
            return -112;
        } else {
            ++field4305;
            return super.field2496 ? 0 : 100;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I[BBI)[B")
    public static final byte[] method1813(int arg0, byte[] arg1, byte arg2, int arg3) {
        ++field4310;
        byte[] var4 = new byte[arg3];
        class182.method1135(arg1, arg0, var4, 0, arg3);
        if (arg2 <= 57) {
            method1813(111, (byte[]) null, (byte) -93, 69);
        }
        return var4;
    }
}
