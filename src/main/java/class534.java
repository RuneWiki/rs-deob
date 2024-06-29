import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class534 {

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    public static int field6741 = 999999;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILmc;)Lbp;")
    public static final class167 method2913(int arg0, class234 arg1) {
        field6742++;
        class14 var2 = class600.method3240(-8314, arg1);
        int var3 = arg1.method1497((byte) 93);
        int var4 = arg1.method1497((byte) 125);
        int var5 = -17 % ((arg0 - 13) / 47);
        int var6 = arg1.method1553((byte) -1);
        return new class167(var2.field149, var2.field143, var2.field144, var2.field151, var2.field140, var2.field141, var2.field146, var2.field150, var2.field142, var3, var4, var6);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "()V")
    public static final void method2914() {
        for (int var0 = class691.field8887; var0 < class78.field1121; var0++) {
            for (int var1 = 0; var1 < class330.field4039; var1++) {
                for (int var2 = 0; var2 < class559.field7102; var2++) {
                    class766 var3 = class28.field252[var0][var1][var2];
                    if (var3 != null) {
                        class721 var4 = var3.field10433;
                        class721 var5 = var3.field10423;
                        if (var4 != null && var4.method171(-119)) {
                            class500.method2775(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method171(-126)) {
                                class500.method2775(var5, var0, var1, var2, 1, 1);
                                var5.method174(false, 0, (byte) -126, var4, class398.field5275, 0, 0);
                                var5.method185(0);
                            }
                            var4.method185(0);
                        }
                        for (class569 var6 = var3.field10431; var6 != null; var6 = var6.field7189) {
                            class620 var8 = var6.field7193;
                            if (var8 != null && var8.method171(-90)) {
                                class500.method2775(var8, var0, var1, var2, var8.field7849 + 1 - var8.field7852, var8.field7850 - var8.field7844 + 1);
                                var8.method185(0);
                            }
                        }
                        class417 var7 = var3.field10426;
                        if (var7 != null && var7.method171(-87)) {
                            class116.method687(var7, var0, var1, var2);
                            var7.method185(0);
                        }
                    }
                }
            }
        }
    }
}
