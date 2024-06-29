import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class337 {

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)I")
    public static final int method2027(int arg0) {
        field4773++;
        return arg0 == -101 ? class549.field7255 : -42;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I[B)V")
    public static final synchronized void method2028(int arg0, byte[] arg1) {
        field4772++;
        if (arg0 != -20465) {
            method2027(-94);
        }
        if (arg1.length == 100 && class520.field6930 < 1000) {
            class439.field6063[class520.field6930++] = arg1;
        } else if (arg1.length == 5000 && class456.field6212 < 250) {
            class100.field1341[class456.field6212++] = arg1;
        } else if (arg1.length == 30000 && class349.field4919 < 50) {
            class84.field1026[class349.field4919++] = arg1;
        } else if (class327.field4666 != null) {
            for (int var2 = 0; var2 < class630.field8394.length; var2++) {
                if (class630.field8394[var2] == arg1.length && class475.field6516[var2] < class327.field4666[var2].length) {
                    class327.field4666[var2][class475.field6516[var2]++] = arg1;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method2029(int arg0, int arg1) {
        if (arg1 != -1) {
            method2028(47, null);
        }
        field4774++;
        if (arg0 == 100 && class520.field6930 > 0) {
            byte[] var2 = class439.field6063[--class520.field6930];
            class439.field6063[class520.field6930] = null;
            return var2;
        } else if (arg0 == 5000 && class456.field6212 > 0) {
            byte[] var3 = class100.field1341[--class456.field6212];
            class100.field1341[class456.field6212] = null;
            return var3;
        } else if (arg0 == 30000 && class349.field4919 > 0) {
            byte[] var4 = class84.field1026[--class349.field4919];
            class84.field1026[class349.field4919] = null;
            return var4;
        } else {
            if (class327.field4666 != null) {
                for (int var5 = 0; var5 < class630.field8394.length; var5++) {
                    if (class630.field8394[var5] == arg0 && class475.field6516[var5] > 0) {
                        byte[] var6 = class327.field4666[var5][--class475.field6516[var5]];
                        class327.field4666[var5][class475.field6516[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg0];
        }
    }
}
