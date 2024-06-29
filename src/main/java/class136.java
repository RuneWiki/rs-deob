import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class136 extends class454 {

    @OriginalMember(owner = "client!jn", name = "D", descriptor = "Lin;")
    public static class380 field2260 = new class380(53, 2);

    @OriginalMember(owner = "client!jn", name = "A", descriptor = "I")
    public int field2257;

    @OriginalMember(owner = "client!jn", name = "E", descriptor = "I")
    public int field2261;

    @OriginalMember(owner = "client!jn", name = "F", descriptor = "I")
    public int field2262;

    @OriginalMember(owner = "client!jn", name = "J", descriptor = "I")
    public int field2266;

    @OriginalMember(owner = "client!jn", name = "M", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!jn", name = "O", descriptor = "I")
    public int field2271;

    @OriginalMember(owner = "client!jn", name = "P", descriptor = "I")
    public int field2272;

    @OriginalMember(owner = "client!jn", name = "H", descriptor = "Lss;")
    public class307 field2264;

    @OriginalMember(owner = "client!jn", name = "L", descriptor = "Lmq;")
    public static class85 field2268;

    @OriginalMember(owner = "client!jn", name = "C", descriptor = "Ljava/lang/String;")
    public String field2259;

    @OriginalMember(owner = "client!jn", name = "G", descriptor = "[I")
    public int[] field2263;

    @OriginalMember(owner = "client!jn", name = "K", descriptor = "[I")
    public int[] field2267;

    @OriginalMember(owner = "client!jn", name = "I", descriptor = "[J")
    public long[] field2265;

    @OriginalMember(owner = "client!jn", name = "B", descriptor = "[Lsi;")
    public class769[] field2258;

    @OriginalMember(owner = "client!jn", name = "N", descriptor = "[Ljava/lang/String;")
    public String[] field2270;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method1124(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (class742.field10301 <= arg0 && class435.field6058 >= arg1 && class515.field7102 <= arg2 && arg4 <= class698.field9801) {
            class75.method688(arg4, arg2, 1, arg6, arg0, arg5, arg3, arg1);
        } else {
            class513.method3021(arg1, arg3, arg0, arg6, arg5, arg4, true, arg2);
        }
        if (arg7 > -122) {
            method1126(-3);
        }
        field2269++;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "([Lnfa;II)V")
    public static final void method1125(class745[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class745 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field10348;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field10348 > (var7 & 0x1) + var6) {
                class745 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method1125(arg0, arg1, var4 - 1);
        method1125(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
    public static void method1126(int arg0) {
        field2268 = null;
        if (arg0 != 31972) {
            method1124(48, 111, 0, 74, 113, -28, 25, (byte) -59);
        }
        field2260 = null;
    }
}
