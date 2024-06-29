import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class134 {

    @OriginalMember(owner = "client!we", name = "d", descriptor = "Ltl;")
    private class400 field1947 = new class400(64);

    @OriginalMember(owner = "client!we", name = "n", descriptor = "Ltl;")
    public class400 field1957 = new class400(30);

    @OriginalMember(owner = "client!we", name = "a", descriptor = "Lui;")
    private class451 field1944;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "Lui;")
    public class451 field1953;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "[[B")
    public static byte[][] field1956;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public int field1958;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Lui;")
    public static class451 field1945;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "[[[B")
    public static byte[][][] field1954;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)V")
    public final void method947(boolean arg0, int arg1) {
        field1952++;
        this.field1958 = arg1;
        class400 var3 = this.field1957;
        synchronized (this.field1957) {
            this.field1957.method2401((byte) -100);
            if (arg0) {
                this.field1953 = null;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public final void method948(int arg0) {
        field1946++;
        class400 var2 = this.field1947;
        synchronized (this.field1947) {
            this.field1947.method2401((byte) -92);
            if (arg0 != 24) {
                this.method947(true, -78);
            }
        }
        class400 var3 = this.field1957;
        synchronized (this.field1957) {
            this.field1957.method2401((byte) -55);
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
    public final void method949(int arg0) {
        class400 var2 = this.field1947;
        synchronized (this.field1947) {
            if (arg0 != 5) {
                return;
            }
            this.field1947.method2388(127);
        }
        field1948++;
        class400 var3 = this.field1957;
        synchronized (this.field1957) {
            this.field1957.method2388(16);
        }
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
    public static final void method950(int arg0) {
        field1951++;
        class463.field6540.method1602(5, (byte) -4);
        class352.field5364.method2569(arg0 ^ 0x30D6, 5);
        class158.field2197.method1385(2423, 5);
        class206.field3124.method341(5, arg0 ^ arg0);
        class448.field6339.method325(5, 230);
        class23.field309.method2363((byte) -44, 5);
        class170.field2423.method1584(1, 5);
        class322.field4848.method954(5, 5);
        class180.field2687.method1513((byte) -125, 5);
        class156.field2167.method917(-6049, 5);
        class297.field4454.method1827(5, (byte) 56);
        class492.field6915.method1110(1, 5);
        class256.field3796.method2242(73, 5);
        class237.field3463.method1400((byte) -126, 5);
        class388.field5714.method1520(-1518, 5);
        class365.field5529.method685(5, 0);
        class431.field6129.method449(-23329, 5);
        class81.field1144.method2437((byte) 89, 5);
        class42.field571.method125((byte) -6, 5);
        class258.field3853.method1969(5, (byte) 127);
        class448.method2646(arg0 ^ 0xFFFFCF60, 5);
        class475.method2764(41, 50);
        class304.method1899(true, 5);
        class462.method2723(5, -1);
        class2.field40.method2389(false, 5);
        class256.field3794.method2389(false, 5);
        class19.field246.method2389(false, 5);
        class313.field4716.method2389(false, 5);
        class477.field6703.method2389(false, 5);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)Lkj;")
    public final class188 method951(int arg0, byte arg1) {
        field1950++;
        class400 var3 = this.field1947;
        class188 var4;
        synchronized (this.field1947) {
            var4 = (class188) this.field1947.method2393(-120, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        } else if (arg1 <= 50) {
            return null;
        } else {
            byte[] var5 = this.field1944.method2691(class140.method968((byte) 109, arg0), class484.method2832(arg0, -1951), 0);
            class188 var6 = new class188();
            var6.field2864 = this;
            var6.field2875 = arg0;
            if (var5 != null) {
                var6.method1293(108, new class446(var5));
            }
            class400 var7 = this.field1947;
            synchronized (this.field1947) {
                this.field1947.method2395(0, var6, (long) arg0);
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IBLre;)V")
    public static final void method952(int arg0, byte arg1, class446 arg2) {
        if (class204.field3097 != null) {
            try {
                class204.field3097.method1729((byte) -36, 0L);
                class204.field3097.method1721((byte) -3, 24, arg2.field6316, arg0);
            } catch (Exception var3) {
            }
        }
        field1955++;
        if (arg1 < 36) {
            method952(-37, (byte) 51, (class446) null);
        }
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V")
    public static void method953(int arg0) {
        field1945 = null;
        field1954 = null;
        field1956 = null;
        if (arg0 != 5) {
            field1956 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V")
    private final void method954(int arg0, int arg1) {
        if (arg0 != 5) {
            return;
        }
        field1949++;
        class400 var3 = this.field1947;
        synchronized (this.field1947) {
            this.field1947.method2389(false, arg1);
        }
        class400 var4 = this.field1957;
        synchronized (this.field1957) {
            this.field1957.method2389(false, arg1);
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lgp;ILui;Lui;)V")
    public class134(class430 arg0, int arg1, class451 arg2, class451 arg3) {
        this.field1944 = arg2;
        this.field1953 = arg3;
        int var5 = this.field1944.method2675(false) - 1;
        this.field1944.method2662(var5, (byte) -7);
    }

    static {
        new class332("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        field1956 = new byte[250][];
    }
}
