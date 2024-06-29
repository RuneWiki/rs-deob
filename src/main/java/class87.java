import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class87 {

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public int field1415;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public int field1420;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public int field1419;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public int field1412;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1409 = null;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "[I")
    public static int[] field1413 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field1418 = 0;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field1414 = 0;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "Lhi;")
    public static class45 field1417 = new class45(67, 3);

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(JB)V", line = 4)
    public static final void method729(long arg0, byte arg1) {
        field1410++;
        if (class103.field1632 != null) {
            if (class247.field3363 == 1 || class247.field3363 == 5) {
                class479.method2837(arg0, true);
            } else if (class247.field3363 == 4) {
                class355.method2123(-18823, arg0);
            }
        }
        class258.method1534(true, class275.field3737, (long) class28.field417);
        if (class236.field3268 != -1) {
            class137.method976(class236.field3268, (byte) -56);
        }
        for (int var3 = 0; var3 < class293.field3963; var3++) {
            if (class428.field6214[var3]) {
                class259.field3517[var3] = true;
            }
            class225.field3178[var3] = class428.field6214[var3];
            class428.field6214[var3] = false;
        }
        class255.field3478 = class28.field417;
        if (class275.field3737.method551()) {
            class416.field6038 = true;
        }
        if (arg1 > -107) {
            return;
        }
        if (class236.field3268 != -1) {
            class293.field3963 = 0;
            class224.method1394((byte) -73);
        }
        class275.field3737.method477();
        class511.method3032(class275.field3737, (byte) -18);
        int var4 = class123.method897(-3);
        if (var4 == -1) {
            var4 = class358.field5165;
        }
        if (var4 == -1) {
            var4 = class275.field3733;
        }
        class9.method63(var4, 11363);
        class251.method1502(class81.field1158.field6284, class81.field1158.field6287, (byte) -104, class81.field1158.field6279, class71.field1026);
        class71.field1026 = 0;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IB)Ldl;", line = 83)
    public final class87 method730(int arg0, byte arg1) {
        field1416++;
        return arg1 == -68 ? new class87(this.field1415, arg0, this.field1419, this.field1412) : null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lza;Llb;III)V", line = 95)
    public static final void method731(class295 arg0, class186 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class124.field1916) {
            class532 var5 = class103.field1632[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field7838 != null && var5.field7838.method169(-28206)) {
                arg1.method161(var5.field7838, class117.field1845, true, 0, (byte) 62, 0, arg0);
            }
        }
        if (arg4 < class124.field1916) {
            class532 var6 = class103.field1632[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field7838 != null && var6.field7838.method169(-28206)) {
                arg1.method161(var6.field7838, 0, true, class117.field1845, (byte) 100, 0, arg0);
            }
        }
        if (arg3 < class124.field1916 && arg4 < class177.field2664) {
            class532 var7 = class103.field1632[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field7838 != null && var7.field7838.method169(-28206)) {
                arg1.method161(var7.field7838, class117.field1845, true, class117.field1845, (byte) 94, 0, arg0);
            }
        }
        if (arg3 < class124.field1916 && arg4 > 0) {
            class532 var8 = class103.field1632[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field7838 != null && var8.field7838.method169(-28206)) {
                arg1.method161(var8.field7838, class117.field1845, true, -class117.field1845, (byte) 96, 0, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V", line = 143)
    public static final void method732(int arg0, int arg1) {
        class149.field2304 = arg1;
        field1411++;
        class437.field6306 = -1;
        class65.field944 = arg0;
        class203.field2940 = 100;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(IIII)V", line = 158)
    public class87(int arg0, int arg1, int arg2, int arg3) {
        this.field1415 = arg0;
        this.field1420 = arg1;
        this.field1419 = arg2;
        this.field1412 = arg3;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)V", line = 177)
    public static void method733(boolean arg0) {
        field1417 = null;
        field1413 = null;
        if (arg0) {
            field1414 = 101;
        }
        field1409 = null;
    }
}
