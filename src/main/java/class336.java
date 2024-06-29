import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class336 {

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "Lwi;")
    private class330 field5215 = new class330(64);

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "Luu;")
    private class191 field5211;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "[I")
    public static int[] field5213 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "Lqw;")
    public static class54 field5212;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)Lsq;", line = 4)
    public final class120 method2171(int arg0, int arg1) {
        field5210++;
        class330 var3 = this.field5215;
        class120 var4;
        synchronized (this.field5215) {
            var4 = (class120) this.field5215.method2133((long) arg0, (byte) 63);
        }
        if (var4 != null) {
            return var4;
        }
        int var5 = -60 % ((16 - arg1) / 36);
        class191 var6 = this.field5211;
        byte[] var7;
        synchronized (this.field5211) {
            var7 = this.field5211.method1281(31, arg0, 77);
        }
        class120 var8 = new class120();
        if (var7 != null) {
            var8.method733(new class164(var7), -31382);
        }
        class330 var9 = this.field5215;
        synchronized (this.field5215) {
            this.field5215.method2131(var8, (long) arg0, false);
            return var8;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V", line = 35)
    public final void method2172(byte arg0) {
        class330 var2 = this.field5215;
        synchronized (this.field5215) {
            this.field5215.method2135(0);
        }
        field5216++;
        if (arg0 != 89) {
            this.field5211 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V", line = 50)
    public final void method2173(int arg0) {
        field5217++;
        class330 var2 = this.field5215;
        synchronized (this.field5215) {
            this.field5215.method2127((byte) -30);
            int var3 = 93 % ((59 - arg0) / 53);
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V", line = 64)
    public static void method2174(byte arg0) {
        field5213 = null;
        if (arg0 < -78) {
            field5212 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)V", line = 82)
    public final void method2175(int arg0, int arg1) {
        class330 var3 = this.field5215;
        synchronized (this.field5215) {
            this.field5215.method2140(-124, arg0);
        }
        field5214++;
        if (arg1 != 64) {
            field5213 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIII)Z", line = 95)
    public static final boolean method2176(int arg0, int arg1, int arg2, int arg3) {
        if (!class286.method1840(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class10.field179;
        int var5 = arg2 << class10.field179;
        int var6 = class306.field4447[arg0].method222(arg1, arg2) - 1;
        int var7 = var6 - (0x78 << class10.field179 - 7);
        int var8 = var6 - (0xE6 << class10.field179 - 7);
        int var9 = var6 - (0xEE << class10.field179 - 7);
        if (arg3 == 1) {
            if (var4 > class453.field6827) {
                if (!class127.method869(var4, var6, var5)) {
                    return false;
                }
                if (!class127.method869(var4, var6, class251.field3501 + var5)) {
                    return false;
                }
                if (!class127.method869(var4, var6, class264.field3697 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class127.method869(var4, var7, var5)) {
                    return false;
                }
                if (!class127.method869(var4, var7, class251.field3501 + var5)) {
                    return false;
                }
                if (!class127.method869(var4, var7, class264.field3697 + var5)) {
                    return false;
                }
            }
            if (!class127.method869(var4, var8, var5)) {
                return false;
            } else if (class127.method869(var4, var8, class251.field3501 + var5)) {
                return class127.method869(var4, var8, class264.field3697 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class46.field662) {
                if (!class127.method869(var4, var6, class264.field3697 + var5)) {
                    return false;
                }
                if (!class127.method869(class251.field3501 + var4, var6, class264.field3697 + var5)) {
                    return false;
                }
                if (!class127.method869(class264.field3697 + var4, var6, class264.field3697 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class127.method869(var4, var7, class264.field3697 + var5)) {
                    return false;
                }
                if (!class127.method869(class251.field3501 + var4, var7, class264.field3697 + var5)) {
                    return false;
                }
                if (!class127.method869(class264.field3697 + var4, var7, class264.field3697 + var5)) {
                    return false;
                }
            }
            if (!class127.method869(var4, var8, class264.field3697 + var5)) {
                return false;
            } else if (class127.method869(class251.field3501 + var4, var8, class264.field3697 + var5)) {
                return class127.method869(class264.field3697 + var4, var8, class264.field3697 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class453.field6827) {
                if (!class127.method869(class264.field3697 + var4, var6, var5)) {
                    return false;
                }
                if (!class127.method869(class264.field3697 + var4, var6, class251.field3501 + var5)) {
                    return false;
                }
                if (!class127.method869(class264.field3697 + var4, var6, class264.field3697 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class127.method869(class264.field3697 + var4, var7, var5)) {
                    return false;
                }
                if (!class127.method869(class264.field3697 + var4, var7, class251.field3501 + var5)) {
                    return false;
                }
                if (!class127.method869(class264.field3697 + var4, var7, class264.field3697 + var5)) {
                    return false;
                }
            }
            if (!class127.method869(class264.field3697 + var4, var8, var5)) {
                return false;
            } else if (class127.method869(class264.field3697 + var4, var8, class251.field3501 + var5)) {
                return class127.method869(class264.field3697 + var4, var8, class264.field3697 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class46.field662) {
                if (!class127.method869(var4, var6, var5)) {
                    return false;
                }
                if (!class127.method869(class251.field3501 + var4, var6, var5)) {
                    return false;
                }
                if (!class127.method869(class264.field3697 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class127.method869(var4, var7, var5)) {
                    return false;
                }
                if (!class127.method869(class251.field3501 + var4, var7, var5)) {
                    return false;
                }
                if (!class127.method869(class264.field3697 + var4, var7, var5)) {
                    return false;
                }
            }
            if (!class127.method869(var4, var8, var5)) {
                return false;
            } else if (class127.method869(class251.field3501 + var4, var8, var5)) {
                return class127.method869(class264.field3697 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class127.method869(class251.field3501 + var4, var9, class251.field3501 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class127.method869(var4, var8, class264.field3697 + var5);
        } else if (arg3 == 32) {
            return class127.method869(class264.field3697 + var4, var8, class264.field3697 + var5);
        } else if (arg3 == 64) {
            return class127.method869(class264.field3697 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class127.method869(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Liv;ILuu;)V", line = 318)
    public class336(class65 arg0, int arg1, class191 arg2) {
        this.field5211 = arg2;
        this.field5211.method1290(false, 31);
    }
}
