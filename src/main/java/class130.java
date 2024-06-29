import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class130 extends class70 {

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public int field2255;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public int field2251;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "Len;")
    public static class49 field2250 = new class49();

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "[I")
    public static int[] field2252;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V", line = 8)
    public static void method922(int arg0) {
        field2250 = null;
        if (arg0 != 0) {
            method924(24);
        }
        field2252 = null;
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)[Lob;", line = 31)
    public static final class323[] method923(int arg0) {
        class323[] var1 = new class323[class238.field3972];
        field2254++;
        int var2 = 113 % ((65 - arg0) / 35);
        for (int var3 = 0; var3 < class238.field3972; var3++) {
            if (class241.field4016) {
                var1[var3] = new class3(class91.field1617, class12.field368, class321.field5218[var3], class232.field3804[var3], class9.field284[var3], class76.field1367[var3], class309.field5053[var3], class323.field5225);
            } else {
                var1[var3] = new class211(class91.field1617, class12.field368, class321.field5218[var3], class232.field3804[var3], class9.field284[var3], class76.field1367[var3], class309.field5053[var3], class323.field5225);
            }
        }
        class213.method1470(false);
        return var1;
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)V", line = 58)
    public static final void method924(int arg0) {
        field2253++;
        class223.field3691.method889((byte) -120);
        if (arg0 >= -120) {
            field2252 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(II)V", line = 67)
    public class130(int arg0, int arg1) {
        this.field2255 = arg1;
        this.field2251 = arg0;
    }
}
