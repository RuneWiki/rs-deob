import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class162 extends class276 {

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "Z")
    public boolean field2569;

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "I")
    public int field2576;

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "J")
    public long field2578;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "Ljava/lang/String;")
    public String field2566;

    @OriginalMember(owner = "client!pl", name = "C", descriptor = "I")
    public int field2581;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "Ljava/lang/String;")
    public String field2572;

    @OriginalMember(owner = "client!pl", name = "G", descriptor = "I")
    public int field2585;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
    public int field2568;

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "Z")
    public boolean field2577;

    @OriginalMember(owner = "client!pl", name = "D", descriptor = "I")
    public int field2582;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "I")
    public static int field2574 = 0;

    @OriginalMember(owner = "client!pl", name = "A", descriptor = "I")
    public static int field2579 = 0;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!pl", name = "F", descriptor = "Llu;")
    public static class35 field2584;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "Lop;")
    public static class400 field2571;

    @OriginalMember(owner = "client!pl", name = "B", descriptor = "Lqs;")
    public static class496 field2580;

    @OriginalMember(owner = "client!pl", name = "E", descriptor = "[I")
    public static int[] field2583;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "[[B")
    public static byte[][] field2567;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(Z)V")
    public static void method1120(boolean arg0) {
        field2567 = null;
        field2583 = null;
        field2580 = null;
        field2571 = null;
        field2584 = null;
        if (!arg0) {
            field2579 = -57;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1121(String arg0, int arg1) {
        field2575++;
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var3 > var2 && class489.method2854(arg0.charAt(var2), (byte) -116)) {
            var2++;
        }
        if (arg1 != 1) {
            field2584 = null;
        }
        while (var2 < var3 && class489.method2854(arg0.charAt(var3 - 1), (byte) -107)) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            if (class125.method984(var7, (byte) -106)) {
                char var8 = class285.method1859(234, var7);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class162(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field2569 = arg8;
        this.field2576 = arg3;
        this.field2578 = arg5;
        this.field2566 = arg0;
        this.field2581 = arg7;
        this.field2572 = arg1;
        this.field2585 = arg4;
        this.field2568 = arg2;
        this.field2577 = arg9;
        this.field2582 = arg6;
    }
}
