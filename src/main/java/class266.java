import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class266 extends class188 {

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
    public int field4194;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public int field4191;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "J")
    public static long field4192 = 0L;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
    public static int field4193 = 0;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "Ljh;")
    public static class299 field4196;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)V", line = 10)
    public static void method1873(int arg0) {
        field4196 = null;
        if (arg0 >= -85) {
            field4192 = 78L;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILfe;)V", line = 28)
    public static final void method1874(int arg0, class270 arg1) {
        if (arg0 != -21999) {
            field4193 = 40;
        }
        field4195++;
        for (int var2 = 0; var2 < class117.field1619.length; var2++) {
            class117.field1619[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) (Math.random() * 128.0D * (double) var3);
            class117.field1619[var5] = (int) (Math.random() * 284.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < var3 - 1; var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = (var7 << 7) + var8;
                    class278.field4377[var9] = (class117.field1619[var9 - 1] + class117.field1619[var9 + 128] + class117.field1619[var9 + 1] + class117.field1619[var9 + -128]) / 4;
                }
            }
            int[] var10 = class117.field1619;
            class117.field1619 = class278.field4377;
            class278.field4377 = var10;
        }
        if (arg1 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg1.field2361; var12++) {
            for (int var13 = 0; var13 < arg1.field2366; var13++) {
                if (arg1.field4255[var11++] != 0) {
                    int var14 = var13 + arg1.field2362 + 16;
                    int var15 = arg1.field2365 + var12 + 16;
                    int var16 = (var15 << 7) + var14;
                    class117.field1619[var16] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(II)V", line = 123)
    public class266(int arg0, int arg1) {
        this.field4194 = arg0;
        this.field4191 = arg1;
    }
}
