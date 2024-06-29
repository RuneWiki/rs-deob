import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class67 {

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Lpd;")
    public static class94 field1637 = class28.method249(-76, "backtop1");

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Lpd;")
    public static class94 field1636 = class28.method249(-96, "Ignorieren");

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field1641 = 0;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "Lpd;")
    private static class94 field1642 = class28.method249(-119, "Invalid loginserver requested)3");

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Lpd;")
    public static class94 field1639 = class28.method249(-71, "Hier klicken)1 um fortzufahren)3)3)3");

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "Lpd;")
    public static class94 field1645 = field1642;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "Lvc;")
    public static class128 field1640 = new class128(50);

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "Lpd;")
    public static class94 field1648 = class28.method249(107, ")2");

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field1649 = 0;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "Z")
    public static boolean field1651 = false;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field1650 = 0;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIILs;)[Lad;", line = 9)
    public static final class5[] method501(int arg0, int arg1, int arg2, class111 arg3) {
        if (arg0 == 32767) {
            field1643++;
            return class43.method321(arg1, arg2, arg3, -12404) ? method505((byte) 106) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 49)
    public static void method502(int arg0) {
        field1639 = null;
        field1648 = null;
        field1640 = null;
        if (arg0 >= 122) {
            field1645 = null;
            field1637 = null;
            field1642 = null;
            field1636 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III[Lpd;)Lpd;", line = 79)
    public static final class94 method503(int arg0, int arg1, int arg2, class94[] arg3) {
        field1638++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0; var5++) {
            if (arg3[arg1 + var5] == null) {
                arg3[arg1 + var5] = class27.field749;
            }
            var4 += arg3[arg1 + var5].field2396;
        }
        byte[] var6 = new byte[var4];
        int var7 = arg2;
        for (int var8 = 0; var8 < arg0; var8++) {
            class94 var10 = arg3[arg1 + var8];
            class32.method267(var10.field2382, 0, var6, var7, var10.field2396);
            var7 += var10.field2396;
        }
        class94 var9 = new class94();
        var9.field2396 = var4;
        var9.field2382 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILuc;)Lpd;", line = 122)
    public static final class94 method504(int arg0, class122 arg1) {
        if (arg0 >= -123) {
            return null;
        } else {
            field1644++;
            return class50.method400(arg1, (byte) 91, 32767);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)[Lad;", line = 146)
    private static final class5[] method505(byte arg0) {
        field1646++;
        if (arg0 <= 68) {
            field1640 = null;
        }
        class5[] var1 = new class5[class31.field887];
        for (int var2 = 0; var2 < class31.field887; var2++) {
            class5 var3 = var1[var2] = new class5();
            var3.field103 = class74.field1804;
            var3.field108 = class51.field1274;
            var3.field101 = class126.field3159[var2];
            var3.field104 = class21.field585[var2];
            var3.field102 = class17.field442[var2];
            var3.field107 = class100.field2543[var2];
            var3.field106 = class13.field331;
            var3.field105 = class63.field1561[var2];
        }
        class1.method3(72);
        return var1;
    }
}
