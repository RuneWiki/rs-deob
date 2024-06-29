import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public abstract class class69 {

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public int field1255;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public int field1254;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public int field1253;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field1256 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "[Lcf;")
    public static class93[] field1251 = new class93[8];

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "[Lcf;")
    public static class93[] field1258 = new class93[1000];

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "Lcf;")
    public static class93 field1260 = class147.method1066("Update)2Liste geladen)3", -48);

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field1262 = -1;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field1257 = 0;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "[I")
    public static int[] field1249 = new int[2];

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "[[[I")
    public static int[][][] field1263;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "[[[I")
    public static int[][][] field1265;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static void method464(int arg0) {
        if (arg0 != -16) {
            return;
        }
        field1258 = null;
        field1260 = null;
        field1251 = null;
        field1249 = null;
        field1265 = null;
        field1263 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)V")
    public abstract void method465(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIILs;)V")
    public static final void method466(int arg0, int arg1, int arg2, int arg3, class237 arg4) {
        field1250++;
        if (class166.field2927 == arg4 || class253.field4549 >= 400) {
            return;
        }
        class93 var11;
        if (arg4.field4227 == 0) {
            boolean var5 = true;
            if (class166.field2927.field4236 != -1 && arg4.field4236 != -1) {
                int var6 = class166.field2927.field4228 > arg4.field4228 ? class166.field2927.field4228 : arg4.field4228;
                int var7 = class166.field2927.field4228 - arg4.field4228;
                int var8 = class166.field2927.field4236 < arg4.field4236 ? class166.field2927.field4236 : arg4.field4236;
                if (var7 < 0) {
                    var7 = -var7;
                }
                int var9 = var6 * 10 / 100 + var8 + 5;
                if (var7 > var9) {
                    var5 = false;
                }
            }
            class93 var10 = class78.field1460 == 1 ? class70.field1281 : class151.field2645;
            if (arg4.field4226 > arg4.field4228) {
                var11 = class130.method949((byte) -77, new class93[] { arg4.method1616((byte) 52), var5 ? class14.method60(arg4.field4228, (byte) -110, class166.field2927.field4228) : class83.field1525, class271.field4823, var10, class148.method1067(-7015, arg4.field4228), class251.field4511, class148.method1067(-7015, arg4.field4226 - arg4.field4228), class228.field4087 });
            } else {
                var11 = class130.method949((byte) -77, new class93[] { arg4.method1616((byte) 52), var5 ? class14.method60(arg4.field4228, (byte) 118, class166.field2927.field4228) : class83.field1525, class271.field4823, var10, class148.method1067(-7015, arg4.field4228), class228.field4087 });
            }
        } else {
            var11 = class130.method949((byte) -77, new class93[] { arg4.method1616((byte) 52), class271.field4823, class271.field4824, class148.method1067(-7015, arg4.field4227), class228.field4087 });
        }
        int var12 = -120 / ((arg0 + 17) / 36);
        if (class268.field4769 == 1) {
            class58.field984++;
            class144.method1042((short) 3, (long) arg1, class220.field3994, class156.field2768, true, arg3, class130.method949((byte) -77, new class93[] { class97.field1738, class152.field2663, var11 }), arg2);
        } else if (!class263.field4695) {
            for (int var13 = 7; var13 >= 0; var13--) {
                if (field1251[var13] != null) {
                    short var14 = 0;
                    class282.field5063++;
                    if (class78.field1460 == 0 && field1251[var13].method649(class42.field662, -4446)) {
                        if (class166.field2927.field4228 < arg4.field4228) {
                            var14 = 2000;
                        }
                        if (class166.field2927.field4220 != 0 && arg4.field4220 != 0) {
                            if (class166.field2927.field4220 == arg4.field4220) {
                                var14 = 2000;
                            } else {
                                var14 = 0;
                            }
                        }
                    } else if (class89.field1578[var13]) {
                        var14 = 2000;
                    }
                    boolean var15 = false;
                    short var16 = class238.field4254[var13];
                    short var17 = (short) (var14 + var16);
                    class144.method1042(var17, (long) arg1, class167.field2949[var13], field1251[var13], true, arg3, class130.method949((byte) -77, new class93[] { class83.field1525, var11 }), arg2);
                }
            }
        } else if ((class210.field3799 & 0x8) != 0) {
            class144.method1042((short) 41, (long) arg1, class54.field888, class153.field2683, true, arg3, class130.method949((byte) -77, new class93[] { class66.field1206, class152.field2663, var11 }), arg2);
            class35.field550++;
        }
        for (int var18 = 0; var18 < class253.field4549; var18++) {
            if (class216.field3942[var18] == 42) {
                class86.field1553[var18] = class130.method949((byte) -77, new class93[] { class83.field1525, var11 });
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BII)V")
    public abstract void method467(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
    public static final void method468(int arg0) {
        field1261++;
        if (arg0 < -106) {
            class167.field2939.method294(0);
            class238.field4255.method294(0);
            class260.field4672.method294(0);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public static final void method469(byte arg0) {
        int var1 = class250.field4504.method1569(false, 8);
        if (class252.field4543 > var1) {
            for (int var2 = var1; var2 < class252.field4543; var2++) {
                class18.field235[class276.field4938++] = class234.field4166[var2];
            }
        }
        field1259++;
        if (var1 > class252.field4543) {
            throw new RuntimeException("gppov1");
        }
        class252.field4543 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class234.field4166[var3];
            class237 var5 = class224.field4031[var4];
            int var6 = class250.field4504.method1569(false, 1);
            if (var6 == 0) {
                class234.field4166[class252.field4543++] = var4;
                var5.field3793 = class275.field4921;
            } else {
                int var7 = class250.field4504.method1569(false, 2);
                if (var7 == 0) {
                    class234.field4166[class252.field4543++] = var4;
                    var5.field3793 = class275.field4921;
                    class264.field4708[class138.field2407++] = var4;
                } else if (var7 == 1) {
                    class234.field4166[class252.field4543++] = var4;
                    var5.field3793 = class275.field4921;
                    int var8 = class250.field4504.method1569(false, 3);
                    var5.method1489(var8, 1, arg0 + 13174);
                    int var9 = class250.field4504.method1569(false, 1);
                    if (var9 == 1) {
                        class264.field4708[class138.field2407++] = var4;
                    }
                } else if (var7 == 2) {
                    class234.field4166[class252.field4543++] = var4;
                    var5.field3793 = class275.field4921;
                    if (class250.field4504.method1569(false, 1) == 1) {
                        int var11 = class250.field4504.method1569(false, 3);
                        var5.method1489(var11, 2, 13269);
                        int var12 = class250.field4504.method1569(false, 3);
                        var5.method1489(var12, 2, arg0 ^ 0x338A);
                    } else {
                        int var10 = class250.field4504.method1569(false, 3);
                        var5.method1489(var10, 0, 13269);
                    }
                    int var13 = class250.field4504.method1569(false, 1);
                    if (var13 == 1) {
                        class264.field4708[class138.field2407++] = var4;
                    }
                } else if (var7 == 3) {
                    class18.field235[class276.field4938++] = var4;
                }
            }
        }
        if (arg0 != 95) {
            field1249 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(III)V")
    public abstract void method470(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)Lkk;")
    public static final class232 method471(byte arg0) {
        field1252++;
        int var1 = -74 % ((-arg0 - 66) / 51);
        try {
            return (class232) Class.forName("hi").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(III)V")
    public class69(int arg0, int arg1, int arg2) {
        this.field1255 = arg2;
        this.field1254 = arg0;
        this.field1253 = arg1;
    }
}
