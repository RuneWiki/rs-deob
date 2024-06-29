import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class414 {

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    private int field5912 = 0;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    private int field5913 = 1;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    private int field5914 = 0;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    private int field5921 = 1;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "Lsr;")
    private class167 field5920 = new class167();

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "Z")
    private boolean field5928 = false;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "Z")
    private boolean field5927 = true;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
    private int field5930 = -1;

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "Z")
    private boolean field5933 = true;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "Z")
    private boolean field5931 = true;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "Z")
    private boolean field5929 = true;

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "I")
    private int field5932 = 0;

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "[Lkm;")
    private class238[] field5935 = new class238[2];

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "Lur;")
    private class377 field5910;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "Lmq;")
    private class354 field5907;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "Lmq;")
    private class354 field5908;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "Lmq;")
    private class354 field5905;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "[I")
    public static int[] field5919 = new int[14];

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "Ljc;")
    public static class305 field5918 = new class305("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "F")
    public static float field5917;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field5906;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public static int field5915;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
    public static int field5922;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "Lkm;")
    private class238 field5924;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "Ltq;")
    private class446 field5926;

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "Ltq;")
    private class446 field5936;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "Z")
    private boolean field5911;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V")
    public final void method2525(boolean arg0) {
        field5934++;
        if (!this.field5911) {
            return;
        }
        if (this.field5905 != null) {
            int var2 = 16384;
            this.field5910.method2228(119, this.field5905);
            this.field5910.method2297(-4, this.field5907);
            this.field5905.method2073(0, -18);
            this.field5907.method2075(-77, 0);
            if (this.field5928) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field5913, this.field5921, 0, 0, this.field5913, this.field5921, var2, 9728);
            this.field5910.method2245(-73, this.field5905);
            this.field5910.method2249((byte) 63, this.field5907);
        }
        this.field5910.method2273((byte) 72);
        this.field5910.method2279(0, (byte) 80);
        this.field5910.method2260(16640, 1);
        this.field5910.method1206();
        int var3 = 0;
        int var4 = 1;
        class272 var6;
        for (class272 var5 = (class272) this.field5920.method970(12); var5 != null; var5 = var6) {
            var6 = (class272) this.field5920.method976((byte) -125);
            int var7 = var5.method1653(-120);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method1657(arg0, this.field5935[var3], this.field5924, var8);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field5910.method2271((byte) 39, this.field5907);
                    this.field5910.method2306(0, -30723, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field5921);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field5912, this.field5914);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field5912, this.field5921 + this.field5914);
                    OpenGL.glTexCoord2f((float) this.field5913, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field5913 + this.field5912, this.field5921 + this.field5914);
                    OpenGL.glTexCoord2f((float) this.field5913, (float) this.field5921);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field5913 + this.field5912, this.field5914);
                    OpenGL.glEnd();
                } else {
                    this.field5907.method2075(86, var4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field5921);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field5921);
                    OpenGL.glTexCoord2f((float) this.field5913, (float) this.field5921);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field5913, this.field5921);
                    OpenGL.glTexCoord2f((float) this.field5913, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field5913, 0);
                    OpenGL.glEnd();
                }
                var5.method1655(var8, true);
                var3 = var3 + 1 & 0x1;
                var4 = var4 + 1 & 0x1;
            }
        }
        this.field5911 = arg0;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)Z")
    private final boolean method2526(int arg0) {
        if (arg0 <= 74) {
            this.field5926 = null;
        }
        field5909++;
        if (this.field5933) {
            if (this.field5936 != null) {
                this.field5936.method2756((byte) -127);
                this.field5936 = null;
            }
            if (this.field5924 != null) {
                this.field5924.method1553(98);
                this.field5924 = null;
            }
            if (this.field5905 != null) {
                this.field5936 = new class446(this.field5910, 6402, this.field5913, this.field5921, this.field5910.field5284);
            }
            if (this.field5928) {
                this.field5924 = new class238(this.field5910, 34037, 6402, this.field5913, this.field5921);
            } else if (this.field5936 == null) {
                this.field5936 = new class446(this.field5910, 6402, this.field5913, this.field5921);
            }
            this.field5929 = true;
            this.field5927 = true;
            this.field5933 = false;
        }
        if (this.field5931) {
            if (this.field5926 != null) {
                this.field5926.method2756((byte) -124);
                this.field5926 = null;
            }
            if (this.field5935[0] != null) {
                this.field5935[0].method1553(74);
                this.field5935[0] = null;
            }
            if (this.field5935[1] != null) {
                this.field5935[1].method1553(-23);
                this.field5935[1] = null;
            }
            if (this.field5905 != null) {
                this.field5926 = new class446(this.field5910, this.field5930, this.field5913, this.field5921, this.field5910.field5284);
            }
            this.field5935[0] = new class238(this.field5910, 34037, this.field5930, this.field5913, this.field5921);
            this.field5935[1] = this.field5932 <= 1 ? null : new class238(this.field5910, 34037, this.field5930, this.field5913, this.field5921);
            this.field5929 = true;
            this.field5931 = false;
            this.field5927 = true;
        }
        if (this.field5929) {
            if (this.field5905 == null) {
                this.field5910.method2264(this.field5907, 116);
                this.field5907.method2068(1, 0);
                this.field5907.method2068(1, 1);
                this.field5907.method2068(1, 8);
                this.field5907.method2072(0, this.field5935[0], true);
                if (this.field5932 > 1) {
                    this.field5907.method2072(1, this.field5935[1], true);
                }
                if (this.field5928) {
                    this.field5907.method2072(8, this.field5924, true);
                } else {
                    this.field5907.method2078(8, this.field5936, 36053);
                }
                this.field5910.method2271((byte) 39, this.field5907);
            } else {
                this.field5910.method2264(this.field5907, 106);
                this.field5907.method2068(1, 0);
                this.field5907.method2068(1, 1);
                this.field5907.method2068(1, 8);
                this.field5907.method2072(0, this.field5935[0], true);
                if (this.field5932 > 1) {
                    this.field5907.method2072(1, this.field5935[1], true);
                }
                if (this.field5928) {
                    this.field5907.method2072(8, this.field5924, true);
                }
                this.field5910.method2271((byte) 39, this.field5907);
                this.field5910.method2264(this.field5905, -120);
                this.field5905.method2068(1, 0);
                this.field5905.method2068(1, 8);
                this.field5905.method2078(0, this.field5926, 36053);
                this.field5905.method2078(8, this.field5936, 36053);
                this.field5910.method2271((byte) 39, this.field5905);
            }
            this.field5929 = false;
            this.field5927 = true;
        }
        if (this.field5927) {
            this.field5910.method2264(this.field5908, -102);
            this.field5927 = !this.field5908.method2076((byte) -98);
            this.field5910.method2271((byte) 39, this.field5908);
        }
        return !this.field5927;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public static void method2527(byte arg0) {
        field5919 = null;
        if (arg0 == -13) {
            field5918 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIII)Z")
    public final boolean method2528(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5922++;
        if (arg3 >= -113) {
            return false;
        } else if (this.field5908 == null || this.field5920.method979(2)) {
            return false;
        } else {
            if (this.field5913 != arg4 || this.field5921 != arg1) {
                this.field5921 = arg1;
                this.field5913 = arg4;
                for (class435 var6 = this.field5920.method970(12); var6 != this.field5920.field2165; var6 = var6.field6344) {
                    ((class272) var6).method1654(this.field5913, (byte) -112, this.field5921);
                }
                this.field5929 = true;
                this.field5933 = true;
                this.field5931 = true;
            }
            if (!this.method2526(113)) {
                return false;
            }
            this.field5912 = arg2;
            this.field5911 = true;
            this.field5914 = arg0;
            this.field5910.method2264(this.field5908, 126);
            this.field5908.method2075(-94, 0);
            this.field5910.method2306(-this.field5912, -30723, this.field5921 - (this.field5908.method2080(-10894) + this.field5914));
            return true;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLhf;)V")
    public final void method2529(byte arg0, class272 arg1) {
        field5923++;
        arg1.field3628 = false;
        arg1.method1659(-82);
        arg1.method2674(true);
        this.method2533(arg0 ^ 0x6E);
        if (arg0 != -9) {
            this.method2533(49);
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)V")
    public final void method2530(byte arg0) {
        this.field5926 = null;
        this.field5935 = null;
        this.field5924 = null;
        field5915++;
        this.field5936 = null;
        this.field5908 = this.field5905 = this.field5907 = null;
        if (arg0 > -120) {
            this.field5913 = 31;
        }
        if (!this.field5920.method979(2)) {
            for (class435 var2 = this.field5920.method970(12); var2 != this.field5920.field2165; var2 = var2.field6344) {
                ((class272) var2).method1659(-99);
            }
        }
        this.field5913 = this.field5921 = 1;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lhf;I)Z")
    public final boolean method2531(class272 arg0, int arg1) {
        field5925++;
        if (this.field5908 != null) {
            if (arg0.method1646(true) || arg0.method1652(34842)) {
                this.field5920.method975(0, arg0);
                this.method2533(38);
                if (this.method2526(120)) {
                    if (this.field5913 != -1 && this.field5921 != -1) {
                        arg0.method1654(this.field5913, (byte) -112, this.field5921);
                    }
                    arg0.field3628 = true;
                    return true;
                }
            }
            this.method2529((byte) -9, arg0);
        }
        return arg1 == -22160 ? false : false;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)Z")
    public final boolean method2532(int arg0) {
        if (arg0 != 1) {
            this.field5931 = true;
        }
        field5906++;
        return this.field5908 != null;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V")
    private final void method2533(int arg0) {
        int var2 = 41 / ((arg0 + 35) / 57);
        field5916++;
        boolean var3 = false;
        int var4 = 0;
        int var5 = 0;
        for (class272 var6 = (class272) this.field5920.method970(12); var6 != null; var6 = (class272) this.field5920.method976((byte) -120)) {
            int var10 = var6.method1651(-108);
            if (var10 > var4) {
                var4 = var10;
            }
            var5 += var6.method1653(-127);
            var3 |= var6.method1656((byte) -72);
        }
        int var7;
        if (var4 == 2) {
            var7 = 34836;
        } else if (var4 == 1) {
            var7 = 34842;
        } else {
            var7 = 6408;
        }
        if (this.field5930 != var7) {
            this.field5931 = true;
            this.field5930 = var7;
        }
        int var8 = this.field5932 > 2 ? 2 : this.field5932;
        int var9 = var5 <= 2 ? var5 : 2;
        if (this.field5928 != var3) {
            this.field5933 = true;
            this.field5928 = var3;
        }
        if (var8 != var9) {
            this.field5929 = this.field5931 = true;
        }
        this.field5932 = var5;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lur;)V")
    public class414(class377 arg0) {
        this.field5910 = arg0;
        if (this.field5910.field5417 && this.field5910.field5374) {
            this.field5908 = this.field5907 = new class354(this.field5910);
            if (this.field5910.field5284 > 1 && this.field5910.field5385 && this.field5910.field5398) {
                this.field5908 = this.field5905 = new class354(this.field5910);
                return;
            }
        }
    }

    static {
        new class305("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
        new class305("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
    }
}
