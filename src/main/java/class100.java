import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class100 {

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "Lva;")
    public class503 field1384 = new class503();

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "[I")
    public static int[] field1385;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method671(boolean arg0) {
        field1388++;
        class491.field6905.method3902(0);
        if (arg0) {
            field1385 = null;
        }
        class717.field9986.method3902(0);
        class744.field10235.method3902(0);
        class545.field7565.method3902(0);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 20)
    public static void method672(int arg0) {
        field1385 = null;
        if (arg0 != 0) {
            method671(false);
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V", line = 33)
    public static final void method673(int arg0) {
        field1386++;
        int var1 = class352.field5071.method455(-94);
        int var2 = class352.field5071.method505((byte) -119);
        boolean var3 = class352.field5071.method505((byte) -119) == 1;
        int var4 = class352.field5071.method455(-112);
        class119.field1570 = class352.field5071.method505((byte) -119);
        class545.method3221(107);
        class374.method2349(-10757, var2);
        class352.field5071.method2563((byte) 33);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < (class277.field4036 >> 3); var20++) {
                for (int var21 = 0; var21 < class667.field9202 >> 3; var21++) {
                    int var22 = class352.field5071.method2560(-49, 1);
                    if (var22 == 1) {
                        class96.field1364[var5][var20][var21] = class352.field5071.method2560(-75, 26);
                    } else {
                        class96.field1364[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class352.field5071.method2567(0);
        int var6 = (class357.field5125 - class352.field5071.field956) / 16;
        class258.field3738 = new int[var6][4];
        int var7 = 0;
        if (arg0 <= 31) {
            field1387 = -32;
        }
        while (var7 < var6) {
            for (int var19 = 0; var19 < 4; var19++) {
                class258.field3738[var7][var19] = class352.field5071.method457(-14532);
            }
            var7++;
        }
        class290.field4147 = new int[var6];
        class101.field1394 = new byte[var6][];
        class306.field4308 = new int[var6];
        class436.field6089 = new byte[var6][];
        class510.field7069 = new int[var6];
        class45.field563 = new byte[var6][];
        class113.field1518 = null;
        class239.field3580 = null;
        class316.field4364 = new int[var6];
        field1385 = new int[var6];
        class438.field6117 = new byte[var6][];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class277.field4036 >> 3); var10++) {
                for (int var11 = 0; var11 < (class667.field9202 >> 3); var11++) {
                    int var12 = class96.field1364[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = var12 >> 14 & 0x3FF;
                        int var14 = var12 >> 3 & 0x7FF;
                        int var15 = (var13 / 8 << 8) + (var14 / 8);
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class316.field4364[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class316.field4364[var8] = var15;
                            int var17 = var15 >> 8 & 0xFF;
                            int var18 = var15 & 0xFF;
                            class290.field4147[var8] = class413.field5861.method1598("m" + var17 + "_" + var18, false);
                            class306.field4308[var8] = class413.field5861.method1598("l" + var17 + "_" + var18, false);
                            field1385[var8] = class413.field5861.method1598("um" + var17 + "_" + var18, false);
                            class510.field7069[var8] = class413.field5861.method1598("ul" + var17 + "_" + var18, false);
                            var8++;
                        }
                    }
                }
            }
        }
        class581.method3376(var1, var4, 0, 11, var3);
    }
}
