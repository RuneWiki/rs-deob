import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public class class433 extends class219 {

    @OriginalMember(owner = "client!mha", name = "z", descriptor = "I")
    public static int field6161 = -1;

    @OriginalMember(owner = "client!mha", name = "B", descriptor = "I")
    public static int field6163 = -2;

    @OriginalMember(owner = "client!mha", name = "L", descriptor = "[I")
    public static int[] field6172 = new int[8];

    @OriginalMember(owner = "client!mha", name = "t", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!mha", name = "u", descriptor = "I")
    public int field6156;

    @OriginalMember(owner = "client!mha", name = "v", descriptor = "I")
    public int field6157;

    @OriginalMember(owner = "client!mha", name = "C", descriptor = "I")
    public int field6164;

    @OriginalMember(owner = "client!mha", name = "G", descriptor = "I")
    public int field6167;

    @OriginalMember(owner = "client!mha", name = "I", descriptor = "I")
    public int field6169;

    @OriginalMember(owner = "client!mha", name = "J", descriptor = "I")
    public static int field6170;

    @OriginalMember(owner = "client!mha", name = "K", descriptor = "I")
    public int field6171;

    @OriginalMember(owner = "client!mha", name = "x", descriptor = "Lks;")
    public class460 field6159;

    @OriginalMember(owner = "client!mha", name = "y", descriptor = "Ljava/lang/String;")
    public String field6160;

    @OriginalMember(owner = "client!mha", name = "D", descriptor = "[I")
    public int[] field6165;

    @OriginalMember(owner = "client!mha", name = "H", descriptor = "[I")
    public int[] field6168;

    @OriginalMember(owner = "client!mha", name = "E", descriptor = "[J")
    public long[] field6166;

    @OriginalMember(owner = "client!mha", name = "w", descriptor = "[Ltga;")
    public class64[] field6158;

    @OriginalMember(owner = "client!mha", name = "A", descriptor = "[Ljava/lang/String;")
    public String[] field6162;

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(B)V")
    public static void method2597(byte arg0) {
        field6172 = null;
        int var1 = 125 % ((37 - arg0) / 37);
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIIII)V")
    public static final void method2598(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class315 var5 = (class315) class686.field9727.method2508((byte) -23); var5 != null; var5 = (class315) class686.field9727.method2505((byte) -55)) {
            class161.method1271(8192, var5, arg3, arg1, arg2, arg4);
        }
        field6170++;
        for (class315 var6 = (class315) class751.field10412.method2508((byte) -28); var6 != null; var6 = (class315) class751.field10412.method2505((byte) -55)) {
            byte var12 = 1;
            class607 var13 = var6.field4685.method2708(120);
            if (var6.field4685.field6383 == -1 || var6.field4685.field6358) {
                var12 = 0;
            } else if (var6.field4685.field6383 == var13.field8544 || var6.field4685.field6383 == var13.field8577 || var6.field4685.field6383 == var13.field8562 || var6.field4685.field6383 == var13.field8546) {
                var12 = 2;
            } else if (var6.field4685.field6383 == var13.field8569 || var6.field4685.field6383 == var13.field8566 || var6.field4685.field6383 == var13.field8550 || var6.field4685.field6383 == var13.field8535) {
                var12 = 3;
            }
            if (var6.field4706 != var12) {
                int var14 = class241.method1640(var6.field4685, 0);
                class279 var15 = var6.field4685.field9071;
                if (var15.field3943 != null) {
                    var15 = var15.method1810((byte) -121, class271.field3796);
                }
                if (var15 == null || var14 == -1) {
                    var6.field4679 = -1;
                    var6.field4706 = var12;
                    var6.field4702 = false;
                } else if (var6.field4679 == var14 && var15.field3879 == var6.field4702) {
                    var6.field4706 = var12;
                    var6.field4692 = var15.field3913;
                } else {
                    boolean var16 = false;
                    if (var6.field4688 == null) {
                        var16 = true;
                    } else {
                        var6.field4692 -= 512;
                        if (var6.field4692 <= 0) {
                            class229.field3307.method3439(var6.field4688);
                            var16 = true;
                            var6.field4688 = null;
                        }
                    }
                    if (var16) {
                        var6.field4692 = var15.field3913;
                        var6.field4702 = var15.field3879;
                        var6.field4706 = var12;
                        var6.field4679 = var14;
                        var6.field4695 = null;
                        var6.field4707 = null;
                    }
                }
            }
            var6.field4704 = var6.field4685.field7718;
            var6.field4694 = var6.field4685.field7718 + (var6.field4685.method2692((byte) -127) << 8);
            var6.field4683 = var6.field4685.field7719;
            var6.field4709 = var6.field4685.field7719 + (var6.field4685.method2692((byte) -124) << 8);
            class161.method1271(arg0 + 2020, var6, arg3, arg1, arg2, arg4);
        }
        if (arg0 != 6172) {
            method2598(27, 8, 42, 38, -11);
        }
        for (class315 var7 = (class315) class649.field9134.method382(0); var7 != null; var7 = (class315) class649.field9134.method391(arg0 - 6135)) {
            byte var8 = 1;
            class607 var9 = var7.field4693.method2708(arg0 ^ 0x1866);
            if (var7.field4693.field6383 == -1 || var7.field4693.field6358) {
                var8 = 0;
            } else if (var7.field4693.field6383 == var9.field8544 || var7.field4693.field6383 == var9.field8577 || var7.field4693.field6383 == var9.field8562 || var7.field4693.field6383 == var9.field8546) {
                var8 = 2;
            } else if (var7.field4693.field6383 == var9.field8569 || var7.field4693.field6383 == var9.field8566 || var7.field4693.field6383 == var9.field8550 || var7.field4693.field6383 == var9.field8535) {
                var8 = 3;
            }
            if (var7.field4706 != var8) {
                int var10 = class541.method3120(var7.field4693, -1);
                if (var7.field4679 == var10 && var7.field4693.field7957 == var7.field4702) {
                    var7.field4706 = var8;
                    var7.field4692 = var7.field4693.field7939;
                } else {
                    boolean var11 = false;
                    if (var7.field4688 == null) {
                        var11 = true;
                    } else {
                        var7.field4692 -= 512;
                        if (var7.field4692 <= 0) {
                            class229.field3307.method3439(var7.field4688);
                            var11 = true;
                            var7.field4688 = null;
                        }
                    }
                    if (var11) {
                        var7.field4695 = null;
                        var7.field4702 = var7.field4693.field7957;
                        var7.field4707 = null;
                        var7.field4706 = var8;
                        var7.field4679 = var10;
                        var7.field4692 = var7.field4693.field7939;
                    }
                }
            }
            var7.field4704 = var7.field4693.field7718;
            var7.field4694 = var7.field4693.field7718 + (var7.field4693.method2692((byte) -125) << 8);
            var7.field4683 = var7.field4693.field7719;
            var7.field4709 = var7.field4693.field7719 + (var7.field4693.method2692((byte) 38) << 8);
            class161.method1271(8192, var7, arg3, arg1, arg2, arg4);
        }
    }
}
