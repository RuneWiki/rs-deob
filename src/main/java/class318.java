import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public abstract class class318 {

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "[Len;")
    public static class192[] field4614;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "Ldk;")
    public static class326 field4612;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    public int field4604;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public int field4617;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
    public int field4618;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "Lb;")
    public static class201 field4615;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "Ltk;")
    public static class210 field4613;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)Z")
    public final boolean method2036(boolean arg0) {
        if (!arg0) {
            this.field4617 = -74;
        }
        field4606++;
        return (this.field4604 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZIIIIZI)V")
    public static final void method2037(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg1 < arg2) {
            int var7 = (arg1 + arg2) / 2;
            int var8 = arg1;
            class42 var9 = class156.field2323[var7];
            class156.field2323[var7] = class156.field2323[arg2];
            class156.field2323[arg2] = var9;
            for (int var10 = arg1; var10 < arg2; var10++) {
                if (class26.method178(arg5, false, arg4, var9, arg0, class156.field2323[var10], arg6) <= 0) {
                    class42 var11 = class156.field2323[var10];
                    class156.field2323[var10] = class156.field2323[var8];
                    class156.field2323[var8++] = var11;
                }
            }
            class156.field2323[arg2] = class156.field2323[var8];
            class156.field2323[var8] = var9;
            method2037(arg0, arg1, var8 - 1, -1, arg4, arg5, arg6);
            method2037(arg0, var8 + 1, arg2, -1, arg4, arg5, arg6);
        }
        field4605++;
        if (arg3 != -1) {
            field4616 = -118;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)Z")
    public final boolean method2038(int arg0) {
        field4611++;
        if (arg0 != 4) {
            this.method2036(false);
        }
        return (this.field4604 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V")
    public static void method2039(int arg0) {
        if (arg0 != 0) {
            method2039(55);
        }
        field4612 = null;
        field4614 = null;
        field4613 = null;
        field4615 = null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
    public static final void method2040(byte arg0) {
        field4607++;
        class54.field729 = 0;
        if (arg0 == -31) {
            class61.field801 = -1;
            class359.field5161 = -1;
            class118.field1493 = -1;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IBI)I")
    public static final int method2041(int arg0, byte arg1, int arg2) {
        if (arg1 <= 2) {
            field4615 = null;
        }
        field4610++;
        return arg0 == 1 || arg0 == 3 ? class199.field2905[arg2 & 0x3] : class492.field6929[arg2 & 0x3];
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)Z")
    public final boolean method2042(int arg0) {
        field4609++;
        if (arg0 == 24972) {
            return (this.field4604 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)Z")
    public final boolean method2043(int arg0) {
        field4603++;
        if (arg0 != -1) {
            method2039(77);
        }
        return (this.field4604 & 0x2) != 0;
    }

    static {
        new class326("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field4616 = 0;
        field4614 = new class192[50];
        field4612 = new class326("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");
    }
}
