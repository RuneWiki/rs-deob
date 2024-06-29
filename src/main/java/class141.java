import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public abstract class class141 {

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "Ldh;")
    public static class320 field1584 = new class320(72, 6);

    @OriginalMember(owner = "client!fea", name = "d", descriptor = "Lbq;")
    public static class289 field1587 = new class289();

    @OriginalMember(owner = "client!fea", name = "e", descriptor = "I")
    public static int field1588 = 0;

    @OriginalMember(owner = "client!fea", name = "g", descriptor = "I")
    public static int field1590 = -1;

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!fea", name = "f", descriptor = "Lrc;")
    public static class536 field1589;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lgh;Ljava/lang/Object;B)V", line = 3)
    public static final void method885(class546 arg0, Object arg1, byte arg2) {
        field1586++;
        if (arg0.field7832 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field7832.peekEvent() != null; var3++) {
            class524.method3076(1, 1L);
        }
        try {
            if (arg1 != null) {
                arg0.field7832.postEvent(new ActionEvent(arg1, 1001, "dummy"));
            }
            if (arg2 != 104) {
                method885(null, null, (byte) 44);
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Z)V", line = 33)
    public static void method886(boolean arg0) {
        if (!arg0) {
            method885(null, null, (byte) -116);
        }
        field1587 = null;
        field1584 = null;
        field1589 = null;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lrr;[Lada;)V", line = 45)
    public static final void method887(class361 arg0, class163[] arg1) {
        if (class748.field10424) {
            int var2 = arg0.method1150((byte) -77, arg1);
            class563.field8026.method321(var2, arg1);
        }
        if (class504.field7120 == class159.field1758) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class340) {
                var5 = ((class340) arg0).field4395;
                var6 = ((class340) arg0).field4387;
            } else {
                var5 = arg0.field4635 >> class748.field10430;
                var6 = arg0.field4629 >> class748.field10430;
            }
            class563.field8026.method355(class11.field88[0].method1675(arg0.field4629, arg0.field4635, 65286), class439.method2739(var5, var6), class429.method2681(var5, var6), class304.method1827(var5, var6));
        }
        class547 var7 = arg0.method994((byte) -112, class563.field8026);
        if (var7 == null) {
            return;
        }
        if (arg0.field4637) {
            class569[] var8 = var7.field7870;
            for (int var9 = 0; var9 < var8.length; var9++) {
                class569 var10 = var8[var9];
                if (var10.field8082) {
                    class16.method75(var10.field8085 - var10.field8084, (byte) -121, var10.field8086 + var10.field8084, var10.field8083 - var10.field8084, var10.field8084 + var10.field8081);
                }
            }
        }
        if (var7.field7867) {
            var7.field7866 = arg0;
            if (class625.field8980) {
                class710 var11 = class36.field387;
                synchronized (class36.field387) {
                    class36.field387.method3968((byte) -63, var7);
                    return;
                }
            }
            class36.field387.method3968((byte) -63, var7);
            return;
        }
        class397.method2436(false, var7);
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(B)[Lkda;", line = 115)
    public static final class388[] method888(byte arg0) {
        field1585++;
        int var1 = -125 / ((27 - arg0) / 32);
        return new class388[] { class635.field9134, class754.field10528, class652.field9309 };
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(B)J")
    public abstract long method280(byte arg0);
}
