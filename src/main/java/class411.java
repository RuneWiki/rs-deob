import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class411 extends class187 {

    @OriginalMember(owner = "client!cn", name = "w", descriptor = "I")
    public static int field5937 = 0;

    @OriginalMember(owner = "client!cn", name = "F", descriptor = "Ljava/lang/String;")
    public static String field5946 = " is already on your ignore list.";

    @OriginalMember(owner = "client!cn", name = "y", descriptor = "[I")
    public static int[] field5939 = new int[1000];

    @OriginalMember(owner = "client!cn", name = "x", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!cn", name = "z", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!cn", name = "A", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!cn", name = "B", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!cn", name = "D", descriptor = "I")
    public static int field5944;

    @OriginalMember(owner = "client!cn", name = "E", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!cn", name = "C", descriptor = "Llg;")
    public static class20 field5943;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Llh;ILjava/lang/Object;)V", line = 3)
    public static final void method2559(class450 arg0, int arg1, Object arg2) {
        field5945++;
        if (arg0.field6553 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field6553.peekEvent() != null; var3++) {
            class370.method2235(1L, 10);
        }
        int var4 = -47 % ((38 - arg1) / 61);
        if (arg2 != null) {
            arg0.field6553.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIII)V", line = 27)
    public static final void method2560(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5944++;
        class40 var5 = class162.method872(arg4, (byte) 92, 4);
        var5.method190(0);
        if (arg0 != -18) {
            method2559((class450) null, 21, (Object) null);
        }
        var5.field413 = arg2;
        var5.field418 = arg3;
        var5.field410 = arg1;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Ltq;Z)Loq;", line = 44)
    public static final class119 method2561(class250 arg0, boolean arg1) {
        field5942++;
        return arg1 ? null : new class119(arg0.method1366((byte) -106), arg0.method1366((byte) 66), arg0.method1366((byte) 31), arg0.method1366((byte) -65), arg0.method1372(-2), arg0.method1372(-2), arg0.method1350(31351));
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(B)V", line = 63)
    public static void method2562(byte arg0) {
        field5939 = null;
        field5943 = null;
        if (arg0 != -1) {
            field5937 = 121;
        }
        field5946 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)Lmr;", line = 77)
    public static final class83 method2563(int arg0, int arg1) {
        field5938++;
        if (arg1 == 0) {
            return new class7();
        } else if (arg1 == 1) {
            return new class386();
        } else if (arg1 == 2) {
            return new class199();
        } else if (arg1 == 3) {
            return new class314();
        } else if (arg1 == 4) {
            return new class227();
        } else if (arg1 == 5) {
            return new class347();
        } else if (arg1 == 6) {
            return new class140();
        } else if (arg1 == 7) {
            return new class401();
        } else if (arg1 == 8) {
            return new class138();
        } else if (arg1 == 9) {
            return new class412();
        } else if (arg1 == 10) {
            return new class299();
        } else if (arg1 == 11) {
            return new class452();
        } else if (arg1 == 12) {
            return new class23();
        } else if (arg1 == 13) {
            return new class384();
        } else if (arg1 == 14) {
            return new class145();
        } else if (arg1 == 15) {
            return new class207();
        } else if (arg1 == 16) {
            return new class231();
        } else if (arg1 == 17) {
            return new class340();
        } else if (arg1 == 18) {
            return new class5();
        } else if (arg1 == 19) {
            return new class248();
        } else if (arg1 == 20) {
            return new class188();
        } else if (arg1 == 21) {
            return new class65();
        } else if (arg1 == 22) {
            return new class440();
        } else if (arg1 == 23) {
            return new class169();
        } else if (arg1 == 24) {
            return new class385();
        } else if (arg1 == 25) {
            return new class27();
        } else if (arg1 == 26) {
            return new class167();
        } else if (arg1 == 27) {
            return new class104();
        } else if (arg1 == 28) {
            return new class293();
        } else if (arg1 == 29) {
            return new class155();
        } else if (arg1 == 30) {
            return new class430();
        } else if (arg1 == 31) {
            return new class429();
        } else if (arg1 == 32) {
            return new class356();
        } else if (arg1 == 33) {
            return new class439();
        } else if (arg1 == 34) {
            return new class125();
        } else if (arg1 == 35) {
            return new class172();
        } else if (arg1 == 36) {
            return new class21();
        } else if (arg1 == 37) {
            return new class189();
        } else if (arg1 == 38) {
            return new class29();
        } else if (arg1 == 39) {
            return new class34();
        } else {
            if (arg0 > -105) {
                field5943 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lfm;", line = 404)
    public static final class315 method2564(Throwable arg0, String arg1) {
        field5940++;
        class315 var2;
        if (arg0 instanceof class315) {
            var2 = (class315) arg0;
            var2.field4213 = var2.field4213 + ' ' + arg1;
        } else {
            var2 = new class315(arg0, arg1);
        }
        return var2;
    }
}
