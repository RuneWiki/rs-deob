import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Graphics;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public abstract class class416 extends class425 {

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field6020 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public int field6015;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field6018;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public int field6019;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "Ljava/applet/Applet;")
    public static Applet field6017;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "[I")
    public int[] field6016;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
    public abstract void method821(int arg0, byte arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2534(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 <= 5) {
            field6021 = -124;
        }
        if (arg1 != 8 && arg1 != 16) {
            class370 var7 = class257.field3792[arg0][arg2][arg5];
            if (var7 == null) {
                var7 = new class370(arg0);
            }
            if (arg1 == 1) {
                var7.field5504 = (short) arg6;
                var7.field5498 = (short) arg3;
            } else if (arg1 == 2) {
                var7.field5502 = (short) arg3;
                var7.field5499 = (short) arg6;
            }
            if (class50.field1185) {
                client.method1808(-73);
            }
        } else if (arg1 == 8) {
            int var14 = arg2 << class30.field940;
            int var15 = class576.field8369 + var14;
            int var16 = arg5 << class30.field940;
            int var17 = var16 + class576.field8369;
            int var18 = class185.field2987[arg0].method551(arg2, arg5, (byte) -120);
            int var19 = class185.field2987[arg0].method551(arg2 + 1, arg5 + 1, (byte) -96);
            class649.field9365[class78.field1569++] = new class185(arg1, arg0, var14, var15, var15, var14, var18, var19, var19 - arg3, var18 - arg3, var16, var17, var17, var16);
        } else {
            int var8 = (arg2 << class30.field940) + class576.field8369;
            int var9 = var8 - class576.field8369;
            int var10 = arg5 << class30.field940;
            int var11 = class576.field8369 + var10;
            int var12 = class185.field2987[arg0].method551(arg2 + 1, arg5, (byte) -96);
            int var13 = class185.field2987[arg0].method551(arg2, arg5 + 1, (byte) -124);
            class649.field9365[class78.field1569++] = new class185(arg1, arg0, var8, var9, var9, var8, var12, var13, var13 - arg3, -arg3 + var12, var10, var11, var11, var10);
        }
        field6018++;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public abstract void method820(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public abstract void method819(Canvas arg0, int arg1);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public static void method2535(int arg0) {
        field6020 = null;
        field6017 = null;
        if (arg0 != -2) {
            method2535(122);
        }
    }
}
