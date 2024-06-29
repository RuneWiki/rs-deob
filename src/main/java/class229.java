import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public class class229 extends class107 {

    @OriginalMember(owner = "client!cha", name = "z", descriptor = "Lvq;")
    public class485 field3498;

    @OriginalMember(owner = "client!cha", name = "B", descriptor = "[I")
    public static int[] field3500 = new int[13];

    @OriginalMember(owner = "client!cha", name = "y", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!cha", name = "A", descriptor = "Lus;")
    public static class1 field3499;

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 5)
    public static final void method1553(String arg0, int arg1, boolean arg2) {
        field3497++;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg2 ? 32768 : 0;
        int var7 = var6 + (arg2 ? class204.field3172.field9269 : class204.field3172.field9274);
        for (int var8 = var6; var8 < var7; var8++) {
            class193 var11 = class204.field3172.method3795(var8, (byte) 96);
            if (var11.field2989 && var11.method1343(arg1 + 25213).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class656.field9139 = null;
                    class280.field4072 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        if (arg1 != -1) {
            field3499 = null;
        }
        class656.field9139 = var4;
        class280.field4072 = var5;
        class561.field7976 = 0;
        String[] var9 = new String[class280.field4072];
        for (int var10 = 0; var10 < class280.field4072; var10++) {
            var9[var10] = class204.field3172.method3795(var4[var10], (byte) 85).method1343(25212);
        }
        class5.method35(arg1, class656.field9139, var9);
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(I)V", line = 83)
    public static void method1554(int arg0) {
        if (arg0 <= 101) {
            field3500 = null;
        }
        field3499 = null;
        field3500 = null;
    }

    @OriginalMember(owner = "client!cha", name = "<init>", descriptor = "(Lvq;)V", line = 93)
    public class229(class485 arg0) {
        this.field3498 = arg0;
    }
}
