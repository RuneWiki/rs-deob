import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class435 extends class444 {

    @OriginalMember(owner = "client!bo", name = "P", descriptor = "[I")
    public static int[] field6211;

    @OriginalMember(owner = "client!bo", name = "R", descriptor = "[I")
    public static int[] field6213;

    @OriginalMember(owner = "client!bo", name = "V", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!bo", name = "Q", descriptor = "B")
    public byte field6212;

    @OriginalMember(owner = "client!bo", name = "K", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!bo", name = "L", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!bo", name = "M", descriptor = "I")
    public int field6208;

    @OriginalMember(owner = "client!bo", name = "N", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!bo", name = "S", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!bo", name = "T", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!bo", name = "O", descriptor = "Ltj;")
    public static class108 field6210;

    @OriginalMember(owner = "client!bo", name = "U", descriptor = "Llf;")
    public class130 field6216;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V")
    public static void method2714(int arg0) {
        if (arg0 != 0) {
            field6210 = null;
        }
        field6211 = null;
        field6213 = null;
        field6210 = null;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lhl;BZ)V")
    public static final void method2715(class311 arg0, byte arg1, boolean arg2) {
        ++field6206;
        class3 var3 = arg0.method2093(arg1 + -1498200498);
        if (~arg0.field4599 == -1) {
            class21.field274 = -1;
            class73.field946 = 0;
            arg0.field4604 = 0;
        } else {
            if (arg0.field4558 != -1 && ~arg0.field4535 == -1) {
                class183 var4 = class110.method671(-21965, arg0.field4558);
                if (arg0.field4589 > 0 && ~var4.field2610 == -1) {
                    class73.field946 = 0;
                    ++arg0.field4604;
                    class21.field274 = -1;
                    return;
                }
                if (~arg0.field4589 >= -1 && ~var4.field2597 == -1) {
                    ++arg0.field4604;
                    class73.field946 = 0;
                    class21.field274 = -1;
                    return;
                }
            }
            if (~arg0.field4578 != 0 && arg0.field4518 <= class34.field434) {
                class135 var5 = class209.method1486(arg0.field4578, 11);
                if (var5.field2068 && ~var5.field2078 != 0) {
                    class183 var6 = class110.method671(-21965, var5.field2078);
                    if (arg0.field4589 > 0 && ~var6.field2610 == -1) {
                        class21.field274 = -1;
                        class73.field946 = 0;
                        ++arg0.field4604;
                        return;
                    }
                    if (~arg0.field4589 >= -1 && ~var6.field2597 == -1) {
                        class73.field946 = 0;
                        class21.field274 = -1;
                        ++arg0.field4604;
                        return;
                    }
                }
            }
            int var7 = arg0.field4463;
            int var8 = arg0.field4466;
            if (arg1 == 19) {
                int var9 = arg0.field4595[arg0.field4599 - 1] * 128 - -(64 * arg0.method773((byte) 111));
                int var10 = arg0.field4601[arg0.field4599 - 1] * 128 - -(64 * arg0.method773((byte) 56));
                if (arg2 || ~(var9 - var7) >= -257 && ~(-var7 + var9) <= 255 && ~(-var8 + var10) >= -257 && -var8 + var10 >= -256) {
                    if (var9 <= var7) {
                        if (var7 <= var9) {
                            if (~var10 < ~var8) {
                                arg0.method2079((byte) -62, 8192);
                            } else if (var8 > var10) {
                                arg0.method2079((byte) -128, 0);
                            }
                        } else if (~var10 < ~var8) {
                            arg0.method2079((byte) -69, 6144);
                        } else if (~var8 >= ~var10) {
                            arg0.method2079((byte) -104, 4096);
                        } else {
                            arg0.method2079((byte) -98, 2048);
                        }
                    } else if (var10 > var8) {
                        arg0.method2079((byte) -47, 10240);
                    } else if (~var8 < ~var10) {
                        arg0.method2079((byte) -76, 14336);
                    } else {
                        arg0.method2079((byte) -105, 12288);
                    }
                    int var11 = 4;
                    boolean var12 = true;
                    if (arg0 instanceof class446) {
                        var12 = ((class446) arg0).field6375.field5030;
                    }
                    if (!var12) {
                        if (!arg2 && ~arg0.field4599 < -2) {
                            var11 = 6;
                        }
                        if (!arg2 && arg0.field4599 > 2) {
                            var11 = 8;
                        }
                    } else {
                        int var13 = arg0.field4582 - arg0.field4570.field5403;
                        if (var13 != 0 && ~arg0.field4569 == 0 && arg0.field4568 != 0) {
                            var11 = 2;
                        }
                        if (!arg2 && arg0.field4599 > 2) {
                            var11 = 6;
                        }
                        if (!arg2 && arg0.field4599 > 3) {
                            var11 = 8;
                        }
                    }
                    if (~arg0.field4604 < -1 && ~arg0.field4599 < -2) {
                        var11 = 8;
                        --arg0.field4604;
                    }
                    byte var14 = arg0.field4606[arg0.field4599 + -1];
                    if (~var14 != -3) {
                        if (var14 == 0) {
                            var11 >>= 1;
                        }
                    } else {
                        var11 <<= 1;
                    }
                    class73.field946 = 0;
                    if (~var3.field22 != 0) {
                        int var15 = var11 << 7;
                        if (arg0.field4599 == 1) {
                            int var16 = arg0.field4594 * arg0.field4594;
                            int var17 = (arg0.field4463 <= var9 ? -arg0.field4463 + var9 : -var9 + arg0.field4463) << 7;
                            int var18 = (~arg0.field4466 >= ~var10 ? -arg0.field4466 + var10 : arg0.field4466 - var10) << 7;
                            int var19 = var18 >= var17 ? var18 : var17;
                            int var20 = var3.field22 * 2 * var19;
                            if (var16 > var20) {
                                arg0.field4594 /= 2;
                            } else if (var19 < var16 / 2) {
                                arg0.field4594 -= var3.field22;
                                if (~arg0.field4594 > -1) {
                                    arg0.field4594 = 0;
                                }
                            } else if (~arg0.field4594 > ~var15) {
                                arg0.field4594 += var3.field22;
                                if (arg0.field4594 > var15) {
                                    arg0.field4594 = var15;
                                }
                            }
                        } else if (~var15 < ~arg0.field4594) {
                            arg0.field4594 += var3.field22;
                            if (var15 < arg0.field4594) {
                                arg0.field4594 = var15;
                            }
                        } else if (arg0.field4594 > 0) {
                            arg0.field4594 -= var3.field22;
                            if (arg0.field4594 < 0) {
                                arg0.field4594 = 0;
                            }
                        }
                        var11 = arg0.field4594 >> 7;
                        if (~var11 > -2) {
                            var11 = 1;
                        }
                    }
                    if (var9 > var7) {
                        class73.field946 |= 4;
                        arg0.field4463 += var11;
                        if (arg0.field4463 > var9) {
                            arg0.field4463 = var9;
                        }
                    } else if (~var7 < ~var9) {
                        arg0.field4463 -= var11;
                        class73.field946 |= 8;
                        if (var9 > arg0.field4463) {
                            arg0.field4463 = var9;
                        }
                    }
                    if (~var8 > ~var10) {
                        class73.field946 |= 1;
                        arg0.field4466 += var11;
                        if (arg0.field4466 > var10) {
                            arg0.field4466 = var10;
                        }
                    } else if (var8 > var10) {
                        class73.field946 |= 2;
                        arg0.field4466 -= var11;
                        if (~var10 < ~arg0.field4466) {
                            arg0.field4466 = var10;
                        }
                    }
                    if (var11 < 8) {
                        class21.field274 = var14;
                    } else {
                        class21.field274 = 2;
                    }
                    if (arg0.field4463 == var9 && ~arg0.field4466 == ~var10) {
                        --arg0.field4599;
                        if (~arg0.field4589 < -1) {
                            --arg0.field4589;
                            return;
                        }
                    }
                } else {
                    class21.field274 = -1;
                    class73.field946 = 0;
                    arg0.field4463 = var9;
                    arg0.field4466 = var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(Z)I")
    public final int method453(boolean arg0) {
        if (!arg0) {
            method2716();
        }
        ++field6209;
        return this.field6216 == null ? 0 : this.field6216.field1880 * 100 / (this.field6216.field1851.length + -this.field6212);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "()V")
    public static final void method2716() {
        for (int var0 = 0; var0 < class91.field1179; ++var0) {
            class306 var1 = class448.field6398[var0];
            class440.method2741(var1);
            class448.field6398[var0] = null;
        }
        class91.field1179 = 0;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)[B")
    public final byte[] method448(int arg0) {
        ++field6207;
        if (arg0 != 17484) {
            method2714(-77);
        }
        if (!super.field6348 && ~(this.field6216.field1851.length + -this.field6212) >= ~this.field6216.field1880) {
            return this.field6216.field1851;
        } else {
            throw new RuntimeException();
        }
    }

    static {
        new class349("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        field6211 = new int[25];
        field6213 = new int[32];
        field6217 = 0;
    }
}
