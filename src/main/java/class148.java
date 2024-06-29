import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class148 extends class360 implements class558 {

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "I")
    private int field1650;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!mg", name = "C", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([BIII)V")
    public final void method919(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 6748) {
            ++field1648;
            this.method2118(35040, arg0, arg1);
            this.field1650 = arg3;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)J")
    public final long method920(int arg0) {
        ++field1642;
        if (arg0 != -26521) {
            this.method921(-5);
        }
        return 0L;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)I")
    public final int method921(int arg0) {
        ++field1643;
        if (arg0 != -5325) {
            this.field1650 = 84;
        }
        return super.field4607;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)I")
    public final int method922(int arg0) {
        if (arg0 != -25300) {
            field1649 = -54;
        }
        ++field1647;
        return this.field1650;
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)V")
    public final void method18(int arg0) {
        if (arg0 != 1) {
            field1645 = -6;
        }
        ++field1646;
        super.field4602.method2594(this, (byte) -58);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/lang/String;BILgh;)Lsb;")
    public static final class290 method923(String arg0, byte arg1, int arg2, class546 arg3) {
        ++field1644;
        if (~arg2 == -1) {
            return arg3.method3212(0, arg0);
        } else if (arg2 == 1) {
            try {
                class393.method2417("openjs", class255.field3123, new Object[] { (new URL(class255.field3123.getCodeBase(), arg0)).toString() }, (byte) 100);
                class290 var4 = new class290();
                var4.field3573 = 1;
                return var4;
            } catch (Throwable var11) {
                class290 var5 = new class290();
                var5.field3573 = 2;
                return var5;
            }
        } else if (~arg2 == -3) {
            try {
                class255.field3123.getAppletContext().showDocument(new URL(class255.field3123.getCodeBase(), arg0), "_blank");
                class290 var6 = new class290();
                var6.field3573 = 1;
                return var6;
            } catch (Exception var12) {
                class290 var7 = new class290();
                var7.field3573 = 2;
                return var7;
            }
        } else {
            int var8 = 88 % ((arg1 - 49) / 50);
            if (~arg2 == -4) {
                try {
                    class393.method2415("loggedout", -90, class255.field3123);
                } catch (Throwable var14) {
                }
                try {
                    class255.field3123.getAppletContext().showDocument(new URL(class255.field3123.getCodeBase(), arg0), "_top");
                    class290 var9 = new class290();
                    var9.field3573 = 1;
                    return var9;
                } catch (Exception var13) {
                    class290 var10 = new class290();
                    var10.field3573 = 2;
                    return var10;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lnv;I[BIZ)V")
    public class148(class417 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field1650 = arg1;
    }
}
