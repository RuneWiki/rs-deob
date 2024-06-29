import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class615 {

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public int field8605;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "Z")
    public boolean field8617;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "Z")
    public boolean field8602;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "[S")
    public short[] field8604;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    private int field8614;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public int field8620;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "[I")
    public static int[] field8610 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "[I")
    public static int[] field8612 = new int[25];

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    private int field8603;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field8606;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field8607;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field8608;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    private int field8609;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    private int field8611;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    private int field8613;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field8616;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public static int field8618;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field8619;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "Lpk;")
    public class621 field8615;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    private final void method3372(byte arg0) {
        field8606++;
        int var2 = this.field8620;
        if (var2 == 2) {
            this.field8609 = 0;
            this.field8603 = 2048;
            this.field8611 = 2048;
            this.field8613 = 1;
        } else if (var2 == 3) {
            this.field8603 = 2048;
            this.field8611 = 4096;
            this.field8613 = 1;
            this.field8609 = 0;
        } else if (var2 == 4) {
            this.field8603 = 2048;
            this.field8611 = 2048;
            this.field8609 = 0;
            this.field8613 = 4;
        } else if (var2 == 5) {
            this.field8609 = 0;
            this.field8613 = 4;
            this.field8603 = 2048;
            this.field8611 = 8192;
        } else if (var2 == 12) {
            this.field8609 = 0;
            this.field8611 = 2048;
            this.field8603 = 2048;
            this.field8613 = 2;
        } else if (var2 == 13) {
            this.field8613 = 2;
            this.field8609 = 0;
            this.field8611 = 8192;
            this.field8603 = 2048;
        } else if (var2 == 10) {
            this.field8611 = 2048;
            this.field8613 = 3;
            this.field8609 = 1536;
            this.field8603 = 512;
        } else if (var2 == 11) {
            this.field8603 = 512;
            this.field8609 = 1536;
            this.field8613 = 3;
            this.field8611 = 4096;
        } else if (var2 == 6) {
            this.field8609 = 1280;
            this.field8613 = 3;
            this.field8603 = 768;
            this.field8611 = 2048;
        } else if (var2 == 7) {
            this.field8613 = 3;
            this.field8603 = 768;
            this.field8611 = 4096;
            this.field8609 = 1280;
        } else if (var2 == 8) {
            this.field8609 = 1024;
            this.field8603 = 1024;
            this.field8611 = 2048;
            this.field8613 = 3;
        } else if (var2 == 9) {
            this.field8611 = 4096;
            this.field8609 = 1024;
            this.field8603 = 1024;
            this.field8613 = 3;
        } else if (var2 == 14) {
            this.field8609 = 1280;
            this.field8613 = 1;
            this.field8603 = 768;
            this.field8611 = 2048;
        } else if (var2 == 15) {
            this.field8609 = 1536;
            this.field8603 = 512;
            this.field8613 = 1;
            this.field8611 = 4096;
        } else if (var2 == 16) {
            this.field8613 = 1;
            this.field8611 = 8192;
            this.field8609 = 1792;
            this.field8603 = 256;
        } else {
            this.field8613 = 0;
            this.field8609 = 0;
            this.field8611 = 2048;
            this.field8603 = 2048;
        }
        if (arg0 != 36) {
            this.field8615 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIBLha;III)V")
    private final void method3373(int arg0, int arg1, byte arg2, class454 arg3, int arg4, int arg5, int arg6) {
        this.field8615 = arg3.method90(arg6, arg4, arg1, arg0, arg5, 1.0F);
        field8619++;
        if (arg2 != 0) {
            this.method3378(121, -28, true);
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
    public static final void method3374(byte arg0) {
        class423.field6011 = false;
        field8608++;
        if (arg0 != -24) {
            method3377((byte) -95);
        }
        class728.method4033(-100);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([Lci;BLeq;)Lua;")
    public static final class636 method3375(class692[] arg0, byte arg1, class357 arg2) {
        field8607++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field9810 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg0.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field9810);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class618.field8657, 0);
        if (arg1 != 64) {
            method3377((byte) -52);
        }
        if (class618.field8657[0] == 0) {
            if (class618.field8657[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class618.field8657, 1);
            if (class618.field8657[1] > 1) {
                byte[] var7 = new byte[class618.field8657[1]];
                OpenGL.glGetInfoLogARB(var4, class618.field8657[1], class618.field8657, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class618.field8657[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field9810);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class636(arg2, var4, arg0);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBIII)V")
    public final void method3376(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        this.field8609 = arg3;
        this.field8613 = arg0;
        field8616++;
        this.field8611 = arg2;
        this.field8603 = arg4;
        if (arg1 != 124) {
            method3377((byte) 82);
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)V")
    public static void method3377(byte arg0) {
        field8612 = null;
        field8610 = null;
        if (arg0 != 33) {
            method3375(null, (byte) 77, null);
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
    protected class615() {
        if (class105.field1290 == null) {
            class68.method515((byte) 75);
        }
        this.method3372((byte) 36);
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lha;Ltn;I)V")
    public class615(class454 arg0, class179 arg1, int arg2) {
        if (class105.field1290 == null) {
            class68.method515((byte) 64);
        }
        this.field8605 = arg1.method1094(255);
        this.field8617 = (this.field8605 & 0x10) != 0;
        this.field8602 = (this.field8605 & 0x8) != 0;
        this.field8605 &= 0x7;
        int var4 = arg1.method1107(false) << arg2;
        int var5 = arg1.method1107(false) << arg2;
        int var6 = arg1.method1107(false) << arg2;
        int var7 = arg1.method1094(255);
        int var8 = var7 * 2 + 1;
        this.field8604 = new short[var8];
        for (int var9 = 0; var9 < this.field8604.length; var9++) {
            short var13 = (short) arg1.method1107(false);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            if (var8 - var14 < var15) {
                var15 = var8 - var14;
            }
            this.field8604[var9] = (short) class216.method1308(var15, var14 << 8);
        }
        int var10 = (var7 << class455.field6383) + class5.field54;
        int var11 = class198.field2542 == null ? class487.field6932[class179.method1091(arg1.method1107(false), true) & 0xFFFF] : class198.field2542[arg1.method1107(false)];
        int var12 = arg1.method1094(255);
        this.field8614 = var12 & 0xE0 << 3;
        this.field8620 = var12 & 0x1F;
        if (this.field8620 != 31) {
            this.method3372((byte) 36);
        }
        this.method3373(var10, var5, (byte) 0, arg0, var6, var11, var4);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZ)V")
    public final void method3378(int arg0, int arg1, boolean arg2) {
        if (arg1 != 2) {
            return;
        }
        field8618++;
        int var4;
        if (arg2) {
            var4 = 2048;
        } else {
            int var5 = this.field8611 * arg0 / 50 + this.field8614 & 0x7FF;
            int var6 = this.field8613;
            if (var6 == 1) {
                var4 = (class138.field1644[var5 << 3] >> 4) + 1024;
            } else if (var6 == 3) {
                var4 = class105.field1290[var5] >> 1;
            } else if (var6 == 4) {
                var4 = var5 >> 10 << 11;
            } else if (var6 == 2) {
                var4 = var5;
            } else if (var6 == 5) {
                var4 = (var5 >= 1024 ? 2048 - var5 : var5) << 1;
            } else {
                var4 = 2048;
            }
        }
        this.field8615.method597((byte) 125, (float) ((this.field8603 * var4 >> 11) + this.field8609) / 2048.0F);
    }
}
