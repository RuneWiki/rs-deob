import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class265 implements Runnable {

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "Z")
    public boolean field4230 = true;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Ljava/lang/Object;")
    public Object field4227 = new Object();

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public int field4232 = 0;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "[I")
    public int[] field4234 = new int[500];

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "[I")
    public int[] field4235 = new int[500];

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field4224 = new String[100];

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field4226 = 0;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Z")
    public static boolean field4221 = false;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field4231 = 1;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field4222 = 0;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;Ljava/lang/String;)V")
    public static final void method1805(String arg0, int arg1, byte arg2, String arg3, String arg4) {
        field4225++;
        class123.method873(arg1, -1, arg0, arg4, 111, arg3);
        if (arg2 != 36) {
            field4222 = -49;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
    public static final void method1806(byte arg0) {
        field4223++;
        if (arg0 >= -86) {
            field4226 = 126;
        }
        for (class245 var1 = (class245) class13.field229.method1010(113); var1 != null; var1 = (class245) class13.field229.method1008((byte) 88)) {
            class47 var2 = var1.field3795;
            if (class274.field4318 != var2.field749 || class267.field4256 > var2.field762) {
                var1.method693(-93);
            } else if (class267.field4256 >= var2.field767) {
                if (var2.field773 > 0) {
                    class32 var3 = class72.field1144[var2.field773 - 1];
                    if (var3 != null && var3.field4176 >= 0 && var3.field4176 < 13312 && var3.field4123 >= 0 && var3.field4123 < 13312) {
                        var2.method390(var3.field4123, class267.field4256, class224.method1502((byte) -127, var2.field749, var3.field4123, var3.field4176) - var2.field751, var3.field4176, (byte) 76);
                    }
                }
                if (var2.field773 < 0) {
                    int var4 = -var2.field773 - 1;
                    class28 var5;
                    if (class294.field4623 == var4) {
                        var5 = class261.field4058;
                    } else {
                        var5 = class41.field675[var4];
                    }
                    if (var5 != null && var5.field4176 >= 0 && var5.field4176 < 13312 && var5.field4123 >= 0 && var5.field4123 < 13312) {
                        var2.method390(var5.field4123, class267.field4256, class224.method1502((byte) -126, var2.field749, var5.field4123, var5.field4176) - var2.field751, var5.field4176, (byte) 127);
                    }
                }
                var2.method381(-1, class127.field1996);
                class111.method821(class274.field4318, (int) var2.field770, (int) var2.field768, (int) var2.field742, 60, var2, var2.field745, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZII)Lb;")
    public static final class84 method1807(boolean arg0, int arg1, int arg2) {
        field4228++;
        class84 var3 = new class84();
        for (class297 var4 = (class297) class77.field1304.method1410(-111); var4 != null; var4 = (class297) class77.field1304.method1413(-1)) {
            if (var4.field4701 && var4.method1992(arg1, arg2, false)) {
                var3.method683(var4, 121);
            }
        }
        if (!arg0) {
            method1807(false, 43, 45);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)V")
    public static final void method1808(int arg0, int arg1) {
        field4233++;
        class295 var2 = class250.method1673(93, arg1, arg0);
        var2.method1979(-8205);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static void method1809(int arg0) {
        field4224 = null;
        if (arg0 != 0) {
            method1808(13, 20);
        }
    }

    @OriginalMember(owner = "client!wa", name = "run", descriptor = "()V")
    public final void run() {
        field4229++;
        while (this.field4230) {
            Object var1 = this.field4227;
            synchronized (this.field4227) {
                if (this.field4232 < 500) {
                    this.field4234[this.field4232] = class188.field3012;
                    this.field4235[this.field4232] = class108.field1719;
                    this.field4232++;
                }
            }
            class42.method354(50L, false);
        }
    }
}
