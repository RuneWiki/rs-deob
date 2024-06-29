import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class83 extends class107 {

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "I")
    public int field1864;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    private int field1857;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "[I")
    public int[] field1855;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "[[I")
    public int[][] field1863;

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "Lvc;")
    public static class137 field1865 = class45.method325("Suche nach Updates )2 ", -46);

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "[B")
    public static byte[] field1870 = new byte[520];

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "Lvc;")
    private static class137 field1867 = class45.method325("Unable to connect)3", -46);

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "[I")
    public static int[] field1871 = new int[50];

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "Lvc;")
    public static class137 field1873 = field1867;

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "Lvc;")
    public static class137 field1875 = field1867;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "[I")
    public static int[] field1861 = new int[2000];

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "Lvc;")
    public static class137 field1876 = class45.method325("auf der Hautpseite)3", -46);

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "[I")
    public static int[] field1872 = new int[200];

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "Laa;")
    public static class2 field1856;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "Lfc;")
    public static class39 field1869;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "Ljava/awt/Image;")
    public static Image field1858;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "Z")
    public static boolean field1868;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)Z")
    public static final boolean method604(int arg0, int arg1) {
        field1862++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class78.field1721[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (arg1 <= 96) {
            field1865 = null;
        }
        return var2 == 36;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
    public static final void method605(int arg0) {
        field1860++;
        try {
            Graphics var1 = class124.field2871.getGraphics();
            if (arg0 != 0) {
                method608(13, -7, -20, 15, null, 82, -18, 95);
            }
            class10.field208.method61(553, var1, 205, (byte) -42);
        } catch (Exception var2) {
            class124.field2871.repaint();
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)V")
    public static final void method606(byte arg0) {
        field1874++;
        if (arg0 != 66) {
            field1861 = null;
        }
        class85.field1981.method763((byte) 45);
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(I[B)V")
    public class83(int arg0, byte[] arg1) {
        this.field1864 = arg0;
        class109 var3 = new class109(arg1);
        this.field1857 = var3.method838(255);
        this.field1855 = new int[this.field1857];
        this.field1863 = new int[this.field1857][];
        for (int var4 = 0; var4 < this.field1857; var4++) {
            this.field1855[var4] = var3.method838(255);
        }
        for (int var5 = 0; var5 < this.field1857; var5++) {
            this.field1863[var5] = new int[var3.method838(255)];
        }
        for (int var6 = 0; var6 < this.field1857; var6++) {
            for (int var7 = 0; var7 < this.field1863[var6].length; var7++) {
                this.field1863[var6][var7] = var3.method838(255);
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)V")
    public static void method607(byte arg0) {
        field1865 = null;
        field1858 = null;
        field1869 = null;
        field1872 = null;
        if (arg0 <= 52) {
            return;
        }
        field1875 = null;
        field1871 = null;
        field1867 = null;
        field1870 = null;
        field1873 = null;
        field1861 = null;
        field1856 = null;
        field1876 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIILqe;III)V")
    public static final void method608(int arg0, int arg1, int arg2, int arg3, class109 arg4, int arg5, int arg6, int arg7) {
        field1859++;
        if (arg2 != 49) {
            method604(-59, -44);
        }
        if (arg1 < 0 || arg1 >= 104 || arg0 < 0 || arg0 >= 104) {
            while (true) {
                int var10 = arg4.method838(255);
                if (var10 == 0) {
                    return;
                }
                if (var10 == 1) {
                    arg4.method838(255);
                    return;
                }
                if (var10 <= 49) {
                    arg4.method838(arg2 + 206);
                }
            }
        }
        class70.field1490[arg5][arg1][arg0] = 0;
        while (true) {
            int var8 = arg4.method838(255);
            if (var8 == 0) {
                if (arg5 == 0) {
                    class61.field1329[0][arg1][arg0] = -class45.method328(true, arg7 + arg1 + 932731, arg3 + 556238 + arg0) * 8;
                    return;
                } else {
                    class61.field1329[arg5][arg1][arg0] = class61.field1329[arg5 - 1][arg1][arg0] - 240;
                    return;
                }
            }
            if (var8 == 1) {
                int var9 = arg4.method838(255);
                if (var9 == 1) {
                    var9 = 0;
                }
                if (arg5 != 0) {
                    class61.field1329[arg5][arg1][arg0] = class61.field1329[arg5 - 1][arg1][arg0] - var9 * 8;
                    return;
                }
                class61.field1329[0][arg1][arg0] = -var9 * 8;
                return;
            }
            if (var8 <= 49) {
                class98.field2300[arg5][arg1][arg0] = arg4.method816(114);
                class84.field1896[arg5][arg1][arg0] = (byte) ((var8 - 2) / 4);
                class134.field3108[arg5][arg1][arg0] = (byte) class45.method323(var8 + arg6 - 2, 3);
            } else if (var8 <= 81) {
                class70.field1490[arg5][arg1][arg0] = (byte) (var8 - 49);
            } else {
                class78.field1746[arg5][arg1][arg0] = (byte) (var8 - 81);
            }
        }
    }
}
