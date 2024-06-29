import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class18 extends class30 {

    @OriginalMember(owner = "client!cc", name = "V", descriptor = "I")
    private int field328 = 0;

    @OriginalMember(owner = "client!cc", name = "X", descriptor = "Luf;")
    public static class145 field330 = new class145(4096);

    @OriginalMember(owner = "client!cc", name = "fb", descriptor = "Lje;")
    public static class67 field338 = class85.method592(255, "mod_icons");

    @OriginalMember(owner = "client!cc", name = "gb", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field339 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!cc", name = "hb", descriptor = "Lje;")
    public static class67 field340 = class85.method592(255, " loggt sich ein)3");

    @OriginalMember(owner = "client!cc", name = "ib", descriptor = "Lob;")
    public static class99 field341 = new class99(128);

    @OriginalMember(owner = "client!cc", name = "jb", descriptor = "I")
    public static int field342 = 0;

    @OriginalMember(owner = "client!cc", name = "kb", descriptor = "Lje;")
    public static class67 field343 = class85.method592(255, "(Y");

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "I")
    public int field326;

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "I")
    public int field327;

    @OriginalMember(owner = "client!cc", name = "W", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!cc", name = "Y", descriptor = "I")
    public int field331;

    @OriginalMember(owner = "client!cc", name = "Z", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!cc", name = "ab", descriptor = "I")
    public int field333;

    @OriginalMember(owner = "client!cc", name = "bb", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!cc", name = "cb", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!cc", name = "eb", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!cc", name = "db", descriptor = "[I")
    public static int[] field336;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLje;Lje;Lfd;)[Lqb;")
    public static final class113[] method124(byte arg0, class67 arg1, class67 arg2, class40 arg3) {
        if (arg0 <= 14) {
            method130(true);
        }
        field324++;
        int var4 = arg3.method251(0, arg1);
        int var5 = arg3.method254(arg2, 0, var4);
        return class14.method99(100, var5, arg3, var4);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILna;I)V")
    private final void method125(int arg0, int arg1, class91 arg2, int arg3) {
        field334++;
        if (arg3 == 1) {
            this.field328 = arg2.method637(59);
        }
        if (arg0 != -22024) {
            this.method125(-128, -114, null, 73);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lna;II)V")
    public final void method126(class91 arg0, int arg1, int arg2) {
        if (arg1 <= 56) {
            method124((byte) 21, null, null, null);
        }
        while (true) {
            int var4 = arg0.method649(false);
            if (var4 == 0) {
                field337++;
                return;
            }
            this.method125(-22024, arg2, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(B)V")
    public static void method127(byte arg0) {
        field338 = null;
        field341 = null;
        field340 = null;
        field339 = null;
        int var1 = 62 % ((65 - arg0) / 49);
        field336 = null;
        field330 = null;
        field343 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIZI)V")
    public static final void method128(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg3 <= 36) {
            method128(117, 108, true, -26);
        }
        field329++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class84.field1873 = arg1;
        class41.field765 = arg2;
        client.field395 = arg0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)V")
    private final void method129(int arg0, int arg1) {
        field332++;
        double var3 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var9 = var7;
        if (var7 > var3) {
            var9 = var3;
        }
        double var11 = var7;
        if (var3 > var7) {
            var11 = var3;
        }
        double var13 = 0.0D;
        if (var9 > var5) {
            var9 = var5;
        }
        if (var11 < var5) {
            var11 = var5;
        }
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        this.field327 = (int) (var17 * 256.0D);
        if (var9 != var11) {
            if (var7 == var11) {
                var15 = (var3 - var5) / (var11 - var9);
            } else if (var3 == var11) {
                var15 = (var5 - var7) / (-var9 + var11) + 2.0D;
            } else if (var5 == var11) {
                var15 = (var7 - var3) / (var11 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var13 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var13 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        if (var17 > 0.5D) {
            this.field326 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field326 = (int) (var13 * var17 * 512.0D);
        }
        if (this.field327 < 0) {
            this.field327 = 0;
        } else if (this.field327 > 255) {
            this.field327 = 255;
        }
        double var19 = var15 / 6.0D;
        if (arg0 != -23888) {
            this.method125(-54, 14, null, -116);
        }
        this.field331 = (int) (var13 * 256.0D);
        if (this.field331 < 0) {
            this.field331 = 0;
        } else if (this.field331 > 255) {
            this.field331 = 255;
        }
        if (this.field326 < 1) {
            this.field326 = 1;
        }
        this.field333 = (int) ((double) this.field326 * var19);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)Z")
    public static final boolean method130(boolean arg0) {
        field325++;
        long var1 = class150.method1148(-85808345);
        if (!arg0) {
            return true;
        }
        int var3 = (int) (var1 - class6.field147);
        class6.field147 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class151.field3454 += var3;
        if (class64.field1257 == 0 && class58.field1157 == 0 && class145.field3350 == 0 && class97.field2163 == 0) {
            return true;
        } else if (class15.field266 == null) {
            return false;
        } else {
            try {
                if (class151.field3454 > 30000) {
                    throw new IOException();
                }
                while (class58.field1157 < 20 && class97.field2163 > 0) {
                    class120 var4 = (class120) class84.field1857.method1116(0);
                    class91 var5 = new class91(4);
                    var5.method653(1, 97);
                    var5.method647((int) var4.field300, (byte) 108);
                    class15.field266.method842(var5.field1991, 4, -6, 0);
                    class118.field2663.method1115(var4.field300, var4, 1);
                    class58.field1157++;
                    class97.field2163--;
                }
                while (class64.field1257 < 20 && class145.field3350 > 0) {
                    class120 var6 = (class120) class88.field1944.method825(26030);
                    class91 var7 = new class91(4);
                    var7.method653(0, 95);
                    var7.method647((int) var6.field300, (byte) 108);
                    class15.field266.method842(var7.field1991, 4, 127, 0);
                    var6.method192((byte) -66);
                    field330.method1115(var6.field300, var6, 1);
                    class145.field3350--;
                    class64.field1257++;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class15.field266.method848((byte) -125);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    byte var10 = 0;
                    if (class144.field3327 == null) {
                        var10 = 8;
                    } else if (class60.field1196 == 0) {
                        var10 = 1;
                    }
                    class151.field3454 = 0;
                    if (var10 <= 0) {
                        int var11 = class2.field19.field1991.length - class144.field3327.field2706;
                        int var12 = 512 - class60.field1196;
                        if (var11 - class2.field19.field2043 < var12) {
                            var12 = var11 - class2.field19.field2043;
                        }
                        if (var9 < var12) {
                            var12 = var9;
                        }
                        class15.field266.method843(class2.field19.field1991, var12, class2.field19.field2043, false);
                        if (class158.field3626 != 0) {
                            for (int var13 = 0; var13 < var12; var13++) {
                                class2.field19.field1991[class2.field19.field2043 + var13] = (byte) class130.method994(class2.field19.field1991[class2.field19.field2043 + var13], class158.field3626);
                            }
                        }
                        class2.field19.field2043 += var12;
                        class60.field1196 += var12;
                        if (class2.field19.field2043 == var11) {
                            if (class144.field3327.field300 == 16711935L) {
                                class25.field456 = class2.field19;
                                for (int var14 = 0; var14 < 256; var14++) {
                                    class140 var15 = class97.field2176[var14];
                                    if (var15 != null) {
                                        class25.field456.field2043 = var14 * 8 + 5;
                                        int var16 = class25.field456.method631(-74);
                                        int var17 = class25.field456.method631(-119);
                                        var15.method1064(var16, var17, false);
                                    }
                                }
                            } else {
                                class97.field2168.reset();
                                class97.field2168.update(class2.field19.field1991, 0, var11);
                                int var18 = (int) class97.field2168.getValue();
                                if (class144.field3327.field2707 != var18) {
                                    try {
                                        class15.field266.method847(-110);
                                    } catch (Exception var30) {
                                    }
                                    class15.field266 = null;
                                    class91.field2017++;
                                    class158.field3626 = (byte) (Math.random() * 255.0D + 1.0D);
                                    return false;
                                }
                                class91.field2017 = 0;
                                class19.field367 = 0;
                                class144.field3327.field2697.method1055((int) (class144.field3327.field300 & 0xFFFFL), (class144.field3327.field300 & 0xFF0000L) == 16711680L, class101.field2275, class2.field19.field1991, -2);
                            }
                            class144.field3327.method115(26851);
                            class60.field1196 = 0;
                            class2.field19 = null;
                            if (class101.field2275) {
                                class58.field1157--;
                            } else {
                                class64.field1257--;
                            }
                            class144.field3327 = null;
                        } else {
                            if (class60.field1196 != 512) {
                                break;
                            }
                            class60.field1196 = 0;
                        }
                    } else {
                        int var19 = var10 - class93.field2090.field2043;
                        if (var9 < var19) {
                            var19 = var9;
                        }
                        class15.field266.method843(class93.field2090.field1991, var19, class93.field2090.field2043, false);
                        if (class158.field3626 != 0) {
                            for (int var20 = 0; var20 < var19; var20++) {
                                class93.field2090.field1991[class93.field2090.field2043 + var20] = (byte) class130.method994(class93.field2090.field1991[class93.field2090.field2043 + var20], class158.field3626);
                            }
                        }
                        class93.field2090.field2043 += var19;
                        if (class93.field2090.field2043 < var10) {
                            break;
                        }
                        if (class144.field3327 == null) {
                            class93.field2090.field2043 = 0;
                            int var21 = class93.field2090.method649(false);
                            int var22 = class93.field2090.method641(255);
                            int var23 = class93.field2090.method649(!arg0);
                            int var24 = class93.field2090.method631(-59);
                            long var25 = (long) ((var21 << 16) + var22);
                            class120 var27 = (class120) class118.field2663.method1119(28254, var25);
                            class101.field2275 = true;
                            if (var27 == null) {
                                var27 = (class120) field330.method1119(28254, var25);
                                class101.field2275 = false;
                            }
                            if (var27 == null) {
                                throw new IOException();
                            }
                            class144.field3327 = var27;
                            int var28 = var23 == 0 ? 5 : 9;
                            class2.field19 = new class91(class144.field3327.field2706 + var24 + var28);
                            class2.field19.method653(var23, 48);
                            class2.field19.method629((byte) -44, var24);
                            class93.field2090.field2043 = 0;
                            class60.field1196 = 8;
                        } else if (class60.field1196 == 0) {
                            if (class93.field2090.field1991[0] == -1) {
                                class93.field2090.field2043 = 0;
                                class60.field1196 = 1;
                            } else {
                                class144.field3327 = null;
                            }
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class15.field266.method847(-55);
                } catch (Exception var29) {
                }
                class15.field266 = null;
                class19.field367++;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(B)V")
    public final void method131(byte arg0) {
        this.method129(-23888, this.field328);
        field335++;
        if (arg0 >= -52) {
            field343 = null;
        }
    }
}
