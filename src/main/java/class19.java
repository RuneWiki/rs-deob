import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class19 extends class4 {

    @OriginalMember(owner = "client!he", name = "M", descriptor = "[B")
    public static byte[] field332 = new byte[32896];

    @OriginalMember(owner = "client!he", name = "O", descriptor = "Ljava/lang/String;")
    public static String field334;

    @OriginalMember(owner = "client!he", name = "P", descriptor = "F")
    public static float field335;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "I")
    public int field317;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "I")
    public int field319;

    @OriginalMember(owner = "client!he", name = "B", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!he", name = "E", descriptor = "I")
    public int field324;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!he", name = "H", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "I")
    public int field330;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!he", name = "G", descriptor = "Ljava/lang/String;")
    public String field326;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "[I")
    public int[] field318;

    @OriginalMember(owner = "client!he", name = "N", descriptor = "[I")
    public int[] field333;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "[Lkd;")
    public class204[] field320;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "[Ljava/lang/String;")
    public String[] field323;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(Z)V")
    public static void method187(boolean arg0) {
        field334 = null;
        field332 = null;
        if (arg0) {
            field334 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public static final void method188(byte arg0) {
        if (arg0 > 108) {
            class29.field466.method481(false);
            field331++;
        }
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(Z)[Lea;")
    public static final class37[] method189(boolean arg0) {
        field329++;
        class37[] var1 = new class37[class278.field4385];
        if (!arg0) {
            field335 = -1.0122448F;
        }
        for (int var2 = 0; var2 < class278.field4385; var2++) {
            int var3 = class236.field3847[var2] * class148.field2385[var2];
            byte[] var4 = class145.field2332[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class194.field3113[class202.method1393(255, var4[var6])];
            }
            var1[var2] = new class37(class27.field432, class155.field2513, class152.field2464[var2], class74.field1202[var2], class148.field2385[var2], class236.field3847[var2], var5);
        }
        class287.method1923(0);
        return var1;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;I)[B")
    public static final byte[] method190(String arg0, int arg1) {
        field325++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        if (arg1 < 115) {
            field332 = null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field332[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field334 = "scroll:";
    }
}
