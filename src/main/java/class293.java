import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class293 extends class312 {

    @OriginalMember(owner = "client!hp", name = "p", descriptor = "Lfi;")
    public static class38 field4529 = null;

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "Ljp;")
    public static class55 field4522 = new class55(48, -1);

    @OriginalMember(owner = "client!hp", name = "s", descriptor = "Ljp;")
    public static class55 field4532 = new class55(13, 5);

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!hp", name = "j", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!hp", name = "l", descriptor = "I")
    public int field4525;

    @OriginalMember(owner = "client!hp", name = "m", descriptor = "I")
    public int field4526;

    @OriginalMember(owner = "client!hp", name = "o", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!hp", name = "r", descriptor = "I")
    public int field4531;

    @OriginalMember(owner = "client!hp", name = "n", descriptor = "Lps;")
    public class352 field4527;

    @OriginalMember(owner = "client!hp", name = "q", descriptor = "Llq;")
    public static class6 field4530;

    @OriginalMember(owner = "client!hp", name = "k", descriptor = "[Lwg;")
    public class41[] field4524;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)V", line = 5)
    public static final void method1959(int arg0, int arg1) {
        field4528++;
        class188 var2 = class10.method48((byte) 112, 16, arg1);
        if (arg0 != 0) {
            field4529 = null;
        }
        var2.method1306(-23128);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIILza;)Z", line = 22)
    public final boolean method1960(int arg0, int arg1, int arg2, class299 arg3) {
        field4521++;
        if (this.field4524 != null) {
            for (int var5 = 0; var5 < this.field4524.length; var5++) {
                if (this.field4524[var5].method279(arg1, arg2) && this.field4527.method109(arg3, arg1, 91, arg2)) {
                    return true;
                }
            }
        }
        if (arg0 != 100) {
            method1961(-123);
        }
        return false;
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)I", line = 50)
    public static final int method1961(int arg0) {
        field4523++;
        class299 var1 = class376.field5542;
        boolean var2 = false;
        if (class108.field1631 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class299.method1995(null, 99, var3, 0, null, 0);
        }
        long var4 = class375.method2397((byte) -75);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method524(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class375.method2397((byte) -75) - var4);
        var1.method1991(0, -16777216, 100, 100, arg0 ^ 0x7E, arg0);
        if (var2) {
            var1.method1988((byte) -48);
        }
        return var7;
    }

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "(I)V", line = 91)
    public static void method1962(int arg0) {
        field4530 = null;
        field4529 = null;
        if (arg0 != 0) {
            method1962(-98);
        }
        field4532 = null;
        field4522 = null;
    }
}
