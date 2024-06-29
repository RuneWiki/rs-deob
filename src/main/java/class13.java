import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class13 {

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "[I")
    public static int[] field209 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "[Z")
    public static boolean[] field212 = new boolean[8];

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "Lrn;")
    public static class174 field208 = new class174(68, 2);

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "[I")
    public static int[] field214 = new int[6];

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "[I")
    public static int[] field213;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)V", line = 16)
    public static final void method85(int arg0, byte arg1) {
        field211++;
        class55 var2 = class175.field2676;
        synchronized (class175.field2676) {
            class175.field2676.method493(false, arg0);
            if (arg1 != 80) {
                method87(43);
            }
        }
        class55 var3 = class345.field5180;
        synchronized (class345.field5180) {
            class345.field5180.method493(false, arg0);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V", line = 38)
    public static void method86(byte arg0) {
        field212 = null;
        field214 = null;
        if (arg0 == 45) {
            field209 = null;
            field213 = null;
            field208 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V", line = 55)
    public static final void method87(int arg0) {
        field210++;
        if (arg0 != 0 || class4.field109 == null) {
            return;
        }
        class221.field3167.method1637(arg0 + 25831);
        class39.method405();
        class427.method2563((byte) -64);
        class425.method2558((byte) -77);
        class489.method2910((byte) -90);
        class241.method1578(false);
        if (class381.field5778 != null) {
            class381.field5778.method793(99);
        }
        class78.method618(64);
        class385.method2384((byte) -105);
        class62.method535(-1);
        class54.method479(false, (byte) 121);
        class139.method1041(-3);
        for (int var1 = 0; var1 < 2048; var1++) {
            class256 var5 = class183.field2747[var1];
            if (var5 != null) {
                var5.field7689 = null;
                for (int var6 = 0; var6 < var5.field7688.length; var6++) {
                    var5.field7688[var6] = null;
                }
            }
        }
        for (int var2 = 0; var2 < class34.field668.length; var2++) {
            class255 var3 = class34.field668[var2];
            if (var3 != null) {
                for (int var4 = 0; var4 < var3.field7688.length; var4++) {
                    var3.field7688[var4] = null;
                }
            }
        }
        class4.field109.method1203(-125);
        class4.field109 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lj;III[Z)V", line = 136)
    public static final void method88(class377 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class88.field1546 == class335.field5061) {
            return;
        }
        int var5 = class43.field829[arg1].method371(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class35 var7 = class43.field829[var6];
                if (var7 != null) {
                    var7.method366(arg0, arg2, var5 - var7.method371(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }
}
