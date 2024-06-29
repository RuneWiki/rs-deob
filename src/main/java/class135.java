import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class135 extends class182 {

    @OriginalMember(owner = "client!md", name = "M", descriptor = "I")
    public int field2430 = -1;

    @OriginalMember(owner = "client!md", name = "L", descriptor = "I")
    public int field2429 = 1190717;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "I")
    public int field2435 = -1;

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "I")
    public int field2434 = 0;

    @OriginalMember(owner = "client!md", name = "O", descriptor = "I")
    public int field2432 = 16;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "Z")
    public boolean field2436 = true;

    @OriginalMember(owner = "client!md", name = "K", descriptor = "Lkh;")
    public static class117 field2428 = class224.method1450((byte) -94, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!md", name = "J", descriptor = "Lkh;")
    public static class117 field2427 = class224.method1450((byte) -122, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!md", name = "I", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!md", name = "P", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lnc;III)V")
    private final void method899(class145 arg0, int arg1, int arg2, int arg3) {
        int var5 = 15 % ((arg1 + 59) / 54);
        if (arg2 == 1) {
            this.field2434 = class94.method645(arg0.method1023(-1002744), 16711935);
        } else if (arg2 == 2) {
            this.field2430 = arg0.method998(110);
        } else if (arg2 == 3) {
            this.field2430 = arg0.method1049((byte) 106);
            if (this.field2430 == 65535) {
                this.field2430 = -1;
            }
        } else if (arg2 == 5) {
            this.field2436 = false;
        } else if (arg2 == 7) {
            this.field2435 = class94.method645(arg0.method1023(-1002744), 16711935);
        } else if (arg2 == 8) {
            class161.field2941 = arg3;
        } else if (arg2 == 9) {
            arg0.method1049((byte) 124);
        } else if (arg2 != 10) {
            if (arg2 == 11) {
                arg0.method998(84);
            } else if (arg2 != 12) {
                if (arg2 == 13) {
                    this.field2429 = arg0.method1023(-1002744);
                } else if (arg2 == 14) {
                    this.field2432 = arg0.method998(76);
                }
            }
        }
        field2431++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IBLnc;)V")
    public final void method900(int arg0, byte arg1, class145 arg2) {
        if (arg1 < 1) {
            return;
        }
        field2426++;
        while (true) {
            int var4 = arg2.method998(84);
            if (var4 == 0) {
                return;
            }
            this.method899(arg2, 104, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIILdd;Ldd;IIJ)V")
    public static final void method901(int arg0, int arg1, int arg2, int arg3, class38 arg4, class38 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class90 var10 = new class90();
        var10.field1670 = arg8;
        var10.field1666 = arg1 * 128 + 64;
        var10.field1677 = arg2 * 128 + 64;
        var10.field1671 = arg3;
        var10.field1661 = arg4;
        var10.field1678 = arg5;
        var10.field1668 = arg6;
        var10.field1676 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class109.field2063[var11][arg1][arg2] == null) {
                class109.field2063[var11][arg1][arg2] = new class170(var11, arg1, arg2);
            }
        }
        class109.field2063[arg0][arg1][arg2].field3062 = var10;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(Z)V")
    public static void method902(boolean arg0) {
        field2427 = null;
        field2428 = null;
        if (arg0) {
            field2427 = null;
        }
    }
}
