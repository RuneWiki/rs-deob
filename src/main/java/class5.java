import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 implements Runnable {

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "[Lnj;")
    public volatile class260[] field59 = new class260[2];

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Z")
    public volatile boolean field54 = false;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Z")
    public volatile boolean field58 = false;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field53 = 0;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "Lifa;")
    public static class450 field52 = new class450();

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "Lbja;")
    public static class34 field62 = new class34(8, 0, 4, 1);

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "F")
    public static float field56;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "Lbr;")
    public static class414 field63;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Llc;")
    public class675 field57;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V")
    public static void method103(boolean arg0) {
        if (!arg0) {
            field52 = null;
        }
        field62 = null;
        field63 = null;
        field52 = null;
    }

    @OriginalMember(owner = "client!dc", name = "run", descriptor = "()V")
    public final void run() {
        this.field58 = true;
        field55++;
        try {
            while (!this.field54) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class260 var2 = this.field59[var1];
                    if (var2 != null) {
                        var2.method1556(16128);
                    }
                }
                class594.method3405(10L, 16711680);
                class201.method1300(null, this.field57, (byte) -85);
            }
        } catch (Exception var9) {
            class705.method4008(var9, null, -124);
        } finally {
            Object var6 = null;
            this.field58 = false;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public static final void method104(int arg0, Canvas arg1) {
        field61++;
        Dimension var2 = arg1.getSize();
        class199.method1296(0, var2.width, var2.height);
        if (arg0 != -9626) {
            method103(true);
        }
        if (class727.field10184 == 1) {
            class434.field5738.method595(arg1, class608.field8178, class734.field10263);
        } else {
            class434.field5738.method595(arg1, class632.field8632, class176.field2182);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)I")
    public static int method105(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)Z")
    public static final boolean method106(byte arg0) {
        field60++;
        try {
            class780 var1 = new class780();
            byte[] var2 = var1.method4326(class575.field7866, (byte) 91);
            class748.method4180(0, var2);
            if (arg0 <= 22) {
                field53 = 31;
            }
            return true;
        } catch (Exception var3) {
            return false;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([J[Ljava/lang/Object;B)V")
    public static final void method107(long[] arg0, Object[] arg1, byte arg2) {
        class459.method2777(-16090, arg1, arg0.length - 1, arg0, 0);
        if (arg2 >= -35) {
            field52 = null;
        }
        field51++;
    }
}
