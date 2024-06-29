import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class431 {

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "Lnh;")
    public static class441 field5880;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field5878;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "[[B")
    public static byte[][] field5881;

    static {
        new class72("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method2625(boolean arg0) {
        if (arg0) {
            method2625(false);
        }
        for (int var1 = 0; var1 < class106.field1263; var1++) {
            int var2 = class437.field5984[var1];
            class298 var3 = class220.field2726[var2];
            if (var3 != null) {
                class382.method2381(var3.field3971.field4106, -129, var3);
            }
        }
        field5877++;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V", line = 35)
    public static void method2626(int arg0) {
        field5878 = null;
        if (arg0 == 31286) {
            field5880 = null;
            field5881 = null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "()V", line = 48)
    public static final void method2627() {
        if (class299.field4000 != null) {
            for (int var0 = 0; var0 < class299.field4000.length; var0++) {
                for (int var1 = 0; var1 < class43.field512; var1++) {
                    for (int var2 = 0; var2 < class262.field3367; var2++) {
                        if (class299.field4000[var0][var1][var2] != null) {
                            class299.field4000[var0][var1][var2].method1981(2);
                        }
                        class299.field4000[var0][var1][var2] = null;
                    }
                }
            }
        }
        class299.field4000 = null;
        class219.field2709 = null;
        if (class104.field1216 != null) {
            for (int var3 = 0; var3 < class104.field1216.length; var3++) {
                for (int var4 = 0; var4 < class43.field512; var4++) {
                    for (int var5 = 0; var5 < class262.field3367; var5++) {
                        if (class104.field1216[var3][var4][var5] != null) {
                            class104.field1216[var3][var4][var5].method1981(2);
                        }
                        class104.field1216[var3][var4][var5] = null;
                    }
                }
            }
        }
        class104.field1216 = null;
        class75.field915 = null;
        class347.field4722 = null;
        class304.field4096 = null;
        class264.field3402 = 0;
        if (class127.field1426 != null) {
            for (int var6 = 0; var6 < class264.field3402; var6++) {
                class127.field1426[var6] = null;
            }
        }
        if (class46.field526 != null) {
            for (int var7 = 0; var7 < class125.field1398; var7++) {
                class46.field526[var7] = null;
            }
            class125.field1398 = 0;
        }
        if (class349.field4761 != null) {
            for (int var8 = 0; var8 < class208.field2534; var8++) {
                class349.field4761[var8] = null;
            }
            for (int var9 = 0; var9 < class238.field3149; var9++) {
                for (int var10 = 0; var10 < class43.field512; var10++) {
                    for (int var11 = 0; var11 < class262.field3367; var11++) {
                        class59.field747[var9][var10][var11] = 0;
                    }
                }
            }
            class208.field2534 = 0;
        }
        class354.field4820 = null;
        class451.method2789((byte) -91);
        class386.field5275.method1843(64);
        class419.field5721 = null;
        class134.field1536 = null;
        class434.field5922 = null;
        class131.field1498 = null;
    }
}
