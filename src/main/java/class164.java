import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class164 {

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "Lvj;")
    public static class373 field2001 = new class373(60, -1);

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "Ljs;")
    public static class275 field2007;

    @OriginalMember(owner = "client!ru", name = "j", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
    public int field1999;

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "I")
    public int field2002;

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "I")
    public int field2004;

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "I")
    public int field2005;

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)V")
    public static void method892(byte arg0) {
        field2007 = null;
        if (arg0 != -11) {
            field2008 = -128;
        }
        field2001 = null;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Ljava/lang/String;ZLra;I)V")
    public static final void method893(String arg0, boolean arg1, class90 arg2, int arg3) {
        field2006++;
        if (arg3 != 19206) {
            field2008 = -127;
        }
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class92.field1129.method1238(250, null, 19635, arg0);
        int var8 = class92.field1129.method1245(arg0, false, null, 250) * 13;
        class210.field2560.method1133(var5 - var4, -var4 + var6, var4 + var7 + var4, var4 + var8 + var4, -16777216, 0);
        class210.field2560.method1142(var5 - var4, -var4 + var6, var7 - (-var4 - var4), var4 + var8 - -var4, -1, 0);
        arg2.method550(null, var6, null, 1, null, arg0, var8, 0, 0, true, -1, var7, var5, -1, 0, 1);
        class450.method2636(var4 + var8 + var4, -var4 + var6, var4 + var7 + var4, 0, var5 - var4);
        if (arg1) {
            class210.field2560.method1123();
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIILig;)V")
    public static final void method894(int arg0, int arg1, int arg2, int arg3, class202 arg4) {
        class349 var5 = class78.method450(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field2425 = (arg1 << class362.field4756) + class410.field5342;
        arg4.field2420 = arg3;
        arg4.field2422 = (arg2 << class362.field4756) + class410.field5342;
        for (class61 var7 = var5.field4499; var7 != null; var7 = var7.field595) {
            if (var7.field589.field8648) {
                int var8 = var7.field589.method322(64);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field2420 += var6;
            arg4.field2427 = true;
        } else if (var5.field4506 != null) {
            arg4.field2420 -= var5.field4506.field235;
        }
        var5.field4509 = arg4;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lfp;B)Z")
    public static final boolean method895(class269 arg0, byte arg1) {
        int var2 = -82 % ((-arg1 - 37) / 32);
        field2000++;
        class437 var3 = class16.field126.method1759(false, arg0.method342(-2329));
        if (var3.field5943 == -1) {
            return true;
        } else {
            class615 var4 = class284.field3721.method3419(var3.field5943, -92);
            return var4.field8916 == -1 ? true : var4.method3539(-14730);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIII[BII)V")
    public static final void method896(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        field2003++;
        if (arg3 > 0 && !class415.method2366(arg5 - 123, arg3)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class415.method2366(-126, arg0)) {
            int var7 = class53.method302((byte) -126, arg6);
            if (arg5 != 1) {
                method892((byte) -91);
            }
            int var8 = 0;
            int var9 = arg0 <= arg3 ? arg0 : arg3;
            int var10 = arg3 >> 1;
            int var11 = arg0 >> 1;
            byte[] var12 = arg4;
            byte[] var13 = new byte[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Dub(arg1, var8, arg2, arg3, arg0, 0, arg6, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg3 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            int var25 = var12[var19] + var24;
                            var18 = var7 + var23;
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
                byte[] var16 = var13;
                var13 = var12;
                arg3 = var10;
                arg0 = var11;
                var12 = var16;
                var10 >>= 0x1;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    static {
        new class180("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field2007 = new class275(13, 0, 1, 0);
        field2008 = -1;
    }
}
