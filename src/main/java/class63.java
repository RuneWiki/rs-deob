import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class63 {

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "[I")
    private int[] field863;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "Ldq;")
    public static class416 field867 = new class416(100);

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "S")
    public static short field869 = 256;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)I")
    public final int method480(int arg0, int arg1) {
        int var3 = -98 / ((arg0 - 49) / 40);
        field864++;
        int var4 = (this.field863.length >> 1) - 1;
        int var5 = arg1 & var4;
        while (true) {
            int var6 = this.field863[var5 + var5 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field863[var5 + var5] == arg1) {
                return var6;
            }
            var5 = var5 + 1 & var4;
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "([I)V")
    public class63(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field863 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field863[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field863[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field863[var5 + var5] = arg0[var4];
            this.field863[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Luq;I)V")
    public static final void method481(class91 arg0, int arg1) {
        if (arg1 != -1) {
            field870 = -34;
        }
        field865++;
        arg0.field1279 = null;
        if (class218.field3015 < 20) {
            class217.field3007.method1009(arg0, false);
            class218.field3015++;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V")
    public static void method482(boolean arg0) {
        field867 = null;
        if (!arg0) {
            method482(false);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)I")
    public static final int method483(int arg0, int arg1, int arg2) {
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (arg2 != -29919) {
            field869 = -20;
        }
        field862++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }
}
