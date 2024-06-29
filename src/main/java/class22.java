import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class22 {

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field408 = 0;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "Lok;")
    public static class146 field410 = class235.method1724(-12908, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field412 = 0;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "Lhd;")
    public static class117 field414 = new class117(32);

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V", line = 4)
    public static void method155(int arg0) {
        field414 = null;
        field410 = null;
        if (arg0 != 0) {
            field414 = (class117) null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIBI)I", line = 38)
    public static final int method156(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var5 = arg0 & 0xF;
        int var6 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg1 : arg2) : arg4;
        if (arg3 != 38) {
            field410 = (class146) null;
        }
        int var7 = var5 < 8 ? arg1 : arg4;
        field409++;
        return ((var5 & 0x2) == 0 ? var6 : -var6) + ((var5 & 0x1) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)Ltg;", line = 53)
    public static final class307 method157(int arg0) {
        field415++;
        byte[] var1 = class17.field353[0];
        int var2 = class238.field3967[0] * class150.field2562[arg0];
        int[] var3 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = class94.field1514[class82.method582(var1[var4], 255)];
        }
        class307 var5 = new class307(class177.field3006, class242.field4027, class226.field3776[0], class23.field424[0], class238.field3967[0], class150.field2562[0], var3);
        class301.method2122((byte) 0);
        return var5;
    }
}
