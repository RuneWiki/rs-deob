import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class152 extends Canvas {

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Ljava/awt/Component;")
    private Component field2909;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Lob;")
    public static class141 field2911 = class175.method1195(40, "oder ung-Ultiges Passwort)3");

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Lob;")
    public static class141 field2916 = class175.method1195(40, "_");

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field2913 = 0;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Lob;")
    private static class141 field2919 = class175.method1195(40, "Loading sprites )2 ");

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "Lob;")
    public static class141 field2912 = field2919;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Lca;")
    public static class22 field2918;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "Li;")
    public static class80 field2917;

    @OriginalMember(owner = "client!pc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field2909.update(arg0);
        field2914++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
    public static void method1050(boolean arg0) {
        field2918 = null;
        field2911 = null;
        field2917 = null;
        if (arg0) {
            field2913 = 96;
        }
        field2912 = null;
        field2919 = null;
        field2916 = null;
    }

    @OriginalMember(owner = "client!pc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field2909.paint(arg0);
        field2906++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Lhh;")
    public static final class78 method1051(int arg0, int arg1) {
        field2908++;
        if (arg0 != 0) {
            return null;
        }
        class78 var2 = (class78) class125.field2405.method1383((long) arg1, (byte) 122);
        if (var2 != null) {
            return var2;
        }
        class78 var3 = class63.method421((byte) -78, false, arg1, class76.field1555, class10.field185);
        if (var3 != null) {
            class125.field2405.method1378(var3, (byte) -92, (long) arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class152(Component arg0) {
        this.field2909 = arg0;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1052(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2907++;
        int var7 = class106.method703(class35.field698, class130.field2470, true, arg1);
        int var8 = class106.method703(class35.field698, class130.field2470, true, arg5);
        int var9 = class106.method703(class68.field1323, class136.field2590, true, arg0);
        if (arg3 != 0) {
            field2912 = null;
        }
        int var10 = class106.method703(class68.field1323, class136.field2590, true, arg6);
        int var11 = class106.method703(class35.field698, class130.field2470, true, arg1 + arg4);
        int var12 = class106.method703(class35.field698, class130.field2470, true, arg5 - arg4);
        for (int var13 = var7; var13 < var11; var13++) {
            class180.method1217(var10, (byte) 52, var9, arg2, class41.field805[var13]);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class180.method1217(var10, (byte) 52, var9, arg2, class41.field805[var14]);
        }
        int var15 = class106.method703(class68.field1323, class136.field2590, true, arg0 + arg4);
        int var16 = class106.method703(class68.field1323, class136.field2590, true, arg6 - arg4);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class41.field805[var17];
            class180.method1217(var15, (byte) 52, var9, arg2, var18);
            class180.method1217(var10, (byte) 52, var16, arg2, var18);
        }
    }
}
