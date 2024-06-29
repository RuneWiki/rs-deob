import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class278 extends class337 {

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public int field4004 = -1;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public int field4005 = 0;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "Lri;")
    public static class73 field4013 = new class73(28, -1);

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public int field4002;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    public int field4006;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public int field4007;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
    public int field4008;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
    public int field4009;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "I")
    public int field4010;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
    public int field4012;

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "I")
    public int field4014;

    @OriginalMember(owner = "client!oh", name = "B", descriptor = "I")
    public int field4015;

    @OriginalMember(owner = "client!oh", name = "C", descriptor = "I")
    public int field4016;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static void method1816(int arg0) {
        field4013 = null;
        if (arg0 != -23) {
            method1816(86);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II[BIII)Z")
    public static final boolean method1817(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        if (arg4 != -23) {
            field4013 = null;
        }
        field4003++;
        boolean var6 = true;
        class209 var7 = new class209(arg2);
        int var8 = -1;
        label72: while (true) {
            int var9 = var7.method1422((byte) 91);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                int var15;
                class519 var18;
                do {
                    int var16;
                    int var17;
                    do {
                        do {
                            do {
                                do {
                                    while (var11) {
                                        int var19 = var7.method1434(16887);
                                        if (var19 == 0) {
                                            continue label72;
                                        }
                                        var7.method1428(32122);
                                    }
                                    int var12 = var7.method1434(16887);
                                    if (var12 == 0) {
                                        continue label72;
                                    }
                                    var10 += var12 - 1;
                                    int var13 = var10 & 0x3F;
                                    int var14 = var10 >> 6 & 0x3F;
                                    var15 = var7.method1428(32122) >> 2;
                                    var16 = arg1 + var14;
                                    var17 = arg5 + var13;
                                } while (var16 <= 0);
                            } while (var17 <= 0);
                        } while (var16 >= (arg0 - 1));
                    } while ((arg3 - 1) <= var17);
                    var18 = class252.field3743.method2686(var8, (byte) 117);
                } while (var15 == 22 && !class426.field6401.field993 && var18.field7573 == 0 && var18.field7656 != 1 && !var18.field7662);
                var11 = true;
                if (!var18.method3056((byte) -2)) {
                    var6 = false;
                    class37.field395++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)Z")
    public static final boolean method1818(int arg0) {
        field4011++;
        class118 var1 = (class118) class312.field4467.field1879.field4735;
        if (var1 == null || class312.field4467.field1879 == var1) {
            return false;
        } else if (arg0 == 4519) {
            if (var1.field1781 >= 2000) {
                var1.field1781 -= 2000;
            }
            return var1.field1781 == 1007;
        } else {
            return true;
        }
    }
}
