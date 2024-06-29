import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class350 {

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
    public static int field4792 = 0;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "Ltm;")
    public static class112 field4790 = new class112("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "[Lbg;")
    public static class317[] field4796 = new class317[29];

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "Lfc;")
    public static class343 field4794;

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "Lop;")
    public static class63 field4795;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IB)[B")
    public static final byte[] method2094(int arg0, byte arg1) {
        field4789++;
        class386 var2 = (class386) class240.field3385.method1209(false, (long) arg0);
        if (arg1 != -119) {
            field4790 = null;
        }
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class10.method100((byte) -126, var7, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class386(var3);
            class240.field3385.method1207(arg1 + 118, (long) arg0, var2);
        }
        return var2.field5443;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2095(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4793++;
        if (arg4 <= 81) {
            method2097(70, 112, 124, (byte) -36);
        }
        if (arg3 == arg5) {
            class84.method579(arg1, arg7, arg3, arg2, arg6, 5384, arg0);
        } else if ((arg2 - arg3) >= class299.field4121 && arg2 + arg3 <= class248.field3487 && class53.field874 <= (arg6 - arg5) && arg5 + arg6 <= class8.field174) {
            class326.method1961(arg5, arg7, arg1, -10472, arg6, arg0, arg2, arg3);
        } else {
            class478.method2809(arg6, arg0, arg5, arg3, 114, arg1, arg2, arg7);
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)V")
    public static void method2096(boolean arg0) {
        field4795 = null;
        if (!arg0) {
            method2094(-55, (byte) -5);
        }
        field4796 = null;
        field4790 = null;
        field4794 = null;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIB)I")
    public static final int method2097(int arg0, int arg1, int arg2, byte arg3) {
        field4791++;
        int var4 = arg0 & 0x3;
        if (arg3 != -87) {
            return -19;
        } else if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 1023 - arg1;
        } else if (var4 == 2) {
            return 1023 - arg2;
        } else {
            return arg1;
        }
    }
}
