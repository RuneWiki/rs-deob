import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class139 extends class337 {

    @OriginalMember(owner = "client!su", name = "p", descriptor = "S")
    public short field2085;

    @OriginalMember(owner = "client!su", name = "r", descriptor = "Lri;")
    public static class73 field2087 = new class73(71, 2);

    @OriginalMember(owner = "client!su", name = "t", descriptor = "[Llo;")
    public static class528[] field2089 = new class528[14];

    @OriginalMember(owner = "client!su", name = "u", descriptor = "[I")
    public static int[] field2090 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!su", name = "v", descriptor = "[I")
    public static int[] field2091 = new int[1000];

    @OriginalMember(owner = "client!su", name = "o", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!su", name = "q", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!su", name = "s", descriptor = "Ltd;")
    public static class314 field2088;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(ZLdh;)V", line = 5)
    public static final void method923(boolean arg0, class209 arg1) {
        field2084++;
        if (arg0) {
            return;
        }
        byte[] var2 = new byte[24];
        if (class225.field3299 != null) {
            try {
                class225.field3299.method2960(0, 0L);
                class225.field3299.method2959(var2, 78);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method1445(var2, 24, (byte) 93, 0);
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "()V", line = 48)
    public class139() {
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 52)
    public static final void method924(int arg0, int arg1, int arg2, Class arg3) {
        class518 var4 = class108.field1553[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class284 var5 = var4.field7569; var5 != null; var5 = var5.field4087) {
            class117 var6 = var5.field4083;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field1762 == arg1 && var6.field1771 == arg2) {
                class22.method143(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(S)V", line = 79)
    public class139(short arg0) {
        this.field2085 = arg0;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I[B)Z", line = 88)
    public static final boolean method925(int arg0, byte[] arg1) {
        field2086++;
        class209 var2 = new class209(arg1);
        if (arg0 >= -106) {
            method923(true, null);
        }
        int var3 = var2.method1428(32122);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method1428(32122) == 1;
        if (var4) {
            class158.method1010(-7, var2);
        }
        class66.method389(-65536, var2);
        return true;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V", line = 122)
    public static void method926(byte arg0) {
        if (arg0 != 111) {
            method923(true, null);
        }
        field2088 = null;
        field2089 = null;
        field2091 = null;
        field2087 = null;
        field2090 = null;
    }
}
