import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class94 extends class115 {

    @OriginalMember(owner = "client!si", name = "T", descriptor = "[Lub;")
    public static class64[] field1479 = new class64[27];

    @OriginalMember(owner = "client!si", name = "Y", descriptor = "Lqe;")
    private static class168 field1484 = class66.method448("glow1:", -115);

    @OriginalMember(owner = "client!si", name = "ab", descriptor = "Lqe;")
    public static class168 field1486 = field1484;

    @OriginalMember(owner = "client!si", name = "X", descriptor = "Lqe;")
    public static class168 field1483 = field1484;

    @OriginalMember(owner = "client!si", name = "Q", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!si", name = "S", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!si", name = "U", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!si", name = "V", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!si", name = "Z", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!si", name = "bb", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!si", name = "cb", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!si", name = "db", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!si", name = "R", descriptor = "Loe;")
    public static class256 field1477;

    @OriginalMember(owner = "client!si", name = "W", descriptor = "[[[B")
    public static byte[][][] field1482;

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
    public class94() {
        super(0, true);
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(II)I")
    public static final int method617(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILt;I[B)V")
    public static final void method618(int arg0, class206 arg1, int arg2, byte[] arg3) {
        class19 var4 = new class19();
        var4.field229 = arg1;
        var4.field237 = arg3;
        ++field1487;
        var4.field230 = 0;
        var4.field3308 = (long) arg0;
        class47 var5 = class169.field2941;
        synchronized (class169.field2941) {
            class169.field2941.method311((byte) 16, var4);
            if (arg2 < 31) {
                field1479 = null;
            }
        }
        class241.method1572((byte) 58);
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(IB)Lbc;")
    public static final class115 method619(int arg0, byte arg1) {
        int var2 = -117 % ((-48 - arg1) / 39);
        ++field1488;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    if (~arg0 != -8) {
                                        if (arg0 != 8) {
                                            if (arg0 != 9) {
                                                if (arg0 != 10) {
                                                    if (~arg0 != -12) {
                                                        if (~arg0 != -13) {
                                                            if (arg0 != 13) {
                                                                if (~arg0 != -15) {
                                                                    if (~arg0 != -16) {
                                                                        if (arg0 != 16) {
                                                                            if (~arg0 != -18) {
                                                                                if (~arg0 != -19) {
                                                                                    if (~arg0 != -20) {
                                                                                        if (arg0 != 20) {
                                                                                            if (~arg0 != -22) {
                                                                                                if (~arg0 != -23) {
                                                                                                    if (arg0 != 23) {
                                                                                                        if (~arg0 != -25) {
                                                                                                            if (~arg0 != -26) {
                                                                                                                if (arg0 != 26) {
                                                                                                                    if (arg0 != 27) {
                                                                                                                        if (~arg0 != -29) {
                                                                                                                            if (~arg0 != -30) {
                                                                                                                                if (arg0 != 30) {
                                                                                                                                    if (~arg0 != -32) {
                                                                                                                                        if (~arg0 != -33) {
                                                                                                                                            if (~arg0 != -34) {
                                                                                                                                                if (~arg0 != -35) {
                                                                                                                                                    if (~arg0 != -36) {
                                                                                                                                                        if (arg0 != 36) {
                                                                                                                                                            if (arg0 != 37) {
                                                                                                                                                                if (~arg0 != -39) {
                                                                                                                                                                    return arg0 == 39 ? new class32() : null;
                                                                                                                                                                } else {
                                                                                                                                                                    return new class174();
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                return new class223();
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            return new class55();
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        return new class126();
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    return new class118();
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                return new class6();
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            return new class88();
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        return new class163();
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    return new class25();
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                return new class99();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            return new class150();
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        return new class98();
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    return new class58();
                                                                                                                }
                                                                                                            } else {
                                                                                                                return new class105();
                                                                                                            }
                                                                                                        } else {
                                                                                                            return new class16();
                                                                                                        }
                                                                                                    } else {
                                                                                                        return new class71();
                                                                                                    }
                                                                                                } else {
                                                                                                    return new class257();
                                                                                                }
                                                                                            } else {
                                                                                                return new class1();
                                                                                            }
                                                                                        } else {
                                                                                            return new class9();
                                                                                        }
                                                                                    } else {
                                                                                        return new class243();
                                                                                    }
                                                                                } else {
                                                                                    return new class193();
                                                                                }
                                                                            } else {
                                                                                return new class214();
                                                                            }
                                                                        } else {
                                                                            return new class241();
                                                                        }
                                                                    } else {
                                                                        return new class83();
                                                                    }
                                                                } else {
                                                                    return new class131();
                                                                }
                                                            } else {
                                                                return new class94();
                                                            }
                                                        } else {
                                                            return new class155();
                                                        }
                                                    } else {
                                                        return new class100();
                                                    }
                                                } else {
                                                    return new class138();
                                                }
                                            } else {
                                                return new class8();
                                            }
                                        } else {
                                            return new class46();
                                        }
                                    } else {
                                        return new class208();
                                    }
                                } else {
                                    return new class122();
                                }
                            } else {
                                return new class109();
                            }
                        } else {
                            return new class69();
                        }
                    } else {
                        return new class152();
                    }
                } else {
                    return new class26();
                }
            } else {
                return new class233();
            }
        } else {
            return new class211();
        }
    }

    @OriginalMember(owner = "client!si", name = "i", descriptor = "(I)V")
    public static void method620(int arg0) {
        field1479 = null;
        field1486 = null;
        field1477 = null;
        field1484 = null;
        if (arg0 > 63) {
            field1483 = null;
            field1482 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BIII)I")
    public static final int method621(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 3;
        ++field1481;
        if (~var4 == -1) {
            return arg2;
        } else if (~var4 == -2) {
            return -arg1 + 7;
        } else {
            if (arg0 != -94) {
                field1484 = null;
            }
            return var4 == 2 ? -arg2 + 7 : arg1;
        }
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(III)J")
    public static final long method622(int arg0, int arg1, int arg2) {
        class177 var3 = class254.field4395[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        } else {
            for (int var4 = 0; var4 < var3.field3115; ++var4) {
                class169 var5 = var3.field3090[var4];
                if ((var5.field2937 >> 29 & 3L) == 2L && var5.field2939 == arg1 && var5.field2923 == arg2) {
                    return var5.field2937;
                }
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BII)I")
    private final int method623(byte arg0, int arg1, int arg2) {
        int var4 = arg1 * 57 + arg2;
        int var5 = var4 << 1 ^ var4;
        if (arg0 < 12) {
            return -121;
        } else {
            ++field1478;
            return -((Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144) + 4096;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IJSILqe;Lqe;B)V")
    public static final void method624(int arg0, long arg1, short arg2, int arg3, class168 arg4, class168 arg5, byte arg6) {
        ++field1480;
        if (arg6 <= 100) {
            method626((class168) null, (byte) 34, (class168) null, 120, -66, (class168) null);
        }
        if (!class169.field2956) {
            if (class109.field1748 < 500) {
                class151.field2640[class109.field1748] = arg5;
                class125.field2052[class109.field1748] = arg4;
                class51.field701[class109.field1748] = arg2;
                class3.field40[class109.field1748] = arg1;
                class228.field3876[class109.field1748] = arg0;
                class35.field436[class109.field1748] = arg3;
                ++class109.field1748;
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        if (arg1 < 37) {
            return null;
        } else {
            ++field1485;
            int[] var3 = super.field1872.method182((byte) -108, arg0);
            if (super.field1872.field341) {
                int var4 = class170.field2963[arg0];
                for (int var5 = 0; class130.field2297 > var5; ++var5) {
                    var3[var5] = this.method623((byte) 103, var4, class193.field3367[var5]) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILhh;)V")
    public static final void method625(int arg0, class121 arg1) {
        ++field1489;
        class185 var2 = (class185) class85.field1303.method1527(arg1.field2000.method1084(32383), (byte) -75);
        if (arg0 == 21734) {
            if (var2 != null) {
                if (var2.field3266 != null) {
                    class86.field1341.method509(var2.field3266);
                    var2.field3266 = null;
                }
                var2.method1234(17216);
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lqe;BLqe;IILqe;)V")
    public static final void method626(class168 arg0, byte arg1, class168 arg2, int arg3, int arg4, class168 arg5) {
        ++field1476;
        for (int var6 = 99; var6 > 0; --var6) {
            class54.field742[var6] = class54.field742[var6 + -1];
            class98.field1538[var6] = class98.field1538[var6 + -1];
            class202.field3484[var6] = class202.field3484[var6 + -1];
            class162.field2784[var6] = class162.field2784[var6 - 1];
            class123.field2030[var6] = class123.field2030[var6 - 1];
        }
        if (arg1 <= 72) {
            method624(119, -27L, (short) 119, 73, (class168) null, (class168) null, (byte) 13);
        }
        class98.field1538[0] = arg0;
        ++class139.field2463;
        class233.field3952 = class205.field3566;
        class202.field3484[0] = arg5;
        class54.field742[0] = arg3;
        class123.field2030[0] = arg4;
        class162.field2784[0] = arg2;
    }
}
