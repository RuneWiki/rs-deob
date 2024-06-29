import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class199 extends class268 {

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3560 = new CRC32();

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "Lha;")
    public static class46 field3566 = class271.method1828("leuchten3:", -46);

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "Lia;")
    public static class76 field3565 = new class76();

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "Lha;")
    public static class46 field3567 = class271.method1828(")4l=", -46);

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "[I")
    public static int[] field3568 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBII)V")
    public static final void method1418(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 101) {
            return;
        }
        field3563++;
        class146 var4 = class6.method22((byte) 16, 11, arg2);
        var4.method1088(11102);
        var4.field2640 = arg3;
        var4.field2637 = arg0;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBIIIIIIII)V")
    public static final void method1419(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3564++;
        if (arg1 > -21) {
            method1423((byte) 1);
        }
        if (class135.field2445 <= arg4 && arg4 <= class73.field1309 && arg9 >= class135.field2445 && class73.field1309 >= arg9 && class135.field2445 <= arg8 && arg8 <= class73.field1309 && arg0 >= class135.field2445 && arg0 <= class73.field1309 && arg3 >= class4.field70 && arg3 <= class70.field1205 && class4.field70 <= arg6 && class70.field1205 >= arg6 && arg2 >= class4.field70 && arg2 <= class70.field1205 && class4.field70 <= arg7 && class70.field1205 >= arg7) {
            class56.method387(arg2, arg4, arg6, -95, arg5, arg8, arg0, arg3, arg7, arg9);
        } else {
            class98.method759(arg6, arg9, arg3, arg7, arg2, arg8, 3, arg5, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)Lu;")
    public static final class182 method1420(int arg0, int arg1, int arg2) {
        class201 var3 = class111.field2080[arg0][arg1][arg2];
        return var3 == null || var3.field3607 == null ? null : var3.field3607;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
    public static final void method1421(int arg0) {
        class267.method1791((byte) 102);
        class236.method1607(41);
        class249.method1693(0);
        field3561++;
        class86.method675(0);
        class5.method18(true);
        class39.method261(-111);
        class176.method1263(-76);
        class273.method1846(-102);
        class14.method74(arg0 + 57048);
        class60.method406(10499);
        client.method1819(-22977);
        class29.method200(3);
        class108.method842(false);
        class244.method1671(4);
        ((class93) class62.field1040).method727(0);
        class260.field4538.method1363(104);
        class56.field947.method1294((byte) -52);
        class221.field3890.method1294((byte) -97);
        class70.field1208.method1294((byte) -72);
        class181.field3250.method1294((byte) -110);
        class232.field4018.method1294((byte) -112);
        class130.field2390.method1294((byte) -49);
        class242.field4308.method1294((byte) -61);
        class261.field4549.method1294((byte) -49);
        class107.field1982.method1294((byte) -94);
        class112.field2125.method1294((byte) -86);
        class108.field2022.method1294((byte) -121);
        class220.field3871.method84(-32377);
        if (arg0 != -28124) {
            field3560 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(III)Z")
    public static final boolean method1422(int arg0, int arg1, int arg2) {
        if (arg2 == 255) {
            field3562++;
            return (arg1 >> arg0 + 1 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V")
    public static void method1423(byte arg0) {
        field3568 = null;
        if (arg0 != -21) {
            field3567 = null;
        }
        field3567 = null;
        field3560 = null;
        field3566 = null;
        field3565 = null;
    }
}
