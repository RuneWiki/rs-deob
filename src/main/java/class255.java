import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class255 {

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field4036 = 0;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "Lvh;")
    public static class62 field4033 = new class62(200);

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "[I")
    public static int[] field4041 = new int[2500];

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "Z")
    public static boolean field4042 = false;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "[I")
    public static int[] field4038;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1799(int arg0, int arg1) {
        class348.field5519.method387(arg0, false);
        if (arg1 != 997) {
            method1803(79, (byte) -73);
        }
        field4035++;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)V", line = 16)
    public static void method1800(boolean arg0) {
        if (!arg0) {
            method1801((byte) -102);
        }
        field4038 = null;
        field4033 = null;
        field4041 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V", line = 28)
    public static final void method1801(byte arg0) {
        if (arg0 == -99) {
            class276.field4345.method378(arg0 ^ 0xFFFFFF9D);
            class119.field1648.method378(arg0 + 99);
            field4040++;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIII)V", line = 48)
    public static final void method1802(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4034++;
        for (class337 var5 = (class337) class250.field3968.method1812(arg0 ^ 0x2E70); var5 != null; var5 = (class337) class250.field3968.method1809(128)) {
            class11.method68(arg1, var5, (byte) 52, arg3, arg2, arg4);
        }
        class337 var6 = (class337) class257.field4069.method1812(1);
        if (arg0 != 11889) {
            method1803(-119, (byte) 18);
        }
        while (var6 != null) {
            byte var7 = 1;
            class282 var8 = var6.field5393.method1719(-1);
            if (var6.field5393.field3778 == var8.field4486) {
                var7 = 0;
            } else if (var6.field5393.field3778 == var8.field4464 || var6.field5393.field3778 == var8.field4471 || var6.field5393.field3778 == var8.field4492 || var6.field5393.field3778 == var8.field4469) {
                var7 = 2;
            } else if (var6.field5393.field3778 == var8.field4468 || var6.field5393.field3778 == var8.field4475 || var6.field5393.field3778 == var8.field4458 || var6.field5393.field3778 == var8.field4470) {
                var7 = 3;
            }
            if (var6.field5373 != var7) {
                int var9 = class79.method516(var6.field5393, (byte) -90);
                if (var6.field5380 != var9) {
                    if (var6.field5386 != null) {
                        class20.field239.method2339(var6.field5386);
                        var6.field5386 = null;
                    }
                    var6.field5380 = var9;
                }
                var6.field5373 = var7;
            }
            var6.field5374 = var6.field5393.field3767;
            var6.field5376 = var6.field5393.field3767 + (var6.field5393.method412((byte) 110) * 64);
            var6.field5375 = var6.field5393.field3763;
            var6.field5399 = var6.field5393.field3763 + var6.field5393.method412((byte) 100) * 64;
            class11.method68(arg1, var6, (byte) 52, arg3, arg2, arg4);
            var6 = (class337) class257.field4069.method1809(128);
        }
        for (class337 var10 = (class337) class168.field2574.method761(33); var10 != null; var10 = (class337) class168.field2574.method757(-1)) {
            byte var11 = 1;
            class282 var12 = var10.field5397.method1719(-1);
            if (var10.field5397.field3778 == var12.field4486) {
                var11 = 0;
            } else if (var10.field5397.field3778 == var12.field4464 || var10.field5397.field3778 == var12.field4471 || var10.field5397.field3778 == var12.field4492 || var10.field5397.field3778 == var12.field4469) {
                var11 = 2;
            } else if (var10.field5397.field3778 == var12.field4468 || var10.field5397.field3778 == var12.field4475 || var10.field5397.field3778 == var12.field4458 || var10.field5397.field3778 == var12.field4470) {
                var11 = 3;
            }
            if (var10.field5373 != var11) {
                int var13 = class55.method333(var10.field5397, true);
                if (var10.field5380 != var13) {
                    if (var10.field5386 != null) {
                        class20.field239.method2339(var10.field5386);
                        var10.field5386 = null;
                    }
                    var10.field5380 = var13;
                }
                var10.field5373 = var11;
            }
            var10.field5374 = var10.field5397.field3767;
            var10.field5376 = var10.field5397.field3767 + (var10.field5397.method412((byte) 122) * 64);
            var10.field5375 = var10.field5397.field3763;
            var10.field5399 = var10.field5397.field3763 + (var10.field5397.method412((byte) 86) * 64);
            class11.method68(arg1, var10, (byte) 52, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)Ln;", line = 180)
    public static final class314 method1803(int arg0, byte arg1) {
        if (arg1 != -51) {
            field4036 = 90;
        }
        field4037++;
        class314 var2 = (class314) class360.field5700.method380(arg1 ^ 0xFFFFFFCD, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class60.field698.method100(class253.method1791(arg0, true), class122.method787(arg1 + 169, arg0), (byte) -107);
        class314 var4 = new class314();
        var4.field4933 = arg0;
        if (var3 != null) {
            var4.method2220(new class143(var3), 180);
        }
        class360.field5700.method377((long) arg0, var4, -1);
        return var4;
    }
}
