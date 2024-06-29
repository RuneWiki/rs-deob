import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class388 {

    @OriginalMember(owner = "client!he", name = "m", descriptor = "Z")
    public boolean field5534;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Lgq;")
    public static class538 field5523 = new class538(1);

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field5525 = 0;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "Ljo;")
    public static class351 field5526 = new class351(73, 0);

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field5533 = 0;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "J")
    public static long field5532 = 0L;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "Lfka;")
    public class741 field5527;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "Lfka;")
    public class741 field5529;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Z")
    public boolean field5524;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 4)
    public static void method2378(int arg0) {
        if (arg0 < 118) {
            field5531 = -86;
        }
        field5523 = null;
        field5526 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B[I)Ljava/lang/String;", line = 16)
    public static final String method2379(byte arg0, int[] arg1) {
        field5530++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class69.field932;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            class228 var5 = class488.field6906.method1601(arg1[var4], 35);
            if (var5.field3262 != -1) {
                class112 var6 = (class112) class688.field9745.method2373((long) var5.field3262, 103);
                if (var6 == null) {
                    class625 var7 = class625.method3580(class491.field6972, var5.field3262, 0);
                    if (var7 != null) {
                        var6 = class638.field8979.method482(var7, true);
                        class688.field9745.method2362(var6, 0, (long) var5.field3262);
                    }
                }
                if (var6 != null) {
                    class725.field10175[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        if (arg0 > -19) {
            return null;
        } else {
            return var2.toString();
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V", line = 76)
    public final void method2380(int arg0) {
        field5528++;
        if (this.field5529 != null) {
            this.field5529.method47((byte) -74);
        }
        this.field5524 = false;
        if (arg0 != 0) {
            method2379((byte) -67, null);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)Z", line = 91)
    public final boolean method2381(byte arg0) {
        if (arg0 < 100) {
            field5526 = null;
        }
        field5522++;
        return this.field5524 && !this.field5534;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Z)V", line = 121)
    public class388(boolean arg0) {
        this.field5534 = arg0;
    }
}
