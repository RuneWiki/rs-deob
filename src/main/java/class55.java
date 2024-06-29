import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class55 extends class184 {

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Lok;")
    public static class146 field978 = class235.method1724(-12908, "0");

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field981 = 0;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "[I")
    public static int[] field985 = new int[4];

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "F")
    public static float field984;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Loh;")
    public static class15 field983;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "Z")
    public static boolean field982;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "[I")
    public static int[] field992;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "[[[B")
    public static byte[][][] field988;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIII)V", line = 9)
    public static final void method443(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field991++;
        if (arg3 != -2) {
            field982 = false;
        }
        if (arg1 >= class151.field2564 && arg2 <= class126.field2058 && arg5 >= class123.field2008 && class318.field5394 >= arg6) {
            if (arg0 == 1) {
                class98.method674(arg5, 117, arg6, arg4, arg2, arg1);
            } else {
                class46.method327(92, arg2, arg1, arg4, arg5, arg0, arg6);
            }
        } else if (arg0 == 1) {
            class298.method2114(arg5, arg4, false, arg2, arg6, arg1);
        } else {
            class189.method1464(arg3 ^ 0x7C, arg4, arg1, arg2, arg6, arg5, arg0);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([SZ[Lok;)V", line = 40)
    public static final void method444(short[] arg0, boolean arg1, class146[] arg2) {
        field990++;
        if (!arg1) {
            method444((short[]) null, true, (class146[]) null);
        }
        class179.method1411(0, (byte) 115, arg0, arg2, arg2.length - 1);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZILok;)V", line = 62)
    public static final void method445(boolean arg0, int arg1, class146 arg2) {
        field989++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = class187.field3109.method213(arg2, 250);
        int var6 = var3 + 6;
        int var7 = class187.field3109.method202(arg2, 250) * 13;
        if (class271.field4640) {
            class131.method978(var6 - var3, -var3 + var4, var3 + var3 + var5, var3 + var7 - -var3, 0);
            class131.method965(var6 - var3, -var3 + var4, var5 - (-var3 - var3), var3 + var7 + var3, 16777215);
        } else {
            class181.method1416(var6 - var3, -var3 + var4, var3 + var5 + var3, var3 + var7 + var3, 0);
            class181.method1435(var6 - var3, -var3 + var4, var5 + var3 + var3, var3 + var7 - -var3, 16777215);
        }
        class187.field3109.method197(arg2, var6, var4, var5, var7, 16777215, -1, 1, 1, arg1);
        class112.method759(var3 + var7 + var3, -var3 + var4, 8, var3 + var5 + var3, var6 - var3);
        if (!arg0) {
            class133.method984(var7, var4, 104, var5, var6);
        } else if (class271.field4640) {
            class271.method1952();
        } else {
            try {
                Graphics var8 = class75.field1228.getGraphics();
                class139.field2307.method147(0, 0, var8, -114);
            } catch (Exception var10) {
                class75.field1228.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)Lcj;", line = 113)
    public static final class311 method446(int arg0, int arg1, int arg2) {
        class11 var3 = class203.field3382[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field218; var4++) {
            class311 var5 = var3.field217[var4];
            if ((var5.field5289 >> 29 & 0x3L) == 2L && var5.field5296 == arg1 && var5.field5294 == arg2) {
                class9.method61(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V", line = 137)
    public static void method447(byte arg0) {
        if (arg0 != -94) {
            return;
        }
        field992 = null;
        field985 = null;
        field983 = null;
        field988 = (byte[][][]) null;
        field978 = null;
    }
}
