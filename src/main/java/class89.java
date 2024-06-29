import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public abstract class class89 {

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "Lvh;")
    public static class125 field1326 = new class125(70, 15);

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!pw", name = "e", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!pw", name = "d", descriptor = "Lvo;")
    public static class345 field1329;

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(I)V", line = 5)
    public static void method665(int arg0) {
        field1326 = null;
        if (arg0 > 13) {
            field1329 = null;
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "([Ljava/lang/Object;I[J)V", line = 18)
    public static final void method667(Object[] arg0, int arg1, long[] arg2) {
        if (arg1 >= 108) {
            field1327++;
            class296.method1839(arg0, (byte) 78, arg2.length - 1, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IJ)V", line = 41)
    public static final void method670(int arg0, long arg1) {
        field1328++;
        if (class541.field7946 != null) {
            if (class40.field544 == 1 || class40.field544 == 5) {
                class427.method2511(arg1, -33);
            } else if (class40.field544 == 4) {
                class128.method1012(1, arg1);
            }
        }
        class511.method3040((long) class148.field2508, class637.field9048, false);
        if (class557.field8146 != -1) {
            class246.method1583(class557.field8146, 11475);
        }
        if (arg0 != 1) {
            return;
        }
        for (int var3 = 0; var3 < class43.field586; var3++) {
            if (class636.field9030[var3]) {
                class221.field3297[var3] = true;
            }
            class392.field5701[var3] = class636.field9030[var3];
            class636.field9030[var3] = false;
        }
        class419.field5958 = class148.field2508;
        if (class557.field8146 != -1) {
            class43.field586 = 0;
            class198.method1390(arg0 + 1437);
        }
        class637.field9048.method805();
        class288.method1767(class637.field9048, 8);
        int var4 = class208.method1441(false);
        if (var4 == -1) {
            var4 = class324.field4521;
        }
        if (var4 == -1) {
            var4 = class266.field3822;
        }
        class260.method1650(var4, 448389448);
        int var5 = class103.field1708.method1108(110) << 8;
        class118.method953(class103.field1708.field3158, 8906, class103.field1708.field3155 + var5, class103.field1708.field3154 - -var5, class193.field2993);
        class193.field2993 = 0;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)V")
    public abstract void method664(int arg0);

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)Lri;")
    public abstract class414 method666(byte arg0);

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(II)Z")
    public abstract boolean method668(int arg0, int arg1);

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(B)V")
    public abstract void method669(byte arg0);
}
