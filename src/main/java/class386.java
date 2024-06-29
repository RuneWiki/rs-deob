import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class386 {

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "Lmg;")
    private class96 field5719 = new class96();

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "Lnf;")
    private class389 field5729 = new class389();

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    private int field5727;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    private int field5728;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "Lfe;")
    private class384 field5726;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field5723 = -1;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "J")
    public static long field5725;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lmg;JI)V")
    public final void method2320(class96 arg0, long arg1, int arg2) {
        if (arg2 != 2592) {
            return;
        }
        field5720++;
        if (this.field5728 == 0) {
            class96 var5 = this.field5729.method2344(arg2 - 2591);
            var5.method536(false);
            var5.method589((byte) 51);
            if (this.field5719 == var5) {
                class96 var6 = this.field5729.method2344(1);
                var6.method536(false);
                var6.method589((byte) 51);
            }
        } else {
            this.field5728--;
        }
        this.field5726.method2317(arg2 ^ 0xFFFFF5DF, arg1, arg0);
        this.field5729.method2342((byte) 78, arg0);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZLgn;)V")
    public static final void method2321(boolean arg0, class475 arg1) {
        if (arg0) {
            class79.field1108.method2230(arg1.method2782((byte) 41), false);
            field5718++;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZJ)Lmg;")
    public final class96 method2322(boolean arg0, long arg1) {
        if (arg0) {
            return null;
        }
        field5724++;
        class96 var4 = (class96) this.field5726.method2310((byte) 92, arg1);
        if (var4 != null) {
            this.field5729.method2342((byte) 85, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
    public final void method2323(int arg0) {
        this.field5729.method2348(false);
        field5722++;
        this.field5726.method2315((byte) -128);
        if (arg0 == 1) {
            this.field5719 = new class96();
            this.field5728 = this.field5727;
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(I)V")
    public class386(int arg0) {
        this.field5727 = arg0;
        this.field5728 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field5726 = new class384(var2);
    }
}
