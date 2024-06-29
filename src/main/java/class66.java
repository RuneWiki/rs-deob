import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class66 extends class354 implements class381 {

    @OriginalMember(owner = "client!bm", name = "T", descriptor = "B")
    private byte field899;

    @OriginalMember(owner = "client!bm", name = "L", descriptor = "B")
    private byte field891;

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "Z")
    private boolean field875;

    @OriginalMember(owner = "client!bm", name = "F", descriptor = "Z")
    private boolean field885;

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "Z")
    private boolean field878;

    @OriginalMember(owner = "client!bm", name = "J", descriptor = "S")
    private short field889;

    @OriginalMember(owner = "client!bm", name = "P", descriptor = "Z")
    private boolean field895;

    @OriginalMember(owner = "client!bm", name = "O", descriptor = "Lgn;")
    private class456 field894;

    @OriginalMember(owner = "client!bm", name = "Q", descriptor = "Lkb;")
    private class449 field896;

    @OriginalMember(owner = "client!bm", name = "D", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!bm", name = "S", descriptor = "J")
    public static long field898;

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!bm", name = "A", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!bm", name = "B", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!bm", name = "C", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!bm", name = "E", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!bm", name = "G", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!bm", name = "H", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!bm", name = "I", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!bm", name = "K", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!bm", name = "M", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!bm", name = "N", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!bm", name = "R", descriptor = "I")
    public static int field897;

    static {
        new class206("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
        field883 = -1;
        field898 = 0L;
    }

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "(I)V", line = 4)
    public final void method8(int arg0) {
        ++field897;
        this.field878 = false;
        if (this.field894 != null) {
            this.field894.method1841(this.field894.method1863() & -32769);
        }
        if (arg0 >= -74) {
            this.method17(-120);
        }
    }

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "(I)Z", line = 20)
    public final boolean method17(int arg0) {
        if (arg0 != 7) {
            this.method9(23);
        }
        ++field881;
        return this.field878;
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(I)I", line = 32)
    public final int method13(int arg0) {
        ++field887;
        if (arg0 <= 51) {
            this.field878 = true;
        }
        return 65535 & this.field889;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IILwm;)Lgn;", line = 46)
    private final class456 method436(int arg0, int arg1, class364 arg2) {
        ++field879;
        if (this.field894 != null && ~arg2.method2103(this.field894.method1863(), arg0) == -1) {
            return this.field894;
        } else {
            if (arg1 != -18936) {
                this.field894 = null;
            }
            class266 var4 = this.method440(arg0, false, arg2, -91);
            return var4 != null ? var4.field3514 : null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(Z)V", line = 68)
    public static final void method437(boolean arg0) {
        if (!arg0) {
            if (class7.field90 == null || class461.field6247 == null) {
                class7.field90 = new int[256];
                class461.field6247 = new int[256];
                for (int var1 = 0; ~var1 > -257; ++var1) {
                    double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                    class7.field90[var1] = (int) (4096.0D * Math.sin(var2));
                    class461.field6247[var1] = (int) (Math.cos(var2) * 4096.0D);
                }
            }
            ++field871;
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(Lwm;B)Lnf;", line = 99)
    public final class374 method3(class364 arg0, byte arg1) {
        ++field877;
        if (this.field894 == null) {
            return null;
        } else {
            class203 var3 = arg0.method1960();
            var3.method1029(super.field4904, super.field4897, super.field4900);
            class374 var4 = null;
            if (this.field875) {
                var4 = class358.method2196(1, (byte) -28);
            }
            if (arg1 <= 99) {
                return null;
            } else {
                this.field894.method1880(var3, var4 != null ? var4.field5156[0] : null, 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIILwm;ZLhp;Z)V", line = 124)
    public final void method2(int arg0, int arg1, int arg2, class364 arg3, boolean arg4, class197 arg5, boolean arg6) {
        if (!arg6) {
            this.method10((class364) null, (byte) 3);
        }
        if (arg5 instanceof class66) {
            class66 var8 = (class66) arg5;
            if (this.field894 != null && var8.field894 != null) {
                this.field894.method1869(var8.field894, arg0, arg2, arg1, arg4);
            }
        }
        ++field880;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BLwm;)V", line = 145)
    public final void method12(byte arg0, class364 arg1) {
        ++field892;
        if (arg0 <= 27) {
            method441(-16, 39);
        }
        Object var3 = null;
        class449 var5;
        if (this.field896 == null && this.field895) {
            class266 var4 = this.method440(131072, true, arg1, -119);
            var5 = var4 != null ? var4.field3512 : null;
        } else {
            var5 = this.field896;
            this.field896 = null;
        }
        if (var5 != null) {
            class252.method1412(var5, this.field891, super.field4904, super.field4900, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)V", line = 173)
    public final void method1(int arg0) {
        if (arg0 >= -105) {
            this.field896 = null;
        }
        ++field876;
        if (this.field894 != null) {
            this.field894.method1843();
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILwm;I)Lgn;", line = 187)
    public final class456 method15(int arg0, class364 arg1, int arg2) {
        if (arg2 != -28045) {
            return null;
        } else {
            ++field873;
            return this.method436(arg0, -18936, arg1);
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lwm;Lct;IIIIZIZ)V", line = 198)
    public class66(class364 arg0, class88 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field1263, arg1.field1258);
        this.field899 = (byte) arg7;
        this.field891 = (byte) arg2;
        this.field875 = ~arg1.field1265 != -1 && !arg6;
        super.field4904 = (short) arg3;
        super.field4900 = (short) arg5;
        this.field885 = arg6;
        this.field878 = arg8;
        this.field889 = (short) arg1.field1298;
        this.field895 = arg0.method2011() && arg1.field1264 && !this.field885 && ~class488.field6789.field6682 != -1;
        int var10 = 1024;
        if (this.field878) {
            var10 |= 32768;
        }
        class266 var11 = this.method440(var10, this.field895, arg0, -118);
        if (var11 != null) {
            this.field894 = var11.field3514;
            this.field896 = var11.field3512;
            if (this.field878) {
                this.field894 = this.field894.method1893((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)I", line = 233)
    public final int method9(int arg0) {
        if (arg0 != -769) {
            this.method7(true);
        }
        ++field874;
        return this.field899;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIILel;)V", line = 245)
    public static final void method438(int arg0, int arg1, int arg2, class354 arg3) {
        class491 var4 = class398.method2420(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field6842 = arg3;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)I", line = 256)
    public final int method4(int arg0) {
        if (arg0 != -10666) {
            this.method10((class364) null, (byte) -54);
        }
        ++field893;
        return 22;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZIII)V", line = 267)
    public static final void method439(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg1) {
            method439(-108, true, 76, 12, 38);
        }
        if (class488.field6789.field6687 != 0 && arg0 != 0 && ~class134.field1963 > -51 && arg4 != -1) {
            class230.field3030[class134.field1963] = arg4;
            class214.field2878[class134.field1963] = arg0;
            class356.field4912[class134.field1963] = arg3;
            class336.field4536[class134.field1963] = null;
            class100.field1460[class134.field1963] = 0;
            class249.field3323[class134.field1963] = arg2;
            ++class134.field1963;
        }
        ++field882;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lwm;I)V", line = 293)
    public final void method16(class364 arg0, int arg1) {
        ++field886;
        if (arg1 == 31591) {
            Object var3 = null;
            class449 var5;
            if (this.field896 == null && this.field895) {
                class266 var4 = this.method440(131072, true, arg0, -128);
                var5 = var4 != null ? var4.field3512 : null;
            } else {
                var5 = this.field896;
                this.field896 = null;
            }
            if (var5 != null) {
                class318.method1742(var5, this.field891, super.field4904, super.field4900, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZLwm;I)Lij;", line = 322)
    private final class266 method440(int arg0, boolean arg1, class364 arg2, int arg3) {
        if (arg3 > -83) {
            return null;
        } else {
            ++field890;
            class88 var5 = class1.field23.method935(this.field889 & 65535, (byte) 105);
            class177 var6;
            class177 var7;
            if (!this.field885) {
                var6 = class289.field3896[this.field891];
                if (~this.field891 <= -4) {
                    var7 = null;
                } else {
                    var7 = class289.field3896[this.field891 + 1];
                }
            } else {
                var6 = class312.field4112[this.field891];
                var7 = class289.field3896[0];
            }
            return var5.method560(super.field4897, var6, this.field899, super.field4900, super.field4904, false, arg0, arg1, arg2, var7, 22);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lwm;B)V", line = 355)
    public final void method10(class364 arg0, byte arg1) {
        ++field870;
        if (arg1 >= -48) {
            this.method3((class364) null, (byte) 80);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIBLwm;)Z", line = 366)
    public final boolean method14(int arg0, int arg1, byte arg2, class364 arg3) {
        ++field872;
        if (arg2 > -107) {
            field883 = 43;
        }
        class456 var5 = this.method436(65536, -18936, arg3);
        if (var5 != null) {
            class203 var6 = arg3.method1960();
            var6.method1029(super.field4904, super.field4897, super.field4900);
            return var5.method1882(arg0, arg1, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)I", line = 389)
    public static final int method441(int arg0, int arg1) {
        ++field869;
        int var2 = (1431655765 & arg0) - -(arg0 >>> 1 & -715827883);
        int var3 = ((var2 & -858993459) >>> 2) + (var2 & 858993459);
        int var4 = (var3 >>> 4) + var3 & 252645135;
        if (arg1 != 65535) {
            return 68;
        } else {
            int var5 = (var4 >>> 8) + var4;
            int var6 = (var5 >>> 16) + var5;
            return var6 & 255;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z)Z", line = 407)
    public final boolean method7(boolean arg0) {
        ++field888;
        if (arg0) {
            this.field885 = false;
        }
        return this.field895;
    }
}
