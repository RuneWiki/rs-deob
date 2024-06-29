import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class154 {

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field3205 = 0;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Lea;")
    public static class38 field3201 = class9.method46((byte) 105, "Bitte versuchen Sie es in ");

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "Z")
    public static boolean field3208 = false;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "Lea;")
    public static class38 field3210 = null;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "[[[I")
    public static int[][][] field3209 = new int[4][105][105];

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Lrc;")
    public static class155 field3202 = new class155(64);

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "Lk;")
    public static class89 field3204;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lfd;IZ)V")
    public static final void method1072(class50 arg0, int arg1, boolean arg2) {
        if (class113.field2515 != null) {
            try {
                class113.field2515.method366((byte) -128);
            } catch (Exception var8) {
            }
            class113.field2515 = null;
        }
        class113.field2515 = arg0;
        class14.method84(151, arg2);
        class51.field1302 = arg1;
        class126.field2705 = null;
        class109.field2455.field1620 = 0;
        class146.field3050 = null;
        field3203++;
        while (true) {
            class143 var3 = (class143) class41.field915.method177(122);
            if (var3 == null) {
                while (true) {
                    class143 var4 = (class143) class132.field2807.method177(-115);
                    if (var4 == null) {
                        if (class175.field3545 != 0) {
                            try {
                                class66 var5 = new class66(4);
                                var5.method495(124, 4);
                                var5.method495(126, class175.field3545);
                                var5.method496(848881960, 0);
                                class113.field2515.method361(0, (byte) 126, var5.field1627, 4);
                            } catch (IOException var7) {
                                try {
                                    class113.field2515.method366((byte) -128);
                                } catch (Exception var6) {
                                }
                                class113.field2515 = null;
                                class140.field2943++;
                            }
                        }
                        class145.field3027 = 0;
                        class146.field3042 = class166.method1184((byte) -80);
                        return;
                    }
                    class11.field234.method1228(-1454, var4);
                    class198.field3922.method184(var4, false, var4.field2172);
                    class162.field3376++;
                    class116.field2548--;
                }
            }
            class18.field366.method184(var3, false, var3.field2172);
            class92.field2087--;
            class102.field2296++;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
    public static void method1073(byte arg0) {
        if (arg0 != 25) {
            return;
        }
        field3209 = null;
        field3204 = null;
        field3210 = null;
        field3201 = null;
        field3202 = null;
    }
}
