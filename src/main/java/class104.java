import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class104 {

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "Z")
    public boolean field1354 = true;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public int field1355;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public int field1350;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public int field1349;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public int field1346;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public int field1352;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public int field1348;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "Lcc;")
    public static class327 field1351 = new class327(64);

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field1359 = 0;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "[Z")
    public static boolean[] field1356;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 14)
    public static final void method736(int arg0) {
        field1347++;
        class312 var1 = class35.field427;
        synchronized (class35.field427) {
            field1359 = class305.field4464;
            class137.field1871++;
            if (class291.field4234 >= 0) {
                while (class75.field990 != class291.field4234) {
                    int var2 = class305.field4456[class75.field990];
                    class75.field990 = class75.field990 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class143.field1991[var2] = true;
                    } else {
                        class143.field1991[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class143.field1991[var3] = false;
                }
                class291.field4234 = class75.field990;
            }
            class305.field4464 = class242.field3513;
        }
        if (arg0 != -25078) {
            field1356 = (boolean[]) null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V", line = 61)
    public static void method737(int arg0) {
        field1351 = null;
        field1356 = null;
        if (arg0 != 0) {
            field1359 = 119;
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(IIIIIIZ)V", line = 77)
    public class104(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1355 = arg3;
        this.field1350 = arg0;
        this.field1349 = arg4;
        this.field1346 = arg5;
        this.field1352 = arg2;
        this.field1354 = arg6;
        this.field1348 = arg1;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lfd;I)Ljo;", line = 99)
    public static final class199 method738(class299 arg0, int arg1) {
        field1353++;
        arg0.method2096((byte) -122);
        int var2 = arg0.method2096((byte) -122);
        class199 var3 = class315.method2182(9, var2);
        var3.field2814 = arg0.method2096((byte) -122);
        int var4 = arg0.method2096((byte) -122);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method2096((byte) -122);
            var3.method193((byte) -43, arg0, var6);
        }
        if (arg1 != 18120) {
            field1358 = -77;
        }
        var3.method189((byte) 91);
        return var3;
    }
}
