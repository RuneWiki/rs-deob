import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class26 {

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "Lak;")
    public static class234 field318 = new class234("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "[Lcl;")
    public static class177[] field319 = new class177[2048];

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "[F")
    public static float[] field321 = new float[4];

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "[I")
    public static int[] field323 = new int[5];

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "Lob;")
    public static class521 field320 = new class521(26, 7);

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "Lak;")
    public static class234 field324 = new class234(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "([IIIIIIII)V", line = 17)
    public static final void method183(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field322++;
        if (arg3 > 0 && !class474.method2851(arg3, (byte) 104)) {
            throw new IllegalArgumentException("");
        } else if (arg5 > 0 && !class474.method2851(arg5, (byte) -23)) {
            throw new IllegalArgumentException("");
        } else if (arg6 == 32993) {
            int var8 = 0;
            int var9 = arg3 >= arg5 ? arg5 : arg3;
            if (arg2 != -792335088) {
                field319 = null;
            }
            int var10 = arg3 >> 1;
            int var11 = arg5 >> 1;
            int[] var12 = arg0;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg4, var8, arg7, arg3, arg5, 0, arg6, arg1, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = arg3 + var15;
                for (int var17 = 0; var17 < var11; var17++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var15++];
                        int var22 = var12[var16++];
                        int var23 = var12[var16++];
                        int var24 = (var20 & 0xFF2D) >> 8;
                        int var25 = var20 >> 24 & 0xFF;
                        int var26 = var20 & 0xFF;
                        int var27 = (var20 & 0xFFCFA9) >> 16;
                        int var28 = ((var21 & 0xFF3284) >> 16) + var27;
                        int var29 = (var21 >> 8 & 0xFF) + var24;
                        int var30 = (var21 >> 24 & 0xFF) + var25;
                        int var31 = (var21 & 0xFF) + var26;
                        int var32 = (var22 >> 24 & 0xFF) + var30;
                        int var33 = ((var22 & 0xFF4F) >> 8) + var29;
                        int var34 = (var22 & 0xFF) + var31;
                        int var35 = ((var22 & 0xFFB1B3) >> 16) + var28;
                        int var36 = (var23 >> 8 & 0xFF) + var33;
                        int var37 = ((var23 & 0xFF0DD7) >> 16) + var35;
                        int var38 = (var23 >> 24 & 0xFF) + var32;
                        int var39 = (var23 & 0xFF) + var34;
                        var13[var14++] = class264.method1763(class74.method644(var39 >> 2, 255), class264.method1763(class74.method644(var36 << 6, 65280), class264.method1763(class74.method644(16711680, var37 << 14), class74.method644(var38 << 22, -16777216))));
                    }
                    var15 += arg3;
                    var16 += arg3;
                }
                int[] var18 = var13;
                var13 = var12;
                arg5 = var11;
                arg3 = var10;
                var12 = var18;
                var11 >>= 0x1;
                var10 >>= 0x1;
                var8++;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IB)V", line = 124)
    public static final void method184(int arg0, byte arg1) {
        field317++;
        if (arg1 != -103) {
            method183(null, 52, 47, 115, -1, -36, 2, -31);
        }
        class121.field1826 = 1000 / arg0;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V", line = 138)
    public static void method185(byte arg0) {
        field321 = null;
        field318 = null;
        field324 = null;
        field319 = null;
        if (arg0 != 22) {
            field323 = null;
        }
        field323 = null;
        field320 = null;
    }
}
