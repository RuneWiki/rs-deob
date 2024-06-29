import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class286 {

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "Lqr;")
    private class65 field4046 = new class65(64);

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "Lwu;")
    private class376 field4042;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "[S")
    private static short[] field4048 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "[S")
    private static short[] field4049 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "[S")
    private static short[] field4056 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "[[S")
    public static short[][] field4054 = new short[][] { field4048, field4056, field4049 };

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "Lfi;")
    public static class557 field4041;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 3)
    public final void method1768(int arg0) {
        class65 var2 = this.field4046;
        synchronized (this.field4046) {
            this.field4046.method558(0);
        }
        field4053++;
        int var3 = -17 / ((-arg0 - 80) / 41);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lgu;B)V", line = 17)
    public static final void method1769(class581 arg0, byte arg1) {
        if (arg0.field7626 != null) {
            arg0.field7626.field6947 = 0;
        }
        arg0.field7627 = false;
        field4045++;
        if (arg1 < -83) {
            for (class581 var2 = arg0.method33(); var2 != null; var2 = arg0.method53()) {
                method1769(var2, (byte) -106);
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IB)V", line = 41)
    public final void method1770(int arg0, byte arg1) {
        if (arg1 != 42) {
            field4054 = null;
        }
        class65 var3 = this.field4046;
        synchronized (this.field4046) {
            this.field4046.method553(arg0, -15782);
        }
        field4044++;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;", line = 60)
    public static final String[] method1771(int arg0, String[] arg1) {
        if (arg0 != -28574) {
            method1775(77);
        }
        field4051++;
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BLha;)V", line = 94)
    public static final void method1772(byte arg0, class59 arg1) {
        field4043++;
        class275.field3832 = class382.method2251(class2.field28, arg1, (byte) 58, true);
        class304.field4337 = class582.method3184(arg1, class2.field28, 27198);
        if (arg0 > -90) {
            method1771(-15, null);
        }
        class148.field2334 = class382.method2251(class511.field6790, arg1, (byte) 58, true);
        class180.field2728 = class582.method3184(arg1, class511.field6790, 27198);
        class64.field785 = class382.method2251(class573.field7524, arg1, (byte) 58, true);
        class105.field1446 = class582.method3184(arg1, class573.field7524, 27198);
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)V", line = 115)
    public static void method1773(int arg0) {
        field4056 = null;
        field4049 = null;
        field4054 = null;
        if (arg0 < -114) {
            field4048 = null;
            field4041 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)V", line = 130)
    public final void method1774(int arg0) {
        if (arg0 != -1) {
            field4054 = null;
        }
        class65 var2 = this.field4046;
        synchronized (this.field4046) {
            this.field4046.method561((byte) -78);
        }
        field4052++;
    }

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "(I)V", line = 148)
    public static final void method1775(int arg0) {
        field4050++;
        class442.field6091.method561((byte) -78);
        class96.field1190.method561((byte) -78);
        if (arg0 >= 27) {
            class472.field6469.method561((byte) -78);
            class637.field8463.method561((byte) -78);
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lms;ILwu;)V", line = 165)
    public class286(class763 arg0, int arg1, class376 arg2) {
        this.field4042 = arg2;
        if (this.field4042 != null) {
            this.field4042.method2195(35, 0);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)Lls;", line = 185)
    public final class141 method1776(int arg0, int arg1) {
        field4057++;
        class65 var3 = this.field4046;
        class141 var4;
        synchronized (this.field4046) {
            var4 = (class141) this.field4046.method552(4, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class376 var5 = this.field4042;
        byte[] var6;
        synchronized (this.field4042) {
            var6 = this.field4042.method2218((byte) 119, arg0, arg1);
        }
        class141 var7 = new class141();
        if (var6 != null) {
            var7.method1083((byte) 64, new class677(var6));
        }
        var7.method1080(arg0 - 29);
        class65 var8 = this.field4046;
        synchronized (this.field4046) {
            this.field4046.method556((byte) 0, (long) arg1, var7);
            return var7;
        }
    }
}
