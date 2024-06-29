import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public abstract class class417 extends class577 {

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZIIZI)V")
    public static final void method2537(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field5716++;
        if (!arg0 && class432.field5849 == arg1 && class436.field5884 == arg4 && class481.field6761 == class368.field5113 || class21.field353.field10086.method1642(-64) == 1) {
            return;
        }
        class481.field6761 = class368.field5113;
        class436.field5884 = arg4;
        class432.field5849 = arg1;
        if (class21.field353.field10086.method1642(-99) == 1) {
            class481.field6761 = 0;
        }
        class225.method1539(arg3, arg2);
        class66.method569(-104, class449.field6148, true, class37.field491, class620.field8673.method3580(class140.field2081, 12), class368.field5111);
        int var5 = class124.field1922;
        int var6 = class88.field999;
        class124.field1922 = (class432.field5849 - (class768.field10571 >> 4)) * 8;
        class88.field999 = (class436.field5884 - (class350.field4898 >> 4)) * 8;
        class58.field728 = class117.method877(class432.field5849 * 8, class436.field5884 * 8);
        class161.field2550 = null;
        int var7 = class124.field1922 - var5;
        int var8 = class88.field999 - var6;
        if (arg2 == 11) {
            for (int var17 = 0; var17 < class36.field483; var17++) {
                class205 var31 = class164.field2601[var17];
                if (var31 != null) {
                    class665 var32 = var31.field3181;
                    for (int var33 = 0; var33 < 10; var33++) {
                        var32.field4670[var33] -= var7;
                        var32.field4672[var33] -= var8;
                    }
                    var32.field5742 -= var7 * 512;
                    var32.field5746 -= var8 * 512;
                }
            }
        } else {
            class235.field3545 = 0;
            boolean var9 = false;
            int var10 = (class768.field10571 - 1) * 512;
            int var11 = (class350.field4898 - 1) * 512;
            for (int var12 = 0; var12 < class36.field483; var12++) {
                class205 var13 = class164.field2601[var12];
                if (var13 != null) {
                    class665 var14 = var13.field3181;
                    var14.field5746 -= var8 * 512;
                    var14.field5742 -= var7 * 512;
                    if (var14.field5742 >= 0 && var14.field5742 <= var10 && var14.field5746 >= 0 && var11 >= var14.field5746) {
                        boolean var15 = true;
                        for (int var16 = 0; var16 < 10; var16++) {
                            var14.field4670[var16] -= var7;
                            var14.field4672[var16] -= var8;
                            if (var14.field4670[var16] < 0 || class768.field10571 <= var14.field4670[var16] || var14.field4672[var16] < 0 || var14.field4672[var16] >= class350.field4898) {
                                var15 = false;
                            }
                        }
                        if (var15) {
                            class216.field3356[class235.field3545++] = var14.field4640;
                        } else {
                            var14.method3783(null, 126);
                            var9 = true;
                            var13.method3387((byte) 110);
                        }
                    } else {
                        var14.method3783(null, -127);
                        var9 = true;
                        var13.method3387((byte) -40);
                    }
                }
            }
            if (var9) {
                class36.field483 = class645.field9014.method2244(arg3);
                class645.field9014.method2251(-102, class164.field2601);
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class702 var29 = class767.field10560[var18];
            if (var29 != null) {
                for (int var30 = 0; var30 < 10; var30++) {
                    var29.field4670[var30] -= var7;
                    var29.field4672[var30] -= var8;
                }
                var29.field5742 -= var7 * 512;
                var29.field5746 -= var8 * 512;
            }
        }
        class589[] var19 = class693.field9665;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class589 var28 = var19[var20];
            if (var28 != null) {
                var28.field8309 -= var8 * 512;
                var28.field8311 -= var7 * 512;
            }
        }
        for (class506 var21 = (class506) class240.field3597.method1731((byte) -120); var21 != null; var21 = (class506) class240.field3597.method1724(0)) {
            var21.field7192 -= var8;
            var21.field7189 -= var7;
            if (class472.field6621 != 4 && (var21.field7189 < 0 || var21.field7192 < 0 || var21.field7189 >= class768.field10571 || var21.field7192 >= class350.field4898)) {
                var21.method3387((byte) -115);
            }
        }
        for (class506 var22 = (class506) class779.field10697.method1731((byte) -125); var22 != null; var22 = (class506) class779.field10697.method1724(0)) {
            var22.field7189 -= var7;
            var22.field7192 -= var8;
            if (class472.field6621 != 4 && (var22.field7189 < 0 || var22.field7192 < 0 || class768.field10571 <= var22.field7189 || var22.field7192 >= class350.field4898)) {
                var22.method3387((byte) 116);
            }
        }
        if (class472.field6621 != 4) {
            for (class102 var23 = (class102) class250.field3692.method2243((byte) 100); var23 != null; var23 = (class102) class250.field3692.method2248(-15690)) {
                int var24 = (int) (var23.field8133 & 0x3FFFL);
                int var25 = var24 - class124.field1922;
                int var26 = (int) (var23.field8133 >> 14 & 0x3FFFL);
                int var27 = var26 - class88.field999;
                if (var25 < 0 || var27 < 0 || class768.field10571 <= var25 || var27 >= class350.field4898) {
                    var23.method3387((byte) 126);
                }
            }
        }
        if (class779.field10695 != 0) {
            class530.field7675 -= var8;
            class779.field10695 -= var7;
        }
        class561.method3313(true);
        if (arg2 != 11) {
            class472.field6622 -= var8 * 512;
            class345.field4813 -= var8;
            class256.field3763 -= var7;
            class614.field8619 -= var7 * 512;
            class263.field3856 -= var8;
            class287.field4226 -= var7;
            if (Math.abs(var7) > class768.field10571 || Math.abs(var8) > class350.field4898) {
                class37.method289((byte) 68);
            }
        } else if (class416.field5704 == 4) {
            class207.field3211 -= var8 * 512;
            class574.field8093 -= var7 * 512;
            class310.field4429 -= var7 * 512;
            class198.field3037 -= var8 * 512;
        } else {
            class416.field5704 = 1;
            class375.field5176 = -1;
            class429.field5830 = -1;
        }
        class678.method3844(0);
        class515.method3108(21704);
        class494.field7055.method1729((byte) 13);
        class115.field1750.method1729((byte) -103);
        class610.field8580.method2169(0);
        class361.method2274(-109);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lso;I)V")
    public abstract void method610(class494 arg0, int arg1);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lhs;Z)V")
    public abstract void method611(class344 arg0, boolean arg1);
}
