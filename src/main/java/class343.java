import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class343 extends class508 {

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "Z")
    public boolean field4362 = false;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "I")
    public int field4371 = -1;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "Loi;")
    public static class169 field4365 = new class169("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    public static int field4370 = 16777215;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public int field4364;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
    public int field4366;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    public int field4367;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
    public int field4368;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
    public int field4369;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)V")
    public static void method2016(byte arg0) {
        if (arg0 == 119) {
            field4365 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IBILeo;)V")
    public static final void method2017(int arg0, byte arg1, int arg2, class423 arg3) {
        if (arg3.field5751 == 0) {
            arg3.field5802 = arg3.field5752;
        } else if (arg3.field5751 == 1) {
            arg3.field5802 = (arg2 - arg3.field5726) / 2 + arg3.field5752;
        } else if (arg3.field5751 == 2) {
            arg3.field5802 = arg2 - arg3.field5752 - arg3.field5726;
        } else if (arg3.field5751 == 3) {
            arg3.field5802 = arg3.field5752 * arg2 >> 14;
        } else if (arg3.field5751 == 4) {
            arg3.field5802 = (arg3.field5752 * arg2 >> 14) + (arg2 - arg3.field5726) / 2;
        } else {
            arg3.field5802 = arg2 - arg3.field5726 - (arg3.field5752 * arg2 >> 14);
        }
        field4363++;
        int var4 = -53 % ((-arg1 - 32) / 54);
        if (arg3.field5788 == 0) {
            arg3.field5808 = arg3.field5757;
        } else if (arg3.field5788 == 1) {
            arg3.field5808 = (arg0 - arg3.field5735) / 2 + arg3.field5757;
        } else if (arg3.field5788 == 2) {
            arg3.field5808 = arg0 - arg3.field5757 - arg3.field5735;
        } else if (arg3.field5788 == 3) {
            arg3.field5808 = arg3.field5757 * arg0 >> 14;
        } else if (arg3.field5788 == 4) {
            arg3.field5808 = (arg0 - arg3.field5735) / 2 + (arg3.field5757 * arg0 >> 14);
        } else {
            arg3.field5808 = arg0 - arg3.field5735 - (arg3.field5757 * arg0 >> 14);
        }
        if (!class285.field3633 || client.method3037(arg3).field3305 == 0 && arg3.field5741 != 0) {
            return;
        }
        if (arg3.field5808 < 0) {
            arg3.field5808 = 0;
        } else if (arg3.field5808 + arg3.field5735 > arg0) {
            arg3.field5808 = arg0 - arg3.field5735;
        }
        if (arg3.field5802 < 0) {
            arg3.field5802 = 0;
        } else if ((arg3.field5802 + arg3.field5726) > arg2) {
            arg3.field5802 = arg2 - arg3.field5726;
            return;
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I)V")
    public class343(int arg0) {
        this.field4371 = arg0;
    }
}
