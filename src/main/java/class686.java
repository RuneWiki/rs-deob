import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class686 {

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field9786;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field9787;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZII)V")
    public static final void method3884(boolean arg0, int arg1, int arg2) {
        field9787++;
        class122 var3 = class673.method3829(1, arg0, arg1);
        if (var3 != null) {
            var3.method3045(true);
            if (arg2 != -20316) {
                method3885((byte) -19);
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)I")
    public static final int method3885(byte arg0) {
        field9786++;
        if (class386.field5135 == null) {
            if (!class361.field4805 && class271.field3704 > 0) {
                if (class189.field2310 && class376.field5043.method1687(-7653, 81) && class271.field3704 > 2) {
                    return ((class377) class34.field679.field2232.field7522.field7522).field5069;
                }
                return ((class377) class34.field679.field2232.field7522).field5069;
            }
            int var1 = class478.field6713.method1349(-112);
            int var2 = class478.field6713.method1338(1);
            int var3 = class22.field548;
            int var4 = class1.field2;
            int var5 = class675.field9685;
            if (var1 > var3 && (var3 + var5) > var1) {
                int var6 = -1;
                for (int var7 = 0; var7 < class271.field3704; var7++) {
                    if (class120.field1561) {
                        int var12 = (class271.field3704 - var7 - 1) * 16 + var4 + 33;
                        if (var12 - 13 < var2 && (var12 + 3) >= var2) {
                            var6 = var7;
                        }
                    } else {
                        int var11 = (class271.field3704 - var7 - 1) * 16 + var4 + 31;
                        if (var2 > (var11 - 13) && var11 + 3 >= var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class106 var9 = new class106(class34.field679);
                    for (class377 var10 = (class377) var9.method774(103); var10 != null; var10 = (class377) var9.method772(-84)) {
                        if ((var8++) == var6) {
                            return var10.field5069;
                        }
                    }
                }
            }
        }
        int var13 = 106 % ((arg0 + 63) / 33);
        return -1;
    }
}
