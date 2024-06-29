import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class385 extends class440 {

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "I")
    private int field5419 = -1;

    @OriginalMember(owner = "client!ij", name = "Q", descriptor = "[I")
    public static int[] field5430 = new int[1];

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "I")
    public int field5418;

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "I")
    public int field5423;

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!ij", name = "O", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!ij", name = "P", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!ij", name = "R", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!ij", name = "S", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "[I")
    public int[] field5424;

    @OriginalMember(owner = "client!ij", name = "G", descriptor = "[J")
    public static long[] field5421;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lok;Z)V", line = 3)
    public static final void method2297(class228 arg0, boolean arg1) {
        ++field5431;
        if (class588.field8244 == null) {
            class587 var2 = new class587();
            byte[] var3 = var2.method3322(71, 128, 128, 16);
            class588.field8244 = class62.method647((byte) 22, var3, false);
        }
        if (class334.field4950 == null) {
            class467 var4 = new class467();
            byte[] var5 = var4.method2762(128, (byte) 65, 128, 16);
            class334.field4950 = class62.method647((byte) 63, var5, false);
        }
        if (arg1) {
            method2299((byte) -115);
        }
        class358 var6 = arg0.field3403;
        if (var6.method2184((byte) 6) && class577.field8129 == null) {
            byte[] var7 = class554.method3146(new class271(419684), 4.0F, 16.0F, 16, (byte) 13, 128, 0.6F, 4.0F, 128, 0.5F, 8);
            class577.field8129 = class62.method647((byte) 73, var7, false);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)[[I", line = 49)
    public int[][] method763(int arg0, int arg1) {
        ++field5428;
        int[][] var3 = super.field6417.method3769(arg1, arg0 + -20669);
        if (arg0 != -5766) {
            field5430 = null;
        }
        if (super.field6417.field9606 && this.method2298(0)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field5418 * (~class221.field3098 == ~this.field5423 ? arg1 : this.field5423 * arg1 / class221.field3098);
            if (class549.field7715 == this.field5418) {
                for (int var8 = 0; ~var8 > ~class549.field7715; ++var8) {
                    int var9 = this.field5424[var7++];
                    var6[var8] = class689.method3797(var9 << 4, 4080);
                    var5[var8] = class689.method3797(var9 >> 4, 4080);
                    var4[var8] = class689.method3797(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; ~class549.field7715 < ~var10; ++var10) {
                    int var11 = this.field5418 * var10 / class549.field7715;
                    int var12 = this.field5424[var7 + var11];
                    var6[var10] = class689.method3797(4080, var12 << 4);
                    var5[var10] = class689.method3797(var12 >> 4, 4080);
                    var4[var10] = class689.method3797(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "(I)Z", line = 118)
    public final boolean method2298(int arg0) {
        ++field5422;
        if (this.field5424 != null) {
            return true;
        } else if (this.field5419 >= arg0) {
            class113 var2 = class415.field6019 >= 0 ? class113.method875(class330.field4876, class415.field6019, this.field5419) : class113.method886(class330.field4876, this.field5419);
            var2.method881();
            this.field5424 = var2.method887();
            this.field5423 = var2.field1708;
            this.field5418 = var2.field1706;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)V", line = 141)
    public static void method2299(byte arg0) {
        field5430 = null;
        if (arg0 != -2) {
            field5430 = null;
        }
        field5421 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(CI)C", line = 153)
    public static final char method2300(char arg0, int arg1) {
        if (arg1 != -1062099612) {
            method2297((class228) null, false);
        }
        ++field5432;
        if (~arg0 != -33 && ~arg0 != -161 && ~arg0 != -96 && ~arg0 != -46) {
            if (~arg0 != -92 && ~arg0 != -94 && ~arg0 != -36) {
                if (~arg0 != -225 && ~arg0 != -226 && ~arg0 != -227 && arg0 != 228 && arg0 != 227 && arg0 != 192 && ~arg0 != -194 && arg0 != 194 && ~arg0 != -197 && arg0 != 195) {
                    if (arg0 != 232 && ~arg0 != -234 && arg0 != 234 && arg0 != 235 && ~arg0 != -201 && ~arg0 != -202 && arg0 != 202 && arg0 != 203) {
                        if (arg0 != 237 && ~arg0 != -239 && ~arg0 != -240 && arg0 != 205 && arg0 != 206 && ~arg0 != -208) {
                            if (arg0 != 242 && ~arg0 != -244 && arg0 != 244 && ~arg0 != -247 && arg0 != 245 && ~arg0 != -211 && arg0 != 211 && ~arg0 != -213 && ~arg0 != -215 && ~arg0 != -214) {
                                if (arg0 != 249 && ~arg0 != -251 && arg0 != 251 && arg0 != 252 && arg0 != 217 && ~arg0 != -219 && arg0 != 219 && arg0 != 220) {
                                    if (arg0 != 231 && ~arg0 != -200) {
                                        if (arg0 != 255 && ~arg0 != -377) {
                                            if (~arg0 != -242 && ~arg0 != -210) {
                                                return ~arg0 == -224 ? 'b' : Character.toLowerCase(arg0);
                                            } else {
                                                return 'n';
                                            }
                                        } else {
                                            return 'y';
                                        }
                                    } else {
                                        return 'c';
                                    }
                                } else {
                                    return 'u';
                                }
                            } else {
                                return 'o';
                            }
                        } else {
                            return 'i';
                        }
                    } else {
                        return 'e';
                    }
                } else {
                    return 'a';
                }
            } else {
                return arg0;
            }
        } else {
            return '_';
        }
    }

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)V", line = 561)
    public final void method2301(int arg0) {
        ++field5427;
        super.method2301(arg0);
        this.field5424 = null;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V", line = 570)
    public class385() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lwt;B)V", line = 575)
    public static final void method2302(class279 arg0, byte arg1) {
        ++field5425;
        if (!class623.field8731) {
            if (arg1 != -115) {
                field5430 = null;
            }
            arg0.method3678(arg1 ^ 114);
            --class340.field5002;
        }
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)I", line = 593)
    public final int method2303(int arg0) {
        if (arg0 != -1) {
            return 41;
        } else {
            ++field5420;
            return this.field5419;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILmo;I)V", line = 607)
    public final void method234(int arg0, class695 arg1, int arg2) {
        if (arg0 == 5) {
            ++field5429;
            if (arg2 == 0) {
                this.field5419 = arg1.method3847((byte) 118);
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(II)I", line = 625)
    public static final int method2304(int arg0, int arg1) {
        if (arg0 != -15499) {
            field5430 = null;
        }
        ++field5426;
        if (arg1 != 6406) {
            if (~arg1 == -6410) {
                return 1;
            } else if (~arg1 != -32842) {
                if (arg1 == 6410) {
                    return 2;
                } else if (arg1 == 6407) {
                    return 3;
                } else if (~arg1 == -6409) {
                    return 4;
                } else {
                    throw new IllegalArgumentException("");
                }
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }
}
