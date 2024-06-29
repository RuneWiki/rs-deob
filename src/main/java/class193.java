import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class193 {

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "[I")
    public static int[] field2615 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "[I")
    public static int[] field2613 = new int[50];

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "Lak;")
    public static class212 field2611;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "[I")
    public static int[] field2616;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V")
    public static final void method1100(boolean arg0) {
        field2612++;
        if (class309.field4083.length() == 0) {
            return;
        }
        class279.method1574("--> " + class309.field4083, -51);
        class205.method1172(class309.field4083, arg0, arg0);
        class309.field4083 = "";
        class30.field402 = 0;
        class102.field1471 = 0;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public static final void method1101(byte arg0) {
        class395.field5481.method2804(0);
        field2614++;
        class119.field1742.method1655(-110);
        class28.field366.method1931((byte) -123);
        class1.field23.method930((byte) 78);
        class150.field2121.method791((byte) 16);
        class175.field2385.method1561(123);
        class395.field5477.method269(0);
        class302.field4030.method1395(69);
        class302.field4021.method1225(10);
        class458.field6219.method1219(93);
        field2611.method1200(12580);
        class171.field2351.method2195((byte) 110);
        class464.field6319.method2704(-271679574);
        class477.field6580.method831((byte) -97);
        class94.field1387.method163(93);
        class391.field5430.method1641(9);
        class135.field1973.method1185((byte) 90);
        class308.field4078.method2244(true);
        class86.field1146.method1726(-21964);
        class281.field3787.method1570((byte) -113);
        class15.method100((byte) -96);
        class173.method1002(0);
        class171.method997((byte) 60);
        class390.method2391(0);
        class276.field3642.method502(0);
        class196.field2675.method502(0);
        class209.field2828.method502(0);
        if (arg0 <= 104) {
            method1101((byte) -41);
        }
        class91.field1341.method502(0);
        class382.field5259.method502(0);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static void method1102(int arg0) {
        field2613 = null;
        field2611 = null;
        int var1 = -78 / ((arg0 - 1) / 56);
        field2615 = null;
        field2616 = null;
    }
}
