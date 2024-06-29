import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class68 {

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
    public int field1060;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "[Lbb;")
    public class148[] field1052;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "[I")
    public int[] field1055;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "[I")
    public static int[] field1056 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
    public static int field1057 = -1;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "Lpg;")
    public static class350 field1053 = new class350(0, 0);

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "Lnm;")
    public static class221 field1051;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(BI)Lsb;", line = 7)
    public static final class131 method476(byte arg0, int arg1) {
        class131 var2 = (class131) class261.field4115.method652((long) arg1, false);
        field1054++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class341.field5490.method1504(class266.method1881(arg1, (byte) 41), true, class117.method759(-1986206841, arg1));
        class131 var4 = new class131();
        var4.field2013 = arg1;
        if (var3 != null) {
            var4.method850(-124, new class313(var3));
        }
        var4.method857(0);
        if (arg0 <= 52) {
            field1057 = -46;
        }
        class261.field4115.method642(var4, (long) arg1, -80);
        return var4;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(BLkl;)I", line = 42)
    public static final int method477(byte arg0, class39 arg1) {
        int var2 = arg1.field582;
        class118 var3 = arg1.method2025((byte) 127);
        int var4 = 122 % ((arg0 + 59) / 44);
        if (arg1.field4750 == var3.field1739) {
            var2 = arg1.field576;
        } else if (arg1.field4750 == var3.field1738 || arg1.field4750 == var3.field1749 || arg1.field4750 == var3.field1713 || arg1.field4750 == var3.field1715) {
            var2 = arg1.field573;
        } else if (arg1.field4750 == var3.field1741 || arg1.field4750 == var3.field1751 || arg1.field4750 == var3.field1727 || arg1.field4750 == var3.field1752) {
            var2 = arg1.field598;
        }
        field1059++;
        return var2;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)V", line = 65)
    public static void method478(boolean arg0) {
        if (!arg0) {
            field1051 = null;
            field1056 = null;
            field1053 = null;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ICLjava/lang/String;)[Ljava/lang/String;", line = 79)
    public static final String[] method479(int arg0, char arg1, String arg2) {
        field1061++;
        int var3 = class30.method260(0, arg2, arg1);
        int var4 = 0;
        int var5 = 0;
        String[] var6 = new String[var3 + 1];
        if (arg0 != 5) {
            return (String[]) null;
        }
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var5; arg1 != arg2.charAt(var8); var8++) {
            }
            var6[var4++] = arg2.substring(var5, var8);
            var5 = var8 + 1;
        }
        var6[var3] = arg2.substring(var5);
        return var6;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(BI)V", line = 124)
    public static final void method480(byte arg0, int arg1) {
        class216 var2 = class275.field4544;
        synchronized (class275.field4544) {
            class3.field24 = arg1;
        }
        field1058++;
        if (arg0 >= -79) {
            method476((byte) 85, -108);
        }
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(I)V", line = 135)
    public class68(int arg0) {
        this.field1060 = arg0;
        this.field1052 = new class148[this.field1060];
        this.field1055 = new int[this.field1060];
    }
}
