import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class500 extends class267 implements Runnable {

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "Z")
    private boolean field7350 = true;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
    public int field7357 = -1;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "Lph;")
    private class455 field7354;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public static int field7353 = 0;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "Llg;")
    public static class284 field7349 = new class284(6, 7);

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public static int field7348;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field7352;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
    public static int field7355;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    public static int field7356;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "Lia;")
    public static class415 field7351;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
    public static void method2947(int arg0) {
        field7349 = null;
        if (arg0 != 0) {
            field7351 = null;
        }
        field7351 = null;
    }

    @OriginalMember(owner = "client!ge", name = "run", descriptor = "()V")
    public final void run() {
        field7352++;
        while (this.field7350) {
            this.field7354.method2682((byte) 47, this);
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
    public final void method2948(int arg0) {
        field7355++;
        (new Thread(this, "a")).start();
        if (arg0 != 6) {
            field7351 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLir;)V")
    public static final void method2949(byte arg0, class22 arg1) {
        if (arg1 instanceof class405) {
            class405 var2 = (class405) arg1;
            if (var2.field5623 != null) {
                class2.method10(class75.field1089.field464 != var2.field464, true, var2);
            }
        } else if (arg1 instanceof class192) {
            class192 var3 = (class192) arg1;
            class519.method3055(class75.field1089.field464 != var3.field464, (byte) -97, var3);
        }
        field7356++;
        if (arg0 < 47) {
            method2947(-113);
        }
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)V")
    public final void method2950(int arg0) {
        field7348++;
        this.field7350 = false;
        if (arg0 != -1) {
            this.field7350 = false;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
    public static final void method2951(boolean arg0) {
        if (arg0) {
            class385.field5410 = class336.field4640;
            class383.field5391 = class364.field5058;
        } else {
            class385.field5410 = class22.field358;
            class383.field5391 = class19.field195;
        }
        class401.field5574 = class385.field5410.length;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lph;)V")
    public class500(class455 arg0) {
        this.field7354 = arg0;
    }
}
