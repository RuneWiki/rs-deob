import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class45 extends class21 {

    @OriginalMember(owner = "client!tk", name = "R", descriptor = "I")
    private int field925 = -1;

    @OriginalMember(owner = "client!tk", name = "bb", descriptor = "I")
    public static int field935 = 0;

    @OriginalMember(owner = "client!tk", name = "S", descriptor = "Z")
    public static boolean field926 = true;

    @OriginalMember(owner = "client!tk", name = "N", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!tk", name = "O", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!tk", name = "Q", descriptor = "I")
    public int field924;

    @OriginalMember(owner = "client!tk", name = "T", descriptor = "I")
    public int field927;

    @OriginalMember(owner = "client!tk", name = "U", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!tk", name = "V", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!tk", name = "W", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!tk", name = "Y", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!tk", name = "Z", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!tk", name = "db", descriptor = "Lbm;")
    public static class307 field937;

    @OriginalMember(owner = "client!tk", name = "X", descriptor = "Ljava/lang/String;")
    public static String field931;

    @OriginalMember(owner = "client!tk", name = "cb", descriptor = "[I")
    public int[] field936;

    @OriginalMember(owner = "client!tk", name = "ab", descriptor = "[[I")
    public static int[][] field934;

    @OriginalMember(owner = "client!tk", name = "P", descriptor = "[[[I")
    public static int[][][] field923;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IILag;)V", line = 6)
    public final void method178(int arg0, int arg1, class202 arg2) {
        field921++;
        if (arg0 != -318) {
            this.field927 = -22;
        }
        if (arg1 == 0) {
            this.field925 = arg2.method1315(arg0 + 14607);
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(IB)[[I", line = 20)
    public int[][] method175(int arg0, byte arg1) {
        field933++;
        if (arg1 <= 16) {
            this.field927 = -80;
        }
        int[][] var3 = this.field441.method220(arg0, 17433);
        if (this.field441.field532 && this.method362((byte) -127)) {
            int[] var4 = var3[2];
            int[] var5 = var3[0];
            int var6 = this.field927 * (class147.field2421 == this.field924 ? arg0 : this.field924 * arg0 / class147.field2421);
            int[] var7 = var3[1];
            if (class294.field4489 == this.field927) {
                for (int var11 = 0; var11 < class294.field4489; var11++) {
                    int var12 = this.field936[var6++];
                    var4[var11] = class61.method475(var12 << 4, 4080);
                    var7[var11] = class61.method475(var12 >> 4, 4080);
                    var5[var11] = class61.method475(var12 >> 12, 4080);
                }
            } else {
                for (int var8 = 0; var8 < class294.field4489; var8++) {
                    int var9 = this.field927 * var8 / class294.field4489;
                    int var10 = this.field936[var6 + var9];
                    var4[var8] = class61.method475(var10, 255) << 4;
                    var7[var8] = class61.method475(var10 >> 4, 4080);
                    var5[var8] = class61.method475(16711680, var10) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V", line = 90)
    public final void method174(int arg0) {
        field922++;
        if (arg0 >= -75) {
            field934 = (int[][]) ((int[][]) null);
        }
        super.method174(-119);
        this.field936 = null;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V", line = 108)
    public class45() {
        super(0, false);
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)V", line = 113)
    public static final void method360(int arg0) {
        field929++;
        class41.field787.method1877(-29702);
        if (arg0 != 16711680) {
            field926 = true;
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(Z)I", line = 124)
    public final int method179(boolean arg0) {
        if (arg0) {
            field930++;
            return this.field925;
        } else {
            return -81;
        }
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(I)V", line = 139)
    public static final void method361(int arg0) {
        if (arg0 != 32358) {
            method361(25);
        }
        field932++;
        if (class95.field1710 != null) {
            class141 var1 = class95.field1710;
            synchronized (class95.field1710) {
                class95.field1710 = null;
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "(B)Z", line = 162)
    public final boolean method362(byte arg0) {
        field928++;
        if (this.field936 != null) {
            return true;
        } else if (this.field925 < 0) {
            int var2 = 30 / ((arg0 + 48) / 57);
            return false;
        } else {
            class206 var3 = class90.field1665 < 0 ? class34.method275((byte) 123, class48.field996, this.field925) : class125.method823((byte) 116, class90.field1665, this.field925, class48.field996);
            var3.method1399();
            this.field927 = var3.field4377;
            this.field924 = var3.field4383;
            this.field936 = var3.field3353;
            return true;
        }
    }

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "(B)V", line = 192)
    public static void method363(byte arg0) {
        field934 = (int[][]) null;
        field923 = (int[][][]) null;
        field931 = null;
        field937 = null;
        if (arg0 != 25) {
            field935 = -69;
        }
    }
}
