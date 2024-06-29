import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class348 {

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    private int field5041 = -1;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    private int field5042 = 0;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "Lkr;")
    private class486 field5037 = new class486();

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "Z")
    public boolean field5045 = false;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    private int field5038;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    private int field5035;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "[Lfs;")
    private class359[] field5043;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "[[I")
    private int[][] field5039;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "[I")
    public static int[] field5033 = new int[2048];

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field5044 = 0;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "[I")
    public static int[] field5031 = new int[4096];

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Lwf;")
    public static class79 field5046;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public final void method2174(byte arg0) {
        for (int var2 = 0; var2 < this.field5035; var2++) {
            this.field5039[var2] = null;
        }
        int var3 = -56 / ((49 - arg0) / 63);
        field5034++;
        this.field5039 = null;
        this.field5043 = null;
        this.field5037.method2838((byte) 96);
        this.field5037 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)[[I")
    public final int[][] method2175(int arg0) {
        field5032++;
        if (this.field5038 != this.field5035) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 >= -37) {
            this.field5035 = -56;
        }
        for (int var2 = 0; var2 < this.field5035; var2++) {
            this.field5043[var2] = class182.field2702;
        }
        return this.field5039;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)[I")
    public final int[] method2176(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field5041 = 27;
        }
        field5040++;
        if (this.field5038 == this.field5035) {
            this.field5045 = this.field5043[arg0] == null;
            this.field5043[arg0] = class182.field2702;
            return this.field5039[arg0];
        } else if (this.field5035 == 1) {
            this.field5045 = this.field5041 != arg0;
            this.field5041 = arg0;
            return this.field5039[0];
        } else {
            class359 var3 = this.field5043[arg0];
            if (var3 == null) {
                this.field5045 = true;
                if (this.field5035 <= this.field5042) {
                    class359 var4 = (class359) this.field5037.method2847((byte) 86);
                    var3 = new class359(arg0, var4.field5171);
                    this.field5043[var4.field5160] = null;
                    var4.method1510((byte) -13);
                } else {
                    var3 = new class359(arg0, this.field5042);
                    this.field5042++;
                }
                this.field5043[arg0] = var3;
            } else {
                this.field5045 = false;
            }
            this.field5037.method2846(var3, arg1 ^ 0x800);
            return this.field5039[var3.field5171];
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIB)V")
    public static final void method2177(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 < 116) {
            return;
        }
        if (class168.field2449 <= arg2 - arg1 && (arg1 + arg2) <= class94.field1209 && arg0 - arg1 >= class345.field5011 && arg0 + arg1 <= class485.field6827) {
            class197.method1201(arg3, arg1, arg0, 0, arg2);
        } else {
            class96.method544(arg1, -3648, arg2, arg0, arg3);
        }
        field5036++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
    public static void method2178(boolean arg0) {
        field5031 = null;
        if (arg0) {
            field5033 = null;
            field5046 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(III)V")
    public class348(int arg0, int arg1, int arg2) {
        this.field5038 = arg1;
        this.field5035 = arg0;
        this.field5043 = new class359[this.field5038];
        this.field5039 = new int[this.field5035][arg2];
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field5031[var0] = class204.method1278(var0, -3689);
        }
        field5046 = new class79(0, 7);
    }
}
