import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class79 extends class53 {

    @OriginalMember(owner = "client!th", name = "O", descriptor = "Lwa;")
    public static class75 field1350 = class66.method560("Konfig geladen)3", false);

    @OriginalMember(owner = "client!th", name = "S", descriptor = "[[B")
    public static byte[][] field1354 = new byte[250][];

    @OriginalMember(owner = "client!th", name = "M", descriptor = "F")
    public static float field1348;

    @OriginalMember(owner = "client!th", name = "N", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!th", name = "P", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!th", name = "R", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(II)Lme;", line = 16)
    public static final class176 method672(int arg0, int arg1) {
        if (arg1 != 16) {
            method672(73, 59);
        }
        field1351++;
        class176 var2 = (class176) class14.field188.method1193((long) arg0, 123);
        if (var2 != null) {
            return var2;
        }
        class176 var3 = class99.method759(class282.field4865, arg0, class185.field3071, (byte) -76, false);
        if (var3 != null) {
            class14.field188.method1194(var3, (long) arg0, false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V", line = 41)
    public class79() {
        super(0, true);
    }

    @OriginalMember(owner = "client!th", name = "g", descriptor = "(I)V", line = 45)
    public static void method673(int arg0) {
        if (arg0 < 9) {
            method674(96, 55, -106, (byte) 109, 17, -6, -50, 11, -96);
        }
        field1354 = (byte[][]) null;
        field1350 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIBIIIII)V", line = 64)
    public static final void method674(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1349++;
        if (arg3 < 42) {
            return;
        }
        if (class51.method375(arg2, -125)) {
            class65.field1126 = null;
            class212.method1567(arg0, arg8, -1, arg6, arg4, arg1, class249.field4198[arg2], arg7, 45, arg5);
            if (class65.field1126 != null) {
                class212.method1567(arg0, arg8, -1412584499, class206.field3486, class125.field2144, arg1, class65.field1126, arg7, -108, arg5);
                class65.field1126 = null;
            }
        } else if (arg1 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class226.field3815[var9] = true;
            }
        } else {
            class226.field3815[arg1] = true;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIII)V", line = 104)
    public static final void method675(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class283.field4891[0].method351(arg5, arg0);
        field1352++;
        class283.field4891[1].method351(arg5, arg0 + arg2 - 16);
        int var6 = (arg2 - 32) * arg2 / arg4;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg2 - var6 - 32) * arg3 / (arg4 - arg2);
        class222.method1632(arg5, arg0 + 16, 16, arg2 - 32, class133.field2295);
        class222.method1632(arg5, arg0 + var7 + 16, 16, var6, class273.field4717);
        class222.method1634(arg5, arg0 + var7 + 16, var6, class87.field1427);
        class222.method1634(arg5 + 1, arg0 + 16 - -var7, var6, class87.field1427);
        int var8 = 3 / ((arg1 + 47) / 52);
        class222.method1635(arg5, arg0 + var7 + 16, 16, class87.field1427);
        class222.method1635(arg5, arg0 + var7 + 17, 16, class87.field1427);
        class222.method1634(arg5 + 15, var7 + 16 + arg0, var6, class120.field2027);
        class222.method1634(arg5 + 14, arg0 - -var7 + 17, var6 - 1, class120.field2027);
        class222.method1635(arg5, var6 + var7 + arg0 + 15, 16, class120.field2027);
        class222.method1635(arg5 + 1, var7 + 14 + arg0 + var6, 15, class120.field2027);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(II)[I", line = 145)
    public final int[] method59(int arg0, int arg1) {
        if (arg0 != -15196) {
            field1348 = 0.87487227F;
        }
        int[] var3 = this.field878.method1603(arg1, (byte) 122);
        field1353++;
        if (this.field878.field3749) {
            class231.method1691(var3, 0, class269.field4644, class50.field814[arg1]);
        }
        return var3;
    }
}
