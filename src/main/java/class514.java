import jaggl.OpenGL;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public abstract class class514 {

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "Lbv;")
    public static class567 field7111 = new class567("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field7113 = new Rectangle[100];

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "Lbv;")
    public static class567 field7114;

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "[Lco;")
    public static class268[] field7115;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "I")
    public static int field7110;

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "I")
    public static int field7112;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field7113[var0] = new Rectangle();
        }
        field7114 = new class567("Profiling", "Profiling", "Profilage", "Profiling");
        field7115 = new class268[2048];
        new class567(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2876(boolean arg0) {
        field7113 = null;
        field7114 = null;
        field7115 = null;
        if (arg0) {
            field7115 = null;
        }
        field7111 = null;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(II[BIIII)V", line = 22)
    public static final void method2877(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
        field7110++;
        if (arg4 > 0 && !class32.method294(arg4, false)) {
            throw new IllegalArgumentException("");
        } else if (arg0 >= arg6 || class32.method294(arg6, false)) {
            int var7 = class578.method3304(arg1, (byte) -60);
            int var8 = 0;
            int var9 = arg4 < arg6 ? arg4 : arg6;
            int var10 = arg4 >> 1;
            int var11 = arg6 >> 1;
            byte[] var12 = arg2;
            byte[] var13 = new byte[var7 * var10 * var11];
            while (true) {
                OpenGL.glTexImage2Dub(arg3, var8, arg5, arg4, arg6, 0, arg1, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg4 * var7;
                byte[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            int var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var13[var17] = (byte) (var27 >> 2);
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                var13 = var12;
                arg6 = var11;
                var12 = var15;
                arg4 = var10;
                var11 >>= 0x1;
                var8++;
                var9 >>= 0x1;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)V", line = 118)
    public static final void method2878(byte arg0) {
        field7112++;
        class526.field7325.method739(2048);
        class330.field4742.method739(arg0 ^ 0xFFFFF783);
        if (arg0 != -125) {
            method2877(-58, -8, null, 65, 108, 18, 48);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lida;I)Lida;")
    public abstract class134 method271(class134 arg0, int arg1);
}
