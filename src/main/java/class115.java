import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class115 {

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "Lnj;")
    private class162 field1721 = new class162(64);

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "Lmg;")
    private class101 field1728;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public int field1723;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "[I")
    public static int[] field1727 = new int[2];

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1720 = "";

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "Lmg;")
    public static class101 field1719;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)I", line = 6)
    public static final int method820(int arg0, byte arg1) {
        field1726++;
        if (arg1 != 76) {
            method826(false);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 19)
    public static void method821(int arg0) {
        field1720 = null;
        field1719 = null;
        if (arg0 <= -91) {
            field1727 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V", line = 32)
    public final void method822(boolean arg0) {
        if (!arg0) {
            method826(false);
        }
        field1718++;
        class162 var2 = this.field1721;
        synchronized (this.field1721) {
            this.field1721.method1066(4080);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)V", line = 48)
    public final void method823(byte arg0, int arg1) {
        if (arg0 <= 76) {
            field1720 = null;
        }
        class162 var3 = this.field1721;
        synchronized (this.field1721) {
            this.field1721.method1065((byte) -95, arg1);
        }
        field1717++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZI)Lvs;", line = 64)
    public final class417 method824(boolean arg0, int arg1) {
        field1722++;
        class162 var3 = this.field1721;
        class417 var4;
        synchronized (this.field1721) {
            var4 = (class417) this.field1721.method1073((long) arg1, arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1728.method727(arg1, 16, -110);
        class417 var6 = new class417();
        if (var5 != null) {
            var6.method2482(new class391(var5), (byte) 112);
        }
        class162 var7 = this.field1721;
        synchronized (this.field1721) {
            this.field1721.method1072((long) arg1, var6, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V", line = 89)
    public final void method825(int arg0) {
        field1716++;
        if (arg0 >= -18) {
            method820(-44, (byte) 33);
        }
        class162 var2 = this.field1721;
        synchronized (this.field1721) {
            this.field1721.method1068(0);
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(Z)V", line = 108)
    public static final void method826(boolean arg0) {
        class310.field4231.method907((byte) 97);
        field1724++;
        class518.field7668.method1825(-124);
        if (class420.field6136 != null) {
            class420.field6136.method1273(class426.field6248, 38);
        }
        class67.field921.method839(-1);
        class426.field6248.setBackground(Color.black);
        class414.field6036 = -1;
        class310.field4231 = class63.method515(class426.field6248, 26564);
        class518.field7668 = class327.method1894(class426.field6248, (byte) -51, arg0);
        if (class420.field6136 != null) {
            class420.field6136.method1271(-14358, class426.field6248);
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lal;ILmg;)V", line = 137)
    public class115(class66 arg0, int arg1, class101 arg2) {
        this.field1728 = arg2;
        if (this.field1728 == null) {
            this.field1723 = 0;
        } else {
            this.field1723 = this.field1728.method753(16, -106);
        }
    }
}
