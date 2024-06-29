import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public abstract class class312 {

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "Lus;")
    public class1 field4632;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "Z")
    public static boolean field4636 = false;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "[I")
    public static int[] field4635 = new int[3];

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIB)V")
    public abstract void method238(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZZ)V")
    public abstract void method243(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lus;)V")
    public class312(class1 arg0) {
        this.field4632 = arg0;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)Lkb;")
    public static final class643 method2031(int arg0, int arg1) {
        field4633++;
        if (arg1 != 90) {
            method2031(13, 90);
        }
        return arg0 >= 0 && arg0 < 100 ? class588.field8472[arg0] : null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public abstract void method241(int arg0);

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)V")
    public abstract void method240(boolean arg0, int arg1);

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZLjava/lang/String;)J")
    public static final long method2032(boolean arg0, String arg1) {
        field4634++;
        long var2 = 0L;
        if (!arg0) {
            field4635 = null;
        }
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 - 96);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 - 21);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)Z")
    public abstract boolean method242(byte arg0);

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public static void method2033(int arg0) {
        if (arg0 != 1072) {
            method2034(-92, false, null);
        }
        field4635 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBLum;)V")
    public abstract void method244(int arg0, byte arg1, class487 arg2);

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZ[Llk;)V")
    public static final void method2034(int arg0, boolean arg1, class545[] arg2) {
        if (!arg1) {
            method2034(-126, true, null);
        }
        field4637++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class545 var4 = arg2[var3];
            if (var4 != null && var4.field7733 == arg0 && !client.method1819(var4)) {
                if (var4.field7649 == 0) {
                    method2034(var4.field7755, arg1, arg2);
                    if (var4.field7641 != null) {
                        method2034(var4.field7755, true, var4.field7641);
                    }
                    class601 var5 = (class601) class78.field1572.method2596((long) var4.field7755, 93);
                    if (var5 != null) {
                        class437.method2647(1, var5.field8614);
                    }
                }
                if (var4.field7649 == 6 && var4.field7698 != -1) {
                    class138 var6 = class357.field5338.method2099(var4.field7698, true);
                    if (var6 != null) {
                        var4.field7715 += class620.field8990;
                        int var7 = var4.field7624;
                        while (var4.field7715 > var6.field2431[var4.field7624]) {
                            var4.field7715 -= var6.field2431[var4.field7624];
                            var4.field7624++;
                            if (var6.field2440.length <= var4.field7624) {
                                var4.field7624 -= var6.field2427;
                                if (var4.field7624 < 0 || var6.field2440.length <= var4.field7624) {
                                    var4.field7624 = 0;
                                }
                            }
                            var4.field7661 = var4.field7624 + 1;
                            if (var6.field2440.length <= var4.field7661) {
                                var4.field7661 -= var6.field2427;
                                if (var4.field7661 < 0 || var6.field2440.length <= var4.field7661) {
                                    var4.field7661 = -1;
                                }
                            }
                            class531.method3088(var4, (byte) 123);
                        }
                        if (var4.field7624 != var7) {
                            class130.method1098(var4.field7624, (byte) 88, var6);
                        }
                    }
                }
            }
        }
    }
}
