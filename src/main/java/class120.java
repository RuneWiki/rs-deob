import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class120 extends class107 {

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "I")
    public int field2811;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "Lvc;")
    public static class137 field2799 = class45.method325("Spieler kann nicht gefunden werden: ", -46);

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field2794 = 0;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
    public static int field2796 = 0;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "Lvc;")
    private static class137 field2795 = class45.method325("Accept challenge", -46);

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "Lvc;")
    public static class137 field2803 = class45.method325("(U5", -46);

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "Lvc;")
    private static class137 field2801 = class45.method325("wishes to duel with you)3", -46);

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "Lvc;")
    public static class137 field2793 = field2795;

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "Lvc;")
    public static class137 field2807 = field2801;

    @OriginalMember(owner = "client!sd", name = "L", descriptor = "I")
    public static int field2809 = -1;

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "I")
    public static int field2798 = 0;

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "Lvc;")
    public static class137 field2800 = class45.method325("blinken1:", -46);

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "Lvc;")
    public static class137 field2808 = class45.method325("Ignorieren", -46);

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!sd", name = "I", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "Loa;")
    public static class93 field2805;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
    public static void method906(int arg0) {
        field2801 = null;
        field2807 = null;
        field2808 = null;
        field2805 = null;
        field2800 = null;
        field2799 = null;
        field2793 = null;
        field2795 = null;
        field2803 = null;
        if (arg0 != 32) {
            method908((byte) -44);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILjava/awt/Component;ZLha;)V")
    public static final void method907(int arg0, int arg1, Component arg2, boolean arg3, class50 arg4) {
        class85.field2025 = arg1;
        field2806++;
        class121.field2826 = arg3;
        class111.field2636 = class60.method432(true);
        try {
            class51 var5 = (class51) Class.forName("na").getDeclaredConstructor().newInstance();
            var5.method152(arg2, arg1, arg3);
            var5.method371(arg4, 2048);
            class68.field1398 = var5;
        } catch (Throwable var9) {
            try {
                class16 var6 = new class16(arg4);
                var6.method152(arg2, arg1, arg3);
                var6.method371(arg4, 16384);
                if (arg0 != 13700) {
                    field2809 = 34;
                }
                class68.field1398 = var6;
            } catch (Throwable var8) {
                if (class50.field1124.toLowerCase().indexOf("microsoft") >= 0) {
                    try {
                        class68.field1398 = new class3();
                        class85.field2025 = 8000;
                        class121.field2826 = false;
                        return;
                    } catch (Throwable var7) {
                    }
                }
                class68.field1398 = new class86();
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)V")
    public static final void method908(byte arg0) {
        field2797++;
        class84.field1906.method23(true);
        for (int var1 = 0; var1 < 32; var1++) {
            class102.field2365[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class132.field3070[var2] = 0L;
        }
        if (arg0 > -125) {
            field2801 = null;
        }
        class124.field2867 = 0;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lvc;ZLvc;Lvc;)V")
    public static final void method909(class137 arg0, boolean arg1, class137 arg2, class137 arg3) {
        class115.field2734 = arg2;
        field2802++;
        class115.field2739 = arg0;
        if (arg1) {
            method908((byte) -119);
        }
        class115.field2740 = arg3;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZI)Lgf;")
    public static final class48 method910(boolean arg0, int arg1) {
        field2804++;
        class48 var2 = (class48) class53.field1178.method758((long) arg1, (byte) -103);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class25.field597.method668(4, -214, arg1);
        class48 var4 = new class48();
        if (var3 != null) {
            var4.method349(new class109(var3), arg1, -1);
        }
        var4.method344((byte) 90);
        if (arg0) {
            return null;
        } else {
            class53.field1178.method760(var4, 0, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class120() {
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(I)V")
    public class120(int arg0) {
        this.field2811 = arg0;
    }
}
