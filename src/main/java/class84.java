import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class84 extends class69 {

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "S")
    public static short field1570 = 32767;

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
    public static int field1569 = 50;

    @OriginalMember(owner = "client!qb", name = "X", descriptor = "Lvf;")
    public static class265 field1577 = class87.method582(-46, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!qb", name = "S", descriptor = "I")
    public static int field1572 = 0;

    @OriginalMember(owner = "client!qb", name = "U", descriptor = "Lvf;")
    public static class265 field1574 = class87.method582(-46, "Attaquer");

    @OriginalMember(owner = "client!qb", name = "Z", descriptor = "S")
    public static short field1579 = 256;

    @OriginalMember(owner = "client!qb", name = "Y", descriptor = "[S")
    public static short[] field1578 = new short[256];

    @OriginalMember(owner = "client!qb", name = "V", descriptor = "B")
    public byte field1575;

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!qb", name = "T", descriptor = "I")
    public int field1573;

    @OriginalMember(owner = "client!qb", name = "W", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!qb", name = "ab", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "Lng;")
    public class135 field1568;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)[B")
    public final byte[] method493(int arg0) {
        ++field1571;
        int var2 = -70 / ((arg0 - -63) / 36);
        if (!super.field1315 && this.field1568.field2483.length + -this.field1575 <= this.field1568.field2449) {
            return this.field1568.field2483;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)Lwb;")
    public static final class130 method574(int arg0, int arg1) {
        class130 var2 = (class130) class139.field2533.method1887(114, (long) arg1);
        ++field1580;
        if (var2 != null) {
            return var2;
        } else {
            int var3 = 120 / ((-68 - arg0) / 55);
            byte[] var4 = class113.field1981.method1332(true, class127.method847(arg1, -31257), class207.method1423(arg1, 121));
            class130 var5 = new class130();
            var5.field2357 = arg1;
            if (var4 != null) {
                var5.method849(new class135(var4), 32619);
            }
            var5.method851((byte) -39);
            if (!class256.field4380 && var5.field2325) {
                var5.field2294 = null;
            }
            if (var5.field2354) {
                var5.field2326 = false;
                var5.field2334 = 0;
            }
            class139.field2533.method1892(var5, (long) arg1, (byte) -122);
            return var5;
        }
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)I")
    public final int method492(int arg0) {
        ++field1576;
        if (this.field1568 == null) {
            return 0;
        } else {
            return arg0 != -2 ? 98 : this.field1568.field2449 * 100 / (this.field1568.field2483.length + -this.field1575);
        }
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)V")
    public static void method575(byte arg0) {
        field1574 = null;
        field1578 = null;
        field1577 = null;
        if (arg0 != -76) {
            field1569 = -13;
        }
    }
}
