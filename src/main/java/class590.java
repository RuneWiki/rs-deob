import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class590 {

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Lsw;")
    private class641 field8551 = new class641(64);

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "Lsw;")
    public class641 field8560 = new class641(64);

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Ldn;")
    private class438 field8554;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "Ldn;")
    public class438 field8553;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Z")
    public static boolean field8552 = false;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field8557 = 0;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "Lcea;")
    public static class180 field8556 = new class180(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field8549;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field8550;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field8555;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field8558;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field8559;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Lha;")
    public static class52 field8548;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)Lwn;")
    public final class615 method3419(int arg0, int arg1) {
        field8549++;
        class641 var3 = this.field8551;
        class615 var4;
        synchronized (this.field8551) {
            var4 = (class615) this.field8551.method3682(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        int var5 = -33 / ((66 - arg1) / 43);
        class438 var6 = this.field8554;
        byte[] var7;
        synchronized (this.field8554) {
            var7 = this.field8554.method2558(100, arg0, 34);
        }
        class615 var8 = new class615();
        var8.field8922 = this;
        if (var7 != null) {
            var8.method3535(false, new class374(var7));
        }
        class641 var9 = this.field8551;
        synchronized (this.field8551) {
            this.field8551.method3684(var8, 0, (long) arg0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
    public final void method3420(boolean arg0) {
        class641 var2 = this.field8551;
        synchronized (this.field8551) {
            this.field8551.method3694(0);
        }
        field8555++;
        if (arg0) {
            class641 var3 = this.field8560;
            synchronized (this.field8560) {
                this.field8560.method3694(0);
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)V")
    public final void method3421(int arg0, int arg1) {
        class641 var3 = this.field8551;
        synchronized (this.field8551) {
            this.field8551.method3686((byte) 53, arg1);
            if (arg0 != 16261) {
                this.method3423(-15, -95, -84);
            }
        }
        field8550++;
        class641 var4 = this.field8560;
        synchronized (this.field8560) {
            this.field8560.method3686((byte) 53, arg1);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public final void method3422(byte arg0) {
        class641 var2 = this.field8551;
        synchronized (this.field8551) {
            this.field8551.method3687(1402);
            if (arg0 != 120) {
                this.field8554 = null;
            }
        }
        field8558++;
        class641 var3 = this.field8560;
        synchronized (this.field8560) {
            this.field8560.method3687(1402);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
    public final void method3423(int arg0, int arg1, int arg2) {
        if (arg1 != 27936) {
            this.method3421(-34, 115);
        }
        field8559++;
        this.field8551 = new class641(arg2);
        this.field8560 = new class641(arg0);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static void method3424(int arg0) {
        field8548 = null;
        field8556 = null;
        if (arg0 != 0) {
            field8552 = false;
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lre;ILdn;Ldn;)V")
    public class590(class515 arg0, int arg1, class438 arg2, class438 arg3) {
        this.field8554 = arg2;
        this.field8553 = arg3;
        this.field8554.method2554(34, 126);
    }
}
