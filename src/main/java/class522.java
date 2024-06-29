import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class522 {

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "Ld;")
    private class242 field7669 = new class242(64);

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "Ld;")
    public class242 field7673 = new class242(2);

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "Lum;")
    private class83 field7662;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Lum;")
    public class83 field7665;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "Ljp;")
    public static class55 field7664 = new class55(68, -1);

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "Lpu;")
    public static class179 field7672 = new class179("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field7660;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field7661;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field7663;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field7666;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field7667;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field7670;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public static int field7671;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field7674;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "[Lo;")
    public static class363[] field7668;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
    public final void method3109(byte arg0) {
        class242 var2 = this.field7669;
        synchronized (this.field7669) {
            this.field7669.method1637((byte) 13);
            int var3 = 105 % ((arg0 - 34) / 44);
        }
        field7674++;
        class242 var4 = this.field7673;
        synchronized (this.field7673) {
            this.field7673.method1637((byte) 13);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BI)Lfb;")
    public final class36 method3110(byte arg0, int arg1) {
        field7660++;
        class242 var3 = this.field7669;
        class36 var4;
        synchronized (this.field7669) {
            var4 = (class36) this.field7669.method1634((long) arg1, arg0 + 68);
        }
        if (var4 != null) {
            return var4;
        }
        class83 var5 = this.field7662;
        byte[] var6;
        synchronized (this.field7662) {
            var6 = this.field7662.method731(0, arg1, 33);
        }
        if (arg0 != -4) {
            return null;
        }
        class36 var7 = new class36();
        var7.field455 = this;
        if (var6 != null) {
            var7.method235(0, new class194(var6));
        }
        class242 var8 = this.field7669;
        synchronized (this.field7669) {
            this.field7669.method1623((long) arg1, 17621, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)V")
    public static final void method3111(int arg0, int arg1, int arg2) {
        field7663++;
        class188 var3 = class10.method48((byte) 126, arg0, arg1);
        var3.method1308(false);
        var3.field2873 = arg2;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(BI)V")
    public final void method3112(byte arg0, int arg1) {
        class242 var3 = this.field7669;
        synchronized (this.field7669) {
            if (arg0 >= -12) {
                field7666 = -12;
            }
            this.field7669.method1631(arg1, (byte) -19);
        }
        field7661++;
        class242 var4 = this.field7673;
        synchronized (this.field7673) {
            this.field7673.method1631(arg1, (byte) -19);
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)V")
    public final void method3113(byte arg0) {
        field7670++;
        class242 var2 = this.field7669;
        synchronized (this.field7669) {
            this.field7669.method1630(-98);
        }
        class242 var3 = this.field7673;
        synchronized (this.field7673) {
            if (arg0 != 58) {
                this.field7669 = null;
            }
            this.field7673.method1630(-109);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static void method3114(int arg0) {
        field7672 = null;
        if (arg0 != 68) {
            method3111(-42, 53, -44);
        }
        field7668 = null;
        field7664 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method3115(String arg0, boolean arg1) {
        field7667++;
        class229.field3461 = arg0;
        if (class122.field1844.field1062 == null) {
            return;
        }
        try {
            String var2 = class122.field1844.field1062.getParameter("cookieprefix");
            String var3 = class122.field1844.field1062.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class345.method2220(-31125, class375.method2397((byte) -75) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class220.method1511(class122.field1844.field1062, "document.cookie=\"" + var5 + "\"", (byte) -77);
        } catch (Throwable var6) {
        }
        if (arg1) {
            field7672 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method3116(String arg0, int arg1) {
        field7671++;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1 != 6157) {
            method3115(null, true);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + (arg0.charAt(var4) - var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lpt;ILum;Lum;)V")
    public class522(class308 arg0, int arg1, class83 arg2, class83 arg3) {
        this.field7662 = arg2;
        this.field7665 = arg3;
        this.field7662.method748(33, 12408);
    }
}
