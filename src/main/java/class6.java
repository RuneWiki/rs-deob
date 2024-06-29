import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 {

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "Z")
    public boolean field109 = false;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field110 = 0;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field116 = 0;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "Lvl;")
    public static class15 field119 = new class15(29, 3);

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "Lkh;")
    public static class17 field120 = null;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public int field111;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public int field115;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "Lfda;")
    public class340 field113;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)Z")
    public final boolean method43(int arg0) {
        if (arg0 <= 94) {
            this.field115 = 93;
        }
        field117++;
        return this.field113.field4589.method3737(this.field111, false);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lha;IZI)Lnf;")
    public final class604 method44(class66 arg0, int arg1, boolean arg2, int arg3) {
        field108++;
        long var5 = (long) (arg0.field952 << 19 | this.field111 | arg3 << 16 | (arg2 ? 262144 : 0));
        class604 var7 = (class604) this.field113.field4593.method266((byte) -125, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field113.field4589.method3737(this.field111, false)) {
            class49 var8 = class49.method366(this.field113.field4589, this.field111, arg1);
            if (var8 != null) {
                var8.field742 = var8.field744 = var8.field740 = var8.field738 = 0;
                if (arg2) {
                    var8.method365();
                }
                for (int var9 = 0; var9 < arg3; var9++) {
                    var8.method374();
                }
            }
            class604 var10 = arg0.method498(var8, true);
            if (var10 != null) {
                this.field113.field4593.method270(var10, var5, -124);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lfca;B)V")
    public final void method45(class93 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method793((byte) 18);
            if (var3 == 0) {
                field118++;
                if (arg1 != 82) {
                    field119 = null;
                    return;
                }
                return;
            }
            this.method48(var3, arg0, arg1 - 79);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
    public static void method46(byte arg0) {
        field120 = null;
        field119 = null;
        if (arg0 < 91) {
            field116 = -43;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIII)V")
    public static final void method47(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field114++;
        if (arg1 != -17655) {
            method47(-15, 7, -42, -13, -34);
        }
        if (arg0 >= class268.field3766 && class236.field3392 >= arg0) {
            int var5 = class748.method4155(class223.field3260, 16, arg4, class706.field9700);
            int var6 = class748.method4155(class223.field3260, 16, arg2, class706.field9700);
            class281.method1815(var5, arg0, var6, arg3, 79);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILfca;I)V")
    private final void method48(int arg0, class93 arg1, int arg2) {
        if (arg2 != 3) {
            return;
        }
        field112++;
        if (arg0 == 1) {
            this.field111 = arg1.method763(arg2 ^ 0x6B);
        } else if (arg0 == 2) {
            this.field115 = arg1.method767((byte) -120);
            return;
        } else if (arg0 == 3) {
            this.field109 = true;
            return;
        } else if (arg0 == 4) {
            this.field111 = -1;
            return;
        }
    }
}
