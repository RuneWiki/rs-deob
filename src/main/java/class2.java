import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 extends class356 {

    @OriginalMember(owner = "client!ro", name = "A", descriptor = "I")
    private int field16;

    @OriginalMember(owner = "client!ro", name = "u", descriptor = "Lkfa;")
    public static class549 field10 = new class549(80, 5);

    @OriginalMember(owner = "client!ro", name = "v", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!ro", name = "w", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!ro", name = "y", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ro", name = "D", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!ro", name = "E", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ro", name = "G", descriptor = "Ljo;")
    public static class303 field21;

    @OriginalMember(owner = "client!ro", name = "F", descriptor = "[Lxa;")
    public static class458[] field20;

    @OriginalMember(owner = "client!ro", name = "x", descriptor = "[Lpf;")
    public class531[] field13;

    @OriginalMember(owner = "client!ro", name = "z", descriptor = "[[B")
    private byte[][] field15;

    @OriginalMember(owner = "client!ro", name = "B", descriptor = "[[[J")
    public static long[][][] field17;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)Z", line = 8)
    public final boolean method7(int arg0, int arg1) {
        if (arg0 == 14569) {
            field12++;
            return this.field13[arg1].field7603;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(II)Z", line = 20)
    public final boolean method8(int arg0, int arg1) {
        if (arg0 > -6) {
            this.method10((byte) 30);
        }
        field18++;
        return this.field13[arg1].field7611;
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)V", line = 31)
    public static void method9(int arg0) {
        field17 = null;
        field20 = null;
        field10 = null;
        if (arg0 == 6628) {
            field21 = null;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)Z", line = 49)
    public final boolean method10(byte arg0) {
        field11++;
        if (this.field13 != null) {
            return true;
        }
        if (this.field15 == null) {
            if (!field21.method1730((byte) 124, this.field16)) {
                return false;
            }
            int[] var2 = field21.method1708(this.field16, (byte) -104);
            this.field15 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field15[var3] = field21.method1719(var2[var3], this.field16, 4);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field15.length; var5++) {
            byte[] var15 = this.field15[var5];
            class452 var16 = new class452(var15);
            var16.field6215 = 1;
            int var17 = var16.method2574(-1758460248);
            var4 &= class353.field4634.method1711(var17, 1);
        }
        if (!var4) {
            return false;
        }
        class562 var6 = new class562();
        int var7 = field21.method1727(-77, this.field16);
        this.field13 = new class531[var7];
        int[] var8 = field21.method1708(this.field16, (byte) -112);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field15[var9];
            class452 var11 = new class452(var10);
            var11.field6215 = 1;
            int var12 = var11.method2574(-1758460248);
            class112 var13 = null;
            for (class112 var14 = (class112) var6.method3174((byte) 49); var14 != null; var14 = (class112) var6.method3168(false)) {
                if (var14.field1301 == var12) {
                    var13 = var14;
                    break;
                }
            }
            if (var13 == null) {
                var13 = new class112(var12, class353.field4634.method1722(var12, 0));
                var6.method3164(var13, 256);
            }
            this.field13[var8[var9]] = new class531(var10, var13);
        }
        if (arg0 >= -37) {
            field21 = null;
        }
        this.field15 = null;
        return true;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IB)Z", line = 152)
    public final boolean method11(int arg0, byte arg1) {
        field14++;
        if (arg1 < 7) {
            field19 = -61;
        }
        return this.field13[arg0].field7615;
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(I)V", line = 164)
    public class2(int arg0) {
        this.field16 = arg0;
    }
}
