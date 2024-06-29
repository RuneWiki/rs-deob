import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class705 {

    @OriginalMember(owner = "client!gca", name = "g", descriptor = "Lbt;")
    public class519 field9809 = new class519();

    @OriginalMember(owner = "client!gca", name = "h", descriptor = "Z")
    public boolean field9810 = false;

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "Ljn;")
    public static class134 field9806 = new class134(42, -2);

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "I")
    public static int field9803;

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "I")
    public static int field9805;

    @OriginalMember(owner = "client!gca", name = "e", descriptor = "I")
    public static int field9807;

    @OriginalMember(owner = "client!gca", name = "f", descriptor = "I")
    public static int field9808;

    @OriginalMember(owner = "client!gca", name = "i", descriptor = "I")
    public static int field9811;

    @OriginalMember(owner = "client!gca", name = "k", descriptor = "I")
    public static int field9813;

    @OriginalMember(owner = "client!gca", name = "l", descriptor = "I")
    public static int field9814;

    @OriginalMember(owner = "client!gca", name = "j", descriptor = "Lhw;")
    public static class300 field9812;

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "[[I")
    public static int[][] field9804;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method3977(int arg0, int arg1, int arg2) {
        field9805++;
        if (arg2 != 0) {
            field9812 = null;
        }
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lrk;B)V", line = 14)
    public final void method3978(class289 arg0, byte arg1) {
        field9811++;
        class230 var3 = arg0.field4258;
        boolean var4 = true;
        class21[] var5 = arg0.field4255;
        int var6 = 0;
        if (arg1 >= -120) {
            method3977(118, 57, 101);
        }
        while (var5.length > var6) {
            if (var5[var6].field180) {
                var4 = false;
                break;
            }
            var6++;
        }
        if (var4) {
            return;
        }
        if (this.field9810) {
            for (class289 var7 = (class289) this.field9809.method3103((byte) 72); var7 != null; var7 = (class289) this.field9809.method3104(-10964)) {
                if (var7.field4258 == var3) {
                    var7.method2773(105);
                    class467.method2791(-115, var7);
                }
            }
        }
        for (class289 var8 = (class289) this.field9809.method3103((byte) 72); var8 != null; var8 = (class289) this.field9809.method3104(-10964)) {
            if (var3.field3471 >= var8.field4258.field3471) {
                class326.method2060(arg0, var8, (byte) 123);
                return;
            }
        }
        this.field9809.method3100(arg0, true);
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V", line = 86)
    public final void method3979(int arg0) {
        while (true) {
            class289 var2 = (class289) this.field9809.method3098(arg0 ^ 0x800);
            if (var2 == null) {
                if (arg0 != 2048) {
                    field9806 = null;
                }
                field9803++;
                return;
            }
            var2.method2773(arg0 - 2023);
            class467.method2791(82, var2);
        }
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(III)Z", line = 110)
    public static final boolean method3980(int arg0, int arg1, int arg2) {
        field9813++;
        if (arg2 != 0) {
            field9812 = null;
        }
        return class135.method906(arg1, arg0, arg2 ^ 0x7A) | (arg0 & 0x800) != 0 || class403.method2473(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IILjava/net/Socket;)Liv;", line = 121)
    public static final class634 method3981(int arg0, int arg1, Socket arg2) throws IOException {
        if (arg1 <= 37) {
            method3984((byte) -60);
        }
        field9807++;
        return new class689(arg2, arg0);
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(BLsha;)V", line = 132)
    public static final void method3982(byte arg0, class115 arg1) {
        field9814++;
        if (!class773.field10644) {
            return;
        }
        class66.field725++;
        if (arg1.field1428 != null) {
            class115 var2 = class446.method2705(class539.field7462, -107, class326.field4586);
            if (var2 != null) {
                class114 var3 = new class114();
                var3.field1376 = var2;
                var3.field1378 = arg1;
                var3.field1384 = arg1.field1428;
                class700.method3959(var3);
            }
        }
        class116 var4 = class248.method1672(class84.field1023, class602.field8446, -20647);
        var4.field1575.method3003(arg1.field1446, -23061);
        var4.field1575.method2977(false, class81.field913);
        var4.field1575.method2981(arg1.field1482, 128);
        var4.field1575.method2991(-2141775344, class539.field7462);
        var4.field1575.method2986(arg1.field1458, 17);
        int var5 = -61 / ((-arg0 - 80) / 40);
        var4.field1575.method2981(class326.field4586, 128);
        class443.method2655(0, var4);
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZI)V", line = 172)
    public static final void method3983(boolean arg0, int arg1) {
        class484.field6695++;
        if (arg1 != -1) {
            method3984((byte) 96);
        }
        field9808++;
        class116 var2 = class248.method1672(class84.field1023, class363.field5233, -20647);
        class443.method2655(0, var2);
        for (class610 var3 = (class610) class278.field3993.method3668(-84); var3 != null; var3 = (class610) class278.field3993.method3667((byte) -115)) {
            if (!var3.method529((byte) 46)) {
                var3 = (class610) class278.field3993.method3668(arg1 - 81);
                if (var3 == null) {
                    break;
                }
            }
            if (var3.field8598 == 0) {
                class47.method387(true, (byte) 125, arg0, var3);
            }
        }
        if (class330.field4635 != null) {
            class43.method336(-1, class330.field4635);
            class330.field4635 = null;
        }
    }

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Z)V", line = 242)
    public class705(boolean arg0) {
        this.field9810 = arg0;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)V", line = 227)
    public static void method3984(byte arg0) {
        field9812 = null;
        field9806 = null;
        field9804 = null;
        if (arg0 != -43) {
            method3980(102, 42, -107);
        }
    }
}
