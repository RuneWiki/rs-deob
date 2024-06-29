import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class409 extends class476 {

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public int field5674;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public int field5675;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "Lro;")
    public static class2 field5677 = new class2();

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public static int field5679;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lwu;Lwu;Lft;ILwu;Luu;)Z")
    public static final boolean method2388(class376 arg0, class376 arg1, class3 arg2, int arg3, class376 arg4, class289 arg5) {
        class635.field8447 = arg0;
        class98.field1220 = arg5;
        class470.field6438 = arg4;
        class475.field6520 = arg1;
        class566.field7445 = arg2;
        field5676++;
        class453.field6189 = new int[16];
        if (arg3 == -1) {
            for (int var6 = 0; var6 < 16; var6++) {
                class453.field6189[var6] = 255;
            }
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V")
    public static final void method2389(int arg0, int arg1) {
        field5679++;
        if (arg1 != 16) {
            return;
        }
        if (class320.field4576 == 0) {
            class566.field7445.method34(true, arg0);
        } else {
            class175.field2641 = arg0;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)Lmha;")
    public final class419 method112(byte arg0) {
        if (arg0 == 62) {
            field5680++;
            return class294.field4215;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V")
    public static final void method2390(boolean arg0) {
        for (class575 var1 = (class575) class747.field10394.method3873(arg0); var1 != null; var1 = (class575) class747.field10394.method3873(arg0)) {
            class5.method80(var1, !arg0);
        }
        field5678++;
        int var2;
        int var3;
        if (class411.field5711.field3890.method984(true) == 1) {
            var3 = 0;
            var2 = 3;
        } else {
            var2 = class489.field6638;
            var3 = class489.field6638;
        }
        client.method1877();
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method1878();
            client.method1874(var4);
            client.method1871(var4);
        }
        client.method1872();
        client.method1866();
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static void method2391(int arg0) {
        field5677 = null;
        if (arg0 != -3706) {
            method2388(null, null, null, 10, null, null);
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lle;Lqj;IIIIIIIII)V")
    public class409(class311 arg0, class512 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field5674 = arg10;
        this.field5675 = arg9;
    }
}
