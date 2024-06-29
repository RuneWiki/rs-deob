import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public abstract class class531 {

    @OriginalMember(owner = "client!od", name = "a", descriptor = "Lqfa;")
    public class106 field7676;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "[I")
    public static int[] field7678 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!od", name = "f", descriptor = "[I")
    public static int[] field7681 = new int[5];

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field7677;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field7679;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field7680;

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lqfa;)V", line = 9)
    public class531(class106 arg0) {
        this.field7676 = arg0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I[I[I)V", line = 18)
    public static final void method3204(int arg0, int[] arg1, int[] arg2) {
        field7677++;
        if (arg2 == null || arg1 == null) {
            class600.field8417 = null;
            class40.field518 = null;
            class759.field10482 = null;
            return;
        }
        class759.field10482 = arg2;
        class40.field518 = new int[arg2.length];
        class600.field8417 = new byte[arg2.length][][];
        for (int var3 = arg0; var3 < class759.field10482.length; var3++) {
            class600.field8417[var3] = new byte[arg1[var3]][];
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IC)C", line = 47)
    public static final char method3205(int arg0, char arg1) {
        field7679++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (~arg1 == arg0) {
            return 'E';
        } else {
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIILwia;)Lsha;", line = 73)
    public static final class758 method3206(int arg0, int arg1, int arg2, class791 arg3) {
        if (arg2 <= 87) {
            return null;
        }
        field7680++;
        class494 var4 = new class494(arg3.method4339(arg0, 0, arg1));
        class758 var5 = new class758(arg0, var4.method2996(121), var4.method2996(102), var4.method2976(-126), var4.method2976(-126), var4.method2964((byte) 82) == 1, var4.method2964((byte) 62), var4.method2964((byte) 55));
        int var6 = var4.method2964((byte) 96);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field10452.method1727(new class533(var4.method2964((byte) 100), var4.method2998(true), var4.method2998(true), var4.method2998(true), var4.method2998(true), var4.method2998(true), var4.method2998(true), var4.method2998(true), var4.method2998(true)), (byte) 96);
        }
        var5.method4209((byte) -50);
        return var5;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V", line = 110)
    public static void method3207(int arg0) {
        field7678 = null;
        if (arg0 == -18861) {
            field7681 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)Z")
    public abstract boolean method304(int arg0);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZI)V")
    public abstract void method309(boolean arg0, int arg1);

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
    public abstract void method300(int arg0);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BII)V")
    public abstract void method311(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IZLdca;)V")
    public abstract void method307(int arg0, boolean arg1, class188 arg2);

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(ZI)V")
    public abstract void method301(boolean arg0, int arg1);
}
