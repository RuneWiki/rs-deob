import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class122 {

    @OriginalMember(owner = "client!c", name = "e", descriptor = "[I")
    public static int[] field1828 = new int[2];

    @OriginalMember(owner = "client!c", name = "c", descriptor = "Lqp;")
    public static class466 field1826 = new class466("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!c", name = "f", descriptor = "Lwj;")
    public static class270 field1829 = new class270(45, 8);

    @OriginalMember(owner = "client!c", name = "g", descriptor = "Lsi;")
    public static class391 field1830 = new class391(new byte[5000]);

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field1831 = 0;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "F")
    public static float field1824;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IZIZLem;)V", line = 16)
    public static final void method860(int arg0, boolean arg1, int arg2, boolean arg3, class150 arg4) {
        field1827++;
        int var5 = arg4.field2204;
        int var6 = arg4.field2322;
        if (arg4.field2323 == 0) {
            arg4.field2204 = arg4.field2172;
        } else if (arg4.field2323 == 1) {
            arg4.field2204 = arg2 - arg4.field2172;
        } else if (arg4.field2323 == 2) {
            arg4.field2204 = arg4.field2172 * arg2 >> 14;
        }
        if (arg4.field2180 == 0) {
            arg4.field2322 = arg4.field2174;
        } else if (arg4.field2180 == 1) {
            arg4.field2322 = arg0 - arg4.field2174;
        } else if (arg4.field2180 == 2) {
            arg4.field2322 = arg4.field2174 * arg0 >> 14;
        }
        if (arg4.field2323 == 4) {
            arg4.field2204 = arg4.field2322 * arg4.field2251 / arg4.field2217;
        }
        if (arg3) {
            method861((byte) 10);
        }
        if (arg4.field2180 == 4) {
            arg4.field2322 = arg4.field2217 * arg4.field2204 / arg4.field2251;
        }
        if (class214.field2982 && (client.method1228(arg4).field2719 != 0 || arg4.field2315 == 0)) {
            if (arg4.field2322 < 5 && arg4.field2204 < 5) {
                arg4.field2204 = 5;
                arg4.field2322 = 5;
            } else {
                if (arg4.field2322 <= 0) {
                    arg4.field2322 = 5;
                }
                if (arg4.field2204 <= 0) {
                    arg4.field2204 = 5;
                }
            }
        }
        if (class186.field2700 == arg4.field2289) {
            class510.field7564 = arg4;
        }
        if (arg1 && arg4.field2210 != null && arg4.field2204 != var5 || arg4.field2322 != var6) {
            class437 var7 = new class437();
            var7.field6390 = arg4;
            var7.field6389 = arg4.field2210;
            class416.field6052.method2809(var7, 2);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)I", line = 100)
    public static final int method861(byte arg0) {
        field1825++;
        int var1 = 2 / ((arg0 - 53) / 39);
        return class359.field5234;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V", line = 110)
    public static void method862(boolean arg0) {
        if (!arg0) {
            field1830 = null;
            field1828 = null;
            field1829 = null;
            field1826 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "p", descriptor = "(III[I)V")
    public abstract void method185(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!c", name = "s", descriptor = "(IIIIII)V")
    public abstract void method180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()Lc;")
    public abstract class122 method189();

    @OriginalMember(owner = "client!c", name = "N", descriptor = "(I)V")
    public abstract void method183(int arg0);

    @OriginalMember(owner = "client!c", name = "ra", descriptor = "(I)V")
    public abstract void method191(int arg0);

    @OriginalMember(owner = "client!c", name = "za", descriptor = "(Lc;)V")
    public abstract void method192(class122 arg0);

    @OriginalMember(owner = "client!c", name = "ka", descriptor = "(I)V")
    public abstract void method187(int arg0);

    @OriginalMember(owner = "client!c", name = "o", descriptor = "(III)V")
    public abstract void method188(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "O", descriptor = "(I)V")
    public abstract void method193(int arg0);

    @OriginalMember(owner = "client!c", name = "j", descriptor = "(III)V")
    public abstract void method182(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III[I)V")
    public abstract void method178(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!c", name = "xa", descriptor = "()V")
    public abstract void method179();

    @OriginalMember(owner = "client!c", name = "ja", descriptor = "(I)V")
    public abstract void method181(int arg0);

    @OriginalMember(owner = "client!c", name = "m", descriptor = "([I)V")
    public abstract void method184(int[] arg0);
}
