import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class221 extends class351 {

    @OriginalMember(owner = "client!ida", name = "H", descriptor = "I")
    public static int field2566 = 0;

    @OriginalMember(owner = "client!ida", name = "B", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!ida", name = "D", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!ida", name = "E", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!ida", name = "G", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!ida", name = "K", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!ida", name = "L", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!ida", name = "I", descriptor = "Liba;")
    public static class495 field2567;

    @OriginalMember(owner = "client!ida", name = "J", descriptor = "[B")
    private byte[] field2568;

    @OriginalMember(owner = "client!ida", name = "<init>", descriptor = "()V")
    public class221() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1263(int arg0, int arg1, int arg2, int arg3) {
        if (!class294.method1773(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class480.field5972;
        int var5 = arg2 << class480.field5972;
        int var6 = class299.field3801[arg0].method201(arg1, arg2) - 1;
        int var7 = var6 - (0x78 << class480.field5972 - 7);
        int var8 = var6 - (0xE6 << class480.field5972 - 7);
        int var9 = var6 - (0xEE << class480.field5972 - 7);
        if (arg3 == 1) {
            if (var4 > class424.field5373) {
                if (!class224.method1354(var4, var6, var5)) {
                    return false;
                }
                if (!class224.method1354(var4, var6, class660.field8949 + var5)) {
                    return false;
                }
                if (!class224.method1354(var4, var6, class97.field1256 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class224.method1354(var4, var7, var5)) {
                    return false;
                }
                if (!class224.method1354(var4, var7, class660.field8949 + var5)) {
                    return false;
                }
                if (!class224.method1354(var4, var7, class97.field1256 + var5)) {
                    return false;
                }
            }
            if (!class224.method1354(var4, var8, var5)) {
                return false;
            } else if (class224.method1354(var4, var8, class660.field8949 + var5)) {
                return class224.method1354(var4, var8, class97.field1256 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class370.field4786) {
                if (!class224.method1354(var4, var6, class97.field1256 + var5)) {
                    return false;
                }
                if (!class224.method1354(class660.field8949 + var4, var6, class97.field1256 + var5)) {
                    return false;
                }
                if (!class224.method1354(class97.field1256 + var4, var6, class97.field1256 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class224.method1354(var4, var7, class97.field1256 + var5)) {
                    return false;
                }
                if (!class224.method1354(class660.field8949 + var4, var7, class97.field1256 + var5)) {
                    return false;
                }
                if (!class224.method1354(class97.field1256 + var4, var7, class97.field1256 + var5)) {
                    return false;
                }
            }
            if (!class224.method1354(var4, var8, class97.field1256 + var5)) {
                return false;
            } else if (class224.method1354(class660.field8949 + var4, var8, class97.field1256 + var5)) {
                return class224.method1354(class97.field1256 + var4, var8, class97.field1256 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class424.field5373) {
                if (!class224.method1354(class97.field1256 + var4, var6, var5)) {
                    return false;
                }
                if (!class224.method1354(class97.field1256 + var4, var6, class660.field8949 + var5)) {
                    return false;
                }
                if (!class224.method1354(class97.field1256 + var4, var6, class97.field1256 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class224.method1354(class97.field1256 + var4, var7, var5)) {
                    return false;
                }
                if (!class224.method1354(class97.field1256 + var4, var7, class660.field8949 + var5)) {
                    return false;
                }
                if (!class224.method1354(class97.field1256 + var4, var7, class97.field1256 + var5)) {
                    return false;
                }
            }
            if (!class224.method1354(class97.field1256 + var4, var8, var5)) {
                return false;
            } else if (class224.method1354(class97.field1256 + var4, var8, class660.field8949 + var5)) {
                return class224.method1354(class97.field1256 + var4, var8, class97.field1256 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class370.field4786) {
                if (!class224.method1354(var4, var6, var5)) {
                    return false;
                }
                if (!class224.method1354(class660.field8949 + var4, var6, var5)) {
                    return false;
                }
                if (!class224.method1354(class97.field1256 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class224.method1354(var4, var7, var5)) {
                    return false;
                }
                if (!class224.method1354(class660.field8949 + var4, var7, var5)) {
                    return false;
                }
                if (!class224.method1354(class97.field1256 + var4, var7, var5)) {
                    return false;
                }
            }
            if (!class224.method1354(var4, var8, var5)) {
                return false;
            } else if (class224.method1354(class660.field8949 + var4, var8, var5)) {
                return class224.method1354(class97.field1256 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class224.method1354(class660.field8949 + var4, var9, class660.field8949 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class224.method1354(var4, var8, class97.field1256 + var5);
        } else if (arg3 == 32) {
            return class224.method1354(class97.field1256 + var4, var8, class97.field1256 + var5);
        } else if (arg3 == 64) {
            return class224.method1354(class97.field1256 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class224.method1354(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ida", name = "e", descriptor = "(I)V")
    public static void method1264(int arg0) {
        int var1 = -21 / ((arg0 + 44) / 43);
        field2567 = null;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(IBII)[B")
    public final byte[] method1265(int arg0, byte arg1, int arg2, int arg3) {
        int var5 = -62 % ((arg1 + 3) / 44);
        field2564++;
        this.field2568 = new byte[arg0 * arg3 * arg2 * 2];
        this.method751(arg2, arg3, false, arg0);
        return this.field2568;
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(IBI)V")
    public final void method1245(int arg0, byte arg1, int arg2) {
        if (arg2 != -1554) {
            method1266(-109, -12, (byte) 51);
        }
        field2563++;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var5 = arg0 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field2568[var10001] = var4;
        this.field2568[var6] = var4;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIB)V")
    public static final void method1266(int arg0, int arg1, byte arg2) {
        if ((class604.field8111 > class604.field8113)) {
            class604.field8113 = (float) ((double) class604.field8113 / 30.0D + (double) class604.field8113);
            if (class604.field8111 < class604.field8113) {
                class604.field8113 = class604.field8111;
            }
            class460.method2531((byte) 44);
            class604.field8115 = (int) class604.field8113 >> 1;
            class604.field8118 = class321.method1855(class604.field8115, (byte) -99);
        } else if (class604.field8113 > class604.field8111) {
            class604.field8113 = (float) ((double) class604.field8113 - (double) class604.field8113 / 30.0D);
            if (class604.field8111 > class604.field8113) {
                class604.field8113 = class604.field8111;
            }
            class460.method2531((byte) 44);
            class604.field8115 = (int) class604.field8113 >> 1;
            class604.field8118 = class321.method1855(class604.field8115, (byte) -123);
        }
        field2565++;
        if (class103.field1316 != -1 && class80.field1043 != -1) {
            int var3 = class103.field1316 - class227.field2939;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class80.field1043 - class537.field6759;
            class227.field2939 -= -var3;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class537.field6759 -= -var4;
            if (var3 == 0 && var4 == 0) {
                class80.field1043 = -1;
                class103.field1316 = -1;
            }
            class460.method2531((byte) 44);
        }
        if (class647.field8756 > 0) {
            class671.field9179--;
            if (class671.field9179 == 0) {
                class671.field9179 = 100;
                class647.field8756--;
            }
        } else {
            class537.field6770 = -1;
            class103.field1324 = -1;
        }
        if (class669.field9070 && class74.field986 != null) {
            for (class549 var5 = (class549) class74.field986.method1909(true); var5 != null; var5 = (class549) class74.field986.method1916((byte) 92)) {
                class663 var6 = class604.field8104.method93(var5.field6886.field1034, (byte) 107);
                if (var5.method2939(true, arg0, arg1)) {
                    if (var6.field9012 != null) {
                        if (var6.field9012[4] != null) {
                            class688.method3802(false, true, -1, 1007, 0, var6.field9012[4], (long) var5.field6886.field1034, var6.field9011, 0, -1, var6.field8986);
                        }
                        if (var6.field9012[3] != null) {
                            class688.method3802(false, true, -1, 1008, 0, var6.field9012[3], (long) var5.field6886.field1034, var6.field9011, 0, -1, var6.field8986);
                        }
                        if (var6.field9012[2] != null) {
                            class688.method3802(false, true, -1, 1003, 0, var6.field9012[2], (long) var5.field6886.field1034, var6.field9011, 0, -1, var6.field8986);
                        }
                        if (var6.field9012[1] != null) {
                            class688.method3802(false, true, -1, 1010, 0, var6.field9012[1], (long) var5.field6886.field1034, var6.field9011, 0, -1, var6.field8986);
                        }
                        if (var6.field9012[0] != null) {
                            class688.method3802(false, true, -1, 1012, 0, var6.field9012[0], (long) var5.field6886.field1034, var6.field9011, 0, -1, var6.field8986);
                        }
                    }
                    if (!var5.field6886.field1022) {
                        var5.field6886.field1022 = true;
                        class620.method3461(class659.field8943, var5.field6886.field1034, var6.field8986);
                    }
                    if (var5.field6886.field1022) {
                        class620.method3461(class382.field4907, var5.field6886.field1034, var6.field8986);
                    }
                } else if (var5.field6886.field1022) {
                    var5.field6886.field1022 = false;
                    class620.method3461(class27.field317, var5.field6886.field1034, var6.field8986);
                }
            }
        }
        if (arg2 >= -98) {
            method1268(13, -85, -74, 66, -94, -94, -33, (byte) -50);
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(BLrr;II)V")
    public static final void method1267(byte arg0, class337 arg1, int arg2, int arg3) {
        class439.field5533 = arg1;
        int var4 = 66 / ((-arg0 - 11) / 52);
        field2570++;
        class132.field1598 = arg3;
        class349.field4484 = arg2;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method1268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field2569++;
        if (arg1 == arg6) {
            class410.method2304(arg4, arg3, 87, arg6, arg0, arg2, arg5);
            return;
        }
        if (class292.field3700 <= (arg3 - arg6) && class337.field4186 >= (arg3 + arg6) && arg5 - arg1 >= class125.field1524 && class377.field4848 >= arg1 + arg5) {
            class64.method517(arg3, arg6, 0, arg5, arg1, arg0, arg4, arg2);
        } else {
            class348.method2005(arg2, arg1, arg3, arg6, (byte) 119, arg4, arg5, arg0);
        }
        if (arg7 > -4) {
            method1263(-101, 22, 112, -14);
        }
    }
}
