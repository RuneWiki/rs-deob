import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class196 extends class81 {

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "Lpj;")
    public static class237 field3404 = class33.method353(")1", 51);

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "Lpj;")
    public static class237 field3411 = class33.method353("Titelbild geladen)3", 23);

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "Z")
    public static boolean field3406 = false;

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "Lpj;")
    public static class237 field3410 = class33.method353("unzap", 77);

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "Lpj;")
    public static class237 field3416 = class33.method353("null", 73);

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "Lw;")
    public static class141 field3418 = null;

    @OriginalMember(owner = "client!qh", name = "F", descriptor = "I")
    public static int field3419 = 1;

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
    public static int field3420 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "B")
    public byte field3417;

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "I")
    public int field3414;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "Lpj;")
    public class237 field3405;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "Lpj;")
    public class237 field3407;

    @OriginalMember(owner = "client!qh", name = "B", descriptor = "Ljd;")
    public static class86 field3415;

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "[[S")
    public static short[][] field3413;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lw;Z)V")
    public static final void method1348(class141 arg0, boolean arg1) {
        field3408++;
        int var2 = arg0.field2492;
        if (var2 == 324) {
            if (class135.field2367 == -1) {
                class135.field2367 = arg0.field2472;
                class21.field396 = arg0.field2551;
            }
            if (class76.field1432.field579) {
                arg0.field2472 = class135.field2367;
            } else {
                arg0.field2472 = class21.field396;
            }
        } else if (var2 == 325) {
            if (class135.field2367 == -1) {
                class21.field396 = arg0.field2551;
                class135.field2367 = arg0.field2472;
            }
            if (class76.field1432.field579) {
                arg0.field2472 = class21.field396;
            } else {
                arg0.field2472 = class135.field2367;
            }
        } else if (var2 == 327) {
            arg0.field2447 = 150;
            arg0.field2531 = (int) (Math.sin((double) class241.field4246 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2456 = -1;
            arg0.field2544 = 5;
        } else {
            if (arg1) {
                method1351(-120, 126, -3);
            }
            if (var2 == 328) {
                if (class229.field3911.field4655 == null) {
                    arg0.field2456 = 0;
                } else {
                    arg0.field2447 = 150;
                    arg0.field2531 = (int) (Math.sin((double) class241.field4246 / 40.0D) * 256.0D) & 0x7FF;
                    arg0.field2544 = 5;
                    arg0.field2456 = ((int) class229.field3911.field4655.method1616(0) << 11) + 2047;
                    arg0.field2570 = class229.field3911.field3698;
                    arg0.field2571 = class229.field3911.field3696;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIII)V")
    public static final void method1349(int arg0, int arg1, int arg2, int arg3) {
        field3412++;
        class237 var4 = class238.method1626(new class237[] { class143.field2591, class14.method130(arg2, (byte) 117), field3404, class14.method130(arg3 >> 6, (byte) 117), field3404, class14.method130(arg1 >> 6, (byte) 117), field3404, class14.method130(arg3 & 0x3F, (byte) 117), field3404, class14.method130(arg1 & 0x3F, (byte) 117) }, -28);
        var4.method1590(false);
        class20.method201((byte) -114, var4);
        if (arg0 != 325) {
            field3415 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(Z)V")
    public static void method1350(boolean arg0) {
        if (arg0) {
            method1351(66, 45, 106);
        }
        field3410 = null;
        field3404 = null;
        field3416 = null;
        field3415 = null;
        field3418 = null;
        field3411 = null;
        field3413 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)Lm;")
    public static final class114 method1351(int arg0, int arg1, int arg2) {
        class35 var3 = class274.field4775[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class114 var4 = var3.field763;
            var3.field763 = null;
            return var4;
        }
    }
}
