import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class312 {

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lin;Ljava/lang/String;ZB)Ltu;")
    public static final class350 method2031(class91 arg0, String arg1, boolean arg2, byte arg3) {
        field4339++;
        int var4 = arg0.method870(arg1, 0);
        if (arg3 != -91) {
            return null;
        } else if (var4 == -1) {
            return new class350(0);
        } else {
            int[] var5 = arg0.method849(var4, arg3 ^ 0xFFFFFFA5);
            class350 var6 = new class350(var5.length);
            int var7 = 0;
            int var8 = 0;
            while (true) {
                while (var7 < var6.field4884) {
                    class215 var9 = new class215(arg0.method863(-1860, var4, var5[var8++]));
                    int var10 = var9.method1533((byte) -126);
                    int var11 = var9.method1478(arg3 ^ 0xCDCA075D);
                    int var12 = var9.method1535(255);
                    if (!arg2 && var12 == 1) {
                        var6.field4884--;
                    } else {
                        var6.field4881[var7] = var10;
                        var6.field4882[var7] = var11;
                        var7++;
                    }
                }
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(BIZ)I")
    public static final int method2032(byte arg0, int arg1, boolean arg2) {
        field4340++;
        if (arg2) {
            return 0;
        }
        class6 var3 = class284.method1863((byte) -9, arg1, arg2);
        if (var3 == null) {
            return class422.field6085.method1061(109, arg1).field1295;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field44.length; var5++) {
            if (var3.field44[var5] == -1) {
                var4++;
            }
        }
        if (arg0 != 35) {
            method2032((byte) -102, 43, true);
        }
        return var4 + class422.field6085.method1061(82, arg1).field1295 - var3.field44.length;
    }
}
