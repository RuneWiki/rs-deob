import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public class class89 extends class389 {

    @OriginalMember(owner = "client!eha", name = "m", descriptor = "I")
    public int field934;

    @OriginalMember(owner = "client!eha", name = "l", descriptor = "I")
    public static int field933 = 0;

    @OriginalMember(owner = "client!eha", name = "i", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!eha", name = "k", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!eha", name = "j", descriptor = "Ldh;")
    public static class320 field931;

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(I[Ltp;B)V")
    public static final void method612(int arg0, class532[] arg1, byte arg2) {
        field930++;
        if (arg2 != 43) {
            return;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class532 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field7543 == 0) {
                    if (var4.field7632 != null) {
                        method612(arg0, var4.field7632, (byte) 43);
                    }
                    class424 var5 = (class424) class153.field1688.method1754(false, (long) var4.field7704);
                    if (var5 != null) {
                        class600.method3415(var5.field6159, 64, arg0);
                    }
                }
                if (arg0 == 0 && var4.field7574 != null) {
                    class622 var6 = new class622();
                    var6.field8908 = var4;
                    var6.field8904 = var4.field7574;
                    class133.method859(var6);
                }
                if (arg0 == 1 && var4.field7623 != null) {
                    if (var4.field7628 >= 0) {
                        class532 var7 = class269.method1608((byte) -72, var4.field7704);
                        if (var7 == null || var7.field7632 == null || var4.field7628 >= var7.field7632.length || var7.field7632[var4.field7628] != var4) {
                            continue;
                        }
                    }
                    class622 var8 = new class622();
                    var8.field8908 = var4;
                    var8.field8904 = var4.field7623;
                    class133.method859(var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(ILbq;Lha;II)V")
    public static final void method613(int arg0, class289 arg1, class58 arg2, int arg3, int arg4) {
        field932++;
        class685.field9680.method1728(29632);
        if (class484.field6881 || arg0 < 65) {
            return;
        }
        for (class191 var5 = (class191) arg1.method1719(65280); var5 != null; var5 = (class191) arg1.method1723(-20665)) {
            class228 var6 = class656.field9360.method2054(36, var5.field2252);
            if (class633.method3633(0, var6)) {
                boolean var7 = class166.method1038(var5, 119, arg3, arg2, var6, arg4);
                if (var7) {
                    class706.method3956(var5, 3, var6, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(Z)V")
    public static void method614(boolean arg0) {
        field931 = null;
        if (arg0) {
            field933 = 70;
        }
    }

    @OriginalMember(owner = "client!eha", name = "<init>", descriptor = "(I)V")
    public class89(int arg0) {
        this.field934 = arg0;
    }
}
