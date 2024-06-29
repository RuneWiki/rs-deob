import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class409 {

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "Ljk;")
    private class449 field5843 = new class449(16);

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "Lqn;")
    private class47 field5842;

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "I")
    public static int field5845 = 0;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!iu", name = "i", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!iu", name = "j", descriptor = "I")
    public static int field5848;

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!iu", name = "l", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "Lwk;")
    public static class95 field5846;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)V")
    public static final void method2423(byte arg0) {
        field5840++;
        if (class407.field5817.method583(-21537, class377.field4959) != 2) {
            return;
        }
        byte var1 = (byte) (class386.field5073 - 4 & 0xFF);
        int var2 = class386.field5073 % class452.field6526;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class440.field6307; var16++) {
                class387.field5105[var3][var2][var16] = var1;
            }
        }
        if (class276.field3488 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class175.field2278[var4] = -1000000;
            class129.field1712[var4] = 1000000;
            class159.field2025[var4] = 0;
            class225.field2871[var4] = 1000000;
            class184.field2414[var4] = 0;
        }
        if (arg0 != -120) {
            field5845 = 37;
        }
        if (class142.field1835 != 1) {
            int var15 = class151.method991(class193.field2500, false, class276.field3488, class310.field3971);
            if ((var15 - class286.field3665) >= 800 || (class379.field4998[class276.field3488][class310.field3971 >> 7][class193.field2500 >> 7] & 0x4) == 0) {
                return;
            }
            class424.method2491(class125.field1664, false, class310.field3971 >> 7, arg0 + 121, class193.field2500 >> 7, 1);
            return;
        }
        if ((class379.field4998[class276.field3488][class23.field336.field2666 >> 7][class23.field336.field2677 >> 7] & 0x4) != 0) {
            class424.method2491(class125.field1664, false, class23.field336.field2666 >> 7, 1, class23.field336.field2677 >> 7, 0);
        }
        if (class80.field1030 >= 2560) {
            return;
        }
        int var5 = class310.field3971 >> 7;
        int var6 = class193.field2500 >> 7;
        int var7 = class23.field336.field2666 >> 7;
        int var8 = class23.field336.field2677 >> 7;
        int var9;
        if (var5 < var7) {
            var9 = var7 - var5;
        } else {
            var9 = var5 - var7;
        }
        int var10;
        if (var8 <= var6) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        if ((var9 != 0 || var10 != 0) && -class452.field6526 < var9 && class452.field6526 > var9 && -class440.field6307 < var10 && var10 < class440.field6307) {
            if (var10 < var9) {
                int var11 = var10 * 65536 / var9;
                int var12 = 32768;
                while (var5 != var7) {
                    if (var7 > var5) {
                        var5++;
                    } else if (var7 < var5) {
                        var5--;
                    }
                    if ((class379.field4998[class276.field3488][var5][var6] & 0x4) != 0) {
                        class424.method2491(class125.field1664, false, var5, 1, var6, 1);
                        return;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        if (var8 > var6) {
                            var6++;
                        } else if (var8 < var6) {
                            var6--;
                        }
                        var12 -= 65536;
                        if ((class379.field4998[class276.field3488][var5][var6] & 0x4) != 0) {
                            class424.method2491(class125.field1664, false, var5, 1, var6, 1);
                            return;
                        }
                    }
                }
                return;
            }
            int var13 = var9 * 65536 / var10;
            int var14 = 32768;
            while (var6 != var8) {
                if (var8 > var6) {
                    var6++;
                } else if (var8 < var6) {
                    var6--;
                }
                if ((class379.field4998[class276.field3488][var5][var6] & 0x4) != 0) {
                    class424.method2491(class125.field1664, false, var5, 1, var6, 1);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    if (var5 < var7) {
                        var5++;
                    } else if (var5 > var7) {
                        var5--;
                    }
                    var14 -= 65536;
                    if ((class379.field4998[class276.field3488][var5][var6] & 0x4) != 0) {
                        class424.method2491(class125.field1664, false, var5, 1, var6, 1);
                        return;
                    }
                }
            }
            return;
        }
        class461.method2719(null, "RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class441.field6317 + "," + class320.field4064, arg0 + 121);
        return;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Z)V")
    public final void method2424(boolean arg0) {
        field5839++;
        class449 var2 = this.field5843;
        synchronized (this.field5843) {
            this.field5843.method2642(0);
        }
        if (!arg0) {
            this.field5843 = null;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V")
    public final void method2425(int arg0) {
        class449 var2 = this.field5843;
        synchronized (this.field5843) {
            if (arg0 < 108) {
                field5845 = 91;
            }
            this.field5843.method2640(126);
        }
        field5848++;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(BI)V")
    public final void method2426(byte arg0, int arg1) {
        field5849++;
        class449 var3 = this.field5843;
        synchronized (this.field5843) {
            int var4 = 20 / ((arg0 - 69) / 44);
            this.field5843.method2648(false, arg1);
        }
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(I)V")
    public static void method2427(int arg0) {
        field5846 = null;
        if (arg0 != 4) {
            field5846 = null;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)Lou;")
    public final class431 method2428(int arg0, int arg1) {
        field5847++;
        class449 var3 = this.field5843;
        class431 var4;
        synchronized (this.field5843) {
            var4 = (class431) this.field5843.method2647(-115, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class47 var5 = this.field5842;
        byte[] var6;
        synchronized (this.field5842) {
            var6 = this.field5842.method481(30, arg0, -95);
            if (arg1 >= -97) {
                this.method2425(4);
            }
        }
        class431 var7 = new class431();
        if (var6 != null) {
            var7.method2523(new class463(var6), -120);
        }
        class449 var8 = this.field5843;
        synchronized (this.field5843) {
            this.field5843.method2635((long) arg0, -26591, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(II)Z")
    public static final boolean method2429(int arg0, int arg1) {
        if (arg0 > -120) {
            return true;
        }
        field5844++;
        if (arg1 == 51 || arg1 == 18 || arg1 == 57 || arg1 == 45 || arg1 == 9) {
            return true;
        } else {
            return arg1 == 48 || arg1 == 1001;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lga;BLjava/awt/Canvas;ILpc;I)Lya;")
    public static final class38 method2430(class278 arg0, byte arg1, Canvas arg2, int arg3, class476 arg4, int arg5) {
        if (arg1 == -100) {
            field5841++;
            return new class395(arg5, arg2, arg0, arg3, arg4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIIIIIIZI)V")
    public static final void method2431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        field5850++;
        if (arg0 < 128 || arg9 < 128 || ((class452.field6526 - 2) * 128) < arg0 || arg9 > class440.field6307 * 128 - 256) {
            class46.field558[0] = class46.field558[1] = -1;
            return;
        }
        if (!arg8) {
            method2423((byte) -14);
        }
        int var10 = class151.method991(arg9, false, arg7, arg0) - arg4;
        class208.field2695.method231(arg6, 0, 0);
        class33.field416.method287(class208.field2695);
        class33.field416.method270(arg0, var10, arg9, class46.field558);
        class208.field2695.method231(-arg6, 0, 0);
        class33.field416.method287(class208.field2695);
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lae;ILqn;)V")
    public class409(class165 arg0, int arg1, class47 arg2) {
        this.field5842 = arg2;
        this.field5842.method469(30322, 30);
    }
}
