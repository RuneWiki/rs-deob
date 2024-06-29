import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class14 {

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "Z")
    public static boolean field255 = false;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "Ljava/util/Calendar;")
    public static Calendar field260 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field263 = 127;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
    public static int field266 = 0;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "Z")
    public static boolean field267 = false;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "Lja;")
    public static class64 field257;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "Lja;")
    public static class64 field265;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "Z")
    public static boolean field264;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)I", line = 16)
    public static final int method118(byte arg0) {
        int var1 = 52 % ((arg0 + 11) / 61);
        field256++;
        return 6;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 30)
    public static final int method119(String arg0, int arg1) {
        field262++;
        for (int var2 = 0; var2 < class39.field705.length; var2++) {
            if (class39.field705[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        if (arg1 != 25540) {
            field265 = (class64) null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILja;)I", line = 51)
    public static final int method120(int arg0, class64 arg1) {
        field259++;
        int var2 = 0;
        if (arg1.method489(class62.field964, arg0 + 799)) {
            var2++;
        }
        if (arg1.method489(class256.field3961, 0)) {
            var2++;
        }
        if (arg1.method489(class278.field4300, 0)) {
            var2++;
        }
        if (arg1.method489(class294.field4621, 0)) {
            var2++;
        }
        if (arg1.method489(class211.field3368, arg0 + 799)) {
            var2++;
        }
        if (arg1.method489(class180.field2882, 0)) {
            var2++;
        }
        if (arg1.method489(class292.field4502, arg0 + 799)) {
            var2++;
        }
        if (arg1.method489(class17.field333, 0)) {
            var2++;
        }
        if (arg1.method489(class326.field5063, 0)) {
            var2++;
        }
        if (arg1.method489(class314.field4914, 0)) {
            var2++;
        }
        if (arg1.method489(class254.field3942, 0)) {
            var2++;
        }
        if (arg1.method489(class256.field3965, 0)) {
            var2++;
        }
        if (arg1.method489(class260.field4034, 0)) {
            var2++;
        }
        if (arg1.method489(class217.field3483, 0)) {
            var2++;
        }
        if (arg0 != -799) {
            field257 = (class64) null;
        }
        if (arg1.method489(class270.field4200, 0)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V", line = 125)
    public static void method121(int arg0) {
        field257 = null;
        field260 = null;
        if (arg0 > 78) {
            field265 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)I", line = 139)
    public static final int method122(int arg0, byte arg1) {
        field258++;
        if (arg1 != -41) {
            field266 = -34;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)V", line = 150)
    public static final void method123(byte arg0) {
        class195.field3099.method1832((byte) -100);
        if (arg0 < 90) {
            field266 = 22;
        }
        class191.field3048.method1832((byte) -112);
        class98.field1623.method1832((byte) -88);
        field253++;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V", line = 163)
    public static final void method124(int arg0) {
        field254++;
        class269.field4191.method246(false, arg0);
        for (class224 var1 = (class224) class268.field4148.method841(0); var1 != null; var1 = (class224) class268.field4148.method842((byte) -40)) {
            if (var1.field3601 == 0) {
                class259.method1840(var1, true, 123);
            }
        }
        class224.field3603++;
        if (class168.field2612 != null) {
            class143.method1091(class168.field2612, (byte) 84);
            class168.field2612 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "([BIII)Z", line = 191)
    public static final boolean method125(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 20876) {
            return true;
        }
        field261++;
        boolean var4 = true;
        class101 var5 = new class101(arg0);
        int var6 = -1;
        label76: while (true) {
            int var7 = var5.method783((byte) 116);
            if (var7 == 0) {
                return var4;
            }
            int var8 = 0;
            boolean var9 = false;
            var6 += var7;
            while (true) {
                int var12;
                class6 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method738(-957401312);
                                        if (var17 == 0) {
                                            continue label76;
                                        }
                                        var5.method741(77);
                                    }
                                    int var10 = var5.method738(-957401312);
                                    if (var10 == 0) {
                                        continue label76;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    var12 = var5.method741(97) >> 2;
                                    int var13 = (var8 & 0xFD8) >> 6;
                                    var14 = var13 + arg2;
                                    var15 = var11 + arg3;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= 103);
                    } while (var15 >= 103);
                    var16 = class28.method190(-108, var6);
                } while (var12 == 22 && !class289.field4406 && var16.field59 == 0 && var16.field86 != 1 && !var16.field60);
                if (!var16.method32(arg1 ^ 0xFFFFAE04)) {
                    var4 = false;
                    class231.field3672++;
                }
                var9 = true;
            }
        }
    }
}
