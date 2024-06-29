import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public abstract class class228 extends class383 {

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "Ldq;")
    public static class493 field2919 = new class493(51, -1);

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public static int field2923 = 0;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public int field2917;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public int field2918;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "Lqn;")
    public static class47 field2922;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "[I")
    public int[] field2920;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method1385(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(Z)V")
    public static void method1386(boolean arg0) {
        if (!arg0) {
            field2919 = null;
        }
        field2922 = null;
        field2919 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public abstract void method1387(Canvas arg0, int arg1);

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB[BI)I")
    public static final int method1388(int arg0, byte arg1, byte[] arg2, int arg3) {
        field2916++;
        if (arg1 >= -121) {
            method1388(23, (byte) -13, null, 87);
        }
        int var4 = -1;
        for (int var5 = arg0; var5 < arg3; var5++) {
            var4 = var4 >>> 8 ^ class446.field6390[(arg2[var5] ^ var4) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public abstract void method1389(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5);
}
