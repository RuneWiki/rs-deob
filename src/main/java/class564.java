import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class564 {

    @OriginalMember(owner = "client!og", name = "f", descriptor = "Lpea;")
    private class641 field7722;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "J")
    public long field7719;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "Lkca;")
    public static class537 field7724 = new class537();

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field7717;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field7718;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field7720;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field7721;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field7723;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field7725;

    @OriginalMember(owner = "client!og", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field7723++;
        this.field7722.method3537(this.field7719, -31441);
        super.finalize();
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public static void method3177(int arg0) {
        if (arg0 != 20000) {
            method3181(-107, -48, 52, 70, 37, 100, 65);
        }
        field7724 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)B")
    public static final byte method3178(int arg0, int arg1, int arg2) {
        field7717++;
        if (arg1 == 9) {
            return (byte) ((arg0 & arg2) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "([BZI)V")
    public static final void method3179(byte[] arg0, boolean arg1, int arg2) {
        field7718++;
        if (class440.field6062 == null) {
            class440.field6062 = new class138(20000);
        }
        if (arg2 < 2) {
            return;
        }
        class440.field6062.method955(arg0.length, 0, 29986, arg0);
        if (!arg1) {
            return;
        }
        class33.method201(true, class440.field6062.field1712);
        class375.field5394 = new class40[class690.field9745];
        int var3 = 0;
        for (int var4 = class528.field7316; var4 <= class352.field5142; var4++) {
            class40 var5 = class140.method967(var4, (byte) 97);
            if (var5 != null) {
                class375.field5394[var3++] = var5;
            }
        }
        class562.field7692 = false;
        class103.field1256 = class669.method3713(0);
        class440.field6062 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)V")
    public static final void method3180(int arg0, byte arg1) {
        field7721++;
        if (arg1 < 19) {
            method3181(122, -109, 49, 45, -48, 87, -108);
        }
        class641.method3538(28970);
        class82.method460((byte) 117);
        class473.method2656(-12087, arg0, true);
        class4.method26(0);
        class234.method1450(false, class9.field103);
        class282.method1696(class9.field103, (byte) 80);
        class305.method1831(class9.field103, class39.field510, (byte) 81);
        class270.method1656((byte) 89);
        class19.method109(2048, class615.field8391);
        class578.method3251((byte) 83);
        class107.method572(123);
        if (class476.field6436 == 3) {
            class676.method3739(-22149, 4);
        } else if (class476.field6436 == 7) {
            class676.method3739(-22149, 8);
        } else if (class476.field6436 == 10) {
            class676.method3739(-22149, 11);
        } else if (class476.field6436 == 1 || class476.field6436 == 2) {
            class86.field1059.method39(112);
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lpea;J[Lpc;)V")
    public class564(class641 arg0, long arg1, class216[] arg2) {
        this.field7722 = arg0;
        this.field7719 = arg1;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7720++;
        class90[] var7 = class249.field3357;
        for (int var8 = arg3; var8 < var7.length; var8++) {
            class90 var9 = var7[var8];
            if (var9 != null && var9.field1099 == 2) {
                class248.method1551((byte) 30, var9.field1103 * 2, var9.field1105, var9.field1098, arg4, arg5 >> 1, var9.field1101, arg6, arg1 >> 1);
                if (class558.field7608[0] > -1 && class430.field5984 % 20 < 10) {
                    class521.field7222[var9.field1100].method2450(arg2 + class558.field7608[0] - 12, arg0 - 28 + class558.field7608[1]);
                }
            }
        }
    }
}
