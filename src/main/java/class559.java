import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class559 {

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field7845;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field7846;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field7847;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "Lfp;")
    public static class323 field7844;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "Lar;")
    public static class681 field7848;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B[B)V", line = 3)
    public static final void method3219(byte arg0, byte[] arg1) {
        field7845++;
        if (arg0 != -80) {
            field7844 = null;
        }
        class675 var2 = new class675(arg1);
        while (true) {
            while (true) {
                int var3 = var2.method3750((byte) 35);
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int[] var4 = class551.field7758 = new int[6];
                    var4[0] = var2.method3757((byte) -65);
                    var4[1] = var2.method3757((byte) -65);
                    var4[2] = var2.method3757((byte) -65);
                    var4[3] = var2.method3757((byte) -65);
                    var4[4] = var2.method3757((byte) -65);
                    var4[5] = var2.method3757((byte) -65);
                } else if (var3 == 4) {
                    int var5 = var2.method3750((byte) 35);
                    class621.field8660 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        class621.field8660[var6] = var2.method3757((byte) -65);
                        if (class621.field8660[var6] == 65535) {
                            class621.field8660[var6] = -1;
                        }
                    }
                } else if (var3 == 5) {
                    int var7 = var2.method3750((byte) 35);
                    class568.field8063 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        class568.field8063[var8] = var2.method3757((byte) -65);
                        if (class568.field8063[var8] == 65535) {
                            class568.field8063[var8] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V", line = 79)
    public static void method3220(byte arg0) {
        field7848 = null;
        field7844 = null;
        int var1 = -35 / ((57 - arg0) / 50);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 93)
    public static final void method3221(String arg0, byte arg1) {
        field7846++;
        if (class540.field7569 == null) {
            class90.method683((byte) 123);
        }
        class682.field9351.setTime(new Date(class479.method2864((byte) -76)));
        int var2 = class682.field9351.get(11);
        int var3 = class682.field9351.get(12);
        int var4 = class682.field9351.get(13);
        String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
        String[] var6 = class719.method4040(11027, '\n', arg0);
        int var7 = 97 % ((arg1 + 40) / 42);
        for (int var8 = 0; var8 < var6.length; var8++) {
            for (int var9 = class407.field5766; var9 > 0; var9--) {
                class540.field7569[var9] = class540.field7569[var9 - 1];
            }
            class540.field7569[0] = var5 + ": " + var6[var8];
            if (class689.field9409 != null) {
                try {
                    class689.field9409.write(class466.method2785(class540.field7569[0] + "\n", 88));
                } catch (IOException var10) {
                }
            }
            if (class407.field5766 < class540.field7569.length - 1) {
                class407.field5766++;
                if (class446.field6324 > 0) {
                    class446.field6324++;
                }
            }
        }
    }
}
