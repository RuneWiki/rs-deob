import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class525 {

    @OriginalMember(owner = "client!si", name = "h", descriptor = "Lhm;")
    private class208 field6636 = new class208(16);

    @OriginalMember(owner = "client!si", name = "c", descriptor = "Lpfa;")
    private class275 field6631;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field6638 = 0;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field6632 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field6629;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static void method2831(int arg0) {
        if (arg0 != 2048) {
            field6638 = -106;
        }
        field6632 = null;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)Z")
    public static final boolean method2832(int arg0) {
        field6634++;
        if (arg0 < 101) {
            return true;
        } else if (class362.method2099(34167, "jaclib")) {
            return class362.method2099(34167, "hw3d");
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)Z")
    public static final boolean method2833(int arg0, int arg1, int arg2) {
        field6637++;
        if (arg1 < 117) {
            field6632 = null;
        }
        return (arg2 & 0x800) != 0 && (arg0 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)V")
    public final void method2834(int arg0) {
        if (arg0 != 0) {
            field6638 = -114;
        }
        class208 var2 = this.field6636;
        synchronized (this.field6636) {
            this.field6636.method1224(false);
        }
        field6633++;
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(I)V")
    public final void method2835(int arg0) {
        field6629++;
        class208 var2 = this.field6636;
        synchronized (this.field6636) {
            this.field6636.method1218(112);
            if (arg0 != 30) {
                this.field6636 = null;
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
    public final void method2836(int arg0, int arg1) {
        field6635++;
        if (arg0 == -1931) {
            class208 var3 = this.field6636;
            synchronized (this.field6636) {
                this.field6636.method1222(14564, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZ)Lrv;")
    public final class99 method2837(int arg0, boolean arg1) {
        field6630++;
        class208 var3 = this.field6636;
        class99 var4;
        synchronized (this.field6636) {
            var4 = (class99) this.field6636.method1221((long) arg0, arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class275 var5 = this.field6631;
        byte[] var6;
        synchronized (this.field6631) {
            var6 = this.field6631.method1659(-48, arg0, 30);
            if (!arg1) {
                field6638 = 86;
            }
        }
        class99 var7 = new class99();
        if (var6 != null) {
            var7.method724(new class572(var6), (byte) 87);
        }
        class208 var8 = this.field6636;
        synchronized (this.field6636) {
            this.field6636.method1230((byte) -120, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lbs;ILpfa;)V")
    public class525(class643 arg0, int arg1, class275 arg2) {
        this.field6631 = arg2;
        this.field6631.method1655(30, (byte) -82);
    }
}
