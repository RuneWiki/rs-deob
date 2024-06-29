import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class250 {

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field3410 = 0;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "Laa;")
    public static class76 field3414 = new class76(56, -1);

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "Laa;")
    public static class76 field3417 = new class76(38, -1);

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "[S")
    public static short[] field3418 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "Luv;")
    public static class2 field3419;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    private int field3407;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public int field3412;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1495(boolean arg0, int arg1) {
        field3411++;
        if (class36.field502[arg1]) {
            return true;
        } else if (class433.field6407.method546(arg1, 122)) {
            int var2 = class433.field6407.method536(false, arg1);
            if (var2 == 0) {
                class36.field502[arg1] = true;
                return true;
            }
            if (class174.field2549[arg1] == null) {
                class174.field2549[arg1] = new class310[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class174.field2549[arg1][var3] == null) {
                    byte[] var4 = class433.field6407.method541(var3, arg1, (byte) -122);
                    if (var4 != null) {
                        class310 var5 = class174.field2549[arg1][var3] = new class310();
                        var5.field4643 = (arg1 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method1946(new class468(var4), 3729);
                    }
                }
            }
            class36.field502[arg1] = arg0;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)I")
    public final int method1496(byte arg0) {
        int var2 = -40 / ((arg0 - 7) / 48);
        field3413++;
        return this.field3412 & 0x3FFF;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)Z")
    public static final boolean method1497(int arg0, int arg1) {
        if (arg1 < 112) {
            method1500(-28);
        }
        field3406++;
        return arg0 == 9 || arg0 == 10 || arg0 == 11;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BIII)Z")
    public final boolean method1498(byte arg0, int arg1, int arg2, int arg3) {
        field3409++;
        int var5 = this.field3407;
        if (this.field3412 == arg3 && this.field3407 == 0) {
            return false;
        }
        if (arg0 != 76) {
            field3417 = null;
        }
        boolean var6;
        if (this.field3407 == 0) {
            if (this.field3412 < arg3 && (this.field3412 + arg1) >= arg3 || arg3 < this.field3412 && arg3 >= this.field3412 - arg1) {
                this.field3412 = arg3;
                return false;
            }
            var6 = true;
        } else if (this.field3407 > 0 && this.field3412 < arg3) {
            int var7 = this.field3407 * this.field3407 / (arg1 * 2);
            int var8 = this.field3412 + var7;
            if (var8 < arg3 && var8 >= this.field3412) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field3407 < 0 && arg3 < this.field3412) {
            int var9 = this.field3407 * this.field3407 / (arg1 * 2);
            int var10 = this.field3412 - var9;
            if (arg3 < var10 && var10 <= this.field3412) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (this.field3412 < arg3) {
                this.field3407 += arg1;
                if (arg2 != 0 && arg2 < this.field3407) {
                    this.field3407 = arg2;
                }
            } else {
                this.field3407 -= arg1;
                if (arg2 != 0 && (-arg2) > this.field3407) {
                    this.field3407 = -arg2;
                }
            }
            if (this.field3407 != var5) {
                int var11 = this.field3407 * this.field3407 / (arg1 * 2);
                if (this.field3412 >= arg3) {
                    if (this.field3412 > arg3 && arg3 > (this.field3412 - var11)) {
                        this.field3407 = var5;
                    }
                } else if ((this.field3412 + var11) > arg3) {
                    this.field3407 = var5;
                }
            }
        } else if (this.field3407 <= 0) {
            this.field3407 += arg1;
            if (this.field3407 > 0) {
                this.field3407 = 0;
            }
        } else {
            this.field3407 -= arg1;
            if (this.field3407 < 0) {
                this.field3407 = 0;
            }
        }
        this.field3412 += this.field3407 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(ZI)V")
    public final void method1499(boolean arg0, int arg1) {
        this.field3412 = arg1;
        field3408++;
        if (!arg0) {
            this.field3407 = 0;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    public static void method1500(int arg0) {
        field3417 = null;
        field3414 = null;
        if (arg0 == -31505) {
            field3419 = null;
            field3418 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
    public static final void method1501(int arg0) {
        if (arg0 != -23090) {
            return;
        }
        field3416++;
        for (class22 var1 = (class22) class110.field1644.method2957(-108); var1 != null; var1 = (class22) class110.field1644.method2947(110)) {
            if (var1.field325 > 0) {
                var1.field325--;
            }
            if (var1.field325 != 0) {
                if (var1.field318 > 0) {
                    var1.field318--;
                }
                if (var1.field318 == 0 && var1.field326 >= 1 && var1.field321 >= 1 && var1.field326 <= (class50.field640 - 2) && (class448.field6611 - 2) >= var1.field321 && (var1.field320 < 0 || class486.method2896(var1.field319, var1.field320, (byte) 45))) {
                    class233.method1443(var1.field320, var1.field321, var1.field327, -1, var1.field322, var1.field319, var1.field317, 0, var1.field326);
                    var1.field318 = -1;
                    if (var1.field330 == var1.field320 && var1.field330 == -1) {
                        var1.method876((byte) -96);
                    } else if (var1.field330 == var1.field320 && var1.field324 == var1.field322 && var1.field328 == var1.field319) {
                        var1.method876((byte) -96);
                    }
                }
            } else if (var1.field330 < 0 || class486.method2896(var1.field328, var1.field330, (byte) 103)) {
                class233.method1443(var1.field330, var1.field321, var1.field327, -1, var1.field324, var1.field328, var1.field317, 0, var1.field326);
                var1.method876((byte) -96);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V")
    public final void method1502(int arg0) {
        if (arg0 != 0) {
            this.field3407 = -111;
        }
        field3415++;
        this.field3412 &= 0x3FFF;
    }

    static {
        new class347("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
        field3419 = new class2(15, 3);
        new class347("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
    }
}
