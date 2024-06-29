import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class77 implements Runnable {

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "Lad;")
    private class244 field1196 = new class244();

    @OriginalMember(owner = "client!mr", name = "t", descriptor = "Z")
    private boolean field1215 = false;

    @OriginalMember(owner = "client!mr", name = "u", descriptor = "I")
    public int field1216 = 0;

    @OriginalMember(owner = "client!mr", name = "s", descriptor = "Ljava/lang/Thread;")
    private Thread field1214;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!mr", name = "p", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!mr", name = "q", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!mr", name = "r", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "Lwf;")
    public static class70 field1210;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "[[[Luk;")
    public static class142[][][] field1200;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZI)Z", line = 3)
    public static final boolean method545(boolean arg0, int arg1) {
        field1205++;
        if (class270.field3678[arg1]) {
            return true;
        } else if (class120.field1700.method1899(-13384, arg1)) {
            int var2 = class120.field1700.method1911(0, arg1);
            if (var2 == 0) {
                class270.field3678[arg1] = true;
                return true;
            }
            if (class333.field4511[arg1] == null) {
                class333.field4511[arg1] = new class383[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class333.field4511[arg1][var3] == null) {
                    byte[] var4 = class120.field1700.method1920(var3, false, arg1);
                    if (var4 != null) {
                        class383 var5 = class333.field4511[arg1][var3] = new class383();
                        var5.field5507 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method2503(new class371(var4), 65535);
                        } else {
                            var5.method2507(new class371(var4), true);
                        }
                    }
                }
            }
            class270.field3678[arg1] = arg0;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIIIIII)V", line = 58)
    public static final void method546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != -7502) {
            field1200 = null;
        }
        class235.field3191 = arg3;
        class286.field3943 = arg2;
        field1202++;
        class69.field1067 = arg4;
        class323.field4427 = arg1;
        class23.field314 = arg5;
        class310.field4248 = arg0;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(La;I)V", line = 74)
    private final void method547(class366 arg0, int arg1) {
        field1207++;
        class244 var3 = this.field1196;
        synchronized (this.field1196) {
            if (arg1 != -18543) {
                this.field1215 = false;
            }
            this.field1196.method1530(arg0, true);
            this.field1216++;
            this.field1196.notifyAll();
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V", line = 92)
    public static final void method548(int arg0) {
        field1204++;
        int var1 = -118 % ((arg0 + 69) / 50);
        class399 var2 = class269.method1655(15, 0, -79);
        var2.method2582(0);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)S", line = 104)
    public static final short method549(int arg0, int arg1) {
        field1213++;
        int var2 = arg0 >> 10 & 0x3F;
        int var3 = (arg0 & 0x383) >> 3;
        int var4 = arg0 & arg1;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var7 >> 4 << 7 | var2 << 10);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B[B)[B", line = 129)
    public static final byte[] method550(byte arg0, byte[] arg1) {
        field1206++;
        if (arg1 == null) {
            return null;
        }
        byte[] var2 = new byte[arg1.length];
        class150.method1025(arg1, 0, var2, 0, arg1.length);
        if (arg0 != 11) {
            field1200 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)V", line = 147)
    public static final void method551(int arg0) {
        field1199++;
        for (int var1 = 0; var1 < 5; var1++) {
            class5.field83[var1] = false;
        }
        if (arg0 != -25874) {
            return;
        }
        class89.field1359 = 0;
        class123.field1731 = 1;
        class405.field5890 = 0;
        class299.field4142 = -1;
        class6.field91 = -1;
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(I)V", line = 173)
    public static final void method552(int arg0) {
        class390.field5740 = 0;
        field1203++;
        class167.field2393.method1315(120);
        class167.field2393.method1301(50, class79.field1228);
        class390.field5740++;
        if (arg0 < 66) {
            method556(11, 121, (class281) null);
        }
    }

    @OriginalMember(owner = "client!mr", name = "run", descriptor = "()V", line = 188)
    public final void run() {
        while (!this.field1215) {
            class244 var1 = this.field1196;
            class366 var2;
            synchronized (this.field1196) {
                var2 = (class366) this.field1196.method1533(-4174);
                if (var2 == null) {
                    try {
                        this.field1196.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field1216--;
            }
            try {
                if (var2.field5128 == 2) {
                    var2.field5122.method1320(-16580, var2.field5127, (int) var2.field6446, var2.field5127.length);
                } else if (var2.field5128 == 3) {
                    var2.field5127 = var2.field5122.method1321((int) var2.field6446, (byte) 115);
                }
            } catch (Exception var7) {
                class184.method1214(-113, (String) null, var7);
            }
            var2.field4169 = false;
        }
        field1211++;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILrb;I)La;", line = 232)
    public final class366 method553(int arg0, class197 arg1, int arg2) {
        field1201++;
        if (arg0 != 7308) {
            return null;
        }
        class366 var4 = new class366();
        var4.field6446 = (long) arg2;
        var4.field4174 = false;
        var4.field5122 = arg1;
        var4.field5128 = 3;
        this.method547(var4, -18543);
        return var4;
    }

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "(I)V", line = 251)
    public static void method554(int arg0) {
        field1210 = null;
        if (arg0 == 127) {
            field1200 = null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "([BIILrb;)La;", line = 270)
    public final class366 method555(byte[] arg0, int arg1, int arg2, class197 arg3) {
        if (arg2 != -16965) {
            return null;
        }
        field1208++;
        class366 var5 = new class366();
        var5.field5122 = arg3;
        var5.field6446 = (long) arg1;
        var5.field5128 = 2;
        var5.field5127 = arg0;
        var5.field4174 = false;
        this.method547(var5, -18543);
        return var5;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IILaa;)V", line = 294)
    public static final void method556(int arg0, int arg1, class281 arg2) {
        if (arg1 != 1) {
            method550((byte) -58, (byte[]) null);
        }
        field1197++;
        class173.method1169(arg2);
        if (arg0 > 1) {
            for (int var3 = 0; var3 < class432.field6220; var3++) {
                for (int var4 = 0; var4 < class267.field3646; var4++) {
                    if ((class221.field2910[1][var3][var4] & 0x2) == 2) {
                        class299.method1929(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; var5 < arg0; var5++) {
            for (int var6 = 0; var6 <= class267.field3646; var6++) {
                for (int var7 = 0; var7 <= class432.field6220; var7++) {
                    if ((class267.field3651[var5][var7][var6] & 0x1) != 0) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        while (var8 > 0 && (class267.field3651[var5][var7][var8 - 1] & 0x1) != 0) {
                            var8--;
                        }
                        while (class267.field3646 > var9 && (class267.field3651[var5][var7][var9 + 1] & 0x1) != 0) {
                            var9++;
                        }
                        int var11 = var5;
                        label170: while (var10 > 0) {
                            for (int var12 = var8; var12 <= var9; var12++) {
                                if ((class267.field3651[var10 - 1][var7][var12] & 0x1) == 0) {
                                    break label170;
                                }
                            }
                            var10--;
                        }
                        label159: while (var11 < 3) {
                            for (int var13 = var8; var13 <= var9; var13++) {
                                if ((class267.field3651[var11 + 1][var7][var13] & 0x1) == 0) {
                                    break label159;
                                }
                            }
                            var11++;
                        }
                        int var14 = (var11 + 1 - var10) * (var9 + 1 - var8);
                        if (var14 >= 2) {
                            short var15 = 240;
                            int var16 = class418.field6051[var11][var7][var8] - var15;
                            int var17 = class418.field6051[var10][var7][var8];
                            class138.method949(1, var7 * 128, var7 * 128, var8 * 128, var9 * 128 + 128, var16, var17);
                            for (int var18 = var10; var18 <= var11; var18++) {
                                for (int var19 = var8; var19 <= var9; var19++) {
                                    class267.field3651[var18][var7][var19] = (byte) class318.method2028(class267.field3651[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if ((class267.field3651[var5][var7][var6] & 0x2) != 0) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        while (var20 > 0 && (class267.field3651[var5][var20 - 1][var6] & 0x2) != 0) {
                            var20--;
                        }
                        int var23 = var5;
                        while (class432.field6220 > var21 && (class267.field3651[var5][var21 + 1][var6] & 0x2) != 0) {
                            var21++;
                        }
                        label224: while (var22 > 0) {
                            for (int var24 = var20; var24 <= var21; var24++) {
                                if ((class267.field3651[var22 - 1][var24][var6] & 0x2) == 0) {
                                    break label224;
                                }
                            }
                            var22--;
                        }
                        label213: while (var23 < 3) {
                            for (int var25 = var20; var25 <= var21; var25++) {
                                if ((class267.field3651[var23 + 1][var25][var6] & 0x2) == 0) {
                                    break label213;
                                }
                            }
                            var23++;
                        }
                        int var26 = (var23 - (var22 - 1)) * (var21 + 1 - var20);
                        if (var26 >= 2) {
                            short var27 = 240;
                            int var28 = class418.field6051[var23][var20][var6] - var27;
                            int var29 = class418.field6051[var22][var20][var6];
                            class138.method949(2, var20 * 128, var21 * 128 + 128, var6 * 128, var6 * 128, var28, var29);
                            for (int var30 = var22; var30 <= var23; var30++) {
                                for (int var31 = var20; var31 <= var21; var31++) {
                                    class267.field3651[var30][var31][var6] = (byte) class318.method2028(class267.field3651[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if ((class267.field3651[var5][var7][var6] & 0x4) != 0) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34 = var6;
                        int var35 = var6;
                        while (var34 > 0 && (class267.field3651[var5][var7][var34 - 1] & 0x4) != 0) {
                            var34--;
                        }
                        while (var35 < class267.field3646 && (class267.field3651[var5][var7][var35 + 1] & 0x4) != 0) {
                            var35++;
                        }
                        label278: while (var32 > 0) {
                            for (int var36 = var34; var36 <= var35; var36++) {
                                if ((class267.field3651[var5][var32 - 1][var36] & 0x4) == 0) {
                                    break label278;
                                }
                            }
                            var32--;
                        }
                        label267: while (class432.field6220 > var33) {
                            for (int var37 = var34; var37 <= var35; var37++) {
                                if ((class267.field3651[var5][var33 + 1][var37] & 0x4) == 0) {
                                    break label267;
                                }
                            }
                            var33++;
                        }
                        if (((var33 - (var32 - 1)) * (var35 + 1 - var34)) >= 4) {
                            int var38 = class418.field6051[var5][var32][var34];
                            class138.method949(4, var32 * 128, var33 * 128 + 128, var34 * 128, var35 * 128 + 128, var38, var38);
                            for (int var39 = var32; var39 <= var33; var39++) {
                                for (int var40 = var34; var40 <= var35; var40++) {
                                    class267.field3651[var5][var39][var40] = (byte) class318.method2028(class267.field3651[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V", line = 582)
    public static final void method557(byte arg0) {
        if (arg0 > -91) {
            method545(true, -46);
        }
        for (class432 var1 = (class432) class271.field3700.method1413(30381); var1 != null; var1 = (class432) class271.field3700.method1420((byte) 111)) {
            int var2 = var1.field6217;
            if (method545(true, var2)) {
                boolean var3 = true;
                class383[] var4 = class333.field4511[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field5589;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field5363;
                    class383 var7 = class290.method1869((byte) 107, var6);
                    if (var7 != null) {
                        class86.method596(14459, var7);
                    }
                }
            }
        }
        field1198++;
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(ILrb;I)La;", line = 637)
    public final class366 method558(int arg0, class197 arg1, int arg2) {
        field1209++;
        class366 var4 = new class366();
        var4.field5128 = 1;
        if (arg0 != -754914460) {
            method548(50);
        }
        class244 var5 = this.field1196;
        synchronized (this.field1196) {
            class366 var6 = (class366) this.field1196.method1527((byte) 84);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg2) == var6.field6446 && var6.field5122 == arg1 && var6.field5128 == 2) {
                    var4.field5127 = var6.field5127;
                    var4.field4169 = false;
                    return var4;
                }
                var6 = (class366) this.field1196.method1532(-11786);
            }
        }
        var4.field5127 = arg1.method1321(arg2, (byte) 85);
        var4.field4174 = true;
        var4.field4169 = false;
        return var4;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)V", line = 674)
    public final void method559(boolean arg0) {
        this.field1215 = true;
        field1212++;
        class244 var2 = this.field1196;
        synchronized (this.field1196) {
            this.field1196.notifyAll();
        }
        try {
            if (arg0) {
                this.field1215 = true;
            }
            this.field1214.join();
        } catch (InterruptedException var3) {
        }
        this.field1214 = null;
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lkq;)V", line = 704)
    public class77(class351 arg0) {
        class295 var2 = arg0.method2261(5, 29171, this);
        while (var2.field4068 == 0) {
            class4.method28(10L, -119);
        }
        if (var2.field4068 == 2) {
            throw new RuntimeException();
        }
        this.field1214 = (Thread) var2.field4070;
    }
}
