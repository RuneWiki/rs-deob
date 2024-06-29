import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mja")
public class class440 {

    @OriginalMember(owner = "client!mja", name = "j", descriptor = "I")
    private int field5972 = 0;

    @OriginalMember(owner = "client!mja", name = "k", descriptor = "I")
    private int field5973 = 0;

    @OriginalMember(owner = "client!mja", name = "m", descriptor = "I")
    private int field5975 = 1;

    @OriginalMember(owner = "client!mja", name = "v", descriptor = "I")
    private int field5984 = 1;

    @OriginalMember(owner = "client!mja", name = "r", descriptor = "Lok;")
    private class266 field5980 = new class266();

    @OriginalMember(owner = "client!mja", name = "y", descriptor = "Z")
    private boolean field5987 = true;

    @OriginalMember(owner = "client!mja", name = "A", descriptor = "[Lkm;")
    private class373[] field5989 = new class373[2];

    @OriginalMember(owner = "client!mja", name = "D", descriptor = "Z")
    private boolean field5992 = true;

    @OriginalMember(owner = "client!mja", name = "w", descriptor = "Z")
    private boolean field5985 = true;

    @OriginalMember(owner = "client!mja", name = "x", descriptor = "I")
    private int field5986 = 0;

    @OriginalMember(owner = "client!mja", name = "F", descriptor = "Z")
    private boolean field5994 = false;

    @OriginalMember(owner = "client!mja", name = "C", descriptor = "Z")
    private boolean field5991 = true;

    @OriginalMember(owner = "client!mja", name = "G", descriptor = "I")
    private int field5995 = -1;

    @OriginalMember(owner = "client!mja", name = "s", descriptor = "Lqfa;")
    private class106 field5981;

    @OriginalMember(owner = "client!mja", name = "d", descriptor = "Lgja;")
    private class54 field5966;

    @OriginalMember(owner = "client!mja", name = "o", descriptor = "Lgja;")
    private class54 field5977;

    @OriginalMember(owner = "client!mja", name = "c", descriptor = "Lgja;")
    private class54 field5965;

    @OriginalMember(owner = "client!mja", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field5967 = new String[200];

    @OriginalMember(owner = "client!mja", name = "h", descriptor = "[I")
    public static int[] field5970 = new int[4096];

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "I")
    public static int field5963;

    @OriginalMember(owner = "client!mja", name = "b", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!mja", name = "f", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!mja", name = "g", descriptor = "I")
    public static int field5969;

    @OriginalMember(owner = "client!mja", name = "i", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!mja", name = "l", descriptor = "I")
    public static int field5974;

    @OriginalMember(owner = "client!mja", name = "n", descriptor = "I")
    public static int field5976;

    @OriginalMember(owner = "client!mja", name = "q", descriptor = "I")
    public static int field5979;

    @OriginalMember(owner = "client!mja", name = "t", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!mja", name = "E", descriptor = "Lkm;")
    private class373 field5993;

    @OriginalMember(owner = "client!mja", name = "z", descriptor = "Lmw;")
    private class516 field5988;

    @OriginalMember(owner = "client!mja", name = "B", descriptor = "Lmw;")
    private class516 field5990;

    @OriginalMember(owner = "client!mja", name = "u", descriptor = "Z")
    private boolean field5983;

    @OriginalMember(owner = "client!mja", name = "p", descriptor = "[[[I")
    public static int[][][] field5978;

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(Lqca;I)V")
    public final void method2621(class125 arg0, int arg1) {
        field5982++;
        arg0.field1930 = false;
        arg0.method143(84);
        arg0.method3387((byte) -21);
        if (arg1 >= 77) {
            this.method2625((byte) 89);
        }
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(Lmea;III)V")
    public static final void method2622(class451 arg0, int arg1, int arg2, int arg3) {
        field5974++;
        class377.field5199 = arg3;
        class298.field4321 = arg2;
        if (arg1 >= 38) {
            class425.field5801 = arg0;
        }
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(I)V")
    public static void method2623(int arg0) {
        field5978 = null;
        field5967 = null;
        if (arg0 == 0) {
            field5970 = null;
        }
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(ILqca;)Z")
    public final boolean method2624(int arg0, class125 arg1) {
        field5968++;
        if (this.field5977 != null) {
            if (arg1.method141(false) || arg1.method144((byte) -81)) {
                this.field5980.method1727(arg1, (byte) 104);
                this.method2625((byte) 40);
                if (this.method2628(-34)) {
                    if (this.field5984 != -1 && this.field5975 != -1) {
                        arg1.method145(this.field5975, this.field5984, 120);
                    }
                    arg1.field1930 = true;
                    return true;
                }
            }
            this.method2621(arg1, 80);
        }
        return arg0 != 0;
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(B)V")
    private final void method2625(byte arg0) {
        field5971++;
        boolean var2 = false;
        int var3 = 0;
        if (arg0 < 18) {
            this.method2624(-58, null);
        }
        int var4 = 0;
        for (class125 var5 = (class125) this.field5980.method1731((byte) -115); var5 != null; var5 = (class125) this.field5980.method1724(0)) {
            int var9 = var5.method142(76);
            if (var9 > var3) {
                var3 = var9;
            }
            var4 += var5.method944(5);
            var2 |= var5.method945(5);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field5995 != var6) {
            this.field5985 = true;
            this.field5995 = var6;
        }
        int var7 = this.field5986 > 2 ? 2 : this.field5986;
        int var8 = var4 <= 2 ? var4 : 2;
        if (var2 != this.field5994) {
            this.field5992 = true;
            this.field5994 = var2;
        }
        this.field5986 = var4;
        if (var7 != var8) {
            this.field5991 = this.field5985 = true;
        }
    }

    @OriginalMember(owner = "client!mja", name = "b", descriptor = "(I)V")
    public final void method2626(int arg0) {
        this.field5993 = null;
        this.field5989 = null;
        field5963++;
        this.field5988 = null;
        this.field5977 = this.field5965 = this.field5966 = null;
        this.field5990 = null;
        if (!this.field5980.method1737(-17429)) {
            for (class577 var2 = this.field5980.method1731((byte) -119); var2 != this.field5980.field3876; var2 = var2.field8131) {
                ((class125) var2).method143(90);
            }
        }
        if (arg0 == 0) {
            this.field5984 = this.field5975 = 1;
        }
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(IIIII)Z")
    public final boolean method2627(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 55 % ((67 - arg0) / 40);
        field5964++;
        if (this.field5977 == null || this.field5980.method1737(-17429)) {
            return false;
        }
        if (this.field5984 != arg4 || this.field5975 != arg3) {
            this.field5984 = arg4;
            this.field5975 = arg3;
            for (class577 var7 = this.field5980.method1731((byte) -117); var7 != this.field5980.field3876; var7 = var7.field8131) {
                ((class125) var7).method145(this.field5975, this.field5984, 87);
            }
            this.field5991 = true;
            this.field5992 = true;
            this.field5985 = true;
        }
        if (!this.method2628(111)) {
            return false;
        }
        this.field5972 = arg1;
        this.field5973 = arg2;
        this.field5983 = true;
        this.field5981.method776(this.field5977, 411);
        this.field5977.method376(-1, 0);
        this.field5981.method774(-5976, this.field5975 + this.field5972 - this.field5981.field1223, -this.field5973);
        return true;
    }

    @OriginalMember(owner = "client!mja", name = "c", descriptor = "(I)Z")
    private final boolean method2628(int arg0) {
        int var2 = -63 / ((44 - arg0) / 58);
        field5979++;
        if (this.field5992) {
            if (this.field5990 != null) {
                this.field5990.method3113(-113);
                this.field5990 = null;
            }
            if (this.field5993 != null) {
                this.field5993.method1310((byte) -102);
                this.field5993 = null;
            }
            if (this.field5965 != null) {
                this.field5990 = new class516(this.field5981, 6402, this.field5984, this.field5975, this.field5981.field1432);
            }
            if (this.field5994) {
                this.field5993 = new class373(this.field5981, 34037, 6402, this.field5984, this.field5975);
            } else if (this.field5990 == null) {
                this.field5990 = new class516(this.field5981, 6402, this.field5984, this.field5975);
            }
            this.field5987 = true;
            this.field5991 = true;
            this.field5992 = false;
        }
        if (this.field5985) {
            if (this.field5988 != null) {
                this.field5988.method3113(-118);
                this.field5988 = null;
            }
            if (this.field5989[0] != null) {
                this.field5989[0].method1310((byte) -102);
                this.field5989[0] = null;
            }
            if (this.field5989[1] != null) {
                this.field5989[1].method1310((byte) -102);
                this.field5989[1] = null;
            }
            if (this.field5965 != null) {
                this.field5988 = new class516(this.field5981, this.field5995, this.field5984, this.field5975, this.field5981.field1432);
            }
            this.field5989[0] = new class373(this.field5981, 34037, this.field5995, this.field5984, this.field5975);
            this.field5989[1] = this.field5986 > 1 ? new class373(this.field5981, 34037, this.field5995, this.field5984, this.field5975) : null;
            this.field5987 = true;
            this.field5985 = false;
            this.field5991 = true;
        }
        if (this.field5991) {
            if (this.field5965 == null) {
                this.field5981.method776(this.field5966, 411);
                this.field5966.method372(0, -98);
                this.field5966.method372(1, -52);
                this.field5966.method372(8, -33);
                this.field5966.method380(this.field5989[0], 0, -125);
                if (this.field5986 > 1) {
                    this.field5966.method380(this.field5989[1], 1, 65);
                }
                if (this.field5994) {
                    this.field5966.method380(this.field5993, 8, 54);
                } else {
                    this.field5966.method381((byte) -113, 8, this.field5990);
                }
                this.field5981.method755(this.field5966, 0);
            } else {
                this.field5981.method776(this.field5966, 411);
                this.field5966.method372(0, 94);
                this.field5966.method372(1, 88);
                this.field5966.method372(8, -119);
                this.field5966.method380(this.field5989[0], 0, 97);
                if (this.field5986 > 1) {
                    this.field5966.method380(this.field5989[1], 1, -119);
                }
                if (this.field5994) {
                    this.field5966.method380(this.field5993, 8, 46);
                }
                this.field5981.method755(this.field5966, 0);
                this.field5981.method776(this.field5965, 411);
                this.field5965.method372(0, 95);
                this.field5965.method372(8, 92);
                this.field5965.method381((byte) -127, 0, this.field5988);
                this.field5965.method381((byte) -109, 8, this.field5990);
                this.field5981.method755(this.field5965, 0);
            }
            this.field5991 = false;
            this.field5987 = true;
        }
        if (this.field5987) {
            this.field5981.method776(this.field5977, 411);
            this.field5987 = !this.field5977.method375((byte) -111);
            this.field5981.method755(this.field5977, 0);
        }
        return !this.field5987;
    }

    @OriginalMember(owner = "client!mja", name = "d", descriptor = "(I)Z")
    public final boolean method2629(int arg0) {
        field5976++;
        int var2 = -3 % ((arg0 + 50) / 56);
        return this.field5977 != null;
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(Z)V")
    public final void method2630(boolean arg0) {
        field5969++;
        if (!this.field5983) {
            return;
        }
        if (this.field5965 != null) {
            this.field5981.method748(this.field5965, arg0);
            int var2 = 16384;
            this.field5981.method763(this.field5966, (byte) 107);
            this.field5965.method384(0, (byte) 117);
            this.field5966.method376(-1, 0);
            if (this.field5994) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field5984, this.field5975, 0, 0, this.field5984, this.field5975, var2, 9728);
            this.field5981.method818(this.field5965, 0);
            this.field5981.method799(this.field5966, 17);
        }
        this.field5981.method809((byte) -1);
        this.field5981.method800(0, 28276);
        this.field5981.method795(1, 34023);
        this.field5981.method511();
        int var3 = 0;
        int var4 = 1;
        class125 var6;
        for (class125 var5 = (class125) this.field5980.method1731((byte) -118); var5 != null; var5 = var6) {
            var6 = (class125) this.field5980.method1724(0);
            int var7 = var5.method944(5);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method147(!arg0, var8, this.field5993, this.field5989[var3]);
                if (var6 == null && var7 - 1 == var8) {
                    this.field5981.method755(this.field5966, 0);
                    this.field5981.method774(-5976, 0, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field5975);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field5973, this.field5972);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field5973, this.field5972 + this.field5975);
                    OpenGL.glTexCoord2f((float) this.field5984, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field5984 + this.field5973, this.field5972 - -this.field5975);
                    OpenGL.glTexCoord2f((float) this.field5984, (float) this.field5975);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field5984 + this.field5973, this.field5972);
                    OpenGL.glEnd();
                } else {
                    this.field5966.method376(-1, -(-var4));
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field5975);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, this.field5975);
                    OpenGL.glTexCoord2f((float) this.field5984, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field5984, this.field5975);
                    OpenGL.glTexCoord2f((float) this.field5984, (float) this.field5975);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field5984, 0);
                    OpenGL.glEnd();
                }
                var4 = var4 + 1 & 0x1;
                var3 = var3 + 1 & 0x1;
                var5.method138(var8, -12078);
            }
        }
        this.field5983 = arg0;
    }

    @OriginalMember(owner = "client!mja", name = "<init>", descriptor = "(Lqfa;)V")
    public class440(class106 arg0) {
        this.field5981 = arg0;
        if (this.field5981.field1577 && this.field5981.field1517) {
            this.field5977 = this.field5966 = new class54(this.field5981);
            if (this.field5981.field1432 > 1 && this.field5981.field1476 && this.field5981.field1540) {
                this.field5977 = this.field5965 = new class54(this.field5981);
                return;
            }
        }
    }
}
