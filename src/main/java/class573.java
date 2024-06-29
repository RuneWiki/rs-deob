import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class573 {

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "Laf;")
    private class39 field8065 = new class39(128);

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "Lae;")
    private class283 field8062;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public static int field8060;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
    public static int field8061;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public static int field8063;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
    public static int field8064;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
    public static int field8066;

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "I")
    public static int field8067;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method3361(boolean arg0) {
        field8060++;
        int[] var1 = new int[class35.field367.field7024];
        int var2 = 0;
        if (!arg0) {
            method3365(null, 87);
        }
        for (int var3 = 0; var3 < class35.field367.field7024; var3++) {
            class581 var5 = class35.field367.method3051((byte) -20, var3);
            if (var5.field8222 >= 0 || var5.field8202 >= 0) {
                var1[var2++] = var3;
            }
        }
        class165.field2105 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class165.field2105[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V", line = 40)
    public final void method3362(int arg0) {
        if (arg0 < 7) {
            method3361(true);
        }
        class39 var2 = this.field8065;
        synchronized (this.field8065) {
            this.field8065.method314(-2);
        }
        field8061++;
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)V", line = 56)
    public final void method3363(int arg0) {
        class39 var2 = this.field8065;
        synchronized (this.field8065) {
            this.field8065.method319(-11);
        }
        field8067++;
        if (arg0 <= 76) {
            this.method3362(-114);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)V", line = 69)
    public final void method3364(int arg0, int arg1) {
        if (arg1 > -124) {
            this.field8065 = null;
        }
        field8064++;
        class39 var3 = this.field8065;
        synchronized (this.field8065) {
            this.field8065.method308(-1, arg0);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lpja;I)V", line = 86)
    public static final void method3365(class171 arg0, int arg1) {
        field8063++;
        if (arg0 == null || arg1 <= 72) {
            return;
        }
        class646.field9038.method1039(arg0, 0);
        class640.field8992++;
        Object var2 = null;
        class498 var5;
        if (arg0.field2177 || "".equals(arg0.field2169)) {
            var5 = new class498(arg0.field2169);
            class367.field5278++;
        } else {
            long var3 = arg0.field2183;
            for (var5 = (class498) class775.field10667.method3669(false, var3); var5 != null && !var5.field6827.equals(arg0.field2169); var5 = (class498) class775.field10667.method3673(-103)) {
            }
            if (var5 == null) {
                var5 = (class498) class577.field8108.method312(0, var3);
                if (var5 != null && !var5.field6827.equals(arg0.field2169)) {
                    var5 = null;
                }
                if (var5 == null) {
                    var5 = new class498(arg0.field2169);
                }
                class775.field10667.method3666((byte) 65, var3, var5);
                class367.field5278++;
            }
        }
        if (var5.method2927(99, arg0)) {
            class563.method3332(var5, true);
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(II)Lpv;", line = 142)
    public final class189 method3366(int arg0, int arg1) {
        field8066++;
        class39 var3 = this.field8065;
        class189 var5;
        synchronized (this.field8065) {
            if (arg1 > -94) {
                return null;
            }
            var5 = (class189) this.field8065.method312(0, (long) arg0);
        }
        if (var5 != null) {
            return var5;
        }
        class283 var6 = this.field8062;
        byte[] var7;
        synchronized (this.field8062) {
            var7 = this.field8062.method1849(arg0, (byte) -9, 1);
        }
        class189 var8 = new class189();
        if (var7 != null) {
            var8.method1182(new class511(var7), (byte) -13);
        }
        class39 var9 = this.field8065;
        synchronized (this.field8065) {
            this.field8065.method305(var8, (long) arg0, 18320);
            return var8;
        }
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Ljk;ILae;)V", line = 178)
    public class573(class788 arg0, int arg1, class283 arg2) {
        this.field8062 = arg2;
        this.field8062.method1867(1, (byte) 49);
    }
}
