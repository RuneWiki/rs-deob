import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class103 {

    @OriginalMember(owner = "client!wea", name = "d", descriptor = "J")
    private long field1189 = -1L;

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "Lv;")
    private class165 field1187 = new class165();

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!wea", name = "e", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!wea", name = "f", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!wea", name = "g", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "J")
    private long field1186;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)V", line = 5)
    public static final void method723(int arg0) {
        class544.field7578 = null;
        field1191++;
        class442.field6092 = null;
        class151.field1984 = null;
        class130.field1680 = null;
        int var1 = -27 / ((arg0 - 51) / 35);
        class546.field7590 = false;
        class48.field579 = null;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(II)V", line = 28)
    public static final void method724(int arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        field1188++;
        if (!class718.method4015(arg0, 125)) {
            return;
        }
        class115[] var2 = class609.field8594[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class115 var4 = var2[var3];
            if (var4 != null) {
                var4.field1554 = 1;
                var4.field1392 = 0;
                var4.field1390 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lgga;I)V", line = 66)
    private final void method725(class511 arg0, int arg1) {
        this.field1186 = arg0.method3020(true);
        field1192++;
        this.field1189 = arg0.method3020(true);
        for (int var3 = arg0.method3013(-124); var3 != 0; var3 = arg0.method3013(arg1 ^ 0xFFFFFF83)) {
            class54 var4;
            if (var3 == 1) {
                var4 = new class390();
            } else if (var3 == 4) {
                var4 = new class293();
            } else if (var3 == 3) {
                var4 = new class386();
            } else if (var3 == 2) {
                var4 = new class50();
            } else {
                throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
            }
            var4.method422(arg0, (byte) -21);
            this.field1187.method1039(var4, ~arg1);
        }
        if (arg1 != -1) {
            this.method726(null, (byte) -21);
        }
    }

    @OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(Lgga;)V", line = 144)
    public class103(class511 arg0) {
        this.method725(arg0, -1);
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lag;B)V", line = 118)
    public final void method726(class459 arg0, byte arg1) {
        field1190++;
        if (this.field1186 != arg0.field762 || this.field1189 != arg0.field6413) {
            throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + arg0.field762 + " updateNum:" + arg0.field6413 + " delta.clanHash:" + this.field1186 + " updateNum:" + this.field1189);
        }
        class54 var3 = (class54) this.field1187.method1041(1048832);
        if (arg1 != 75) {
            this.field1186 = -64L;
        }
        while (var3 != null) {
            var3.method419(arg0, -33);
            var3 = (class54) this.field1187.method1033(-1);
        }
        arg0.field6413++;
    }
}
