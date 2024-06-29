import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class360 {

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([[[Lq;B)V", line = 8)
    public static final void method2169(class172[][][] arg0, byte arg1) {
        field5088++;
        if (arg1 <= 121) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class172[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class172 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field2595 instanceof class226) {
                            ((class226) var6.field2595).method1172((byte) 118);
                        }
                        if (var6.field2591 instanceof class226) {
                            ((class226) var6.field2591).method1172((byte) 79);
                        }
                        if (var6.field2598 instanceof class226) {
                            ((class226) var6.field2598).method1172((byte) 93);
                        }
                        if (var6.field2593 instanceof class226) {
                            ((class226) var6.field2593).method1172((byte) 84);
                        }
                        if (var6.field2600 instanceof class226) {
                            ((class226) var6.field2600).method1172((byte) 81);
                        }
                        for (class11 var7 = var6.field2594; var7 != null; var7 = var7.field145) {
                            class208 var8 = var7.field143;
                            if (var8 instanceof class226) {
                                ((class226) var8).method1172((byte) 75);
                            }
                        }
                    }
                }
            }
        }
    }
}
