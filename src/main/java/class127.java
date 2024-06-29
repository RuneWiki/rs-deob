import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class127 {

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "[I")
    private int[] field2027;

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "Lrn;")
    public static class174 field2026 = new class174(76, -1);

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "I")
    public static int field2029 = -1;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "I")
    public static int field2028;

    static {
        new class342("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(BZLjava/lang/String;)V", line = 5)
    public static final void method961(byte arg0, boolean arg1, String arg2) {
        class488.field7222.field247 = 1;
        field2028++;
        String var3 = arg2.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class367.field5550.field2797; var6++) {
            class134 var9 = class367.field5550.method1312((byte) 91, var6);
            if ((!arg1 || var9.field2117) && var9.field2114 == -1 && var9.field2135 == -1 && var9.field2103 == 0 && var9.field2133.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class511.field7543 = -1;
                    class364.field5514 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class511.field7543 = var5;
        class364.field5514 = var4;
        class58.field1032 = 0;
        if (arg0 != -117) {
            method961((byte) 58, true, null);
        }
        String[] var7 = new String[class511.field7543];
        for (int var8 = 0; var8 < class511.field7543; var8++) {
            var7[var8] = class367.field5550.method1312((byte) 91, var4[var8]).field2133;
        }
        class382.method2374(11698, class364.field5514, var7);
        class488.field7222.method132((byte) -1);
        class488.field7222.field247 = 2;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Z)V", line = 80)
    public static void method962(boolean arg0) {
        field2026 = null;
        if (!arg0) {
            method962(false);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(II)I", line = 93)
    public final int method963(int arg0, int arg1) {
        if (arg0 != -14660) {
            field2026 = null;
        }
        field2025++;
        int var3 = (this.field2027.length >> 1) - 1;
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field2027[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field2027[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "([I)V", line = 124)
    public class127(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field2027 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2027[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field2027[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field2027[var5 + var5] = arg0[var4];
            this.field2027[var5 + var5 + 1] = var4++;
        }
    }
}
