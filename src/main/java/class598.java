import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class598 {

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
    public int field8729;

    @OriginalMember(owner = "client!bs", name = "o", descriptor = "[B")
    private byte[] field8741;

    @OriginalMember(owner = "client!bs", name = "t", descriptor = "[[I")
    public static int[][] field8746 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
    public int field8727;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
    public static int field8728;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
    public static int field8730;

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "I")
    public int field8734;

    @OriginalMember(owner = "client!bs", name = "l", descriptor = "I")
    public int field8738;

    @OriginalMember(owner = "client!bs", name = "p", descriptor = "I")
    public static int field8742;

    @OriginalMember(owner = "client!bs", name = "s", descriptor = "Lro;")
    public class2 field8745;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "[I")
    public int[] field8731;

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "[I")
    public int[] field8733;

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "[I")
    public int[] field8735;

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "[I")
    public int[] field8737;

    @OriginalMember(owner = "client!bs", name = "n", descriptor = "[I")
    public int[] field8740;

    @OriginalMember(owner = "client!bs", name = "q", descriptor = "[I")
    public int[] field8743;

    @OriginalMember(owner = "client!bs", name = "m", descriptor = "[Lro;")
    public class2[] field8739;

    @OriginalMember(owner = "client!bs", name = "r", descriptor = "[[B")
    public byte[][] field8744;

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "[[I")
    public int[][] field8732;

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "[[I")
    public int[][] field8736;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V", line = 13)
    public static void method3477(int arg0) {
        if (arg0 != 0) {
            method3479(-64);
        }
        field8746 = null;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(B[B)V", line = 27)
    private final void method3478(byte arg0, byte[] arg1) {
        field8742++;
        class194 var3 = new class194(class238.method1593(true, arg1));
        int var4 = var3.method1177(255);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field8727 = 0;
        } else {
            this.field8727 = var3.method1178(arg0 ^ 0xF245A81A);
        }
        int var5 = var3.method1177(255);
        boolean var6 = (var5 & 0x1) != 0;
        boolean var7 = (var5 & 0x2) != 0;
        this.field8734 = var3.method1220(arg0 - 143);
        int var8 = 0;
        int var9 = -1;
        this.field8733 = new int[this.field8734];
        for (int var10 = 0; var10 < this.field8734; var10++) {
            this.field8733[var10] = var8 += var3.method1220(118);
            if (var9 < this.field8733[var10]) {
                var9 = this.field8733[var10];
            }
        }
        this.field8738 = var9 + 1;
        this.field8731 = new int[this.field8738];
        this.field8743 = new int[this.field8738];
        this.field8737 = new int[this.field8738];
        this.field8735 = new int[this.field8738];
        this.field8732 = new int[this.field8738][];
        if (var7) {
            this.field8744 = new byte[this.field8738][];
        }
        if (var6) {
            this.field8740 = new int[this.field8738];
            for (int var11 = 0; var11 < this.field8738; var11++) {
                this.field8740[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field8734; var12++) {
                this.field8740[this.field8733[var12]] = var3.method1178(arg0 - 230316042);
            }
            this.field8745 = new class2(this.field8740);
        }
        for (int var13 = 0; var13 < this.field8734; var13++) {
            this.field8731[this.field8733[var13]] = var3.method1178(-230315992);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field8734; var14++) {
                byte[] var15 = new byte[64];
                var3.method1200(var15, (byte) 121, 0, 64);
                this.field8744[this.field8733[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field8734; var16++) {
            this.field8743[this.field8733[var16]] = var3.method1178(-230315992);
        }
        for (int var17 = 0; var17 < this.field8734; var17++) {
            this.field8735[this.field8733[var17]] = var3.method1220(121);
        }
        for (int var18 = 0; var18 < this.field8734; var18++) {
            int var25 = this.field8733[var18];
            int var26 = this.field8735[var25];
            int var27 = 0;
            int var28 = -1;
            this.field8732[var25] = new int[var26];
            for (int var29 = 0; var29 < var26; var29++) {
                int var30 = this.field8732[var25][var29] = var27 += var3.method1220(117);
                if (var30 > var28) {
                    var28 = var30;
                }
            }
            this.field8737[var25] = var28 + 1;
            if ((var28 + 1) == var26) {
                this.field8732[var25] = null;
            }
        }
        if (var6) {
            this.field8739 = new class2[var9 + 1];
            this.field8736 = new int[var9 + 1][];
            for (int var19 = 0; var19 < this.field8734; var19++) {
                int var20 = this.field8733[var19];
                int var21 = this.field8735[var20];
                this.field8736[var20] = new int[this.field8737[var20]];
                for (int var22 = 0; var22 < this.field8737[var20]; var22++) {
                    this.field8736[var20][var22] = -1;
                }
                for (int var23 = 0; var23 < var21; var23++) {
                    int var24;
                    if (this.field8732[var20] == null) {
                        var24 = var23;
                    } else {
                        var24 = this.field8732[var20][var23];
                    }
                    this.field8736[var20][var24] = var3.method1178(-230315992);
                }
                this.field8739[var20] = new class2(this.field8736[var20]);
            }
        }
        if (arg0 != 50) {
            this.method3478((byte) -54, null);
        }
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)V", line = 230)
    public static final void method3479(int arg0) {
        field8730++;
        int var1 = class88.field1018;
        if (arg0 > -104) {
            method3479(118);
        }
        int[] var2 = class457.field6839;
        for (int var3 = 0; var3 < var1; var3++) {
            class655 var9 = class142.field1749[var2[var3]];
            if (var9 != null && var9.field2474 > 0) {
                var9.field2474--;
                if (var9.field2474 == 0) {
                    var9.field2445 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class387.field5958; var4++) {
            long var5 = (long) class362.field5141[var4];
            class411 var7 = (class411) class42.field456.method524((byte) 97, var5);
            if (var7 != null) {
                class78 var8 = var7.field6254;
                if (var8.field2474 > 0) {
                    var8.field2474--;
                    if (var8.field2474 == 0) {
                        var8.field2445 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "([BI[B)V", line = 296)
    public class598(byte[] arg0, int arg1, byte[] arg2) {
        this.field8729 = class513.method3047((byte) 112, arg0, arg0.length);
        if (this.field8729 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field8741 = class408.method2585(arg0.length, arg0, 0, 118);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field8741[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method3478((byte) 50, arg0);
    }
}
