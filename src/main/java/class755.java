import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class755 extends class586 {

    @OriginalMember(owner = "client!nca", name = "D", descriptor = "I")
    private int field10568 = 0;

    @OriginalMember(owner = "client!nca", name = "e", descriptor = "Lhe;")
    private class372 field10543 = new class372(16);

    @OriginalMember(owner = "client!nca", name = "H", descriptor = "I")
    private int field10572 = 0;

    @OriginalMember(owner = "client!nca", name = "G", descriptor = "Lada;")
    private class164 field10571 = new class164();

    @OriginalMember(owner = "client!nca", name = "K", descriptor = "J")
    private long field10575 = 0L;

    @OriginalMember(owner = "client!nca", name = "w", descriptor = "I")
    private int field10561;

    @OriginalMember(owner = "client!nca", name = "p", descriptor = "Lnp;")
    private class492 field10554;

    @OriginalMember(owner = "client!nca", name = "I", descriptor = "Z")
    private boolean field10573;

    @OriginalMember(owner = "client!nca", name = "F", descriptor = "Lada;")
    private class164 field10570;

    @OriginalMember(owner = "client!nca", name = "h", descriptor = "Lhfa;")
    private class312 field10546;

    @OriginalMember(owner = "client!nca", name = "L", descriptor = "Z")
    private boolean field10576;

    @OriginalMember(owner = "client!nca", name = "B", descriptor = "I")
    private int field10566;

    @OriginalMember(owner = "client!nca", name = "n", descriptor = "I")
    private int field10552;

    @OriginalMember(owner = "client!nca", name = "u", descriptor = "Lro;")
    private class2 field10559;

    @OriginalMember(owner = "client!nca", name = "i", descriptor = "[B")
    private byte[] field10547;

    @OriginalMember(owner = "client!nca", name = "s", descriptor = "Lnp;")
    private class492 field10557;

    @OriginalMember(owner = "client!nca", name = "o", descriptor = "Lcu;")
    private class220 field10553;

    @OriginalMember(owner = "client!nca", name = "g", descriptor = "I")
    public static int field10545;

    @OriginalMember(owner = "client!nca", name = "j", descriptor = "I")
    public static int field10548;

    @OriginalMember(owner = "client!nca", name = "k", descriptor = "I")
    public static int field10549;

    @OriginalMember(owner = "client!nca", name = "l", descriptor = "I")
    public static int field10550;

    @OriginalMember(owner = "client!nca", name = "m", descriptor = "I")
    public static int field10551;

    @OriginalMember(owner = "client!nca", name = "q", descriptor = "I")
    public static int field10555;

    @OriginalMember(owner = "client!nca", name = "r", descriptor = "I")
    public static int field10556;

    @OriginalMember(owner = "client!nca", name = "t", descriptor = "I")
    public static int field10558;

    @OriginalMember(owner = "client!nca", name = "v", descriptor = "I")
    public static int field10560;

    @OriginalMember(owner = "client!nca", name = "y", descriptor = "I")
    public static int field10563;

    @OriginalMember(owner = "client!nca", name = "z", descriptor = "I")
    public static int field10564;

    @OriginalMember(owner = "client!nca", name = "A", descriptor = "I")
    public static int field10565;

    @OriginalMember(owner = "client!nca", name = "C", descriptor = "I")
    public static int field10567;

    @OriginalMember(owner = "client!nca", name = "E", descriptor = "I")
    public static int field10569;

    @OriginalMember(owner = "client!nca", name = "x", descriptor = "Luia;")
    private class364 field10562;

    @OriginalMember(owner = "client!nca", name = "J", descriptor = "Z")
    private boolean field10574;

    @OriginalMember(owner = "client!nca", name = "f", descriptor = "[B")
    private byte[] field10544;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method4206(int arg0, int arg1, int arg2) {
        if (arg1 < 31) {
            method4208(39, 54, 68, null);
        }
        field10551++;
        return (arg0 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(B)I", line = 15)
    public final int method4207(byte arg0) {
        field10550++;
        if (this.field10562 == null) {
            return 0;
        } else {
            if (arg0 != 7) {
                this.field10554 = null;
            }
            return this.field10562.field5240;
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(B)Luia;", line = 32)
    public final class364 method3389(byte arg0) {
        field10569++;
        if (this.field10562 != null) {
            return this.field10562;
        }
        if (this.field10553 == null) {
            if (this.field10559.method9(14879)) {
                return null;
            }
            this.field10553 = this.field10559.method19(this.field10561, (byte) 0, arg0 ^ 0x2F, true, 255);
        }
        if (this.field10553.field3226) {
            return null;
        } else if (arg0 == 79) {
            byte[] var2 = this.field10553.method1476(false);
            if (this.field10553 instanceof class370) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field10562 = new class364(var2, this.field10552, this.field10547);
                    if (this.field10562.field5251 != this.field10566) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var3) {
                    this.field10562 = null;
                    if (this.field10559.method9(14879)) {
                        this.field10553 = null;
                    } else {
                        this.field10553 = this.field10559.method19(this.field10561, (byte) 0, 122, true, 255);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field10562 = new class364(var2, this.field10552, this.field10547);
                } catch (RuntimeException var4) {
                    this.field10559.method15((byte) -96);
                    this.field10562 = null;
                    if (this.field10559.method9(14879)) {
                        this.field10553 = null;
                    } else {
                        this.field10553 = this.field10559.method19(this.field10561, (byte) 0, 103, true, 255);
                    }
                    return null;
                }
                if (this.field10557 != null) {
                    this.field10546.method1973(this.field10557, var2, -75, this.field10561);
                }
            }
            if (this.field10554 != null) {
                this.field10544 = new byte[this.field10562.field5247];
                this.field10568 = 0;
            }
            this.field10553 = null;
            return this.field10562;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIILjava/lang/Class;)Loda;", line = 129)
    public static final class119 method4208(int arg0, int arg1, int arg2, Class arg3) {
        class186 var4 = class80.field1136[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class754 var5 = var4.field2830; var5 != null; var5 = var5.field10537) {
            class119 var6 = var5.field10542;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field1628 == arg1 && var6.field1626 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(I)I", line = 154)
    public final int method4209(int arg0) {
        field10560++;
        return arg0 == 9620 ? this.field10568 : -11;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(BI)I", line = 166)
    public final int method3391(byte arg0, int arg1) {
        if (arg0 < 125) {
            return 7;
        } else {
            field10558++;
            class220 var3 = (class220) this.field10543.method2287((long) arg1, (byte) -117);
            return var3 == null ? 0 : var3.method1475(-554);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IB)[B", line = 183)
    public final byte[] method3392(int arg0, byte arg1) {
        field10545++;
        if (arg1 != 4) {
            this.field10546 = null;
        }
        class220 var3 = this.method4215(arg0, 16247, 0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method1476(false);
            var3.method1304((byte) 7);
            return var4;
        }
    }

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "(B)I", line = 204)
    public final int method4210(byte arg0) {
        field10565++;
        if (this.method3389((byte) 79) == null) {
            return this.field10553 == null ? 0 : this.field10553.method1475(-554);
        } else if (arg0 > -22) {
            return -101;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(I)I", line = 225)
    public final int method4211(int arg0) {
        if (arg0 != -14246) {
            this.method3392(87, (byte) 75);
        }
        field10549++;
        if (this.field10562 == null) {
            return 0;
        } else if (this.field10573) {
            class184 var2 = this.field10570.method1195(0);
            return var2 == null ? 0 : (int) var2.field2810;
        } else {
            return this.field10562.field5240;
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZI)V", line = 249)
    public static final void method4212(boolean arg0, int arg1) {
        if (arg0) {
            return;
        }
        field10555++;
        class194 var2 = (class194) class154.field2501.method2287((long) arg1, (byte) -117);
        if (var2 != null) {
            var2.field2936.method1220(-103);
            class226.method1522(-32697, var2.field2938, var2.field2934);
            var2.method1304((byte) 7);
        }
    }

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "(I)V", line = 270)
    public final void method4213(int arg0) {
        field10563++;
        if (this.field10554 == null) {
            return;
        }
        this.field10574 = true;
        if (this.field10570 == null) {
            this.field10570 = new class164();
        }
        if (arg0 != 5064) {
            this.method4207((byte) -33);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(II)V", line = 299)
    public final void method3388(int arg0, int arg1) {
        field10564++;
        if (this.field10554 == null) {
            return;
        }
        if (arg1 < 104) {
            this.method3389((byte) -65);
        }
        for (class184 var3 = this.field10571.method1195(0); var3 != null; var3 = this.field10571.method1201(2)) {
            if (((long) arg0) == var3.field2810) {
                return;
            }
        }
        class184 var4 = new class184();
        var4.field2810 = arg0;
        this.field10571.method1203(var4, (byte) -88);
    }

    @OriginalMember(owner = "client!nca", name = "d", descriptor = "(I)V", line = 332)
    public final void method4214(int arg0) {
        if (arg0 != 31884) {
            this.method4216(-108);
        }
        field10567++;
        if (this.field10570 != null) {
            if (this.method3389((byte) 79) == null) {
                return;
            }
            if (this.field10573) {
                boolean var2 = true;
                for (class184 var3 = this.field10570.method1195(0); var3 != null; var3 = this.field10570.method1201(2)) {
                    int var5 = (int) var3.field2810;
                    if (this.field10544[var5] == 0) {
                        this.method4215(var5, 16247, 1);
                    }
                    if (this.field10544[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method1304((byte) 7);
                    }
                }
                while (this.field10562.field5243.length > this.field10572) {
                    if (this.field10562.field5243[this.field10572] == 0) {
                        this.field10572++;
                    } else {
                        if (this.field10546.field4413 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field10544[this.field10572] == 0) {
                            this.method4215(this.field10572, 16247, 1);
                        }
                        if (this.field10544[this.field10572] == 0) {
                            class184 var4 = new class184();
                            var4.field2810 = this.field10572;
                            var2 = false;
                            this.field10570.method1203(var4, (byte) -42);
                        }
                        this.field10572++;
                    }
                }
                if (var2) {
                    this.field10572 = 0;
                    this.field10573 = false;
                }
            } else if (this.field10574) {
                boolean var6 = true;
                for (class184 var7 = this.field10570.method1195(0); var7 != null; var7 = this.field10570.method1201(arg0 - 31882)) {
                    int var9 = (int) var7.field2810;
                    if (this.field10544[var9] != 1) {
                        this.method4215(var9, 16247, 2);
                    }
                    if (this.field10544[var9] == 1) {
                        var7.method1304((byte) 7);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field10572 < this.field10562.field5243.length) {
                    if (this.field10562.field5243[this.field10572] == 0) {
                        this.field10572++;
                    } else {
                        if (this.field10559.method14((byte) 25)) {
                            var6 = false;
                            break;
                        }
                        if (this.field10544[this.field10572] != 1) {
                            this.method4215(this.field10572, 16247, 2);
                        }
                        if (this.field10544[this.field10572] != 1) {
                            class184 var8 = new class184();
                            var8.field2810 = this.field10572;
                            var6 = false;
                            this.field10570.method1203(var8, (byte) 116);
                        }
                        this.field10572++;
                    }
                }
                if (var6) {
                    this.field10574 = false;
                    this.field10572 = 0;
                }
            } else {
                this.field10570 = null;
            }
        }
        if (!this.field10576 || class524.method3075(18) < this.field10575) {
            return;
        }
        for (class220 var10 = (class220) this.field10543.method2283(false); var10 != null; var10 = (class220) this.field10543.method2282((byte) 51)) {
            if (!var10.field3226) {
                if (var10.field3224) {
                    if (!var10.field3228) {
                        throw new RuntimeException();
                    }
                    var10.method1304((byte) 7);
                } else {
                    var10.field3224 = true;
                }
            }
        }
        this.field10575 = class524.method3075(arg0 ^ 0x7C9E) + 1000L;
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(III)Lcu;", line = 512)
    private final class220 method4215(int arg0, int arg1, int arg2) {
        if (arg1 != 16247) {
            this.method4210((byte) 27);
        }
        field10556++;
        class220 var4 = (class220) this.field10543.method2287((long) arg0, (byte) -117);
        if (var4 != null && arg2 == 0 && !var4.field3228 && var4.field3226) {
            var4.method1304((byte) 7);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field10554 == null || this.field10544[arg0] == -1) {
                    if (this.field10559.method9(14879)) {
                        return null;
                    }
                    var4 = this.field10559.method19(arg0, (byte) 2, arg1 ^ 0x3F1C, true, this.field10561);
                } else {
                    var4 = this.field10546.method1969(true, this.field10554, arg0);
                }
            } else if (arg2 == 1) {
                if (this.field10554 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field10546.method1972(this.field10554, 4706, arg0);
            } else if (arg2 == 2) {
                if (this.field10554 == null) {
                    throw new RuntimeException();
                }
                if (this.field10544[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field10559.method14((byte) 25)) {
                    return null;
                }
                var4 = this.field10559.method19(arg0, (byte) 2, 98, false, this.field10561);
            } else {
                throw new RuntimeException();
            }
            this.field10543.method2278((byte) -98, (long) arg0, var4);
        }
        if (var4.field3226) {
            return null;
        }
        byte[] var5 = var4.method1476(false);
        if (!var4 instanceof class370) {
            try {
                label159: {
                    if (var5 != null && var5.length > 2) {
                        class664.field9315.reset();
                        class664.field9315.update(var5, 0, var5.length - 2);
                        int var12 = (int) class664.field9315.getValue();
                        if (this.field10562.field5252[arg0] != var12) {
                            throw new RuntimeException();
                        }
                        if (this.field10562.field5253 == null || this.field10562.field5253[arg0] == null) {
                            break label159;
                        }
                        byte[] var13 = this.field10562.field5253[arg0];
                        byte[] var14 = class587.method3396(0, var5, var5.length - 2, (byte) 120);
                        int var15 = 0;
                        while (true) {
                            if (var15 >= 64) {
                                break label159;
                            }
                            if (var13[var15] != var14[var15]) {
                                throw new RuntimeException();
                            }
                            var15++;
                        }
                    }
                    throw new RuntimeException();
                }
                this.field10559.field33 = 0;
                this.field10559.field36 = 0;
            } catch (RuntimeException var18) {
                this.field10559.method15((byte) -118);
                var4.method1304((byte) 7);
                if (var4.field3228 && !this.field10559.method9(14879)) {
                    class234 var16 = this.field10559.method19(arg0, (byte) 2, 116, true, this.field10561);
                    this.field10543.method2278((byte) -20, (long) arg0, var16);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field10562.field5241[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field10562.field5241[arg0];
            if (this.field10554 != null) {
                this.field10546.method1973(this.field10554, var5, 89, arg0);
                if (this.field10544[arg0] != 1) {
                    this.field10568++;
                    this.field10544[arg0] = 1;
                }
            }
            if (!var4.field3228) {
                var4.method1304((byte) 7);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class664.field9315.reset();
            class664.field9315.update(var5, 0, var5.length - 2);
            int var6 = (int) class664.field9315.getValue();
            if (this.field10562.field5252[arg0] != var6) {
                throw new RuntimeException();
            }
            if (this.field10562.field5253 != null && this.field10562.field5253[arg0] != null) {
                byte[] var7 = this.field10562.field5253[arg0];
                byte[] var8 = class587.method3396(0, var5, var5.length - 2, (byte) 110);
                for (int var9 = 0; var9 < 64; var9++) {
                    if (var7[var9] != var8[var9]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var10 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field10562.field5241[arg0] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field10544[arg0] != 1) {
                this.field10568++;
                this.field10544[arg0] = 1;
            }
            if (!var4.field3228) {
                var4.method1304((byte) 7);
            }
            return var4;
        } catch (Exception var17) {
            this.field10544[arg0] = -1;
            var4.method1304((byte) 7);
            if (var4.field3228 && !this.field10559.method9(arg1 - 1368)) {
                class234 var11 = this.field10559.method19(arg0, (byte) 2, 102, true, this.field10561);
                this.field10543.method2278((byte) -19, (long) arg0, var11);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!nca", name = "e", descriptor = "(I)V", line = 780)
    public final void method4216(int arg0) {
        field10548++;
        if (arg0 != -16217) {
            this.field10566 = -113;
        }
        if (this.field10570 == null || this.method3389((byte) 79) == null) {
            return;
        }
        for (class184 var2 = this.field10571.method1195(0); var2 != null; var2 = this.field10571.method1201(arg0 ^ 0xFFFFC0A5)) {
            int var3 = (int) var2.field2810;
            if (var3 < 0 || var3 >= this.field10562.field5247 || this.field10562.field5243[var3] == 0) {
                var2.method1304((byte) 7);
            } else {
                if (this.field10544[var3] == 0) {
                    this.method4215(var3, 16247, 1);
                }
                if (this.field10544[var3] == -1) {
                    this.method4215(var3, 16247, 2);
                }
                if (this.field10544[var3] == 1) {
                    var2.method1304((byte) 7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(ILnp;Lnp;Lro;Lhfa;I[BIZ)V", line = 851)
    public class755(int arg0, class492 arg1, class492 arg2, class2 arg3, class312 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field10561 = arg0;
        this.field10554 = arg1;
        if (this.field10554 == null) {
            this.field10573 = false;
        } else {
            this.field10573 = true;
            this.field10570 = new class164();
        }
        this.field10546 = arg4;
        this.field10576 = arg8;
        this.field10566 = arg7;
        this.field10552 = arg5;
        this.field10559 = arg3;
        this.field10547 = arg6;
        this.field10557 = arg2;
        if (this.field10557 != null) {
            this.field10553 = this.field10546.method1969(true, this.field10557, this.field10561);
        }
    }
}
