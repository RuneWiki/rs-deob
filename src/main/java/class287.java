import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class287 implements Runnable {

    @OriginalMember(owner = "client!id", name = "f", descriptor = "Lea;")
    private class227 field4680 = new class227();

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public int field4687 = 0;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "Z")
    private boolean field4690 = false;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "Ljava/lang/Thread;")
    private Thread field4694;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "[I")
    public static int[] field4693 = new int[1000];

    @OriginalMember(owner = "client!id", name = "u", descriptor = "Lsf;")
    public static class124 field4695 = new class124(64);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIBZI)V", line = 6)
    public static final void method2027(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6) {
        class358.field5699 = arg3;
        int var7 = -42 / ((-arg4 - 51) / 32);
        class55.field1088 = arg6;
        class339.field5375 = arg2;
        class14.field424 = arg0;
        field4685++;
        class253.field4163 = arg1;
        if (arg5 && class14.field424 >= 100) {
            class223.field3693 = class358.field5699 * 128 + 64;
            class16.field462 = class253.field4163 * 128 + 64;
            class141.field2380 = class21.method189((byte) -104, class16.field462, class223.field3693, class276.field4506) - class339.field5375;
        }
        class69.field1280 = 2;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V", line = 32)
    public static final void method2028(int arg0, int arg1) {
        field4681++;
        if (class222.field3671 == 0) {
            class349.field5586.method2437(-27441, arg0);
        } else {
            class144.field2426 = arg0;
        }
        if (arg1 != 5) {
            field4696 = -16;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lek;Lek;B)V", line = 49)
    public static final void method2029(class206 arg0, class206 arg1, byte arg2) {
        field4688++;
        class109.field2002 = arg1;
        class316.field5141 = arg0;
        if (arg2 != -121) {
            field4695 = (class124) null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lma;BI)Lnc;", line = 66)
    public final class164 method2030(class318 arg0, byte arg1, int arg2) {
        field4691++;
        class164 var4 = new class164();
        var4.field2747 = 1;
        class227 var5 = this.field4680;
        synchronized (this.field4680) {
            class164 var6 = (class164) this.field4680.method1580((byte) -119);
            while (true) {
                if (var6 == null) {
                    if (arg1 < 102) {
                        this.field4690 = true;
                    }
                    break;
                }
                if ((long) arg2 == var6.field4902 && var6.field2748 == arg0 && var6.field2747 == 2) {
                    var4.field1243 = false;
                    var4.field2752 = var6.field2752;
                    return var4;
                }
                var6 = (class164) this.field4680.method1586((byte) 50);
            }
        }
        var4.field2752 = arg0.method2292(arg2, (byte) -99);
        var4.field1242 = true;
        var4.field1243 = false;
        return var4;
    }

    @OriginalMember(owner = "client!id", name = "run", descriptor = "()V", line = 107)
    public final void run() {
        field4689++;
        while (!this.field4690) {
            class227 var1 = this.field4680;
            class164 var2;
            synchronized (this.field4680) {
                var2 = (class164) this.field4680.method1587(0);
                if (var2 == null) {
                    try {
                        this.field4680.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field4687--;
            }
            try {
                if (var2.field2747 == 2) {
                    var2.field2748.method2293((byte) -5, var2.field2752.length, var2.field2752, (int) var2.field4902);
                } else if (var2.field2747 == 3) {
                    var2.field2752 = var2.field2748.method2292((int) var2.field4902, (byte) 86);
                }
            } catch (Exception var6) {
                class348.method2493(-26700, var6, (String) null);
            }
            var2.field1243 = false;
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V", line = 352)
    public class287() {
        class210 var1 = class59.field1164.method1132(5, 0, this);
        while (var1.field3504 == 0) {
            class122.method881(59, 10L);
        }
        if (var1.field3504 == 2) {
            throw new RuntimeException();
        }
        this.field4694 = (Thread) var1.field3501;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V", line = 159)
    public static final void method2031(byte arg0) {
        field4677++;
        if (class6.field124 == 5) {
            class6.field124 = 6;
            if (arg0 != -24) {
                field4693 = (int[]) null;
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IS)Z", line = 178)
    public static final boolean method2032(int arg0, short arg1) {
        field4679++;
        if (arg1 == 48 || arg1 == 9 || arg1 == 60 || arg1 == 8 || arg1 == 49 || arg1 == 44 || arg1 == 13 || arg1 == 22) {
            return true;
        } else if (arg1 == 41 || arg1 == 11 || arg1 == 1001 || arg1 == 1011) {
            return true;
        } else {
            if (arg0 >= -8) {
                field4695 = (class124) null;
            }
            if (arg1 == 23 || arg1 == 26 || arg1 == 51 || arg1 == 29 || arg1 == 58) {
                return true;
            } else {
                return arg1 == 40 || arg1 == 20 || arg1 == 7 || arg1 == 33 || arg1 == 19 || arg1 == 12;
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I[BLma;I)Lnc;", line = 205)
    public final class164 method2033(int arg0, byte[] arg1, class318 arg2, int arg3) {
        field4682++;
        class164 var5 = new class164();
        var5.field2747 = arg0;
        var5.field2748 = arg2;
        var5.field1242 = false;
        var5.field2752 = arg1;
        var5.field4902 = (long) arg3;
        this.method2037(-125, var5);
        return var5;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(II)I", line = 221)
    public static int method2034(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 231)
    public final void method2035(int arg0) {
        this.field4690 = true;
        class227 var2 = this.field4680;
        synchronized (this.field4680) {
            this.field4680.notifyAll();
        }
        field4683++;
        try {
            this.field4694.join();
        } catch (InterruptedException var5) {
        }
        if (arg0 != 128) {
            this.run();
        }
        this.field4694 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILma;Z)Lnc;", line = 251)
    public final class164 method2036(int arg0, class318 arg1, boolean arg2) {
        field4676++;
        class164 var4 = new class164();
        var4.field2748 = arg1;
        var4.field1242 = arg2;
        var4.field4902 = (long) arg0;
        var4.field2747 = 3;
        this.method2037(-119, var4);
        return var4;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILnc;)V", line = 268)
    private final void method2037(int arg0, class164 arg1) {
        int var3 = 89 % ((-arg0 - 74) / 38);
        field4686++;
        class227 var4 = this.field4680;
        synchronized (this.field4680) {
            this.field4680.method1585(arg1, (byte) -12);
            this.field4687++;
            this.field4680.notifyAll();
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;II)V", line = 283)
    public static final void method2038(boolean arg0, String arg1, String arg2, String arg3, int arg4, String arg5, int arg6, int arg7) {
        int var8 = 99;
        if (arg0) {
            field4695 = (class124) null;
        }
        while (var8 > 0) {
            class323.field5237[var8] = class323.field5237[var8 - 1];
            class346.field5520[var8] = class346.field5520[var8 - 1];
            class22.field555[var8] = class22.field555[var8 - 1];
            class229.field3758[var8] = class229.field3758[var8 - 1];
            class49.field1026[var8] = class49.field1026[var8 - 1];
            class253.field4157[var8] = class253.field4157[var8 - 1];
            class195.field3274[var8] = class195.field3274[var8 - 1];
            var8--;
        }
        class257.field4206 = class83.field1436;
        class323.field5237[0] = arg6;
        class346.field5520[0] = arg7;
        class10.field293++;
        class195.field3274[0] = arg4;
        field4675++;
        class22.field555[0] = arg5;
        class229.field3758[0] = arg3;
        class49.field1026[0] = arg2;
        class253.field4157[0] = arg1;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)I", line = 315)
    public static final int method2039(int arg0) {
        if (arg0 != 0) {
            method2028(-17, 101);
        }
        field4678++;
        return 14;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V", line = 329)
    public static void method2040(int arg0) {
        if (arg0 == -31982) {
            field4693 = null;
            field4695 = null;
        }
    }
}
