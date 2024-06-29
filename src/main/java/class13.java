import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!h")
public class class13 extends RuntimeException {

    @OriginalMember(owner = "mapview!h", name = "h", descriptor = "Ljava/lang/Throwable;")
    public Throwable field163;

    @OriginalMember(owner = "mapview!h", name = "g", descriptor = "Ljava/lang/String;")
    public String field162;

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "I")
    public static int field158 = 20;

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "Lna;")
    public static class26 field159 = class6.method40(" ", 48);

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "Lna;")
    public static class26 field157 = class6.method40("Overview", 48);

    @OriginalMember(owner = "mapview!h", name = "i", descriptor = "Lna;")
    public static class26 field164 = class6.method40("Farming shop", 48);

    @OriginalMember(owner = "mapview!h", name = "f", descriptor = "Lna;")
    public static class26 field161 = class6.method40("Jewellery", 48);

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "mapview!h", name = "e", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(Z)B", line = 8)
    public static final byte method78(boolean arg0) {
        if (arg0) {
            field158 = -110;
        }
        return class14.field167 == null ? 0 : class14.field167[class20.field213];
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "([BI)[B", line = 42)
    public static final byte[] method79(byte[] arg0, int arg1) {
        class10 var2 = new class10(arg0);
        int var3 = var2.method66(-65);
        if (arg1 < 63) {
            return (byte[]) null;
        }
        int var4 = var2.method69((byte) 121);
        if (var4 < 0 || class22.field223 != 0 && class22.field223 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method61(var4, var5, 0, -3);
            return var5;
        } else {
            int var6 = var2.method69((byte) 120);
            if (var6 < 0 || class22.field223 != 0 && class22.field223 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class28.method201(var7, var6, arg0, var4, 9);
            } else {
                class9.field100.method133((byte) -56, var2, var7);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(I)V", line = 90)
    public static void method80(int arg0) {
        field164 = null;
        int var1 = -18 % ((57 - arg0) / 49);
        field159 = null;
        field157 = null;
        field161 = null;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(Lna;BLna;La;)Lma;", line = 104)
    public static final class24 method81(class26 arg0, byte arg1, class26 arg2, class1 arg3) {
        int var4 = arg3.method10(false, arg2);
        int var5 = arg3.method11(arg0, var4, (byte) 83);
        int var6 = 85 / ((arg1 + 33) / 48);
        return class31.method225(var5, 255, var4, arg3);
    }

    @OriginalMember(owner = "mapview!h", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 117)
    public class13(Throwable arg0, String arg1) {
        this.field163 = arg0;
        this.field162 = arg1;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(ZLjava/lang/String;)Lna;", line = 149)
    public static final class26 method82(boolean arg0, String arg1) {
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg1.getBytes();
        }
        if (arg0) {
            field158 = 6;
        }
        class26 var4 = new class26();
        var4.field371 = var2;
        var4.field375 = 0;
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var4.field375++] = var2[var5];
            }
        }
        return var4;
    }
}
