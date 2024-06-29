import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public abstract class class712 {

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "Lrl;")
    public class232 field9945;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "Lcn;")
    public static class308 field9952 = new class308();

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    public static int field9954 = -1;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "Lgp;")
    public static class553 field9955 = new class553("stellardawn", 1);

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "Lcda;")
    public static class115 field9956 = new class115(0, 0);

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field9941;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field9942;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field9943;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field9944;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field9946;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field9947;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field9948;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public static int field9949;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public static int field9950;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
    public static int field9951;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    public static int field9953;

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "Lcia;")
    public static class490 field9957;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
    public void method392(byte arg0) {
        if (arg0 < -92) {
            field9949++;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IILhba;)V")
    public abstract void method391(int arg0, int arg1, class190 arg2);

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BZ)V")
    public abstract void method394(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)V")
    public void method604(boolean arg0) {
        if (!arg0) {
            field9955 = null;
        }
        field9941++;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)V")
    public static final void method4004(byte arg0) {
        for (int var1 = 0; var1 < class12.field108; var1++) {
            class396 var3 = class669.field9235[var1];
            boolean var4 = false;
            if (var3.field5688 == null) {
                var3.field5699--;
                if (var3.field5699 < (var3.method2471(-7431) ? -1500 : -10)) {
                    var4 = true;
                } else {
                    if (var3.field5690 == 1 && var3.field5695 == null) {
                        var3.field5695 = class448.method2730(class648.field8694, var3.field5694, 0);
                        if (var3.field5695 == null) {
                            continue;
                        }
                        var3.field5699 += var3.field5695.method2728();
                    } else if (var3.method2471(-7431) && (var3.field5687 == null || var3.field5691 == null)) {
                        if (var3.field5687 == null) {
                            var3.field5687 = class187.method1167(class425.field5962, var3.field5694);
                        }
                        if (var3.field5687 == null) {
                            continue;
                        }
                        if (var3.field5691 == null) {
                            var3.field5691 = var3.field5687.method1177(new int[] { 22050 });
                            if (var3.field5691 == null) {
                                continue;
                            }
                        }
                    }
                    if (var3.field5699 < 0) {
                        int var5 = 8192;
                        int var7;
                        if (var3.field5698 == 0) {
                            var7 = var3.field5686 * (var3.field5690 == 3 ? class332.field4707.field4795.method1140(0) : class332.field4707.field4782.method1140(0)) >> 2;
                        } else {
                            int var6 = var3.field5698 >> 24 & 0x3;
                            if (class388.field5601.field4408 == var6) {
                                int var8 = var3.field5698 & 0xFF << 9;
                                int var9 = class388.field5601.method662((byte) 15) << 8;
                                int var10 = var3.field5698 >> 16 & 0xFF;
                                int var11 = (var10 << 9) + (256 - (class388.field5601.field4410 - var9));
                                int var12 = var3.field5698 >> 8 & 0xFF;
                                int var13 = (var12 << 9) + var9 + 256 - class388.field5601.field4418;
                                int var14 = Math.abs(var11) + (Math.abs(var13) - 512);
                                if (var14 > var8) {
                                    var3.field5699 = -99999;
                                    continue;
                                }
                                if (var14 < 0) {
                                    var14 = 0;
                                }
                                var7 = (var8 - var14) * class332.field4707.field4797.method1140(0) * var3.field5686 / var8 >> 2;
                                if (var3.field5697 != null && var3.field5697 instanceof class395) {
                                    class395 var15 = (class395) var3.field5697;
                                    short var16 = var15.field5680;
                                    short var17 = var15.field5673;
                                }
                                if (var11 != 0 || var13 != 0) {
                                    int var18 = -class230.field3118 - ((int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D)) - 4096 & 0x3FFF;
                                    if (var18 > 8192) {
                                        var18 = 16384 - var18;
                                    }
                                    int var19;
                                    if (var14 <= 0) {
                                        var19 = 8192;
                                    } else if (var14 >= 4096) {
                                        var19 = 16384;
                                    } else {
                                        var19 = ((8192 - var14) / 4096) + 8192;
                                    }
                                    var5 = var18 * var19 / 8192 + (16384 - var19 >> 1);
                                }
                            } else {
                                var7 = 0;
                            }
                        }
                        if (var7 > 0) {
                            class695 var20 = null;
                            if (var3.field5690 == 1) {
                                var20 = var3.field5695.method2731().method3927(class746.field10250);
                            } else if (var3.method2471(-7431)) {
                                var20 = var3.field5691;
                            }
                            class760 var21 = var3.field5688 = class760.method4212(var20, var3.field5700, var7, var5);
                            var21.method4242(var3.field5696 - 1);
                            class483.field6739.method359(var21);
                        }
                    }
                }
            } else if (!var3.field5688.method550(false)) {
                var4 = true;
            }
            if (var4) {
                class12.field108--;
                for (int var22 = var1; var22 < class12.field108; var22++) {
                    class669.field9235[var22] = class669.field9235[var22 + 1];
                }
                var1--;
            }
        }
        if (arg0 < 95) {
            field9952 = null;
        }
        field9942++;
        if (class350.field4966 && !class77.method571(-1)) {
            if (class332.field4707.field4766.method1140(0) != 0 && class61.field883 != -1) {
                if (class627.field8436 == null) {
                    class720.method4033(false, 0, class332.field4707.field4766.method1140(0), class477.field6645, class61.field883, false);
                } else {
                    class530.method3147(0, class61.field883, (byte) 45, class477.field6645, class332.field4707.field4766.method1140(0), false, class627.field8436);
                }
            }
            class627.field8436 = null;
            class350.field4966 = false;
        } else if (class332.field4707.field4766.method1140(0) != 0 && class61.field883 != -1 && !class77.method571(-1)) {
            class450.field6242++;
            class583 var2 = class54.method400(class213.field2800, (byte) -60, class472.field6542);
            var2.field7963.method473(-122, class61.field883);
            class463.method2838(var2, (byte) 124);
            class61.field883 = -1;
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(Z)V")
    public abstract void method389(boolean arg0);

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lrl;)V")
    public class712(class232 arg0) {
        this.field9945 = arg0;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
    public void method397(int arg0) {
        if (arg0 != -1) {
            field9956 = null;
        }
        field9943++;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(Z)V")
    public void method390(boolean arg0) {
        field9948++;
        if (arg0) {
            this.field9945 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)V")
    public static final void method4005(int arg0, int arg1, int arg2) {
        field9950++;
        class346 var3 = class299.method1976(0, arg0, arg1);
        var3.method2209(255);
        var3.field4926 = arg2;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(III)V")
    public abstract void method393(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(Z)Z")
    public abstract boolean method396(boolean arg0);

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZIZIB)I")
    public static final int method4006(boolean arg0, int arg1, boolean arg2, int arg3, byte arg4) {
        field9951++;
        class169 var5 = class170.method1090(arg0, (byte) -94, arg3);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5.field2352.length; var7++) {
            if (var5.field2352[var7] >= 0 && class291.field4179.field2993 > var5.field2352[var7]) {
                class671 var9 = class291.field4179.method1313(var5.field2352[var7], true);
                int var10 = var9.method3783(0, class360.field5161.method2279(-86, arg1).field8689, arg1);
                if (arg2) {
                    var6 += var5.field2355[var7] * var10;
                } else {
                    var6 += var10;
                }
            }
        }
        int var8 = 69 / ((arg4 + 65) / 40);
        return var6;
    }

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "(Z)V")
    public void method395(boolean arg0) {
        field9944++;
        if (arg0) {
            field9956 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method4007(String arg0, int arg1) {
        if (arg1 != 4927) {
            method4005(92, 32, 56);
        }
        field9947++;
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZB)V")
    public abstract void method399(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(B)[I")
    public static final int[] method4008(byte arg0) {
        if (arg0 >= -105) {
            method4006(false, 43, true, 17, (byte) 26);
        }
        field9953++;
        return new int[] { class261.field3774, class486.field6799, class453.field6276 };
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V")
    public void method398(int arg0) {
        if (arg0 != 10700) {
            field9956 = null;
        }
        field9946++;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V")
    public static void method4009(int arg0) {
        field9952 = null;
        field9956 = null;
        field9955 = null;
        field9957 = null;
        if (arg0 != 1) {
            method4009(-9);
        }
    }
}
