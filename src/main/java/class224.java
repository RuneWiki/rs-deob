import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class224 extends class183 {

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "Ldj;")
    public static class44 field4175 = class89.method650(255, "oder ung-Ultiges Passwort)3");

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "I")
    public static int field4178 = 0;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
    public static int field4180 = 0;

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "Ldj;")
    public static class44 field4184 = class89.method650(255, "Keine Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "Ldj;")
    public static class44 field4186 = class89.method650(255, ":trade:");

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "Ldj;")
    public static class44 field4183 = class89.method650(255, "<col=ff0000>");

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
    public int field4185;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "Lnf;")
    public class147 field4181;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "Laf;")
    public class7 field4179;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "[B")
    public byte[] field4177;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V")
    public static void method1448(byte arg0) {
        field4186 = null;
        field4175 = null;
        field4184 = null;
        if (arg0 <= -4) {
            field4183 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
    public static final void method1449(int arg0) {
        field4174++;
        int var1 = class10.field212;
        int var2 = class121.field2157;
        int var3 = class122.field2176;
        int var4 = class7.field150;
        int var5 = 6116423;
        class99.method688(var1, var3, var2, var4, var5);
        class99.method688(var1 + 1, var3 + 1, var2 - 2, 16, 0);
        class99.method696(arg0 + var1, var3 + 18, var2 - 2, var4 + -19, 0);
        class150.field2620.method428(class221.field4007, var1 + 3, var3 - -14, var5, -1);
        int var6 = class27.field486;
        int var7 = class7.field151;
        for (int var8 = 0; var8 < class179.field3071; var8++) {
            int var9 = (class179.field3071 - var8 - 1) * 15 + var3 + 31;
            int var10 = 16777215;
            if (var6 > var1 && var1 + var2 > var6 && var7 > var9 - 13 && var9 + 3 > var7) {
                var10 = 16776960;
            }
            class150.field2620.method428(class137.method924(var8, (byte) -101), var1 + 3, var9, var10, 0);
        }
        class122.method838(class121.field2157, (byte) -35, class7.field150, class122.field2176, class10.field212);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I[B)V")
    public static final void method1450(int arg0, byte[] arg1) {
        field4176++;
        if (arg0 != 255) {
            field4175 = null;
        }
        int var2 = 0;
        while (true) {
            while (var2 < arg1.length) {
                int var3 = (arg1[var2++] & 0xFF) * 64 - class198.field3502;
                int var4 = (arg1[var2++] & 0xFF) * 64 - class136.field2431;
                if (var3 > 0 && var4 > 0 && class168.field2896 > var3 + 64 && var4 + 64 < class214.field3851) {
                    int var5 = var3 >> 6;
                    int var6 = class214.field3851 - var4 - 1 >> 6;
                    for (int var7 = 0; var7 < 64; var7++) {
                        for (int var8 = -64; var8 < 0; var8++) {
                            byte var9 = arg1[var2++];
                            if (var9 != 0) {
                                if (class228.field4281[var5][var6] == null) {
                                    class228.field4281[var5][var6] = new byte[4096];
                                }
                                class228.field4281[var5][var6][(-(var8 + 1) << 6) + var7] = var9;
                                byte var10 = arg1[var2++];
                                if (class170.field2968[var5][var6] == null) {
                                    class170.field2968[var5][var6] = new byte[4096];
                                }
                                class170.field2968[var5][var6][(-(var8 + 1) << 6) + var7] = var10;
                            }
                        }
                    }
                } else {
                    for (int var11 = -4096; var11 < 0; var11++) {
                        byte var12 = arg1[var2++];
                        if (var12 != 0) {
                            var2++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLfj;)Lfd;")
    public static final class60 method1451(byte arg0, class66 arg1) {
        field4182++;
        if (arg0 > -106) {
            method1449(-21);
        }
        return new class60(arg1.method514((byte) 124), arg1.method514((byte) 102), arg1.method514((byte) 107), arg1.method514((byte) 115), arg1.method480(69), arg1.method480(121), arg1.method506(255));
    }
}
