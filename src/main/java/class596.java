import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class596 {

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "Z")
    public boolean field8576 = false;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8580 = new String[] { method4403(method4402("n\u0006=sP")), method4403(method4402("n\u0006=rP")), method4403(method4402("r\u001a\u007f[")), method4403(method4402("gA=\u0019\u0005")), method4403(method4402("n\u0006=uP")), method4403(method4402("n\u0006=vP")), method4403(method4402("n\u0006=tP")) };

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "Ltn;")
    public static class179 field8577 = new class179();

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "D")
    public static double field8567;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field8569;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public static int field8571;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field8572;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public int field8573;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public int field8575;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field8578;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public static int field8579;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "Lqt;")
    public class269 field8574;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "Z")
    public static boolean field8570;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "[[[Lnaa;")
    public static class621[][][] field8568;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)Z")
    public final boolean method4397(int arg0) {
        try {
            field8572++;
            int var2 = 123 / ((arg0 - 32) / 47);
            return this.field8574.field3806.method530(false, this.field8573);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8580[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILjc;)V")
    public final void method4398(int arg0, class711 arg1) {
        try {
            field8569++;
            while (true) {
                int var3 = arg1.method5128(arg0 ^ 0xFFFFB2F1);
                if (var3 == 0) {
                    if (arg0 == -19727) {
                        return;
                    } else {
                        this.method4399(65, -112, null);
                        return;
                    }
                }
                this.method4399(var3, -15585, arg1);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8580[5] + arg0 + ',' + (arg1 == null ? field8580[2] : field8580[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILjc;)V")
    private final void method4399(int arg0, int arg1, class711 arg2) {
        try {
            field8571++;
            if (arg0 == 1) {
                this.field8573 = arg2.method5116((byte) -128);
            } else if (arg0 == 2) {
                this.field8575 = arg2.method5085(true);
            } else if (arg0 == 3) {
                this.field8576 = true;
            } else if (arg0 == 4) {
                this.field8573 = -1;
            }
            if (arg1 != -15585) {
                method4400(30);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8580[1] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field8580[2] : field8580[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
    public static void method4400(int arg0) {
        try {
            if (arg0 >= -7) {
                method4400(-62);
            }
            field8568 = null;
            field8577 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8580[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZLha;I)Ltb;")
    public final class392 method4401(int arg0, boolean arg1, class18 arg2, int arg3) {
        try {
            field8578++;
            long var5 = (long) (this.field8573 | arg3 << 16 | (arg1 ? 262144 : 0) | arg2.field240 << 19);
            class392 var7 = (class392) this.field8574.field3819.method2053(0, var5);
            if (var7 != null) {
                return var7;
            } else if (this.field8574.field3806.method530(false, this.field8573)) {
                class66 var8 = class66.method704(this.field8574.field3806, this.field8573, 0);
                if (arg0 > -74) {
                    this.method4401(28, false, null, -51);
                }
                if (var8 != null) {
                    var8.field980 = var8.field984 = var8.field978 = var8.field983 = 0;
                    if (arg1) {
                        var8.method691();
                    }
                    for (int var9 = 0; var9 < arg3; var9++) {
                        var8.method696();
                    }
                }
                class392 var10 = arg2.method231(var8, true);
                if (var10 != null) {
                    this.field8574.field3819.method2051(var5, var10, 93);
                }
                return var10;
            } else {
                return null;
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field8580[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field8580[2] : field8580[3]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4402(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x78);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4403(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 28;
                    break;
                case 1:
                    var10005 = 111;
                    break;
                case 2:
                    var10005 = 19;
                    break;
                case 3:
                    var10005 = 55;
                    break;
                default:
                    var10005 = 120;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
