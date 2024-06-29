import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class48 {

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public int field636;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public int field637;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public int field639;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public int field640;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)[Ldm;", line = 8)
    public static final class48[] method289(byte arg0) {
        field638++;
        if (arg0 != -37) {
            return null;
        }
        if (class167.field1964 == null) {
            class48[] var1 = class177.method1055(class386.field4955, (byte) -38);
            class48[] var2 = new class48[var1.length];
            int var3 = 0;
            int var4 = class611.field8310.method2736(arg0 ^ 0x4D, class628.field8526);
            label72: for (int var5 = 0; var5 < var1.length; var5++) {
                class48 var9 = var1[var5];
                if ((var9.field640 <= 0 || var9.field640 >= 24) && var9.field637 >= 800 && var9.field636 >= 600 && (var4 != 2 || var9.field637 <= 800 && var9.field636 <= 600) && (var4 != 1 || var9.field637 <= 1024 && var9.field636 <= 768)) {
                    for (int var10 = 0; var10 < var3; var10++) {
                        class48 var11 = var2[var10];
                        if (var9.field637 == var11.field637 && var9.field636 == var11.field636) {
                            if (var9.field640 > var11.field640) {
                                var2[var10] = var9;
                            }
                            continue label72;
                        }
                    }
                    var2[var3] = var9;
                    var3++;
                }
            }
            class167.field1964 = new class48[var3];
            class70.method553(var2, 0, class167.field1964, 0, var3);
            int[] var6 = new int[class167.field1964.length];
            for (int var7 = 0; var7 < class167.field1964.length; var7++) {
                class48 var8 = class167.field1964[var7];
                var6[var7] = var8.field637 * var8.field636;
            }
            class39.method251(class167.field1964, (byte) -98, var6);
        }
        return class167.field1964;
    }
}
