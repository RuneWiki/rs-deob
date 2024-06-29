import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!da")
public class class8 extends RuntimeException {

    @OriginalMember(owner = "mapview!da", name = "i", descriptor = "Ljava/lang/Throwable;")
    public Throwable field80;

    @OriginalMember(owner = "mapview!da", name = "g", descriptor = "Ljava/lang/String;")
    public String field78;

    @OriginalMember(owner = "mapview!da", name = "e", descriptor = "Lu;")
    public static class38 field76 = class28.method177("underlay)3dat", (byte) -84);

    @OriginalMember(owner = "mapview!da", name = "c", descriptor = "Lu;")
    public static class38 field74 = class28.method177("loc)3dat", (byte) -84);

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "Lu;")
    public static class38 field73 = class28.method177("labels)3dat", (byte) -84);

    @OriginalMember(owner = "mapview!da", name = "k", descriptor = "I")
    public static int field82 = -1;

    @OriginalMember(owner = "mapview!da", name = "f", descriptor = "Lu;")
    public static class38 field77 = class28.method177("Farming patch", (byte) -84);

    @OriginalMember(owner = "mapview!da", name = "l", descriptor = "Lu;")
    public static class38 field83 = class28.method177("Requesting", (byte) -84);

    @OriginalMember(owner = "mapview!da", name = "d", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "mapview!da", name = "j", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "mapview!da", name = "h", descriptor = "J")
    public static long field79;

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "Lpa;")
    public static class32 field72;

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(I)V", line = 6)
    public static void method42(int arg0) {
        field73 = null;
        field83 = null;
        field77 = null;
        field74 = null;
        if (arg0 != 15845) {
            field79 = 100L;
        }
        field72 = null;
        field76 = null;
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(B)I", line = 45)
    public static final int method43(byte arg0) {
        if (arg0 != -67) {
            method45(-12, 36, null, (byte) 107);
        }
        if (class1.field6 == null) {
            return 0;
        } else if (class1.field6.field395 == null) {
            return class28.field349[class1.field6.field400 & 0xFF];
        } else {
            return class28.field349[class1.field6.field395[class22.field213] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!da", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 79)
    public class8(Throwable arg0, String arg1) {
        this.field80 = arg0;
        this.field78 = arg1;
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(I[B)[B", line = 96)
    public static final byte[] method44(int arg0, byte[] arg1) {
        class19 var2 = new class19(arg1);
        int var3 = var2.method115(-2);
        int var4 = var2.method117(false);
        if (var4 < 0 || class24.field232 != 0 && class24.field232 < var4) {
            throw new RuntimeException();
        } else if (arg0 == var3) {
            byte[] var7 = new byte[var4];
            var2.method121(0, var4, (byte) -128, var7);
            return var7;
        } else {
            int var5 = var2.method117(false);
            if (var5 < 0 || class24.field232 != 0 && class24.field232 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class12.method57(var6, var5, arg1, var4, 9);
            } else {
                class20.field202.method210(var2, var6, true);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(II[BB)Lu;", line = 149)
    public static final class38 method45(int arg0, int arg1, byte[] arg2, byte arg3) {
        class38 var4 = new class38();
        var4.field483 = new byte[arg0];
        var4.field494 = 0;
        for (int var5 = arg1; var5 < arg1 + arg0; var5++) {
            if (arg2[var5] != 0) {
                var4.field483[var4.field494++] = arg2[var5];
            }
        }
        if (arg3 < 124) {
            field74 = null;
        }
        return var4;
    }
}
