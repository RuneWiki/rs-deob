import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class105 {

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1613 = "scroll:";

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "[I")
    public static int[] field1619 = new int[2048];

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "Lwf;")
    public static class306 field1615;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 8)
    public static final void method712(int arg0) {
        if (arg0 != 0) {
            field1619 = (int[]) null;
        }
        class106 var1 = (class106) class39.field568.method10((byte) 72);
        field1618++;
        while (var1 != null) {
            class122 var2 = var1.field1630;
            if (class77.field1154 != var2.field1876 || var2.field1878 < class343.field5341) {
                var1.method1284(0);
            } else if (var2.field1909 <= class343.field5341) {
                if (var2.field1892 > 0) {
                    class80 var3 = class208.field3313[var2.field1892 - 1];
                    if (var3 != null && var3.field537 >= 0 && var3.field537 < 13312 && var3.field519 >= 0 && var3.field519 < 13312) {
                        var2.method829(class343.field5341, class39.method286(var2.field1876, (byte) 82, var3.field537, var3.field519) - var2.field1879, var3.field537, -17567, var3.field519);
                    }
                }
                if (var2.field1892 < 0) {
                    int var4 = -var2.field1892 - 1;
                    class82 var5;
                    if (class124.field1944 == var4) {
                        var5 = class79.field1173;
                    } else {
                        var5 = class64.field966[var4];
                    }
                    if (var5 != null && var5.field537 >= 0 && var5.field537 < 13312 && var5.field519 >= 0 && var5.field519 < 13312) {
                        var2.method829(class343.field5341, class39.method286(var2.field1876, (byte) 82, var5.field537, var5.field519) - var2.field1879, var5.field537, -17567, var5.field519);
                    }
                }
                var2.method827((byte) -85, class81.field1208);
                class226.method1543(class77.field1154, (int) var2.field1884, (int) var2.field1877, (int) var2.field1900, 60, var2, var2.field1912, -1L, false);
            }
            var1 = (class106) class39.field568.method13((byte) -32);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V", line = 69)
    public static final void method713(int arg0) {
        field1612++;
        if (arg0 == -12482) {
            class151.field2386 = null;
            class49.method337();
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILte;)V", line = 81)
    public static final void method714(int arg0, class38 arg1) {
        if (arg0 != 64) {
            field1615 = (class306) null;
        }
        field1616++;
        class309 var2 = arg1.method280(-59);
        arg1.field474 = var2.field4876;
        if (arg1.field541 == 0) {
            arg1.field543 = 0;
            return;
        }
        if (arg1.field507 != -1 && arg1.field558 == 0) {
            class222 var3 = class118.method809((byte) 116, arg1.field507);
            if (arg1.field504 > 0 && var3.field3527 == 0) {
                arg1.field543++;
                return;
            }
            if (arg1.field504 <= 0 && var3.field3531 == 0) {
                arg1.field543++;
                return;
            }
        }
        if (arg1.field530 != -1 && class343.field5341 >= arg1.field477) {
            class148 var4 = class63.method428(false, arg1.field530);
            if (var4.field2344 && var4.field2355 != -1) {
                class222 var5 = class118.method809((byte) 42, var4.field2355);
                if (arg1.field504 > 0 && var5.field3527 == 0) {
                    arg1.field543++;
                    return;
                }
                if (arg1.field504 <= 0 && var5.field3531 == 0) {
                    arg1.field543++;
                    return;
                }
            }
        }
        int var6 = arg1.field537;
        int var7 = arg1.field519;
        int var8 = arg1.field476[arg1.field541 - 1] * 128 + arg1.method271((byte) 61) * 64;
        int var9 = arg1.field505[arg1.field541 - 1] * 128 + (arg1.method271((byte) 71) * 64);
        if ((var8 - var6) > 256 || var8 - var6 < -256 || var9 - var7 > 256 || var9 - var7 < -256) {
            arg1.field519 = var9;
            arg1.field537 = var8;
            return;
        }
        if (var6 < var8) {
            if (var7 < var9) {
                arg1.field520 = 1280;
            } else if (var7 <= var9) {
                arg1.field520 = 1536;
            } else {
                arg1.field520 = 1792;
            }
        } else if (var8 < var6) {
            if (var7 < var9) {
                arg1.field520 = 768;
            } else if (var7 > var9) {
                arg1.field520 = 256;
            } else {
                arg1.field520 = 512;
            }
        } else if (var7 < var9) {
            arg1.field520 = 1024;
        } else if (var9 < var7) {
            arg1.field520 = 0;
        }
        int var10 = arg1.field520 - arg1.field564 & 0x7FF;
        if (var10 > 1024) {
            var10 -= 2048;
        }
        int var11 = var2.field4874;
        boolean var12 = true;
        if (var10 >= -256 && var10 <= 256) {
            var11 = var2.field4879;
        } else if (var10 >= 256 && var10 < 768) {
            var11 = var2.field4873;
        } else if (var10 >= -768 && var10 <= -256) {
            var11 = var2.field4880;
        }
        int var13 = 4;
        if (var11 == -1) {
            var11 = var2.field4879;
        }
        arg1.field474 = var11;
        if (arg1 instanceof class80) {
            var12 = ((class80) arg1).field1178.field4574;
        }
        byte var14 = 1;
        if (var12) {
            if (arg1.field564 != arg1.field520 && arg1.field551 == -1 && arg1.field565 != 0) {
                var13 = 2;
            }
            if (arg1.field541 > 2) {
                var13 = 6;
            }
            if (arg1.field541 > 3) {
                var13 = 8;
            }
            if (arg1.field543 > 0 && arg1.field541 > 1) {
                var13 = 8;
                arg1.field543--;
            }
        } else {
            if (arg1.field541 > 1) {
                var13 = 6;
            }
            if (arg1.field541 > 2) {
                var13 = 8;
            }
            if (arg1.field543 > 0 && arg1.field541 > 1) {
                arg1.field543--;
                var13 = 8;
            }
        }
        if (arg1.field487[arg1.field541 - 1] == 2) {
            var13 <<= 0x1;
            var14 = 2;
        } else if (arg1.field487[arg1.field541 - 1] == 0) {
            var14 = 0;
            var13 >>= 0x1;
        }
        if (var13 < 8 || var2.field4872 == -1) {
            if (var2.field4855 != -1 && var14 == 0) {
                if (arg1.field474 == var2.field4874 && var2.field4862 != -1) {
                    arg1.field474 = var2.field4862;
                } else if (arg1.field474 == var2.field4880 && var2.field4882 != -1) {
                    arg1.field474 = var2.field4882;
                } else if (arg1.field474 == var2.field4873 && var2.field4890 != -1) {
                    arg1.field474 = var2.field4890;
                } else {
                    arg1.field474 = var2.field4855;
                }
            }
        } else if (arg1.field474 == var2.field4874 && var2.field4864 != -1) {
            arg1.field474 = var2.field4864;
        } else if (arg1.field474 == var2.field4880 && var2.field4858 != -1) {
            arg1.field474 = var2.field4858;
        } else if (arg1.field474 == var2.field4873 && var2.field4867 != -1) {
            arg1.field474 = var2.field4867;
        } else {
            arg1.field474 = var2.field4872;
        }
        if (var2.field4869 != -1) {
            int var15 = var13 << 7;
            if (arg1.field541 == 1) {
                int var16 = (var9 >= arg1.field519 ? var9 - arg1.field519 : -var9 + arg1.field519) << 7;
                int var17 = (arg1.field537 <= var8 ? var8 - arg1.field537 : -var8 + arg1.field537) << 7;
                int var18 = var16 < var17 ? var17 : var16;
                int var19 = var2.field4869 * var18 * 2;
                int var20 = arg1.field545 * arg1.field545;
                if (var19 < var20) {
                    arg1.field545 /= 2;
                } else if (var18 < var20 / 2) {
                    arg1.field545 -= var2.field4869;
                    if (arg1.field545 < 0) {
                        arg1.field545 = 0;
                    }
                } else if (arg1.field545 < var15) {
                    arg1.field545 += var2.field4869;
                    if (var15 < arg1.field545) {
                        arg1.field545 = var15;
                    }
                }
            } else if (arg1.field545 < var15) {
                arg1.field545 += var2.field4869;
                if (var15 < arg1.field545) {
                    arg1.field545 = var15;
                }
            } else if (arg1.field545 > 0) {
                arg1.field545 -= var2.field4869;
                if (arg1.field545 < 0) {
                    arg1.field545 = 0;
                }
            }
            var13 = arg1.field545 >> 7;
            if (var13 < 1) {
                var13 = 1;
            }
        }
        if (var6 < var8) {
            arg1.field537 += var13;
            if (var8 < arg1.field537) {
                arg1.field537 = var8;
            }
        } else if (var6 > var8) {
            arg1.field537 -= var13;
            if (arg1.field537 < var8) {
                arg1.field537 = var8;
            }
        }
        if (var9 > var7) {
            arg1.field519 += var13;
            if (var9 < arg1.field519) {
                arg1.field519 = var9;
            }
        } else if (var9 < var7) {
            arg1.field519 -= var13;
            if (var9 > arg1.field519) {
                arg1.field519 = var9;
            }
        }
        if (arg1.field537 == var8 && arg1.field519 == var9) {
            arg1.field541--;
            if (arg1.field504 > 0) {
                arg1.field504--;
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "([Ljava/lang/Object;[JZ)V", line = 428)
    public static final void method715(Object[] arg0, long[] arg1, boolean arg2) {
        class23.method174(0, arg1.length - 1, 4321, arg0, arg1);
        if (!arg2) {
            field1614++;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V", line = 447)
    public static void method716(boolean arg0) {
        field1619 = null;
        if (arg0) {
            method712(112);
        }
        field1615 = null;
        field1613 = null;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V", line = 468)
    public static final void method717(int arg0) {
        field1617++;
        class34.field438.method1296(255);
        if (arg0 != -4) {
            field1619 = (int[]) null;
        }
    }
}
