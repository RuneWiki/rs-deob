import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class293 {

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    private int field4186 = 0;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Lwa;")
    private class433 field4187;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field4188 = 0;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "F")
    public static float field4194;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "Lkp;")
    private class337 field4190;

    static {
        new class475("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lic;Lm;I)V", line = 4)
    public static final void method1865(class491 arg0, class126 arg1, int arg2) {
        class266.field3894 = arg1;
        class135.field2068 = arg0;
        field4192++;
        if (arg2 > -112) {
            method1865(null, null, -123);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)Lkp;", line = 17)
    public final class337 method1866(byte arg0) {
        field4189++;
        this.field4186 = 0;
        return arg0 < 17 ? null : this.method1868((byte) 124);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)I", line = 29)
    public static final int method1867(int arg0, int arg1) {
        if (arg1 != -210300991) {
            field4195 = -46;
        }
        field4193++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg0 & ~var7;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(B)Lkp;", line = 54)
    public final class337 method1868(byte arg0) {
        field4191++;
        if (arg0 <= 121) {
            return null;
        } else if (this.field4186 <= 0 || this.field4187.field6486[this.field4186 - 1] == this.field4190) {
            while (this.field4186 < this.field4187.field6485) {
                class337 var3 = this.field4187.field6486[this.field4186++].field4737;
                if (this.field4187.field6486[this.field4186 - 1] != var3) {
                    this.field4190 = var3.field4737;
                    return var3;
                }
            }
            return null;
        } else {
            class337 var2 = this.field4190;
            this.field4190 = var2.field4737;
            return var2;
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lwa;)V", line = 92)
    public class293(class433 arg0) {
        this.field4187 = arg0;
    }
}
