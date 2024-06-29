import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class209 {

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "J")
    public static long field3773 = 0L;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field3774 = 0;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field3778 = 0;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "[I")
    public static int[] field3777;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIB)V")
    public static final void method1437(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field3779++;
        int var9 = arg4 + 1;
        class191.method1255(arg2, arg0, arg1, 126, class38.field870[arg4]);
        if (arg5 != 60) {
            return;
        }
        int var10003 = arg5 + 31;
        int var8 = arg3 - 1;
        class191.method1255(arg2, arg0, arg1, var10003, class38.field870[arg3]);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class38.field870[var6];
            var7[arg2] = var7[arg1] = arg0;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)V")
    public static final void method1438(int arg0, boolean arg1) {
        field3776++;
        if (arg1 == class215.field3820) {
            return;
        }
        class215.field3820 = arg1;
        class205.method1417(0);
        if (arg0 != 1) {
            field3778 = -5;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public static void method1439(byte arg0) {
        field3777 = null;
        if (arg0 < 92) {
            field3778 = -24;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)V")
    public static final void method1440(int arg0, int arg1, int arg2) {
        class207.field3745 = true;
        class115.field2160 = arg0;
        class184.field3332 = arg1;
        class5.field105 = arg2;
        class142.field2608 = -1;
        class90.field1775 = -1;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IJ)V")
    public static final void method1441(int arg0, long arg1) {
        field3775++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class100.field1908; var3++) {
            if (class38.field871[var3] == arg1) {
                class100.field1908--;
                class187.field3368++;
                for (int var4 = var3; var4 < class100.field1908; var4++) {
                    class238.field4159[var4] = class238.field4159[var4 + 1];
                    class92.field1812[var4] = class92.field1812[var4 + 1];
                    class2.field30[var4] = class2.field30[var4 + 1];
                    class38.field871[var4] = class38.field871[var4 + 1];
                    class268.field4726[var4] = class268.field4726[var4 + 1];
                    class82.field1633[var4] = class82.field1633[var4 + 1];
                }
                class75.field1558 = class112.field2108;
                class154.field2792.method1516(arg0 ^ 0x54, 106);
                class154.field2792.method1272((byte) 59, arg1);
                break;
            }
        }
        if (arg0 != 1) {
            method1438(-126, false);
        }
    }
}
