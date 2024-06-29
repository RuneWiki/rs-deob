import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class342 extends class176 {

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "J")
    public long field4606;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4604 = "";

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public static int field4608 = 0;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "[Lpc;")
    public static class576[] field4610 = new class576[1024];

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lqa;IBI)V")
    public static final void method2074(class207 arg0, int arg1, byte arg2, int arg3) {
        class494.field6919 = arg0;
        int var4 = 8 / ((-arg2 - 39) / 55);
        class300.field4116 = new class524[arg3][arg1];
        field4607++;
        if (class208.field2934 != null) {
            class1.field10 = class146.method973(class208.field2934[0], class208.field2934[5], class208.field2934[4], class208.field2934[3], 10556, class208.field2934[1], class208.field2934[2]);
        }
        class425.field6043 = new class524();
        class100.method711((byte) -126);
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
    public class342() {
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(J)V")
    public class342(long arg0) {
        this.field4606 = arg0;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
    public static void method2075(byte arg0) {
        if (arg0 > -46) {
            field4608 = -15;
        }
        field4610 = null;
        field4604 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "([I[I[ILhh;I)V")
    public static final void method2076(int[] arg0, int[] arg1, int[] arg2, class109 arg3, int arg4) {
        for (int var5 = arg4; var5 < arg2.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg0[var5];
            int var8 = arg1[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg3.field520.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field520[var9] = null;
                    } else {
                        class78 var10 = class331.field4418.method195(var6, (byte) 13);
                        int var11 = var10.field1282;
                        class244 var12 = arg3.field520[var9];
                        if (var12 != null) {
                            if (var12.field3406 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field520[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3408 = var8;
                                    var12.field3400 = 0;
                                    var12.field3409 = 0;
                                    var12.field3404 = 1;
                                    var12.field3401 = 0;
                                    class170.method1085(arg3.field6029, arg3.field6035, false, (byte) 30, 0, var10, arg3.field6037);
                                } else if (var11 == 2) {
                                    var12.field3401 = 0;
                                }
                            } else if (var10.field1276 >= class331.field4418.method195(var12.field3406, (byte) 13).field1276) {
                                var12 = arg3.field520[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class244 var13 = arg3.field520[var9] = new class244();
                            var13.field3400 = 0;
                            var13.field3408 = var8;
                            var13.field3409 = 0;
                            var13.field3406 = var6;
                            var13.field3404 = 1;
                            var13.field3401 = 0;
                            class170.method1085(arg3.field6029, arg3.field6035, false, (byte) -126, 0, var10, arg3.field6037);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        field4609++;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(III)Z")
    public static final boolean method2077(int arg0, int arg1, int arg2) {
        field4605++;
        if (arg1 <= 73) {
            field4604 = null;
        }
        return (arg0 & 0x10) != 0;
    }
}
