import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class34 {

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "Lwd;")
    private static class150 field949 = class2.method9(true, "Please wait 1 minute and try again)3");

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Lwd;")
    public static class150 field951 = field949;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Lwd;")
    public static class150 field957 = field949;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Lwd;")
    public static class150 field954 = class2.method9(true, ")4l");

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field958 = 50;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "Lkc;")
    public static class72 field955;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([BIII)Z")
    public static final boolean method263(byte[] arg0, int arg1, int arg2, int arg3) {
        field950++;
        boolean var4 = true;
        if (arg2 >= -20) {
            return true;
        }
        class148 var5 = new class148(arg0);
        int var6 = -1;
        label69: while (true) {
            int var7 = var5.method1144(-127);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var11;
                class61 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method1144(-126);
                                        if (var17 == 0) {
                                            continue label69;
                                        }
                                        var5.method1137(255);
                                    }
                                    int var10 = var5.method1144(-126);
                                    if (var10 == 0) {
                                        continue label69;
                                    }
                                    var8 += var10 - 1;
                                    var11 = var5.method1137(255) >> 2;
                                    int var12 = var8 >> 6 & 0x3F;
                                    int var13 = var8 & 0x3F;
                                    var14 = var12 + arg3;
                                    var15 = arg1 + var13;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= 103);
                    } while (var15 >= 103);
                    var16 = class20.method145(var6, (byte) -24);
                } while (var11 == 22 && class20.field517 && var16.field1602 == 0 && !var16.field1576);
                var9 = true;
                if (!var16.method472((byte) 86)) {
                    class144.field3468++;
                    var4 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static void method264(int arg0) {
        int var1 = 65 % ((arg0 + 68) / 51);
        field957 = null;
        field951 = null;
        field954 = null;
        field949 = null;
        field955 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
    public static final void method265(byte arg0) {
        field959++;
        for (int var1 = 0; var1 < class133.field3128; var1++) {
            int var2 = class101.field2309[var1];
            class18 var3 = class37.field1013[var2];
            if (var3 != null) {
                class14.method108(var3, var3.field478.field2725, true);
            }
        }
        if (arg0 <= 9) {
            field958 = 38;
        }
    }
}
