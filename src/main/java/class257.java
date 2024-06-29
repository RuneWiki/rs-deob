import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class257 {

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public int field3311;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "S")
    public short field3301;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "Z")
    public boolean field3303;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public int field3307;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "S")
    public short field3302;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "B")
    public byte field3305;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "B")
    public byte field3309;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public int field3306;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public int field3296;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "S")
    public short field3300;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public int field3297;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Lcea;")
    public static class180 field3298 = new class180("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "Lsc;")
    public static class290 field3308 = new class290();

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "F")
    public static float field3310;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "Lha;")
    public static class52 field3312;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 26)
    public static final void method1448(int arg0) {
        field3304++;
        if (class137.field1672 == 0) {
            return;
        }
        try {
            if ((++class585.field8495) > 2000) {
                if (class597.field8642 != null) {
                    class597.field8642.method2266((byte) -77);
                    class597.field8642 = null;
                }
                if (class71.field687 >= 1) {
                    class197.field2379 = -5;
                    class137.field1672 = 0;
                    return;
                }
                class71.field687++;
                class592.field8605.field2719 = !class592.field8605.field2719;
                class585.field8495 = 0;
                class137.field1672 = 1;
            }
            if (class137.field1672 == 1) {
                class396.field5228 = class74.field873.method924(class592.field8605.method1268(false), class592.field8605.field2713, 1);
                class137.field1672 = 2;
            }
            if (class137.field1672 == 2) {
                if (class396.field5228.field7031 == 2) {
                    throw new IOException();
                }
                if (class396.field5228.field7031 != 1) {
                    return;
                }
                class597.field8642 = class351.method1953(5000, (byte) 58, (Socket) class396.field5228.field7030);
                class396.field5228 = null;
                class597.field8642.method2264(0, 0, class136.field1663.field4929, class136.field1663.field4966);
                class137.field1672 = 4;
            }
            if (class137.field1672 == 4) {
                if (!class597.field8642.method2268((byte) -95, 1)) {
                    return;
                }
                class597.field8642.method2270(class532.field7483.field4929, 1, 0, false);
                int var1 = class532.field7483.field4929[0] & 0xFF;
                if (var1 != 21) {
                    class197.field2379 = var1;
                    class137.field1672 = 0;
                    class597.field8642.method2266((byte) -54);
                    class597.field8642 = null;
                    return;
                }
                class137.field1672 = 5;
            }
            if (arg0 == -16805) {
                if (class137.field1672 == 5) {
                    if (!class597.field8642.method2268((byte) -95, 1)) {
                        return;
                    }
                    class597.field8642.method2270(class532.field7483.field4929, 1, 0, false);
                    class137.field1672 = 6;
                    class133.field1637 = new String[class532.field7483.field4929[0] & 0xFF];
                }
                if (class137.field1672 == 6 && class597.field8642.method2268((byte) -95, class133.field1637.length * 8)) {
                    class532.field7483.field4966 = 0;
                    class597.field8642.method2270(class532.field7483.field4929, class133.field1637.length * 8, 0, false);
                    for (int var2 = 0; var2 < class133.field1637.length; var2++) {
                        class133.field1637[var2] = class589.method3418(class532.field7483.method2107(109), (byte) 53);
                    }
                    class137.field1672 = 0;
                    class197.field2379 = 21;
                    class597.field8642.method2266((byte) -42);
                    class597.field8642 = null;
                }
            }
        } catch (IOException var3) {
            if (class597.field8642 != null) {
                class597.field8642.method2266((byte) -56);
                class597.field8642 = null;
            }
            if (class71.field687 < 1) {
                class137.field1672 = 1;
                class585.field8495 = 0;
                class592.field8605.field2719 = !class592.field8605.field2719;
                class71.field687++;
            } else {
                class197.field2379 = -4;
                class137.field1672 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V", line = 172)
    public static void method1449(int arg0) {
        if (arg0 <= -55) {
            field3308 = null;
            field3298 = null;
            field3312 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 184)
    public class257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field3311 = arg0;
        this.field3301 = (short) arg6;
        this.field3303 = arg10;
        this.field3307 = arg2;
        this.field3302 = (short) arg4;
        this.field3305 = (byte) arg7;
        this.field3309 = (byte) arg8;
        this.field3306 = arg11;
        this.field3296 = arg1;
        this.field3300 = (short) arg5;
        this.field3297 = arg3;
    }
}
