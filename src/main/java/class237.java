import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public abstract class class237 extends class266 {

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "I")
    public static int field3908 = -1;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "[Lai;")
    public static class240[] field3911 = new class240[50];

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "[F")
    public static float[] field3920 = new float[4];

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "Lma;")
    public static class5 field3919 = class12.method119("Cabbage", (byte) 79);

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "S")
    public static short field3923 = 1;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
    public static int field3912 = 1;

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "Lma;")
    private static class5 field3922 = class12.method119("Loaded interfaces", (byte) 96);

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "Lma;")
    public static class5 field3909 = field3922;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "I")
    public int field3913;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    public int field3914;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
    public int field3918;

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "I")
    public int field3921;

    @OriginalMember(owner = "client!rj", name = "V", descriptor = "I")
    public int field3925;

    @OriginalMember(owner = "client!rj", name = "W", descriptor = "I")
    public int field3926;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "Lje;")
    public static class158 field3910;

    @OriginalMember(owner = "client!rj", name = "U", descriptor = "Z")
    public static boolean field3924;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "(I)V", line = 11)
    public static final void method1674(int arg0) {
        class236.field3904 = 0;
        field3907++;
        int var1 = (class151.field2183.field178 >> 7) + class193.field3017;
        int var2 = (class151.field2183.field211 >> 7) + class74.field1158;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class236.field3904 = 1;
        }
        if (arg0 < 72) {
            return;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class236.field3904 = 1;
        }
        if (class236.field3904 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class236.field3904 = 0;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZI)V", line = 42)
    public static final void method1675(boolean arg0, int arg1) {
        field3915++;
        byte[][] var2;
        byte var3;
        if (arg0) {
            var2 = class105.field1562;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class111.field1657;
        }
        int var4 = -86 % ((arg1 + 36) / 32);
        for (int var5 = 0; var5 < var3; var5++) {
            class177.method1155((byte) 96);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    boolean var8 = false;
                    int var9 = class172.field2643[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = var9 >> 24 & 0x3;
                        if (!arg0 || var10 == 0) {
                            int var11 = (var9 & 0x6) >> 1;
                            int var12 = var9 >> 14 & 0x3FF;
                            int var13 = var9 >> 3 & 0x7FF;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; var15 < class294.field4958.length; var15++) {
                                if (class294.field4958[var15] == var14 && var2[var15] != null) {
                                    class126.method847(arg0, var10, var5, (byte) 101, class242.field4031, var11, (var13 & 0x7) * 8, (var12 & 0x7) * 8, var2[var15], var7 * 8, var6 * 8);
                                    var8 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class145.method920(var6 * 8, true, 8, var7 * 8, 8, var5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(ZI)V", line = 160)
    public static final void method1676(boolean arg0, int arg1) {
        field3917++;
        if (arg1 != 0) {
            field3912 = -68;
        }
        class50.method382(class255.field4354, class156.field2314, 16132, class255.field4362, arg0);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIB)V", line = 176)
    public final void method1677(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != -88) {
            method1674(-56);
        }
        field3916++;
        int var6 = this.field3913 << 3;
        int var7 = (arg0 << 4) + (var6 & 0xF);
        int var8 = this.field3926 << 3;
        int var9 = (arg3 << 4) + (var8 & 0xF);
        this.method731(var8, var6, var9, var7, arg1, arg2);
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)V", line = 208)
    public static void method1678(byte arg0) {
        field3922 = null;
        field3909 = null;
        field3920 = null;
        if (arg0 != -27) {
            method1674(11);
        }
        field3910 = null;
        field3911 = null;
        field3919 = null;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(II)V")
    public abstract void method214(int arg0, int arg1);

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(III)V")
    public abstract void method726(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIII)V")
    public abstract void method730(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIII)V")
    public abstract void method724(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(IIII)V")
    public abstract void method721(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(II)V")
    public abstract void method213(int arg0, int arg1);

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIII)V")
    public abstract void method731(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
