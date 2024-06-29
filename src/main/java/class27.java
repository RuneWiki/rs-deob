import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class27 extends class225 {

    @OriginalMember(owner = "client!sq", name = "G", descriptor = "Lkg;")
    public class215 field391;

    @OriginalMember(owner = "client!sq", name = "A", descriptor = "Lja;")
    public class90 field385;

    @OriginalMember(owner = "client!sq", name = "D", descriptor = "Lcr;")
    public static class189 field388 = new class189(50);

    @OriginalMember(owner = "client!sq", name = "x", descriptor = "I")
    public int field382;

    @OriginalMember(owner = "client!sq", name = "B", descriptor = "I")
    public int field386;

    @OriginalMember(owner = "client!sq", name = "C", descriptor = "I")
    public int field387;

    @OriginalMember(owner = "client!sq", name = "E", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!sq", name = "F", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!sq", name = "H", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!sq", name = "J", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!sq", name = "K", descriptor = "I")
    public int field394;

    @OriginalMember(owner = "client!sq", name = "L", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!sq", name = "M", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!sq", name = "N", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "client!sq", name = "O", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!sq", name = "y", descriptor = "Ldm;")
    public static class110 field383;

    @OriginalMember(owner = "client!sq", name = "w", descriptor = "[I")
    public static int[] field381;

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "[I")
    public static int[] field384;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IB)C", line = 6)
    public static final char method189(int arg0, byte arg1) {
        field398++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class451.field6586[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) (arg0 == -24769 ? (char) var2 : 65426);
    }

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "(I)V", line = 33)
    public static void method190(int arg0) {
        field388 = null;
        field381 = null;
        if (arg0 == -23358) {
            field384 = null;
            field383 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(Z)V", line = 47)
    public static final void method191(boolean arg0) {
        if (!arg0) {
            field384 = null;
        }
        field389++;
        class189 var1 = class346.field4984;
        synchronized (class346.field4984) {
            class346.field4984.method1141(256);
        }
    }

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "(I)V", line = 61)
    public final void method192(int arg0) {
        this.field382 = this.field391.field2862;
        this.field386 = this.field391.field2873;
        this.field397 = this.field391.field2872;
        field390++;
        if (this.field391.field2870 != null) {
            this.field391.field2870.method979(this.field385.field1277, this.field385.field1261, this.field385.field1265, class90.field1259);
        }
        this.field387 = class90.field1259[0];
        if (arg0 > -104) {
            method193(32);
        }
        this.field394 = class90.field1259[2];
    }

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "(I)V", line = 82)
    public static final void method193(int arg0) {
        if (arg0 < 100) {
            method190(48);
        }
        field392++;
        if (class262.field3797 > 0) {
            class91.method637(-111);
        } else {
            class435.field6400 = class191.field2558;
            class191.field2558 = null;
            class232.method1391(-26, 40);
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lkg;Lkr;)V", line = 120)
    public class27(class215 arg0, class6 arg1) {
        this.field391 = arg0;
        this.field385 = class68.method457(arg0.field2860, 0);
        this.method192(-128);
    }
}
