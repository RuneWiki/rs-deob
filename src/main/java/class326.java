import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class326 {

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "Z")
    public static boolean field4244 = false;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4243 = new CRC32();

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!oba", name = "d", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!oba", name = "e", descriptor = "[I")
    public static int[] field4247;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(B)V", line = 3)
    public static final void method1888(byte arg0) {
        if (arg0 != 24) {
            method1888((byte) 24);
        }
        field4246++;
        class646.field9002 = class681.method3743(8, 2048, 8, 0.4F, true, 4, 35, true);
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(B[BZ)V", line = 29)
    public static final void method1889(byte arg0, byte[] arg1, boolean arg2) {
        if (class22.field235 == null) {
            class22.field235 = new class418(20000);
        }
        field4245++;
        if (arg0 <= 69) {
            method1889((byte) -126, null, false);
        }
        class22.field235.method2358(121, arg1.length, 0, arg1);
        if (!arg2) {
            return;
        }
        class330.method1907(class22.field235.field5393, (byte) -82);
        class202.field2638 = new class138[class501.field6617];
        int var3 = 0;
        for (int var4 = class188.field2416; var4 <= class49.field686; var4++) {
            class138 var5 = class541.method2873(-86, var4);
            if (var5 != null) {
                class202.field2638[var3++] = var5;
            }
        }
        class388.field4977 = false;
        class637.field8875 = class584.method3191(1);
        class22.field235 = null;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)V", line = 71)
    public static void method1890(int arg0) {
        field4243 = null;
        field4247 = null;
        if (arg0 != -12506) {
            method1889((byte) 52, null, false);
        }
    }
}
