import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class77 {

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static volatile int field1751 = 0;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "Lfc;")
    private static class39 field1753 = class90.method774("Your account has been disabled)3", -102);

    @OriginalMember(owner = "client!la", name = "i", descriptor = "Lfc;")
    public static class39 field1754 = class90.method774("Welt", -109);

    @OriginalMember(owner = "client!la", name = "o", descriptor = "Lfc;")
    public static class39 field1760 = field1753;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "Lfc;")
    public static class39 field1762 = class90.method774("Standort", -117);

    @OriginalMember(owner = "client!la", name = "u", descriptor = "Lfc;")
    public static class39 field1766 = class90.method774("Ausw-=hlen", -97);

    @OriginalMember(owner = "client!la", name = "v", descriptor = "Lfc;")
    public static class39 field1767 = class90.method774("Lade Ignorieren)2Liste)3)3)3", -111);

    @OriginalMember(owner = "client!la", name = "s", descriptor = "Lp;")
    public static class104 field1764 = new class104(64);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public int field1747;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public int field1748;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public int field1749;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public int field1756;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public int field1758;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public int field1759;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public int field1761;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "[B")
    public byte[] field1757;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "[B")
    public byte[] field1763;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "[Lob;")
    public static class99[] field1768;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 5)
    public static void method674(int arg0) {
        field1753 = null;
        field1766 = null;
        if (arg0 >= -97) {
            field1764 = null;
        }
        field1762 = null;
        field1754 = null;
        field1768 = null;
        field1764 = null;
        field1760 = null;
        field1767 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILoc;)Lue;", line = 25)
    public static final class141 method675(int arg0, int arg1, class100 arg2) {
        if (arg0 != 0) {
            method675(-26, -42, null);
        }
        field1750++;
        return class38.method431(false, arg2, arg1) ? class120.method1031(-127) : null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)Lb;", line = 39)
    public static final class8 method676(byte arg0) {
        if (arg0 != -67) {
            method676((byte) 123);
        }
        field1746++;
        class8 var1 = new class8();
        var1.field243 = class44.field1189;
        var1.field242 = class131.field3287[0];
        var1.field244 = class72.field1686[0];
        var1.field239 = class115.field3026[0];
        var1.field241 = class1.field3;
        byte[] var2 = class15.field395[0];
        var1.field245 = class101.field2515[0];
        int var3 = var1.field245 * var1.field239;
        var1.field240 = new int[var3];
        for (int var4 = 0; var4 < var3; var4++) {
            var1.field240[var4] = class1.field27[class87.method747(255, var2[var4])];
        }
        class114.method994(-20);
        return var1;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V", line = 103)
    public static final void method677(int arg0) {
        try {
            Graphics var1 = class140.field3523.getGraphics();
            if (arg0 < 123) {
                method675(94, 119, null);
            }
            class97.field2297.method129(var1, 550, 4, (byte) -128);
        } catch (Exception var2) {
            class140.field3523.repaint();
        }
        field1765++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII)I", line = 140)
    public static final int method678(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 > 179) {
            arg2 /= 2;
        }
        if (arg0 > 192) {
            arg2 /= 2;
        }
        field1755++;
        if (arg0 > 217) {
            arg2 /= 2;
        }
        if (arg1 >= -90) {
            field1764 = null;
        }
        if (arg0 > 243) {
            arg2 /= 2;
        }
        return (arg2 / 32 << 7) + (arg3 / 4 << 10) + arg0 / 2;
    }
}
