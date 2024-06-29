import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class630 extends class656 {

    @OriginalMember(owner = "client!pda", name = "j", descriptor = "I")
    public int field8387 = -1;

    @OriginalMember(owner = "client!pda", name = "i", descriptor = "Z")
    public boolean field8386 = false;

    @OriginalMember(owner = "client!pda", name = "r", descriptor = "I")
    public static int field8395 = 100;

    @OriginalMember(owner = "client!pda", name = "k", descriptor = "I")
    public int field8388;

    @OriginalMember(owner = "client!pda", name = "l", descriptor = "I")
    public int field8389;

    @OriginalMember(owner = "client!pda", name = "m", descriptor = "I")
    public int field8390;

    @OriginalMember(owner = "client!pda", name = "o", descriptor = "I")
    public static int field8392;

    @OriginalMember(owner = "client!pda", name = "p", descriptor = "I")
    public int field8393;

    @OriginalMember(owner = "client!pda", name = "s", descriptor = "I")
    public int field8396;

    @OriginalMember(owner = "client!pda", name = "q", descriptor = "[I")
    public static int[] field8394;

    @OriginalMember(owner = "client!pda", name = "n", descriptor = "[Lhu;")
    public static class133[] field8391;

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(I)V", line = 65)
    public class630(int arg0) {
        this.field8387 = arg0;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(IIIIIII)V", line = 9)
    public static final void method3467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8392++;
        if (class261.field3632 <= arg0 && class209.field3090 >= arg3 && class380.field5289 <= arg4 && class431.field5944 >= arg1) {
            if (arg2 == 1) {
                class350.method2100(arg0, arg5, arg1, arg3, true, arg4);
            } else {
                class350.method2103(0, arg5, arg3, arg1, arg4, arg0, arg2);
            }
        } else if (arg2 == 1) {
            class322.method1952(arg5, 121, arg0, arg3, arg4, arg1);
        } else {
            class525.method2902(arg2, arg3, arg0, arg1, (byte) 75, arg4, arg5);
        }
        if (arg6 <= 37) {
            field8391 = null;
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)V", line = 55)
    public static void method3468(byte arg0) {
        field8391 = null;
        field8394 = null;
        if (arg0 <= 78) {
            method3467(83, -13, -101, 109, 71, -68, 65);
        }
    }
}
