import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class231 {

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "Lka;")
    private class473 field3233 = new class473(64);

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "Ldk;")
    private class421 field3225;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public int field3231;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "[Lus;")
    public static class433[] field3229;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)Z", line = 6)
    public static final boolean method1412(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field3229 = null;
        }
        field3230++;
        return class373.method2234(arg2, arg0, -27219) | (arg2 & 0x70000) != 0 || class267.method1575(arg2, arg0, -418764735);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILsv;)Lsi;", line = 20)
    public static final class105 method1413(int arg0, class319 arg1) {
        field3228++;
        if (arg0 != -21294) {
            method1416(false);
        }
        return new class105(arg1.method1847(29), arg1.method1847(69), arg1.method1847(110), arg1.method1847(arg0 ^ 0xFFFFAC9F), arg1.method1852(1086280488), arg1.method1852(arg0 ^ 0xBF40FFFA), arg1.method1869(-71));
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)Lgl;", line = 31)
    public final class491 method1414(int arg0, int arg1) {
        field3227++;
        class473 var3 = this.field3233;
        class491 var4;
        synchronized (this.field3233) {
            var4 = (class491) this.field3233.method2767((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class421 var5 = this.field3225;
        byte[] var6;
        synchronized (this.field3225) {
            var6 = this.field3225.method2512(16, (byte) -93, arg0);
        }
        class491 var7 = new class491();
        if (var6 != null) {
            var7.method2910(new class319(var6), -1);
        }
        class473 var8 = this.field3233;
        synchronized (this.field3233) {
            this.field3233.method2777(-1025, var7, (long) arg0);
            if (arg1 != 31946) {
                this.field3233 = null;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZ)V", line = 61)
    public final void method1415(int arg0, boolean arg1) {
        field3226++;
        class473 var3 = this.field3233;
        synchronized (this.field3233) {
            if (!arg1) {
                this.field3231 = 71;
            }
            this.field3233.method2779(14896, arg0);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V", line = 79)
    public static void method1416(boolean arg0) {
        if (arg0) {
            method1413(19, null);
        }
        field3229 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V", line = 92)
    public final void method1417(int arg0) {
        field3234++;
        if (arg0 > 50) {
            class473 var2 = this.field3233;
            synchronized (this.field3233) {
                this.field3233.method2774((byte) -24);
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lad;ILdk;)V", line = 120)
    public class231(class12 arg0, int arg1, class421 arg2) {
        this.field3225 = arg2;
        if (this.field3225 == null) {
            this.field3231 = 0;
        } else {
            this.field3231 = this.field3225.method2509(0, 16);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V", line = 108)
    public final void method1418(byte arg0) {
        if (arg0 != 18) {
            this.field3231 = 26;
        }
        field3232++;
        class473 var2 = this.field3233;
        synchronized (this.field3233) {
            this.field3233.method2764(-769);
        }
    }
}
