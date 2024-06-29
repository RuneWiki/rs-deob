import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class626 extends class613 {

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
    public int field9225 = (int) (class598.method3538(true) / 1000L);

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "Ljava/lang/String;")
    public String field9218;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "S")
    public short field9223;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "Ljc;")
    public static class374 field9219 = new class374();

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public static int field9224 = -1;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "Lada;")
    public static class144 field9222 = new class144(95, 1);

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public static int field9217;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public static int field9220;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    public static int field9221;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 11)
    public static final String method3659(byte arg0, long arg1) {
        field9221++;
        class591.field8749.setTime(new Date(arg1));
        int var3 = class591.field8749.get(7);
        int var4 = class591.field8749.get(5);
        int var5 = class591.field8749.get(2);
        int var6 = class591.field8749.get(1);
        int var7 = class591.field8749.get(11);
        if (arg0 != 126) {
            method3660((byte) -63);
        }
        int var8 = class591.field8749.get(12);
        int var9 = class591.field8749.get(13);
        return class171.field2667[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class461.field6514[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)V", line = 42)
    public static final void method3660(byte arg0) {
        int var1 = -25 / ((10 - arg0) / 61);
        field9217++;
        if (class397.field5459 == null) {
            return;
        }
        if (class397.field5459.field202 == 1) {
            class397.field5459 = null;
            return;
        }
        if (class397.field5459.field202 == 2) {
            class586.method3484(2, class623.field9178, 0, class99.field1449);
            class397.field5459 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILvp;B)I", line = 71)
    public static final int method3661(int arg0, class162 arg1, byte arg2) {
        field9220++;
        if (arg2 > -107) {
            method3659((byte) 1, -90L);
        }
        if (!client.method1599(arg1).method3654(arg0, true) && arg1.field2405 == null) {
            return -1;
        } else if (arg1.field2412 == null || arg1.field2412.length <= arg0) {
            return -1;
        } else {
            return arg1.field2412[arg0];
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 85)
    public class626(String arg0, int arg1) {
        this.field9218 = arg0;
        this.field9223 = (short) arg1;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V", line = 95)
    public static void method3662(int arg0) {
        if (arg0 != 1) {
            field9222 = null;
        }
        field9222 = null;
        field9219 = null;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)V", line = 106)
    public static final void method3663(boolean arg0) {
        if (arg0) {
            class420.field5697 = class297.field4081;
            class165.field2609 = class114.field1609;
        } else {
            class420.field5697 = class72.field988;
            class165.field2609 = class207.field3077;
        }
        class348.field4772 = class420.field5697.length;
    }
}
