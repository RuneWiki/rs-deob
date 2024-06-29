import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class393 implements class540 {

    @OriginalMember(owner = "client!om", name = "q", descriptor = "I")
    public int field5416;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    public int field5409;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    public int field5407;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    public int field5410;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "Lti;")
    public class463 field5411;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public int field5400;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "I")
    public int field5414;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public int field5408;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public int field5406;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public int field5403;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "Ljava/lang/String;")
    public String field5418;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "I")
    public int field5415;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "Lin;")
    public class97 field5412;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "[I")
    public static int[] field5401 = new int[5];

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "Lmda;")
    public static class276 field5405;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
    public static final void method2430(byte arg0) {
        class23.field381 = -1;
        class571.field8060 = null;
        field5417++;
        class763.field10520 = -1;
        class784.field10773 = null;
        class633.field8891 = -1;
        class537.field7719 = null;
        class9.field90 = -1;
        class757.field10437 = null;
        class641.field8975 = null;
        class523.field7393 = null;
        class416.field5706 = null;
        class266.field3875.method2451((byte) 127);
        if (arg0 != -94) {
            method2432((byte) -108);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IZI)V")
    public static final void method2431(int arg0, boolean arg1, int arg2) {
        field5404++;
        class313 var3 = class312.method1998((long) arg0 << 32 | (long) arg2, 18, -1);
        if (arg1) {
            field5405 = null;
        }
        var3.method2006(117);
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V")
    public static void method2432(byte arg0) {
        field5405 = null;
        if (arg0 != 64) {
            method2432((byte) -58);
        }
        field5401 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILfb;[I[I[I)V")
    public static final void method2433(int arg0, class702 arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var5 = 0; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg4[var5];
            int var8 = arg2[var5];
            for (int var9 = 0; var7 != 0 && arg1.field4608.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field4608[var9] = null;
                    } else {
                        class607 var10 = class563.field7993.method651(var6, (byte) 96);
                        int var11 = var10.field8501;
                        class220 var12 = arg1.field4608[var9];
                        if (var12 != null) {
                            if (var12.field3412 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field4608[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3411 = 0;
                                    var12.field3407 = 0;
                                    var12.field3408 = 0;
                                    var12.field3415 = 1;
                                    var12.field3410 = var8;
                                    if (!arg1.field4577) {
                                        class760.method4227(255, arg1, var10, 0);
                                    }
                                } else if (var11 == 2) {
                                    var12.field3407 = 0;
                                }
                            } else if (var10.field8514 >= class563.field7993.method651(var12.field3412, (byte) 108).field8514) {
                                var12 = arg1.field4608[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class220 var13 = arg1.field4608[var9] = new class220();
                            var13.field3410 = var8;
                            var13.field3415 = 1;
                            var13.field3412 = var6;
                            var13.field3408 = 0;
                            var13.field3407 = 0;
                            var13.field3411 = 0;
                            if (!arg1.field4577) {
                                class760.method4227(255, arg1, var10, 0);
                            }
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        if (arg0 != 9433) {
            field5401 = null;
        }
        field5402++;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Ljava/lang/String;Lin;Lti;IIIIIIIIII)V")
    public class393(String arg0, class97 arg1, class463 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field5416 = arg8;
        this.field5409 = arg3;
        this.field5407 = arg5;
        this.field5410 = arg6;
        this.field5411 = arg2;
        this.field5400 = arg11;
        this.field5414 = arg9;
        this.field5408 = arg4;
        this.field5406 = arg7;
        this.field5403 = arg10;
        this.field5418 = arg0;
        this.field5415 = arg12;
        this.field5412 = arg1;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)Lsaa;")
    public final class345 method1656(int arg0) {
        field5413++;
        return arg0 == 0 ? class384.field5287 : null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lje;)V")
    public static final void method2434(class421 arg0) {
        if (arg0 == null) {
            return;
        }
        for (int var1 = 0; var1 < 2; var1++) {
            class421 var2 = null;
            for (class421 var3 = class745.field10328[var1]; var3 != null; var3 = var3.field5747) {
                if (arg0 == var3) {
                    if (var2 == null) {
                        class745.field10328[var1] = var3.field5747;
                    } else {
                        var2.field5747 = var3.field5747;
                    }
                    class98.field1115 = true;
                    return;
                }
                var2 = var3;
            }
            class421 var4 = null;
            for (class421 var5 = class338.field4733[var1]; var5 != null; var5 = var5.field5747) {
                if (arg0 == var5) {
                    if (var4 == null) {
                        class338.field4733[var1] = var5.field5747;
                    } else {
                        var4.field5747 = var5.field5747;
                    }
                    class98.field1115 = true;
                    return;
                }
                var4 = var5;
            }
            class421 var6 = null;
            for (class421 var7 = class695.field9711[var1]; var7 != null; var7 = var7.field5747) {
                if (arg0 == var7) {
                    if (var6 == null) {
                        class695.field9711[var1] = var7.field5747;
                    } else {
                        var6.field5747 = var7.field5747;
                    }
                    class98.field1115 = true;
                    return;
                }
                var6 = var7;
            }
        }
    }
}
