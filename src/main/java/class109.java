import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class109 extends class5 {

    @OriginalMember(owner = "client!sk", name = "M", descriptor = "[B")
    public byte[] field2086;

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "I")
    public static int field2079 = 0;

    @OriginalMember(owner = "client!sk", name = "F", descriptor = "Lhj;")
    public static class69 field2080 = class181.method1318("<col=ff3000>", (byte) -106);

    @OriginalMember(owner = "client!sk", name = "P", descriptor = "I")
    public static int field2089 = -1;

    @OriginalMember(owner = "client!sk", name = "H", descriptor = "Lhj;")
    public static class69 field2082 = class181.method1318("mem=", (byte) -128);

    @OriginalMember(owner = "client!sk", name = "N", descriptor = "I")
    public static int field2087 = 0;

    @OriginalMember(owner = "client!sk", name = "S", descriptor = "Lhj;")
    public static class69 field2092 = class181.method1318("T", (byte) -125);

    @OriginalMember(owner = "client!sk", name = "G", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!sk", name = "I", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!sk", name = "J", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!sk", name = "K", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!sk", name = "O", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!sk", name = "Q", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!sk", name = "R", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)V")
    public static final void method818(int arg0, int arg1, int arg2) {
        field2090++;
        class50.field812[arg0] = arg1;
        class207 var3 = (class207) class103.field1920.method769(true, (long) arg0);
        if (var3 == null) {
            class207 var4 = new class207(class223.method1584(-25392) + 500L);
            class103.field1920.method761((long) arg0, 0, var4);
        } else {
            var3.field3774 = class223.method1584(-25392) + 500L;
        }
        if (arg2 != -29072) {
            field2087 = -55;
        }
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)I")
    public static final int method819(byte arg0) {
        int var1 = -54 / ((7 - arg0) / 53);
        field2088++;
        return 0;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "([B)V")
    public class109(byte[] arg0) {
        this.field2086 = arg0;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lnc;III)[Lkc;")
    public static final class264[] method820(class83 arg0, int arg1, int arg2, int arg3) {
        if (arg3 == -1) {
            field2084++;
            return class244.method1735(arg0, 0, arg1, arg2) ? class181.method1317(0) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)V")
    public static final void method821(int arg0) {
        field2081++;
        if (arg0 <= 54) {
            method821(68);
        }
        class59.field1072.method1709((byte) -76);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)Lra;")
    public static final class221 method822(int arg0, int arg1) {
        field2085++;
        class221 var2 = (class221) class118.field2226.method1714((long) arg1, (byte) -128);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class207.field3778.method590(arg1, arg0, 0);
        class221 var4 = new class221();
        if (var3 != null) {
            var4.method1565((byte) 111, new class128(var3));
        }
        class118.field2226.method1705((byte) 126, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(B)V")
    public static void method823(byte arg0) {
        int var1 = -33 % ((arg0 - 73) / 48);
        field2082 = null;
        field2080 = null;
        field2092 = null;
    }
}
