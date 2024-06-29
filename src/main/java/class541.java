import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public abstract class class541 {

    @OriginalMember(owner = "client!oea", name = "i", descriptor = "I")
    public static int field7856 = 0;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "I")
    public static int field7848;

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "I")
    public int field7849;

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "I")
    public static int field7851;

    @OriginalMember(owner = "client!oea", name = "e", descriptor = "I")
    public static int field7852;

    @OriginalMember(owner = "client!oea", name = "f", descriptor = "I")
    public static int field7853;

    @OriginalMember(owner = "client!oea", name = "g", descriptor = "I")
    public static int field7854;

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "Ljava/lang/String;")
    public String field7850;

    @OriginalMember(owner = "client!oea", name = "h", descriptor = "[I")
    public static int[] field7855;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public abstract Socket method1550(int arg0) throws IOException;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lqk;I)V")
    public static final void method3252(class146 arg0, int arg1) {
        field7853++;
        if (arg1 > -114) {
            method3254(85);
        }
        if (!class549.field7997) {
            return;
        }
        if (arg0.field1984 != null) {
            class146 var2 = class590.method3467(1, class231.field3475, class250.field3640);
            if (var2 != null) {
                class362 var3 = new class362();
                var3.field5297 = arg0.field1984;
                var3.field5304 = arg0;
                var3.field5303 = var2;
                class529.method3207(var3);
            }
        }
        class610.field8718++;
        class88 var4 = class448.method2741((byte) 80, class9.field73, class583.field8319);
        var4.field1260.method2926((byte) -116, arg0.field2079);
        var4.field1260.method2927((byte) -54, class231.field3475);
        var4.field1260.method2863(class191.field2688, (byte) 48);
        var4.field1260.method2863(class250.field3640, (byte) 97);
        var4.field1260.method2887(arg0.field2010, (byte) -82);
        var4.field1260.method2863(arg0.field2131, (byte) 98);
        class523.method3183(var4, (byte) 31);
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(B)Ljava/net/Socket;")
    public final Socket method3253(byte arg0) throws IOException {
        if (arg0 >= -16) {
            return null;
        } else {
            field7852++;
            return new Socket(this.field7850, this.field7849);
        }
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(I)V")
    public static void method3254(int arg0) {
        int var1 = 124 % ((arg0 - 66) / 58);
        field7855 = null;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIIIIIBZ)Z")
    public static final boolean method3255(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, boolean arg8) {
        field7851++;
        int var9 = class108.field1536.field4646[0];
        int var10 = class108.field1536.field4645[0];
        if (var9 < 0 || class184.field2546 <= var9 || var10 < 0 || class240.field3555 <= var10) {
            return false;
        }
        if (arg7 != -49) {
            method3254(49);
        }
        if (arg5 < 0 || class184.field2546 <= arg5 || arg4 < 0 || class240.field3555 <= arg4) {
            return false;
        }
        int var11 = class235.method1638(class108.field1536.method2053(true), arg8, class6.field57[class108.field1536.field3920], arg3, arg2, arg5, arg6, 17105, arg0, var10, arg1, arg4, class47.field786, class332.field4509, var9);
        if (var11 < 1) {
            return false;
        }
        class545.field7931 = class47.field786[var11 - 1];
        class455.field6488 = class332.field4509[var11 - 1];
        class126.field1745 = false;
        class499.method3034(arg7 - 3512);
        return true;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIZ)I")
    public static final int method3256(int arg0, int arg1, boolean arg2) {
        field7854++;
        int var3 = class622.method3599((byte) -74, arg1 - 1, arg0 - 1) - (-class622.method3599((byte) -74, arg1 + 1, arg0 - 1) - class622.method3599((byte) -74, arg1 - 1, arg0 + 1)) + class622.method3599((byte) -74, arg1 + 1, arg0 - -1);
        int var4 = class622.method3599((byte) -74, arg1 - 1, arg0) - (-class622.method3599((byte) -74, arg1 + 1, arg0) - class622.method3599((byte) -74, arg1, arg0 - 1) - class622.method3599((byte) -74, arg1, arg0 + 1));
        int var5 = class622.method3599((byte) -74, arg1, arg0);
        if (!arg2) {
            field7855 = null;
        }
        return var3 / 16 + var5 / 4 + (var4 / 8);
    }
}
