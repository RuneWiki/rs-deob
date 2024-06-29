import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public abstract class class221 {

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public int field4248;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public int field4251;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public int field4246;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "[Lrd;")
    public static class173[] field4244 = new class173[1000];

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field4241 = 1;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Lrd;")
    private static class173 field4249 = class133.method843("Loaded wordpack", -75);

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field4250 = 0;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lrd;")
    private static class173 field4245 = class133.method843("Loading )2 please wait)3", 59);

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Lrd;")
    public static class173 field4243 = field4249;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Lrd;")
    public static class173 field4252 = field4245;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "Lrd;")
    private static class173 field4253 = class133.method843("Login limit exceeded)3", 71);

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Lrd;")
    public static class173 field4242 = field4253;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)V")
    public abstract void method393(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public static void method1437(int arg0) {
        field4253 = null;
        field4242 = null;
        field4245 = null;
        field4243 = null;
        int var1 = -57 / ((-arg0 - 50) / 54);
        field4249 = null;
        field4252 = null;
        field4244 = null;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(III)V")
    public abstract void method394(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V")
    public static final void method1438(int arg0, int arg1) {
        field4247++;
        if (arg1 == -1 || !class212.method1389(-127, arg1)) {
            return;
        }
        class165[] var2 = class63.field1232[arg1];
        if (arg0 >= -25) {
            return;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class165 var4 = var2[var3];
            if (var4.field3096 != null) {
                class117 var5 = new class117();
                var5.field2174 = var4.field3096;
                var5.field2155 = var4;
                class203.method1353(-73, 2000000, var5);
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(III)V")
    public class221(int arg0, int arg1, int arg2) {
        this.field4248 = arg0;
        this.field4251 = arg2;
        this.field4246 = arg1;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIB)V")
    public abstract void method399(int arg0, int arg1, byte arg2);
}
