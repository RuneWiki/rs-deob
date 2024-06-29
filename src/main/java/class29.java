import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public abstract class class29 {

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field395 = 0;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "Lce;")
    public static class126 field400 = class206.method1445(-7923, ")1 ");

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "Lce;")
    public static class126 field402 = class206.method1445(-7923, "");

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "Lml;")
    public static class160 field401 = new class160(4);

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "Lce;")
    public static class126 field410 = class206.method1445(-7923, "Hidden)2");

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
    public static int field412 = 0;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public int field405;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "Ljava/awt/Image;")
    public Image field407;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "[I")
    public int[] field403;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "[I")
    public static int[] field406;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "[[Z")
    public static boolean[][] field411;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIILcc;)[Ljk;", line = 10)
    public static final class273[] method134(int arg0, int arg1, int arg2, class313 arg3) {
        if (arg0 != 30214) {
            method140(-74);
        }
        field398++;
        return class298.method2012(arg2, (byte) -110, arg3, arg1) ? class165.method1208((byte) -46) : null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lwd;IBI)V", line = 30)
    public static final void method136(class112 arg0, int arg1, byte arg2, int arg3) {
        field409++;
        if (arg2 < 96) {
            method141((class237) null, (class94) null, true);
        }
        if (class173.field3067 < 2 && class257.field4316 == 0 && !class313.field5371) {
            return;
        }
        class126 var4 = class45.method279(false);
        if (arg0 == null) {
            int var5 = class200.field3414.method2143(var4, arg3 + 4, arg1 + 15, 16777215, 0, class107.field1680, class23.field338);
            class182.method1303(class200.field3414.method2154(var4) + var5, -1048576, arg1, 15, arg3 + 4);
            return;
        }
        class312 var6 = arg0.method744(23020, class119.field2007);
        if (var6 == null) {
            var6 = class200.field3414;
        }
        var6.method2147(var4, arg3, arg1, arg0.field1766, arg0.field1753, arg0.field1877, arg0.field1907, arg0.field1851, arg0.field1840, class107.field1680, class23.field338, class21.field286);
        class182.method1303(class21.field286[2], -1048576, class21.field286[1], class21.field286[3], class21.field286[0]);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V", line = 70)
    public final void method137(byte arg0) {
        class276.method1864(this.field403, this.field405, this.field397);
        if (arg0 >= -116) {
            method141((class237) null, (class94) null, true);
        }
        field408++;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)Z", line = 91)
    public static final boolean method138(int arg0, int arg1, int arg2) {
        int var3 = class26.field369[arg0][arg1][arg2];
        if (-class128.field2199 == var3) {
            return false;
        } else if (class128.field2199 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class8.method43(var4 + 1, class264.field4396[arg0][arg1][arg2], var5 + 1) && class8.method43(var4 + 128 - 1, class264.field4396[arg0][arg1 + 1][arg2], var5 + 1) && class8.method43(var4 + 128 - 1, class264.field4396[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class8.method43(var4 + 1, class264.field4396[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class26.field369[arg0][arg1][arg2] = class128.field2199;
                return true;
            } else {
                class26.field369[arg0][arg1][arg2] = -class128.field2199;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 120)
    public static void method140(int arg0) {
        field402 = null;
        field410 = null;
        field401 = null;
        field400 = null;
        if (arg0 != 11619) {
            method134(27, -98, 102, (class313) null);
        }
        field406 = null;
        field411 = (boolean[][]) null;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V", line = 137)
    protected class29() {
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lsi;Lec;Z)Lbi;", line = 147)
    public static final class201 method141(class237 arg0, class94 arg1, boolean arg2) {
        if (!arg2) {
            method140(-115);
        }
        field396++;
        long var3 = ((long) arg1.field1479 << 32) + ((long) arg1.field1478 << 56) + (long) ((arg1.field1476 + 1 << 16) + arg1.field1463);
        class201 var5 = (class201) arg0.method1631(false, var3);
        if (var5 == null) {
            var5 = new class201(arg1.field1476, (float) arg1.field1463, true, false, arg1.field1479);
            arg0.method1636(11311, var5, var3);
        }
        return var5;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public abstract void method133(int arg0, Component arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
    public abstract void method135(int arg0, int arg1, byte arg2, Graphics arg3);

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public abstract void method139(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5);
}
