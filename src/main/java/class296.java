import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class296 extends class43 {

    @OriginalMember(owner = "client!bq", name = "p", descriptor = "Ljava/lang/String;")
    public String field3946;

    @OriginalMember(owner = "client!bq", name = "o", descriptor = "[[I")
    public static int[][] field3945 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!bq", name = "w", descriptor = "[C")
    public static char[] field3953 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!bq", name = "l", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!bq", name = "r", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!bq", name = "t", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!bq", name = "v", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!bq", name = "m", descriptor = "Lvm;")
    public static class275 field3943;

    @OriginalMember(owner = "client!bq", name = "q", descriptor = "Lwo;")
    public static class285 field3947;

    @OriginalMember(owner = "client!bq", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3944;

    @OriginalMember(owner = "client!bq", name = "s", descriptor = "[I")
    public static int[] field3949;

    @OriginalMember(owner = "client!bq", name = "u", descriptor = "[I")
    public static int[] field3951;

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(Z)V", line = 4)
    public static final void method1880(boolean arg0) {
        field3952++;
        if (!arg0) {
            method1880(false);
        }
        int var1 = class450.method2786(-112);
        if (var1 == 0) {
            class183.field2126 = null;
            class133.method864(0, -118);
        } else if (var1 == 1) {
            class244.method1605((byte) 0, 0);
            class133.method864(512, -125);
            if (class222.field2770 != null) {
                class17.method100(0);
            }
        } else {
            class244.method1605((byte) (class302.field4057 - 4 & 0xFF), 0);
            class133.method864(2, -126);
        }
        class278.field3602 = class43.field513;
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(B)V", line = 39)
    public static void method1881(byte arg0) {
        field3949 = null;
        field3953 = null;
        field3951 = null;
        field3944 = null;
        field3943 = null;
        field3947 = null;
        field3945 = null;
        int var1 = 39 % ((arg0 + 70) / 56);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(BIZ)V", line = 57)
    public static final void method1882(byte arg0, int arg1, boolean arg2) {
        class80.field972 = new byte[arg1][class22.field232 + 1][class196.field2329 + 1];
        class281.field3671 = new int[class196.field2329];
        class419.field5719 = new byte[arg1][class22.field232][class196.field2329];
        class136.field1546 = new byte[arg1][class22.field232][class196.field2329];
        class102.field1186 = new byte[arg1][class22.field232][class196.field2329];
        class421.field5777 = 99;
        if (!arg2) {
            class284.field3710 = null;
        }
        field3950++;
        class307.field4176 = new int[class196.field2329];
        class420.field5730 = new int[class196.field2329];
        class168.field1959 = new byte[arg1][class22.field232][class196.field2329];
        class225.field2838 = new int[class196.field2329];
        class226.field2868 = new int[arg1][class22.field232 + 1][class196.field2329 + 1];
        class202.field2379 = new int[5];
        class23.field250 = new int[class196.field2329];
        if (arg0 > -34) {
            field3944 = null;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I[BII)Ljava/lang/String;", line = 86)
    public static final String method1883(int arg0, byte[] arg1, int arg2, int arg3) {
        int var4 = 53 / ((arg0 + 69) / 56);
        field3942++;
        char[] var5 = new char[arg2];
        int var6 = 0;
        for (int var7 = 0; var7 < arg2; var7++) {
            int var8 = arg1[arg3 + var7] & 0xFF;
            if (var8 != 0) {
                if (var8 >= 128 && var8 < 160) {
                    char var9 = field3953[var8 - 128];
                    if (var9 == '\u0000') {
                        var9 = '?';
                    }
                    var8 = var9;
                }
                var5[var6++] = (char) var8;
            }
        }
        return new String(var5, 0, var6);
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "()V", line = 135)
    public class296() {
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(Z)I", line = 138)
    public static final int method1884(boolean arg0) {
        field3941++;
        return arg0 ? 2 : 28;
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 152)
    public class296(String arg0, int arg1) {
        this.field3946 = arg0;
    }
}
