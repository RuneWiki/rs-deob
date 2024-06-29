import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class761 {

    @OriginalMember(owner = "client!ww", name = "d", descriptor = "[I")
    public static int[] field10454 = new int[32];

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "I")
    public static int field10451;

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "I")
    public static int field10452;

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "I")
    public static int field10453;

    @OriginalMember(owner = "client!ww", name = "e", descriptor = "I")
    public int field10455;

    @OriginalMember(owner = "client!ww", name = "f", descriptor = "I")
    public static int field10456;

    @OriginalMember(owner = "client!ww", name = "h", descriptor = "I")
    public static int field10458;

    @OriginalMember(owner = "client!ww", name = "i", descriptor = "I")
    public static int field10459;

    @OriginalMember(owner = "client!ww", name = "j", descriptor = "I")
    public static int field10460;

    @OriginalMember(owner = "client!ww", name = "k", descriptor = "I")
    public int field10461;

    @OriginalMember(owner = "client!ww", name = "l", descriptor = "I")
    public static int field10462;

    @OriginalMember(owner = "client!ww", name = "n", descriptor = "I")
    public static int field10464;

    @OriginalMember(owner = "client!ww", name = "g", descriptor = "[Lhh;")
    public static class140[] field10457;

    @OriginalMember(owner = "client!ww", name = "m", descriptor = "[Lvq;")
    public class486[] field10463;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IBLiga;II)Z", line = 4)
    public static final boolean method4193(int arg0, byte arg1, class481 arg2, int arg3, int arg4) {
        field10462++;
        if (!class14.field144 || !class717.field9767) {
            return false;
        } else if (class267.field3915 < 100) {
            return false;
        } else if (class482.method2835(78, arg0, arg4, arg3)) {
            int var5 = arg4 << class478.field6717;
            int var6 = arg3 << class478.field6717;
            int var7 = class645.field8694[arg0].method1898(arg3, arg4, (byte) -8) - 1;
            int var8 = var7 + arg2.method774((byte) 115);
            if (arg2.field6752 == 1) {
                if (!class254.method1684(var5, var7, var8, var5, var6, var5, class30.field299 + var6, var8, false, var6)) {
                    return false;
                } else if (class254.method1684(var5, var7, var7, var5, var6, var5, class30.field299 + var6, var8, false, var6 + class30.field299)) {
                    class723.field9819++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg2.field6752 == 2) {
                if (!class254.method1684(var5, var7, var8, var5, var6 + class30.field299, class30.field299 + var5, class30.field299 + var6, var8, false, class30.field299 + var6)) {
                    return false;
                } else if (class254.method1684(var5, var7, var8, class30.field299 + var5, class30.field299 + var6, class30.field299 + var5, class30.field299 + var6, var7, false, class30.field299 + var6)) {
                    class723.field9819++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg2.field6752 == 4) {
                if (!class254.method1684(class30.field299 + var5, var7, var8, class30.field299 + var5, var6, class30.field299 + var5, class30.field299 + var6, var8, false, var6)) {
                    return false;
                } else if (class254.method1684(class30.field299 + var5, var7, var7, var5 + class30.field299, var6, class30.field299 + var5, var6 - -class30.field299, var8, false, class30.field299 + var6)) {
                    class723.field9819++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg2.field6752 == 8) {
                if (!class254.method1684(var5, var7, var8, var5, var6, class30.field299 + var5, var6, var8, false, var6)) {
                    return false;
                } else if (class254.method1684(var5, var7, var8, class30.field299 + var5, var6, class30.field299 + var5, var6, var7, false, var6)) {
                    class723.field9819++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg2.field6752 != 16) {
                if (arg1 != -41) {
                    field10457 = null;
                }
                if (arg2.field6752 == 32) {
                    if (class776.method4269(var6 + class281.field4067, var8, var7, class281.field4067, class281.field4067 + var5, arg1 ^ 0xFFFFFF53, class281.field4067)) {
                        class723.field9819++;
                        return true;
                    } else {
                        return false;
                    }
                } else if (arg2.field6752 == 64) {
                    if (class776.method4269(var6, var8, var7, class281.field4067, var5 + class281.field4067, 132, class281.field4067)) {
                        class723.field9819++;
                        return true;
                    } else {
                        return false;
                    }
                } else if (arg2.field6752 != 128) {
                    return true;
                } else if (class776.method4269(var6, var8, var7, class281.field4067, var5, 132, class281.field4067)) {
                    class723.field9819++;
                    return true;
                } else {
                    return false;
                }
            } else if (class776.method4269(class281.field4067 + var6, var8, var7, class281.field4067, var5, 132, class281.field4067)) {
                class723.field9819++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lqba;Z)V", line = 128)
    public static final void method4194(class425 arg0, boolean arg1) {
        field10458++;
        if (!arg1) {
            field10457 = null;
        }
        if (arg0 instanceof class22) {
            class22 var2 = (class22) arg0;
            if (var2.field217 != null) {
                class336.method2156(var2, !arg1, class625.field8475.field2813 != var2.field2813);
                return;
            }
        } else if ((arg0 instanceof class758)) {
            class758 var3 = (class758) arg0;
            class661.method3661(var3, 111, class625.field8475.field2813 != var3.field2813);
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)Z", line = 160)
    public static final boolean method4195(byte arg0) {
        field10464++;
        int var1 = 93 / ((arg0 + 28) / 36);
        try {
            return class133.method938(-90);
        } catch (IOException var5) {
            class73.method594((byte) -69);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + (class571.field7775 == null ? -1 : class571.field7775.method3020((byte) -13)) + "," + (class640.field8614 == null ? -1 : class640.field8614.method3020((byte) -13)) + "," + (class230.field2959 == null ? -1 : class230.field2959.method3020((byte) -13)) + " - " + class442.field6366 + "," + (class625.field8475.field6198[0] + class120.field1625) + "," + (class625.field8475.field6197[0] + class259.field3849) + " - ";
            for (int var4 = 0; var4 < class442.field6366 && var4 < 50; var4++) {
                var3 = var3 + class560.field7678.field3789[var4] + ",";
            }
            class607.method3379(var3, var6, true);
            class87.method696(false, -67);
            return true;
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Ldt;Leo;B)Lvq;", line = 194)
    private final class486 method4196(class254 arg0, class313 arg1, byte arg2) {
        field10459++;
        if (class375.field5489 == arg1) {
            return class468.method2743(arg0, -9598);
        } else if (class33.field313 == arg1) {
            return class115.method840(arg0, (byte) 79);
        } else if (class375.field5488 == arg1) {
            return class583.method3283(arg0, -63);
        } else if (class273.field3967 == arg1) {
            return class56.method359(-128, arg0);
        } else if (class50.field576 == arg1) {
            return class279.method1827(arg0, 82);
        } else if (class374.field5471 == arg1) {
            return class469.method2749(arg0, -84);
        } else if (class709.field9694 == arg1) {
            return class685.method3762(arg0, 1);
        } else if (class289.field4118 == arg1) {
            return class4.method26(arg0, (byte) 121);
        } else if (class601.field8185 == arg1) {
            return class399.method2435(arg0, (byte) 125);
        } else if (class435.field6287 == arg1) {
            return class759.method4176(16383, arg0);
        } else {
            if (arg2 < 118) {
                method4198(-68);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIZ)I", line = 249)
    public static final int method4197(int arg0, int arg1, boolean arg2) {
        field10453++;
        int var3 = arg1 * 57 + arg0;
        int var4 = var3 << 13 ^ var3;
        if (!arg2) {
            field10454 = null;
        }
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return (var5 & 0x7FB3E23) >> 19;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)V", line = 266)
    public static void method4198(int arg0) {
        field10457 = null;
        field10454 = null;
        if (arg0 != 65533) {
            method4200(null, 36, -88, 94);
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Ldt;Z)V", line = 279)
    public final void method4199(class254 arg0, boolean arg1) {
        this.field10461 = arg0.method1722(arg1);
        field10456++;
        this.field10455 = arg0.method1728((byte) 39);
        this.field10463 = new class486[arg0.method1731((byte) 64)];
        class313[] var3 = class439.method2625((byte) 91);
        for (int var4 = 0; var4 < this.field10463.length; var4++) {
            this.field10463[var4] = this.method4196(arg0, var3[arg0.method1731((byte) 64)], (byte) 124);
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "([BIII)Ljava/lang/String;", line = 302)
    public static final String method4200(byte[] arg0, int arg1, int arg2, int arg3) {
        field10452++;
        char[] var4 = new char[arg2];
        int var5 = 0;
        if (arg1 != -225) {
            return null;
        }
        int var6 = arg3;
        int var7 = arg2 + arg3;
        while (var6 < var7) {
            int var8 = arg0[var6++] & 0xFF;
            int var9;
            if (var8 >= 128) {
                if (var8 < 192) {
                    var9 = 65533;
                } else if (var8 < 224) {
                    if (var7 > var6 && (arg0[var6] & 0xC0) == 128) {
                        var9 = arg0[var6++] & 0x3F | var8 & 0x1F << 6;
                        if (var9 < 128) {
                            var9 = 65533;
                        }
                    } else {
                        var9 = 65533;
                    }
                } else if (var8 >= 240) {
                    if (var8 >= 248) {
                        var9 = 65533;
                    } else if (var6 + 2 < var7 && (arg0[var6] & 0xC0) == 128 && (arg0[var6 + 1] & 0xC0) == 128 && (arg0[var6 + 2] & 0xC0) == 128) {
                        int var10 = var8 & 0x7 << 18 | arg0[var6++] << 12 & 0x3F000 | arg0[var6++] & 0x3F << 6 | arg0[var6++] & 0x3F;
                        if (var10 >= 65536 && var10 <= 1114111) {
                            var9 = 65533;
                        } else {
                            var9 = 65533;
                        }
                    } else {
                        var9 = 65533;
                    }
                } else if (var7 > (var6 + 1) && (arg0[var6] & 0xC0) == 128 && (arg0[var6 + 1] & 0xC0) == 128) {
                    var9 = (var8 & 0xF) << 12 | (arg0[var6++] & 0x3F) << 6 | arg0[var6++] & 0x3F;
                    if (var9 < 2048) {
                        var9 = 65533;
                    }
                } else {
                    var9 = 65533;
                }
            } else if (var8 == 0) {
                var9 = 65533;
            } else {
                var9 = var8;
            }
            var4[var5++] = (char) var9;
        }
        return new String(var4, 0, var5);
    }
}
