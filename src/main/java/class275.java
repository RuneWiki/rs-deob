import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public abstract class class275 {

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field4225 = 0;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
    public static int field4234 = -1;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "Lje;")
    public static class199 field4238 = new class199();

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4240 = " is already on your ignore list.";

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "Z")
    public static boolean field4239 = true;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public int field4226;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public int field4228;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "I")
    public int field4236;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)Z", line = 6)
    public final boolean method1801(int arg0) {
        field4235++;
        if (arg0 != -5306) {
            this.field4226 = 40;
        }
        return (this.field4236 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V", line = 25)
    public static final void method1802(int arg0) {
        field4233++;
        class45 var1 = (class45) class166.field2557.method1549((byte) 125);
        if (arg0 != -7242) {
            field4238 = (class199) null;
        }
        while (var1 != null) {
            int var2 = var1.field640;
            if (class183.method1263(arg0 ^ 0xFFFFE3B6, var2)) {
                boolean var3 = true;
                class207[] var4 = class219.field3487[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field3267;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field2852;
                    class207 var7 = class78.method547(var6, 108);
                    if (var7 != null) {
                        class277.method1822(4096, var7);
                    }
                }
            }
            var1 = (class45) class166.field2557.method1546(-1);
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)Z", line = 80)
    public final boolean method1803(int arg0) {
        if (arg0 != 20192) {
            field4239 = true;
        }
        field4230++;
        return (this.field4236 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(I)Z", line = 97)
    public final boolean method1804(int arg0) {
        field4229++;
        if (arg0 >= -68) {
            return false;
        } else {
            return (this.field4236 & 0x8) != 0;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZJ)Ljava/lang/String;", line = 110)
    public static final String method1805(boolean arg0, long arg1) {
        if (arg0) {
            field4225 = -46;
        }
        field4227++;
        return class97.method665(50, arg1);
    }

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "(I)Z", line = 124)
    public final boolean method1806(int arg0) {
        field4232++;
        if (arg0 <= 104) {
            return false;
        } else {
            return (this.field4236 & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "(I)V", line = 143)
    public static void method1807(int arg0) {
        field4240 = null;
        field4238 = null;
        if (arg0 != 0) {
            field4225 = 33;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)V", line = 160)
    public static final void method1808(boolean arg0) {
        class132.field2089.method1296(255);
        if (arg0) {
            field4237++;
            class274.field4214.method1296(255);
        }
    }
}
