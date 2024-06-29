import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class338 extends class152 {

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
    private int field4185;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "Llja;")
    public static class744 field4184 = new class744(10, 7);

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "[Lof;")
    public class649[] field4186;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "[[B")
    private byte[][] field4182;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)Z")
    public final boolean method1997(int arg0, boolean arg1) {
        field4180++;
        return arg1 ? this.field4186[arg0].field8857 : false;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)Z")
    public final boolean method1998(int arg0, byte arg1) {
        if (arg1 != 17) {
            field4184 = null;
        }
        field4183++;
        return this.field4186[arg0].field8844;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(Z)Z")
    public final boolean method1999(boolean arg0) {
        field4188++;
        if (this.field4186 != null) {
            return true;
        }
        if (this.field4182 == null) {
            class48 var2 = class193.field2301;
            synchronized (class193.field2301) {
                if (!class193.field2301.method432(false, this.field4185)) {
                    return false;
                }
                int[] var4 = class193.field2301.method441(this.field4185, -69);
                this.field4182 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field4182[var5] = class193.field2301.method437(this.field4185, (byte) -71, var4[var5]);
                }
            }
        }
        boolean var6 = arg0;
        for (int var7 = 0; var7 < this.field4182.length; var7++) {
            byte[] var8 = this.field4182[var7];
            class403 var9 = new class403(var8);
            var9.field5262 = 1;
            int var10 = var9.method2390((byte) -113);
            class48 var11 = class491.field6851;
            synchronized (class491.field6851) {
                var6 &= class491.field6851.method433((byte) -94, var10);
            }
        }
        if (!var6) {
            return false;
        }
        class450 var12 = new class450();
        class48 var13 = class193.field2301;
        int[] var15;
        synchronized (class193.field2301) {
            int var14 = class193.field2301.method431(4, this.field4185);
            this.field4186 = new class649[var14];
            var15 = class193.field2301.method441(this.field4185, -116);
        }
        for (int var16 = 0; var16 < var15.length; var16++) {
            byte[] var17 = this.field4182[var16];
            class403 var18 = new class403(var17);
            var18.field5262 = 1;
            int var19 = var18.method2390((byte) -104);
            class201 var20 = null;
            for (class201 var21 = (class201) var12.method2725(37); var21 != null; var21 = (class201) var12.method2726(-127)) {
                if (var21.field2416 == var19) {
                    var20 = var21;
                    break;
                }
            }
            if (var20 == null) {
                class48 var22 = class491.field6851;
                synchronized (class491.field6851) {
                    var20 = new class201(var19, class491.field6851.method453(var19, 11040));
                }
                var12.method2732(var20, 21939);
            }
            this.field4186[var15[var16]] = new class649(var17, var20);
        }
        this.field4182 = null;
        return true;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public static void method2000(int arg0) {
        if (arg0 != -15162) {
            method2002(null, null, null, 58, null);
        }
        field4184 = null;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)Z")
    public final boolean method2001(int arg0, int arg1) {
        if (arg1 != 7402) {
            this.field4186 = null;
        }
        field4179++;
        return this.field4186[arg0].field8853;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Liaa;[I[II[I)V")
    public static final void method2002(class521 arg0, int[] arg1, int[] arg2, int arg3, int[] arg4) {
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg2[var5];
            int var8 = arg1[var5];
            int var9 = 0;
            while (var7 != 0 && arg0.field3435.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field3435[var9] = null;
                    } else {
                        class582 var10 = class362.field4504.method3600(-44, var6);
                        int var11 = var10.field7941;
                        class756 var12 = arg0.field3435[var9];
                        if (var12 != null) {
                            if (var12.field10471 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field3435[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field10468 = var8;
                                    var12.field10470 = 0;
                                    var12.field10469 = 0;
                                    var12.field10473 = 0;
                                    var12.field10467 = 1;
                                    if (!arg0.field3363) {
                                        class60.method520(0, (byte) -104, arg0, var10);
                                    }
                                } else if (var11 == 2) {
                                    var12.field10469 = 0;
                                }
                            } else if (var10.field7947 >= class362.field4504.method3600(-125, var12.field10471).field7947) {
                                var12 = arg0.field3435[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class756 var13 = arg0.field3435[var9] = new class756();
                            var13.field10467 = 1;
                            var13.field10473 = 0;
                            var13.field10468 = var8;
                            var13.field10470 = 0;
                            var13.field10471 = var6;
                            var13.field10469 = 0;
                            if (!arg0.field3363) {
                                class60.method520(0, (byte) -128, arg0, var10);
                            }
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        if (arg3 != -19557) {
            field4184 = null;
        }
        field4178++;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V")
    public static final void method2003(String arg0, String arg1, byte arg2) {
        class268.field3168 = 1;
        if (arg2 >= -91) {
            method2003(null, null, (byte) -100);
        }
        class506.field7198 = -1;
        field4181++;
        class571.method3312(arg1, false, false, arg0, -127);
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(I)V")
    public class338(int arg0) {
        this.field4185 = arg0;
    }
}
