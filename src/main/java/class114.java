import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class114 {

    @OriginalMember(owner = "client!kba", name = "f", descriptor = "I")
    public int field1549 = -1;

    @OriginalMember(owner = "client!kba", name = "k", descriptor = "I")
    public int field1554 = -1;

    @OriginalMember(owner = "client!kba", name = "l", descriptor = "I")
    public int field1555 = -1;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "I")
    public static int field1544 = -1;

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "I")
    public int field1545;

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "I")
    public int field1546;

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!kba", name = "e", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!kba", name = "g", descriptor = "I")
    public int field1550;

    @OriginalMember(owner = "client!kba", name = "h", descriptor = "I")
    public int field1551;

    @OriginalMember(owner = "client!kba", name = "i", descriptor = "I")
    public int field1552;

    @OriginalMember(owner = "client!kba", name = "j", descriptor = "I")
    public int field1553;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(II)V")
    public static final void method838(int arg0, int arg1) {
        field1548++;
        class390.method2413(16205);
        int var2 = class2.field14.method4323((byte) -122, arg1).field9893;
        if (var2 == 0) {
            return;
        }
        int var3 = class480.field6740.field10579[arg1];
        if (var2 == 6) {
            class649.field8756 = var3;
        }
        if (arg0 == var2) {
            class151.field2051 = var3;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)V")
    public static final void method839(int arg0) {
        int var1 = -81 % ((arg0 + 85) / 34);
        if (class375.field5490 != null) {
            if (class24.field246) {
                class73.method599(-1);
            }
            class627.field8492.method2843(-127);
            class183.method1240();
            class630.method3478(-19580);
            class772.method4245(30003);
            class102.method793((byte) -123);
            class325.method2103(24);
            if (class126.field1734 != null) {
                class126.field1734.method2175(0);
            }
            class80.method639(115);
            class74.method601((byte) 50);
            class281.method1838(1000);
            class437.method2622(-6);
            class525.method3048((byte) -33, false);
            for (int var2 = 0; var2 < 2048; var2++) {
                class758 var6 = class84.field1204[var2];
                if (var6 != null) {
                    for (int var7 = 0; var7 < var6.field6196.length; var7++) {
                        var6.field6196[var7] = null;
                    }
                }
            }
            for (int var3 = 0; var3 < class181.field2380; var3++) {
                class22 var4 = class110.field1528[var3].field4455;
                if (var4 != null) {
                    for (int var5 = 0; var5 < var4.field6196.length; var5++) {
                        var4.field6196[var5] = null;
                    }
                }
            }
            class559.field7670 = null;
            class33.field312 = null;
            class375.field5490.method464((byte) -125);
            class375.field5490 = null;
        }
        field1547++;
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Lqba;)V")
    public class114(class425 arg0) {
    }
}
