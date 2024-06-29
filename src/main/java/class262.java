import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class262 {

    @OriginalMember(owner = "client!gga", name = "e", descriptor = "Z")
    public boolean field3979 = true;

    @OriginalMember(owner = "client!gga", name = "j", descriptor = "C")
    private char field3984;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!gga", name = "d", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!gga", name = "f", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!gga", name = "h", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!gga", name = "i", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!gga", name = "k", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!gga", name = "l", descriptor = "I")
    public int field3986;

    @OriginalMember(owner = "client!gga", name = "g", descriptor = "Ljava/lang/String;")
    public String field3981;

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "[[[B")
    public static byte[][][] field3977;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method1719(int arg0) {
        field3980++;
        int var2 = 101 % ((-arg0 - 49) / 33);
        return this.field3984 == 's';
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(IILmo;)V", line = 16)
    private final void method1720(int arg0, int arg1, class695 arg2) {
        if (arg0 == 1) {
            this.field3984 = class178.method1210(32062, arg2.method3827((byte) 24));
        } else if (arg0 == 2) {
            this.field3986 = arg2.method3880(8);
        } else if (arg0 == 4) {
            this.field3979 = false;
        } else if (arg0 == 5) {
            this.field3981 = arg2.method3836(false);
        }
        if (arg1 <= 20) {
            this.method1722(true, null);
        }
        field3983++;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)Ld;", line = 45)
    public static final class135 method1721(byte arg0) {
        field3985++;
        class135 var1 = class318.method1997((byte) 101);
        if (arg0 >= -1) {
            field3976 = 80;
        }
        var1.field1979 = 0;
        var1.field1984 = null;
        var1.field1978 = new class26(5000);
        return var1;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(ZLmo;)V", line = 61)
    public final void method1722(boolean arg0, class695 arg1) {
        if (arg0) {
            return;
        }
        while (true) {
            int var3 = arg1.method3826(arg0);
            if (var3 == 0) {
                field3982++;
                return;
            }
            this.method1720(var3, 80, arg1);
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 82)
    public static final void method1723(boolean arg0, String arg1) {
        field3975++;
        if (class520.field7335 == null) {
            class347.method2145(!arg0);
        }
        class373.field5321.setTime(new Date(class490.method2840(arg0)));
        int var2 = class373.field5321.get(11);
        int var3 = class373.field5321.get(12);
        int var4 = class373.field5321.get(13);
        String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
        String[] var6 = class208.method1377('\n', (byte) -115, arg1);
        for (int var7 = 0; var7 < var6.length; var7++) {
            for (int var8 = class466.field6706; var8 > 0; var8--) {
                class520.field7335[var8] = class520.field7335[var8 - 1];
            }
            class520.field7335[0] = var5 + ": " + var6[var7];
            if (class466.field6706 < (class520.field7335.length - 1)) {
                class466.field6706++;
                if (class619.field8629 > 0) {
                    class619.field8629++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(I)V", line = 138)
    public static void method1724(int arg0) {
        field3977 = null;
        if (arg0 != -1) {
            field3978 = -63;
        }
    }
}
