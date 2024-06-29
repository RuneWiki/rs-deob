import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class432 extends class305 {

    @OriginalMember(owner = "client!iu", name = "G", descriptor = "I")
    private int field6418 = 0;

    @OriginalMember(owner = "client!iu", name = "K", descriptor = "I")
    private int field6422 = 4096;

    @OriginalMember(owner = "client!iu", name = "J", descriptor = "I")
    public static int field6421 = 0;

    @OriginalMember(owner = "client!iu", name = "D", descriptor = "I")
    public static int field6415;

    @OriginalMember(owner = "client!iu", name = "F", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!iu", name = "H", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!iu", name = "I", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!iu", name = "L", descriptor = "I")
    public static int field6423;

    @OriginalMember(owner = "client!iu", name = "M", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!iu", name = "E", descriptor = "Ll;")
    public static class127 field6416;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IB)[[I", line = 11)
    public final int[][] method72(int arg0, byte arg1) {
        ++field6415;
        if (arg1 > -59) {
            this.method14(79, (class194) null, (byte) 71);
        }
        int[][] var3 = super.field4674.method2206(-127, arg0);
        if (super.field4674.field5110) {
            int[][] var4 = this.method2015(true, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class91.field1471 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 >= this.field6418) {
                    if (~var12 >= ~this.field6422) {
                        var8[var11] = var12;
                    } else {
                        var8[var11] = this.field6422;
                    }
                } else {
                    var8[var11] = this.field6418;
                }
                if (this.field6418 <= var13) {
                    if (~var13 >= ~this.field6422) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field6422;
                    }
                } else {
                    var9[var11] = this.field6418;
                }
                if (this.field6418 <= var14) {
                    if (~var14 >= ~this.field6422) {
                        var10[var11] = var14;
                    } else {
                        var10[var11] = this.field6422;
                    }
                } else {
                    var10[var11] = this.field6418;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "(I)V", line = 88)
    public static final void method2686(int arg0) {
        for (int var1 = 0; ~var1 > -6; ++var1) {
            class190.field2911[var1] = false;
        }
        ++field6417;
        class37.field459 = 0;
        class420.field6167 = -1;
        class134.field1993 = 0;
        class33.field401 = 1;
        if (arg0 != 2) {
            field6416 = null;
        }
        class480.field7050 = -1;
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(III)I", line = 112)
    public static final int method2687(int arg0, int arg1, int arg2) {
        if (arg2 != -3935) {
            method2688(false);
        }
        int var3 = (arg0 & 127) * arg1 >> 7;
        ++field6424;
        if (~var3 > -3) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 65408) + var3;
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "()V", line = 306)
    public class432() {
        super(1, false);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Z)Z", line = 136)
    public static final boolean method2688(boolean arg0) {
        for (int var1 = class251.field4091; var1 < class183.field2802; ++var1) {
            class281[][] var2 = class348.field5192[var1];
            for (int var3 = -class16.field166; var3 <= 0; ++var3) {
                int var4 = class144.field2126 + var3;
                int var5 = class144.field2126 - var3;
                if (var4 >= class83.field1368 || var5 < class324.field4921) {
                    for (int var6 = -class16.field166; var6 <= 0; ++var6) {
                        int var7 = class29.field323 + var6;
                        int var8 = class29.field323 - var6;
                        if (var4 >= class83.field1368) {
                            if (var7 >= class7.field84) {
                                class281 var9 = var2[var4][var7];
                                if (var9 != null && var9.field4370) {
                                    class503.field7310 = arg0;
                                    class33.field398.method278(0, var9);
                                    class33.field398.method269(55);
                                }
                            }
                            if (var8 < class20.field230) {
                                class281 var10 = var2[var4][var8];
                                if (var10 != null && var10.field4370) {
                                    class503.field7310 = arg0;
                                    class33.field398.method278(0, var10);
                                    class33.field398.method269(98);
                                }
                            }
                        }
                        if (var5 < class324.field4921) {
                            if (var7 >= class7.field84) {
                                class281 var11 = var2[var5][var7];
                                if (var11 != null && var11.field4370) {
                                    class503.field7310 = arg0;
                                    class33.field398.method278(0, var11);
                                    class33.field398.method269(85);
                                }
                            }
                            if (var8 < class20.field230) {
                                class281 var12 = var2[var5][var8];
                                if (var12 != null && var12.field4370) {
                                    class503.field7310 = arg0;
                                    class33.field398.method278(0, var12);
                                    class33.field398.method269(73);
                                }
                            }
                        }
                        if (class256.field4118 == 0) {
                            if (class256.field4122) {
                                class33.field398.method267((byte) -68, 24);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(ILfh;B)V", line = 249)
    public final void method14(int arg0, class194 arg1, byte arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field4675 = arg1.method1337((byte) 90) == 1;
                }
            } else {
                this.field6422 = arg1.method1396(-89);
            }
        } else {
            this.field6418 = arg1.method1396(51);
        }
        if (arg2 <= 76) {
            method2686(-81);
        }
        ++field6420;
    }

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "(B)V", line = 294)
    public static void method2689(byte arg0) {
        field6416 = null;
        int var1 = 16 % ((arg0 - 33) / 62);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)[I", line = 309)
    public final int[] method15(int arg0, int arg1) {
        if (arg1 != 4688) {
            return null;
        } else {
            ++field6419;
            int[] var3 = super.field4677.method2174(arg0, 47);
            if (super.field4677.field5040) {
                int[] var4 = this.method2021(0, arg0, 0);
                for (int var5 = 0; class91.field1471 > var5; ++var5) {
                    int var6 = var4[var5];
                    if (~this.field6418 >= ~var6) {
                        if (this.field6422 < var6) {
                            var3[var5] = this.field6422;
                        } else {
                            var3[var5] = var6;
                        }
                    } else {
                        var3[var5] = this.field6418;
                    }
                }
            }
            return var3;
        }
    }
}
