import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class359 {

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "Lof;")
    private class620 field4595 = new class620(64);

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "Loh;")
    private class404 field4584;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "Ljava/lang/String;")
    public static String field4598 = null;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "[I")
    public static int[] field4599 = new int[14];

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "Lpia;")
    public static class94 field4590 = new class94(14, 8);

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field4593;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lwp;II)V")
    public static final void method2108(class179 arg0, int arg1, int arg2) {
        field4597++;
        boolean var3 = arg0.method1102(255, 1) == 1;
        if (var3) {
            class111.field1169[class165.field1846++] = arg2;
        }
        int var4 = arg0.method1102(arg1 ^ 0x1206, 2);
        class183 var5 = class75.field792[arg2];
        if (var4 == 0) {
            if (var3) {
                var5.field2165 = false;
            } else if (class701.field9893 == arg2) {
                throw new RuntimeException("s:lr");
            } else {
                class98 var6 = class603.field8577[arg2] = new class98();
                var6.field1023 = (var5.field4628 << 28) + ((var5.field7187[0] + class464.field6624 >> 6 << 14) + (var5.field7193[0] + class181.field2144 >> 6));
                if (var5.field2197 == -1) {
                    var6.field1025 = var5.field7166.method4141(-2117887806);
                } else {
                    var6.field1025 = var5.field2197;
                }
                var6.field1026 = var5.field2176;
                var6.field1027 = var5.field7148;
                if (var5.field2185 > 0) {
                    class518.method3045(var5, arg1 + 60679);
                }
                class75.field792[arg2] = null;
                if (arg0.method1102(255, 1) != 0) {
                    class556.method3261(arg0, -115, arg2);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg0.method1102(255, 3);
            int var8 = var5.field7187[0];
            int var9 = var5.field7193[0];
            if (var7 == 0) {
                var9--;
                var8--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var9--;
                var8++;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var8--;
                var9++;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var9++;
                var8++;
            }
            if (var3) {
                var5.field2195 = var8;
                var5.field2150 = var9;
                var5.field2165 = true;
            } else {
                var5.method1141((byte) -75, var8, class311.field3859[arg2], var9);
            }
        } else if (var4 == 2) {
            int var10 = arg0.method1102(255, 4);
            int var11 = var5.field7187[0];
            int var12 = var5.field7193[0];
            if (var10 == 0) {
                var11 -= 2;
                var12 -= 2;
            } else if (var10 == 1) {
                var11--;
                var12 -= 2;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var12 -= 2;
                var11++;
            } else if (var10 == 4) {
                var12 -= 2;
                var11 += 2;
            } else if (var10 == 5) {
                var12--;
                var11 -= 2;
            } else if (var10 == 6) {
                var11 += 2;
                var12--;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var12++;
                var11 -= 2;
            } else if (var10 == 10) {
                var12++;
                var11 += 2;
            } else if (var10 == 11) {
                var12 += 2;
                var11 -= 2;
            } else if (var10 == 12) {
                var12 += 2;
                var11--;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var12 += 2;
                var11++;
            } else if (var10 == 15) {
                var12 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field2165 = true;
                var5.field2195 = var11;
                var5.field2150 = var12;
            } else {
                var5.method1141((byte) -53, var11, class311.field3859[arg2], var12);
            }
        } else {
            int var13 = arg0.method1102(255, 1);
            if (var13 == 0) {
                int var14 = arg0.method1102(arg1 ^ 0x1206, 12);
                int var15 = var14 >> 10;
                int var16 = var14 >> 5 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field7187[0] + var16;
                int var19 = var5.field7193[0] + var17;
                if (var3) {
                    var5.field2165 = true;
                    var5.field2150 = var19;
                    var5.field2195 = var18;
                } else {
                    var5.method1141((byte) -118, var18, class311.field3859[arg2], var19);
                }
                var5.field4628 = var5.field4633 = (byte) (var5.field4628 + var15 & 0x3);
                if (class728.method4056(var19, var18, (byte) -106)) {
                    var5.field4633++;
                }
                if (class701.field9893 == arg2) {
                    if (class122.field1278 != var5.field4628) {
                        class568.field8076 = true;
                    }
                    class122.field1278 = var5.field4628;
                }
            } else {
                int var20 = arg0.method1102(arg1 ^ 0x1206, 30);
                int var21 = var20 >> 28;
                int var22 = var20 >> 14 & 0x3FFF;
                if (arg1 != 4857) {
                    field4590 = null;
                }
                int var23 = var20 & 0x3FFF;
                int var24 = (class464.field6624 + var22 + var5.field7187[0] & 0x3FFF) - class464.field6624;
                int var25 = (var5.field7193[0] + class181.field2144 + var23 & 0x3FFF) - class181.field2144;
                if (var3) {
                    var5.field2150 = var25;
                    var5.field2165 = true;
                    var5.field2195 = var24;
                } else {
                    var5.method1141((byte) -108, var24, class311.field3859[arg2], var25);
                }
                var5.field4628 = var5.field4633 = (byte) (var5.field4628 + var21 & 0x3);
                if (class728.method4056(var25, var24, (byte) 59)) {
                    var5.field4633++;
                }
                if (class701.field9893 == arg2) {
                    class122.field1278 = var5.field4628;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IILoh;I)Luk;")
    public static final class260 method2109(int arg0, int arg1, class404 arg2, int arg3) {
        field4596++;
        if (arg0 != 4763) {
            field4598 = null;
        }
        byte[] var4 = arg2.method2481(arg3, arg1, (byte) 108);
        return var4 == null ? null : new class260(var4);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI)Lria;")
    public final class284 method2110(boolean arg0, int arg1) {
        field4586++;
        class620 var3 = this.field4595;
        class284 var4;
        synchronized (this.field4595) {
            var4 = (class284) this.field4595.method3538((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class404 var5 = this.field4584;
        byte[] var6;
        synchronized (this.field4584) {
            var6 = this.field4584.method2481(35, arg1, (byte) 104);
        }
        class284 var7 = new class284();
        if (arg0) {
            field4592 = -66;
        }
        if (var6 != null) {
            var7.method1697((byte) 113, new class244(var6));
        }
        var7.method1700(2);
        class620 var8 = this.field4595;
        synchronized (this.field4595) {
            this.field4595.method3537(115, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
    public final void method2111(byte arg0) {
        field4585++;
        if (arg0 >= -59) {
            method2115(-10, null, null, 116, 94, null, 23, null, -58, 53, (byte) -117, null);
        }
        class620 var2 = this.field4595;
        synchronized (this.field4595) {
            this.field4595.method3549(0);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)V")
    public final void method2112(int arg0, int arg1) {
        if (arg1 != 27704) {
            return;
        }
        field4589++;
        class620 var3 = this.field4595;
        synchronized (this.field4595) {
            this.field4595.method3539((byte) 6, arg0);
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)V")
    public static void method2113(byte arg0) {
        if (arg0 >= -58) {
            method2115(69, null, null, -24, 35, null, 37, null, 41, -67, (byte) 67, null);
        }
        field4599 = null;
        field4598 = null;
        field4590 = null;
        field4593 = null;
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(B)V")
    public final void method2114(byte arg0) {
        class620 var2 = this.field4595;
        synchronized (this.field4595) {
            this.field4595.method3541(-647);
            if (arg0 < 70) {
                method2115(84, null, null, 9, 49, null, -51, null, -22, 30, (byte) -123, null);
            }
        }
        field4588++;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILtp;Laa;IILur;ILjava/lang/String;IIBLda;)V")
    public static final void method2115(int arg0, class532 arg1, class485 arg2, int arg3, int arg4, class535 arg5, int arg6, String arg7, int arg8, int arg9, byte arg10, class59 arg11) {
        field4591++;
        int var12;
        if (class496.field7014 == 4) {
            var12 = (int) class227.field2590 & 0x3FFF;
        } else {
            var12 = (int) class227.field2590 + class34.field367 & 0x3FFF;
        }
        int var13 = Math.max(arg1.field7658 / 2, arg1.field7573 / 2) + 10;
        int var14 = arg9 * arg9 + (arg8 * arg8);
        if (arg10 > -119) {
            method2108(null, -3, -86);
        }
        if (var14 > (var13 * var13)) {
            return;
        }
        int var15 = class260.field3230[var12];
        int var16 = class260.field3229[var12];
        if (class496.field7014 != 4) {
            var15 = var15 * 256 / (class730.field10216 + 256);
            var16 = var16 * 256 / (class730.field10216 + 256);
        }
        int var17 = arg8 * var15 + arg9 * var16 >> 14;
        int var18 = arg8 * var16 - (arg9 * var15) >> 14;
        int var19 = arg5.method3141(null, (byte) -59, arg7, 100);
        int var20 = arg5.method3143(100, 0, -1, arg7, null);
        int var21 = var17 - var19 / 2;
        if (-arg1.field7658 <= var21 && var21 <= arg1.field7658 && var18 >= -arg1.field7573 && var18 <= arg1.field7573) {
            arg11.method459(0, 1, null, null, var19, arg2, 0, arg6, arg0, arg3 + var21 + (arg1.field7658 / 2), arg3, 0, arg7, 50, arg1.field7573 / 2 + arg6 - arg4 - var20 - var18, 0);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZIIII)V")
    public static final void method2116(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field4587++;
        if (arg1) {
            method2108(null, -23, 16);
        }
        if (arg2 == arg5) {
            class503.method2985(-64, arg4, arg0, arg3, arg5);
        } else if (class338.field4355 <= arg3 - arg5 && arg3 + arg5 <= class744.field10385 && class224.field2571 <= (arg0 - arg2) && class578.field8182 >= (arg0 + arg2)) {
            class22.method100(arg4, arg0, arg3, -127, arg5, arg2);
        } else {
            class456.method2796(arg2, arg3, (byte) 92, arg4, arg5, arg0);
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lnb;ILoh;)V")
    public class359(class301 arg0, int arg1, class404 arg2) {
        this.field4584 = arg2;
        if (this.field4584 != null) {
            this.field4584.method2482(0, 35);
        }
    }
}
