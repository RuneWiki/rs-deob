import java.util.zip.CRC32;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class51 implements class2 {

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "[F")
    private float[] field629 = new float[4];

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field632 = new CRC32();

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "Ljava/lang/String;")
    public static String field635 = "Loaded fonts";

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field640 = 0;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "[Z")
    public static boolean[] field641 = new boolean[100];

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "Ljava/lang/String;")
    public static String field642 = "Attack";

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    private int field638;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "[[I")
    public static int[][] field637;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "()I", line = 6)
    public final int method2() {
        field634++;
        return 0;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V", line = 15)
    public static void method342(int arg0) {
        if (arg0 != 2) {
            field632 = (CRC32) null;
        }
        field641 = null;
        field637 = (int[][]) null;
        field632 = null;
        field642 = null;
        field635 = null;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V", line = 273)
    public class51() {
        this.method343((byte) 102);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V", line = 32)
    private final void method343(byte arg0) {
        if (arg0 != 102) {
            field640 = 12;
        }
        GL var2 = class117.field1801;
        field633++;
        this.field638 = var2.glGenLists(2);
        var2.glNewList(this.field638, 4864);
        var2.glActiveTexture(33985);
        if (class133.field2039) {
            var2.glBindTexture(32879, class133.field2037);
            var2.glTexGeni(8194, 9472, 9217);
            var2.glEnable(3170);
            var2.glEnable(32879);
        } else {
            var2.glEnable(3553);
        }
        var2.glTexGeni(8192, 9472, 9216);
        var2.glTexGeni(8193, 9472, 9216);
        var2.glEnable(3168);
        var2.glEnable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
        var2.glNewList(this.field638 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class133.field2039) {
            var2.glDisable(32879);
            var2.glDisable(3170);
        } else {
            var2.glDisable(3553);
        }
        var2.glDisable(3168);
        var2.glDisable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V", line = 81)
    public final void method3(int arg0) {
        field636++;
        GL var2 = class117.field1801;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
        float var4 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var6 = (arg0 & 0x80) != 0;
        if (var6) {
            this.field629[1] = 0.0F;
            this.field629[0] = var5;
            this.field629[3] = 0.0F;
            this.field629[2] = 0.0F;
        } else {
            this.field629[3] = 0.0F;
            this.field629[0] = 0.0F;
            this.field629[1] = 0.0F;
            this.field629[2] = var5;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class250.field3732 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class200.field2993 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class287.field4340), (float) (-class124.field1932), (float) (-class107.field1671));
        var2.glTexGenfv(8192, 9474, this.field629, 0);
        this.field629[2] = 0.0F;
        this.field629[0] = 0.0F;
        this.field629[1] = var5;
        this.field629[3] = (float) class117.field1818 * var4;
        var2.glTexGenfv(8193, 9474, this.field629, 0);
        var2.glPopMatrix();
        if (class133.field2039) {
            this.field629[1] = 0.0F;
            this.field629[3] = (float) class117.field1818 * var3;
            this.field629[2] = 0.0F;
            this.field629[0] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field629, 0);
        } else {
            int var7 = (int) ((float) class117.field1818 * var3 * 64.0F);
            var2.glBindTexture(3553, class133.field2043[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIBIII)V", line = 152)
    public static final void method344(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var6 = arg3 - arg5;
        int var7 = arg1 - arg0;
        field639++;
        if (var7 == 0) {
            if (var6 != 0) {
                class202.method1383((byte) -34, arg0, arg4, arg3, arg5);
            }
        } else if (var6 == 0) {
            class211.method1468(arg4, arg0, arg5, arg1, 126);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg0;
                arg0 = arg5;
                int var10 = arg1;
                arg1 = arg3;
                arg5 = var9;
                arg3 = var10;
            }
            if (arg0 > arg1) {
                int var11 = arg0;
                arg0 = arg1;
                int var12 = arg5;
                arg5 = arg3;
                arg3 = var12;
                arg1 = var11;
            }
            int var13 = arg5;
            int var14 = arg1 - arg0;
            int var15 = arg3 - arg5;
            int var16 = -(var14 >> 1);
            int var17 = -53 % ((arg2 + 60) / 42);
            if (var15 < 0) {
                var15 = -var15;
            }
            int var18 = arg5 >= arg3 ? -1 : 1;
            if (var8) {
                for (int var20 = arg0; var20 <= arg1; var20++) {
                    var16 += var15;
                    class40.field488[var20][var13] = arg4;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var18;
                    }
                }
            } else {
                for (int var19 = arg0; var19 <= arg1; var19++) {
                    var16 += var15;
                    class40.field488[var13][var19] = arg4;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var18;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "()V", line = 284)
    public final void method1() {
        field631++;
        GL var1 = class117.field1801;
        var1.glCallList(this.field638 + 1);
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "()V", line = 299)
    public final void method4() {
        field630++;
        GL var1 = class117.field1801;
        var1.glCallList(this.field638);
    }
}
