import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class14 {

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Luf;")
    public static class168 field143 = class148.method1019(-1720, "_labels");

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "Ljk;")
    public static class76 field146 = new class76();

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field140;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lj;I)V", line = 13)
    public static final void method51(class153 arg0, int arg1) {
        field139++;
        if (class38.field477 != null) {
            try {
                class38.field477.method358(0L, -94);
                class38.field477.method353(arg0.field2359, arg0.field2367, 24, -1);
            } catch (Exception var3) {
            }
        }
        arg0.field2367 += 24;
        if (arg1 != 16966) {
            field146 = (class76) null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BJ)V", line = 33)
    public static final void method52(byte arg0, long arg1) {
        field141++;
        if (arg1 == 0L) {
            return;
        }
        if (class149.field2302 >= 100) {
            class266.method1850(0, class95.field1528, class182.field2934, -100);
            return;
        }
        class168 var3 = class69.method388(arg1, (byte) 104).method1216(-32471);
        for (int var4 = 0; var4 < class149.field2302; var4++) {
            if (class201.field3311[var4] == arg1) {
                class266.method1850(0, class134.method938((byte) -125, new class168[] { var3, class61.field805 }), class182.field2934, -113);
                return;
            }
        }
        if (arg0 != -16) {
            field145 = -75;
        }
        for (int var5 = 0; var5 < class107.field1642; var5++) {
            if (class61.field793[var5] == arg1) {
                class266.method1850(0, class134.method938((byte) -124, new class168[] { class288.field4855, var3, class20.field245 }), class182.field2934, -57);
                return;
            }
        }
        if (var3.method1170(class266.field4489.field658, (byte) -110)) {
            class266.method1850(0, class211.field3470, class182.field2934, 83);
            return;
        }
        class201.field3311[class149.field2302] = arg1;
        class87.field1341[class149.field2302++] = class69.method388(arg1, (byte) 104);
        class51.field616++;
        class285.field4828 = class9.field116;
        class249.field4262.method726(184, arg0 + 2138389395);
        class249.field4262.method1053(arg1, 11247);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V", line = 100)
    public static void method53(byte arg0) {
        field146 = null;
        field143 = null;
        if (arg0 <= 0) {
            field145 = -38;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "([BLj;B)V", line = 112)
    public final void method54(byte[] arg0, class153 arg1, byte arg2) {
        field147++;
        if (arg1.field2359[arg1.field2367] != 31 || arg1.field2359[arg1.field2367 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field140 == null) {
            this.field140 = new Inflater(true);
        }
        try {
            int var4 = 59 % ((arg2 + 59) / 55);
            this.field140.setInput(arg1.field2359, arg1.field2367 + 10, arg1.field2359.length - 8 - (arg1.field2367 + 10));
            this.field140.inflate(arg0);
        } catch (Exception var6) {
            this.field140.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field140.reset();
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V", line = 141)
    public class14() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZII)Lla;", line = 154)
    public static final class175 method55(boolean arg0, int arg1, int arg2) {
        field148++;
        if (!arg0) {
            field142 = 20;
        }
        for (class175 var3 = (class175) class140.field2163.method442(65293); var3 != null; var3 = (class175) class140.field2163.method440(3)) {
            if (var3.field2850 && var3.method1267(arg2, arg1, true)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 181)
    public static final void method56(int arg0) {
        field144++;
        int var1 = class39.field482.length;
        if (arg0 != 63) {
            field146 = (class76) null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class39.field482[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class169.field2775; var4++) {
                    if (class36.field421[var4] == class303.field5104[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                int var5 = 0;
                if (var3 == -1) {
                    class36.field421[class169.field2775] = class303.field5104[var2];
                    var3 = class169.field2775++;
                }
                class153 var6 = new class153(class39.field482[var2]);
                while (var6.field2367 < class39.field482[var2].length && var5 < 511) {
                    int var7 = var3 | var5++ << 6;
                    int var8 = var6.method1069(arg0 - 34);
                    int var9 = var8 >> 14;
                    int var10 = var8 & 0x3F;
                    int var11 = var8 >> 7 & 0x3F;
                    int var12 = (class303.field5104[var2] & 0xFF) * 64 + var10 - class276.field4641;
                    int var13 = (class303.field5104[var2] >> 8) * 64 + var11 - class182.field2916;
                    class196 var14 = class19.method87((byte) 97, var6.method1069(55));
                    if (class190.field3065[var7] == null && (var14.field3233 & 0x1) > 0 && class199.field3288 == var9 && var13 >= 0 && var14.field3211 + var13 < 104 && var12 >= 0 && var14.field3211 + var12 < 104) {
                        class190.field3065[var7] = new class22();
                        class22 var15 = class190.field3065[var7];
                        class116.field1814[class2.field15++] = var7;
                        var15.field3011 = class203.field3335;
                        var15.field267 = var14;
                        var15.field3024 = var15.field267.field3222;
                        var15.field3052 = var15.field267.field3198;
                        var15.field3056 = var15.field267.field3248;
                        var15.field2996 = var15.field267.field3218;
                        var15.field3049 = var15.field267.field3173;
                        var15.field3046 = var15.field267.field3250;
                        var15.field3038 = var15.field267.field3200;
                        if (var15.field3052 == 0) {
                            var15.field3008 = 0;
                        }
                        var15.field3012 = var15.field267.field3211;
                        var15.field3002 = var15.field267.field3230;
                        var15.method1334(true, var13, (byte) 9, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(III)V", line = 276)
    private class14(int arg0, int arg1, int arg2) {
    }
}
