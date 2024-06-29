import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class286 extends class317 {

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
    private int field4246 = 20;

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
    private int field4249 = 0;

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
    private int field4250 = 1365;

    @OriginalMember(owner = "client!kc", name = "T", descriptor = "I")
    private int field4255 = 0;

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!kc", name = "P", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!kc", name = "R", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!kc", name = "S", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!kc", name = "Q", descriptor = "[Lpn;")
    public static class170[] field4252;

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "[[Z")
    public static boolean[][] field4248;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIB)V", line = 4)
    public static final void method1961(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 > -64) {
            return;
        }
        field4253++;
        class259.field3813 = arg2;
        class44.field536 = arg1;
        class206.field2952 = arg0;
        class101.field1397 = arg3;
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(B)V", line = 18)
    public static void method1962(byte arg0) {
        if (arg0 >= 31) {
            field4252 = null;
            field4248 = (boolean[][]) null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 29)
    public static final String method1963(boolean arg0, String arg1) {
        field4245++;
        if (arg0) {
            return (String) null;
        }
        String var2 = class256.method1746(class77.method584(arg1, 81), 0);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lcg;II)V", line = 45)
    public final void method60(class316 arg0, int arg1, int arg2) {
        field4247++;
        if (arg2 == 0) {
            this.field4250 = arg0.method2220((byte) 76);
        } else if (arg2 == 1) {
            this.field4246 = arg0.method2220((byte) 100);
        } else if (arg2 == 2) {
            this.field4249 = arg0.method2220((byte) 78);
        } else if (arg2 == 3) {
            this.field4255 = arg0.method2220((byte) 120);
        }
        int var5 = 0 / ((-arg1 - 17) / 40);
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V", line = 105)
    public class286() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)[I", line = 115)
    public final int[] method140(int arg0, int arg1) {
        if (arg0 != 542) {
            return (int[]) null;
        }
        field4254++;
        int[] var3 = this.field4847.method1387(arg1, (byte) -109);
        if (this.field4847.field2751) {
            for (int var4 = 0; var4 < class326.field4933; var4++) {
                int var5 = (class99.field1360[var4] << 12) / this.field4250 + this.field4249;
                int var6 = var5;
                int var7 = var5;
                int var8 = (class51.field693[arg1] << 12) / this.field4250 + this.field4255;
                int var9 = var8;
                int var10 = var5 * var5 >> 12;
                int var11 = var8 * var8 >> 12;
                int var12 = var8;
                int var13;
                for (var13 = 0; var10 + var11 < 16384 && this.field4246 > var13; var13++) {
                    var9 = (var6 * var9 >> 12) * 2 + var12;
                    var6 = var10 + var7 - var11;
                    var10 = var6 * var6 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = var13 >= (this.field4246 - 1) ? 0 : (var13 << 12) / this.field4246;
            }
        }
        return var3;
    }
}
