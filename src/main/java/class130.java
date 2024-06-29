import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class130 {

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "[Lcf;")
    public class196[] field1615 = null;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Ljca;")
    public class542 field1618 = null;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "Ljca;")
    public class542 field1627 = null;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "[Lcf;")
    private class196[] field1617 = null;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "Ljj;")
    private class334 field1626;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "Z")
    public boolean field1621;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1628 = new String[] { method1147(method1146("{7vo:")), method1147(method1146("\u007f&4F")), method1147(method1146("j}v\u0004o")), method1147(method1146("{7v\u0016{\u007f:,\u0014:")), method1147(method1146("{7vh:")), method1147(method1146("{7vi:")), method1147(method1146("{7vn:")), method1147(method1146("{7vk:")) };

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Lmq;")
    public static class657 field1614 = new class657();

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "[[I")
    public static int[][] field1616 = new int[6][];

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field1619 = 0;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "Llga;")
    public static class47 field1620;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "[I")
    public static int[] field1625;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V", line = 7)
    public static void method1141(boolean arg0) {
        try {
            if (arg0) {
                field1625 = null;
            }
            field1620 = null;
            field1616 = null;
            field1614 = null;
            field1625 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1628[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Ljj;)V", line = 102)
    public class130(class334 arg0) {
        try {
            this.field1626 = arg0;
            this.field1621 = this.field1626.field4780;
            if (this.field1621 && !this.field1626.method2079(class518.field7566, class496.field7281, true)) {
                this.field1621 = false;
            }
            if (this.field1621 || this.field1626.method2082(-27964, class496.field7281, class518.field7566)) {
                class674.method4838(-5482);
                if (this.field1621) {
                    byte[] var6 = class706.method5064(false, 112, class7.field88);
                    this.field1618 = this.field1626.method2093(128, class518.field7566, 128, 3282, 16, var6);
                    byte[] var7 = class706.method5064(false, -65, class23.field271);
                    this.field1626.method2093(128, class518.field7566, 128, 3282, 16, var7);
                } else {
                    this.field1615 = new class196[16];
                    for (int var2 = 0; var2 < 16; var2++) {
                        byte[] var3 = class611.method4514(-127, 32768, var2 * 128 * 256, class7.field88);
                        this.field1615[var2] = this.field1626.method2675(128, true, var3, class518.field7566, (byte) -113, 128);
                    }
                    this.field1617 = new class196[16];
                    for (int var4 = 0; var4 < 16; var4++) {
                        byte[] var5 = class611.method4514(-87, 32768, var4 * 2 * 16384, class23.field271);
                        this.field1617[var4] = this.field1626.method2675(128, true, var5, class518.field7566, (byte) -81, 128);
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field1628[3] + (arg0 == null ? field1628[1] : field1628[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)Z", line = 35)
    public final boolean method1142(byte arg0) {
        try {
            if (arg0 >= -95) {
                method1141(false);
            }
            field1613++;
            if (this.field1621) {
                return this.field1618 != null;
            } else {
                return this.field1615 != null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1628[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)I", line = 67)
    public static final int method1143(int arg0, int arg1, int arg2, int arg3) {
        try {
            field1624++;
            int var4 = 66 % ((-arg1 - 45) / 63);
            int var5 = 255 - arg2;
            int var8 = ((arg3 & 0xFF00FF) * arg2 & 0xFF00FF00 | (arg3 & 0xFF00) * arg2 & 0xFF0000) >>> 8;
            return (((arg0 & 0xFF00) * var5 & 0xFF0000 | (arg0 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8) + var8;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field1628[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(CBI)I", line = 84)
    public static final int method1144(char arg0, byte arg1, int arg2) {
        try {
            if (arg1 >= -78) {
                return 112;
            }
            field1622++;
            int var3 = arg0 << 4;
            if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
                char var6 = Character.toLowerCase(arg0);
                var3 = (var6 << 4) + 1;
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1628[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)Z", line = 158)
    public final boolean method1145(int arg0) {
        try {
            field1623++;
            if (arg0 != 0) {
                this.field1627 = null;
            }
            if (this.field1627 == null) {
                if (class696.field9754 == null) {
                    byte[] var2 = class123.method1105(0.5F, new class619(419684), true, 16.0F, 128, 16, 8, 4.0F, 128, 4.0F, 0.6F);
                    class696.field9754 = class663.method4794(var2, (byte) -57, false);
                }
                byte[] var3 = class706.method5064(false, -17, class696.field9754);
                byte[] var4 = new byte[var3.length * 4];
                int var5 = 0;
                for (int var6 = 0; var6 < 16; var6++) {
                    int var7 = var6 * 128 * 128;
                    int var8 = var7;
                    for (int var9 = 0; var9 < 128; var9++) {
                        int var10 = var9 * 128 + var8;
                        int var11 = (var9 - 1 & 0x7F) * 128 + var8;
                        int var12 = (var9 + 1 & 0x7F) * 128 + var8;
                        for (int var13 = 0; var13 < 128; var13++) {
                            float var14 = (float) ((var3[var11 + var13] & 0xFF) - (var3[var12 + var13] & 0xFF));
                            float var15 = (float) ((var3[(var13 - 1 & 0x7F) + var10] & 0xFF) - (var3[(var13 + 1 & 0x7F) + var10] & 0xFF));
                            float var16 = (float) (128.0D / Math.sqrt((double) (var14 * var14 + var15 * var15 + 16384.0F)));
                            var4[var5++] = (byte) ((int) (var15 * var16 + 127.0F));
                            var4[var5++] = (byte) ((int) (var16 * 128.0F + 127.0F));
                            var4[var5++] = (byte) ((int) (var14 * var16 + 127.0F));
                            var4[var5++] = var3[var7++];
                        }
                    }
                }
                this.field1627 = this.field1626.method2093(128, class385.field5635, 128, 3282, 16, var4);
            }
            return this.field1627 != null;
        } catch (RuntimeException var18) {
            throw class665.method4799(var18, field1628[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1146(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x12);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1147(char[] arg0) {
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
                    var10005 = 83;
                    break;
                case 2:
                    var10005 = 88;
                    break;
                case 3:
                    var10005 = 42;
                    break;
                default:
                    var10005 = 18;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
