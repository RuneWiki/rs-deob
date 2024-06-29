import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class54 {

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
    private int field1284 = 0;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    private int field1272 = 0;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    private int field1267;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
    private int field1278;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "[[I")
    public int[][] field1261;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "Lcd;")
    private static class23 field1266 = method414("Free world", -1);

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "Lcd;")
    public static class23 field1275 = method414("und haben es deaktiviert)3 Klicken Sie auf der", -1);

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Lcd;")
    public static class23 field1264 = field1266;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "Lcd;")
    public static class23 field1277 = method414("Lade Schrifts-=tze )2 ", -1);

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "[I")
    public static int[] field1281 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "[I")
    public static int[] field1288 = new int[2000];

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "Lea;")
    public static class38 field1274;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZIII)V")
    private final void method413(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            this.method428(-22, (byte) 34, -112, 57);
        }
        field1287++;
        this.field1261[arg1][arg2] = class119.method745(this.field1261[arg1][arg2], arg3);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;I)Lcd;")
    public static final class23 method414(String arg0, int arg1) {
        byte[] var2 = arg0.getBytes();
        if (arg1 != -1) {
            field1264 = null;
        }
        field1268++;
        int var3 = var2.length;
        int var4 = 0;
        class23 var5 = new class23();
        var5.field480 = new byte[var3];
        while (var3 > var4) {
            int var6 = var2[var4++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var4) {
                    break;
                }
                int var7 = var2[var4++] & 0xFF;
                var5.field480[var5.field473++] = (byte) (var6 * 43 + var7 - 1768);
            } else if (var6 != 0) {
                var5.field480[var5.field473++] = (byte) var6;
            }
        }
        var5.method159(47);
        return var5.method152(false);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIZIII)V")
    public final void method415(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 1) {
            return;
        }
        field1285++;
        int var7 = arg1 - this.field1272;
        int var8 = arg0 - this.field1284;
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method428(128, (byte) 126, var8, var7);
                this.method428(8, (byte) 115, var8, var7 - 1);
            }
            if (arg4 == 1) {
                this.method428(2, (byte) 114, var8, var7);
                this.method428(32, (byte) 107, var8 + 1, var7);
            }
            if (arg4 == 2) {
                this.method428(8, (byte) 117, var8, var7);
                this.method428(128, (byte) 109, var8, var7 + 1);
            }
            if (arg4 == 3) {
                this.method428(32, (byte) 112, var8, var7);
                this.method428(2, (byte) 124, var8 - 1, var7);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method428(1, (byte) 107, var8, var7);
                this.method428(16, (byte) 127, var8 + 1, var7 + -1);
            }
            if (arg4 == 1) {
                this.method428(4, (byte) 106, var8, var7);
                this.method428(64, (byte) 121, var8 + 1, var7 + 1);
            }
            if (arg4 == 2) {
                this.method428(16, (byte) 126, var8, var7);
                this.method428(1, (byte) 124, var8 - 1, var7 + 1);
            }
            if (arg4 == 3) {
                this.method428(64, (byte) 111, var8, var7);
                this.method428(4, (byte) 126, var8 - 1, var7 + -1);
            }
        }
        if (arg5 == 2) {
            if (arg4 == 0) {
                this.method428(130, (byte) 120, var8, var7);
                this.method428(8, (byte) 119, var8, var7 - 1);
                this.method428(32, (byte) 108, var8 + 1, var7);
            }
            if (arg4 == 1) {
                this.method428(10, (byte) 114, var8, var7);
                this.method428(32, (byte) 123, var8 + 1, var7);
                this.method428(128, (byte) 113, var8, var7 + 1);
            }
            if (arg4 == 2) {
                this.method428(40, (byte) 108, var8, var7);
                this.method428(128, (byte) 107, var8, var7 + 1);
                this.method428(2, (byte) 111, var8 - 1, var7);
            }
            if (arg4 == 3) {
                this.method428(160, (byte) 116, var8, var7);
                this.method428(2, (byte) 116, var8 - 1, var7);
                this.method428(8, (byte) 117, var8, var7 - 1);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method428(65536, (byte) 124, var8, var7);
                this.method428(4096, (byte) 108, var8, var7 - 1);
            }
            if (arg4 == 1) {
                this.method428(1024, (byte) 121, var8, var7);
                this.method428(16384, (byte) 119, var8 + 1, var7);
            }
            if (arg4 == 2) {
                this.method428(4096, (byte) 120, var8, var7);
                this.method428(65536, (byte) 124, var8, var7 + 1);
            }
            if (arg4 == 3) {
                this.method428(16384, (byte) 120, var8, var7);
                this.method428(1024, (byte) 121, var8 - 1, var7);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method428(512, (byte) 120, var8, var7);
                this.method428(8192, (byte) 119, var8 + 1, var7 + -1);
            }
            if (arg4 == 1) {
                this.method428(2048, (byte) 122, var8, var7);
                this.method428(32768, (byte) 112, var8 + 1, var7 + 1);
            }
            if (arg4 == 2) {
                this.method428(8192, (byte) 123, var8, var7);
                this.method428(512, (byte) 106, var8 - 1, var7 + 1);
            }
            if (arg4 == 3) {
                this.method428(32768, (byte) 108, var8, var7);
                this.method428(2048, (byte) 126, var8 - 1, var7 + -1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method428(66560, (byte) 127, var8, var7);
            this.method428(4096, (byte) 124, var8, var7 - 1);
            this.method428(16384, (byte) 118, var8 + 1, var7);
        }
        if (arg4 == 1) {
            this.method428(5120, (byte) 112, var8, var7);
            this.method428(16384, (byte) 127, var8 + 1, var7);
            this.method428(65536, (byte) 106, var8, var7 + 1);
        }
        if (arg4 == 2) {
            this.method428(20480, (byte) 115, var8, var7);
            this.method428(65536, (byte) 113, var8, var7 + 1);
            this.method428(1024, (byte) 124, var8 - 1, var7);
        }
        if (arg4 == 3) {
            this.method428(81920, (byte) 112, var8, var7);
            this.method428(1024, (byte) 122, var8 - 1, var7);
            this.method428(4096, (byte) 106, var8, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1271++;
        if (arg1 == arg4 && arg3 == arg6) {
            return true;
        }
        int var8 = arg1 - this.field1272;
        int var9 = arg6 - this.field1284;
        int var10 = arg4 - this.field1272;
        int var11 = arg3 - this.field1284;
        if (~arg5 == arg0) {
            if (arg2 == 0) {
                if (var8 - 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1261[var10][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1261[var10][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var8 - 1 == var10 && var9 == var11 && (this.field1261[var10][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11 && (this.field1261[var10][var9] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var8 + 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1261[var10][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1261[var10][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var8 - 1 == var10 && var9 == var11 && (this.field1261[var10][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11 && (this.field1261[var10][var9] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 2) {
            if (arg2 == 0) {
                if (var8 - 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11 && (this.field1261[var10][var9] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1261[var10][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var8 - 1 == var10 && var9 == var11 && (this.field1261[var10][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1261[var10][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var8 - 1 == var10 && var9 == var11 && (this.field1261[var10][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1261[var10][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var8 - 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1261[var10][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11 && (this.field1261[var10][var9] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg5 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1261[var10][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1261[var10][var9] & 0x2) == 0) {
                return true;
            }
            if (var8 - 1 == var10 && var9 == var11 && (this.field1261[var10][var9] & 0x8) == 0) {
                return true;
            }
            if (var8 + 1 == var10 && var9 == var11 && (this.field1261[var10][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method417(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg1 + arg2 - 1;
        field1262++;
        int var10 = arg6 + arg7 - 1;
        if (arg7 <= arg4 && var10 >= arg4 && arg2 <= arg0 && var9 >= arg0) {
            return true;
        } else if (arg7 - 1 == arg4 && arg0 >= arg2 && arg0 <= var9 && (this.field1261[arg4 - this.field1272][arg0 - this.field1284] & 0x8) == 0 && (arg3 & 0x8) == 0) {
            return true;
        } else if (arg5 + var10 == arg4 && arg2 <= arg0 && arg0 <= var9 && (this.field1261[arg4 - this.field1272][arg0 - this.field1284] & 0x80) == 0 && (arg3 & 0x2) == 0) {
            return true;
        } else if (arg2 - 1 == arg0 && arg7 <= arg4 && var10 >= arg4 && (this.field1261[arg4 - this.field1272][arg0 - this.field1284] & 0x2) == 0 && (arg3 & 0x4) == 0) {
            return true;
        } else {
            return var9 + 1 == arg0 && arg4 >= arg7 && var10 >= arg4 && (this.field1261[arg4 - this.field1272][arg0 - this.field1284] & 0x20) == 0 && (arg3 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)V")
    public final void method418(int arg0, int arg1, int arg2) {
        if (arg2 != 16384) {
            field1275 = null;
        }
        int var4 = arg1 - this.field1284;
        field1283++;
        int var5 = arg0 - this.field1272;
        this.field1261[var5][var4] = class119.method745(this.field1261[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;B)I")
    public static final int method419(KeyEvent arg0, byte arg1) {
        field1289++;
        if (arg1 >= -47) {
            return -47;
        }
        int var2 = arg0.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(IIIIIII)Z")
    public final boolean method420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1276++;
        if (arg0 == arg3 && arg1 == arg5) {
            return true;
        }
        int var8 = arg0 - this.field1272;
        int var9 = arg1 - this.field1284;
        int var10 = arg5 - this.field1284;
        int var11 = arg3 - this.field1272;
        if (arg2 < 51) {
            field1281 = null;
        }
        if (arg4 == 6 || arg4 == 7) {
            if (arg4 == 7) {
                arg6 = arg6 + 2 & 0x3;
            }
            if (arg6 == 0) {
                if (var8 + 1 == var11 && var9 == var10 && (this.field1261[var11][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field1261[var11][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var8 - 1 == var11 && var9 == var10 && (this.field1261[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field1261[var11][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var8 - 1 == var11 && var9 == var10 && (this.field1261[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field1261[var11][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var8 + 1 == var11 && var9 == var10 && (this.field1261[var11][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field1261[var11][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg4 == 8) {
            if (var8 == var11 && var10 + 1 == var9 && (this.field1261[var11][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var10 - 1 == var9 && (this.field1261[var11][var9] & 0x2) == 0) {
                return true;
            }
            if (var8 - 1 == var11 && var9 == var10 && (this.field1261[var11][var9] & 0x8) == 0) {
                return true;
            }
            if (var8 + 1 == var11 && var9 == var10 && (this.field1261[var11][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIZI)V")
    public final void method421(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg2 - this.field1284;
        field1273++;
        int var9 = arg0 - this.field1272;
        if (arg1 > -29) {
            this.field1261 = null;
        }
        int var10 = 256;
        if (arg5) {
            var10 += 131072;
        }
        if (arg3 == 1 || arg3 == 3) {
            int var11 = arg4;
            arg4 = arg6;
            arg6 = var11;
        }
        for (int var12 = var9; var12 < var9 + arg4; var12++) {
            if (var12 >= 0 && var12 < this.field1267) {
                for (int var13 = var8; var13 < arg6 + var8; var13++) {
                    if (var13 >= 0 && var13 < this.field1278) {
                        this.method428(var10, (byte) 127, var13, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBI)V")
    public final void method422(int arg0, byte arg1, int arg2) {
        int var4 = arg2 - this.field1272;
        field1286++;
        int var5 = arg0 - this.field1284;
        this.field1261[var4][var5] = class119.method745(this.field1261[var4][var5], 262144);
        if (arg1 != 85) {
            field1275 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIZIZI)V")
    public final void method423(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        field1263++;
        int var7 = arg1 - this.field1272;
        int var8 = arg3 - this.field1284;
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method413(true, var7, var8, 128);
                this.method413(true, var7 - 1, var8, 8);
            }
            if (arg5 == 1) {
                this.method413(true, var7, var8, 2);
                this.method413(!arg4, var7, var8 + 1, 32);
            }
            if (arg5 == 2) {
                this.method413(true, var7, var8, 8);
                this.method413(!arg4, var7 + 1, var8, 128);
            }
            if (arg5 == 3) {
                this.method413(!arg4, var7, var8, 32);
                this.method413(true, var7, var8 - 1, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method413(true, var7, var8, 1);
                this.method413(!arg4, var7 - 1, var8 + 1, 16);
            }
            if (arg5 == 1) {
                this.method413(true, var7, var8, 4);
                this.method413(true, var7 + 1, var8 + 1, 64);
            }
            if (arg5 == 2) {
                this.method413(true, var7, var8, 16);
                this.method413(!arg4, var7 + 1, var8 + -1, 1);
            }
            if (arg5 == 3) {
                this.method413(true, var7, var8, 64);
                this.method413(!arg4, var7 - 1, var8 + -1, 4);
            }
        }
        if (arg4) {
            this.field1278 = 50;
        }
        if (arg0 == 2) {
            if (arg5 == 0) {
                this.method413(true, var7, var8, 130);
                this.method413(true, var7 - 1, var8, 8);
                this.method413(!arg4, var7, var8 + 1, 32);
            }
            if (arg5 == 1) {
                this.method413(true, var7, var8, 10);
                this.method413(true, var7, var8 + 1, 32);
                this.method413(true, var7 + 1, var8, 128);
            }
            if (arg5 == 2) {
                this.method413(true, var7, var8, 40);
                this.method413(true, var7 + 1, var8, 128);
                this.method413(true, var7, var8 - 1, 2);
            }
            if (arg5 == 3) {
                this.method413(!arg4, var7, var8, 160);
                this.method413(true, var7, var8 - 1, 2);
                this.method413(true, var7 - 1, var8, 8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method413(true, var7, var8, 65536);
                this.method413(true, var7 - 1, var8, 4096);
            }
            if (arg5 == 1) {
                this.method413(true, var7, var8, 1024);
                this.method413(true, var7, var8 + 1, 16384);
            }
            if (arg5 == 2) {
                this.method413(true, var7, var8, 4096);
                this.method413(true, var7 + 1, var8, 65536);
            }
            if (arg5 == 3) {
                this.method413(!arg4, var7, var8, 16384);
                this.method413(!arg4, var7, var8 - 1, 1024);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method413(!arg4, var7, var8, 512);
                this.method413(!arg4, var7 - 1, var8 + 1, 8192);
            }
            if (arg5 == 1) {
                this.method413(true, var7, var8, 2048);
                this.method413(!arg4, var7 + 1, var8 + 1, 32768);
            }
            if (arg5 == 2) {
                this.method413(true, var7, var8, 8192);
                this.method413(true, var7 + 1, var8 + -1, 512);
            }
            if (arg5 == 3) {
                this.method413(true, var7, var8, 32768);
                this.method413(!arg4, var7 - 1, var8 - 1, 2048);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method413(true, var7, var8, 66560);
            this.method413(true, var7 - 1, var8, 4096);
            this.method413(true, var7, var8 + 1, 16384);
        }
        if (arg5 == 1) {
            this.method413(!arg4, var7, var8, 5120);
            this.method413(true, var7, var8 + 1, 16384);
            this.method413(true, var7 + 1, var8, 65536);
        }
        if (arg5 == 2) {
            this.method413(true, var7, var8, 20480);
            this.method413(true, var7 + 1, var8, 65536);
            this.method413(true, var7, var8 - 1, 1024);
        }
        if (arg5 == 3) {
            this.method413(!arg4, var7, var8, 81920);
            this.method413(!arg4, var7, var8 - 1, 1024);
            this.method413(!arg4, var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZII)V")
    public final void method424(boolean arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1284;
        field1270++;
        if (arg0) {
            this.method418(35, -95, 81);
        }
        int var5 = arg1 - this.field1272;
        this.field1261[var5][var4] = class27.method198(this.field1261[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
    public final void method425(byte arg0) {
        field1282++;
        if (arg0 <= 17) {
            return;
        }
        for (int var2 = 0; var2 < this.field1267; var2++) {
            for (int var3 = 0; var3 < this.field1278; var3++) {
                if (var2 == 0 || var3 == 0 || this.field1267 - 5 <= var2 || var3 >= this.field1278 - 5) {
                    this.field1261[var2][var3] = 16777215;
                } else {
                    this.field1261[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIZ)V")
    public final void method426(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg3 > -85) {
            return;
        }
        int var7 = arg1 - this.field1272;
        int var8 = arg2 - this.field1284;
        field1269++;
        int var9 = 256;
        if (arg5) {
            var9 += 131072;
        }
        for (int var10 = var7; var10 < arg4 + var7; var10++) {
            if (var10 >= 0 && var10 < this.field1267) {
                for (int var11 = var8; var11 < var8 + arg0; var11++) {
                    if (var11 >= 0 && this.field1278 > var11) {
                        this.method413(true, var10, var11, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(II)V")
    public class54(int arg0, int arg1) {
        this.field1267 = arg0;
        this.field1278 = arg1;
        this.field1261 = new int[this.field1267][this.field1278];
        this.method425((byte) 122);
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)V")
    public static void method427(byte arg0) {
        field1266 = null;
        field1288 = null;
        field1274 = null;
        field1281 = null;
        field1277 = null;
        field1275 = null;
        field1264 = null;
        if (arg0 > -77) {
            field1266 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBII)V")
    private final void method428(int arg0, byte arg1, int arg2, int arg3) {
        this.field1261[arg3][arg2] = class27.method198(this.field1261[arg3][arg2], ~arg0);
        field1279++;
        if (arg1 < 105) {
            this.method428(-31, (byte) -8, -54, 86);
        }
    }
}
