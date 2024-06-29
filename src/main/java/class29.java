import java.awt.Frame;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!p")
public class class29 {

    @OriginalMember(owner = "mapview!p", name = "f", descriptor = "I")
    public static int field379 = 1;

    @OriginalMember(owner = "mapview!p", name = "i", descriptor = "Lj;")
    public static class17 field382 = class30.method190(-101, "???");

    @OriginalMember(owner = "mapview!p", name = "g", descriptor = "Lj;")
    public static class17 field380 = class30.method190(-117, "Windmill");

    @OriginalMember(owner = "mapview!p", name = "h", descriptor = "Lj;")
    public static class17 field381 = class30.method190(-116, "Fur Trader");

    @OriginalMember(owner = "mapview!p", name = "d", descriptor = "J")
    public long field377;

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "Lj;")
    public static class17 field376;

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "Lp;")
    public class29 field374;

    @OriginalMember(owner = "mapview!p", name = "j", descriptor = "Lp;")
    public class29 field383;

    @OriginalMember(owner = "mapview!p", name = "e", descriptor = "Ljava/awt/Frame;")
    public static Frame field378;

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "[I")
    public static int[] field375;

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(I)V", line = 5)
    public static void method184(int arg0) {
        if (arg0 != 30870) {
            field378 = null;
        }
        field378 = null;
        field380 = null;
        field382 = null;
        field376 = null;
        field381 = null;
        field375 = null;
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(B)B", line = 33)
    public static final byte method185(byte arg0) {
        if (arg0 != 72) {
            field376 = null;
        }
        return class13.field238 == null ? 0 : class13.field238[class13.field234];
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(Z)V", line = 54)
    public final void method186(boolean arg0) {
        if (this.field374 == null) {
            return;
        }
        this.field374.field383 = this.field383;
        this.field383.field374 = this.field374;
        if (!arg0) {
            this.field374 = null;
            this.field383 = null;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "(I)V", line = 80)
    public static final void method187(int arg0) {
        if (arg0 == 1 && class28.field364 != null) {
            class23 var1 = class28.field364;
            synchronized (class28.field364) {
                class28.field364 = null;
            }
        }
    }

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "(I)V", line = 103)
    public static final void method188(int arg0) {
        if (class28.field367 != null) {
            class2 var1 = class28.field367;
            synchronized (class28.field367) {
                class28.field367 = null;
            }
        }
        if (arg0 != 0) {
            field379 = -51;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(ILjava/lang/String;)Lj;", line = 125)
    public static final class17 method189(int arg0, String arg1) {
        if (arg0 != 11231) {
            return (class17) null;
        }
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg1.getBytes();
        }
        class17 var4 = new class17();
        var4.field268 = 0;
        var4.field263 = var2;
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var4.field268++] = var2[var5];
            }
        }
        return var4;
    }
}
