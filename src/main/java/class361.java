import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class361 {

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "Z")
    public static boolean field5345 = false;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "Ljava/lang/String;")
    public static String field5342 = "Hidden";

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field5347 = 0;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field5350 = -1;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "[I")
    public static int[] field5351 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "[I")
    public static int[] field5340;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIII)V")
    public static final void method2373(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 4) {
            field5345 = false;
        }
        field5348++;
        class238 var4 = class144.field1829[arg3][arg1];
        class68.method577(var4 == null ? class165.field2241 : var4, arg0, (byte) 79);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
    public static final void method2374(byte arg0) {
        field5344++;
        int var1 = -68 % ((21 - arg0) / 36);
        int[] var2 = new int[class15.field234];
        int var3 = 0;
        for (int var4 = 0; var4 < class15.field234; var4++) {
            class159 var6 = class129.method915(127, var4);
            if (var6.field2053 >= 0 || var6.field2003 >= 0) {
                var2[var3++] = var4;
            }
        }
        class384.field5620 = new int[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            class384.field5620[var5] = var2[var5];
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZI)V")
    public static final void method2375(boolean arg0, int arg1) {
        field5349++;
        if (class398.field5838 == arg1) {
            return;
        }
        class351.field5217 = class143.field1815 = class422.field6129[arg1];
        class126.field1647.method489(50, (int) ((double) class351.field5217 * 34.46D));
        class386.field5640 = new int[class351.field5217][class143.field1815];
        class338.field4989 = new int[class351.field5217][class143.field1815];
        class318.field4679 = new int[4][class351.field5217 >> 3][class143.field1815 >> 3];
        for (int var2 = 0; var2 < 4; var2++) {
            class420.field6108[var2] = class328.method2151((byte) -69, class351.field5217, class143.field1815);
        }
        if (!arg0) {
            field5350 = -84;
        }
        class158.field1996 = new byte[4][class351.field5217][class143.field1815];
        class21.method193(4, class351.field5217, (byte) 119, class143.field1815);
        class84.method688(class351.field5217 >> 3, false, class143.field1815 >> 3, class126.field1647);
        class398.field5838 = arg1;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method2376(int arg0, int arg1) {
        field5346++;
        if (arg1 == 100 && class350.field5210 > 0) {
            byte[] var2 = client.field838[--class350.field5210];
            client.field838[class350.field5210] = null;
            return var2;
        } else if (arg0 > -78) {
            return null;
        } else if (arg1 == 5000 && class421.field6116 > 0) {
            byte[] var3 = class386.field5652[--class421.field6116];
            class386.field5652[class421.field6116] = null;
            return var3;
        } else if (arg1 == 30000 && class317.field4656 > 0) {
            byte[] var4 = class341.field5038[--class317.field4656];
            class341.field5038[class317.field4656] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static void method2377(int arg0) {
        field5340 = null;
        if (arg0 >= 68) {
            field5351 = null;
            field5342 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIII)V")
    public static final void method2378(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < arg1) {
            for (int var5 = arg3; var5 < arg1; var5++) {
                class444.field6416[var5][arg0] = arg2;
            }
        } else {
            for (int var6 = arg1; var6 < arg3; var6++) {
                class444.field6416[var6][arg0] = arg2;
            }
        }
        field5341++;
        if (arg4 != -1) {
            field5351 = null;
        }
    }
}
