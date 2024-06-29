import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class69 extends class192 {

    @OriginalMember(owner = "client!lp", name = "M", descriptor = "I")
    private int field928 = 4096;

    @OriginalMember(owner = "client!lp", name = "O", descriptor = "I")
    private int field930 = 4096;

    @OriginalMember(owner = "client!lp", name = "Q", descriptor = "I")
    private int field932 = 4096;

    @OriginalMember(owner = "client!lp", name = "N", descriptor = "[[I")
    public static int[][] field929 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!lp", name = "I", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!lp", name = "J", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!lp", name = "K", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!lp", name = "L", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!lp", name = "P", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "()V", line = 47)
    public class69() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IZ)V", line = 13)
    public static final void method555(int arg0, boolean arg1) {
        ++field924;
        class424.method2439(26);
        if (class169.method1160(12, class566.field7391)) {
            if (arg0 <= 50) {
                method556(4);
            }
            ++class659.field9191;
            if (~class659.field9191 <= -51 || arg1) {
                class659.field9191 = 0;
                if (!class185.field2364 && class2.field15 != null) {
                    ++class564.field7363;
                    class11 var2 = class130.method931(class649.field9035, (byte) 54, class307.field4022);
                    class100.method760(var2, -98);
                    try {
                        class96.method730(0);
                    } catch (IOException var3) {
                        class185.field2364 = true;
                    }
                }
                class424.method2439(26);
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(IB)[[I", line = 50)
    public final int[][] method107(int arg0, byte arg1) {
        ++field931;
        int var3 = 119 / ((-14 - arg1) / 34);
        int[][] var4 = super.field2467.method2466(arg0, 0);
        if (super.field2467.field5565) {
            int[][] var5 = this.method1251(0, arg0, (byte) -49);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class561.field7319; ++var12) {
                int var13 = var6[var12];
                int var14 = var8[var12];
                int var15 = var7[var12];
                if (~var13 == ~var14 && ~var14 == ~var15) {
                    var9[var12] = this.field930 * var13 >> 12;
                    var10[var12] = this.field928 * var14 >> 12;
                    var11[var12] = this.field932 * var15 >> 12;
                } else {
                    var9[var12] = this.field930;
                    var10[var12] = this.field928;
                    var11[var12] = this.field932;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILfd;I)V", line = 117)
    public final void method109(int arg0, class418 arg1, int arg2) {
        ++field927;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field932 = arg1.method2393(-30727);
                }
            } else {
                this.field928 = arg1.method2393(-30727);
            }
        } else {
            this.field930 = arg1.method2393(-30727);
        }
        if (arg2 != -12160) {
            this.field932 = 74;
        }
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)V", line = 162)
    public static final void method556(int arg0) {
        if (arg0 < 87) {
            method555(113, true);
        }
        class486.field6470.method3656((byte) 0);
        ++field926;
    }

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "(I)V", line = 178)
    public static void method557(int arg0) {
        int var1 = -61 % ((arg0 - -3) / 41);
        field929 = null;
    }
}
