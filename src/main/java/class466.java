import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class466 {

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "Lhm;")
    private class208 field5779 = new class208(64);

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "Lpfa;")
    private class275 field5777;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "S")
    public static short field5783 = 256;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "Lfg;")
    public static class118 field5780;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZI)V")
    public final void method2539(boolean arg0, int arg1) {
        field5778++;
        class208 var3 = this.field5779;
        synchronized (this.field5779) {
            if (arg0) {
                field5783 = 117;
            }
            this.field5779.method1222(14564, arg1);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IB)Lso;")
    public final class438 method2540(int arg0, byte arg1) {
        field5784++;
        class208 var3 = this.field5779;
        class438 var4;
        synchronized (this.field5779) {
            var4 = (class438) this.field5779.method1221((long) arg0, true);
        }
        if (var4 != null) {
            return var4;
        }
        class275 var5 = this.field5777;
        byte[] var6;
        synchronized (this.field5777) {
            var6 = this.field5777.method1659(91, arg0, 31);
        }
        class438 var7 = new class438();
        if (arg1 >= -15) {
            this.method2540(102, (byte) 9);
        }
        if (var6 != null) {
            var7.method2408((byte) 77, new class572(var6));
        }
        class208 var8 = this.field5779;
        synchronized (this.field5779) {
            this.field5779.method1230((byte) 28, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
    public final void method2541(byte arg0) {
        if (arg0 != -96) {
            field5783 = 79;
        }
        class208 var2 = this.field5779;
        synchronized (this.field5779) {
            this.field5779.method1218(arg0 + 206);
        }
        field5782++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
    public static final void method2542(int arg0) {
        if (class518.field6555 != null) {
            class143[] var1 = class518.field6555;
            for (int var2 = 0; var2 < var1.length; var2++) {
                class143 var3 = var1[var2];
                var3.method901(true);
            }
        }
        if (arg0 == -11112) {
            field5775++;
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V")
    public final void method2543(int arg0) {
        field5781++;
        class208 var2 = this.field5779;
        synchronized (this.field5779) {
            this.field5779.method1224(false);
        }
        if (arg0 != -7472) {
            field5780 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)V")
    public static void method2544(int arg0) {
        field5780 = null;
        if (arg0 != 0) {
            method2542(-94);
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lbs;ILpfa;)V")
    public class466(class643 arg0, int arg1, class275 arg2) {
        this.field5777 = arg2;
        this.field5777.method1655(31, (byte) -82);
    }
}
