import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class276 extends class70 {

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public int field4498;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public int field4495;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "[[I")
    public int[][] field4503;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "[I")
    public int[] field4504;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "[I")
    public int[] field4500;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "[Z")
    public boolean[] field4501;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "Loj;")
    public static class358 field4502;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V", line = 6)
    public static void method1960(boolean arg0) {
        field4502 = null;
        if (!arg0) {
            method1961(60);
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)Lsc;", line = 25)
    public static final class288 method1961(int arg0) {
        field4497++;
        int var1 = class9.field284[0] * class76.field1367[0];
        byte[] var2 = class309.field5053[0];
        class288 var6;
        if (class137.field2335[0]) {
            int[] var3 = new int[var1];
            byte[] var4 = class9.field281[0];
            for (int var5 = 0; var5 < var1; var5++) {
                var3[var5] = class287.method2034(class323.field5225[class83.method613(255, var2[var5])], class83.method613(var4[var5] << 24, -16777216));
            }
            var6 = new class183(class91.field1617, class12.field368, class321.field5218[0], class232.field3804[0], class9.field284[0], class76.field1367[0], var3);
        } else {
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class323.field5225[class83.method613(255, var2[var8])];
            }
            var6 = new class288(class91.field1617, class12.field368, class321.field5218[0], class232.field3804[0], class9.field284[0], class76.field1367[0], var7);
        }
        class213.method1470(false);
        return arg0 == 5094 ? var6 : (class288) null;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I[B)V", line = 70)
    public class276(int arg0, byte[] arg1) {
        this.field4498 = arg0;
        class146 var3 = new class146(arg1);
        this.field4495 = var3.method1005((byte) 122);
        this.field4503 = new int[this.field4495][];
        this.field4504 = new int[this.field4495];
        this.field4500 = new int[this.field4495];
        this.field4501 = new boolean[this.field4495];
        for (int var4 = 0; var4 < this.field4495; var4++) {
            this.field4500[var4] = var3.method1005((byte) 122);
        }
        for (int var5 = 0; var5 < this.field4495; var5++) {
            this.field4501[var5] = var3.method1005((byte) 122) == 1;
        }
        for (int var6 = 0; var6 < this.field4495; var6++) {
            this.field4504[var6] = var3.method989(64);
        }
        for (int var7 = 0; var7 < this.field4495; var7++) {
            this.field4503[var7] = new int[var3.method1005((byte) 122)];
        }
        for (int var8 = 0; var8 < this.field4495; var8++) {
            for (int var9 = 0; var9 < this.field4503[var8].length; var9++) {
                this.field4503[var8][var9] = var3.method1005((byte) 122);
            }
        }
    }
}
