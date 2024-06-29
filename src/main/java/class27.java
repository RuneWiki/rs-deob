import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class27 {

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "Lmga;")
    private class666 field444 = new class666(64);

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "Lmga;")
    private class666 field447 = new class666(100);

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "Lbi;")
    private class449 field442;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Lwo;")
    public final class696 method229(int arg0, int arg1) {
        field440++;
        class666 var3 = this.field447;
        class696 var4;
        synchronized (this.field447) {
            var4 = (class696) this.field447.method3750((long) arg1, false);
            if (var4 == null) {
                var4 = new class696(arg1);
                this.field447.method3745(1, (long) arg1, var4);
            }
        }
        synchronized (var4) {
            if (var4.method3851(true)) {
                if (arg0 > -34) {
                    this.method233((byte) 18);
                }
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static final void method230(int arg0) {
        class48.field690.method3748(6);
        field448++;
        if (arg0 == -101) {
            ;
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)Ldv;")
    public final class616 method231(int arg0, int arg1) {
        field443++;
        class666 var3 = this.field444;
        class616 var4;
        synchronized (this.field444) {
            var4 = (class616) this.field444.method3750((long) arg0, false);
            if (arg1 != -11764) {
                this.method233((byte) 31);
            }
        }
        if (var4 != null) {
            return var4;
        }
        class449 var5 = this.field442;
        byte[] var6;
        synchronized (this.field442) {
            var6 = this.field442.method2537(false, class105.method800(arg1 + 1399507003, arg0), class415.method2377((byte) -96, arg0));
        }
        class616 var7 = new class616();
        var7.field8144 = arg0;
        var7.field8148 = this;
        if (var6 != null) {
            var7.method3372((byte) 49, new class335(var6));
        }
        var7.method3375(-117);
        class666 var8 = this.field444;
        synchronized (this.field444) {
            this.field444.method3745(1, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public static final void method232(byte arg0) {
        if (arg0 != 0) {
            return;
        }
        field441++;
        if (class281.field3991 != class137.field2222) {
            try {
                class594.method3267("tbrefresh", arg0 ^ 0xFFFFBAFA, class139.field2244);
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V")
    public final void method233(byte arg0) {
        class666 var2 = this.field444;
        synchronized (this.field444) {
            this.field444.method3739(0);
        }
        field438++;
        class666 var3 = this.field447;
        synchronized (this.field447) {
            this.field447.method3739(0);
            if (arg0 != 74) {
                this.field442 = null;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)V")
    public final void method234(int arg0, byte arg1) {
        field445++;
        class666 var3 = this.field444;
        synchronized (this.field444) {
            this.field444.method3740((byte) 60, arg0);
        }
        class666 var4 = this.field447;
        synchronized (this.field447) {
            this.field447.method3740((byte) 60, arg0);
            if (arg1 != -95) {
                this.method237((byte) 118);
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(II)Lhea;")
    public static final class393 method235(int arg0, int arg1) {
        if (arg0 <= 118) {
            return null;
        } else {
            field446++;
            return arg1 >= 0 && arg1 < 100 ? class108.field1589[arg1] : null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lgba;I)V")
    public static final void method236(class625 arg0, int arg1) {
        field449++;
        if (!class400.field5305) {
            return;
        }
        if (arg0.field8285 != null) {
            class625 var2 = class457.method2609(class255.field3536, class522.field6979, (byte) -103);
            if (var2 != null) {
                class48 var3 = new class48();
                var3.field681 = arg0.field8285;
                var3.field688 = var2;
                var3.field692 = arg0;
                class544.method3013(var3);
            }
        }
        class615.field8137++;
        class402 var4 = class390.method2252(class619.field8212, -95, class262.field3644);
        var4.field5354.method1982(arg0.field8327, (byte) 63);
        var4.field5354.method2031((byte) 54, class522.field6979);
        var4.field5354.method2021(1326408496, arg0.field8403);
        var4.field5354.method2030(arg0.field8418, 102);
        var4.field5354.method1982(class255.field3536, (byte) 63);
        var4.field5354.method2031((byte) 54, class37.field563);
        if (arg1 == 100) {
            class36.method278(0, var4);
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)V")
    public final void method237(byte arg0) {
        field439++;
        if (arg0 < 8) {
            this.method234(74, (byte) -56);
        }
        class666 var2 = this.field444;
        synchronized (this.field444) {
            this.field444.method3748(6);
        }
        class666 var3 = this.field447;
        synchronized (this.field447) {
            this.field447.method3748(6);
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lpca;ILbi;Lbi;Lbi;)V")
    public class27(class671 arg0, int arg1, class449 arg2, class449 arg3, class449 arg4) {
        this.field442 = arg2;
        if (this.field442 != null) {
            int var6 = this.field442.method2545(0) - 1;
            this.field442.method2527(0, var6);
        }
        class298.method1820(2, arg4, arg3, -27447);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZIIIZ)V")
    public static final void method238(boolean arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field437++;
        class100.method765(arg4, class471.field6307.length - 1, arg0, arg2, arg3, 2, arg1);
        class623.field8248 = null;
        class592.field7833 = 0;
    }
}
