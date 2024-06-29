import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class369 extends class107 {

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
    private int field5127;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "I")
    public static int field5125 = 0;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "[Lut;")
    public class134[] field5121;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "[[B")
    private byte[][] field5129;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)Z", line = 3)
    public final boolean method2300(byte arg0, int arg1) {
        field5124++;
        int var3 = 7 % ((arg0 + 75) / 39);
        return this.field5121[arg1].field2034;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "([BIIII[BIII)V", line = 13)
    public static final void method2301(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        field5123++;
        int var9 = -(arg7 >> 2);
        int var10 = -(arg7 & 0x3);
        if (arg4 != 0) {
            field5125 = -22;
        }
        for (int var11 = -arg8; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg3++;
                arg5[var10001] = (byte) (arg5[var10001] - arg0[arg2++]);
                int var14 = arg3++;
                arg5[var14] = (byte) (arg5[var14] - arg0[arg2++]);
                int var15 = arg3++;
                arg5[var15] = (byte) (arg5[var15] - arg0[arg2++]);
                int var16 = arg3++;
                arg5[var16] = (byte) (arg5[var16] - arg0[arg2++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg3++;
                arg5[var10001] = (byte) (arg5[var10001] - arg0[arg2++]);
            }
            arg2 += arg6;
            arg3 += arg1;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)Z", line = 59)
    public final boolean method2302(int arg0) {
        field5122++;
        if (this.field5121 != null) {
            return true;
        }
        if (this.field5129 == null) {
            class791 var2 = class339.field4744;
            synchronized (class339.field4744) {
                if (!class339.field4744.method4357(22084, this.field5127)) {
                    return false;
                }
                int[] var4 = class339.field4744.method4348((byte) -67, this.field5127);
                this.field5129 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field5129[var5] = class339.field4744.method4339(var4[var5], 0, this.field5127);
                }
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < this.field5129.length; var7++) {
            byte[] var8 = this.field5129[var7];
            class494 var9 = new class494(var8);
            var9.field7042 = 1;
            int var10 = var9.method2998(true);
            class791 var11 = class216.field3355;
            synchronized (class216.field3355) {
                var6 &= class216.field3355.method4349((byte) -102, var10);
            }
        }
        if (arg0 != -6378) {
            this.method2300((byte) 85, 52);
        }
        if (!var6) {
            return false;
        }
        class266 var12 = new class266();
        class791 var13 = class339.field4744;
        int[] var15;
        synchronized (class339.field4744) {
            int var14 = class339.field4744.method4353(this.field5127, true);
            this.field5121 = new class134[var14];
            var15 = class339.field4744.method4348((byte) -71, this.field5127);
        }
        for (int var16 = 0; var16 < var15.length; var16++) {
            byte[] var17 = this.field5129[var16];
            class494 var18 = new class494(var17);
            var18.field7042 = 1;
            int var19 = var18.method2998(true);
            class390 var20 = null;
            for (class390 var21 = (class390) var12.method1731((byte) -125); var21 != null; var21 = (class390) var12.method1724(0)) {
                if (var21.field5375 == var19) {
                    var20 = var21;
                    break;
                }
            }
            if (var20 == null) {
                class791 var22 = class216.field3355;
                synchronized (class216.field3355) {
                    var20 = new class390(var19, class216.field3355.method4335(var19, arg0 ^ 0xFFFFE716));
                }
                var12.method1727(var20, (byte) 80);
            }
            this.field5121[var15[var16]] = new class134(var17, var20);
        }
        this.field5129 = null;
        return true;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)Z", line = 170)
    public final boolean method2303(int arg0, int arg1) {
        field5128++;
        if (arg0 != -1) {
            this.field5121 = null;
        }
        return this.field5121[arg1].field2029;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(II)Z", line = 191)
    public final boolean method2304(int arg0, int arg1) {
        if (arg0 != -755) {
            this.field5121 = null;
        }
        field5126++;
        return this.field5121[arg1].field2019;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(I)V", line = 201)
    public class369(int arg0) {
        this.field5127 = arg0;
    }
}
