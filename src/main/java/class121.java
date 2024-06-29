import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class121 {

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "Ljn;")
    private class117 field1975 = new class117(64);

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "Lvo;")
    private class345 field1974;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field1981 = 0;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field1983 = 0;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field1978 = 0;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "Llq;")
    public static class292 field1980;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "[J")
    public static long[] field1979;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static final void method974(byte arg0) {
        class112.field1804.method936(-73);
        if (arg0 > -85) {
            field1979 = null;
        }
        field1982++;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)Lon;")
    public final class674 method975(int arg0, int arg1) {
        field1973++;
        class117 var3 = this.field1975;
        class674 var4;
        synchronized (this.field1975) {
            var4 = (class674) this.field1975.method941((long) arg1, arg0 ^ 0x20);
        }
        if (var4 != null) {
            return var4;
        }
        class345 var5 = this.field1974;
        byte[] var6;
        synchronized (this.field1974) {
            var6 = this.field1974.method2081(-127, arg1, arg0);
        }
        class674 var7 = new class674();
        if (var6 != null) {
            var7.method3814(new class465(var6), (byte) 127);
        }
        class117 var8 = this.field1975;
        synchronized (this.field1975) {
            this.field1975.method949((long) arg1, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public final void method976(int arg0) {
        field1971++;
        if (arg0 != -7944) {
            field1976 = 97;
        }
        class117 var2 = this.field1975;
        synchronized (this.field1975) {
            this.field1975.method950((byte) 96);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZLek;)V")
    public static final void method977(boolean arg0, class465 arg1) {
        field1984++;
        int var2 = arg1.method2720(-128);
        class390.field5685 = new class221[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class390.field5685[var3] = new class221();
            class390.field5685[var3].field3298 = arg1.method2720(-126);
            class390.field5685[var3].field3300 = arg1.method2707(3);
        }
        class695.field9867 = arg1.method2720(-126);
        class302.field4240 = arg1.method2720(-124);
        class254.field3670 = arg1.method2720(-128);
        class259.field3713 = new class613[class302.field4240 + 1 - class695.field9867];
        if (arg0) {
            method977(false, null);
        }
        for (int var4 = 0; var4 < class254.field3670; var4++) {
            int var5 = arg1.method2720(-125);
            class613 var6 = class259.field3713[var5] = new class613();
            var6.field7511 = arg1.method2705(-62);
            var6.field7509 = arg1.method2691((byte) -67);
            var6.field8776 = class695.field9867 + var5;
            var6.field8777 = arg1.method2707(3);
            var6.field8780 = arg1.method2707(3);
        }
        class187.field2931 = arg1.method2691((byte) -67);
        class308.field4277 = true;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)V")
    public final void method978(int arg0, byte arg1) {
        field1972++;
        if (arg1 != 121) {
            this.method976(9);
        }
        class117 var3 = this.field1975;
        synchronized (this.field1975) {
            this.field1975.method939(28093, arg0);
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lgn;ILvo;)V")
    public class121(class529 arg0, int arg1, class345 arg2) {
        this.field1974 = arg2;
        this.field1974.method2098(0, 32);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
    public final void method979(byte arg0) {
        if (arg0 != 42) {
            field1983 = -32;
        }
        field1977++;
        class117 var2 = this.field1975;
        synchronized (this.field1975) {
            this.field1975.method936(-111);
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
    public static void method980(int arg0) {
        if (arg0 != 32) {
            field1980 = null;
        }
        field1980 = null;
        field1979 = null;
    }
}
