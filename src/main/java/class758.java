import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class758 {

    @OriginalMember(owner = "client!pea", name = "i", descriptor = "F")
    public float field11139 = 0.25F;

    @OriginalMember(owner = "client!pea", name = "l", descriptor = "F")
    public float field11144 = 1.0F;

    @OriginalMember(owner = "client!pea", name = "n", descriptor = "F")
    public float field11146 = 1.0F;

    @OriginalMember(owner = "client!pea", name = "s", descriptor = "I")
    public int field11138;

    @OriginalMember(owner = "client!pea", name = "t", descriptor = "I")
    public int field11132;

    @OriginalMember(owner = "client!pea", name = "q", descriptor = "I")
    public int field11147;

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "F")
    public float field11130;

    @OriginalMember(owner = "client!pea", name = "h", descriptor = "I")
    public int field11141;

    @OriginalMember(owner = "client!pea", name = "j", descriptor = "I")
    public int field11143;

    @OriginalMember(owner = "client!pea", name = "g", descriptor = "F")
    public float field11134;

    @OriginalMember(owner = "client!pea", name = "k", descriptor = "I")
    public int field11135;

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "F")
    public float field11133;

    @OriginalMember(owner = "client!pea", name = "e", descriptor = "Llia;")
    public class505 field11140;

    @OriginalMember(owner = "client!pea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11149 = new String[] { method5481(method5480("`&\u0005g4")), method5481(method5480("kmJgurfB=w3")), method5481(method5480("u}G%")), method5481(method5480("kmJg\f3")), method5481(method5480("kmJg\u000b3")), method5481(method5480("kmJg\b3")), method5481(method5480("kmJg\r3")), method5481(method5480("kmJg\n3")) };

    @OriginalMember(owner = "client!pea", name = "p", descriptor = "Lhl;")
    public static class556 field11142 = new class556(105, -1);

    @OriginalMember(owner = "client!pea", name = "m", descriptor = "I")
    public static int field11145 = class349.method2911(115, 1600);

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "Z")
    public static boolean field11148 = false;

    @OriginalMember(owner = "client!pea", name = "r", descriptor = "I")
    public static int field11129;

    @OriginalMember(owner = "client!pea", name = "d", descriptor = "I")
    public static int field11131;

    @OriginalMember(owner = "client!pea", name = "f", descriptor = "I")
    public static int field11136;

    @OriginalMember(owner = "client!pea", name = "o", descriptor = "I")
    public static int field11137;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(II)V", line = 5)
    public static final void method5475(int arg0, int arg1) {
        try {
            field11129++;
            class420.field6638 = arg1;
            class29 var2 = class12.field137;
            synchronized (class12.field137) {
                class12.field137.method304(arg0 ^ 0xFFFFFFC5);
            }
            class29 var3 = class223.field3499;
            synchronized (class223.field3499) {
                class223.field3499.method304(1);
                if (arg0 != -60) {
                    method5475(-77, 32);
                }
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field11149[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "([BB)[B", line = 23)
    public static final byte[] method5476(byte[] arg0, byte arg1) {
        try {
            field11136++;
            int var2 = arg0.length;
            byte[] var3 = new byte[var2];
            class405.method3259(arg0, 0, var3, 0, var2);
            if (arg1 >= -65) {
                method5476(null, (byte) -6);
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field11149[3] + (arg0 == null ? field11149[2] : field11149[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(B)V", line = 50)
    public static void method5477(byte arg0) {
        try {
            field11142 = null;
            if (arg0 != -12) {
                method5476(null, (byte) -124);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11149[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pea", name = "<init>", descriptor = "()V", line = 105)
    public class758() {
        try {
            this.field11138 = -60;
            this.field11132 = -50;
            this.field11147 = class762.field11191;
            this.field11130 = 1.2F;
            this.field11141 = -50;
            this.field11143 = class100.field1460;
            this.field11134 = 0.69921875F;
            this.field11135 = 0;
            this.field11133 = 1.1523438F;
            this.field11140 = class628.field9042;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11149[1] + ')');
        }
    }

    @OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Lwq;)V", line = 124)
    public class758(class176 arg0) {
        try {
            int var2 = arg0.method1645((byte) -120);
            if (class623.field8996.field6400.method4643(true) == 1 && class617.field8910.method177() > 0) {
                if ((var2 & 0x1) == 0) {
                    this.field11147 = class762.field11191;
                } else {
                    this.field11147 = arg0.method1622(-18712);
                }
                if ((var2 & 0x2) == 0) {
                    this.field11133 = 1.1523438F;
                } else {
                    this.field11133 = (float) arg0.method1687((byte) -84) / 256.0F;
                }
                if ((var2 & 0x4) == 0) {
                    this.field11134 = 0.69921875F;
                } else {
                    this.field11134 = (float) arg0.method1687((byte) -48) / 256.0F;
                }
                if ((var2 & 0x8) == 0) {
                    this.field11130 = 1.2F;
                } else {
                    this.field11130 = (float) arg0.method1687((byte) -71) / 256.0F;
                }
            } else {
                if ((var2 & 0x1) != 0) {
                    arg0.method1622(-18712);
                }
                if ((var2 & 0x2) != 0) {
                    arg0.method1687((byte) -94);
                }
                if ((var2 & 0x4) != 0) {
                    arg0.method1687((byte) -81);
                }
                if ((var2 & 0x8) != 0) {
                    arg0.method1687((byte) -101);
                }
                this.field11134 = 0.69921875F;
                this.field11147 = class762.field11191;
                this.field11130 = 1.2F;
                this.field11133 = 1.1523438F;
            }
            if ((var2 & 0x10) == 0) {
                this.field11141 = -50;
                this.field11132 = -50;
                this.field11138 = -60;
            } else {
                this.field11141 = arg0.method1657(78);
                this.field11138 = arg0.method1657(76);
                this.field11132 = arg0.method1657(93);
            }
            if ((var2 & 0x20) == 0) {
                this.field11143 = class100.field1460;
            } else {
                this.field11143 = arg0.method1622(-18712);
            }
            if ((var2 & 0x40) == 0) {
                this.field11135 = 0;
            } else {
                this.field11135 = arg0.method1687((byte) -107);
            }
            if ((var2 & 0x80) == 0) {
                this.field11140 = class628.field9042;
            } else {
                int var3 = arg0.method1687((byte) -70);
                int var4 = arg0.method1687((byte) -58);
                int var5 = arg0.method1687((byte) -114);
                int var6 = arg0.method1687((byte) -126);
                int var7 = arg0.method1687((byte) -91);
                int var8 = arg0.method1687((byte) -39);
                this.field11140 = class236.method2044(120, var3, var4, var5, var6, var8, var7);
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field11149[1] + (arg0 == null ? field11149[2] : field11149[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(BLpea;)Z", line = 64)
    public final boolean method5478(byte arg0, class758 arg1) {
        try {
            int var3 = 10 / ((arg0 - 35) / 33);
            field11131++;
            return this.field11147 == arg1.field11147 && this.field11133 == arg1.field11133 && this.field11134 == arg1.field11134 && this.field11130 == arg1.field11130 && this.field11139 == arg1.field11139 && this.field11146 == arg1.field11146 && this.field11144 == arg1.field11144 && this.field11143 == arg1.field11143 && this.field11135 == arg1.field11135 && this.field11140 == arg1.field11140;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field11149[7] + arg0 + ',' + (arg1 == null ? field11149[2] : field11149[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lwq;B)V", line = 84)
    public final void method5479(class176 arg0, byte arg1) {
        try {
            if (arg1 == -22) {
                this.field11146 = (float) (arg0.method1645((byte) -83) * 8) / 255.0F;
                field11137++;
                this.field11139 = (float) (arg0.method1645((byte) -116) * 8) / 255.0F;
                this.field11144 = (float) (arg0.method1645((byte) -112) * 8) / 255.0F;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field11149[5] + (arg0 == null ? field11149[2] : field11149[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5480(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x49);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5481(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 27;
                    break;
                case 1:
                    var10005 = 8;
                    break;
                case 2:
                    var10005 = 43;
                    break;
                case 3:
                    var10005 = 73;
                    break;
                default:
                    var10005 = 73;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
