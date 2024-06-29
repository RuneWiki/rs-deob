import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class677 {

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field9482;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V", line = 7)
    public static final void method3750(byte arg0) {
        field9482++;
        if (arg0 <= 8) {
            return;
        }
        int[] var1 = new int[class770.field10602.field5656];
        int var2 = 0;
        for (int var3 = 0; var3 < class770.field10602.field5656; var3++) {
            class322 var5 = class770.field10602.method2467(125, var3);
            if (var5.field4674 >= 0 || var5.field4697 >= 0) {
                var1[var2++] = var3;
            }
        }
        class353.field5172 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class353.field5172[var4] = var1[var4];
        }
    }
}
