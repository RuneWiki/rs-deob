import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class561 {

    @OriginalMember(owner = "client!tq", name = "A", descriptor = "I")
    private int field8165 = 1;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
    private int field8175 = 1;

    @OriginalMember(owner = "client!tq", name = "E", descriptor = "I")
    private int field8166 = 0;

    @OriginalMember(owner = "client!tq", name = "t", descriptor = "I")
    private int field8171 = 0;

    @OriginalMember(owner = "client!tq", name = "r", descriptor = "Ltf;")
    private class524 field8160 = new class524();

    @OriginalMember(owner = "client!tq", name = "w", descriptor = "I")
    private int field8180 = 0;

    @OriginalMember(owner = "client!tq", name = "G", descriptor = "Z")
    private boolean field8179 = true;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "Z")
    private boolean field8182 = true;

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "[Lbp;")
    private class117[] field8183 = new class117[2];

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "Z")
    private boolean field8181 = false;

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "Z")
    private boolean field8184 = true;

    @OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
    private int field8186 = -1;

    @OriginalMember(owner = "client!tq", name = "y", descriptor = "Z")
    private boolean field8189 = true;

    @OriginalMember(owner = "client!tq", name = "s", descriptor = "Lml;")
    private class194 field8168;

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "Lhb;")
    private class513 field8173;

    @OriginalMember(owner = "client!tq", name = "x", descriptor = "Lhb;")
    private class513 field8170;

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "Lhb;")
    private class513 field8174;

    @OriginalMember(owner = "client!tq", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field8190 = new String[] { method4206(method4205("p\u007f'W]")), method4206(method4205("e$e\u0015")), method4206(method4205("\u007f 'EIe8}G\b")), method4206(method4205("\u007f '=\b")), method4206(method4205("\u007f ';\b")), method4206(method4205("\u007f '1\b")), method4206(method4205("\u007f '<\b")), method4206(method4205("\u007f '8\b")), method4206(method4205("\u007f ':\b")), method4206(method4205("\u007f '?\b")), method4206(method4205("\u007f '>\b")), method4206(method4205("\u007f '0\b")) };

    @OriginalMember(owner = "client!tq", name = "v", descriptor = "I")
    public static int field8167 = 0;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "[I")
    public static int[] field8161 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "Lmv;")
    public static class125 field8157 = new class125(11, 3);

    @OriginalMember(owner = "client!tq", name = "C", descriptor = "I")
    public static int field8159;

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
    public static int field8162;

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "I")
    public static int field8163;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "I")
    public static int field8164;

    @OriginalMember(owner = "client!tq", name = "z", descriptor = "I")
    public static int field8169;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
    public static int field8176;

    @OriginalMember(owner = "client!tq", name = "F", descriptor = "I")
    public static int field8177;

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "I")
    public static int field8178;

    @OriginalMember(owner = "client!tq", name = "D", descriptor = "Lbp;")
    private class117 field8188;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "Lrg;")
    public static class167 field8158;

    @OriginalMember(owner = "client!tq", name = "B", descriptor = "Ljt;")
    private class487 field8185;

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "Ljt;")
    private class487 field8187;

    @OriginalMember(owner = "client!tq", name = "u", descriptor = "Z")
    private boolean field8172;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(I)V", line = 6)
    public static void method4196(int arg0) {
        try {
            field8161 = null;
            if (arg0 == 44) {
                field8157 = null;
                field8158 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8190[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILdba;)V", line = 20)
    public final void method4197(int arg0, class215 arg1) {
        try {
            field8163++;
            arg1.field3147 = false;
            arg1.method1803(false);
            arg1.method4294(0);
            this.method4199(-11527);
            if (arg0 <= 84) {
                field8158 = null;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8190[7] + arg0 + ',' + (arg1 == null ? field8190[1] : field8190[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)V", line = 34)
    public final void method4198(int arg0) {
        try {
            field8164++;
            if (this.field8172) {
                if (this.field8174 != null) {
                    this.field8168.method1663(true, this.field8174);
                    int var2 = 16384;
                    this.field8168.method1610(this.field8173, 22);
                    this.field8174.method3927(95, 0);
                    this.field8173.method3924(1, 0);
                    if (this.field8181) {
                        var2 |= 0x100;
                    }
                    OpenGL.glBlitFramebufferEXT(0, 0, this.field8175, this.field8165, 0, 0, this.field8175, this.field8165, var2, 9728);
                    this.field8168.method1646(this.field8174, true);
                    this.field8168.method1675(-95, this.field8173);
                }
                this.field8168.method1620((byte) 108);
                this.field8168.method1670(0, (byte) 125);
                this.field8168.method1631(1, 7681);
                this.field8168.method240();
                int var3 = 0;
                int var4 = 1;
                if (arg0 < 27) {
                    this.field8165 = -74;
                }
                class215 var6;
                for (class215 var5 = (class215) this.field8160.method3977((byte) -75); var5 != null; var5 = var6) {
                    var6 = (class215) this.field8160.method3987(0);
                    int var7 = var5.method1805(0);
                    for (int var8 = 0; var8 < var7; var8++) {
                        var5.method1808(this.field8188, var8, this.field8183[var3], 1);
                        if (var6 == null && var7 - 1 == var8) {
                            this.field8168.method1635(118, this.field8173);
                            this.field8168.method1655(0, 0, 0);
                            OpenGL.glBegin(7);
                            OpenGL.glTexCoord2f(0.0F, (float) this.field8165);
                            OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                            OpenGL.glVertex2i(this.field8171, this.field8166);
                            OpenGL.glTexCoord2f(0.0F, 0.0F);
                            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                            OpenGL.glVertex2i(this.field8171, this.field8166 + this.field8165);
                            OpenGL.glTexCoord2f((float) this.field8175, 0.0F);
                            OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                            OpenGL.glVertex2i(this.field8175 + this.field8171, this.field8166 - -this.field8165);
                            OpenGL.glTexCoord2f((float) this.field8175, (float) this.field8165);
                            OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                            OpenGL.glVertex2i(this.field8175 + this.field8171, this.field8166);
                            OpenGL.glEnd();
                        } else {
                            this.field8173.method3924(1, var4);
                            OpenGL.glBegin(7);
                            OpenGL.glTexCoord2f(0.0F, (float) this.field8165);
                            OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                            OpenGL.glVertex2i(0, 0);
                            OpenGL.glTexCoord2f(0.0F, 0.0F);
                            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                            OpenGL.glVertex2i(0, this.field8165);
                            OpenGL.glTexCoord2f((float) this.field8175, 0.0F);
                            OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                            OpenGL.glVertex2i(this.field8175, this.field8165);
                            OpenGL.glTexCoord2f((float) this.field8175, (float) this.field8165);
                            OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                            OpenGL.glVertex2i(this.field8175, 0);
                            OpenGL.glEnd();
                        }
                        var3 = var3 + 1 & 0x1;
                        var5.method1810(var8, -22198);
                        var4 = var4 + 1 & 0x1;
                    }
                }
                this.field8172 = false;
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field8190[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V", line = 140)
    private final void method4199(int arg0) {
        try {
            field8178++;
            boolean var2 = false;
            int var3 = 0;
            int var4 = 0;
            for (class215 var5 = (class215) this.field8160.method3977((byte) -28); var5 != null; var5 = (class215) this.field8160.method3987(0)) {
                int var6 = var5.method1799((byte) 61);
                var4 += var5.method1805(arg0 ^ 0xFFFFD2F9);
                if (var6 > var3) {
                    var3 = var6;
                }
                var2 |= var5.method1802(arg0 + 38267);
            }
            int var7;
            if (var3 == 2) {
                var7 = 34836;
            } else if (var3 == 1) {
                var7 = 34842;
            } else {
                var7 = 6408;
            }
            if (arg0 != -11527) {
                this.method4199(-93);
            }
            if (this.field8186 != var7) {
                this.field8186 = var7;
                this.field8179 = true;
            }
            int var8 = this.field8180 <= 2 ? this.field8180 : 2;
            int var9 = var4 > 2 ? 2 : var4;
            this.field8180 = var4;
            if (this.field8181 != var2) {
                this.field8182 = true;
                this.field8181 = var2;
            }
            if (var8 != var9) {
                this.field8184 = this.field8179 = true;
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field8190[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ldba;I)Z", line = 210)
    public final boolean method4200(class215 arg0, int arg1) {
        try {
            field8176++;
            if (arg1 != -1) {
                this.field8172 = true;
            }
            if (this.field8170 != null) {
                if (arg0.method1812(16) || arg0.method1801(false)) {
                    this.field8160.method3984(arg0, 0);
                    this.method4199(arg1 - 11526);
                    if (this.method4203((byte) 121)) {
                        if (this.field8175 != -1 && this.field8165 != -1) {
                            arg0.method1800(126, this.field8165, this.field8175);
                        }
                        arg0.field3147 = true;
                        return true;
                    }
                }
                this.method4197(arg1 ^ 0xFFFFFFA9, arg0);
            }
            return false;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8190[8] + (arg0 == null ? field8190[1] : field8190[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IZIII)Z", line = 259)
    public final boolean method4201(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        try {
            if (arg1) {
                method4196(-98);
            }
            field8177++;
            if (this.field8170 == null || this.field8160.method3974(-22016)) {
                return false;
            }
            if (this.field8175 != arg4 || this.field8165 != arg0) {
                this.field8165 = arg0;
                this.field8175 = arg4;
                for (class578 var6 = this.field8160.method3977((byte) -121); var6 != this.field8160.field7630; var6 = var6.field8373) {
                    ((class215) var6).method1800(-60, this.field8165, this.field8175);
                }
                this.field8179 = true;
                this.field8182 = true;
                this.field8184 = true;
            }
            if (!this.method4203((byte) 121)) {
                return false;
            }
            this.field8166 = arg3;
            this.field8171 = arg2;
            this.field8172 = true;
            this.field8168.method1613((byte) 77, this.field8170);
            this.field8170.method3924(1, 0);
            this.field8168.method1655(0, this.field8166 + this.field8165 - this.field8168.field2746, -this.field8171);
            return true;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field8190[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lml;)V", line = 535)
    public class561(class194 arg0) {
        try {
            this.field8168 = arg0;
            if (this.field8168.field2806 && this.field8168.field2884) {
                this.field8170 = this.field8173 = new class513(this.field8168);
                if (this.field8168.field2749 > 1 && this.field8168.field2847 && this.field8168.field2814) {
                    this.field8170 = this.field8174 = new class513(this.field8168);
                    return;
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8190[2] + (arg0 == null ? field8190[1] : field8190[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)Z", line = 313)
    public final boolean method4202(boolean arg0) {
        try {
            if (!arg0) {
                this.method4198(72);
            }
            field8162++;
            return this.field8170 != null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8190[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)Z", line = 335)
    private final boolean method4203(byte arg0) {
        try {
            field8159++;
            if (this.field8182) {
                if (this.field8185 != null) {
                    this.field8185.method3751(-28648);
                    this.field8185 = null;
                }
                if (this.field8188 != null) {
                    this.field8188.method3598(0);
                    this.field8188 = null;
                }
                if (this.field8174 != null) {
                    this.field8185 = new class487(this.field8168, 6402, this.field8175, this.field8165, this.field8168.field2749);
                }
                if (this.field8181) {
                    this.field8188 = new class117(this.field8168, 34037, 6402, this.field8175, this.field8165);
                } else if (this.field8185 == null) {
                    this.field8185 = new class487(this.field8168, 6402, this.field8175, this.field8165);
                }
                this.field8184 = true;
                this.field8189 = true;
                this.field8182 = false;
            }
            if (this.field8179) {
                if (this.field8187 != null) {
                    this.field8187.method3751(-28648);
                    this.field8187 = null;
                }
                if (this.field8183[0] != null) {
                    this.field8183[0].method3598(arg0 - 121);
                    this.field8183[0] = null;
                }
                if (this.field8183[1] != null) {
                    this.field8183[1].method3598(0);
                    this.field8183[1] = null;
                }
                if (this.field8174 != null) {
                    this.field8187 = new class487(this.field8168, this.field8186, this.field8175, this.field8165, this.field8168.field2749);
                }
                this.field8183[0] = new class117(this.field8168, 34037, this.field8186, this.field8175, this.field8165);
                this.field8183[1] = this.field8180 <= 1 ? null : new class117(this.field8168, 34037, this.field8186, this.field8175, this.field8165);
                this.field8189 = true;
                this.field8184 = true;
                this.field8179 = false;
            }
            if (arg0 != 121) {
                this.field8171 = 109;
            }
            if (this.field8184) {
                if (this.field8174 == null) {
                    this.field8168.method1613((byte) 77, this.field8173);
                    this.field8173.method3926(0, (byte) 78);
                    this.field8173.method3926(1, (byte) 78);
                    this.field8173.method3926(8, (byte) 78);
                    this.field8173.method3928(this.field8183[0], arg0 - 121, 0);
                    if (this.field8180 > 1) {
                        this.field8173.method3928(this.field8183[1], 0, 1);
                    }
                    if (this.field8181) {
                        this.field8173.method3928(this.field8188, arg0 - 121, 8);
                    } else {
                        this.field8173.method3922(this.field8185, 8, 1);
                    }
                    this.field8168.method1635(112, this.field8173);
                } else {
                    this.field8168.method1613((byte) 77, this.field8173);
                    this.field8173.method3926(0, (byte) 78);
                    this.field8173.method3926(1, (byte) 78);
                    this.field8173.method3926(8, (byte) 78);
                    this.field8173.method3928(this.field8183[0], 0, 0);
                    if (this.field8180 > 1) {
                        this.field8173.method3928(this.field8183[1], arg0 ^ 0x79, 1);
                    }
                    if (this.field8181) {
                        this.field8173.method3928(this.field8188, 0, 8);
                    }
                    this.field8168.method1635(arg0 + 1, this.field8173);
                    this.field8168.method1613((byte) 77, this.field8174);
                    this.field8174.method3926(0, (byte) 78);
                    this.field8174.method3926(8, (byte) 78);
                    this.field8174.method3922(this.field8187, 0, arg0 - 120);
                    this.field8174.method3922(this.field8185, 8, 1);
                    this.field8168.method1635(121, this.field8174);
                }
                this.field8189 = true;
                this.field8184 = false;
            }
            if (this.field8189) {
                this.field8168.method1613((byte) 77, this.field8170);
                this.field8189 = !this.field8170.method3923(true);
                this.field8168.method1635(110, this.field8170);
            }
            return !this.field8189;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8190[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(Z)V", line = 490)
    public final void method4204(boolean arg0) {
        try {
            this.field8185 = null;
            this.field8187 = null;
            if (arg0) {
                this.method4203((byte) 96);
            }
            this.field8183 = null;
            this.field8170 = this.field8174 = this.field8173 = null;
            this.field8188 = null;
            field8169++;
            if (!this.field8160.method3974(-22016)) {
                for (class578 var2 = this.field8160.method3977((byte) -103); var2 != this.field8160.field7630; var2 = var2.field8373) {
                    ((class215) var2).method1803(arg0);
                }
            }
            this.field8175 = this.field8165 = 1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8190[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4205(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x20);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4206(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 11;
                    break;
                case 1:
                    var10005 = 81;
                    break;
                case 2:
                    var10005 = 9;
                    break;
                case 3:
                    var10005 = 121;
                    break;
                default:
                    var10005 = 32;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
