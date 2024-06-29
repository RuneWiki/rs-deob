import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class107 extends class276 {

    @OriginalMember(owner = "client!fh", name = "Q", descriptor = "I")
    private int field1907 = 0;

    @OriginalMember(owner = "client!fh", name = "S", descriptor = "I")
    private int field1909 = 4096;

    @OriginalMember(owner = "client!fh", name = "O", descriptor = "S")
    public static short field1905 = 256;

    @OriginalMember(owner = "client!fh", name = "U", descriptor = "Z")
    public static volatile boolean field1911 = false;

    @OriginalMember(owner = "client!fh", name = "W", descriptor = "S")
    public static short field1913 = 1;

    @OriginalMember(owner = "client!fh", name = "M", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!fh", name = "N", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!fh", name = "P", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!fh", name = "T", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!fh", name = "V", descriptor = "Z")
    public static boolean field1912;

    @OriginalMember(owner = "client!fh", name = "R", descriptor = "[[[I")
    public static int[][][] field1908;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "(I)V")
    public static void method724(int arg0) {
        if (arg0 == 4096) {
            field1908 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        if (arg0 <= 39) {
            field1913 = 64;
        }
        ++field1903;
        int[] var3 = super.field4425.method992(17118, arg1);
        if (super.field4425.field2448) {
            int[] var4 = this.method1805(false, 0, arg1);
            for (int var5 = 0; var5 < class53.field929; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field1907 && var6 <= this.field1909 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        if (arg2 != -1) {
            this.method23(122, -21);
        }
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field1909 = arg1.method677(false);
            }
        } else {
            this.field1907 = arg1.method677(false);
        }
        ++field1906;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
    public class107() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIZIIIZ)V")
    public static final void method725(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg3 != 1) {
            field1913 = 65;
        }
        ++field1904;
        if (~arg1 == -4) {
            method725(arg0, class52.field912, true, 1, -1, -1, true);
        } else {
            Container var7;
            if (class85.field1534 == null) {
                if (class270.field4349 == null) {
                    var7 = class127.field2238.field2294;
                } else {
                    var7 = class270.field4349;
                }
            } else {
                var7 = class85.field1534;
            }
            class132.field2302 = var7.getSize().width;
            class42.field623 = var7.getSize().height;
            if (class270.field4349 == var7) {
                Insets var8 = class270.field4349.getInsets();
                class42.field623 -= var8.top - -var8.bottom;
                class132.field2302 -= var8.right + var8.left;
            }
            if (~arg1 > -3) {
                class4.field38 = 503;
                class267.field4324 = 765;
                class72.field1189 = (class132.field2302 + -765) / 2;
                class231.field3870 = 0;
            } else {
                class4.field38 = class42.field623;
                class72.field1189 = 0;
                class267.field4324 = class132.field2302;
                class231.field3870 = 0;
            }
            if (!arg6) {
                class118.field2099.setSize(class267.field4324, class4.field38);
                if (class270.field4349 == var7) {
                    Insets var9 = class270.field4349.getInsets();
                    class118.field2099.setLocation(class72.field1189 + var9.left, class231.field3870 + var9.top);
                } else {
                    class118.field2099.setLocation(class72.field1189, class231.field3870);
                }
            } else {
                class111.method772((byte) 109, class118.field2099);
                class134.method934(27, class118.field2099);
                if (class101.field1723 != null) {
                    class101.field1723.method46(class118.field2099, -90);
                }
                class159.field2663.method1135(0);
                class255.method1686((byte) -47, class118.field2099);
                class6.method32(124, class118.field2099);
                if (class101.field1723 != null) {
                    class101.field1723.method39(class118.field2099, (byte) -96);
                }
            }
            if (arg1 > 0) {
                method725(arg0, 0, true, 1, -1, -1, true);
            } else {
                class176.field2889 = !class96.method610(0);
                if (~client.field4545 != 0) {
                    class61.method384(true, true);
                }
                if (class194.field3131 != null && (class59.field1026 == 30 || ~class59.field1026 == -26)) {
                    class85.method556(arg3 ^ 1);
                }
                for (int var10 = 0; ~var10 > -101; ++var10) {
                    class23.field367[var10] = true;
                }
                class229.field3857 = true;
            }
        }
    }
}
