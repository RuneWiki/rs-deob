import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class78 extends class130 {

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "[Ltj;")
    public class170[] field1465;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "Lcd;")
    public static class64 field1460 = class44.method335((byte) 71, "leuchten1:");

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "I")
    public static int field1469 = -1;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "[I")
    public static int[] field1463 = new int[32];

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "Lmf;")
    public static class43 field1461 = new class43(128);

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "I")
    public static int field1470 = 0;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!pf", name = "E", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)Z", line = 15)
    public final boolean method614(int arg0, int arg1) {
        if (arg0 != -1) {
            method615(96, 91, (class222) null);
        }
        field1468++;
        return this.field1465[arg1].field2959;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IILqm;)Lvd;", line = 32)
    public static final class127 method615(int arg0, int arg1, class222 arg2) {
        field1466++;
        if (class56.method432(arg2, arg0, arg1 + 2011695403)) {
            if (arg1 != 1) {
                field1467 = 93;
            }
            return class41.method319(false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)V", line = 51)
    public static void method616(byte arg0) {
        field1461 = null;
        if (arg0 < -62) {
            field1460 = null;
            field1463 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLcd;B)V", line = 64)
    public static final void method617(boolean arg0, class64 arg1, byte arg2) {
        field1464++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class278.field4796.method1277(arg1, 250);
        int var7 = class278.field4796.method1266(arg1, 250) * 13;
        if (class123.field2216) {
            class21.method208(var4 - var3, -var3 + var5, var6 + var3 + var3, var3 + var7 + var3, 0);
            class21.method212(var4 - var3, -var3 + var5, var6 - (-var3 - var3), var3 - -var3 + var7, 16777215);
        } else {
            class210.method1469(var4 - var3, -var3 + var5, var3 + var3 + var6, var7 - (-var3 - var3), 0);
            class210.method1468(var4 - var3, var5 - var3, var6 + var3 + var3, var3 + var7 + var3, 16777215);
        }
        class278.field4796.method1257(arg1, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class168.method1192((byte) -112, var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var7 + var3);
        if (arg2 != -110) {
            method616((byte) 78);
        }
        if (!arg0) {
            class56.method431((byte) 31, var4, var6, var5, var7);
        } else if (class123.field2216) {
            class123.method879();
        } else {
            try {
                Graphics var8 = class307.field5251.getGraphics();
                class183.field3130.method673(-86, var8, 0, 0);
            } catch (Exception var10) {
                class307.field5251.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lqm;Lqm;IZ)V", line = 120)
    public class78(class222 arg0, class222 arg1, int arg2, boolean arg3) {
        class106 var5 = new class106();
        int var6 = arg0.method1600(arg2, (byte) -63);
        this.field1465 = new class170[var6];
        int[] var7 = arg0.method1592(-11, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class72 var9 = null;
            byte[] var10 = arg0.method1580(0, var7[var8], arg2);
            int var11 = var10[1] & 0xFF | var10[0] & 0xFF << 8;
            for (class72 var12 = (class72) var5.method778(0); var12 != null; var12 = (class72) var5.method775(26517)) {
                if (var12.field1388 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1609(119, 0, var11);
                } else {
                    var13 = arg1.method1609(114, var11, 0);
                }
                var9 = new class72(var11, var13);
                var5.method781(var9, 10751);
            }
            this.field1465[var7[var8]] = new class170(var10, var9);
        }
    }
}
