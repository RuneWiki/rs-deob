import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class224 {

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "[Ltn;")
    public class434[] field3162 = new class434[100];

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "[I")
    public int[] field3160 = new int[3];

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "[Lsa;")
    public class447[] field3166 = new class447[8];

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "[I")
    public int[] field3165 = new int[100];

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "Lrb;")
    public static class283 field3168 = new class283(107, 8);

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "Lrb;")
    public static class283 field3169 = new class283(103, 7);

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "[C")
    public static char[] field3172 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "[F")
    public static float[] field3173 = new float[4];

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public int field3164;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "Ll;")
    public static class127 field3171;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "Ljava/lang/Object;")
    public Object field3159;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lmb;IIIII)V", line = 7)
    public static final void method1390(class224 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field3164 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class118.field1853[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class433 var13 = class231.field3229[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field3164; var14++) {
                            if (arg0.field3166[var14] == var13.field6257) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field3166[arg0.field3164++] = var13.field6257;
                        if (arg0.field3164 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field3164; var15 < 4; var15++) {
            arg0.field3166[var15] = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 74)
    public static final void method1391(int arg0) {
        class508.field7414.method191((byte) 36);
        field3167++;
        int var1 = class508.field7414.method194(8, arg0 - 15889);
        if (class273.field3692 > var1) {
            for (int var2 = var1; var2 < class273.field3692; var2++) {
                class251.field3435[class334.field4873++] = class159.field2416[var2];
            }
        }
        if (var1 > class273.field3692) {
            throw new RuntimeException("gnpov1");
        } else if (arg0 == 3) {
            class273.field3692 = 0;
            for (int var3 = 0; var3 < var1; var3++) {
                int var4 = class159.field2416[var3];
                class209 var5 = ((class326) class281.field3826.method1592((byte) -25, (long) var4)).field4455;
                int var6 = class508.field7414.method194(1, arg0 - 15889);
                if (var6 == 0) {
                    class159.field2416[class273.field3692++] = var4;
                    var5.field208 = class28.field417;
                } else {
                    int var7 = class508.field7414.method194(2, -15886);
                    if (var7 == 0) {
                        class159.field2416[class273.field3692++] = var4;
                        var5.field208 = class28.field417;
                        class311.field4227[class496.field7242++] = var4;
                    } else if (var7 == 1) {
                        class159.field2416[class273.field3692++] = var4;
                        var5.field208 = class28.field417;
                        int var8 = class508.field7414.method194(3, arg0 ^ 0xFFFFC1F1);
                        var5.method1333(var8, -1, 1);
                        int var9 = class508.field7414.method194(1, -15886);
                        if (var9 == 1) {
                            class311.field4227[class496.field7242++] = var4;
                        }
                    } else if (var7 == 2) {
                        class159.field2416[class273.field3692++] = var4;
                        var5.field208 = class28.field417;
                        if (class508.field7414.method194(1, -15886) == 1) {
                            int var10 = class508.field7414.method194(3, -15886);
                            var5.method1333(var10, -1, 2);
                            int var11 = class508.field7414.method194(3, -15886);
                            var5.method1333(var11, -1, 2);
                        } else {
                            int var12 = class508.field7414.method194(3, -15886);
                            var5.method1333(var12, -1, 0);
                        }
                        int var13 = class508.field7414.method194(1, -15886);
                        if (var13 == 1) {
                            class311.field4227[class496.field7242++] = var4;
                        }
                    } else if (var7 == 3) {
                        class251.field3435[class334.field4873++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V", line = 198)
    public static void method1392(boolean arg0) {
        if (arg0) {
            field3168 = null;
        }
        field3173 = null;
        field3172 = null;
        field3169 = null;
        field3168 = null;
        field3171 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLdk;)V", line = 214)
    public static final void method1393(byte arg0, class421 arg1) {
        class161.field2436 = arg1;
        if (arg0 >= 8) {
            field3161++;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V", line = 234)
    public static final void method1394(byte arg0) {
        field3158++;
        class116.field1840 = null;
        class259.method1539(class66.field953, class348.field5033, -77, class236.field3268, 0, -1, 0, 0, 0);
        if (arg0 > -9) {
            method1392(true);
        }
        if (class116.field1840 != null) {
            class412.method2423(-1412584499, class312.field4239, class331.field4509, class250.field3411.field6397, class116.field1840, false, 0, class66.field953, 0, class348.field5033);
            class116.field1840 = null;
        }
    }
}
