import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class31 extends class332 {

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "Ljava/lang/String;")
    public String field388;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Lan;")
    public static class337 field385 = new class337();

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "Ltb;")
    public static class234 field389 = null;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "Ljava/lang/String;")
    public static String field391 = "green:";

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "Z")
    public static boolean field395 = false;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIII)V", line = 10)
    public static final void method187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field392++;
        if (class285.method2039(arg2, -32660)) {
            client.method1948(class175.field2535[arg2], arg3, arg6, arg1, arg4, arg7, arg5, arg0);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 23)
    public static final int method188(String arg0, int arg1) {
        int var2 = arg0.length();
        int var3 = arg1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + class139.method924((byte) -126, arg0.charAt(var4)) - var3;
        }
        field393++;
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V", line = 40)
    public class31() {
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILjava/util/Random;)I", line = 54)
    public static final int method189(int arg0, int arg1, Random arg2) {
        field387++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class30.method182(10876, arg0)) {
            return (int) ((long) arg0 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            int var5 = 53 % ((arg1 + 25) / 46);
            return class48.method284((byte) -124, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 84)
    public class31(String arg0) {
        this.field388 = arg0;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V", line = 99)
    public static void method190(byte arg0) {
        field385 = null;
        field391 = null;
        field389 = null;
        int var1 = 55 / ((20 - arg0) / 34);
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V", line = 110)
    public static final void method191(int arg0) {
        field386++;
        if (!class250.field3787 || class188.field2710) {
            return;
        }
        if (arg0 != -1) {
            method187(75, -32, 44, 92, -56, 117, 110, -96);
        }
        class225[][][] var1 = class158.field2184;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class225[][] var3 = var1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class225 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field3209 != null && var6.field3209.field1935 instanceof class108) {
                            class108 var7 = (class108) var6.field3209.field1935;
                            if ((var6.field3209.field1937 & Long.MIN_VALUE) == 0L) {
                                var7.method732(false, true, true, true, false, true, true);
                            } else {
                                var7.method732(true, true, true, true, true, true, true);
                            }
                        }
                        if (var6.field3213 != null) {
                            if (var6.field3213.field662 instanceof class108) {
                                class108 var8 = (class108) var6.field3213.field662;
                                if ((Long.MIN_VALUE & var6.field3213.field656) == 0L) {
                                    var8.method732(false, true, true, true, false, true, true);
                                } else {
                                    var8.method732(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field3213.field669 instanceof class108) {
                                class108 var9 = (class108) var6.field3213.field669;
                                if ((Long.MIN_VALUE & var6.field3213.field656) == 0L) {
                                    var9.method732(false, true, true, true, false, true, true);
                                } else {
                                    var9.method732(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        if (var6.field3196 != null) {
                            if (var6.field3196.field2335 instanceof class108) {
                                class108 var10 = (class108) var6.field3196.field2335;
                                if ((var6.field3196.field2339 & Long.MIN_VALUE) == 0L) {
                                    var10.method732(false, true, true, true, false, true, true);
                                } else {
                                    var10.method732(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field3196.field2331 instanceof class108) {
                                class108 var11 = (class108) var6.field3196.field2331;
                                if ((Long.MIN_VALUE & var6.field3196.field2339) == 0L) {
                                    var11.method732(false, true, true, true, false, true, true);
                                } else {
                                    var11.method732(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        for (int var12 = 0; var12 < var6.field3214; var12++) {
                            if (var6.field3199[var12].field1024 instanceof class108) {
                                class108 var13 = (class108) var6.field3199[var12].field1024;
                                if ((Long.MIN_VALUE & var6.field3199[var12].field1026) == 0L) {
                                    var13.method732(false, true, true, true, false, true, true);
                                } else {
                                    var13.method732(true, true, true, true, true, true, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        class188.field2710 = true;
    }
}
