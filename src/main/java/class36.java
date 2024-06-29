import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class36 extends class125 {

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "[I")
    public static int[] field320 = new int[13];

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    public static int field329 = 0;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "Leg;")
    public static class317 field325;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "Lss;")
    public static class506 field322;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V")
    public static void method184(byte arg0) {
        field322 = null;
        if (arg0 < 45) {
            method187(53);
        }
        field320 = null;
        field325 = null;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(Z)I")
    public final int method185(boolean arg0) {
        ++field328;
        return arg0 ? 33 : super.field1732;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)I")
    public final int method158(byte arg0) {
        int var2 = 120 % ((arg0 - -63) / 49);
        ++field327;
        return 2;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)V")
    public final void method157(byte arg0, int arg1) {
        ++field324;
        if (arg0 >= -32) {
            field329 = -45;
        }
        super.field1732 = arg1;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZI)I")
    public final int method155(boolean arg0, int arg1) {
        ++field323;
        if (!arg0) {
            field320 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lgp;)V")
    public class36(class549 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Z)V")
    public final void method156(boolean arg0) {
        if (arg0) {
            ++field321;
            if (super.field1733.field7979.method3837(-127) && super.field1732 == 2) {
                super.field1732 = 1;
            }
            if (~super.field1732 > -1 || ~super.field1732 < -3) {
                super.field1732 = this.method158((byte) -5);
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBI)Z")
    public static final boolean method186(int arg0, byte arg1, int arg2) {
        if (arg1 != 39) {
            field320 = null;
        }
        ++field326;
        return (1024 & arg2) != 0;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
    public static final void method187(int arg0) {
        ++field330;
        if (arg0 < 95) {
            field329 = 56;
        }
        for (class394 var1 = (class394) class186.field2611.method4023((byte) -102); var1 != null; var1 = (class394) class186.field2611.method4021((byte) 80)) {
            if (!var1.field5658.method3999(-8065)) {
                var1.field5658.method2114(false);
                try {
                    var1.field5658.method3988(-2);
                } catch (Exception var5) {
                    class705.method3952("TV: " + var1.field5659, var5, -29913);
                    class405.method2463((byte) -126, var1.field5659);
                }
                if (!var1.field5654 && !var1.field5657) {
                    class28 var3 = var1.field5658.method3986(-82);
                    if (var3 != null) {
                        class236 var4 = var3.method140((byte) 119);
                        if (var4 != null) {
                            var4.method1648(var1.field5655, (byte) 119);
                            class593.field8429.method3657(var4);
                            var1.field5654 = true;
                        }
                    }
                }
            } else {
                class405.method2463((byte) -115, var1.field5659);
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(ILgp;)V")
    public class36(int arg0, class549 arg1) {
        super(arg0, arg1);
    }
}
