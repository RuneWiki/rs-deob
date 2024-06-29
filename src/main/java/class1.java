import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class1 {

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "[Lmi;")
    public static class81[] field6 = new class81[2048];

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "[S")
    public static short[] field1 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field8 = 50;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "[I")
    public static int[] field10 = new int[field8];

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "[I")
    public static int[] field2 = new int[field8];

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "[I")
    public static int[] field5 = new int[field8];

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "[I")
    public static int[] field3 = new int[field8];

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "[I")
    public static int[] field9 = new int[field8];

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "[I")
    public static int[] field7 = new int[field8];

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "Lhi;")
    public static class24 field13 = null;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
    public static int field14 = 0;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "[I")
    public static int[] field15 = new int[field8];

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "[Lha;")
    public static class46[] field4 = new class46[field8];

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "Lhh;")
    public static class263 field11;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIBIII)V")
    public static final void method1(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field16++;
        if (class70.field1205 >= arg0 && class4.field70 <= arg5) {
            boolean var6;
            if (arg1 < class135.field2445) {
                arg1 = class135.field2445;
                var6 = false;
            } else if (arg1 > class73.field1309) {
                var6 = false;
                arg1 = class73.field1309;
            } else {
                var6 = true;
            }
            boolean var7;
            if (arg3 < class135.field2445) {
                arg3 = class135.field2445;
                var7 = false;
            } else if (arg3 <= class73.field1309) {
                var7 = true;
            } else {
                arg3 = class73.field1309;
                var7 = false;
            }
            if (arg0 < class4.field70) {
                arg0 = class4.field70;
            } else {
                class24.method170((byte) 33, arg1, class6.field100[arg0++], arg3, arg4);
            }
            if (arg5 > class70.field1205) {
                arg5 = class70.field1205;
            } else {
                class24.method170((byte) 33, arg1, class6.field100[arg5--], arg3, arg4);
            }
            if (var6 && var7) {
                for (int var8 = arg0; var8 <= arg5; var8++) {
                    int[] var9 = class6.field100[var8];
                    var9[arg1] = var9[arg3] = arg4;
                }
            } else if (var6) {
                for (int var11 = arg0; var11 <= arg5; var11++) {
                    class6.field100[var11][arg1] = arg4;
                }
            } else if (var7) {
                for (int var10 = arg0; var10 <= arg5; var10++) {
                    class6.field100[var10][arg3] = arg4;
                }
            }
        }
        if (arg2 < 21) {
            method1(-3, 80, (byte) -31, 18, 67, 123);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
    public static void method2(byte arg0) {
        field3 = null;
        field5 = null;
        field13 = null;
        field7 = null;
        field9 = null;
        field15 = null;
        field6 = null;
        field10 = null;
        field1 = null;
        field4 = null;
        field11 = null;
        field2 = null;
        if (arg0 < 53) {
            method2((byte) -120);
        }
    }
}
