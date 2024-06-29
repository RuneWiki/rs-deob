import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class264 {

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field4672 = 127;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "Ljd;")
    public static class86 field4676 = class122.method868("(U4", true);

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "[Z")
    public static boolean[] field4673;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lbl;I)V")
    public static final void method1790(class33 arg0, int arg1) {
        if (class236.field4265 == arg0.field697 || arg0.field683 == -1 || arg0.field724 != 0 || (arg0.field695 + 1) > class133.method952(arg0.field683, 127).field2357[arg0.field708]) {
            int var2 = class236.field4265 - arg0.field747;
            int var3 = arg0.field697 - arg0.field747;
            int var4 = arg0.field740 * 128 + (arg0.method240((byte) -127) * 64);
            int var5 = arg0.field728 * 128 + arg0.method240((byte) -112) * 64;
            int var6 = arg0.field746 * 128 + arg0.method240((byte) -125) * 64;
            int var7 = arg0.field733 * 128 + (arg0.method240((byte) -128) * 64);
            arg0.field676 = ((var3 - var2) * var4 + var2 * var6) / var3;
            arg0.field685 = ((var3 - var2) * var5 + var2 * var7) / var3;
        }
        arg0.field721 = 0;
        field4671++;
        if (arg0.field674 == 0) {
            arg0.field716 = 1024;
        }
        if (~arg0.field674 == arg1) {
            arg0.field716 = 1536;
        }
        if (arg0.field674 == 2) {
            arg0.field716 = 0;
        }
        if (arg0.field674 == 3) {
            arg0.field716 = 512;
        }
        arg0.field700 = arg0.field716;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZILbj;Lbj;Lmh;)V")
    public static final void method1791(boolean arg0, int arg1, class151 arg2, class151 arg3, class148 arg4) {
        class129.field2470 = arg0;
        class129.field2474 = arg2;
        class86.field1673 = arg3;
        field4674++;
        int var5 = class86.field1673.method1081(-2) - 1;
        class78.field1541 = class86.field1673.method1075(var5, 51) + var5 * 256;
        class138.field2637 = arg4;
        int var6 = -36 / ((-arg1 - 55) / 36);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public static final void method1792(int arg0) {
        field4675++;
        if (class7.field254 == 0) {
            return;
        }
        try {
            if ((++class97.field1926) > 1500) {
                if (class248.field4415 != null) {
                    class248.field4415.method207((byte) 106);
                    class248.field4415 = null;
                }
                if (class106.field2040 >= 1) {
                    class185.field3282 = -5;
                    class7.field254 = 0;
                    return;
                }
                if (class260.field4648 == class179.field3233) {
                    class260.field4648 = class187.field3314;
                } else {
                    class260.field4648 = class179.field3233;
                }
                class97.field1926 = 0;
                class106.field2040++;
                class7.field254 = 1;
            }
            if (class7.field254 == 1) {
                class183.field3266 = class157.field2954.method1715(class217.field3909, class260.field4648, true);
                class7.field254 = 2;
            }
            if (class7.field254 == 2) {
                if (class183.field3266.field613 == 2) {
                    throw new IOException();
                }
                if (class183.field3266.field613 != 1) {
                    return;
                }
                class248.field4415 = new class31((Socket) class183.field3266.field611, class157.field2954);
                class183.field3266 = null;
                class248.field4415.method209(class36.field809.field3547, arg0 ^ 0x1341, class36.field809.field3565, 0);
                if (class25.field601 != null) {
                    class25.field601.method355((byte) 107);
                }
                if (class76.field1517 != null) {
                    class76.field1517.method355((byte) 47);
                }
                int var1 = class248.field4415.method204(-30290);
                if (class25.field601 != null) {
                    class25.field601.method355((byte) 63);
                }
                if (class76.field1517 != null) {
                    class76.field1517.method355((byte) 96);
                }
                if (var1 != 101) {
                    class7.field254 = 0;
                    class185.field3282 = var1;
                    class248.field4415.method207((byte) 113);
                    class248.field4415 = null;
                    return;
                }
                class7.field254 = 3;
            }
            if (arg0 != 101) {
                field4673 = null;
            }
            if (class7.field254 == 3 && class248.field4415.method208(-11084) >= 2) {
                int var2 = class248.field4415.method204(arg0 - 30391) << 8 | class248.field4415.method204(-30290);
                class188.method1291(arg0 ^ 0x72F6, var2);
                if (class147.field2766 == -1) {
                    class147.field2766 = class13.field408;
                }
                class7.field254 = 0;
                class248.field4415.method207((byte) 111);
                class248.field4415 = null;
                class205.method1464(false);
            }
        } catch (IOException var3) {
            if (class248.field4415 != null) {
                class248.field4415.method207((byte) 126);
                class248.field4415 = null;
            }
            if (class106.field2040 < 1) {
                if (class260.field4648 == class179.field3233) {
                    class260.field4648 = class187.field3314;
                } else {
                    class260.field4648 = class179.field3233;
                }
                class7.field254 = 1;
                class97.field1926 = 0;
                class106.field2040++;
            } else {
                class7.field254 = 0;
                class185.field3282 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
    public static void method1793(byte arg0) {
        field4673 = null;
        field4676 = null;
        if (arg0 <= 21) {
            method1792(-52);
        }
    }
}
