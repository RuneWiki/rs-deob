import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class146 extends class49 {

    @OriginalMember(owner = "client!g", name = "y", descriptor = "I")
    private int field1879;

    @OriginalMember(owner = "client!g", name = "B", descriptor = "Ltq;")
    public static class397 field1882 = new class397();

    @OriginalMember(owner = "client!g", name = "F", descriptor = "S")
    public static short field1885 = 1;

    @OriginalMember(owner = "client!g", name = "x", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!g", name = "z", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!g", name = "E", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "[Lam;")
    public class321[] field1877;

    @OriginalMember(owner = "client!g", name = "A", descriptor = "[[B")
    private byte[][] field1881;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method970(int arg0) {
        field1883++;
        if (this.field1877 != null) {
            return true;
        }
        if (this.field1881 == null) {
            class283 var2 = class395.field5615;
            synchronized (class395.field5615) {
                if (!class395.field5615.method1865(this.field1879, (byte) -16)) {
                    return false;
                }
                int[] var4 = class395.field5615.method1850(this.field1879, 117);
                this.field1881 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field1881[var5] = class395.field5615.method1849(var4[var5], (byte) -105, this.field1879);
                }
            }
        }
        boolean var6 = true;
        for (int var7 = arg0; var7 < this.field1881.length; var7++) {
            byte[] var8 = this.field1881[var7];
            class511 var9 = new class511(var8);
            var9.field6962 = 1;
            int var10 = var9.method3002(-1);
            class283 var11 = class517.field7110;
            synchronized (class517.field7110) {
                var6 &= class517.field7110.method1860(var10, (byte) 124);
            }
        }
        if (!var6) {
            return false;
        }
        class165 var12 = new class165();
        class283 var13 = class395.field5615;
        int[] var15;
        synchronized (class395.field5615) {
            int var14 = class395.field5615.method1867(this.field1879, (byte) 49);
            this.field1877 = new class321[var14];
            var15 = class395.field5615.method1850(this.field1879, 54);
        }
        for (int var16 = 0; var16 < var15.length; var16++) {
            byte[] var17 = this.field1881[var16];
            class511 var18 = new class511(var17);
            var18.field6962 = 1;
            int var19 = var18.method3002(-1);
            class373 var20 = null;
            for (class373 var21 = (class373) var12.method1041(1048832); var21 != null; var21 = (class373) var12.method1033(~arg0)) {
                if (var21.field5358 == var19) {
                    var20 = var21;
                    break;
                }
            }
            if (var20 == null) {
                class283 var22 = class517.field7110;
                synchronized (class517.field7110) {
                    var20 = new class373(var19, class517.field7110.method1854(0, var19));
                }
                var12.method1039(var20, arg0);
            }
            this.field1877[var15[var16]] = new class321(var17, var20);
        }
        this.field1881 = null;
        return true;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Z", line = 112)
    public final boolean method971(int arg0, int arg1) {
        field1878++;
        if (arg1 != 0) {
            this.method970(-48);
        }
        return this.field1877[arg0].field4537;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(II)Z", line = 124)
    public final boolean method972(int arg0, int arg1) {
        field1880++;
        if (arg1 != 0) {
            this.field1881 = null;
        }
        return this.field1877[arg0].field4542;
    }

    @OriginalMember(owner = "client!g", name = "g", descriptor = "(I)V", line = 137)
    public static void method973(int arg0) {
        if (arg0 <= 112) {
            field1882 = null;
        }
        field1882 = null;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(II)Z", line = 149)
    public final boolean method974(int arg0, int arg1) {
        field1884++;
        return arg0 == 15333 ? this.field1877[arg1].field4543 : true;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(I)V", line = 161)
    public class146(int arg0) {
        this.field1879 = arg0;
    }
}
