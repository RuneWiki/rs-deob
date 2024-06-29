import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public class class435 extends class291 {

    @OriginalMember(owner = "client!mha", name = "E", descriptor = "I")
    private int field6289 = 0;

    @OriginalMember(owner = "client!mha", name = "w", descriptor = "Ltca;")
    private class184 field6281 = new class184(16);

    @OriginalMember(owner = "client!mha", name = "L", descriptor = "I")
    private int field6296 = 0;

    @OriginalMember(owner = "client!mha", name = "H", descriptor = "Lqw;")
    private class84 field6292 = new class84();

    @OriginalMember(owner = "client!mha", name = "N", descriptor = "J")
    private long field6298 = 0L;

    @OriginalMember(owner = "client!mha", name = "z", descriptor = "I")
    private int field6284;

    @OriginalMember(owner = "client!mha", name = "l", descriptor = "Lnaa;")
    private class79 field6270;

    @OriginalMember(owner = "client!mha", name = "M", descriptor = "Z")
    private boolean field6297;

    @OriginalMember(owner = "client!mha", name = "J", descriptor = "Lqw;")
    private class84 field6294;

    @OriginalMember(owner = "client!mha", name = "i", descriptor = "Lcr;")
    private class598 field6267;

    @OriginalMember(owner = "client!mha", name = "O", descriptor = "Z")
    private boolean field6299;

    @OriginalMember(owner = "client!mha", name = "q", descriptor = "I")
    private int field6275;

    @OriginalMember(owner = "client!mha", name = "u", descriptor = "I")
    private int field6279;

    @OriginalMember(owner = "client!mha", name = "A", descriptor = "[B")
    private byte[] field6285;

    @OriginalMember(owner = "client!mha", name = "h", descriptor = "Lff;")
    private class9 field6266;

    @OriginalMember(owner = "client!mha", name = "y", descriptor = "Lnaa;")
    private class79 field6283;

    @OriginalMember(owner = "client!mha", name = "t", descriptor = "Luc;")
    private class30 field6278;

    @OriginalMember(owner = "client!mha", name = "C", descriptor = "Leo;")
    public static class313 field6287 = new class313(9, 2);

    @OriginalMember(owner = "client!mha", name = "g", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!mha", name = "j", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!mha", name = "k", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!mha", name = "m", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!mha", name = "n", descriptor = "I")
    public static int field6272;

    @OriginalMember(owner = "client!mha", name = "o", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!mha", name = "p", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!mha", name = "r", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!mha", name = "s", descriptor = "I")
    public static int field6277;

    @OriginalMember(owner = "client!mha", name = "v", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!mha", name = "x", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!mha", name = "B", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!mha", name = "D", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!mha", name = "F", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!mha", name = "K", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!mha", name = "G", descriptor = "Lwk;")
    private class153 field6291;

    @OriginalMember(owner = "client!mha", name = "I", descriptor = "Z")
    private boolean field6293;

    @OriginalMember(owner = "client!mha", name = "f", descriptor = "[B")
    private byte[] field6264;

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "(B)V")
    public final void method2605(byte arg0) {
        field6265++;
        if (this.field6294 != null) {
            if (this.method1868(true) == null) {
                return;
            }
            if (this.field6297) {
                boolean var2 = true;
                for (class159 var3 = this.field6294.method679((byte) -86); var3 != null; var3 = this.field6294.method681(-30)) {
                    int var5 = (int) var3.field2146;
                    if (this.field6264[var5] == 0) {
                        this.method2612(false, 1, var5);
                    }
                    if (this.field6264[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method1102((byte) 106);
                    }
                }
                while (this.field6291.field2064.length > this.field6296) {
                    if (this.field6291.field2064[this.field6296] == 0) {
                        this.field6296++;
                    } else {
                        if (this.field6267.field8148 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field6264[this.field6296] == 0) {
                            this.method2612(false, 1, this.field6296);
                        }
                        if (this.field6264[this.field6296] == 0) {
                            class159 var4 = new class159();
                            var4.field2146 = this.field6296;
                            var2 = false;
                            this.field6294.method689(var4, 121);
                        }
                        this.field6296++;
                    }
                }
                if (var2) {
                    this.field6297 = false;
                    this.field6296 = 0;
                }
            } else if (this.field6293) {
                boolean var6 = true;
                for (class159 var7 = this.field6294.method679((byte) -86); var7 != null; var7 = this.field6294.method681(-62)) {
                    int var9 = (int) var7.field2146;
                    if (this.field6264[var9] != 1) {
                        this.method2612(false, 2, var9);
                    }
                    if (this.field6264[var9] == 1) {
                        var7.method1102((byte) 97);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field6296 < this.field6291.field2064.length) {
                    if (this.field6291.field2064[this.field6296] == 0) {
                        this.field6296++;
                    } else {
                        if (this.field6266.method57(-20)) {
                            var6 = false;
                            break;
                        }
                        if (this.field6264[this.field6296] != 1) {
                            this.method2612(false, 2, this.field6296);
                        }
                        if (this.field6264[this.field6296] != 1) {
                            class159 var8 = new class159();
                            var8.field2146 = this.field6296;
                            this.field6294.method689(var8, -26);
                            var6 = false;
                        }
                        this.field6296++;
                    }
                }
                if (var6) {
                    this.field6296 = 0;
                    this.field6293 = false;
                }
            } else {
                this.field6294 = null;
            }
        }
        if (this.field6299 && this.field6298 <= class401.method2440(false)) {
            for (class30 var10 = (class30) this.field6281.method1249((byte) -94); var10 != null; var10 = (class30) this.field6281.method1246(true)) {
                if (!var10.field295) {
                    if (var10.field297) {
                        if (!var10.field298) {
                            throw new RuntimeException();
                        }
                        var10.method1102((byte) 120);
                    } else {
                        var10.field297 = true;
                    }
                }
            }
            this.field6298 = class401.method2440(false) + 1000L;
        }
        if (arg0 >= -97) {
            this.field6289 = -24;
        }
    }

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "(Z)I")
    public final int method2606(boolean arg0) {
        field6282++;
        if (this.field6291 == null) {
            return 0;
        } else if (arg0) {
            return -82;
        } else {
            return this.field6291.field2066;
        }
    }

    @OriginalMember(owner = "client!mha", name = "c", descriptor = "(Z)I")
    public final int method2607(boolean arg0) {
        if (arg0) {
            this.method1868(true);
        }
        field6288++;
        return this.field6289;
    }

    @OriginalMember(owner = "client!mha", name = "d", descriptor = "(Z)V")
    public final void method2608(boolean arg0) {
        field6276++;
        if (this.field6294 == null || this.method1868(true) == null) {
            return;
        }
        for (class159 var2 = this.field6292.method679((byte) -86); var2 != null; var2 = this.field6292.method681(-31)) {
            int var3 = (int) var2.field2146;
            if (var3 < 0 || var3 >= this.field6291.field2067 || this.field6291.field2064[var3] == 0) {
                var2.method1102((byte) 81);
            } else {
                if (this.field6264[var3] == 0) {
                    this.method2612(false, 1, var3);
                }
                if (this.field6264[var3] == -1) {
                    this.method2612(false, 2, var3);
                }
                if (this.field6264[var3] == 1) {
                    var2.method1102((byte) 121);
                }
            }
        }
        if (!arg0) {
            field6273 = 0;
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(I)V")
    public final void method2609(int arg0) {
        field6295++;
        if (this.field6270 == null) {
            return;
        }
        this.field6293 = true;
        if (this.field6294 == null) {
            this.field6294 = new class84();
        }
        if (arg0 != 19602) {
            this.field6299 = true;
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(Z)Lwk;")
    public final class153 method1868(boolean arg0) {
        field6290++;
        if (this.field6291 != null) {
            return this.field6291;
        }
        if (!arg0) {
            this.field6283 = null;
        }
        if (this.field6278 == null) {
            if (this.field6266.method56(20)) {
                return null;
            }
            this.field6278 = this.field6266.method52(this.field6284, 255, (byte) 0, true, (byte) -87);
        }
        if (this.field6278.field295) {
            return null;
        }
        byte[] var2 = this.field6278.method171((byte) 90);
        if (this.field6278 instanceof class303) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field6291 = new class153(var2, this.field6275, this.field6285);
                if (this.field6291.field2071 != this.field6279) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field6291 = null;
                if (this.field6266.method56(20)) {
                    this.field6278 = null;
                } else {
                    this.field6278 = this.field6266.method52(this.field6284, 255, (byte) 0, true, (byte) -87);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field6291 = new class153(var2, this.field6275, this.field6285);
            } catch (RuntimeException var4) {
                this.field6266.method65(0);
                this.field6291 = null;
                if (this.field6266.method56(20)) {
                    this.field6278 = null;
                } else {
                    this.field6278 = this.field6266.method52(this.field6284, 255, (byte) 0, true, (byte) -87);
                }
                return null;
            }
            if (this.field6283 != null) {
                this.field6267.method3353(this.field6283, var2, this.field6284, false);
            }
        }
        this.field6278 = null;
        if (this.field6270 != null) {
            this.field6289 = 0;
            this.field6264 = new byte[this.field6291.field2067];
        }
        return this.field6291;
    }

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "(BI)I")
    public final int method1869(byte arg0, int arg1) {
        field6274++;
        class30 var3 = (class30) this.field6281.method1248(121, (long) arg1);
        if (arg0 > -84) {
            return -44;
        } else if (var3 == null) {
            return 0;
        } else {
            return var3.method170(-33);
        }
    }

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "(I)V")
    public static void method2610(int arg0) {
        if (arg0 != 2261) {
            method2613(125, true);
        }
        field6287 = null;
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IB)[B")
    public final byte[] method1866(int arg0, byte arg1) {
        field6271++;
        class30 var3 = this.method2612(false, 0, arg0);
        if (arg1 != -2) {
            this.method2612(false, 61, -78);
        }
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method171((byte) 90);
            var3.method1102((byte) 119);
            return var4;
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(BI)V")
    public final void method1867(byte arg0, int arg1) {
        field6280++;
        if (this.field6270 == null) {
            return;
        }
        if (arg0 <= 20) {
            this.field6294 = null;
        }
        for (class159 var3 = this.field6292.method679((byte) -86); var3 != null; var3 = this.field6292.method681(-42)) {
            if ((long) arg1 == var3.field2146) {
                return;
            }
        }
        class159 var4 = new class159();
        var4.field2146 = arg1;
        this.field6292.method689(var4, 100);
    }

    @OriginalMember(owner = "client!mha", name = "c", descriptor = "(B)I")
    public final int method2611(byte arg0) {
        field6269++;
        if (this.field6291 == null) {
            return 0;
        } else if (this.field6297) {
            class159 var2 = this.field6294.method679((byte) -86);
            if (arg0 > -108) {
                return -108;
            } else if (var2 == null) {
                return 0;
            } else {
                return (int) var2.field2146;
            }
        } else {
            return this.field6291.field2066;
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(ZII)Luc;")
    private final class30 method2612(boolean arg0, int arg1, int arg2) {
        field6286++;
        class30 var4 = (class30) this.field6281.method1248(106, (long) arg2);
        if (arg0) {
            this.method2611((byte) -3);
        }
        if (var4 != null && arg1 == 0 && !var4.field298 && var4.field295) {
            var4.method1102((byte) 123);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field6270 == null || this.field6264[arg2] == -1) {
                    if (this.field6266.method56(20)) {
                        return null;
                    }
                    var4 = this.field6266.method52(arg2, this.field6284, (byte) 2, true, (byte) -87);
                } else {
                    var4 = this.field6267.method3349(this.field6270, arg2, true);
                }
            } else if (arg1 == 1) {
                if (this.field6270 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field6267.method3352(this.field6270, 3, arg2);
            } else if (arg1 == 2) {
                if (this.field6270 == null) {
                    throw new RuntimeException();
                }
                if (this.field6264[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field6266.method57(-20)) {
                    return null;
                }
                var4 = this.field6266.method52(arg2, this.field6284, (byte) 2, false, (byte) -87);
            } else {
                throw new RuntimeException();
            }
            this.field6281.method1247(4070, (long) arg2, var4);
        }
        if (var4.field295) {
            return null;
        }
        byte[] var5 = var4.method171((byte) 90);
        if (!(var4 instanceof class303)) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class445.field6407.reset();
                class445.field6407.update(var5, 0, var5.length - 2);
                int var6 = (int) class445.field6407.getValue();
                if (this.field6291.field2069[arg2] != var6) {
                    throw new RuntimeException();
                }
                if (this.field6291.field2075 != null && this.field6291.field2075[arg2] != null) {
                    byte[] var7 = this.field6291.field2075[arg2];
                    byte[] var8 = class514.method3005(var5, true, var5.length - 2, 0);
                    for (int var9 = 0; var9 < 64; var9++) {
                        if (var7[var9] != var8[var9]) {
                            throw new RuntimeException();
                        }
                    }
                }
                this.field6266.field103 = 0;
                this.field6266.field105 = 0;
            } catch (RuntimeException var17) {
                this.field6266.method65(0);
                var4.method1102((byte) 68);
                if (var4.field298 && !this.field6266.method56(20)) {
                    class197 var10 = this.field6266.method52(arg2, this.field6284, (byte) 2, true, (byte) -87);
                    this.field6281.method1247(4070, (long) arg2, var10);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field6291.field2074[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field6291.field2074[arg2];
            if (this.field6270 != null) {
                this.field6267.method3353(this.field6270, var5, arg2, false);
                if (this.field6264[arg2] != 1) {
                    this.field6289++;
                    this.field6264[arg2] = 1;
                }
            }
            if (!var4.field298) {
                var4.method1102((byte) 62);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class445.field6407.reset();
            class445.field6407.update(var5, 0, var5.length - 2);
            int var11 = (int) class445.field6407.getValue();
            if (this.field6291.field2069[arg2] != var11) {
                throw new RuntimeException();
            }
            if (this.field6291.field2075 != null && this.field6291.field2075[arg2] != null) {
                byte[] var12 = this.field6291.field2075[arg2];
                byte[] var13 = class514.method3005(var5, true, var5.length - 2, 0);
                for (int var14 = 0; var14 < 64; var14++) {
                    if (var12[var14] != var13[var14]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var15 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field6291.field2074[arg2] & 0xFFFF) != var15) {
                throw new RuntimeException();
            }
            if (this.field6264[arg2] != 1) {
                this.field6289++;
                this.field6264[arg2] = 1;
            }
            if (!var4.field298) {
                var4.method1102((byte) 111);
            }
            return var4;
        } catch (Exception var18) {
            this.field6264[arg2] = -1;
            var4.method1102((byte) 83);
            if (var4.field298 && !this.field6266.method56(20)) {
                class197 var16 = this.field6266.method52(arg2, this.field6284, (byte) 2, true, (byte) -87);
                this.field6281.method1247(4070, (long) arg2, var16);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public static final String method2613(int arg0, boolean arg1) {
        field6272++;
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg1) {
            method2610(-102);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class58.field730.method365(class55.field647, (byte) 100) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class58.field732.method365(class55.field647, (byte) 85) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!mha", name = "d", descriptor = "(B)I")
    public final int method2614(byte arg0) {
        field6277++;
        if (this.method1868(true) == null) {
            return this.field6278 == null ? 0 : this.field6278.method170(-58);
        } else {
            if (arg0 > -79) {
                this.field6284 = 70;
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(ILnaa;Lnaa;Lff;Lcr;I[BIZ)V")
    public class435(int arg0, class79 arg1, class79 arg2, class9 arg3, class598 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field6284 = arg0;
        this.field6270 = arg1;
        if (this.field6270 == null) {
            this.field6297 = false;
        } else {
            this.field6297 = true;
            this.field6294 = new class84();
        }
        this.field6267 = arg4;
        this.field6299 = arg8;
        this.field6275 = arg5;
        this.field6279 = arg7;
        this.field6285 = arg6;
        this.field6266 = arg3;
        this.field6283 = arg2;
        if (this.field6283 != null) {
            this.field6278 = this.field6267.method3349(this.field6283, this.field6284, true);
        }
    }
}
