import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class591 {

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "I")
    public int field8331 = 0;

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "I")
    public int field8328 = 0;

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "Lpca;")
    private class714 field8333 = new class714(64);

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "Lkh;")
    private class15 field8334 = null;

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "Lfp;")
    private class323 field8329;

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "Lfp;")
    private class323 field8326;

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "Lbg;")
    public static class464 field8332 = new class464();

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "I")
    public static int field8324;

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
    public static int field8325;

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "I")
    public static int field8327;

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
    public static int field8330;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IZ)Lmn;", line = 7)
    public final class366 method3340(int arg0, boolean arg1) {
        field8330++;
        class366 var3 = (class366) this.field8333.method4022((long) arg0, (byte) 103);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field8329.method2100(arg0 & 0x7FFF, (byte) 112, 1);
        } else {
            var4 = this.field8326.method2100(arg0, (byte) 112, 1);
        }
        class366 var5 = new class366();
        if (arg1) {
            method3341(null, null, (byte) -25);
        }
        var5.field5189 = this;
        if (var4 != null) {
            var5.method2329(-74, new class675(var4));
        }
        if (arg0 >= 32768) {
            var5.method2337((byte) -79);
        }
        this.field8333.method4018((byte) 127, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "([Ljava/lang/String;[SB)V", line = 41)
    public static final void method3341(String[] arg0, short[] arg1, byte arg2) {
        if (arg2 == 91) {
            field8327++;
            class509.method3010(arg0, arg0.length - 1, true, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V", line = 55)
    public static void method3342(int arg0) {
        if (arg0 == 1) {
            field8332 = null;
        }
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(ILfp;Lfp;Lkh;)V", line = 128)
    public class591(int arg0, class323 arg1, class323 arg2, class15 arg3) {
        this.field8329 = arg2;
        this.field8334 = arg3;
        this.field8326 = arg1;
        if (this.field8326 != null) {
            this.field8328 = this.field8326.method2084(1, 0);
        }
        if (this.field8329 != null) {
            this.field8331 = this.field8329.method2084(1, 0);
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZJLas;[I)Ljava/lang/String;", line = 76)
    public final String method3343(boolean arg0, long arg1, class151 arg2, int[] arg3) {
        if (arg0) {
            this.method3340(114, true);
        }
        field8325++;
        if (this.field8334 != null) {
            String var6 = this.field8334.method99(arg3, arg2, arg1, false);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg1);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILjava/awt/Canvas;)V", line = 111)
    public static final void method3344(int arg0, Canvas arg1) {
        field8324++;
        Dimension var2 = arg1.getSize();
        if (arg0 != 27634) {
            method3341(null, null, (byte) 93);
        }
        class492.method2930(var2.height, 0, var2.width);
        if (class221.field2883 == 1) {
            class263.field3799.method403(arg1, class414.field5838, class712.field9900);
        } else {
            class263.field3799.method403(arg1, class260.field3746, class586.field8252);
        }
    }
}
