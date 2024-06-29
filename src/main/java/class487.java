import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class487 {

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "Ljk;")
    public static class446 field6766 = null;

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "Lff;")
    public static class9 field6765 = new class9(24, 12);

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "I")
    public static int field6762;

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "I")
    public static int field6769;

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "Lgb;")
    public class142 field6767;

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "Lou;")
    public static class428 field6768;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "Lf;")
    public static class529 field6761;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIIIII)V", line = 5)
    public static final void method2794(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class435 var7 = new class435();
        var7.field5959 = arg1 >> class530.field7813;
        var7.field5963 = arg2 >> class530.field7813;
        var7.field5978 = arg3 >> class530.field7813;
        var7.field5960 = arg4 >> class530.field7813;
        var7.field5957 = arg0;
        var7.field5975 = arg1;
        var7.field5967 = arg2;
        var7.field5968 = arg3;
        var7.field5981 = arg4;
        var7.field5970 = arg5;
        var7.field5979 = arg6;
        class466.field6426[class234.field3151++] = var7;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIII)V", line = 23)
    public static final void method2795(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 << 3;
        int var5 = arg2 << 3;
        int var6 = arg3 << 3;
        field6762++;
        if (class42.field623 == 2) {
            class47.field699 = var5;
            class168.field2439 = var4;
            class207.field2854 = var6;
        }
        if (arg1 < 70) {
            method2799(-102, -11, 126);
        }
        class184.field2621 = var6;
        class426.field5820 = var4;
        class393.method2306(0);
        class104.field1531 = true;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lmd;I)V", line = 50)
    public static final void method2796(class379 arg0, int arg1) {
        field6769++;
        int var2 = arg0.method2199((byte) 87);
        class80.field1184 = new class211[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class80.field1184[var3] = new class211();
            class80.field1184[var3].field2876 = arg0.method2199((byte) 62);
            class80.field1184[var3].field2878 = arg0.method2230(arg1 + 55043);
        }
        if (arg1 != 10493) {
            return;
        }
        class147.field2085 = arg0.method2199((byte) 47);
        class114.field1629 = arg0.method2199((byte) 58);
        class460.field6361 = arg0.method2199((byte) 59);
        class45.field676 = new class386[class114.field1629 + 1 - class147.field2085];
        for (int var4 = 0; var4 < class460.field6361; var4++) {
            int var5 = arg0.method2199((byte) 99);
            class386 var6 = class45.field676[var5] = new class386();
            var6.field2351 = arg0.method2238(arg1 ^ 0x2802);
            var6.field2354 = arg0.method2232((byte) 126);
            var6.field5250 = class147.field2085 + var5;
            var6.field5249 = arg0.method2230(65536);
            var6.field5248 = arg0.method2230(arg1 + 55043);
        }
        class436.field5986 = arg0.method2232((byte) 124);
        class168.field2434 = true;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V", line = 97)
    public static void method2797(int arg0) {
        field6765 = null;
        int var1 = -107 % ((arg0 + 49) / 34);
        field6768 = null;
        field6761 = null;
        field6766 = null;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIB)V", line = 110)
    public static final void method2798(int arg0, int arg1, byte arg2) {
        field6764++;
        class253 var3 = class332.method1911(arg1, (byte) 2, 6);
        var3.method1522(arg2 ^ 0xFFFFFF8A);
        var3.field3356 = arg0;
        if (arg2 != -118) {
            field6766 = null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(III)B", line = 124)
    public static final byte method2799(int arg0, int arg1, int arg2) {
        field6763++;
        if (arg2 != 0) {
            method2795(-1, 52, -58, -36);
        }
        if (arg0 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }
}
