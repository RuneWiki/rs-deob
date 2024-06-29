import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class760 extends class316 {

    @OriginalMember(owner = "client!bo", name = "t", descriptor = "Ljava/lang/String;")
    private String field10487 = null;

    @OriginalMember(owner = "client!bo", name = "u", descriptor = "J")
    private long field10488 = -1L;

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "I")
    public static int field10484 = 0;

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "I")
    public static int field10483;

    @OriginalMember(owner = "client!bo", name = "s", descriptor = "I")
    public static int field10486;

    @OriginalMember(owner = "client!bo", name = "v", descriptor = "I")
    public static int field10489;

    @OriginalMember(owner = "client!bo", name = "r", descriptor = "[[[Z")
    public static boolean[][][] field10485;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILso;)V", line = 3)
    public final void method148(int arg0, class494 arg1) {
        if (arg0 != -1001) {
            return;
        }
        field10483++;
        if (arg1.method2964((byte) 57) != 255) {
            arg1.field7042--;
            this.field10488 = arg1.method3005(-98);
        }
        this.field10487 = arg1.method2984((byte) -92);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLmda;)V", line = 20)
    public final void method152(byte arg0, class276 arg1) {
        field10486++;
        if (arg0 < 80) {
            field10485 = null;
        }
        arg1.method1806(this.field10488, this.field10487, (byte) -93);
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V", line = 36)
    public static void method4226(int arg0) {
        if (arg0 <= 93) {
            method4226(-36);
        }
        field10485 = null;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILje;Lpf;I)V", line = 51)
    public static final void method4227(int arg0, class421 arg1, class607 arg2, int arg3) {
        field10489++;
        if (class565.field8020 >= 50 || arg2 == null || arg2.field8517 == null || arg2.field8517.length <= arg3 || arg2.field8517[arg3] == null) {
            return;
        }
        int var4 = arg2.field8517[arg3][0];
        int var5 = var4 >> 8;
        int var6 = (var4 & 0xE7) >> 5;
        if (arg0 != 255) {
            field10484 = 61;
        }
        int var7 = var4 & 0x1F;
        if (arg2.field8517[arg3].length > 1) {
            int var8 = (int) ((double) arg2.field8517[arg3].length * Math.random());
            if (var8 > 0) {
                var5 = arg2.field8517[arg3][var8];
            }
        }
        int var9 = 256;
        if (arg2.field8498 != null && arg2.field8518 != null) {
            var9 = (int) (Math.random() * (double) (arg2.field8518[arg3] - arg2.field8498[arg3])) + arg2.field8498[arg3];
        }
        int var10 = arg2.field8506 == null ? 255 : arg2.field8506[arg3];
        if (var7 == 0) {
            if (class210.field3250 == arg1) {
                if (arg2.field8499) {
                    class355.method2259(var9, true, var10, 0, false, var5, var6);
                    return;
                }
                class442.method2635(var10, -94, 0, var6, var5, var9);
            }
        } else if (class21.field353.field10095.method2896(-122) != 0) {
            int var11 = arg1.field5742 - 256 >> 9;
            int var12 = arg1.field5746 - 256 >> 9;
            int var13 = class210.field3250 == arg1 ? 0 : (var11 << 16) + (arg1.field5755 << 24) + (var12 << 8) + var7;
            class262.field3842[class565.field8020++] = new class481((byte) (arg2.field8499 ? 2 : 1), var5, var6, 0, var10, var13, var9, arg1);
        }
    }
}
