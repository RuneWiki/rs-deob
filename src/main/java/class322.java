import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class322 {

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "Lgk;")
    private class463 field4145;

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "J")
    public long field4140;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIB[BIII[BI)V")
    public static final void method1921(int arg0, int arg1, byte arg2, byte[] arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        field4143++;
        int var9 = -(arg1 >> 2);
        int var10 = 10 % ((arg2 - 54) / 54);
        int var11 = -(arg1 & 0x3);
        for (int var12 = -arg0; var12 < 0; var12++) {
            int var10001;
            for (int var13 = var9; var13 < 0; var13++) {
                var10001 = arg8++;
                arg3[var10001] = (byte) (arg3[var10001] - arg7[arg5++]);
                int var15 = arg8++;
                arg3[var15] = (byte) (arg3[var15] - arg7[arg5++]);
                int var16 = arg8++;
                arg3[var16] = (byte) (arg3[var16] - arg7[arg5++]);
                int var17 = arg8++;
                arg3[var17] = (byte) (arg3[var17] - arg7[arg5++]);
            }
            for (int var14 = var11; var14 < 0; var14++) {
                var10001 = arg8++;
                arg3[var10001] = (byte) (arg3[var10001] - arg7[arg5++]);
            }
            arg5 += arg4;
            arg8 += arg6;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V")
    public static final void method1922(byte arg0) {
        class459.field6413 = true;
        field4139++;
        if (arg0 >= -22) {
            field4144 = 86;
        }
    }

    @OriginalMember(owner = "client!ss", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field4141++;
        this.field4145.method2789(0, this.field4140);
        super.finalize();
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lgk;J[Lgo;)V")
    public class322(class463 arg0, long arg1, class307[] arg2) {
        this.field4145 = arg0;
        this.field4140 = arg1;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Loa;ZLjava/lang/String;I)V")
    public static final void method1923(class167 arg0, boolean arg1, String arg2, int arg3) {
        if (arg3 > -102) {
            field4144 = 20;
        }
        field4142++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class99.field1379.method1711(250, arg2, 117, null);
        int var8 = class99.field1379.method1708(arg2, (byte) -84, null, 250) * 13;
        class512.field7538.method861(var5 - var4, var6 - var4, var4 + var7 + var4, var4 + var8 - -var4, -16777216, 0);
        class512.field7538.method918(var5 - var4, -var4 + var6, var4 + var4 + var7, var4 + var8 + var4, -1, 0);
        arg0.method1109((byte) -56, 0, null, 1, arg2, -1, -1, var6, null, 0, var5, var7, null, 1, var8, 0);
        class475.method2855(var4 + var8 + var4, -var4 + var6, var5 - var4, 0, var4 + var7 + var4);
        if (arg1) {
            class512.field7538.method856();
        }
    }
}
