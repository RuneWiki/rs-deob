import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public class class685 {

    @OriginalMember(owner = "client!vha", name = "m", descriptor = "I")
    public static int field9279 = 0;

    @OriginalMember(owner = "client!vha", name = "n", descriptor = "[[I")
    public static int[][] field9280 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "I")
    public static int field9267;

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "I")
    public static int field9268;

    @OriginalMember(owner = "client!vha", name = "c", descriptor = "I")
    public int field9269;

    @OriginalMember(owner = "client!vha", name = "d", descriptor = "I")
    public int field9270;

    @OriginalMember(owner = "client!vha", name = "e", descriptor = "I")
    public int field9271;

    @OriginalMember(owner = "client!vha", name = "f", descriptor = "I")
    public int field9272;

    @OriginalMember(owner = "client!vha", name = "g", descriptor = "I")
    public int field9273;

    @OriginalMember(owner = "client!vha", name = "h", descriptor = "I")
    public int field9274;

    @OriginalMember(owner = "client!vha", name = "i", descriptor = "I")
    public int field9275;

    @OriginalMember(owner = "client!vha", name = "j", descriptor = "I")
    public int field9276;

    @OriginalMember(owner = "client!vha", name = "k", descriptor = "I")
    public static int field9277;

    @OriginalMember(owner = "client!vha", name = "l", descriptor = "I")
    public int field9278;

    @OriginalMember(owner = "client!vha", name = "o", descriptor = "I")
    public int field9281;

    @OriginalMember(owner = "client!vha", name = "p", descriptor = "I")
    public int field9282;

    @OriginalMember(owner = "client!vha", name = "q", descriptor = "I")
    public int field9283;

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(Lvha;Z)Z")
    public final boolean method3832(class685 arg0, boolean arg1) {
        if (arg1) {
            field9267++;
            return this.field9276 == arg0.field9276 && this.field9270 == arg0.field9270 && this.field9274 == arg0.field9274;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(I)I")
    public static final int method3833(int arg0) {
        field9268++;
        class59 var1 = class272.field3822;
        boolean var2 = false;
        if (class693.field9368.field4468.method1099(arg0 - 5766) != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class416.method2569(true, 0, null, 0, var3, null);
            var2 = true;
        }
        long var4 = class554.method3190(arg0 + 26482);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method212(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class554.method3190(-71) - var4);
        if (arg0 != -26584) {
            method3833(-124);
        }
        var1.method624(100, (byte) -125, 0, 0, 100, -16777216);
        if (var2) {
            var1.method614((byte) 121);
        }
        return var7;
    }

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "(I)V")
    public static void method3834(int arg0) {
        if (arg0 == 0) {
            field9280 = null;
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(B)Lca;")
    public static final class308 method3835(byte arg0) {
        field9277++;
        try {
            if (arg0 != -42) {
                field9279 = -23;
            }
            return (class308) Class.forName("vt").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }
}
