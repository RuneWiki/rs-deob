import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class288 {

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public int field4724;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public int field4733;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public int field4732;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public int field4725;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "[I")
    public static int[] field4726 = new int[32];

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field4730 = 0;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "[I")
    public static int[] field4729;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)Z", line = 8)
    public static final boolean method1974(int arg0, int arg1) {
        field4731++;
        class134 var2 = class183.method1294(arg0, (byte) -115);
        if (var2 == null) {
            return false;
        } else if (class92.field1562 == 1 || class92.field1562 == 2 || class112.field1900 == 2) {
            byte[] var3 = var2.field2185.method1599(arg1 ^ 0x6137);
            class312.field5261 = new String(var3, 0, var3.length);
            class209.field3457 = var2.field2178;
            if (class112.field1900 != 0) {
                class312.field5260 = class209.field3457 + 40000;
                class103.field1754 = class209.field3457 + 50000;
                class103.field1764 = class312.field5260;
            }
            return true;
        } else {
            if (arg1 != -24910) {
                method1976((byte) -111, 99L);
            }
            class229 var4 = class133.field2168;
            if (class112.field1900 != 0) {
                var4 = class248.method1746(8528, new class229[] { class6.field70, class50.method354(0, var2.field2178 + 7000) });
            }
            class229 var5 = class133.field2168;
            if (class232.field3830 != null) {
                var5 = class248.method1746(8528, new class229[] { class63.field904, class232.field3830 });
            }
            class229 var6 = class248.method1746(arg1 + 33438, new class229[] { class189.field3074, var2.field2185, var4, class173.field2831, class50.method354(0, class276.field4599), class316.field5371, class50.method354(0, class48.field709), var5, class178.field2935, class255.field4265 ? class40.field637 : class200.field3309, class156.field2526, class70.field1181 ? class40.field637 : class200.field3309, class323.field5520, class315.field5363 ? class40.field637 : class200.field3309 });
            try {
                class157.field2561.getAppletContext().showDocument(var6.method1602(true), "_self");
                return true;
            } catch (Exception var8) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 65)
    public static void method1975(int arg0) {
        field4729 = null;
        if (arg0 == -13295) {
            field4726 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BJ)V", line = 83)
    public static final void method1976(byte arg0, long arg1) {
        field4727++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg0 < 36) {
            method1976((byte) -127, 15L);
        }
        if (arg1 % 10L == 0L) {
            class206.method1442(true, arg1 - 1L);
            class206.method1442(true, 1L);
        } else {
            class206.method1442(true, arg1);
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)Lnm;", line = 111)
    public static final class179 method1977(int arg0) {
        field4728++;
        if (arg0 > -56) {
            field4729 = (int[]) null;
        }
        try {
            return (class179) Class.forName("he").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V", line = 135)
    public class288() {
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lld;)V", line = 137)
    public class288(class288 arg0) {
        this.field4724 = arg0.field4724;
        this.field4733 = arg0.field4733;
        this.field4732 = arg0.field4732;
        this.field4725 = arg0.field4725;
    }
}
