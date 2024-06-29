import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public abstract class class325 {

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!nha", name = "c", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!nha", name = "d", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!nha", name = "e", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(II)V")
    public static final void method1938(int arg0, int arg1) {
        class624 var2 = class77.field947[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class624 var4 = class77.field947[var3][arg0][arg1] = class77.field947[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class603 var5 = var4.field8729; var5 != null; var5 = var5.field8413) {
                    class752 var6 = var5.field8410;
                    if (var6.field10422 == arg0 && var6.field10421 == arg1) {
                        var6.field2175--;
                    }
                }
                if (var4.field8736 != null) {
                    var4.field8736.field2175--;
                }
                if (var4.field8728 != null) {
                    var4.field8728.field2175--;
                }
                if (var4.field8737 != null) {
                    var4.field8737.field2175--;
                }
                if (var4.field8738 != null) {
                    var4.field8738.field2175--;
                }
                if (var4.field8730 != null) {
                    var4.field8730.field2175--;
                }
            }
        }
        if (class77.field947[0][arg0][arg1] == null) {
            class77.field947[0][arg0][arg1] = new class624(0);
            class77.field947[0][arg0][arg1].field8726 = 1;
        }
        class77.field947[0][arg0][arg1].field8734 = var2;
        class77.field947[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(B)V")
    public static final void method1939(byte arg0) {
        if (class716.field9976 <= 0) {
            class704.field9878 = "";
        } else {
            int var1 = 0;
            for (int var2 = 0; var2 < class73.field784.length; var2++) {
                if (class73.field784[var2].indexOf("--> ") != -1) {
                    int var10000 = ~class716.field9976;
                    var1++;
                    if (var10000 == ~var1) {
                        class704.field9878 = class73.field784[var2].substring(class73.field784[var2].indexOf(">") + 2);
                        break;
                    }
                }
            }
        }
        if (arg0 <= 122) {
            method1940(-3, 116, -39);
        }
        field4356++;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(III)Z")
    public static final boolean method1940(int arg0, int arg1, int arg2) {
        field4357++;
        if (arg0 != 32768) {
            field4355 = -40;
        }
        return (arg1 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(ILbda;)Lbda;")
    public abstract class506 method1910(int arg0, class506 arg1);

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(I)V")
    public static final void method1941(int arg0) {
        if (arg0 < 20) {
            field4355 = -40;
        }
        field4358++;
        if (class362.field4800) {
            return;
        }
        class554.method3147((byte) -89, class396.field5627);
        if (class195.field2334 != null) {
            class554.method3147((byte) -121, class195.field2334);
        }
        class362.field4800 = true;
    }

    static {
        new class125("", 73);
    }
}
