import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class108 {

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "I")
    private int field1635;

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "I")
    public static int field1631 = -1;

    @OriginalMember(owner = "client!gw", name = "h", descriptor = "I")
    public static int field1637 = -1;

    @OriginalMember(owner = "client!gw", name = "i", descriptor = "Z")
    public static boolean field1638 = false;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!gw", name = "g", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!gw", name = "j", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IZ)V")
    public final void method848(int arg0, boolean arg1) {
        if (!arg1) {
            field1637 = -123;
        }
        field1636++;
        OpenGL.glNewList(this.field1635 + arg0, 4864);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(BII)Z")
    public static final boolean method849(byte arg0, int arg1, int arg2) {
        if (arg0 > -95) {
            return true;
        } else {
            field1639++;
            return (arg2 & 0x70000) != 0 | class426.method2660(arg1, arg2, -115) || class303.method2004(86, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZC)V")
    public final void method850(boolean arg0, char arg1) {
        if (arg0) {
            this.method848(13, true);
        }
        OpenGL.glCallList(this.field1635 + arg1);
        field1630++;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V")
    public final void method851(int arg0) {
        OpenGL.glEndList();
        field1632++;
        if (arg0 < 74) {
            this.method848(47, false);
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)V")
    public static final void method852(byte arg0) {
        field1634++;
        if (class471.field6909 != null) {
            return;
        }
        class471.field6909 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        if (arg0 < 50) {
            return;
        }
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = (float) (-var13) + var12;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - (var6 * var15)) * var8;
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var9 = var8;
                    var10 = var18;
                    var11 = var16;
                } else if (var14 == 1) {
                    var9 = var17;
                    var10 = var8;
                    var11 = var16;
                } else if (var14 == 2) {
                    var9 = var16;
                    var11 = var18;
                    var10 = var8;
                } else if (var14 == 3) {
                    var9 = var16;
                    var10 = var17;
                    var11 = var8;
                } else if (var14 == 4) {
                    var11 = var8;
                    var9 = var18;
                    var10 = var16;
                } else if (var14 == 5) {
                    var9 = var8;
                    var10 = var16;
                    var11 = var17;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var22 << 16) + (var23 << 8) + var24 - 16777216;
                class471.field6909[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Ltt;I)V")
    public class108(class249 arg0, int arg1) {
        this.field1635 = OpenGL.glGenLists(arg1);
    }

    static {
        new class179("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
    }
}
