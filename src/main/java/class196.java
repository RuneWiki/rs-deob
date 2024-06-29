import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class196 {

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "F")
    public float field2855 = 1.0F;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "F")
    public float field2852 = 1.0F;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "F")
    public float field2849 = 0.25F;

    @OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
    public int field2862;

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "I")
    public int field2859;

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "I")
    public int field2856;

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "F")
    public float field2858;

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "Ltb;")
    public class274 field2860;

    @OriginalMember(owner = "client!mu", name = "p", descriptor = "I")
    public int field2864;

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "F")
    public float field2861;

    @OriginalMember(owner = "client!mu", name = "q", descriptor = "I")
    public int field2865;

    @OriginalMember(owner = "client!mu", name = "r", descriptor = "F")
    public float field2866;

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "I")
    public int field2850;

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "J")
    public static long field2857 = -1L;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "Lgk;")
    public static class331 field2854 = new class331("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!mu", name = "o", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!mu", name = "s", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!mu", name = "t", descriptor = "Lfs;")
    public static class387 field2868;

    static {
        new class331("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BLiv;)V", line = 7)
    public final void method1369(byte arg0, class65 arg1) {
        if (arg0 == -31) {
            this.field2855 = (float) (arg1.method577(255) * 8) / 255.0F;
            field2853++;
            this.field2849 = (float) (arg1.method577(255) * 8) / 255.0F;
            this.field2852 = (float) (arg1.method577(arg0 + 286) * 8) / 255.0F;
        }
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "()V", line = 142)
    public class196() {
        this.field2862 = -50;
        this.field2859 = class51.field571;
        this.field2856 = class368.field5474;
        this.field2858 = 0.69921875F;
        this.field2860 = class162.field2294;
        this.field2864 = 0;
        this.field2861 = 1.1523438F;
        this.field2865 = -60;
        this.field2866 = 1.2F;
        this.field2850 = -50;
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Liv;)V", line = 158)
    public class196(class65 arg0) {
        int var2 = arg0.method577(255);
        if (class478.field7044.method1540(29083, class65.field802) && class326.field4576.method322() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field2856 = class368.field5474;
            } else {
                this.field2856 = arg0.method616((byte) 113);
            }
            if ((var2 & 0x2) == 0) {
                this.field2861 = 1.1523438F;
            } else {
                this.field2861 = (float) arg0.method623((byte) 84) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field2858 = 0.69921875F;
            } else {
                this.field2858 = (float) arg0.method623((byte) -41) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field2866 = 1.2F;
            } else {
                this.field2866 = (float) arg0.method623((byte) 111) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method616((byte) 100);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method623((byte) -118);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method623((byte) 123);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method623((byte) -84);
            }
            this.field2858 = 0.69921875F;
            this.field2861 = 1.1523438F;
            this.field2856 = class368.field5474;
            this.field2866 = 1.2F;
        }
        if ((var2 & 0x10) == 0) {
            this.field2862 = -50;
            this.field2850 = -50;
            this.field2865 = -60;
        } else {
            this.field2850 = arg0.method599((byte) 1);
            this.field2865 = arg0.method599((byte) 1);
            this.field2862 = arg0.method599((byte) 1);
        }
        if ((var2 & 0x20) == 0) {
            this.field2859 = class51.field571;
        } else {
            this.field2859 = arg0.method616((byte) 96);
        }
        if ((var2 & 0x40) == 0) {
            this.field2864 = 0;
        } else {
            this.field2864 = arg0.method623((byte) -85);
        }
        if ((var2 & 0x80) == 0) {
            this.field2860 = class162.field2294;
        } else {
            int var3 = arg0.method623((byte) 125);
            int var4 = arg0.method623((byte) 90);
            int var5 = arg0.method623((byte) -123);
            int var6 = arg0.method623((byte) -118);
            int var7 = arg0.method623((byte) -124);
            int var8 = arg0.method623((byte) -109);
            this.field2860 = class178.method1253(var7, var5, var8, var3, var6, var4, -1101853054);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z)V", line = 40)
    public static void method1370(boolean arg0) {
        if (arg0) {
            field2857 = 53L;
        }
        field2854 = null;
        field2868 = null;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "([Lwl;Lfd;I)Lru;", line = 51)
    public static final class128 method1371(class280[] arg0, class365 arg1, int arg2) {
        field2851++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field4098 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg0.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field4098);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class409.field6087, 0);
        if (arg2 != -1) {
            field2868 = null;
        }
        if (class409.field6087[0] == 0) {
            if (class409.field6087[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class409.field6087, 1);
            if (class409.field6087[1] > 1) {
                byte[] var7 = new byte[class409.field6087[1]];
                OpenGL.glGetInfoLogARB(var4, class409.field6087[1], class409.field6087, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class409.field6087[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field4098);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class128(arg1, var4, arg0);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BLmu;)Z", line = 133)
    public final boolean method1372(byte arg0, class196 arg1) {
        int var3 = 72 / ((50 - arg0) / 35);
        field2867++;
        return this.field2856 == arg1.field2856 && this.field2861 == arg1.field2861 && this.field2858 == arg1.field2858 && this.field2866 == arg1.field2866 && this.field2849 == arg1.field2849 && this.field2855 == arg1.field2855 && this.field2852 == arg1.field2852 && this.field2859 == arg1.field2859 && this.field2864 == arg1.field2864 && this.field2860 == arg1.field2860;
    }
}
