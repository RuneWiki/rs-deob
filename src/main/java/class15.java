import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class15 extends OutputStream {

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field133 = -1;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field139 = 0;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "F")
    public static float field136;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public static final void method69(byte arg0) {
        field137++;
        class211 var1 = null;
        try {
            class286 var2 = class328.field4850.method2175("3", 91, false);
            while (var2.field4208 == 0) {
                class428.method2624(1, 1L);
            }
            if (arg0 != -114) {
                method71((byte) -108, 46);
            }
            if (var2.field4208 == 2) {
                throw new RuntimeException("Error opening file");
            }
            var1 = (class211) var2.field4213;
            byte[] var3 = new byte[(int) var1.method1372((byte) 106)];
            if (var3.length == 0) {
                class537.field7950 = "";
                class201.field3009 = "";
            } else {
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method1370(var3.length - var4, var3, (byte) -126, var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class428 var6 = new class428(var3);
                int var7 = var6.method2561((byte) -110);
                if (var7 > 50) {
                    throw new RuntimeException("Bad length");
                }
                var6.field6221 = var7 + 1;
                if (!var6.method2562(-31)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var6.field6221 = 1;
                int var8 = var6.method2561((byte) -90);
                if (var8 > 1) {
                    throw new RuntimeException("Invalid version " + var8);
                }
                class201.field3009 = var6.method2584(0);
                class537.field7950 = var6.method2584(arg0 ^ 0xFFFFFF8E);
                if (var8 >= 1) {
                    class385.field5632 = var6.method2620(arg0 ^ 0xFFFFFFFA);
                } else {
                    class385.field5632 = class555.field8240;
                }
            }
        } catch (Exception var10) {
            class201.field3009 = "";
            class537.field7950 = "";
        }
        try {
            if (var1 != null) {
                var1.method1367(0);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ldda;Lqa;I)V")
    public static final void method70(class597 arg0, class167 arg1, int arg2) {
        field135++;
        if (class242.field3546) {
            return;
        }
        arg1.method321(0);
        class331.field4910 = arg1.method961(class610.method3552(arg0, class59.field704), true);
        class331.field4910.method723((class522.field7735 - class331.field4910.method722()) / arg2, (class337.field4944 - class331.field4910.method714()) / 2);
        class475.field7253 = arg1.method961(class610.method3552(arg0, class374.field5506), true);
        class475.field7253.method723((class522.field7735 - class475.field7253.method722()) / 2, 18);
        class242.field3546 = true;
    }

    @OriginalMember(owner = "client!de", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field138++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)Z")
    public static final boolean method71(byte arg0, int arg1) {
        field134++;
        if (arg1 != 50) {
            return true;
        }
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            return false;
        } else {
            return var2 < 128 || var2 >= 160 || class42.field489[var2 - 128] != '\u0000';
        }
    }
}
