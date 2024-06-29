import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class214 {

    @OriginalMember(owner = "client!h", name = "c", descriptor = "Lme;")
    private class668 field2753 = new class668(128);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "Lpe;")
    private class615 field2751;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "[[B")
    public static byte[][] field2754;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Lih;")
    public final class280 method1370(int arg0, int arg1) {
        field2756++;
        class668 var3 = this.field2753;
        class280 var4;
        synchronized (this.field2753) {
            var4 = (class280) this.field2753.method3655(arg1 - 240, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class615 var5 = this.field2751;
        byte[] var6;
        synchronized (this.field2751) {
            var6 = this.field2751.method3346(-1, 1, arg0);
        }
        if (arg1 != 128) {
            this.field2751 = null;
        }
        class280 var7 = new class280();
        if (var6 != null) {
            var7.method1684(arg1 - 25195, new class418(var6));
        }
        class668 var8 = this.field2753;
        synchronized (this.field2753) {
            this.field2753.method3650((long) arg0, -105, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    public static void method1371(byte arg0) {
        field2754 = null;
        if (arg0 != 18) {
            field2754 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(II)V")
    public final void method1372(int arg0, int arg1) {
        class668 var3 = this.field2753;
        synchronized (this.field2753) {
            this.field2753.method3659(-118, arg0);
            if (arg1 != 1) {
                this.method1372(-107, -114);
            }
        }
        field2758++;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public final void method1373(int arg0) {
        class668 var2 = this.field2753;
        synchronized (this.field2753) {
            this.field2753.method3658(0);
            if (arg0 > -110) {
                method1371((byte) 56);
            }
        }
        field2755++;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Canvas;ILe;)Loa;")
    public static final class43 method1374(Canvas arg0, int arg1, class702 arg2) {
        if (arg1 == 1) {
            field2752++;
            return new class396(arg0, arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
    public final void method1375(int arg0) {
        class668 var2 = this.field2753;
        synchronized (this.field2753) {
            this.field2753.method3656((byte) 0);
            int var3 = 49 / ((66 - arg0) / 35);
        }
        field2757++;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lvd;ILpe;)V")
    public class214(class635 arg0, int arg1, class615 arg2) {
        this.field2751 = arg2;
        this.field2751.method3341(1, -19046);
    }
}
