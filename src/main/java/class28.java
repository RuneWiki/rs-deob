import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class28 {

    @OriginalMember(owner = "client!be", name = "i", descriptor = "Lhu;")
    private class76 field374 = new class76(64);

    @OriginalMember(owner = "client!be", name = "h", descriptor = "Lr;")
    private class110 field373;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field370 = 0;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field376 = 0;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "[Lnt;")
    public static class134[] field377 = new class134[14];

    @OriginalMember(owner = "client!be", name = "g", descriptor = "Lmc;")
    public static class78 field372 = new class78(27, 3);

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Le;")
    public static class341 field366;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field378;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 6)
    public static void method161(int arg0) {
        field378 = null;
        field377 = null;
        if (arg0 != 0) {
            field376 = -48;
        }
        field366 = null;
        field372 = null;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V", line = 20)
    public final void method162(int arg0) {
        class76 var2 = this.field374;
        synchronized (this.field374) {
            this.field374.method495(-87);
        }
        field369++;
        if (arg0 != -28232) {
            this.method165(-63, -68);
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V", line = 36)
    public final void method163(int arg0) {
        field368++;
        int var2 = 51 / ((34 - arg0) / 56);
        class76 var3 = this.field374;
        synchronized (this.field374) {
            this.field374.method502(0);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Lvp;", line = 58)
    public final class112 method164(int arg0, int arg1) {
        if (arg0 != 27) {
            field376 = -46;
        }
        field375++;
        class76 var3 = this.field374;
        class112 var4;
        synchronized (this.field374) {
            var4 = (class112) this.field374.method493((byte) 19, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field373.method702((byte) -62, arg1, 11);
        class112 var6 = new class112();
        if (var5 != null) {
            var6.method719(new class32(var5), -1);
        }
        class76 var7 = this.field374;
        synchronized (this.field374) {
            this.field374.method505((long) arg1, var6, 42);
            return var6;
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(II)V", line = 85)
    public final void method165(int arg0, int arg1) {
        field371++;
        class76 var3 = this.field374;
        synchronized (this.field374) {
            this.field374.method496(arg1, -119);
        }
        int var4 = -66 / ((64 - arg0) / 45);
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Ldn;ILr;)V", line = 105)
    public class28(class329 arg0, int arg1, class110 arg2) {
        this.field373 = arg2;
        if (this.field373 != null) {
            this.field373.method694(11, (byte) 119);
        }
    }
}
