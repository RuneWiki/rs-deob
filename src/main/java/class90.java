import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class90 {

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "I")
    public static int field1333 = 0;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "Leda;")
    public static class116 field1331 = new class116(28, 17);

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!wea", name = "d", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!wea", name = "e", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!wea", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1334++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(B)V")
    public static void method671(byte arg0) {
        field1331 = null;
        if (arg0 != -98) {
            field1331 = null;
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Z)Z")
    public final boolean method672(boolean arg0) {
        if (!arg0) {
            this.method672(false);
        }
        field1335++;
        return class242.field3548 == this | class400.field5793 == this;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(ZLek;)La;")
    public static final class609 method673(boolean arg0, class465 arg1) {
        if (!arg0) {
            method673(false, null);
        }
        field1332++;
        int var2 = arg1.method2755((byte) -91);
        class186 var3 = class405.method2437((byte) -106)[arg1.method2705(-24)];
        class409 var4 = class113.method919(false)[arg1.method2705(-104)];
        int var5 = arg1.method2744(-1);
        int var6 = arg1.method2744(-1);
        return new class609(var2, var3, var4, var5, var6);
    }
}
