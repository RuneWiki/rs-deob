import java.applet.Applet;
import java.awt.Container;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class256 implements class190 {

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "Z")
    private boolean field4388 = true;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "Lke;")
    public static class256 field4382 = class316.method2202("::fpsoff", 27626);

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "[I")
    public static int[] field4408 = new int[128];

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "[I")
    public static int[] field4378 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public int field4384;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!ke", name = "X", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!ke", name = "Y", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!ke", name = "Z", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!ke", name = "ab", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!ke", name = "bb", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!ke", name = "cb", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!ke", name = "db", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!ke", name = "eb", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!ke", name = "fb", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!ke", name = "gb", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!ke", name = "hb", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!ke", name = "ib", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!ke", name = "jb", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "[B")
    public byte[] field4380;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)Z", line = 4)
    private final boolean method1760(int arg0, int arg1) {
        field4390++;
        if (arg1 != -44) {
            return false;
        }
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field4384; var6++) {
            int var7 = this.field4380[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var3 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                return false;
            }
            if (var7 >= arg0) {
                return false;
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if (var8 / arg0 != var5) {
                return false;
            }
            var4 = true;
            var5 = var8;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)Lke;", line = 82)
    public final class256 method1761(int arg0) {
        class256 var2 = new class256();
        var2.field4384 = this.field4384;
        field4397++;
        boolean var3 = true;
        var2.field4380 = new byte[this.field4384];
        int var4 = 22 % ((-arg0 - 42) / 37);
        for (int var5 = 0; var5 < this.field4384; var5++) {
            byte var6 = this.field4380[var5];
            if (var6 == 95) {
                var3 = true;
                var2.field4380[var5] = 32;
            } else if (var6 >= 97 && var6 <= 122 && var3) {
                var2.field4380[var5] = (byte) (var6 - 32);
                var3 = false;
            } else {
                var3 = false;
                var2.field4380[var5] = var6;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILjava/applet/Applet;)V", line = 126)
    public final void method1762(int arg0, Applet arg1) throws Throwable {
        field4409++;
        if (arg0 > 113) {
            String var3 = new String(this.field4380, 0, this.field4384);
            class226.method1541((byte) 89, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)Lke;", line = 140)
    public final class256 method1763(byte arg0) {
        field4402++;
        if (!this.field4388) {
            throw new IllegalArgumentException();
        }
        if (arg0 > -66) {
            this.method1768(true);
        }
        if (this.field4380.length != this.field4384) {
            byte[] var2 = new byte[this.field4384];
            class299.method2092(this.field4380, 0, var2, 0, this.field4384);
            this.field4380 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILke;ZI)Lke;", line = 166)
    public final class256 method1764(int arg0, class256 arg1, boolean arg2, int arg3) {
        field4432++;
        if (!this.field4388) {
            throw new IllegalArgumentException();
        } else if (arg3 >= 0 && arg0 >= arg3 && arg0 <= arg1.field4384) {
            if (this.field4384 + arg0 - arg3 > this.field4380.length) {
                int var5;
                for (var5 = 1; var5 < (this.field4384 + arg1.field4384); var5 += var5) {
                }
                byte[] var6 = new byte[var5];
                class299.method2092(this.field4380, 0, var6, 0, this.field4384);
                this.field4380 = var6;
            }
            if (arg2) {
                field4393 = -47;
            }
            class299.method2092(arg1.field4380, arg3, this.field4380, this.field4384, arg0 - arg3);
            this.field4384 += arg0 - arg3;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)Lke;", line = 218)
    public final class256 method1765(int arg0, byte arg1) {
        if (arg1 != 109) {
            this.method1771(true);
        }
        field4413++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class256 var3 = new class256();
        var3.field4380 = new byte[this.field4384 + 1];
        var3.field4384 = this.field4384 + 1;
        class299.method2092(this.field4380, 0, var3.field4380, 0, this.field4384);
        var3.field4380[this.field4384] = (byte) arg0;
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "toString", descriptor = "()Ljava/lang/String;", line = 239)
    public final String toString() {
        field4379++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/applet/Applet;I)Ljava/lang/Object;", line = 254)
    public final Object method1766(Applet arg0, int arg1) throws Throwable {
        String var3 = new String(this.field4380, arg1, this.field4384);
        field4407++;
        Object var4 = class226.method1540(arg0, var3, false);
        if (var4 instanceof String) {
            byte[] var5 = ((String) var4).getBytes();
            var4 = class49.method392(var5, (byte) 110, 0, var5.length);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLke;)Z", line = 273)
    public final boolean method1767(byte arg0, class256 arg1) {
        field4394++;
        if (arg1.field4384 > this.field4384) {
            return false;
        }
        for (int var3 = 0; var3 < arg1.field4384; var3++) {
            if (this.field4380[var3] != arg1.field4380[var3]) {
                return false;
            }
        }
        if (arg0 >= -30) {
            this.method1765(-54, (byte) 80);
        }
        return true;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)Lke;", line = 300)
    public final class256 method1768(boolean arg0) {
        int var2 = 0;
        field4389++;
        while (var2 < this.field4384 && (this.field4380[var2] >= 0 && this.field4380[var2] <= 32 || (this.field4380[var2] & 0xFF) == 160)) {
            var2++;
        }
        int var3;
        for (var3 = this.field4384; var3 > var2 && (this.field4380[var3 - 1] >= 0 && this.field4380[var3 - 1] <= 32 || (this.field4380[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (arg0) {
            this.method1799(77);
        }
        if (var2 == 0 && this.field4384 == var3) {
            return this;
        }
        class256 var4 = new class256();
        var4.field4384 = var3 - var2;
        var4.field4380 = new byte[var4.field4384];
        for (int var5 = 0; var5 < var4.field4384; var5++) {
            var4.field4380[var5] = this.field4380[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lke;B)Z", line = 338)
    public final boolean method1769(class256 arg0, byte arg1) {
        field4405++;
        if (arg0 == null) {
            return false;
        }
        if (arg1 <= 30) {
            field4382 = (class256) null;
        }
        if (this.field4384 != arg0.field4384) {
            return false;
        }
        for (int var3 = 0; var3 < this.field4384; var3++) {
            byte var4 = this.field4380[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            byte var5 = arg0.field4380[var3];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 != var5) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)I", line = 381)
    public final int method1770(int arg0) {
        if (arg0 != 0) {
            this.method1798(88, (Applet) null);
        }
        field4404++;
        return this.method1804(10, (byte) 63);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)Lke;", line = 399)
    public final class256 method1771(boolean arg0) {
        field4385++;
        class256 var2 = new class256();
        var2.field4384 = this.field4384;
        var2.field4380 = new byte[this.field4384];
        if (arg0) {
            this.field4384 = 57;
        }
        for (int var3 = 0; var3 < this.field4384; var3++) {
            byte var4 = this.field4380[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field4380[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(BLke;)I", line = 432)
    public final int method1772(byte arg0, class256 arg1) {
        field4400++;
        int var3;
        if (this.field4384 <= arg1.field4384) {
            var3 = this.field4384;
        } else {
            var3 = arg1.field4384;
        }
        if (arg0 <= 91) {
            field4382 = (class256) null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg1.field4380[var4] & 0xFF) > (this.field4380[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field4380[var4] & 0xFF) > (arg1.field4380[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg1.field4384 > this.field4384) {
            return -1;
        } else if (this.field4384 > arg1.field4384) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZIZIIZI)V", line = 475)
    public static final void method1773(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field4399++;
        if (arg2) {
            class253.method1724();
        }
        if (class317.field5460 != null && (arg4 != 3 || class141.field2479 != arg1 || class145.field2566 != arg6)) {
            class51.method405(class272.field4658, class317.field5460, -4);
            class317.field5460 = null;
        }
        if (arg4 == 3 && class317.field5460 == null) {
            class317.field5460 = class101.method728(-13, class272.field4658, 0, 0, arg1, arg6);
            if (class317.field5460 != null) {
                class145.field2566 = arg6;
                class141.field2479 = arg1;
                class183.method1337(false, class272.field4658);
            }
        }
        if (arg4 == 3 && class317.field5460 == null) {
            method1773(arg0, -1, true, arg3, class237.field4037, true, -1);
        } else if (!arg0) {
            Container var7;
            if (class317.field5460 != null) {
                var7 = class317.field5460;
            } else if (class198.field3627 == null) {
                var7 = class272.field4658.field52;
            } else {
                var7 = class198.field3627;
            }
            class308.field5326 = var7.getSize().width;
            class186.field3269 = var7.getSize().height;
            if (class198.field3627 == var7) {
                Insets var8 = class198.field3627.getInsets();
                class186.field3269 -= var8.top + var8.bottom;
                class308.field5326 -= var8.right + var8.left;
            }
            if (arg4 < 2) {
                class112.field1969 = 765;
                class264.field4532 = 0;
                class124.field2200 = 503;
                class100.field1775 = (class308.field5326 - 765) / 2;
            } else {
                class124.field2200 = class186.field3269;
                class112.field1969 = class308.field5326;
                class264.field4532 = 0;
                class100.field1775 = 0;
            }
            if (arg5) {
                class114.method785(class186.field3271, !arg0);
                class251.method1686((byte) -112, class186.field3271);
                if (class17.field232 != null) {
                    class17.field232.method883(class186.field3271, 0);
                }
                class307.field5289.method853(true);
                class27.method186((byte) -72, class186.field3271);
                class1.method9(class186.field3271, true);
                if (class17.field232 != null) {
                    class17.field232.method882(72, class186.field3271);
                }
            } else {
                if (class253.field4323) {
                    class253.method1713(class112.field1969, class124.field2200);
                }
                class186.field3271.setSize(class112.field1969, class124.field2200);
                if (class198.field3627 == var7) {
                    Insets var9 = class198.field3627.getInsets();
                    class186.field3271.setLocation(var9.left + class100.field1775, var9.top - -class264.field4532);
                } else {
                    class186.field3271.setLocation(class100.field1775, class264.field4532);
                }
            }
            if (arg4 == 0 && arg3 > 0) {
                class253.method1736(class186.field3271);
            }
            if (arg2 && arg4 > 0) {
                class186.field3271.setIgnoreRepaint(true);
                if (!class48.field873) {
                    class205.method1457();
                    class108.field1920 = null;
                    class108.field1920 = class177.method1280(class112.field1969, class186.field3271, class124.field2200, 8);
                    class178.method1295();
                    if (class86.field1550 == 5) {
                        class96.method695(class17.field215, (byte) 58, true);
                    } else {
                        class159.method1176(false, class177.field3127, (byte) 99);
                    }
                    try {
                        Graphics var10 = class186.field3271.getGraphics();
                        class108.field1920.method452(0, (byte) -16, 0, var10);
                    } catch (Exception var14) {
                    }
                    class124.method862((byte) 96);
                    if (arg3 == 0) {
                        class108.field1920 = class177.method1280(765, class186.field3271, 503, 8);
                    } else {
                        class108.field1920 = null;
                    }
                    class82 var12 = class272.field4658.method36(-116, class307.field5289.getClass());
                    while (var12.field1500 == 0) {
                        class46.method381(100L, -126);
                    }
                    if (var12.field1500 == 1) {
                        class48.field873 = true;
                    }
                }
                if (class48.field873) {
                    class253.method1740(class186.field3271, class115.field2023 * 2);
                }
            }
            if (class253.field4323 || arg4 <= 0) {
                if (arg4 > 0 && arg3 == 0) {
                    class165.field2931.setPriority(5);
                    class108.field1920 = null;
                    class89.method654();
                    ((class27) class136.field2373).method203(200, 10);
                    if (class193.field3531) {
                        class136.method976(0.7F);
                    }
                    class301.method2102((byte) 122);
                } else if (arg4 == 0 && arg3 > 0) {
                    class165.field2931.setPriority(1);
                    class108.field1920 = class177.method1280(765, class186.field3271, 503, 8);
                    class89.method658();
                    class283.method1982();
                    ((class27) class136.field2373).method203(20, 10);
                    if (class193.field3531) {
                        if (class106.field1895 == 1) {
                            class136.method976(0.9F);
                        }
                        if (class106.field1895 == 2) {
                            class136.method976(0.8F);
                        }
                        if (class106.field1895 == 3) {
                            class136.method976(0.7F);
                        }
                        if (class106.field1895 == 4) {
                            class136.method976(0.6F);
                        }
                    }
                    class113.method778();
                    class301.method2102((byte) 127);
                }
                class132.field2307 = !class216.method1512(128);
                if (arg2) {
                    class320.method2228(false);
                }
                if (arg4 < 2) {
                    class282.field4905 = false;
                } else {
                    class282.field4905 = true;
                }
                if (class211.field3803 != -1) {
                    class159.method1177(true, -1);
                }
                if (class196.field3586 != null && (class86.field1550 == 30 || class86.field1550 == 25)) {
                    class99.method710((byte) -56);
                }
                for (int var13 = 0; var13 < 100; var13++) {
                    class53.field974[var13] = true;
                }
                class105.field1889 = true;
            } else {
                method1773(arg0, -1, true, arg3, 0, true, -1);
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V", line = 719)
    public final void method1774(Graphics arg0, byte arg1, int arg2, int arg3) {
        String var5;
        try {
            var5 = new String(this.field4380, 0, this.field4384, "ISO-8859-1");
            if (arg1 != 66) {
                this.method1787(-67);
            }
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field4380, 0, this.field4384);
        }
        arg0.drawString(var5, arg3, arg2);
        field4425++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)V", line = 745)
    public final void method1775(byte arg0, int arg1) {
        if (arg0 <= 35) {
            this.field4380 = (byte[]) null;
        }
        field4439++;
        if (!this.field4388) {
            throw new IllegalArgumentException();
        } else if (arg1 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (this.field4380.length < arg1) {
                int var3;
                for (var3 = 1; var3 < arg1; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class299.method2092(this.field4380, 0, var4, 0, this.field4384);
                this.field4380 = var4;
            }
            for (int var5 = this.field4384; var5 < arg1; var5++) {
                this.field4380[var5] = 32;
            }
            this.field4384 = arg1;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V", line = 798)
    public static void method1776(byte arg0) {
        if (arg0 != -18) {
            method1773(false, -100, false, 97, -58, true, 102);
        }
        field4378 = null;
        field4408 = null;
        field4382 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)Lke;", line = 817)
    public final class256 method1777(int arg0, int arg1, int arg2) {
        if (arg1 != 25163) {
            this.method1784((byte) 95, -23);
        }
        field4435++;
        class256 var4 = new class256();
        var4.field4380 = new byte[arg0 - arg2];
        var4.field4384 = arg0 - arg2;
        class299.method2092(this.field4380, arg2, var4.field4380, 0, var4.field4384);
        return var4;
    }

    @OriginalMember(owner = "client!ke", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 840)
    public final boolean equals(Object arg0) {
        field4421++;
        if (!(arg0 instanceof class256)) {
            throw new IllegalArgumentException();
        }
        return this.method1806(false, (class256) arg0);
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(B)[B", line = 862)
    public final byte[] method1778(byte arg0) {
        field4387++;
        byte[] var2 = new byte[this.field4384];
        class299.method2092(this.field4380, 0, var2, 0, this.field4384);
        int var3 = -71 % ((27 - arg0) / 56);
        return var2;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(Lke;B)I", line = 883)
    public final int method1779(class256 arg0, byte arg1) {
        field4417++;
        if (arg1 != -116) {
            this.method1797(-88);
        }
        return this.method1783(-1, 0, arg0);
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(Z)J", line = 896)
    public final long method1780(boolean arg0) {
        field4415++;
        long var2 = 0L;
        int var4 = 0;
        if (!arg0) {
            this.method1775((byte) 96, 29);
        }
        while (var4 < this.field4384 && var4 < 12) {
            byte var5 = this.field4380[var4];
            var2 *= 37L;
            if (var5 >= 65 && var5 <= 90) {
                var2 += (long) (var5 + 1 - 65);
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += (long) (var5 + 1 - 97);
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += (long) (var5 + 27 - 48);
            }
            var4++;
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(Z)Lke;", line = 935)
    public final class256 method1781(boolean arg0) {
        if (!arg0) {
            this.method1767((byte) 40, (class256) null);
        }
        class256 var2 = new class256();
        var2.field4384 = this.field4384;
        var2.field4380 = new byte[var2.field4384];
        field4420++;
        for (int var3 = 0; var3 < this.field4384; var3++) {
            var2.field4380[this.field4384 - var3 - 1] = this.field4380[var3];
        }
        return var2;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLke;Lke;)Lke;", line = 962)
    public final class256 method1782(byte arg0, class256 arg1, class256 arg2) {
        field4411++;
        int var4 = this.field4384;
        int var5 = 0;
        int var6 = arg2.field4384 - arg1.field4384;
        while (true) {
            int var7 = this.method1783(-1, var5, arg1);
            if (var7 < 0) {
                class256 var8 = class99.method711((byte) -122, var4);
                int var9 = 0;
                int var10 = -111 / ((-arg0 - 84) / 38);
                while (true) {
                    int var11 = this.method1783(-1, var9, arg1);
                    if (var11 < 0) {
                        while (this.field4384 > var9) {
                            var8.method1810(this.field4380[var9++] & 0xFF, -9);
                        }
                        return var8;
                    }
                    while (var9 < var11) {
                        var8.method1810(this.field4380[var9++] & 0xFF, -126);
                    }
                    var8.method1793((byte) 37, arg2);
                    var9 += arg1.field4384;
                }
            }
            var5 = arg1.field4384 + var7;
            var4 += var6;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILke;)I", line = 1015)
    public final int method1783(int arg0, int arg1, class256 arg2) {
        int var4 = arg2.field4384;
        field4419++;
        if (this.field4384 <= arg1) {
            return var4 == 0 ? this.field4384 : -1;
        }
        if (arg0 < ~arg1) {
            arg1 = 0;
        }
        if (var4 == 0) {
            return arg1;
        }
        byte[] var5 = arg2.field4380;
        int var6 = this.field4384 - var4;
        byte var7 = var5[0];
        for (int var8 = arg1; var8 <= var6; var8++) {
            if (this.field4380[var8] != var7) {
                do {
                    var8++;
                    if (var8 > var6) {
                        return -1;
                    }
                } while (this.field4380[var8] != var7);
            }
            boolean var9 = true;
            int var10 = var8 + 1;
            for (int var11 = 1; var11 < var4; var11++) {
                if (this.field4380[var10] != var5[var11]) {
                    var9 = false;
                    break;
                }
                var10++;
            }
            if (var9) {
                return var8;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(BI)[Lke;", line = 1096)
    public final class256[] method1784(byte arg0, int arg1) {
        field4401++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4384; var4++) {
            if (this.field4380[var4] == arg1) {
                var3++;
            }
        }
        class256[] var5 = new class256[var3 + 1];
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        }
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = 0; this.field4380[var7 + var9] != arg1; var9++) {
            }
            var5[var6++] = this.method1777(var7 + var9, 25163, var7);
            var7 += var9 + 1;
        }
        if (arg0 < 121) {
            this.field4388 = true;
        }
        var5[var3] = this.method1777(this.field4384, 25163, var7);
        return var5;
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(Z)Z", line = 1149)
    public final boolean method1785(boolean arg0) {
        if (arg0) {
            this.method1810(10, -3);
        }
        field4438++;
        return this.method1760(10, -44);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)I", line = 1160)
    public final int method1786(int arg0, int arg1) {
        if (arg0 == -751) {
            field4436++;
            return this.field4380[arg1] & 0xFF;
        } else {
            return -23;
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)Lke;", line = 1173)
    public final class256 method1787(int arg0) {
        field4403++;
        if (arg0 != -1) {
            field4428 = -71;
        }
        long var2 = this.method1792(false);
        synchronized (ke.class) {
            if (class98.field1761 == null) {
                class98.field1761 = new class254(4096);
            } else {
                for (class14 var5 = (class14) class98.field1761.method1744((byte) 124, var2); var5 != null; var5 = (class14) class98.field1761.method1746((byte) 9)) {
                    if (this.method1806(false, var5.field184)) {
                        return var5.field184;
                    }
                }
            }
            class14 var6 = new class14();
            var6.field184 = this;
            this.field4388 = false;
            class98.field1761.method1749(true, var6, var2);
            return this;
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)Lke;", line = 1216)
    public final class256 method1788(int arg0, int arg1) {
        field4434++;
        if (arg0 != 25610) {
            field4382 = (class256) null;
        }
        return this.method1777(this.field4384, 25163, arg1);
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(Lke;B)Z", line = 1227)
    public final boolean method1789(class256 arg0, byte arg1) {
        field4422++;
        if (this.field4384 < arg0.field4384) {
            return false;
        }
        int var3 = this.field4384 - arg0.field4384;
        for (int var4 = 0; var4 < arg0.field4384; var4++) {
            if (this.field4380[var4 + var3] != arg0.field4380[var4]) {
                return false;
            }
        }
        if (arg1 == 120) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(II)V", line = 1265)
    public static final void method1790(int arg0, int arg1) {
        class167 var2 = class129.field2261;
        synchronized (class129.field2261) {
            class31.field500 = arg1;
            if (arg0 != 18026) {
                method1790(118, 86);
            }
        }
        field4406++;
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(Lke;B)I", line = 1283)
    public final int method1791(class256 arg0, byte arg1) {
        field4433++;
        int var3 = 0;
        int var4 = this.field4384;
        int var5 = arg0.field4384;
        int var6 = this.field4384;
        int var7 = 0;
        if (arg1 != 38) {
            return -118;
        }
        int var8 = arg0.field4384;
        int var9 = 0;
        int var10 = 0;
        while (var4 != 0 && var5 != 0) {
            if (var3 == 156 || var3 == 230) {
                var3 = 101;
            } else if (var3 == 140 || var3 == 198) {
                var3 = 69;
            } else if (var3 == 223) {
                var3 = 115;
            } else {
                var3 = this.field4380[var9] & 0xFF;
                var9++;
            }
            if (class166.method1212(var3, -89)) {
                var6++;
            } else {
                var4--;
            }
            if (var7 == 156 || var7 == 230) {
                var7 = 101;
            } else if (var7 == 140 || var7 == 198) {
                var7 = 69;
            } else if (var7 == 223) {
                var7 = 115;
            } else {
                var7 = arg0.field4380[var10] & 0xFF;
                var10++;
            }
            if (class166.method1212(var7, -50)) {
                var8++;
            } else {
                var5--;
            }
            if (class179.field3172[var7] > class179.field3172[var3]) {
                return -1;
            }
            if (class179.field3172[var3] > class179.field3172[var7]) {
                return 1;
            }
        }
        if (var8 <= var6) {
            return var8 < var6 ? 1 : 0;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(Z)J", line = 1381)
    public final long method1792(boolean arg0) {
        field4423++;
        if (arg0) {
            return -4L;
        }
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field4384; var4++) {
            var2 = (var2 << 5) + ((long) (this.field4380[var4] & 0xFF)) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(BLke;)Lke;", line = 1424)
    public final class256 method1793(byte arg0, class256 arg1) {
        field4427++;
        if (!this.field4388) {
            throw new IllegalArgumentException();
        }
        if (this.field4380.length < this.field4384 + arg1.field4384) {
            int var3;
            for (var3 = 1; var3 < this.field4384 + arg1.field4384; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class299.method2092(this.field4380, 0, var4, 0, this.field4384);
            this.field4380 = var4;
        }
        class299.method2092(arg1.field4380, 0, this.field4380, this.field4384, arg1.field4384);
        if (arg0 == 37) {
            this.field4384 += arg1.field4384;
            return this;
        } else {
            return (class256) null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(III)Lke;", line = 1459)
    public final class256 method1794(int arg0, int arg1, int arg2) {
        field4396++;
        byte var4 = (byte) arg0;
        class256 var5 = new class256();
        byte var6 = (byte) arg1;
        var5.field4384 = this.field4384;
        var5.field4380 = new byte[this.field4384];
        for (int var7 = 0; var7 < this.field4384; var7++) {
            byte var8 = this.field4380[var7];
            if (var4 == var8) {
                var5.field4380[var7] = var6;
            } else {
                var5.field4380[var7] = var8;
            }
        }
        int var9 = 82 % ((82 - arg2) / 37);
        return var5;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILjava/net/URL;)Ljava/net/URL;", line = 1496)
    public final URL method1795(int arg0, URL arg1) throws MalformedURLException {
        if (arg0 == 0) {
            field4426++;
            return new URL(arg1, new String(this.field4380, 0, this.field4384));
        } else {
            return (URL) null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILke;)Z", line = 1511)
    public final boolean method1796(int arg0, class256 arg1) {
        field4429++;
        if (this.field4384 < arg1.field4384) {
            return false;
        }
        if (arg0 != -9743) {
            this.method1777(-18, -126, 105);
        }
        for (int var3 = 0; var3 < arg1.field4384; var3++) {
            byte var4 = this.field4380[var3];
            byte var5 = arg1.field4380[var3];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            if (var4 != var5) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)V", line = 1560)
    public final void method1797(int arg0) {
        String var2;
        try {
            var2 = new String(this.field4380, 0, this.field4384, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field4380, 0, this.field4384);
        }
        if (arg0 >= -101) {
            field4378 = (int[]) null;
        }
        System.out.println(var2);
        field4431++;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(ILjava/applet/Applet;)Lke;", line = 1584)
    public final class256 method1798(int arg0, Applet arg1) {
        field4418++;
        String var3 = new String(this.field4380, 0, this.field4384);
        if (arg0 <= 96) {
            this.method1803(109, -72, (byte) 77);
        }
        String var4 = arg1.getParameter(var3);
        return var4 == null ? null : class230.method1563(var4, -127);
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)I", line = 1602)
    public final int method1799(int arg0) {
        field4395++;
        if (arg0 < 126) {
            method1801(27, (short) -11);
        }
        return this.field4384;
    }

    @OriginalMember(owner = "client!ke", name = "hashCode", descriptor = "()I", line = 1613)
    public final int hashCode() {
        field4383++;
        return this.method1809(20004);
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)Lke;", line = 1625)
    public final class256 method1800(int arg0) {
        field4412++;
        class256 var2 = class290.method2018(7130, this.method1780(true));
        if (arg0 == -32) {
            return var2 == null ? class269.field4598 : var2;
        } else {
            return (class256) null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IS)Z", line = 1641)
    public static final boolean method1801(int arg0, short arg1) {
        field4424++;
        if (arg1 == 36 || arg1 == 15 || arg1 == 31 || arg1 == 13 || arg1 == 60 || arg1 == 7 || arg1 == 20 || arg1 == 57) {
            return true;
        }
        int var2 = -108 % ((arg0 + 21) / 39);
        if (arg1 == 44 || arg1 == 21 || arg1 == 1007 || arg1 == 1004) {
            return true;
        } else if (arg1 == 58 || arg1 == 45 || arg1 == 19 || arg1 == 1 || arg1 == 22) {
            return true;
        } else {
            return arg1 == 47 || arg1 == 50 || arg1 == 3 || arg1 == 42 || arg1 == 2 || arg1 == 8;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B[BIII)I", line = 1673)
    public final int method1802(byte arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        field4430++;
        if (arg0 < 120) {
            this.method1788(52, 55);
        }
        class299.method2092(this.field4380, arg3, arg1, arg2, arg4 - arg3);
        return arg4 - arg3;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIB)I", line = 1686)
    public final int method1803(int arg0, int arg1, byte arg2) {
        field4398++;
        byte var4 = (byte) arg0;
        if (arg2 <= 99) {
            this.method1780(false);
        }
        for (int var5 = arg1; var5 < this.field4384; var5++) {
            if (this.field4380[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(IB)I", line = 1712)
    public final int method1804(int arg0, byte arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        field4437++;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field4384; var6++) {
            int var7 = this.field4380[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var3 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                throw new NumberFormatException();
            }
            if (var7 >= arg0) {
                throw new NumberFormatException();
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if (var8 / arg0 != var5) {
                throw new NumberFormatException();
            }
            var5 = var8;
            var4 = true;
        }
        if (arg1 != 63) {
            this.method1777(-28, -1, 21);
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "(Z)Lke;", line = 1789)
    public final class256 method1805(boolean arg0) {
        field4410++;
        if (!arg0) {
            this.method1800(-2);
        }
        byte var2 = 2;
        class256 var3 = new class256();
        var3.field4384 = this.field4384;
        var3.field4380 = new byte[this.field4384];
        for (int var4 = 0; var4 < this.field4384; var4++) {
            byte var5 = this.field4380[var4];
            if (var5 >= 97 && var5 <= 122 || var5 >= -32 && var5 <= -2 && var5 != -9) {
                if (var2 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var2 = 0;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (var2 == 0) {
                    var5 = (byte) (var5 + 32);
                }
                var2 = 0;
            } else if (var5 == 46 || var5 == 33 || var5 == 63) {
                var2 = 2;
            } else if (var5 != 32) {
                var2 = 1;
            } else if (var2 != 2) {
                var2 = 1;
            }
            var3.field4380[var4] = var5;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZLke;)Z", line = 1855)
    public final boolean method1806(boolean arg0, class256 arg1) {
        field4386++;
        if (arg1 == null) {
            return false;
        } else if (arg1 == this) {
            return true;
        } else if (this.field4384 == arg1.field4384) {
            byte[] var3 = this.field4380;
            byte[] var4 = arg1.field4380;
            if (arg0) {
                return true;
            }
            for (int var5 = 0; var5 < this.field4384; var5++) {
                if (var3[var5] != var4[var5]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I", line = 1900)
    public final int method1807(int arg0, FontMetrics arg1) {
        field4416++;
        if (arg0 != 255) {
            return 42;
        }
        String var3;
        try {
            var3 = new String(this.field4380, 0, this.field4384, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field4380, 0, this.field4384);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "(I)Ljava/net/URL;", line = 1918)
    public final URL method1808(int arg0) throws MalformedURLException {
        field4391++;
        int var2 = -14 % ((42 - arg0) / 37);
        return new URL(new String(this.field4380, 0, this.field4384));
    }

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "(I)I", line = 1937)
    public final int method1809(int arg0) {
        field4381++;
        int var2 = 0;
        if (arg0 != 20004) {
            this.field4380 = (byte[]) null;
        }
        for (int var3 = 0; var3 < this.field4384; var3++) {
            var2 = (var2 << 5) + (this.field4380[var3] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(II)Lke;", line = 1957)
    public final class256 method1810(int arg0, int arg1) {
        field4414++;
        int var3 = -90 / ((-arg1 - 77) / 44);
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field4388) {
            if (this.field4380.length == this.field4384) {
                int var4;
                for (var4 = 1; var4 <= this.field4384; var4 += var4) {
                }
                byte[] var5 = new byte[var4];
                class299.method2092(this.field4380, 0, var5, 0, this.field4384);
                this.field4380 = var5;
            }
            this.field4380[this.field4384++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
