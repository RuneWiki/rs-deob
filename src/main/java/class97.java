import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class97 {

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field1629 = 2301979;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "J")
    public static volatile long field1634 = 0L;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field1628 = 0;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Ltg;")
    public static class182 field1632;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "[Lta;")
    public static class256[] field1630;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method645(int arg0, int arg1, int arg2, long arg3) {
        class216 var5 = class128.field2236[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field3762 != null && var5.field3762.field2984 == arg3) {
            return true;
        } else if (var5.field3758 != null && var5.field3758.field1034 == arg3) {
            return true;
        } else if (var5.field3757 != null && var5.field3757.field4889 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field3748; var6++) {
                if (var5.field3743[var6].field1372 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lug;ILug;)V")
    public static final void method646(class200 arg0, int arg1, class200 arg2) {
        field1631++;
        if (arg0.field3478 != null) {
            arg0.method1346(arg1 ^ 0x7836);
        }
        arg0.field3478 = arg2;
        arg0.field3472 = arg2.field3472;
        if (arg1 != 30796) {
            field1630 = null;
        }
        arg0.field3478.field3472 = arg0;
        arg0.field3472.field3478 = arg0;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method647(int arg0) {
        field1630 = null;
        field1632 = null;
        if (arg0 != 0) {
            method646((class200) null, 122, (class200) null);
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V")
    public static final void method648(int arg0) {
        field1633++;
        if (arg0 > -63) {
            return;
        }
        for (class210 var1 = (class210) class121.field2126.method529(10); var1 != null; var1 = (class210) class121.field2126.method533(56)) {
            class43 var2 = var1.field3646;
            if (class255.field4407 != var2.field749 || var2.field734 < class56.field926) {
                var1.method828((byte) -61);
            } else if (class56.field926 >= var2.field739) {
                if (var2.field760 > 0) {
                    class156 var3 = class248.field4287[var2.field760 - 1];
                    if (var3 != null && var3.field1325 >= 0 && var3.field1325 < 13312 && var3.field1301 >= 0 && var3.field1301 < 13312) {
                        var2.method327(class56.field926, var3.field1301, class115.method777(-1, var3.field1301, var2.field749, var3.field1325) - var2.field756, var3.field1325, (byte) 123);
                    }
                }
                if (var2.field760 < 0) {
                    int var4 = -var2.field760 - 1;
                    class183 var5;
                    if (class167.field2980 == var4) {
                        var5 = class168.field3006;
                    } else {
                        var5 = class259.field4515[var4];
                    }
                    if (var5 != null && var5.field1325 >= 0 && var5.field1325 < 13312 && var5.field1301 >= 0 && var5.field1301 < 13312) {
                        var2.method327(class56.field926, var5.field1301, class115.method777(-1, var5.field1301, var2.field749, var5.field1325) - var2.field756, var5.field1325, (byte) -77);
                    }
                }
                var2.method323(1024, class224.field3889);
                class1.method7(class255.field4407, (int) var2.field740, (int) var2.field720, (int) var2.field735, 60, var2, var2.field753, -1L, false);
            }
        }
    }
}
