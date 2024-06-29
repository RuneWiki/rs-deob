import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public abstract class class107 extends class259 {

    @OriginalMember(owner = "client!md", name = "M", descriptor = "Z")
    public volatile boolean field1572 = true;

    @OriginalMember(owner = "client!md", name = "O", descriptor = "Z")
    public static boolean field1574 = true;

    @OriginalMember(owner = "client!md", name = "L", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!md", name = "P", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "Z")
    public boolean field1577;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "Z")
    public boolean field1578;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III)I")
    public static final int method776(int arg0, int arg1, int arg2) {
        field1575++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return arg0 >= -28 ? 24 : (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIILjk;)V")
    public static final void method777(int arg0, int arg1, int arg2, class297 arg3) {
        field1576++;
        if (class51.field826 < 2 && class277.field4275 == 0 && !class76.field1205) {
            return;
        }
        int var4 = -41 % ((-arg2 - 45) / 40);
        String var5 = class218.method1469((byte) 71);
        if (arg3 == null) {
            int var7 = class105.field1555.method1282(var5, arg0 + 4, arg1 + 15, 16777215, 0, class262.field4039, class67.field1100);
            class210.method1386(arg0 + 4, arg1, 15, (byte) 85, class105.field1555.method1293(var5) + var7);
            return;
        }
        class192 var6 = arg3.method1983(class71.field1166, 28755);
        if (var6 == null) {
            var6 = class105.field1555;
        }
        var6.method1281(var5, arg0, arg1, arg3.field4627, arg3.field4531, arg3.field4522, arg3.field4593, arg3.field4677, arg3.field4612, class262.field4039, class67.field1100, class92.field1392);
        class210.method1386(class92.field1392[0], class92.field1392[1], class92.field1392[3], (byte) 75, class92.field1392[2]);
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(I)[B")
    public abstract byte[] method669(int arg0);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIIZI)V")
    public static final void method778(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field1573++;
        int var8 = arg7 + arg5;
        int var9 = arg4 - arg5;
        int var10 = arg1 + arg5;
        int var11 = arg2 - arg5;
        for (int var12 = arg7; var12 < var8; var12++) {
            class222.method1519((byte) -125, arg1, class241.field3751[var12], arg2, arg0);
        }
        for (int var13 = arg4; var13 > var9; var13--) {
            class222.method1519((byte) -128, arg1, class241.field3751[var13], arg2, arg0);
        }
        if (!arg6) {
            field1574 = false;
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class241.field3751[var14];
            class222.method1519((byte) -109, arg1, var15, var10, arg0);
            class222.method1519((byte) -117, var10, var15, var11, arg3);
            class222.method1519((byte) -120, var11, var15, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!md", name = "f", descriptor = "(I)I")
    public abstract int method667(int arg0);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BLjava/lang/Object;Lgf;)V")
    public static final void method779(byte arg0, Object arg1, class26 arg2) {
        if (arg0 != 68) {
            return;
        }
        field1571++;
        if (arg2.field506 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field506.peekEvent() != null; var3++) {
            client.method323(1L, -124);
        }
        if (arg1 != null) {
            arg2.field506.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
