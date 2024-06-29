import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class586 extends class237 {

    @OriginalMember(owner = "client!si", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8502 = new String[] { method4308(method4307("\u000e\u00073*\u001f")), method4308(method4307("\u0013\u001bq\u0000")), method4308(method4307("\u000e\u00073%\u001f")), method4308(method4307("\u0006@3BJ")), method4308(method4307("\u000e\u00073&\u001f")), method4308(method4307("\u000e\u00073$\u001f")), method4308(method4307("\u000e\u00073)\u001f")) };

    @OriginalMember(owner = "client!si", name = "q", descriptor = "Z")
    public static volatile boolean field8497 = false;

    @OriginalMember(owner = "client!si", name = "u", descriptor = "Lhl;")
    public static class556 field8492 = new class556(38, -1);

    @OriginalMember(owner = "client!si", name = "x", descriptor = "D")
    public static double field8500;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    public static int field8493;

    @OriginalMember(owner = "client!si", name = "w", descriptor = "I")
    public static int field8494;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "I")
    public static int field8495;

    @OriginalMember(owner = "client!si", name = "v", descriptor = "I")
    public static int field8496;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    public static int field8498;

    @OriginalMember(owner = "client!si", name = "t", descriptor = "I")
    public static int field8499;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    public static int field8501;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(B)V")
    public static void method4304(byte arg0) {
        try {
            field8492 = null;
            int var1 = 63 % ((arg0 - 52) / 57);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8502[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/awt/Canvas;ILd;II)Lha;")
    public static final class63 method4305(Canvas arg0, int arg1, class158 arg2, int arg3, int arg4) {
        try {
            ++field8495;
            if (arg4 >= -97) {
                method4305((Canvas) null, 127, (class158) null, -112, 93);
            }
            return new class725(arg0, arg2, arg3, arg1);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field8502[2] + (arg0 != null ? field8502[3] : field8502[1]) + ',' + arg1 + ',' + (arg2 != null ? field8502[3] : field8502[1]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIZ)V")
    public final void method460(int arg0, int arg1, int arg2, boolean arg3) {
        try {
            class662.field9437.method208(arg0 + -2, arg1, super.field3648.field1869 + 4, super.field3648.field1862 + 2, ((class716) super.field3648).field10354, 0);
            ++field8496;
            if (arg2 >= -7) {
                this.method458(41, true, -63, 49);
            }
            class662.field9437.method208(arg0 + -1, arg1 + 1, super.field3648.field1869 + 2, super.field3648.field1862, 0, 0);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field8502[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZII)V")
    public final void method458(int arg0, boolean arg1, int arg2, int arg3) {
        try {
            ++field8494;
            int var5 = this.method2048(123) * super.field3648.field1869 / 10000;
            class662.field9437.method242(arg3, arg0 + 2, var5, super.field3648.field1862 + -2, ((class716) super.field3648).field10356, 0);
            class662.field9437.method242(arg3 + var5, arg0 + arg2, -var5 + super.field3648.field1869, super.field3648.field1862 + -2, 0, 0);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field8502[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IBII)V")
    public static final void method4306(int arg0, byte arg1, int arg2, int arg3) {
        try {
            ++field8493;
            int var4 = class397.field6289 + arg0;
            int var5 = class141.field2011 + arg3;
            if (class85.field1280 != null && ~arg0 <= -1 && arg3 >= 0 && class126.field1823 > arg0 && class169.field2725 > arg3) {
                if (class623.field8996.field6356.method4838(true) != 0 || class438.field6846.field9975 == arg2) {
                    long var6 = (long) (var4 | var5 << 14 | arg2 << 28);
                    class430 var8 = (class430) class96.field1407.method737((byte) -39, var6);
                    if (var8 == null) {
                        class336.method2829(arg2, arg0, arg3);
                    } else {
                        class262 var9 = (class262) var8.field6761.method3228(11);
                        if (var9 == null) {
                            class336.method2829(arg2, arg0, arg3);
                        } else {
                            class645 var10 = (class645) class336.method2829(arg2, arg0, arg3);
                            if (var10 != null) {
                                var10.field9239 = var10.field9246 = -1;
                            } else {
                                var10 = new class645(arg0 << 9, class740.field10902[arg2].method2495(arg3, 1, arg0), arg3 << 9, arg2, arg2);
                            }
                            var10.field9240 = var9.field4265;
                            var10.field9255 = var9.field4271;
                            if (arg1 <= 66) {
                                method4306(44, (byte) -7, 126, 45);
                            }
                            label71: while (true) {
                                class262 var11 = (class262) var8.field6761.method3216(true);
                                if (var11 == null) {
                                    break;
                                }
                                if (var10.field9255 != var11.field4271) {
                                    var10.field9249 = var11.field4265;
                                    var10.field9239 = var11.field4271;
                                    while (true) {
                                        class262 var12 = (class262) var8.field6761.method3216(true);
                                        if (var12 == null) {
                                            break label71;
                                        }
                                        if (~var10.field9255 != ~var12.field4271 && ~var10.field9239 != ~var12.field4271) {
                                            var10.field9246 = var12.field4271;
                                            var10.field9242 = var12.field4265;
                                        }
                                    }
                                }
                            }
                            int var13 = class207.method1873((arg0 << 9) + 256, -10, arg2, (arg3 << 9) + 256);
                            var10.field9975 = (byte) arg2;
                            var10.field9972 = var13;
                            var10.field9974 = (byte) arg2;
                            var10.field9254 = 0;
                            var10.field9983 = arg3 << 9;
                            var10.field9985 = arg0 << 9;
                            if (class541.method4028(arg3, arg0, (byte) 113)) {
                                ++var10.field9974;
                            }
                            class543.method4039(arg2, arg0, arg3, var13, var10);
                        }
                    }
                }
            }
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field8502[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lgda;Lgda;Lvha;)V")
    public class586(class58 arg0, class58 arg1, class716 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!si", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4307(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 55);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!si", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4308(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 125;
                    break;
                case 1:
                    var10005 = 110;
                    break;
                case 2:
                    var10005 = 29;
                    break;
                case 3:
                    var10005 = 108;
                    break;
                default:
                    var10005 = 55;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
