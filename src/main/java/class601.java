import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public abstract class class601 {

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "I")
    public static int field8535 = 0;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "I")
    public static int field8528;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
    public static int field8529;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
    public static int field8531;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
    public static int field8532;

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "I")
    public static int field8533;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
    public static int field8534;

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "I")
    public static int field8536;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "Lbga;")
    public static class324 field8530;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IJ)I", line = 7)
    public final int method3356(int arg0, long arg1) {
        if (arg0 != 17933) {
            field8530 = null;
        }
        field8529++;
        long var4 = this.method1002(false);
        if (var4 > 0L) {
            class370.method2025(-1, var4);
        }
        return this.method1001((byte) 39, arg1);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V", line = 26)
    public static final void method3357(int arg0) {
        field8532++;
        class166.field2002.method1670(-127);
        class649.field9287.method1874(4);
        class209.field2546.method1985(-1);
        class195.field2339.method3728(32639);
        class608.field8585.method3270(false);
        class472.field6588.method1905(-11);
        class618.field8696.method132(256);
        class203.field2487.method2048(8798);
        class470.field6566.method1698((byte) -87);
        int var1 = 69 % (arg0 / 45);
        class692.field9748.method1991(1);
        class422.field5623.method3322(4);
        class536.field7655.method2778((byte) 90);
        class147.field1644.method1970(17604);
        class106.field1209.method1482((byte) -101);
        class80.field854.method688(8480);
        class196.field2366.method548(true);
        class246.field3174.method2881(-20147);
        class168.field2010.method1078((byte) -110);
        class498.field7190.method2900(-1);
        class368.field4788.method98((byte) 125);
        class536.method3047(-1);
        class209.method1262(-111);
        class499.method2872(-5750);
        class144.method791((byte) 45);
        class352.field4618.method3684(-17200);
        class549.field7840.method3684(-17200);
        class118.field1354.method3684(-17200);
        class397.field5317.method3684(-17200);
        class364.field4773.method3684(-17200);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I[BI)I", line = 66)
    public static final int method3358(int arg0, byte[] arg1, int arg2) {
        if (arg0 != 1) {
            method3363(119);
        }
        field8533++;
        return class7.method32(0, arg2, arg0 + 3359, arg1);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(III)Z", line = 81)
    public static final boolean method3359(int arg0, int arg1, int arg2) {
        field8531++;
        if (arg0 == 1) {
            return (arg2 & 0x34) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IB)I", line = 93)
    public static final int method3360(int arg0, byte arg1) {
        field8536++;
        if (arg1 != 3) {
            field8535 = -4;
        }
        if (arg0 < 96) {
            return 0;
        } else if (arg0 < 128) {
            return 2;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)V", line = 111)
    public static void method3361(int arg0) {
        if (arg0 >= 85) {
            field8530 = null;
        }
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(III)Z", line = 124)
    public static final boolean method3362(int arg0, int arg1, int arg2) {
        int var3 = class110.field1270[arg0][arg1][arg2];
        if (-class419.field5577 == var3) {
            return false;
        } else if (class419.field5577 == var3) {
            return true;
        } else {
            int var4 = arg1 << class8.field70;
            int var5 = arg2 << class8.field70;
            if (class436.method2407(var4 + 1, class628.field8912[arg0].method253(arg1, arg2), var5 + 1) && class436.method2407(class463.field6445 + var4 - 1, class628.field8912[arg0].method253(arg1 + 1, arg2), var5 + 1) && class436.method2407(class463.field6445 + var4 - 1, class628.field8912[arg0].method253(arg1 + 1, arg2 + 1), class463.field6445 + var5 - 1) && class436.method2407(var4 + 1, class628.field8912[arg0].method253(arg1, arg2 + 1), class463.field6445 + var5 - 1) && class436.method2407(class389.field5194 + var4, class628.field8912[arg0].method253(arg1, arg2), var5 + 1) && class436.method2407(class463.field6445 + var4 - 1, class628.field8912[arg0].method253(arg1 + 1, arg2), class389.field5194 + var5) && class436.method2407(class389.field5194 + var4, class628.field8912[arg0].method253(arg1, arg2 + 1), class463.field6445 + var5 - 1) && class436.method2407(class463.field6445 + var4 - 1, class628.field8912[arg0].method253(arg1, arg2), class389.field5194 + var5) && class436.method2407(class389.field5194 + var4, class628.field8912[arg0].method253(arg1, arg2), class389.field5194 + var5)) {
                class110.field1270[arg0][arg1][arg2] = class419.field5577;
                return true;
            } else {
                class110.field1270[arg0][arg1][arg2] = -class419.field5577;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "(I)V", line = 148)
    public static final void method3363(int arg0) {
        if (arg0 != -3333) {
            return;
        }
        field8528++;
        for (class595 var1 = (class595) class454.field6292.method3174((byte) 49); var1 != null; var1 = (class595) class454.field6292.method3168(false)) {
            if (var1.field8439 > 0) {
                var1.field8439--;
            }
            if (var1.field8439 != 0) {
                if (var1.field8438 > 0) {
                    var1.field8438--;
                }
                if (var1.field8438 == 0 && var1.field8445 >= 1 && var1.field8448 >= 1 && var1.field8445 <= (class399.field5338 - 2) && var1.field8448 <= class349.field4567 - 2 && (var1.field8437 < 0 || class622.method3487(var1.field8450, true, var1.field8437))) {
                    class229.method1334(-1, var1.field8444, var1.field8443, var1.field8437, 0, var1.field8447, var1.field8448, var1.field8445, var1.field8450);
                    var1.field8438 = -1;
                    if (var1.field8441 == var1.field8437 && var1.field8441 == -1) {
                        var1.method1519((byte) 121);
                    } else if (var1.field8441 == var1.field8437 && var1.field8444 == var1.field8436 && var1.field8450 == var1.field8442) {
                        var1.method1519((byte) 121);
                    }
                }
            } else if (var1.field8441 < 0 || class622.method3487(var1.field8442, true, var1.field8441)) {
                class229.method1334(-1, var1.field8436, var1.field8443, var1.field8441, 0, var1.field8447, var1.field8448, var1.field8445, var1.field8442);
                var1.method1519((byte) 121);
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIB)Z", line = 206)
    public static final boolean method3364(int arg0, int arg1, byte arg2) {
        field8534++;
        if (arg2 <= 66) {
            method3360(29, (byte) -52);
        }
        return class207.method1253(arg0, 2048, arg1) & ((arg0 & 0x2000) != 0 | class181.method1059(arg1, arg0, true) | class587.method3294(arg1, arg0, (byte) 117));
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Z)J")
    public abstract long method1002(boolean arg0);

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)J")
    public abstract long method1000(byte arg0);

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(BJ)I")
    public abstract int method1001(byte arg0, long arg1);

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(Z)V")
    public abstract void method999(boolean arg0);
}
