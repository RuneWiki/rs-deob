import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public abstract class class737 extends class627 {

    @OriginalMember(owner = "client!si", name = "s", descriptor = "I")
    public static int field10329 = -1;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "[I")
    public static int[] field10322 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

    @OriginalMember(owner = "client!si", name = "o", descriptor = "[[I")
    public static int[][] field10325 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!si", name = "k", descriptor = "Ldh;")
    public static class286 field10321 = new class286("stellardawn", 1);

    @OriginalMember(owner = "client!si", name = "t", descriptor = "Z")
    public static boolean field10330 = false;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field10320;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public int field10323;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "I")
    public static int field10324;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    public static int field10326;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    public int field10328;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "[I")
    public int[] field10327;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
    public static final void method4131(int arg0, int arg1) {
        field10326++;
        if (class666.method3606(77, arg1)) {
            class66.method502(1, -1, class323.field4125[arg1]);
            if (arg0 != 0) {
                method4131(29, 65);
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIILjava/awt/Graphics;III)V")
    public abstract void method1006(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/awt/Canvas;III)V")
    public abstract void method1007(Canvas arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ltha;B[[B)V")
    public static final void method4132(class486 arg0, byte arg1, byte[][] arg2) {
        int var3 = -59 % ((arg1 + 8) / 36);
        field10320++;
        int var4 = class688.field9766.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var6 = arg2[var5];
            if (var6 != null) {
                int var7 = (class248.field3162[var5] >> 8) * 64 - class63.field851;
                int var8 = (class248.field3162[var5] & 0xFF) * 64 - class753.field10509;
                class384.method2308(-88);
                arg0.method2835(var6, 4, class410.field5786, class458.field6407, var7, var8);
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V")
    public static void method4133(boolean arg0) {
        field10325 = null;
        field10321 = null;
        if (arg0) {
            method4132(null, (byte) -69, null);
        }
        field10322 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZ)V")
    public static final void method4134(int arg0, boolean arg1) {
        if (class244.field3142 == 0) {
            class106.field1297.method3695(arg0, 0);
        } else {
            class74.field991 = arg0;
        }
        field10324++;
        if (arg1) {
            field10322 = null;
        }
    }
}
