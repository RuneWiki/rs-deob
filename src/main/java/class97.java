import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class class97 extends class5 {

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "I")
    public int field2466 = 1000;

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "Lhb;")
    public static class44 field2462 = class102.method810("l", -28606);

    @OriginalMember(owner = "client!qa", name = "bb", descriptor = "Lhb;")
    public static class44 field2468 = class102.method810(":  ", -28606);

    @OriginalMember(owner = "client!qa", name = "X", descriptor = "Z")
    public static boolean field2464 = false;

    @OriginalMember(owner = "client!qa", name = "Y", descriptor = "I")
    public static int field2465 = 2;

    @OriginalMember(owner = "client!qa", name = "kb", descriptor = "Lhb;")
    public static class44 field2477 = class102.method810("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3", -28606);

    @OriginalMember(owner = "client!qa", name = "lb", descriptor = "Lhb;")
    public static class44 field2478 = class102.method810("lila:", -28606);

    @OriginalMember(owner = "client!qa", name = "ib", descriptor = "Lhb;")
    public static class44 field2475 = class102.method810(":chalreq:", -28606);

    @OriginalMember(owner = "client!qa", name = "T", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!qa", name = "ab", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!qa", name = "eb", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!qa", name = "fb", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!qa", name = "gb", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!qa", name = "hb", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!qa", name = "mb", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!qa", name = "nb", descriptor = "Lqd;")
    public static class100 field2480;

    @OriginalMember(owner = "client!qa", name = "cb", descriptor = "Ltd;")
    public static class116 field2469;

    @OriginalMember(owner = "client!qa", name = "jb", descriptor = "Lpc;")
    public static class93 field2476;

    @OriginalMember(owner = "client!qa", name = "db", descriptor = "[I")
    public static int[] field2470;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)V", line = 3)
    public static final void method766(int arg0, int arg1, int arg2) {
        field2473++;
        if (arg0 != -22711) {
            return;
        }
        long var3 = (long) ((arg1 << 16) + arg2);
        class129 var5 = (class129) class11.field201.method154(-1, var3);
        if (var5 != null) {
            class71.field1736.method127(var5, (byte) 63);
        }
    }

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V", line = 31)
    public static final void method767(int arg0) {
        field2472++;
        if (class103.field2635 == null) {
            return;
        }
        class67.method590(0);
        if (class18.field352 > 0) {
            class103.field2635.method49(false, 256);
            class18.field352 = 0;
        }
        int var1 = 121 / ((arg0 + 28) / 34);
        class103.field2635.method48(-17036);
        class103.field2635 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIILpb;Led;)V", line = 85)
    public static final void method768(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class92 arg7, class29 arg8) {
        field2463++;
        if (class81.field2085 && (class104.field2668[0][arg5][arg0] & 0x2) == 0) {
            if ((class104.field2668[arg1][arg5][arg0] & 0x10) != 0) {
                return;
            }
            if (class79.method653(27466, arg5, arg1, arg0) != class16.field316) {
                return;
            }
        }
        if (arg1 < class94.field2405) {
            class94.field2405 = arg1;
        }
        int var9 = class64.field1620[arg1][arg5 + 1][arg0];
        int var10 = class64.field1620[arg1][arg5][arg0];
        int var11 = class64.field1620[arg1][arg5 + 1][arg0 + 1];
        int var12 = class64.field1620[arg1][arg5][arg0 + 1];
        class57 var13 = class130.method965(arg2, 97);
        int var14 = var10 + var12 + var9 + var11 >> 2;
        int var15 = arg5 + (arg0 << 7) + (arg2 << 14) + 1073741824;
        int var16 = (arg4 << 6) + arg3;
        if (var13.field1460 == 0) {
            var15 += Integer.MIN_VALUE;
        }
        if (var13.field1456 == arg6) {
            var16 += 256;
        }
        if (var13.method535((byte) 93)) {
            class15.method102(-23283, var13, arg1, arg5, arg4, arg0);
        }
        if (arg3 == 22) {
            if (!class81.field2085 || var13.field1460 != 0 || var13.field1496) {
                class97 var17;
                if (var13.field1468 == -1 && var13.field1446 == null) {
                    var17 = var13.method536(var12, var10, 4, var9, 22, arg4, var11);
                } else {
                    var17 = new class25(arg2, 22, arg4, var10, var9, var11, var12, var13.field1468, true);
                }
                arg8.method265(arg1, arg5, arg0, var14, var17, var15, var16);
                if (var13.field1499 && var13.field1460 == 1 && arg7 != null) {
                    arg7.method736(arg5, arg6 - 114, arg0);
                }
            }
        } else if (arg3 == 10 || arg3 == 11) {
            class97 var37;
            if (var13.field1468 == -1 && var13.field1446 == null) {
                var37 = var13.method536(var12, var10, 4, var9, 10, arg4, var11);
            } else {
                var37 = new class25(arg2, 10, arg4, var10, var9, var11, var12, var13.field1468, true);
            }
            if (var37 != null) {
                int var38;
                int var39;
                if (arg4 == 1 || arg4 == 3) {
                    var38 = var13.field1498;
                    var39 = var13.field1458;
                } else {
                    var38 = var13.field1458;
                    var39 = var13.field1498;
                }
                int var40 = 0;
                if (arg3 == 11) {
                    var40 += 256;
                }
                if (arg8.method237(arg1, arg5, arg0, var14, var39, var38, var37, var40, var15, var16) && var13.field1479) {
                    class24 var41;
                    if (var37 instanceof class24) {
                        var41 = (class24) var37;
                    } else {
                        var41 = var13.method536(var12, var10, 4, var9, 10, arg4, var11);
                    }
                    if (var41 != null) {
                        for (int var42 = 0; var42 <= var39; var42++) {
                            for (int var43 = 0; var43 <= var38; var43++) {
                                int var44 = var41.method202() / 4;
                                if (var44 > 30) {
                                    var44 = 30;
                                }
                                if (class96.field2435[arg1][arg5 + var42][arg0 + var43] < var44) {
                                    class96.field2435[arg1][arg5 + var42][arg0 + var43] = (byte) var44;
                                }
                            }
                        }
                    }
                }
            }
            if (var13.field1499 && arg7 != null) {
                arg7.method745(arg5, arg0, -127, var13.field1489, arg4, var13.field1498, var13.field1458);
            }
        } else if (arg3 >= 12) {
            class97 var18;
            if (var13.field1468 == -1 && var13.field1446 == null) {
                var18 = var13.method536(var12, var10, 4, var9, arg3, arg4, var11);
            } else {
                var18 = new class25(arg2, arg3, arg4, var10, var9, var11, var12, var13.field1468, true);
            }
            arg8.method237(arg1, arg5, arg0, var14, 1, 1, var18, 0, var15, var16);
            if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg1 > 0) {
                class101.field2563[arg1][arg5][arg0] = class40.method350(class101.field2563[arg1][arg5][arg0], 2340);
            }
            if (var13.field1499 && arg7 != null) {
                arg7.method745(arg5, arg0, arg6 - 109, var13.field1489, arg4, var13.field1498, var13.field1458);
            }
        } else if (arg3 == 0) {
            class97 var19;
            if (var13.field1468 == -1 && var13.field1446 == null) {
                var19 = var13.method536(var12, var10, 4, var9, 0, arg4, var11);
            } else {
                var19 = new class25(arg2, 0, arg4, var10, var9, var11, var12, var13.field1468, true);
            }
            arg8.method264(arg1, arg5, arg0, var14, var19, null, class79.field1996[arg4], 0, var15, var16);
            if (arg4 == 0) {
                if (var13.field1479) {
                    class96.field2435[arg1][arg5][arg0] = 50;
                    class96.field2435[arg1][arg5][arg0 + 1] = 50;
                }
                if (var13.field1454) {
                    class101.field2563[arg1][arg5][arg0] = class40.method350(class101.field2563[arg1][arg5][arg0], 585);
                }
            } else if (arg4 == 1) {
                if (var13.field1479) {
                    class96.field2435[arg1][arg5][arg0 + 1] = 50;
                    class96.field2435[arg1][arg5 + 1][arg0 + 1] = 50;
                }
                if (var13.field1454) {
                    class101.field2563[arg1][arg5][arg0 + 1] = class40.method350(class101.field2563[arg1][arg5][arg0 + 1], 1170);
                }
            } else if (arg4 == 2) {
                if (var13.field1479) {
                    class96.field2435[arg1][arg5 + 1][arg0] = 50;
                    class96.field2435[arg1][arg5 + 1][arg0 + 1] = 50;
                }
                if (var13.field1454) {
                    class101.field2563[arg1][arg5 + 1][arg0] = class40.method350(class101.field2563[arg1][arg5 + 1][arg0], 585);
                }
            } else if (arg4 == 3) {
                if (var13.field1479) {
                    class96.field2435[arg1][arg5][arg0] = 50;
                    class96.field2435[arg1][arg5 + 1][arg0] = 50;
                }
                if (var13.field1454) {
                    class101.field2563[arg1][arg5][arg0] = class40.method350(class101.field2563[arg1][arg5][arg0], 1170);
                }
            }
            if (var13.field1499 && arg7 != null) {
                arg7.method742(var13.field1489, arg5, arg3, arg0, arg4, 1);
            }
            if (var13.field1501 != 16) {
                arg8.method244(arg1, arg5, arg0, var13.field1501);
            }
        } else if (arg3 == 1) {
            class97 var20;
            if (var13.field1468 == -1 && var13.field1446 == null) {
                var20 = var13.method536(var12, var10, 4, var9, 1, arg4, var11);
            } else {
                var20 = new class25(arg2, 1, arg4, var10, var9, var11, var12, var13.field1468, true);
            }
            arg8.method264(arg1, arg5, arg0, var14, var20, null, class21.field443[arg4], 0, var15, var16);
            if (var13.field1479) {
                if (arg4 == 0) {
                    class96.field2435[arg1][arg5][arg0 + 1] = 50;
                } else if (arg4 == 1) {
                    class96.field2435[arg1][arg5 + 1][arg0 + 1] = 50;
                } else if (arg4 == 2) {
                    class96.field2435[arg1][arg5 + 1][arg0] = 50;
                } else if (arg4 == 3) {
                    class96.field2435[arg1][arg5][arg0] = 50;
                }
            }
            if (var13.field1499 && arg7 != null) {
                arg7.method742(var13.field1489, arg5, arg3, arg0, arg4, 1);
            }
        } else if (arg3 == 2) {
            int var21 = arg4 + 1 & 0x3;
            class97 var22;
            class97 var23;
            if (var13.field1468 == -1 && var13.field1446 == null) {
                var22 = var13.method536(var12, var10, 4, var9, 2, arg4 + 4, var11);
                var23 = var13.method536(var12, var10, arg6 ^ 0x5, var9, 2, var21, var11);
            } else {
                var22 = new class25(arg2, 2, arg4 + 4, var10, var9, var11, var12, var13.field1468, true);
                var23 = new class25(arg2, 2, var21, var10, var9, var11, var12, var13.field1468, true);
            }
            arg8.method264(arg1, arg5, arg0, var14, var22, var23, class79.field1996[arg4], class79.field1996[var21], var15, var16);
            if (var13.field1454) {
                if (arg4 == 0) {
                    class101.field2563[arg1][arg5][arg0] = class40.method350(class101.field2563[arg1][arg5][arg0], 585);
                    class101.field2563[arg1][arg5][arg0 + 1] = class40.method350(class101.field2563[arg1][arg5][arg0 + 1], 1170);
                } else if (arg4 == 1) {
                    class101.field2563[arg1][arg5][arg0 + 1] = class40.method350(class101.field2563[arg1][arg5][arg0 + 1], 1170);
                    class101.field2563[arg1][arg5 + 1][arg0] = class40.method350(class101.field2563[arg1][arg5 + 1][arg0], 585);
                } else if (arg4 == 2) {
                    class101.field2563[arg1][arg5 + 1][arg0] = class40.method350(class101.field2563[arg1][arg5 + 1][arg0], 585);
                    class101.field2563[arg1][arg5][arg0] = class40.method350(class101.field2563[arg1][arg5][arg0], 1170);
                } else if (arg4 == 3) {
                    class101.field2563[arg1][arg5][arg0] = class40.method350(class101.field2563[arg1][arg5][arg0], 1170);
                    class101.field2563[arg1][arg5][arg0] = class40.method350(class101.field2563[arg1][arg5][arg0], 585);
                }
            }
            if (var13.field1499 && arg7 != null) {
                arg7.method742(var13.field1489, arg5, arg3, arg0, arg4, 1);
            }
            if (var13.field1501 != 16) {
                arg8.method244(arg1, arg5, arg0, var13.field1501);
            }
        } else if (arg3 == 3) {
            class97 var24;
            if (var13.field1468 == -1 && var13.field1446 == null) {
                var24 = var13.method536(var12, var10, arg6 + 3, var9, 3, arg4, var11);
            } else {
                var24 = new class25(arg2, 3, arg4, var10, var9, var11, var12, var13.field1468, true);
            }
            arg8.method264(arg1, arg5, arg0, var14, var24, null, class21.field443[arg4], 0, var15, var16);
            if (var13.field1479) {
                if (arg4 == 0) {
                    class96.field2435[arg1][arg5][arg0 + 1] = 50;
                } else if (arg4 == 1) {
                    class96.field2435[arg1][arg5 + 1][arg0 + 1] = 50;
                } else if (arg4 == 2) {
                    class96.field2435[arg1][arg5 + 1][arg0] = 50;
                } else if (arg4 == 3) {
                    class96.field2435[arg1][arg5][arg0] = 50;
                }
            }
            if (var13.field1499 && arg7 != null) {
                arg7.method742(var13.field1489, arg5, arg3, arg0, arg4, arg6);
            }
        } else if (arg3 == 9) {
            class97 var25;
            if (var13.field1468 == -1 && var13.field1446 == null) {
                var25 = var13.method536(var12, var10, 4, var9, arg3, arg4, var11);
            } else {
                var25 = new class25(arg2, arg3, arg4, var10, var9, var11, var12, var13.field1468, true);
            }
            arg8.method237(arg1, arg5, arg0, var14, 1, 1, var25, 0, var15, var16);
            if (var13.field1499 && arg7 != null) {
                arg7.method745(arg5, arg0, -115, var13.field1489, arg4, var13.field1498, var13.field1458);
            }
        } else {
            if (var13.field1497) {
                if (arg4 == 1) {
                    int var29 = var12;
                    var12 = var11;
                    var11 = var9;
                    var9 = var10;
                    var10 = var29;
                } else if (arg4 == 2) {
                    int var27 = var12;
                    var12 = var9;
                    var9 = var27;
                    int var28 = var11;
                    var11 = var10;
                    var10 = var28;
                } else if (arg4 == 3) {
                    int var26 = var12;
                    var12 = var10;
                    var10 = var9;
                    var9 = var11;
                    var11 = var26;
                }
            }
            if (arg3 == 4) {
                class97 var30;
                if (var13.field1468 == -1 && var13.field1446 == null) {
                    var30 = var13.method536(var12, var10, 4, var9, 4, 0, var11);
                } else {
                    var30 = new class25(arg2, 4, 0, var10, var9, var11, var12, var13.field1468, true);
                }
                arg8.method252(arg1, arg5, arg0, var14, var30, class79.field1996[arg4], arg4 * 512, 0, 0, var15, var16);
            } else if (arg3 == 5) {
                int var31 = 16;
                int var32 = arg8.method248(arg1, arg5, arg0);
                if (var32 > 0) {
                    var31 = class130.method965(var32 >> 14 & 0x7FFF, -64).field1501;
                }
                class97 var33;
                if (var13.field1468 == -1 && var13.field1446 == null) {
                    var33 = var13.method536(var12, var10, 4, var9, 4, 0, var11);
                } else {
                    var33 = new class25(arg2, 4, 0, var10, var9, var11, var12, var13.field1468, true);
                }
                arg8.method252(arg1, arg5, arg0, var14, var33, class79.field1996[arg4], arg4 * 512, class84.field2149[arg4] * var31, class63.field1596[arg4] * var31, var15, var16);
            } else if (arg3 == 6) {
                class97 var34;
                if (var13.field1468 == -1 && var13.field1446 == null) {
                    var34 = var13.method536(var12, var10, 4, var9, 4, 0, var11);
                } else {
                    var34 = new class25(arg2, 4, 0, var10, var9, var11, var12, var13.field1468, true);
                }
                arg8.method252(arg1, arg5, arg0, var14, var34, 256, arg4, 0, 0, var15, var16);
            } else if (arg3 == 7) {
                class97 var35;
                if (var13.field1468 == -1 && var13.field1446 == null) {
                    var35 = var13.method536(var12, var10, 4, var9, 4, 0, var11);
                } else {
                    var35 = new class25(arg2, 4, 0, var10, var9, var11, var12, var13.field1468, true);
                }
                arg8.method252(arg1, arg5, arg0, var14, var35, 512, arg4, 0, 0, var15, var16);
            } else if (arg3 == 8) {
                class97 var36;
                if (var13.field1468 == -1 && var13.field1446 == null) {
                    var36 = var13.method536(var12, var10, 4, var9, 4, 0, var11);
                } else {
                    var36 = new class25(arg2, 4, 0, var10, var9, var11, var12, var13.field1468, true);
                }
                arg8.method252(arg1, arg5, arg0, var14, var36, 768, arg4, 0, 0, var15, var16);
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "(I)V", line = 603)
    public static final void method769(int arg0) {
        if (class18.field358 != null) {
            class98 var1 = class18.field358;
            synchronized (class18.field358) {
                class18.field358 = null;
            }
        }
        field2479++;
        if (arg0 != -5) {
            field2470 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(B)Lde;", line = 631)
    public class24 method209(byte arg0) {
        int var2 = -9 % ((35 - arg0) / 59);
        field2474++;
        return null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIII)V", line = 642)
    public void method186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2467++;
        class24 var10 = this.method209((byte) -59);
        if (var10 != null) {
            this.field2466 = var10.field2466;
            var10.method186(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "(I)V", line = 659)
    public static void method770(int arg0) {
        if (arg0 != 0) {
            field2480 = null;
        }
        field2470 = null;
        field2475 = null;
        field2468 = null;
        field2476 = null;
        field2469 = null;
        field2477 = null;
        field2462 = null;
        field2478 = null;
        field2480 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)Lod;", line = 677)
    public static final class88 method771(int arg0, int arg1) {
        field2461++;
        class88 var2 = (class88) class51.field1256.method330((long) arg0, -1);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 4) {
            method768(-123, 59, 53, 25, 46, 8, -31, null, null);
        }
        byte[] var3 = class81.field2071.method892(4, arg0, false);
        class88 var4 = new class88();
        if (var3 != null) {
            var4.method716(-20927, new class131(var3), arg0);
        }
        var4.method715(-1);
        class51.field1256.method332(var4, 0, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIBIILwd;)V", line = 703)
    public static final void method772(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, class131 arg7) {
        field2471++;
        if (arg6 >= 0 && arg6 < 104 && arg1 >= 0 && arg1 < 104) {
            class104.field2668[arg0][arg6][arg1] = 0;
            while (true) {
                int var8 = arg7.method971(true);
                if (var8 == 0) {
                    if (arg0 == 0) {
                        class64.field1620[0][arg6][arg1] = -class74.method625(arg2 + arg6 + 932731, -18, arg1 + arg3 + 556238) * 8;
                    } else {
                        class64.field1620[arg0][arg6][arg1] = class64.field1620[arg0 - 1][arg6][arg1] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg7.method971(true);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg0 == 0) {
                        class64.field1620[0][arg6][arg1] = -var9 * 8;
                    } else {
                        class64.field1620[arg0][arg6][arg1] = class64.field1620[arg0 - 1][arg6][arg1] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class85.field2169[arg0][arg6][arg1] = arg7.method982(-18000);
                    class55.field1394[arg0][arg6][arg1] = (byte) ((var8 - 2) / 4);
                    class67.field1681[arg0][arg6][arg1] = (byte) class118.method914(3, arg5 + var8 - 2);
                } else if (var8 <= 81) {
                    class104.field2668[arg0][arg6][arg1] = (byte) (var8 - 49);
                } else {
                    class80.field2046[arg0][arg6][arg1] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg7.method971(true);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg7.method971(true);
                    break;
                }
                if (var10 <= 49) {
                    arg7.method971(true);
                }
            }
        }
        int var11 = 114 / ((34 - arg4) / 52);
    }
}
