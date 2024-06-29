import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class116 extends class172 {

    @OriginalMember(owner = "client!m", name = "L", descriptor = "[Z")
    public static boolean[] field1984 = new boolean[200];

    @OriginalMember(owner = "client!m", name = "T", descriptor = "[Lid;")
    public static class149[] field1992 = new class149[100];

    @OriginalMember(owner = "client!m", name = "M", descriptor = "I")
    public static int field1985 = 0;

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "Z")
    public static boolean field1989 = true;

    @OriginalMember(owner = "client!m", name = "O", descriptor = "Lve;")
    public static class189 field1987 = new class189(30);

    @OriginalMember(owner = "client!m", name = "W", descriptor = "Laj;")
    public static class47 field1995 = null;

    @OriginalMember(owner = "client!m", name = "V", descriptor = "Lid;")
    public static class149 field1994 = class60.method382(" de votre liste d(Wamis)3", (byte) 99);

    @OriginalMember(owner = "client!m", name = "A", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!m", name = "E", descriptor = "I")
    public int field1977;

    @OriginalMember(owner = "client!m", name = "H", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!m", name = "I", descriptor = "I")
    public int field1981;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "I")
    public int field1983;

    @OriginalMember(owner = "client!m", name = "P", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "I")
    public int field1990;

    @OriginalMember(owner = "client!m", name = "U", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!m", name = "S", descriptor = "Ldg;")
    public static class140 field1991;

    @OriginalMember(owner = "client!m", name = "J", descriptor = "Lid;")
    public class149 field1982;

    @OriginalMember(owner = "client!m", name = "G", descriptor = "Laj;")
    public static class47 field1979;

    @OriginalMember(owner = "client!m", name = "D", descriptor = "[I")
    public int[] field1976;

    @OriginalMember(owner = "client!m", name = "F", descriptor = "[I")
    public int[] field1978;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "[Lid;")
    public class149[] field1974;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "[Lnc;")
    public class85[] field1986;

    @OriginalMember(owner = "client!m", name = "C", descriptor = "[[S")
    public static short[][] field1975;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V")
    public static void method805(int arg0) {
        field1992 = null;
        field1984 = null;
        if (arg0 != -1) {
            field1987 = null;
        }
        field1995 = null;
        field1994 = null;
        field1979 = null;
        field1991 = null;
        field1975 = null;
        field1987 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BII)I")
    public static final int method806(byte arg0, int arg1, int arg2) {
        field1980++;
        if (arg0 == 108) {
            int var3 = arg1 >> 31 & arg2 - 1;
            return (arg1 + (arg1 >>> 31)) % arg2 + var3;
        } else {
            return 111;
        }
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V")
    public static final void method807(int arg0) {
        field1988++;
        if (arg0 > 53) {
            class118.field2004.method1291(0);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
    public static final void method808(int arg0, int arg1) {
        class71.field1243.method1289(arg0, 101);
        int var2 = 115 / ((26 - arg1) / 58);
        field1973++;
        class103.field1802.method1289(arg0, 108);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIBLbk;)V")
    public static final void method809(int arg0, int arg1, byte arg2, class20 arg3) {
        if (arg3.field2349 == arg1 && arg1 != -1) {
            class164 var4 = class69.method436(arg1, arg2 ^ 0x5E);
            int var5 = var4.field3030;
            if (var5 == 1) {
                arg3.field2406 = arg0;
                arg3.field2397 = 0;
                arg3.field2318 = 1;
                arg3.field2355 = 0;
                arg3.field2405 = 0;
                class94.method686(var4, arg3.field2340, -118, arg3.field2347, false, arg3.field2397);
            }
            if (var5 == 2) {
                arg3.field2405 = 0;
            }
        } else if (arg1 == -1 || arg3.field2349 == -1 || class69.method436(arg1, -32).field3036 >= class69.method436(arg3.field2349, -32).field3036) {
            arg3.field2397 = 0;
            arg3.field2355 = 0;
            arg3.field2405 = 0;
            arg3.field2349 = arg1;
            arg3.field2318 = 1;
            arg3.field2341 = arg3.field2327;
            arg3.field2406 = arg0;
            if (arg3.field2349 != -1) {
                class94.method686(class69.method436(arg3.field2349, -32), arg3.field2340, arg2 ^ 0x3A, arg3.field2347, false, arg3.field2397);
            }
        }
        if (arg2 != -66) {
            method805(-124);
        }
        field1993++;
    }
}
