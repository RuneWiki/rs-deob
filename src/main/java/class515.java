import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public class class515 implements class690 {

    @OriginalMember(owner = "client!wha", name = "c", descriptor = "Lkha;")
    private class687 field7251;

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "I")
    public static int field7250;

    @OriginalMember(owner = "client!wha", name = "d", descriptor = "I")
    public static int field7252;

    @OriginalMember(owner = "client!wha", name = "e", descriptor = "I")
    public static int field7253;

    @OriginalMember(owner = "client!wha", name = "f", descriptor = "I")
    public static int field7254;

    @OriginalMember(owner = "client!wha", name = "g", descriptor = "I")
    public static int field7255;

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "(B)I", line = 4)
    public final int method648(byte arg0) {
        field7250++;
        if (arg0 >= -101) {
            this.field7251 = null;
        }
        return this.field7251.method3829((byte) -27) ? 100 : this.field7251.method3832(99);
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(I)V", line = 19)
    public static final void method2955(int arg0) {
        if (arg0 != 29055) {
            return;
        }
        field7252++;
        class443.method2610((byte) -49);
        class73.field960 = null;
        class669.field9153 = null;
        class404.field5703 = null;
        class489.field6957 = null;
        class518.field7289 = null;
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(B)Lam;", line = 36)
    public final class309 method650(byte arg0) {
        field7249++;
        if (arg0 != 8) {
            this.method648((byte) 18);
        }
        return class309.field3947;
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(BI)V", line = 49)
    public static final void method2956(byte arg0, int arg1) {
        if (arg0 < 9) {
            field7255 = 56;
        }
        field7254++;
        class491.field6967.method775(1, arg1);
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(Lkba;B)I", line = 62)
    public static final int method2957(class24 arg0, byte arg1) {
        field7253++;
        if (arg0.field335 == 0) {
            return 0;
        } else if (arg1 == 115) {
            if (arg0.field407 != -1) {
                class24 var2 = null;
                if (arg0.field407 < 32768) {
                    class247 var3 = (class247) class563.field7875.method3248((long) arg0.field407, 0);
                    if (var3 != null) {
                        var2 = var3.field3158;
                    }
                } else if (arg0.field407 >= 32768) {
                    var2 = class447.field6287[arg0.field407 - 32768];
                }
                if (var2 != null) {
                    int var4 = arg0.field5790 - var2.field5790;
                    int var5 = arg0.field5784 - var2.field5784;
                    if (var4 != 0 || var5 != 0) {
                        arg0.method266(-124, (int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF);
                    }
                }
            }
            if (arg0 instanceof class546) {
                class546 var6 = (class546) arg0;
                if (var6.field7703 != -1 && (var6.field427 == 0 || var6.field431 > 0)) {
                    var6.method266(arg1 - 239, var6.field7703);
                    var6.field7703 = -1;
                }
            } else if (arg0 instanceof class124) {
                class124 var7 = (class124) arg0;
                if (var7.field1478 != -1 && (var7.field427 == 0 || var7.field431 > 0)) {
                    int var8 = var7.field5790 - (var7.field1478 - class63.field851 - class63.field851) * 256;
                    int var9 = var7.field5784 - (var7.field1485 - class753.field10509 - class753.field10509) * 256;
                    if (var8 != 0 || var9 != 0) {
                        var7.method266(-127, (int) (Math.atan2((double) var8, (double) var9) * 2607.5945876176133D) & 0x3FFF);
                    }
                    var7.field1478 = -1;
                }
            }
            return arg0.method262(false);
        } else {
            return -81;
        }
    }

    @OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(Lkha;)V", line = 139)
    public class515(class687 arg0) {
        this.field7251 = arg0;
    }
}
