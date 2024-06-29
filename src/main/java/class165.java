import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class165 {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field3385 = 0;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Lgg;")
    public static class63 field3388 = class116.method911(43, "<col=ffb000>");

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field3389 = 4;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "[I")
    public static int[] field3390 = new int[field3389];

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field3387 = 50;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "[[Lnd;")
    public static class121[][] field3394 = new class121[field3389][500];

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field3393 = 0;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "[Lrc;")
    public static class156[] field3386;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIB)V")
    public static final void method1118(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field3395++;
        if (class158.field3270 == arg3 && class140.field3023 == arg0 && (class158.field3274 == arg4 || !class198.field3964)) {
            return;
        }
        class158.field3270 = arg3;
        class140.field3023 = arg0;
        class158.field3274 = arg4;
        if (!class198.field3964) {
            class158.field3274 = 0;
        }
        class121.method931(25, 1);
        class60.method561(true, 63, class11.field267);
        int var6 = class38.field921;
        int var7 = class3.field110;
        class3.field110 = arg3 * 8 - 48;
        class38.field921 = (arg0 - 6) * 8;
        int var8 = class38.field921 - var6;
        int var9 = class38.field921;
        int var10 = class3.field110 - var7;
        int var11 = class3.field110;
        for (int var12 = 0; var12 < 32768; var12++) {
            class6 var28 = class55.field1458[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field1117[var29] -= var10;
                    var28.field1164[var29] -= var8;
                }
                var28.field1141 -= var10 * 128;
                var28.field1144 -= var8 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class62 var26 = class33.field806[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field1117[var27] -= var10;
                    var26.field1164[var27] -= var8;
                }
                var26.field1144 -= var8 * 128;
                var26.field1141 -= var10 * 128;
            }
        }
        class112.field2528 = arg4;
        class3.field72.method473(arg2, false, arg1, -87);
        byte var14 = 0;
        byte var15 = 1;
        byte var16 = 104;
        byte var17 = 0;
        if (var10 < 0) {
            var15 = -1;
            var14 = 103;
            var16 = -1;
        }
        byte var18 = 104;
        byte var19 = 1;
        if (var8 < 0) {
            var17 = 103;
            var18 = -1;
            var19 = -1;
        }
        for (int var20 = var14; var20 != var16; var20 += var15) {
            for (int var22 = var17; var22 != var18; var22 += var19) {
                int var23 = var10 + var20;
                int var24 = var8 + var22;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        class163.field3365[var25][var20][var22] = class163.field3365[var25][var23][var24];
                    } else {
                        class163.field3365[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class123 var21 = (class123) class29.field671.method1033(0); var21 != null; var21 = (class123) class29.field671.method1035(0)) {
            var21.field2709 -= var10;
            var21.field2728 -= var8;
            if (var21.field2709 < 0 || var21.field2728 < 0 || var21.field2709 >= 104 || var21.field2728 >= 104) {
                var21.method1172(-127);
            }
        }
        class161.field3317 = 0;
        class83.field1968 = false;
        if (arg5 < 85) {
            return;
        }
        if (class106.field2418 != 0) {
            class106.field2418 -= var10;
            class118.field2632 -= var8;
        }
        class23.field543 = -1;
        class37.field879.method1031(0);
        class109.field2450.method1031(0);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method1119(int arg0) {
        field3390 = null;
        field3394 = null;
        field3386 = null;
        int var1 = -103 / ((arg0 + 7) / 63);
        field3388 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)I")
    public static final int method1120(int arg0, int arg1) {
        field3392++;
        int var8 = arg0 - 1;
        int var2 = var8 | var8 >>> 1;
        int var3 = 30 / ((arg1 + 86) / 38);
        int var4 = var2 | var2 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return var7 + 1;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1121(Component arg0, int arg1) {
        field3391++;
        arg0.addMouseListener(class192.field3900);
        arg0.addMouseMotionListener(class192.field3900);
        if (arg1 > -65) {
            field3394 = null;
        }
        arg0.addFocusListener(class192.field3900);
    }
}
