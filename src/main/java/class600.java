import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class600 {

    @OriginalMember(owner = "client!nea", name = "e", descriptor = "I")
    public int field8555;

    @OriginalMember(owner = "client!nea", name = "f", descriptor = "Luf;")
    public static class519 field8556 = null;

    @OriginalMember(owner = "client!nea", name = "c", descriptor = "I")
    public static int field8553;

    @OriginalMember(owner = "client!nea", name = "d", descriptor = "I")
    public static int field8554;

    @OriginalMember(owner = "client!nea", name = "g", descriptor = "I")
    public static int field8557;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "Llga;")
    public static class20 field8551;

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "Lhe;")
    public static class619 field8552;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(B)V")
    public static void method3494(byte arg0) {
        field8556 = null;
        if (arg0 != -116) {
            method3496(null, false);
        }
        field8552 = null;
        field8551 = null;
    }

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(B)V")
    public static final void method3495(byte arg0) {
        class20.field200 = class253.field3624;
        class547.field7575 = new class131[500];
        class300.field4323 = 0;
        class289.field4221 = new class131[1000];
        class98.field1419 = class253.field3624;
        class258.field3667 = 0;
        class401.field5524 = false;
        field8554++;
        class695.field9788 = new int[class169.field2565][class42.field520 + 1][class681.field9665 + 1];
        class792.field10863 = new class131[2000];
        if (arg0 >= -24) {
            method3496(null, true);
        }
        class393.field5456 = 0;
        class260.field3684 = 0;
        class717.field10013 = new class131[500];
        if (class29.field307 instanceof class53) {
            class83.field1263 = false;
        } else {
            class83.field1263 = true;
        }
    }

    @OriginalMember(owner = "client!nea", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8553++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(I)V")
    public class600(int arg0) {
        this.field8555 = arg0;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(Lkm;Z)V")
    public static final void method3496(class208 arg0, boolean arg1) {
        for (int var2 = arg0.field3027; var2 <= arg0.field3030; var2++) {
            for (int var3 = arg0.field3035; var3 <= arg0.field3038; var3++) {
                class172 var4 = class514.field7096[arg0.field10361][var2][var3];
                if (var4 != null) {
                    class11 var5 = var4.field2594;
                    class11 var6 = null;
                    while (var5 != null) {
                        if (var5.field143 == arg0) {
                            if (var6 == null) {
                                var4.field2594 = var5.field145;
                            } else {
                                var6.field145 = var5.field145;
                            }
                            var5.method155((byte) -38);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field145;
                    }
                }
            }
        }
        if (!arg1) {
            class347.method2117(arg0);
        }
    }
}
