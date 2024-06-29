import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public abstract class class133 {

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Lsc;")
    public static class290 field1636 = new class290();

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "Lcea;")
    public static class180 field1638 = new class180("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "F")
    public static float field1639;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field1637;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 4)
    public static void method745(int arg0) {
        field1638 = null;
        field1636 = null;
        if (arg0 >= 25) {
            field1637 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZII)V", line = 16)
    public static final void method746(boolean arg0, int arg1, int arg2) {
        field1635++;
        class125 var3 = class256.method1445(arg1, (byte) -19, arg0);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < var3.field1535.length; var4++) {
            var3.field1535[var4] = -1;
            var3.field1538[var4] = 0;
        }
        if (arg2 <= 12) {
            method746(false, 18, -53);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([[BILvk;)V", line = 45)
    public static final void method748(byte[][] arg0, int arg1, class308 arg2) {
        field1633++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg0.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg0[var5];
            if (var10 != null) {
                class374 var11 = new class374(var10);
                int var12 = class633.field9116[var5] >> 8;
                int var13 = class633.field9116[var5] & 0xFF;
                int var14 = var12 * 64 - class632.field9113;
                int var15 = var13 * 64 - class119.field1504;
                class93.method560(true);
                arg2.method2768(var14, class632.field9113, class309.field3939, var15, var11, class119.field1504, -1);
                arg2.method1705((byte) 124, var14, var3, var11, var15, class210.field2560);
                if (!arg2.field6677 && class343.field4424 / 8 == var12 && class522.field7330 / 8 == var13 && var3[0] != -1) {
                    class259.field3340 = class562.field8276.method2983(class643.field9362, var3[0], var3[3], var3[2], var3[1], -20980);
                    class53.field452 = var3[4];
                }
            }
        }
        if (arg1 != -24278) {
            return;
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class633.field9116[var6] >> 8) * 64 - class632.field9113;
            int var8 = (class633.field9116[var6] & 0xFF) * 64 - class119.field1504;
            byte[] var9 = arg0[var6];
            if (var9 == null && class522.field7330 < 800) {
                class93.method560(true);
                arg2.method2764(64, 64, var8, var7, (byte) -53);
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lpk;Z)Lpk;")
    public abstract class169 method747(class169 arg0, boolean arg1);
}
