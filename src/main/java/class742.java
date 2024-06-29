import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class742 extends class623 {

    @OriginalMember(owner = "client!io", name = "u", descriptor = "Lgf;")
    public class68 field10374;

    @OriginalMember(owner = "client!io", name = "w", descriptor = "Z")
    public static boolean field10376 = false;

    @OriginalMember(owner = "client!io", name = "s", descriptor = "I")
    public static int field10372;

    @OriginalMember(owner = "client!io", name = "v", descriptor = "I")
    public static int field10375;

    @OriginalMember(owner = "client!io", name = "t", descriptor = "Z")
    public static boolean field10373;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ILtn;)Ljv;", line = 3)
    public static final class741 method4161(int arg0, class179 arg1) {
        field10375++;
        int var2 = arg1.method1094(255);
        class761 var3 = class412.method2441(-94)[arg1.method1094(255)];
        class407 var4 = class237.method1481(109)[arg1.method1094(255)];
        int var5 = arg1.method1137((byte) -87);
        int var6 = arg1.method1137((byte) -80);
        int var7 = arg1.method1107(false);
        int var8 = arg1.method1107(false);
        int var9 = arg1.method1095((byte) 122);
        if (arg0 >= -6) {
            field10372 = 49;
        }
        int var10 = arg1.method1095((byte) 126);
        int var11 = arg1.method1095((byte) 120);
        boolean var12 = arg1.method1094(255) == 1;
        return new class741(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "([Lmb;II)V", line = 47)
    public static final void method4162(class410[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class410 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field5783;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field5783 < (var7 & 0x1) + var6) {
                class410 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method4162(arg0, arg1, var4 - 1);
        method4162(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lgf;)V", line = 83)
    public class742(class68 arg0) {
        this.field10374 = arg0;
    }
}
