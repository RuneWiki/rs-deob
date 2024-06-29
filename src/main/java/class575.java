import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class575 extends class324 {

    @OriginalMember(owner = "client!sv", name = "u", descriptor = "I")
    public int field8302;

    @OriginalMember(owner = "client!sv", name = "q", descriptor = "I")
    public int field8298;

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "[Z")
    public boolean[] field8291;

    @OriginalMember(owner = "client!sv", name = "n", descriptor = "[I")
    public int[] field8295;

    @OriginalMember(owner = "client!sv", name = "k", descriptor = "[[I")
    public int[][] field8292;

    @OriginalMember(owner = "client!sv", name = "l", descriptor = "[I")
    public int[] field8293;

    @OriginalMember(owner = "client!sv", name = "p", descriptor = "Lea;")
    public static class474 field8297 = new class474(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!sv", name = "r", descriptor = "Lea;")
    public static class474 field8299 = new class474("Loading SW3D - ", "Lade SW3D - ", "Chargement SW3D - ", "Carregando SW3D - ");

    @OriginalMember(owner = "client!sv", name = "m", descriptor = "I")
    public static int field8294;

    @OriginalMember(owner = "client!sv", name = "o", descriptor = "I")
    public static int field8296;

    @OriginalMember(owner = "client!sv", name = "s", descriptor = "I")
    public static int field8300;

    @OriginalMember(owner = "client!sv", name = "v", descriptor = "I")
    public static int field8303;

    @OriginalMember(owner = "client!sv", name = "t", descriptor = "Lup;")
    public static class233 field8301;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
    public static void method3338(int arg0) {
        field8299 = null;
        field8301 = null;
        field8297 = null;
        int var1 = -114 % ((21 - arg0) / 63);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lqn;I)Z")
    public static final boolean method3339(class57 arg0, int arg1) {
        field8300++;
        class385 var2 = field8301.method1499(-7532, arg0.method89(-128));
        if (var2.field5850 == -1) {
            return true;
        } else if (arg1 > -14) {
            return true;
        } else {
            class565 var3 = class601.field8769.method108((byte) -103, var2.field5850);
            return var3.field8048 == -1 ? true : var3.method3269(false);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method3340(byte arg0, String arg1) {
        field8294++;
        int var2 = -57 / (arg0 / 38);
        return class149.method882(10, (byte) 125, true, arg1);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILfm;I)V")
    public static final void method3341(int arg0, class636 arg1, int arg2) {
        if (arg2 != -1) {
            return;
        }
        if (class100.field1187) {
            arg0 = 0;
            class100.field1187 = false;
        }
        field8303++;
        if (class193.field2555 != null && class193.field2555.method3627(arg1, ~arg2)) {
            return;
        }
        class193.field2555 = arg1;
        class443.field6632 = class84.method550((byte) -110);
        class550.field7846 = arg0;
        class398.field6051 = arg0;
        if (class398.field6051 != 0) {
            class637.field9162 = class3.field21;
            class30.field346 = class20.field203;
            class499.field7283 = class326.field4704;
            class347.field4967 = class410.field6247;
            class590.field8478 = class28.field294;
            class411.field6257 = class488.field7120;
            class436.field6497 = class601.field8778;
            class179.field2202 = class440.field6570;
            class558.field7954 = class592.field8496;
            class253.field3578 = class181.field2223;
            return;
        }
        class452.method2795((byte) -7);
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(I[B)V")
    public class575(int arg0, byte[] arg1) {
        this.field8302 = arg0;
        class194 var3 = new class194(arg1);
        this.field8298 = var3.method1177(255);
        this.field8291 = new boolean[this.field8298];
        this.field8295 = new int[this.field8298];
        this.field8292 = new int[this.field8298][];
        this.field8293 = new int[this.field8298];
        for (int var4 = 0; var4 < this.field8298; var4++) {
            this.field8293[var4] = var3.method1177(255);
            if (this.field8293[var4] == 6) {
                this.field8293[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field8298; var5++) {
            this.field8291[var5] = var3.method1177(255) == 1;
        }
        for (int var6 = 0; var6 < this.field8298; var6++) {
            this.field8295[var6] = var3.method1220(113);
        }
        for (int var7 = 0; var7 < this.field8298; var7++) {
            this.field8292[var7] = new int[var3.method1177(255)];
        }
        for (int var8 = 0; var8 < this.field8298; var8++) {
            for (int var9 = 0; var9 < this.field8292[var8].length; var9++) {
                this.field8292[var8][var9] = var3.method1177(255);
            }
        }
    }
}
