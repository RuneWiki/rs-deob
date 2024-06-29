import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class388 {

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "Lnj;")
    private class162 field5650 = new class162(256);

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "Lmg;")
    private class101 field5655;

    @OriginalMember(owner = "client!fs", name = "k", descriptor = "Lht;")
    public static class410 field5656 = new class410();

    @OriginalMember(owner = "client!fs", name = "l", descriptor = "Lwj;")
    public static class270 field5657 = new class270(2, 8);

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    public static int field5647;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "I")
    public static int field5654;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZLga;Lya;)V", line = 4)
    public static final void method2283(boolean arg0, class277 arg1, class38 arg2) {
        field5646++;
        if (class350.field5111 == null) {
            return;
        }
        if (class373.field5474 < 10) {
            if (!class350.field5109.method740(arg0, class350.field5111.field3478)) {
                class373.field5474 = class352.field5173.method736((byte) -109, class350.field5111.field3478) / 10;
                return;
            }
            class291.method1728((byte) 50);
            class373.field5474 = 10;
        }
        if (class373.field5474 == 10) {
            class350.field5133 = class350.field5111.field3480 >> 6 << 6;
            class350.field5124 = class350.field5111.field3494 >> 6 << 6;
            class350.field5132 = (class350.field5111.field3493 >> 6 << 6) + 64 - class350.field5133;
            class350.field5137 = (class350.field5111.field3492 >> 6 << 6) + 64 - class350.field5124;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class350.field5111.method1508(class14.field204 + (class316.field4324.field1735 >> 7), var3, (class316.field4324.field1732 >> 7) + class510.field7566, class316.field4324.field1738, 10593)) {
                var4 = var3[1] - class350.field5133;
                var5 = var3[2] - class350.field5124;
            }
            if (!class492.field7175 && var4 >= 0 && var4 < class350.field5132 && var5 >= 0 && var5 < class350.field5137) {
                int var6 = var5 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var4 + ((int) (Math.random() * 10.0D) - 5);
                class299.field4107 = var7;
                class80.field1216 = var6;
            } else if (class127.field1885 == -1 || class98.field1476 == -1) {
                class350.field5111.method1515((class350.field5111.field3479 & 0xFFFCC80) >> 14, var3, class350.field5111.field3479 & 0x3FFF, arg0);
                class299.field4107 = var3[1] - class350.field5133;
                class80.field1216 = var3[2] - class350.field5124;
            } else {
                class350.field5111.method1515(class127.field1885, var3, class98.field1476, true);
                class492.field7175 = false;
                if (var3 != null) {
                    class299.field4107 = var3[1] - class350.field5133;
                    class80.field1216 = var3[2] - class350.field5124;
                }
                class98.field1476 = -1;
                class127.field1885 = -1;
            }
            if (class350.field5111.field3484 == 37) {
                class350.field5112 = 3.0F;
                class350.field5117 = 3.0F;
            } else if (class350.field5111.field3484 == 50) {
                class350.field5112 = 4.0F;
                class350.field5117 = 4.0F;
            } else if (class350.field5111.field3484 == 75) {
                class350.field5112 = 6.0F;
                class350.field5117 = 6.0F;
            } else if (class350.field5111.field3484 == 100) {
                class350.field5112 = 8.0F;
                class350.field5117 = 8.0F;
            } else if (class350.field5111.field3484 == 200) {
                class350.field5112 = 16.0F;
                class350.field5117 = 16.0F;
            } else {
                class350.field5112 = 8.0F;
                class350.field5117 = 8.0F;
            }
            class350.field5113 = (int) class350.field5112 >> 1;
            class350.field5118 = class323.method1871(8132, class350.field5113);
            class279.method1660(!arg0);
            class350.method2081();
            class212.field2958 = new class479();
            class350.field5116 += (int) (Math.random() * 5.0D) - 2;
            if (class350.field5116 < -8) {
                class350.field5116 = -8;
            }
            if (class350.field5116 > 8) {
                class350.field5116 = 8;
            }
            class350.field5121 += (int) (Math.random() * 5.0D) - 2;
            if (class350.field5121 < -16) {
                class350.field5121 = -16;
            }
            if (class350.field5121 > 16) {
                class350.field5121 = 16;
            }
            class350.method2088(arg1, class350.field5116 >> 2 << 10, class350.field5121 >> 1);
            class350.field5106.method146(256, 1024, 78);
            class350.field5108.method2421(256, 256, 9);
            class350.field5110.method2104(50, 4096);
            class302.field4142.method1571((byte) -37, 256);
            class373.field5474 = 20;
        } else if (class373.field5474 == 20) {
            class105.method776(true, 13);
            class350.method2097(arg2, class350.field5116, class350.field5121);
            class373.field5474 = 60;
            class105.method776(true, 26);
            class409.method2445(-33);
        } else if (class373.field5474 == 60) {
            if (class350.field5109.method743(false, class350.field5111.field3478 + "_staticelements")) {
                if (!class350.field5109.method740(arg0, class350.field5111.field3478 + "_staticelements")) {
                    return;
                }
                class350.field5120 = class367.method2215(class350.field5111.field3478 + "_staticelements", class64.field870, class350.field5109, 6018);
            } else {
                class350.field5120 = new class414(0);
            }
            class350.method2099();
            class373.field5474 = 70;
            class105.method776(true, 91);
            class409.method2445(-33);
        } else if (class373.field5474 == 70) {
            class315.field4300 = new class75(arg2, 11, true, class426.field6248);
            class373.field5474 = 73;
            class105.method776(true, 57);
            class409.method2445(-33);
        } else if (class373.field5474 == 73) {
            class421.field6172 = new class75(arg2, 12, true, class426.field6248);
            class373.field5474 = 76;
            class105.method776(true, 125);
            class409.method2445(-33);
        } else if (class373.field5474 == 76) {
            class24.field316 = new class75(arg2, 14, true, class426.field6248);
            class373.field5474 = 79;
            class105.method776(true, -125);
            class409.method2445(-33);
        } else if (class373.field5474 == 79) {
            class354.field5187 = new class75(arg2, 17, true, class426.field6248);
            class373.field5474 = 82;
            class105.method776(true, 123);
            class409.method2445(-33);
        } else if (class373.field5474 == 82) {
            class401.field5882 = new class75(arg2, 19, true, class426.field6248);
            class373.field5474 = 85;
            class105.method776(true, -117);
            class409.method2445(-33);
        } else if (class373.field5474 == 85) {
            class84.field1257 = new class75(arg2, 22, true, class426.field6248);
            class373.field5474 = 88;
            class105.method776(true, -118);
            class409.method2445(-33);
        } else if (class373.field5474 == 88) {
            class217.field3029 = new class75(arg2, 26, true, class426.field6248);
            class373.field5474 = 91;
            class105.method776(true, 53);
            class409.method2445(-33);
        } else {
            class361.field5260 = new class75(arg2, 30, arg0, class426.field6248);
            class373.field5474 = 100;
            class105.method776(true, -118);
            class409.method2445(-33);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)V", line = 231)
    public final void method2284(boolean arg0) {
        class162 var2 = this.field5650;
        synchronized (this.field5650) {
            this.field5650.method1066(4080);
        }
        field5653++;
        if (arg0) {
            field5656 = null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)V", line = 251)
    public final void method2285(int arg0, int arg1) {
        field5648++;
        if (arg1 != -18644) {
            field5656 = null;
        }
        class162 var3 = this.field5650;
        synchronized (this.field5650) {
            this.field5650.method1065((byte) -95, arg0);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V", line = 265)
    public static void method2286(byte arg0) {
        field5657 = null;
        if (arg0 > -20) {
            method2286((byte) 100);
        }
        field5656 = null;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(BI)Lss;", line = 280)
    public final class297 method2287(byte arg0, int arg1) {
        field5652++;
        if (arg0 != 50) {
            this.method2284(false);
        }
        class162 var3 = this.field5650;
        class297 var4;
        synchronized (this.field5650) {
            var4 = (class297) this.field5650.method1073((long) arg1, false);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5655.method727(arg1, 26, 34);
        class297 var6 = new class297();
        if (var5 != null) {
            var6.method1743(0, new class391(var5));
        }
        class162 var7 = this.field5650;
        synchronized (this.field5650) {
            this.field5650.method1072((long) arg1, var6, false);
            return var6;
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(Z)V", line = 308)
    public final void method2288(boolean arg0) {
        class162 var2 = this.field5650;
        synchronized (this.field5650) {
            if (arg0) {
                this.field5650 = null;
            }
            this.field5650.method1068(0);
        }
        field5654++;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIJ)V", line = 321)
    public static final void method2289(int arg0, int arg1, int arg2, long arg3) {
        field5649++;
        int var5 = (int) arg3 >> 14 & 0x1F;
        int var6 = ((int) arg3 & 0x3C9040) >> 20;
        int var7 = (int) (arg3 >>> 32) & Integer.MAX_VALUE;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class220 var8 = class78.field1141.method2103(var7, true);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field3143;
                var10 = var8.field3118;
            } else {
                var9 = var8.field3118;
                var10 = var8.field3143;
            }
            int var11 = var8.field3105;
            if (var6 != 0) {
                var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
            }
            class506.method3020(0, var11, -2096, true, 0, var9, arg2, var10, arg0);
        } else {
            class506.method3020(var6, 0, -2096, true, var5, 0, arg2, 0, arg0);
        }
        if (arg1 < 104) {
            method2286((byte) -61);
        }
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lal;ILmg;)V", line = 396)
    public class388(class66 arg0, int arg1, class101 arg2) {
        this.field5655 = arg2;
        this.field5655.method753(26, -63);
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)Z", line = 372)
    public static final boolean method2290(byte arg0) {
        field5647++;
        if (class194.field2769) {
            try {
                class390.method2298("showVideoAd", class202.field2840.field7425, (byte) 45);
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != 12) {
            field5657 = null;
        }
        return false;
    }
}
