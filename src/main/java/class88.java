import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public abstract class class88 extends class551 {

    @OriginalMember(owner = "client!k", name = "t", descriptor = "Lnj;")
    public static class487 field1126 = new class487("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!k", name = "u", descriptor = "Lqp;")
    public static class586 field1127 = new class586(63, 6);

    @OriginalMember(owner = "client!k", name = "v", descriptor = "Lrk;")
    public static class419 field1128 = new class419();

    @OriginalMember(owner = "client!k", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field1129 = new String[8];

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIZ)V")
    public static final void method519(int arg0, int arg1, int arg2, boolean arg3) {
        field1125++;
        if (arg0 == 0) {
            class165.method1046(-3466, class292.field4275);
            class266.field3935++;
        }
        if (arg0 == 1) {
            class165.method1046(-3466, class49.field575);
            class584.field8640++;
        }
        class221.field3268.method2579(-99, class584.field8677 + arg1);
        class221.field3268.method2611(-29133, class542.field8105.method1259(true, 82) ? 1 : 0);
        class221.field3268.method2608(class424.field6061 + arg2, (byte) 65);
        class415.field5969 = arg1;
        class158.field2058 = arg2;
        class121.field1566 = arg3;
        class498.method3002(-104);
    }

    @OriginalMember(owner = "client!k", name = "g", descriptor = "(I)V")
    public static void method520(int arg0) {
        field1127 = null;
        field1129 = null;
        field1128 = null;
        int var1 = -119 % ((arg0 + 25) / 49);
        field1126 = null;
    }
}
