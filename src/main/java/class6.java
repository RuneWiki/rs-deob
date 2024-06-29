import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BEGVKNAP")
public class class6 {

    @OriginalMember(owner = "client!BEGVKNAP", name = "a", descriptor = "Z")
    private boolean field71 = true;

    @OriginalMember(owner = "client!BEGVKNAP", name = "c", descriptor = "I")
    private int field73;

    @OriginalMember(owner = "client!BEGVKNAP", name = "d", descriptor = "[LDOUWNVSH;")
    private class13[] field74;

    @OriginalMember(owner = "client!BEGVKNAP", name = "b", descriptor = "I")
    private int field72;

    @OriginalMember(owner = "client!BEGVKNAP", name = "<init>", descriptor = "(II)V")
    public class6(int arg0, int arg1) {
        this.field73 = arg1;
        this.field74 = new class13[arg1];
        for (int var3 = 0; var3 < arg1; var3++) {
            class13 var4 = this.field74[var3] = new class13();
            var4.field712 = var4;
            var4.field713 = var4;
        }
        if (arg0 != 45840) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!BEGVKNAP", name = "a", descriptor = "(J)LDOUWNVSH;")
    public class13 method36(long arg0) {
        class13 var3 = this.field74[(int) (arg0 & (long) (this.field73 - 1))];
        for (class13 var4 = var3.field712; var4 != var3; var4 = var4.field712) {
            if (var4.field711 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!BEGVKNAP", name = "a", descriptor = "(BJLDOUWNVSH;)V")
    public void method37(byte arg0, long arg1, class13 arg2) {
        if (arg2.field713 != null) {
            arg2.method205();
        }
        class13 var5 = this.field74[(int) (arg1 & (long) (this.field73 - 1))];
        arg2.field713 = var5.field713;
        arg2.field712 = var5;
        arg2.field713.field712 = arg2;
        arg2.field712.field713 = arg2;
        arg2.field711 = arg1;
        if (arg0 != -90) {
            this.field72 = 411;
        }
    }
}
