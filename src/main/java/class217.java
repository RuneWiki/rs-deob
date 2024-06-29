import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class217 extends class314 {

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "[B")
    public byte[] field3838;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field3833 = -1;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "Lud;")
    public static class279 field3837 = class130.method1024(": ", 255);

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "[I")
    public static int[] field3835 = new int[100];

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "Lud;")
    public static class279 field3841 = class130.method1024(":chalreq:", 255);

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "Ldd;")
    public static class247 field3843 = new class247(64);

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "[S")
    public static short[] field3845 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "Lvi;")
    public static class6 field3846;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "[I")
    public static int[] field3839;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 9)
    public static void method1591(int arg0) {
        field3835 = null;
        field3841 = null;
        field3846 = null;
        field3845 = null;
        field3837 = null;
        field3839 = null;
        if (arg0 == 16279) {
            field3843 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lok;Lok;Lok;Z)V", line = 40)
    public static final void method1592(class149 arg0, class149 arg1, class149 arg2, boolean arg3) {
        class315.field5549 = arg0;
        field3834++;
        class8.field339 = arg2;
        if (arg3) {
            class190.field3429 = arg1;
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "([B)V", line = 68)
    public class217(byte[] arg0) {
        this.field3838 = arg0;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)Lbn;", line = 84)
    public static final class66 method1593(int arg0) {
        field3840++;
        byte[] var1 = class113.field2080[0];
        if (arg0 <= 48) {
            method1592((class149) null, (class149) null, (class149) null, true);
        }
        int var2 = class115.field2097[0] * class1.field92[0];
        class66 var5;
        if (class290.field5168[0]) {
            byte[] var6 = class322.field5622[0];
            int[] var7 = new int[var2];
            for (int var8 = 0; var8 < var2; var8++) {
                var7[var8] = class301.method2139(field3839[class52.method442(255, var1[var8])], class52.method442(var6[var8] << 24, -16777216));
            }
            var5 = new class316(class86.field1646, class111.field2045, class44.field915[0], class216.field3811[0], class1.field92[0], class115.field2097[0], var7);
        } else {
            int[] var3 = new int[var2];
            for (int var4 = 0; var4 < var2; var4++) {
                var3[var4] = field3839[class52.method442(var1[var4], 255)];
            }
            var5 = new class66(class86.field1646, class111.field2045, class44.field915[0], class216.field3811[0], class1.field92[0], class115.field2097[0], var3);
        }
        class162.method1278(false);
        return var5;
    }
}
