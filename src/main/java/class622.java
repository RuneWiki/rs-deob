import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class622 {

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "Luf;")
    private class380 field8630 = new class380(64);

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "Lga;")
    private class332 field8622;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field8621 = 0;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field8620;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field8623;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field8624;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field8626;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field8627;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field8629;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "J")
    public static long field8628;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Lla;")
    public static class409 field8625;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lwv;Lr;III)V", line = 10)
    public static final void method3457(class423 arg0, class562 arg1, int arg2, int arg3, int arg4) {
        field8620++;
        if (arg3 != 20643) {
            field8625 = null;
        }
        class596 var5 = arg0.method2383(-1, arg1);
        if (var5 == null) {
            return;
        }
        arg1.method1042(arg2, arg4, arg2 + arg0.field5561, arg0.field5672 + arg4);
        if (class657.field9361 == 2 || class657.field9361 == 5 || class28.field406 == null) {
            arg1.method1095(-16777216, var5, arg2, arg4);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class311.field4200 == 4) {
            var6 = (int) (-class565.field7707) & 0x3FFF;
            var7 = class165.field2369;
            var8 = field8621;
            var9 = 4096;
        } else {
            var6 = (int) (-class565.field7707) + class478.field6651 & 0x3FFF;
            var9 = 4096 - class424.field5716 * 16;
            var8 = class408.field5369.field397;
            var7 = class408.field5369.field398;
        }
        int var10 = var7 / 128 + 48 - (class703.field9886 + -104) * 2;
        int var11 = class431.field5789 * 4 + 48 - (var8 / 128) - (class431.field5789 + -104) * 2;
        class28.field406.method2985((float) arg0.field5561 / 2.0F + (float) arg2, (float) arg0.field5672 / 2.0F + (float) arg4, (float) var10, (float) var11, var9, var6 << 2, var5, arg2, arg4);
        for (class37 var12 = (class37) class378.field5002.method2506(68); var12 != null; var12 = (class37) class378.field5002.method2505(-126)) {
            int var58 = var12.field505;
            int var59 = (class448.field5932.field8156[var58] >> 14 & 0x3FFF) - class125.field1745;
            int var60 = (class448.field5932.field8156[var58] & 0x3FFF) - class4.field23;
            int var61 = var59 * 4 + (2 - var7 / 128);
            int var62 = var60 * 4 + 2 - (var8 / 128);
            class109.method593(class448.field5932.field8163[var58], arg2, var5, var62, arg4, var61, (byte) -127, arg0, arg1);
        }
        for (int var13 = 0; var13 < class204.field2744; var13++) {
            int var55 = class685.field9687[var13] * 4 + 2 - (var7 / 128);
            int var56 = class636.field8791[var13] * 4 + 2 - var8 / 128;
            class600 var57 = class118.field1510.method3921(class353.field4714[var13], -95);
            if (var57.field8257 != null) {
                var57 = var57.method3324((byte) 121, class564.field7696);
                if (var57 == null || var57.field8332 == -1) {
                    continue;
                }
            }
            class109.method593(var57.field8332, arg2, var5, var56, arg4, var55, (byte) -127, arg0, arg1);
        }
        for (class543 var14 = (class543) class290.field3835.method3053((byte) 72); var14 != null; var14 = (class543) class290.field3835.method3056(18113)) {
            int var50 = (int) (var14.field545 >> 28 & 0x3L);
            if (class485.field6740 == var50) {
                int var51 = (int) (var14.field545 & 0x3FFFL) - class125.field1745;
                int var52 = (int) (var14.field545 >> 14 & 0x3FFFL) - class4.field23;
                int var53 = var51 * 4 + 2 - (var7 / 128);
                int var54 = var52 * 4 + 2 - (var8 / 128);
                class27.method160(arg4, var54, arg0, var5, (byte) 127, var53, arg2, class596.field8217[0]);
            }
        }
        for (int var15 = 0; var15 < class289.field3820; var15++) {
            class407 var45 = (class407) class296.field3921.method3057(arg3 - 20642, (long) class389.field5220[var15]);
            if (var45 != null) {
                class351 var46 = var45.field5354;
                if (var46.method2077(arg3 - 20643) && class408.field5369.field385 == var46.field385) {
                    class384 var47 = var46.field4671;
                    if (var47 != null && var47.field5121 != null) {
                        var47 = var47.method2203(3, class564.field7696);
                    }
                    if (var47 != null && var47.field5069 && var47.field5079) {
                        int var48 = var46.field398 / 128 - (var7 / 128);
                        int var49 = var46.field397 / 128 - var8 / 128;
                        if (var47.field5068 == -1) {
                            class27.method160(arg4, var49, arg0, var5, (byte) 92, var48, arg2, class596.field8217[1]);
                        } else {
                            class109.method593(var47.field5068, arg2, var5, var49, arg4, var48, (byte) -127, arg0, arg1);
                        }
                    }
                }
            }
        }
        int var16 = class426.field5750;
        int[] var17 = class586.field8104;
        for (int var18 = 0; var18 < var16; var18++) {
            class573 var37 = class513.field7145[var17[var18]];
            if (var37 != null && var37.method3163(0) && class408.field5369 != var37 && class408.field5369.field385 == var37.field385) {
                int var38 = var37.field398 / 128 - (var7 / 128);
                int var39 = var37.field397 / 128 - (var8 / 128);
                boolean var40 = false;
                for (int var41 = 0; var41 < class427.field5757; var41++) {
                    if (var37.field7791.equals(class82.field948[var41]) && class358.field4767[var41] != 0) {
                        var40 = true;
                        break;
                    }
                }
                boolean var42 = false;
                for (int var43 = 0; var43 < class354.field4728; var43++) {
                    if (var37.field7791.equals(class267.field3491[var43].field4620)) {
                        var42 = true;
                        break;
                    }
                }
                boolean var44 = false;
                if (class408.field5369.field7807 != 0 && var37.field7807 != 0 && class408.field5369.field7807 == var37.field7807) {
                    var44 = true;
                }
                if (var37.field7818) {
                    class27.method160(arg4, var39, arg0, var5, (byte) 120, var38, arg2, class596.field8217[6]);
                } else if (var40) {
                    class27.method160(arg4, var39, arg0, var5, (byte) 72, var38, arg2, class596.field8217[3]);
                } else if (var42) {
                    class27.method160(arg4, var39, arg0, var5, (byte) 102, var38, arg2, class596.field8217[5]);
                } else if (var44) {
                    class27.method160(arg4, var39, arg0, var5, (byte) 98, var38, arg2, class596.field8217[4]);
                } else {
                    class27.method160(arg4, var39, arg0, var5, (byte) 115, var38, arg2, class596.field8217[2]);
                }
            }
        }
        class669[] var19 = class121.field1575;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class669 var23 = var19[var20];
            if (var23 != null && var23.field9508 != 0 && class327.field4404 % 20 < 10) {
                if (var23.field9508 == 1) {
                    class407 var24 = (class407) class296.field3921.method3057(arg3 ^ 0x50A2, (long) var23.field9513);
                    if (var24 != null) {
                        class351 var25 = var24.field5354;
                        int var26 = var25.field398 / 128 - (var7 / 128);
                        int var27 = var25.field397 / 128 - var8 / 128;
                        class144.method825(var26, arg4, var5, 3491, 360000L, var23.field9510, var27, arg0, arg2);
                    }
                }
                if (var23.field9508 == 2) {
                    int var28 = var23.field9504 / 128 - (var7 / 128);
                    int var29 = var23.field9511 / 128 - (var8 / 128);
                    long var30 = (long) (var23.field9507 << 7);
                    long var32 = var30 * var30;
                    class144.method825(var28, arg4, var5, arg3 - 17152, var32, var23.field9510, var29, arg0, arg2);
                }
                if (var23.field9508 == 10 && var23.field9513 >= 0 && var23.field9513 < class513.field7145.length) {
                    class573 var34 = class513.field7145[var23.field9513];
                    if (var34 != null) {
                        int var35 = var34.field398 / 128 - var7 / 128;
                        int var36 = var34.field397 / 128 - var8 / 128;
                        class144.method825(var35, arg4, var5, 3491, 360000L, var23.field9510, var36, arg0, arg2);
                    }
                }
            }
        }
        if (class311.field4200 == 4) {
            return;
        }
        if (class387.field5165 != 0) {
            int var21 = class387.field5165 * 4 + 2 - (var7 / 128) - (-(class408.field5369.method1435((byte) 123) * 2) + 2);
            int var22 = class502.field6926 * 4 + class408.field5369.method1435((byte) 103) * 2 + 2 - (var8 / 128) - 2;
            class27.method160(arg4, var22, arg0, var5, (byte) 107, var21, arg2, class138.field1880[class508.field7011 ? 1 : 0]);
        }
        arg1.method3118(true, 3, arg0.field5561 / 2 + arg2 - 1, arg0.field5672 / 2 + arg4 + -1, 3, -1);
        return;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V", line = 322)
    public final void method3458(byte arg0) {
        class380 var2 = this.field8630;
        synchronized (this.field8630) {
            this.field8630.method2168((byte) -94);
        }
        int var3 = -106 % ((arg0 + 50) / 35);
        field8624++;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V", line = 337)
    public final void method3459(int arg0) {
        if (arg0 != 32766) {
            method3457(null, null, 102, -35, -71);
        }
        class380 var2 = this.field8630;
        synchronized (this.field8630) {
            this.field8630.method2172(arg0 ^ 0xFFFFBB06);
        }
        field8626++;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)V", line = 351)
    public final void method3460(int arg0, int arg1) {
        class380 var3 = this.field8630;
        synchronized (this.field8630) {
            this.field8630.method2179(false, arg1);
        }
        field8627++;
        if (arg0 != 360000) {
            field8621 = 49;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V", line = 365)
    public static void method3461(boolean arg0) {
        if (!arg0) {
            method3457(null, null, 68, 10, 119);
        }
        field8625 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)Lfq;", line = 376)
    public final class119 method3462(byte arg0, int arg1) {
        field8623++;
        class380 var3 = this.field8630;
        class119 var4;
        synchronized (this.field8630) {
            if (arg0 != -79) {
                field8628 = 31L;
            }
            var4 = (class119) this.field8630.method2176(-124, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class332 var5 = this.field8622;
        byte[] var6;
        synchronized (this.field8622) {
            var6 = this.field8622.method1938(arg1, 11, arg0 ^ 0x5E);
        }
        class119 var7 = new class119();
        if (var6 != null) {
            var7.method693(58, new class157(var6));
        }
        class380 var8 = this.field8630;
        synchronized (this.field8630) {
            this.field8630.method2174(var7, (long) arg1, (byte) 125);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)I", line = 407)
    public static final int method3463(boolean arg0, int arg1) {
        if (!arg0) {
            method3463(true, -118);
        }
        field8629++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lnq;ILga;)V", line = 427)
    public class622(class650 arg0, int arg1, class332 arg2) {
        this.field8622 = arg2;
        if (this.field8622 != null) {
            this.field8622.method1939(0, 11);
        }
    }
}
