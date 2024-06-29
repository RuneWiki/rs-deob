import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class198 extends class107 {

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "I")
    public static int field3298 = 10;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "Ldf;")
    private static class51 field3302 = class46.method233("yellow:", 100);

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "Ldf;")
    public static class51 field3305 = field3302;

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "Ldf;")
    public static class51 field3314 = field3302;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
    public int field3297;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "I")
    public int field3301;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
    public int field3303;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
    public int field3304;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "I")
    public int field3308;

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
    public int field3309;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "I")
    public int field3312;

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "I")
    public int field3315;

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "I")
    public int field3316;

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "I")
    public int field3317;

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "I")
    public int field3318;

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "I")
    public int field3319;

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "I")
    public int field3320;

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "I")
    public int field3323;

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "I")
    public int field3324;

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "I")
    public int field3325;

    @OriginalMember(owner = "client!ef", name = "Z", descriptor = "I")
    public int field3326;

    @OriginalMember(owner = "client!ef", name = "ab", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "Lsg;")
    public class153 field3313;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "Lje;")
    public static class173 field3300;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "Lpc;")
    public class21 field3296;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "Lci;")
    public class224 field3311;

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "Lnc;")
    public class81 field3322;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
    public static final void method1391(int arg0) {
        field3321++;
        class151.field2519.method1353(-92);
        if (arg0 != 5) {
            field3302 = null;
        }
        class38.field584.method1353(-95);
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(II)Lwc;")
    public static final class213 method1392(int arg0, int arg1) {
        field3327++;
        int var2 = arg1 >> 16;
        if (arg0 != 11823) {
            method1394(23);
        }
        int var3 = arg1 & 0xFFFF;
        if (class10.field106[var2] == null || class10.field106[var2][var3] == null) {
            boolean var4 = class207.method1426((byte) 112, var2);
            if (!var4) {
                return null;
            }
        }
        return class10.field106[var2][var3];
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)V")
    public final void method1393(int arg0) {
        this.field3311 = null;
        this.field3322 = null;
        this.field3313 = null;
        if (arg0 <= 3) {
            method1394(-37);
        }
        this.field3296 = null;
        field3307++;
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)V")
    public static void method1394(int arg0) {
        field3314 = null;
        if (arg0 != 5) {
            method1395(-25, 53, 125);
        }
        field3302 = null;
        field3305 = null;
        field3300 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)Lwc;")
    public static final class213 method1395(int arg0, int arg1, int arg2) {
        class213 var3 = method1392(11823, arg2);
        field3306++;
        if (arg0 == arg1) {
            return var3;
        } else if (var3 == null || var3.field3556 == null || var3.field3556.length <= arg1) {
            return null;
        } else {
            return var3.field3556[arg1];
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
    public static final void method1396(boolean arg0) {
        field3310++;
        if (!arg0) {
            return;
        }
        class240.method1654(-15621, 5);
        class49.method254(5, 125);
        class125.method934(5, (byte) 33);
        class47.method243(5, (byte) 77);
        class169.method1174(-724930652, 5);
        class181.method1288(-81, 5);
        class258.method1754((byte) 89, 5);
        class10.method51(-72, 5);
        class31.method156(5, -897);
        class108.method788((byte) 74, 5);
        class17.method87((byte) 28, 5);
        class248.method1690(50, (byte) -32);
        class219.method1509(5, (byte) -109);
        class259.method1764(5, -1);
        class107.field1757.method1348(0, 5);
    }
}
