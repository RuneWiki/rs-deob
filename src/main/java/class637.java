import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class637 extends class508 {

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "Lbi;")
    public class509 field8932;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    public static int field8934 = -1;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    public static int field8933;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
    public static int field8935;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZZIIII)V")
    public static final void method3569(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field8933++;
        if (class270.field3423 == null) {
            class32.field452.method3118(-16777216, arg4, arg2, 1, arg5, arg3);
        } else if (class376.field4748.field6461 >= 0 && class376.field4748.field6461 < (class431.field5395 * 512) && class376.field4748.field6464 >= 0 && class376.field4748.field6464 < (class452.field5802 * 512)) {
            class673.field9473++;
            if (class376.field4748 != null && (class376.field4748.field6461 - ((class376.field4748.method2785(-1) - 1) * 256) >> 9) == class309.field3946 && (class376.field4748.field6464 - (class376.field4748.method2785(-1) - 1) * 256 >> 9) == class436.field5446) {
                class309.field3946 = -1;
                class436.field5446 = -1;
                class464.method2466(!arg0);
            }
            class7.method61(255);
            if (!arg1) {
                class405.method2157(-81);
            }
            class367.method2012((byte) 64);
            class561.method3083(arg5, arg4, -16777216, arg2, arg3, true);
            int var6 = class475.field6029;
            if (arg0) {
                field8934 = -62;
            }
            int var7 = class298.field3670;
            int var8 = class474.field6010;
            int var9 = class396.field4997;
            if (class296.field3661 == 1) {
                int var10 = (int) class133.field1739;
                if (class551.field7678 >> 8 > var10) {
                    var10 = class551.field7678 >> 8;
                }
                if (class451.field5788[4] && class98.field1333[4] + 128 > var10) {
                    var10 = class98.field1333[4] + 128;
                }
                int var11 = (int) class331.field4223 + class237.field2965 & 0x3FFF;
                class298.method1656(((var10 >> 3) * 3) + 600 << 2, class91.field1278, var10, class263.field3256, var11, 99, var6, class467.method2469(class376.field4748.field6461, class476.field6039, -20214, class376.field4748.field6464) - 200);
            } else if (class296.field3661 == 4) {
                int var12 = (int) class133.field1739;
                if ((class551.field7678 >> 8) > var12) {
                    var12 = class551.field7678 >> 8;
                }
                if (class451.field5788[4] && var12 < class98.field1333[4] + 128) {
                    var12 = class98.field1333[4] + 128;
                }
                int var13 = (int) class331.field4223 & 0x3FFF;
                class298.method1656((var12 >> 3) * 3 + 600 << 2, class91.field1278, var12, class263.field3256, var13, 46, var6, class467.method2469(class493.field6499, class476.field6039, -20214, class214.field2661) - 200);
            } else if (class296.field3661 == 5) {
                class284.method1597(var6, 16383);
            }
            int var14 = class20.field292;
            int var15 = class571.field7982;
            int var16 = class276.field3464;
            int var17 = class215.field2673;
            int var18 = class693.field9826;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class451.field5788[var19]) {
                    int var22 = (int) ((double) (-class335.field4265[var19]) + Math.random() * (double) (class335.field4265[var19] * 2 + 1) + Math.sin((double) class428.field5368[var19] / 100.0D * (double) class129.field1611[var19]) * (double) class98.field1333[var19]);
                    if (var19 == 1) {
                        class571.field7982 += var22 << 2;
                    }
                    if (var19 == 3) {
                        class693.field9826 = class693.field9826 + var22 & 0x3FFF;
                    }
                    if (var19 == 4) {
                        class215.field2673 += var22;
                        if (class215.field2673 < 1024) {
                            class215.field2673 = 1024;
                        } else if (class215.field2673 > 3072) {
                            class215.field2673 = 3072;
                        }
                    }
                    if (var19 == 2) {
                        class276.field3464 += var22 << 2;
                    }
                    if (var19 == 0) {
                        class20.field292 += var22 << 2;
                    }
                }
            }
            if (class20.field292 < 0) {
                class20.field292 = 0;
            }
            if ((class429.field5383 << 9) - 1 < class20.field292) {
                class20.field292 = (class429.field5383 << 9) - 1;
            }
            if (class276.field3464 < 0) {
                class276.field3464 = 0;
            }
            if (class276.field3464 > (class37.field508 << 9) - 1) {
                class276.field3464 = (class37.field508 << 9) - 1;
            }
            class301.method1668(87);
            class550.method3038((byte) -114);
            class32.field452.method1083(var8, var7, var8 + var9, var6 + var7);
            class32.field452.method1031();
            int var20 = class384.field4843;
            if (class419.field5274 == null) {
                class32.field452.method1028(var20);
            } else {
                class419.field5274.method3240(var20, var8, var7, var6, (byte) -94, class693.field9826, var9, class657.field9292 << 3, class215.field2673, class32.field452);
            }
            class671.method3767((byte) 76);
            class678.field9511.method920(class20.field292, class571.field7982, class276.field3464, -class215.field2673 & 0x3FFF, -class693.field9826 & 0x3FFF, -class654.field9226 & 0x3FFF);
            class32.field452.method1058(class678.field9511);
            class32.field452.method1048(var9 / 2 + var8, var6 / 2 + var7, class458.field5837 << 1, class458.field5837 << 1);
            class440.method2338(var9 / 2 + var8, class458.field5837 << 1, class458.field5837 << 1, var7 + (var6 / 2), (byte) 50);
            class557.method3068(class20.field292, -class215.field2673 & 0x3FFF, 8, class571.field7982, class276.field3464, -class654.field9226 & 0x3FFF, -class693.field9826 & 0x3FFF);
            byte var21 = class301.field3698.method143(-111, class651.field9191) == 2 ? (byte) class673.field9473 : 1;
            class107.method607(class133.field1735, class20.field292, class571.field7982, class276.field3464, class569.field7970, class540.field7233, class289.field3588, class389.field4915, class693.field9833, class215.field2671, class376.field4748.field6470 + 1, var21, class376.field4748.field6461 >> 9, class376.field4748.field6464 >> 9, !class301.field3698.field6618, true);
            class671.method3767((byte) 76);
            if (class504.field6675 == 10) {
                class620.method3404(var7, var9, var6, 256, var8, 256, (byte) 20);
                class410.method2172(256, var7, var8, var6, -140, 256, var9);
                class231.method1392(var6, var9, 256, -14564, 256, var7, var8);
                class51.method319(var9, -86, var7, var6, var8);
            }
            class613.method3375();
            class693.field9826 = var18;
            class571.field7982 = var15;
            class276.field3464 = var16;
            class20.field292 = var14;
            class215.field2673 = var17;
            if (class199.field2516 && class323.field4157.method2302(54) == 0) {
                class199.field2516 = false;
            }
            if (class199.field2516) {
                class32.field452.method3118(-16777216, var8, var7, 1, var6, var9);
                class112.method627(true, class32.field452, false, class689.field9771, class133.field1729, class83.field1120.method476((byte) -82, class250.field3068));
            }
        } else {
            class32.field452.method3118(-16777216, arg4, arg2, 1, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)V")
    public static final void method3570(int arg0, int arg1) {
        class680.field9562 = 1000000000L / (long) arg0;
        field8935++;
        if (arg1 > -29) {
            field8934 = -85;
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lbi;)V")
    public class637(class509 arg0) {
        this.field8932 = arg0;
    }
}
