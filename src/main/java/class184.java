import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class184 {

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    private int field3260 = 0;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    private int field3275 = -1;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "Lng;")
    private class76 field3268 = new class76();

    @OriginalMember(owner = "client!je", name = "s", descriptor = "Z")
    public boolean field3276 = false;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    private int field3259;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    private int field3270;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "[Lda;")
    private class186[] field3265;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "[[I")
    private int[][] field3269;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field3271 = 0;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "Loa;")
    private static class99 field3261 = class221.method1463(2844, "shake:");

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field3274 = 0;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "Loa;")
    public static class99 field3273 = class221.method1463(2844, "rect_debug=");

    @OriginalMember(owner = "client!je", name = "e", descriptor = "Loa;")
    public static class99 field3262 = field3261;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "Loa;")
    public static class99 field3264 = field3261;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static void method1260(byte arg0) {
        field3262 = null;
        field3261 = null;
        field3264 = null;
        field3273 = null;
        if (arg0 != -63) {
            field3273 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)[[I")
    public final int[][] method1261(int arg0) {
        field3272++;
        if (this.field3270 != this.field3259) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field3259; var2++) {
            this.field3265[var2] = class216.field3745;
        }
        int var3 = -60 % ((arg0 + 52) / 32);
        return this.field3269;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)[I")
    public final int[] method1262(int arg0, int arg1) {
        if (arg1 != 7492) {
            this.field3268 = null;
        }
        field3258++;
        if (this.field3270 == this.field3259) {
            this.field3276 = this.field3265[arg0] == null;
            this.field3265[arg0] = class216.field3745;
            return this.field3269[arg0];
        } else if (this.field3259 == 1) {
            this.field3276 = this.field3275 != arg0;
            this.field3275 = arg0;
            return this.field3269[0];
        } else {
            class186 var3 = this.field3265[arg0];
            if (var3 == null) {
                this.field3276 = true;
                if (this.field3260 < this.field3259) {
                    var3 = new class186(arg0, this.field3260);
                    this.field3260++;
                } else {
                    class186 var4 = (class186) this.field3268.method531((byte) 118);
                    var3 = new class186(arg0, var4.field3295);
                    this.field3265[var4.field3293] = null;
                    var4.method828((byte) -114);
                }
                this.field3265[arg0] = var3;
            } else {
                this.field3276 = false;
            }
            this.field3268.method527(var3, 10);
            return this.field3269[var3.field3295];
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZLpg;)V")
    public static final void method1263(boolean arg0, class75 arg1) {
        field3266++;
        arg1.field1282 = arg1.field1308;
        if (arg1.field1323 == 0) {
            arg1.field1311 = 0;
            return;
        }
        if (arg1.field1284 != -1 && arg1.field1297 == 0) {
            class270 var2 = class38.method297(132, arg1.field1284);
            if (arg1.field1326 > 0 && var2.field4772 == 0) {
                arg1.field1311++;
                return;
            }
            if (arg1.field1326 <= 0 && var2.field4748 == 0) {
                arg1.field1311++;
                return;
            }
        }
        int var3 = arg1.field1325;
        int var4 = arg1.field1301;
        int var5 = arg1.field1317[arg1.field1323 - 1] * 128 + arg1.method516((byte) -65) * 64;
        int var6 = arg1.field1259[arg1.field1323 - 1] * 128 + arg1.method516((byte) -65) * 64;
        if ((var5 - var3) > 256 || (var5 - var3) < -256 || var6 - var4 > 256 || var6 - var4 < -256) {
            arg1.field1301 = var6;
            arg1.field1325 = var5;
            return;
        }
        if (var5 > var3) {
            if (var4 < var6) {
                arg1.field1275 = 1280;
            } else if (var6 >= var4) {
                arg1.field1275 = 1536;
            } else {
                arg1.field1275 = 1792;
            }
        } else if (var3 <= var5) {
            if (var6 > var4) {
                arg1.field1275 = 1024;
            } else if (var6 < var4) {
                arg1.field1275 = 0;
            }
        } else if (var6 > var4) {
            arg1.field1275 = 768;
        } else if (var4 > var6) {
            arg1.field1275 = 256;
        } else {
            arg1.field1275 = 512;
        }
        int var7 = arg1.field1275 - arg1.field1296 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg1.field1305;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg1.field1328;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg1.field1291;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg1.field1273;
        }
        if (var8 == -1) {
            var8 = arg1.field1328;
        }
        arg1.field1282 = var8;
        int var9 = 4;
        boolean var10 = arg0;
        if (arg1 instanceof class156) {
            var10 = ((class156) arg1).field2793.field4463;
        }
        if (var10) {
            if (arg1.field1296 != arg1.field1275 && arg1.field1265 == -1 && arg1.field1330 != 0) {
                var9 = 2;
            }
            if (arg1.field1323 > 2) {
                var9 = 6;
            }
            if (arg1.field1323 > 3) {
                var9 = 8;
            }
            if (arg1.field1311 > 0 && arg1.field1323 > 1) {
                arg1.field1311--;
                var9 = 8;
            }
        } else {
            if (arg1.field1323 > 1) {
                var9 = 6;
            }
            if (arg1.field1323 > 2) {
                var9 = 8;
            }
            if (arg1.field1311 > 0 && arg1.field1323 > 1) {
                arg1.field1311--;
                var9 = 8;
            }
        }
        if (arg1.field1302[arg1.field1323 - 1]) {
            var9 <<= 0x1;
        }
        if (var6 > var4) {
            arg1.field1301 += var9;
            if (arg1.field1301 > var6) {
                arg1.field1301 = var6;
            }
        } else if (var4 > var6) {
            arg1.field1301 -= var9;
            if (arg1.field1301 < var6) {
                arg1.field1301 = var6;
            }
        }
        if (var5 > var3) {
            arg1.field1325 += var9;
            if (var5 < arg1.field1325) {
                arg1.field1325 = var5;
            }
        } else if (var3 > var5) {
            arg1.field1325 -= var9;
            if (arg1.field1325 < var5) {
                arg1.field1325 = var5;
            }
        }
        if (arg1.field1325 == var5 && arg1.field1301 == var6) {
            arg1.field1323--;
            if (arg1.field1326 > 0) {
                arg1.field1326--;
            }
        }
        if (var9 >= 8 && arg1.field1328 == arg1.field1282 && arg1.field1333 != -1) {
            arg1.field1282 = arg1.field1333;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
    public final void method1264(int arg0) {
        for (int var2 = 0; var2 < this.field3259; var2++) {
            this.field3269[var2] = null;
        }
        if (arg0 != 23418) {
            field3271 = -36;
        }
        this.field3269 = null;
        field3263++;
        this.field3265 = null;
        this.field3268.method534(1);
        this.field3268 = null;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(III)V")
    public class184(int arg0, int arg1, int arg2) {
        this.field3259 = arg0;
        this.field3270 = arg1;
        this.field3265 = new class186[this.field3270];
        this.field3269 = new int[this.field3259][arg2];
    }
}
