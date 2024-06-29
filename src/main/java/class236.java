import java.math.BigInteger;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class236 extends class224 {

    @OriginalMember(owner = "client!oj", name = "S", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3769 = new CRC32();

    @OriginalMember(owner = "client!oj", name = "ab", descriptor = "I")
    public static int field3777 = 0;

    @OriginalMember(owner = "client!oj", name = "Z", descriptor = "Luf;")
    public static class168 field3776 = class148.method1019(-1720, ")1j");

    @OriginalMember(owner = "client!oj", name = "Y", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3775 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!oj", name = "R", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!oj", name = "U", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!oj", name = "V", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!oj", name = "W", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!oj", name = "X", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!oj", name = "bb", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!oj", name = "T", descriptor = "[Ltc;")
    private class256[] field3770;

    @OriginalMember(owner = "client!oj", name = "cb", descriptor = "[[B")
    public static byte[][] field3779;

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V", line = 3)
    public class236() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZLj;)V", line = 18)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        if (arg1) {
            return;
        }
        if (arg0 == 0) {
            this.field3770 = new class256[arg2.method1042((byte) 112)];
            for (int var4 = 0; var4 < this.field3770.length; var4++) {
                int var5 = arg2.method1042((byte) -22);
                if (var5 == 0) {
                    this.field3770[var4] = class167.method1161(0, arg2);
                } else if (var5 == 1) {
                    this.field3770[var4] = class136.method946(-34, arg2);
                } else if (var5 == 2) {
                    this.field3770[var4] = class122.method872(arg2, 50);
                } else if (var5 == 3) {
                    this.field3770[var4] = class91.method647(0, arg2);
                }
            }
        } else if (arg0 == 1) {
            this.field3610 = arg2.method1042((byte) 115) == 1;
        }
        field3773++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IB)[[I", line = 92)
    public final int[][] method17(int arg0, byte arg1) {
        if (arg1 != -77) {
            method1590((byte) 120);
        }
        field3768++;
        int[][] var3 = this.field3631.method1587(arg0, 9804);
        if (this.field3631.field3756) {
            int var4 = class187.field2961;
            int var5 = class115.field1791;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = this.field3631.method1584((byte) -107);
            this.method1591(-1, var6);
            for (int var8 = 0; var8 < class115.field1791; var8++) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[2];
                int[] var12 = var10[0];
                int[] var13 = var10[1];
                for (int var14 = 0; var14 < class187.field2961; var14++) {
                    int var15 = var9[var14];
                    var11[var14] = class159.method1119(var15, 255) << 4;
                    var13[var14] = class159.method1119(var15 >> 4, 4080);
                    var12[var14] = class159.method1119(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "(B)V", line = 156)
    public static void method1590(byte arg0) {
        field3775 = null;
        field3769 = null;
        field3779 = (byte[][]) null;
        field3776 = null;
        if (arg0 > -1) {
            field3769 = (CRC32) null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BI)[I", line = 172)
    public final int[] method18(byte arg0, int arg1) {
        field3772++;
        int[] var3 = this.field3613.method1866(1, arg1);
        int var4 = 48 / ((arg0 - 20) / 51);
        if (this.field3613.field4531) {
            this.method1591(-1, this.field3613.method1868(0));
        }
        return var3;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I[[I)V", line = 196)
    private final void method1591(int arg0, int[][] arg1) {
        if (arg0 != -1) {
            this.method18((byte) -31, 49);
        }
        int var3 = class187.field2961;
        int var4 = class115.field1791;
        field3771++;
        class221.method1526(arg1, 2047);
        class21.method106(0, 0, 128, class169.field2777, class205.field3363);
        if (this.field3770 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field3770.length; var5++) {
            class256 var6 = this.field3770[var5];
            int var7 = var6.field4356;
            int var8 = var6.field4352;
            if (var8 >= 0) {
                if (var7 < 0) {
                    var6.method905(var4, (byte) 100, var3);
                } else {
                    var6.method904((byte) 117, var4, var3);
                }
            } else if (var7 >= 0) {
                var6.method903(var3, var4, -41);
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZLuf;)I", line = 252)
    public static final int method1592(boolean arg0, class168 arg1) {
        field3774++;
        if (arg1.method1167(!arg0) == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class201.field3315.field4146; var2++) {
            if (class201.field3315.field4158[var2].method1175(class205.field3379, class271.field4550, false).method1202((byte) 20, arg1)) {
                return var2;
            }
        }
        if (!arg0) {
            field3775 = (BigInteger) null;
        }
        return -1;
    }
}
