import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class139 {

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "I")
    private int field1715 = -1;

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "Z")
    public boolean field1716 = true;

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "Ltu;")
    private class294 field1719;

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
    private int field1717;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "Lob;")
    private class639 field1707;

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "I")
    private int field1721;

    @OriginalMember(owner = "client!hq", name = "t", descriptor = "I")
    private int field1722;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    private int field1706;

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "Lnq;")
    private class396 field1712;

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "I")
    public int field1710;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "Lica;")
    private class579 field1703;

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "Lea;")
    public static class474 field1711 = new class474("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!hq", name = "u", descriptor = "Lkca;")
    public static class73 field1723 = new class73(50, -1);

    @OriginalMember(owner = "client!hq", name = "v", descriptor = "[Lhi;")
    public static class177[] field1724 = new class177[14];

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!hq", name = "p", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "I")
    public static int field1720;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hq", name = "w", descriptor = "Ljava/lang/Class;")
    public static Class field1725;

    // $FF: synthetic method
    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method840(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V", line = 4)
    public static void method833(int arg0) {
        if (arg0 != 128) {
            method836(null, (byte) 125);
        }
        field1724 = null;
        field1711 = null;
        field1723 = null;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lnq;II)V", line = 16)
    public final void method834(class396 arg0, int arg1, int arg2) {
        field1705++;
        if (arg2 > -99) {
            this.field1719 = null;
        }
        if (arg1 > 0) {
            this.method839(16720);
            this.field1719.method1971((byte) -54, this.field1703);
            this.field1719.method1508(-28296, this.field1722, arg1, this.field1706 + 1 - this.field1722, 0, class256.field3658, arg0);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIIIIII)V", line = 41)
    public static final void method835(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1708++;
        if (arg7 >= 0 && arg6 >= 0 && class90.field1032 - 1 > arg7 && arg6 < (class30.field349 - 1)) {
            if (class431.field6408 == null) {
                return;
            }
            if (arg5 == 0) {
                class57 var8 = (class57) class491.method2948(arg0, arg7, arg6);
                class57 var9 = (class57) class3.method12(arg0, arg7, arg6);
                if (var8 != null && arg4 != 2) {
                    if (var8 instanceof class643) {
                        ((class643) var8).field9258.method973(arg2, -1);
                    } else {
                        class131.method807((byte) 29, var8.method89(-107), arg6, arg5, arg3, arg0, arg7, arg4, arg2);
                    }
                }
                if (var9 != null) {
                    if ((var9 instanceof class643)) {
                        ((class643) var9).field9258.method973(arg2, arg1 ^ 0xFFFFFF7F);
                    } else {
                        class131.method807((byte) 29, var9.method89(arg1 ^ 0xFFFFFF3B), arg6, arg5, arg3, arg0, arg7, arg4, arg2);
                    }
                }
            } else if (arg5 == 1) {
                class57 var12 = (class57) class458.method2824(arg0, arg7, arg6);
                if (var12 != null) {
                    if (var12 instanceof class349) {
                        ((class349) var12).field4987.method973(arg2, -1);
                    } else {
                        int var13 = var12.method89(-68);
                        if (arg4 == 4 || arg4 == 5) {
                            class131.method807((byte) 29, var13, arg6, arg5, arg3, arg0, arg7, 4, arg2);
                        } else if (arg4 == 6) {
                            class131.method807((byte) 29, var13, arg6, arg5, arg3 + 4, arg0, arg7, 4, arg2);
                        } else if (arg4 == 7) {
                            class131.method807((byte) 29, var13, arg6, arg5, (arg3 + 2 & 0x3) + 4, arg0, arg7, 4, arg2);
                        } else if (arg4 == 8) {
                            class131.method807((byte) 29, var13, arg6, arg5, arg3 + 4, arg0, arg7, 4, arg2);
                            class131.method807((byte) 29, var13, arg6, arg5, (arg3 + 2 & 0x3) + 4, arg0, arg7, 4, arg2);
                        }
                    }
                }
            } else if (arg5 == 2) {
                class57 var11 = (class57) class226.method1473(arg0, arg7, arg6, field1725 == null ? (field1725 = method840("qn")) : field1725);
                if (var11 != null) {
                    if (arg4 == 11) {
                        arg4 = 10;
                    }
                    if ((var11 instanceof class354)) {
                        ((class354) var11).field5035.method973(arg2, -1);
                    } else {
                        class131.method807((byte) 29, var11.method89(111), arg6, arg5, arg3, arg0, arg7, arg4, arg2);
                    }
                }
            } else if (arg5 == 3) {
                class57 var10 = (class57) class157.method911(arg0, arg7, arg6);
                if (var10 != null) {
                    if (var10 instanceof class94) {
                        ((class94) var10).field1100.method973(arg2, arg1 - 129);
                    } else {
                        class131.method807((byte) 29, var10.method89(100), arg6, arg5, arg3, arg0, arg7, arg4, arg2);
                    }
                }
            }
        }
        if (arg1 != 128) {
            field1718 = -100;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lqb;B)V", line = 161)
    public static final void method836(class191 arg0, byte arg1) {
        field1714++;
        arg0.field2427 = 0;
        if (arg0.field2434 != -1) {
            class177 var2 = class259.field3686.method2961(arg0.field2434, 8);
            if (var2 == null || var2.field2181 == null) {
                arg0.field2434 = -1;
                arg0.field2432 = false;
            } else {
                label402: {
                    arg0.field2440++;
                    if (arg0.field2460 < var2.field2181.length && arg0.field2440 > var2.field2150[arg0.field2460]) {
                        arg0.field2454++;
                        arg0.field2460++;
                        arg0.field2440 = 1;
                        class405.method2571(class439.field6548 == arg0, arg0.field1764, 123, arg0.field1768, arg0.field1757, var2, arg0.field2460);
                    }
                    if (var2.field2181.length <= arg0.field2460) {
                        arg0.field2460 = 0;
                        arg0.field2440 = 0;
                        if (arg0.field2432) {
                            arg0.field2434 = arg0.method1158((byte) -126).method898(arg1 + 18);
                            if (arg0.field2434 == -1) {
                                arg0.field2432 = false;
                                break label402;
                            }
                            var2 = class259.field3686.method2961(arg0.field2434, arg1 + 26);
                        }
                        class405.method2571(class439.field6548 == arg0, arg0.field1764, 104, arg0.field1768, arg0.field1757, var2, arg0.field2460);
                    }
                    arg0.field2454 = arg0.field2460 + 1;
                    if (var2.field2181.length <= arg0.field2454) {
                        arg0.field2454 = 0;
                    }
                }
            }
        }
        if (arg0.field2472 != -1 && arg0.field2437 <= class287.field3982) {
            class576 var3 = class141.field1735.method3667(false, arg0.field2472);
            int var4 = var3.field8318;
            if (var4 == -1) {
                arg0.field2472 = -1;
            } else {
                label404: {
                    class177 var5 = class259.field3686.method2961(var4, 8);
                    if (var3.field8328) {
                        if (var5.field2169 == 3) {
                            if (arg0.field2519 > 0 && arg0.field2459 <= class287.field3982 && class287.field3982 > arg0.field2498) {
                                arg0.field2472 = -1;
                                break label404;
                            }
                        } else if (var5.field2169 == 1 && arg0.field2519 > 0 && arg0.field2459 <= class287.field3982 && class287.field3982 > arg0.field2498) {
                            arg0.field2437 = class287.field3982 + 1;
                            break label404;
                        }
                    }
                    if (var5 == null || var5.field2181 == null) {
                        arg0.field2472 = -1;
                    } else {
                        if (arg0.field2468 < 0) {
                            arg0.field2468 = 0;
                            class405.method2571(class439.field6548 == arg0, arg0.field1764, -89, arg0.field1768, arg0.field1757, var5, 0);
                        }
                        arg0.field2451++;
                        if (arg0.field2468 < var5.field2181.length && var5.field2150[arg0.field2468] < arg0.field2451) {
                            arg0.field2468++;
                            arg0.field2451 = 1;
                            class405.method2571(class439.field6548 == arg0, arg0.field1764, 127, arg0.field1768, arg0.field1757, var5, arg0.field2468);
                        }
                        if (arg0.field2468 >= var5.field2181.length) {
                            if (var3.field8328) {
                                arg0.field2468 -= var5.field2168;
                                arg0.field2475++;
                                if (var5.field2179 <= arg0.field2475) {
                                    arg0.field2472 = -1;
                                } else if (arg0.field2468 >= 0 && arg0.field2468 < var5.field2181.length) {
                                    class405.method2571(class439.field6548 == arg0, arg0.field1764, 69, arg0.field1768, arg0.field1757, var5, arg0.field2468);
                                } else {
                                    arg0.field2472 = -1;
                                }
                            } else {
                                arg0.field2472 = -1;
                            }
                        }
                        arg0.field2488 = arg0.field2468 + 1;
                        if (arg0.field2488 >= var5.field2181.length) {
                            if (var3.field8328) {
                                arg0.field2488 -= var5.field2168;
                                if (var5.field2179 <= (arg0.field2475 + 1)) {
                                    arg0.field2488 = -1;
                                } else if (arg0.field2488 < 0 || arg0.field2488 >= var5.field2181.length) {
                                    arg0.field2488 = -1;
                                }
                            } else {
                                arg0.field2488 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field2421 != -1 && arg0.field2476 <= class287.field3982) {
            class576 var6 = class141.field1735.method3667(false, arg0.field2421);
            int var7 = var6.field8318;
            if (var7 == -1) {
                arg0.field2421 = -1;
            } else {
                label407: {
                    class177 var8 = class259.field3686.method2961(var7, 8);
                    if (var6.field8328) {
                        if (var8.field2169 == 3) {
                            if (arg0.field2519 > 0 && class287.field3982 >= arg0.field2459 && arg0.field2498 < class287.field3982) {
                                arg0.field2421 = -1;
                                break label407;
                            }
                        } else if (var8.field2169 == 1 && arg0.field2519 > 0 && arg0.field2459 <= class287.field3982 && class287.field3982 > arg0.field2498) {
                            arg0.field2476 = class287.field3982 + 1;
                            break label407;
                        }
                    }
                    if (var8 == null || var8.field2181 == null) {
                        arg0.field2421 = -1;
                    } else {
                        if (arg0.field2443 < 0) {
                            arg0.field2443 = 0;
                            class405.method2571(class439.field6548 == arg0, arg0.field1764, -123, arg0.field1768, arg0.field1757, var8, 0);
                        }
                        arg0.field2494++;
                        if (var8.field2181.length > arg0.field2443 && arg0.field2494 > var8.field2150[arg0.field2443]) {
                            arg0.field2494 = 1;
                            arg0.field2443++;
                            class405.method2571(class439.field6548 == arg0, arg0.field1764, 84, arg0.field1768, arg0.field1757, var8, arg0.field2443);
                        }
                        if (var8.field2181.length <= arg0.field2443) {
                            if (var6.field8328) {
                                arg0.field2443 -= var8.field2168;
                                arg0.field2456++;
                                if (var8.field2179 <= arg0.field2456) {
                                    arg0.field2421 = -1;
                                } else if (arg0.field2443 >= 0 && arg0.field2443 < var8.field2181.length) {
                                    class405.method2571(class439.field6548 == arg0, arg0.field1764, arg1 + 93, arg0.field1768, arg0.field1757, var8, arg0.field2443);
                                } else {
                                    arg0.field2421 = -1;
                                }
                            } else {
                                arg0.field2421 = -1;
                            }
                        }
                        arg0.field2424 = arg0.field2443 + 1;
                        if (var8.field2181.length <= arg0.field2424) {
                            if (var6.field8328) {
                                arg0.field2424 -= var8.field2168;
                                if (arg0.field2456 + 1 >= var8.field2179) {
                                    arg0.field2424 = -1;
                                } else if (arg0.field2424 < 0 || arg0.field2424 >= var8.field2181.length) {
                                    arg0.field2424 = -1;
                                }
                            } else {
                                arg0.field2424 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field2502 != -1 && arg0.field2482 <= 1) {
            class177 var9 = class259.field3686.method2961(arg0.field2502, 8);
            if (var9.field2169 == 3) {
                if (arg0.field2519 > 0 && class287.field3982 >= arg0.field2459 && arg0.field2498 < class287.field3982) {
                    arg0.field2502 = -1;
                }
            } else if (var9.field2169 == 1 && arg0.field2519 > 0 && class287.field3982 >= arg0.field2459 && arg0.field2498 < class287.field3982) {
                arg0.field2482 = 2;
            }
        }
        if (arg0.field2502 != -1 && arg0.field2482 == 0) {
            class177 var10 = class259.field3686.method2961(arg0.field2502, 8);
            if (var10 == null || var10.field2181 == null) {
                arg0.field2502 = -1;
            } else {
                arg0.field2487++;
                if (arg0.field2491 < var10.field2181.length && var10.field2150[arg0.field2491] < arg0.field2487) {
                    arg0.field2491++;
                    arg0.field2487 = 1;
                    class405.method2571(class439.field6548 == arg0, arg0.field1764, arg1 - 41, arg0.field1768, arg0.field1757, var10, arg0.field2491);
                }
                if (arg0.field2491 >= var10.field2181.length) {
                    arg0.field2491 -= var10.field2168;
                    arg0.field2490++;
                    if (var10.field2179 <= arg0.field2490) {
                        arg0.field2502 = -1;
                    } else if (arg0.field2491 >= 0 && arg0.field2491 < var10.field2181.length) {
                        class405.method2571(class439.field6548 == arg0, arg0.field1764, 101, arg0.field1768, arg0.field1757, var10, arg0.field2491);
                    } else {
                        arg0.field2502 = -1;
                    }
                }
                arg0.field2486 = arg0.field2491 + 1;
                if (var10.field2181.length <= arg0.field2486) {
                    arg0.field2486 -= var10.field2168;
                    if (var10.field2179 <= arg0.field2490 + 1) {
                        arg0.field2486 = -1;
                    } else if (arg0.field2486 < 0 || var10.field2181.length <= arg0.field2486) {
                        arg0.field2486 = -1;
                    }
                }
                arg0.field2427 = var10.field2156;
            }
        }
        if (arg0.field2482 > 0) {
            arg0.field2482--;
        }
        if (arg1 != -18) {
            field1724 = null;
        }
        for (int var11 = 0; var11 < arg0.field2428.length; var11++) {
            class283 var12 = arg0.field2428[var11];
            if (var12 != null) {
                if (var12.field3932 > 0) {
                    var12.field3932--;
                } else {
                    class177 var13 = class259.field3686.method2961(var12.field3928, 8);
                    if (var13 == null || var13.field2181 == null) {
                        arg0.field2428[var11] = null;
                    } else {
                        var12.field3930++;
                        if (var13.field2181.length > var12.field3929 && var12.field3930 > var13.field2150[var12.field3929]) {
                            var12.field3929++;
                            var12.field3930 = 1;
                            class405.method2571(class439.field6548 == arg0, arg0.field1764, -86, arg0.field1768, arg0.field1757, var13, var12.field3929);
                        }
                        if (var12.field3929 >= var13.field2181.length) {
                            var12.field3927++;
                            var12.field3929 -= var13.field2168;
                            if (var13.field2179 <= var12.field3927) {
                                arg0.field2428[var11] = null;
                            } else if (var12.field3929 >= 0 && var12.field3929 < var13.field2181.length) {
                                class405.method2571(class439.field6548 == arg0, arg0.field1764, 118, arg0.field1768, arg0.field1757, var13, var12.field3929);
                            } else {
                                arg0.field2428[var11] = null;
                            }
                        }
                        var12.field3926 = var12.field3929 + 1;
                        if (var12.field3926 >= var13.field2181.length) {
                            var12.field3926 -= var13.field2168;
                            if (var13.field2179 <= (var12.field3927 + 1)) {
                                var12.field3926 = -1;
                            } else if (var12.field3926 < 0 || var12.field3926 >= var13.field2181.length) {
                                var12.field3926 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "([BIILgf;)Lle;", line = 590)
    public static final class260 method837(byte[] arg0, int arg1, int arg2, class234 arg3) {
        field1709++;
        if (arg0 == null) {
            return null;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg2, var4);
        OpenGL.glProgramRawARB(arg2, 34933, arg0);
        if (arg1 <= 11) {
            return null;
        }
        OpenGL.glGetIntegerv(34379, class17.field175, 0);
        if (class17.field175[0] == -1) {
            OpenGL.glBindProgramARB(arg2, 0);
            return new class260(arg3, arg2, var4);
        } else {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Ltu;Lob;Lha;IIIII)V", line = 823)
    public class139(class294 arg0, class639 arg1, class53 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1719 = arg0;
        this.field1717 = arg6;
        this.field1707 = arg1;
        this.field1721 = arg7;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field1656 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field550[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field1703 = null;
            this.field1710 = 0;
        } else {
            this.field1722 = Integer.MAX_VALUE;
            this.field1706 = Integer.MIN_VALUE;
            this.field1712 = this.field1719.method1535((byte) -61, false);
            this.field1712.method654(var10, 9658);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field1712.method652(true, 31983);
                if (var15 != null) {
                    Stream var16 = this.field1719.method1932(var15, (byte) -82);
                    if (Stream.method3423()) {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field1656 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field550[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (this.field1722 > var22) {
                                            this.field1722 = var22;
                                        }
                                        if (var22 > this.field1706) {
                                            this.field1706 = var22;
                                        }
                                        var16.method3414(var22);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field1656 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field550[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (var28 > this.field1706) {
                                            this.field1706 = var28;
                                        }
                                        if (this.field1722 > var28) {
                                            this.field1722 = var28;
                                        }
                                        var16.method3413(var28);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3411();
                    if (this.field1712.method651(-15045)) {
                        break;
                    }
                }
            }
            this.field1710 = var10 / 3;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Z)V", line = 629)
    public final void method838(boolean arg0) {
        field1720++;
        this.method834(this.field1712, this.field1710, -101);
        if (arg0) {
            this.method838(true);
        }
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V", line = 646)
    private final void method839(int arg0) {
        if (arg0 != 16720) {
            return;
        }
        field1713++;
        if (!this.field1716) {
            return;
        }
        this.field1716 = false;
        byte[] var2 = this.field1707.field9175;
        int var3 = 0;
        int var4 = this.field1707.field9182;
        int var5 = this.field1707.field9182 * this.field1721 + this.field1717;
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field1703 != null && this.field1715 == var3) {
            this.field1716 = false;
            return;
        }
        this.field1715 = var3;
        int var7 = this.field1721 * var4 + this.field1717;
        int var8 = 0;
        if (!this.field1719.method1528(class562.field8019, (byte) 59, class256.field3653)) {
            if (class67.field740 == null) {
                class67.field740 = new int[16384];
            }
            int[] var9 = class67.field740;
            for (int var10 = -128; var10 < 0; var10++) {
                for (int var11 = -128; var11 < 0; var11++) {
                    if (var2[var7] == 0) {
                        int var12 = 0;
                        if (var2[var7 - 1] != 0) {
                            var12++;
                        }
                        if (var2[var7 + 1] != 0) {
                            var12++;
                        }
                        if (var2[var7 - var4] != 0) {
                            var12++;
                        }
                        if (var2[var4 + var7] != 0) {
                            var12++;
                        }
                        var9[var8++] = var12 * 17 << 24;
                    } else {
                        var9[var8++] = 1140850688;
                    }
                    var7++;
                }
                var7 += this.field1707.field9182 - 128;
            }
            if (this.field1703 == null) {
                this.field1703 = this.field1719.method1947(108, class67.field740, false, 128, 128);
                this.field1703.method476(false, false, (byte) 124);
            } else {
                this.field1703.method471(0, 0, 128, 128, arg0 ^ 0x5532, 0, class67.field740, 128);
            }
            return;
        }
        if (class636.field9148 == null) {
            class636.field9148 = new byte[16384];
        }
        byte[] var13 = class636.field9148;
        for (int var14 = -128; var14 < 0; var14++) {
            for (int var15 = -128; var15 < 0; var15++) {
                if (var2[var7] == 0) {
                    int var16 = 0;
                    if (var2[var7 - 1] != 0) {
                        var16++;
                    }
                    if (var2[var7 + 1] != 0) {
                        var16++;
                    }
                    if (var2[var7 - var4] != 0) {
                        var16++;
                    }
                    if (var2[var7 + var4] != 0) {
                        var16++;
                    }
                    var13[var8++] = (byte) (var16 * 17);
                } else {
                    var13[var8++] = 68;
                }
                var7++;
            }
            var7 += this.field1707.field9182 - 128;
        }
        if (this.field1703 == null) {
            this.field1703 = this.field1719.method1948(class562.field8019, class636.field9148, 128, 128, false, true);
            this.field1703.method476(false, false, (byte) 123);
        } else {
            this.field1703.method469(128, 0, 128, class562.field8019, class636.field9148, 0, (byte) -113, 0, 128);
        }
    }
}
