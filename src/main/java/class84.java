import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class class84 extends class172 {

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "Z")
    public volatile boolean field1434 = true;

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "Z")
    public static boolean field1427 = true;

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field1432 = new String[5];

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "F")
    public static float field1426 = 128.0F;

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "[I")
    public static int[] field1431 = new int[500];

    @OriginalMember(owner = "client!cc", name = "N", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "Lth;")
    public static class57 field1429;

    @OriginalMember(owner = "client!cc", name = "I", descriptor = "Z")
    public boolean field1425;

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "Z")
    public boolean field1428;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIZ)I", line = 5)
    public static final int method673(int arg0, int arg1, int arg2, boolean arg3) {
        class354 var4 = (class354) class329.field5229.method1268(-23, (long) arg0);
        field1433++;
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = arg1; var6 < var4.field5617.length; var6++) {
            if (var4.field5617[var6] >= 0 && class281.field4614 > var4.field5617[var6]) {
                class52 var7 = class6.method22(var4.field5617[var6], 16430);
                if (var7.field850 != null) {
                    class301 var8 = (class301) var7.field850.method1268(arg1 ^ 0x69, (long) arg2);
                    if (var8 != null) {
                        if (arg3) {
                            var5 += var4.field5622[var6] * var8.field4846;
                        } else {
                            var5 += var8.field4846;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)V", line = 59)
    public static void method674(byte arg0) {
        if (arg0 != 86) {
            method674((byte) -21);
        }
        field1429 = null;
        field1432 = null;
        field1431 = null;
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(B)I")
    public abstract int method675(byte arg0);

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(B)[B")
    public abstract byte[] method676(byte arg0);
}
