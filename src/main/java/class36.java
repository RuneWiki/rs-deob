import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class36 extends InputStream {

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "[I")
    public static int[] field870 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field868 = 0;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field871 = 0;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "Lsg;")
    public static class30 field872 = class167.method1221((byte) 33, ":assistreq:");

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public static int field876 = 0;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public static int field874 = 0;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "Lsg;")
    public static class30 field879 = class167.method1221((byte) 33, "Hierhin gehen");

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "Lmc;")
    public static class151 field877;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "[Lsg;")
    public static class30[] field878;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "[Lqd;")
    public static class35[] field869;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public static void method346(int arg0) {
        field870 = null;
        if (arg0 >= -10) {
            return;
        }
        field872 = null;
        field877 = null;
        field869 = null;
        field878 = null;
        field879 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IZIZ)I")
    public static final int method347(int arg0, boolean arg1, int arg2, boolean arg3) {
        class109 var4 = (class109) class208.field3730.method1168(-3, (long) arg0);
        field873++;
        if (var4 == null) {
            return 0;
        } else if (arg1) {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field2195.length; var6++) {
                if (var4.field2195[var6] >= 0 && var4.field2195[var6] < class189.field3442) {
                    class168 var7 = class201.method1425(69, var4.field2195[var6]);
                    if (var7.field3101 != null) {
                        class203 var8 = (class203) var7.field3101.method1168(-3, (long) arg2);
                        if (var8 != null) {
                            if (arg3) {
                                var5 += var4.field2199[var6] * var8.field3622;
                            } else {
                                var5 += var8.field3622;
                            }
                        }
                    }
                }
            }
            return var5;
        } else {
            return -116;
        }
    }

    @OriginalMember(owner = "client!fk", name = "read", descriptor = "()I")
    public final int read() {
        class160.method1191(30000L, 0);
        field880++;
        return -1;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
    public static final void method348(int arg0) {
        if (arg0 != -8) {
            method347(-70, false, 59, false);
        }
        class191.field3473.method552(arg0 ^ 0x7A);
        for (int var1 = 0; var1 < 32; var1++) {
            class67.field1473[var1] = 0L;
        }
        field875++;
        for (int var2 = 0; var2 < 32; var2++) {
            class57.field1250[var2] = 0L;
        }
        class209.field3754 = 0;
    }
}
