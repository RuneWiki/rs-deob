import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class115 extends class238 {

    @OriginalMember(owner = "client!m", name = "m", descriptor = "J")
    public long field1468;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    public static int field1470 = 0;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "[Ltr;")
    public static class176[] field1467;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)Lfr;")
    public static final class260 method724(int arg0) {
        field1471++;
        class260 var1 = (class260) class204.field3040.method1443((byte) -122);
        if (arg0 != 4) {
            return null;
        } else if (var1 == null) {
            return new class260();
        } else {
            class289.field4211--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
    public class115() {
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)I")
    public static final int method725(int arg0, int arg1) {
        field1472++;
        if (class58.field761 != null) {
            class58.field761.method2118(1);
            class58.field761 = null;
        }
        class153.field2279++;
        if (class153.field2279 > 4) {
            class153.field2279 = 0;
            class408.field5725 = 0;
            return arg1;
        }
        if (class230.field3470 == class226.field3425) {
            class230.field3470 = class310.field4389;
        } else {
            class230.field3470 = class226.field3425;
        }
        class408.field5725 = arg0;
        return -1;
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(B)V")
    public static void method726(byte arg0) {
        if (arg0 < -38) {
            field1467 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II)V")
    public static final void method727(int arg0, int arg1) {
        class393.field5582 = 100;
        class303.field4313 = 3;
        field1473++;
        class479.field6719 = arg0;
        class269.field3930 = arg1;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(J)V")
    public class115(long arg0) {
        this.field1468 = arg0;
    }
}
