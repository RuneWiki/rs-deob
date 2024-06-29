import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class256 extends class196 {

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
    public int field3878 = 0;

    @OriginalMember(owner = "client!lk", name = "F", descriptor = "I")
    public static int field3882 = 0;

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!lk", name = "G", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "[I")
    public static int[] field3879;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lre;II)V", line = 4)
    private final void method1736(class263 arg0, int arg1, int arg2) {
        field3880++;
        if (arg2 == 2) {
            this.field3878 = arg0.method1830((byte) -77);
        }
        if (arg1 != -26346) {
            field3882 = 51;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILre;)V", line = 21)
    public final void method1737(int arg0, class263 arg1) {
        field3881++;
        while (true) {
            int var3 = arg1.method1787(false);
            if (var3 == 0) {
                if (arg0 != -30378) {
                    this.method1736((class263) null, -88, -19);
                }
                return;
            }
            this.method1736(arg1, -26346, var3);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 48)
    public static final void method1738(String arg0, int arg1, boolean arg2) {
        int var3 = 0;
        short[] var4 = new short[arg1];
        String var5 = arg0.toLowerCase();
        field3876++;
        for (int var6 = 0; var6 < class304.field4633; var6++) {
            class253 var7 = class325.method2219(var6, arg1 - 9395);
            if ((!arg2 || var7.field3833) && var7.field3800 == -1 && var7.field3834 == -1 && var7.field3814 == 0 && var7.field3837.toLowerCase().indexOf(var5) != -1) {
                if (var3 >= 250) {
                    class257.field3898 = null;
                    class266.field4097 = -1;
                    return;
                }
                if (var4.length <= var3) {
                    short[] var8 = new short[var4.length * 2];
                    for (int var9 = 0; var9 < var3; var9++) {
                        var8[var9] = var4[var9];
                    }
                    var4 = var8;
                }
                var4[var3++] = (short) var6;
            }
        }
        class257.field3898 = var4;
        class266.field4097 = var3;
        String[] var10 = new String[class266.field4097];
        class306.field4658 = 0;
        for (int var11 = 0; var11 < class266.field4097; var11++) {
            var10[var11] = class325.method2219(var4[var11], -9379).field3837;
        }
        class110.method771(var10, 123, class257.field3898);
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V", line = 128)
    public static void method1739(int arg0) {
        field3879 = null;
        if (arg0 != 0) {
            field3882 = -31;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLre;)Lrh;", line = 139)
    public static final class110 method1740(byte arg0, class263 arg1) {
        arg1.method1787(false);
        field3883++;
        int var2 = arg1.method1787(false);
        class110 var3 = class48.method335((byte) -77, var2);
        var3.field1702 = arg1.method1787(false);
        if (arg0 != -80) {
            method1740((byte) -19, (class263) null);
        }
        int var4 = arg1.method1787(false);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method1787(false);
            var3.method44(var6, arg1, -64);
        }
        var3.method47(-9);
        return var3;
    }
}
