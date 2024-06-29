import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class59 {

    @OriginalMember(owner = "client!sv", name = "l", descriptor = "Lfba;")
    private class348 field984 = new class348(64);

    @OriginalMember(owner = "client!sv", name = "n", descriptor = "I")
    public int field986 = 0;

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "Lla;")
    private class423 field974;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "client!sv", name = "k", descriptor = "[Lrl;")
    public static class230[] field983 = new class230[37];

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "Llc;")
    public static class435 field980 = new class435(40, -1);

    @OriginalMember(owner = "client!sv", name = "m", descriptor = "Z")
    public static boolean field985 = false;

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V", line = 6)
    public final void method552(byte arg0) {
        if (arg0 != -72) {
            return;
        }
        class348 var2 = this.field984;
        synchronized (this.field984) {
            this.field984.method2219(-5300);
        }
        field978++;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILg;IZLg;)I", line = 24)
    public static final int method553(int arg0, class592 arg1, int arg2, boolean arg3, class592 arg4) {
        field982++;
        if (arg0 == 1) {
            int var5 = arg1.field4068;
            int var6 = arg4.field4068;
            if (!arg3) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg0 == 2) {
            return class583.method3432(arg4.method3474((byte) -125).field10249, class45.field748, (byte) 112, arg1.method3474((byte) -1).field10249);
        } else if (arg0 == 3) {
            if (arg1.field8416.equals("-")) {
                if (arg4.field8416.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg4.field8416.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return class583.method3432(arg4.field8416, class45.field748, (byte) 37, arg1.field8416);
            }
        } else if (arg0 == 4) {
            if (arg1.method1859((byte) 103)) {
                return arg4.method1859((byte) 103) ? 0 : 1;
            } else if (arg4.method1859((byte) 103)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 5) {
            if (arg1.method1860((byte) -11)) {
                return arg4.method1860((byte) -11) ? 0 : 1;
            } else if (arg4.method1860((byte) -11)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 != 6) {
            if (arg2 <= 26) {
                method559(null, -61, -12);
            }
            if (arg0 == 7) {
                if (arg1.method1858((byte) 125)) {
                    return arg4.method1858((byte) 126) ? 0 : 1;
                } else if (arg4.method1858((byte) 126)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg0 == 8) {
                int var7 = arg1.field8418;
                int var8 = arg4.field8418;
                if (arg3) {
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                } else {
                    if (var7 == -1) {
                        var7 = 1000;
                    }
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                }
                return var7 - var8;
            } else {
                return arg1.field8417 - arg4.field8417;
            }
        } else if (arg1.method1857(-116)) {
            return arg4.method1857(-40) ? 0 : 1;
        } else if (arg4.method1857(-105)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V", line = 129)
    public static void method554(int arg0) {
        if (arg0 != 64) {
            method554(99);
        }
        field980 = null;
        field983 = null;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(BI)Lhb;", line = 140)
    public final class584 method555(byte arg0, int arg1) {
        field981++;
        class348 var3 = this.field984;
        class584 var4;
        synchronized (this.field984) {
            var4 = (class584) this.field984.method2216(arg0 + 90, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class423 var5 = this.field974;
        byte[] var6;
        synchronized (this.field974) {
            var6 = this.field974.method2600(arg0 + 90, 4, arg1);
            if (arg0 != -90) {
                field980 = null;
            }
        }
        class584 var7 = new class584();
        var7.field8327 = this;
        var7.field8330 = arg1;
        if (var6 != null) {
            var7.method3440(0, new class479(var6));
        }
        var7.method3442((byte) -95);
        class348 var8 = this.field984;
        synchronized (this.field984) {
            this.field984.method2213((byte) -16, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIIIIII)V", line = 176)
    public static final void method556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 != -1) {
            field985 = true;
        }
        field979++;
        if (class200.field2976 <= arg1 && arg3 <= class204.field3061 && class377.field5458 <= arg2 && arg4 <= class362.field5291) {
            class381.method2358(arg5, arg1, arg3, arg2, 21, arg0, arg4, arg6);
        } else {
            class576.method3416(arg2, arg5, arg6, arg0, 0, arg4, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)V", line = 198)
    public final void method557(int arg0, int arg1) {
        field977++;
        class348 var3 = this.field984;
        synchronized (this.field984) {
            this.field984.method2207(arg1, 1);
            int var4 = -57 % ((arg0 - 30) / 58);
        }
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(B)V", line = 210)
    public final void method558(byte arg0) {
        class348 var2 = this.field984;
        synchronized (this.field984) {
            this.field984.method2220(false);
            if (arg0 != -79) {
                method553(-104, null, 121, false, null);
            }
        }
        field976++;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "([SII)[S", line = 231)
    public static final short[] method559(short[] arg0, int arg1, int arg2) {
        field975++;
        short[] var3 = new short[arg1];
        class85.method682(arg0, arg2, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lmp;ILla;)V", line = 248)
    public class59(class315 arg0, int arg1, class423 arg2) {
        this.field974 = arg2;
        this.field973 = this.field974.method2616(4, 0);
    }
}
