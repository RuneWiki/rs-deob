import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class224 extends class199 {

    @OriginalMember(owner = "client!bl", name = "T", descriptor = "I")
    private int field3222 = 409;

    @OriginalMember(owner = "client!bl", name = "W", descriptor = "I")
    private int field3225 = 4096;

    @OriginalMember(owner = "client!bl", name = "bb", descriptor = "I")
    private int field3230 = 4096;

    @OriginalMember(owner = "client!bl", name = "Z", descriptor = "[I")
    private int[] field3228 = new int[3];

    @OriginalMember(owner = "client!bl", name = "V", descriptor = "I")
    private int field3224 = 4096;

    @OriginalMember(owner = "client!bl", name = "cb", descriptor = "Lcc;")
    public static class327 field3231 = new class327(20);

    @OriginalMember(owner = "client!bl", name = "db", descriptor = "Lcc;")
    public static class327 field3232 = new class327(4);

    @OriginalMember(owner = "client!bl", name = "fb", descriptor = "J")
    public static long field3234 = 0L;

    @OriginalMember(owner = "client!bl", name = "S", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!bl", name = "U", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!bl", name = "X", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!bl", name = "Y", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!bl", name = "ab", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!bl", name = "eb", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIII)V", line = 6)
    public static final void method1624(int arg0, int arg1, int arg2, int arg3) {
        class119 var4 = class345.field5367[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class66 var5 = var4.field1566;
        if (var5 != null) {
            var5.field852 = var5.field852 * arg3 / 16;
            var5.field837 = var5.field837 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V", line = 19)
    public class224() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "(I)Lbh;", line = 23)
    public static final class315 method1625(int arg0) {
        field3226++;
        if (arg0 != -1999250068) {
            field3231 = (class327) null;
        }
        try {
            return (class315) Class.forName("dk").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)[[I", line = 47)
    public final int[][] method215(int arg0, int arg1) {
        if (arg1 != -29869) {
            field3233 = -90;
        }
        int[][] var3 = this.field2796.method2187(arg0, -57);
        if (this.field2796.field4667) {
            int[][] var4 = this.method1459(0, arg0, (byte) -51);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class95.field1235; var11++) {
                int var12 = var5[var11];
                int var13 = var12 - this.field3228[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 > this.field3222) {
                    var9[var11] = var12;
                    var8[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field3228[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 <= this.field3222) {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field3228[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field3222 < var17) {
                            var9[var11] = var12;
                            var8[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var9[var11] = this.field3225 * var12 >> 12;
                            var8[var11] = this.field3224 * var14 >> 12;
                            var10[var11] = this.field3230 * var16 >> 12;
                        }
                    } else {
                        var9[var11] = var12;
                        var8[var11] = var14;
                        var10[var11] = var7[var11];
                    }
                }
            }
        }
        field3229++;
        return var3;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLfd;I)V", line = 157)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        if (arg2 == 0) {
            this.field3222 = arg1.method2083((byte) -111);
        } else if (arg2 == 1) {
            this.field3230 = arg1.method2083((byte) -117);
        } else if (arg2 == 2) {
            this.field3224 = arg1.method2083((byte) -102);
        } else if (arg2 == 3) {
            this.field3225 = arg1.method2083((byte) -122);
        } else if (arg2 == 4) {
            int var5 = arg1.method2085((byte) 102);
            this.field3228[0] = class335.method2339(var5 << 4, 267386880);
            this.field3228[2] = class335.method2339(255, var5) >> 12;
            this.field3228[1] = class335.method2339(4080, var5 >> 4);
        }
        if (arg0 == -43) {
            field3227++;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILfh;)V", line = 208)
    public static final void method1626(int arg0, class140 arg1) {
        class351.field5488 = arg1;
        if (arg0 != 2) {
            field3231 = (class327) null;
        }
        field3221++;
    }

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "(I)V", line = 221)
    public static void method1627(int arg0) {
        if (arg0 != 18253) {
            field3234 = -116L;
        }
        field3232 = null;
        field3231 = null;
    }
}
