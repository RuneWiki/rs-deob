import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class83 {

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method757(int arg0, int arg1) {
        field1465++;
        if (arg0 == 100 && class61.field853 > 0) {
            byte[] var2 = class41.field571[--class61.field853];
            class41.field571[class61.field853] = null;
            return var2;
        } else if (arg0 == 5000 && class62.field859 > 0) {
            byte[] var3 = class16.field203[--class62.field859];
            class16.field203[class62.field859] = null;
            return var3;
        } else {
            if (arg1 != -1) {
                method759(63);
            }
            if (arg0 == 30000 && class237.field3479 > 0) {
                byte[] var4 = class516.field7188[--class237.field3479];
                class516.field7188[class237.field3479] = null;
                return var4;
            } else {
                return new byte[arg0];
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method758(byte arg0, String arg1) {
        field1464++;
        if (arg0 == 125) {
            class175.method1205("", 0, 0, arg1, -1, "");
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
    public static final void method759(int arg0) {
        field1468++;
        if (arg0 != 47 || class549.field7791) {
            return;
        }
        class521.field7236 = true;
        if (class202.field2854.field7903) {
            class181.field2622 = ((int) class181.field2622 + 47 & 0xFFFFFFF0);
        } else {
            class367.field5199 += (12.0F - class367.field5199) / 2.0F;
        }
        class549.field7791 = true;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIII)V")
    public static final void method760(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1466++;
        if (arg0 != -1001) {
            method760(-8, -38, -54, 124, 4);
        }
        for (int var5 = 0; var5 < class562.field8052; var5++) {
            Rectangle var6 = class514.field7113[var5];
            if (var6.x + var6.width > arg3 && var6.x < (arg3 + arg4) && var6.y + var6.height > arg1 && var6.y < (arg1 + arg2)) {
                class509.field7067[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)V")
    public static final void method761(boolean arg0) {
        field1467++;
        if (!arg0) {
            method758((byte) 116, null);
        }
        if (class306.field4403 != null && class38.field514 != null) {
            return;
        }
        class38.field514 = new int[256];
        class306.field4403 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class306.field4403[var1] = (int) (Math.sin(var2) * 4096.0D);
            class38.field514[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }
}
