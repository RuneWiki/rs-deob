import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class428 {

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
    private int field5979 = 1;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
    private int field5983 = 1;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
    private int field5982 = 0;

    @OriginalMember(owner = "client!vn", name = "v", descriptor = "I")
    private int field5993 = 0;

    @OriginalMember(owner = "client!vn", name = "s", descriptor = "Lmba;")
    private class646 field5990 = new class646();

    @OriginalMember(owner = "client!vn", name = "z", descriptor = "I")
    private int field5997 = 0;

    @OriginalMember(owner = "client!vn", name = "B", descriptor = "Z")
    private boolean field5999 = true;

    @OriginalMember(owner = "client!vn", name = "C", descriptor = "[Lfba;")
    private class350[] field6000 = new class350[2];

    @OriginalMember(owner = "client!vn", name = "x", descriptor = "Z")
    private boolean field5995 = false;

    @OriginalMember(owner = "client!vn", name = "I", descriptor = "I")
    private int field6005 = -1;

    @OriginalMember(owner = "client!vn", name = "y", descriptor = "Z")
    private boolean field5996 = true;

    @OriginalMember(owner = "client!vn", name = "J", descriptor = "Z")
    private boolean field6006 = true;

    @OriginalMember(owner = "client!vn", name = "D", descriptor = "Z")
    private boolean field6001 = true;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "Ldw;")
    private class664 field5981;

    @OriginalMember(owner = "client!vn", name = "w", descriptor = "Leba;")
    private class665 field5994;

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "Leba;")
    private class665 field5988;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "Leba;")
    private class665 field5972;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    public static int field5973 = 0;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field5974;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field5975;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public static int field5976;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    public static int field5977;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
    public static int field5980;

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
    public static int field5985;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "I")
    public static int field5987;

    @OriginalMember(owner = "client!vn", name = "r", descriptor = "I")
    public static int field5989;

    @OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
    public static int field5991;

    @OriginalMember(owner = "client!vn", name = "u", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!vn", name = "E", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!vn", name = "F", descriptor = "Lfba;")
    private class350 field6003;

    @OriginalMember(owner = "client!vn", name = "A", descriptor = "Lbca;")
    private class473 field5998;

    @OriginalMember(owner = "client!vn", name = "G", descriptor = "Lbca;")
    private class473 field6004;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "Z")
    private boolean field5978;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIII)I", line = 3)
    public static final int method2648(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 1) {
            field5984 = 28;
        }
        field5992++;
        int var4 = 255 - arg0;
        int var5 = ((arg1 & 0xFF00FF) * arg0 & 0xFF00FF00 | (arg1 & 0xFF00) * arg0 & 0xFF0000) >>> 8;
        return (((arg3 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg3 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V", line = 18)
    public final void method2649(int arg0) {
        this.field5988 = this.field5972 = this.field5994 = null;
        this.field6003 = null;
        this.field6004 = null;
        if (arg0 != 0) {
            return;
        }
        field6002++;
        this.field5998 = null;
        this.field6000 = null;
        if (!this.field5990.method3616((byte) 96)) {
            for (class71 var2 = this.field5990.method3618(115); var2 != this.field5990.field8670; var2 = var2.field1077) {
                ((class224) var2).method1325(arg0 ^ 0x2591);
            }
        }
        this.field5983 = this.field5979 = 1;
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V", line = 53)
    public final void method2650(int arg0) {
        field5977++;
        if (!this.field5978) {
            return;
        }
        if (this.field5972 != null) {
            this.field5981.method3690(false, this.field5972);
            int var2 = 16384;
            this.field5981.method3733(77, this.field5994);
            this.field5972.method3756(0, true);
            this.field5994.method3761(0, -1);
            if (this.field5995) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field5983, this.field5979, 0, 0, this.field5983, this.field5979, var2, 9728);
            this.field5981.method3710(-27124, this.field5972);
            this.field5981.method3751(75, this.field5994);
        }
        this.field5981.method3712(0);
        this.field5981.method3737(arg0 - 8306, 0);
        this.field5981.method3720(-26014, 1);
        this.field5981.method1437();
        if (arg0 != 8306) {
            this.method2658(81);
        }
        int var3 = 0;
        int var4 = 1;
        class224 var6;
        for (class224 var5 = (class224) this.field5990.method3618(arg0 - 8369); var5 != null; var5 = var6) {
            var6 = (class224) this.field5990.method3619(arg0 - 8306);
            int var7 = var5.method1322((byte) -65);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method1332(this.field6000[var3], var8, this.field6003, -19460);
                if (var6 == null && var7 - 1 == var8) {
                    this.field5981.method3694(this.field5994, (byte) -127);
                    this.field5981.method3723((byte) -88, 0, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field5979);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field5993, this.field5982);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field5993, this.field5982 + this.field5979);
                    OpenGL.glTexCoord2f((float) this.field5983, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field5993 + this.field5983, this.field5982 + this.field5979);
                    OpenGL.glTexCoord2f((float) this.field5983, (float) this.field5979);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field5993 + this.field5983, this.field5982);
                    OpenGL.glEnd();
                } else {
                    this.field5994.method3761(var4, -1);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field5979);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, this.field5979);
                    OpenGL.glTexCoord2f((float) this.field5983, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field5983, this.field5979);
                    OpenGL.glTexCoord2f((float) this.field5983, (float) this.field5979);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field5983, 0);
                    OpenGL.glEnd();
                }
                var5.method1330(var8, 115);
                var4 = var4 + 1 & 0x1;
                var3 = var3 + 1 & 0x1;
            }
        }
        this.field5978 = false;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lno;Lno;I)V", line = 159)
    public static final void method2651(class71 arg0, class71 arg1, int arg2) {
        if (arg1.field1075 != null) {
            arg1.method549(6410);
        }
        field5985++;
        arg1.field1075 = arg0.field1075;
        arg1.field1077 = arg0;
        if (arg2 == -6059) {
            arg1.field1075.field1077 = arg1;
            arg1.field1077.field1075 = arg1;
        }
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Ldw;)V", line = 653)
    public class428(class664 arg0) {
        this.field5981 = arg0;
        if (this.field5981.field9108 && this.field5981.field9057) {
            this.field5988 = this.field5994 = new class665(this.field5981);
            if (this.field5981.field8998 > 1 && this.field5981.field9154 && this.field5981.field9060) {
                this.field5988 = this.field5972 = new class665(this.field5981);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILqu;)V", line = 192)
    public final void method2652(int arg0, class224 arg1) {
        arg1.field3021 = false;
        field5991++;
        if (arg0 != 0) {
            this.method2657(79, (byte) 11, 124, -19, -86);
        }
        arg1.method1325(9617);
        arg1.method549(6410);
        this.method2658(122);
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)Z", line = 208)
    private final boolean method2653(int arg0) {
        field5986++;
        if (this.field6001) {
            if (this.field5998 != null) {
                this.field5998.method2869((byte) -31);
                this.field5998 = null;
            }
            if (this.field6003 != null) {
                this.field6003.method3288(-107);
                this.field6003 = null;
            }
            if (this.field5972 != null) {
                this.field5998 = new class473(this.field5981, 6402, this.field5983, this.field5979, this.field5981.field8998);
            }
            if (this.field5995) {
                this.field6003 = new class350(this.field5981, 34037, 6402, this.field5983, this.field5979);
            } else if (this.field5998 == null) {
                this.field5998 = new class473(this.field5981, 6402, this.field5983, this.field5979);
            }
            this.field6001 = false;
            this.field5999 = true;
            this.field5996 = true;
        }
        if (this.field6006) {
            if (this.field6004 != null) {
                this.field6004.method2869((byte) 127);
                this.field6004 = null;
            }
            if (this.field6000[0] != null) {
                this.field6000[0].method3288(-102);
                this.field6000[0] = null;
            }
            if (this.field6000[1] != null) {
                this.field6000[1].method3288(-83);
                this.field6000[1] = null;
            }
            if (this.field5972 != null) {
                this.field6004 = new class473(this.field5981, this.field6005, this.field5983, this.field5979, this.field5981.field8998);
            }
            this.field6000[0] = new class350(this.field5981, 34037, this.field6005, this.field5983, this.field5979);
            this.field6000[1] = this.field5997 <= 1 ? null : new class350(this.field5981, 34037, this.field6005, this.field5983, this.field5979);
            this.field6006 = false;
            this.field5999 = true;
            this.field5996 = true;
        }
        if (this.field5996) {
            if (this.field5972 == null) {
                this.field5981.method3695(this.field5994, -17015);
                this.field5994.method3757(0, false);
                this.field5994.method3757(1, false);
                this.field5994.method3757(8, false);
                this.field5994.method3765(0, (byte) -80, this.field6000[0]);
                if (this.field5997 > 1) {
                    this.field5994.method3765(1, (byte) -80, this.field6000[1]);
                }
                if (this.field5995) {
                    this.field5994.method3765(8, (byte) -120, this.field6003);
                } else {
                    this.field5994.method3754(77, this.field5998, 8);
                }
                this.field5981.method3694(this.field5994, (byte) -126);
            } else {
                this.field5981.method3695(this.field5994, -17015);
                this.field5994.method3757(0, false);
                this.field5994.method3757(1, false);
                this.field5994.method3757(8, false);
                this.field5994.method3765(0, (byte) -88, this.field6000[0]);
                if (this.field5997 > 1) {
                    this.field5994.method3765(1, (byte) -88, this.field6000[1]);
                }
                if (this.field5995) {
                    this.field5994.method3765(8, (byte) -111, this.field6003);
                }
                this.field5981.method3694(this.field5994, (byte) -90);
                this.field5981.method3695(this.field5972, -17015);
                this.field5972.method3757(0, false);
                this.field5972.method3757(8, false);
                this.field5972.method3754(40, this.field6004, 0);
                this.field5972.method3754(86, this.field5998, 8);
                this.field5981.method3694(this.field5972, (byte) -113);
            }
            this.field5996 = false;
            this.field5999 = true;
        }
        if (arg0 < 107) {
            this.field5988 = null;
        }
        if (this.field5999) {
            this.field5981.method3695(this.field5988, -17015);
            this.field5999 = !this.field5988.method3755(0);
            this.field5981.method3694(this.field5988, (byte) -120);
        }
        return !this.field5999;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/lang/String;I)[B", line = 342)
    public static final byte[] method2654(String arg0, int arg1) {
        field5976++;
        if (arg1 != -23767) {
            method2651(null, null, -16);
        }
        int var2 = arg0.length();
        if (var2 == 0) {
            return new byte[0];
        }
        int var3 = var2 + 3 & 0xFFFFFFFC;
        int var4 = var3 / 4 * 3;
        if (var2 <= (var3 - 2) || class680.method3830(arg0.charAt(var3 - 2), -99) == -1) {
            var4 -= 2;
        } else if (var2 <= (var3 - 1) || class680.method3830(arg0.charAt(var3 - 1), -128) == -1) {
            var4--;
        }
        byte[] var5 = new byte[var4];
        class78.method577(-3, var5, 0, arg0);
        return var5;
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(I)Z", line = 372)
    public final boolean method2655(int arg0) {
        field5987++;
        if (arg0 != 30639) {
            this.field5994 = null;
        }
        return this.field5988 != null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lqu;B)Z", line = 383)
    public final boolean method2656(class224 arg0, byte arg1) {
        field5989++;
        if (this.field5988 != null) {
            if (arg0.method1331(0) || arg0.method1324(true)) {
                this.field5990.method3610(9289, arg0);
                this.method2658(100);
                if (this.method2653(118)) {
                    if (this.field5983 != -1 && this.field5979 != -1) {
                        arg0.method1327((byte) 117, this.field5983, this.field5979);
                    }
                    arg0.field3021 = true;
                    return true;
                }
            }
            this.method2652(0, arg0);
        }
        int var3 = 2 % ((8 - arg1) / 41);
        return false;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IBIII)Z", line = 419)
    public final boolean method2657(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field5974++;
        int var6 = -70 % ((arg1 + 4) / 59);
        if (this.field5988 == null || this.field5990.method3616((byte) 92)) {
            return false;
        }
        if (this.field5983 != arg0 || this.field5979 != arg2) {
            this.field5979 = arg2;
            this.field5983 = arg0;
            for (class71 var7 = this.field5990.method3618(84); var7 != this.field5990.field8670; var7 = var7.field1077) {
                ((class224) var7).method1327((byte) 117, this.field5983, this.field5979);
            }
            this.field6006 = true;
            this.field6001 = true;
            this.field5996 = true;
        }
        if (!this.method2653(116)) {
            return false;
        }
        this.field5993 = arg3;
        this.field5982 = arg4;
        this.field5978 = true;
        this.field5981.method3695(this.field5988, -17015);
        this.field5988.method3761(0, -1);
        this.field5981.method3723((byte) -88, -this.field5993, this.field5979 + this.field5982 - this.field5981.field8986);
        return true;
    }

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "(I)V", line = 471)
    private final void method2658(int arg0) {
        field5980++;
        if (arg0 < 92) {
            this.field6001 = true;
        }
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class224 var5 = (class224) this.field5990.method3618(-83); var5 != null; var5 = (class224) this.field5990.method3619(0)) {
            int var9 = var5.method1328(true);
            if (var9 > var3) {
                var3 = var9;
            }
            var4 += var5.method1322((byte) -65);
            var2 |= var5.method1329(16);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field6005 != var6) {
            this.field6005 = var6;
            this.field6006 = true;
        }
        int var7 = this.field5997 > 2 ? 2 : this.field5997;
        int var8 = var4 > 2 ? 2 : var4;
        if (var7 != var8) {
            this.field5996 = this.field6006 = true;
        }
        if (this.field5995 != var2) {
            this.field5995 = var2;
            this.field6001 = true;
        }
        this.field5997 = var4;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lsba;I)I", line = 548)
    public static final int method2659(class558 arg0, int arg1) {
        field5975++;
        String var2 = class286.method1898(arg0, (byte) 127);
        int[] var3 = null;
        int var4 = 79 % ((-arg1 - 30) / 53);
        if (class158.method994(arg0.field7754, -112)) {
            var3 = class291.field4179.method1313((int) arg0.field7762, true).field9306;
        } else if (arg0.field7761 != -1) {
            var3 = class291.field4179.method1313(arg0.field7761, true).field9306;
        } else if (class131.method825(501, arg0.field7754)) {
            class234 var7 = (class234) class372.field5245.method812(116, (long) ((int) arg0.field7762));
            if (var7 != null) {
                class679 var8 = var7.field3471;
                class123 var9 = var8.field9436;
                if (var9.field1700 != null) {
                    var9 = var9.method773(class124.field1712, false);
                }
                if (var9 != null) {
                    var3 = var9.field1703;
                }
            }
        } else if (class669.method3774(arg0.field7754, 0)) {
            Object var5 = null;
            class220 var6;
            if (arg0.field7754 == 1009) {
                var6 = class20.field192.method716(6, (int) arg0.field7762);
            } else {
                var6 = class20.field192.method716(6, (int) (arg0.field7762 >>> 32 & 0x7FFFFFFFL));
            }
            if (var6.field2966 != null) {
                var6 = var6.method1297(class124.field1712, 21559);
            }
            if (var6 != null) {
                var3 = var6.field2877;
            }
        }
        if (var3 != null) {
            var2 = var2 + class90.method619(false, var3);
        }
        int var10 = class535.field7417.method1137(256, class719.field10005, var2);
        if (arg0.field7757) {
            var10 += class694.field9641.method1955() + 4;
        }
        return var10;
    }
}
