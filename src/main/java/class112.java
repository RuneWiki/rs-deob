import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class112 extends class217 {

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public int field1763;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public int field1761;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "[[I")
    public int[][] field1766;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "[Z")
    public boolean[] field1760;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "[I")
    public int[] field1768;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "[I")
    public int[] field1764;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field1759 = 0;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public static int field1762 = 0;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "[I")
    public static int[] field1767 = new int[100];

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public static int field1771 = 0;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZZLjava/lang/String;)V", line = 6)
    public static final void method883(boolean arg0, boolean arg1, String arg2) {
        short[] var3 = new short[16];
        int var4 = arg0 ? 32768 : 0;
        int var5 = 0;
        field1765++;
        String var6 = arg2.toLowerCase();
        int var7 = (arg0 ? class178.field2673 : class310.field4835) + var4;
        for (int var8 = var4; var8 < var7; var8++) {
            class243 var9 = class69.method579(var8, -32761);
            if (var9.field3655 && var9.method1678(0).toLowerCase().indexOf(var6) != -1) {
                if (var5 >= 50) {
                    class125.field1980 = -1;
                    class322.field5001 = null;
                    return;
                }
                if (var5 >= var3.length) {
                    short[] var10 = new short[var3.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var3[var11];
                    }
                    var3 = var10;
                }
                var3[var5++] = (short) var8;
            }
        }
        class125.field1980 = var5;
        class322.field5001 = var3;
        class324.field5054 = 0;
        String[] var12 = new String[class125.field1980];
        for (int var13 = 0; var13 < class125.field1980; var13++) {
            var12[var13] = class69.method579(var3[var13], -32761).method1678(0);
        }
        if (arg1) {
            field1759 = -119;
        }
        class294.method2076(class322.field5001, var12, (byte) -121);
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I[B)V", line = 103)
    public class112(int arg0, byte[] arg1) {
        this.field1763 = arg0;
        class35 var3 = new class35(arg1);
        this.field1761 = var3.method273(65280);
        this.field1766 = new int[this.field1761][];
        this.field1760 = new boolean[this.field1761];
        this.field1768 = new int[this.field1761];
        this.field1764 = new int[this.field1761];
        for (int var4 = 0; var4 < this.field1761; var4++) {
            this.field1768[var4] = var3.method273(65280);
        }
        for (int var5 = 0; var5 < this.field1761; var5++) {
            this.field1760[var5] = var3.method273(65280) == 1;
        }
        for (int var6 = 0; var6 < this.field1761; var6++) {
            this.field1764[var6] = var3.method300(-1394191632);
        }
        for (int var7 = 0; var7 < this.field1761; var7++) {
            this.field1766[var7] = new int[var3.method273(65280)];
        }
        for (int var8 = 0; var8 < this.field1761; var8++) {
            for (int var9 = 0; var9 < this.field1766[var8].length; var9++) {
                this.field1766[var8][var9] = var3.method273(65280);
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 162)
    public static void method884(int arg0) {
        if (arg0 > 69) {
            field1767 = null;
        }
    }
}
