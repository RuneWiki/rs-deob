import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class135 {

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "Z")
    public boolean field1721 = true;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1716 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "Lnga;")
    public static class514 field1724 = new class514();

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "Lea;")
    public static class547 field1725 = new class547(53, -1);

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "C")
    private char field1717;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public int field1718;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "Lfga;")
    public static class258 field1723;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "Ljava/lang/String;")
    public String field1719;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lji;B)V", line = 3)
    public static final void method840(class611 arg0, byte arg1) {
        field1714++;
        byte[] var2 = new byte[24];
        if (arg1 != 0) {
            return;
        }
        if (class399.field5653 != null) {
            try {
                class399.field5653.method1966(0L, 0);
                class399.field5653.method1962(var2, arg1);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method3416(var2, 24, -1, 0);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lji;I)V", line = 51)
    public final void method841(class611 arg0, int arg1) {
        if (arg1 != -1) {
            field1723 = null;
        }
        field1713++;
        while (true) {
            int var3 = arg0.method3428((byte) 5);
            if (var3 == 0) {
                return;
            }
            this.method844(var3, arg0, 1);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V", line = 73)
    public static void method842(int arg0) {
        field1725 = null;
        field1724 = null;
        if (arg0 == 0) {
            field1723 = null;
            field1716 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)Z", line = 89)
    public final boolean method843(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            field1715++;
            return this.field1717 == 's';
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILji;I)V", line = 102)
    private final void method844(int arg0, class611 arg1, int arg2) {
        field1720++;
        if (arg0 == arg2) {
            this.field1717 = class14.method54(arg1.method3390((byte) -19), (byte) 127);
        } else if (arg0 == 2) {
            this.field1718 = arg1.method3418(-2);
        } else if (arg0 == 4) {
            this.field1721 = false;
        } else if (arg0 == 5) {
            this.field1719 = arg1.method3403((byte) 84);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)V", line = 133)
    public static final void method845(int arg0, int arg1, int arg2) {
        class469.field6480++;
        if (arg1 < 78) {
            field1723 = null;
        }
        field1722++;
        class103 var3 = class752.method4186(260, class102.field1371, class449.field6285);
        var3.field1379.method3381(arg0, (byte) 126);
        var3.field1379.method3444(arg2, 1046032984);
        class27.method104(false, var3);
    }
}
