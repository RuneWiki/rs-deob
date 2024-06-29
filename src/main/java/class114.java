import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class114 {

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "Lffa;")
    private class197 field1354;

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "I")
    public int field1351;

    @OriginalMember(owner = "client!jt", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1359 = new String[] { method1010(method1009("{\u0004\u0000\u000e\u001f")), method1010(method1009("\u007f\u0005B#")), method1010(method1009("j^\u0000aJ")), method1010(method1009("{\u0004\u0000s^\u007f\u0019Zq\u001f")), method1010(method1009("{\u0004\u0000)^\u007f\u0011B&MtX")), method1010(method1009("{\u0004\u0000\r\u001f")), method1010(method1009("{\u0004\u0000\u000b\u001f")) };

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field1355 = new Rectangle[100];

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
    public static int field1356 = 0;

    @OriginalMember(owner = "client!jt", name = "i", descriptor = "Lrt;")
    public static class239 field1352 = new class239();

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!jt", name = "h", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!jt", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() throws Throwable {
        try {
            this.field1354.method1725(-87, this.field1351);
            field1353++;
            super.finalize();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1359[4] + ')');
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)I", line = 16)
    public static final int method1005(int arg0, int arg1) {
        return class614.field8972 == null ? 0 : class614.field8972[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V", line = 21)
    public static void method1006(int arg0) {
        try {
            if (arg0 == 7501) {
                field1352 = null;
                field1355 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1359[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)I", line = 32)
    public static final int method1007(byte arg0) {
        try {
            field1350++;
            if (class69.field740 == null) {
                if (!class216.field3297 && class513.field7366 != null) {
                    return class513.field7366.field6147;
                }
                int var1 = class606.field8875.method401(16428);
                int var2 = class606.field8875.method391((byte) 94);
                if (class514.field7425) {
                    if (var1 > class476.field6905 && (class476.field6905 + class371.field5655) > var1) {
                        int var17 = -1;
                        for (int var18 = 0; var18 < class184.field2547; var18++) {
                            if (class369.field5631) {
                                int var19 = var18 * 16 + class668.field9704 + 33;
                                if (var19 - 13 < var2 && var2 <= (var19 + 3)) {
                                    var17 = var18;
                                }
                            } else {
                                int var20 = var18 * 16 + class668.field9704 + 31;
                                if ((var20 - 13) < var2 && var2 <= var20 + 3) {
                                    var17 = var18;
                                }
                            }
                        }
                        if (var17 != -1) {
                            int var21 = 0;
                            class774 var22 = new class774(class492.field7058);
                            for (class655 var23 = (class655) var22.method5610(1517); var23 != null; var23 = (class655) var22.method5608(-22019)) {
                                if (var17 == (var21++)) {
                                    return ((class417) var23.field9457.field7916.field529).field6147;
                                }
                            }
                        }
                    } else if (class381.field5783 != null && class348.field5390 < var1 && var1 < (class348.field5390 + class662.field9570)) {
                        int var10 = -1;
                        for (int var11 = 0; var11 < class381.field5783.field9459; var11++) {
                            if (class369.field5631) {
                                int var12 = var11 * 16 + class80.field903 + 33;
                                if (var12 - 13 < var2 && var2 <= var12 + 3) {
                                    var10 = var11;
                                }
                            } else {
                                int var13 = var11 * 16 + class80.field903 + 31;
                                if ((var13 - 13) < var2 && var2 <= (var13 + 3)) {
                                    var10 = var11;
                                }
                            }
                        }
                        if (var10 != -1) {
                            int var14 = 0;
                            class774 var15 = new class774(class381.field5783.field9457);
                            for (class417 var16 = (class417) var15.method5610(1517); var16 != null; var16 = (class417) var15.method5608(-22019)) {
                                if (var10 == var14++) {
                                    return var16.field6147;
                                }
                            }
                        }
                    }
                } else if (class476.field6905 < var1 && (class476.field6905 + class371.field5655) > var1) {
                    int var3 = -1;
                    for (int var4 = 0; var4 < class593.field8707; var4++) {
                        if (class369.field5631) {
                            int var6 = class668.field9704 + ((class593.field8707 - 1 + -var4) * 16) + 33;
                            if ((var6 - 13) < var2 && var2 <= (var6 + 3)) {
                                var3 = var4;
                            }
                        } else {
                            int var5 = (class593.field8707 - var4 - 1) * 16 + class668.field9704 + 31;
                            if (var2 > var5 - 13 && var5 + 3 >= var2) {
                                var3 = var4;
                            }
                        }
                    }
                    if (var3 != -1) {
                        int var7 = 0;
                        class293 var8 = new class293(class728.field10549);
                        for (class417 var9 = (class417) var8.method2397(-125); var9 != null; var9 = (class417) var8.method2400((byte) 56)) {
                            if (var3 == (var7++)) {
                                return var9.field6147;
                            }
                        }
                    }
                }
            }
            int var24 = -7 / ((-arg0 - 55) / 58);
            return -1;
        } catch (RuntimeException var26) {
            throw class759.method5498(var26, field1359[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lffa;II)V", line = 225)
    public class114(class197 arg0, int arg1, int arg2) {
        try {
            this.field1354 = arg0;
            this.field1351 = arg2;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1359[3] + (arg0 == null ? field1359[1] : field1359[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lha;II)Lfs;", line = 248)
    public static final class581 method1008(class66 arg0, int arg1, int arg2) {
        try {
            if (arg1 != -3) {
                field1357 = -46;
            }
            field1358++;
            class753 var3 = (class753) class195.field2615.method977((long) arg2, 1);
            if (var3 != null) {
                class686 var4 = var3.field10955.method925(-121);
                var3.field10954 = true;
                if (var4 != null) {
                    return var4.method5033(arg0, (byte) -48);
                }
            }
            return null;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field1359[5] + (arg0 == null ? field1359[1] : field1359[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1009(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x37);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1010(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 17;
                    break;
                case 1:
                    var10005 = 112;
                    break;
                case 2:
                    var10005 = 46;
                    break;
                case 3:
                    var10005 = 79;
                    break;
                default:
                    var10005 = 55;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
