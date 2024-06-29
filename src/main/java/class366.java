import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public abstract class class366 {

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    public int field5361;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public int field5362;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!en", name = "i", descriptor = "I")
    public int field5368;

    @OriginalMember(owner = "client!en", name = "j", descriptor = "I")
    public static int field5369;

    @OriginalMember(owner = "client!en", name = "k", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)Z", line = 7)
    public final boolean method2239(int arg0) {
        field5360++;
        if (arg0 != 2) {
            this.method2239(71);
        }
        return (this.field5368 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)Z", line = 25)
    public final boolean method2240(byte arg0) {
        field5364++;
        if (arg0 >= -41) {
            this.field5361 = -125;
        }
        return (this.field5368 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)Z", line = 38)
    public final boolean method2241(boolean arg0) {
        field5370++;
        if (!arg0) {
            this.field5368 = -113;
        }
        return (this.field5368 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II[Lps;IIZ)V", line = 52)
    public static final void method2242(int arg0, int arg1, class5[] arg2, int arg3, int arg4, boolean arg5) {
        field5369++;
        int var6 = 17 % ((39 - arg0) / 41);
        for (int var7 = 0; var7 < arg2.length; var7++) {
            class5 var8 = arg2[var7];
            if (var8 != null && var8.field87 == arg1) {
                class282.method1672(arg5, arg4, (byte) 109, arg3, var8);
                class386.method2378(arg3, arg4, (byte) 125, var8);
                if (var8.field74 > var8.field152 - var8.field202) {
                    var8.field74 = var8.field152 - var8.field202;
                }
                if (var8.field196 > (var8.field120 - var8.field76)) {
                    var8.field196 = var8.field120 - var8.field76;
                }
                if (var8.field74 < 0) {
                    var8.field74 = 0;
                }
                if (var8.field196 < 0) {
                    var8.field196 = 0;
                }
                if (var8.field172 == 0) {
                    class319.method1976(arg5, (byte) 79, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IZII)V", line = 97)
    public static final void method2243(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg0 < 28) {
            return;
        }
        field5366++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class85.field1334 = arg2;
        class550.field8108 = arg1;
        class82.field1321 = arg3;
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(B)Z", line = 116)
    public final boolean method2244(byte arg0) {
        field5367++;
        if (arg0 >= -74) {
            return false;
        } else {
            return (this.field5368 & 0x8) != 0;
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V", line = 127)
    public static final void method2245(int arg0) {
        if (arg0 != 128) {
            method2245(127);
        }
        field5365++;
        class73.field1152.method3890(-1);
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(I)I", line = 139)
    public static final int method2246(int arg0) {
        field5363++;
        if (class188.field2561 == null) {
            if (!class683.field9638 && class373.field5520 > 0) {
                if (class51.field790 && class18.field362.method1609(81, -27453) && class373.field5520 > 2) {
                    return ((class426) class152.field2150.field4475.field5735.field5735).field6228;
                }
                return ((class426) class152.field2150.field4475.field5735).field6228;
            }
            int var1 = class315.field4612.method2340(40960);
            int var2 = class315.field4612.method2338((byte) 44);
            int var3 = class201.field2730;
            int var4 = class291.field4283;
            int var5 = class367.field5374;
            if (var1 > var3 && var1 < var3 + var5) {
                int var6 = -1;
                for (int var7 = 0; var7 < class373.field5520; var7++) {
                    if (class70.field1083) {
                        int var11 = (class373.field5520 - (var7 + 1)) * 16 + var4 + 33;
                        if (var2 > var11 - 13 && var2 <= var11 + 3) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = var4 + ((-var7 + -1 + class373.field5520) * 16) + 31;
                        if (var2 > var12 - 13 && var2 <= (var12 + 3)) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class656 var9 = new class656(class152.field2150);
                    for (class426 var10 = (class426) var9.method3704((byte) 91); var10 != null; var10 = (class426) var9.method3706(18)) {
                        if ((var8++) == var6) {
                            return var10.field6228;
                        }
                    }
                }
            }
        }
        if (arg0 > -126) {
            method2242(54, 40, null, 21, 87, false);
        }
        return -1;
    }
}
