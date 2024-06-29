import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aha")
public class class459 {

    @OriginalMember(owner = "client!aha", name = "k", descriptor = "I")
    private int field6678 = -1;

    @OriginalMember(owner = "client!aha", name = "g", descriptor = "I")
    public int field6679 = -1;

    @OriginalMember(owner = "client!aha", name = "i", descriptor = "I")
    private int field6689 = -1;

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "I")
    public int field6675 = 0;

    @OriginalMember(owner = "client!aha", name = "u", descriptor = "I")
    public int field6694 = 70;

    @OriginalMember(owner = "client!aha", name = "l", descriptor = "I")
    public int field6693 = 0;

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "I")
    public int field6698 = -1;

    @OriginalMember(owner = "client!aha", name = "n", descriptor = "I")
    private int field6697 = -1;

    @OriginalMember(owner = "client!aha", name = "x", descriptor = "Ljava/lang/String;")
    private String field6700 = "";

    @OriginalMember(owner = "client!aha", name = "s", descriptor = "I")
    private int field6701 = -1;

    @OriginalMember(owner = "client!aha", name = "p", descriptor = "I")
    public int field6702 = 0;

    @OriginalMember(owner = "client!aha", name = "m", descriptor = "I")
    public int field6685 = 16777215;

    @OriginalMember(owner = "client!aha", name = "d", descriptor = "I")
    public int field6684 = -1;

    @OriginalMember(owner = "client!aha", name = "D", descriptor = "[Ljava/lang/String;")
    private static final String[] field6704 = new String[] { method3538(method3537("wA")), method3538(method3537("3\u0018\u001e#6z")), method3538(method3537(")^Q#\u0001")), method3538(method3537("<\u0005\u0013a")), method3538(method3537("3\u0018\u001e#?z")), method3538(method3537("3\u0018\u001e#:z")), method3538(method3537("3\u0018\u001e#7z")), method3538(method3537("3\u0018\u001e#0z")), method3538(method3537("3\u0018\u001e#=z")), method3538(method3537("3\u0018\u001e#>z")), method3538(method3537("3\u0018\u001e#5z")), method3538(method3537("3\u0018\u001e#8z")), method3538(method3537("3\u0018\u001e#4z")), method3538(method3537("3\u0018\u001e#9z")), method3538(method3537("3\u0018\u001e#;z")) };

    @OriginalMember(owner = "client!aha", name = "t", descriptor = "Z")
    public static boolean field6683 = false;

    @OriginalMember(owner = "client!aha", name = "C", descriptor = "I")
    public static int field6696 = 0;

    @OriginalMember(owner = "client!aha", name = "B", descriptor = "I")
    public static int field6676 = 16777215;

    @OriginalMember(owner = "client!aha", name = "q", descriptor = "Lsb;")
    public static class261 field6688 = new class261(111, 6);

    @OriginalMember(owner = "client!aha", name = "w", descriptor = "I")
    public static int field6677;

    @OriginalMember(owner = "client!aha", name = "r", descriptor = "I")
    public static int field6680;

    @OriginalMember(owner = "client!aha", name = "f", descriptor = "I")
    public static int field6681;

    @OriginalMember(owner = "client!aha", name = "y", descriptor = "I")
    public static int field6682;

    @OriginalMember(owner = "client!aha", name = "e", descriptor = "I")
    public static int field6686;

    @OriginalMember(owner = "client!aha", name = "h", descriptor = "I")
    public static int field6687;

    @OriginalMember(owner = "client!aha", name = "A", descriptor = "I")
    public static int field6690;

    @OriginalMember(owner = "client!aha", name = "v", descriptor = "I")
    public static int field6692;

    @OriginalMember(owner = "client!aha", name = "j", descriptor = "I")
    public static int field6695;

    @OriginalMember(owner = "client!aha", name = "z", descriptor = "I")
    public static int field6699;

    @OriginalMember(owner = "client!aha", name = "c", descriptor = "I")
    public static int field6703;

    @OriginalMember(owner = "client!aha", name = "o", descriptor = "Lrg;")
    public class167 field6691;

    @OriginalMember(owner = "client!aha", name = "c", descriptor = "(BLha;)Ltb;", line = 3)
    public final class392 method3525(byte arg0, class18 arg1) {
        try {
            field6681++;
            if (arg0 >= -19) {
                return null;
            } else if (this.field6689 < 0) {
                return null;
            } else {
                class392 var3 = (class392) this.field6691.field2137.method2053(0, (long) this.field6689);
                if (var3 == null) {
                    this.method3535((byte) -75, arg1);
                    var3 = (class392) this.field6691.field2137.method2053(0, (long) this.field6689);
                }
                return var3;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6704[4] + arg0 + ',' + (arg1 == null ? field6704[3] : field6704[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(II)Ljava/lang/String;", line = 29)
    public final String method3526(int arg0, int arg1) {
        try {
            field6703++;
            String var3 = this.field6700;
            if (arg1 != -2) {
                return null;
            }
            while (true) {
                int var4 = var3.indexOf(field6704[0]);
                if (var4 < 0) {
                    return var3;
                }
                var3 = var3.substring(0, var4) + class499.method3827(false, arg0, (byte) -94) + var3.substring(var4 + 2);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field6704[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(BLha;)Ltb;", line = 53)
    public final class392 method3527(byte arg0, class18 arg1) {
        try {
            field6686++;
            if (arg0 != 105) {
                this.field6679 = -128;
            }
            if (this.field6678 < 0) {
                return null;
            }
            class392 var3 = (class392) this.field6691.field2137.method2053(0, (long) this.field6678);
            if (var3 == null) {
                this.method3535((byte) -37, arg1);
                var3 = (class392) this.field6691.field2137.method2053(0, (long) this.field6678);
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6704[14] + arg0 + ',' + (arg1 == null ? field6704[3] : field6704[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Ljc;I)V", line = 76)
    public final void method3528(class711 arg0, int arg1) {
        try {
            field6687++;
            if (arg1 >= -93) {
                this.field6694 = -99;
            }
            while (true) {
                int var3 = arg0.method5128(0);
                if (var3 == 0) {
                    return;
                }
                this.method3531(var3, arg0, (byte) -110);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6704[6] + (arg0 == null ? field6704[3] : field6704[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(III)Z", line = 99)
    public static final boolean method3529(int arg0, int arg1, int arg2) {
        try {
            field6690++;
            if (arg2 != -8707) {
                method3534(26);
            }
            return class506.method3866(arg0, arg1, -12) & class128.method1132(arg0, 34, arg1);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6704[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lha;Z)Ltb;", line = 110)
    public final class392 method3530(class18 arg0, boolean arg1) {
        try {
            field6677++;
            if (this.field6697 < 0) {
                return null;
            }
            if (arg1) {
                this.field6693 = -29;
            }
            class392 var3 = (class392) this.field6691.field2137.method2053(0, (long) this.field6697);
            if (var3 == null) {
                this.method3535((byte) -111, arg0);
                var3 = (class392) this.field6691.field2137.method2053(0, (long) this.field6697);
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6704[12] + (arg0 == null ? field6704[3] : field6704[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(ILjc;B)V", line = 134)
    private final void method3531(int arg0, class711 arg1, byte arg2) {
        try {
            if (arg2 >= -53) {
                this.method3531(119, null, (byte) -55);
            }
            field6680++;
            if (arg0 == 1) {
                this.field6698 = arg1.method5116((byte) -123);
            } else if (arg0 == 2) {
                this.field6685 = arg1.method5085(true);
            } else if (arg0 == 3) {
                this.field6689 = arg1.method5116((byte) -120);
            } else if (arg0 == 4) {
                this.field6678 = arg1.method5116((byte) -126);
            } else if (arg0 == 5) {
                this.field6697 = arg1.method5116((byte) -128);
            } else if (arg0 == 6) {
                this.field6701 = arg1.method5116((byte) -127);
            } else if (arg0 == 7) {
                this.field6675 = arg1.method5087((byte) -26);
            } else if (arg0 == 8) {
                this.field6700 = arg1.method5096((byte) 61);
            } else if (arg0 == 9) {
                this.field6694 = arg1.method5116((byte) -105);
            } else if (arg0 == 10) {
                this.field6693 = arg1.method5087((byte) -26);
            } else if (arg0 == 11) {
                this.field6684 = 0;
            } else if (arg0 == 12) {
                this.field6679 = arg1.method5128(0);
            } else if (arg0 == 13) {
                this.field6702 = arg1.method5087((byte) -26);
            } else if (arg0 == 14) {
                this.field6684 = arg1.method5116((byte) -110);
                return;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6704[7] + arg0 + ',' + (arg1 == null ? field6704[3] : field6704[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lha;B)Ltb;", line = 218)
    public final class392 method3532(class18 arg0, byte arg1) {
        try {
            field6682++;
            if (this.field6701 < 0) {
                return null;
            }
            if (arg1 < 58) {
                this.method3525((byte) 54, null);
            }
            class392 var3 = (class392) this.field6691.field2137.method2053(0, (long) this.field6701);
            if (var3 == null) {
                this.method3535((byte) -85, arg0);
                var3 = (class392) this.field6691.field2137.method2053(0, (long) this.field6701);
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6704[5] + (arg0 == null ? field6704[3] : field6704[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V", line = 240)
    public static final void method3533(String arg0, byte arg1, String arg2, String arg3, int arg4, String arg5, int arg6) {
        try {
            if (arg1 != 55) {
                method3536((byte) -10, 24);
            }
            class405.method3173(arg2, arg6, arg3, arg5, (byte) -119, null, arg0, -1, arg4);
            field6692++;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field6704[13] + (arg0 == null ? field6704[3] : field6704[2]) + ',' + arg1 + ',' + (arg2 == null ? field6704[3] : field6704[2]) + ',' + (arg3 == null ? field6704[3] : field6704[2]) + ',' + arg4 + ',' + (arg5 == null ? field6704[3] : field6704[2]) + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(I)V", line = 268)
    public static void method3534(int arg0) {
        try {
            if (arg0 != 0) {
                field6688 = null;
            }
            field6688 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6704[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "(BLha;)V", line = 298)
    private final void method3535(byte arg0, class18 arg1) {
        try {
            field6699++;
            class47 var3 = this.field6691.field2139;
            if (this.field6689 >= 0 && this.field6691.field2137.method2053(0, (long) this.field6689) == null && var3.method530(false, this.field6689)) {
                class66 var4 = class66.method701(var3, this.field6689);
                this.field6691.field2137.method2051((long) this.field6689, arg1.method231(var4, true), 93);
            }
            if (arg0 <= -35) {
                if (this.field6697 >= 0 && this.field6691.field2137.method2053(0, (long) this.field6697) == null && var3.method530(false, this.field6697)) {
                    class66 var5 = class66.method701(var3, this.field6697);
                    this.field6691.field2137.method2051((long) this.field6697, arg1.method231(var5, true), 93);
                }
                if (this.field6678 >= 0 && this.field6691.field2137.method2053(0, (long) this.field6678) == null && var3.method530(false, this.field6678)) {
                    class66 var6 = class66.method701(var3, this.field6678);
                    this.field6691.field2137.method2051((long) this.field6678, arg1.method231(var6, true), 93);
                }
                if (this.field6701 >= 0 && this.field6691.field2137.method2053(0, (long) this.field6701) == null && var3.method530(false, this.field6701)) {
                    class66 var7 = class66.method701(var3, this.field6701);
                    this.field6691.field2137.method2051((long) this.field6701, arg1.method231(var7, true), 93);
                }
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field6704[8] + arg0 + ',' + (arg1 == null ? field6704[3] : field6704[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(BI)V", line = 358)
    public static final void method3536(byte arg0, int arg1) {
        try {
            class390.field5687 = arg1;
            if (arg0 > -123) {
                field6676 = 40;
            }
            field6695++;
            class207.field3023.method2043(false);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6704[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3537(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3538(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 82;
                    break;
                case 1:
                    var10005 = 112;
                    break;
                case 2:
                    var10005 = 127;
                    break;
                case 3:
                    var10005 = 13;
                    break;
                default:
                    var10005 = 124;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
