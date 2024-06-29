import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public abstract class class51 {

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "[I")
    public static int[] field1010 = new int[1000];

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field1009 = 0;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1012 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "Llc;")
    public static class143 field1017 = class66.method374("Fps:", -1);

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "Llc;")
    public static class143 field1018 = class66.method374("scrollen:", -1);

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "Lgf;")
    public static class7 field1006;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "Z")
    public static boolean field1019;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "[I")
    public static int[] field1016;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "[Lvg;")
    public static class230[] field1013;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIIIIJILnc;)V")
    public abstract void method174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class125 arg10);

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V")
    public static void method310(byte arg0) {
        int var1 = 77 / ((-arg0 - 7) / 53);
        field1010 = null;
        field1018 = null;
        field1016 = null;
        field1006 = null;
        field1017 = null;
        field1013 = null;
        field1012 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIII)V")
    public abstract void method167(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lqk;IIIZ)V")
    public void method311(class51 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1011++;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "()I")
    public abstract int method166();

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)Lqk;")
    public class51 method312(int arg0, int arg1, int arg2) {
        field1014++;
        return this;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
    public static final void method313(int arg0) {
        field1015++;
        class39.field667.method823(true);
        if (arg0 != 20092) {
            method313(-82);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZJ)V")
    public static final void method314(boolean arg0, long arg1) {
        field1008++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class25.field421 < 100 || class168.field2998) || class25.field421 >= 200) {
            class170.method1119(class21.field342, 4096, class255.field4571, 0);
            return;
        }
        class143 var3 = class64.method364((byte) 97, arg1).method878(-28102);
        for (int var4 = 0; var4 < class25.field421; var4++) {
            if (class13.field251[var4] == arg1) {
                class170.method1119(class21.field342, 4096, class25.method179(0, new class143[] { var3, class104.field1818 }), 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class184.field3338; var5++) {
            if (class255.field4585[var5] == arg1) {
                class170.method1119(class21.field342, 4096, class25.method179(0, new class143[] { class22.field361, var3, class116.field2039 }), 0);
                return;
            }
        }
        if (var3.method876((byte) -122, class229.field4195.field518)) {
            class170.method1119(class21.field342, 4096, class120.field2114, 0);
            return;
        }
        class13.field243++;
        class237.field4305[class25.field421] = var3;
        class13.field251[class25.field421] = arg1;
        class129.field2291[class25.field421] = 0;
        class255.field4594[class25.field421] = class21.field342;
        class188.field3397[class25.field421] = 0;
        class269.field4818[class25.field421] = arg0;
        class25.field421++;
        class129.field2294 = class13.field249;
        class285.field5010.method799(103, 198);
        class285.field5010.method1243(arg1, 120);
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "()Z")
    public boolean method315() {
        field1007++;
        return false;
    }
}
