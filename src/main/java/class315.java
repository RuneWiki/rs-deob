import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class315 {

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "[I")
    public static int[] field4617;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field4616;

    static {
        new class409("Ok", "Okay", "OK", "Ok");
        field4617 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };
        field4618 = -1;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V", line = 5)
    public static void method2082(byte arg0) {
        field4617 = null;
        if (arg0 >= -12) {
            method2082((byte) -122);
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)V", line = 19)
    public static final void method2083(byte arg0) {
        field4616++;
        int var1 = class189.field2648.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class189.field2648[var2] != null) {
                int var4 = -1;
                for (int var5 = 0; var5 < class337.field4972; var5++) {
                    if (class421.field6097[var5] == class356.field5174[var2]) {
                        var4 = var5;
                        break;
                    }
                }
                if (var4 == -1) {
                    class421.field6097[class337.field4972] = class356.field5174[var2];
                    var4 = class337.field4972++;
                }
                class256 var6 = new class256(class189.field2648[var2]);
                int var7 = 0;
                while (class189.field2648[var2].length > var6.field3762 && var7 < 511 && class14.field231 < 1023) {
                    int var8 = var7++ << 6 | var4;
                    int var9 = var6.method1767(1930493576);
                    int var10 = var9 >> 14;
                    int var11 = var9 >> 7 & 0x3F;
                    int var12 = var9 & 0x3F;
                    int var13 = (class356.field5174[var2] >> 8) * 64 + var11 - class28.field399;
                    int var14 = (class356.field5174[var2] & 0xFF) * 64 + var12 - class134.field1846;
                    class327 var15 = class295.method1963(123, var6.method1767(1930493576));
                    if (class364.field5260[var8] == null && (var15.field4852 & 0x1) > 0 && class276.field4085 == var10 && var13 >= 0 && class195.field2745 > (var15.field4819 + var13) && var14 >= 0 && class78.field984 > var15.field4819 + var14) {
                        class364.field5260[var8] = new class26();
                        class364.field5260[var8].field777 = var8;
                        class26 var16 = class364.field5260[var8];
                        class301.field4380[class14.field231++] = var8;
                        var16.field720 = class388.field5665;
                        var16.method273(var15, -27397);
                        var16.method445(var16.field369.field4819, 10);
                        var16.field769 = var16.field369.field4843 << 3;
                        if (var16.field769 == 0) {
                            var16.method437(0, 10);
                        } else {
                            var16.method437((var16.field369.field4825 + 4 & 0x8F200007) << 11, 10);
                        }
                        var16.method274(var10, var14, (byte) -35, var13, true, var16.method446(10));
                    }
                }
            }
        }
        int var3 = 121 / ((11 - arg0) / 44);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ICLjava/lang/String;)I", line = 114)
    public static final int method2084(int arg0, char arg1, String arg2) {
        field4615++;
        int var3 = 0;
        int var4 = arg2.length();
        if (arg0 > -119) {
            return -89;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg2.charAt(var5) == arg1) {
                var3++;
            }
        }
        return var3;
    }
}
