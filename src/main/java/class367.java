import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class367 extends class578 {

    @OriginalMember(owner = "client!ufa", name = "o", descriptor = "[B")
    public byte[] field5326;

    @OriginalMember(owner = "client!ufa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5333 = new String[] { method2922(method2921("G)\u0018m")), method2922(method2921("RrZ/x")), method2922(method2921("\\:\u0015/G\u0001")), method2922(method2921("\\:\u0015/9@2\u001du;\u0001")), method2922(method2921("Z9\u0000ulG;\u0007<")), method2922(method2921("J3\u001bjlL4\u001brq")), method2922(method2921("\u0012|9`}\u0004\u001d\u0013d8")), method2922(method2921("M3\u0017thL2\u0000/fF3\u001fh`\u0014~")), method2922(method2921("\u0012|1yu@.\u0011r8")), method2922(method2921("J3\u001bjlL,\u0006dc@$")), method2922(method2921("\u0012|1yu@.\u0011r8}4\u0001-%\u0019mYKdGqE82\u0019|D1?\u0019lN15\t\u001b9U>\t\u0011\u0015y(h;\u0011<5")), method2922(method2921("\u0012|\u0002dwZ5\u001bo8\u0018gTqd]4I.>\t8\u001bld@2I")), method2922(method2921("\\:\u0015/F\u0001")), method2922(method2921("\\:\u0015/D\u0001")), method2922(method2921("\\:\u0015/C\u0001")), method2922(method2921("\\:\u0015/A\u0001")), method2922(method2921("\\:\u0015/@\u0001")) };

    @OriginalMember(owner = "client!ufa", name = "l", descriptor = "Lmv;")
    public static class125 field5330 = new class125(92, -1);

    @OriginalMember(owner = "client!ufa", name = "j", descriptor = "I")
    public static int field5332 = 0;

    @OriginalMember(owner = "client!ufa", name = "k", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!ufa", name = "p", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!ufa", name = "m", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!ufa", name = "n", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!ufa", name = "i", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 3)
    public static final void method2915(String arg0, int arg1) {
        try {
            class269.field3808 = arg0;
            field5328++;
            if (class290.field4091 != null) {
                try {
                    String var2 = class290.field4091.getParameter(field5333[9]);
                    if (arg1 != 3) {
                        method2919(-37, 8, 106);
                    }
                    String var3 = class290.field4091.getParameter(field5333[5]);
                    String var4 = var2 + field5333[4] + arg0 + field5333[11] + var3;
                    String var5;
                    if (arg0.length() == 0) {
                        var5 = var4 + field5333[10];
                    } else {
                        var5 = var4 + field5333[8] + class355.method2840(7, class614.method4531(arg1 - 20) + 94608000000L) + field5333[6] + 94608000L;
                    }
                    class192.method1600(true, field5333[7] + var5 + "\"", class290.field4091);
                } catch (Throwable var7) {
                }
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field5333[12] + (arg0 == null ? field5333[0] : field5333[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)V", line = 36)
    public static final void method2916(byte arg0) {
        try {
            if (arg0 > -62) {
                field5332 = -37;
            }
            class451.field6614 = false;
            field5331++;
            class591.method4369(0);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5333[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(III)V", line = 50)
    public static final void method2917(int arg0, int arg1, int arg2) {
        try {
            if (arg1 != 1) {
                field5330 = null;
            }
            field5329++;
            if (class544.field7978 == class316.field4323) {
                if (!class50.method548(0, -2, false, 1, arg0, arg2, 0, -31017, 1)) {
                    class50.method548(0, -3, false, 1, arg0, arg2, 0, arg1 - 31018, 1);
                }
            } else if (!class50.method548(0, -3, false, 1, arg0, arg2, 0, -31017, 1)) {
                class50.method548(0, -2, false, 1, arg0, arg2, 0, -31017, 1);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5333[14] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Ljc;B)V", line = 77)
    public static final void method2918(class711 arg0, byte arg1) {
        try {
            field5327++;
            int var2 = arg0.method5090(-122);
            class293.field4124 = new class108[var2];
            for (int var3 = 0; var3 < var2; var3++) {
                class293.field4124[var3] = new class108();
                class293.field4124[var3].field1415 = arg0.method5090(-73);
                class293.field4124[var3].field1418 = arg0.method5096((byte) 108);
            }
            class391.field5713 = arg0.method5090(-55);
            class631.field8968 = arg0.method5090(-57);
            class353.field5119 = arg0.method5090(-54);
            class336.field4870 = new class728[class631.field8968 + 1 - class391.field5713];
            for (int var4 = 0; var4 < class353.field5119; var4++) {
                int var5 = arg0.method5090(-91);
                class728 var6 = class336.field4870[var5] = new class728();
                var6.field4974 = arg0.method5128(0);
                var6.field4965 = arg0.method5113(18443);
                var6.field10431 = class391.field5713 + var5;
                var6.field10435 = arg0.method5096((byte) 67);
                var6.field10437 = arg0.method5096((byte) 81);
            }
            class612.field8761 = arg0.method5113(18443);
            class485.field7119 = true;
            int var7 = -90 / ((-arg1 - 40) / 46);
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field5333[2] + (arg0 == null ? field5333[0] : field5333[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "([B)V", line = 124)
    public class367(byte[] arg0) {
        try {
            this.field5326 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5333[3] + (arg0 == null ? field5333[0] : field5333[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(III)V", line = 137)
    public static final void method2919(int arg0, int arg1, int arg2) {
        try {
            field5325++;
            if (class534.field7736 < class534.field7740) {
                class534.field7736 = (float) ((double) class534.field7736 / 30.0D + (double) class534.field7736);
                if (class534.field7736 > class534.field7740) {
                    class534.field7736 = class534.field7740;
                }
                class308.method2457(true);
                class534.field7734 = (int) class534.field7736 >> 1;
                class534.field7731 = class302.method2415((byte) -105, class534.field7734);
            } else if (class534.field7740 < class534.field7736) {
                class534.field7736 = (float) ((double) class534.field7736 - (double) class534.field7736 / 30.0D);
                if (class534.field7736 < class534.field7740) {
                    class534.field7736 = class534.field7740;
                }
                class308.method2457(true);
                class534.field7734 = (int) class534.field7736 >> 1;
                class534.field7731 = class302.method2415((byte) -105, class534.field7734);
            }
            if (arg1 == -17591) {
                if (class573.field8301 != -1 && class801.field11652 != -1) {
                    int var3 = class573.field8301 - class601.field8605;
                    if (var3 < 2 || var3 > 2) {
                        var3 /= 8;
                    }
                    int var4 = class801.field11652 - class30.field383;
                    class601.field8605 += var3;
                    if (var4 < 2 || var4 > 2) {
                        var4 /= 8;
                    }
                    if (var3 == 0 && var4 == 0) {
                        class573.field8301 = -1;
                        class801.field11652 = -1;
                    }
                    class30.field383 += var4;
                    class308.method2457(true);
                }
                if (class147.field1894 > 0) {
                    class426.field6140--;
                    if (class426.field6140 == 0) {
                        class147.field1894--;
                        class426.field6140 = 100;
                    }
                } else {
                    class230.field3330 = -1;
                    class570.field8272 = -1;
                }
                if (class61.field934 && class304.field4238 != null) {
                    for (class478 var5 = (class478) class304.field4238.method3977((byte) -83); var5 != null; var5 = (class478) class304.field4238.method3987(0)) {
                        class475 var6 = class534.field7725.method2508(var5.field7052.field5108, false);
                        if (var5.method3705(arg2, arg0, 118)) {
                            if (var6.field7006 != null) {
                                if (var6.field7006[4] != null) {
                                    class751.method5441(-1, var6.field6964, var6.field7003, -1, (long) var5.field7052.field5108, true, var6.field7006[4], -1, false, 0, false, 1010, (long) var5.field7052.field5108);
                                }
                                if (var6.field7006[3] != null) {
                                    class751.method5441(-1, var6.field6964, var6.field7003, -1, (long) var5.field7052.field5108, true, var6.field7006[3], -1, false, 0, false, 1001, (long) var5.field7052.field5108);
                                }
                                if (var6.field7006[2] != null) {
                                    class751.method5441(-1, var6.field6964, var6.field7003, arg1 + 17590, (long) var5.field7052.field5108, true, var6.field7006[2], -1, false, 0, false, 1004, (long) var5.field7052.field5108);
                                }
                                if (var6.field7006[1] != null) {
                                    class751.method5441(-1, var6.field6964, var6.field7003, -1, (long) var5.field7052.field5108, true, var6.field7006[1], -1, false, 0, false, 1011, (long) var5.field7052.field5108);
                                }
                                if (var6.field7006[0] != null) {
                                    class751.method5441(-1, var6.field6964, var6.field7003, -1, (long) var5.field7052.field5108, true, var6.field7006[0], -1, false, 0, false, 1012, (long) var5.field7052.field5108);
                                }
                            }
                            if (!var5.field7052.field5111) {
                                var5.field7052.field5111 = true;
                                class158.method1337(class493.field7248, var5.field7052.field5108, var6.field7003);
                            }
                            if (var5.field7052.field5111) {
                                class158.method1337(class667.field9416, var5.field7052.field5108, var6.field7003);
                            }
                        } else if (var5.field7052.field5111) {
                            var5.field7052.field5111 = false;
                            class158.method1337(class467.field6814, var5.field7052.field5108, var6.field7003);
                        }
                    }
                }
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field5333[16] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "(B)V", line = 277)
    public static void method2920(byte arg0) {
        try {
            if (arg0 > 13) {
                field5330 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5333[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ufa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2921(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ufa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2922(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 41;
                    break;
                case 1:
                    var10005 = 92;
                    break;
                case 2:
                    var10005 = 116;
                    break;
                case 3:
                    var10005 = 1;
                    break;
                default:
                    var10005 = 5;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
