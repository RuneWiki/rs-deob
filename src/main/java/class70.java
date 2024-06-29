import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class70 {

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "[S")
    public static short[] field977 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field980 = 1;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "Lij;")
    public static class316 field975;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
    public static void method554(byte arg0) {
        int var1 = 17 % ((arg0 - 90) / 36);
        field975 = null;
        field977 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)[B")
    public static final synchronized byte[] method555(byte arg0, int arg1) {
        field979++;
        if (arg1 == 100 && class264.field3628 > 0) {
            byte[] var2 = class344.field4660[--class264.field3628];
            class344.field4660[class264.field3628] = null;
            return var2;
        } else if (arg1 == 5000 && class87.field1225 > 0) {
            byte[] var3 = class445.field6239[--class87.field1225];
            class445.field6239[class87.field1225] = null;
            return var3;
        } else {
            if (arg0 != 91) {
                method554((byte) -76);
            }
            if (arg1 == 30000 && class393.field5455 > 0) {
                byte[] var4 = class391.field5437[--class393.field5455];
                class391.field5437[class393.field5455] = null;
                return var4;
            } else {
                return new byte[arg1];
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(BI)V")
    public static final void method556(byte arg0, int arg1) {
        field981++;
        if (arg0 <= 27) {
            method558(-61);
        }
        class26 var2 = class217.method1445(true, arg1, 12);
        var2.method164(12);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILij;Ljava/lang/String;Z)Lep;")
    public static final class147 method557(int arg0, class316 arg1, String arg2, boolean arg3) {
        field978++;
        int var4 = arg1.method1909(-1, arg2);
        if (var4 == -1) {
            return new class147(0);
        }
        int[] var5 = arg1.method1936(-69, var4);
        if (arg0 != -251) {
            method556((byte) -28, 97);
        }
        class147 var6 = new class147(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field2132) {
                class366 var9 = new class366(arg1.method1926(0, var5[var8++], var4));
                int var10 = var9.method2258(arg0 ^ 0xB9D08ACD);
                int var11 = var9.method2297(13352);
                int var12 = var9.method2306((byte) 55);
                if (!arg3 && var12 == 1) {
                    var6.field2132--;
                } else {
                    var6.field2133[var7] = var10;
                    var6.field2140[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static final void method558(int arg0) {
        field976++;
        class85.field1201 = new class218(8);
        class90.field1261 = arg0;
        for (class240 var1 = (class240) class337.field4558.method2480(arg0 ^ 0x1EE0); var1 != null; var1 = (class240) class337.field4558.method2482(arg0 + 50)) {
            var1.method1559();
        }
    }
}
