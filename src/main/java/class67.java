import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class67 extends class286 {

    @OriginalMember(owner = "client!v", name = "P", descriptor = "I")
    private int field932 = 0;

    @OriginalMember(owner = "client!v", name = "eb", descriptor = "I")
    private int field947 = 0;

    @OriginalMember(owner = "client!v", name = "V", descriptor = "I")
    private int field938 = 4096;

    @OriginalMember(owner = "client!v", name = "W", descriptor = "I")
    private int field939 = 2000;

    @OriginalMember(owner = "client!v", name = "ab", descriptor = "I")
    private int field943 = 16;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "[I")
    public static int[] field934 = new int[2000];

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "[[I")
    public static int[][] field942 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "Z")
    public static volatile boolean field941 = false;

    @OriginalMember(owner = "client!v", name = "hb", descriptor = "J")
    public static long field950 = 0L;

    @OriginalMember(owner = "client!v", name = "gb", descriptor = "Lbe;")
    public static class283 field949 = class153.method941(-74, " x ");

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!v", name = "U", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!v", name = "X", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!v", name = "bb", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!v", name = "cb", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!v", name = "db", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "Llb;")
    public static class199 field933;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "Lvh;")
    public static class49 field930;

    @OriginalMember(owner = "client!v", name = "fb", descriptor = "[I")
    public static int[] field948;

    @OriginalMember(owner = "client!v", name = "T", descriptor = "[Lbe;")
    public static class283[] field936;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(I)V", line = 5)
    public final void method276(int arg0) {
        class86.method555(4096);
        field945++;
        if (arg0 != 3) {
            method425((byte) 24);
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V", line = 18)
    public static void method425(byte arg0) {
        field934 = null;
        field942 = (int[][]) null;
        field936 = null;
        field948 = null;
        field933 = null;
        if (arg0 != -17) {
            method425((byte) 105);
        }
        field949 = null;
        field930 = null;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V", line = 185)
    public class67() {
        super(0, true);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)[I", line = 46)
    public final int[] method14(int arg0, int arg1) {
        int[] var3 = this.field4863.method1579(arg1, (byte) 90);
        field944++;
        if (this.field4863.field3984) {
            int var4 = this.field938 >> 1;
            int[][] var5 = this.field4863.method1581(0);
            Random var6 = new Random((long) this.field932);
            for (int var7 = 0; var7 < this.field939; var7++) {
                int var8 = this.field938 > 0 ? this.field947 + class47.method275(this.field938, var6, -1625284640) - var4 : this.field947;
                int var9 = (var8 & 0xFF6) >> 4;
                int var10 = class47.method275(class27.field410, var6, -1625284640);
                int var11 = class47.method275(class13.field124, var6, -1625284640);
                int var12 = (class33.field490[var9] * this.field943 >> 12) + var10;
                int var13 = var12 - var10;
                int var14 = (class133.field2236[var9] * this.field943 >> 12) + var11;
                int var15 = var14 - var11;
                if (var13 != 0 || var15 != 0) {
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var13 < var15;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        var11 = var17;
                        int var18 = var12;
                        var12 = var14;
                        var14 = var18;
                    }
                    if (var12 < var10) {
                        int var19 = var10;
                        var10 = var12;
                        var12 = var19;
                        int var20 = var11;
                        var11 = var14;
                        var14 = var20;
                    }
                    int var21 = var14 - var11;
                    int var22 = var11;
                    int var23 = var12 - var10;
                    if (var21 < 0) {
                        var21 = -var21;
                    }
                    int var24 = 2048 / var23;
                    int var25 = -var23 / 2;
                    int var26 = var11 >= var14 ? -1 : 1;
                    int var27 = 1024 - (class47.method275(4096, var6, -1625284640) >> 2);
                    for (int var28 = var10; var28 < var12; var28++) {
                        int var29 = (var28 - var10) * var24 + var27 + 1024;
                        var25 += var21;
                        int var30 = class126.field2100 & var22;
                        int var31 = var28 & class284.field4857;
                        if (var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        if (var25 > 0) {
                            var25 -= var23;
                            var22 += var26;
                        }
                    }
                }
            }
        }
        if (arg0 > -52) {
            this.field943 = 68;
        }
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lfe;ZI)V", line = 201)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        field940++;
        if (arg1) {
            this.field932 = 39;
        }
        if (arg2 == 0) {
            this.field932 = arg0.method1535((byte) 112);
        } else if (arg2 == 1) {
            this.field939 = arg0.method1496(true);
        } else if (arg2 == 2) {
            this.field943 = arg0.method1535((byte) 124);
        } else if (arg2 == 3) {
            this.field947 = arg0.method1496(true);
        } else if (arg2 == 4) {
            this.field938 = arg0.method1496(!arg1);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([BZ)[B", line = 269)
    public static final byte[] method426(byte[] arg0, boolean arg1) {
        int var2 = arg0.length;
        if (!arg1) {
            field934 = (int[]) null;
        }
        field931++;
        byte[] var3 = new byte[var2];
        class136.method843(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)V", line = 287)
    public static final void method427(byte arg0, int arg1) {
        field935++;
        if (class237.field3965 == 0) {
            class254.field4298.method153(false, arg1);
        } else {
            class113.field1909 = arg1;
        }
        if (arg0 > -71) {
            method425((byte) 82);
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)Z", line = 319)
    public static final boolean method428(int arg0, int arg1) {
        if (arg0 != -123) {
            method425((byte) 122);
        }
        field937++;
        return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
    }
}
