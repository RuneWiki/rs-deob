import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public abstract class class108 {

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field2179 = 0;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "Lsg;")
    public static class30 field2185 = class167.method1221((byte) 33, "Schlie-8en");

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public int field2178;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public int field2181;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public int field2188;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Laa;Z)Lsg;")
    public static final class30 method851(class8 arg0, boolean arg1) {
        field2182++;
        return arg1 ? null : class28.method238(arg0, 32767, !arg1);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)Z")
    public final boolean method852(byte arg0) {
        if (arg0 != 88) {
            method855(99);
        }
        field2175++;
        return (this.field2188 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILmc;II)[Lpj;")
    public static final class152[] method853(int arg0, class151 arg1, int arg2, int arg3) {
        field2186++;
        if (class224.method1608(arg3, arg2, arg1, 0)) {
            if (arg0 <= 41) {
                field2183 = -8;
            }
            return class114.method888((byte) -96);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Z")
    public final boolean method854(int arg0) {
        field2184++;
        if (arg0 == -4851) {
            return (this.field2188 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public static void method855(int arg0) {
        if (arg0 != 16) {
            method851((class8) null, true);
        }
        field2185 = null;
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)Z")
    public final boolean method856(int arg0) {
        field2176++;
        if (arg0 != 4) {
            field2183 = 14;
        }
        return (this.field2188 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZLsg;B)V")
    public static final void method857(boolean arg0, class30 arg1, byte arg2) {
        class30 var3 = arg1.method292((byte) 43);
        field2174++;
        int var4 = 0;
        short[] var5 = new short[16];
        for (int var6 = 0; var6 < class189.field3442; var6++) {
            class168 var9 = class201.method1425(90, var6);
            if ((!arg0 || var9.field3107) && var9.field3105 == -1 && var9.field3112 == -1 && var9.field3127 == 0 && var9.field3162.method292((byte) 43).method255(true, var3) != -1) {
                if (var4 >= 250) {
                    class53.field1176 = -1;
                    class115.field2274 = null;
                    return;
                }
                if (var5.length <= var4) {
                    short[] var10 = new short[var5.length * 2];
                    for (int var11 = 0; var11 < var4; var11++) {
                        var10[var11] = var5[var11];
                    }
                    var5 = var10;
                }
                var5[var4++] = (short) var6;
            }
        }
        class115.field2274 = var5;
        if (arg2 != -4) {
            field2179 = -74;
        }
        class53.field1176 = var4;
        class30[] var7 = new class30[class53.field1176];
        class130.field2570 = 0;
        for (int var8 = 0; var8 < class53.field1176; var8++) {
            var7[var8] = class201.method1425(76, var5[var8]).field3162;
        }
        class136.method1024(class115.field2274, -23033, var7);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZI)V")
    public static final void method858(boolean arg0, int arg1) {
        field2187++;
        class13.field238 = arg0;
        class115.field2275 = !class81.method703(-15861);
        if (arg1 != -27822) {
            field2177 = -21;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZIII)V")
    public static final void method859(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg1) {
            method855(4);
        }
        field2173++;
        if (arg0 > arg3) {
            class194.method1405(true, class121.field2390[arg2], arg0, arg3, arg4);
        } else {
            class194.method1405(true, class121.field2390[arg2], arg3, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)Z")
    public final boolean method860(boolean arg0) {
        field2180++;
        if (arg0) {
            this.method854(73);
        }
        return (this.field2188 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lmc;I)V")
    public static final void method861(class151 arg0, int arg1) {
        if (arg1 <= 52) {
            field2179 = -19;
        }
        field2172++;
        class116.field2288 = arg0.method1096((byte) -102, class226.field4044);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)I")
    public static final int method862(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }
}
