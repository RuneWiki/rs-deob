import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class249 implements Runnable {

    @OriginalMember(owner = "client!im", name = "h", descriptor = "[Lad;")
    public volatile class179[] field3713 = new class179[2];

    @OriginalMember(owner = "client!im", name = "l", descriptor = "Z")
    public volatile boolean field3717 = false;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "Z")
    public volatile boolean field3716 = false;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "[Ldh;")
    public static class134[] field3709 = new class134[14];

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!im", name = "j", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "Lgl;")
    public class262 field3710;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "[I")
    public static int[] field3714;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field3708;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "()V", line = 5)
    public static final void method1679() {
        if (class241.field3585 != null) {
            for (int var0 = 0; var0 < class241.field3585.length; var0++) {
                for (int var1 = 0; var1 < class311.field4734; var1++) {
                    for (int var2 = 0; var2 < class191.field2844; var2++) {
                        class241.field3585[var0][var1][var2] = null;
                    }
                }
            }
        }
        class209.field3152 = (class86[][]) null;
        if (class38.field460 != null) {
            for (int var3 = 0; var3 < class38.field460.length; var3++) {
                for (int var4 = 0; var4 < class311.field4734; var4++) {
                    for (int var5 = 0; var5 < class191.field2844; var5++) {
                        class38.field460[var3][var4][var5] = null;
                    }
                }
            }
        }
        class81.field1139 = (class86[][]) null;
        class302.field4616 = 0;
        if (class154.field2314 != null) {
            for (int var6 = 0; var6 < class302.field4616; var6++) {
                class154.field2314[var6] = null;
            }
        }
        if (class247.field3686 != null) {
            for (int var7 = 0; var7 < class130.field2016; var7++) {
                class247.field3686[var7] = null;
            }
            class130.field2016 = 0;
        }
        if (class161.field2411 != null) {
            for (int var8 = 0; var8 < class161.field2411.length; var8++) {
                class161.field2411[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILlm;IB)Z", line = 112)
    public static final boolean method1680(int arg0, class210 arg1, int arg2, byte arg3) {
        field3719++;
        int var4 = -3 % ((arg3 - 6) / 41);
        byte[] var5 = arg1.method1441(arg2, (byte) -44, arg0);
        if (var5 == null) {
            return false;
        } else {
            class257.method1742((byte) -124, var5);
            return true;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Z)V", line = 134)
    public static final void method1681(boolean arg0) {
        if (!arg0) {
            method1679();
        }
        field3707++;
        class149.field2244.method2176((byte) -90);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IBLjava/awt/Component;I)Lek;", line = 145)
    public static final class213 method1682(int arg0, byte arg1, Component arg2, int arg3) {
        if (arg1 != 6) {
            field3714 = (int[]) null;
        }
        field3718++;
        try {
            Class var4 = Class.forName("oi");
            class213 var5 = (class213) var4.getDeclaredConstructor().newInstance();
            var5.method237(arg2, arg0, (byte) 93, arg3);
            return var5;
        } catch (Throwable var8) {
            class158 var7 = new class158();
            var7.method237(arg2, arg0, (byte) 123, arg3);
            return var7;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V", line = 169)
    public static final void method1683(byte arg0) {
        field3711++;
        if (class130.method965((byte) 120) != 2) {
            return;
        }
        if (arg0 > -78) {
            method1681(true);
        }
        byte var1 = (byte) (class207.field3135 - 4 & 0xFF);
        int var2 = class207.field3135 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class81.field1136[var3][var2][var4] = var1;
            }
        }
        if (class180.field2697 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class56.field713[var5] = -1000000;
            class162.field2445[var5] = 1000000;
            class74.field958[var5] = 0;
            class210.field3167[var5] = 1000000;
            class8.field55[var5] = 0;
        }
        if (class56.field710 != 1) {
            int var6 = class74.method473(class203.field3052, class302.field4612, 64, class180.field2697);
            if (var6 - class287.field4338 < 800 && (class179.field2645[class180.field2697][class302.field4612 >> 7][class203.field3052 >> 7] & 0x4) != 0) {
                class28.method176(false, class203.field3052 >> 7, class158.field2367, 1, 1, class302.field4612 >> 7);
            }
            return;
        }
        if ((class179.field2645[class180.field2697][class114.field1750.field1566 >> 7][class114.field1750.field1505 >> 7] & 0x4) != 0) {
            class28.method176(false, class114.field1750.field1505 >> 7, class158.field2367, 0, 1, class114.field1750.field1566 >> 7);
        }
        if (class160.field2392 >= 310) {
            return;
        }
        int var7 = class302.field4612 >> 7;
        int var8 = class114.field1750.field1566 >> 7;
        int var9 = class114.field1750.field1505 >> 7;
        int var10 = class203.field3052 >> 7;
        int var11;
        if (var7 >= var8) {
            var11 = var7 - var8;
        } else {
            var11 = var8 - var7;
        }
        int var12;
        if (var10 < var9) {
            var12 = var9 - var10;
        } else {
            var12 = var10 - var9;
        }
        if (var11 > var12) {
            int var15 = var12 * 65536 / var11;
            int var16 = 32768;
            while (var7 != var8) {
                if (var7 < var8) {
                    var7++;
                } else if (var8 < var7) {
                    var7--;
                }
                if ((class179.field2645[class180.field2697][var7][var10] & 0x4) != 0) {
                    class28.method176(false, var10, class158.field2367, 1, 1, var7);
                    break;
                }
                var16 += var15;
                if (var16 >= 65536) {
                    if (var9 > var10) {
                        var10++;
                    } else if (var9 < var10) {
                        var10--;
                    }
                    var16 -= 65536;
                    if ((class179.field2645[class180.field2697][var7][var10] & 0x4) != 0) {
                        class28.method176(false, var10, class158.field2367, 1, 1, var7);
                        break;
                    }
                }
            }
            return;
        }
        int var13 = var11 * 65536 / var12;
        int var14 = 32768;
        while (var9 != var10) {
            if (var10 < var9) {
                var10++;
            } else if (var9 < var10) {
                var10--;
            }
            if ((class179.field2645[class180.field2697][var7][var10] & 0x4) != 0) {
                class28.method176(false, var10, class158.field2367, 1, 1, var7);
                break;
            }
            var14 += var13;
            if (var14 >= 65536) {
                var14 -= 65536;
                if (var8 > var7) {
                    var7++;
                } else if (var8 < var7) {
                    var7--;
                }
                if ((class179.field2645[class180.field2697][var7][var10] & 0x4) != 0) {
                    class28.method176(false, var10, class158.field2367, 1, 1, var7);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)V", line = 359)
    public static final void method1684(int arg0, int arg1) {
        for (class101 var2 = class233.field3497.method1321((byte) -82); var2 != null; var2 = class233.field3497.method1330((byte) -12)) {
            if ((var2.field1603 >> 48 & 0xFFFFL) == ((long) arg0)) {
                var2.method714(-49);
            }
        }
        field3715++;
        if (arg1 != 11236) {
            field3714 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!im", name = "run", descriptor = "()V", line = 379)
    public final void run() {
        this.field3716 = true;
        field3712++;
        try {
            while (!this.field3717) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class179 var2 = this.field3713[var1];
                    if (var2 != null) {
                        var2.method1240(true);
                    }
                }
                class93.method662(-553, 10L);
                class35.method247(1, this.field3710, (Object) null);
            }
        } catch (Exception var7) {
            class19.method122(var7, (String) null, (byte) -113);
        } finally {
            this.field3716 = false;
        }
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(Z)V", line = 421)
    public static void method1685(boolean arg0) {
        if (!arg0) {
            field3709 = (class134[]) null;
        }
        field3708 = null;
        field3709 = null;
        field3714 = null;
    }
}
