import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class52 extends class128 {

    @OriginalMember(owner = "client!fk", name = "C", descriptor = "I")
    public int field878;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public int field864;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "[I")
    public int[] field872;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "[I")
    public int[] field863;

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "[Z")
    public boolean[] field876;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "[[I")
    public int[][] field866;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "I")
    public static int field875 = 0;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "Lag;")
    public static class211 field871;

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "Ldk;")
    public static class251 field877;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public static final void method360(boolean arg0, Component arg1) {
        field867++;
        arg1.addMouseListener(class177.field2899);
        arg1.addMouseMotionListener(class177.field2899);
        arg1.addFocusListener(class177.field2899);
        if (!arg0) {
            method362((char) 65500, -37);
        }
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "(I)V")
    public static final void method361(int arg0) {
        class263.field4225 = null;
        class184.field3019 = null;
        class62.field1023 = null;
        class79.field1316 = null;
        class293.field4703 = null;
        class126.field1994 = null;
        field862++;
        class155.field2418 = null;
        class224.field3644 = null;
        class132.field2079 = null;
        class131.field2059 = null;
        class301.field4814 = null;
        class308.field4929 = null;
        int var1 = -22 / ((24 - arg0) / 52);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(CI)Z")
    public static final boolean method362(char arg0, int arg1) {
        field873++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var2 = class209.field3319;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        return arg1 != 160;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field868++;
        int var7 = arg0 + arg2;
        for (int var8 = arg0; var8 < var7; var8++) {
            class73.method494(arg5, class204.field3253[var8], 4028, arg1, arg3);
        }
        int var9 = arg1 - arg2;
        int var10 = arg6 - arg2;
        if (arg4 != 0) {
            field870 = -122;
        }
        for (int var11 = arg6; var11 > var10; var11--) {
            class73.method494(arg5, class204.field3253[var11], 4028, arg1, arg3);
        }
        int var12 = arg3 + arg2;
        for (int var13 = var7; var13 <= var10; var13++) {
            int[] var14 = class204.field3253[var13];
            class73.method494(arg5, var14, 4028, var12, arg3);
            class73.method494(arg5, var14, 4028, arg1, var9);
        }
    }

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "(I)V")
    public static void method364(int arg0) {
        field871 = null;
        if (arg0 == 14819) {
            field877 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(I[B)V")
    public class52(int arg0, byte[] arg1) {
        this.field878 = arg0;
        class162 var3 = new class162(arg1);
        this.field864 = var3.method1133((byte) 53);
        this.field872 = new int[this.field864];
        this.field863 = new int[this.field864];
        this.field876 = new boolean[this.field864];
        this.field866 = new int[this.field864][];
        for (int var4 = 0; var4 < this.field864; var4++) {
            this.field863[var4] = var3.method1133((byte) 53);
        }
        for (int var5 = 0; var5 < this.field864; var5++) {
            this.field876[var5] = var3.method1133((byte) 53) == 1;
        }
        for (int var6 = 0; var6 < this.field864; var6++) {
            this.field872[var6] = var3.method1142(-18970);
        }
        for (int var7 = 0; var7 < this.field864; var7++) {
            this.field866[var7] = new int[var3.method1133((byte) 53)];
        }
        for (int var8 = 0; var8 < this.field864; var8++) {
            for (int var9 = 0; var9 < this.field866[var8].length; var9++) {
                this.field866[var8][var9] = var3.method1133((byte) 53);
            }
        }
    }
}
