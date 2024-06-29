import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class128 {

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "Z")
    public boolean field1336 = false;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public int field1337 = 64;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public int field1344 = 64;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "Z")
    public boolean field1343 = false;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    public int field1346 = 2;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public int field1348 = 1;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public int field1345 = -1;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "[I")
    public static int[] field1341 = new int[6];

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "Ldh;")
    public static class320 field1338 = new class320(64, -2);

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "[I")
    public static int[] field1347 = new int[250];

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "[J")
    public static long[] field1350;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V", line = 7)
    public static void method810(int arg0) {
        field1347 = null;
        field1341 = null;
        field1338 = null;
        if (arg0 == 2) {
            field1350 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BLig;I)V", line = 22)
    public final void method811(byte arg0, class244 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1423(-25);
            if (var4 == 0) {
                field1342++;
                if (arg0 <= 14) {
                    field1350 = null;
                    return;
                }
                return;
            }
            this.method812(arg1, -122, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lig;III)V", line = 45)
    private final void method812(class244 arg0, int arg1, int arg2, int arg3) {
        if (arg1 > -66) {
            field1349 = 85;
        }
        field1339++;
        if (arg3 == 1) {
            this.field1345 = arg0.method1476(-69);
            if (this.field1345 == 65535) {
                this.field1345 = -1;
            }
        } else if (arg3 == 2) {
            this.field1337 = arg0.method1476(112) + 1;
            this.field1344 = arg0.method1476(94) + 1;
        } else if (arg3 == 3) {
            arg0.method1448((byte) -91);
        } else if (arg3 == 4) {
            this.field1346 = arg0.method1423(-32);
        } else if (arg3 == 5) {
            this.field1348 = arg0.method1423(-28);
        } else if (arg3 == 6) {
            this.field1343 = true;
        } else if (arg3 == 7) {
            this.field1336 = true;
            return;
        }
    }
}
