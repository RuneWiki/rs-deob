import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class427 {

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "Lgg;")
    private class114 field6067 = new class114(64);

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "Lkha;")
    private class687 field6065;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "[I")
    public static int[] field6061 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public static void method2533(int arg0) {
        if (arg0 != 32767) {
            field6061 = null;
        }
        field6061 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILkba;)V")
    public static final void method2534(int arg0, class24 arg1) {
        field6063++;
        if (arg1.field362 == null && arg1.field369 == null) {
            return;
        }
        boolean var2 = true;
        if (arg0 != 25342) {
            return;
        }
        for (int var3 = 0; var3 < arg1.field362.length; var3++) {
            int var4 = -1;
            if (arg1.field362 != null) {
                var4 = arg1.field362[var3];
            }
            if (var4 != -1) {
                var2 = false;
                boolean var5 = false;
                boolean var6 = false;
                int var9;
                int var11;
                if ((var4 & 0xC0000000) == -1073741824) {
                    int var7 = var4 & 0xFFFFFFF;
                    int var8 = var7 >> 14;
                    var9 = -((var8 - class63.field851) * 512 - arg1.field5790) - 256;
                    int var10 = var7 & 0x3FFF;
                    var11 = arg1.field5784 - ((var10 - class753.field10509) * 512) - 256;
                } else if ((var4 & 0x8000) == 0) {
                    class247 var14 = (class247) class563.field7875.method3248((long) var4, 0);
                    if (var14 == null) {
                        arg1.method264(var3, -1, -122);
                        continue;
                    }
                    class124 var15 = var14.field3158;
                    var9 = arg1.field5790 - var15.field5790;
                    var11 = arg1.field5784 - var15.field5784;
                } else {
                    int var12 = var4 & 0x7FFF;
                    class546 var13 = class447.field6287[var12];
                    if (var13 == null) {
                        arg1.method264(var3, -1, -125);
                        continue;
                    }
                    var9 = arg1.field5790 - var13.field5790;
                    var11 = arg1.field5784 - var13.field5784;
                }
                if (var9 != 0 || var11 != 0) {
                    arg1.method264(var3, (int) (Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF, arg0 - 25466);
                }
            } else if (!arg1.method264(var3, -1, -126)) {
                var2 = false;
            }
        }
        if (var2) {
            arg1.field362 = null;
            arg1.field369 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)V")
    public final void method2535(int arg0, byte arg1) {
        class114 var3 = this.field6067;
        synchronized (this.field6067) {
            if (arg1 != -8) {
                method2534(55, null);
            }
            this.field6067.method776((byte) -113);
            this.field6067 = new class114(arg0);
        }
        field6060++;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V")
    public final void method2536(int arg0) {
        field6059++;
        class114 var2 = this.field6067;
        synchronized (this.field6067) {
            if (arg0 >= -105) {
                this.method2538((byte) -18, 127);
            }
            this.field6067.method781((byte) 47);
        }
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)V")
    public final void method2537(int arg0) {
        if (arg0 != 0) {
            this.method2539(-72, 101);
        }
        class114 var2 = this.field6067;
        synchronized (this.field6067) {
            this.field6067.method776((byte) 111);
        }
        field6064++;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BI)V")
    public final void method2538(byte arg0, int arg1) {
        if (arg0 > -91) {
            this.method2537(-100);
        }
        field6066++;
        class114 var3 = this.field6067;
        synchronized (this.field6067) {
            this.field6067.method775(1, arg1);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)Lsa;")
    public final class748 method2539(int arg0, int arg1) {
        field6062++;
        class114 var3 = this.field6067;
        class748 var4;
        synchronized (this.field6067) {
            var4 = (class748) this.field6067.method778((long) arg1, 87);
        }
        if (var4 != null) {
            return var4;
        }
        class687 var5 = this.field6065;
        byte[] var6;
        synchronized (this.field6065) {
            var6 = this.field6065.method3810(class587.method3266(true, arg1), arg0 ^ 0xFFFFD74D, class113.method765(arg1, (byte) 117));
        }
        class748 var7 = new class748();
        if (var6 != null) {
            var7.method4181(117, new class179(var6));
        }
        if (arg0 != 29581) {
            this.method2538((byte) -106, -105);
        }
        class114 var8 = this.field6067;
        synchronized (this.field6067) {
            this.field6067.method774((long) arg1, 96, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Ldh;ILkha;)V")
    public class427(class286 arg0, int arg1, class687 arg2) {
        this.field6065 = arg2;
        if (this.field6065 != null) {
            int var4 = this.field6065.method3816(-128) - 1;
            this.field6065.method3812(0, var4);
        }
    }
}
