import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class195 {

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "[Ljava/lang/String;")
    public String[] field3079 = new String[5];

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public int field3084 = -1;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
    public int field3099 = -1;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    private int field3080 = -1;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "Z")
    public boolean field3083 = true;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "I")
    private int field3100 = -1;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "I")
    public int field3104 = -1;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public int field3093 = 0;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    private int field3085 = -1;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "Z")
    public boolean field3098 = true;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public int field3095 = -1;

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "I")
    private int field3111 = -1;

    @OriginalMember(owner = "client!ed", name = "J", descriptor = "Z")
    public boolean field3110 = false;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    private int field3087 = -1;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "Z")
    public boolean field3090 = true;

    @OriginalMember(owner = "client!ed", name = "I", descriptor = "I")
    public static int field3109 = 0;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public int field3075;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    private int field3076;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    private int field3081;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    private int field3089;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    private int field3092;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public int field3096;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
    public int field3097;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "I")
    public int field3102;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "I")
    public int field3106;

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
    public int field3112;

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "Ljava/lang/String;")
    public String field3088;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "Ljava/lang/String;")
    public String field3091;

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "[I")
    public int[] field3107;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static final void method1349(int arg0) {
        field3113++;
        if ((class13.field174 > class13.field172)) {
            class13.field172 = (float) ((double) class13.field172 / 30.0D + (double) class13.field172);
            if (class13.field172 > class13.field174) {
                class13.field172 = class13.field174;
            }
            class162.method1073(-128);
        } else if (class13.field174 < class13.field172) {
            class13.field172 = (float) ((double) class13.field172 - (double) class13.field172 / 30.0D);
            if (class13.field172 < class13.field174) {
                class13.field172 = class13.field174;
            }
            class162.method1073(arg0 ^ 0xFFFFD370);
        }
        if (class184.field2862 != -1 && class120.field1849 != -1) {
            int var1 = class184.field2862 - class187.field2897;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            class187.field2897 += var1;
            int var2 = class120.field1849 - class44.field606;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            if (var1 == 0 && var2 == 0) {
                class120.field1849 = -1;
                class184.field2862 = -1;
            }
            class44.field606 -= -var2;
            class162.method1073(arg0 ^ 0x2C8A);
        }
        if (arg0 != 11505) {
            return;
        }
        if (class237.field3752 <= 0) {
            class208.field3326 = -1;
            class203.field3279 = -1;
        } else {
            class273.field4482--;
            if (class273.field4482 == 0) {
                class273.field4482 = 100;
                class237.field3752--;
            }
        }
        if (!class64.field959 || class194.field3071 == null) {
            return;
        }
        for (class85 var3 = (class85) class194.field3071.method1959(arg0 ^ 0x2C3C); var3 != null; var3 = (class85) class194.field3071.method1956(arg0 - 11418)) {
            class195 var4 = class192.method1334(false, var3.field1339.field5051);
            if (class242.field3837 == 0 && var3.method568(class1.field1, -12751, class60.field924)) {
                if (!var3.field1339.field5059) {
                    var3.field1339.field5059 = true;
                    class273.method1887(true, var3.field1339.field5051, 15, var4.field3099);
                }
                if (var3.field1339.field5059) {
                    class273.method1887(true, var3.field1339.field5051, 17, var4.field3099);
                }
            } else if (var3.field1339.field5059) {
                var3.field1339.field5059 = false;
                class273.method1887(true, var3.field1339.field5051, 16, var4.field3099);
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lma;B)V")
    public final void method1350(class202 arg0, byte arg1) {
        field3086++;
        while (true) {
            int var3 = arg0.method1420((byte) 0);
            if (var3 == 0) {
                if (arg1 == -74) {
                    return;
                } else {
                    this.field3097 = 124;
                    return;
                }
            }
            this.method1351(arg0, var3, (byte) 50);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lma;IB)V")
    private final void method1351(class202 arg0, int arg1, byte arg2) {
        field3114++;
        if (arg1 == 1) {
            this.field3104 = arg0.method1419(111);
        } else if (arg1 == 2) {
            this.field3084 = arg0.method1419(85);
        } else if (arg1 == 3) {
            this.field3088 = arg0.method1403(-124);
        } else if (arg1 == 4) {
            this.field3075 = arg0.method1401((byte) -86);
        } else if (arg1 == 5) {
            this.field3095 = arg0.method1401((byte) -112);
        } else if (arg1 == 6) {
            this.field3093 = arg0.method1420((byte) 0);
        } else if (arg1 == 7) {
            int var6 = arg0.method1420((byte) 0);
            if ((var6 & 0x2) == 2) {
                this.field3110 = true;
            }
            if ((var6 & 0x1) == 0) {
                this.field3098 = false;
            }
        } else if (arg1 == 8) {
            this.field3090 = arg0.method1420((byte) 0) == 1;
        } else if (arg1 == 9) {
            this.field3111 = arg0.method1419(69);
            if (this.field3111 == 65535) {
                this.field3111 = -1;
            }
            this.field3087 = arg0.method1419(121);
            if (this.field3087 == 65535) {
                this.field3087 = -1;
            }
            this.field3076 = arg0.method1440(20404);
            this.field3092 = arg0.method1440(20404);
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3079[arg1 - 10] = arg0.method1403(-128);
        } else if (arg1 == 15) {
            int var4 = arg0.method1420((byte) 0);
            this.field3107 = new int[var4 * 2];
            for (int var5 = 0; var5 < (var4 * 2); var5++) {
                this.field3107[var5] = arg0.method1442(-1970239824);
            }
            this.field3112 = arg0.method1440(20404);
            this.field3106 = arg0.method1440(20404);
        } else if (arg1 == 16) {
            this.field3083 = false;
        } else if (arg1 == 17) {
            this.field3091 = arg0.method1403(-125);
        } else if (arg1 == 18) {
            this.field3080 = arg0.method1419(109);
        } else if (arg1 == 19) {
            this.field3099 = arg0.method1419(98);
        } else if (arg1 == 20) {
            this.field3100 = arg0.method1419(99);
            if (this.field3100 == 65535) {
                this.field3100 = -1;
            }
            this.field3085 = arg0.method1419(116);
            if (this.field3085 == 65535) {
                this.field3085 = -1;
            }
            this.field3081 = arg0.method1440(20404);
            this.field3089 = arg0.method1440(20404);
        } else if (arg1 == 21) {
            this.field3097 = arg0.method1440(20404);
        } else if (arg1 == 22) {
            this.field3102 = arg0.method1440(20404);
        }
        if (arg2 <= 7) {
            this.field3104 = 9;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)Lti;")
    public final class5 method1352(byte arg0) {
        field3101++;
        int var2 = -62 % ((arg0 + 70) / 37);
        class5 var3 = (class5) class219.field3502.method149((byte) -50, (long) (this.field3080 | 0x20000));
        if (var3 != null) {
            return var3;
        }
        class273.field4496.method1874(this.field3080, 3883);
        class5 var4 = class131.method875(class273.field4496, this.field3080, 3, 0);
        if (var4 != null) {
            var4.field1674 = 0;
            var4.field1682 = var4.field1672;
            var4.field1677 = 0;
            var4.field1680 = var4.field1681;
            class219.field3502.method152(var4, (long) (this.field3080 | 0x20000), true);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z[B)[B")
    public static final byte[] method1353(boolean arg0, byte[] arg1) {
        field3077++;
        class202 var2 = new class202(arg1);
        if (arg0) {
            field3109 = 124;
        }
        int var3 = var2.method1420((byte) 0);
        int var4 = var2.method1440(20404);
        if (var4 < 0 || class96.field1424 != 0 && class96.field1424 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method1418(var4, (byte) -115, 0, var5);
            return var5;
        } else {
            int var6 = var2.method1440(20404);
            if (var6 < 0 || !(class96.field1424 == 0 || class96.field1424 >= var6)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class26.method161(var7, var6, arg1, var4, 9);
            } else {
                class85.field1337.method104(var7, var2, (byte) 122);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)Z")
    public final boolean method1354(boolean arg0) {
        field3094++;
        if (!arg0) {
            return true;
        } else if (this.field3087 == -1 && this.field3111 == -1) {
            return true;
        } else {
            boolean var2 = false;
            int var3;
            if (this.field3087 == -1) {
                var3 = class201.method1393(false, this.field3111);
            } else {
                var3 = class209.field3356[this.field3087];
            }
            if (var3 < this.field3076 || var3 > this.field3092) {
                return false;
            } else if (this.field3085 == -1 && this.field3100 == -1) {
                return true;
            } else {
                boolean var4 = false;
                int var5;
                if (this.field3085 == -1) {
                    var5 = class201.method1393(false, this.field3100);
                } else {
                    var5 = class209.field3356[this.field3085];
                }
                return this.field3081 <= var5 && this.field3089 >= var5;
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
    public static final void method1355(int arg0) {
        if (arg0 != 0) {
            method1358(-11, true);
        }
        class60.field923.method145(-87);
        field3105++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIBLkk;)V")
    public static final void method1356(int arg0, int arg1, byte arg2, class254 arg3) {
        field3108++;
        if (class18.field251 < 2 && class29.field367 == 0 && !class70.field1017) {
            return;
        }
        String var4 = class248.method1730(arg2 - 15);
        if (arg2 != 17) {
            method1358(70, false);
        }
        if (arg3 == null) {
            int var5 = class202.field3227.method738(var4, arg0 + 4, arg1 + 15, 16777215, 0, class294.field4829, class192.field3046);
            class208.method1473(arg0 + 4, (byte) 8, 15, arg1, var5 + class202.field3227.method736(var4));
            return;
        }
        class116 var6 = arg3.method1752((byte) 112, class126.field1958);
        if (var6 == null) {
            var6 = class202.field3227;
        }
        var6.method741(var4, arg0, arg1, arg3.field4085, arg3.field4152, arg3.field4075, arg3.field4135, arg3.field4170, arg3.field4094, class294.field4829, class192.field3046, class227.field3595);
        class208.method1473(class227.field3595[0], (byte) 83, class227.field3595[3], class227.field3595[1], class227.field3595[2]);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZIZ)Ljj;")
    public final class110 method1357(boolean arg0, int arg1, boolean arg2) {
        int var4 = arg2 ? this.field3084 : this.field3104;
        class110 var5 = (class110) class219.field3502.method149((byte) -103, (long) (var4 | (arg2 ? 65536 : 0)));
        field3082++;
        if (var5 != null) {
            return var5;
        } else if (class273.field4496.method1874(var4, 3883)) {
            class5 var6 = class131.method875(class273.field4496, var4, 3, arg1);
            if (var6 != null) {
                var6.field1677 = 0;
                var6.field1674 = 0;
                var6.field1680 = var6.field1681;
                var6.field1682 = var6.field1672;
                class219.field3502.method152(var6, (long) ((arg2 ? 65536 : 0) | var4), true);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZ)Lug;")
    public static final class215 method1358(int arg0, boolean arg1) {
        class215 var2 = (class215) class97.field1437.method149((byte) -79, (long) arg0);
        field3103++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class292.field4824.method1877(arg0, 4, (byte) 122);
        class215 var4 = new class215();
        if (var3 != null) {
            var4.method1504((byte) 42, new class202(var3), arg0);
        }
        class97.field1437.method152(var4, (long) arg0, arg1);
        return var4;
    }
}
