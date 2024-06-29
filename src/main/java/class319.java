import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class319 extends class134 {

    @OriginalMember(owner = "client!fda", name = "n", descriptor = "I")
    public int field4072;

    @OriginalMember(owner = "client!fda", name = "k", descriptor = "I")
    public int field4069;

    @OriginalMember(owner = "client!fda", name = "m", descriptor = "[I")
    public int[] field4071;

    @OriginalMember(owner = "client!fda", name = "l", descriptor = "[[I")
    public int[][] field4070;

    @OriginalMember(owner = "client!fda", name = "o", descriptor = "[I")
    public int[] field4073;

    @OriginalMember(owner = "client!fda", name = "u", descriptor = "[Z")
    public boolean[] field4079;

    @OriginalMember(owner = "client!fda", name = "j", descriptor = "F")
    public static float field4068 = 0.0F;

    @OriginalMember(owner = "client!fda", name = "p", descriptor = "I")
    public static int field4074 = 1;

    @OriginalMember(owner = "client!fda", name = "q", descriptor = "I")
    public static int field4075 = 1401;

    @OriginalMember(owner = "client!fda", name = "r", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!fda", name = "s", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!fda", name = "t", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Ljava/io/File;ZI)[B", line = 6)
    public static final byte[] method1909(File arg0, boolean arg1, int arg2) {
        if (arg1) {
            field4068 = 1.1445895F;
        }
        field4076++;
        try {
            byte[] var3 = new byte[arg2];
            class717.method4001(53, var3, arg0, arg2);
            return var3;
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V", line = 26)
    public static final void method1910(int arg0) {
        if (arg0 != 128) {
            field4077 = 10;
        }
        if (class229.field2673 == null) {
            class294 var1 = new class294();
            byte[] var2 = var1.method1749(128, 16, -107, 128);
            class229.field2673 = class389.method2398(var2, false, arg0 ^ 0x80);
        }
        field4078++;
        if (class247.field3006 == null) {
            class654 var3 = new class654();
            byte[] var4 = var3.method3710((byte) 113, 16, 128, 128);
            class247.field3006 = class389.method2398(var4, false, 0);
        }
    }

    @OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(I[B)V", line = 74)
    public class319(int arg0, byte[] arg1) {
        this.field4072 = arg0;
        class244 var3 = new class244(arg1);
        this.field4069 = var3.method1423(-101);
        this.field4071 = new int[this.field4069];
        this.field4070 = new int[this.field4069][];
        this.field4073 = new int[this.field4069];
        this.field4079 = new boolean[this.field4069];
        for (int var4 = 0; var4 < this.field4069; var4++) {
            this.field4073[var4] = var3.method1423(-82);
            if (this.field4073[var4] == 6) {
                this.field4073[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field4069; var5++) {
            this.field4079[var5] = var3.method1423(-79) == 1;
        }
        for (int var6 = 0; var6 < this.field4069; var6++) {
            this.field4071[var6] = var3.method1476(-106);
        }
        for (int var7 = 0; var7 < this.field4069; var7++) {
            this.field4070[var7] = new int[var3.method1423(-112)];
        }
        for (int var8 = 0; var8 < this.field4069; var8++) {
            for (int var9 = 0; var9 < this.field4070[var8].length; var9++) {
                this.field4070[var8][var9] = var3.method1423(-103);
            }
        }
    }
}
