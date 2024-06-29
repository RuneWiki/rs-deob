import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class292 extends class283 {

    @OriginalMember(owner = "client!gm", name = "Z", descriptor = "I")
    private int field4861 = 1365;

    @OriginalMember(owner = "client!gm", name = "ab", descriptor = "I")
    private int field4862 = 0;

    @OriginalMember(owner = "client!gm", name = "V", descriptor = "I")
    private int field4857 = 0;

    @OriginalMember(owner = "client!gm", name = "Y", descriptor = "I")
    private int field4860 = 20;

    @OriginalMember(owner = "client!gm", name = "W", descriptor = "Lna;")
    public static class26 field4858 = class69.method505("_", (byte) -128);

    @OriginalMember(owner = "client!gm", name = "R", descriptor = "I")
    public static int field4853 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!gm", name = "bb", descriptor = "Z")
    public static boolean field4863 = false;

    @OriginalMember(owner = "client!gm", name = "X", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4859 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!gm", name = "eb", descriptor = "Lna;")
    public static class26 field4866 = class69.method505("Lade Sprites )2 ", (byte) -119);

    @OriginalMember(owner = "client!gm", name = "gb", descriptor = "[I")
    public static int[] field4868 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!gm", name = "fb", descriptor = "Lna;")
    private static class26 field4867 = class69.method505("Loaded textures", (byte) -128);

    @OriginalMember(owner = "client!gm", name = "cb", descriptor = "Lna;")
    public static class26 field4864 = field4867;

    @OriginalMember(owner = "client!gm", name = "hb", descriptor = "Lna;")
    public static class26 field4869 = class69.method505("Regarder dans cette direction", (byte) -119);

    @OriginalMember(owner = "client!gm", name = "db", descriptor = "Lna;")
    public static class26 field4865 = class69.method505("cross", (byte) -123);

    @OriginalMember(owner = "client!gm", name = "P", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!gm", name = "Q", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!gm", name = "S", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!gm", name = "U", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!gm", name = "T", descriptor = "Lk;")
    public static class233 field4855;

    @OriginalMember(owner = "client!gm", name = "ib", descriptor = "Lve;")
    public static class266 field4870;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILwa;Z)V", line = 14)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        if (!arg2) {
            field4865 = (class26) null;
        }
        if (arg0 == 0) {
            this.field4861 = arg1.method576(1);
        } else if (arg0 == 1) {
            this.field4860 = arg1.method576(1);
        } else if (arg0 == 2) {
            this.field4857 = arg1.method576(1);
        } else if (arg0 == 3) {
            this.field4862 = arg1.method576(1);
        }
        field4852++;
    }

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "(B)V", line = 67)
    public static final void method2053(byte arg0) {
        if (arg0 == 64) {
            field4851++;
            class110.field1754 = true;
        }
    }

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "(I)V", line = 78)
    public static final void method2054(int arg0) {
        class28.field474 = 0;
        class312.field5341 = 0;
        field4854++;
        class284.method2002((byte) -11);
        class216.method1443(113);
        class196.method1315(arg0 ^ 0x1FAA);
        for (int var1 = 0; var1 < class312.field5341; var1++) {
            int var2 = class116.field1824[var1];
            if (class229.field3626 != class185.field2877[var2].field3982) {
                if (class185.field2877[var2].field5565.method1276(-1)) {
                    class173.method1188(class185.field2877[var2], false);
                }
                class185.field2877[var2].method2251(-1, (class187) null);
                class185.field2877[var2] = null;
            }
        }
        if (arg0 != 8169) {
            method2054(96);
        }
        if (class259.field4228 != class300.field5157.field1301) {
            throw new RuntimeException("gnp1 pos:" + class300.field5157.field1301 + " psize:" + class259.field4228);
        }
        for (int var3 = 0; var3 < class81.field1270; var3++) {
            if (class185.field2877[class316.field5412[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class81.field1270);
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IB)[I", line = 138)
    public final int[] method8(int arg0, byte arg1) {
        field4856++;
        int var3 = -72 % ((30 - arg1) / 36);
        int[] var4 = this.field4733.method664(-16409, arg0);
        if (this.field4733.field1406) {
            for (int var5 = 0; var5 < class101.field1632; var5++) {
                int var6 = (class59.field955[arg0] << 12) / this.field4861 + this.field4862;
                int var7 = (class13.field184[var5] << 12) / this.field4861 + this.field4857;
                int var8 = var7;
                int var9 = var7;
                int var10 = var6;
                int var11 = var6;
                int var12 = 0;
                int var13 = var7 * var7 >> 12;
                int var14 = var6 * var6 >> 12;
                while ((var13 + var14) < 16384 && this.field4860 > var12) {
                    var11 = (var9 * var11 >> 12) * 2 + var10;
                    var12++;
                    var9 = var13 + var8 - var14;
                    var14 = var11 * var11 >> 12;
                    var13 = var9 * var9 >> 12;
                }
                var4[var5] = var12 >= (this.field4860 - 1) ? 0 : (var12 << 12) / this.field4860;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "(I)V", line = 211)
    public static void method2055(int arg0) {
        if (arg0 != 9423) {
            return;
        }
        field4859 = null;
        field4866 = null;
        field4868 = null;
        field4855 = null;
        field4870 = null;
        field4865 = null;
        field4864 = null;
        field4858 = null;
        field4867 = null;
        field4869 = null;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V", line = 231)
    public class292() {
        super(0, true);
    }
}
