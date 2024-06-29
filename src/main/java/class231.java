import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class231 extends class183 {

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "B")
    public byte field4329;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
    public int field4330;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "Ldj;")
    public class44 field4326;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "Ldj;")
    public class44 field4331;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "[[S")
    public static short[][] field4328;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
    public static void method1511(int arg0) {
        field4328 = null;
        if (arg0 != 24212) {
            method1512(46, 83, -123);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)V")
    public static final void method1512(int arg0, int arg1, int arg2) {
        if (class129.field2287 != arg0) {
            class49.field912 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class49.field912[var3] = (var3 << 12) / arg0;
            }
            class53.field943 = arg0 - 1;
            class129.field2287 = arg0;
            class64.field1190 = arg0 == 64 ? 2048 : 4096;
        }
        field4327++;
        if (client.field609 != arg2) {
            if (class129.field2287 == arg2) {
                class212.field3809 = class49.field912;
            } else {
                class212.field3809 = new int[arg2];
                for (int var4 = 0; var4 < arg2; var4++) {
                    class212.field3809[var4] = (var4 << 12) / arg2;
                }
            }
            client.field609 = arg2;
            class101.field1850 = arg2 - 1;
        }
        if (arg1 != -1) {
            field4328 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method1513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg7 != -77) {
            field4328 = null;
        }
        if (class70.field1337 <= arg4 && arg5 <= class70.field1321 && arg1 >= class14.field267 && arg2 <= class57.field1068) {
            class22.method163(arg5, arg1, arg6, arg2, arg0, arg4, (byte) -109, arg3);
        } else {
            class5.method38(arg2, arg3, arg1, arg6, arg4, arg5, arg0, -353950820);
        }
        field4325++;
    }
}
