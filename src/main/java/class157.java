import java.applet.Applet;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class157 {

    @OriginalMember(owner = "client!gda", name = "l", descriptor = "Lvi;")
    private class560 field1975 = new class560(64);

    @OriginalMember(owner = "client!gda", name = "n", descriptor = "Lvi;")
    public class560 field1977 = new class560(30);

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "Lpq;")
    public class159 field1966;

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "Lpq;")
    private class159 field1969;

    @OriginalMember(owner = "client!gda", name = "h", descriptor = "I")
    public static int field1971 = 0;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!gda", name = "g", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!gda", name = "i", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!gda", name = "j", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!gda", name = "m", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!gda", name = "o", descriptor = "I")
    public int field1978;

    @OriginalMember(owner = "client!gda", name = "k", descriptor = "Ljava/applet/Applet;")
    public static Applet field1974;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IB)Lp;", line = 4)
    public final class328 method1047(int arg0, byte arg1) {
        field1967++;
        class560 var3 = this.field1975;
        class328 var4;
        synchronized (this.field1975) {
            var4 = (class328) this.field1975.method3134((long) arg0, -126);
        }
        if (var4 != null) {
            return var4;
        }
        class159 var5 = this.field1969;
        byte[] var6;
        synchronized (this.field1969) {
            var6 = this.field1969.method1087(class650.method3611(29, arg0), class367.method2263(16383, arg0), 1);
        }
        class328 var7 = new class328();
        var7.field4806 = this;
        var7.field4796 = arg0;
        if (var6 != null) {
            var7.method2101((byte) -119, new class138(var6));
        }
        class560 var8 = this.field1975;
        synchronized (this.field1975) {
            this.field1975.method3130((long) arg0, true, var7);
        }
        int var9 = 64 % ((46 - arg1) / 52);
        return var7;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(II)V", line = 37)
    public final void method1048(int arg0, int arg1) {
        field1973++;
        class560 var3 = this.field1975;
        synchronized (this.field1975) {
            this.field1975.method3129(arg1, arg0 + 14583);
        }
        if (arg0 == 0) {
            class560 var4 = this.field1977;
            synchronized (this.field1977) {
                this.field1977.method3129(arg1, arg0 + 14583);
            }
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(B)V", line = 58)
    public final void method1049(byte arg0) {
        class560 var2 = this.field1975;
        synchronized (this.field1975) {
            this.field1975.method3144(true);
        }
        field1970++;
        class560 var3 = this.field1977;
        synchronized (this.field1977) {
            if (arg0 != 104) {
                this.field1977 = null;
            }
            this.field1977.method3144(true);
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lcr;Ljava/awt/Frame;I)V", line = 74)
    public static final void method1050(class112 arg0, Frame arg1, int arg2) {
        field1976++;
        while (true) {
            class280 var3 = arg0.method615(arg1, 26420);
            while (var3.field3773 == 0) {
                class660.method3668(-1, 10L);
            }
            if (var3.field3773 == 1) {
                arg1.setVisible(false);
                arg1.dispose();
                if (arg2 <= 26) {
                    method1050(null, null, -92);
                    return;
                }
                return;
            }
            class660.method3668(-1, 100L);
        }
    }

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(B)V", line = 101)
    public static void method1051(byte arg0) {
        field1974 = null;
        if (arg0 > -87) {
            field1974 = null;
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Ljava/lang/String;ZBLpq;)Lps;", line = 111)
    public static final class610 method1052(String arg0, boolean arg1, byte arg2, class159 arg3) {
        field1968++;
        int var4 = arg3.method1090(arg0, (byte) -105);
        if (var4 == -1) {
            return new class610(0);
        }
        if (arg2 != -75) {
            method1052(null, false, (byte) -45, null);
        }
        int[] var5 = arg3.method1084((byte) -32, var4);
        class610 var6 = new class610(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field8319) {
                class138 var9 = new class138(arg3.method1087(var4, var5[var8++], 1));
                int var10 = var9.method943(-124);
                int var11 = var9.method922((byte) -115);
                int var12 = var9.method957((byte) -88);
                if (!arg1 && var12 == 1) {
                    var6.field8319--;
                } else {
                    var6.field8318[var7] = var10;
                    var6.field8320[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)V", line = 157)
    public final void method1053(int arg0) {
        class560 var2 = this.field1975;
        synchronized (this.field1975) {
            this.field1975.method3142(false);
        }
        field1964++;
        class560 var3 = this.field1977;
        synchronized (this.field1977) {
            if (arg0 == 64) {
                this.field1977.method3142(false);
            }
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IZ)V", line = 178)
    public final void method1054(int arg0, boolean arg1) {
        field1972++;
        this.field1978 = arg0;
        class560 var3 = this.field1977;
        synchronized (this.field1977) {
            if (!arg1) {
                field1971 = 100;
            }
            this.field1977.method3142(false);
        }
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Luea;ILpq;Lpq;)V", line = 206)
    public class157(class484 arg0, int arg1, class159 arg2, class159 arg3) {
        this.field1966 = arg3;
        this.field1969 = arg2;
        int var5 = this.field1969.method1074((byte) 104) - 1;
        this.field1969.method1076(var5, 0);
    }
}
