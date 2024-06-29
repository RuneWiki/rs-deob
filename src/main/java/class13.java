import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class13 extends class539 {

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "I")
    public int field217;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
    public int field216;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "Lqaa;")
    public static class26 field214 = new class26();

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V", line = 5)
    public static void method60(byte arg0) {
        if (arg0 != 110) {
            field214 = null;
        }
        field214 = null;
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(II)V", line = 20)
    public class13(int arg0, int arg1) {
        this.field217 = arg1;
        this.field216 = arg0;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)I", line = 29)
    public static final int method61(int arg0) {
        field215++;
        if (class612.field8489 == null) {
            if (!class229.field3278 && class315.field4697 > 0) {
                if (class46.field689 && class531.field7246.method666(50, 81) && class315.field4697 > 2) {
                    return ((class345) class487.field6761.field2826.field7306.field7306).field4981;
                }
                return ((class345) class487.field6761.field2826.field7306).field4981;
            }
            int var1 = class46.field686.method70((byte) -65);
            int var2 = class46.field686.method66(74);
            int var3 = class113.field1532;
            int var4 = class174.field2605;
            int var5 = class364.field5200;
            if (var3 < var1 && (var3 + var5) > var1) {
                int var6 = -1;
                for (int var7 = 0; var7 < class315.field4697; var7++) {
                    if (class36.field450) {
                        int var12 = (class315.field4697 - var7 - 1) * 16 + var4 + 33;
                        if ((var12 - 13) < var2 && var12 + 3 >= var2) {
                            var6 = var7;
                        }
                    } else {
                        int var11 = (class315.field4697 - var7 - 1) * 16 + var4 + 31;
                        if (var2 > (var11 - 13) && (var11 + 3) >= var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class440 var9 = new class440(class487.field6761);
                    for (class345 var10 = (class345) var9.method2522(arg0 ^ 0x1853); var10 != null; var10 = (class345) var9.method2524(arg0 + 13790)) {
                        if (var6 == (var8++)) {
                            return var10.field4981;
                        }
                    }
                }
            }
        }
        return arg0 == 6227 ? -1 : -75;
    }
}
