import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class385 {

    @OriginalMember(owner = "client!j", name = "e", descriptor = "Lfc;")
    private class174 field5415 = new class174(64);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "Loi;")
    private class53 field5411;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public int field5413;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "Lza;")
    public static class290 field5414;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "Lsl;")
    public static class323 field5412;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BI)Lnw;", line = 3)
    public final class422 method2234(byte arg0, int arg1) {
        field5417++;
        class174 var3 = this.field5415;
        class422 var4;
        synchronized (this.field5415) {
            var4 = (class422) this.field5415.method1088((long) arg1, (byte) 38);
        }
        if (var4 != null) {
            return var4;
        }
        class53 var5 = this.field5411;
        byte[] var6;
        synchronized (this.field5411) {
            var6 = this.field5411.method426(19, (byte) 9, arg1);
        }
        class422 var7 = new class422();
        if (var6 != null) {
            var7.method2504(new class403(var6), (byte) 114);
        }
        class174 var8 = this.field5415;
        synchronized (this.field5415) {
            if (arg0 != 77) {
                field5414 = null;
            }
            this.field5415.method1097(19627, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V", line = 33)
    public static final void method2235(byte arg0) {
        field5416++;
        for (int var1 = 0; var1 < 100; var1++) {
            class306.field4450[var1] = true;
        }
        if (arg0 <= 38) {
            field5414 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V", line = 55)
    public static void method2236(boolean arg0) {
        if (arg0) {
            field5414 = null;
        }
        field5412 = null;
        field5414 = null;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lle;ILoi;)V", line = 80)
    public class385(class205 arg0, int arg1, class53 arg2) {
        this.field5411 = arg2;
        this.field5413 = this.field5411.method435(19, 0);
    }
}
