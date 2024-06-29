import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class316 extends class339 {

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
    public static int field4876 = 0;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "Ldf;")
    public static class177 field4871 = new class177(64);

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
    public int field4875;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "Ljava/lang/String;")
    public String field4869;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "Ljava/lang/String;")
    public String field4870;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)V", line = 14)
    public static void method2227(int arg0) {
        field4871 = null;
        if (arg0 > -63) {
            method2227(-122);
        }
    }

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "(I)Lla;", line = 27)
    public final class78 method2228(int arg0) {
        if (arg0 == 0) {
            field4874++;
            return class343.field5454[this.field5222];
        } else {
            return (class78) null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V", line = 46)
    public static final void method2229(boolean arg0) {
        if (!arg0) {
            field4872++;
            class43.field689.method655(-1);
        }
    }
}
