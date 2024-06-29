import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class178 extends class508 {

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    private int field2817;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    private int field2819;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    private int field2816;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
    private int field2824;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "Lih;")
    private class214 field2820;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
    private int field2821;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    private int field2818;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "Lvv;")
    public static class313 field2823 = new class313(98, 28);

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "Z")
    public static volatile boolean field2827 = false;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "F")
    public static float field2826;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "Lo;")
    public static class138 field2825;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "Lhg;")
    private class358 field2822;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method1201(byte arg0, String arg1) {
        field2828++;
        int var2 = arg1.length();
        int var3 = 0;
        if (arg0 <= 23) {
            field2827 = true;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
    public static void method1202(boolean arg0) {
        field2823 = null;
        field2825 = null;
        if (!arg0) {
            method1201((byte) 65, null);
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)Lhg;")
    public final class358 method373(int arg0) {
        field2815++;
        if (this.field2822 == null) {
            class293.field4747[0] = this.field2818;
            class293.field4747[3] = this.field2817;
            class293.field4747[1] = this.field2816;
            class293.field4747[5] = this.field2821;
            class293.field4747[4] = this.field2824;
            class196 var2 = this.field2820.field7179;
            class293.field4747[2] = this.field2819;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method194((byte) 89, class293.field4747[var5])) {
                    return null;
                }
                class320 var7 = var2.method195(class293.field4747[var5], (byte) -105);
                int var8 = var7.field5020 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field5015 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class57.field895[var6] = var2.method197(class293.field4747[var6], 1.0F, var4, (byte) 97, var4, false);
            }
            this.field2822 = new class358(this.field2820, 6407, var4, var3, class57.field895);
        }
        if (arg0 >= -18) {
            this.field2821 = 92;
        }
        return this.field2822;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lih;IIIIII)V")
    public class178(class214 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2817 = arg4;
        this.field2819 = arg3;
        this.field2816 = arg2;
        this.field2824 = arg5;
        this.field2820 = arg0;
        this.field2821 = arg6;
        this.field2818 = arg1;
    }
}
