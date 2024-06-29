import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class429 extends class400 {

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    private int field5846;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    private int field5852;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    private int field5855;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    private int field5849;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "Lvt;")
    public static class344 field5848 = new class344("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIB)V")
    public final void method1098(int arg0, int arg1, byte arg2) {
        ++field5847;
        int var4 = this.field5849 * arg1 >> 12;
        int var5 = this.field5852 * arg1 >> 12;
        int var6 = this.field5846 * arg0 >> 12;
        if (arg2 != -81) {
            field5848 = null;
        }
        int var7 = this.field5855 * arg0 >> 12;
        class56.method307(var4, var6, (byte) 108, var7, var5, super.field5481);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I[BILuq;IIZI)Lem;")
    public static final class600 method2508(int arg0, byte[] arg1, int arg2, class313 arg3, int arg4, int arg5, boolean arg6, int arg7) {
        if (arg4 != 3553) {
            return null;
        } else {
            ++field5850;
            if (!arg3.field4227 && (!class506.method2832(arg5, 3) || !class506.method2832(arg2, 3))) {
                return !arg3.field4243 ? new class600(arg3, arg0, arg5, arg2, class468.method2685(arg5, false), class468.method2685(arg2, false), arg1, arg7) : new class600(arg3, 34037, arg0, arg5, arg2, arg6, arg1, arg7);
            } else {
                return new class600(arg3, 3553, arg0, arg5, arg2, arg6, arg1, arg7);
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)V")
    public final void method1096(int arg0, int arg1, int arg2) {
        int var4 = -17 % ((23 - arg2) / 33);
        ++field5853;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public static void method2509(byte arg0) {
        if (arg0 != -43) {
            method2508(-116, (byte[]) null, -112, (class313) null, 6, -36, true, 94);
        }
        field5848 = null;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V")
    public static final void method2510(byte arg0) {
        class50.field673 = 0;
        ++field5854;
        class57.field760.method3178(arg0 + -8395);
        if (arg0 != 96) {
            field5848 = null;
        }
        class264.field3373 = false;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(IIIIII)V")
    public class429(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field5846 = arg1;
        this.field5852 = arg2;
        this.field5855 = arg3;
        this.field5849 = arg0;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(III)V")
    public final void method1099(int arg0, int arg1, int arg2) {
        ++field5851;
        if (arg1 != 4095) {
            this.method1096(83, 120, -94);
        }
    }
}
