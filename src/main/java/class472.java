import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public abstract class class472 {

    @OriginalMember(owner = "client!cba", name = "l", descriptor = "I")
    private int field6674;

    @OriginalMember(owner = "client!cba", name = "g", descriptor = "Z")
    private boolean field6669;

    @OriginalMember(owner = "client!cba", name = "e", descriptor = "I")
    private int field6667;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "Lte;")
    public class527 field6663;

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "I")
    public int field6665;

    @OriginalMember(owner = "client!cba", name = "h", descriptor = "I")
    public static int field6670 = 0;

    @OriginalMember(owner = "client!cba", name = "k", descriptor = "Lh;")
    public static class572 field6673 = new class572("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "I")
    public static int field6664;

    @OriginalMember(owner = "client!cba", name = "f", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!cba", name = "i", descriptor = "I")
    public static int field6671;

    @OriginalMember(owner = "client!cba", name = "j", descriptor = "I")
    public static int field6672;

    @OriginalMember(owner = "client!cba", name = "d", descriptor = "Lkda;")
    public static class328 field6666;

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)V")
    public abstract void method1556(int arg0);

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "([BZI)V")
    public final void method2842(byte[] arg0, boolean arg1, int arg2) {
        this.method1556(-103);
        if (!arg1) {
            this.method1556(56);
        }
        field6672++;
        if (arg2 <= this.field6674) {
            OpenGL.glBufferSubDataARBub(this.field6667, 0, arg2, arg0, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field6667, arg2, arg0, 0, this.field6669 ? 35040 : 35044);
            this.field6663.field7759 += arg2 - this.field6674;
            this.field6674 = arg2;
        }
    }

    @OriginalMember(owner = "client!cba", name = "d", descriptor = "(B)V")
    public static void method2843(byte arg0) {
        field6673 = null;
        int var1 = 17 % ((-arg0 - 1) / 52);
        field6666 = null;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(ILjava/lang/String;IIZ)V")
    public static final void method2844(int arg0, String arg1, int arg2, int arg3, boolean arg4) {
        field6664++;
        class162 var5 = class372.method2217(arg0, 100, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2405 != null) {
            class518 var6 = new class518();
            var6.field7376 = var5;
            var6.field7383 = var5.field2405;
            var6.field7381 = arg3;
            var6.field7389 = arg1;
            class98.method757(var6);
        }
        if (field6670 != 9 || !client.method1599(var5).method3654(arg3 - 1, true)) {
            return;
        }
        if (arg3 == 1) {
            class8.field80++;
            class402.method2367(class178.field2714, (byte) 99);
            class337.method2058(arg0, var5.field2434, 4783, arg2);
        }
        if (arg3 == 2) {
            class297.field4084++;
            class402.method2367(class610.field9050, (byte) 68);
            class337.method2058(arg0, var5.field2434, 4783, arg2);
        }
        if (arg4) {
            return;
        }
        if (arg3 == 3) {
            class402.method2367(class525.field7520, (byte) 102);
            class354.field4817++;
            class337.method2058(arg0, var5.field2434, 4783, arg2);
        }
        if (arg3 == 4) {
            class402.method2367(class623.field9177, (byte) 76);
            class576.field8479++;
            class337.method2058(arg0, var5.field2434, 4783, arg2);
        }
        if (arg3 == 5) {
            class402.method2367(class531.field7930, (byte) 101);
            class410.field5605++;
            class337.method2058(arg0, var5.field2434, 4783, arg2);
        }
        if (arg3 == 6) {
            class157.field2331++;
            class402.method2367(class510.field7261, (byte) 84);
            class337.method2058(arg0, var5.field2434, 4783, arg2);
        }
        if (arg3 == 7) {
            class402.method2367(class583.field8565, (byte) 116);
            class164.field2595++;
            class337.method2058(arg0, var5.field2434, 4783, arg2);
        }
        if (arg3 == 8) {
            class402.method2367(class469.field6612, (byte) 113);
            class457.field6463++;
            class337.method2058(arg0, var5.field2434, 4783, arg2);
        }
        if (arg3 == 9) {
            class402.method2367(class317.field4358, (byte) 77);
            class560.field8312++;
            class337.method2058(arg0, var5.field2434, 4783, arg2);
        }
        if (arg3 == 10) {
            class226.field3267++;
            class402.method2367(class57.field712, (byte) 126);
            class337.method2058(arg0, var5.field2434, 4783, arg2);
        }
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Lte;I[BIZ)V")
    public class472(class527 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field6674 = arg3;
        this.field6669 = arg4;
        this.field6667 = arg1;
        this.field6663 = arg0;
        OpenGL.glGenBuffersARB(1, class46.field557, 0);
        this.field6665 = class46.field557[0];
        this.method1556(-91);
        OpenGL.glBufferDataARBub(arg1, this.field6674, arg2, 0, this.field6669 ? 35040 : 35044);
        this.field6663.field7759 += this.field6674;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIII)Lfaa;")
    public static final class136 method2845(int arg0, int arg1, int arg2, int arg3) {
        field6668++;
        class205 var4 = class420.field5697[arg3][arg2][arg1];
        if (var4 == null) {
            return null;
        }
        class136 var5 = null;
        int var6 = -1;
        class636 var7 = var4.field3029;
        if (arg0 != -1265214713) {
            field6670 = 59;
        }
        while (var7 != null) {
            class577 var8 = var7.field9299;
            if (var8 instanceof class136) {
                class136 var9 = (class136) var8;
                int var10 = (var9.method940(-1) - 1) * 64 + 60;
                int var11 = var9.field8496 - var10 >> 7;
                int var12 = var9.field8500 - var10 >> 7;
                int var13 = var9.field8496 + var10 >> 7;
                int var14 = var9.field8500 + var10 >> 7;
                if (var11 <= arg2 && arg1 >= var12 && var13 >= arg2 && var14 >= arg1) {
                    int var15 = (var14 + 1 - arg1) * (var13 + 1 - arg2);
                    if (var6 < var15) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
            var7 = var7.field9302;
        }
        return var5;
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Lte;ILjaclib/memory/Buffer;IZ)V")
    public class472(class527 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field6667 = arg1;
        this.field6663 = arg0;
        this.field6674 = arg3;
        this.field6669 = arg4;
        OpenGL.glGenBuffersARB(1, class46.field557, 0);
        this.field6665 = class46.field557[0];
        this.method1556(-81);
        OpenGL.glBufferDataARBa(arg1, this.field6674, arg2.getAddress(), this.field6669 ? 35040 : 35044);
        this.field6663.field7759 += this.field6674;
    }

    @OriginalMember(owner = "client!cba", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field6671++;
        this.field6663.method3137(this.field6674, this.field6665, 0);
        super.finalize();
    }
}
