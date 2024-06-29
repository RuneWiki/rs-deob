import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class249 {

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!vea", name = "d", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lun;I)Lfs;", line = 5)
    public static final class514 method1525(class389 arg0, int arg1) {
        field3426++;
        class564 var2 = class262.method1597((byte) 71)[arg0.method2229(255)];
        class172 var3 = class423.method2555((byte) 122)[arg0.method2229(arg1 ^ 0xFFFFFF00)];
        int var4 = arg0.method2270((byte) 71);
        int var5 = arg0.method2270((byte) 71);
        int var6 = arg0.method2260(arg1 ^ 0x54);
        if (arg1 != -1) {
            method1526(null, (byte) -91);
        }
        int var7 = arg0.method2260(-126);
        int var8 = arg0.method2270((byte) 71);
        int var9 = arg0.method2255(255);
        int var10 = arg0.method2255(255);
        return new class514(var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Ln;B)V", line = 34)
    public static final void method1526(class17 arg0, byte arg1) {
        field3425++;
        if (!class99.field1336) {
            return;
        }
        if (arg0.field453 != null) {
            class17 var2 = class346.method1981(class391.field5243, class386.field5147, (byte) -115);
            if (var2 != null) {
                class143 var3 = new class143();
                var3.field1786 = arg0.field453;
                var3.field1777 = var2;
                var3.field1789 = arg0;
                class545.method3204(var3);
            }
        }
        class86.field1215++;
        class543 var4 = class299.method1780(class84.field1196, class488.field6826, 127);
        if (arg1 != -99) {
            return;
        }
        var4.field7872.method2233((byte) 69, arg0.field465);
        var4.field7872.method2256(class282.field3819, 2);
        var4.field7872.method2226(class386.field5147, (byte) -58);
        var4.field7872.method2256(arg0.field412, arg1 ^ 0xFFFFFF9F);
        var4.field7872.method2222(arg0.field485, -17414);
        var4.field7872.method2267(class391.field5243, -1358200824);
        class511.method3028(7482, var4);
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(ZI)V", line = 76)
    public static final void method1527(boolean arg0, int arg1) {
        class418.field5921 = arg1;
        class113.field1458 = -1;
        class440.field6291 = -1;
        field3427++;
        class582.method3389(-73);
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(BIIZ)I", line = 90)
    public static final int method1528(byte arg0, int arg1, int arg2, boolean arg3) {
        field3428++;
        class122 var4 = class673.method3829(1, arg3, arg1);
        if (arg0 != -114) {
            return 101;
        } else if (var4 == null) {
            return -1;
        } else if (arg2 >= 0 && var4.field1574.length > arg2) {
            return var4.field1574[arg2];
        } else {
            return -1;
        }
    }
}
