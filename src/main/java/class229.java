import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class229 extends class352 {

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "Z")
    public static boolean field3240 = false;

    @OriginalMember(owner = "client!ga", name = "cb", descriptor = "I")
    public static int field3245 = 0;

    @OriginalMember(owner = "client!ga", name = "Z", descriptor = "Z")
    public static volatile boolean field3242 = true;

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "[I")
    public static int[] field3234 = new int[50];

    @OriginalMember(owner = "client!ga", name = "db", descriptor = "I")
    public static int field3246 = -1;

    @OriginalMember(owner = "client!ga", name = "Y", descriptor = "Liq;")
    public static class362 field3241 = new class362("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!ga", name = "eb", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "I")
    public int field3235;

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!ga", name = "ab", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "Lgb;")
    public class117 field3237;

    @OriginalMember(owner = "client!ga", name = "W", descriptor = "[B")
    public byte[] field3239;

    @OriginalMember(owner = "client!ga", name = "bb", descriptor = "[Z")
    public static boolean[] field3244;

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "[[[I")
    public static int[][][] field3232;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)Ldi;")
    public static final class64 method1526(int arg0, int arg1) {
        if (arg1 != -16026) {
            method1529(-37);
        }
        ++field3231;
        class237 var2 = class43.field534;
        class64 var3;
        synchronized (class43.field534) {
            var3 = (class64) class43.field534.method1625((long) arg0, 0);
            if (var3 == null) {
                var3 = new class64(arg0);
                class43.field534.method1622((byte) 13, var3, (long) arg0);
            }
        }
        synchronized (var3) {
            return !var3.method367((byte) 59) ? null : var3;
        }
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(B)V")
    public static final void method1527(byte arg0) {
        ++field3233;
        int var1 = 0;
        if (class272.field3859) {
            int var2 = var1 | 1;
            int var3 = var2 | 16;
            int var4 = var3 | 32;
            int var5 = var4 | 2;
            var1 = var5 | 4;
        }
        class232.method1534(var1, (byte) -88);
        class268.method1782(-1, var1);
        class233.method1538(var1, 61);
        class233.method1539((byte) 72, var1);
        class87.method473(var1, 0);
        class348.method2232(-30827, var1);
        class180.method1216(var1, arg0 + 149);
        if (arg0 != -25) {
            field3244 = null;
        }
        class245.method1662(false, var1);
        class408.method2612(21386, var1);
        if (~class40.field475 == -11) {
            class178.method1210(28, -104);
        } else if (class40.field475 == 30) {
            class178.method1210(25, -113);
        }
    }

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "(I)V")
    public static final void method1528(int arg0) {
        if (class185.field2686 != 3) {
            class397.field5685 = -1;
        }
        if (arg0 == 0) {
            ++field3236;
        }
    }

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "(I)V")
    public static void method1529(int arg0) {
        field3234 = null;
        field3232 = null;
        field3244 = null;
        if (arg0 >= -123) {
            method1528(124);
        }
        field3241 = null;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)I")
    public final int method770(byte arg0) {
        ++field3238;
        if (super.field4971) {
            return 0;
        } else {
            return arg0 > -122 ? 111 : 100;
        }
    }

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)[B")
    public final byte[] method772(int arg0) {
        ++field3243;
        if (arg0 != 1) {
            method1527((byte) -60);
        }
        if (super.field4971) {
            throw new RuntimeException();
        } else {
            return this.field3239;
        }
    }

    static {
        new class362("Select", "Auswählen", "Sélectionner", "Selecionar");
        field3247 = 0;
    }
}
