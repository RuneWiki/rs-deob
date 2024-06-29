import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class54 {

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public int field1360 = 0;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public int field1361 = 0;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "Lid;")
    public static class60 field1356 = class11.method72("Verbindung abgebrochen)3", (byte) 122);

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Lid;")
    public static class60 field1351 = class11.method72("(U", (byte) -23);

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Lid;")
    public static class60 field1352 = class11.method72("Schrifts-=tze geladen)3", (byte) -25);

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public int field1355;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public int field1358;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public int field1363;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public int field1364;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public int field1366;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Lha;")
    public class50 field1359;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "[I")
    public static int[] field1357;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method392(int arg0) {
        field1357 = null;
        field1356 = null;
        if (arg0 >= 84) {
            field1351 = null;
            field1352 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)[Le;")
    public static final class29[] method393(int arg0) {
        field1353++;
        class29[] var1 = new class29[class35.field886];
        if (arg0 != 255) {
            field1357 = null;
        }
        for (int var2 = 0; var2 < class35.field886; var2++) {
            class29 var3 = var1[var2] = new class29();
            var3.field694 = class146.field3281;
            var3.field697 = class90.field2237;
            var3.field692 = class90.field2236[var2];
            var3.field696 = class100.field2442[var2];
            var3.field698 = class104.field2551[var2];
            var3.field695 = class136.field3098[var2];
            var3.field691 = class35.field879;
            var3.field693 = class89.field2205[var2];
        }
        class7.method47(arg0 + 12456);
        return var1;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Lid;")
    public static final class60 method394(int arg0, int arg1) {
        field1362++;
        if (arg0 != -30554) {
            field1357 = null;
        }
        return class104.method853(-83, new class60[] { class98.method774((byte) -121, arg1 >> 24 & 0xFF), class133.field3046, class98.method774((byte) -121, arg1 >> 16 & 0xFF), class133.field3046, class98.method774((byte) -121, arg1 >> 8 & 0xFF), class133.field3046, class98.method774((byte) -121, arg1 & 0xFF) });
    }
}
