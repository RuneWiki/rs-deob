import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class344 {

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "Lmf;")
    private class382 field5032 = new class382(64);

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "Lmf;")
    private class382 field5033 = new class382(100);

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "Lpu;")
    private class522 field5029;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "Lnea;")
    public static class664 field5031 = new class664(14, 0);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)Lbba;", line = 3)
    public final class98 method2135(int arg0, int arg1) {
        field5028++;
        class382 var3 = this.field5033;
        synchronized (this.field5033) {
            if (arg0 >= -43) {
                return null;
            }
            class98 var5 = (class98) this.field5033.method2287(1, (long) arg1);
            if (var5 == null) {
                var5 = new class98(arg1);
                this.field5033.method2291(var5, (long) arg1, 1);
            }
            return var5.method803((byte) 125) ? var5 : null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V", line = 29)
    public static void method2136(byte arg0) {
        field5031 = null;
        if (arg0 >= -105) {
            method2136((byte) -70);
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(B)V", line = 42)
    public static final void method2137(byte arg0) {
        class382 var1 = class513.field7222;
        synchronized (class513.field7222) {
            class513.field7222.method2279(0);
        }
        int var2 = 106 % ((-arg0 - 27) / 63);
        field5027++;
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(B)V", line = 56)
    public final void method2138(byte arg0) {
        field5024++;
        class382 var2 = this.field5032;
        synchronized (this.field5032) {
            this.field5032.method2279(0);
            if (arg0 >= -122) {
                field5031 = null;
            }
        }
        class382 var3 = this.field5033;
        synchronized (this.field5033) {
            this.field5033.method2279(0);
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(II)V", line = 79)
    public final void method2139(int arg0, int arg1) {
        if (arg1 != 64) {
            return;
        }
        field5025++;
        class382 var3 = this.field5032;
        synchronized (this.field5032) {
            this.field5032.method2290(false, arg0);
        }
        class382 var4 = this.field5033;
        synchronized (this.field5033) {
            this.field5033.method2290(false, arg0);
        }
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(II)Lrk;", line = 95)
    public final class30 method2140(int arg0, int arg1) {
        field5026++;
        if (arg1 < 122) {
            return null;
        }
        class382 var3 = this.field5032;
        class30 var4;
        synchronized (this.field5032) {
            var4 = (class30) this.field5032.method2287(1, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field5029;
        byte[] var6;
        synchronized (this.field5029) {
            var6 = this.field5029.method3007(class333.method2096(arg0, 611577031), class424.method2540(arg0, (byte) -65), 5);
        }
        class30 var7 = new class30();
        var7.field472 = this;
        var7.field470 = arg0;
        if (var6 != null) {
            var7.method348(0, new class695(var6));
        }
        var7.method350(true);
        class382 var8 = this.field5032;
        synchronized (this.field5032) {
            this.field5032.method2291(var7, (long) arg0, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V", line = 128)
    public final void method2141(int arg0) {
        field5030++;
        class382 var2 = this.field5032;
        synchronized (this.field5032) {
            if (arg0 != 64) {
                method2136((byte) 38);
            }
            this.field5032.method2285((byte) -97);
        }
        class382 var3 = this.field5033;
        synchronized (this.field5033) {
            this.field5033.method2285((byte) -98);
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lkr;ILpu;Lpu;Lpu;)V", line = 157)
    public class344(class693 arg0, int arg1, class522 arg2, class522 arg3, class522 arg4) {
        this.field5029 = arg2;
        if (this.field5029 != null) {
            int var6 = this.field5029.method2977((byte) -95) - 1;
            this.field5029.method2988(-20, var6);
        }
        class527.method3020(2, 3, arg3, arg4);
    }
}
