import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public abstract class class411 {

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public int field5751;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public int field5745;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "Laj;")
    public static class71 field5748 = new class71(16);

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "[Z")
    public static boolean[] field5754 = new boolean[100];

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "[S")
    public static short[] field5755 = new short[256];

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "Lac;")
    public static class216 field5753;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lug;IIIIZ)Z")
    public abstract boolean method1502(class325 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(Lug;IIIIZ)V")
    public abstract void method1516(class325 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public abstract void method1514(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public abstract void method1505(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lj;[I)V")
    public abstract void method1520(class269 arg0, int[] arg1);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "()V")
    public abstract void method1513();

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(Lug;IIIIZ)V")
    public abstract void method1511(class325 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILug;)Lug;")
    public abstract class325 method1504(int arg0, int arg1, class325 arg2);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method1510(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static void method2545(int arg0) {
        field5753 = null;
        field5755 = null;
        int var1 = -61 % ((68 - arg0) / 53);
        field5754 = null;
        field5748 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V")
    public abstract void method1503(int arg0, int arg1);

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)I")
    public abstract int method1515(int arg0, int arg1);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZZ)V")
    public static final void method2546(boolean arg0, boolean arg1) {
        field5747++;
        if (arg1) {
            return;
        }
        if (arg0) {
            if (class149.field2288 != -1) {
                class101.method863(class149.field2288, 2);
            }
            for (class64 var2 = (class64) class204.field2865.method608(81); var2 != null; var2 = (class64) class204.field2865.method606((byte) 115)) {
                if (!var2.method2370(0)) {
                    var2 = (class64) class204.field2865.method608(119);
                    if (var2 == null) {
                        break;
                    }
                }
                class316.method2013(!arg1, true, false, var2);
            }
            class149.field2288 = -1;
            class204.field2865 = new class71(8);
            class329.method2092(false);
            class149.field2288 = class427.field6050;
            class22.method282(false, -112);
            class125.method973(0);
            class18.method263(class149.field2288);
        }
        class68.method589(61);
        class124.field1733 = -1;
        class28.method333(class24.field424, 56);
        class95.field1379 = new class338();
        class95.field1379.field3167 = 6656;
        class95.field1379.field3176 = 6656;
        class95.field1379.field5005[0] = 52;
        class95.field1379.field4998[0] = 52;
        class374.field5261 = 0;
        class356.field4842 = 0;
        if (class184.field2675 == 2) {
            class374.field5261 = class325.field4416 << 7;
            class356.field4842 = class361.field4910 << 7;
        } else {
            class243.method1599((byte) -124);
        }
        class361.method2268(105);
        if (class356.field4842 == 0 || class374.field5261 == 0) {
            class29.method340(10, (byte) -58);
        } else {
            class288.method1817(-1);
            class29.method340(28, (byte) -58);
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(II)V")
    public class411(int arg0, int arg1) {
        this.field5751 = arg1;
        this.field5745 = arg0;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)V")
    public abstract void method1519(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(II)I")
    public abstract int method1509(int arg0, int arg1);

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(II)Llk;")
    public static final class121 method2547(int arg0, int arg1) {
        field5746++;
        class121 var2 = (class121) class210.field2929.method2537(arg1 - 88, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 8) {
            method2545(51);
        }
        byte[] var3 = class91.field1350.method2633(arg0, -1, 33);
        class121 var4 = new class121();
        if (var3 != null) {
            var4.method957(new class289(var3), arg0, 43);
        }
        class210.field2929.method2542(var4, (byte) -88, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
    public static final void method2548(int arg0) {
        field5749++;
        class153.method1178((byte) 23, false);
        if (class89.field1324 >= 0 && class89.field1324 != 0) {
            class447.method2785(class89.field1324, (byte) 109);
            class89.field1324 = -1;
        }
        if (arg0 >= -15) {
            field5754 = null;
        }
    }
}
