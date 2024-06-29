import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class20 {

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "Lhe;")
    public static class19 field377 = new class19();

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "Lpj;")
    public static class237 field378 = class33.method353("Lade)3)3)3", 107);

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public static int field381 = 0;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "Lpj;")
    public static class237 field383 = class33.method353("Update)2Liste geladen)3", 35);

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "Lpj;")
    public static class237 field384 = class33.method353(":duelfriend:", 34);

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "Z")
    public static boolean field382 = true;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field379;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public static void method199(int arg0) {
        field377 = null;
        field383 = null;
        field378 = null;
        field384 = null;
        field379 = null;
        if (arg0 != -13938) {
            field381 = 34;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)V")
    public static final void method200(int arg0, byte arg1) {
        field374++;
        class206.field3510.method939(arg0, 1);
        class112.field1955.method939(arg0, 1);
        class174.field3043.method939(arg0, 1);
        if (arg1 > -62) {
            field378 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLpj;)V")
    public static final void method201(byte arg0, class237 arg1) {
        field373++;
        if (class64.field1283 >= 2) {
            if (arg1.method1580(class95.field1695, (byte) 27)) {
                class52.method468(3);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class175.method1212(class238.method1626(new class237[] { class178.field3136, class14.method130(var4, (byte) 117), class205.field3504 }, -53), (class237) null, (byte) 122, 0);
            }
            if (arg1.method1580(class102.field1809, (byte) 27)) {
                class182.method1250((byte) -102);
            }
            if (arg1.method1580(class221.field3806, (byte) 27)) {
                class202.field3475.method389(0);
            }
            if (arg1.method1580(class180.field3161, (byte) 27)) {
                class202.field3475.method390(15594);
            }
            if (arg1.method1580(class148.field2630, (byte) 27)) {
                class61.field1234 = true;
            }
            if (arg1.method1580(class68.field1350, (byte) 27)) {
                class79.method610(25, (byte) 111);
            }
            if (arg1.method1580(class38.field862, (byte) 27)) {
                class129.field2259 = true;
            }
            if (arg1.method1580(class213.field3633, (byte) 27)) {
                class129.field2259 = false;
            }
            if (arg1.method1580(class29.field576, (byte) 27)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class146.field2613[var5].field470[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg1.method1589(-1, class159.field2859) && class12.field212 != 0) {
                class212.method1421(true, arg1.method1610(6, 117).method1600(arg0 ^ 0x15));
            }
            if (arg1.method1580(class23.field422, (byte) 27) && class12.field212 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method1589(-1, class186.field3266)) {
                class95.field1691 = arg1.method1610(12, 126).method1605(false).method1600(-119);
                class175.method1212(class238.method1626(new class237[] { class216.field3763, class14.method130(class95.field1691, (byte) 117) }, -120), (class237) null, (byte) 119, 0);
            }
            if (arg1.method1580(class81.field1526, (byte) 27)) {
                class215.field3731 = true;
            }
        }
        class223.field3830.method368(-110, 116);
        class147.field2625++;
        class223.field3830.method293((byte) 125, arg1.method1588(false) - 1);
        class223.field3830.method334(-128, arg1.method1610(2, 121));
        if (arg0 != -114) {
            field379 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lw;III)V")
    public static final void method202(class141 arg0, int arg1, int arg2, int arg3) {
        field375++;
        if (class45.field972 != null || class247.field4306 || arg0 == null || class76.method588(arg0, (byte) 76) == null) {
            return;
        }
        class45.field972 = arg0;
        class185.field3237 = class76.method588(arg0, (byte) 76);
        class111.field1951 = 0;
        class102.field1806 = false;
        class262.field4485 = arg2;
        if (arg1 >= 56) {
            class158.field2854 = arg3;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZII)I")
    public static final int method203(boolean arg0, int arg1, int arg2) {
        field376++;
        if (!arg0) {
            return 119;
        } else if (arg1 == -1) {
            return 12345678;
        } else {
            int var3 = (arg1 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }
}
