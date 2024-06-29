import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class97 {

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "I")
    public static int field1337 = 0;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
    public static int field1334 = 2;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "Lik;")
    public static class463 field1332 = new class463("", 12);

    @OriginalMember(owner = "client!nr", name = "k", descriptor = "I")
    public static int field1341 = 0;

    @OriginalMember(owner = "client!nr", name = "l", descriptor = "Lpf;")
    public static class425 field1342 = new class425(49, -1);

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "J")
    public long field1339;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "Lnr;")
    public class97 field1331;

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "Lnr;")
    public class97 field1336;

    @OriginalMember(owner = "client!nr", name = "j", descriptor = "Z")
    public static boolean field1340;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lef;I)Lcj;")
    public static final class118 method623(class385 arg0, int arg1) {
        arg0.method2343(255);
        field1333++;
        int var2 = arg0.method2343(255);
        class118 var3 = class98.method627(var2, true);
        var3.field1551 = arg0.method2343(255);
        int var4 = arg0.method2343(255);
        int var5 = 0;
        int var6 = -109 % ((arg1 + 9) / 59);
        while (var5 < var4) {
            int var7 = arg0.method2343(255);
            var3.method24(var7, 1, arg0);
            var5++;
        }
        var3.method306(117);
        return var3;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)Z")
    public final boolean method624(int arg0) {
        if (arg0 != 18651) {
            method623((class385) null, 58);
        }
        field1335++;
        return this.field1336 != null;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)V")
    public final void method625(byte arg0) {
        field1338++;
        if (this.field1336 == null) {
            return;
        }
        if (arg0 != -50) {
            method623((class385) null, -14);
        }
        this.field1336.field1331 = this.field1331;
        this.field1331.field1336 = this.field1336;
        this.field1331 = null;
        this.field1336 = null;
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)V")
    public static void method626(int arg0) {
        field1332 = null;
        if (arg0 == -27961) {
            field1342 = null;
        }
    }
}
