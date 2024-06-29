import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class711 {

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "[I")
    public int[] field9712;

    @OriginalMember(owner = "client!jca", name = "h", descriptor = "J")
    public long field9716;

    @OriginalMember(owner = "client!jca", name = "f", descriptor = "[S")
    public short[] field9714;

    @OriginalMember(owner = "client!jca", name = "j", descriptor = "[S")
    public short[] field9718;

    @OriginalMember(owner = "client!jca", name = "k", descriptor = "Ljb;")
    public static class519 field9719 = new class519(96, 4);

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "I")
    public static int field9709;

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "I")
    public static int field9710;

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "I")
    public static int field9711;

    @OriginalMember(owner = "client!jca", name = "e", descriptor = "I")
    public static int field9713;

    @OriginalMember(owner = "client!jca", name = "g", descriptor = "I")
    public static int field9715;

    @OriginalMember(owner = "client!jca", name = "i", descriptor = "I")
    public static int field9717;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Z)V")
    public static void method3942(boolean arg0) {
        field9719 = null;
        if (arg0) {
            method3942(false);
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)Lpja;")
    public static final class43 method3943(byte arg0) {
        field9715++;
        if (arg0 < 13) {
            method3942(false);
        }
        class43 var1 = class309.method1997(69);
        var1.field454 = 0;
        var1.field464 = null;
        var1.field457 = new class459(5000);
        return var1;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)V")
    public static final void method3944(int arg0) {
        field9711++;
        class749.field10086++;
        class43 var1 = class492.method2903(class640.field8622, 0, class73.field983);
        if (arg0 == 96) {
            var1.field457.method1733(class442.field6364, arg0 - 32562);
            class409.method2457((byte) -100, var1);
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lvia;ILvia;)V")
    public static final void method3945(class589 arg0, int arg1, class589 arg2) {
        if (arg2.field8042 != null) {
            arg2.method3310(30305);
        }
        field9713++;
        arg2.field8044 = arg0;
        arg2.field8042 = arg0.field8042;
        arg2.field8042.field8044 = arg2;
        if (arg1 != -5) {
            method3944(-88);
        }
        arg2.field8044.field8042 = arg2;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lsia;I)I")
    public static final int method3946(class765 arg0, int arg1) {
        field9717++;
        if (class264.field3884 == arg0) {
            return 9216;
        } else if (class16.field154 == arg0) {
            return 34065;
        } else if (class489.field6822 == arg0) {
            return 34066;
        } else {
            if (arg1 != 5) {
                method3946(null, 86);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(J[I[S[S)V")
    public class711(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.field9712 = arg1;
        this.field9716 = arg0;
        this.field9714 = arg3;
        this.field9718 = arg2;
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "()V")
    protected class711() {
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public static final void method3947(int arg0, int arg1, int arg2, String arg3, int arg4) {
        int var5 = 27 % ((arg0 + 63) / 49);
        field9709++;
        class347 var6 = class90.method717(arg2, arg1, (byte) -42);
        if (var6 == null) {
            return;
        }
        if (var6.field4941 != null) {
            class158 var7 = new class158();
            var7.field2122 = arg4;
            var7.field2131 = arg3;
            var7.field2137 = var6;
            var7.field2128 = var6.field4941;
            class727.method4005(var7);
        }
        if (class780.field10712 != 10 || !client.method2055(var6).method2116(arg4 - 1, 0)) {
            return;
        }
        if (arg4 == 1) {
            class139.field1868++;
            class43 var8 = class492.method2903(class269.field3924, 0, class73.field983);
            class153.method1068(0, arg1, var8, arg2, var6.field4956);
            class409.method2457((byte) -100, var8);
        }
        if (arg4 == 2) {
            class149.field2026++;
            class43 var9 = class492.method2903(class388.field5621, 0, class73.field983);
            class153.method1068(0, arg1, var9, arg2, var6.field4956);
            class409.method2457((byte) -100, var9);
        }
        if (arg4 == 3) {
            class216.field2831++;
            class43 var10 = class492.method2903(class562.field7697, 0, class73.field983);
            class153.method1068(0, arg1, var10, arg2, var6.field4956);
            class409.method2457((byte) -100, var10);
        }
        if (arg4 == 4) {
            class180.field2360++;
            class43 var11 = class492.method2903(class345.field4844, 0, class73.field983);
            class153.method1068(0, arg1, var11, arg2, var6.field4956);
            class409.method2457((byte) -100, var11);
        }
        if (arg4 == 5) {
            class180.field2363++;
            class43 var12 = class492.method2903(class250.field3412, 0, class73.field983);
            class153.method1068(0, arg1, var12, arg2, var6.field4956);
            class409.method2457((byte) -100, var12);
        }
        if (arg4 == 6) {
            class571.field7778++;
            class43 var13 = class492.method2903(class753.field10197, 0, class73.field983);
            class153.method1068(0, arg1, var13, arg2, var6.field4956);
            class409.method2457((byte) -100, var13);
        }
        if (arg4 == 7) {
            class548.field7566++;
            class43 var14 = class492.method2903(class52.field632, 0, class73.field983);
            class153.method1068(0, arg1, var14, arg2, var6.field4956);
            class409.method2457((byte) -100, var14);
        }
        if (arg4 == 8) {
            class693.field9224++;
            class43 var15 = class492.method2903(class647.field8731, 0, class73.field983);
            class153.method1068(0, arg1, var15, arg2, var6.field4956);
            class409.method2457((byte) -100, var15);
        }
        if (arg4 == 9) {
            class279.field4046++;
            class43 var16 = class492.method2903(class86.field1215, 0, class73.field983);
            class153.method1068(0, arg1, var16, arg2, var6.field4956);
            class409.method2457((byte) -100, var16);
        }
        if (arg4 == 10) {
            class270.field3931++;
            class43 var17 = class492.method2903(class253.field3717, 0, class73.field983);
            class153.method1068(0, arg1, var17, arg2, var6.field4956);
            class409.method2457((byte) -100, var17);
        }
    }
}
