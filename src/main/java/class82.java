import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class82 extends class264 {

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "Ljava/lang/String;")
    public String field1011;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
    public static int field1008 = 0;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "Lct;")
    public static class104 field1013;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "Ljava/lang/String;")
    public static String field1009;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "[[[B")
    public static byte[][][] field1007;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)V", line = 6)
    public static void method549(int arg0) {
        field1009 = null;
        if (arg0 != -1) {
            field1013 = null;
        }
        field1007 = null;
        field1013 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lct;ILct;)V", line = 20)
    public static final void method550(class104 arg0, int arg1, class104 arg2) {
        field1010++;
        class195.field2750 = arg2;
        class241.field3580 = arg0;
        if (arg1 <= 60) {
            method549(53);
        }
        class195.field2750.method734(57, 36);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II[BB)Z", line = 42)
    public static final boolean method551(int arg0, int arg1, byte[] arg2, byte arg3) {
        field1014++;
        if (arg3 < 23) {
            return true;
        }
        boolean var4 = true;
        class256 var5 = new class256(arg2);
        int var6 = -1;
        label58: while (true) {
            int var7 = var5.method1758((byte) -94);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method1740(128);
                    if (var11 == 0) {
                        continue label58;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method1738((byte) -110) >> 2;
                    int var15 = arg1 + var13;
                    int var16 = arg0 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < class195.field2745 - 1 && (class78.field984 - 1) > var16) {
                        class178 var17 = class450.method2785(var6, (byte) 92);
                        if (var14 != 22 || class367.field5307 || var17.field2479 != 0 || var17.field2510 == 1 || var17.field2516) {
                            var9 = true;
                            if (!var17.method1234((byte) 122)) {
                                var4 = false;
                                class259.field3817++;
                            }
                        }
                    }
                }
                int var10 = var5.method1740(128);
                if (var10 == 0) {
                    break;
                }
                var5.method1738((byte) 77);
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V", line = 128)
    public class82() {
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 132)
    public class82(String arg0) {
        this.field1011 = arg0;
    }
}
