import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class313 {

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "Lje;")
    private class367 field4334 = new class367();

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    private int field4327;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    private int field4325;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "Lfaa;")
    private class139 field4335;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "[I")
    public static int[] field4333 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lup;I)V")
    private final void method1890(class249 arg0, int arg1) {
        field4329++;
        if (arg1 == 27937 && arg0 != null) {
            arg0.method2340(-55);
            arg0.method3301(99);
            this.field4327 += arg0.field3394;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIII)V")
    public static final void method1891(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= arg1) {
            class470.method2660(arg1, arg0, class344.field4599[arg2], (byte) 11, arg4);
        } else {
            class470.method2660(arg0, arg1, class344.field4599[arg2], (byte) 11, arg4);
        }
        field4328++;
        if (arg3 != 4) {
            method1900(83);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)I")
    public final int method1892(int arg0) {
        field4320++;
        return arg0 <= 70 ? 21 : this.field4325;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/Object;BLoga;)V")
    public final void method1893(Object arg0, byte arg1, class438 arg2) {
        int var4 = 58 % ((-arg1 - 89) / 33);
        this.method1901(arg2, arg0, -108, 1);
        field4324++;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILoga;)V")
    private final void method1894(int arg0, class438 arg1) {
        field4322++;
        if (arg0 != 1) {
            return;
        }
        long var3 = arg1.method1933((byte) -38);
        for (class249 var5 = (class249) this.field4335.method970((byte) 89, var3); var5 != null; var5 = (class249) this.field4335.method976((byte) -81)) {
            if (var5.field3393.method1929(arg1, (byte) -47)) {
                this.method1890(var5, arg0 + 27936);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V")
    public final void method1895(int arg0) {
        if (arg0 > -22) {
            method1900(15);
        }
        for (class249 var2 = (class249) this.field4334.method2126(-1); var2 != null; var2 = (class249) this.field4334.method2117(100)) {
            if (var2.method470(18398)) {
                var2.method2340(124);
                var2.method3301(72);
                this.field4327 += var2.field3394;
            }
        }
        field4326++;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Loga;B)Ljava/lang/Object;")
    public final Object method1896(class438 arg0, byte arg1) {
        field4321++;
        long var3 = arg0.method1933((byte) -35);
        if (arg1 >= -116) {
            this.method1896(null, (byte) -68);
        }
        for (class249 var5 = (class249) this.field4335.method970((byte) 89, var3); var5 != null; var5 = (class249) this.field4335.method976((byte) -81)) {
            if (var5.field3393.method1929(arg0, (byte) -47)) {
                Object var6 = var5.method472((byte) -85);
                if (var6 != null) {
                    if (var5.method470(18398)) {
                        class56 var7 = new class56(arg0, var6, var5.field3394);
                        this.field4335.method968(var5.field5623, var7, -1);
                        this.field4334.method2123(var7, -1);
                        var7.field8154 = 0L;
                        var5.method2340(113);
                        var5.method3301(58);
                    } else {
                        this.field4334.method2123(var5, -1);
                        var5.field8154 = 0L;
                    }
                    return var6;
                }
                var5.method2340(-81);
                var5.method3301(40);
                this.field4327 += var5.field3394;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
    public static final void method1897(byte arg0) {
        if (arg0 < 14) {
            return;
        }
        if (class297.field4067 != null) {
            try {
                class297.field4067.close();
            } catch (IOException var1) {
            }
        }
        field4319++;
        class297.field4067 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ltg;I)Lbda;")
    public static final class467 method1898(class210 arg0, int arg1) {
        field4331++;
        if (arg1 != -30524) {
            method1900(-106);
        }
        class467 var2;
        if (class511.field7023 == null) {
            var2 = new class467();
        } else {
            var2 = class511.field7023;
            class511.field7023 = class511.field7023.field6421;
            var2.field6421 = null;
            class236.field3251--;
        }
        var2.field6419 = arg0;
        return var2;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(I)V")
    public class313(int arg0) {
        this.field4327 = arg0;
        this.field4325 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field4335 = new class139(var2);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)I")
    public final int method1899(boolean arg0) {
        if (arg0) {
            field4332++;
            return this.field4327;
        } else {
            return 52;
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)V")
    public static void method1900(int arg0) {
        field4333 = null;
        if (arg0 != -31640) {
            method1897((byte) -29);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Loga;Ljava/lang/Object;II)V")
    private final void method1901(class438 arg0, Object arg1, int arg2, int arg3) {
        field4323++;
        if (this.field4325 < arg3) {
            throw new IllegalStateException("s>cs");
        }
        this.method1894(1, arg0);
        this.field4327 -= arg3;
        while (this.field4327 < 0) {
            class249 var7 = (class249) this.field4334.method2116(4);
            this.method1890(var7, 27937);
        }
        class56 var5 = new class56(arg0, arg1, arg3);
        this.field4335.method968(arg0.method1933((byte) -94), var5, -1);
        this.field4334.method2123(var5, -1);
        int var6 = 88 / ((arg2 + 3) / 42);
        var5.field8154 = 0L;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BI)V")
    public final void method1902(byte arg0, int arg1) {
        if (arg0 != -112) {
            this.field4325 = 78;
        }
        field4336++;
        if (class75.field990 == null) {
            return;
        }
        for (class249 var3 = (class249) this.field4334.method2126(-1); var3 != null; var3 = (class249) this.field4334.method2117(100)) {
            if (var3.method470(18398)) {
                if (var3.method472((byte) -85) == null) {
                    var3.method2340(84);
                    var3.method3301(112);
                    this.field4327 += var3.field3394;
                }
            } else if (((long) arg1) < (++var3.field8154)) {
                class249 var4 = class75.field990.method1109(false, var3);
                this.field4335.method968(var3.field5623, var4, -1);
                class17.method84(var3, var4, 26180);
                var3.method2340(arg0 - 8);
                var3.method3301(48);
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)V")
    public final void method1903(int arg0) {
        if (arg0 == -1) {
            field4330++;
            this.field4334.method2119(0);
            this.field4335.method974(-20470);
            this.field4327 = this.field4325;
        }
    }
}
