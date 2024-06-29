import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class339 {

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "Z")
    public boolean field4518 = false;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field4514 = 0;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field4515 = 0;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "[I")
    public static int[] field4529 = new int[32];

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "[Llb;")
    public static class208[] field4533 = new class208[14];

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public int field4525;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    public int field4527;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "Lam;")
    public static class286 field4513;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 4)
    public static final String method1971(long arg0, int arg1) {
        field4528++;
        class259.field3516.setTime(new Date(arg0));
        int var3 = class259.field3516.get(7);
        int var4 = class259.field3516.get(5);
        int var5 = class259.field3516.get(2);
        int var6 = class259.field3516.get(1);
        int var7 = class259.field3516.get(11);
        int var8 = class259.field3516.get(arg1);
        int var9 = class259.field3516.get(13);
        return class250.field3398[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class419.field6066[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V", line = 30)
    public static void method1972(byte arg0) {
        field4529 = null;
        field4533 = null;
        field4513 = null;
        if (arg0 > -99) {
            method1974(126, -81, 46);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V", line = 42)
    public static final void method1973(int arg0) {
        class174 var1 = (class174) class299.field4074.method986((byte) -61);
        if (arg0 != 10359) {
            field4533 = null;
        }
        while (var1 != null) {
            var1.method921();
            var1 = (class174) class299.field4074.method984((byte) 83);
        }
        field4531++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)I", line = 61)
    public static final int method1974(int arg0, int arg1, int arg2) {
        int var3 = 17 / ((-arg1 - 15) / 62);
        field4516++;
        return arg0 == 4 || arg0 == 5 ? class74.field816[arg2 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 80)
    public static final int method1975(String arg0, int arg1) {
        field4526++;
        int var2 = arg0.length();
        int var3 = arg1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = ((var3 << 5) + arg0.charAt(var4)) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)Z", line = 100)
    public final boolean method1976(int arg0) {
        field4521++;
        if (arg0 != 23423) {
            field4529 = null;
        }
        return class318.field4234.method1673(-26, this.field4527);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILtq;)V", line = 128)
    public final void method1977(int arg0, int arg1, class250 arg2) {
        field4532++;
        int var4 = 111 % ((50 - arg1) / 38);
        while (true) {
            int var5 = arg2.method1350(31351);
            if (var5 == 0) {
                return;
            }
            this.method1980(var5, arg2, arg0, 1049);
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V", line = 149)
    public static final void method1978(byte arg0) {
        class114 var1 = class83.field912;
        synchronized (class83.field912) {
            class83.field912.method613(true);
        }
        if (arg0 != 74) {
            field4515 = 24;
        }
        field4524++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZLvm;B)Llg;", line = 163)
    public final class20 method1979(int arg0, boolean arg1, class322 arg2, byte arg3) {
        if (arg3 != 106) {
            this.method1977(12, 112, (class250) null);
        }
        field4519++;
        long var5 = (long) (this.field4527 | arg0 << 16 | (arg1 ? 262144 : 0) | arg2.field4307 << 19);
        class20 var7 = (class20) class158.field2047.method616(-27, var5);
        if (var7 != null) {
            return var7;
        } else if (class318.field4234.method1673(arg3 ^ 0xFFFFFFEE, this.field4527)) {
            class241 var8 = class241.method1289(class318.field4234, this.field4527, 0);
            if (var8 != null) {
                var8.field3277 = var8.field3278 = var8.field3279 = var8.field3283 = 0;
                if (arg1) {
                    var8.method1296();
                }
                for (int var9 = 0; var9 < arg0; var9++) {
                    var8.method1290();
                }
            }
            class20 var10 = arg2.method1633(var8, true);
            if (var10 != null) {
                class158.field2047.method615((byte) -108, var5, var10);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILtq;II)V", line = 213)
    private final void method1980(int arg0, class250 arg1, int arg2, int arg3) {
        if (arg0 == 1) {
            this.field4527 = arg1.method1374(arg3 - 1051);
        } else if (arg0 == 2) {
            this.field4525 = arg1.method1372(-2);
        } else if (arg0 == 3) {
            this.field4518 = true;
        } else if (arg0 == 4) {
            this.field4527 = -1;
        }
        if (arg3 != 1049) {
            field4520 = -14;
        }
        field4523++;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V", line = 251)
    public static final void method1981(int arg0) {
        if (arg0 != 14) {
            field4513 = null;
        }
        field4530++;
        for (class424 var1 = (class424) class131.field1687.method814((byte) 90); var1 != null; var1 = (class424) class131.field1687.method827(arg0 - 50)) {
            class235 var2 = var1.field6219;
            if (class263.field3592 != var2.field161 || var2.field3229) {
                var1.method1967(-1);
                var2.method1277(-6694);
            } else if (var2.field3243 <= class234.field3224) {
                var2.method1271((byte) 35, class259.field3526);
                if (var2.field3229) {
                    var1.method1967(arg0 ^ 0xFFFFFFF1);
                } else {
                    class111.method590(var2, true);
                }
            }
        }
    }
}
