import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class236 extends class222 {

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    public int field4210;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "[Lna;")
    public static class31[] field4212 = new class31[14];

    @OriginalMember(owner = "client!d", name = "n", descriptor = "I")
    public static int field4213 = 0;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "Lcf;")
    public static class93 field4208 = class147.method1066(")3", -48);

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(B)V")
    public static void method1609(byte arg0) {
        if (arg0 == 93) {
            field4212 = null;
            field4208 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)V")
    public static final void method1610(int arg0, byte arg1) {
        class222 var2 = class140.field2439.method132((byte) 103);
        int var3 = -59 / ((33 - arg1) / 50);
        while (var2 != null) {
            if ((long) arg0 == (var2.field4006 >> 48 & 0xFFFFL)) {
                var2.method1544((byte) -109);
            }
            var2 = class140.field2439.method136(114);
        }
        field4209++;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V")
    public class236() {
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V")
    public static final void method1611(boolean arg0) {
        if (!arg0) {
            method1611(false);
        }
        field4211++;
        class193.field3524.method300(0);
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(I)V")
    public class236(int arg0) {
        this.field4210 = arg0;
    }
}
