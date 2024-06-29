import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class392 extends class163 {

    @OriginalMember(owner = "client!rs", name = "K", descriptor = "Z")
    public static boolean field5610 = false;

    @OriginalMember(owner = "client!rs", name = "P", descriptor = "Lkn;")
    public static class442 field5615 = new class442("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!rs", name = "S", descriptor = "I")
    public static int field5618 = 0;

    @OriginalMember(owner = "client!rs", name = "J", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!rs", name = "L", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!rs", name = "M", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!rs", name = "N", descriptor = "I")
    public int field5613;

    @OriginalMember(owner = "client!rs", name = "O", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!rs", name = "R", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!rs", name = "T", descriptor = "Lni;")
    public static class305 field5619;

    @OriginalMember(owner = "client!rs", name = "I", descriptor = "Lr;")
    public class99 field5608;

    @OriginalMember(owner = "client!rs", name = "Q", descriptor = "[B")
    public byte[] field5616;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILnq;)V", line = 3)
    public static final void method2473(int arg0, class268 arg1) {
        ++field5614;
        class108.field1555 = arg1;
        if (arg0 != 22784) {
            method2474(false);
        }
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(Z)V", line = 15)
    public static void method2474(boolean arg0) {
        field5619 = null;
        if (!arg0) {
            field5615 = null;
        }
        field5615 = null;
    }

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "(I)I", line = 35)
    public final int method1078(int arg0) {
        ++field5609;
        if (arg0 != 29783) {
            return -24;
        } else {
            return super.field2254 ? 0 : 100;
        }
    }

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "(I)[B", line = 50)
    public final byte[] method1075(int arg0) {
        ++field5611;
        if (arg0 != -7537) {
            return null;
        } else if (super.field2254) {
            throw new RuntimeException();
        } else {
            return this.field5616;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIZ)I", line = 74)
    public static final int method2475(int arg0, int arg1, int arg2, boolean arg3) {
        ++field5612;
        class304 var4 = class356.method2281(arg1, arg3, 0);
        if (var4 == null) {
            return -1;
        } else if (~arg2 <= -1 && arg2 < var4.field4198.length) {
            if (arg0 >= -20) {
                field5610 = true;
            }
            return var4.field4198[arg2];
        } else {
            return -1;
        }
    }
}
