import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public abstract class class333 {

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "[F")
    public static float[] field5149 = new float[4];

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "F")
    public static float field5148;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)C")
    public abstract char method1945(byte arg0);

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)I")
    public abstract int method1946(int arg0);

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)Z")
    public abstract boolean method1944(int arg0);

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)J")
    public abstract long method1948(int arg0);

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V")
    public static final void method2142(boolean arg0) {
        class14.field242.method1015((byte) 82);
        field5150++;
        class411.field6185.method1015((byte) 99);
        class112.field1563.method1015((byte) 81);
        class242.field3402.method1015((byte) 125);
        if (arg0) {
            field5149 = null;
        }
        class438.field6530.method1015((byte) 115);
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)I")
    public abstract int method1947(byte arg0);

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)V")
    public static void method2143(byte arg0) {
        field5149 = null;
        if (arg0 != -60) {
            method2143((byte) -49);
        }
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)V")
    public static final void method2144(int arg0) {
        field5151++;
        int var1 = class442.field6574;
        int[] var2 = class320.field4896;
        for (int var3 = 0; var3 < var1; var3++) {
            class322 var4 = class439.field6539[var2[var3]];
            if (var4 != null) {
                class242.method1614(var4.method2091(-15245), var4, -1536);
            }
        }
        if (arg0 != 26901) {
            method2144(34);
        }
    }
}
