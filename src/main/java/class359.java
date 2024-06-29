import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class359 {

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "Z")
    private boolean field4569 = false;

    @OriginalMember(owner = "client!ega", name = "h", descriptor = "[Ljava/lang/String;")
    private String[] field4575 = new String[0];

    @OriginalMember(owner = "client!ega", name = "j", descriptor = "I")
    private int field4577 = -1;

    @OriginalMember(owner = "client!ega", name = "f", descriptor = "I")
    private int field4573;

    @OriginalMember(owner = "client!ega", name = "d", descriptor = "[Lqq;")
    public static class654[] field4571 = new class654[2048];

    @OriginalMember(owner = "client!ega", name = "m", descriptor = "F")
    public static float field4580;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!ega", name = "e", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!ega", name = "g", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!ega", name = "i", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!ega", name = "l", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!ega", name = "n", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!ega", name = "k", descriptor = "[[[I")
    public static int[][][] field4578;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljava/lang/String;BI)V", line = 8)
    private final void method1974(String arg0, byte arg1, int arg2) {
        if (arg1 != 99) {
            return;
        }
        field4568++;
        if (arg2 > this.field4577) {
            this.field4577 = arg2;
        }
        if (this.field4575.length <= arg2) {
            this.method1977(arg2, (byte) -124);
        }
        this.field4575[arg2] = arg0;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(II)I", line = 40)
    private final int method1975(int arg0, int arg1) {
        field4572++;
        int var3 = this.field4575.length;
        while (var3 <= arg1) {
            if (!this.field4569) {
                var3 += this.field4573;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field4573 * var3;
            }
        }
        if (arg0 != 1460) {
            this.field4573 = -9;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)V", line = 68)
    public static void method1976(int arg0) {
        field4578 = null;
        if (arg0 != 2048) {
            field4571 = null;
        }
        field4571 = null;
    }

    @OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(IZ)V", line = 193)
    public class359(int arg0, boolean arg1) {
        this.field4569 = arg1;
        this.field4573 = arg0;
    }

    @OriginalMember(owner = "client!ega", name = "toString", descriptor = "()Ljava/lang/String;", line = 83)
    public final String toString() {
        field4581++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field4577; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field4575[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(IB)V", line = 111)
    private final void method1977(int arg0, byte arg1) {
        field4574++;
        if (arg1 == -124) {
            String[] var3 = new String[this.method1975(1460, arg0)];
            class293.method1639(this.field4575, 0, var3, 0, this.field4575.length);
            this.field4575 = var3;
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(ILkp;II)V", line = 126)
    public static final void method1978(int arg0, class507 arg1, int arg2, int arg3) {
        field4579++;
        if (arg1 == null) {
            return;
        }
        if (arg1.field6760 != null) {
            class71 var4 = new class71();
            var4.field963 = arg1.field6760;
            var4.field952 = arg1;
            class197.method1191(var4);
        }
        class286.field3557 = arg1.field6832;
        class639.field8984 = arg2;
        class477.field6046 = arg1.field6770;
        class355.field4527 = arg3;
        class664.field9377 = true;
        class172.field2252 = arg1.field6834;
        class474.field6013 = arg1.field6805;
        if (arg0 == 0) {
            class529.field7156 = arg1.field6764;
            class572.method3158(arg1, 1023);
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 161)
    public final void method1979(String arg0, int arg1) {
        field4570++;
        this.method1974(arg0, (byte) 99, this.field4577 + arg1);
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(I)[Ljava/lang/String;", line = 170)
    public final String[] method1980(int arg0) {
        field4576++;
        String[] var2 = new String[this.field4577 + 1];
        class293.method1639(this.field4575, 0, var2, 0, this.field4577 + 1);
        if (arg0 != 26598) {
            method1978(-99, null, 81, 17);
        }
        return var2;
    }
}
