import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class233 {

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "Lhm;")
    private class208 field3021 = new class208(64);

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "Lpfa;")
    private class275 field3022;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!kw", name = "h", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)Ltm;", line = 3)
    public final class362 method1403(int arg0, int arg1) {
        field3020++;
        class208 var3 = this.field3021;
        class362 var4;
        synchronized (this.field3021) {
            var4 = (class362) this.field3021.method1221((long) arg0, true);
        }
        if (var4 != null) {
            return var4;
        }
        class275 var5 = this.field3022;
        byte[] var6;
        synchronized (this.field3022) {
            var6 = this.field3022.method1659(109, arg0, 11);
        }
        class362 var7 = new class362();
        if (var6 != null) {
            var7.method2097(new class572(var6), 5042);
        }
        if (arg1 != 64) {
            this.field3022 = null;
        }
        class208 var8 = this.field3021;
        synchronized (this.field3021) {
            this.field3021.method1230((byte) -120, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(B)V", line = 34)
    public static final void method1404(byte arg0) {
        int var1 = 70 / ((arg0 + 11) / 50);
        class363.field4650.method1218(116);
        field3023++;
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(II)V", line = 44)
    public final void method1405(int arg0, int arg1) {
        class208 var3 = this.field3021;
        synchronized (this.field3021) {
            this.field3021.method1222(arg1 + 14436, arg0);
        }
        if (arg1 != 128) {
            this.field3021 = null;
        }
        field3025++;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(BB)Z", line = 63)
    public static final boolean method1406(byte arg0, byte arg1) {
        field3018++;
        if (arg1 != 31) {
            method1404((byte) -98);
        }
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            return false;
        } else {
            return var2 < 128 || var2 >= 160 || class89.field1159[var2 - 128] != '\u0000';
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)V", line = 88)
    public final void method1407(int arg0) {
        class208 var2 = this.field3021;
        synchronized (this.field3021) {
            this.field3021.method1224(false);
            if (arg0 != -1) {
                this.field3022 = null;
            }
        }
        field3024++;
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lbs;ILpfa;)V", line = 107)
    public class233(class643 arg0, int arg1, class275 arg2) {
        this.field3022 = arg2;
        if (this.field3022 != null) {
            this.field3022.method1655(11, (byte) -82);
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)V", line = 127)
    public final void method1408(int arg0) {
        if (arg0 != 128) {
            this.field3022 = null;
        }
        field3019++;
        class208 var2 = this.field3021;
        synchronized (this.field3021) {
            this.field3021.method1218(98);
        }
    }
}
