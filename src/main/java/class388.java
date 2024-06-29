import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class388 {

    @OriginalMember(owner = "client!it", name = "b", descriptor = "Z")
    private boolean field5080 = false;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "I")
    public int field5084 = 0;

    @OriginalMember(owner = "client!it", name = "m", descriptor = "I")
    public int field5091 = 0;

    @OriginalMember(owner = "client!it", name = "t", descriptor = "I")
    public static int field5098 = 1;

    @OriginalMember(owner = "client!it", name = "q", descriptor = "Loi;")
    public static class169 field5095 = new class169("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!it", name = "w", descriptor = "Lhb;")
    public static class250 field5101 = new class250(76, -1);

    @OriginalMember(owner = "client!it", name = "B", descriptor = "Z")
    public static boolean field5106 = false;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "I")
    public int field5079;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "I")
    private int field5081;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "I")
    public int field5082;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!it", name = "g", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!it", name = "h", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!it", name = "i", descriptor = "I")
    public int field5087;

    @OriginalMember(owner = "client!it", name = "j", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!it", name = "k", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!it", name = "l", descriptor = "I")
    public int field5090;

    @OriginalMember(owner = "client!it", name = "n", descriptor = "I")
    public int field5092;

    @OriginalMember(owner = "client!it", name = "o", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!it", name = "p", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!it", name = "r", descriptor = "I")
    public int field5096;

    @OriginalMember(owner = "client!it", name = "s", descriptor = "I")
    public int field5097;

    @OriginalMember(owner = "client!it", name = "u", descriptor = "I")
    public int field5099;

    @OriginalMember(owner = "client!it", name = "v", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!it", name = "y", descriptor = "I")
    public int field5103;

    @OriginalMember(owner = "client!it", name = "z", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!it", name = "x", descriptor = "J")
    public long field5102;

    @OriginalMember(owner = "client!it", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field5105;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(B)V")
    public final void method2309(byte arg0) {
        field5094++;
        this.field5099 = class21.field397[this.field5081 << 3];
        this.field5082 = (int) Math.sqrt((double) (this.field5079 * this.field5079 + (this.field5087 * this.field5087 + (this.field5097 * this.field5097))));
        if (this.field5092 == 0) {
            this.field5092 = 1;
        }
        if (this.field5096 == 0) {
            this.field5102 = 2147483647L;
        } else if (this.field5096 == 1) {
            this.field5102 = (this.field5082 * 8 / this.field5092);
            this.field5102 *= this.field5102;
        } else if (this.field5096 == 2) {
            this.field5102 = (this.field5082 * 8 / this.field5092);
        }
        if (this.field5080) {
            this.field5082 *= -1;
        }
        if (arg0 != -106) {
            method2312(null, true, null);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method2310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field5104++;
        if (arg6 > -32) {
            field5106 = true;
        }
        class208[] var7 = class509.field7472;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class208 var9 = var7[var8];
            if (var9 != null && var9.field2697 == 2) {
                class476.method2859(var9.field2704, var9.field2696, var9.field2699, 0, arg3, arg2 >> 1, arg4 >> 1, arg5, var9.field2692 * 2);
                if (class267.field3388[0] > -1 && (class264.field3353 % 20) < 10) {
                    class269.field3407[var9.field2703].method2406(arg1 + class267.field3388[0] - 12, class267.field3388[1] - 28 + arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(BLbt;)V")
    public final void method2311(byte arg0, class88 arg1) {
        if (arg0 > -123) {
            this.field5096 = 81;
        }
        field5093++;
        while (true) {
            int var3 = arg1.method617(2);
            if (var3 == 0) {
                return;
            }
            this.method2316(117, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Lnp;ZLnp;)V")
    public static final void method2312(class85 arg0, boolean arg1, class85 arg2) {
        field5083++;
        if (arg0.field1146 != null) {
            arg0.method540((byte) 113);
        }
        arg0.field1146 = arg2;
        arg0.field1151 = arg2.field1151;
        arg0.field1146.field1151 = arg0;
        arg0.field1151.field1146 = arg0;
        if (!arg1) {
            field5095 = null;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(BF)F")
    public static final float method2313(byte arg0, float arg1) {
        if (arg0 < 50) {
            return -1.9532396F;
        } else {
            field5085++;
            return arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ILsj;)I")
    public static final int method2314(int arg0, class502 arg1) {
        field5089++;
        String var2 = class440.method2599(arg1, (byte) 118);
        int[] var3 = null;
        if (class5.method27(arg1.field7390, (byte) 120)) {
            var3 = class89.field1238.method111((int) arg1.field7388, arg0 ^ 0x512).field7288;
        } else if (arg1.field7384 != -1) {
            var3 = class89.field1238.method111(arg1.field7384, -103).field7288;
        } else if (class138.method962(arg1.field7390, 121)) {
            class295 var6 = class527.field7791[(int) arg1.field7388];
            if (var6 != null) {
                class10 var7 = var6.field3831;
                if (var7.field111 != null) {
                    var7 = var7.method63(false, class198.field2555);
                }
                if (var7 != null) {
                    var3 = var7.field126;
                }
            }
        } else if (class215.method1369(arg1.field7390, 127)) {
            Object var4 = null;
            class402 var5;
            if (arg1.field7390 == 1004) {
                var5 = class52.field715.method1164((int) arg1.field7388, 0);
            } else {
                var5 = class52.field715.method1164((int) (arg1.field7388 >>> 32 & 0x7FFFFFFFL), 0);
            }
            if (var5.field5419 != null) {
                var5 = var5.method2393(class198.field2555, (byte) 32);
            }
            if (var5 != null) {
                var3 = var5.field5375;
            }
        }
        if (arg0 != -1405) {
            return 27;
        }
        if (var3 != null) {
            var2 = var2 + class158.method1065((byte) -67, var3);
        }
        int var8 = class157.field2070.method1709((byte) 63, class270.field3427, var2);
        if (arg1.field7387) {
            var8 += class52.field716.method375() + 4;
        }
        return var8;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ILjava/awt/Frame;Lhs;)V")
    public static final void method2315(int arg0, Frame arg1, class441 arg2) {
        if (arg0 != 0) {
            method2315(123, null, null);
        }
        field5086++;
        while (true) {
            class277 var3 = arg2.method2616(68, arg1);
            while (var3.field3542 == 0) {
                class463.method2773(10L, -121);
            }
            if (var3.field3542 == 1) {
                arg1.setVisible(false);
                arg1.dispose();
                return;
            }
            class463.method2773(100L, arg0 - 7);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IILbt;)V")
    private final void method2316(int arg0, int arg1, class88 arg2) {
        if (arg1 == 1) {
            this.field5081 = arg2.method568((byte) 110);
        } else if (arg1 == 2) {
            arg2.method617(2);
        } else if (arg1 == 3) {
            this.field5087 = arg2.method578(96);
            this.field5097 = arg2.method578(123);
            this.field5079 = arg2.method578(121);
        } else if (arg1 == 4) {
            this.field5096 = arg2.method617(2);
            this.field5092 = arg2.method578(95);
        } else if (arg1 == 6) {
            this.field5090 = arg2.method617(2);
        } else if (arg1 == 8) {
            this.field5084 = 1;
        } else if (arg1 == 9) {
            this.field5091 = 1;
        } else if (arg1 == 10) {
            this.field5080 = true;
        }
        int var4 = 57 % ((arg0 - 18) / 54);
        field5100++;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V")
    public static void method2317(int arg0) {
        field5101 = null;
        field5095 = null;
        if (arg0 > -23) {
            field5106 = true;
        }
        field5105 = null;
    }
}
