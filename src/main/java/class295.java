import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class295 extends class80 {

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
    public int field4829;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "Lph;")
    private static class229 field4825 = class266.method1858("Loaded fonts", 0);

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "Lph;")
    public static class229 field4824 = field4825;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public static int field4826 = 0;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
    public static int field4828 = 0;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)V", line = 5)
    public static void method1999(int arg0) {
        field4824 = null;
        if (arg0 < 90) {
            field4828 = 28;
        }
        field4825 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V", line = 23)
    public static final void method2000(int arg0, int arg1) {
        class61.field870 = -1;
        class205.field3380 = -1;
        class103.field1767 = arg0;
        if (arg1 != -14009) {
            method2001((byte) -43, (class229[]) null, 20, 3);
        }
        field4827++;
        class248.method1742((byte) -120);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B[Lph;II)Lph;", line = 39)
    public static final class229 method2001(byte arg0, class229[] arg1, int arg2, int arg3) {
        int var4 = 0;
        field4830++;
        for (int var5 = 0; var5 < arg3; var5++) {
            if (arg1[arg2 + var5] == null) {
                arg1[arg2 + var5] = class281.field4659;
            }
            var4 += arg1[arg2 + var5].field3785;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg3; var8++) {
            class229 var9 = arg1[arg2 + var8];
            class42.method317(var9.field3772, 0, var6, var7, var9.field3785);
            var7 += var9.field3785;
        }
        class229 var10 = new class229();
        var10.field3785 = var4;
        if (arg0 != -106) {
            method2000(127, 34);
        }
        var10.field3772 = var6;
        return var10;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V", line = 115)
    public class295() {
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(I)V", line = 117)
    public class295(int arg0) {
        this.field4829 = arg0;
    }
}
