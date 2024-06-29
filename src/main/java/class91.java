import java.awt.Component;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class91 {

    @OriginalMember(owner = "client!na", name = "v", descriptor = "I")
    private int field2192 = 0;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "I")
    private int field2188;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "I")
    private int field2189;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    private int field2180;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "[[I")
    public int[][] field2185;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field2171 = 0;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Lv;")
    public static class146 field2174 = class159.method1226((byte) -37, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!na", name = "e", descriptor = "Lv;")
    public static class146 field2175 = class159.method1226((byte) -37, ")4lang)4de");

    @OriginalMember(owner = "client!na", name = "z", descriptor = "Z")
    public static boolean field2196 = false;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!na", name = "A", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!na", name = "B", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "Ljava/awt/Image;")
    public static Image field2172;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IZIIII)V")
    public final void method713(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field2192;
        int var8 = -26 / ((-arg2 - 31) / 44);
        int var9 = arg3 - this.field2189;
        field2176++;
        int var10 = 256;
        if (arg1) {
            var10 += 131072;
        }
        for (int var11 = var7; var11 < var7 + arg0; var11++) {
            if (var11 >= 0 && this.field2180 > var11) {
                for (int var12 = var9; var12 < var9 + arg5; var12++) {
                    if (var12 >= 0 && this.field2188 > var12) {
                        this.method720((byte) 92, var11, var12, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III)V")
    public final void method714(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field2189;
        int var5 = arg2 - this.field2192;
        this.field2185[var5][var4] = class127.method943(this.field2185[var5][var4], arg0);
        field2190++;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(IZIIII)V")
    public final void method715(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg0 - this.field2192;
        field2173++;
        int var8 = arg2 - this.field2189;
        if (arg3 != 22997) {
            this.field2185 = null;
        }
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method720((byte) 92, var7, var8, 128);
                this.method720((byte) 92, var7 - 1, var8, 8);
            }
            if (arg4 == 1) {
                this.method720((byte) 92, var7, var8, 2);
                this.method720((byte) 92, var7, var8 + 1, 32);
            }
            if (arg4 == 2) {
                this.method720((byte) 92, var7, var8, 8);
                this.method720((byte) 92, var7 + 1, var8, 128);
            }
            if (arg4 == 3) {
                this.method720((byte) 92, var7, var8, 32);
                this.method720((byte) 92, var7, var8 - 1, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method720((byte) 92, var7, var8, 1);
                this.method720((byte) 92, var7 - 1, var8 - -1, 16);
            }
            if (arg4 == 1) {
                this.method720((byte) 92, var7, var8, 4);
                this.method720((byte) 92, var7 + 1, var8 + 1, 64);
            }
            if (arg4 == 2) {
                this.method720((byte) 92, var7, var8, 16);
                this.method720((byte) 92, var7 + 1, var8 - 1, 1);
            }
            if (arg4 == 3) {
                this.method720((byte) 92, var7, var8, 64);
                this.method720((byte) 92, var7 - 1, var8 + -1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg4 == 0) {
                this.method720((byte) 92, var7, var8, 130);
                this.method720((byte) 92, var7 - 1, var8, 8);
                this.method720((byte) 92, var7, var8 + 1, 32);
            }
            if (arg4 == 1) {
                this.method720((byte) 92, var7, var8, 10);
                this.method720((byte) 92, var7, var8 + 1, 32);
                this.method720((byte) 92, var7 + 1, var8, 128);
            }
            if (arg4 == 2) {
                this.method720((byte) 92, var7, var8, 40);
                this.method720((byte) 92, var7 + 1, var8, 128);
                this.method720((byte) 92, var7, var8 - 1, 2);
            }
            if (arg4 == 3) {
                this.method720((byte) 92, var7, var8, 160);
                this.method720((byte) 92, var7, var8 - 1, 2);
                this.method720((byte) 92, var7 - 1, var8, 8);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method720((byte) 92, var7, var8, 65536);
                this.method720((byte) 92, var7 - 1, var8, 4096);
            }
            if (arg4 == 1) {
                this.method720((byte) 92, var7, var8, 1024);
                this.method720((byte) 92, var7, var8 + 1, 16384);
            }
            if (arg4 == 2) {
                this.method720((byte) 92, var7, var8, 4096);
                this.method720((byte) 92, var7 + 1, var8, 65536);
            }
            if (arg4 == 3) {
                this.method720((byte) 92, var7, var8, 16384);
                this.method720((byte) 92, var7, var8 - 1, 1024);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method720((byte) 92, var7, var8, 512);
                this.method720((byte) 92, var7 - 1, var8 + 1, 8192);
            }
            if (arg4 == 1) {
                this.method720((byte) 92, var7, var8, 2048);
                this.method720((byte) 92, var7 + 1, var8 - -1, 32768);
            }
            if (arg4 == 2) {
                this.method720((byte) 92, var7, var8, 8192);
                this.method720((byte) 92, var7 + 1, var8 + -1, 512);
            }
            if (arg4 == 3) {
                this.method720((byte) 92, var7, var8, 32768);
                this.method720((byte) 92, var7 - 1, var8 + -1, 2048);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method720((byte) 92, var7, var8, 66560);
            this.method720((byte) 92, var7 - 1, var8, 4096);
            this.method720((byte) 92, var7, var8 + 1, 16384);
        }
        if (arg4 == 1) {
            this.method720((byte) 92, var7, var8, 5120);
            this.method720((byte) 92, var7, var8 + 1, 16384);
            this.method720((byte) 92, var7 + 1, var8, 65536);
        }
        if (arg4 == 2) {
            this.method720((byte) 92, var7, var8, 20480);
            this.method720((byte) 92, var7 + 1, var8, 65536);
            this.method720((byte) 92, var7, var8 - 1, 1024);
        }
        if (arg4 == 3) {
            this.method720((byte) 92, var7, var8, 81920);
            this.method720((byte) 92, var7, var8 - 1, 1024);
            this.method720((byte) 92, var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIII)V")
    private final void method716(int arg0, int arg1, int arg2, int arg3) {
        this.field2185[arg0][arg3] = class90.method711(this.field2185[arg0][arg3], ~arg2);
        field2178++;
        if (arg1 != 17498112) {
            field2175 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/awt/Component;ZI)Lvd;")
    public static final class150 method717(int arg0, Component arg1, boolean arg2, int arg3) {
        field2195++;
        try {
            Class var4 = Class.forName("vc");
            class150 var5 = (class150) var4.getDeclaredConstructor().newInstance();
            var5.method596(arg0, arg3, arg1, 115);
            if (!arg2) {
                field2175 = null;
            }
            return var5;
        } catch (Throwable var7) {
            class78 var6 = new class78();
            var6.method596(arg0, arg3, arg1, 123);
            return var6;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIBIIZI)V")
    public final void method718(int arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg1 == 1 || arg1 == 3) {
            int var8 = arg6;
            arg6 = arg4;
            arg4 = var8;
        }
        int var9 = 256;
        field2194++;
        int var10 = arg0 - this.field2189;
        int var11 = arg3 - this.field2192;
        if (arg5) {
            var9 += 131072;
        }
        for (int var12 = var11; var12 < arg6 + var11; var12++) {
            if (var12 >= 0 && var12 < this.field2180) {
                for (int var13 = var10; var13 < arg4 + var10; var13++) {
                    if (var13 >= 0 && this.field2188 > var13) {
                        this.method716(var12, 17498112, var9, var13);
                    }
                }
            }
        }
        if (arg2 >= -45) {
            this.method715(-44, false, 38, -81, 73, 120);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V")
    public final void method719(boolean arg0) {
        if (!arg0) {
            field2196 = false;
        }
        for (int var2 = 0; var2 < this.field2180; var2++) {
            for (int var3 = 0; var3 < this.field2188; var3++) {
                if (var2 == 0 || var3 == 0 || this.field2180 - 5 <= var2 || this.field2188 - 5 <= var3) {
                    this.field2185[var2][var3] = 16777215;
                } else {
                    this.field2185[var2][var3] = 16777216;
                }
            }
        }
        field2177++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BIII)V")
    private final void method720(byte arg0, int arg1, int arg2, int arg3) {
        field2184++;
        if (arg0 == 92) {
            this.field2185[arg1][arg2] = class127.method943(this.field2185[arg1][arg2], arg3);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZJ)V")
    public static final void method721(boolean arg0, long arg1) {
        if (!arg0) {
            field2172 = null;
        }
        field2181++;
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIBIIII)Z")
    public final boolean method722(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != -37) {
            return false;
        }
        field2193++;
        if (arg1 == arg3 && arg4 == arg5) {
            return true;
        }
        int var8 = arg4 - this.field2189;
        int var9 = arg5 - this.field2189;
        int var10 = arg1 - this.field2192;
        int var11 = arg3 - this.field2192;
        if (arg0 == 6 || arg0 == 7) {
            if (arg0 == 7) {
                arg6 = arg6 + 2 & 0x3;
            }
            if (arg6 == 0) {
                if (var11 + 1 == var10 && var8 == var9 && (this.field2185[var10][var9] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9 && (this.field2185[var10][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var11 - 1 == var10 && var8 == var9 && (this.field2185[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9 && (this.field2185[var10][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var11 - 1 == var10 && var8 == var9 && (this.field2185[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9 && (this.field2185[var10][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var11 + 1 == var10 && var8 == var9 && (this.field2185[var10][var9] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9 && (this.field2185[var10][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 8) {
            if (var10 == var11 && var8 + 1 == var9 && (this.field2185[var10][var9] & 0x20) == 0) {
                return true;
            }
            if (var10 == var11 && var8 - 1 == var9 && (this.field2185[var10][var9] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var10 && var8 == var9 && (this.field2185[var10][var9] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var10 && var8 == var9 && (this.field2185[var10][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZIIBII)V")
    public final void method723(boolean arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field2189;
        int var8 = arg1 - this.field2192;
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method716(var8, 17498112, 128, var7);
                this.method716(var8 - 1, 17498112, 8, var7);
            }
            if (arg2 == 1) {
                this.method716(var8, 17498112, 2, var7);
                this.method716(var8, 17498112, 32, var7 + 1);
            }
            if (arg2 == 2) {
                this.method716(var8, 17498112, 8, var7);
                this.method716(var8 + 1, 17498112, 128, var7);
            }
            if (arg2 == 3) {
                this.method716(var8, 17498112, 32, var7);
                this.method716(var8, 17498112, 2, var7 - 1);
            }
        }
        field2191++;
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method716(var8, 17498112, 1, var7);
                this.method716(var8 - 1, 17498112, 16, var7 + 1);
            }
            if (arg2 == 1) {
                this.method716(var8, 17498112, 4, var7);
                this.method716(var8 + 1, 17498112, 64, var7 + 1);
            }
            if (arg2 == 2) {
                this.method716(var8, 17498112, 16, var7);
                this.method716(var8 + 1, 17498112, 1, var7 - 1);
            }
            if (arg2 == 3) {
                this.method716(var8, 17498112, 64, var7);
                this.method716(var8 - 1, 17498112, 4, var7 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg2 == 0) {
                this.method716(var8, 17498112, 130, var7);
                this.method716(var8 - 1, 17498112, 8, var7);
                this.method716(var8, 17498112, 32, var7 + 1);
            }
            if (arg2 == 1) {
                this.method716(var8, 17498112, 10, var7);
                this.method716(var8, 17498112, 32, var7 + 1);
                this.method716(var8 + 1, 17498112, 128, var7);
            }
            if (arg2 == 2) {
                this.method716(var8, 17498112, 40, var7);
                this.method716(var8 + 1, 17498112, 128, var7);
                this.method716(var8, 17498112, 2, var7 - 1);
            }
            if (arg2 == 3) {
                this.method716(var8, 17498112, 160, var7);
                this.method716(var8, 17498112, 2, var7 - 1);
                this.method716(var8 - 1, 17498112, 8, var7);
            }
        }
        if (arg3 >= -86 || !arg0) {
            return;
        }
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method716(var8, 17498112, 65536, var7);
                this.method716(var8 - 1, 17498112, 4096, var7);
            }
            if (arg2 == 1) {
                this.method716(var8, 17498112, 1024, var7);
                this.method716(var8, 17498112, 16384, var7 + 1);
            }
            if (arg2 == 2) {
                this.method716(var8, 17498112, 4096, var7);
                this.method716(var8 + 1, 17498112, 65536, var7);
            }
            if (arg2 == 3) {
                this.method716(var8, 17498112, 16384, var7);
                this.method716(var8, 17498112, 1024, var7 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method716(var8, 17498112, 512, var7);
                this.method716(var8 - 1, 17498112, 8192, var7 + 1);
            }
            if (arg2 == 1) {
                this.method716(var8, 17498112, 2048, var7);
                this.method716(var8 + 1, 17498112, 32768, var7 + 1);
            }
            if (arg2 == 2) {
                this.method716(var8, 17498112, 8192, var7);
                this.method716(var8 + 1, 17498112, 512, var7 - 1);
            }
            if (arg2 == 3) {
                this.method716(var8, 17498112, 32768, var7);
                this.method716(var8 - 1, 17498112, 2048, var7 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method716(var8, 17498112, 66560, var7);
            this.method716(var8 - 1, 17498112, 4096, var7);
            this.method716(var8, 17498112, 16384, var7 + 1);
        }
        if (arg2 == 1) {
            this.method716(var8, 17498112, 5120, var7);
            this.method716(var8, 17498112, 16384, var7 + 1);
            this.method716(var8 + 1, 17498112, 65536, var7);
        }
        if (arg2 == 2) {
            this.method716(var8, 17498112, 20480, var7);
            this.method716(var8 + 1, 17498112, 65536, var7);
            this.method716(var8, 17498112, 1024, var7 - 1);
        }
        if (arg2 == 3) {
            this.method716(var8, 17498112, 81920, var7);
            this.method716(var8, 17498112, 1024, var7 - 1);
            this.method716(var8 - 1, 17498112, 4096, var7);
            return;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZLv;ILv;ILla;I)V")
    public static final void method724(boolean arg0, class146 arg1, int arg2, class146 arg3, int arg4, class77 arg5, int arg6) {
        if (arg2 <= 114) {
            method728(null, -17);
        }
        field2186++;
        int var7 = arg5.method593(68, arg3);
        int var8 = arg5.method592(arg1, 93, var7);
        class33.method222(var8, arg6, arg0, var7, arg5, arg4, true);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method725(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2182++;
        if (arg4 == arg6 && arg1 == arg5) {
            return true;
        }
        int var8 = arg1 - this.field2189;
        int var9 = arg5 - this.field2189;
        int var10 = arg6 - this.field2192;
        int var11 = arg4 - this.field2192;
        if (arg2 == 0) {
            if (arg3 == 0) {
                if (var11 - 1 == var10 && var8 == var9) {
                    return true;
                }
                if (var10 == var11 && var9 + 1 == var8 && (this.field2185[var10][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var8 && (this.field2185[var10][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var10 == var11 && var9 + 1 == var8) {
                    return true;
                }
                if (var11 - 1 == var10 && var8 == var9 && (this.field2185[var10][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var8 == var9 && (this.field2185[var10][var8] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var11 + 1 == var10 && var8 == var9) {
                    return true;
                }
                if (var10 == var11 && var9 + 1 == var8 && (this.field2185[var10][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var8 && (this.field2185[var10][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var10 == var11 && var9 - 1 == var8) {
                    return true;
                }
                if (var11 - 1 == var10 && var8 == var9 && (this.field2185[var10][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var8 == var9 && (this.field2185[var10][var8] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg0 >= -18) {
            field2171 = 64;
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                if (var11 - 1 == var10 && var8 == var9) {
                    return true;
                }
                if (var10 == var11 && var9 + 1 == var8) {
                    return true;
                }
                if (var11 + 1 == var10 && var8 == var9 && (this.field2185[var10][var8] & 0x12C0180) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var8 && (this.field2185[var10][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var11 - 1 == var10 && var8 == var9 && (this.field2185[var10][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 + 1 == var8) {
                    return true;
                }
                if (var11 + 1 == var10 && var8 == var9) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var8 && (this.field2185[var10][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var11 - 1 == var10 && var8 == var9 && (this.field2185[var10][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 + 1 == var8 && (this.field2185[var10][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var8 == var9) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var8) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var11 - 1 == var10 && var8 == var9) {
                    return true;
                }
                if (var10 == var11 && var9 + 1 == var8 && (this.field2185[var10][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var8 == var9 && (this.field2185[var10][var8] & 0x12C0180) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var8) {
                    return true;
                }
            }
        }
        if (arg2 == 9) {
            if (var10 == var11 && var9 + 1 == var8 && (this.field2185[var10][var8] & 0x20) == 0) {
                return true;
            }
            if (var10 == var11 && var9 - 1 == var8 && (this.field2185[var10][var8] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var10 && var8 == var9 && (this.field2185[var10][var8] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var10 && var8 == var9 && (this.field2185[var10][var8] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(III)V")
    public final void method726(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2192;
        int var5 = arg1 - this.field2189;
        field2179++;
        this.field2185[var4][var5] = class127.method943(this.field2185[var4][var5], arg0);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZII)V")
    public final void method727(boolean arg0, int arg1, int arg2) {
        field2187++;
        int var4 = arg2 - this.field2189;
        int var5 = arg1 - this.field2192;
        if (arg0) {
            method721(false, 74L);
        }
        this.field2185[var5][var4] = class90.method711(this.field2185[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ldd;I)V")
    public static final void method728(class26 arg0, int arg1) {
        field2183++;
        int var2 = arg0.field442;
        if (var2 == 324) {
            if (class68.field1554 == -1) {
                class42.field964 = arg0.field494;
                class68.field1554 = arg0.field537;
            }
            if (class103.field2503.field946) {
                arg0.field537 = class68.field1554;
            } else {
                arg0.field537 = class42.field964;
            }
        } else if (var2 == 325) {
            if (class68.field1554 == -1) {
                class68.field1554 = arg0.field537;
                class42.field964 = arg0.field494;
            }
            if (class103.field2503.field946) {
                arg0.field537 = class42.field964;
            } else {
                arg0.field537 = class68.field1554;
            }
        } else {
            if (arg1 != -4375) {
                field2171 = -111;
            }
            if (var2 == 327) {
                arg0.field534 = 150;
                arg0.field470 = (int) (Math.sin((double) class94.field2229 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field551 = 0;
                arg0.field577 = 5;
            } else if (var2 == 328) {
                arg0.field534 = 150;
                arg0.field470 = (int) (Math.sin((double) class94.field2229 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field577 = 5;
                arg0.field551 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method729(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2197++;
        if (arg4 != 19661088) {
            this.method716(17, -20, -26, -8);
        }
        int var9 = arg0 + arg2 - 1;
        int var10 = arg7 + arg1 - 1;
        if (arg6 >= arg2 && var9 >= arg6 && arg7 <= arg3 && var10 >= arg3) {
            return true;
        } else if (arg2 - 1 == arg6 && arg7 <= arg3 && arg3 <= var10 && (this.field2185[arg6 - this.field2192][arg3 - this.field2189] & 0x8) == 0 && (arg5 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg6 && arg7 <= arg3 && arg3 <= var10 && (this.field2185[arg6 - this.field2192][arg3 - this.field2189] & 0x80) == 0 && (arg5 & 0x2) == 0) {
            return true;
        } else if (arg7 - 1 == arg3 && arg2 <= arg6 && arg6 <= var9 && (this.field2185[arg6 - this.field2192][arg3 - this.field2189] & 0x2) == 0 && (arg5 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg3 && arg6 >= arg2 && var9 >= arg6 && (this.field2185[arg6 - this.field2192][arg3 - this.field2189] & 0x20) == 0 && (arg5 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lv;I)I")
    public static final int method730(class146 arg0, int arg1) {
        field2198++;
        if (class67.field1505 == 1) {
            return 7;
        } else if (arg0.method1098(class46.field1067, true)) {
            return 1;
        } else if (arg0.method1098(class47.field1078, true)) {
            return 1;
        } else if (arg0.method1098(class108.field2582, true)) {
            return 2;
        } else if (arg0.method1098(class70.field1627, true)) {
            return 2;
        } else if (arg0.method1098(class157.field3625, true)) {
            return 3;
        } else {
            if (arg1 != 4) {
                field2196 = false;
            }
            if (arg0.method1098(class74.field1743, true)) {
                return 4;
            } else if (arg0.method1098(class74.field1714, true)) {
                return 4;
            } else if (arg0.method1098(class145.field3288, true)) {
                return 5;
            } else if (arg0.method1098(class29.field596, true)) {
                return 6;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(II)V")
    public class91(int arg0, int arg1) {
        this.field2188 = arg1;
        this.field2189 = 0;
        this.field2180 = arg0;
        this.field2185 = new int[this.field2180][this.field2188];
        this.method719(true);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)V")
    public static void method731(boolean arg0) {
        field2175 = null;
        field2174 = null;
        if (arg0) {
            field2172 = null;
        }
        field2172 = null;
    }
}
