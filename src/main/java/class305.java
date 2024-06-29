import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class305 {

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Z")
    private boolean field3984 = false;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "Z")
    private boolean field3990 = false;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public int field3991 = 43594;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public int field3989 = 443;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field3983 = new String[100];

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public int field3986;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "Ljava/lang/String;")
    public String field3992;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLpe;)Lsba;")
    public final class199 method1743(byte arg0, class556 arg1) {
        field3987++;
        if (arg0 >= -109) {
            this.field3991 = 89;
        }
        return arg1.method3149(this.field3984 ? this.field3989 : this.field3991, (byte) -89, this.field3992, this.field3990);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static void method1744(int arg0) {
        if (arg0 == -2394) {
            field3983 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILrd;)Z")
    public final boolean method1745(int arg0, class305 arg1) {
        int var3 = 87 / ((arg0 - 67) / 59);
        field3988++;
        if (arg1 == null) {
            return false;
        } else {
            return this.field3986 == arg1.field3986 && this.field3992.equals(arg1.field3992);
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    public final void method1746(int arg0) {
        if (arg0 != 0) {
            this.field3992 = null;
        }
        if (!this.field3984) {
            this.field3984 = true;
            this.field3990 = true;
        } else if (this.field3990) {
            this.field3990 = false;
        } else {
            this.field3984 = false;
        }
        field3985++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1747(int arg0, String arg1) {
        field3982++;
        if (!class294.field3867.field7924) {
            return -1;
        } else if (class168.field2012.containsKey(arg1)) {
            return 100;
        } else {
            String var2 = class598.method3346(arg1, false);
            if (var2 == null) {
                return -1;
            }
            String var3 = class97.field1076 + var2;
            if (!class229.field2923.method1724(var3, (byte) -68, "")) {
                return -1;
            } else if (class229.field2923.method1721(var3, arg0 - 17625)) {
                byte[] var4 = class229.field2923.method1734("", 11434, var3);
                File var5 = class619.method3476(var2, (byte) -41);
                if (var4 == null || var5 == null) {
                    if (arg0 != 17751) {
                        method1744(79);
                    }
                    return -1;
                }
                boolean var6 = true;
                byte[] var7 = class181.method1057((byte) -29, var5);
                if (var7 != null && var4.length == var7.length) {
                    for (int var8 = 0; var8 < var7.length; var8++) {
                        if (var4[var8] != var7[var8]) {
                            var6 = false;
                            break;
                        }
                    }
                } else {
                    var6 = false;
                }
                try {
                    if (!var6) {
                        class294.field3867.method3132(var4, var5, -25590);
                    }
                } catch (Throwable var9) {
                    return -1;
                }
                class154.method840(var5, arg1, 3639);
                return 100;
            } else {
                return class229.field2923.method1741(var3, 9312);
            }
        }
    }
}
