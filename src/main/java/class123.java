import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class123 extends class196 {

    @OriginalMember(owner = "client!fh", name = "U", descriptor = "I")
    private int field2086 = 1365;

    @OriginalMember(owner = "client!fh", name = "bb", descriptor = "I")
    private int field2093 = 0;

    @OriginalMember(owner = "client!fh", name = "eb", descriptor = "I")
    private int field2096 = 0;

    @OriginalMember(owner = "client!fh", name = "cb", descriptor = "I")
    private int field2094 = 20;

    @OriginalMember(owner = "client!fh", name = "S", descriptor = "Ldf;")
    public static class51 field2084 = class46.method233("::", 100);

    @OriginalMember(owner = "client!fh", name = "Z", descriptor = "J")
    public static long field2091 = 0L;

    @OriginalMember(owner = "client!fh", name = "Q", descriptor = "I")
    public static int field2082 = 0;

    @OriginalMember(owner = "client!fh", name = "W", descriptor = "Ldf;")
    private static class51 field2088 = class46.method233("Continue", 100);

    @OriginalMember(owner = "client!fh", name = "V", descriptor = "Ldf;")
    public static class51 field2087 = field2088;

    @OriginalMember(owner = "client!fh", name = "X", descriptor = "[I")
    public static int[] field2089 = new int[25];

    @OriginalMember(owner = "client!fh", name = "R", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!fh", name = "T", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!fh", name = "Y", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!fh", name = "ab", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!fh", name = "db", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "(I)V")
    public static void method924(int arg0) {
        field2088 = null;
        field2089 = null;
        if (arg0 != 0) {
            field2082 = -8;
        }
        field2084 = null;
        field2087 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;I)Ldf;")
    public static final class51 method925(String arg0, int arg1) {
        ++field2090;
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg0.getBytes();
        }
        class51 var3 = new class51();
        var3.field855 = 0;
        var3.field813 = var2;
        for (int var4 = 0; var4 < var2.length; ++var4) {
            if (var2[var4] != 0) {
                var2[var3.field855++] = var2[var4];
            }
        }
        if (arg1 != 14592) {
            method925((String) null, -112);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(II)Z")
    public static final boolean method926(int arg0, int arg1) {
        ++field2085;
        int var2 = -10 % ((arg1 - 52) / 52);
        return (1 & arg0 >> 31) != 0;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 == -4) {
                        this.field2096 = arg1.method876(false);
                    }
                } else {
                    this.field2093 = arg1.method876(false);
                }
            } else {
                this.field2094 = arg1.method876(false);
            }
        } else {
            this.field2086 = arg1.method876(false);
        }
        if (arg2 != 82) {
            this.field2094 = -118;
        }
        ++field2095;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        ++field2092;
        if (arg1 != 10565) {
            this.field2096 = 123;
        }
        int[] var3 = super.field3274.method1476(true, arg0);
        if (super.field3274.field3741) {
            for (int var4 = 0; var4 < class49.field767; ++var4) {
                int var5 = (class211.field3510[var4] << 12) / this.field2086 - -this.field2093;
                int var6 = (class161.field2639[arg0] << 12) / this.field2086 - -this.field2096;
                int var7 = var5;
                int var8 = var5;
                int var9 = var6;
                int var10 = var6;
                int var11 = 0;
                int var12 = var6 * var6 >> 12;
                for (int var13 = var5 * var5 >> 12; var12 + var13 < 16384 && var11 < this.field2094; var13 = var8 * var8 >> 12) {
                    ++var11;
                    var10 = (var8 * var10 >> 12) * 2 + var9;
                    var8 = -var12 + var13 - -var7;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = ~var11 > ~(this.field2094 + -1) ? (var11 << 12) / this.field2094 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
    public class123() {
        super(0, true);
    }
}
