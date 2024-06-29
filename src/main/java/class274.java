import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class274 {

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "[[[I")
    public static int[][][] field4724 = new int[2][][];

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field4727 = 0;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field4731 = 0;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "[Lfg;")
    public static class202[] field4732 = new class202[500];

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "Lwa;")
    public static class75 field4723 = class66.method560("Cache:", false);

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "Lgb;")
    public static class158 field4730 = new class158(64);

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "Lwa;")
    public static class75 field4734 = class66.method560("3D)2Softwarebibliothek gestartet)3", false);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V", line = 27)
    public static final void method1952(byte arg0) {
        class154.field2640.method1201(-20111);
        field4725++;
        if (arg0 != 122) {
            method1954(88);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)Z", line = 40)
    public static final boolean method1953(int arg0) {
        field4722++;
        if (~class13.field168 != arg0) {
            try {
                return !(Boolean) class178.field3011.method662(0, class210.field3585.field2072);
            } catch (Throwable var2) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V", line = 59)
    public static void method1954(int arg0) {
        if (arg0 <= 49) {
            field4724 = (int[][][]) ((int[][][]) null);
        }
        field4723 = null;
        field4724 = (int[][][]) null;
        field4734 = null;
        field4730 = null;
        field4732 = null;
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V", line = 80)
    public static final void method1955(int arg0) {
        field4733++;
        class89.field1470.method87(arg0 ^ 0xFF53, arg0);
        class5.field55++;
        for (class93 var1 = (class93) class73.field1224.method1001((byte) 33); var1 != null; var1 = (class93) class73.field1224.method1009(-126)) {
            if (var1.field1519 == 0) {
                class97.method746(arg0 + 32595, true, var1);
            }
        }
        if (class286.field4929 != null) {
            class291.method2027(class286.field4929, 14580);
            class286.field4929 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)I", line = 111)
    public static final int method1956(byte arg0, int arg1) {
        if (arg0 == 1) {
            field4729++;
            return arg1 & 0xFF;
        } else {
            return -51;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILcb;)V", line = 131)
    public static final void method1957(int arg0, class267 arg1) {
        class230.field3914 = arg1;
        class297.field5084 = class230.field3914.method1914(-93, 16);
        if (arg0 != -1) {
            field4732 = (class202[]) null;
        }
        field4728++;
    }
}
