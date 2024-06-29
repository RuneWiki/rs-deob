import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class254 {

    @OriginalMember(owner = "client!of", name = "g", descriptor = "[I")
    private int[] field4532;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "Leb;")
    public static class230 field4526 = class68.method589(0, "Null");

    @OriginalMember(owner = "client!of", name = "h", descriptor = "Leb;")
    public static class230 field4533 = class68.method589(0, "Loaded world list data");

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "[[B")
    public static byte[][] field4527;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)I")
    public final int method1781(byte arg0, int arg1) {
        field4531++;
        if (arg0 >= -98) {
            return 122;
        }
        int var3 = (this.field4532.length >> 1) - 1;
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field4532[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field4532[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IILeb;IBIJ)V")
    public static final void method1782(int arg0, int arg1, class230 arg2, int arg3, byte arg4, int arg5, long arg6) {
        if (arg4 > -32) {
            method1784((byte) -65);
        }
        class14 var8 = new class14(128);
        field4530++;
        var8.method170((byte) 115, 10);
        var8.method181(-20053, (int) (Math.random() * 99999.0D));
        var8.method181(-20053, 516);
        var8.method148(arg6, (byte) 121);
        var8.method165((int) (Math.random() * 9.9999999E7D), 1380186760);
        var8.method197(0, arg2);
        var8.method165((int) (Math.random() * 9.9999999E7D), 1380186760);
        var8.method181(-20053, class56.field1035);
        var8.method170((byte) 127, arg5);
        var8.method170((byte) 127, arg0);
        var8.method165((int) (Math.random() * 9.9999999E7D), 1380186760);
        var8.method181(-20053, arg1);
        var8.method181(-20053, arg3);
        var8.method165((int) (Math.random() * 9.9999999E7D), 1380186760);
        var8.method163(class75.field1368, false, class75.field1363);
        class153.field2747.field318 = 0;
        class153.field2747.method170((byte) 120, 252);
        class153.field2747.method170((byte) 117, var8.field318);
        class153.field2747.method159(var8.field269, 0, false, var8.field318);
        class159.field2852 = 0;
        class210.field3668 = 0;
        class146.field2639 = -3;
        class214.field3716 = 1;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lkk;I)V")
    public static final void method1783(class223 arg0, int arg1) {
        class128.field2243 = arg0;
        if (arg1 >= -69) {
            field4527 = null;
        }
        class178.field3140 = class128.field2243.method1533((byte) 103, 4);
        field4528++;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public static void method1784(byte arg0) {
        field4526 = null;
        field4533 = null;
        if (arg0 > -89) {
            field4527 = null;
        }
        field4527 = null;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "([I)V")
    public class254(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field4532 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field4532[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field4532[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field4532[var5 + var5] = arg0[var4];
            this.field4532[var5 + var5 + 1] = var4++;
        }
    }
}
