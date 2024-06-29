import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class230 extends class163 {

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
    public int field3939;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    private int field3935;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "[Z")
    public boolean[] field3937;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "[I")
    public int[] field3938;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "[[I")
    public int[][] field3942;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "Lke;")
    public static class256 field3933 = class316.method2202("(Y<)4col>", 27626);

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "[[[Lij;")
    public static class175[][][] field3934 = new class175[4][104][104];

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "[I")
    public static int[] field3943 = new int[8];

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
    public static int field3940 = 0;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "Lke;")
    private static class256 field3947 = class316.method2202("Loaded update list", 27626);

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "Lke;")
    public static class256 field3946 = field3947;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "Lke;")
    public static class256 field3945 = class316.method2202("event_opbase", 27626);

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/lang/String;I)Lke;", line = 6)
    public static final class256 method1563(String arg0, int arg1) {
        field3936++;
        if (arg1 >= -111) {
            field3946 = (class256) null;
        }
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg0.getBytes();
        }
        class256 var4 = new class256();
        var4.field4384 = 0;
        var4.field4380 = var2;
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var4.field4384++] = var2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V", line = 54)
    public static void method1564(byte arg0) {
        field3945 = null;
        field3947 = null;
        field3946 = null;
        field3943 = null;
        field3934 = (class175[][][]) null;
        field3933 = null;
        if (arg0 != -25) {
            field3941 = -10;
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(I[B)V", line = 84)
    public class230(int arg0, byte[] arg1) {
        this.field3939 = arg0;
        class41 var3 = new class41(arg1);
        this.field3935 = var3.method357(false);
        this.field3937 = new boolean[this.field3935];
        this.field3938 = new int[this.field3935];
        this.field3942 = new int[this.field3935][];
        for (int var4 = 0; var4 < this.field3935; var4++) {
            this.field3938[var4] = var3.method357(false);
        }
        for (int var5 = 0; var5 < this.field3935; var5++) {
            this.field3937[var5] = var3.method357(false) == 1;
        }
        for (int var6 = 0; var6 < this.field3935; var6++) {
            this.field3942[var6] = new int[var3.method357(false)];
        }
        for (int var7 = 0; var7 < this.field3935; var7++) {
            for (int var8 = 0; var8 < this.field3942[var7].length; var8++) {
                this.field3942[var7][var8] = var3.method357(false);
            }
        }
    }
}
