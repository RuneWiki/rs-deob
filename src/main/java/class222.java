import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class222 {

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "[I")
    public static int[] field3895 = new int[32];

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public static int field3899 = 1;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "Ls;")
    public static class261 field3897 = new class261(50);

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    public static volatile int field3901 = 0;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "[S")
    public static short[] field3903 = new short[] { 33, 3, 1, 11, 59, 48, 2, 10 };

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "Lmh;")
    public static class128 field3905 = class22.method156(127, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
    public static int field3904 = 0;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "Lmh;")
    public static class128 field3900 = class22.method156(126, "Benutzen");

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "Lem;")
    public static class10 field3906 = null;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "Lek;")
    public static class174 field3902;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "[Lng;")
    public static class152[] field3896;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIBI)V", line = 8)
    public static final void method1529(int arg0, int arg1, byte arg2, int arg3) {
        field3893++;
        if (arg2 != 40) {
            method1530(21);
        }
        class10 var4 = class271.method1908(arg1, arg3, false);
        if (var4 != null && var4.field235 != null) {
            class102 var5 = new class102();
            var5.field1738 = var4;
            var5.field1743 = var4.field235;
            class249.method1739(var5, -71);
        }
        class65.field1257 = arg3;
        class31.field685 = true;
        class284.field4879 = arg0;
        class88.field1514 = arg1;
        class7.method48(var4, 0);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V", line = 45)
    public static void method1530(int arg0) {
        field3902 = null;
        field3900 = null;
        field3906 = null;
        field3897 = null;
        field3895 = null;
        field3896 = null;
        if (arg0 != 8624) {
            method1529(-1, -112, (byte) 37, 96);
        }
        field3903 = null;
        field3905 = null;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V", line = 72)
    public static final void method1531(int arg0) {
        int var1 = class309.field5242;
        if (arg0 != -5154) {
            return;
        }
        int var2 = class226.field3946;
        field3894++;
        int var3 = class219.field3864;
        int var4 = 6116423;
        int var5 = class292.field5005;
        if (class247.field4247) {
            class269.method1878(var1, var2, var5, var3, var4);
            class269.method1878(var1 + 1, var2 + 1, var5 - 2, 16, 0);
            class269.method1871(var1 + 1, var2 + 18, var5 - 2, var3 + -19, 0);
        } else {
            class213.method1464(var1, var2, var5, var3, var4);
            class213.method1464(var1 + 1, var2 + 1, var5 - 2, 16, 0);
            class213.method1463(var1 + 1, var2 + 18, var5 - 2, var3 + -19, 0);
        }
        client.field4159.method2067(class301.field5112, var1 + 3, var2 + 14, var4, -1);
        int var6 = class275.field4760;
        int var7 = class77.field1411;
        for (int var8 = 0; var8 < class275.field4769; var8++) {
            int var9 = (class275.field4769 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var1 < var6 && (var1 + var5) > var6 && var7 > var9 - 13 && (var9 + 3) > var7) {
                var10 = 16776960;
            }
            client.field4159.method2067(class50.method342((byte) 46, var8), var1 + 3, var9, var10, 0);
        }
        class90.method561(class292.field5005, class226.field3946, arg0 ^ 0xFFFF98F3, class309.field5242, class219.field3864);
    }
}
