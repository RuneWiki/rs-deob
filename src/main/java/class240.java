import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class240 {

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "Lss;")
    private class272 field3596 = new class272();

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "Lmt;")
    private class249 field3603 = new class249();

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    private int field3600;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    private int field3598;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "Lcp;")
    private class470 field3599;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field3595 = -1;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Lwf;")
    public static class79 field3592 = new class79(19, 5);

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "Lus;")
    public static class1 field3601 = new class1(96, 6);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static void method1520(int arg0) {
        if (arg0 != -23692) {
            field3601 = null;
        }
        field3601 = null;
        field3592 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lb;Lb;ILb;Lb;)V")
    public static final void method1521(class201 arg0, class201 arg1, int arg2, class201 arg3, class201 arg4) {
        class229.field3449 = arg4;
        class78.field963 = arg1;
        class459.field6426 = arg0;
        field3594++;
        class157.field2348 = arg3;
        class112.field1421 = new class145[class229.field3449.method1233(-1)][];
        if (arg2 > -82) {
            field3601 = null;
        }
        class481.field6780 = new boolean[class229.field3449.method1233(-1)];
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(JZLss;)V")
    public final void method1522(long arg0, boolean arg1, class272 arg2) {
        if (this.field3598 == 0) {
            class272 var5 = this.field3603.method1559(false);
            var5.method1510((byte) -13);
            var5.method1673((byte) 27);
            if (this.field3596 == var5) {
                class272 var6 = this.field3603.method1559(false);
                var6.method1510((byte) -13);
                var6.method1673((byte) 27);
            }
        } else {
            this.field3598--;
        }
        if (arg1) {
            this.method1525(-13);
        }
        field3591++;
        this.field3599.method2767(-1, arg0, arg2);
        this.field3603.method1553(-118, arg2);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;B)J")
    public static final long method1523(String arg0, byte arg1) {
        field3593++;
        long var2 = 0L;
        int var4 = arg0.length();
        if (arg1 < 118) {
            method1520(67);
        }
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
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

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZJ)Lss;")
    public final class272 method1524(boolean arg0, long arg1) {
        field3597++;
        if (arg0) {
            return null;
        }
        class272 var4 = (class272) this.field3599.method2761(arg1, (byte) -112);
        if (var4 != null) {
            this.field3603.method1553(-120, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
    public final void method1525(int arg0) {
        this.field3603.method1557(true);
        field3590++;
        this.field3599.method2771(-5);
        if (arg0 <= -122) {
            this.field3596 = new class272();
            this.field3598 = this.field3600;
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(I)V")
    public class240(int arg0) {
        this.field3600 = arg0;
        this.field3598 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field3599 = new class470(var2);
    }
}
