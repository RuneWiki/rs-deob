import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class121 extends class41 {

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "I")
    public int field1979 = 0;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
    public int field1984 = -1;

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "[Lqh;")
    public static class100[] field1992 = new class100[100];

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "Lsc;")
    public static class181 field1985 = class149.method967(255, "Fallen lassen");

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "[I")
    public static int[] field1993 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    public int field1975;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public int field1976;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
    public int field1980;

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
    public int field1981;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
    public int field1982;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
    public int field1983;

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "I")
    public int field1986;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "I")
    public int field1988;

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "I")
    public int field1990;

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "I")
    public int field1991;

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "[I")
    public static int[] field1978;

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "[[B")
    public static byte[][] field1989;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZIZILjb;)V")
    public static final void method793(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, class11 arg5) {
        class218.field3765 = arg5;
        class203.field3498 = arg2;
        class255.field4466 = arg4;
        class43.field674 = arg0;
        class145.field2376 = arg3;
        field1987++;
        if (arg1) {
            field1978 = null;
        }
        class263.field4577 = 10000;
        class97.field1575 = 1;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V")
    public static void method794(byte arg0) {
        field1989 = null;
        field1978 = null;
        int var1 = 71 / ((arg0 + 67) / 43);
        field1985 = null;
        field1993 = null;
        field1992 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZILsc;)V")
    public static final void method795(boolean arg0, int arg1, class181 arg2) {
        byte var3 = 4;
        field1994++;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class18.field316.method1676(arg2, 250);
        int var7 = class18.field316.method1664(arg2, 250) * 13;
        class17.method156(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var7 - -var3, 0);
        class17.method155(var4 - var3, var5 - var3, var6 + var3 + var3, var3 + var7 + var3, 16777215);
        class18.field316.method1662(arg2, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        int var8 = 80 / ((arg1 - 26) / 63);
        class191.method1318(var3 + var6 + var3, var4 - var3, var5 - var3, var3 + var7 + var3, -17);
        if (!arg0) {
            class265.method1799(var4, var5, (byte) 90, var6, var7);
            return;
        }
        try {
            Graphics var9 = class107.field1740.getGraphics();
            class90.field1438.method386(var9, 0, 0, 0);
        } catch (Exception var10) {
            class107.field1740.repaint();
        }
    }
}
