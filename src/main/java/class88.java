import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class88 extends class305 {

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "[B")
    public byte[] field1657;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lve;IBI)V", line = 11)
    public static final void method617(class278 arg0, int arg1, byte arg2, int arg3) {
        if (arg2 >= -60) {
            method618((byte) -19);
        }
        field1655++;
        if (arg0.field1897 == arg1 && arg1 != -1) {
            class260 var4 = class279.method1882(25397, arg1);
            int var5 = var4.field4038;
            if (var5 == 1) {
                arg0.field1908 = 0;
                arg0.field1901 = 0;
                arg0.field1912 = 0;
                arg0.field1921 = arg3;
                arg0.field1882 = 1;
                class255.method1705(arg0.field1872, arg0.field1869, (byte) -48, var4, arg0.field1908, class66.field1265 == arg0);
            }
            if (var5 == 2) {
                arg0.field1912 = 0;
            }
        } else if (arg1 == -1 || arg0.field1897 == -1 || class279.method1882(25397, arg1).field4035 >= class279.method1882(25397, arg0.field1897).field4035) {
            arg0.field1882 = 1;
            arg0.field1921 = arg3;
            arg0.field1908 = 0;
            arg0.field1912 = 0;
            arg0.field1901 = 0;
            arg0.field1897 = arg1;
            arg0.field1925 = arg0.field1877;
            if (arg0.field1897 != -1) {
                class255.method1705(arg0.field1872, arg0.field1869, (byte) -52, class279.method1882(25397, arg0.field1897), arg0.field1908, class66.field1265 == arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([B)V", line = 58)
    public class88(byte[] arg0) {
        this.field1657 = arg0;
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)V", line = 69)
    public static final void method618(byte arg0) {
        for (int var1 = -1; var1 < class305.field4623; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class283.field4384[var1];
            }
            class278 var3 = class97.field1715[var2];
            if (var3 != null && var3.field1890 > 0) {
                var3.field1890--;
                if (var3.field1890 == 0) {
                    var3.field1942 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class285.field4417; var4++) {
            int var5 = class131.field2226[var4];
            class255 var6 = class8.field179[var5];
            if (var6 != null && var6.field1890 > 0) {
                var6.field1890--;
                if (var6.field1890 == 0) {
                    var6.field1942 = null;
                }
            }
        }
        field1656++;
        if (arg0 != -115) {
            method618((byte) 121);
        }
    }
}
