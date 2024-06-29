import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class91 {

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "J")
    public long field1204;

    @OriginalMember(owner = "client!kba", name = "g", descriptor = "Len;")
    private class289 field1209;

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "Luc;")
    public static class27 field1206 = new class27(55, 8);

    @OriginalMember(owner = "client!kba", name = "i", descriptor = "Z")
    public static boolean field1211 = false;

    @OriginalMember(owner = "client!kba", name = "h", descriptor = "Lwn;")
    public static class663 field1210 = new class663();

    @OriginalMember(owner = "client!kba", name = "j", descriptor = "Lfc;")
    public static class235 field1212 = new class235(64, -2);

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!kba", name = "e", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!kba", name = "f", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!kba", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field1207++;
        this.field1209.method1788(this.field1204, 126);
        super.finalize();
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(B)V")
    public static final void method674(byte arg0) {
        class602.field8356.method3733((byte) -120);
        field1208++;
        int var1 = class602.field8356.method3726(8, 8);
        if (class602.field8365 > var1) {
            for (int var2 = var1; var2 < class602.field8365; var2++) {
                class198.field2928[class658.field9265++] = class594.field8262[var2];
            }
        }
        if (class602.field8365 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class602.field8365 = 0;
        if (arg0 != 2) {
            field1210 = null;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class594.field8262[var3];
            class225 var5 = ((class178) class323.field4762.method2061(arg0 - 17307, (long) var4)).field2634;
            int var6 = class602.field8356.method3726(1, 8);
            if (var6 == 0) {
                class594.field8262[class602.field8365++] = var4;
                var5.field6440 = class239.field3440;
            } else {
                int var7 = class602.field8356.method3726(2, 8);
                if (var7 == 0) {
                    class594.field8262[class602.field8365++] = var4;
                    var5.field6440 = class239.field3440;
                    class586.field8197[class499.field6860++] = var4;
                } else if (var7 == 1) {
                    class594.field8262[class602.field8365++] = var4;
                    var5.field6440 = class239.field3440;
                    int var8 = class602.field8356.method3726(3, 8);
                    var5.method1435(1, false, var8);
                    int var9 = class602.field8356.method3726(1, 8);
                    if (var9 == 1) {
                        class586.field8197[class499.field6860++] = var4;
                    }
                } else if (var7 == 2) {
                    class594.field8262[class602.field8365++] = var4;
                    var5.field6440 = class239.field3440;
                    if (class602.field8356.method3726(1, arg0 + 6) == 1) {
                        int var10 = class602.field8356.method3726(3, 8);
                        var5.method1435(2, false, var10);
                        int var11 = class602.field8356.method3726(3, 8);
                        var5.method1435(2, false, var11);
                    } else {
                        int var12 = class602.field8356.method3726(3, 8);
                        var5.method1435(0, false, var12);
                    }
                    int var13 = class602.field8356.method3726(1, arg0 ^ 0xA);
                    if (var13 == 1) {
                        class586.field8197[class499.field6860++] = var4;
                    }
                } else if (var7 == 3) {
                    class198.field2928[class658.field9265++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lva;I)V")
    public static final void method675(class457 arg0, int arg1) {
        field1203++;
        int var2 = arg0.field6470 - class239.field3440;
        int var3 = arg0.field6422 * 512 + (arg0.method1722((byte) -124) * 256);
        int var4 = arg0.field6411 * 512 + arg0.method1722((byte) -122) * 256;
        arg0.field514 += (var4 - arg0.field514) / var2;
        arg0.field6479 = 0;
        if (arg1 < 39) {
            field1212 = null;
        }
        arg0.field509 += (var3 - arg0.field509) / var2;
        if (arg0.field6465 == 0) {
            arg0.method2630(false, 8192);
        }
        if (arg0.field6465 == 1) {
            arg0.method2630(false, 12288);
        }
        if (arg0.field6465 == 2) {
            arg0.method2630(false, 0);
        }
        if (arg0.field6465 == 3) {
            arg0.method2630(false, 4096);
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Z)V")
    public static void method676(boolean arg0) {
        field1210 = null;
        field1212 = null;
        field1206 = null;
        if (arg0) {
            field1211 = false;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIIII)V")
    public static final void method677(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1205++;
        int var5 = 0;
        int var6 = arg3;
        if (arg1 > -81) {
            return;
        }
        int var7 = -arg3;
        int var8 = -1;
        int var9 = class355.method2104(class144.field2148, arg2 + arg3, 118, class482.field6703);
        int var10 = class355.method2104(class144.field2148, arg2 - arg3, 63, class482.field6703);
        class548.method3012(var9, (byte) 23, arg0, var10, class476.field6655[arg4]);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg4 - var6;
                int var12 = arg4 + var6;
                if (class92.field1219 <= var12 && var11 <= class631.field8829) {
                    int var13 = class355.method2104(class144.field2148, arg2 + var5, -115, class482.field6703);
                    int var14 = class355.method2104(class144.field2148, arg2 - var5, 114, class482.field6703);
                    if (var12 <= class631.field8829) {
                        class548.method3012(var13, (byte) 23, arg0, var14, class476.field6655[var12]);
                    }
                    if (class92.field1219 <= var11) {
                        class548.method3012(var13, (byte) 23, arg0, var14, class476.field6655[var11]);
                    }
                }
            }
            var5++;
            int var15 = arg4 - var5;
            int var16 = arg4 + var5;
            if (var16 >= class92.field1219 && var15 <= class631.field8829) {
                int var17 = class355.method2104(class144.field2148, arg2 + var6, 119, class482.field6703);
                int var18 = class355.method2104(class144.field2148, arg2 - var6, -123, class482.field6703);
                if (var16 <= class631.field8829) {
                    class548.method3012(var17, (byte) 23, arg0, var18, class476.field6655[var16]);
                }
                if (var15 >= class92.field1219) {
                    class548.method3012(var17, (byte) 23, arg0, var18, class476.field6655[var15]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Len;J[Lhba;)V")
    public class91(class289 arg0, long arg1, class10[] arg2) {
        this.field1204 = arg1;
        this.field1209 = arg0;
    }
}
