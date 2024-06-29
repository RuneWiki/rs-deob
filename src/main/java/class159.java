import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class159 {

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "[Z")
    public static boolean[] field2893 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "Lud;")
    public static class279 field2892 = class130.method1024("::clientdrop", 255);

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "[[B")
    public static byte[][] field2897 = new byte[50][];

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "Lud;")
    public static class279 field2894 = null;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "Lud;")
    public static class279 field2898 = class130.method1024("null", 255);

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V", line = 16)
    public static final void method1249(byte arg0) {
        field2895++;
        if (arg0 != 125) {
            method1250(28);
        }
        class249.field4427.method1338((byte) -118);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 29)
    public static final void method1250(int arg0) {
        field2896++;
        class126.field2349 &= 0x7FF;
        if (class172.field3107 < 128) {
            class172.field3107 = 128;
        }
        int var1 = class96.field1794 >> 7;
        if (class172.field3107 > 383) {
            class172.field3107 = 383;
        }
        if (arg0 != -19267) {
            method1253(true, 103, -99, -51);
        }
        int var2 = class90.field1699 >> 7;
        int var3 = class130.method1025(class96.field1794, 1008652135, class287.field5134, class90.field1699);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class287.field5134;
                    if (var7 < 3 && (class257.field4573[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class52.field1082[var7][var5][var6] & 0xFF) * 8 + (var3 - class165.field2970[var7][var5][var6]);
                    if (var4 < var8) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class130.field2368 < var9) {
            class130.field2368 += (var9 - class130.field2368) / 24;
        } else if (class130.field2368 > var9) {
            class130.field2368 += (var9 - class130.field2368) / 80;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V", line = 110)
    public static final void method1251(int arg0) {
        class169.field3058.method1338((byte) -102);
        field2900++;
        int var1 = 50 / ((arg0 + 45) / 37);
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V", line = 127)
    public static void method1252(byte arg0) {
        field2894 = null;
        field2893 = null;
        if (arg0 > -69) {
            method1250(82);
        }
        field2892 = null;
        field2897 = (byte[][]) null;
        field2898 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZIII)V", line = 151)
    public static final void method1253(boolean arg0, int arg1, int arg2, int arg3) {
        field2899++;
        if (arg3 > arg1 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class287.field5132 = arg0;
        class51.field1063 = arg2;
        class312.field5524 = arg1;
    }
}
