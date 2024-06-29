import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class620 extends class65 {

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public int field8716;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public int field8713;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "[[I")
    public int[][] field8717;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "[I")
    public int[] field8715;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "[Z")
    public boolean[] field8718;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "[I")
    public int[] field8714;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "Ltm;")
    public static class334 field8719 = new class334(111, -1);

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public static int field8723 = 1;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "Ltm;")
    public static class334 field8722 = new class334(79, 7);

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public static int field8720;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "Ljava/io/FileOutputStream;")
    public static FileOutputStream field8721;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIB)V")
    public static final void method3527(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field8720++;
        if (arg4 != 36) {
            method3528((byte) 20);
        }
        if (class76.field1126 <= arg2 && class461.field6699 >= arg2) {
            int var5 = class487.method2955(class184.field3102, class657.field9347, (byte) -125, arg1);
            int var6 = class487.method2955(class184.field3102, class657.field9347, (byte) 55, arg3);
            class755.method4204(false, arg2, var5, var6, arg0);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
    public static void method3528(byte arg0) {
        if (arg0 != -110) {
            field8722 = null;
        }
        field8721 = null;
        field8719 = null;
        field8722 = null;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(I[B)V")
    public class620(int arg0, byte[] arg1) {
        this.field8716 = arg0;
        class301 var3 = new class301(arg1);
        this.field8713 = var3.method1987(-52);
        this.field8717 = new int[this.field8713][];
        this.field8715 = new int[this.field8713];
        this.field8718 = new boolean[this.field8713];
        this.field8714 = new int[this.field8713];
        for (int var4 = 0; var4 < this.field8713; var4++) {
            this.field8715[var4] = var3.method1987(-80);
            if (this.field8715[var4] == 6) {
                this.field8715[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field8713; var5++) {
            this.field8718[var5] = var3.method1987(-123) == 1;
        }
        for (int var6 = 0; var6 < this.field8713; var6++) {
            this.field8714[var6] = var3.method1989((byte) -62);
        }
        for (int var7 = 0; var7 < this.field8713; var7++) {
            this.field8717[var7] = new int[var3.method1987(-105)];
        }
        for (int var8 = 0; var8 < this.field8713; var8++) {
            for (int var9 = 0; var9 < this.field8717[var8].length; var9++) {
                this.field8717[var8][var9] = var3.method1987(-44);
            }
        }
    }
}
