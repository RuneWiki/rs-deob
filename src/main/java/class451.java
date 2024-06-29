import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public abstract class class451 extends class578 {

    @OriginalMember(owner = "client!wu", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6619 = new String[] { method3500(method3499("\u0014BO;\r")), method3500(method3499("\u0018\u0019OQX")), method3500(method3499("\u0001\u0019\ry")), method3500(method3499("\u0018\u0019OPX")), method3500(method3499("\u0018\u0019OVX")) };

    @OriginalMember(owner = "client!wu", name = "n", descriptor = "Z")
    public static boolean field6614 = false;

    @OriginalMember(owner = "client!wu", name = "l", descriptor = "I")
    public static int field6613 = 0;

    @OriginalMember(owner = "client!wu", name = "k", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!wu", name = "p", descriptor = "I")
    public int field6616;

    @OriginalMember(owner = "client!wu", name = "m", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "I")
    public int field6618;

    @OriginalMember(owner = "client!wu", name = "o", descriptor = "Lpp;")
    public static class640 field6612;

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "[I")
    public int[] field6611;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "([Ljava/lang/Object;II[JI)V", line = 3)
    public static final void method3495(Object[] arg0, int arg1, int arg2, long[] arg3, int arg4) {
        try {
            if (arg1 > arg4) {
                int var5 = (arg1 + arg4) / 2;
                int var6 = arg4;
                long var7 = arg3[var5];
                arg3[var5] = arg3[arg1];
                arg3[arg1] = var7;
                Object var9 = arg0[var5];
                arg0[var5] = arg0[arg1];
                arg0[arg1] = var9;
                int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
                for (int var11 = arg4; var11 < arg1; var11++) {
                    if (arg3[var11] < ((long) (var11 & var10) + var7)) {
                        long var12 = arg3[var11];
                        arg3[var11] = arg3[var6];
                        arg3[var6] = var12;
                        Object var14 = arg0[var11];
                        arg0[var11] = arg0[var6];
                        arg0[var6++] = var14;
                    }
                }
                arg3[arg1] = arg3[var6];
                arg3[var6] = var7;
                arg0[arg1] = arg0[var6];
                arg0[var6] = var9;
                method3495(arg0, var6 - 1, 80, arg3, arg4);
                method3495(arg0, arg1, 97, arg3, var6 + 1);
            }
            if (arg2 >= 41) {
                field6615++;
            }
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field6619[1] + (arg0 == null ? field6619[2] : field6619[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field6619[2] : field6619[0]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lrfa;IIIII)V", line = 62)
    public static final void method3496(class202 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class293.field4121 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class508.field7455) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class700.field9795 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class621 var14 = class608.field8715[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class107.field1413[var11].method5442(var12, var13, 31844) + class107.field1413[var11].method5442(var12 + 1, var13, 31844) + class107.field1413[var11].method5442(var12, var13 + 1, 31844) + class107.field1413[var11].method5442(var12 + 1, var13 + 1, 31844)) / 4 - (class107.field1413[arg1].method5442(arg2, arg3, 31844) + class107.field1413[arg1].method5442(arg2 + 1, arg3, 31844) + class107.field1413[arg1].method5442(arg2, arg3 + 1, 31844) + class107.field1413[arg1].method5442(arg2 + 1, arg3 + 1, 31844)) / 4;
                                    class571 var16 = var14.field8842;
                                    class571 var17 = var14.field8845;
                                    if (var16 != null && var16.method46(-109)) {
                                        arg0.method40((var13 - arg3) * class768.field10975 + (1 - arg5) * class157.field2000, (byte) 102, var15, var16, var6, (var12 - arg2) * class768.field10975 + (1 - arg4) * class157.field2000, class531.field7699);
                                    }
                                    if (var17 != null && var17.method46(-103)) {
                                        arg0.method40((var13 - arg3) * class768.field10975 + (1 - arg5) * class157.field2000, (byte) 51, var15, var17, var6, (var12 - arg2) * class768.field10975 + (1 - arg4) * class157.field2000, class531.field7699);
                                    }
                                    for (class219 var18 = var14.field8841; var18 != null; var18 = var18.field3190) {
                                        class604 var19 = var18.field3188;
                                        if (var19 != null && var19.method46(-99) && (var19.field8663 == var12 || var7 == var12) && (var19.field8669 == var13 || var9 == var13)) {
                                            int var20 = var19.field8666 + 1 - var19.field8663;
                                            int var21 = var19.field8661 + 1 - var19.field8669;
                                            arg0.method40((var19.field8669 - arg3) * class768.field10975 + (var21 - arg5) * class157.field2000, (byte) 124, var15, var19, var6, (var19.field8663 - arg2) * class768.field10975 + (var20 - arg4) * class157.field2000, class531.field7699);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 151)
    public static final boolean method3497(String arg0, int arg1) {
        try {
            if (arg1 <= 100) {
                field6612 = null;
            }
            field6617++;
            return class336.field4865.containsKey(arg0);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6619[4] + (arg0 == null ? field6619[2] : field6619[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)V", line = 170)
    public static void method3498(byte arg0) {
        try {
            field6612 = null;
            int var1 = 56 / ((arg0 + 34) / 46);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6619[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/awt/Canvas;III)V")
    public abstract void method777(Canvas arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIILjava/awt/Graphics;III)V")
    public abstract void method776(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!wu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3499(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x70);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3500(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 111;
                    break;
                case 1:
                    var10005 = 108;
                    break;
                case 2:
                    var10005 = 97;
                    break;
                case 3:
                    var10005 = 21;
                    break;
                default:
                    var10005 = 112;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
