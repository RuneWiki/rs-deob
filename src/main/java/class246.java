import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class246 {

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public int field4272 = -1;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field4263 = -1;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "[I")
    public static int[] field4268 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public int field4257;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public int field4259;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public int field4260;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public int field4262;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public int field4264;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public int field4269;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public int field4270;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public int field4271;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Loe;Z)V")
    public static final void method1612(class256 arg0, boolean arg1) {
        class111.field1769 = class153.method1012(class69.field984, 0, arg0, -5);
        field4265++;
        class147.field2562 = class98.method649(class253.field4379, 0, arg0, (byte) -97);
        class255.field4424 = class229.method1473((byte) 34, 0, arg0, class128.field2119);
        class229.method1473((byte) 53, 0, arg0, class148.field2579);
        class158.field2733 = class229.method1473((byte) 125, 0, arg0, field4266);
        class26.field311 = class229.method1473((byte) -79, 0, arg0, class119.field1947);
        if (!arg1) {
            field4268 = null;
        }
        class87.field1356 = class134.method906(arg0, class86.field1344, 0, -63);
        class45.field586 = class134.method906(arg0, class74.field1128, 0, -70);
        class65.field919 = class206.method1335(class104.field1675, (byte) -103, 0, arg0);
        class232.field3936 = class134.method906(arg0, class55.field766, 0, -74);
        class73.field1104 = class134.method906(arg0, class66.field930, 0, -79);
        class254.field4389 = class102.method679(arg0, -11892, class254.field4386, 0);
        class222.field3809 = class102.method679(arg0, -11892, class59.field814, 0);
        class166.field2832.method919(class222.field3809, null);
        class199.field3434.method919(class222.field3809, null);
        class123.field2028.method919(class222.field3809, null);
        class15 var2 = class80.method528(0, true, class70.field1072, arg0);
        var2.method68();
        class176.field3084 = var2;
        class15[] var3 = class98.method649(class101.field1605, 0, arg0, (byte) -126);
        for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4].method68();
        }
        class176.field3087 = var3;
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 41.0D) - 20;
        for (int var9 = 0; var9 < class147.field2562.length; var9++) {
            class147.field2562[var9].method66(var5 + var8, var7 + var8, var6 + var8);
        }
        class111.field1769[0].method1417(var5 + var8, var7 + var8, var6 + var8);
        client.field546 = class147.field2562;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static final void method1613(int arg0) {
        field4273++;
        class33.field415 = null;
        class7.field84 = null;
        if (arg0 != 0) {
            field4261 = 8;
        }
        class92.field1457 = null;
        class85.field1332 = null;
        class69.field978 = null;
        class54.field746 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public static final void method1614(byte arg0) {
        field4258++;
        if (class254.field4403 == 30) {
            class84.method555(5, 25);
        }
        if (arg0 <= 69) {
            field4263 = -35;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
    public static void method1615(byte arg0) {
        field4268 = null;
        if (arg0 >= -62) {
            field4266 = 82;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
    public static final void method1616(int arg0) {
        if (arg0 != 0) {
            field4268 = null;
        }
        field4267++;
        class3.field28.method14(false);
    }
}
