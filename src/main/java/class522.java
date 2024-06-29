import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class522 extends class112 {

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "Los;")
    private class468 field7738;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    private int field7732;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "I")
    private int field7741;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    private int field7737;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "I")
    private int field7742;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    private int field7736;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "I")
    private int field7743;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "[F")
    public static float[] field7734 = new float[16];

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "[B")
    public static byte[] field7740 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "Lnj;")
    public static class487 field7731 = new class487("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
    public static int field7733;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public static int field7735;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public static int field7739;

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "I")
    public static int field7744;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "Lbo;")
    private class227 field7730;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)Lbo;")
    public final class227 method665(byte arg0) {
        int var2 = -14 / ((arg0 + 63) / 60);
        field7733++;
        if (this.field7730 == null) {
            class361.field5220[3] = this.field7743;
            class361.field5220[0] = this.field7737;
            class361.field5220[1] = this.field7742;
            class361.field5220[4] = this.field7732;
            class361.field5220[2] = this.field7741;
            class361.field5220[5] = this.field7736;
            class472 var3 = this.field7738.field2262;
            boolean var4 = false;
            int var5 = 0;
            for (int var6 = 0; var6 < 6; var6++) {
                if (!var3.method1758((byte) 120, class361.field5220[var6])) {
                    return null;
                }
                class83 var8 = var3.method1762(class361.field5220[var6], (byte) 45);
                int var9 = var8.field964 ? 64 : 128;
                if (var5 < var9) {
                    var5 = var9;
                }
                if (var8.field959 > 0) {
                    var4 = true;
                }
            }
            for (int var7 = 0; var7 < 6; var7++) {
                class419.field6013[var7] = var3.method1759(var5, var5, 1.0F, (byte) 119, class361.field5220[var7], false);
            }
            this.field7730 = new class227(this.field7738, 6407, var5, var4, class419.field6013);
        }
        return this.field7730;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZ)V")
    public static final void method3089(int arg0, boolean arg1) {
        field7739++;
        if (arg0 != 6) {
            method3089(45, true);
        }
        while (class271.field4010.method2934(class425.field6072, (byte) 40) >= 15) {
            int var2 = class271.field4010.method2937(-19811, 15);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            class234 var4 = (class234) class627.field9185.method1333((long) var2, false);
            if (var4 == null) {
                class383 var5 = new class383();
                var5.field1053 = var2;
                var4 = new class234(var5);
                class627.field9185.method1341(var4, (byte) 110, (long) var2);
                var3 = true;
                class579.field8530[class350.field5086++] = var4;
            }
            class383 var6 = var4.field3443;
            class25.field230[class567.field8409++] = var2;
            var6.field1022 = class576.field8505;
            if (var6.field5601 != null && var6.field5601.method2631((byte) -78)) {
                class292.method1807(arg0 + 9101, var6);
            }
            int var7;
            if (arg1) {
                var7 = class271.field4010.method2937(-19811, 8);
                if (var7 > 127) {
                    var7 -= 256;
                }
            } else {
                var7 = class271.field4010.method2937(-19811, 5);
                if (var7 > 15) {
                    var7 -= 32;
                }
            }
            var6.method2322(class369.field5329.method1783(-1, class271.field4010.method2937(-19811, 14)), arg0 ^ 0xFFFF8364);
            int var8;
            if (arg1) {
                var8 = class271.field4010.method2937(-19811, 8);
                if (var8 > 127) {
                    var8 -= 256;
                }
            } else {
                var8 = class271.field4010.method2937(-19811, 5);
                if (var8 > 15) {
                    var8 -= 32;
                }
            }
            int var9 = class271.field4010.method2937(-19811, 1);
            if (var9 == 1) {
                class18.field157[class644.field9342++] = var2;
            }
            int var10 = class271.field4010.method2937(-19811, 3) + 4 << 11 & 0x3F22;
            int var11 = class271.field4010.method2937(-19811, 2);
            int var12 = class271.field4010.method2937(-19811, 1);
            var6.method508(arg0 + 20054, var6.field5601.field6234);
            var6.field1059 = var6.field5601.field6263 << 3;
            if (var3) {
                var6.method502(var10, true, false);
            }
            var6.method2321(var11, class239.field3493.field1089[0] + var8, class239.field3493.field1090[0] + var7, var6.method514(0), 0, var12 == 1);
            if (var6.field5601.method2631((byte) -78)) {
                class118.method727(var6.field1089[0], null, (byte) 67, 0, null, var6.field3457, var6.field1090[0], var6);
            }
        }
        class271.field4010.method2930(20056);
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Los;IIIIII)V")
    public class522(class468 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field7738 = arg0;
        this.field7732 = arg5;
        this.field7741 = arg3;
        this.field7737 = arg1;
        this.field7742 = arg2;
        this.field7736 = arg6;
        this.field7743 = arg4;
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(B)V")
    public static void method3090(byte arg0) {
        field7740 = null;
        field7734 = null;
        if (arg0 != 2) {
            method3090((byte) 115);
        }
        field7731 = null;
    }
}
